import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class383 extends class204 {

    @OriginalMember(owner = "client!no", name = "i", descriptor = "[I")
    public static int[] field5485 = new int[128];

    @OriginalMember(owner = "client!no", name = "p", descriptor = "I")
    public static int field5492;

    @OriginalMember(owner = "client!no", name = "h", descriptor = "I")
    public static int field5484;

    @OriginalMember(owner = "client!no", name = "j", descriptor = "I")
    public static int field5486;

    @OriginalMember(owner = "client!no", name = "k", descriptor = "I")
    public static int field5487;

    @OriginalMember(owner = "client!no", name = "l", descriptor = "I")
    public static int field5488;

    @OriginalMember(owner = "client!no", name = "m", descriptor = "I")
    public static int field5489;

    @OriginalMember(owner = "client!no", name = "n", descriptor = "I")
    public static int field5490;

    @OriginalMember(owner = "client!no", name = "o", descriptor = "I")
    public static int field5491;

    @OriginalMember(owner = "client!no", name = "q", descriptor = "I")
    public static int field5493;

    static {
        for (int var0 = 0; ~field5485.length < ~var0; ++var0) {
            field5485[var0] = -1;
        }
        for (int var1 = 65; ~var1 >= -91; ++var1) {
            field5485[var1] = var1 + -65;
        }
        for (int var2 = 97; ~var2 >= -123; ++var2) {
            field5485[var2] = var2 + -71;
        }
        for (int var3 = 48; var3 <= 57; ++var3) {
            field5485[var3] = var3 + 4;
        }
        field5485[45] = field5485[47] = 63;
        field5485[42] = field5485[43] = 62;
        field5492 = -2;
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(ILfs;)V", line = 3)
    public class383(int arg0, class607 arg1) {
        super(arg0, arg1);
        class92.method668((byte) -58, super.field2852);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(II)I", line = 11)
    public final int method487(int arg0, int arg1) {
        ++field5488;
        if (~super.field2853.method3513((byte) 108).method4270(4) > -97) {
            return 3;
        } else {
            int var3 = 37 % ((arg1 - -57) / 60);
            return 1;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(B)I", line = 25)
    public final int method490(byte arg0) {
        ++field5484;
        if (super.field2853.method3513((byte) -111).method4270(4) < 96) {
            return 0;
        } else {
            if (arg0 < 83) {
                this.method486(-102);
            }
            return 2;
        }
    }

    @OriginalMember(owner = "client!no", name = "d", descriptor = "(II)V", line = 39)
    public final void method488(int arg0, int arg1) {
        super.field2852 = arg0;
        if (arg1 >= -105) {
            this.method2385(-20);
        }
        ++field5487;
        class92.method668((byte) -92, super.field2852);
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lfs;)V", line = 51)
    public class383(class607 arg0) {
        super(arg0);
        class92.method668((byte) -74, super.field2852);
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(B)V", line = 59)
    public static void method2383(byte arg0) {
        field5485 = null;
        if (arg0 != 106) {
            method2386((byte) -96, -122);
        }
    }

    @OriginalMember(owner = "client!no", name = "c", descriptor = "(B)I", line = 70)
    public final int method2384(byte arg0) {
        if (arg0 != -98) {
            field5485 = null;
        }
        ++field5491;
        return super.field2852;
    }

    @OriginalMember(owner = "client!no", name = "c", descriptor = "(I)Z", line = 89)
    public final boolean method2385(int arg0) {
        ++field5493;
        int var2 = 110 / ((-13 - arg0) / 44);
        return super.field2853.method3513((byte) 80).method4270(4) >= 96;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I)V", line = 137)
    public final void method486(int arg0) {
        if (arg0 == -4591) {
            if (~super.field2853.method3513((byte) -81).method4270(4) > -97) {
                super.field2852 = 0;
            }
            ++field5486;
            if (super.field2852 < 0 || ~super.field2852 < -3) {
                super.field2852 = this.method490((byte) 110);
            }
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(BI)I", line = 158)
    public static final int method2386(byte arg0, int arg1) {
        if (arg0 != 117) {
            field5485 = null;
        }
        ++field5489;
        return arg1 >>> 7;
    }
}
