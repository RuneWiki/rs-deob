import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class494 implements class209 {

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "Lkr;")
    private class746 field6732;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "Z")
    public static boolean field6735 = false;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "Lfha;")
    public static class382 field6733 = new class382(5, 3);

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field6729;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field6730;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field6731;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "I")
    public static int field6736;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public static int field6737;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
    public static int field6738;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "J")
    public static long field6734;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)Z", line = 4)
    public final boolean method183(int arg0) {
        if (arg0 != 14017) {
            this.method183(-23);
        }
        field6730++;
        return true;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V", line = 15)
    public final void method184(byte arg0) {
        field6731++;
        if (arg0 != -43) {
            method2763(88, 77, (byte) 120);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZLmu;)Z", line = 25)
    public static final boolean method2762(boolean arg0, class303 arg1) {
        field6737++;
        if (!arg0) {
            method2763(-9, 115, (byte) -81);
        }
        return class472.field6539 == arg1 || class83.field1165 == arg1 || class522.field7046 == arg1 || class684.field9510 == arg1;
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lkr;)V", line = 40)
    public class494(class746 arg0) {
        this.field6732 = arg0;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZB)V", line = 49)
    public final void method182(boolean arg0, byte arg1) {
        if (arg0) {
            class21.field142.method447(0, 0, class546.field7710, class512.field6932, this.field6732.field10356, 0);
        }
        field6736++;
        if (arg1 >= -81) {
            method2762(true, null);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIB)Z", line = 67)
    public static final boolean method2763(int arg0, int arg1, byte arg2) {
        if (arg2 != 100) {
            field6729 = -91;
        }
        field6738++;
        boolean var3 = (arg0 & 0x37) == 0 ? class391.method2283(arg0, (byte) 117, arg1) : class282.method1689(arg1, 15123, arg0);
        return var3 | class180.method1028(arg0, arg1, (byte) 103) | (arg1 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)V", line = 84)
    public static void method2764(byte arg0) {
        if (arg0 != 16) {
            method2763(14, 38, (byte) -60);
        }
        field6733 = null;
    }
}
