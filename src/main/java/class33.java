import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class33 {

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "J")
    public static volatile long field813 = 0L;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "Ljb;")
    public static class56 field802 = new class56(64);

    @OriginalMember(owner = "client!fb", name = "z", descriptor = "Lv;")
    private static class122 field820 = class55.method425(-58, "The server is being updated)3");

    @OriginalMember(owner = "client!fb", name = "H", descriptor = "Lv;")
    public static class122 field828 = class55.method425(-49, "Ein kostenloses Spielkonto erstellen)3");

    @OriginalMember(owner = "client!fb", name = "F", descriptor = "Lv;")
    public static class122 field826 = class55.method425(-122, "leuchten3:");

    @OriginalMember(owner = "client!fb", name = "I", descriptor = "I")
    public static int field829 = 0;

    @OriginalMember(owner = "client!fb", name = "L", descriptor = "I")
    public static int field832 = 0;

    @OriginalMember(owner = "client!fb", name = "C", descriptor = "Lv;")
    public static class122 field823 = field820;

    @OriginalMember(owner = "client!fb", name = "E", descriptor = "Lv;")
    public static class122 field825 = class55.method425(-95, "redstone3");

    @OriginalMember(owner = "client!fb", name = "G", descriptor = "I")
    public static int field827 = 7759444;

    @OriginalMember(owner = "client!fb", name = "N", descriptor = "Lv;")
    public static class122 field834 = class55.method425(-93, "Lade Eingabe)2Steuerungsprogramm)3)3)3");

    @OriginalMember(owner = "client!fb", name = "M", descriptor = "Lv;")
    public static class122 field833 = class55.method425(-81, "(Z");

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public int field795;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public int field796;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public int field797;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public int field798;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public int field799;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public int field801;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    public int field803;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    public int field804;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
    public int field807;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
    public int field810;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
    public int field811;

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
    public int field812;

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
    public int field815;

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!fb", name = "w", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!fb", name = "x", descriptor = "I")
    public int field818;

    @OriginalMember(owner = "client!fb", name = "y", descriptor = "I")
    public int field819;

    @OriginalMember(owner = "client!fb", name = "A", descriptor = "I")
    public int field821;

    @OriginalMember(owner = "client!fb", name = "B", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!fb", name = "D", descriptor = "I")
    public int field824;

    @OriginalMember(owner = "client!fb", name = "J", descriptor = "I")
    public int field830;

    @OriginalMember(owner = "client!fb", name = "K", descriptor = "[[B")
    public static byte[][] field831;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V", line = 4)
    public static final void method292(int arg0) {
        field806++;
        short var1 = 256;
        if (class42.field1123 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (class42.field1123 > 768) {
                    class119.field2864[var2] = class10.method94(1024 - class42.field1123, 16711935, class112.field2742[var2], class84.field2192[var2]);
                } else if (class42.field1123 <= 256) {
                    class119.field2864[var2] = class10.method94(256 - class42.field1123, 16711935, class84.field2192[var2], class112.field2742[var2]);
                } else {
                    class119.field2864[var2] = class112.field2742[var2];
                }
            }
        } else if (class109.field2704 > 0) {
            for (int var3 = 0; var3 < 256; var3++) {
                if (class109.field2704 > 768) {
                    class119.field2864[var3] = class10.method94(1024 - class109.field2704, 16711935, class76.field2035[var3], class84.field2192[var3]);
                } else if (class109.field2704 > 256) {
                    class119.field2864[var3] = class76.field2035[var3];
                } else {
                    class119.field2864[var3] = class10.method94(256 - class109.field2704, 16711935, class84.field2192[var3], class76.field2035[var3]);
                }
            }
        } else {
            for (int var4 = 0; var4 < 256; var4++) {
                class119.field2864[var4] = class84.field2192[var4];
            }
        }
        for (int var5 = 0; var5 < 33920; var5++) {
            class56.field1484.field1591[var5] = class94.field2420.field3023[var5];
        }
        int var6 = 0;
        int var7 = 1152;
        for (int var8 = 1; var8 < var1 - 1; var8++) {
            int var22 = (var1 - var8) * class84.field2180[var8] / var1;
            int var23 = var22 + 22;
            if (var23 < 0) {
                var23 = 0;
            }
            var6 += var23;
            for (int var24 = var23; var24 < 128; var24++) {
                int var25 = class84.field2186[var6++];
                if (var25 == 0) {
                    var7++;
                } else {
                    int var27 = 256 - var25;
                    int var28 = class119.field2864[var25];
                    int var29 = class56.field1484.field1591[var7];
                    class56.field1484.field1591[var7++] = class30.method286(16711680, class30.method286(65280, var28) * var25 + var27 * class30.method286(var29, 65280)) + class30.method286(-16711936, class30.method286(16711935, var29) * var27 + var25 * class30.method286(var28, 16711935)) >> 8;
                }
            }
            var7 += var23;
        }
        if (arg0 >= -59) {
            field826 = null;
        }
        for (int var9 = 0; var9 < 33920; var9++) {
            class2.field76.field1591[var9] = class92.field2343.field3023[var9];
        }
        int var10 = 0;
        int var11 = 1176;
        for (int var12 = 1; var12 < var1 - 1; var12++) {
            int var13 = (var1 - var12) * class84.field2180[var12] / var1;
            int var14 = 103 - var13;
            int var15 = var11 + var13;
            for (int var16 = 0; var16 < var14; var16++) {
                int var17 = class84.field2186[var10++];
                if (var17 == 0) {
                    var15++;
                } else {
                    int var19 = class2.field76.field1591[var15];
                    int var20 = 256 - var17;
                    int var21 = class119.field2864[var17];
                    class2.field76.field1591[var15++] = class30.method286(class30.method286(var19, 65280) * var20 + class30.method286(var21, 65280) * var17, 16711680) + class30.method286(var20 * class30.method286(16711935, var19) + class30.method286(var21, 16711935) * var17, -16711936) >> 8;
                }
            }
            var10 += 128 - var14;
            var11 = var15 + 128 - var14 - var13;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IB)V", line = 172)
    public static final void method293(int arg0, byte arg1) {
        field808++;
        class67.method536((byte) -12);
        int var2 = class125.method987((byte) -128, arg0).field694;
        if (arg1 < 72) {
            method292(18);
        }
        if (var2 == 0) {
            return;
        }
        int var3 = class73.field1896[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class77.method653(0.9D);
                ((class23) class77.field2067).method248((byte) 92, 0.9D);
            }
            if (var3 == 2) {
                class77.method653(0.8D);
                ((class23) class77.field2067).method248((byte) 92, 0.8D);
            }
            if (var3 == 3) {
                class77.method653(0.7D);
                ((class23) class77.field2067).method248((byte) 92, 0.7D);
            }
            if (var3 == 4) {
                class77.method653(0.6D);
                ((class23) class77.field2067).method248((byte) 92, 0.6D);
            }
            class11.method108(-12415);
            class81.field2121 = true;
        }
        if (var2 == 3) {
            short var4 = 0;
            if (var3 == 0) {
                var4 = 255;
            }
            if (var3 == 1) {
                var4 = 192;
            }
            if (var3 == 2) {
                var4 = 128;
            }
            if (var3 == 3) {
                var4 = 64;
            }
            if (var3 == 4) {
                var4 = 0;
            }
            if (class54.field1380 != var4) {
                if (class54.field1380 == 0 && class107.field2657 != -1) {
                    class109.method848(0, 20672, class93.field2396, class107.field2657, var4, false, 0);
                    class66.field1708 = 0;
                } else if (var4 == 0) {
                    class109.method847((byte) -83);
                    class66.field1708 = 0;
                } else {
                    class120.method916(var4, (byte) -20);
                }
                class54.field1380 = var4;
            }
        }
        if (var2 == 9) {
            class52.field1346 = var3;
        }
        if (var2 == 8) {
            field829 = var3;
            class103.field2558 = true;
        }
        if (var2 == 6) {
            class61.field1562 = var3;
        }
        if (var2 == 5) {
            class4.field110 = var3;
        }
        if (var2 != 4) {
            return;
        }
        if (var3 == 0) {
            class56.field1465 = 127;
        }
        if (var3 == 1) {
            class56.field1465 = 96;
        }
        if (var3 == 2) {
            class56.field1465 = 64;
        }
        if (var3 == 3) {
            class56.field1465 = 32;
        }
        if (var3 == 4) {
            class56.field1465 = 0;
            return;
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V", line = 315)
    public static final void method294(int arg0) {
        class32.field792 = null;
        field809++;
        class107.field2640 = null;
        if (arg0 != -1) {
            method293(-10, (byte) 101);
        }
        class23.field630 = null;
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)V", line = 342)
    public static void method295(int arg0) {
        if (arg0 != -18596) {
            field802 = null;
        }
        field823 = null;
        field833 = null;
        field820 = null;
        field826 = null;
        field834 = null;
        field802 = null;
        field831 = null;
        field828 = null;
        field825 = null;
    }

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "(I)V", line = 362)
    public static final void method296(int arg0) {
        int var1 = 121 / ((arg0 - 54) / 46);
        class50.field1258 = true;
        field800++;
        class62.method475(-11);
        if (class109.field2698 != -1) {
            boolean var2 = class47.method387(0, 0, 0, class109.field2698, 190, -1, -1, 1, 261);
            if (!var2) {
                class62.field1588 = true;
            }
        } else if (class84.field2191[class43.field1146] != -1) {
            boolean var3 = class47.method387(0, 0, 0, class84.field2191[class43.field1146], 190, -1, -1, 1, 261);
            if (!var3) {
                class62.field1588 = true;
            }
        }
        if (class50.field1261 && class7.field176 == 1) {
            if (class120.field2917 == 1) {
                class131.method1019((byte) -5);
            } else {
                class59.method456(-125);
            }
        }
        class106.method823(false);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIII)V", line = 419)
    public static final void method297(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field816++;
        class51 var5 = (class51) class91.field2333.method311((byte) 92);
        if (arg3 != 0) {
            method295(103);
        }
        while (var5 != null) {
            if (var5.field1295 != -1 || var5.field1315 != null) {
                int var6 = 0;
                if (var5.field1304 < arg2) {
                    var6 += arg2 - var5.field1304;
                } else if (var5.field1293 > arg2) {
                    var6 += var5.field1293 - arg2;
                }
                if (arg4 > var5.field1310) {
                    var6 += arg4 - var5.field1310;
                } else if (arg4 < var5.field1320) {
                    var6 += var5.field1320 - arg4;
                }
                if (var5.field1284 < var6 - 64 || class56.field1465 == 0) {
                    if (var5.field1296 != null) {
                        class63.field1604.method854(var5.field1296);
                        var5.field1296 = null;
                    }
                    if (var5.field1322 != null) {
                        class63.field1604.method854(var5.field1322);
                        var5.field1322 = null;
                    }
                } else {
                    var6 -= 64;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    int var7 = (var5.field1284 - var6) * class56.field1465 / var5.field1284;
                    if (var5.field1296 != null) {
                        var5.field1296.method202(var7);
                    } else if (var5.field1295 >= 0) {
                        class86 var8 = class86.method684(class24.field662, var5.field1295, 0);
                        if (var8 != null) {
                            class35 var9 = var8.method683().method313(class125.field3032);
                            class20 var10 = class20.method203(var9, 100, var7);
                            var10.method207(-1);
                            class63.field1604.method858(var10);
                            var5.field1296 = var10;
                        }
                    }
                    if (var5.field1322 != null) {
                        var5.field1322.method202(var7);
                        if (!var5.field1322.method199()) {
                            var5.field1322 = null;
                        }
                    } else if (var5.field1315 != null && (var5.field1282 -= arg0) <= 0) {
                        int var11 = (int) ((double) var5.field1315.length * Math.random());
                        class86 var12 = class86.method684(class24.field662, var5.field1315[var11], 0);
                        if (var12 != null) {
                            class35 var13 = var12.method683().method313(class125.field3032);
                            class20 var14 = class20.method203(var13, 100, var7);
                            var14.method207(0);
                            class63.field1604.method858(var14);
                            var5.field1322 = var14;
                        }
                        var5.field1282 = (int) ((double) (var5.field1305 - var5.field1314) * Math.random()) + var5.field1314;
                    }
                }
            }
            var5 = (class51) class91.field2333.method302((byte) -107);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V", line = 553)
    public static final void method298(byte arg0) {
        field814++;
        class83.field2148++;
        class103.method781(true, 127);
        class23.method247(true, 64);
        class103.method781(false, 127);
        class23.method247(false, 64);
        class16.method149((byte) 89);
        class52.method410((byte) 70);
        if (!class74.field1986) {
            int var1 = class63.field1598 + class44.field1159 & 0x7FF;
            int var2 = class83.field2173;
            if (class100.field2512 / 256 > var2) {
                var2 = class100.field2512 / 256;
            }
            if (class21.field584[4] && class103.field2541[4] + 128 > var2) {
                var2 = class103.field2541[4] + 128;
            }
            class8.method86((byte) -78, class108.method837((byte) 59, class70.field1828.field343, class70.field1828.field349, class34.field848) - 50, class91.field2328, class55.field1415, var2, var1, var2 * 3 + 600);
        }
        int var3;
        if (class74.field1986) {
            var3 = class38.method335(true);
        } else {
            var3 = class22.method236(-8277);
        }
        int var4 = class29.field743;
        int var5 = class115.field2809;
        int var6 = class115.field2815;
        int var7 = class81.field2114;
        int var8 = class5.field135;
        int var9 = 0;
        if (arg0 != 3) {
            return;
        }
        while (var9 < 5) {
            if (class21.field584[var9]) {
                int var10 = (int) (Math.random() * (double) (class18.field432[var9] * 2 + 1) + Math.sin((double) class41.field1044[var9] / 100.0D * (double) class74.field1998[var9]) * (double) class103.field2541[var9] - (double) class18.field432[var9]);
                if (var9 == 1) {
                    class29.field743 += var10;
                }
                if (var9 == 0) {
                    class115.field2809 += var10;
                }
                if (var9 == 2) {
                    class5.field135 += var10;
                }
                if (var9 == 3) {
                    class81.field2114 = class81.field2114 + var10 & 0x7FF;
                }
                if (var9 == 4) {
                    class115.field2815 += var10;
                    if (class115.field2815 < 128) {
                        class115.field2815 = 128;
                    }
                    if (class115.field2815 > 383) {
                        class115.field2815 = 383;
                    }
                }
            }
            var9++;
        }
        class122.method964((byte) -97);
        class68.field1806 = class72.field1855 - 4;
        class68.field1782 = class7.field171 - 4;
        class68.field1778 = true;
        class68.field1793 = 0;
        class117.method896();
        class90.field2306.method48(class115.field2809, class29.field743, class5.field135, class115.field2815, class81.field2114, var3);
        class90.field2306.method18();
        class75.method634(3316);
        class69.method572(true);
        ((class23) class77.field2067).method239(class64.field1663, -123);
        class106.method827(true);
        if (class61.field1578 && class21.method219(false, (byte) 76, true) == 0) {
            class61.field1578 = false;
        }
        if (class61.field1578) {
            class122.method964((byte) -97);
            class117.method896();
            class88.method697(null, 882, class112.field2741, false);
        }
        class93.method744((byte) -95);
        class81.field2114 = var7;
        class29.field743 = var4;
        class5.field135 = var8;
        class115.field2815 = var6;
        class115.field2809 = var5;
    }

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "(I)V", line = 672)
    public static final void method299(int arg0) {
        class107.field2661 = arg0;
        field822++;
        class80.field2102 = 0;
        class113.method867(false);
        class88.method689(-86);
        class5.method70(arg0 ^ 0xFFFFFF83);
        class34.method310(false);
        for (int var1 = 0; var1 < class80.field2102; var1++) {
            int var3 = class126.field3067[var1];
            if (class16.field396 != class125.field3043[var3].field333) {
                class125.field3043[var3] = null;
            }
        }
        if (class74.field1969 != class14.field372.field1617) {
            throw new RuntimeException("gpp1 pos:" + class14.field372.field1617 + " psize:" + class74.field1969);
        }
        for (int var2 = 0; var2 < class108.field2671; var2++) {
            if (class125.field3043[class7.field175[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class108.field2671);
            }
        }
    }
}
