import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class588 extends class72 implements class726 {

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "I")
    private int field8316;

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "Lpa;")
    public static class387 field8318 = new class387(4);

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "Lke;")
    public static class622 field8319 = new class622(76, 3);

    @OriginalMember(owner = "client!wm", name = "j", descriptor = "I")
    public static int field8321 = -1;

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "I")
    public static int field8314;

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
    public static int field8315;

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "I")
    public static int field8317;

    @OriginalMember(owner = "client!wm", name = "i", descriptor = "I")
    public static int field8320;

    @OriginalMember(owner = "client!wm", name = "k", descriptor = "I")
    public static int field8322;

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(B)V", line = 3)
    public static void method3407(byte arg0) {
        if (arg0 <= 54) {
            method3407((byte) -6);
        }
        field8319 = null;
        field8318 = null;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)J", line = 14)
    public final long method3074(byte arg0) {
        ++field8317;
        return arg0 > -87 ? -27L : super.field970.getAddress();
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(Z)I", line = 26)
    public final int method3071(boolean arg0) {
        if (!arg0) {
            this.field8316 = 50;
        }
        ++field8314;
        return this.field8316;
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lkv;I[BI)V", line = 39)
    public class588(class280 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field8316 = arg1;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Z)I", line = 49)
    public final int method3072(boolean arg0) {
        ++field8315;
        return !arg0 ? 64 : 0;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IZIIII)V", line = 60)
    public static final void method3408(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        class777.field10720 = arg3;
        class367.field5290 = arg2;
        ++field8322;
        if (arg1) {
            method3407((byte) -3);
        }
        class719.field10104 = arg5;
        class200.field2942 = arg0;
        class785.field10789 = arg4;
        if (class367.field5290 >= 100) {
            int var6 = class785.field10789 * 512 + 256;
            int var7 = class719.field10104 * 512 + 256;
            int var8 = class580.method3366(class410.field5771, (byte) -95, var7, var6) + -class200.field2942;
            int var9 = -class277.field3866 + var6;
            int var10 = -class655.field9241 + var8;
            int var11 = -class359.field5216 + var7;
            int var12 = (int) Math.sqrt((double) (var9 * var9 - -(var11 * var11)));
            class689.field9757 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 16383;
            class118.field1478 = (int) (Math.atan2((double) var9, (double) var11) * -2607.5945876176133D) & 16383;
            class666.field9380 = 0;
            if (class689.field9757 < 1024) {
                class689.field9757 = 1024;
            }
            if (class689.field9757 > 3072) {
                class689.field9757 = 3072;
            }
        }
        class763.field10510 = 2;
        class180.field2732 = -1;
        class406.field5746 = -1;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "([BIII)V", line = 113)
    public final void method3073(byte[] arg0, int arg1, int arg2, int arg3) {
        ++field8320;
        this.method567(arg0, arg1);
        this.field8316 = arg2;
        if (arg3 < 72) {
            this.method3071(true);
        }
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lkv;ILjaclib/memory/Buffer;)V", line = 130)
    public class588(class280 arg0, int arg1, Buffer arg2) {
        super(arg0, arg2);
        this.field8316 = arg1;
    }
}
