import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class177 extends class110 {

    @OriginalMember(owner = "client!mf", name = "L", descriptor = "I")
    public static volatile int field2617 = 0;

    @OriginalMember(owner = "client!mf", name = "H", descriptor = "I")
    public static int field2613 = 0;

    @OriginalMember(owner = "client!mf", name = "N", descriptor = "Ljava/lang/String;")
    public static String field2619 = "Loaded title screen";

    @OriginalMember(owner = "client!mf", name = "G", descriptor = "Z")
    public static boolean field2612 = false;

    @OriginalMember(owner = "client!mf", name = "W", descriptor = "[Ljava/lang/String;")
    public static String[] field2628 = null;

    @OriginalMember(owner = "client!mf", name = "U", descriptor = "Lhb;")
    public static class318 field2626 = new class318(100);

    @OriginalMember(owner = "client!mf", name = "I", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!mf", name = "K", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!mf", name = "M", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!mf", name = "O", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!mf", name = "P", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!mf", name = "Q", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!mf", name = "R", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!mf", name = "S", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!mf", name = "T", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!mf", name = "V", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!mf", name = "X", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!mf", name = "J", descriptor = "[I")
    public static int[] field2615;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IZ)[[I", line = 8)
    public final int[][] method445(int arg0, boolean arg1) {
        field2624++;
        int[][] var3 = this.field1701.method1477((byte) 47, arg0);
        if (arg1) {
            this.method46(-15, -55);
        }
        if (this.field1701.field3255) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class124.field1936; var7++) {
                this.method1227(var7, arg0, (byte) -115);
                int[][] var8 = this.method770(class152.field2285, (byte) 102, 0);
                var5[var7] = var8[0][class222.field3392];
                var4[var7] = var8[1][class222.field3392];
                var6[var7] = var8[2][class222.field3392];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ljava/lang/String;BLf;)Ljava/lang/String;", line = 49)
    public static final String method1222(String arg0, byte arg1, class329 arg2) {
        field2620++;
        if (arg0.indexOf("%") != -1) {
            label56: while (true) {
                int var3 = arg0.indexOf("%1");
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg0.indexOf("%2");
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg0.indexOf("%3");
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg0.indexOf("%4");
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg0.indexOf("%5");
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg0.indexOf("%dns");
                                                        if (var8 == -1) {
                                                            break label56;
                                                        }
                                                        String var9 = "";
                                                        if (class135.field2056 != null) {
                                                            if (class135.field2056.field3452 == null) {
                                                                var9 = class96.method682(class135.field2056.field3457, 255);
                                                            } else {
                                                                var9 = (String) class135.field2056.field3452;
                                                            }
                                                        }
                                                        arg0 = arg0.substring(0, var8) + var9 + arg0.substring(var8 + 4);
                                                    }
                                                }
                                                arg0 = arg0.substring(0, var7) + class159.method1127(class56.method371(arg2, 4, (byte) 120), (byte) 106) + arg0.substring(var7 + 2);
                                            }
                                        }
                                        arg0 = arg0.substring(0, var6) + class159.method1127(class56.method371(arg2, 3, (byte) 96), (byte) 58) + arg0.substring(var6 + 2);
                                    }
                                }
                                arg0 = arg0.substring(0, var5) + class159.method1127(class56.method371(arg2, 2, (byte) 113), (byte) -62) + arg0.substring(var5 + 2);
                            }
                        }
                        arg0 = arg0.substring(0, var4) + class159.method1127(class56.method371(arg2, 1, (byte) 101), (byte) -115) + arg0.substring(var4 + 2);
                    }
                }
                arg0 = arg0.substring(0, var3) + class159.method1127(class56.method371(arg2, 0, (byte) 100), (byte) 77) + arg0.substring(var3 + 2);
            }
        }
        if (arg1 != 20) {
            field2612 = false;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(II)V", line = 145)
    public static final void method1223(int arg0, int arg1) {
        class56.field707.method2174(-12634, arg0);
        if (arg1 != -6927) {
            field2619 = (String) null;
        }
        field2616++;
        class183.field2734.method2174(-12634, arg0);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)[I", line = 161)
    public final int[] method46(int arg0, int arg1) {
        if (arg0 != 1) {
            field2613 = 103;
        }
        int[] var3 = this.field1695.method440((byte) -60, arg1);
        if (this.field1695.field875) {
            for (int var4 = 0; var4 < class124.field1936; var4++) {
                this.method1227(var4, arg1, (byte) -127);
                int[] var5 = this.method764(0, true, class152.field2285);
                var3[var4] = var5[class222.field3392];
            }
        }
        field2623++;
        return var3;
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V", line = 190)
    public class177() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 208)
    public static final String method1224(int arg0, long arg1) {
        field2618++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == (long) arg0) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg1;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var6.append(class153.field2305[(int) (var7 - (arg1 * 37L))]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IILf;I)V", line = 252)
    public static final void method1225(int arg0, int arg1, class329 arg2, int arg3) {
        if (arg2.field4928 == 1) {
            class296.method2062(0, (short) 51, 0L, arg2.field5086, 100, "", arg2.field5017, -1);
            class8.field64++;
        }
        if (arg1 != 21544) {
            return;
        }
        if (arg2.field4928 == 2 && !class122.field1907) {
            String var4 = class145.method1041(arg2, (byte) -84);
            if (var4 != null) {
                class239.field3570++;
                class296.method2062(-1, (short) 2, 0L, arg2.field5086, 100, "<col=00ff00>" + arg2.field5038, var4, -1);
            }
        }
        field2627++;
        if (arg2.field4928 == 3) {
            class296.method2062(0, (short) 1, 0L, arg2.field5086, 100, "", class121.field1893, -1);
            class107.field1673++;
        }
        if (arg2.field4928 == 4) {
            class296.method2062(0, (short) 3, 0L, arg2.field5086, 100, "", arg2.field5017, -1);
            class187.field2786++;
        }
        if (arg2.field4928 == 5) {
            class311.field4719++;
            class296.method2062(0, (short) 38, 0L, arg2.field5086, arg1 - 21444, "", arg2.field5017, -1);
        }
        if (arg2.field4928 == 6 && class194.field2910 == null) {
            class296.method2062(-1, (short) 11, 0L, arg2.field5086, 100, "", arg2.field5017, -1);
            class12.field141++;
        }
        if (arg2.field5066 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg2.field4946; var6++) {
                for (int var7 = 0; var7 < arg2.field4971; var7++) {
                    int var8 = (arg2.field5082 + 32) * var7;
                    int var9 = (arg2.field5083 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg2.field4966[var5];
                        var9 += arg2.field5088[var5];
                    }
                    if (var8 <= arg3 && var9 <= arg0 && arg3 < var8 + 32 && (var9 + 32) > arg0) {
                        class35.field436 = var5;
                        class78.field1084 = arg2;
                        if (arg2.field4995[var5] > 0) {
                            class21 var10 = client.method902(arg2);
                            class253 var11 = class325.method2219(arg2.field4995[var5] - 1, -9379);
                            if (class76.field985 == 1 && var10.method134(126)) {
                                if (class218.field3312 != arg2.field5086 || class181.field2703 != var5) {
                                    class296.method2062(var5, (short) 33, (long) var11.field3778, arg2.field5086, 100, class184.field2760 + " -> <col=ff9040>" + var11.field3837, class292.field4442, -1);
                                    class98.field1518++;
                                }
                            } else if (class122.field1907 && var10.method134(110)) {
                                class63 var12 = class12.field133 == -1 ? null : class104.method733(class12.field133, true);
                                if ((class274.field4201 & 0x10) != 0 && (var12 == null || var11.method1714(class12.field133, var12.field837, true) != var12.field837)) {
                                    class296.method2062(var5, (short) 26, (long) var11.field3778, arg2.field5086, 100, class40.field492 + " -> <col=ff9040>" + var11.field3837, class69.field916, class149.field2247);
                                    class186.field2770++;
                                }
                            } else {
                                class194.field2899++;
                                String[] var13 = var11.field3786;
                                if (class302.field4610) {
                                    var13 = class295.method2058(0, var13);
                                }
                                if (var10.method134(115)) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            class58.field762++;
                                            byte var15;
                                            if (var14 == 3) {
                                                var15 = 25;
                                            } else {
                                                var15 = 18;
                                            }
                                            class296.method2062(var5, var15, (long) var11.field3778, arg2.field5086, 100, "<col=ff9040>" + var11.field3837, var13[var14], -1);
                                        }
                                    }
                                }
                                if (var10.method128(arg1 - 21544)) {
                                    class257.field3887++;
                                    class296.method2062(var5, (short) 41, (long) var11.field3778, arg2.field5086, 100, "<col=ff9040>" + var11.field3837, class292.field4442, class160.field2404);
                                }
                                if (var10.method134(106) && var13 != null) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        if (var13[var16] != null) {
                                            byte var17 = 0;
                                            class12.field140++;
                                            if (var16 == 0) {
                                                var17 = 13;
                                            }
                                            if (var16 == 1) {
                                                var17 = 19;
                                            }
                                            if (var16 == 2) {
                                                var17 = 31;
                                            }
                                            class296.method2062(var5, var17, (long) var11.field3778, arg2.field5086, 100, "<col=ff9040>" + var11.field3837, var13[var16], -1);
                                        }
                                    }
                                }
                                String[] var18 = arg2.field5101;
                                if (class302.field4610) {
                                    var18 = class295.method2058(0, var18);
                                }
                                if (var18 != null) {
                                    for (int var19 = 4; var19 >= 0; var19--) {
                                        if (var18[var19] != null) {
                                            class301.field4607++;
                                            byte var20 = 0;
                                            if (var19 == 0) {
                                                var20 = 6;
                                            }
                                            if (var19 == 1) {
                                                var20 = 9;
                                            }
                                            if (var19 == 2) {
                                                var20 = 60;
                                            }
                                            if (var19 == 3) {
                                                var20 = 32;
                                            }
                                            if (var19 == 4) {
                                                var20 = 8;
                                            }
                                            class296.method2062(var5, var20, (long) var11.field3778, arg2.field5086, 100, "<col=ff9040>" + var11.field3837, var18[var19], -1);
                                        }
                                    }
                                }
                                class296.method2062(var5, (short) 1003, (long) var11.field3778, arg2.field5086, arg1 - 21444, "<col=ff9040>" + var11.field3837, class274.field4205, class90.field1341);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg2.field5022) {
            return;
        }
        if (!class122.field1907) {
            for (int var21 = 9; var21 >= 5; var21--) {
                String var22 = class205.method1411((byte) 118, var21, arg2);
                if (var22 != null) {
                    class296.method2062(arg2.field5040, (short) 1001, (long) (var21 + 1), arg2.field5086, 100, arg2.field4992, var22, class91.method640((byte) -99, arg2, var21));
                    class120.field1890++;
                }
            }
            String var23 = class145.method1041(arg2, (byte) -84);
            if (var23 != null) {
                class296.method2062(arg2.field5040, (short) 2, 0L, arg2.field5086, 100, arg2.field4992, var23, -1);
                class239.field3570++;
            }
            for (int var24 = 4; var24 >= 0; var24--) {
                String var25 = class205.method1411((byte) 88, var24, arg2);
                if (var25 != null) {
                    class120.field1890++;
                    class296.method2062(arg2.field5040, (short) 15, (long) (var24 + 1), arg2.field5086, 100, arg2.field4992, var25, class91.method640((byte) 39, arg2, var24));
                }
            }
            if (client.method902(arg2).method132(-102)) {
                class296.method2062(arg2.field5040, (short) 11, 0L, arg2.field5086, 100, "", class57.field721, -1);
                class12.field141++;
            }
        } else if (client.method902(arg2).method135(200) && (class274.field4201 & 0x20) != 0) {
            class241.field3593++;
            class296.method2062(arg2.field5040, (short) 28, 0L, arg2.field5086, arg1 - 21444, class40.field492 + " -> " + arg2.field4992, class69.field916, class149.field2247);
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)V", line = 565)
    public static void method1226(byte arg0) {
        field2619 = null;
        field2628 = null;
        field2626 = null;
        if (arg0 < -66) {
            field2615 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILre;I)V", line = 581)
    public final void method44(int arg0, class263 arg1, int arg2) {
        field2625++;
        if (arg2 < -37 && arg0 == 0) {
            this.field1705 = arg1.method1787(false) == 1;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIB)V", line = 594)
    private final void method1227(int arg0, int arg1, byte arg2) {
        field2622++;
        int var4 = class249.field3714[arg0];
        int var5 = field2615[arg1];
        float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 - 2048));
        if (arg2 >= -95) {
            return;
        }
        if (-3.141592653589793D <= (double) var6 && -2.356194490192345D >= (double) var6) {
            class152.field2285 = arg1;
            class222.field3392 = arg0;
        } else if (-1.5707963267948966D >= (double) var6 && (double) var6 >= -2.356194490192345D) {
            class152.field2285 = arg0;
            class222.field3392 = arg1;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class152.field2285 = arg0;
            class222.field3392 = class124.field1936 - arg1;
        } else if (var6 <= 0.0F && -0.7853981633974483D <= (double) var6) {
            class152.field2285 = class295.field4523 - arg1;
            class222.field3392 = arg0;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class222.field3392 = class124.field1936 - arg0;
            class152.field2285 = class295.field4523 - arg1;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class152.field2285 = class295.field4523 - arg0;
            class222.field3392 = class124.field1936 - arg1;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class152.field2285 = class295.field4523 - arg0;
            class222.field3392 = arg1;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class152.field2285 = arg1;
            class222.field3392 = class124.field1936 - arg0;
        }
        class152.field2285 &= class154.field2320;
        class222.field3392 &= class196.field2949;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "([BII)I", line = 670)
    public static final int method1228(byte[] arg0, int arg1, int arg2) {
        field2614++;
        if (arg2 != 2913) {
            field2612 = false;
        }
        return class144.method1032(-3, 0, arg0, arg1);
    }
}
