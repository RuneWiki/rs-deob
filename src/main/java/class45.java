import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class45 {

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "Lqi;")
    public class269 field657;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
    public int field655;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "Ljava/lang/String;")
    public static String field656 = "red:";

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
    public static int field654 = -2;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V", line = 6)
    public static void method340(byte arg0) {
        field656 = null;
        if (arg0 != -116) {
            method343(39, (class221) null);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IB)V", line = 16)
    public static final void method341(int arg0, byte arg1) {
        field649++;
        if (arg0 == 0) {
            return;
        }
        if (arg0 == 1) {
            class263.method1852((byte) 54);
        } else if (arg0 == 2) {
            class241.method1683(1536);
        } else if (arg0 == 3) {
            class30.method257(0);
        } else {
            throw new RuntimeException();
        }
        int var2 = 49 % ((-arg1 - 23) / 36);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILnm;II)Llj;", line = 44)
    public static final class289 method342(int arg0, class221 arg1, int arg2, int arg3) {
        field648++;
        if (arg0 == -1) {
            return class334.method2361(arg2, arg1, 16836, arg3) ? class125.method809(-118) : null;
        } else {
            return (class289) null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILnm;)V", line = 59)
    public static final void method343(int arg0, class221 arg1) {
        field651++;
        class68.field1051 = arg1;
        if (arg0 != -3) {
            method344(-68, 71, -64, 49, 45, -123, -74, -121);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIIIII)V", line = 70)
    public static final void method344(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg7 != -1) {
            method343(-71, (class221) null);
        }
        field650++;
        if (class341.field5494 <= arg3 && arg0 <= class196.field3001 && arg1 >= class33.field505 && class278.field4586 >= arg5) {
            class308.method2147(arg3, arg2, arg0, arg4, arg6, arg5, (byte) 89, arg1);
        } else {
            class169.method1168(arg3, arg1, arg2, arg6, arg4, arg0, (byte) 34, arg5);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)I", line = 89)
    public static final int method345(int arg0, int arg1) {
        field652++;
        if (arg0 <= 53) {
            method342(-29, (class221) null, 68, 43);
        }
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(III)V", line = 107)
    public static final void method346(int arg0, int arg1, int arg2) {
        class98.field1407 = class236.field3742[arg0][arg1].field777;
        field653++;
        class358.field5667 = class236.field3742[arg0][arg1].field787;
        if (arg2 != 20102) {
            method342(-32, (class221) null, -17, 73);
        }
        class51.field758 = class236.field3742[arg0][arg1].field774;
        class234.method1617((float) class98.field1407, (float) class358.field5667, (float) class51.field758);
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(II)V", line = 124)
    public class45(int arg0, int arg1) {
        this.field657 = class25.method220(27209, arg0);
        this.field655 = arg1;
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lqi;I)V", line = 132)
    public class45(class269 arg0, int arg1) {
        this.field655 = arg1;
        this.field657 = arg0;
    }
}
