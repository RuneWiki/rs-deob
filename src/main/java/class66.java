import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class66 {

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "Lwi;")
    public class245 field1103;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public int field1102;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "Z")
    public static boolean field1101 = true;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field1107 = -1;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public static int field1104 = 0;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IBC)I")
    public static final int method462(int arg0, byte arg1, char arg2) {
        if (arg1 != 94) {
            method464(90, 87);
        }
        field1097++;
        int var3 = arg2 << 4;
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            arg2 = Character.toLowerCase(arg2);
            var3 = (arg2 << 4) + 1;
        }
        if (arg2 == 'ñ' && arg0 == 0) {
            var3 = 1762;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)Lui;")
    public static final class286 method463(int arg0, int arg1) {
        class286 var2 = (class286) class97.field1557.method1261(0, (long) arg0);
        if (arg1 != 243) {
            method467(-50, (byte) -35);
        }
        field1096++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class240.field3833.method1680(arg0, 0, -123);
        class286 var4 = new class286();
        if (var3 != null) {
            var4.method1902(new class162(var3), false);
        }
        var4.method1907((byte) -128);
        class97.field1557.method1264(arg1 - 244, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(II)V")
    public class66(int arg0, int arg1) {
        this.field1103 = class180.method1311(arg0, (byte) -103);
        this.field1102 = arg1;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(II)I")
    public static final int method464(int arg0, int arg1) {
        double var2 = (double) ((arg1 & 0xFF02C6) >> 16) / 256.0D;
        field1098++;
        double var4 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var4 > var2) {
            var8 = var4;
        }
        double var10 = var2;
        if (var4 < var2) {
            var10 = var4;
        }
        if (var10 > var6) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        if (var8 < var6) {
            var8 = var6;
        }
        int var16 = 16 % ((arg0 + 80) / 43);
        double var17 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var2 == var8) {
                var12 = (var4 - var6) / (var8 - var10);
            } else if (var4 == var8) {
                var12 = (var6 - var2) / (var8 - var10) + 2.0D;
            } else if (var6 == var8) {
                var12 = (var2 - var4) / (var8 - var10) + 4.0D;
            }
            if (var17 < 0.5D) {
                var14 = (var8 - var10) / (var8 + var10);
            }
            if (var17 >= 0.5D) {
                var14 = (var8 - var10) / (2.0D - var8 - var10);
            }
        }
        int var19 = (int) (var14 * 256.0D);
        double var20 = var12 / 6.0D;
        int var22 = (int) (var20 * 256.0D);
        if (var19 < 0) {
            var19 = 0;
        } else if (var19 > 255) {
            var19 = 255;
        }
        int var23 = (int) (var17 * 256.0D);
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        if (var23 > 243) {
            var19 >>= 0x4;
        } else if (var23 > 217) {
            var19 >>= 0x3;
        } else if (var23 > 192) {
            var19 >>= 0x2;
        } else if (var23 > 179) {
            var19 >>= 0x1;
        }
        return (var19 >> 5 << 7) + (var22 >> 2 << 10) + (var23 >> 1);
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lwi;I)V")
    public class66(class245 arg0, int arg1) {
        this.field1103 = arg0;
        this.field1102 = arg1;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)V")
    public static final void method465(boolean arg0) {
        field1100++;
        if (class275.field4417 == null) {
            return;
        }
        if (class90.field1468 < 10) {
            if (!class275.field4407.method1695(class275.field4417.field1276, -31451)) {
                class90.field1468 = class32.field496.method1668((byte) -59, class275.field4417.field1276) / 10;
                return;
            }
            class47.method338(-9762);
            class90.field1468 = 10;
        }
        if (class90.field1468 == 10) {
            class275.field4412 = class275.field4417.field1272 >> 6 << 6;
            class275.field4408 = (class275.field4417.field1282 >> 6 << 6) + 64 - class275.field4412;
            class275.field4413 = class275.field4417.field1267 >> 6 << 6;
            class275.field4416 = (class275.field4417.field1270 >> 6 << 6) + 64 - class275.field4413;
            int[] var1 = new int[3];
            int var2 = -1;
            int var3 = -1;
            if (class275.field4417.method520(var1, class56.field941, class276.field4438 + (class239.field3829.field637 >> 7), 123, class108.field1732 + (class239.field3829.field710 >> 7))) {
                var3 = class275.field4413 + class275.field4416 - var1[2] - 1;
                var2 = var1[1] - class275.field4412;
            }
            if (!class144.field2271 && var2 >= 0 && var2 < class275.field4408 && var3 >= 0 && class275.field4416 > var3) {
                int var4 = var2 + (int) (Math.random() * 10.0D) - 5;
                class247.field3934 = var4;
                int var5 = var3 + (int) (Math.random() * 10.0D) - 5;
                class129.field2029 = var5;
            } else if (class98.field1567 == -1 || class5.field52 == -1) {
                class275.field4417.method522(var1, class275.field4417.field1265 >> 14 & 0x3FFF, class275.field4417.field1265 & 0x3FFF, -1202095642);
                class129.field2029 = -var1[2] - (-class275.field4413 - (class275.field4416 - 1));
                class247.field3934 = var1[1] - class275.field4412;
            } else {
                class275.field4417.method522(var1, class98.field1567, class5.field52, -1202095642);
                if (var1 != null) {
                    class129.field2029 = class275.field4416 + class275.field4413 - var1[2] - 1;
                    class247.field3934 = var1[1] - class275.field4412;
                }
                class144.field2271 = false;
                class5.field52 = -1;
                class98.field1567 = -1;
            }
            if (class275.field4417.field1280 == 37) {
                class275.field4418 = 3.0F;
                class275.field4409 = 3.0F;
            } else if (class275.field4417.field1280 == 50) {
                class275.field4418 = 4.0F;
                class275.field4409 = 4.0F;
            } else if (class275.field4417.field1280 == 75) {
                class275.field4418 = 6.0F;
                class275.field4409 = 6.0F;
            } else if (class275.field4417.field1280 == 100) {
                class275.field4418 = 8.0F;
                class275.field4409 = 8.0F;
            } else if (class275.field4417.field1280 == 200) {
                class275.field4418 = 16.0F;
                class275.field4409 = 16.0F;
            } else {
                class275.field4418 = 8.0F;
                class275.field4409 = 8.0F;
            }
            class132.method934(0);
            int var6 = class275.field4408 >> 6;
            class275.field4431 = new int[class156.field2442 + 1];
            int var7 = class275.field4416 >> 6;
            class275.field4426 = new byte[var6][var7][];
            class275.field4430 = new int[var6][var7][];
            class275.field4429 = new int[var6][var7][];
            class275.field4421 = new byte[var6][var7][];
            class275.field4432 = new byte[var6][var7][];
            class275.field4433 = new byte[var6][var7][];
            class275.field4419 = new byte[var6][var7][];
            class94.field1523 = new class246();
            class313.field4985 = new class111();
            int var8 = class70.field1185 >> 1;
            int var9 = class162.field2579 >> 2 << 10;
            class275.method1845(var9, var8);
            class99.method678(1024, 256, 59);
            class207.method1450((byte) -114, 256, 256);
            method467(256, (byte) 94);
            class90.field1468 = 20;
        } else if (class90.field1468 == 20) {
            class75.method504(-1, new class162(class275.field4407.method1683((byte) 46, class275.field4417.field1276, "underlay")));
            class90.field1468 = 30;
            class32.method204(-31, true);
            class293.method1953(-88);
        } else if (class90.field1468 == 30) {
            class275.method1856(new class162(class275.field4407.method1683((byte) 46, class275.field4417.field1276, "overlay")));
            class90.field1468 = 40;
            class293.method1953(-104);
        } else if (class90.field1468 == 40) {
            class275.method1855(new class162(class275.field4407.method1683((byte) 46, class275.field4417.field1276, "overlay2")));
            class90.field1468 = 50;
            class293.method1953(-114);
        } else if (class90.field1468 == 50) {
            class275.method1850(new class162(class275.field4407.method1683((byte) 46, class275.field4417.field1276, "loc")), class249.field3950);
            class90.field1468 = 60;
            class32.method204(-31, true);
            class293.method1953(76);
        } else if (class90.field1468 == 60) {
            if (class275.field4407.method1687(class275.field4417.field1276 + "_labels", (byte) -56)) {
                if (!class275.field4407.method1695(class275.field4417.field1276 + "_labels", -31451)) {
                    return;
                }
                class275.field4410 = class239.method1612(class249.field3950, 104, class275.field4407, class275.field4417.field1276 + "_labels");
            } else {
                class275.field4410 = new class292(0);
            }
            class275.method1847();
            class90.field1468 = 70;
            class293.method1953(71);
        } else if (class90.field1468 == 70) {
            class148.field2315 = new class140(11, true, class131.field2064);
            class90.field1468 = 73;
            class32.method204(-31, true);
            class293.method1953(104);
        } else if (class90.field1468 == 73) {
            class73.field1233 = new class140(12, true, class131.field2064);
            class90.field1468 = 76;
            class32.method204(-31, true);
            class293.method1953(-119);
        } else if (class90.field1468 == 76) {
            class59.field968 = new class140(14, true, class131.field2064);
            class90.field1468 = 79;
            class32.method204(-31, true);
            class293.method1953(126);
        } else if (class90.field1468 == 79) {
            class229.field3699 = new class140(17, true, class131.field2064);
            class90.field1468 = 82;
            class32.method204(-31, true);
            class293.method1953(-121);
        } else if (class90.field1468 == 82) {
            class149.field2325 = new class140(19, true, class131.field2064);
            class90.field1468 = 85;
            class32.method204(-31, true);
            class293.method1953(-123);
        } else if (class90.field1468 == 85) {
            class108.field1733 = new class140(22, true, class131.field2064);
            class90.field1468 = 88;
            class32.method204(-31, true);
            class293.method1953(48);
        } else if (class90.field1468 == 88) {
            class60.field983 = new class140(26, true, class131.field2064);
            class90.field1468 = 91;
            class32.method204(-31, true);
            class293.method1953(94);
        } else {
            class291.field4677 = new class140(30, true, class131.field2064);
            if (arg0) {
                method463(29, -68);
            }
            class90.field1468 = 100;
            class32.method204(-31, true);
            class293.method1953(89);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(II)V")
    public static final void method466(int arg0, int arg1) {
        class151 var2 = class218.field3584[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class151 var4 = class218.field3584[var3][arg0][arg1] = class218.field3584[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field2354--;
                for (int var5 = 0; var5 < var4.field2357; var5++) {
                    class179 var6 = var4.field2347[var5];
                    if ((var6.field2933 >> 29 & 0x3L) == 2L && var6.field2931 == arg0 && var6.field2915 == arg1) {
                        var6.field2923--;
                    }
                }
            }
        }
        if (class218.field3584[0][arg0][arg1] == null) {
            class218.field3584[0][arg0][arg1] = new class151(0, arg0, arg1);
        }
        class218.field3584[0][arg0][arg1].field2360 = var2;
        class218.field3584[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB)V")
    public static final void method467(int arg0, byte arg1) {
        int var2 = 114 % ((24 - arg1) / 56);
        field1105++;
        class47.field796.method1257(-107);
        class47.field796 = new class173(arg0);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)Z")
    public static final boolean method468(byte arg0, int arg1) {
        byte var2 = 0;
        field1106++;
        byte var3 = 0;
        if (class133.field2121 == null) {
            if (class134.field2128 == null) {
                class133.field2121 = new class232(512, 512);
            } else {
                class133.field2121 = (class232) class134.field2128;
            }
            int[] var4 = class133.field2121.field3733;
            int var5 = var4.length;
            for (int var6 = 0; var6 < var5; var6++) {
                var4[var6] = 1;
            }
            for (int var7 = var2 + 1; var7 < (104 - var2 - 1); var7++) {
                int var23 = (var2 + 103 - var7) * 512 * 4 + 24628;
                for (int var24 = var3 + 1; var24 < (104 - var3 - 1); var24++) {
                    if ((class301.field4818[arg1][var24][var7] & 0x18) == 0) {
                        class174.method1271(var4, var23, 512, arg1, var24, var7);
                    }
                    if (arg1 < 3 && (class301.field4818[arg1 + 1][var24][var7] & 0x8) != 0) {
                        class174.method1271(var4, var23, 512, arg1 + 1, var24, var7);
                    }
                    var23 += 4;
                }
            }
            class223.field3627 = 0;
            for (int var8 = 0; var8 < 104; var8++) {
                for (int var9 = 0; var9 < 104; var9++) {
                    long var10 = class205.method1435(arg1, var8 + var3, var2 + var9);
                    if (var10 == 0L) {
                        var10 = class203.method1421(arg1, var3 + var8, var2 + var9);
                    }
                    if (var10 == 0L) {
                        var10 = class276.method1861(arg1, var3 + var8, var9 - -var2);
                    }
                    if (var10 == 0L) {
                        var10 = class173.method1258(arg1, var3 + var8, var2 + var9);
                    }
                    if (var10 != 0L) {
                        class158 var12 = class5.method29(Integer.MAX_VALUE & (int) (var10 >>> 32), true);
                        if (!var12.field2479 || class249.field3950) {
                            int var13 = var12.field2509;
                            if (var12.field2448 != null) {
                                for (int var14 = 0; var14 < var12.field2448.length; var14++) {
                                    if (var12.field2448[var14] != -1) {
                                        class158 var15 = class5.method29(var12.field2448[var14], true);
                                        if (var15.field2509 >= 0) {
                                            var13 = var15.field2509;
                                        }
                                    }
                                }
                            }
                            if (var13 >= 0) {
                                class50 var16 = class49.method346(var13, (byte) 65);
                                boolean var17 = false;
                                if (var16 != null && var16.field854) {
                                    var17 = true;
                                }
                                int var18 = var3 + var8;
                                int var19 = var2 + var9;
                                if (var17) {
                                    int[][] var20 = class131.field2065[arg1].field728;
                                    for (int var21 = 0; var21 < 10; var21++) {
                                        int var22 = (int) (Math.random() * 4.0D);
                                        if (var22 == 0 && var18 > 0 && var18 > (var8 - 3) && (var20[var18 - 1][var19] & 0x2C0108) == 0) {
                                            var18--;
                                        }
                                        if (var22 == 1 && var18 < 103 && (var8 + 3) > var18 && (var20[var18 + 1][var19] & 0x2C0180) == 0) {
                                            var18++;
                                        }
                                        if (var22 == 2 && var19 > 0 && var9 - 3 < var19 && (var20[var18][var19 - 1] & 0x2C0102) == 0) {
                                            var19--;
                                        }
                                        if (var22 == 3 && var19 < 103 && (var9 + 3) > var19 && (var20[var18][var19 + 1] & 0x2C0120) == 0) {
                                            var19++;
                                        }
                                    }
                                }
                                class196.field3166[class223.field3627] = var12.field2474;
                                class47.field787[class223.field3627] = var18 - var3;
                                class34.field517[class223.field3627] = var19 - var2;
                                class223.field3627++;
                            }
                        }
                    }
                }
            }
        }
        int var25 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (-10 + 238 + (int) (Math.random() * 20.0D) << 16) + 228;
        class133.field2121.method1569();
        int var26 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        int var27 = 62 % ((-arg0 - 52) / 44);
        for (int var28 = 1; var28 < 103; var28++) {
            for (int var29 = 1; var29 < 103; var29++) {
                if ((class301.field4818[arg1][var3 + var29][var2 + var28] & 0x18) == 0 && !class25.method140(var28, var3, 5, var2, var29, arg1, var26, var25)) {
                    class112.field1757.method497((byte) -121);
                    return false;
                }
                if (arg1 < 3 && (class301.field4818[arg1 + 1][var29 + var3][var28 + var2] & 0x8) != 0 && !class25.method140(var28, var3, 5, var2, var29, arg1 + 1, var26, var25)) {
                    class112.field1757.method497((byte) -120);
                    return false;
                }
            }
        }
        class134.field2128 = class133.field2121;
        class112.field1757.method497((byte) -84);
        class133.field2121 = null;
        return true;
    }
}
