import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class44 {

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    public static int field1049 = 0;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "Z")
    public static boolean field1050 = true;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
    public static int field1053 = 0;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "Lr;")
    public static class118 field1054 = class153.method1136(82, " loggt sich ein)3");

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "Lr;")
    public static class118 field1057 = class153.method1136(110, "<br>");

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "[Lpa;")
    public static class105[] field1052 = new class105[2048];

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "[I")
    public static int[] field1059 = new int[100];

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "[I")
    public static int[] field1058 = new int[128];

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "[Ljf;")
    public static class68[] field1047 = new class68[256];

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILjava/lang/Object;Z)[B")
    public static final byte[] method365(int arg0, Object arg1, boolean arg2) {
        field1048++;
        if (arg0 != 21071) {
            return null;
        } else if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg2 ? class153.method1133(-7, var3) : var3;
        } else if (arg1 instanceof class4) {
            class4 var4 = (class4) arg1;
            return var4.method16(-8915);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "([Lr;B)[Lr;")
    public static final class118[] method366(class118[] arg0, byte arg1) {
        class118[] var2 = new class118[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class144.method1066(true, new class118[] { class43.method359(var3, (byte) -122), class88.field2136 });
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = class144.method1066(true, new class118[] { var2[var3], arg0[var3] });
            }
        }
        field1043++;
        if (arg1 == -85) {
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
    public static final void method367(int arg0) {
        field1044++;
        if (class113.field2647 == 0) {
            class68.field1583 = new class154(4, 104, 104, class72.field1668);
            for (int var1 = 0; var1 < 4; var1++) {
                class121.field2790[var1] = new class128(104, 104);
            }
            class100.field2300 = new class150(512, 512);
            class36.field917 = 5;
            class113.field2647 = 20;
            class132.field3028 = class121.field2801;
        } else if (class113.field2647 == 20) {
            int[] var2 = new int[9];
            for (int var3 = 0; var3 < 9; var3++) {
                int var4 = var3 * 32 + 143;
                int var5 = var4 * 3 + 600;
                int var6 = class58.field1354[var4];
                var2[var3] = var5 * var6 >> 16;
            }
            class154.method1171(var2, 500, 800, 512, 334);
            class132.field3028 = class138.field3140;
            class36.field917 = 10;
            class113.field2647 = 30;
        } else if (class113.field2647 == 30) {
            class55.field1309 = class54.method492(false, true, 1000000, true, 0);
            class70.field1633 = class54.method492(false, true, 1000000, true, 1);
            class19.field470 = class54.method492(true, true, 1000000, false, 2);
            class4.field79 = class54.method492(false, true, 1000000, true, 3);
            class91.field2189 = class54.method492(false, true, 1000000, true, 4);
            class51.field1223 = class54.method492(true, true, 1000000, true, 5);
            class46.field1113 = class54.method492(true, false, 1000000, true, 6);
            class159.field3658 = class54.method492(false, true, 1000000, true, 7);
            class53.field1263 = class54.method492(false, true, 1000000, true, 8);
            class92.field2220 = class54.method492(false, true, 1000000, true, 9);
            class55.field1305 = class54.method492(false, true, 1000000, true, 10);
            client.field518 = class54.method492(false, true, 1000000, true, 11);
            class142.field3221 = class54.method492(false, true, 1000000, true, 12);
            class159.field3664 = class54.method492(true, true, 1000000, false, 13);
            class71.field1664 = class54.method492(false, false, 1000000, true, 14);
            class85.field2091 = class54.method492(false, true, 1000000, true, 15);
            class36.field917 = 20;
            class132.field3028 = class88.field2126;
            class113.field2647 = 40;
        } else if (class113.field2647 == 40) {
            byte var7 = 0;
            int var8 = var7 + class55.field1309.method580(-7) * 4 / 100;
            int var9 = var8 + class70.field1633.method580(-7) * 4 / 100;
            int var10 = var9 + class19.field470.method580(-7) * 2 / 100;
            int var11 = var10 + class4.field79.method580(-7) * 2 / 100;
            int var12 = var11 + class91.field2189.method580(-7) * 6 / 100;
            int var13 = var12 + class51.field1223.method580(-7) * 4 / 100;
            int var14 = var13 + class46.field1113.method580(-7) * 2 / 100;
            int var15 = var14 + class159.field3658.method580(-7) * 60 / 100;
            int var16 = var15 + class53.field1263.method580(-7) * 2 / 100;
            int var17 = var16 + class92.field2220.method580(-7) * 2 / 100;
            int var18 = var17 + class55.field1305.method580(-7) * 2 / 100;
            int var19 = var18 + client.field518.method580(-7) * 2 / 100;
            int var20 = var19 + class142.field3221.method580(-7) * 2 / 100;
            int var21 = var20 + class159.field3664.method580(-7) * 2 / 100;
            int var22 = var21 + class71.field1664.method580(-7) * 2 / 100;
            int var23 = var22 + class85.field2091.method580(-7) * 2 / 100;
            if (var23 == 100) {
                class132.field3028 = class64.field1467;
                class36.field917 = 30;
                class113.field2647 = 45;
            } else {
                if (var23 != 0) {
                    class132.field3028 = class144.method1066(true, new class118[] { class34.field857, class43.method359(var23, (byte) -122), class94.field2226 });
                }
                class36.field917 = 30;
            }
        } else if (class113.field2647 == 45) {
            class125.method967((byte) -39, 22050, 2, !class68.field1582);
            class14 var24 = new class14();
            var24.method119((byte) 88, 128, 9);
            class47.field1134 = class31.method264(class95.field2247, 123, 22050, 0, class4.field70);
            class47.field1134.method375(-122, var24);
            class4.method14(class85.field2091, (byte) 98, var24, class71.field1664, class91.field2189);
            class127.field2902 = class31.method264(class95.field2247, 97, 2048, 1, class4.field70);
            class94.field2239 = new class98();
            class127.field2902.method375(-57, class94.field2239);
            class136.field3090 = new class11(22050, class85.field2084);
            class132.field3028 = class144.field3230;
            class113.field2647 = 50;
            class36.field917 = 35;
        } else if (class113.field2647 == 50) {
            int var25 = 0;
            if (class70.field1640 == null) {
                class70.field1640 = class124.method963(class133.field3040, class110.field2567, -99, class159.field3664, class53.field1263);
            } else {
                var25++;
            }
            if (class10.field228 == null) {
                class10.field228 = class124.method963(class125.field2866, class110.field2567, 113, class159.field3664, class53.field1263);
            } else {
                var25++;
            }
            if (class115.field2699 == null) {
                class115.field2699 = class124.method963(class27.field648, class110.field2567, -106, class159.field3664, class53.field1263);
            } else {
                var25++;
            }
            if (var25 < 3) {
                class132.field3028 = class144.method1066(true, new class118[] { class121.field2807, class43.method359(var25 * 100 / 3, (byte) -122), class94.field2226 });
                class36.field917 = 40;
            } else {
                class113.field2647 = 60;
                class36.field917 = 40;
                class132.field3028 = class30.field744;
            }
        } else if (class113.field2647 == 60) {
            int var26 = class142.method1057(class53.field1263, class55.field1305, -21528);
            int var27 = class121.method952((byte) -11);
            if (var26 < var27) {
                class132.field3028 = class144.method1066(true, new class118[] { class65.field1492, class43.method359(var26 * 100 / var27, (byte) -122), class94.field2226 });
                class36.field917 = 50;
            } else {
                class132.field3028 = class4.field82;
                class36.field917 = 50;
                class39.method326(22077, 5);
                class113.field2647 = 70;
            }
        } else if (class113.field2647 == 70) {
            if (class19.field470.method335((byte) -20)) {
                class34.method285(true, class19.field470);
                class73.method613(5862, class19.field470);
                class131.method1016(class159.field3658, class19.field470, 3);
                class158.method1229(class159.field3658, (byte) 116, class68.field1582, class19.field470);
                class37.method305(0, class19.field470, class159.field3658);
                class137.method1035(class159.field3658, class19.field470, class61.field1410, false, class70.field1640);
                class108.method859(class55.field1309, class70.field1633, (byte) -118, class19.field470);
                class144.method1064(-111, class19.field470, class159.field3658);
                class11.method82(class19.field470, 1652903458);
                class36.method299(class19.field470, 5378);
                class22.method205((byte) 103, class159.field3658, class159.field3664, class4.field79, class53.field1263);
                class115.method898(37, class19.field470);
                class136.method1030(class19.field470, -95);
                class132.field3028 = class69.field1595;
                class36.field917 = 60;
                class113.field2647 = 80;
            } else {
                class132.field3028 = class144.method1066(true, new class118[] { class138.field3139, class43.method359(class19.field470.method583(72), (byte) -122), class94.field2226 });
                class36.field917 = 60;
            }
        } else if (class113.field2647 == 80) {
            int var28 = 0;
            if (class20.field504 == null) {
                class20.field504 = class29.method245(true, class110.field2567, class53.field1263, class140.field3191);
            } else {
                var28++;
            }
            if (class153.field3449 == null) {
                class153.field3449 = class29.method245(true, class110.field2567, class53.field1263, class2.field49);
            } else {
                var28++;
            }
            if (class78.field1892 == null) {
                class78.field1892 = class25.method226(class110.field2567, class53.field1263, class133.field3033, (byte) 113);
            } else {
                var28++;
            }
            if (class66.field1511 == null) {
                class66.field1511 = class121.method948(class53.field1263, (byte) 91, class68.field1578, class110.field2567);
            } else {
                var28++;
            }
            if (class133.field3032 == null) {
                class133.field3032 = class121.method948(class53.field1263, (byte) 61, class14.field350, class110.field2567);
            } else {
                var28++;
            }
            if (class10.field218 == null) {
                class10.field218 = class121.method948(class53.field1263, (byte) -80, class110.field2550, class110.field2567);
            } else {
                var28++;
            }
            if (class67.field1560 == null) {
                class67.field1560 = class121.method948(class53.field1263, (byte) 79, class15.field400, class110.field2567);
            } else {
                var28++;
            }
            if (class115.field2706 == null) {
                class115.field2706 = class121.method948(class53.field1263, (byte) 96, class51.field1235, class110.field2567);
            } else {
                var28++;
            }
            if (class82.field1976 == null) {
                class82.field1976 = class121.method948(class53.field1263, (byte) -88, class95.field2256, class110.field2567);
            } else {
                var28++;
            }
            if (class140.field3187 == null) {
                class140.field3187 = class121.method948(class53.field1263, (byte) 77, class19.field474, class110.field2567);
            } else {
                var28++;
            }
            if (class136.field3091 == null) {
                class136.field3091 = class121.method948(class53.field1263, (byte) -65, class19.field476, class110.field2567);
            } else {
                var28++;
            }
            if (class149.field3350 == null) {
                class149.field3350 = class25.method226(class110.field2567, class53.field1263, class134.field3051, (byte) 113);
            } else {
                var28++;
            }
            if (class131.field2975 == null) {
                class131.field2975 = class25.method226(class110.field2567, class53.field1263, class22.field534, (byte) 113);
            } else {
                var28++;
            }
            if (class87.field2112 == null) {
                class87.field2112 = class75.method635(class110.field2567, class53.field1263, class14.field312, 0);
            } else {
                var28++;
            }
            if (var28 < 14) {
                class132.field3028 = class144.method1066(true, new class118[] { class106.field2467, class43.method359(var28 * 100 / 14, (byte) -122), class94.field2226 });
                class36.field917 = 70;
            } else {
                int var29 = (int) (Math.random() * 21.0D) - 10;
                class8.field170 = class131.field2975;
                class153.field3449.method1121();
                int var30 = (int) (Math.random() * 21.0D) - 10;
                int var31 = (int) (Math.random() * 21.0D) - 10;
                int var32 = (int) (Math.random() * 41.0D) - 20;
                for (int var33 = 0; var33 < class66.field1511.length; var33++) {
                    class66.field1511[var33].method1100(var29 + var32, var30 + var32, var31 + var32);
                }
                class78.field1892[0].method717(var29 + var32, var30 + var32, var31 + var32);
                class15.method135(82);
                class113.field2647 = 90;
                class36.field917 = 70;
                class132.field3028 = class79.field1930;
            }
        } else if (class113.field2647 == 90) {
            if (class92.field2220.method335((byte) -20)) {
                class77 var34 = new class77(class92.field2220, class53.field1263, 20, 0.8D, class68.field1582 ? 64 : 128);
                class58.method512(var34);
                class58.method506(0.8D);
                class113.field2647 = 110;
                class36.field917 = 90;
                class132.field3028 = class139.field3160;
            } else {
                class132.field3028 = class144.method1066(true, new class118[] { class15.field398, class43.method359(class92.field2220.method583(37), (byte) -122), class94.field2226 });
                class36.field917 = 90;
            }
        } else if (class113.field2647 == 110) {
            class53.field1264 = new class23();
            class95.field2247.method1128(-17306, class53.field1264, 10);
            class113.field2647 = 120;
            class36.field917 = 94;
            class132.field3028 = class46.field1114;
        } else {
            int var35 = -11 % ((arg0 + 92) / 33);
            if (class113.field2647 == 120) {
                if (class55.field1305.method354(class110.field2567, class55.field1304, -113)) {
                    class53 var36 = new class53(class55.field1305.method339(class55.field1304, class110.field2567, -2));
                    class54.method491(-1, var36);
                    class36.field917 = 96;
                    class132.field3028 = class142.field3214;
                    class113.field2647 = 130;
                } else {
                    class132.field3028 = class144.method1066(true, new class118[] { class126.field2880, class91.field2168 });
                    class36.field917 = 96;
                }
            } else if (class113.field2647 == 130) {
                if (!class4.field79.method335((byte) -20)) {
                    class132.field3028 = class144.method1066(true, new class118[] { class65.field1476, class43.method359(class4.field79.method583(71) * 4 / 5, (byte) -122), class94.field2226 });
                    class36.field917 = 100;
                } else if (!class142.field3221.method335((byte) -20)) {
                    class132.field3028 = class144.method1066(true, new class118[] { class65.field1476, class43.method359(class142.field3221.method583(-121) / 6 + 80, (byte) -122), class94.field2226 });
                    class36.field917 = 100;
                } else if (class159.field3664.method335((byte) -20)) {
                    class132.field3028 = class27.field651;
                    class36.field917 = 100;
                    class113.field2647 = 140;
                } else {
                    class132.field3028 = class144.method1066(true, new class118[] { class65.field1476, class43.method359(class159.field3664.method583(41) / 20 + 96, (byte) -122), class94.field2226 });
                    class36.field917 = 100;
                }
            } else if (class113.field2647 == 140) {
                class39.method326(22077, 10);
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V")
    public static void method368(int arg0) {
        field1058 = null;
        field1059 = null;
        if (arg0 != 32) {
            method368(-37);
        }
        field1054 = null;
        field1052 = null;
        field1047 = null;
        field1057 = null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IBI)I")
    public static final int method369(int arg0, byte arg1, int arg2) {
        class97 var3 = (class97) class64.field1464.method297((long) arg2, -1);
        field1045++;
        if (var3 == null) {
            return -1;
        } else if (arg0 >= 0 && arg0 < var3.field2260.length) {
            if (arg1 != -59) {
                method366(null, (byte) -100);
            }
            return var3.field2260[arg0];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BI)Z")
    public static final boolean method370(byte arg0, int arg1) {
        if (arg0 > -114) {
            return true;
        } else {
            field1055++;
            return (arg1 >> 28 & 0x1) != 0;
        }
    }
}
