import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class462 {

    @OriginalMember(owner = "client!af", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7115 = new String[] { method3581(method3580("\u0015T")), method3581(method3580("\u001e\bAv<\u0003\u0014Ia")), method3581(method3580("\bA\u000bva\b\u001aGlwD")), method3581(method3580("D\u000fIt=")), method3581(method3580("E\u0011Ecw\u0013$Geq\u0003\u001e{")), method3581(method3580("D\tWgs\b\u0013A+")), method3581(method3580("\bA\u000b")), method3581(method3580("\bA\u000bs{\u0005\u0015P+")), method3581(method3580("E\u001dMhw4\bPk`\u000e$")), method3581(method3580("\bA\u000bs{\u0005\u001fKsaD")), method3581(method3580("\u0019\f")) };

    @OriginalMember(owner = "client!af", name = "a", descriptor = "Z")
    private static boolean field7113 = false;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field7110 = new Hashtable(16);

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    private static int field7112;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "Ljava/lang/String;")
    private static String field7111;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "Ljava/lang/String;")
    private static String field7114;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static void method3577(String arg0, int arg1, int arg2) {
        field7114 = arg0;
        if (arg2 != 6156) {
            method3578(true, null, -35, null);
        }
        field7112 = arg1;
        try {
            field7111 = System.getProperty(field7115[1]);
            if (field7111 != null) {
                field7111 = field7111 + "/";
            }
        } catch (Exception var3) {
        }
        if (field7111 == null) {
            field7111 = field7115[0];
        }
        field7113 = true;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZLjava/lang/String;ILjava/lang/String;)Ljava/io/File;")
    public static File method3578(boolean arg0, String arg1, int arg2, String arg3) {
        if (!field7113) {
            throw new RuntimeException("");
        }
        File var4 = (File) field7110.get(arg1);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { field7115[2], field7115[5], field7115[9], field7115[7], field7115[6], field7111, field7115[3], "" };
        if (arg0) {
            field7114 = null;
        }
        String[] var6 = new String[] { field7115[4] + arg2, field7115[8] + arg2 };
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var6.length; var8++) {
                for (int var9 = 0; var9 < var5.length; var9++) {
                    String var10 = var5[var9] + var6[var8] + "/" + (arg3 == null ? "" : arg3 + "/") + arg1;
                    RandomAccessFile var11 = null;
                    try {
                        File var12 = new File(var10);
                        if (var7 != 0 || var12.exists()) {
                            String var13 = var5[var9];
                            if (var7 != 1 || var13.length() <= 0 || (new File(var13)).exists()) {
                                (new File(var5[var9] + var6[var8])).mkdir();
                                if (arg3 != null) {
                                    (new File(var5[var9] + var6[var8] + "/" + arg3)).mkdir();
                                }
                                var11 = new RandomAccessFile(var12, field7115[10]);
                                int var14 = var11.read();
                                var11.seek(0L);
                                var11.write(var14);
                                var11.seek(0L);
                                var11.close();
                                field7110.put(arg1, var12);
                                return var12;
                            }
                        }
                    } catch (Exception var17) {
                        try {
                            if (var11 != null) {
                                var11.close();
                                Object var15 = null;
                            }
                        } catch (Exception var16) {
                        }
                    }
                }
            }
        }
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
    public static File method3579(String arg0, int arg1) {
        int var2 = -82 % ((arg1 + 21) / 45);
        return method3578(false, arg0, field7112, field7114);
    }

    @OriginalMember(owner = "client!af", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3580(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x12);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!af", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3581(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 107;
                    break;
                case 1:
                    var10005 = 123;
                    break;
                case 2:
                    var10005 = 36;
                    break;
                case 3:
                    var10005 = 4;
                    break;
                default:
                    var10005 = 18;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
