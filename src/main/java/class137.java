import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class137 extends class248 {

    @OriginalMember(owner = "client!uj", name = "w", descriptor = "Lij;")
    public static class50 field2374 = class78.method578(122, "www");

    @OriginalMember(owner = "client!uj", name = "E", descriptor = "I")
    public static int field2381 = 0;

    @OriginalMember(owner = "client!uj", name = "J", descriptor = "Lij;")
    public static class50 field2386 = class78.method578(123, "::fps ");

    @OriginalMember(owner = "client!uj", name = "K", descriptor = "F")
    public static float field2387;

    @OriginalMember(owner = "client!uj", name = "t", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!uj", name = "v", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!uj", name = "y", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!uj", name = "z", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!uj", name = "B", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!uj", name = "C", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!uj", name = "F", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!uj", name = "G", descriptor = "I")
    public int field2383;

    @OriginalMember(owner = "client!uj", name = "H", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!uj", name = "I", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!uj", name = "x", descriptor = "Lwi;")
    public static class21 field2375;

    @OriginalMember(owner = "client!uj", name = "u", descriptor = "Lij;")
    public class50 field2372;

    @OriginalMember(owner = "client!uj", name = "D", descriptor = "[[Lce;")
    public static class10[][] field2380;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)I")
    public final int method946(byte arg0) {
        ++field2382;
        if (arg0 <= 27) {
            field2380 = null;
        }
        return (int) super.field635;
    }

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "(I)V")
    public final void method947(int arg0) {
        if (arg0 != 0) {
            field2381 = -82;
        }
        super.field4309 = class104.method785(-1) + 500L | super.field4309 & Long.MIN_VALUE;
        ++field2373;
        class8.field115.method1681(this, -354669215);
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(B)I")
    public final int method948(byte arg0) {
        ++field2385;
        if (arg0 != -118) {
            this.field2372 = null;
        }
        return (int) (255L & super.field635 >>> 32);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lwi;II)V")
    public static final void method949(class21 arg0, int arg1, int arg2) {
        ++field2384;
        if (class259.field4513 != null) {
            class259.field4513.field3581 = arg1 * 8 + 5;
            int var3 = class259.field4513.method1466((byte) -15);
            int var4 = class259.field4513.method1466((byte) -15);
            arg0.method156(var3, var4, 255);
        } else {
            class93.method713(255, true, (byte) 0, 255, 0, -69994256, (class21) null);
            if (arg2 < 106) {
                method949((class21) null, 84, -17);
            }
            class99.field1825[arg1] = arg0;
        }
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(III)Lle;")
    public static final class102 method950(int arg0, int arg1, int arg2) {
        class65 var3 = class59.field1089[arg0][arg1][arg2];
        return var3 != null && var3.field1251 != null ? var3.field1251 : null;
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(B)J")
    public final long method951(byte arg0) {
        if (arg0 != -14) {
            field2375 = null;
        }
        ++field2377;
        return super.field4309 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "(B)V")
    public final void method952(byte arg0) {
        ++field2379;
        super.field4309 |= Long.MIN_VALUE;
        if (~this.method951((byte) -14) == -1L) {
            class167.field2825.method1681(this, -354669215);
        }
        if (arg0 <= 28) {
            this.method951((byte) -96);
        }
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(II)V")
    public class137(int arg0, int arg1) {
        super.field635 = (long) arg0 << 32 | (long) arg1;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BI)Z")
    public static final boolean method953(byte arg0, int arg1) {
        ++field2376;
        if (arg0 != 90) {
            method950(21, 12, 45);
        }
        return (arg1 & 1309284) >> 20 != 0;
    }

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "(I)V")
    public static void method954(int arg0) {
        field2380 = null;
        field2375 = null;
        field2374 = null;
        if (arg0 == 14620) {
            field2386 = null;
        }
    }
}
