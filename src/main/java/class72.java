import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class72 {

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "[B")
    private byte[] field1463;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "[I")
    private int[] field1464;

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "[I")
    private int[] field1469;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "[I")
    public static int[] field1460 = new int[2000];

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "Ljd;")
    public static class86 field1459 = class122.method868("leuchten3:", true);

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "Ljd;")
    public static class86 field1467 = class122.method868("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100", true);

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V")
    public static void method530(byte arg0) {
        if (arg0 == 82) {
            field1459 = null;
            field1467 = null;
            field1460 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)V")
    public static final void method531(int arg0, int arg1) {
        field1461++;
        class161 var2 = class204.method1456(true, arg1, arg0);
        var2.method1173(true);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZIII[B[B)I")
    public final int method532(boolean arg0, int arg1, int arg2, int arg3, byte[] arg4, byte[] arg5) {
        field1470++;
        if (arg3 == 0) {
            return 0;
        }
        int var7 = arg2 + arg3;
        if (arg0) {
            this.field1469 = null;
        }
        int var8 = 0;
        int var9 = arg1;
        while (true) {
            byte var10 = arg5[var9];
            if (var10 < 0) {
                var8 = this.field1469[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field1469[var8]) < 0) {
                arg4[arg2++] = (byte) (~var11);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field1469[var8];
            }
            int var12;
            if ((var12 = this.field1469[var8]) < 0) {
                arg4[arg2++] = (byte) (~var12);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field1469[var8];
            }
            int var13;
            if ((var13 = this.field1469[var8]) < 0) {
                arg4[arg2++] = (byte) (~var13);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field1469[var8];
            }
            int var14;
            if ((var14 = this.field1469[var8]) < 0) {
                arg4[arg2++] = (byte) (~var14);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field1469[var8];
            }
            int var15;
            if ((var15 = this.field1469[var8]) < 0) {
                arg4[arg2++] = (byte) (~var15);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field1469[var8];
            }
            int var16;
            if ((var16 = this.field1469[var8]) < 0) {
                arg4[arg2++] = (byte) (~var16);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field1469[var8];
            }
            int var17;
            if ((var17 = this.field1469[var8]) < 0) {
                arg4[arg2++] = (byte) (~var17);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field1469[var8];
            }
            int var18;
            if ((var18 = this.field1469[var8]) < 0) {
                arg4[arg2++] = (byte) (~var18);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg1;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
    public static final void method533(int arg0) {
        field1465++;
        if (class143.method1017((byte) 118) != 2) {
            return;
        }
        byte var1 = (byte) (class119.field2338 - 4 & 0xFF);
        int var2 = class119.field2338 % 104;
        if (arg0 > 0) {
            field1467 = null;
        }
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < 104; var16++) {
                class12.field393[var3][var2][var16] = var1;
            }
        }
        if (class180.field3244 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class66.field1315[var4] = -1000000;
            class42.field951[var4] = 1000000;
            class234.field4239[var4] = 0;
            class273.field4799[var4] = 1000000;
            class271.field4757[var4] = 0;
        }
        if (class152.field2874 != 1) {
            int var5 = class30.method198(31482, class70.field1430, class4.field61, class180.field3244);
            if (var5 - class88.field1748 < 800 && (class86.field1693[class180.field3244][class70.field1430 >> 7][class4.field61 >> 7] & 0x4) != 0) {
                class30.method195(class4.field61 >> 7, class248.field4406, false, class70.field1430 >> 7, 1, 1);
                return;
            }
            return;
        }
        if ((class86.field1693[class180.field3244][class124.field2412.field676 >> 7][class124.field2412.field685 >> 7] & 0x4) != 0) {
            class30.method195(class124.field2412.field685 >> 7, class248.field4406, false, class124.field2412.field676 >> 7, 0, 1);
        }
        if (class255.field4541 >= 310) {
            return;
        }
        int var6 = class70.field1430 >> 7;
        int var7 = class4.field61 >> 7;
        int var8 = class124.field2412.field676 >> 7;
        int var9;
        if (var6 >= var8) {
            var9 = var6 - var8;
        } else {
            var9 = var8 - var6;
        }
        int var10 = class124.field2412.field685 >> 7;
        int var11;
        if (var7 >= var10) {
            var11 = var7 - var10;
        } else {
            var11 = var10 - var7;
        }
        if (var9 > var11) {
            int var12 = 32768;
            int var13 = var11 * 65536 / var9;
            while (var6 != var8) {
                if (var8 > var6) {
                    var6++;
                } else if (var8 < var6) {
                    var6--;
                }
                if ((class86.field1693[class180.field3244][var6][var7] & 0x4) != 0) {
                    class30.method195(var7, class248.field4406, false, var6, 1, 1);
                    return;
                }
                var12 += var13;
                if (var12 >= 65536) {
                    if (var7 < var10) {
                        var7++;
                    } else if (var7 > var10) {
                        var7--;
                    }
                    var12 -= 65536;
                    if ((class86.field1693[class180.field3244][var6][var7] & 0x4) != 0) {
                        class30.method195(var7, class248.field4406, false, var6, 1, 1);
                        return;
                    }
                }
            }
            return;
        }
        int var14 = var9 * 65536 / var11;
        int var15 = 32768;
        while (var7 != var10) {
            if (var7 < var10) {
                var7++;
            } else if (var10 < var7) {
                var7--;
            }
            if ((class86.field1693[class180.field3244][var6][var7] & 0x4) != 0) {
                class30.method195(var7, class248.field4406, false, var6, 1, 1);
                return;
            }
            var15 += var14;
            if (var15 >= 65536) {
                var15 -= 65536;
                if (var6 < var8) {
                    var6++;
                } else if (var8 < var6) {
                    var6--;
                }
                if ((class86.field1693[class180.field3244][var6][var7] & 0x4) != 0) {
                    class30.method195(var7, class248.field4406, false, var6, 1, 1);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(B)V")
    public static final void method534(byte arg0) {
        field1468++;
        if (class46.field1024 == null) {
            return;
        }
        if (class265.field4684 < 10) {
            if (!class188.field3338.method1072(class46.field1024.field3795, 68) || !class188.field3338.method1072(class109.method783(2, new class86[] { class46.field1024.field3795, class27.field623 }), 114)) {
                class265.field4684 = class56.field1139.method1086(class46.field1024.field3795, -48) / 10;
                return;
            }
            class122.method858(-103);
            class265.field4684 = 10;
        }
        if (class265.field4684 == 10) {
            class238.field4289 = class46.field1024.field3799 >> 6 << 6;
            class202.field3658 = 8.0F;
            class88.field1769 = 8.0F;
            class38.field894 = (class46.field1024.field3793 >> 6 << 6) + 64 - class238.field4289;
            int var1 = class38.field894 - (1 - (class238.field4289 - (class124.field2412.field685 >> 7) - class79.field1554));
            int var2 = var1 + ((int) (Math.random() * 10.0D) - 5);
            class90.field1847 = class46.field1024.field3794 >> 6 << 6;
            int var3 = class252.field4481 + (class124.field2412.field676 >> 7) - class90.field1847;
            int var4 = var3 + (int) (Math.random() * 10.0D) - 5;
            class263.field4668 = (class46.field1024.field3809 >> 6 << 6) + (64 - class90.field1847);
            if (var4 >= 0 && class263.field4668 > var4 && var2 >= 0 && var2 < class38.field894) {
                class274.field4814 = var4;
                class156.field2952 = var2;
            } else {
                class274.field4814 = class46.field1024.field3807 * 64 - class90.field1847;
                class156.field2952 = class38.field894 - (class46.field1024.field3802 * 64) - (1 - class238.field4289);
            }
            class188.method1293(-74);
            class60.field1205 = new int[client.field2853 + 1];
            int var5 = class263.field4668 >> 6;
            int var6 = class38.field894 >> 6;
            class87.field1734 = new byte[var5][var6][];
            int var7 = class5.field69 >> 2 << 10;
            class69.field1398 = new short[var5][var6][];
            class20.field518 = new byte[var5][var6][];
            class159.field2977 = new byte[var5][var6][];
            class177.field3211 = new int[var5][var6][];
            int var8 = class151.field2824 >> 1;
            class20.field528 = new int[var5][var6][];
            class116.field2207 = new byte[var5][var6][];
            class241.field4332 = new byte[var5][var6][];
            class125.method890(var8, var7, true);
            class265.field4684 = 20;
        } else if (class265.field4684 == 20) {
            class14.method102((byte) -56, new class200(class188.field3338.method1095(class46.field1024.field3795, class111.field2132, -25761)));
            class265.field4684 = 30;
            class96.method700(true, -26);
            class142.method1012((byte) -7);
        } else if (class265.field4684 == 30) {
            class248.method1678(new class200(class188.field3338.method1095(class46.field1024.field3795, class155.field2942, -25761)), (byte) 26);
            class265.field4684 = 40;
            class142.method1012((byte) -7);
        } else if (class265.field4684 == 40) {
            class88.method645(-23724, new class200(class188.field3338.method1095(class46.field1024.field3795, class207.field3754, -25761)));
            class265.field4684 = 50;
            class142.method1012((byte) -7);
        } else if (class265.field4684 == 50) {
            class274.method1866(new class200(class188.field3338.method1095(class46.field1024.field3795, class186.field3298, -25761)), -1);
            class265.field4684 = 60;
            class96.method700(true, -26);
            class142.method1012((byte) -7);
        } else if (class265.field4684 == 60) {
            class106.field2030 = class100.method724(class188.field3338, true, class109.method783(2, new class86[] { class46.field1024.field3795, class27.field623 }));
            class265.field4684 = 70;
            class142.method1012((byte) -7);
        } else if (class265.field4684 == 70) {
            class219.field3946 = new class212(11, true, class50.field1057);
            class265.field4684 = 73;
            class96.method700(true, -26);
            class142.method1012((byte) -7);
        } else if (class265.field4684 == 73) {
            class56.field1142 = new class212(12, true, class50.field1057);
            class265.field4684 = 76;
            class96.method700(true, -26);
            class142.method1012((byte) -7);
        } else if (class265.field4684 == 76) {
            class105.field2018 = new class212(14, true, class50.field1057);
            class265.field4684 = 79;
            class96.method700(true, -26);
            class142.method1012((byte) -7);
        } else if (class265.field4684 == 79) {
            class162.field3035 = new class212(17, true, class50.field1057);
            class265.field4684 = 82;
            class96.method700(true, -26);
            class142.method1012((byte) -7);
        } else if (class265.field4684 == 82) {
            class271.field4755 = new class212(19, true, class50.field1057);
            class265.field4684 = 85;
            class96.method700(true, -26);
            class142.method1012((byte) -7);
        } else if (class265.field4684 == 85) {
            class246.field4376 = new class212(22, true, class50.field1057);
            class265.field4684 = 88;
            class96.method700(true, -26);
            class142.method1012((byte) -7);
        } else if (class265.field4684 == 88) {
            class66.field1302 = new class212(26, true, class50.field1057);
            class265.field4684 = 91;
            class96.method700(true, -26);
            class142.method1012((byte) -7);
        } else {
            class221.field3982 = new class212(30, true, class50.field1057);
            if (arg0 < 120) {
                field1460 = null;
            }
            class265.field4684 = 100;
            class96.method700(true, -26);
            class142.method1012((byte) -7);
            class152.field2875 = -1;
            class51.field1074 = -1;
            System.gc();
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I[BI[BII)I")
    public final int method535(int arg0, byte[] arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        int var7 = arg0 + arg5;
        field1466++;
        int var8 = 0;
        int var9 = arg2 << 3;
        while (arg0 < var7) {
            int var11 = arg1[arg0] & 0xFF;
            int var12 = this.field1464[var11];
            byte var13 = this.field1463[var11];
            if (var13 == 0) {
                throw new RuntimeException("No codeword for data value " + var11);
            }
            int var14 = var9 >> 3;
            int var15 = var9 & 0x7;
            var9 += var13;
            int var16 = var8 & -var15 >> 31;
            int var17 = (var13 + var15 - 1 >> 3) + var14;
            int var18 = var15 + 24;
            arg3[var14] = (byte) (var8 = class49.method377(var16, var12 >>> var18));
            if (var14 < var17) {
                var15 = var18 - 8;
                var14++;
                arg3[var14] = (byte) (var8 = var12 >>> var15);
                if (var17 > var14) {
                    var15 -= 8;
                    var14++;
                    arg3[var14] = (byte) (var8 = var12 >>> var15);
                    if (var14 < var17) {
                        var14++;
                        var15 -= 8;
                        arg3[var14] = (byte) (var8 = var12 >>> var15);
                        if (var17 > var14) {
                            var14++;
                            var15 -= 8;
                            arg3[var14] = (byte) (var8 = var12 << -var15);
                        }
                    }
                }
            }
            arg0++;
        }
        int var10 = -108 / ((arg4 - 48) / 46);
        return (var9 + 7 >> 3) - arg2;
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "([B)V")
    public class72(byte[] arg0) {
        int var2 = arg0.length;
        this.field1463 = arg0;
        int var3 = 0;
        this.field1464 = new int[var2];
        int[] var4 = new int[33];
        this.field1469 = new int[8];
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var4[var6];
                this.field1464[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var7 | var8;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var4[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var4[var10] = var4[var10 - 1];
                            break;
                        }
                        var4[var10] = class49.method377(var11, var12);
                    }
                } else {
                    var9 = var4[var6 - 1];
                }
                var4[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var4[var13] == var8) {
                        var4[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field1469[var14] == 0) {
                            this.field1469[var14] = var3;
                        }
                        var14 = this.field1469[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field1469.length <= var14) {
                        int[] var18 = new int[this.field1469.length * 2];
                        for (int var19 = 0; var19 < this.field1469.length; var19++) {
                            var18[var19] = this.field1469[var19];
                        }
                        this.field1469 = var18;
                    }
                }
                if (var3 <= var14) {
                    var3 = var14 + 1;
                }
                this.field1469[var14] = ~var5;
            }
        }
    }
}
