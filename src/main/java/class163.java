import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class163 {

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "I")
    public int field2383 = 16777215;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "I")
    public int field2380 = 8;

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "Lkn;")
    public static class233 field2386 = new class233();

    @OriginalMember(owner = "client!hm", name = "j", descriptor = "F")
    public static float field2389;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "I")
    public int field2381;

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "I")
    public int field2382;

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!hm", name = "i", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!hm", name = "k", descriptor = "I")
    public int field2390;

    @OriginalMember(owner = "client!hm", name = "l", descriptor = "I")
    public int field2391;

    @OriginalMember(owner = "client!hm", name = "m", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!hm", name = "n", descriptor = "I")
    public int field2393;

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "Z")
    public boolean field2387;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)V")
    public static final void method1156(byte arg0) {
        class128.field1810 = null;
        if (arg0 <= 110) {
            field2389 = -0.76818365F;
        }
        field2384++;
        class181.field2582 = false;
        class268.method1710(true);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(BILtl;)V")
    private final void method1157(byte arg0, int arg1, class91 arg2) {
        if (arg0 <= 29) {
            this.method1159(null, (byte) 4);
        }
        if (arg1 == 1) {
            this.field2380 = arg2.method631(10494);
        } else if (arg1 == 2) {
            this.field2387 = true;
        } else if (arg1 == 3) {
            this.field2390 = arg2.method643((byte) 124);
            this.field2393 = arg2.method643((byte) 105);
            this.field2391 = arg2.method643((byte) 113);
        } else if (arg1 == 4) {
            this.field2381 = arg2.method618((byte) 100);
        } else if (arg1 == 5) {
            this.field2382 = arg2.method631(10494);
        } else if (arg1 == 6) {
            this.field2383 = arg2.method641(32455);
        }
        field2392++;
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(B)V")
    public static void method1158(byte arg0) {
        field2386 = null;
        if (arg0 != 2) {
            field2388 = 66;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Ltl;B)V")
    public final void method1159(class91 arg0, byte arg1) {
        if (arg1 != -124) {
            this.field2383 = 89;
        }
        while (true) {
            int var3 = arg0.method618((byte) 100);
            if (var3 == 0) {
                field2385++;
                return;
            }
            this.method1157((byte) 115, var3, arg0);
        }
    }
}
