import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class14 {

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "I")
    public int field723;

    @OriginalMember(owner = "client!ds", name = "h", descriptor = "I")
    private int field730;

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "Lro;")
    private class2 field724;

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "I")
    public int field725;

    @OriginalMember(owner = "client!ds", name = "i", descriptor = "Lds;")
    public static class14 field731 = new class14(0, 3, class2.field376);

    @OriginalMember(owner = "client!ds", name = "j", descriptor = "Lds;")
    public static class14 field732 = new class14(1, 3, class2.field376);

    @OriginalMember(owner = "client!ds", name = "k", descriptor = "Lds;")
    public static class14 field733 = new class14(2, 4, class2.field372);

    @OriginalMember(owner = "client!ds", name = "l", descriptor = "Lds;")
    public static class14 field734 = new class14(3, 1, class2.field376);

    @OriginalMember(owner = "client!ds", name = "m", descriptor = "Lds;")
    public static class14 field735 = new class14(4, 2, class2.field376);

    @OriginalMember(owner = "client!ds", name = "n", descriptor = "Lds;")
    public static class14 field736 = new class14(5, 3, class2.field376);

    @OriginalMember(owner = "client!ds", name = "o", descriptor = "Lds;")
    public static class14 field737 = new class14(6, 4, class2.field376);

    @OriginalMember(owner = "client!ds", name = "p", descriptor = "I")
    public static int field738 = class608.method3498(16, (byte) 121);

    @OriginalMember(owner = "client!ds", name = "q", descriptor = "Z")
    public static boolean field739 = false;

    @OriginalMember(owner = "client!ds", name = "r", descriptor = "Lkj;")
    public static class527 field740 = new class527(4, 6);

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!ds", name = "s", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!ds", name = "t", descriptor = "Lmq;")
    public static class472 field742;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)I")
    public static final int method370(int arg0) {
        field728++;
        if (arg0 != -3055) {
            method372(null, -26, (byte) -56);
        }
        return class119.field2122.method1881((byte) -88);
    }

    @OriginalMember(owner = "client!ds", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field729++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(B)V")
    public static void method371(byte arg0) {
        field734 = null;
        int var1 = -91 / ((arg0 + 71) / 50);
        field742 = null;
        field733 = null;
        field737 = null;
        field736 = null;
        field731 = null;
        field740 = null;
        field732 = null;
        field735 = null;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "([BIB)[B")
    public static final byte[] method372(byte[] arg0, int arg1, byte arg2) {
        field727++;
        byte[] var3 = new byte[arg1];
        if (arg2 != 124) {
            method373((byte) 67, -127);
        }
        class692.method3873(arg0, 0, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(IILro;)V")
    private class14(int arg0, int arg1, class2 arg2) {
        this.field723 = arg0;
        this.field730 = arg1;
        this.field724 = arg2;
        this.field725 = this.field724.field367 * this.field730;
        if (this.field723 >= 16) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(BI)Lds;")
    public static final class14 method373(byte arg0, int arg1) {
        field726++;
        if (arg0 != -79) {
            return null;
        } else if (arg1 == 0) {
            return field731;
        } else if (arg1 == 1) {
            return field732;
        } else if (arg1 == 2) {
            return field733;
        } else if (arg1 == 3) {
            return field734;
        } else if (arg1 == 4) {
            return field735;
        } else if (arg1 == 5) {
            return field736;
        } else if (arg1 == 6) {
            return field737;
        } else {
            return null;
        }
    }
}
