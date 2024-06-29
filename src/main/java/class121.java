import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class121 extends class168 {

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
    private final int field2256;

    @OriginalMember(owner = "client!lb", name = "C", descriptor = "I")
    private final int field2269;

    @OriginalMember(owner = "client!lb", name = "D", descriptor = "I")
    private final int field2270;

    @OriginalMember(owner = "client!lb", name = "F", descriptor = "I")
    private final int field2272;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "Lqe;")
    private static class179 field2259 = class206.method1380("Loaded sprites", (byte) -126);

    @OriginalMember(owner = "client!lb", name = "y", descriptor = "Lqe;")
    private static class179 field2265 = class206.method1380("Walk here", (byte) -128);

    @OriginalMember(owner = "client!lb", name = "A", descriptor = "Lqe;")
    public static class179 field2267 = class206.method1380("details)3dat", (byte) 99);

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "I")
    public static int field2263 = 1;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "Lqe;")
    public static class179 field2260 = field2265;

    @OriginalMember(owner = "client!lb", name = "G", descriptor = "Lqe;")
    public static class179 field2273 = field2259;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!lb", name = "E", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "Lpc;")
    public static class166 field2255;

    @OriginalMember(owner = "client!lb", name = "B", descriptor = "Z")
    public static boolean field2268;

    @OriginalMember(owner = "client!lb", name = "x", descriptor = "[[S")
    public static short[][] field2264;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZII)V")
    public final void method473(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            this.method471(-125, -72, (byte) -96);
        }
        ++field2266;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIB)V")
    public final void method471(int arg0, int arg1, byte arg2) {
        int var4 = -95 / ((arg2 - -55) / 63);
        ++field2254;
        int var5 = this.field2269 * arg1 >> 12;
        int var6 = this.field2256 * arg1 >> 12;
        int var7 = this.field2270 * arg0 >> 12;
        int var8 = this.field2272 * arg0 >> 12;
        class50.method333(var5, 94, var6, var7, super.field3027, var8);
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
    public static final void method773(int arg0) {
        if (arg0 == 0) {
            ++field2271;
            try {
                if (class143.field2596 != null) {
                    byte[] var1 = class143.field2596.method600((byte) 114);
                    if (var1 != null) {
                        class185 var2 = new class185(var1);
                        class36.field798 = var2.method1252(2);
                        class13.field326 = new class163[class36.field798];
                        for (int var3 = 0; var3 < class36.field798; ++var3) {
                            class163 var4 = class13.field326[var3] = new class163();
                            int var5 = var2.method1252(2);
                            var4.field2943 = ~(32768 & var5) != -1;
                            var4.field2942 = 32767 & var5;
                            var4.field2930 = var2.method1242(-128);
                            var4.field2937 = var2.method1225((byte) -77);
                            var4.field2936 = var3;
                            var4.field2932 = class207.method1381(var2.method1252(2), 77);
                        }
                        class114.method733(class13.field326.length + -1, -126, class13.field326, 0);
                        class143.field2596 = null;
                        class138.field2541 = true;
                        return;
                    }
                } else {
                    class143.field2596 = new class91(class25.field588, class78.method502((byte) -83, new class179[] { class88.field1678, class148.method949((byte) -14, class113.field2129), class81.field1573 }).method1167(false));
                }
            } catch (Exception var7) {
                var7.printStackTrace();
                class143.field2596 = null;
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IJ)Lqe;")
    public static final class179 method774(int arg0, long arg1) {
        ++field2261;
        return arg0 != 10 ? null : class34.method224((byte) -118, arg1, false, 10);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)V")
    public final void method474(int arg0, int arg1, int arg2) {
        ++field2257;
        if (arg0 != 24730) {
            field2273 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
    public static void method775(byte arg0) {
        if (arg0 >= -61) {
            field2259 = null;
        }
        field2265 = null;
        field2267 = null;
        field2259 = null;
        field2264 = null;
        field2255 = null;
        field2273 = null;
        field2260 = null;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(IIIIII)V")
    public class121(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field2256 = arg2;
        this.field2269 = arg0;
        this.field2270 = arg1;
        this.field2272 = arg3;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILqe;)V")
    public static final void method776(int arg0, class179 arg1) {
        ++field2262;
        class25 var2 = class61.method411(arg1, 107);
        if (var2 != null) {
            class139.field2570 = -var2.field583 + class202.field3736 + class66.field1350;
            int var3 = 27 % ((arg0 - -30) / 56);
            class131.field2386 = -class176.field3209 + var2.field581;
            int var4 = -((int) ((double) class48.field1036.field73 / class150.field2698)) + class139.field2570;
            int var5 = (int) ((double) class48.field1036.field169 / class150.field2698) + class131.field2386;
            int var6 = -((int) ((double) class48.field1036.field169 / class150.field2698)) + class131.field2386;
            int var7 = (int) ((double) class48.field1036.field73 / class150.field2698) + class139.field2570;
            if (var4 < 0) {
                class139.field2570 = (int) ((double) class48.field1036.field73 / class150.field2698);
            }
            if (~var7 < ~class202.field3736) {
                class139.field2570 = -((int) ((double) class48.field1036.field73 / class150.field2698)) + class202.field3736;
            }
            if (~var6 > -1) {
                class131.field2386 = (int) ((double) class48.field1036.field169 / class150.field2698);
            }
            if (~var5 < ~class146.field2655) {
                class131.field2386 = -((int) ((double) class48.field1036.field169 / class150.field2698)) + class146.field2655;
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIII)V")
    public static final void method777(int arg0, int arg1, int arg2, int arg3) {
        if (~class151.field2714 != -1 && arg1 != 0 && ~class220.field4072 > -51 && arg0 != -1) {
            class148.field2669[class220.field4072] = arg0;
            class161.field2914[class220.field4072] = arg1;
            class92.field1739[class220.field4072] = arg2;
            class99.field1847[class220.field4072] = null;
            class227.field4199[class220.field4072] = 0;
            ++class220.field4072;
        }
        ++field2258;
        int var4 = 118 / ((arg3 - -72) / 32);
    }
}
