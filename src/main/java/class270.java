import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class270 extends class90 {

    @OriginalMember(owner = "client!ug", name = "K", descriptor = "I")
    public static int field4228 = 0;

    @OriginalMember(owner = "client!ug", name = "Q", descriptor = "[I")
    public static int[] field4234 = new int[4096];

    @OriginalMember(owner = "client!ug", name = "R", descriptor = "[Lva;")
    public static class127[] field4235;

    @OriginalMember(owner = "client!ug", name = "S", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!ug", name = "F", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!ug", name = "G", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!ug", name = "H", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!ug", name = "I", descriptor = "I")
    public int field4226;

    @OriginalMember(owner = "client!ug", name = "J", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!ug", name = "L", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!ug", name = "M", descriptor = "I")
    public int field4230;

    @OriginalMember(owner = "client!ug", name = "N", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!ug", name = "O", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!ug", name = "P", descriptor = "I")
    public int field4233;

    @OriginalMember(owner = "client!ug", name = "E", descriptor = "Ljava/lang/String;")
    public String field4222;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "(I)V")
    public static final void method1804(int arg0) {
        if (class240.field3599 != null) {
            class240.field3599.method1449((byte) 87);
        }
        ++field4232;
        if (arg0 != 10288) {
            field4234 = null;
        }
        if (class217.field3198 != null) {
            class217.field3198.method1449((byte) 44);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZIIII)I")
    public static final int method1805(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4223;
        if (!arg0) {
            field4228 = 98;
        }
        int var5 = 65536 - class18.field259[arg2 * 1024 / arg1] >> 1;
        return ((-var5 + 65536) * arg4 >> 16) - -(arg3 * var5 >> 16);
    }

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "(I)V")
    public final void method1806(int arg0) {
        super.field1376 = class287.method1928(27332) + 500L | super.field1376 & Long.MIN_VALUE;
        if (arg0 == -8173) {
            ++field4225;
            class88.field1352.method1028(false, this);
        }
    }

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "(I)V")
    public static void method1807(int arg0) {
        field4235 = null;
        if (arg0 == -1574506480) {
            field4234 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V")
    public final void method1808(byte arg0) {
        ++field4229;
        super.field1376 |= Long.MIN_VALUE;
        if (this.method1810((byte) 121) == 0L) {
            class258.field3912.method1028(false, this);
        }
        if (arg0 != 62) {
            field4236 = -95;
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(B)I")
    public final int method1809(byte arg0) {
        if (arg0 != -15) {
            field4228 = 60;
        }
        ++field4231;
        return (int) super.field3851;
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(B)J")
    public final long method1810(byte arg0) {
        int var2 = -98 % ((arg0 - 37) / 58);
        ++field4224;
        return super.field1376 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "(I)I")
    public final int method1811(int arg0) {
        ++field4227;
        if (arg0 != 255) {
            this.method1809((byte) -18);
        }
        return (int) (super.field3851 >>> 32 & 255L);
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(II)V")
    public class270(int arg0, int arg1) {
        super.field3851 = (long) arg1 | (long) arg0 << 32;
    }

    static {
        for (int var0 = 0; ~var0 > -4097; ++var0) {
            field4234[var0] = class177.method1151(-61440, var0);
        }
        field4235 = new class127[4];
        field4236 = 0;
    }
}
