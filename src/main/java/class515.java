import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public class class515 extends class481 {

    @OriginalMember(owner = "client!lba", name = "y", descriptor = "[I")
    public static int[] field6873 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!lba", name = "H", descriptor = "Los;")
    public static class412 field6882 = new class412(9, 2);

    @OriginalMember(owner = "client!lba", name = "K", descriptor = "Lcu;")
    public static class206 field6885 = new class206(37, 3);

    @OriginalMember(owner = "client!lba", name = "L", descriptor = "F")
    public static float field6886;

    @OriginalMember(owner = "client!lba", name = "A", descriptor = "I")
    public int field6875;

    @OriginalMember(owner = "client!lba", name = "B", descriptor = "I")
    public static int field6876;

    @OriginalMember(owner = "client!lba", name = "C", descriptor = "I")
    public static int field6877;

    @OriginalMember(owner = "client!lba", name = "D", descriptor = "I")
    public static int field6878;

    @OriginalMember(owner = "client!lba", name = "E", descriptor = "I")
    public static int field6879;

    @OriginalMember(owner = "client!lba", name = "G", descriptor = "I")
    public static int field6881;

    @OriginalMember(owner = "client!lba", name = "I", descriptor = "I")
    public static int field6883;

    @OriginalMember(owner = "client!lba", name = "J", descriptor = "Ldn;")
    public static class483 field6884;

    @OriginalMember(owner = "client!lba", name = "z", descriptor = "Lcc;")
    public class685 field6874;

    @OriginalMember(owner = "client!lba", name = "F", descriptor = "[B")
    public byte[] field6880;

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(I)[B", line = 5)
    public final byte[] method2645(int arg0) {
        ++field6878;
        if (super.field6415) {
            throw new RuntimeException();
        } else {
            return arg0 != 35 ? null : this.field6880;
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(II)Llt;", line = 25)
    public static final class633 method2877(int arg0, int arg1) {
        ++field6881;
        int var2 = -8 / ((arg0 - -16) / 42);
        class633[] var3 = class52.method351((byte) 114);
        for (int var4 = 0; var3.length > var4; ++var4) {
            class633 var5 = var3[var4];
            if (~var5.field8507 == ~arg1) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(Leh;I)Lkr;", line = 54)
    public static final class698 method2878(class335 arg0, int arg1) {
        ++field6883;
        class288 var2 = class108.method805(arg0, false);
        int var3 = arg0.method2045(-98);
        int var4 = arg0.method2045(-98);
        if (arg1 <= 73) {
            method2879(-95);
        }
        int var5 = arg0.method2001((byte) -83);
        return new class698(var2.field4065, var2.field4069, var2.field4064, var2.field4073, var2.field4067, var2.field4075, var2.field4070, var2.field4074, var2.field4066, var3, var4, var5);
    }

    @OriginalMember(owner = "client!lba", name = "f", descriptor = "(I)V", line = 74)
    public static final void method2879(int arg0) {
        ++field6879;
        int var1 = (int) ((double) class34.field530 * 34.46D);
        if (arg0 > -55) {
            field6873 = null;
        }
        int var2 = var1 << 2;
        if (class10.field197.method416()) {
            var2 += 512;
        }
        class10.field197.method450(200, var2);
    }

    @OriginalMember(owner = "client!lba", name = "c", descriptor = "(I)I", line = 95)
    public final int method2646(int arg0) {
        ++field6876;
        if (super.field6415) {
            return 0;
        } else {
            if (arg0 != -6774) {
                method2880(56);
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!lba", name = "g", descriptor = "(I)V", line = 115)
    public static void method2880(int arg0) {
        field6885 = null;
        field6882 = null;
        field6873 = null;
        if (arg0 != -30122) {
            field6877 = -76;
        }
        field6884 = null;
    }
}
