import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class18 extends class145 {

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "I")
    private int field286 = -32768;

    @OriginalMember(owner = "client!bf", name = "I", descriptor = "I")
    private int field298 = 0;

    @OriginalMember(owner = "client!bf", name = "N", descriptor = "I")
    private int field303 = 0;

    @OriginalMember(owner = "client!bf", name = "M", descriptor = "Z")
    public boolean field302 = false;

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "I")
    public int field290;

    @OriginalMember(owner = "client!bf", name = "G", descriptor = "I")
    public int field296;

    @OriginalMember(owner = "client!bf", name = "E", descriptor = "I")
    public int field295;

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "I")
    public int field287;

    @OriginalMember(owner = "client!bf", name = "L", descriptor = "I")
    private int field301;

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "I")
    public int field292;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "Lk;")
    private class109 field282;

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "Li;")
    public static class88 field289 = class208.method1425(105, "(U3");

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "I")
    public static int field279 = 100;

    @OriginalMember(owner = "client!bf", name = "D", descriptor = "B")
    public static byte field294 = 0;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "Li;")
    public static class88 field281 = class208.method1425(105, "3D)2Softwarebibliothek gestartet)3");

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "Li;")
    public static class88 field288 = class208.method1425(105, "Clientscript error in: ");

    @OriginalMember(owner = "client!bf", name = "P", descriptor = "I")
    public static int field305 = 0;

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!bf", name = "A", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!bf", name = "C", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!bf", name = "H", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!bf", name = "J", descriptor = "Lkj;")
    public static class119 field299;

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "Lbj;")
    public static class22 field280;

    @OriginalMember(owner = "client!bf", name = "K", descriptor = "Lbj;")
    public static class22 field300;

    @OriginalMember(owner = "client!bf", name = "O", descriptor = "[[Z")
    public static boolean[][] field304;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "([Lia;[BIIZI)V")
    public static final void method85(class89[] arg0, byte[] arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg3 >= -4) {
            method85(null, null, -82, 92, true, -110);
        }
        field291++;
        class46 var6 = new class46(arg1);
        int var7 = -1;
        while (true) {
            int var8 = var6.method332((byte) -112);
            if (var8 == 0) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method350(113);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var9 >> 6 & 0x3F;
                int var13 = var6.method347(26119);
                int var14 = var9 >> 12;
                int var15 = arg5 + var11;
                int var16 = var13 & 0x3;
                int var17 = var12 + arg2;
                int var18 = var13 >> 2;
                if (var17 > 0 && var15 > 0 && var17 < 103 && var15 < 103) {
                    class89 var19 = null;
                    if (!arg4) {
                        int var20 = var14;
                        if ((class116.field2100[1][var17][var15] & 0x2) == 2) {
                            var20 = var14 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg0[var20];
                        }
                    }
                    class223.method1505((byte) 102, !arg4, var14, arg4, var16, var18, class245.field4499, var7, var14, var19, var15, var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lu;Z)V")
    public static final void method86(class218 arg0, boolean arg1) {
        field285++;
        if (arg0.field4104 == 0) {
            return;
        }
        if (arg0.field4116 != -1 && arg0.field4116 < 32768) {
            class191 var2 = class225.field4225[arg0.field4116];
            if (var2 != null) {
                int var3 = arg0.field4123 - var2.field4123;
                int var4 = arg0.field4138 - var2.field4138;
                if (var4 != 0 || var3 != 0) {
                    arg0.field4121 = (int) (Math.atan2((double) var4, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field4116 >= 32768) {
            int var5 = arg0.field4116 - 32768;
            if (class220.field4166 == var5) {
                var5 = 2047;
            }
            class44 var6 = class244.field4493[var5];
            if (var6 != null) {
                int var7 = arg0.field4138 - var6.field4138;
                int var8 = arg0.field4123 - var6.field4123;
                if (var7 != 0 || var8 != 0) {
                    arg0.field4121 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if (!arg1) {
            return;
        }
        if ((arg0.field4098 != 0 || arg0.field4101 != 0) && (arg0.field4137 == 0 || arg0.field4110 > 0)) {
            int var9 = arg0.field4105 * 64 + arg0.field4123 - (-class190.field3681 + arg0.field4101 + -class190.field3681) * 64 - 64;
            int var10 = arg0.field4138 + (arg0.field4105 - 1) * 64 - (arg0.field4098 - class223.field4214 - class223.field4214) * 64;
            if (var10 != 0 || var9 != 0) {
                arg0.field4121 = (int) (Math.atan2((double) var10, (double) var9) * 325.949D) & 0x7FF;
            }
            arg0.field4101 = 0;
            arg0.field4098 = 0;
        }
        int var11 = arg0.field4121 - arg0.field4087 & 0x7FF;
        if (var11 == 0) {
            arg0.field4091 = 0;
            return;
        }
        arg0.field4091++;
        if (var11 > 1024) {
            arg0.field4087 -= arg0.field4104;
            boolean var12 = true;
            if (var11 < arg0.field4104 || 2048 - arg0.field4104 < var11) {
                arg0.field4087 = arg0.field4121;
                var12 = false;
            }
            if (arg0.field4108 == arg0.field4107 && (arg0.field4091 > 25 || var12)) {
                if (arg0.field4093 == -1) {
                    arg0.field4108 = arg0.field4094;
                } else {
                    arg0.field4108 = arg0.field4093;
                }
            }
        } else {
            arg0.field4087 += arg0.field4104;
            boolean var13 = true;
            if (arg0.field4104 > var11 || 2048 - arg0.field4104 < var11) {
                arg0.field4087 = arg0.field4121;
                var13 = false;
            }
            if (arg0.field4108 == arg0.field4107 && (arg0.field4091 > 25 || var13)) {
                if (arg0.field4130 == -1) {
                    arg0.field4108 = arg0.field4094;
                } else {
                    arg0.field4108 = arg0.field4130;
                }
            }
        }
        arg0.field4087 &= 0x7FF;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field293++;
        class30 var11 = this.method89(false);
        if (var11 != null) {
            var11.method87(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field286 = var11.method88();
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "()I")
    public final int method88() {
        field284++;
        return this.field286;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)Lcg;")
    private final class30 method89(boolean arg0) {
        class33 var2 = class62.method441(this.field301, (byte) 80);
        if (arg0) {
            method86(null, true);
        }
        field278++;
        class30 var3;
        if (this.field302) {
            var3 = var2.method209(-1, (byte) 121);
        } else {
            var3 = var2.method209(this.field298, (byte) 119);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZ)V")
    public final void method90(int arg0, boolean arg1) {
        field283++;
        if (this.field302) {
            return;
        }
        this.field303 += arg0;
        if (arg1) {
            this.method90(99, true);
        }
        while (this.field303 > this.field282.field1992[this.field298]) {
            this.field303 -= this.field282.field1992[this.field298];
            this.field298++;
            if (this.field282.field1967.length <= this.field298) {
                this.field302 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lnb;Z)V")
    public static final void method91(class144 arg0, boolean arg1) {
        if (!arg1) {
            field297++;
            class34.field584 = arg0;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
    public static void method92(byte arg0) {
        field288 = null;
        field289 = null;
        if (arg0 != 74) {
            method92((byte) 84);
        }
        field299 = null;
        field281 = null;
        field280 = null;
        field304 = null;
        field300 = null;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(IIIIIII)V")
    public class18(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field290 = arg3;
        this.field296 = arg2;
        this.field295 = arg4;
        this.field287 = arg5 + arg6;
        this.field301 = arg0;
        this.field292 = arg1;
        int var8 = class62.method441(this.field301, (byte) 39).field542;
        if (var8 == -1) {
            this.field302 = true;
        } else {
            this.field302 = false;
            this.field282 = class15.method75(var8, (byte) -60);
        }
    }
}
