import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class233 {

    @OriginalMember(owner = "client!id", name = "w", descriptor = "J")
    public long field3719 = 0L;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public static int field3706 = 0;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "[I")
    public static int[] field3710 = new int[100];

    @OriginalMember(owner = "client!id", name = "h", descriptor = "[[I")
    public static int[][] field3704 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!id", name = "v", descriptor = "Ljava/lang/String;")
    public static String field3718 = "Allocating memory";

    @OriginalMember(owner = "client!id", name = "i", descriptor = "J")
    public static long field3705 = 0L;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "I")
    public static int field3713 = -1;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public int field3698;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public int field3703;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    public int field3712;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "I")
    public int field3715;

    @OriginalMember(owner = "client!id", name = "u", descriptor = "I")
    public int field3717;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "Lli;")
    public class197 field3709;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "Lli;")
    public class197 field3716;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "Lpc;")
    public static class79 field3699;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "[[[B")
    public static byte[][][] field3701;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
    public static final void method1537(int arg0) {
        field3708++;
        if (arg0 <= 92) {
            field3699 = null;
        }
        class185.field2959.method1834(0);
        class85.field1163.method1834(0);
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
    public static final void method1538(int arg0) {
        if (arg0 < 24) {
            method1538(-58);
        }
        class115.method822((byte) 78, class105.field1819);
        field3714++;
        int var1 = (class44.field522 >> 10) + (class296.field4685 >> 3);
        int var2 = (class93.field1321 >> 3) + (class119.field2014 >> 10);
        byte var3 = 8;
        byte var4 = 0;
        byte var5 = 8;
        byte var6 = 18;
        class173.field2790 = new int[var6];
        class216.field3471 = new int[var6];
        class206.field3307 = new int[var6];
        class81.field1122 = new byte[var6][];
        class69.field958 = new int[var6];
        class116.field1981 = new int[var6];
        class67.field948 = new byte[var6][];
        class221.field3527 = new int[var6];
        class39.field473 = new int[var6][4];
        class265.field4264 = new byte[var6][];
        int var7 = 0;
        for (int var8 = (var1 - 6) / 8; var8 <= ((var1 + 6) / 8); var8++) {
            for (int var10 = (var2 - 6) / 8; var10 <= ((var2 + 6) / 8); var10++) {
                int var11 = (var8 << 8) + var10;
                class69.field958[var7] = var11;
                class216.field3471[var7] = class250.field4004.method947(-24925, "m" + var8 + "_" + var10);
                class116.field1981[var7] = class250.field4004.method947(-24925, "l" + var8 + "_" + var10);
                class206.field3307[var7] = class250.field4004.method947(-24925, "n" + var8 + "_" + var10);
                class221.field3527[var7] = class250.field4004.method947(-24925, "um" + var8 + "_" + var10);
                class173.field2790[var7] = class250.field4004.method947(-24925, "ul" + var8 + "_" + var10);
                if (class206.field3307[var7] == -1) {
                    class216.field3471[var7] = -1;
                    class116.field1981[var7] = -1;
                    class221.field3527[var7] = -1;
                    class173.field2790[var7] = -1;
                }
                var7++;
            }
        }
        for (int var9 = var7; var9 < class206.field3307.length; var9++) {
            class206.field3307[var9] = -1;
            class216.field3471[var9] = -1;
            class116.field1981[var9] = -1;
            class221.field3527[var9] = -1;
            class173.field2790[var9] = -1;
        }
        class149.method1014((byte) -88, var4, var5, var3, var2, var1, false, true);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IB)V")
    public static final void method1539(int arg0, byte arg1) {
        field3707++;
        if (class21.field249 == arg0) {
            return;
        }
        if (class21.field249 == 0) {
            class205.method1375((byte) -14);
        }
        if (arg0 == 40) {
            class39.method305(false);
        }
        if (arg1 != 32) {
            return;
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        if (arg0 != 40 && class216.field3468 != null) {
            class216.field3468.method1276(-1);
            class216.field3468 = null;
        }
        if (arg0 == 25 || arg0 == 28) {
            class111.field1921 = 1;
            class67.field951 = 0;
            class101.field1527 = 1;
            class7.field106 = 0;
            class108.field1878 = 0;
            class267.method1807(true, -4);
        }
        if (arg0 == 25 || arg0 == 10) {
            class34.method238(-3);
        }
        if (arg0 == 5) {
            class245.method1613(class169.field2739, -62);
        } else {
            class153.method1037((byte) 116);
        }
        boolean var3 = class21.field249 == 5 || class21.field249 == 10 || class21.field249 == 28;
        if (var2 != var3) {
            if (var2) {
                class88.field1212 = class99.field1515;
                if (class92.field1319 == 0) {
                    class18.method126((byte) 13, 2);
                } else {
                    class175.method1217(2, false, class99.field1515, 255, 0, false, class198.field3188);
                }
                class30.field374.method1379(arg1 - 17619, false);
            } else {
                class18.method126((byte) 13, 2);
                class30.field374.method1379(arg1 - 17619, true);
            }
        }
        class21.field249 = arg0;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZIIIBII)V")
    public static final void method1540(boolean arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        if (arg4 <= 96) {
            method1539(-30, (byte) 127);
        }
        client.field3599 = arg2;
        class214.field3450 = arg3;
        field3700++;
        class99.field1513 = arg1;
        class230.field3659 = arg5;
        class171.field2761 = arg6;
        if (arg0 && class171.field2761 >= 100) {
            class119.field2014 = class214.field3450 * 128 + 64;
            class44.field522 = class99.field1513 * 128 + 64;
            class193.field3108 = class220.method1461(class44.field522, class28.field336, class119.field2014, 83) - client.field3599;
        }
        class92.field1316 = 2;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V")
    public static void method1541(byte arg0) {
        field3699 = null;
        field3710 = null;
        if (arg0 < 61) {
            field3710 = null;
        }
        field3718 = null;
        field3701 = null;
        field3704 = null;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(IB)V")
    public static final void method1542(int arg0, byte arg1) {
        field3711++;
        class185.method1267(113);
        class243.method1597(0);
        int var2 = class150.method1017(arg0, 0).field3522;
        if (var2 == 0) {
            return;
        }
        int var3 = class214.field3454[arg0];
        if (var2 == 5) {
            class224.field3556 = var3;
        }
        if (arg1 <= 18) {
            return;
        }
        if (var2 == 9) {
            class249.field3992 = var3;
        }
        if (var2 == 6) {
            class222.field3535 = var3;
        }
    }
}
