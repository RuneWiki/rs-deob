import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class222 extends class161 {

    @OriginalMember(owner = "client!br", name = "l", descriptor = "I")
    public int field3684 = -1;

    @OriginalMember(owner = "client!br", name = "y", descriptor = "Z")
    public boolean field3697 = false;

    @OriginalMember(owner = "client!br", name = "p", descriptor = "[I")
    public static int[] field3688 = new int[1000];

    @OriginalMember(owner = "client!br", name = "o", descriptor = "Ljava/lang/String;")
    public static String field3687 = null;

    @OriginalMember(owner = "client!br", name = "r", descriptor = "Ljava/lang/String;")
    public static String field3690 = "Loading config - ";

    @OriginalMember(owner = "client!br", name = "v", descriptor = "I")
    public static int field3694 = 0;

    @OriginalMember(owner = "client!br", name = "m", descriptor = "I")
    public int field3685;

    @OriginalMember(owner = "client!br", name = "n", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!br", name = "q", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!br", name = "s", descriptor = "I")
    public int field3691;

    @OriginalMember(owner = "client!br", name = "t", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!br", name = "u", descriptor = "I")
    public int field3693;

    @OriginalMember(owner = "client!br", name = "w", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!br", name = "x", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!br", name = "z", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!br", name = "A", descriptor = "I")
    public int field3699;

    @OriginalMember(owner = "client!br", name = "B", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!br", name = "C", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!br", name = "D", descriptor = "I")
    public int field3702;

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(I)V", line = 232)
    public class222(int arg0) {
        this.field3684 = arg0;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IIILfa;B)V", line = 18)
    public static final void method1588(int arg0, int arg1, int arg2, class127 arg3, byte arg4) {
        if (arg4 != 1) {
            field3687 = null;
        }
        field3686++;
        for (class58 var5 = (class58) class245.field4023.method253((byte) -6); var5 != null; var5 = (class58) class245.field4023.method247((byte) 98)) {
            if (var5.field732 == arg2 && (arg1 * 128) == var5.field740 && arg0 * 128 == var5.field730 && var5.field742.field2016 == arg3.field2016) {
                if (var5.field753 != null) {
                    class82.field1025.method2479(var5.field753);
                    var5.field753 = null;
                }
                if (var5.field728 != null) {
                    class82.field1025.method2479(var5.field728);
                    var5.field728 = null;
                }
                var5.method1120(91);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(ILmo;)V", line = 67)
    public static final void method1589(int arg0, class447 arg1) {
        field3692++;
        class270.field4341 = arg1.method2791((byte) 70, "titlebg");
        class11.field160 = arg1.method2791((byte) 93, "logo");
        int var2 = 10 / ((-arg0 - 59) / 47);
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(BI)Z", line = 78)
    public static final boolean method1590(byte arg0, int arg1) {
        field3701++;
        if (arg1 == 47 || arg1 == 3 || arg1 == 6 || arg1 == 57 || arg1 == 30) {
            return true;
        }
        if (arg0 != -21) {
            method1591(42);
        }
        if (arg1 == 26 || arg1 == 5 || arg1 == 1012) {
            return true;
        } else if (arg1 == 45 || arg1 == 28 || arg1 == 58 || arg1 == 12 || arg1 == 8) {
            return true;
        } else {
            return arg1 == 43 || arg1 == 23 || arg1 == 1003 || arg1 == 7;
        }
    }

    @OriginalMember(owner = "client!br", name = "d", descriptor = "(I)V", line = 107)
    public static void method1591(int arg0) {
        field3688 = null;
        field3687 = null;
        if (arg0 < 46) {
            method1588(95, -32, 61, (class127) null, (byte) 83);
        }
        field3690 = null;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(II)I", line = 124)
    public static final int method1592(int arg0, int arg1) {
        field3696++;
        double var2 = (double) ((arg1 & 0xFFA8C3) >> 16) / 256.0D;
        double var4 = (double) ((arg1 & 0xFF3A) >> 8) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var2 > var4) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var4 > var2) {
            var10 = var4;
        }
        if (var10 < var6) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        if (arg0 < 28) {
            field3698 = -111;
        }
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = (int) (var16 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return (var22 >> 1) + (var21 >> 5 << 7) + ((var20 >> 2 & 0x3F) << 10);
    }
}
