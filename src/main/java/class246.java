import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class246 extends class224 {

    @OriginalMember(owner = "client!jl", name = "R", descriptor = "I")
    private int field3947 = 0;

    @OriginalMember(owner = "client!jl", name = "I", descriptor = "I")
    private int field3939 = 4096;

    @OriginalMember(owner = "client!jl", name = "Q", descriptor = "[I")
    public static int[] field3946 = new int[64];

    @OriginalMember(owner = "client!jl", name = "T", descriptor = "I")
    public static int field3949 = 0;

    @OriginalMember(owner = "client!jl", name = "H", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!jl", name = "J", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!jl", name = "L", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!jl", name = "N", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!jl", name = "O", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!jl", name = "P", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!jl", name = "S", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!jl", name = "M", descriptor = "Ljava/lang/String;")
    public static String field3942;

    @OriginalMember(owner = "client!jl", name = "U", descriptor = "[Lhc;")
    public static class229[] field3950;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)Lfg;")
    public static final class12 method1660(byte arg0) {
        ++field3945;
        int var1 = class236.field3777[0] * class228.field3696[0];
        byte[] var2 = class101.field1574[0];
        int[] var3 = new int[var1];
        if (arg0 <= 123) {
            field3950 = null;
        }
        for (int var4 = 0; ~var4 > ~var1; ++var4) {
            var3[var4] = class72.field1023[class224.method1526(var2[var4], 255)];
        }
        class12 var5 = new class12(class46.field583, class209.field3253, class206.field3221[0], class226.field3653[0], class236.field3777[0], class228.field3696[0], var3);
        class222.method1506((byte) 110);
        return var5;
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "()V")
    public class246() {
        super(1, true);
    }

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "(I)V")
    public static final void method1661(int arg0) {
        ++field3948;
        if (arg0 >= -49) {
            method1664((class25) null, 42);
        }
        for (int var1 = 0; ~var1 > ~class236.field3774; ++var1) {
            int var2 = class248.field3967[var1];
            class56 var3 = class100.field1566[var2];
            if (var3 != null) {
                class102.method678((byte) 115, var3, var3.field793.field2012);
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(B)V")
    public static final void method1662(byte arg0) {
        class205.field3215.method670(109);
        class175.field2738.method1465((byte) 105);
        if (arg0 <= -33) {
            class225.field3641.method1465((byte) 105);
            ++field3938;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IZ)[I")
    public final int[] method14(int arg0, boolean arg1) {
        if (!arg1) {
            return null;
        } else {
            int[] var3 = super.field3625.method1862(arg0, (byte) 52);
            ++field3944;
            if (super.field3625.field4425) {
                int[] var4 = this.method1527(arg0, 0, (byte) 84);
                for (int var5 = 0; class78.field1108 > var5; ++var5) {
                    int var6 = var4[var5];
                    var3[var5] = ~this.field3947 >= ~var6 && this.field3939 >= var6 ? 4096 : 0;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "(I)V")
    public static void method1663(int arg0) {
        field3946 = null;
        if (arg0 == 22420) {
            field3950 = null;
            field3942 = null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Llj;I)Lre;")
    public static final class222 method1664(class25 arg0, int arg1) {
        if (arg1 != 0) {
            field3942 = null;
        }
        ++field3940;
        return new class222(arg0.method226(arg1 + 255), arg0.method226(255), arg0.method226(255), arg0.method226(255), arg0.method215((byte) 101), arg0.method215((byte) 106), arg0.method201(255));
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Llj;IB)V")
    public final void method16(class25 arg0, int arg1, byte arg2) {
        if (arg2 > -46) {
            this.method16((class25) null, 13, (byte) -77);
        }
        if (arg1 != 0) {
            if (arg1 == 1) {
                this.field3939 = arg0.method190(-3);
            }
        } else {
            this.field3947 = arg0.method190(-3);
        }
        ++field3941;
    }
}
