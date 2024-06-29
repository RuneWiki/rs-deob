import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class285 extends class509 {

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "Z")
    private boolean field4200 = false;

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "Z")
    private boolean field4206;

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "[Ldf;")
    private class547[] field4203;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "I")
    public static int field4194 = 0;

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([[BLvc;Z)V")
    public static final void method1777(byte[][] arg0, class359 arg1, boolean arg2) {
        ++field4204;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; ~arg1.field9132 < ~var4; ++var4) {
            class171.method1090(-13787);
            for (int var5 = 0; ~(class35.field399 >> 3) < ~var5; ++var5) {
                for (int var6 = 0; class382.field5586 >> 3 > var6; ++var6) {
                    int var7 = class497.field7475[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 64418727) >> 24;
                        if (!arg1.field9135 || var8 == 0) {
                            int var9 = var7 >> 1 & 3;
                            int var10 = (16764112 & var7) >> 14;
                            int var11 = (16376 & var7) >> 3;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; ~var13 > ~class256.field3741.length; ++var13) {
                                if (~class256.field3741[var13] == ~var12 && arg0[var13] != null) {
                                    class428 var14 = new class428(arg0[var13]);
                                    arg1.method3634(var6 * 8, var8, class67.field772, var9, var10, var14, 19, var4, var5 * 8, var11);
                                    arg1.method2205(var4, class379.field5558, var8, var11, var6 * 8, var9, var3[0] != -1 ? null : var3, var5 * 8, var14, var10, false);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg2) {
            method1777((byte[][]) null, (class359) null, true);
        }
        if (var3[0] != -1) {
            class477.field7267 = class28.field255.method2310(class458.field6652, var3[1], -4, var3[0], var3[3], var3[2]);
            class492.field7432 = var3[4];
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)Z")
    public final boolean method40(int arg0) {
        if (arg0 <= 44) {
            this.field4203 = null;
        }
        ++field4202;
        return true;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)Lvv;")
    public static final class640 method1778(int arg0, int arg1) {
        ++field4205;
        class640[] var2 = class133.method811((byte) -100);
        int var3 = 42 / ((arg1 - 62) / 39);
        for (int var4 = 0; var2.length > var4; ++var4) {
            class640 var5 = var2[var4];
            if (~var5.field9300 == ~arg0) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZ)V")
    public final void method39(int arg0, boolean arg1) {
        super.field7558.method1102(class609.field8962, class43.field527, arg0 ^ 126);
        ++field4207;
        if (arg0 != 0) {
            field4194 = 29;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZILmn;)V")
    public final void method42(boolean arg0, int arg1, class60 arg2) {
        super.field7558.method1152(arg2, arg0);
        ++field4199;
        super.field7558.method1142(192, arg1);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZB)V")
    public final void method35(boolean arg0, byte arg1) {
        int var3 = -127 / ((40 - arg1) / 36);
        if (this.field4203 != null && arg0) {
            super.field7558.method1159(1, false);
            super.field7558.method277(class493.field7446, 120);
            class124 var4 = super.field7558.method1122((byte) 65);
            var4.method621(1024);
            super.field7558.method1100(class213.field3130, -1);
            if (!this.field4206) {
                super.field7558.method1102(class43.field527, class609.field8962, -69);
                super.field7558.method1160(0, (byte) -113, class352.field5118);
                super.field7558.method1159(2, false);
                super.field7558.method1102(class308.field4477, class43.field527, 126);
                super.field7558.method1160(0, (byte) -113, class352.field5118);
                super.field7558.method319(class352.field5118, 0, false, 1, true);
                super.field7558.method1097(-14186, class524.field7760, 0);
                super.field7558.method1152(super.field7558.field2566, true);
            } else {
                super.field7558.method1102(class308.field4477, class43.field527, 127);
                super.field7558.method319(class248.field3625, 0, false, 0, true);
                super.field7558.method1097(-14186, class524.field7760, 0);
            }
            super.field7558.method1159(0, false);
            this.field4200 = true;
        } else {
            super.field7558.method1097(-14186, class524.field7760, 0);
        }
        ++field4195;
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lkw;)V")
    public class285(class174 arg0) {
        super(arg0);
        if (arg0.field2605) {
            this.field4206 = ~arg0.field2585 > -4;
            int var2 = !this.field4206 ? 127 : 48;
            int[][] var3 = new int[6][4096];
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var10 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; var14 < 6; ++var14) {
                        float var15;
                        if (var14 == 0) {
                            var15 = -var13;
                        } else if (~var14 == -2) {
                            var15 = var13;
                        } else if (~var14 == -3) {
                            var15 = var12;
                        } else if (~var14 != -4) {
                            if (var14 == 4) {
                                var15 = var11;
                            } else {
                                var15 = -var11;
                            }
                        } else {
                            var15 = -var12;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (var15 > 0.0F) {
                            var16 = (int) (Math.pow((double) var15, 96.0D) * (double) var2);
                            var17 = (int) ((double) var2 * Math.pow((double) var15, 36.0D));
                            var18 = (int) ((double) var2 * Math.pow((double) var15, 12.0D));
                        } else {
                            var18 = 0;
                            var17 = 0;
                            var16 = 0;
                        }
                        var4[var14][var6] = var16 << 24;
                        var5[var14][var6] = var17 << 24;
                        var3[var14][var6] = var18 << 24;
                    }
                    ++var6;
                }
            }
            this.field4203 = new class547[3];
            this.field4203[0] = super.field7558.method305(64, false, var4, 124);
            this.field4203[1] = super.field7558.method305(64, false, var5, 123);
            this.field4203[2] = super.field7558.method305(64, false, var3, 123);
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)V")
    public final void method38(byte arg0) {
        ++field4198;
        if (!this.field4200) {
            super.field7558.method1097(-14186, class248.field3625, 0);
        } else {
            super.field7558.method1159(1, false);
            super.field7558.method1152((class60) null, true);
            super.field7558.method277(class22.field195, arg0 + 55);
            super.field7558.method1109(5);
            if (!this.field4206) {
                super.field7558.method1102(class609.field8962, class609.field8962, 127);
                super.field7558.method1160(0, (byte) -113, class248.field3625);
                super.field7558.method1159(2, false);
                super.field7558.method1102(class609.field8962, class609.field8962, arg0 + -114);
                super.field7558.method1160(0, (byte) -113, class248.field3625);
                super.field7558.method1160(1, (byte) -113, class352.field5118);
                super.field7558.method1097(arg0 ^ -14163, class248.field3625, 0);
                super.field7558.method1152((class60) null, true);
            } else {
                super.field7558.method1102(class609.field8962, class609.field8962, 5);
                super.field7558.method1160(0, (byte) -113, class248.field3625);
                super.field7558.method1097(-14186, class248.field3625, 0);
            }
            super.field7558.method1159(0, false);
            this.field4200 = false;
        }
        if (arg0 != 59) {
            field4196 = -65;
        }
        super.field7558.method1102(class609.field8962, class609.field8962, 127);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IBI)V")
    public final void method43(int arg0, byte arg1, int arg2) {
        ++field4201;
        if (this.field4200) {
            super.field7558.method1159(1, false);
            super.field7558.method1152(this.field4203[arg2 - 1], true);
            super.field7558.method1159(0, false);
        }
        if (arg1 != -60) {
            field4194 = -57;
        }
    }

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "(I)Z")
    public static final boolean method1779(int arg0) {
        if (arg0 != 3806) {
            return true;
        } else {
            ++field4197;
            if (class606.field8951) {
                try {
                    if ((Boolean) class222.method1460(false, "showingVideoAd", class328.field4850.field5129)) {
                        return false;
                    }
                    return true;
                } catch (Throwable var1) {
                }
            }
            return true;
        }
    }
}
