import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class167 {

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "Lcf;")
    public static class93 field2941 = class147.method1066("<col=00ff00>", -48);

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "[I")
    public static int[] field2940 = new int[14];

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "Lcf;")
    public static class93 field2943 = class147.method1066("http:)4)4", -48);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "Lcf;")
    public static class93 field2937 = class147.method1066("null", -48);

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
    public static int field2945 = 0;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "Lcf;")
    public static class93 field2947 = class147.method1066("cyan:", -48);

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "[I")
    public static int[] field2949 = new int[8];

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
    public static int field2951 = 0;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "Z")
    public static boolean field2950 = false;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "Lnh;")
    public static class54 field2939 = new class54(64);

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "J")
    public static long field2946;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "[I")
    public static int[] field2942;

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "[[Z")
    public static boolean[][] field2953;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)I")
    public static final int method1207(int arg0) {
        if (arg0 != 0) {
            field2950 = false;
        }
        field2944++;
        return ((class143.field2480 == 0 ? 0 : 1) << 22) + (class280.field5052 & 0x3 << 11) + ((class154.field2697 ? 1 : 0) << 10) + ((class280.field5059 ? 1 : 0) << 8) + ((class170.field3000 ? 1 : 0) << 4) + (class66.field1216 & 0x7) + ((class152.field2658 ? 1 : 0) << 3) + ((class154.field2704 ? 1 : 0) << 5) + ((class46.field739 ? 1 : 0) << 6) + (((class230.field4124 ? 1 : 0) << 7) - (-((class119.field2117 ? 1 : 0) << 9) + (-((class235.field4195 ? 1 : 0) << 13) - ((class110.field1876 ? 1 : 0) << 15)) - (((class207.field3717 ? 1 : 0) << 16) + ((class161.field2832 ? 1 : 0) << 19)) - (((class267.field4756 == 0 ? 0 : 1) << 20) + (((class195.field3552 == 0 ? 0 : 1) << 21) - -(class91.method628() << 23)))));
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V")
    public static final void method1208(int arg0) {
        if (arg0 >= -67) {
            field2945 = -96;
        }
        field2938++;
        if (class237.field4235 != null) {
            class237.field4235.method1715(-3139);
        }
        if (class11.field155 != null) {
            class11.field155.method1715(-3139);
        }
        class283.method1940(2, class161.field2832, true, 22050);
        class237.field4235 = class133.method970(0, 22050, class169.field2967, false, class190.field3481);
        class237.field4235.method1721((byte) 54, class243.field4389);
        class11.field155 = class133.method970(1, 2048, class169.field2967, false, class190.field3481);
        class11.field155.method1721((byte) 34, class35.field543);
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)V")
    public static final void method1209(int arg0) {
        if (arg0 >= 40) {
            field2948++;
            class50.field815.method300(0);
        }
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(I)V")
    public static void method1210(int arg0) {
        field2947 = null;
        field2942 = null;
        field2949 = null;
        int var1 = -63 % ((arg0 - 15) / 32);
        field2939 = null;
        field2937 = null;
        field2953 = null;
        field2941 = null;
        field2943 = null;
        field2940 = null;
    }
}
