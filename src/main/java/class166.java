import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public class class166 {

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "Lfca;")
    public static class188 field2077 = null;

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!qaa", name = "c", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IIIIZB)V", line = 3)
    public static final void method1107(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5) {
        field2078++;
        if (class145.field1841 == null) {
            class9.field103.method3811(arg3, arg2, arg0, arg1, -16777216, 29);
        } else if (class596.field8164.field3929 >= 0 && class588.field8082 * 512 > class596.field8164.field3929 && class596.field8164.field3917 >= 0 && class596.field8164.field3917 < class12.field113 * 512) {
            int var6 = -55 % ((arg5 + 61) / 44);
            class426.field5928++;
            if (class596.field8164 != null && (class596.field8164.field3929 + 256 - class596.field8164.method241(-25747) * 256 >> 9) == class436.field6025 && class596.field8164.field3917 - (class596.field8164.method241(-25747) * 256 - 256) >> 9 == class251.field3388) {
                class251.field3388 = -1;
                class436.field6025 = -1;
                class650.method3609(30787);
            }
            class250.method1555((byte) 96);
            if (!arg4) {
                class442.method2534(-126);
            }
            class44.method263(30540);
            class169.method1128(true, arg1, arg3, arg2, (byte) -112, arg0);
            int var7 = class407.field5737;
            int var8 = class360.field5195;
            int var9 = class275.field3726;
            int var10 = class313.field4507;
            if (class42.field546 == 1) {
                int var11 = (int) class283.field3826;
                if (var11 < class90.field1109 >> 8) {
                    var11 = class90.field1109 >> 8;
                }
                if (class676.field9596[4] && class394.field5655[4] + 128 > var11) {
                    var11 = class394.field5655[4] + 128;
                }
                int var12 = (int) class620.field8432 + class265.field3636 & 0x3FFF;
                class468.method2643(var8, class243.field3277, class394.method2340(class596.field8164.field3929, -1, class432.field5993, class596.field8164.field3917) - 200, (var11 >> 3) * 3 + 600 << 2, class397.field5667, (byte) -6, var12, var11);
            } else if (class42.field546 == 4) {
                int var13 = (int) class283.field3826;
                if (class90.field1109 >> 8 > var13) {
                    var13 = class90.field1109 >> 8;
                }
                if (class676.field9596[4] && var13 < (class394.field5655[4] + 128)) {
                    var13 = class394.field5655[4] + 128;
                }
                int var14 = (int) class620.field8432 & 0x3FFF;
                class468.method2643(var8, class243.field3277, class394.method2340(class294.field3939, -1, class432.field5993, class86.field1068) - 200, (var13 >> 3) * 3 + 600 << 2, class397.field5667, (byte) -6, var14, var13);
            } else if (class42.field546 == 5) {
                class238.method1465(var8, false);
            }
            int var15 = class132.field1679;
            int var16 = class628.field8545;
            int var17 = class471.field6379;
            int var18 = class336.field4947;
            int var19 = class261.field3603;
            for (int var20 = 0; var20 < 5; var20++) {
                if (class676.field9596[var20]) {
                    int var23 = (int) ((double) (-class18.field158[var20]) + (double) (class18.field158[var20] * 2 + 1) * Math.random() + Math.sin((double) class505.field6826[var20] / 100.0D * (double) class503.field6815[var20]) * (double) class394.field5655[var20]);
                    if (var20 == 0) {
                        class132.field1679 += var23 << 2;
                    }
                    if (var20 == 1) {
                        class628.field8545 += var23 << 2;
                    }
                    if (var20 == 2) {
                        class471.field6379 += var23 << 2;
                    }
                    if (var20 == 3) {
                        class261.field3603 = class261.field3603 + var23 & 0x3FFF;
                    }
                    if (var20 == 4) {
                        class336.field4947 += var23;
                        if (class336.field4947 < 1024) {
                            class336.field4947 = 1024;
                        } else if (class336.field4947 > 3072) {
                            class336.field4947 = 3072;
                        }
                    }
                }
            }
            if (class132.field1679 < 0) {
                class132.field1679 = 0;
            }
            if (class132.field1679 > ((class149.field1872 << 9) - 1)) {
                class132.field1679 = (class149.field1872 << 9) - 1;
            }
            if (class471.field6379 < 0) {
                class471.field6379 = 0;
            }
            if (class471.field6379 > ((class334.field4887 << 9) - 1)) {
                class471.field6379 = (class334.field4887 << 9) - 1;
            }
            class570.method3214(3);
            class194.method1238((byte) 79);
            class9.field103.method1908(var7, var9, var7 + var10, var9 - -var8);
            class9.field103.method821();
            int var21 = class539.field7389;
            if (class397.field5668 == null) {
                class9.field103.method806(var21);
            } else {
                class397.field5668.method999(var21, var10, var7, class9.field103, var8, 0, class261.field3603, class487.field6572 << 3, class336.field4947, var9);
            }
            class155.method1031(-128);
            class488.field6582.method602(class132.field1679, class628.field8545, class471.field6379, -class336.field4947 & 0x3FFF, -class261.field3603 & 0x3FFF, -class253.field3493 & 0x3FFF);
            class9.field103.method1887(class488.field6582);
            class9.field103.method1875(var10 / 2 + var7, var8 / 2 + var9, class128.field1630 << 1, class128.field1630 << 1);
            class399.method2359(var8 / 2 + var9, -103, var10 / 2 + var7, class128.field1630 << 1, class128.field1630 << 1);
            class222.method1362(-class261.field3603 & 0x3FFF, (byte) -126, class471.field6379, class628.field8545, class132.field1679, -class253.field3493 & 0x3FFF, -class336.field4947 & 0x3FFF);
            byte var22 = class72.field935.method1855(28869, class161.field2038) == 2 ? (byte) class426.field5928 : 1;
            class119.method727(class9.field103, class430.field5984, class637.field8701, class488.field6582, class132.field1679, class628.field8545, class471.field6379, class361.field5210, class197.field2603, class175.field2204, class292.field3909, class225.field2933, class293.field3916, class596.field8164.field3925 + 1, var22, class596.field8164.field3929 >> 9, class596.field8164.field3917 >> 9, !class72.field935.field6531);
            class155.method1031(-114);
            if (class476.field6436 == 10) {
                class256.method1604(256, 256, var10, 23, var7, var8, var9);
                class676.method3736(var8, true, var10, var9, var7, 256, 256);
                class564.method3181(var9, var8, var7, 0, 256, var10, 256);
                class461.method2607(var9, var8, var10, (byte) -117, var7);
            }
            client.method1399();
            class471.field6379 = var17;
            class132.field1679 = var15;
            class261.field3603 = var19;
            class336.field4947 = var18;
            class628.field8545 = var16;
            if (class77.field968 && class311.field4180.method2842(6) == 0) {
                class77.field968 = false;
            }
            if (class77.field968) {
                class9.field103.method3811(var9, var10, var8, var7, -16777216, 69);
                class82.method463(class243.field3176.method1491(class350.field5121, (byte) 127), class395.field5658, 53, false);
            }
        } else {
            class9.field103.method3811(arg3, arg2, arg0, arg1, -16777216, 101);
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(Z)V", line = 208)
    public static void method1108(boolean arg0) {
        field2077 = null;
        if (!arg0) {
            method1108(false);
        }
    }
}
