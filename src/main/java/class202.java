import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class202 implements Runnable {

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "Z")
    public boolean field3709 = true;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "Ljava/lang/Object;")
    public Object field3714 = new Object();

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "[I")
    public int[] field3719 = new int[500];

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "[I")
    public int[] field3717 = new int[500];

    @OriginalMember(owner = "client!sh", name = "p", descriptor = "I")
    public int field3722 = 0;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "Lmb;")
    public static class132 field3712 = class166.method1092("Verbindung abgebrochen)3", 112);

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "Z")
    public static boolean field3716 = false;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "Lkg;")
    public static class115 field3715 = new class115(64);

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "Z")
    public static boolean field3721 = false;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!sh", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field3709) {
            Object var1 = this.field3714;
            synchronized (this.field3714) {
                if (this.field3722 < 500) {
                    this.field3719[this.field3722] = class181.field3329;
                    this.field3717[this.field3722] = class36.field584;
                    this.field3722++;
                }
            }
            class130.method856(1, 50L);
        }
        field3720++;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
    public static final void method1273(int arg0) {
        field3718++;
        class70 var1 = class57.field964;
        synchronized (class57.field964) {
            class1.field11++;
            class70.field1175 = class147.field2721;
            if (class216.field3951 >= 0) {
                while (class71.field1201 != class216.field3951) {
                    int var2 = class149.field2732[class71.field1201];
                    class71.field1201 = class71.field1201 + 1 & 0x7F;
                    if (var2 >= 0) {
                        class9.field85[var2] = true;
                    } else {
                        class9.field85[~var2] = false;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class9.field85[var3] = false;
                }
                class216.field3951 = class71.field1201;
            }
            class147.field2721 = class66.field1102;
        }
        if (arg0 != 16711680) {
            method1274((byte) 84, 97, 29, 79, -115);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BIIII)V")
    public static final void method1274(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        class209.field3800++;
        if (arg0 <= 17) {
            field3712 = null;
        }
        field3708++;
        class14.method71(true, (byte) -117);
        class128.method841(64, true);
        class14.method71(false, (byte) -125);
        class128.method841(64, false);
        class17.method87(false);
        class106.method654((byte) 43);
        if (!class180.field3313) {
            int var5 = class229.field4130;
            int var6 = class43.field752 + class230.field4153 & 0x7FF;
            if (var5 < class167.field3046 / 256) {
                var5 = class167.field3046 / 256;
            }
            if (class91.field1615[4] && class68.field1130[4] + 128 > var5) {
                var5 = class68.field1130[4] + 128;
            }
            class9.method45(var5, class195.method1239(class210.field3854.field723, class139.field2615, false, class210.field3854.field673) - 50, class187.field3460, var5 * 3 + 600, class21.field310, 2048, arg2, var6);
        }
        int var7;
        if (class180.field3313) {
            var7 = class203.method1281(true);
        } else {
            var7 = class28.method204((byte) 86);
        }
        int var8 = class47.field814;
        int var9 = client.field545;
        int var10 = class140.field2629;
        int var11 = class64.field1064;
        int var12 = class234.field4215;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class91.field1615[var13]) {
                int var20 = (int) ((double) (class214.field3904[var13] * 2 + 1) * Math.random() + Math.sin((double) class220.field4015[var13] / 100.0D * (double) class192.field3584[var13]) * (double) class68.field1130[var13] - (double) class214.field3904[var13]);
                if (var13 == 1) {
                    class140.field2629 += var20;
                }
                if (var13 == 2) {
                    client.field545 += var20;
                }
                if (var13 == 4) {
                    class64.field1064 += var20;
                    if (class64.field1064 < 128) {
                        class64.field1064 = 128;
                    }
                    if (class64.field1064 > 383) {
                        class64.field1064 = 383;
                    }
                }
                if (var13 == 0) {
                    class47.field814 += var20;
                }
                if (var13 == 3) {
                    class234.field4215 = class234.field4215 + var20 & 0x7FF;
                }
            }
        }
        class239.method1517(arg4, arg3, arg1 + arg4, arg2 + arg3);
        class50.method336();
        int var14 = class181.field3329;
        int var15 = class36.field584;
        if (var14 >= arg4 && arg1 + arg4 > var14 && arg3 <= var15 && arg2 + arg3 > var15) {
            class138.field2591 = 0;
            class145.field2699 = true;
            int var16 = class38.field625;
            int var17 = class16.field236;
            class81.field1371 = (class181.field3329 - arg4) * (var16 - var17) / arg1 + var17;
            int var18 = class145.field2707;
            int var19 = class158.field2870;
            class6.field55 = (class36.field584 - arg3) * (var19 - var18) / arg2 + var18;
        } else {
            class145.field2699 = false;
            class138.field2591 = 0;
        }
        class10.method50((byte) -24);
        class239.method1525(arg4, arg3, arg1, arg2, 0);
        class28.method206(class47.field814, class140.field2629, client.field545, class64.field1064, class234.field4215, var7);
        class10.method50((byte) -24);
        class237.method1504();
        class173.method1130(arg3, arg4, -26747, arg2, 256, arg1, 256);
        class135.method920(arg2, arg3, (byte) -15, 256, arg4, 256, arg1);
        ((class170) class50.field859).method1110(-122, class112.field2118);
        method1275((byte) 96, arg4, arg3, arg1, arg2);
        class64.field1064 = var11;
        class140.field2629 = var10;
        client.field545 = var9;
        class47.field814 = var8;
        class234.field4215 = var12;
        if (class192.field3589 && class162.method1051(true, (byte) -124, false) == 0) {
            class192.field3589 = false;
        }
        if (class192.field3589) {
            class239.method1525(arg4, arg3, arg1, arg2, 0);
            class195.method1240(class21.field309, false, 250);
        }
        if (!class192.field3589 && !field3721 && arg4 <= var14 && arg1 + arg4 > var14 && arg3 <= var15 && arg2 + arg3 > var15) {
            class12.method60(16308, arg2, arg4, arg1, arg3, var14, var15);
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(BIIII)V")
    private static final void method1275(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field3707++;
        if (arg0 <= 7) {
            method1274((byte) 37, 113, -17, -12, -93);
        }
        if (class149.field2734 == 1) {
            class48.field821[class194.field3612 / 100].method103(class89.field1565 - 8, class125.field2321 + -8);
        }
        if (class149.field2734 == 2) {
            class48.field821[class194.field3612 / 100 + 4].method103(class89.field1565 - 8, class125.field2321 + -8);
        }
        class65.method409((byte) 126);
        if (!class152.field2782) {
            return;
        }
        int var5 = arg1 + 507;
        int var6 = arg2 + 20;
        class15.field222.method678(class187.method1197(new class132[] { class144.field2688, class132.method889(class183.field3377, (byte) 104) }, -101), var5, var6, 16776960, -1);
        int var10 = var6 + 15;
        int var7 = 16776960;
        Runtime var8 = Runtime.getRuntime();
        int var9 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
        if (var9 > 32768 && class66.field1096) {
            var7 = 16711680;
        }
        if (var9 > 65536 && !class66.field1096) {
            var7 = 16711680;
        }
        class15.field222.method678(class187.method1197(new class132[] { class33.field525, class132.method889(var9, (byte) 92), class56.field952 }, -72), var5, var10, var7, -1);
        var6 = var10 + 15;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)V")
    public static void method1276(int arg0) {
        field3715 = null;
        field3712 = null;
        if (arg0 < 38) {
            method1273(-81);
        }
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(I)V")
    public static final void method1277(int arg0) {
        field3711++;
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
        System.exit(arg0);
    }
}
