import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class99 {

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "Lid;")
    public static class60 field2414 = class11.method72("null", (byte) 8);

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "Lid;")
    private static class60 field2415 = class11.method72("Starting game engine)3)3)3", (byte) -43);

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "Lid;")
    public static class60 field2412 = class11.method72("leuchten3:", (byte) 98);

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "[I")
    public static int[] field2416 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "Lid;")
    public static class60 field2419 = field2415;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "Z")
    public static volatile boolean field2411 = true;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "Lie;")
    public static class61 field2418;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
    public static final void method780(byte arg0) {
        if (arg0 != 55) {
            field2419 = null;
        }
        field2413++;
        for (class82 var1 = (class82) class25.field610.method496(arg0 + 10098); var1 != null; var1 = (class82) class25.field610.method500(-1)) {
            if (class46.field1222 != var1.field2048 || var1.field2064 < class82.field2065) {
                var1.method1009((byte) 99);
            } else if (var1.field2057 <= class82.field2065) {
                if (var1.field2056 > 0) {
                    class53 var2 = class5.field83[var1.field2056 - 1];
                    if (var2 != null && var2.field854 >= 0 && var2.field854 < 13312 && var2.field828 >= 0 && var2.field828 < 13312) {
                        var1.method693(var2.field828, class50.method381(var1.field2048, var2.field828, var2.field854, (byte) 10) - var1.field2034, class82.field2065, arg0 - 88, var2.field854);
                    }
                }
                if (var1.field2056 < 0) {
                    int var3 = -var1.field2056 - 1;
                    class1 var4;
                    if (class140.field3197 == var3) {
                        var4 = class107.field2640;
                    } else {
                        var4 = class81.field2016[var3];
                    }
                    if (var4 != null && var4.field854 >= 0 && var4.field854 < 13312 && var4.field828 >= 0 && var4.field828 < 13312) {
                        var1.method693(var4.field828, class50.method381(var1.field2048, var4.field828, var4.field854, (byte) 10) - var1.field2034, class82.field2065, arg0 ^ 0xFFFFFFC1, var4.field854);
                    }
                }
                var1.method692(15417, class75.field1802);
                class43.field1151.method589(class46.field1222, (int) var1.field2043, (int) var1.field2032, (int) var1.field2033, 60, var1, var1.field2047, -1, false);
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
    public static void method781(int arg0) {
        field2415 = null;
        field2419 = null;
        field2414 = null;
        if (arg0 != 0) {
            field2412 = null;
        }
        field2412 = null;
        field2416 = null;
        field2418 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BI)Z")
    public static final boolean method782(byte arg0, int arg1) {
        field2417++;
        if (arg1 < 32) {
            return false;
        }
        int var2 = -116 % ((arg0 - 72) / 33);
        if (arg1 == 127) {
            return false;
        } else {
            return arg1 < 129 || arg1 > 159;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BLie;)V")
    public static final void method783(byte arg0, class61 arg1) {
        field2410++;
        class69.field1648 = arg1;
        if (arg0 < 7) {
            field2412 = null;
        }
    }
}
