import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lia")
public class class478 extends class134 {

    @OriginalMember(owner = "client!lia", name = "h", descriptor = "I")
    public static int field6604 = 0;

    @OriginalMember(owner = "client!lia", name = "k", descriptor = "Lea;")
    public static class547 field6607 = new class547(119, 12);

    @OriginalMember(owner = "client!lia", name = "f", descriptor = "I")
    public static int field6602;

    @OriginalMember(owner = "client!lia", name = "g", descriptor = "I")
    public static int field6603;

    @OriginalMember(owner = "client!lia", name = "i", descriptor = "I")
    public static int field6605;

    @OriginalMember(owner = "client!lia", name = "j", descriptor = "I")
    public static int field6606;

    @OriginalMember(owner = "client!lia", name = "l", descriptor = "I")
    public static int field6608;

    @OriginalMember(owner = "client!lia", name = "m", descriptor = "I")
    public static int field6609;

    @OriginalMember(owner = "client!lia", name = "o", descriptor = "I")
    public static int field6611;

    @OriginalMember(owner = "client!lia", name = "n", descriptor = "Lni;")
    public static class522 field6610;

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(IIFIZZII)[I", line = 4)
    public static final int[] method2685(int arg0, int arg1, float arg2, int arg3, boolean arg4, boolean arg5, int arg6, int arg7) {
        ++field6608;
        int[] var8 = new int[arg1];
        class75 var9 = new class75();
        var9.field907 = arg3;
        var9.field915 = (int) (arg2 * 4096.0F);
        var9.field905 = arg4;
        var9.field912 = arg7;
        var9.field909 = arg6;
        var9.field920 = arg0;
        var9.method85((byte) 66);
        class639.method3594(arg5, arg1, 1);
        var9.method557((byte) -76, var8, 0);
        return var8;
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(B)V", line = 25)
    public final void method60(byte arg0) {
        ++field6602;
        if (super.field1712.field5543.method1142((byte) -123) && super.field1708 == 2) {
            super.field1708 = 1;
        }
        if (arg0 >= 118) {
            if (super.field1708 < 0 || super.field1708 > 2) {
                super.field1708 = this.method58(0);
            }
        }
    }

    @OriginalMember(owner = "client!lia", name = "<init>", descriptor = "(ILkda;)V", line = 44)
    public class478(int arg0, class391 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!lia", name = "c", descriptor = "(II)I", line = 48)
    public final int method57(int arg0, int arg1) {
        if (arg1 != 29053) {
            return 21;
        } else {
            ++field6611;
            return 1;
        }
    }

    @OriginalMember(owner = "client!lia", name = "b", descriptor = "(B)V", line = 65)
    public static void method2686(byte arg0) {
        field6610 = null;
        field6607 = null;
        if (arg0 != -51) {
            field6610 = null;
        }
    }

    @OriginalMember(owner = "client!lia", name = "c", descriptor = "(B)I", line = 76)
    public final int method2687(byte arg0) {
        ++field6606;
        if (arg0 <= 119) {
            this.method57(63, 110);
        }
        return super.field1708;
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(II)V", line = 87)
    public final void method55(int arg0, int arg1) {
        int var3 = -37 % ((-26 - arg0) / 41);
        ++field6603;
        super.field1708 = arg1;
    }

    @OriginalMember(owner = "client!lia", name = "<init>", descriptor = "(Lkda;)V", line = 98)
    public class478(class391 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(I)I", line = 101)
    public final int method58(int arg0) {
        ++field6605;
        if (arg0 != 0) {
            this.method60((byte) 91);
        }
        return 2;
    }
}
