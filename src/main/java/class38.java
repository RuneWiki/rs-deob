import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class38 extends class134 {

    @OriginalMember(owner = "client!be", name = "l", descriptor = "I")
    public static int field395 = -1;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public static int field394 = -1;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "Lni;")
    public static class522 field396;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(B)I", line = 3)
    public final int method186(byte arg0) {
        if (arg0 < 119) {
            field394 = 36;
        }
        ++field393;
        return super.field1708;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(ILkda;)V", line = 15)
    public class38(int arg0, class391 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIII)V", line = 23)
    public static final void method187(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var8 = arg0 + 1;
        class168.method980(arg4, class300.field4036[arg0], arg3, arg2, (byte) -123);
        ++field397;
        int var9 = arg1 - 1;
        class168.method980(arg4, class300.field4036[arg1], arg3, arg2, (byte) 125);
        if (arg5 != -10194) {
            field395 = 18;
        }
        for (int var6 = var8; ~var6 >= ~var9; ++var6) {
            int[] var7 = class300.field4036[var6];
            var7[arg3] = var7[arg2] = arg4;
        }
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lkda;)V", line = 49)
    public class38(class391 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)I", line = 52)
    public final int method58(int arg0) {
        if (arg0 != 0) {
            field396 = null;
        }
        ++field390;
        return super.field1712.method2277((byte) 104) == class257.field3338 && super.field1712.method2282((byte) 104) ? 0 : 1;
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(II)I", line = 74)
    public final int method57(int arg0, int arg1) {
        ++field391;
        if (arg1 != 29053) {
            field395 = -23;
        }
        return 3;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)V", line = 86)
    public final void method55(int arg0, int arg1) {
        super.field1708 = arg1;
        ++field392;
        int var3 = -62 % ((arg0 - -26) / 41);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V", line = 97)
    public final void method60(byte arg0) {
        super.field1708 = this.method58(0);
        ++field389;
        if (arg0 < 118) {
            method187(-59, 53, -54, 62, 98, 89);
        }
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(I)V", line = 108)
    public static void method188(int arg0) {
        if (arg0 == -3623) {
            field396 = null;
        }
    }
}
