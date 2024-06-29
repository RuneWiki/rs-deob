import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class260 extends class208 {

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public int field4401;

    @OriginalMember(owner = "client!s", name = "w", descriptor = "I")
    public int field4413;

    @OriginalMember(owner = "client!s", name = "v", descriptor = "Lve;")
    public static class255 field4412 = class87.method607(33, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!s", name = "x", descriptor = "I")
    public static int field4414 = 0;

    @OriginalMember(owner = "client!s", name = "z", descriptor = "Lve;")
    public static class255 field4416 = class87.method607(71, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!s", name = "l", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!s", name = "n", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!s", name = "p", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!s", name = "q", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!s", name = "r", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!s", name = "s", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!s", name = "u", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!s", name = "y", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!s", name = "t", descriptor = "[I")
    public static int[] field4410;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILve;Lve;I)V", line = 8)
    public static final void method1807(int arg0, class255 arg1, class255 arg2, int arg3) {
        class100.method780(-1, (class255) null, arg1, -32411, arg3, arg2);
        if (arg0 == 1) {
            field4407++;
        }
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(I)I", line = 20)
    public static final int method1808(int arg0) {
        field4411++;
        if (arg0 != 15535) {
            field4410 = (int[]) null;
        }
        if ((double) class97.field1683 == 3.0D) {
            return 37;
        } else if ((double) class97.field1683 == 4.0D) {
            return 50;
        } else if ((double) class97.field1683 == 6.0D) {
            return 75;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(B)V", line = 48)
    public static final void method1809(byte arg0) {
        field4406++;
        int var1 = -41 % ((-arg0 - 81) / 44);
        while (class160.field2692.method1518(true, class125.field2084) >= 11) {
            int var2 = class160.field2692.method1513((byte) 45, 11);
            if (var2 == 2047) {
                break;
            }
            boolean var3 = false;
            if (class151.field2555[var2] == null) {
                var3 = true;
                class151.field2555[var2] = new class242();
                if (class85.field1380[var2] != null) {
                    class151.field2555[var2].method1685(0, class85.field1380[var2]);
                }
            }
            class259.field4398[class309.field5269++] = var2;
            class242 var4 = class151.field2555[var2];
            var4.field5122 = class277.field4768;
            int var5 = class160.field2692.method1513((byte) 45, 5);
            int var6 = class160.field2692.method1513((byte) 45, 5);
            if (var6 > 15) {
                var6 -= 32;
            }
            if (var5 > 15) {
                var5 -= 32;
            }
            int var7 = class160.field2692.method1513((byte) 45, 1);
            int var8 = class160.field2692.method1513((byte) 45, 1);
            if (var8 == 1) {
                class10.field145[class118.field1985++] = var2;
            }
            int var9 = class155.field2640[class160.field2692.method1513((byte) 45, 3)];
            if (var3) {
                var4.field5129 = var4.field5157 = var9;
            }
            var4.method1687(class276.field4742.field5125[0] + var5, class276.field4742.field5154[0] - -var6, var7 == 1, (byte) 123);
        }
        class160.field2692.method1514(true);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)V", line = 112)
    public static final void method1810(boolean arg0) {
        class143.method1061();
        field4404++;
        class304.field5201 = null;
        class183.field2954 = -1;
        class196.method1402(695633762);
        class57.field880.method59((byte) 108);
        class141.field2338 = new class209();
        ((class132) class283.field4866).method974((byte) -110);
        class164.field2775 = new class1[255];
        if (arg0) {
            return;
        }
        class164.field2769 = 0;
        class193.method1365();
        class35.method195();
        class112.method855(640);
        class274.method1922((byte) -121);
        class7.method37(4579);
        for (int var1 = 0; var1 < 2048; var1++) {
            class242 var2 = class151.field2555[var1];
            if (var2 != null) {
                var2.field4055 = null;
            }
        }
        if (class281.field4827) {
            class35.method209(104, 104);
        }
        class103.method792(class220.field3707, -11933, class167.field2814);
        class20.method113(class220.field3707, -12777);
        if (class18.field281 == 5) {
            class187.method1306(class220.field3707, (byte) -98);
        }
        if (class18.field281 == 10) {
            class199.method1428(false, -117);
        }
        if (class18.field281 == 30) {
            class256.method1798(-92, 25);
        }
    }

    @OriginalMember(owner = "client!s", name = "d", descriptor = "(I)V", line = 178)
    public static void method1811(int arg0) {
        field4412 = null;
        field4416 = null;
        field4410 = null;
        if (arg0 != -23978) {
            field4412 = (class255) null;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Ltl;II)Lve;", line = 190)
    public static final class255 method1812(class197 arg0, int arg1, int arg2) {
        field4415++;
        if (!class109.method841(true, arg2, client.method1673(arg0)) && arg0.field3326 == null) {
            return null;
        }
        if (arg1 <= 85) {
            field4410 = (int[]) null;
        }
        if (arg0.field3300 == null || arg0.field3300.length <= arg2 || arg0.field3300[arg2] == null || arg0.field3300[arg2].method1771(255).method1774(-41) == 0) {
            return class198.field3421 ? class3.method14(new class255[] { class156.field2660, class215.method1532(arg2, true) }, (byte) -78) : null;
        } else {
            return arg0.field3300[arg2];
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IBIIIZ)V", line = 218)
    public static final void method1813(int arg0, byte arg1, int arg2, int arg3, int arg4, boolean arg5) {
        class93.field1600++;
        if (!arg5) {
            class287.method2035((byte) -43, true);
            class143.method1063((byte) -54, true);
            class287.method2035((byte) -106, false);
        }
        class143.method1063((byte) -97, false);
        field4402++;
        if (!arg5) {
            class24.method131(13312);
        }
        class194.method1386((byte) 4);
        if (class281.field4827) {
            class315.method2173(arg2, arg4, true, (byte) -44, arg3, arg0);
            arg4 = class153.field2597;
            arg0 = class44.field682;
            arg2 = class232.field3847;
            arg3 = class34.field547;
        }
        if (class3.field50 == 1) {
            int var6 = class271.field4652;
            if ((class300.field5111 / 256) > var6) {
                var6 = class300.field5111 / 256;
            }
            if (class247.field4138[4] && (class237.field3947[4] + 128) > var6) {
                var6 = class237.field3947[4] + 128;
            }
            int var7 = class76.field1253 + class58.field885 & 0x7FF;
            class206.method1496(var7, class16.field243, class113.method861((byte) -86, class276.field4742.field5130, class276.field4742.field5173, client.field4039) - 50, var6 * 3 + 600, arg3, var6, class234.field3863, false);
        }
        int var8 = class221.field3723;
        int var9 = class153.field2599;
        int var10 = class256.field4373;
        int var11 = field4409;
        int var12 = class305.field5216;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class247.field4138[var13]) {
                int var14 = (int) ((double) (class37.field564[var13] * 2 + 1) * Math.random() + Math.sin((double) class190.field3049[var13] / 100.0D * (double) class112.field1889[var13]) * (double) class237.field3947[var13] - (double) class37.field564[var13]);
                if (var13 == 0) {
                    class221.field3723 += var14;
                }
                if (var13 == 2) {
                    class256.field4373 += var14;
                }
                if (var13 == 3) {
                    class305.field5216 = class305.field5216 + var14 & 0x7FF;
                }
                if (var13 == 1) {
                    class153.field2599 += var14;
                }
                if (var13 == 4) {
                    field4409 += var14;
                    if (field4409 < 128) {
                        field4409 = 128;
                    }
                    if (field4409 > 383) {
                        field4409 = 383;
                    }
                }
            }
        }
        class235.method1625((byte) -85);
        if (class281.field4827) {
            class126.method938(arg2, arg0, arg2 + arg4, arg0 + arg3);
            float var15 = (float) class305.field5216 * 0.17578125F;
            float var16 = (float) field4409 * 0.17578125F;
            if (class3.field50 == 3) {
                var15 = class196.field3239 * 360.0F / 6.2831855F;
                var16 = class95.field1635 * 360.0F / 6.2831855F;
            }
            class281.method1976(arg2, arg0, arg4, arg3, arg4 / 2 + arg2, arg3 / 2 + arg0, var16, var15, class195.field3217, class195.field3217);
        } else {
            class175.method1258(arg2, arg0, arg2 + arg4, arg0 + arg3);
            class283.method1997();
        }
        if (class156.field2651 || arg2 > class251.field4239 || (arg2 + arg4) <= class251.field4239 || arg0 > class197.field3306 || (arg0 + arg3) <= class197.field3306) {
            class153.field2611 = 0;
            class82.field1323 = false;
        } else {
            class153.field2611 = 0;
            int var17 = class261.field4430;
            class82.field1323 = true;
            int var18 = class95.field1637;
            int var19 = class298.field5095;
            class92.field1585 = (class251.field4239 - arg2) * (var17 - var19) / arg4 + var19;
            int var20 = class295.field5067;
            class112.field1891 = (class197.field3306 - arg0) * (var20 - var18) / arg3 + var18;
        }
        class118.method885(true);
        byte var21 = class85.method592((byte) 76) == 2 ? (byte) class93.field1600 : 1;
        if (class281.field4827) {
            class281.method1966();
            class281.method1968(true);
            boolean var22 = false;
            class281.method1971(true);
            int var23;
            if (class18.field281 == 10) {
                var23 = class47.method278(class221.field3723 >> 10, class79.field1291, class122.field2036, class256.field4373 >> 10, arg1 + 112);
            } else {
                var23 = class47.method278(class276.field4742.field5125[0] >> 3, class79.field1291, class122.field2036, class276.field4742.field5154[0] >> 3, 64);
            }
            class164.method1195(class277.field4768, !class143.field2392);
            class281.method1963(var23);
            class18.method90(class153.field2599, class305.field5216, field4409, class256.field4373, class221.field3723, 15762);
            class281.field4810 = class277.field4768;
            class144.method1070(class221.field3723, class153.field2599, class256.field4373, field4409, class305.field5216, class96.field1664, class29.field450, class185.field2990, class143.field2378, class307.field5224, class82.field1324, client.field4039 + 1, var21, class276.field4742.field5130 >> 7, class276.field4742.field5173 >> 7);
            class141.field2340 = true;
            class164.method1198();
            class18.method90(0, 0, 0, 0, 0, 15762);
            class118.method885(true);
            class113.method860();
            class191.method1312(class195.field3217, arg0, arg4, class195.field3217, arg2, arg3, arg1 ^ 0xD22F1811);
            class2.method8(class195.field3217, arg0, arg3, arg4, class195.field3217, arg2, (byte) -118);
        } else {
            class175.method1249(arg2, arg0, arg4, arg3, 0);
            class144.method1070(class221.field3723, class153.field2599, class256.field4373, field4409, class305.field5216, class96.field1664, class29.field450, class185.field2990, class143.field2378, class307.field5224, class82.field1324, client.field4039 + 1, var21, class276.field4742.field5130 >> 7, class276.field4742.field5173 >> 7);
            class118.method885(true);
            class113.method860();
            class191.method1312(256, arg0, arg4, 256, arg2, arg3, arg1 + 768665585);
            class2.method8(256, arg0, arg3, arg4, 256, arg2, (byte) -118);
        }
        ((class132) class283.field4866).method993(arg1 + 27527, class122.field2036);
        class60.method372(arg1 ^ 0x28, arg3, arg4, arg0, arg2);
        class305.field5216 = var12;
        class256.field4373 = var10;
        class153.field2599 = var9;
        field4409 = var11;
        class221.field3723 = var8;
        if (arg1 != -48) {
            return;
        }
        if (class298.field5096 && class297.field5078.method1003(0) == 0) {
            class298.field5096 = false;
        }
        if (class298.field5096) {
            if (class281.field4827) {
                class126.method936(arg2, arg0, arg4, arg3, 0);
            } else {
                class175.method1249(arg2, arg0, arg4, arg3, 0);
            }
            class256.method1796(class241.field4009, -8921, false);
        }
        if (!arg5 && !class298.field5096 && !class156.field2651 && class251.field4239 >= arg2 && class251.field4239 < (arg2 + arg4) && class197.field3306 >= arg0 && arg0 + arg3 > class197.field3306) {
            class166.method1210(-71, arg2, arg0, arg4, class197.field3306, arg3, class251.field4239);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "([IIIIII)V", line = 423)
    public static final void method1814(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class249 var6 = class118.field1984[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class84 var7 = var6.field4189;
        if (var7 != null) {
            int var8 = var7.field1358;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class243 var10 = var6.field4179;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field4101;
        int var12 = var10.field4093;
        int var13 = var10.field4098;
        int var14 = var10.field4094;
        int[] var15 = class152.field2588[var11];
        int[] var16 = class251.field4233[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!s", name = "e", descriptor = "(I)V", line = 516)
    public static final void method1815(int arg0) {
        field4408++;
        class150.field2550.method554(0);
        class130.field2144.method554(0);
        if (arg0 >= 62) {
            class145.field2421.method554(0);
        }
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(II)V", line = 541)
    public class260(int arg0, int arg1) {
        this.field4401 = arg1;
        this.field4413 = arg0;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIZIII)I", line = 551)
    public static final int method1816(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var7 = arg1 & 0x3;
        if ((arg0 & 0x1) == 1) {
            int var8 = arg5;
            arg5 = arg6;
            arg6 = var8;
        }
        field4405++;
        if (!arg3) {
            method1807(53, (class255) null, (class255) null, -55);
        }
        if (var7 == 0) {
            return arg2;
        } else if (var7 == 1) {
            return 1 + 7 - arg5 - arg4;
        } else if (var7 == 2) {
            return 1 + 7 - arg6 - arg2;
        } else {
            return arg4;
        }
    }
}
