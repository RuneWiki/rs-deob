import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class149 extends RuntimeException {

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "Ljava/lang/Throwable;")
    public Throwable field2678;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "Ljava/lang/String;")
    public String field2677;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field2681 = 0;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "Lqe;")
    public static class179 field2686 = class206.method1380("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", (byte) -128);

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "Lqe;")
    private static class179 field2690 = class206.method1380("Welcome to RuneScape", (byte) -126);

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
    public static int field2689 = 0;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "Lqe;")
    public static class179 field2691 = class206.method1380(" <col=00ff80>", (byte) 107);

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "Z")
    public static boolean field2683 = false;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "Lqe;")
    public static class179 field2680 = field2690;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "Lee;")
    public static class49 field2679;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "[Llg;")
    public static class126[] field2688;

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "[Lnb;")
    public static class143[] field2693;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
    public static final void method951(int arg0) {
        field2684++;
        if (!class81.field1575) {
            return;
        }
        class108.field2013 = null;
        class190.field3530 = null;
        class50.field1071 = null;
        class134.field2486 = null;
        class59.field1275 = null;
        class218.field4039 = null;
        class123.field2278 = null;
        class129.field2355 = null;
        class209.field3925 = null;
        class81.field1574 = null;
        class198.field3699 = null;
        class163.field2945 = null;
        class223.field4121 = null;
        class105.field1979 = null;
        class214.field3976 = null;
        class30.field666 = null;
        class18.field479 = null;
        class110.field2058 = null;
        class6.field222 = null;
        class29.field636 = null;
        class230.field4246 = null;
        class171.field3068 = null;
        class141.method898(arg0, (byte) -119);
        class52.method345(true, 106);
        class81.field1575 = false;
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class149(Throwable arg0, String arg1) {
        this.field2678 = arg0;
        this.field2677 = arg1;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILeh;I)Lfc;")
    public static final class58 method952(int arg0, class52 arg1, int arg2) {
        if (arg2 != -11) {
            field2691 = null;
        }
        field2685++;
        return class185.method1205(arg2 + 19274, arg1, arg0) ? class87.method582(arg2 ^ 0x16C6) : null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)Lpd;")
    public static final class167 method953(int arg0, int arg1, int arg2) {
        class197 var3 = class229.field4232[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field3662; var4++) {
            class167 var5 = var3.field3672[var4];
            if ((var5.field3014 >> 29 & 0x3L) == 2L && var5.field3006 == arg1 && var5.field3018 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)V")
    public static void method954(boolean arg0) {
        field2688 = null;
        if (!arg0) {
            field2689 = -29;
        }
        field2686 = null;
        field2693 = null;
        field2679 = null;
        field2680 = null;
        field2690 = null;
        field2691 = null;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V")
    public static final void method955(int arg0) {
        field2692++;
        if (class81.field1554 == null) {
            return;
        }
        if (class96.field1817 < 10) {
            if (!class112.field2101.method346(-1, class81.field1554)) {
                class96.field1817 = class112.field2101.method347(class81.field1554, -128) / 10;
                return;
            }
            class96.field1817 = 10;
        }
        if (class96.field1817 == 10) {
            class185 var1 = new class185(class112.field2101.method350(class81.field1554, (byte) -100, class121.field2267));
            int var2 = var1.method1252(2);
            int var3 = var1.method1252(2);
            int var4 = var1.method1252(2);
            int var5 = var1.method1252(2);
            int var6 = var1.method1252(2);
            int var7 = var1.method1252(2);
            class146.field2655 = (var4 + 1 - var2) * 64;
            class155.field2795 = new int[class17.field447 + 1];
            class150.field2698 = 8.0D;
            class55.field1218 = 8.0D;
            class176.field3209 = var2 * 64;
            class66.field1350 = var3 * 64;
            int var8 = (class61.field1298.field3159 >> 7) + class2.field26 - class176.field3209;
            int var9 = class146.field2655 >> 6;
            class202.field3736 = (var5 + 1 - var3) * 64;
            int var10 = var8 + (int) (Math.random() * 10.0D) - 5;
            int var11 = (class61.field1298.field3198 >> 7) + class141.field2582 - class66.field1350;
            int var12 = var11 + (int) (Math.random() * 10.0D) - 5;
            if (var10 >= 0 && class146.field2655 > var10 && var12 >= 0 && class202.field3736 > var12) {
                class71.field1421 = class202.field3736 - var12;
                class164.field2972 = var10;
            } else {
                class164.field2972 = var6 * 64 - class176.field3209;
                class71.field1421 = class66.field1350 + class202.field3736 - var7 * 64;
            }
            int var13 = class202.field3736 >> 6;
            class102.field1951 = new byte[var9][var13][];
            class32.field687 = new int[var9][var13][];
            class102.field1947 = new byte[var9][var13][];
            class201.field3728 = new byte[var9][var13][];
            class128.field2340 = new byte[var9][var13][];
            class188.field3502 = new byte[var9][var13][];
            class90.field1696 = new byte[var9][var13][];
            class237.field4371 = new int[var9][var13][];
            int var14 = class19.field501 >> 2 << 10;
            int var15 = class3.field40 >> 1;
            for (int var16 = 0; var16 < class17.field447; var16++) {
                class96 var17 = class201.method1333((byte) -33, var16);
                if (var17 != null) {
                    int var18 = var17.field1806;
                    if (var18 >= 0 && !class27.field597.method514(var18, -20090)) {
                        var18 = -1;
                    }
                    int var19;
                    if (var17.field1815 >= 0) {
                        int var23 = var17.field1815;
                        int var24 = (var23 & 0x7F) + var15;
                        if (var24 < 0) {
                            var24 = 0;
                        } else if (var24 > 127) {
                            var24 = 127;
                        }
                        int var25 = (var23 & 0x380) + (var14 + var23 & 0xFC00) + var24;
                        var19 = class27.field602[class146.method939(var25, 497, 96)];
                    } else if (var18 >= 0) {
                        var19 = class27.field602[class146.method939(class27.field597.method515(-122, var18), 497, 96)];
                    } else if (var17.field1810 == -1) {
                        var19 = -1;
                    } else {
                        int var20 = var17.field1810;
                        int var21 = (var20 & 0x7F) + var15;
                        if (var21 < 0) {
                            var21 = 0;
                        } else if (var21 > 127) {
                            var21 = 127;
                        }
                        int var22 = (var20 + var14 & 0xFC00) + (var20 & 0x380) + var21;
                        var19 = class27.field602[class146.method939(var22, 497, 96)];
                    }
                    class155.field2795[var16 + 1] = var19;
                }
            }
            class96.field1817 = 20;
        } else if (class96.field1817 == 20) {
            class14.method98(class112.field2101.method350(class81.field1554, (byte) -94, class2.field27), (byte) -78);
            class96.field1817 = 30;
            class132.method845(11693);
        } else if (class96.field1817 == 30) {
            class241.method1560(class112.field2101.method350(class81.field1554, (byte) -111, class207.field3869), 64);
            class96.field1817 = 50;
            class132.method845(11693);
        } else if (class96.field1817 == 50) {
            class56.method388(class112.field2101.method350(class81.field1554, (byte) -117, class174.field3118), (byte) 73);
            class96.field1817 = 70;
            class132.method845(11693);
        } else {
            if (arg0 < 118) {
                field2680 = null;
            }
            if (class96.field1817 == 70) {
                class106.method694(class112.field2101.method350(class81.field1554, (byte) -104, class10.field269), -1);
                class96.field1817 = 90;
                class132.method845(11693);
            } else {
                class159.method1030((byte) -105, class112.field2101.method350(class81.field1554, (byte) -110, class235.field4326));
                if (class96.field1817 == 90) {
                    class89.field1685 = new class166(11, true, class81.field1571);
                    class127.field2318 = new class166(12, true, class81.field1571);
                    class131.field2387 = new class166(14, true, class81.field1571);
                    class133.field2413 = new class166(17, true, class81.field1571);
                    class121.field2255 = new class166(19, true, class81.field1571);
                    class222.field4098 = new class166(22, true, class81.field1571);
                    class40.field867 = new class166(26, true, class81.field1571);
                    class147.field2666 = new class166(30, true, class81.field1571);
                    class96.field1817 = 100;
                }
                class139.field2570 = -1;
                class96.field1817 = 100;
                class131.field2386 = -1;
                class132.method845(11693);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZI)Z")
    public static final boolean method956(boolean arg0, int arg1) {
        field2682++;
        if (!arg0) {
            method951(22);
        }
        return (-arg1 & arg1) == arg1;
    }
}
