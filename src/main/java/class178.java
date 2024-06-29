import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class178 {

    @OriginalMember(owner = "client!cw", name = "f", descriptor = "I")
    private int field2385;

    @OriginalMember(owner = "client!cw", name = "g", descriptor = "Z")
    private boolean field2386;

    @OriginalMember(owner = "client!cw", name = "h", descriptor = "Z")
    private boolean field2387;

    @OriginalMember(owner = "client!cw", name = "k", descriptor = "I")
    private int field2390;

    @OriginalMember(owner = "client!cw", name = "j", descriptor = "Lms;")
    public static class758 field2389 = new class758();

    @OriginalMember(owner = "client!cw", name = "l", descriptor = "Lkk;")
    public static class188 field2391 = new class188(64);

    @OriginalMember(owner = "client!cw", name = "m", descriptor = "I")
    public static int field2392 = 16777215;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!cw", name = "d", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!cw", name = "i", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!cw", name = "e", descriptor = "[[Z")
    public static boolean[][] field2384;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(B)I", line = 3)
    public static final int method1125(byte arg0) {
        if (arg0 < 65) {
            method1125((byte) 58);
        }
        field2382++;
        return class469.field6656++;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)Z", line = 14)
    public final boolean method1126(int arg0) {
        field2380++;
        return arg0 == 64 ? this.field2387 : false;
    }

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "(I)V", line = 25)
    public static void method1127(int arg0) {
        field2391 = null;
        field2389 = null;
        if (arg0 >= -95) {
            field2392 = 107;
        }
        field2384 = null;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(Z)I", line = 38)
    public final int method1128(boolean arg0) {
        if (arg0) {
            this.field2386 = true;
        }
        field2388++;
        return this.field2390;
    }

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "(B)Z", line = 59)
    public final boolean method1129(byte arg0) {
        field2381++;
        if (arg0 != -19) {
            this.method1128(true);
        }
        return this.field2386;
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(ZIIZ)V", line = 72)
    public class178(boolean arg0, int arg1, int arg2, boolean arg3) {
        this.field2385 = arg1;
        this.field2386 = arg0;
        this.field2387 = arg3;
        this.field2390 = arg2;
    }

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "(B)I", line = 83)
    public final int method1130(byte arg0) {
        if (arg0 != -83) {
            field2389 = null;
        }
        field2383++;
        return this.field2385;
    }
}
