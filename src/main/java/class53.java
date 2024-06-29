import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class53 extends class361 {

    @OriginalMember(owner = "client!oi", name = "G", descriptor = "I")
    public int field656;

    @OriginalMember(owner = "client!oi", name = "P", descriptor = "I")
    public int field663;

    @OriginalMember(owner = "client!oi", name = "O", descriptor = "Z")
    public boolean field662;

    @OriginalMember(owner = "client!oi", name = "K", descriptor = "F")
    public float field658;

    @OriginalMember(owner = "client!oi", name = "Q", descriptor = "F")
    public float field664;

    @OriginalMember(owner = "client!oi", name = "I", descriptor = "[Z")
    public static boolean[] field657 = new boolean[8];

    @OriginalMember(owner = "client!oi", name = "N", descriptor = "[I")
    public static int[] field661 = new int[4096];

    @OriginalMember(owner = "client!oi", name = "L", descriptor = "[Lsm;")
    public static class189[] field659 = new class189[14];

    @OriginalMember(owner = "client!oi", name = "M", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!oi", name = "R", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lkd;IIIZ[I)V", line = 3)
    public class53(class188 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        this.field656 = arg3;
        this.field663 = arg2;
        if (super.field6610 != 34037) {
            this.field662 = true;
            this.field664 = this.field658 = 1.0F;
        } else {
            this.field664 = (float) arg2;
            this.field662 = false;
            this.field658 = (float) arg3;
        }
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lkd;IIIII[BI)V", line = 24)
    public class53(class188 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field663 = arg2;
        this.field656 = arg3;
        this.method2265(arg6, 0, 0, true, 0, 0, arg2, arg7, arg3, -97);
        this.field658 = (float) arg3 / (float) arg5;
        this.field662 = false;
        this.field664 = (float) arg2 / (float) arg4;
        this.method2270(false, false, 10243);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IZ)V", line = 43)
    public static final void method505(int arg0, boolean arg1) {
        if (arg1) {
            if (~class155.field2310 != 0) {
                class323.method2055((byte) -18, class155.field2310);
            }
            for (class293 var2 = (class293) class70.field993.method2592(118); var2 != null; var2 = (class293) class70.field993.method2589(-1)) {
                if (!var2.method2674(26931)) {
                    var2 = (class293) class70.field993.method2592(117);
                    if (var2 == null) {
                        break;
                    }
                }
                class218.method1568(false, -123, true, var2);
            }
            class155.field2310 = -1;
            class70.field993 = new class412(8);
            class201.method1408((byte) 11);
            class155.field2310 = class40.field539;
            class128.method939(465824240, false);
            class152.method1044((byte) 89);
            class192.method1352(class155.field2310);
        }
        ++field660;
        class393.field5869 = false;
        class124.field1847 = "";
        class97.field1393 = "";
        class71.method617((byte) 100);
        class287.field4348 = -1;
        class193.method1359(class23.field284, (byte) -117);
        int var3 = -46 % ((arg0 - 24) / 62);
        class398.field5947 = new class177();
        class398.field5947.field5833 = class285.field4328 * 128 / 2;
        class398.field5947.field1978[0] = class69.field976 / 2;
        class398.field5947.field5837 = class69.field976 * 128 / 2;
        class71.field1024 = 0;
        class412.field6180 = 0;
        class398.field5947.field1976[0] = class285.field4328 / 2;
        if (~class176.field2611 != -3) {
            class226.method1606(3);
        } else {
            class412.field6180 = class199.field3323 << 7;
            class71.field1024 = class273.field4188 << 7;
        }
        class245.method1666(0);
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lkd;IIIIIIZ)V", line = 105)
    public class53(class188 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field656 = arg4;
        this.field662 = false;
        this.field663 = arg3;
        this.field658 = (float) arg4 / (float) arg6;
        this.field664 = (float) arg3 / (float) arg5;
        this.method2270(false, false, 10243);
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lkd;IIIIZ[BI)V", line = 125)
    public class53(class188 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field663 = arg3;
        this.field656 = arg4;
        if (~super.field6610 == -34038) {
            this.field658 = (float) arg4;
            this.field664 = (float) arg3;
            this.field662 = false;
        } else {
            this.field662 = true;
            this.field664 = this.field658 = 1.0F;
        }
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lkd;IIII[I)V", line = 146)
    public class53(class188 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field663 = arg1;
        this.field656 = arg2;
        this.method2264(0, arg5, arg2, arg1, true, 34037, 0, 0, 0);
        this.field658 = (float) arg2 / (float) arg4;
        this.field664 = (float) arg1 / (float) arg3;
        this.field662 = false;
        this.method2270(false, false, 10243);
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lkd;IIIIIZ)V", line = 164)
    public class53(class188 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field656 = arg5;
        this.field663 = arg4;
        if (~super.field6610 != -34038) {
            this.field664 = this.field658 = 1.0F;
            this.field662 = true;
        } else {
            this.field658 = (float) arg5;
            this.field664 = (float) arg4;
            this.field662 = false;
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(Z)V", line = 189)
    public static void method506(boolean arg0) {
        field657 = null;
        field659 = null;
        field661 = null;
        if (arg0) {
            field659 = null;
        }
    }
}
