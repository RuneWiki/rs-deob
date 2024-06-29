import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public abstract class class594 {

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field8570 = 0;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public static int field8573 = 1;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field8575 = 0;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field8571;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field8572;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field8574;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "Lkr;")
    public static class329 field8576;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIZIZI)V")
    public static final void method3425(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5) {
        field8574++;
        if (class199.field2605 == null) {
            class301.field3918.method974(-16777216, 1, arg0, arg1, arg5, arg3);
        } else if (class147.field1899.field6362 >= 0 && class147.field1899.field6362 < (class139.field1760 * 512) && class147.field1899.field6368 >= 0 && class369.field5135 * 512 > class147.field1899.field6368) {
            class227.field2903++;
            if (class147.field1899 != null && (class147.field1899.field6362 - (class147.field1899.method104((byte) -92) * 256 - 256) >> 9) == class281.field3673 && (class147.field1899.field6368 + 256 - (class147.field1899.method104((byte) -92) * 256) >> 9) == class64.field868) {
                class64.field868 = -1;
                class281.field3673 = -1;
                class232.method1468((byte) 102);
            }
            class515.method2866(0);
            if (!arg4) {
                class565.method3169((byte) 116);
            }
            class566.method3171((byte) 65);
            class408.method2435(arg1, true, (byte) 94, arg0, arg5, arg3);
            int var6 = class386.field5375;
            int var7 = class221.field2838;
            int var8 = class94.field1251;
            int var9 = class151.field1992;
            if (class621.field8952 == 1) {
                int var10 = (int) class568.field7951;
                if (class610.field8773 >> 8 > var10) {
                    var10 = class610.field8773 >> 8;
                }
                if (class126.field1570[4] && class167.field2120[4] + 128 > var10) {
                    var10 = class167.field2120[4] + 128;
                }
                int var11 = (int) class521.field7250 + class491.field6868 & 0x3FFF;
                method3426((var10 >> 3) * 3 + 600 << 2, -973436530, var10, class21.field301, var11, class223.field2859, var9, class341.method2147(class187.field2407, class147.field1899.field6362, 0, class147.field1899.field6368) - 200);
            } else if (class621.field8952 == 4) {
                int var12 = (int) class568.field7951;
                if ((class610.field8773 >> 8) > var12) {
                    var12 = class610.field8773 >> 8;
                }
                if (class126.field1570[4] && var12 < (class167.field2120[4] + 128)) {
                    var12 = class167.field2120[4] + 128;
                }
                int var13 = (int) class521.field7250 & 0x3FFF;
                method3426((var12 >> 3) * 3 + 600 << 2, -973436530, var12, class21.field301, var13, class223.field2859, var9, class341.method2147(class187.field2407, class626.field9074, 0, class20.field292) - 200);
            } else if (class621.field8952 == 5) {
                class523.method2921(-1, var9);
            }
            int var14 = class196.field2555;
            int var15 = class186.field2364;
            int var16 = class434.field5901;
            int var17 = class627.field9131;
            int var18 = class60.field838;
            for (int var19 = 0; var19 < 5; var19++) {
                if (class126.field1570[var19]) {
                    int var22 = (int) ((double) (-class463.field6589[var19]) + Math.random() * (double) (class463.field6589[var19] * 2 + 1) + Math.sin((double) class81.field1097[var19] / 100.0D * (double) class641.field9305[var19]) * (double) class167.field2120[var19]);
                    if (var19 == 4) {
                        class627.field9131 += var22;
                        if (class627.field9131 < 1024) {
                            class627.field9131 = 1024;
                        } else if (class627.field9131 > 3072) {
                            class627.field9131 = 3072;
                        }
                    }
                    if (var19 == 3) {
                        class60.field838 = class60.field838 + var22 & 0x3FFF;
                    }
                    if (var19 == 0) {
                        class196.field2555 += var22 << 2;
                    }
                    if (var19 == 2) {
                        class434.field5901 += var22 << 2;
                    }
                    if (var19 == 1) {
                        class186.field2364 += var22 << 2;
                    }
                }
            }
            if (class196.field2555 < 0) {
                class196.field2555 = 0;
            }
            if (class196.field2555 > (class260.field3211 << 9) - 1) {
                class196.field2555 = (class260.field3211 << 9) - 1;
            }
            if (class434.field5901 < 0) {
                class434.field5901 = 0;
            }
            if (((class541.field7566 << 9) - 1) < class434.field5901) {
                class434.field5901 = (class541.field7566 << 9) - 1;
            }
            class111.method598(85);
            class235.method1484(arg2);
            class301.field3918.method977(var8, var6, var7 + var8, var6 + var9);
            class301.field3918.method996();
            int var20 = class536.field7480;
            if (class466.field6615 == null) {
                class301.field3918.method949(var20);
            } else {
                class466.field6615.method1987(var9, class627.field9131, -1, class301.field3918, class60.field838, var6, var7, var20, class148.field1903 << 3, var8);
            }
            class147.method802((byte) 49);
            class643.field9335.method360(class196.field2555, class186.field2364, class434.field5901, -class627.field9131 & 0x3FFF, -class60.field838 & 0x3FFF, -class392.field5439 & 0x3FFF);
            class301.field3918.method956(class643.field9335);
            class301.field3918.method961(var8 + (var7 / 2), var6 - -(var9 / 2), class350.field4819 << 1, class350.field4819 << 1);
            class639.method3680((byte) 23, class350.field4819 << 1, class350.field4819 << 1, var9 / 2 + var6, var7 / 2 + var8);
            class631.method3648(-class392.field5439 & 0x3FFF, -class60.field838 & 0x3FFF, -class627.field9131 & 0x3FFF, class186.field2364, class434.field5901, (byte) 95, class196.field2555);
            byte var21 = class501.field6954.method3538(1, class428.field5845) == 2 ? (byte) class227.field2903 : 1;
            class232.method1466(class301.field3918, class7.field61, class549.field7635, class643.field9335, class196.field2555, class186.field2364, class434.field5901, class625.field9046, class585.field8466, class88.field1169, client.field8972, class207.field2692, class324.field4451, class147.field1899.field6358 + 1, var21, class147.field1899.field6362 >> 9, class147.field1899.field6368 >> 9, !class501.field6954.field7836);
            class147.method802((byte) 49);
            if (class630.field9188 == 9) {
                class476.method2701(-18, var7, 256, var9, var8, var6, 256);
                class491.method2759(256, var9, 256, var7, (byte) 124, var8, var6);
                class260.method1554(256, var9, !arg2, var6, var8, 256, var7);
                class373.method2279(var6, false, var9, var7, var8);
            }
            class625.method3604();
            class434.field5901 = var16;
            class186.field2364 = var15;
            class627.field9131 = var17;
            class196.field2555 = var14;
            class60.field838 = var18;
            if (class223.field2858 && class488.field6797.method750((byte) -115) == 0) {
                class223.field2858 = false;
            }
            if (class223.field2858) {
                class301.field3918.method974(-16777216, 1, var9, var8, var7, var6);
                class410.method2447(class512.field7135.method2157(class245.field3103, 4074), false, -25375, class522.field7281);
            }
        } else {
            class301.field3918.method974(-16777216, 1, arg0, arg1, arg5, arg3);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method3426(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field8571++;
        int var8 = arg6 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = class181.field2321 + ((class630.field9187 - class181.field2321) * var8 / 100);
        if (arg1 != -973436530) {
            return;
        }
        int var10 = arg0 * var9 >> 8;
        int var11 = 16384 - arg2 & 0x3FFF;
        int var12 = 16384 - arg4 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class310.field3966[var11] * -var10 >> 14;
            var15 = class310.field3965[var11] * var10 >> 14;
        }
        if (var12 != 0) {
            var13 = class310.field3966[var12] * var15 >> 14;
            var15 = class310.field3965[var12] * var15 >> 14;
        }
        class186.field2364 = arg7 - var14;
        class196.field2555 = arg5 - var13;
        class392.field5439 = 0;
        class627.field9131 = arg2;
        class60.field838 = arg4;
        class434.field5901 = arg3 - var15;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V")
    public static final void method3427(byte arg0) {
        class453.field6425.method989(class343.field4764, class251.field3142, class483.field6759);
        int var1 = 98 % ((arg0 - 34) / 51);
        field8572++;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(B)V")
    public static void method3428(byte arg0) {
        if (arg0 != -50) {
            field8570 = -91;
        }
        field8576 = null;
    }
}
