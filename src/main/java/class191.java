import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class191 extends class33 {

    @OriginalMember(owner = "client!tb", name = "M", descriptor = "I")
    private int field3726;

    @OriginalMember(owner = "client!tb", name = "Q", descriptor = "[Lrd;")
    public static class173[] field3730 = new class173[100];

    @OriginalMember(owner = "client!tb", name = "X", descriptor = "Laf;")
    public static class7 field3737 = new class7(128);

    @OriginalMember(owner = "client!tb", name = "Z", descriptor = "I")
    public static int field3739 = 1;

    @OriginalMember(owner = "client!tb", name = "ab", descriptor = "Laf;")
    public static class7 field3740 = new class7(100);

    @OriginalMember(owner = "client!tb", name = "bb", descriptor = "Lrd;")
    public static class173 field3741 = class133.method843("Bitte versuchen Sie es in ", 22);

    @OriginalMember(owner = "client!tb", name = "cb", descriptor = "I")
    public static int field3742 = 0;

    @OriginalMember(owner = "client!tb", name = "N", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!tb", name = "O", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!tb", name = "P", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!tb", name = "R", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!tb", name = "T", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!tb", name = "U", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!tb", name = "V", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!tb", name = "S", descriptor = "Lpd;")
    public static class153 field3732;

    @OriginalMember(owner = "client!tb", name = "W", descriptor = "Lsa;")
    public static class180 field3736;

    @OriginalMember(owner = "client!tb", name = "Y", descriptor = "[I")
    public static int[] field3738;

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(I)V")
    private class191(int arg0) {
        super(0, true);
        this.field3726 = 4096;
        this.field3726 = arg0;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BI)I")
    public static final int method1273(byte arg0, int arg1) {
        if (arg0 >= -53) {
            field3738 = null;
        }
        ++field3733;
        int var2 = 0;
        if (~arg1 > -1 || ~arg1 <= -65537) {
            var2 += 16;
            arg1 >>>= 16;
        }
        if (~arg1 <= -257) {
            var2 += 8;
            arg1 >>>= 8;
        }
        if (~arg1 <= -17) {
            var2 += 4;
            arg1 >>>= 4;
        }
        if (arg1 >= 4) {
            arg1 >>>= 2;
            var2 += 2;
        }
        if (arg1 >= 1) {
            arg1 >>>= 1;
            ++var2;
        }
        return var2 - -arg1;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILmb;)V")
    public final void method177(int arg0, int arg1, class121 arg2) {
        if (arg1 <= -99) {
            ++field3729;
            if (arg0 == 0) {
                this.field3726 = (arg2.method751((byte) -81) << 12) / 255;
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IB)[I")
    public final int[] method175(int arg0, byte arg1) {
        ++field3728;
        int var3 = -29 % ((arg1 - -65) / 60);
        int[] var4 = super.field718.method514(arg0, -64);
        if (super.field718.field1615) {
            class85.method554(var4, 0, class117.field2173, this.field3726);
        }
        return var4;
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(B)V")
    public static final void method1274(byte arg0) {
        if (arg0 > 124) {
            ++field3727;
            class30.field605.method53(-51);
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
    public class191() {
        this(4096);
    }

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "(I)V")
    public static void method1275(int arg0) {
        field3730 = null;
        field3736 = null;
        field3741 = null;
        field3737 = null;
        if (arg0 > -36) {
            method1273((byte) 22, -66);
        }
        field3740 = null;
        field3732 = null;
        field3738 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lbc;Z)V")
    public static final void method1276(class14 arg0, boolean arg1) {
        if (arg1) {
            field3738 = null;
        }
        class109.field2029 = arg0;
        ++field3735;
    }
}
