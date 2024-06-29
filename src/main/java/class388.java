import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class388 {

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "Ldga;")
    private class713 field5659;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public int field5658;

    @OriginalMember(owner = "client!nh", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5662 = new String[] { method3044(method3043("3\u0012m7\u00113\u001375P")), method3044(method3043("&Tm%\u0005")), method3044(method3043("3\u000f/g")), method3044(method3043("3\u0012mm\u00113\u001b/b\u00028R")), method3044(method3043("\u00185\u0005")), method3044(method3043("3\u0012mJP")) };

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field5657;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field5660;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field5661;

    @OriginalMember(owner = "client!nh", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        try {
            this.field5659.method5164(this.field5658, 3);
            field5660++;
            super.finalize();
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5662[3] + ')');
        }
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Ldga;II)V")
    public class388(class713 arg0, int arg1, int arg2) {
        try {
            this.field5659 = arg0;
            this.field5658 = arg2;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field5662[0] + (arg0 == null ? field5662[2] : field5662[1]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
    public static final void method3042(int arg0) {
        try {
            field5657++;
            class72 var1 = null;
            try {
                class328 var2 = class651.field9249.method1576("2", true, 13);
                while (var2.field4486 == 0) {
                    class449.method3474(20817, 1L);
                }
                if (var2.field4486 == 1) {
                    var1 = (class72) var2.field4487;
                    byte[] var3 = new byte[(int) var1.method750(0)];
                    int var5;
                    for (int var4 = 0; var4 < var3.length; var4 += var5) {
                        var5 = var1.method759(var3.length - var4, var3, var4, (byte) 114);
                        if (var5 == -1) {
                            throw new IOException(field5662[4]);
                        }
                    }
                    class385.method3031((byte) 119, new class711(var3));
                }
            } catch (Exception var8) {
            }
            try {
                if (var1 != null) {
                    var1.method757(0);
                }
            } catch (Exception var7) {
            }
            if (arg0 <= 45) {
                method3042(-70);
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field5662[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nh", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3043(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x78);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nh", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3044(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 93;
                    break;
                case 1:
                    var10005 = 122;
                    break;
                case 2:
                    var10005 = 67;
                    break;
                case 3:
                    var10005 = 11;
                    break;
                default:
                    var10005 = 120;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
