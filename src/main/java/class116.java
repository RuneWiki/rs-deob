import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class116 {

    @OriginalMember(owner = "client!u", name = "r", descriptor = "B")
    private byte field2223;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "I")
    public int field2214;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "I")
    public int field2220;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public int field2208;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "I")
    public int field2210;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "I")
    public int field2221;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "Lhj;")
    public static class69 field2207 = class181.method1318("mapfunction", (byte) -117);

    @OriginalMember(owner = "client!u", name = "j", descriptor = "Lhj;")
    public static class69 field2215 = class181.method1318("scrollen:", (byte) -120);

    @OriginalMember(owner = "client!u", name = "l", descriptor = "I")
    public static int field2217 = 0;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "Lnb;")
    public static class199 field2219 = new class199(64);

    @OriginalMember(owner = "client!u", name = "s", descriptor = "Lta;")
    public static class241 field2224 = new class241(5);

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "J")
    public static long field2213;

    @OriginalMember(owner = "client!u", name = "q", descriptor = "[[Ltk;")
    public static class50[][] field2222;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ZI)Lhj;")
    public static final class69 method854(boolean arg0, int arg1) {
        if (arg0) {
            return null;
        } else {
            field2218++;
            return class9.method42(54, new class69[] { class98.method727(-229, arg1 >> 24 & 0xFF), class149.field2783, class98.method727(-229, arg1 >> 16 & 0xFF), class149.field2783, class98.method727(-229, arg1 >> 8 & 0xFF), class149.field2783, class98.method727(-229, arg1 & 0xFF) });
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
    public static final void method855(int arg0) {
        client.method1151(89);
        System.gc();
        class115.method851(31, 25);
        field2216++;
        if (arg0 != -3658) {
            method854(false, -109);
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(I)I")
    public final int method856(int arg0) {
        field2211++;
        if (arg0 != -2) {
            this.field2214 = 68;
        }
        return (this.field2223 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIZI)I")
    public static final int method857(int arg0, int arg1, boolean arg2, int arg3) {
        if (!arg2) {
            field2224 = null;
        }
        field2212++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(I)V")
    public static void method858(int arg0) {
        field2222 = null;
        field2224 = null;
        field2219 = null;
        field2207 = null;
        if (arg0 <= 19) {
            field2222 = null;
        }
        field2215 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)I")
    public final int method859(byte arg0) {
        int var2 = 121 % ((arg0 + 42) / 41);
        field2206++;
        return this.field2223 & 0x7;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
    public class116() {
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lfh;)V")
    public class116(class128 arg0) {
        this.field2223 = arg0.method950(1495791448);
        this.field2214 = arg0.method912(68);
        this.field2220 = arg0.method923(true);
        this.field2208 = arg0.method923(true);
        this.field2210 = arg0.method923(true);
        this.field2221 = arg0.method923(true);
    }
}
