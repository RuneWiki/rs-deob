import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class107 extends class134 {

    @OriginalMember(owner = "client!pc", name = "S", descriptor = "I")
    private int field2407 = 0;

    @OriginalMember(owner = "client!pc", name = "Y", descriptor = "I")
    private int field2413 = 0;

    @OriginalMember(owner = "client!pc", name = "cb", descriptor = "I")
    private int field2417 = 128;

    @OriginalMember(owner = "client!pc", name = "U", descriptor = "I")
    public int field2409 = -1;

    @OriginalMember(owner = "client!pc", name = "hb", descriptor = "[S")
    private short[] field2422 = new short[6];

    @OriginalMember(owner = "client!pc", name = "jb", descriptor = "I")
    private int field2424 = 128;

    @OriginalMember(owner = "client!pc", name = "ib", descriptor = "[S")
    private short[] field2423 = new short[6];

    @OriginalMember(owner = "client!pc", name = "P", descriptor = "I")
    private int field2404 = 0;

    @OriginalMember(owner = "client!pc", name = "T", descriptor = "Lwd;")
    private static class150 field2408 = class2.method9(true, "Too many connections from your address)3");

    @OriginalMember(owner = "client!pc", name = "X", descriptor = "Lwd;")
    public static class150 field2412 = field2408;

    @OriginalMember(owner = "client!pc", name = "eb", descriptor = "[Lwb;")
    public static class148[] field2419 = new class148[2048];

    @OriginalMember(owner = "client!pc", name = "db", descriptor = "Lwd;")
    public static class150 field2418 = class2.method9(true, "Null");

    @OriginalMember(owner = "client!pc", name = "bb", descriptor = "Lwd;")
    public static class150 field2416 = class2.method9(true, "Menge eingeben:");

    @OriginalMember(owner = "client!pc", name = "mb", descriptor = "[I")
    public static int[] field2427 = new int[99];

    @OriginalMember(owner = "client!pc", name = "pb", descriptor = "Lwd;")
    public static class150 field2430 = class2.method9(true, "k");

    @OriginalMember(owner = "client!pc", name = "rb", descriptor = "Lof;")
    public static class103 field2432;

    @OriginalMember(owner = "client!pc", name = "ub", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!pc", name = "vb", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!pc", name = "tb", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!pc", name = "sb", descriptor = "Lwd;")
    public static class150 field2433;

    @OriginalMember(owner = "client!pc", name = "Q", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!pc", name = "R", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!pc", name = "W", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!pc", name = "Z", descriptor = "I")
    private int field2414;

    @OriginalMember(owner = "client!pc", name = "ab", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!pc", name = "fb", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!pc", name = "kb", descriptor = "I")
    public int field2425;

    @OriginalMember(owner = "client!pc", name = "lb", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!pc", name = "nb", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!pc", name = "ob", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!pc", name = "qb", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!pc", name = "wb", descriptor = "Lce;")
    public static class20 field2437;

    @OriginalMember(owner = "client!pc", name = "V", descriptor = "Lff;")
    public static class42 field2410;

    @OriginalMember(owner = "client!pc", name = "gb", descriptor = "Lff;")
    public static class42 field2421;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLwb;I)V")
    private final void method735(byte arg0, class148 arg1, int arg2) {
        if (arg2 == 1) {
            this.field2414 = arg1.method1140(-1);
        } else if (arg2 == 2) {
            this.field2409 = arg1.method1140(-1);
        } else if (arg2 == 4) {
            this.field2424 = arg1.method1140(-1);
        } else if (arg2 == 5) {
            this.field2417 = arg1.method1140(-1);
        } else if (arg2 == 6) {
            this.field2413 = arg1.method1140(arg0 - 119);
        } else if (arg2 == 7) {
            this.field2404 = arg1.method1137(255);
        } else if (arg2 == 8) {
            this.field2407 = arg1.method1137(255);
        } else if (arg2 >= 40 && arg2 < 50) {
            this.field2423[arg2 - 40] = (short) arg1.method1140(arg0 - 119);
        } else if (arg2 >= 50 && arg2 < 60) {
            this.field2422[arg2 - 50] = (short) arg1.method1140(-1);
        }
        field2411++;
        if (arg0 != 118) {
            field2408 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILse;)V")
    public static final void method736(int arg0, class127 arg1) {
        field2431++;
        if (arg1.field3007 == 0) {
            arg1.field3006 = 1024;
        }
        if (arg1.field3007 == 1) {
            arg1.field3006 = 1536;
        }
        arg1.field2957 = 0;
        int var2 = arg1.field2996 - class11.field280;
        int var3 = arg1.field2993 * 64 + arg1.field2942 * 128;
        arg1.field3000 += (var3 - arg1.field3000) / var2;
        int var4 = arg1.field2950 * 128 + arg1.field2993 * 64;
        if (arg1.field3007 == arg0) {
            arg1.field3006 = 0;
        }
        arg1.field2939 += (var4 - arg1.field2939) / var2;
        if (arg1.field3007 == 3) {
            arg1.field3006 = 512;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILwb;)V")
    public final void method737(int arg0, class148 arg1) {
        if (arg0 != -15349) {
            field2418 = null;
        }
        field2420++;
        while (true) {
            int var3 = arg1.method1137(255);
            if (var3 == 0) {
                return;
            }
            this.method735((byte) 118, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BI)Lbe;")
    public final class13 method738(byte arg0, int arg1) {
        field2429++;
        class13 var3 = (class13) class112.field2578.method440((long) this.field2425, arg0 + 27101);
        if (var3 == null) {
            class27 var4 = class27.method215(class29.field884, this.field2414, 0);
            if (var4 == null) {
                return null;
            }
            for (int var5 = 0; var5 < 6; var5++) {
                if (this.field2423[0] != 0) {
                    var4.method234(this.field2423[var5], this.field2422[var5]);
                }
            }
            var3 = var4.method223(this.field2404 + 64, 850 - -this.field2407, -30, -50, -30);
            class112.field2578.method433(var3, (long) this.field2425, (byte) -122);
        }
        class13 var6;
        if (this.field2409 == -1 || arg1 == -1) {
            var6 = var3.method86(true);
        } else {
            var6 = class111.method785(this.field2409, 22969).method367(var3, arg1, (byte) 112);
        }
        if (this.field2424 != 128 || this.field2417 != 128) {
            var6.method101(this.field2424, this.field2417, this.field2424);
        }
        if (this.field2413 != 0) {
            if (this.field2413 == 90) {
                var6.method98();
            }
            if (this.field2413 == 180) {
                var6.method98();
                var6.method98();
            }
            if (this.field2413 == 270) {
                var6.method98();
                var6.method98();
                var6.method98();
            }
        }
        if (arg0 != -125) {
            field2432 = null;
        }
        return var6;
    }

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "(B)V")
    public static void method739(byte arg0) {
        field2416 = null;
        field2437 = null;
        field2432 = null;
        field2410 = null;
        field2418 = null;
        field2421 = null;
        field2433 = null;
        field2430 = null;
        field2419 = null;
        field2412 = null;
        field2427 = null;
        if (arg0 != 121) {
            field2412 = null;
        }
        field2408 = null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)V")
    public static final void method740(int arg0, int arg1) {
        field2406++;
        class5.method33(0);
        int var2 = class15.method110(arg0, 16).field2377;
        if (var2 == 0) {
            return;
        }
        int var3 = class16.field423[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class60.method456(0.9D);
                ((class43) class60.field1532).method334((byte) 8, 0.9D);
            }
            if (var3 == 2) {
                class60.method456(0.8D);
                ((class43) class60.field1532).method334((byte) 16, 0.8D);
            }
            if (var3 == 3) {
                class60.method456(0.7D);
                ((class43) class60.field1532).method334((byte) -113, 0.7D);
            }
            if (var3 == 4) {
                class60.method456(0.6D);
                ((class43) class60.field1532).method334((byte) 124, 0.6D);
            }
            class73.method549(true);
            class97.field2225 = true;
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
            if (class104.field2346 != var4) {
                if (class104.field2346 == 0 && class108.field2442 != -1) {
                    class63.method501((byte) -104, var4, 0, class30.field912, class108.field2442, false);
                    class82.field1974 = false;
                } else if (var4 == 0) {
                    class16.method117(-57);
                    class82.field1974 = false;
                } else {
                    class26.method213((byte) -53, var4);
                }
                class104.field2346 = var4;
            }
        }
        if (var2 == 8) {
            class40.field1067 = true;
            class119.field2755 = var3;
        }
        if (var2 == 4) {
            if (var3 == 0) {
                class119.field2757 = 127;
            }
            if (var3 == 1) {
                class119.field2757 = 96;
            }
            if (var3 == 2) {
                class119.field2757 = 64;
            }
            if (var3 == 3) {
                class119.field2757 = 32;
            }
            if (var3 == 4) {
                class119.field2757 = 0;
            }
        }
        if (var2 == 6) {
            class111.field2573 = var3;
        }
        if (var2 == 9) {
            class2.field36 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                class23.field663 = 127;
            }
            if (var3 == 1) {
                class23.field663 = 96;
            }
            if (var3 == 2) {
                class23.field663 = 64;
            }
            if (var3 == 3) {
                class23.field663 = 32;
            }
            if (var3 == 4) {
                class23.field663 = 0;
            }
        }
        if (arg1 < -24 && var2 == 5) {
            class96.field2215 = var3;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIZ)Lwd;")
    public static final class150 method741(int arg0, int arg1, boolean arg2) {
        if (arg1 != 10) {
            method739((byte) 88);
        }
        field2428++;
        return class144.method1085(10, arg2, (byte) 45, arg0);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZLff;IIII)V")
    public static final void method742(int arg0, boolean arg1, class42 arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 != 18932) {
            return;
        }
        class18.field490 = 1;
        class5.field106 = arg2;
        class130.field3066 = arg1;
        class16.field426 = arg4;
        field2405++;
        class74.field1846 = arg0;
        class37.field1016 = arg5;
        class66.field1690 = arg6;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILwd;)I")
    public static final int method743(int arg0, class150 arg1) {
        if (arg0 != 1) {
            return -49;
        }
        field2426++;
        if (class96.field2218 == 1) {
            return 7;
        } else if (arg1.method1203(true, class65.field1640)) {
            return 1;
        } else if (arg1.method1203(true, class90.field2110)) {
            return 1;
        } else if (arg1.method1203(true, class126.field2909)) {
            return 2;
        } else if (arg1.method1203(true, class70.field1766)) {
            return 2;
        } else if (arg1.method1203(true, class86.field2035)) {
            return 3;
        } else if (arg1.method1203(true, class1.field13)) {
            return 4;
        } else if (arg1.method1203(true, class76.field1874)) {
            return 5;
        } else if (arg1.method1203(true, class134.field3159)) {
            return 6;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)V")
    public static final void method744(int arg0) {
        field2415++;
        if (class119.field2755 == 0) {
            return;
        }
        class140 var1 = class22.field646;
        int var2 = 0;
        if (class65.field1647 != 0) {
            var2 = 1;
        }
        int var3 = 0;
        if (arg0 != -12) {
            method740(-117, -97);
        }
        while (var3 < 100) {
            if (class38.field1042[var3] != null) {
                int var4 = class133.field3121[var3];
                class150 var5 = class26.field790[var3];
                byte var6 = 0;
                if (var5 != null && var5.method1203(true, class109.field2521)) {
                    var5 = var5.method1196(5, -31851);
                    var6 = 1;
                }
                if (var5 != null && var5.method1203(true, class4.field81)) {
                    var5 = var5.method1196(5, -31851);
                    var6 = 2;
                }
                if ((var4 == 3 || var4 == 7) && (var4 == 7 || class6.field151 == 0 || class6.field151 == 1 && class133.method994(var5, false))) {
                    int var7 = 329 - var2 * 13;
                    var2++;
                    byte var8 = 4;
                    var1.method1053(class70.field1776, var8, var7, 0);
                    var1.method1053(class70.field1776, var8, var7 - 1, 65535);
                    int var9 = var8 + var1.method1038(class70.field1776);
                    int var10 = var9 + var1.method1036(32);
                    if (var6 == 1) {
                        class133.field3117[0].method803(var10, var7 - 12);
                        var10 += 14;
                    }
                    if (var6 == 2) {
                        class133.field3117[1].method803(var10, var7 - 12);
                        var10 += 14;
                    }
                    var1.method1053(class111.method786((byte) 8, new class150[] { var5, class73.field1813, class38.field1042[var3] }), var10, var7, 0);
                    var1.method1053(class111.method786((byte) 33, new class150[] { var5, class73.field1813, class38.field1042[var3] }), var10, var7 - 1, 65535);
                    if (var2 >= 5) {
                        return;
                    }
                }
                if (var4 == 5 && class6.field151 < 2) {
                    int var11 = 329 - var2 * 13;
                    var2++;
                    var1.method1053(class38.field1042[var3], 4, var11, 0);
                    var1.method1053(class38.field1042[var3], 4, var11 - 1, 65535);
                    if (var2 >= 5) {
                        return;
                    }
                }
                if (var4 == 6 && class6.field151 < 2) {
                    int var12 = 329 - var2 * 13;
                    var1.method1053(class111.method786((byte) -116, new class150[] { class108.field2477, class8.field172, var5, class73.field1813, class38.field1042[var3] }), 4, var12, 0);
                    var2++;
                    var1.method1053(class111.method786((byte) -121, new class150[] { class108.field2477, class8.field172, var5, class73.field1813, class38.field1042[var3] }), 4, var12 - 1, 65535);
                    if (var2 >= 5) {
                        return;
                    }
                }
            }
            var3++;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field2427[var1] = var0 / 4;
        }
        field2432 = new class103();
        field2435 = 0;
        field2436 = -1;
        field2434 = 0;
        field2433 = class2.method9(true, "m-Ochte mit Ihnen handeln)3");
    }
}
