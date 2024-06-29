import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class333 extends class281 implements class439 {

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "I")
    private int field4319;

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "[I")
    public static int[] field4320 = new int[1];

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!ur", name = "f", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!ur", name = "g", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!ur", name = "h", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!ur", name = "i", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!ur", name = "j", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!ur", name = "k", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(III)I", line = 3)
    public static final int method1920(int arg0, int arg1, int arg2) {
        if (arg1 != 24618) {
            field4320 = null;
        }
        int var3 = (arg0 & 127) * arg2 >> 7;
        ++field4325;
        if (~var3 <= -3) {
            if (var3 > 126) {
                var3 = 126;
            }
        } else {
            var3 = 2;
        }
        return (65408 & arg0) + var3;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(BII)I", line = 23)
    public static final int method1921(byte arg0, int arg1, int arg2) {
        ++field4322;
        int var3 = arg2 * 57 + arg1;
        if (arg0 < 86) {
            method1921((byte) -5, 52, 50);
        }
        int var4 = var3 << 13 ^ var3;
        int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 + 789221) * var4 + 1376312589;
        return (133987925 & var5) >> 19;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(B)J", line = 39)
    public final long method576(byte arg0) {
        ++field4327;
        return arg0 > -23 ? -73L : super.field3670.getAddress();
    }

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Lji;I[BI)V", line = 50)
    public class333(class622 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field4319 = arg1;
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(B)V", line = 58)
    public static void method1922(byte arg0) {
        field4320 = null;
        if (arg0 != -69) {
            method1920(91, -99, 47);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)I", line = 78)
    public final int method577(int arg0) {
        if (arg0 != 23152) {
            return 30;
        } else {
            ++field4324;
            return 0;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Z)I", line = 94)
    public final int method575(boolean arg0) {
        if (!arg0) {
            return 104;
        } else {
            ++field4321;
            return this.field4319;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(II[BI)V", line = 105)
    public final void method574(int arg0, int arg1, byte[] arg2, int arg3) {
        this.method1688(arg2, arg3);
        if (arg1 != -18622) {
            this.field4319 = -91;
        }
        ++field4326;
        this.field4319 = arg0;
    }
}
