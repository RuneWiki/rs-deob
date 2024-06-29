import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class134 extends class202 {

    @OriginalMember(owner = "client!hf", name = "P", descriptor = "I")
    public static volatile int field2366 = 0;

    @OriginalMember(owner = "client!hf", name = "R", descriptor = "I")
    public static int field2368 = 0;

    @OriginalMember(owner = "client!hf", name = "cb", descriptor = "Lsb;")
    private static class98 field2378 = class47.method368("glow1:", 0);

    @OriginalMember(owner = "client!hf", name = "eb", descriptor = "Lsb;")
    public static class98 field2380 = field2378;

    @OriginalMember(owner = "client!hf", name = "fb", descriptor = "Lsb;")
    public static class98 field2381 = field2378;

    @OriginalMember(owner = "client!hf", name = "hb", descriptor = "I")
    public static int field2383 = 0;

    @OriginalMember(owner = "client!hf", name = "Y", descriptor = "B")
    public static byte field2374;

    @OriginalMember(owner = "client!hf", name = "N", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!hf", name = "O", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!hf", name = "Q", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!hf", name = "U", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!hf", name = "V", descriptor = "I")
    public int field2371;

    @OriginalMember(owner = "client!hf", name = "W", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!hf", name = "X", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!hf", name = "ab", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!hf", name = "db", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!hf", name = "gb", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!hf", name = "ib", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!hf", name = "T", descriptor = "Lui;")
    public static class73 field2369;

    @OriginalMember(owner = "client!hf", name = "bb", descriptor = "Lsb;")
    public class98 field2377;

    @OriginalMember(owner = "client!hf", name = "Z", descriptor = "[Lqh;")
    public static class24[] field2375;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IB)Z")
    public static final boolean method1006(int arg0, byte arg1) {
        ++field2372;
        if (arg1 != -107) {
            return true;
        } else {
            return ~((arg0 & 2837256) >> 21) != -1;
        }
    }

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "(B)V")
    public static void method1007(byte arg0) {
        if (arg0 > -120) {
            method1013(-56);
        }
        field2375 = null;
        field2378 = null;
        field2380 = null;
        field2381 = null;
        field2369 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)[Lqh;")
    public static final class24[] method1008(boolean arg0) {
        ++field2370;
        class24[] var1 = new class24[class110.field1956];
        if (arg0) {
            method1007((byte) -17);
        }
        for (int var2 = 0; ~var2 > ~class110.field1956; ++var2) {
            var1[var2] = new class24(class144.field2538, class101.field1790, class253.field4422[var2], class9.field207[var2], class245.field4326[var2], class164.field2958[var2], class204.field3491[var2], class33.field572);
        }
        class125.method932(true);
        return var1;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)J")
    public final long method1009(int arg0) {
        ++field2379;
        return arg0 != 2 ? 45L : super.field3439 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(II)V")
    public class134(int arg0, int arg1) {
        super.field4061 = (long) arg0 << 32 | (long) arg1;
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(Z)I")
    public final int method1010(boolean arg0) {
        ++field2382;
        return arg0 ? 116 : (int) super.field4061;
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(Z)V")
    public final void method1011(boolean arg0) {
        super.field3439 |= Long.MIN_VALUE;
        if (this.method1009(2) == 0L) {
            class75.field1313.method128(16, this);
        }
        if (arg0) {
            ++field2384;
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)I")
    public final int method1012(int arg0) {
        ++field2365;
        if (arg0 != 0) {
            this.method1009(14);
        }
        return (int) (255L & super.field4061 >>> 32);
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)I")
    public static final int method1013(int arg0) {
        if (arg0 != 2) {
            method1006(-50, (byte) -22);
        }
        ++field2373;
        return 2;
    }

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "(I)V")
    public final void method1014(int arg0) {
        ++field2376;
        super.field3439 = Long.MIN_VALUE & super.field3439 | class164.method1183((byte) 80) - -500L;
        if (arg0 != -28472811) {
            method1006(98, (byte) -107);
        }
        class146.field2555.method128(arg0 ^ -28472827, this);
    }
}
