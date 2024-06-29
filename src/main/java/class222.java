import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class222 {

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "Z")
    public static boolean field3722 = false;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "[I")
    public static int[] field3725 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "I")
    public static int field3731 = 0;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field3721;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public int field3726;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
    public int field3730;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    public int field3732;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "Laj;")
    public static class151 field3729;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILaj;II)[Lmd;")
    public static final class273[] method1573(int arg0, class151 arg1, int arg2, int arg3) {
        field3728++;
        if (class167.method1242(arg1, arg3, arg0, 64)) {
            int var4 = 80 % ((arg2 - 9) / 53);
            return class290.method2014(22254);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)Lhg;")
    public static final class207 method1574(int arg0, int arg1) {
        field3727++;
        if (arg0 <= 103) {
            field3731 = -120;
        }
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        if (class208.field3515[var2] == null || class208.field3515[var2][var3] == null) {
            boolean var4 = class301.method2056(-1, var2);
            if (!var4) {
                return null;
            }
        }
        return class208.field3515[var2][var3];
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V")
    public static final void method1575(boolean arg0) {
        field3723++;
        if (arg0) {
            method1574(-10, 114);
        }
        class20.method123();
        for (int var1 = 0; var1 < 4; var1++) {
            class225.field3790[var1].method2091((byte) 88);
        }
        System.gc();
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lab;B)V")
    public final void method1576(class249 arg0, byte arg1) {
        field3724++;
        while (true) {
            int var3 = arg0.method1802((byte) 65);
            if (var3 == 0) {
                if (arg1 <= 102) {
                    method1575(false);
                    return;
                } else {
                    return;
                }
            }
            this.method1579(var3, arg0, (byte) -28);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIB)V")
    public static final void method1577(int arg0, int arg1, byte arg2) {
        field3721++;
        class236.field3980.method640((byte) 97, 253);
        class236.field3980.method1798(arg0, -125);
        class236.field3980.method1822(arg1, arg2 + 554582408);
        class41.field615++;
        if (arg2 != -128) {
            method1573(-6, (class151) null, -39, 49);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
    public static void method1578(int arg0) {
        if (arg0 <= -122) {
            field3725 = null;
            field3729 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILab;B)V")
    private final void method1579(int arg0, class249 arg1, byte arg2) {
        if (arg0 == 1) {
            this.field3726 = arg1.method1821((byte) 51);
            this.field3732 = arg1.method1802((byte) -128);
            this.field3730 = arg1.method1802((byte) -126);
        }
        if (arg2 != -28) {
            method1574(123, 88);
        }
        field3733++;
    }
}
