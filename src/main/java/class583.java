import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class583 {

    @OriginalMember(owner = "client!si", name = "d", descriptor = "Lpa;")
    public static class387 field8255 = new class387(32);

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field8252;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field8253;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public static int field8254;

    @OriginalMember(owner = "client!si", name = "toString", descriptor = "()Ljava/lang/String;", line = 9)
    public final String toString() {
        field8253++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIZIII)V", line = 17)
    public static final void method3383(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field8254++;
        if (class378.field5427 == null) {
            class638.field8979.method488(arg3, arg5, -16777216, arg0, 1, arg4);
        } else if (class251.field3549.field7718 >= 0 && class251.field3549.field7718 < (class109.field1314 * 512) && class251.field3549.field7719 >= 0 && class760.field10479 * 512 > class251.field3549.field7719) {
            class327.field4890++;
            if (class251.field3549 != null && (class251.field3549.field7718 - (class251.field3549.method2692((byte) 73) - 1) * 256 >> 9) == class697.field9843 && class251.field3549.field7719 + 256 - class251.field3549.method2692((byte) 9) * 256 >> 9 == class336.field4995) {
                class697.field9843 = -1;
                class336.field4995 = -1;
                class777.method4274(false);
            }
            class778.method4277((byte) -87);
            if (!arg2) {
                class174.method1307((byte) -108);
            }
            class701.method3977((byte) -117);
            class733.method4099(arg0, arg5, arg3, arg4, true, (byte) -36);
            int var6 = class668.field9397;
            int var7 = class467.field6635;
            class412.field5822 = class412.field5823;
            int var8 = class746.field10376;
            if (arg1 == -1428115959) {
                int var9 = class202.field2958;
                if (class763.field10510 == 1) {
                    int var12 = (int) class509.field7256;
                    if (var12 < (class288.field4400 >> 8)) {
                        var12 = class288.field4400 >> 8;
                    }
                    if (class259.field3641[4] && class369.field5311[4] + 128 > var12) {
                        var12 = class369.field5311[4] + 128;
                    }
                    int var13 = (int) class562.field8001 + class87.field1122 & 0x3FFF;
                    class1.method11(var13, (byte) -107, ((var12 >> 3) * 3) + 600 << 2, class238.field3434, var8, class4.field54, var12, class580.method3366(class410.field5771, (byte) -95, class251.field3549.field7719, class251.field3549.field7718) - 200);
                } else if (class763.field10510 == 4) {
                    int var10 = (int) class509.field7256;
                    if ((class288.field4400 >> 8) > var10) {
                        var10 = class288.field4400 >> 8;
                    }
                    if (class259.field3641[4] && var10 < class369.field5311[4] + 128) {
                        var10 = class369.field5311[4] + 128;
                    }
                    int var11 = (int) class562.field8001 & 0x3FFF;
                    class1.method11(var11, (byte) -121, (var10 >> 3) * 3 + 600 << 2, class238.field3434, var8, class4.field54, var10, class580.method3366(class410.field5771, (byte) -95, class579.field8185, class75.field1009) - 200);
                } else if (class763.field10510 == 5) {
                    class518.method3013(6606, var8);
                }
                int var14 = class277.field3866;
                int var15 = class655.field9241;
                int var16 = class359.field5216;
                int var17 = class689.field9757;
                int var18 = class118.field1478;
                for (int var19 = 0; var19 < 5; var19++) {
                    if (class259.field3641[var19]) {
                        int var22 = (int) ((double) (class195.field2867[var19] * 2 + 1) * Math.random() + Math.sin((double) class229.field3286[var19] / 100.0D * (double) class747.field10381[var19]) * (double) class369.field5311[var19] - (double) class195.field2867[var19]);
                        if (var19 == 4) {
                            class689.field9757 += var22;
                            if (class689.field9757 < 1024) {
                                class689.field9757 = 1024;
                            } else if (class689.field9757 > 3072) {
                                class689.field9757 = 3072;
                            }
                        }
                        if (var19 == 1) {
                            class655.field9241 += var22 << 2;
                        }
                        if (var19 == 2) {
                            class359.field5216 += var22 << 2;
                        }
                        if (var19 == 3) {
                            class118.field1478 = class118.field1478 + var22 & 0x3FFF;
                        }
                        if (var19 == 0) {
                            class277.field3866 += var22 << 2;
                        }
                    }
                }
                if (class277.field3866 < 0) {
                    class277.field3866 = 0;
                }
                if (class359.field5216 < 0) {
                    class359.field5216 = 0;
                }
                if ((class151.field2074 << 9) - 1 < class277.field3866) {
                    class277.field3866 = (class151.field2074 << 9) - 1;
                }
                if ((class12.field249 << 9) - 1 < class359.field5216) {
                    class359.field5216 = (class12.field249 << 9) - 1;
                }
                class661.method3769(0);
                class498.method2906(false);
                class638.field8979.method455(var7, var9, var6 + var7, var9 - -var8);
                class291.method1970(true, -120);
                if (class607.field8578) {
                    class562.method3266(class553.field7874, -72);
                    if (class467.field6636 != class412.field5822) {
                        class432.field6151 = true;
                    }
                    class467.field6636 = class412.field5822;
                } else {
                    class638.field8979.method449();
                    int var20 = class553.field7874;
                    if (class656.field9247 == null) {
                        class638.field8979.method417(var20);
                    } else {
                        class656.field9247.method3848(var7, (byte) 40, var9, var6, var20, class118.field1478, class385.field5493 << 3, var8, class638.field8979, class689.field9757);
                    }
                }
                class84.method611(-55);
                class13.field256.method1938(class277.field3866, class655.field9241, class359.field5216, -class689.field9757 & 0x3FFF, -class118.field1478 & 0x3FFF, -class666.field9380 & 0x3FFF);
                class638.field8979.method445(class13.field256);
                class638.field8979.method409(var6 / 2 + var7, var8 / 2 + var9, class103.field1293 << 1, class103.field1293 << 1);
                class377.method2332(class103.field1293 << 1, var8 / 2 + var9, var6 / 2 + var7, (byte) -17, class103.field1293 << 1);
                class167.method1293(-class666.field9380 & 0x3FFF, class277.field3866, -class689.field9757 & 0x3FFF, class655.field9241, true, -class118.field1478 & 0x3FFF, class359.field5216);
                byte var21 = class145.field1852.field8994.method2826((byte) -104) == 2 ? (byte) class327.field4890 : 1;
                if (class607.field8578) {
                    class634.method3614(arg1 + 1428115958, -class118.field1478 & 0x3FFF, -class689.field9757 & 0x3FFF, -class666.field9380 & 0x3FFF);
                    class258.method1699(class145.field1852.field8998.method4317((byte) -121) == 0, class251.field3549.field7719 >> 9, true, class278.field3871, class359.field5216, class251.field3549.field7710 + 1, class412.field5822, class673.field9441, var21, class685.field9720, class175.field2497, class624.field8795, class206.field3023, class145.field1854, class251.field3549.field7718 >> 9, (byte) -124, class655.field9241, class277.field3866);
                } else {
                    class511.method2986(class673.field9441, class277.field3866, class655.field9241, class359.field5216, class278.field3871, class175.field2497, class685.field9720, class206.field3023, class624.field8795, class145.field1854, class251.field3549.field7710 + 1, var21, class251.field3549.field7718 >> 9, class251.field3549.field7719 >> 9, class145.field1852.field8998.method4317((byte) -87) == 0, true, class475.field6760 ? class412.field5822 : -1, 0, false);
                }
                class84.method611(123);
                if (class757.field10456 == 10) {
                    class403.method2432(var7, var9, var6, 256, (byte) -114, 256, var8);
                    class3.method16(256, 256, arg1 + 1428141832, var6, var7, var9, var8);
                    class144.method989(var9, arg1 ^ 0xAAE0AE15, 256, var7, var6, var8, 256);
                    class696.method3924((byte) 101, var6, var7, var9, var8);
                }
                class395.method2414();
                class277.field3866 = var14;
                class118.field1478 = var18;
                class655.field9241 = var15;
                class689.field9757 = var17;
                class359.field5216 = var16;
                if (class665.field9375 && class451.field6478.method4222(arg1 + 1428116084) == 0) {
                    class665.field9375 = false;
                }
                if (class665.field9375) {
                    class638.field8979.method488(var9, var7, -16777216, var8, 1, var6);
                    class54.method348(class157.field2343, false, class564.field8008, class638.field8979, false, class674.field9563.method3825((byte) -10, class526.field7494));
                }
                class291.method1970(false, arg1 + 1428115832);
            }
        } else {
            class638.field8979.method488(arg3, arg5, -16777216, arg0, 1, arg4);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BC)I", line = 235)
    public static final int method3384(byte arg0, char arg1) {
        if (arg0 != 97) {
            field8255 = null;
        }
        field8252++;
        return arg1 >= '\u0000' && arg1 < class286.field4376.length ? class286.field4376[arg1] : -1;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)V", line = 252)
    public static void method3385(boolean arg0) {
        field8255 = null;
        if (!arg0) {
            method3385(false);
        }
    }
}
