import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class177 extends class12 {

    @OriginalMember(owner = "client!ci", name = "Lb", descriptor = "Z")
    public static boolean field2696 = false;

    @OriginalMember(owner = "client!ci", name = "Kb", descriptor = "Lma;")
    public static class5 field2695 = class12.method119("gr-Un:", (byte) 54);

    @OriginalMember(owner = "client!ci", name = "Sb", descriptor = "I")
    public static int field2703 = 0;

    @OriginalMember(owner = "client!ci", name = "Qb", descriptor = "[I")
    public static int[] field2701 = new int[100];

    @OriginalMember(owner = "client!ci", name = "Ib", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!ci", name = "Jb", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!ci", name = "Mb", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!ci", name = "Nb", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!ci", name = "Pb", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!ci", name = "Rb", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!ci", name = "Ob", descriptor = "Lki;")
    public class288 field2699;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "()I", line = 4)
    public final int method248() {
        field2697++;
        return this.field180;
    }

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "(B)V", line = 18)
    public static final void method1154(byte arg0) {
        field2694++;
        if (class237.field3908 == -1 || class175.field2674 == -1) {
            return;
        }
        int var1 = ((class179.field2719 - class99.field1480) * class251.field4163 >> 16) + class99.field1480;
        class251.field4163 += var1;
        if (class251.field4163 < 65535) {
            class290.field4925 = false;
            class238.field3938 = false;
        } else {
            class251.field4163 = 65535;
            if (class238.field3938) {
                class290.field4925 = false;
            } else {
                class290.field4925 = true;
            }
            class238.field3938 = true;
        }
        float var2 = (float) class251.field4163 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class194.field3032 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var6 = class249.field4124[class237.field3908][var4][var5] * 3;
            int var7 = class249.field4124[class237.field3908][var4 + 1][var5] * 3;
            int var8 = (class249.field4124[class237.field3908][var4 + 2][var5] + class249.field4124[class237.field3908][var4 + 2][var5] - class249.field4124[class237.field3908][var4 + 3][var5]) * 3;
            int var9 = class249.field4124[class237.field3908][var4][var5];
            int var10 = var7 - var6;
            int var11 = class249.field4124[class237.field3908][var4 + 2][var5] + var7 - (var9 + var8);
            int var12 = var6 + var8 - (var7 * 2);
            var3[var5] = (((float) var11 * var2 + (float) var12) * var2 + (float) var10) * var2 + (float) var9;
        }
        if (class193.field3017 == 0 && class74.field1158 == 0) {
            class74.field1158 = ((int) var3[2] >> 10) * 8 - 48;
            class193.field3017 = (((int) var3[0] >> 10) - 6) * 8;
        }
        class27.field437 = (int) var3[1] * -1;
        class303.field5108 = (int) var3[2] - class74.field1158 * 128;
        class239.field3970 = (int) var3[0] - (class193.field3017 * 128);
        float[] var13 = new float[3];
        int var14 = class129.field1937 * 2;
        for (int var15 = 0; var15 < 3; var15++) {
            int var16 = class249.field4124[class175.field2674][var14][var15] * 3;
            int var17 = class249.field4124[class175.field2674][var14 + 1][var15] * 3;
            int var18 = class249.field4124[class175.field2674][var14][var15];
            int var19 = (class249.field4124[class175.field2674][var14 + 2][var15] + class249.field4124[class175.field2674][var14 - -2][var15] - class249.field4124[class175.field2674][var14 + 3][var15]) * 3;
            int var20 = var16 + var19 - (var17 * 2);
            int var21 = class249.field4124[class175.field2674][var14 + 2][var15] - (var18 + var19 - var17);
            int var22 = var17 - var16;
            var13[var15] = (((float) var21 * var2 + (float) var20) * var2 + (float) var22) * var2 + (float) var18;
        }
        float var23 = var13[0] - var3[0];
        float var24 = var13[2] - var3[2];
        float var25 = (var13[1] - var3[1]) * -1.0F;
        double var26 = Math.sqrt((double) (var23 * var23 + var24 * var24));
        if (arg0 > -64) {
            field2703 = -72;
        }
        class35.field550 = (float) Math.atan2((double) var25, var26);
        class296.field4986 = -((float) Math.atan2((double) var23, (double) var24));
        class207.field3287 = (int) ((double) class35.field550 * 325.949D) & 0x7FF;
        class114.field1710 = (int) ((double) class296.field4986 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "(B)V", line = 136)
    public static final void method1155(byte arg0) {
        if (arg0 != 96) {
            field2703 = 73;
        }
        field2693++;
        if (class49.field766 != null) {
            class49.field766.method1118(9640);
        }
        if (class1.field11 != null) {
            class1.field11.method1118(9640);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)Z", line = 161)
    public final boolean method117(byte arg0) {
        field2702++;
        if (arg0 > -114) {
            method1155((byte) 114);
        }
        return this.field2699 != null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIIIIII)V", line = 175)
    public static final void method1156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2698++;
        if (arg3 <= 30) {
            return;
        }
        if (arg1 == arg5) {
            class49.method362(127, arg2, arg5, arg0, arg6, arg4, arg7);
        } else if (arg0 - arg5 >= class57.field899 && (arg0 + arg5) <= class301.field5073 && class294.field4956 <= (arg6 - arg1) && arg1 + arg6 <= class101.field1505) {
            class19.method158(arg2, (byte) -27, arg7, arg0, arg5, arg6, arg1, arg4);
        } else {
            class181.method1181(arg1, arg0, arg5, arg2, arg4, false, arg7, arg6);
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)V", line = 199)
    public static void method1157(int arg0) {
        field2701 = null;
        field2695 = null;
        if (arg0 < 48) {
            field2695 = (class5) null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIIIIIIJ)V", line = 210)
    public final void method242(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field2700++;
        if (this.field2699 == null) {
            return;
        }
        class33 var11 = this.field238 != -1 && this.field214 == 0 ? class171.method1136(this.field238, -6722) : null;
        class33 var12 = this.field173 == -1 || this.field202 == this.field173 && var11 != null ? null : class171.method1136(this.field173, -6722);
        class34 var13 = this.field2699.method1946(var11, this.field237, this.field221, var12, (byte) 3);
        if (var13 == null) {
            return;
        }
        this.field180 = var13.method248();
        class288 var14 = this.field2699;
        if (var14.field4891 != null) {
            var14 = var14.method1938((byte) 34);
        }
        if (class77.field1208 && var14.field4860) {
            class34 var15 = class158.method1020(this.field178, this.field2699.field4889, var12 == null ? var11 : var12, var13, this.field211, var12 == null ? this.field221 : this.field237, this.field2699.field4844, arg0, this.field2699.field4845, this.field2699.field4904, this.field185, this.field2699.field4905, this.field225, true);
            float var16 = class45.method318();
            float var17 = class45.method335();
            class45.method340();
            class45.method324(var16, var17 - 150.0F);
            var15.method242(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
            class45.method341();
            class45.method324(var16, var17);
        }
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        if (this.field2699.field4893 != 0 || this.field2699.field4859 != 0) {
            int var21 = class229.field3805[arg0];
            short var22 = this.field2699.field4893;
            int var23 = -var22 / 2;
            int var24 = class229.field3806[arg0];
            short var25 = this.field2699.field4859;
            int var26 = -var25 / 2;
            int var27 = var24 * var26 - var21 * var23 >> 16;
            int var28 = var21 * var26 + var23 * var24 >> 16;
            int var29 = var22 / 2;
            int var30 = class20.method161(this.field211 + var27, this.field178 + var28, 1, class276.field4701);
            int var31 = -var25 / 2;
            int var32 = var21 * var31 + var24 * var29 >> 16;
            int var33 = var24 * var31 - (var21 * var29) >> 16;
            int var34 = class20.method161(this.field211 + var33, this.field178 + var32, 1, class276.field4701);
            int var35 = -var22 / 2;
            int var36 = var25 / 2;
            int var37 = var21 * var36 + var24 * var35 >> 16;
            int var38 = var24 * var36 - (var21 * var35) >> 16;
            int var39 = var22 / 2;
            int var40 = var25 / 2;
            int var41 = class20.method161(this.field211 + var38, this.field178 + var37, 1, class276.field4701);
            int var42 = var24 * var40 - var21 * var39 >> 16;
            int var43 = var30 >= var34 ? var34 : var30;
            int var44 = var30 < var41 ? var30 : var41;
            int var45 = var21 * var40 + (var24 * var39) >> 16;
            int var46 = class20.method161(this.field211 + var42, this.field178 + var45, 1, class276.field4701);
            int var47 = var30 + var46;
            int var48 = var46 <= var34 ? var46 : var34;
            int var49 = var41 >= var46 ? var46 : var41;
            if (var25 != 0) {
                var18 = (int) (Math.atan2((double) (var43 - var49), (double) var25) * 325.95D) & 0x7FF;
                if (var18 != 0) {
                    var13.method252(var18);
                }
            }
            if (var22 != 0) {
                var19 = (int) (Math.atan2((double) (var44 - var48), (double) var22) * 325.95D) & 0x7FF;
                if (var19 != 0) {
                    var13.method246(var19);
                }
            }
            if (var47 > (var34 + var41)) {
                var47 = var34 + var41;
            }
            var20 = (var47 >> 1) - this.field185;
            if (var20 != 0) {
                var13.method243(0, var20, 0);
            }
        }
        class34 var50 = null;
        if (this.field222 != -1 && this.field236 != -1) {
            class48 var51 = class57.method430(this.field222, 22867872);
            var50 = var51.method360(this.field236, (byte) 61);
            if (var50 != null) {
                var50.method243(0, -this.field213, 0);
                if (var51.field754) {
                    if (var18 != 0) {
                        var50.method252(var18);
                    }
                    if (var19 != 0) {
                        var50.method246(var19);
                    }
                    if (var20 != 0) {
                        var50.method243(0, var20, 0);
                    }
                }
            }
        }
        if (this.field2699.field4905 == 1) {
            var13.field532 = true;
        }
        var13.method242(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        if (var50 != null) {
            if (this.field2699.field4905 == 1) {
                var50.field532 = true;
            }
            var50.method242(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }
}
