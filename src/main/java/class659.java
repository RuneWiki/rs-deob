import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class659 {

    @OriginalMember(owner = "client!jk", name = "r", descriptor = "I")
    public int field9501;

    @OriginalMember(owner = "client!jk", name = "t", descriptor = "I")
    private int field9513;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public int field9511;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public int field9521;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "B")
    public byte field9522;

    @OriginalMember(owner = "client!jk", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9523 = new String[] { method4837(method4836("\u001c`C@\u0016")), method4837(method4836("\u001c`C?W\u0018b\u0019=\u0016")), method4837(method4836("\u001c`CB\u0016")), method4837(method4836("\u001c`CE\u0016")), method4837(method4836("\u001c`CA\u0016")), method4837(method4836("\u001c`CG\u0016")), method4837(method4836("\u001c`CF\u0016")) };

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "[I")
    public static int[] field9509 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "[[B")
    public static byte[][] field9504 = new byte[50][];

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public static int field9506 = 104;

    @OriginalMember(owner = "client!jk", name = "w", descriptor = "F")
    public static float field9502;

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "I")
    public int field9499;

    @OriginalMember(owner = "client!jk", name = "v", descriptor = "I")
    public static int field9500;

    @OriginalMember(owner = "client!jk", name = "s", descriptor = "I")
    public int field9505;

    @OriginalMember(owner = "client!jk", name = "u", descriptor = "I")
    public int field9507;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
    public static int field9508;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    public static int field9510;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
    public static int field9512;

    @OriginalMember(owner = "client!jk", name = "q", descriptor = "I")
    public int field9514;

    @OriginalMember(owner = "client!jk", name = "p", descriptor = "I")
    public int field9515;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
    public int field9516;

    @OriginalMember(owner = "client!jk", name = "x", descriptor = "I")
    public static int field9517;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    public int field9518;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
    public int field9519;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "I")
    public int field9520;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "Ljk;")
    public class659 field9503;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)Ljd;", line = 5)
    public final class242 method4830(byte arg0) {
        try {
            field9517++;
            if (arg0 != 109) {
                this.method4830((byte) 121);
            }
            return class256.method2166((byte) 87, this.field9513);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9523[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IZI)V", line = 19)
    public static final void method4831(int arg0, boolean arg1, int arg2) {
        try {
            field9510++;
            class495 var3 = class668.method4916(arg0, arg1, 3);
            if (arg2 != 1) {
                field9504 = null;
            }
            if (var3 != null) {
                for (int var4 = 0; var4 < var3.field7103.length; var4++) {
                    var3.field7103[var4] = -1;
                    var3.field7108[var4] = 0;
                }
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field9523[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V", line = 48)
    public static void method4832(int arg0) {
        try {
            field9509 = null;
            if (arg0 != 22796) {
                method4832(117);
            }
            field9504 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9523[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(III)Z", line = 72)
    public static final boolean method4833(int arg0, int arg1, int arg2) {
        try {
            if (arg1 == -1) {
                field9508++;
                return class231.method1979(arg0, (byte) -119, arg2) | (arg0 & 0x800) != 0 || class547.method4125(arg0, arg2, (byte) -7);
            } else {
                return false;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9523[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIII)V", line = 93)
    public static final void method4834(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            field9512++;
            class313 var5 = class196.method1670((long) arg0, arg2, -32);
            var5.method2636((byte) 121);
            var5.field4952 = arg3;
            var5.field4951 = arg1;
            var5.field4958 = arg4;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field9523[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIII)Ljk;", line = 107)
    public final class659 method4835(int arg0, int arg1, int arg2, int arg3) {
        try {
            if (arg1 != 3) {
                this.field9522 = -32;
            }
            field9500++;
            return new class659(this.field9513, arg0, arg3, arg2, this.field9522);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field9523[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(IIIIB)V", line = 118)
    public class659(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        try {
            this.field9501 = arg2;
            this.field9513 = arg0;
            this.field9511 = arg1;
            this.field9521 = arg3;
            this.field9522 = arg4;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field9523[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!jk", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4836(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jk", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4837(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 118;
                    break;
                case 1:
                    var10005 = 11;
                    break;
                case 2:
                    var10005 = 109;
                    break;
                case 3:
                    var10005 = 3;
                    break;
                default:
                    var10005 = 62;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
