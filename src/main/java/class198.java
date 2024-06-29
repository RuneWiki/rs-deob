import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public abstract class class198 {

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "Lsc;")
    public static class181 field3438 = class149.method967(255, "<col=00ff00>");

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "Ljd;")
    public static class265 field3434 = new class265(64);

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "Lsc;")
    public static class181 field3442 = class149.method967(255, "(U");

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "Lsc;")
    public static class181 field3441 = class149.method967(255, ")4a=");

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "[I")
    public static int[] field3445 = new int[128];

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "Ldg;")
    public static class90 field3439;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "[I")
    public static int[] field3444;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
    public static final void method1341(byte arg0) {
        class76.field1223.method545(true);
        if (arg0 != -77) {
            method1345(77);
        }
        int var1 = class76.field1223.method548(1, (byte) 67);
        field3440++;
        if (var1 == 0) {
            return;
        }
        int var2 = class76.field1223.method548(2, (byte) 67);
        if (var2 == 0) {
            class30.field498[class137.field2236++] = 2047;
        } else if (var2 == 1) {
            int var3 = class76.field1223.method548(3, (byte) 67);
            class258.field4507.method1047(-1, false, var3);
            int var4 = class76.field1223.method548(1, (byte) 67);
            if (var4 == 1) {
                class30.field498[class137.field2236++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class76.field1223.method548(3, (byte) 67);
            class258.field4507.method1047(arg0 + 76, true, var5);
            int var6 = class76.field1223.method548(3, (byte) 67);
            class258.field4507.method1047(-1, true, var6);
            int var7 = class76.field1223.method548(1, (byte) 67);
            if (var7 == 1) {
                class30.field498[class137.field2236++] = 2047;
            }
        } else if (var2 == 3) {
            int var8 = class76.field1223.method548(7, (byte) 67);
            int var9 = class76.field1223.method548(1, (byte) 67);
            if (var9 == 1) {
                class30.field498[class137.field2236++] = 2047;
            }
            int var10 = class76.field1223.method548(7, (byte) 67);
            int var11 = class76.field1223.method548(1, (byte) 67);
            class38.field581 = class76.field1223.method548(2, (byte) 67);
            class258.field4507.method1051(var10, var11 == 1, var8, -6882);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lvf;Z)Lea;")
    public static final class122 method1342(class230 arg0, boolean arg1) {
        field3433++;
        if (arg1) {
            method1345(-62);
        }
        return new class122(arg0.method1515(8), arg0.method1515(-123), arg0.method1515(-126), arg0.method1515(-20), arg0.method1515(105), arg0.method1515(-101), arg0.method1515(-124), arg0.method1515(-120), arg0.method1508(true), arg0.method1516((byte) 82));
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1343(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        for (int var9 = 0; var9 < class242.field4214.field3717; var9++) {
            int var10 = class242.field4214.field3734[var9] - class265.field4625;
            int var11 = class222.field3840 + class164.field2786 - class242.field4214.field3716[var9] - 1;
            int var12 = (var11 - arg2) * (arg5 - arg3) / (arg8 - arg2) + arg3;
            int var13 = class242.field4214.method1443(var9, (byte) 57);
            int var14 = 16777215;
            int var15 = (var10 - arg6) * (arg4 - arg7) / (arg0 - arg6) + arg7;
            class117 var16 = null;
            if (var13 == 0) {
                if ((double) class22.field388 == 3.0D) {
                    var16 = class224.field3866;
                }
                if ((double) class22.field388 == 4.0D) {
                    var16 = class219.field3770;
                }
                if ((double) class22.field388 == 6.0D) {
                    var16 = class86.field1366;
                }
                if ((double) class22.field388 == 8.0D) {
                    var16 = class196.field3414;
                }
            }
            if (var13 == 1) {
                if ((double) class22.field388 == 3.0D) {
                    var16 = class86.field1366;
                }
                if ((double) class22.field388 == 4.0D) {
                    var16 = class196.field3414;
                }
                if ((double) class22.field388 == 6.0D) {
                    var16 = class100.field1674;
                }
                if ((double) class22.field388 == 8.0D) {
                    var16 = class186.field3297;
                }
            }
            if (var13 == 2) {
                var14 = 16755200;
                if ((double) class22.field388 == 3.0D) {
                    var16 = class100.field1674;
                }
                if ((double) class22.field388 == 4.0D) {
                    var16 = class186.field3297;
                }
                if ((double) class22.field388 == 6.0D) {
                    var16 = class140.field2262;
                }
                if ((double) class22.field388 == 8.0D) {
                    var16 = class73.field1167;
                }
            }
            if (class242.field4214.field3715[var9] != -1) {
                var14 = class242.field4214.field3715[var9];
            }
            if (var16 != null) {
                class181[] var17 = new class181[class242.field4214.field3732[var9].method1205(60, 97) + 1];
                class164.field2797.method1675(class242.field4214.field3732[var9], (int[]) null, var17);
                int var18 = var17.length;
                int var19 = var12 - var16.method778() * (var18 - 1) / 2;
                int var20 = var19 + var16.method776() / 2;
                for (int var21 = 0; var21 < var18; var21++) {
                    class181 var22 = (var18 - 1) == var21 ? var17[var21] : var17[var21].method1235(0, 61, var17[var21].method1226(-458531486) - 4);
                    var16.method781(var22, var15, var20, var14, true);
                    var20 += var16.method778();
                }
            }
        }
        if (arg1 != 10000) {
            field3442 = null;
        }
        field3437++;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(B)Z")
    public static final boolean method1344(byte arg0) {
        if (arg0 > -27) {
            method1344((byte) -39);
        }
        long var1 = class213.method1414(-9292);
        field3435++;
        int var3 = (int) (var1 - class93.field1475);
        class93.field1475 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class57.field865 += var3;
        if (class151.field2525 == 0 && class214.field3683 == 0 && class19.field348 == 0 && class74.field1180 == 0) {
            return true;
        } else if (class199.field3446 == null) {
            return false;
        } else {
            try {
                if (class57.field865 > 30000) {
                    throw new IOException();
                }
                while (class214.field3683 < 20 && class74.field1180 > 0) {
                    class232 var4 = (class232) class242.field4206.method1418(0);
                    class230 var5 = new class230(4);
                    var5.method1538(1, (byte) 123);
                    var5.method1547(true, (int) var4.field606);
                    class199.field3446.method317(4, -123, var5.field3977, 0);
                    class132.field2188.method1422(var4.field606, var4, -1);
                    class74.field1180--;
                    class214.field3683++;
                }
                while (class151.field2525 < 20 && class19.field348 > 0) {
                    class232 var6 = (class232) class25.field442.method626((byte) -117);
                    class230 var7 = new class230(4);
                    var7.method1538(0, (byte) 116);
                    var7.method1547(true, (int) var6.field606);
                    class199.field3446.method317(4, -121, var7.field3977, 0);
                    var6.method1128((byte) 20);
                    class172.field2877.method1422(var6.field606, var6, -1);
                    class151.field2525++;
                    class19.field348--;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = class199.field3446.method315((byte) -120);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    byte var10 = 0;
                    class57.field865 = 0;
                    if (class38.field593 == null) {
                        var10 = 8;
                    } else if (class196.field3429 == 0) {
                        var10 = 1;
                    }
                    if (var10 <= 0) {
                        int var11 = class143.field2318.field3977.length - class38.field593.field4060;
                        int var12 = 512 - class196.field3429;
                        if (var11 - class143.field2318.field3933 < var12) {
                            var12 = var11 - class143.field2318.field3933;
                        }
                        if (var9 < var12) {
                            var12 = var9;
                        }
                        class199.field3446.method316(class143.field2318.field3933, (byte) 65, class143.field2318.field3977, var12);
                        if (class38.field591 != 0) {
                            for (int var13 = 0; var13 < var12; var13++) {
                                class143.field2318.field3977[class143.field2318.field3933 + var13] = (byte) class102.method690(class143.field2318.field3977[class143.field2318.field3933 + var13], class38.field591);
                            }
                        }
                        class143.field2318.field3933 += var12;
                        class196.field3429 += var12;
                        if (class143.field2318.field3933 == var11) {
                            if (class38.field593.field606 == 16711935L) {
                                class55.field852 = class143.field2318;
                                for (int var15 = 0; var15 < 256; var15++) {
                                    class90 var16 = class179.field3134[var15];
                                    if (var16 != null) {
                                        class55.field852.field3933 = var15 * 8 + 5;
                                        int var17 = class55.field852.method1529(-32494);
                                        int var18 = class55.field852.method1529(-32494);
                                        var16.method593(var17, (byte) 53, var18);
                                    }
                                }
                            } else {
                                class87.field1391.reset();
                                class87.field1391.update(class143.field2318.field3977, 0, var11);
                                int var14 = (int) class87.field1391.getValue();
                                if (class38.field593.field4061 != var14) {
                                    try {
                                        class199.field3446.method313(-96);
                                    } catch (Exception var30) {
                                    }
                                    class182.field3205++;
                                    class38.field591 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    class199.field3446 = null;
                                    return false;
                                }
                                class75.field1206 = 0;
                                class182.field3205 = 0;
                                class38.field593.field4066.method596((int) (class38.field593.field606 & 0xFFFFL), class143.field2318.field3977, class61.field932, 74, (class38.field593.field606 & 0xFF0000L) == 16711680L);
                            }
                            class38.field593.method290((byte) -48);
                            class143.field2318 = null;
                            class38.field593 = null;
                            class196.field3429 = 0;
                            if (class61.field932) {
                                class214.field3683--;
                            } else {
                                class151.field2525--;
                            }
                        } else {
                            if (class196.field3429 != 512) {
                                break;
                            }
                            class196.field3429 = 0;
                        }
                    } else {
                        int var19 = var10 - class254.field4447.field3933;
                        if (var19 > var9) {
                            var19 = var9;
                        }
                        class199.field3446.method316(class254.field4447.field3933, (byte) 125, class254.field4447.field3977, var19);
                        if (class38.field591 != 0) {
                            for (int var20 = 0; var20 < var19; var20++) {
                                class254.field4447.field3977[class254.field4447.field3933 + var20] = (byte) class102.method690(class254.field4447.field3977[class254.field4447.field3933 + var20], class38.field591);
                            }
                        }
                        class254.field4447.field3933 += var19;
                        if (var10 > class254.field4447.field3933) {
                            break;
                        }
                        if (class38.field593 == null) {
                            class254.field4447.field3933 = 0;
                            int var21 = class254.field4447.method1516((byte) 82);
                            int var22 = class254.field4447.method1535(2);
                            int var23 = class254.field4447.method1516((byte) 82);
                            long var24 = (long) ((var21 << 16) + var22);
                            int var26 = class254.field4447.method1529(-32494);
                            class232 var27 = (class232) class132.field2188.method1424(true, var24);
                            class61.field932 = true;
                            if (var27 == null) {
                                var27 = (class232) class172.field2877.method1424(true, var24);
                                class61.field932 = false;
                            }
                            if (var27 == null) {
                                throw new IOException();
                            }
                            class38.field593 = var27;
                            int var28 = var23 == 0 ? 5 : 9;
                            class143.field2318 = new class230(var26 - (-var28 - class38.field593.field4060));
                            class143.field2318.method1538(var23, (byte) -124);
                            class143.field2318.method1544(var26, -3165);
                            class254.field4447.field3933 = 0;
                            class196.field3429 = 8;
                        } else if (class196.field3429 == 0) {
                            if (class254.field4447.field3977[0] == -1) {
                                class254.field4447.field3933 = 0;
                                class196.field3429 = 1;
                            } else {
                                class38.field593 = null;
                            }
                        }
                    }
                }
                return true;
            } catch (IOException var31) {
                try {
                    class199.field3446.method313(123);
                } catch (Exception var29) {
                }
                class199.field3446 = null;
                class75.field1206++;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
    public static void method1345(int arg0) {
        field3441 = null;
        field3444 = null;
        field3439 = null;
        field3438 = null;
        field3445 = null;
        if (arg0 != 0) {
            field3434 = null;
        }
        field3442 = null;
        field3434 = null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZIBI)Lsc;")
    public static final class181 method1346(boolean arg0, int arg1, byte arg2, int arg3) {
        field3436++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        int var4 = 1;
        int var5 = arg3 / arg1;
        while (var5 != 0) {
            var5 /= arg1;
            var4++;
        }
        int var6 = var4;
        if (arg2 != -2) {
            field3438 = null;
        }
        if (arg3 < 0 || arg0) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg3 < 0) {
            var7[0] = 45;
        } else if (arg0) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var10 = arg3 % arg1;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
            arg3 /= arg1;
        }
        class181 var9 = new class181();
        var9.field3155 = var6;
        var9.field3166 = var7;
        return var9;
    }
}
