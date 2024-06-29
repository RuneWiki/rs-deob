import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class209 extends class33 {

    @OriginalMember(owner = "client!vb", name = "N", descriptor = "I")
    private int field4059 = 0;

    @OriginalMember(owner = "client!vb", name = "T", descriptor = "I")
    private int field4065 = 4096;

    @OriginalMember(owner = "client!vb", name = "P", descriptor = "[J")
    public static long[] field4061 = new long[200];

    @OriginalMember(owner = "client!vb", name = "Q", descriptor = "Laf;")
    public static class7 field4062 = new class7(5);

    @OriginalMember(owner = "client!vb", name = "W", descriptor = "Lrd;")
    public static class173 field4068 = class133.method843("oder ung-Ultiges Passwort)3", -66);

    @OriginalMember(owner = "client!vb", name = "X", descriptor = "Lrd;")
    public static class173 field4069 = class133.method843("<col=ff0000>", 47);

    @OriginalMember(owner = "client!vb", name = "M", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!vb", name = "O", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!vb", name = "R", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!vb", name = "S", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!vb", name = "U", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!vb", name = "V", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IILmb;)V")
    public final void method177(int arg0, int arg1, class121 arg2) {
        if (arg1 < -99) {
            if (~arg0 != -1) {
                if (arg0 == 1) {
                    this.field4065 = arg2.method755((byte) -56);
                }
            } else {
                this.field4059 = arg2.method755((byte) -118);
            }
            ++field4064;
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V")
    public class209() {
        super(1, true);
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(ILqf;)V")
    public static final void method1379(int arg0, class165 arg1) {
        ++field4066;
        if (arg0 != 1) {
            field4060 = 31;
        }
        if (class182.field3580 == arg1.field3119) {
            class70.field1373[arg1.field3178] = true;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IB)[I")
    public final int[] method175(int arg0, byte arg1) {
        int var3 = -74 / ((-65 - arg1) / 60);
        ++field4063;
        int[] var4 = super.field718.method514(arg0, -51);
        if (super.field718.field1615) {
            int[] var5 = this.method262(arg0, -110, 0);
            for (int var6 = 0; ~var6 > ~class117.field2173; ++var6) {
                int var7 = var5[var6];
                var4[var6] = this.field4059 <= var7 && ~var7 >= ~this.field4065 ? 4096 : 0;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BLbc;I)Ldh;")
    public static final class39 method1380(byte arg0, class14 arg1, int arg2) {
        ++field4067;
        if (arg0 > -53) {
            return null;
        } else {
            return !class80.method497(77, arg1, arg2) ? null : class164.method1057((byte) -119);
        }
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(B)V")
    public static void method1381(byte arg0) {
        field4062 = null;
        field4061 = null;
        field4068 = null;
        int var1 = -36 % ((41 - arg0) / 35);
        field4069 = null;
    }

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "(B)V")
    public static final void method1382(byte arg0) {
        ++field4058;
        class140.field2617 = new class145();
        if (arg0 <= 95) {
            field4062 = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(II)I")
    public static int method1383(int arg0, int arg1) {
        return arg0 & arg1;
    }
}
