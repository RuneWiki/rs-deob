import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class603 extends class260 {

    @OriginalMember(owner = "client!uo", name = "p", descriptor = "Lmga;")
    public static class739 field8202 = new class739(6, 7);

    @OriginalMember(owner = "client!uo", name = "h", descriptor = "I")
    public static int field8194;

    @OriginalMember(owner = "client!uo", name = "i", descriptor = "I")
    public static int field8195;

    @OriginalMember(owner = "client!uo", name = "j", descriptor = "I")
    public static int field8196;

    @OriginalMember(owner = "client!uo", name = "k", descriptor = "I")
    public static int field8197;

    @OriginalMember(owner = "client!uo", name = "l", descriptor = "I")
    public static int field8198;

    @OriginalMember(owner = "client!uo", name = "m", descriptor = "I")
    public static int field8199;

    @OriginalMember(owner = "client!uo", name = "n", descriptor = "I")
    public static int field8200;

    @OriginalMember(owner = "client!uo", name = "o", descriptor = "I")
    public static int field8201;

    @OriginalMember(owner = "client!uo", name = "r", descriptor = "Loja;")
    public static class480 field8204;

    @OriginalMember(owner = "client!uo", name = "q", descriptor = "[[[Z")
    public static boolean[][][] field8203;

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(I)V")
    public static void method3351(int arg0) {
        field8203 = null;
        if (arg0 <= 66) {
            field8203 = null;
        }
        field8204 = null;
        field8202 = null;
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Lfca;)V")
    public class603(class92 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "(I)I")
    public final int method3352(int arg0) {
        if (arg0 <= 3) {
            return 93;
        } else {
            ++field8197;
            return super.field3868;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IB)I")
    public final int method4(int arg0, byte arg1) {
        int var3 = 36 / ((-53 - arg1) / 50);
        ++field8195;
        return 1;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Z)V")
    public final void method2(boolean arg0) {
        ++field8196;
        if (!arg0) {
            if (super.field3868 < 0 && ~super.field3868 < -128) {
                super.field3868 = this.method8((byte) 4);
            }
        }
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(ILfca;)V")
    public class603(int arg0, class92 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(B)I")
    public final int method8(byte arg0) {
        ++field8194;
        if (arg0 != 4) {
            field8202 = null;
        }
        return 127;
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(IB)V")
    public final void method9(int arg0, byte arg1) {
        super.field3868 = arg0;
        if (arg1 != -107) {
            this.method8((byte) 86);
        }
        ++field8199;
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(Z)I")
    public static final int method3353(boolean arg0) {
        ++field8200;
        if (!arg0) {
            field8203 = null;
        }
        return class383.field5611 == null ? 0 : class383.field5611.length * 2;
    }
}
