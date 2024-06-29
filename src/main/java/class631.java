import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class631 extends class72 {

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "[S")
    public static short[] field9044 = new short[256];

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "Lqe;")
    public static class465 field9050 = new class465(115, 6);

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
    public static int field9045;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
    public static int field9046;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
    public static int field9047;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "I")
    public static int field9048;

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "I")
    public static int field9049;

    @OriginalMember(owner = "client!jk", name = "p", descriptor = "I")
    public static int field9052;

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "[Lkr;")
    public static class743[] field9051;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(II)I")
    public final int method58(int arg0, int arg1) {
        ++field9047;
        return arg1 != 11260 ? 86 : 1;
    }

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "(I)I")
    public final int method3630(int arg0) {
        if (arg0 != 27669) {
            this.method59(114, 26);
        }
        ++field9048;
        return super.field1282;
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(ILcq;)V")
    public class631(int arg0, class464 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)V")
    public final void method59(int arg0, int arg1) {
        if (arg1 != 3) {
            this.method59(-75, 109);
        }
        super.field1282 = arg0;
        ++field9045;
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Lcq;)V")
    public class631(class464 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
    public final void method55(int arg0) {
        if (~super.field1282 > -1 || super.field1282 > 4) {
            super.field1282 = this.method60(-3271);
        }
        if (arg0 > 30) {
            ++field9046;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Z)V")
    public static void method3631(boolean arg0) {
        field9050 = null;
        field9051 = null;
        field9044 = null;
        if (!arg0) {
            field9050 = null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)I")
    public final int method60(int arg0) {
        if (arg0 != -3271) {
            return -29;
        } else {
            ++field9049;
            return 3;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(FIBFF)F")
    public static final float method3632(float arg0, int arg1, byte arg2, float arg3, float arg4) {
        ++field9052;
        int var5 = 62 % ((arg2 - -23) / 50);
        float[] var6 = class483.field6840[arg1];
        return var6[2] * arg0 + var6[0] * arg3 + var6[1] * arg4;
    }
}
