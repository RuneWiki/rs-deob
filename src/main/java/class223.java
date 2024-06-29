import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class223 extends class242 {

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "J")
    public long field3808;

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "Ljf;")
    public static class229 field3802 = class212.method1457((byte) 65, "::gc");

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "Lni;")
    public static class24 field3801 = new class24(4);

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "I")
    public static int field3807 = 128;

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "[I")
    public static int[] field3810 = new int[2];

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "Ljf;")
    public static class229 field3806 = class212.method1457((byte) 64, "(U1");

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "[I")
    public static int[] field3809 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

    @OriginalMember(owner = "client!rb", name = "A", descriptor = "Ljf;")
    public static class229 field3811 = class212.method1457((byte) 57, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIIIII)V", line = 5)
    public static final void method1532(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3800++;
        if (class192.method1314(arg2, 120)) {
            client.method1822(class23.field423[arg2], -1, arg0, arg7, arg4, arg3, arg5, arg1);
            if (arg6 != 48000) {
                field3806 = (class229) null;
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V", line = 20)
    public static void method1533(int arg0) {
        field3801 = null;
        field3806 = null;
        field3811 = null;
        field3809 = null;
        if (arg0 != 1) {
            method1532(125, 99, 63, 3, -37, -46, 125, -55);
        }
        field3802 = null;
        field3810 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIBZ)V", line = 35)
    public static final void method1534(int arg0, int arg1, byte arg2, boolean arg3) {
        field3805++;
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        class128.field2292 = arg3;
        class122.field2168 = arg0;
        class22.field363 = arg1;
        if (arg2 != 94) {
            field3810 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)V", line = 54)
    public static final void method1535(int arg0, int arg1) {
        class217.field3730.method231((byte) 113, arg0);
        class206.field3596.method231((byte) 113, arg0);
        class306.field5172.method231((byte) 113, arg0);
        field3799++;
        if (arg1 != -14398) {
            field3806 = (class229) null;
        }
        class144.field2513.method231((byte) 113, arg0);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIZ)I", line = 77)
    public static final int method1536(int arg0, int arg1, boolean arg2) {
        field3803++;
        int var3 = arg1 * 57 + arg0;
        int var4 = var3 ^ var3 << 13;
        int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        if (!arg2) {
            method1534(44, -44, (byte) 103, false);
        }
        return (var5 & 0x7F8C208) >> 19;
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V", line = 118)
    public class223() {
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIIZ)V", line = 128)
    public static final void method1537(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        class311.field5235 = arg2;
        field3804++;
        class113.field2042 = arg4;
        class31.field533 = arg0;
        class205.field3565 = arg1;
        if (arg5) {
            field3802 = (class229) null;
        }
        class305.field5165 = arg3;
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(J)V", line = 142)
    public class223(long arg0) {
        this.field3808 = arg0;
    }
}
