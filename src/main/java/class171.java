import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class171 extends class278 {

    @OriginalMember(owner = "client!mb", name = "I", descriptor = "I")
    private int field2441;

    @OriginalMember(owner = "client!mb", name = "N", descriptor = "Lwo;")
    public static class522 field2445 = new class522();

    @OriginalMember(owner = "client!mb", name = "R", descriptor = "I")
    public static int field2449 = 0;

    @OriginalMember(owner = "client!mb", name = "K", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!mb", name = "L", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!mb", name = "M", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!mb", name = "O", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!mb", name = "P", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!mb", name = "Q", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!mb", name = "T", descriptor = "[[B")
    public static byte[][] field2451;

    @OriginalMember(owner = "client!mb", name = "S", descriptor = "[[[J")
    public static long[][][] field2450;

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(I)V")
    public class171(int arg0) {
        super(0, true);
        this.field2441 = 4096;
        this.field2441 = arg0;
    }

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)V")
    public static void method1059(int arg0) {
        if (arg0 != 8005) {
            field2449 = 0;
        }
        field2450 = null;
        field2451 = null;
        field2445 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Llh;II)V")
    public final void method210(class365 arg0, int arg1, int arg2) {
        if (~arg2 == -1) {
            this.field2441 = (arg0.method2099(255) << 12) / 255;
        }
        if (arg1 != -30446) {
            method1060(2);
        }
        ++field2443;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
    public class171() {
        this(4096);
    }

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "(I)V")
    public static final void method1060(int arg0) {
        ++field2444;
        if (arg0 != 69) {
            field2445 = null;
        }
        if (!class437.field6374.method560((byte) 115, class278.field3761) && ~class400.field5571 != ~class304.field4173) {
            class487.method2866(false, false, 28, class446.field6464, class297.field4107);
        } else {
            class48.method301(class418.field6109, 2);
            if (~class84.field1169 != ~class400.field5571) {
                class83.method591((byte) -109);
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)[I")
    public final int[] method208(int arg0, int arg1) {
        if (arg0 != -9) {
            method1060(-3);
        }
        ++field2442;
        int[] var3 = super.field3750.method256(arg1, arg0 ^ 30366);
        if (super.field3750.field554) {
            class416.method2486(var3, 0, class507.field7456, this.field2441);
        }
        return var3;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(CB)C")
    public static final char method1061(char arg0, byte arg1) {
        ++field2446;
        if (~arg0 == -199) {
            return 'E';
        } else if (arg0 == 230) {
            return 'e';
        } else {
            int var2 = 92 / ((-38 - arg1) / 35);
            if (arg0 == 223) {
                return 's';
            } else if (arg0 == 338) {
                return 'E';
            } else {
                return (char) (~arg0 == -340 ? 'e' : '\u0000');
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "(I)V")
    public static final void method1062(int arg0) {
        for (int var1 = arg0; var1 < 5; ++var1) {
            class223.field3131[var1] = false;
        }
        ++field2447;
        class128.field1745 = -1;
        class330.field4501 = 0;
        class485.field7106 = 0;
        class210.field2983 = -1;
        class128.field1742 = 1;
    }
}
