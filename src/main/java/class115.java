import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class115 extends class34 {

    @OriginalMember(owner = "client!rk", name = "V", descriptor = "Ljava/lang/String;")
    public static String field1752 = "flash2:";

    @OriginalMember(owner = "client!rk", name = "P", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!rk", name = "Q", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!rk", name = "R", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!rk", name = "S", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!rk", name = "T", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!rk", name = "U", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(III)I")
    public static final int method822(int arg0, int arg1, int arg2) {
        ++field1748;
        int var3 = 0;
        if (arg2 != 1) {
            field1752 = null;
        }
        while (arg0 > 0) {
            var3 = arg1 & 1 | var3 << 1;
            arg1 >>>= 1;
            --arg0;
        }
        return var3;
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(II)[I")
    public final int[] method43(int arg0, int arg1) {
        if (arg0 < 75) {
            this.method43(-97, 18);
        }
        ++field1746;
        int[] var3 = super.field610.method228(24856, arg1);
        if (super.field610.field597) {
            class41.method342(var3, 0, class226.field3527, class199.field2985[arg1]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "(I)V")
    public static void method823(int arg0) {
        field1752 = null;
        if (arg0 >= -82) {
            method825(-103, (byte) -81);
        }
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V")
    public class115() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(BI)V")
    public static final void method824(byte arg0, int arg1) {
        if (arg0 >= 106) {
            ++field1749;
            class270 var2 = (class270) class155.field2273.method306((long) arg1, 16216);
            if (var2 != null) {
                for (int var3 = 0; ~var2.field4213.length < ~var3; ++var3) {
                    var2.field4213[var3] = -1;
                    var2.field4216[var3] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IB)V")
    public static final void method825(int arg0, byte arg1) {
        class23.field375.method938(arg0, (byte) -123);
        if (arg1 != 83) {
            field1752 = null;
        }
        ++field1747;
    }

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "(I)V")
    public static final void method826(int arg0) {
        ++field1750;
        class159.field2317.method944(65535);
        if (arg0 != 1) {
            method826(-34);
        }
        class197.field2976.method944(65535);
    }
}
