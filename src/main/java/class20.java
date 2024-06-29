import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class20 {

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "[B")
    public byte[] field446 = new byte[18002];

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "I")
    public int field444 = 0;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "[Z")
    public boolean[] field441 = new boolean[256];

    @OriginalMember(owner = "client!ce", name = "w", descriptor = "[[I")
    public int[][] field451 = new int[6][258];

    @OriginalMember(owner = "client!ce", name = "x", descriptor = "[B")
    public byte[] field452 = new byte[256];

    @OriginalMember(owner = "client!ce", name = "C", descriptor = "[I")
    public int[] field457 = new int[257];

    @OriginalMember(owner = "client!ce", name = "E", descriptor = "[[I")
    public int[][] field459 = new int[6][258];

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "[I")
    public int[] field431 = new int[16];

    @OriginalMember(owner = "client!ce", name = "H", descriptor = "[[B")
    public byte[][] field462 = new byte[6][258];

    @OriginalMember(owner = "client!ce", name = "B", descriptor = "[B")
    public byte[] field456 = new byte[4096];

    @OriginalMember(owner = "client!ce", name = "I", descriptor = "[Z")
    public boolean[] field463 = new boolean[16];

    @OriginalMember(owner = "client!ce", name = "M", descriptor = "[[I")
    public int[][] field467 = new int[6][258];

    @OriginalMember(owner = "client!ce", name = "K", descriptor = "I")
    public int field465 = 0;

    @OriginalMember(owner = "client!ce", name = "N", descriptor = "[I")
    public int[] field468 = new int[256];

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "[B")
    public byte[] field434 = new byte[18002];

    @OriginalMember(owner = "client!ce", name = "O", descriptor = "[I")
    public int[] field469 = new int[6];

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "Lja;")
    private static class62 field432 = class30.method243(43, "Please enter your password)3");

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "I")
    public static int field448 = 0;

    @OriginalMember(owner = "client!ce", name = "A", descriptor = "Lja;")
    public static class62 field455 = field432;

    @OriginalMember(owner = "client!ce", name = "J", descriptor = "Lja;")
    private static class62 field464 = class30.method243(43, "Prepared visibility map");

    @OriginalMember(owner = "client!ce", name = "L", descriptor = "Lja;")
    public static class62 field466 = field464;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "B")
    public byte field440;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public int field429;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public int field430;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public int field435;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public int field436;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public int field437;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public int field438;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    public int field439;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "I")
    public int field445;

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "I")
    public int field447;

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "I")
    public int field449;

    @OriginalMember(owner = "client!ce", name = "v", descriptor = "I")
    public int field450;

    @OriginalMember(owner = "client!ce", name = "y", descriptor = "I")
    public int field453;

    @OriginalMember(owner = "client!ce", name = "z", descriptor = "I")
    public int field454;

    @OriginalMember(owner = "client!ce", name = "D", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!ce", name = "F", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "[B")
    public byte[] field442;

    @OriginalMember(owner = "client!ce", name = "G", descriptor = "[B")
    public byte[] field461;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIII)V")
    public static final void method149(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field443++;
        class149.field3522 = 0;
        for (int var5 = -1; var5 < class83.field2001 + class147.field3460; var5++) {
            class6 var21;
            if (var5 == -1) {
                var21 = class40.field936;
            } else if (class147.field3460 <= var5) {
                var21 = class136.field3127[class36.field871[var5 - class147.field3460]];
            } else {
                var21 = class52.field1200[class141.field3311[var5]];
            }
            if (var21 != null && var21.method66((byte) -24)) {
                if (var21 instanceof class130) {
                    class138 var22 = ((class130) var21).field2966;
                    if (var22.field3208 != null) {
                        var22 = var22.method1108(-1);
                    }
                    if (var22 == null) {
                        continue;
                    }
                }
                if (class147.field3460 <= var5) {
                    class138 var23 = ((class130) var21).field2966;
                    if (var23.field3208 != null) {
                        var23 = var23.method1108(arg4 ^ 0xFFFFFEFF);
                    }
                    if (var23.field3187 >= 0 && class40.field928.length > var23.field3187) {
                        class42.method313(var21, 1000, var21.field165 + 15);
                        if (class119.field2729 > -1) {
                            class40.field928[var23.field3187].method417(arg3 + class119.field2729 - 12, class68.field1688 + arg2 + -30);
                        }
                    }
                    if (class116.field2676 == 1 && class36.field871[var5 - class147.field3460] == class122.field2786 && class86.field2060 % 20 < 10) {
                        class42.method313(var21, arg4 ^ 0x2E8, var21.field165 + 15);
                        if (class119.field2729 > -1) {
                            class115.field2644[0].method417(arg3 + class119.field2729 - 12, arg2 + -28 + class68.field1688);
                        }
                    }
                } else {
                    int var24 = 30;
                    class115 var25 = (class115) var21;
                    if (var25.field2660 != -1 || var25.field2642 != -1) {
                        class42.method313(var21, 1000, var21.field165 + 15);
                        if (class119.field2729 > -1) {
                            if (var25.field2660 != -1) {
                                class10.field257[var25.field2660].method417(class119.field2729 + arg3 - 12, class68.field1688 + arg2 + -var24);
                                var24 += 25;
                            }
                            if (var25.field2642 != -1) {
                                class40.field928[var25.field2642].method417(class119.field2729 + arg3 - 12, class68.field1688 + arg2 - var24);
                                var24 += 25;
                            }
                        }
                    }
                    if (var5 >= 0 && class116.field2676 == 10 && class141.field3311[var5] == class57.field1391) {
                        class42.method313(var21, arg4 + 744, var21.field165 - -15);
                        if (class119.field2729 > -1) {
                            class115.field2644[1].method417(arg3 + class119.field2729 - 12, class68.field1688 + arg2 + -var24);
                        }
                    }
                }
                if (var21.field157 != null && (var5 >= class147.field3460 || class85.field2047 == 0 || class85.field2047 == 3 || class85.field2047 == 1 && class71.method599(0, ((class115) var21).field2653))) {
                    class42.method313(var21, 1000, var21.field165);
                    if (class119.field2729 > -1 && class46.field1061 > class149.field3522) {
                        class46.field1066[class149.field3522] = class70.field1789.method681(var21.field157) / 2;
                        class46.field1063[class149.field3522] = class70.field1789.field2122;
                        class46.field1065[class149.field3522] = class119.field2729;
                        class46.field1058[class149.field3522] = class68.field1688;
                        class46.field1067[class149.field3522] = var21.field179;
                        class46.field1059[class149.field3522] = var21.field199;
                        class46.field1060[class149.field3522] = var21.field170;
                        class46.field1062[class149.field3522] = var21.field157;
                        class149.field3522++;
                    }
                }
                if (var21.field142 > class86.field2060) {
                    class42.method313(var21, 1000, var21.field165 + 15);
                    if (class119.field2729 > -1) {
                        int var26 = var21.field182 * 30 / var21.field162;
                        if (var26 > 30) {
                            var26 = 30;
                        }
                        class19.method143(arg3 + class119.field2729 - 15, class68.field1688 + arg2 + -3, var26, 5, 65280);
                        class19.method143(class119.field2729 + var26 + arg3 - 15, arg2 + -3 - -class68.field1688, 30 - var26, 5, 16711680);
                    }
                }
                for (int var27 = 0; var27 < 4; var27++) {
                    if (class86.field2060 < var21.field192[var27]) {
                        class42.method313(var21, 1000, var21.field165 / 2);
                        if (class119.field2729 > -1) {
                            if (var27 == 1) {
                                class68.field1688 -= 20;
                            }
                            if (var27 == 2) {
                                class68.field1688 -= 10;
                                class119.field2729 -= 15;
                            }
                            if (var27 == 3) {
                                class119.field2729 += 15;
                                class68.field1688 -= 10;
                            }
                            class9.field235[var21.field183[var27]].method417(class119.field2729 + arg3 - 12, class68.field1688 + arg2 + -12);
                            class65.field1611.method696(class31.method249(true, var21.field147[var27]), arg3 + class119.field2729 - 1, arg2 - -class68.field1688 - -3, 16777215, 0);
                        }
                    }
                }
            }
        }
        if (arg4 != 256) {
            field466 = null;
        }
        for (int var6 = 0; var6 < class149.field3522; var6++) {
            int var7 = class46.field1065[var6];
            int var8 = class46.field1058[var6];
            int var9 = class46.field1066[var6];
            int var10 = class46.field1063[var6];
            boolean var11 = true;
            while (var11) {
                var11 = false;
                for (int var20 = 0; var20 < var6; var20++) {
                    if (var8 + 2 > class46.field1058[var20] + -class46.field1063[var20] && var8 - var10 < class46.field1058[var20] + 2 && class46.field1065[var20] + class46.field1066[var20] > -var9 + var7 && class46.field1065[var20] - class46.field1066[var20] < var7 - -var9 && class46.field1058[var20] - class46.field1063[var20] < var8) {
                        var8 = class46.field1058[var20] - class46.field1063[var20];
                        var11 = true;
                    }
                }
            }
            class119.field2729 = class46.field1065[var6];
            class68.field1688 = class46.field1058[var6] = var8;
            class62 var12 = class46.field1062[var6];
            if (class3.field19 == 0) {
                int var13 = 16776960;
                if (class46.field1067[var6] < 6) {
                    var13 = class113.field2609[class46.field1067[var6]];
                }
                if (class46.field1067[var6] == 6) {
                    var13 = class116.field2671 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class46.field1067[var6] == 7) {
                    var13 = class116.field2671 % 20 < 10 ? 255 : 65535;
                }
                if (class46.field1067[var6] == 8) {
                    var13 = class116.field2671 % 20 < 10 ? 45056 : 8454016;
                }
                if (class46.field1067[var6] == 9) {
                    int var14 = 150 - class46.field1060[var6];
                    if (var14 < 50) {
                        var13 = var14 * 1280 + 16711680;
                    } else if (var14 < 100) {
                        var13 = 16776960 - (var14 - 50) * 327680;
                    } else if (var14 < 150) {
                        var13 = var14 * 5 + 65280 - 500;
                    }
                }
                if (class46.field1067[var6] == 10) {
                    int var15 = 150 - class46.field1060[var6];
                    if (var15 < 50) {
                        var13 = var15 * 5 + 16711680;
                    } else if (var15 < 100) {
                        var13 = 16711935 + 16384000 - var15 * 327680;
                    } else if (var15 < 150) {
                        var13 = var15 * 327680 + 255 - (var15 - 100) * 5 - 32768000;
                    }
                }
                if (class46.field1067[var6] == 11) {
                    int var16 = 150 - class46.field1060[var6];
                    if (var16 < 50) {
                        var13 = 16777215 - var16 * 327685;
                    } else if (var16 < 100) {
                        var13 = var16 * 327685 - 16318970;
                    } else if (var16 < 150) {
                        var13 = 16777215 - (var16 - 100) * 327680;
                    }
                }
                if (class46.field1059[var6] == 0) {
                    class70.field1789.method696(var12, class119.field2729 + arg3, class68.field1688 + arg2, var13, 0);
                }
                if (class46.field1059[var6] == 1) {
                    class70.field1789.method697(var12, class119.field2729 + arg3, class68.field1688 + arg2, var13, 0, class116.field2671);
                }
                if (class46.field1059[var6] == 2) {
                    class70.field1789.method694(var12, class119.field2729 + arg3, class68.field1688 + arg2, var13, 0, class116.field2671);
                }
                if (class46.field1059[var6] == 3) {
                    class70.field1789.method683(var12, class119.field2729 + arg3, class68.field1688 + arg2, var13, 0, class116.field2671, 150 - class46.field1060[var6]);
                }
                if (class46.field1059[var6] == 4) {
                    int var17 = (150 - class46.field1060[var6]) * (class70.field1789.method681(var12) + 100) / 150;
                    class19.method139(class119.field2729 + arg3 - 50, arg2, class119.field2729 + arg3 + 50, arg0 + arg2);
                    class70.field1789.method688(var12, arg3 + class119.field2729 + 50 - var17, class68.field1688 + arg2, var13, 0);
                    class19.method141(arg3, arg2, arg1 + arg3, arg0 + arg2);
                }
                if (class46.field1059[var6] == 5) {
                    int var18 = 150 - class46.field1060[var6];
                    class19.method139(arg3, class68.field1688 + arg2 - class70.field1789.field2122 - 1, arg1 + arg3, class68.field1688 + arg2 + 5);
                    int var19 = 0;
                    if (var18 < 25) {
                        var19 = var18 - 25;
                    } else if (var18 > 125) {
                        var19 = var18 - 125;
                    }
                    class70.field1789.method696(var12, class119.field2729 + arg3, class68.field1688 + arg2 + var19, var13, 0);
                    class19.method141(arg3, arg2, arg1 + arg3, arg0 + arg2);
                }
            } else {
                class70.field1789.method696(var12, arg3 + class119.field2729, class68.field1688 + arg2, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IBILua;I)V")
    public static final void method150(int arg0, byte arg1, int arg2, class138 arg3, int arg4) {
        field458++;
        if (class128.field2889 >= 400) {
            return;
        }
        if (arg3.field3208 != null) {
            arg3 = arg3.method1108(-1);
        }
        if (arg3 == null) {
            return;
        }
        if (arg1 >= -24) {
            field464 = null;
        }
        if (!arg3.field3202) {
            return;
        }
        class62 var5 = arg3.field3185;
        if (arg3.field3201 != 0) {
            var5 = class70.method594(new class62[] { var5, class56.method386((byte) 51, class40.field936.field2641, arg3.field3201), class96.field2247, class120.field2763, class31.method249(true, arg3.field3201), class10.field249 }, 1229);
        }
        if (class68.field1692 == 1) {
            class143.field3329++;
            class135.method1079((byte) -113, class70.method594(new class62[] { class60.field1459, class121.field2782, var5 }, 1229), class35.field827, arg2, arg0, arg4, 34);
        } else if (!class90.field2145) {
            class62[] var6 = arg3.field3175;
            if (class116.field2674) {
                var6 = class34.method266((byte) -80, var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].method461(25064, class26.field619)) {
                        class46.field1048++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 36;
                        }
                        if (var7 == 1) {
                            var8 = 48;
                        }
                        if (var7 == 2) {
                            var8 = 22;
                        }
                        if (var7 == 3) {
                            var8 = 41;
                        }
                        if (var7 == 4) {
                            var8 = 9;
                        }
                        class135.method1079((byte) -113, class70.method594(new class62[] { class135.field3117, var5 }, 1229), var6[var7], arg2, arg0, arg4, var8);
                    }
                }
            }
            class142.field3314++;
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method461(25064, class26.field619)) {
                        int var10 = 0;
                        short var11 = 0;
                        client.field496++;
                        if (arg3.field3201 > class40.field936.field2641) {
                            var11 = 2000;
                        }
                        if (var9 == 0) {
                            var10 = var11 + 36;
                        }
                        if (var9 == 1) {
                            var10 = var11 + 48;
                        }
                        if (var9 == 2) {
                            var10 = var11 + 22;
                        }
                        if (var9 == 3) {
                            var10 = var11 + 41;
                        }
                        if (var9 == 4) {
                            var10 = var11 + 9;
                        }
                        class135.method1079((byte) -113, class70.method594(new class62[] { class135.field3117, var5 }, 1229), var6[var9], arg2, arg0, arg4, var10);
                    }
                }
            }
            class135.method1079((byte) -113, class70.method594(new class62[] { class135.field3117, var5 }, 1229), class39.field906, arg2, arg0, arg4, 1005);
        } else if ((class52.field1201 & 0x2) == 2) {
            class135.method1079((byte) -113, class70.method594(new class62[] { class27.field678, class121.field2782, var5 }, 1229), class124.field2835, arg2, arg0, arg4, 32);
            class59.field1445++;
            return;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
    public static final void method151(int arg0) {
        field460++;
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
        if (arg0 < -117) {
            System.exit(1);
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V")
    public static void method152(int arg0) {
        if (arg0 < 65) {
            field464 = null;
        }
        field455 = null;
        field464 = null;
        field432 = null;
        field466 = null;
    }
}
