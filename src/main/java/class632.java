import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public class class632 {

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "I")
    public int field8820 = 128;

    @OriginalMember(owner = "client!ufa", name = "q", descriptor = "I")
    public int field8835 = 128;

    @OriginalMember(owner = "client!ufa", name = "o", descriptor = "I")
    public int field8833;

    @OriginalMember(owner = "client!ufa", name = "l", descriptor = "I")
    public int field8830;

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "I")
    public int field8819;

    @OriginalMember(owner = "client!ufa", name = "h", descriptor = "I")
    public int field8826;

    @OriginalMember(owner = "client!ufa", name = "d", descriptor = "Lff;")
    public static class9 field8822 = new class9(13, 0, 1, 0);

    @OriginalMember(owner = "client!ufa", name = "r", descriptor = "Lnea;")
    public static class664 field8836 = new class664(79, -1);

    @OriginalMember(owner = "client!ufa", name = "s", descriptor = "[I")
    public static int[] field8837 = new int[32];

    @OriginalMember(owner = "client!ufa", name = "c", descriptor = "I")
    public static int field8821;

    @OriginalMember(owner = "client!ufa", name = "e", descriptor = "I")
    public static int field8823;

    @OriginalMember(owner = "client!ufa", name = "f", descriptor = "I")
    public static int field8824;

    @OriginalMember(owner = "client!ufa", name = "g", descriptor = "I")
    public int field8825;

    @OriginalMember(owner = "client!ufa", name = "i", descriptor = "I")
    public int field8827;

    @OriginalMember(owner = "client!ufa", name = "j", descriptor = "I")
    public static int field8828;

    @OriginalMember(owner = "client!ufa", name = "k", descriptor = "I")
    public int field8829;

    @OriginalMember(owner = "client!ufa", name = "m", descriptor = "I")
    public int field8831;

    @OriginalMember(owner = "client!ufa", name = "n", descriptor = "I")
    public int field8832;

    @OriginalMember(owner = "client!ufa", name = "p", descriptor = "I")
    public static int field8834;

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(I)Z")
    public static final boolean method3515(int arg0) {
        field8828++;
        boolean var1 = true;
        if (class100.field1563 == null) {
            if (class703.field9909.method2997((byte) -95, class310.field4596)) {
                class100.field1563 = class113.method886(class703.field9909, class310.field4596);
            } else {
                var1 = false;
            }
        }
        if (class539.field7553 == null) {
            if (class703.field9909.method2997((byte) -95, class426.field6276)) {
                class539.field7553 = class113.method886(class703.field9909, class426.field6276);
            } else {
                var1 = false;
            }
        }
        if (class252.field3879 == null) {
            if (class703.field9909.method2997((byte) -95, class176.field2512)) {
                class252.field3879 = class113.method886(class703.field9909, class176.field2512);
            } else {
                var1 = false;
            }
        }
        if (class586.field8211 == null) {
            if (class81.field1363.method2997((byte) -95, class124.field1868)) {
                class586.field8211 = class412.method2482(arg0 ^ 0xFFFFA22C, class81.field1363, class124.field1868);
            } else {
                var1 = false;
            }
        }
        if (arg0 != -23978) {
            method3515(54);
        }
        if (class132.field1957 == null) {
            if (class703.field9909.method2997((byte) -95, class124.field1868)) {
                class132.field1957 = class113.method880(class703.field9909, class124.field1868);
            } else {
                var1 = false;
            }
        }
        return var1;
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(BLsn;)Z")
    public static final boolean method3516(byte arg0, class583 arg1) {
        int var2 = 75 / ((-arg0 - 11) / 50);
        field8824++;
        return class261.field3970 == arg1 || class331.field4889 == arg1 || class667.field9412 == arg1 || class573.field8067 == arg1;
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(II)V")
    public static final void method3517(int arg0, int arg1) {
        class692.field9728 = new int[arg0];
        class539.field7552 = new int[arg0];
        class158.field2274 = new int[arg0];
        if (arg1 != 0) {
            method3517(120, -90);
        }
        class166.field2387 = new int[arg0];
        class117.field1784 = new int[arg0];
        field8834++;
    }

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "(I)V")
    public static void method3518(int arg0) {
        if (arg0 < 42) {
            field8837 = null;
        }
        field8837 = null;
        field8836 = null;
        field8822 = null;
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Lufa;I)V")
    public final void method3519(class632 arg0, int arg1) {
        this.field8830 = arg0.field8830;
        this.field8820 = arg0.field8820;
        this.field8819 = arg0.field8819;
        this.field8835 = arg0.field8835;
        this.field8833 = arg0.field8833;
        field8823++;
        if (arg1 != -1) {
            this.method3519(null, -12);
        }
        this.field8826 = arg0.field8826;
    }

    @OriginalMember(owner = "client!ufa", name = "c", descriptor = "(I)Lufa;")
    public final class632 method3520(int arg0) {
        field8821++;
        if (arg0 <= 43) {
            method3516((byte) 73, null);
        }
        return new class632(this.field8833, this.field8820, this.field8835, this.field8830, this.field8819, this.field8826);
    }

    @OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "(I)V")
    public class632(int arg0) {
        this.field8833 = arg0;
    }

    @OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "(IIIIII)V")
    private class632(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8820 = arg1;
        this.field8833 = arg0;
        this.field8830 = arg3;
        this.field8819 = arg4;
        this.field8835 = arg2;
        this.field8826 = arg5;
    }
}
