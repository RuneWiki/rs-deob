import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eja")
public class class633 {

    @OriginalMember(owner = "client!eja", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8990 = new String[] { method4629(method4628("b0")), method4629(method4628("ilYX=tpQO")), method4629(method4628("2u]Mvd@_Kptzc")), method4629(method4628("nh")), method4629(method4628("\u007f%\u0013]zrqH\u0005")), method4629(method4628("3kQZ<")), method4629(method4628("2yUFvClHEay@")), method4629(method4628("\u007f%\u0013]zr{S]`3")), method4629(method4628("\u007f%\u0013")), method4629(method4628("3mOIr\u007fwY\u0005")), method4629(method4628("\u007f%\u0013X`\u007f~_Bv3")) };

    @OriginalMember(owner = "client!eja", name = "d", descriptor = "Z")
    private static boolean field8989 = false;

    @OriginalMember(owner = "client!eja", name = "e", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field8988 = new Hashtable(16);

    @OriginalMember(owner = "client!eja", name = "b", descriptor = "I")
    private static int field8987;

    @OriginalMember(owner = "client!eja", name = "c", descriptor = "Ljava/lang/String;")
    private static String field8985;

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "Ljava/lang/String;")
    private static String field8986;

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(BILjava/lang/String;Ljava/lang/String;)Ljava/io/File;", line = 4)
    public static File method4625(byte arg0, int arg1, String arg2, String arg3) {
        if (!field8989) {
            throw new RuntimeException("");
        } else if (arg0 == -68) {
            File var4 = (File) field8988.get(arg3);
            if (var4 != null) {
                return var4;
            }
            String[] var5 = new String[] { field8990[10], field8990[9], field8990[7], field8990[4], field8990[8], field8986, field8990[5], "" };
            String[] var6 = new String[] { field8990[2] + arg1, field8990[6] + arg1 };
            for (int var7 = 0; var7 < 2; var7++) {
                for (int var8 = 0; var8 < var6.length; var8++) {
                    for (int var9 = 0; var9 < var5.length; var9++) {
                        String var10 = var5[var9] + var6[var8] + "/" + (arg2 == null ? "" : arg2 + "/") + arg3;
                        RandomAccessFile var11 = null;
                        try {
                            File var12 = new File(var10);
                            if (var7 != 0 || var12.exists()) {
                                String var13 = var5[var9];
                                if (var7 != 1 || var13.length() <= 0 || (new File(var13)).exists()) {
                                    (new File(var5[var9] + var6[var8])).mkdir();
                                    if (arg2 != null) {
                                        (new File(var5[var9] + var6[var8] + "/" + arg2)).mkdir();
                                    }
                                    var11 = new RandomAccessFile(var12, field8990[3]);
                                    int var14 = var11.read();
                                    var11.seek(0L);
                                    var11.write(var14);
                                    var11.seek(0L);
                                    var11.close();
                                    field8988.put(arg3, var12);
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
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(Ljava/lang/String;IB)V", line = 97)
    public static void method4626(String arg0, int arg1, byte arg2) {
        field8987 = arg1;
        if (arg2 != -55) {
            field8985 = null;
        }
        field8985 = arg0;
        try {
            field8986 = System.getProperty(field8990[1]);
            if (field8986 != null) {
                field8986 = field8986 + "/";
            }
        } catch (Exception var3) {
        }
        field8989 = true;
        if (field8986 == null) {
            field8986 = field8990[0];
        }
    }

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/io/File;", line = 121)
    public static File method4627(String arg0, byte arg1) {
        int var2 = 63 / ((arg1 + 46) / 53);
        return method4625((byte) -68, field8987, field8985, arg0);
    }

    @OriginalMember(owner = "client!eja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4628(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x13);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!eja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4629(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 28;
                    break;
                case 1:
                    var10005 = 31;
                    break;
                case 2:
                    var10005 = 60;
                    break;
                case 3:
                    var10005 = 42;
                    break;
                default:
                    var10005 = 19;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
