import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class228 {

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "[I")
    private int[] field4112;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "[I")
    private int[] field4103;

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "Lpc;")
    private class167 field4115;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "Lpc;")
    private class167 field4110;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "[Lpc;")
    private class167[] field4107;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public static int field4098 = 0;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "Lkh;")
    private static class117 field4102 = class224.method1450((byte) -1, "red:");

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "Lkh;")
    public static class117 field4097 = field4102;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "Lkh;")
    public static class117 field4105 = class224.method1450((byte) 122, "Nehmen");

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
    public static int field4104 = 0;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "Lkh;")
    private static class117 field4109 = class224.method1450((byte) -80, "Login limit exceeded)3");

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "Lkh;")
    public static class117 field4101 = field4102;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "I")
    public static int field4111 = 0;

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "Lkh;")
    public static class117 field4114 = field4109;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "Lff;")
    public static class62 field4108 = new class62(32);

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "Lge;")
    public static class71 field4116 = new class71(64);

    @OriginalMember(owner = "client!ui", name = "u", descriptor = "Lkh;")
    public static class117 field4117 = class224.method1450((byte) -10, "null");

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "Z")
    public static boolean field4106;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)I")
    public static int method1474(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZLic;IIDIZLai;)[I")
    public final int[] method1475(boolean arg0, class91 arg1, int arg2, int arg3, double arg4, int arg5, boolean arg6, class10 arg7) {
        field4113++;
        class147.method1057((byte) -24, arg4);
        int[] var10 = new int[arg3 * arg5];
        class140.field2558 = arg7;
        class114.field2124 = arg1;
        class25.method222(arg3, -1, arg5);
        for (int var11 = 0; var11 < this.field4107.length; var11++) {
            this.field4107[var11].method1184(arg3, (byte) 45, arg5);
        }
        int var12;
        byte var13;
        int var14;
        if (arg6) {
            var12 = -1;
            var13 = -1;
            var14 = arg3 - 1;
        } else {
            var13 = 1;
            var14 = 0;
            var12 = arg3;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg5; var16++) {
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field4115.field3009) {
                int[] var22 = this.field4115.method53((byte) -96, var16);
                var19 = var22;
                var20 = var22;
                var21 = var22;
            } else {
                int[][] var18 = this.field4115.method116(var16, -9179);
                var19 = var18[0];
                var20 = var18[1];
                var21 = var18[2];
            }
            if (arg0) {
                var15 = var16;
            }
            for (int var23 = var14; var23 != var12; var23 += var13) {
                int var24 = var19[var23] >> 4;
                int var25 = var20[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var26 = var21[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                if (var25 > 255) {
                    var25 = 255;
                }
                int var27 = class123.field2301[var24];
                if (var25 < 0) {
                    var25 = 0;
                }
                int var28 = class123.field2301[var25];
                int var29 = class123.field2301[var26];
                var10[var15++] = (var27 << 16) + (var28 << 8) + var29;
                if (arg0) {
                    var15 += arg3 - 1;
                }
            }
        }
        int var17 = 0;
        if (arg2 <= 112) {
            method1476(null, -72, -107, 55, -98, -108, 78, false);
        }
        while (var17 < this.field4107.length) {
            this.field4107[var17].method525(-1);
            var17++;
        }
        return var10;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lvi;IIIIIIZ)V")
    public static final void method1476(class238 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field4310.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var22 = arg0.field4310[var9] - class225.field4064;
            int var23 = arg0.field4307[var9] - class115.field2139;
            int var24 = arg0.field4305[var9] - class175.field3160;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field4313 != null) {
                class238.field4314[var9] = var25;
                class238.field4296[var9] = var28;
                class238.field4297[var9] = var29;
            }
            class238.field4306[var9] = (var25 << 9) / var29 + class89.field1655;
            class238.field4298[var9] = (var28 << 9) / var29 + class89.field1656;
        }
        class89.field1652 = 0;
        int var10 = arg0.field4303.length;
        for (int var11 = 0; var11 < var10; var11++) {
            int var12 = arg0.field4303[var11];
            int var13 = arg0.field4304[var11];
            int var14 = arg0.field4294[var11];
            int var15 = class238.field4306[var12];
            int var16 = class238.field4306[var13];
            int var17 = class238.field4306[var14];
            int var18 = class238.field4298[var12];
            int var19 = class238.field4298[var13];
            int var20 = class238.field4298[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class78.field1487 && class109.method736(class89.field1655 + class26.field661, class95.field1739 + class89.field1656, var18, var19, var20, var15, var16, var17)) {
                    class3.field47 = arg5;
                    class217.field3951 = arg6;
                }
                if (!arg7) {
                    class89.field1651 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class89.field1644 || var16 > class89.field1644 || var17 > class89.field1644) {
                        class89.field1651 = true;
                    }
                    if (arg0.field4313 == null || arg0.field4313[var11] == -1) {
                        if (arg0.field4312[var11] != 12345678) {
                            class89.method624(var18, var19, var20, var15, var16, var17, arg0.field4312[var11], arg0.field4293[var11], arg0.field4302[var11]);
                        }
                    } else if (class25.field624) {
                        int var21 = class89.field1657.method531(arg0.field4313[var11], (byte) -128);
                        class89.method624(var18, var19, var20, var15, var16, var17, class158.method1127(var21, arg0.field4312[var11]), class158.method1127(var21, arg0.field4293[var11]), class158.method1127(var21, arg0.field4302[var11]));
                    } else if (arg0.field4311) {
                        class89.method620(var18, var19, var20, var15, var16, var17, arg0.field4312[var11], arg0.field4293[var11], arg0.field4302[var11], class238.field4314[0], class238.field4314[1], class238.field4314[3], class238.field4296[0], class238.field4296[1], class238.field4296[3], class238.field4297[0], class238.field4297[1], class238.field4297[3], arg0.field4313[var11]);
                    } else {
                        class89.method620(var18, var19, var20, var15, var16, var17, arg0.field4312[var11], arg0.field4293[var11], arg0.field4302[var11], class238.field4314[var12], class238.field4314[var13], class238.field4314[var14], class238.field4296[var12], class238.field4296[var13], class238.field4296[var14], class238.field4297[var12], class238.field4297[var13], class238.field4297[var14], arg0.field4313[var11]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lic;ILai;)Z")
    public final boolean method1477(class91 arg0, int arg1, class10 arg2) {
        field4100++;
        for (int var4 = 0; var4 < this.field4112.length; var4++) {
            if (!arg2.method101(this.field4112[var4], -2)) {
                return false;
            }
        }
        for (int var5 = arg1; var5 < this.field4103.length; var5++) {
            if (!arg0.method535(arg1 ^ 0x5, this.field4103[var5])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(II)I")
    public static final int method1478(int arg0, int arg1) {
        field4099++;
        int var2 = -114 / ((arg0 + 24) / 59);
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
    public static void method1479(int arg0) {
        field4105 = null;
        if (arg0 != 0) {
            method1476(null, 121, 43, -33, -19, 117, 117, false);
        }
        field4108 = null;
        field4116 = null;
        field4114 = null;
        field4102 = null;
        field4109 = null;
        field4117 = null;
        field4097 = null;
        field4101 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lfa;)V")
    public static final void method1480(class57 arg0) {
        for (int var1 = arg0.field1186; var1 <= arg0.field1178; var1++) {
            for (int var2 = arg0.field1170; var2 <= arg0.field1179; var2++) {
                class170 var3 = class109.field2063[arg0.field1183][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field3065; var4++) {
                        if (var3.field3063[var4] == arg0) {
                            var3.field3065--;
                            for (int var5 = var4; var5 < var3.field3065; var5++) {
                                var3.field3063[var5] = var3.field3063[var5 + 1];
                                var3.field3079[var5] = var3.field3079[var5 + 1];
                            }
                            var3.field3063[var3.field3065] = null;
                            break;
                        }
                    }
                    var3.field3059 = 0;
                    for (int var6 = 0; var6 < var3.field3065; var6++) {
                        var3.field3059 |= var3.field3079[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V")
    public class228() {
        this.field4112 = new int[0];
        this.field4103 = new int[0];
        this.field4115 = new class193();
        this.field4115.field3031 = 1;
        this.field4110 = new class193();
        this.field4107 = new class167[] { this.field4115, this.field4110 };
        this.field4110.field3031 = 1;
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lnc;)V")
    public class228(class145 arg0) {
        int var2 = arg0.method998(116);
        this.field4107 = new class167[var2];
        int[][] var3 = new int[var2][];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < var2; var6++) {
            class167 var16 = class33.method286(arg0, -1);
            if (var16.method701((byte) 75) >= 0) {
                var5++;
            }
            if (var16.method523(21556) >= 0) {
                var4++;
            }
            int var17 = var16.field3029.length;
            var3[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var3[var6][var18] = arg0.method998(124);
            }
            this.field4107[var6] = var16;
        }
        this.field4112 = new int[var5];
        this.field4103 = new int[var4];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class167 var11 = this.field4107[var9];
            int var12 = var11.field3029.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field3029[var13] = this.field4107[var3[var9][var13]];
            }
            int var14 = var11.method701((byte) -93);
            int var15 = var11.method523(21556);
            if (var14 > 0) {
                this.field4112[var7++] = var14;
            }
            if (var15 > 0) {
                this.field4103[var8++] = var15;
            }
            var3[var9] = null;
        }
        this.field4115 = this.field4107[arg0.method998(122)];
        this.field4110 = this.field4107[arg0.method998(72)];
        Object var10 = null;
    }
}
