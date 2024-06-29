import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class175 {

    @OriginalMember(owner = "client!eu", name = "e", descriptor = "I")
    public static int field2455 = 0;

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "Loba;")
    public static class324 field2452 = new class324();

    @OriginalMember(owner = "client!eu", name = "h", descriptor = "I")
    public static int field2458 = 0;

    @OriginalMember(owner = "client!eu", name = "f", descriptor = "J")
    public static long field2456 = 0L;

    @OriginalMember(owner = "client!eu", name = "i", descriptor = "[I")
    public static int[] field2459 = new int[14];

    @OriginalMember(owner = "client!eu", name = "g", descriptor = "Lvg;")
    public static class622 field2457 = new class622(30, 7);

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!eu", name = "d", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!eu", name = "j", descriptor = "Lmv;")
    public static class295 field2460;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)V")
    public static void method1198(int arg0) {
        field2452 = null;
        field2460 = null;
        if (arg0 == -3752) {
            field2457 = null;
            field2459 = null;
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IB)V")
    public static final void method1199(int arg0, byte arg1) {
        if (arg1 > 84) {
            field2453++;
            class489 var2 = class704.method3942(arg0, 9, 0);
            var2.method2799(-105);
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(B)Lhi;")
    public static final class415 method1200(byte arg0) {
        if (arg0 != -32) {
            method1200((byte) -124);
        }
        field2451++;
        if (class55.field841 == null || class399.field6014 == null) {
            return null;
        }
        for (class415 var1 = (class415) class399.field6014.method3706(arg0 ^ 0xFFFFFFF2); var1 != null; var1 = (class415) class399.field6014.method3706(18)) {
            class168 var2 = class55.field834.method2757(var1.field6142, (byte) -46);
            if (var2 != null && var2.field2378 && var2.method1173(class55.field836, 119)) {
                return var1;
            }
        }
        return null;
    }
}
