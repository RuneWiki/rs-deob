import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class133 extends class151 {

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "Lbd;")
    public static class162 field2376 = class17.method142(0, "::clientjs5drop");

    @OriginalMember(owner = "client!vh", name = "u", descriptor = "Lqb;")
    public static class209 field2377 = new class209(64);

    @OriginalMember(owner = "client!vh", name = "x", descriptor = "F")
    public static float field2380;

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!vh", name = "v", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!vh", name = "w", descriptor = "I")
    public int field2379;

    @OriginalMember(owner = "client!vh", name = "z", descriptor = "I")
    public int field2382;

    @OriginalMember(owner = "client!vh", name = "A", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!vh", name = "B", descriptor = "I")
    public int field2384;

    @OriginalMember(owner = "client!vh", name = "y", descriptor = "[[[B")
    public static byte[][][] field2381;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZI)I", line = 15)
    public static final int method1050(boolean arg0, int arg1) {
        field2383++;
        if (!arg0) {
            field2380 = 0.6161358F;
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)Z", line = 29)
    public static final boolean method1051(int arg0) {
        field2378++;
        if (arg0 != 22050) {
            field2380 = -0.7802084F;
        }
        try {
            if (class9.field105 == 2) {
                if (class22.field348 == null) {
                    class22.field348 = class33.method263(class34.field548, class207.field3500, class102.field1864);
                    if (class22.field348 == null) {
                        return false;
                    }
                }
                if (class295.field4948 == null) {
                    class295.field4948 = new class141(class203.field3436, class317.field5342);
                }
                if (class48.field764.method1927(-102, 22050, class22.field348, class282.field4793, class295.field4948)) {
                    class48.field764.method1951(arg0 ^ 0xFFFFA9BD);
                    class48.field764.method1925(false, class126.field2295);
                    class48.field764.method1926(class314.field5297, class22.field348, arg0 - 22051);
                    class295.field4948 = null;
                    class9.field105 = 0;
                    class34.field548 = null;
                    class22.field348 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class48.field764.method1931(74);
            class22.field348 = null;
            class295.field4948 = null;
            class34.field548 = null;
            class9.field105 = 0;
        }
        return false;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V", line = 84)
    public static void method1052(int arg0) {
        field2381 = (byte[][][]) null;
        field2377 = null;
        if (arg0 != 255) {
            method1050(false, -128);
        }
        field2376 = null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B[BII)I", line = 98)
    public static final int method1053(byte arg0, byte[] arg1, int arg2, int arg3) {
        field2375++;
        int var4 = -1;
        for (int var5 = arg3; var5 < arg2; var5++) {
            var4 = class217.field3616[(arg1[var5] ^ var4) & 0xFF] ^ var4 >>> 8;
        }
        if (arg0 >= -4) {
            method1051(24);
        }
        return ~var4;
    }
}
