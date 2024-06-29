import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class117 {

    @OriginalMember(owner = "client!n", name = "c", descriptor = "J")
    public long field2370 = 0L;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "I")
    public static int field2372 = 0;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "Leh;")
    public static class47 field2371 = null;

    @OriginalMember(owner = "client!n", name = "r", descriptor = "J")
    public static long field2385 = 0L;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "Leh;")
    public static class47 field2379 = class195.method1282((byte) -4, "nav");

    @OriginalMember(owner = "client!n", name = "u", descriptor = "Leh;")
    public static class47 field2388 = class195.method1282((byte) -4, "Unerwartete Antwort vom Anmelde)2Server");

    @OriginalMember(owner = "client!n", name = "q", descriptor = "[[B")
    public static byte[][] field2384 = new byte[50][];

    @OriginalMember(owner = "client!n", name = "v", descriptor = "Leh;")
    public static class47 field2389 = class195.method1282((byte) -4, "<col=ffffff>");

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public int field2368;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "I")
    public int field2375;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "I")
    public int field2376;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "I")
    public int field2378;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "I")
    public int field2383;

    @OriginalMember(owner = "client!n", name = "s", descriptor = "I")
    public int field2386;

    @OriginalMember(owner = "client!n", name = "t", descriptor = "I")
    public int field2387;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "Lkb;")
    public class92 field2374;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "Lkb;")
    public class92 field2380;

    @OriginalMember(owner = "client!n", name = "o", descriptor = "[I")
    public static int[] field2382;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V")
    public static void method916(byte arg0) {
        field2384 = null;
        field2379 = null;
        field2371 = null;
        field2382 = null;
        int var1 = -26 % ((arg0 + 73) / 39);
        field2389 = null;
        field2388 = null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
    public static final void method917(int arg0) {
        class83.field1776.method993(1);
        field2373++;
        int var1 = -32 % ((-arg0 - 47) / 42);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)V")
    public static final void method918(boolean arg0) {
        class92.field1925 = 0;
        class94.field1942 = 0;
        class77.method672(19096);
        field2381++;
        class194.method1271(-124);
        class99.method807(-23927);
        class155.method1075(true);
        for (int var1 = 0; var1 < class92.field1925; var1++) {
            int var3 = class107.field2230[var1];
            if (class18.field362 != class40.field795[var3].field3326) {
                class40.field795[var3] = null;
            }
        }
        if (arg0) {
            method917(38);
        }
        if (class14.field304 != class22.field418.field1454) {
            throw new RuntimeException("gpp1 pos:" + class22.field418.field1454 + " psize:" + class14.field304);
        }
        for (int var2 = 0; var2 < class130.field2575; var2++) {
            if (class40.field795[class146.field2853[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class130.field2575);
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(III)Leh;")
    public static final class47 method919(int arg0, int arg1, int arg2) {
        int var3 = arg0 - arg1;
        field2369++;
        if (var3 < -9) {
            return class151.field2959;
        } else if (var3 < -6) {
            return class64.field1395;
        } else if (var3 < -3) {
            return class9.field190;
        } else if (var3 < 0) {
            return class108.field2241;
        } else if (var3 > 9) {
            return class193.field3747;
        } else if (arg2 > ~var3) {
            return class141.field2778;
        } else if (var3 > 3) {
            return class135.field2653;
        } else if (var3 > 0) {
            return class182.field3479;
        } else {
            return class25.field489;
        }
    }
}
