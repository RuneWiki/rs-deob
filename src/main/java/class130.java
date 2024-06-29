import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class130 {

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "Lmh;")
    public static class128 field2268 = class22.method156(127, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "I")
    public static int field2272 = 0;

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "I")
    public static int field2270 = 0;

    @OriginalMember(owner = "client!bm", name = "j", descriptor = "Lmh;")
    public static class128 field2277 = class22.method156(125, "blaugr-Un:");

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "Lmh;")
    private static class128 field2274 = class22.method156(126, "Loaded config");

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "Lmh;")
    public static class128 field2275 = field2274;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!bm", name = "l", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!bm", name = "m", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!bm", name = "k", descriptor = "Ldj;")
    public static class314 field2278;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V", line = 6)
    public static final void method874(int arg0) {
        if (class143.field2441 < 0) {
            class143.field2441 = 0;
            class30.field663 = -1;
            class102.field1756 = -1;
        }
        if (class5.field110 < class143.field2441) {
            class30.field663 = -1;
            class102.field1756 = -1;
            class143.field2441 = class5.field110;
        }
        if (arg0 != -1) {
            method876(-95, -37);
        }
        field2279++;
        if (class310.field5255 < 0) {
            class30.field663 = -1;
            class310.field5255 = 0;
            class102.field1756 = -1;
        }
        if (class155.field2671 < class310.field5255) {
            class102.field1756 = -1;
            class30.field663 = -1;
            class310.field5255 = class155.field2671;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)I", line = 46)
    public static final int method875(int arg0, int arg1) {
        if (arg0 == 255) {
            field2269++;
            return arg1 & 0xFF;
        } else {
            return -100;
        }
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(II)Z", line = 57)
    public static final boolean method876(int arg0, int arg1) {
        field2273++;
        if (arg1 != 0) {
            method875(91, -87);
        }
        if (class298.field5082 != arg0) {
            return false;
        }
        class132.field2300 = true;
        class298.field5082++;
        if (class298.field5082 > 65535) {
            class298.field5082 = 0;
        }
        return true;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Z)V", line = 125)
    public static void method877(boolean arg0) {
        field2268 = null;
        field2275 = null;
        field2277 = null;
        field2274 = null;
        field2278 = null;
        if (!arg0) {
            method875(-20, -33);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lmh;IILmh;)V", line = 139)
    public static final void method878(class128 arg0, int arg1, int arg2, class128 arg3) {
        field2276++;
        class273.field4736 = arg3;
        class273.field4728 = arg0;
        class173.field3024 = arg1;
        if (class273.field4736.method855(class273.field4733, 255) || class273.field4728.method855(class273.field4733, arg2 + 255)) {
            class77.field1413 = 3;
        } else if (class105.field1793 == -1) {
            class252.field4362 = 0;
            class77.field1413 = -3;
            class203.field3583 = 1;
            class194 var4 = new class194(128);
            var4.method1352(7528, 10);
            var4.method1324((int) (Math.random() * 99999.0D), arg2 + 15803);
            var4.method1324(516, arg2 ^ 0x3DBB);
            var4.method1344(arg2 + 48, class273.field4736.method819((byte) 91));
            var4.method1337(-67, (int) (Math.random() * 9.9999999E7D));
            var4.method1343((byte) 66, class273.field4728);
            var4.method1337(arg2 ^ 0xFFFFFF84, (int) (Math.random() * 9.9999999E7D));
            var4.method1305((byte) 102, class143.field2446, class9.field195);
            class71.field1320.field3380 = arg2;
            class71.field1320.method1352(arg2 + 7528, 34);
            class71.field1320.method1352(7528, var4.field3380);
            class71.field1320.method1303((byte) -84, var4.field3380, 0, var4.field3417);
        } else {
            class313.method2133(arg2 + 99);
        }
    }
}
