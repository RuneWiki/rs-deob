import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class201 {

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "Lnd;")
    public static class127 field3886 = new class127(5);

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "Ltg;")
    public static class184 field3890 = class135.method812("Diese Welt ist voll)3", 3);

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIILfb;J)V")
    public static final void method1284(int arg0, int arg1, int arg2, int arg3, class52 arg4, long arg5) {
        if (arg4 == null) {
            return;
        }
        class88 var7 = new class88();
        var7.field1658 = arg4;
        var7.field1657 = arg1 * 128 + 64;
        var7.field1651 = arg2 * 128 + 64;
        var7.field1660 = arg3;
        var7.field1652 = arg5;
        if (class190.field3704[arg0][arg1][arg2] == null) {
            class190.field3704[arg0][arg1][arg2] = new class90(arg0, arg1, arg2);
        }
        class190.field3704[arg0][arg1][arg2].field1690 = var7;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IILtg;)V")
    public static final void method1285(int arg0, int arg1, class184 arg2) {
        class117.field2122.method106(arg0, -119);
        class188.field3636++;
        class117.field2122.method587(false, arg2.method1160(0));
        field3885++;
        class117.field2122.method592(arg0 + 6, arg1);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(III)I")
    public static final int method1286(int arg0, int arg1, int arg2) {
        if (arg2 != 5) {
            return 76;
        }
        int var3 = 0;
        field3887++;
        while (arg1 > 0) {
            var3 = var3 << 1 | arg0 & 0x1;
            arg0 >>>= 0x1;
            arg1--;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
    public static void method1287(int arg0) {
        field3890 = null;
        if (arg0 != 128) {
            method1287(54);
        }
        field3886 = null;
    }
}
