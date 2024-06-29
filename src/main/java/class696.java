import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class class696 extends class391 {

    @OriginalMember(owner = "client!hda", name = "l", descriptor = "I")
    public static int field9826 = -1;

    @OriginalMember(owner = "client!hda", name = "j", descriptor = "F")
    public float field9824;

    @OriginalMember(owner = "client!hda", name = "o", descriptor = "F")
    public float field9829;

    @OriginalMember(owner = "client!hda", name = "r", descriptor = "F")
    public float field9832;

    @OriginalMember(owner = "client!hda", name = "t", descriptor = "F")
    public float field9834;

    @OriginalMember(owner = "client!hda", name = "w", descriptor = "F")
    public float field9837;

    @OriginalMember(owner = "client!hda", name = "x", descriptor = "F")
    public float field9838;

    @OriginalMember(owner = "client!hda", name = "z", descriptor = "F")
    public float field9840;

    @OriginalMember(owner = "client!hda", name = "A", descriptor = "F")
    public float field9841;

    @OriginalMember(owner = "client!hda", name = "G", descriptor = "F")
    public float field9847;

    @OriginalMember(owner = "client!hda", name = "I", descriptor = "F")
    public float field9849;

    @OriginalMember(owner = "client!hda", name = "L", descriptor = "F")
    public float field9852;

    @OriginalMember(owner = "client!hda", name = "P", descriptor = "F")
    public float field9856;

    @OriginalMember(owner = "client!hda", name = "f", descriptor = "I")
    public static int field9820;

    @OriginalMember(owner = "client!hda", name = "g", descriptor = "I")
    public static int field9821;

    @OriginalMember(owner = "client!hda", name = "h", descriptor = "I")
    public static int field9822;

    @OriginalMember(owner = "client!hda", name = "i", descriptor = "I")
    public static int field9823;

    @OriginalMember(owner = "client!hda", name = "k", descriptor = "I")
    public static int field9825;

    @OriginalMember(owner = "client!hda", name = "m", descriptor = "I")
    public static int field9827;

    @OriginalMember(owner = "client!hda", name = "n", descriptor = "I")
    public static int field9828;

    @OriginalMember(owner = "client!hda", name = "p", descriptor = "I")
    public static int field9830;

    @OriginalMember(owner = "client!hda", name = "q", descriptor = "I")
    public static int field9831;

    @OriginalMember(owner = "client!hda", name = "s", descriptor = "I")
    public static int field9833;

    @OriginalMember(owner = "client!hda", name = "u", descriptor = "I")
    public static int field9835;

    @OriginalMember(owner = "client!hda", name = "v", descriptor = "I")
    public static int field9836;

    @OriginalMember(owner = "client!hda", name = "y", descriptor = "I")
    public static int field9839;

    @OriginalMember(owner = "client!hda", name = "B", descriptor = "I")
    public static int field9842;

    @OriginalMember(owner = "client!hda", name = "C", descriptor = "I")
    public static int field9843;

    @OriginalMember(owner = "client!hda", name = "D", descriptor = "I")
    public static int field9844;

    @OriginalMember(owner = "client!hda", name = "E", descriptor = "I")
    public static int field9845;

    @OriginalMember(owner = "client!hda", name = "F", descriptor = "I")
    public static int field9846;

    @OriginalMember(owner = "client!hda", name = "H", descriptor = "I")
    public static int field9848;

    @OriginalMember(owner = "client!hda", name = "J", descriptor = "I")
    public static int field9850;

    @OriginalMember(owner = "client!hda", name = "K", descriptor = "I")
    public static int field9851;

    @OriginalMember(owner = "client!hda", name = "M", descriptor = "I")
    public static int field9853;

    @OriginalMember(owner = "client!hda", name = "N", descriptor = "I")
    public static int field9854;

    @OriginalMember(owner = "client!hda", name = "O", descriptor = "I")
    public static int field9855;

    @OriginalMember(owner = "client!hda", name = "Y", descriptor = "()V", line = 6)
    public final void method271() {
        this.field9834 = this.field9829 = this.field9847 = this.field9849 = this.field9852 = this.field9856 = this.field9840 = this.field9824 = this.field9841 = 0.0F;
        field9831++;
        this.field9838 = this.field9837 = this.field9832 = 1.0F;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "()Lq;", line = 15)
    public final class391 method251() {
        field9854++;
        class696 var1 = new class696();
        var1.field9847 = this.field9847;
        var1.field9849 = this.field9849;
        var1.field9832 = this.field9832;
        var1.field9837 = this.field9837;
        var1.field9824 = this.field9824;
        var1.field9856 = this.field9856;
        var1.field9834 = this.field9834;
        var1.field9852 = this.field9852;
        var1.field9838 = this.field9838;
        var1.field9829 = this.field9829;
        var1.field9840 = this.field9840;
        var1.field9841 = this.field9841;
        return var1;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(BLpaa;)I", line = 42)
    public static final int method3882(byte arg0, class577 arg1) {
        field9830++;
        class592 var2 = arg1.field8121;
        if (var2.field8315 != null) {
            var2 = var2.method3356(69, class61.field1163);
            if (var2 == null) {
                return -1;
            }
        }
        if (arg0 < 65) {
            field9826 = -11;
        }
        int var3 = var2.field8286;
        class87 var4 = arg1.method2544(2);
        if (arg1.field6230) {
            var3 = var2.field8343;
        } else if (arg1.field6226 == var4.field1418 || arg1.field6226 == var4.field1451 || arg1.field6226 == var4.field1433 || arg1.field6226 == var4.field1440) {
            var3 = var2.field8365;
        } else if (arg1.field6226 == var4.field1414 || arg1.field6226 == var4.field1464 || arg1.field6226 == var4.field1454 || arg1.field6226 == var4.field1423) {
            var3 = var2.field8308;
        }
        return var3;
    }

    @OriginalMember(owner = "client!hda", name = "AA", descriptor = "(I)V", line = 79)
    public final void method258(int arg0) {
        field9825++;
        float var2 = class542.field7612[arg0 & 0x3FFF];
        float var3 = class542.field7599[arg0 & 0x3FFF];
        float var4 = this.field9838;
        float var5 = this.field9847;
        float var6 = this.field9852;
        float var7 = this.field9840;
        this.field9838 = var2 * var4 - (this.field9834 * var3);
        this.field9847 = var2 * var5 - this.field9837 * var3;
        this.field9834 = this.field9834 * var2 + var3 * var4;
        this.field9852 = var2 * var6 - (this.field9856 * var3);
        this.field9837 = this.field9837 * var2 + var3 * var5;
        this.field9856 = this.field9856 * var2 + var3 * var6;
        this.field9840 = var2 * var7 - this.field9824 * var3;
        this.field9824 = this.field9824 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!hda", name = "w", descriptor = "(I)V", line = 107)
    public final void method248(int arg0) {
        field9853++;
        float var2 = class542.field7612[arg0 & 0x3FFF];
        float var3 = class542.field7599[arg0 & 0x3FFF];
        float var4 = this.field9834;
        float var5 = this.field9837;
        float var6 = this.field9856;
        float var7 = this.field9824;
        this.field9834 = var2 * var4 - this.field9829 * var3;
        this.field9829 = this.field9829 * var2 + var3 * var4;
        this.field9837 = var2 * var5 - this.field9849 * var3;
        this.field9856 = var2 * var6 - (this.field9832 * var3);
        this.field9849 = this.field9849 * var2 + var3 * var5;
        this.field9824 = var2 * var7 - this.field9841 * var3;
        this.field9832 = this.field9832 * var2 + var3 * var6;
        this.field9841 = this.field9841 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(II)V", line = 138)
    public static final void method3883(int arg0, int arg1) {
        field9850++;
        if (arg1 == 0) {
            class191 var2 = class6.method38(7, arg1 - 78, arg0);
            var2.method1284((byte) -41);
        }
    }

    @OriginalMember(owner = "client!hda", name = "ZA", descriptor = "(I)V", line = 151)
    public final void method272(int arg0) {
        field9846++;
        float var2 = class542.field7612[arg0 & 0x3FFF];
        float var3 = class542.field7599[arg0 & 0x3FFF];
        float var4 = this.field9838;
        float var5 = this.field9847;
        float var6 = this.field9852;
        float var7 = this.field9840;
        this.field9838 = this.field9829 * var3 + var2 * var4;
        this.field9829 = this.field9829 * var2 - var3 * var4;
        this.field9847 = this.field9849 * var3 + var2 * var5;
        this.field9849 = this.field9849 * var2 - (var3 * var5);
        this.field9852 = this.field9832 * var3 + var2 * var6;
        this.field9832 = this.field9832 * var2 - var3 * var6;
        this.field9840 = this.field9841 * var3 + var2 * var7;
        this.field9841 = this.field9841 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(III[I)V", line = 179)
    public final void method239(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field9832 + (float) arg0 * this.field9829 + (float) arg1 * this.field9849 + this.field9841);
        field9821++;
        arg3[1] = (int) ((float) arg2 * this.field9856 + (float) arg0 * this.field9834 + (float) arg1 * this.field9837 + this.field9824);
        arg3[0] = (int) ((float) arg2 * this.field9852 + (float) arg0 * this.field9838 + (float) arg1 * this.field9847 + this.field9840);
    }

    @OriginalMember(owner = "client!hda", name = "U", descriptor = "(III)V", line = 193)
    public final void method270(int arg0, int arg1, int arg2) {
        this.field9824 += arg1;
        this.field9840 += arg0;
        this.field9841 += arg2;
        field9844++;
    }

    @OriginalMember(owner = "client!hda", name = "c", descriptor = "(I)V", line = 203)
    public final void method3884(int arg0) {
        this.field9837 = -this.field9837;
        this.field9824 = -this.field9824;
        this.field9834 = -this.field9834;
        this.field9829 = -this.field9829;
        this.field9856 = -this.field9856;
        this.field9832 = -this.field9832;
        if (arg0 == 1) {
            this.field9841 = -this.field9841;
            this.field9849 = -this.field9849;
            field9835++;
        }
    }

    @OriginalMember(owner = "client!hda", name = "na", descriptor = "(IIIIII)V", line = 221)
    public final void method240(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field9828++;
        float var7 = class542.field7612[arg3 & 0x3FFF];
        float var8 = class542.field7599[arg3 & 0x3FFF];
        float var9 = class542.field7612[arg4 & 0x3FFF];
        float var10 = class542.field7599[arg4 & 0x3FFF];
        float var11 = class542.field7612[arg5 & 0x3FFF];
        float var12 = class542.field7599[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field9856 = var9 * var13 + var10 * var12;
        this.field9834 = -var9 * var12 + var10 * var13;
        this.field9847 = var7 * var12;
        this.field9838 = var9 * var11 + var10 * var14;
        this.field9832 = var7 * var9;
        this.field9852 = -var10 * var11 + var9 * var14;
        this.field9849 = -var8;
        this.field9829 = var7 * var10;
        this.field9837 = var7 * var11;
        this.field9840 = (float) (-arg0) * this.field9838 - ((float) arg1 * this.field9847) - (float) arg2 * this.field9852;
        this.field9824 = (float) (-arg0) * this.field9834 - ((float) arg1 * this.field9837) - (float) arg2 * this.field9856;
        this.field9841 = (float) (-arg0) * this.field9829 - ((float) arg1 * this.field9849) - ((float) arg2 * this.field9832);
    }

    @OriginalMember(owner = "client!hda", name = "wa", descriptor = "(III[I)V", line = 257)
    public final void method238(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = (int) ((float) arg2 * this.field9856 + (float) arg0 * this.field9834 + (float) arg1 * this.field9837);
        field9833++;
        arg3[2] = (int) ((float) arg2 * this.field9832 + (float) arg0 * this.field9829 + (float) arg1 * this.field9849);
        arg3[0] = (int) ((float) arg2 * this.field9852 + (float) arg0 * this.field9838 + (float) arg1 * this.field9847);
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(ZBLde;)V", line = 269)
    public static final void method3885(boolean arg0, byte arg1, class491 arg2) {
        field9848++;
        if (arg1 != 75) {
            method3885(false, (byte) -33, null);
        }
        if (class340.field5002 >= 400) {
            return;
        }
        if (class648.field9106 != arg2) {
            String var3;
            if (arg2.field6977 == 0) {
                boolean var4 = true;
                if (class648.field9106.field6985 != -1 && arg2.field6985 != -1) {
                    int var5 = arg2.field6971 >= class648.field9106.field6971 ? arg2.field6971 : class648.field9106.field6971;
                    int var6 = arg2.field6985 <= class648.field9106.field6985 ? arg2.field6985 : class648.field9106.field6985;
                    int var7 = var5 * 10 / 100 + var6 + 5;
                    int var8 = class648.field9106.field6971 - arg2.field6971;
                    if (var8 < 0) {
                        var8 = -var8;
                    }
                    if (var7 < var8) {
                        var4 = false;
                    }
                }
                String var9 = class673.field9519 == class586.field8208 ? class274.field4146.method1804(7175, class512.field7203) : class274.field4144.method1804(7175, class512.field7203);
                if (arg2.field6971 >= arg2.field6965) {
                    var3 = arg2.method2845(true, -14345) + (var4 ? class322.method2017(class648.field9106.field6971, arg1 + 12783, arg2.field6971) : "<col=ffffff>") + " (" + var9 + arg2.field6971 + ")";
                } else {
                    var3 = arg2.method2845(true, -14345) + (var4 ? class322.method2017(class648.field9106.field6971, arg1 ^ 0x3271, arg2.field6971) : "<col=ffffff>") + " (" + var9 + arg2.field6971 + "+" + (arg2.field6965 - arg2.field6971) + ")";
                }
            } else if (arg2.field6977 == -1) {
                var3 = arg2.method2845(true, -14345);
            } else {
                var3 = arg2.method2845(true, -14345) + " (" + class274.field4145.method1804(arg1 + 7100, class512.field7203) + arg2.field6977 + ")";
            }
            if (class245.field3797 && !arg0 && (class435.field6357 & 0x8) != 0) {
                class675.field9549++;
                class605.method3404(0, class338.field4988 + " -> <col=ffffff>" + var3, 0, true, 59, -1, false, arg1 ^ 0xFFFFFF96, class484.field6876, (long) arg2.field6216, class331.field4896);
            }
            if (arg0) {
                class605.method3404(0, "", 0, false, -1, 0, true, -13, -1, 0L, "<col=cccccc>" + var3);
            } else {
                for (int var10 = 7; var10 >= 0; var10--) {
                    if (class674.field9525[var10] != null) {
                        short var12 = 0;
                        if (class689.field9693 == class586.field8208 && class674.field9525[var10].equalsIgnoreCase(class274.field4139.method1804(arg1 ^ 0x1C4C, class512.field7203))) {
                            if (class648.field9106.field6971 < arg2.field6971) {
                                var12 = 2000;
                            }
                            if (class648.field9106.field6970 != 0 && arg2.field6970 != 0) {
                                if (class648.field9106.field6970 == arg2.field6970) {
                                    var12 = 2000;
                                } else {
                                    var12 = 0;
                                }
                            }
                        } else if (class641.field9048[var10]) {
                            var12 = 2000;
                        }
                        short var13 = (short) (class247.field3827[var10] + var12);
                        int var14 = class345.field5037[var10] == -1 ? class102.field1607 : class345.field5037[var10];
                        class605.method3404(0, "<col=ffffff>" + var3, 0, true, var13, -1, false, arg1 - 106, var14, (long) arg2.field6216, class674.field9525[var10]);
                        class535.field7509++;
                    }
                }
            }
            if (!arg0) {
                for (class279 var11 = (class279) class663.field9367.method472((byte) -30); var11 != null; var11 = (class279) class663.field9367.method482(119)) {
                    if (var11.field4213 == 48) {
                        var11.field4207 = "<col=ffffff>" + var3;
                        return;
                    }
                }
            }
        } else if (class245.field3797 && (class435.field6357 & 0x10) != 0) {
            class605.method3404(0, class338.field4988 + " -> <col=ffffff>" + class274.field4153.method1804(7175, class512.field7203), 0, true, 22, -1, false, -45, class484.field6876, 0L, class331.field4896);
            class302.field4490++;
        }
    }

    @OriginalMember(owner = "client!hda", name = "d", descriptor = "(I)[F", line = 429)
    public final float[] method3886(int arg0) {
        field9855++;
        class243.field3773[5] = this.field9837;
        class243.field3773[6] = this.field9849;
        class243.field3773[1] = this.field9834;
        class243.field3773[8] = this.field9852;
        class243.field3773[14] = this.field9841;
        class243.field3773[12] = this.field9840;
        class243.field3773[10] = this.field9832;
        class243.field3773[4] = this.field9847;
        class243.field3773[13] = this.field9824;
        class243.field3773[2] = this.field9829;
        if (arg0 != 11230) {
            this.field9832 = 1.8394603F;
        }
        class243.field3773[0] = this.field9838;
        class243.field3773[9] = this.field9856;
        return class243.field3773;
    }

    @OriginalMember(owner = "client!hda", name = "o", descriptor = "(I)V", line = 452)
    public final void method245(int arg0) {
        this.field9837 = 1.0F;
        field9842++;
        this.field9838 = this.field9832 = class542.field7612[arg0 & 0x3FFF];
        this.field9852 = class542.field7599[arg0 & 0x3FFF];
        this.field9829 = -this.field9852;
        this.field9847 = this.field9840 = this.field9834 = this.field9856 = this.field9824 = this.field9849 = this.field9841 = 0.0F;
    }

    @OriginalMember(owner = "client!hda", name = "NA", descriptor = "(III)V", line = 465)
    public final void method252(int arg0, int arg1, int arg2) {
        this.field9840 = arg0;
        this.field9824 = arg1;
        this.field9834 = this.field9829 = this.field9847 = this.field9849 = this.field9852 = this.field9856 = 0.0F;
        this.field9841 = arg2;
        this.field9838 = this.field9837 = this.field9832 = 1.0F;
        field9822++;
    }

    @OriginalMember(owner = "client!hda", name = "oa", descriptor = "(I)V", line = 484)
    public final void method256(int arg0) {
        this.field9838 = 1.0F;
        field9836++;
        this.field9837 = this.field9832 = class542.field7612[arg0 & 0x3FFF];
        this.field9849 = class542.field7599[arg0 & 0x3FFF];
        this.field9856 = -this.field9849;
        this.field9847 = this.field9852 = this.field9840 = this.field9834 = this.field9824 = this.field9829 = this.field9841 = 0.0F;
    }

    @OriginalMember(owner = "client!hda", name = "M", descriptor = "(Lq;)V", line = 496)
    public final void method274(class391 arg0) {
        field9845++;
        class696 var2 = (class696) arg0;
        this.field9841 = var2.field9841;
        this.field9829 = var2.field9829;
        this.field9838 = var2.field9838;
        this.field9840 = var2.field9840;
        this.field9847 = var2.field9847;
        this.field9837 = var2.field9837;
        this.field9834 = var2.field9834;
        this.field9849 = var2.field9849;
        this.field9856 = var2.field9856;
        this.field9832 = var2.field9832;
        this.field9852 = var2.field9852;
        this.field9824 = var2.field9824;
    }

    @OriginalMember(owner = "client!hda", name = "e", descriptor = "(I)[F", line = 517)
    public final float[] method3887(int arg0) {
        class243.field3773[12] = 0.0F;
        field9827++;
        class243.field3773[2] = this.field9829;
        class243.field3773[13] = arg0;
        class243.field3773[10] = this.field9832;
        class243.field3773[14] = 0.0F;
        class243.field3773[4] = this.field9847;
        class243.field3773[9] = this.field9856;
        class243.field3773[6] = this.field9849;
        class243.field3773[5] = this.field9837;
        class243.field3773[8] = this.field9852;
        class243.field3773[1] = this.field9834;
        class243.field3773[0] = this.field9838;
        return class243.field3773;
    }

    @OriginalMember(owner = "client!hda", name = "YA", descriptor = "([I)V", line = 537)
    public final void method236(int[] arg0) {
        field9851++;
        float var2 = (float) arg0[0] - this.field9840;
        float var3 = (float) arg0[1] - this.field9824;
        float var4 = (float) arg0[2] - this.field9841;
        arg0[2] = (int) (this.field9832 * var4 + this.field9856 * var3 + this.field9852 * var2);
        arg0[1] = (int) (this.field9849 * var4 + this.field9847 * var2 + this.field9837 * var3);
        arg0[0] = (int) (this.field9829 * var4 + this.field9838 * var2 + this.field9834 * var3);
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(ILq;)V", line = 556)
    public final void method3888(int arg0, class391 arg1) {
        if (arg0 != 0) {
            this.field9852 = 1.6218892F;
        }
        field9823++;
        class696 var3 = (class696) arg1;
        this.field9852 = var3.field9829;
        this.field9838 = var3.field9838;
        this.field9847 = var3.field9834;
        this.field9837 = var3.field9837;
        this.field9834 = var3.field9847;
        this.field9856 = var3.field9849;
        this.field9829 = var3.field9852;
        this.field9849 = var3.field9856;
        this.field9840 = -(this.field9852 * var3.field9841 + this.field9847 * var3.field9824 + this.field9838 * var3.field9840);
        this.field9832 = var3.field9832;
        this.field9824 = -(this.field9856 * var3.field9841 + this.field9837 * var3.field9824 + this.field9834 * var3.field9840);
        this.field9841 = -(this.field9832 * var3.field9841 + this.field9849 * var3.field9824 + this.field9829 * var3.field9840);
    }

    @OriginalMember(owner = "client!hda", name = "J", descriptor = "(I)V", line = 580)
    public final void method249(int arg0) {
        field9843++;
        this.field9832 = 1.0F;
        this.field9838 = this.field9837 = class542.field7612[arg0 & 0x3FFF];
        this.field9834 = class542.field7599[arg0 & 0x3FFF];
        this.field9852 = this.field9840 = this.field9856 = this.field9824 = this.field9829 = this.field9849 = this.field9841 = 0.0F;
        this.field9847 = -this.field9834;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(FIFIIBF)V", line = 592)
    public final void method3889(float arg0, int arg1, float arg2, int arg3, int arg4, byte arg5, float arg6) {
        field9839++;
        if (arg1 == 0) {
            this.field9838 = arg3;
            this.field9834 = this.field9829 = this.field9847 = this.field9849 = this.field9852 = this.field9856 = 0.0F;
            this.field9832 = 1.0F;
            this.field9837 = arg4;
        } else {
            float var8 = class542.field7612[arg1 & 0x3FFF];
            float var9 = class542.field7599[arg1 & 0x3FFF];
            this.field9832 = 1.0F;
            this.field9834 = (float) arg3 * var9;
            this.field9837 = (float) arg4 * var8;
            this.field9829 = this.field9849 = this.field9852 = this.field9856 = 0.0F;
            this.field9847 = (float) arg4 * -var9;
            this.field9838 = (float) arg3 * var8;
        }
        this.field9824 = arg0;
        if (arg5 < 122) {
            this.method3886(84);
        }
        this.field9841 = arg6;
        this.field9840 = arg2;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(FF[FFFB)V", line = 634)
    public final void method3890(float arg0, float arg1, float[] arg2, float arg3, float arg4, byte arg5) {
        if (arg5 != 41) {
            this.field9852 = -0.028568722F;
        }
        field9820++;
        arg2[1] = this.field9856 * arg1 + this.field9837 * arg0 + this.field9834 * arg3;
        float var8;
        float var9;
        float var10;
        if ((arg3 > 0.00390625F) || (arg3 < -0.00390625F)) {
            float var12 = -arg4 / arg3;
            var9 = this.field9834 * var12 + this.field9824;
            var8 = this.field9838 * var12 + this.field9840;
            var10 = this.field9829 * var12 + this.field9841;
        } else if ((arg0 > 0.00390625F) || (arg0 < -0.00390625F)) {
            float var11 = -arg4 / arg0;
            var8 = this.field9847 * var11 + this.field9840;
            var10 = this.field9849 * var11 + this.field9841;
            var9 = this.field9837 * var11 + this.field9824;
        } else {
            float var7 = -arg4 / arg1;
            var8 = this.field9852 * var7 + this.field9840;
            var9 = this.field9856 * var7 + this.field9824;
            var10 = this.field9832 * var7 + this.field9841;
        }
        arg2[2] = this.field9832 * arg1 + this.field9849 * arg0 + this.field9829 * arg3;
        arg2[0] = this.field9852 * arg1 + this.field9847 * arg0 + this.field9838 * arg3;
        arg2[3] = -(arg2[2] * var10 + arg2[1] * var9 + arg2[0] * var8);
    }

    @OriginalMember(owner = "client!hda", name = "<init>", descriptor = "()V", line = 679)
    public class696() {
        this.method271();
    }
}
