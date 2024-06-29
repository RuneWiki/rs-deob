import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class170 extends class260 {

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "Lsw;")
    public static class787 field2268 = new class787(1);

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "I")
    public static int field2272 = -1;

    @OriginalMember(owner = "client!jh", name = "r", descriptor = "I")
    public static int field2275 = 0;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "J")
    public static long field2269 = 0L;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lfca;)V", line = 4)
    public class170(class92 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(IB)V", line = 8)
    public final void method9(int arg0, byte arg1) {
        if (arg1 != -107) {
            field2269 = -75L;
        }
        super.field3868 = arg0;
        ++field2274;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(Z)V", line = 20)
    public static void method1208(boolean arg0) {
        field2268 = null;
        if (arg0) {
            method1208(false);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)V", line = 34)
    public final void method2(boolean arg0) {
        if (super.field3867.method737(arg0) == class380.field5545) {
            if (super.field3867.method740((byte) -123)) {
                super.field3868 = 0;
            }
        } else {
            super.field3868 = 1;
        }
        ++field2266;
        if (super.field3868 != 0 && ~super.field3868 != -2) {
            super.field3868 = this.method8((byte) 4);
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(ILfca;)V", line = 54)
    public class170(int arg0, class92 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)I", line = 57)
    public final int method1209(int arg0) {
        ++field2270;
        if (arg0 <= 3) {
            field2272 = 46;
        }
        return super.field3868;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)I", line = 79)
    public final int method8(byte arg0) {
        ++field2273;
        return arg0 != 4 ? -112 : 1;
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)Z", line = 90)
    public final boolean method1210(int arg0) {
        ++field2267;
        if (super.field3867.method737(false) == class380.field5545) {
            return !super.field3867.method740((byte) -113);
        } else {
            int var2 = -52 % ((56 - arg0) / 53);
            return false;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IB)I", line = 109)
    public final int method4(int arg0, byte arg1) {
        ++field2271;
        int var3 = -79 / ((arg1 - -53) / 50);
        if (super.field3867.method737(false) == class380.field5545) {
            if (super.field3867.method740((byte) -107)) {
                return 3;
            } else {
                return arg0 != 0 && super.field3867.field1301.method2583(62) != 1 ? 2 : 1;
            }
        } else {
            return 3;
        }
    }
}
