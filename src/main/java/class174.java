import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class174 extends class187 {

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "[I")
    public int[] field2654 = new int[5];

    @OriginalMember(owner = "client!sa", name = "G", descriptor = "I")
    public int field2661 = 0;

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "[Lkd;")
    public class272[] field2671 = new class272[5];

    @OriginalMember(owner = "client!sa", name = "F", descriptor = "I")
    public int field2660;

    @OriginalMember(owner = "client!sa", name = "K", descriptor = "I")
    public int field2665;

    @OriginalMember(owner = "client!sa", name = "E", descriptor = "I")
    public int field2659;

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "I")
    public int field2649;

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "[I")
    public static int[] field2645 = new int[2048];

    @OriginalMember(owner = "client!sa", name = "H", descriptor = "I")
    public static int field2662 = 99;

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "Ljava/lang/String;")
    public static String field2642 = "flash3:";

    @OriginalMember(owner = "client!sa", name = "S", descriptor = "Z")
    public static volatile boolean field2673 = true;

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "I")
    public int field2651;

    @OriginalMember(owner = "client!sa", name = "x", descriptor = "I")
    public int field2652;

    @OriginalMember(owner = "client!sa", name = "A", descriptor = "I")
    public int field2655;

    @OriginalMember(owner = "client!sa", name = "L", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!sa", name = "N", descriptor = "I")
    public int field2668;

    @OriginalMember(owner = "client!sa", name = "O", descriptor = "I")
    public int field2669;

    @OriginalMember(owner = "client!sa", name = "P", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!sa", name = "B", descriptor = "Llg;")
    public class123 field2656;

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "Lqm;")
    public class152 field2650;

    @OriginalMember(owner = "client!sa", name = "R", descriptor = "Lpf;")
    public class157 field2672;

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "Lsa;")
    public class174 field2647;

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "Lkg;")
    public class212 field2648;

    @OriginalMember(owner = "client!sa", name = "M", descriptor = "Loj;")
    public class23 field2667;

    @OriginalMember(owner = "client!sa", name = "D", descriptor = "Lwf;")
    public static class306 field2658;

    @OriginalMember(owner = "client!sa", name = "J", descriptor = "Lwf;")
    public static class306 field2664;

    @OriginalMember(owner = "client!sa", name = "C", descriptor = "Lfh;")
    public class62 field2657;

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "Z")
    public boolean field2643;

    @OriginalMember(owner = "client!sa", name = "y", descriptor = "Z")
    public boolean field2653;

    @OriginalMember(owner = "client!sa", name = "I", descriptor = "Z")
    public boolean field2663;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V", line = 4)
    public static void method1178(int arg0) {
        field2642 = null;
        field2645 = null;
        field2664 = null;
        if (arg0 != 0) {
            method1181((String) null, 85, 112);
        }
        field2658 = null;
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(III)V", line = 15)
    public class174(int arg0, int arg1, int arg2) {
        this.field2660 = arg1;
        this.field2665 = arg2;
        this.field2649 = this.field2659 = arg0;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIB)V", line = 34)
    public static final void method1179(int arg0, int arg1, byte arg2) {
        if (arg2 < 65) {
            field2662 = -5;
        }
        if (arg0 == 8) {
            arg0 = 4;
        }
        field2646++;
        if (arg0 == 4 && !class297.field4556) {
            arg0 = 2;
            arg1 = 2;
        }
        if (class177.field2713 != arg0) {
            if (class165.field2535) {
                return;
            }
            if (class177.field2713 != 0) {
                class151.field2386[class177.field2713].method318();
            }
            if (arg0 != 0) {
                class145 var3 = class151.field2386[arg0];
                var3.method315();
                var3.method321(arg1);
            }
            class88.field1333 = arg1;
            class177.field2713 = arg0;
        } else if (arg0 != 0 && class88.field1333 != arg1) {
            class151.field2386[arg0].method321(arg1);
            class88.field1333 = arg1;
        }
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(Z)V", line = 126)
    public static final void method1180(boolean arg0) {
        field2666++;
        for (int var1 = -1; var1 < class175.field2678; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = field2645[var1];
            }
            class82 var3 = class64.field966[var2];
            if (var3 != null && var3.field539 > 0) {
                var3.field539--;
                if (var3.field539 == 0) {
                    var3.field548 = null;
                }
            }
        }
        if (arg0) {
            method1180(true);
        }
        for (int var4 = 0; var4 < class155.field2439; var4++) {
            int var5 = class144.field2286[var4];
            class80 var6 = class208.field3313[var5];
            if (var6 != null && var6.field539 > 0) {
                var6.field539--;
                if (var6.field539 == 0) {
                    var6.field548 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 189)
    public static final void method1181(String arg0, int arg1, int arg2) {
        field2670++;
        String var3 = class193.method1314(class285.method1867(arg0, 0), (byte) 118);
        boolean var4 = false;
        int var5 = -47 % ((arg2 - 36) / 61);
        for (int var6 = 0; var6 < class175.field2678; var6++) {
            class82 var7 = class64.field966[field2645[var6]];
            if (var7 != null && var7.field1218 != null && var7.field1218.equalsIgnoreCase(var3)) {
                if (arg1 == 1) {
                    class219.field3486++;
                    class265.field4095.method2064(255, 156);
                    class265.field4095.method2018(0, 128);
                    class265.field4095.method1997(field2645[var6], 25311);
                } else if (arg1 == 4) {
                    class304.field4752++;
                    class265.field4095.method2064(255, 180);
                    class265.field4095.method2055(field2645[var6], 1);
                    class265.field4095.method2006((byte) -26, 0);
                } else if (arg1 == 5) {
                    class142.field2249++;
                    class265.field4095.method2064(255, 76);
                    class265.field4095.method2044(1247686728, field2645[var6]);
                    class265.field4095.method2018(0, 128);
                } else if (arg1 == 6) {
                    class265.field4095.method2064(255, 102);
                    class265.field4095.method2006((byte) 53, 0);
                    class265.field4095.method2055(field2645[var6], 1);
                    class24.field302++;
                } else if (arg1 == 7) {
                    class265.field4095.method2064(255, 164);
                    class64.field976++;
                    class265.field4095.method2031((byte) 106, 0);
                    class265.field4095.method2007(false, field2645[var6]);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class343.method2390(class123.field1924 + var3, 0, false, "");
        }
    }
}
