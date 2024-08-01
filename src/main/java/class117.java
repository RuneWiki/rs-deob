import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("me")
public class class117 extends class71 {

    @OriginalMember(owner = "me", name = "r", descriptor = "I")
    public int field2310;

    @OriginalMember(owner = "me", name = "s", descriptor = "Llf;")
    private static class109 field2311 = class35.method275("Continue", 2);

    @OriginalMember(owner = "me", name = "o", descriptor = "Llf;")
    public static class109 field2307 = field2311;

    @OriginalMember(owner = "me", name = "q", descriptor = "Lrc;")
    public static class160 field2309 = new class160(30);

    @OriginalMember(owner = "me", name = "x", descriptor = "Llf;")
    private static class109 field2316 = class35.method275("Loading )2 please wait)3", 2);

    @OriginalMember(owner = "me", name = "w", descriptor = "Llf;")
    public static class109 field2315 = field2316;

    @OriginalMember(owner = "me", name = "v", descriptor = "Lrc;")
    public static class160 field2314 = new class160(30);

    @OriginalMember(owner = "me", name = "y", descriptor = "Lrc;")
    public static class160 field2317 = new class160(64);

    @OriginalMember(owner = "me", name = "n", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "me", name = "p", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "me", name = "t", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "me", name = "u", descriptor = "Lbg;")
    public static class18 field2313;

    @OriginalMember(owner = "me", name = "z", descriptor = "Lbg;")
    public static class18 field2318;

    @OriginalMember(owner = "me", name = "c", descriptor = "(B)V")
    public static final void method856(byte arg0) {
        class70.field1360.method1088(-51);
        class15.field281.method1088(-51);
        if (arg0 != -7) {
            method859(null, null, (byte) -93, null);
        }
        field2306++;
        class8.field111.method1088(arg0 ^ 0x34);
    }

    @OriginalMember(owner = "me", name = "a", descriptor = "(I)V")
    public static final void method857(int arg0) {
        field2308++;
        int var1 = class95.field1934.method1341((byte) 69, 8);
        if (var1 < class157.field2956) {
            for (int var2 = var1; var2 < class157.field2956; var2++) {
                class126.field2437[class184.field3479++] = class125.field2405[var2];
            }
        }
        if (arg0 != 14099) {
            method858((byte) -44);
        }
        if (var1 > class157.field2956) {
            throw new RuntimeException("gppov1");
        }
        class157.field2956 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class125.field2405[var3];
            class184 var5 = class202.field3975[var4];
            int var6 = class95.field1934.method1341((byte) 126, 1);
            if (var6 == 0) {
                class125.field2405[class157.field2956++] = var4;
                var5.field3613 = class143.field2754;
            } else {
                int var7 = class95.field1934.method1341((byte) 87, 2);
                if (var7 == 0) {
                    class125.field2405[class157.field2956++] = var4;
                    var5.field3613 = class143.field2754;
                    class102.field2018[class98.field1967++] = var4;
                } else if (var7 == 1) {
                    class125.field2405[class157.field2956++] = var4;
                    var5.field3613 = class143.field2754;
                    int var8 = class95.field1934.method1341((byte) 97, 3);
                    var5.method1272(false, var8, 101);
                    int var9 = class95.field1934.method1341((byte) 101, 1);
                    if (var9 == 1) {
                        class102.field2018[class98.field1967++] = var4;
                    }
                } else if (var7 == 2) {
                    class125.field2405[class157.field2956++] = var4;
                    var5.field3613 = class143.field2754;
                    int var10 = class95.field1934.method1341((byte) 99, 3);
                    var5.method1272(true, var10, -115);
                    int var11 = class95.field1934.method1341((byte) 92, 3);
                    var5.method1272(true, var11, 90);
                    int var12 = class95.field1934.method1341((byte) 107, 1);
                    if (var12 == 1) {
                        class102.field2018[class98.field1967++] = var4;
                    }
                } else if (var7 == 3) {
                    class126.field2437[class184.field3479++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "me", name = "d", descriptor = "(B)V")
    public static void method858(byte arg0) {
        field2311 = null;
        field2309 = null;
        field2315 = null;
        field2318 = null;
        field2316 = null;
        field2317 = null;
        field2307 = null;
        field2314 = null;
        field2313 = null;
        int var1 = -92 / ((-arg0 - 5) / 34);
    }

    @OriginalMember(owner = "me", name = "a", descriptor = "(Llf;Lbg;BLlf;)[Lkf;")
    public static final class100[] method859(class109 arg0, class18 arg1, byte arg2, class109 arg3) {
        if (arg2 <= 73) {
            return null;
        } else {
            int var4 = arg1.method151((byte) 106, arg0);
            field2312++;
            int var5 = arg1.method154((byte) -105, arg3, var4);
            return class47.method321(127, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "me", name = "<init>", descriptor = "()V")
    public class117() {
    }

    @OriginalMember(owner = "me", name = "<init>", descriptor = "(I)V")
    public class117(int arg0) {
        this.field2310 = arg0;
    }
}
