import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cja")
public class class42 extends class55 implements class326 {

    @OriginalMember(owner = "client!cja", name = "k", descriptor = "Llga;")
    public static class712 field423 = new class712(74, -1);

    @OriginalMember(owner = "client!cja", name = "o", descriptor = "C")
    public char field427;

    @OriginalMember(owner = "client!cja", name = "l", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!cja", name = "m", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!cja", name = "n", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!cja", name = "p", descriptor = "I")
    public int field428;

    @OriginalMember(owner = "client!cja", name = "q", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!cja", name = "s", descriptor = "I")
    public int field431;

    @OriginalMember(owner = "client!cja", name = "t", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!cja", name = "u", descriptor = "I")
    public int field433;

    @OriginalMember(owner = "client!cja", name = "v", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!cja", name = "r", descriptor = "J")
    public long field430;

    @OriginalMember(owner = "client!cja", name = "c", descriptor = "(I)J")
    public final long method252(int arg0) {
        field429++;
        if (arg0 >= -20) {
            method256(53);
        }
        return this.field430;
    }

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "(Z)I")
    public final int method253(boolean arg0) {
        field432++;
        if (!arg0) {
            this.field430 = 43L;
        }
        return this.field433;
    }

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "(IILsba;I)V")
    public static final void method254(int arg0, int arg1, class218 arg2, int arg3) {
        if (arg2.field2705 == 0) {
            arg2.field2768 = arg2.field2688;
        } else if (arg2.field2705 == 1) {
            arg2.field2768 = (arg1 - arg2.field2718) / 2 + arg2.field2688;
        } else if (arg2.field2705 == 2) {
            arg2.field2768 = arg1 - arg2.field2718 - arg2.field2688;
        } else if (arg2.field2705 == 3) {
            arg2.field2768 = arg2.field2688 * arg1 >> 14;
        } else if (arg2.field2705 == 4) {
            arg2.field2768 = (arg2.field2688 * arg1 >> 14) + (arg1 - arg2.field2718) / 2;
        } else {
            arg2.field2768 = arg1 - arg2.field2718 - (arg2.field2688 * arg1 >> 14);
        }
        if (arg2.field2700 == 0) {
            arg2.field2824 = arg2.field2747;
        } else if (arg2.field2700 == 1) {
            arg2.field2824 = (arg0 - arg2.field2781) / 2 + arg2.field2747;
        } else if (arg2.field2700 == 2) {
            arg2.field2824 = arg0 - arg2.field2781 - arg2.field2747;
        } else if (arg2.field2700 == 3) {
            arg2.field2824 = arg2.field2747 * arg0 >> 14;
        } else if (arg2.field2700 == 4) {
            arg2.field2824 = (arg2.field2747 * arg0 >> 14) + (arg0 - arg2.field2781) / 2;
        } else {
            arg2.field2824 = arg0 - (arg2.field2747 * arg0 >> 14) - arg2.field2781;
        }
        field426++;
        if (arg3 <= 105 || !class116.field1519) {
            return;
        }
        if (client.method1835(arg2).field9868 == 0 && arg2.field2832 != 0) {
            return;
        }
        if (arg2.field2768 < 0) {
            arg2.field2768 = 0;
        } else if (arg1 < arg2.field2768 + arg2.field2718) {
            arg2.field2768 = arg1 - arg2.field2718;
        }
        if (arg2.field2824 < 0) {
            arg2.field2824 = 0;
            return;
        }
        if (arg0 < arg2.field2824 + arg2.field2781) {
            arg2.field2824 = arg0 - arg2.field2781;
            return;
        }
    }

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "(I)I")
    public final int method255(int arg0) {
        int var2 = -77 % ((arg0 - 40) / 50);
        field425++;
        return this.field431;
    }

    @OriginalMember(owner = "client!cja", name = "e", descriptor = "(I)V")
    public static void method256(int arg0) {
        field423 = null;
        if (arg0 < 103) {
            method254(38, -44, null, 87);
        }
    }

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "(B)I")
    public final int method257(byte arg0) {
        field434++;
        return arg0 == 82 ? this.field428 : -4;
    }

    @OriginalMember(owner = "client!cja", name = "b", descriptor = "(I)C")
    public final char method258(int arg0) {
        if (arg0 == 13313) {
            field424++;
            return this.field427;
        } else {
            return '4';
        }
    }
}
