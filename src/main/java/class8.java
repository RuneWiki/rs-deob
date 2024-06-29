import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public class class8 extends class512 {

    @OriginalMember(owner = "client!vda", name = "s", descriptor = "Z")
    private boolean field72 = false;

    @OriginalMember(owner = "client!vda", name = "z", descriptor = "Z")
    private boolean field79;

    @OriginalMember(owner = "client!vda", name = "q", descriptor = "[Luia;")
    private class273[] field70;

    @OriginalMember(owner = "client!vda", name = "p", descriptor = "Lqk;")
    public static class148 field69 = new class148(79, 10);

    @OriginalMember(owner = "client!vda", name = "A", descriptor = "Lcca;")
    public static class462 field80 = new class462(128);

    @OriginalMember(owner = "client!vda", name = "B", descriptor = "Z")
    public static boolean field81 = false;

    @OriginalMember(owner = "client!vda", name = "o", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!vda", name = "r", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!vda", name = "t", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!vda", name = "u", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!vda", name = "v", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!vda", name = "w", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!vda", name = "x", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!vda", name = "y", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!vda", name = "C", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(ZZ)V", line = 4)
    public final void method33(boolean arg0, boolean arg1) {
        ++field75;
        if (arg0) {
            super.field7153.method2878(class253.field3501, 28768, class369.field4717);
        }
    }

    @OriginalMember(owner = "client!vda", name = "g", descriptor = "(B)V", line = 16)
    public static void method34(byte arg0) {
        field80 = null;
        if (arg0 != -3) {
            method37(true, 100);
        }
        field69 = null;
    }

    @OriginalMember(owner = "client!vda", name = "e", descriptor = "(I)Z", line = 27)
    public final boolean method35(int arg0) {
        ++field71;
        int var2 = 10 / ((-72 - arg0) / 37);
        return true;
    }

    @OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(Lpga;)V", line = 88)
    public class8(class492 arg0) {
        super(arg0);
        if (arg0.field6896) {
            this.field79 = ~arg0.field6863 > -4;
            int var2 = this.field79 ? 48 : 127;
            int[][] var3 = new int[6][4096];
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var10 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (var14 == 0) {
                            var15 = -var13;
                        } else if (~var14 == -2) {
                            var15 = var13;
                        } else if (~var14 != -3) {
                            if (~var14 == -4) {
                                var15 = -var12;
                            } else if (var14 == 4) {
                                var15 = var11;
                            } else {
                                var15 = -var11;
                            }
                        } else {
                            var15 = var12;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (!(var15 > 0.0F)) {
                            var16 = 0;
                            var17 = 0;
                            var18 = 0;
                        } else {
                            var18 = (int) ((double) var2 * Math.pow((double) var15, 96.0D));
                            var17 = (int) ((double) var2 * Math.pow((double) var15, 36.0D));
                            var16 = (int) ((double) var2 * Math.pow((double) var15, 12.0D));
                        }
                        var4[var14][var6] = var18 << 24;
                        var5[var14][var6] = var17 << 24;
                        var3[var14][var6] = var16 << 24;
                    }
                    ++var6;
                }
            }
            this.field70 = new class273[3];
            this.field70[0] = super.field7153.method626(64, var4, 0, false);
            this.field70[1] = super.field7153.method626(64, var5, 0, false);
            this.field70[2] = super.field7153.method626(64, var3, 0, false);
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(IZ)V", line = 45)
    public final void method36(int arg0, boolean arg1) {
        if (arg0 < -62) {
            ++field78;
            if (this.field70 != null && arg1) {
                super.field7153.method2949(1, 7544);
                super.field7153.method592(class754.field10479, (byte) -38);
                class173 var3 = super.field7153.method2872((byte) -121);
                var3.method843(1024);
                super.field7153.method2925(class144.field1997, (byte) 116);
                if (!this.field79) {
                    super.field7153.method2878(class369.field4717, 28768, class253.field3501);
                    super.field7153.method2946(0, class214.field3017, (byte) 127);
                    super.field7153.method2949(2, 7544);
                    super.field7153.method2878(class253.field3501, 28768, class35.field498);
                    super.field7153.method2946(0, class214.field3017, (byte) 127);
                    super.field7153.method582(1, (byte) 20, true, class214.field3017, false);
                    super.field7153.method2923(-127, 0, class87.field1198);
                    super.field7153.method2933((byte) 114, super.field7153.field6870);
                } else {
                    super.field7153.method2878(class253.field3501, 28768, class35.field498);
                    super.field7153.method582(0, (byte) -123, true, class186.field2725, false);
                    super.field7153.method2923(-105, 0, class87.field1198);
                }
                super.field7153.method2949(0, 7544);
                this.field72 = true;
            } else {
                super.field7153.method2923(-94, 0, class87.field1198);
            }
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(ZI)V", line = 202)
    public static final void method37(boolean arg0, int arg1) {
        ++field76;
        if (arg1 < 0 || ~arg1 < -3) {
            arg1 = 0;
        }
        class438.field6018 = arg1;
        class67.field918 = new class198[class534.field7482[class438.field6018] + 1];
        class380.field5355 = 0;
        class260.field3536 = 0;
        if (!arg0) {
            method41((String) null, (byte) -63, true, 44);
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIZ)V", line = 222)
    public final void method38(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.field70 = null;
        }
        if (this.field72) {
            super.field7153.method2949(1, 7544);
            super.field7153.method2933((byte) 94, this.field70[arg0 - 1]);
            super.field7153.method2949(0, 7544);
        }
        ++field68;
    }

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "(I)V", line = 239)
    public final void method39(int arg0) {
        if (this.field72) {
            super.field7153.method2949(1, 7544);
            super.field7153.method2933((byte) 109, (class117) null);
            super.field7153.method592(class313.field4010, (byte) -113);
            super.field7153.method2928(false);
            if (this.field79) {
                super.field7153.method2878(class369.field4717, 28768, class369.field4717);
                super.field7153.method2946(0, class186.field2725, (byte) 127);
                super.field7153.method2923(-116, 0, class186.field2725);
            } else {
                super.field7153.method2878(class369.field4717, 28768, class369.field4717);
                super.field7153.method2946(0, class186.field2725, (byte) 127);
                super.field7153.method2949(2, 7544);
                super.field7153.method2878(class369.field4717, 28768, class369.field4717);
                super.field7153.method2946(0, class186.field2725, (byte) 127);
                super.field7153.method2946(1, class214.field3017, (byte) 127);
                super.field7153.method2923(-123, 0, class186.field2725);
                super.field7153.method2933((byte) -32, (class117) null);
            }
            super.field7153.method2949(0, 7544);
            this.field72 = false;
        } else {
            super.field7153.method2923(-107, 0, class186.field2725);
        }
        ++field77;
        super.field7153.method2878(class369.field4717, 28768, class369.field4717);
        if (arg0 != 6) {
            method37(false, 2);
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(IILlo;)V", line = 280)
    public final void method40(int arg0, int arg1, class117 arg2) {
        ++field73;
        if (arg1 != -37) {
            method37(true, 14);
        }
        super.field7153.method2933((byte) -45, arg2);
        super.field7153.method2881(arg0, arg1 ^ 36);
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Ljava/lang/String;BZI)I", line = 292)
    public static final int method41(String arg0, byte arg1, boolean arg2, int arg3) {
        ++field74;
        if (arg3 >= 2 && ~arg3 >= -37) {
            if (arg1 != 118) {
                field80 = null;
            }
            boolean var4 = false;
            boolean var5 = false;
            int var6 = 0;
            int var7 = arg0.length();
            for (int var8 = 0; var8 < var7; ++var8) {
                char var9 = arg0.charAt(var8);
                if (~var8 == -1) {
                    if (~var9 == -46) {
                        var4 = true;
                        continue;
                    }
                    if (var9 == '+' && arg2) {
                        continue;
                    }
                }
                int var11;
                if (~var9 <= -49 && ~var9 >= -58) {
                    var11 = var9 - '0';
                } else if (~var9 <= -66 && var9 <= 'Z') {
                    var11 = var9 - '7';
                } else {
                    if (var9 < 'a' || ~var9 < -123) {
                        throw new NumberFormatException();
                    }
                    var11 = var9 - 'W';
                }
                if (arg3 <= var11) {
                    throw new NumberFormatException();
                }
                if (var4) {
                    var11 = -var11;
                }
                int var10 = arg3 * var6 + var11;
                if (~(var10 / arg3) != ~var6) {
                    throw new NumberFormatException();
                }
                var6 = var10;
                var5 = true;
            }
            if (!var5) {
                throw new NumberFormatException();
            } else {
                return var6;
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(ILpaa;)V", line = 369)
    public static final void method42(int arg0, class712 arg1) {
        ++field82;
        if (class13.field187) {
            ++class676.field9517;
            if (arg1.field10099 != null) {
                class712 var2 = class654.method3778((byte) -51, class480.field6527, class724.field10190);
                if (var2 != null) {
                    class700 var3 = new class700();
                    var3.field9745 = arg1;
                    var3.field9752 = var2;
                    var3.field9757 = arg1.field10099;
                    class318.method1840(var3);
                }
            }
            class120 var4 = class292.method1716(class608.field8668, true, class218.field3081);
            if (arg0 != -25170) {
                method41((String) null, (byte) -52, true, 117);
            }
            var4.field1653.method199(true, arg1.field9998);
            var4.field1653.method154(false, class724.field10190);
            var4.field1653.method142(arg1.field10026, 5);
            var4.field1653.method147((byte) 53, arg1.field9953);
            var4.field1653.method152(class480.field6527, 125);
            var4.field1653.method175(class220.field3109, -16904);
            class471.method2805(arg0 + 25279, var4);
        }
    }
}
