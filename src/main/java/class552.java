import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public class class552 extends class649 {

    @OriginalMember(owner = "client!kga", name = "m", descriptor = "Z")
    public static boolean field7867 = false;

    @OriginalMember(owner = "client!kga", name = "n", descriptor = "Ltm;")
    public static class334 field7868 = new class334(50, 6);

    @OriginalMember(owner = "client!kga", name = "e", descriptor = "I")
    public static int field7859;

    @OriginalMember(owner = "client!kga", name = "f", descriptor = "I")
    public static int field7860;

    @OriginalMember(owner = "client!kga", name = "g", descriptor = "I")
    public static int field7861;

    @OriginalMember(owner = "client!kga", name = "h", descriptor = "I")
    public static int field7862;

    @OriginalMember(owner = "client!kga", name = "i", descriptor = "I")
    public static int field7863;

    @OriginalMember(owner = "client!kga", name = "j", descriptor = "I")
    public static int field7864;

    @OriginalMember(owner = "client!kga", name = "k", descriptor = "I")
    public static int field7865;

    @OriginalMember(owner = "client!kga", name = "l", descriptor = "I")
    public static int field7866;

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(II)I")
    public final int method133(int arg0, int arg1) {
        ++field7861;
        return arg0 != 18648 ? 61 : 1;
    }

    @OriginalMember(owner = "client!kga", name = "c", descriptor = "(I)[Lbu;")
    public static final class147[] method3217(int arg0) {
        int var1 = -128 / ((arg0 - -45) / 56);
        ++field7865;
        return new class147[] { class563.field7973, class426.field6256, class629.field8844 };
    }

    @OriginalMember(owner = "client!kga", name = "d", descriptor = "(I)I")
    public final int method3218(int arg0) {
        if (arg0 != 3) {
            field7867 = false;
        }
        ++field7860;
        return super.field9223;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(B)V")
    public static void method3219(byte arg0) {
        if (arg0 == -68) {
            field7868 = null;
        }
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(I)V")
    public final void method134(int arg0) {
        ++field7863;
        if (super.field9223 < 0 && ~super.field9223 < -5) {
            super.field9223 = this.method135(arg0 ^ -106);
        }
        if (arg0 != 1) {
            field7867 = true;
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IBILla;)Lpia;")
    public static final class54 method3220(int arg0, byte arg1, int arg2, class422 arg3) {
        ++field7859;
        int var4 = -120 / ((arg1 - 57) / 44);
        byte[] var5 = arg3.method2624(0, arg0, arg2);
        return var5 == null ? null : new class54(var5);
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IB)V")
    public final void method129(int arg0, byte arg1) {
        if (arg1 > -120) {
            field7868 = null;
        }
        super.field9223 = arg0;
        ++field7864;
    }

    @OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(Lhs;)V")
    public class552(class358 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(ILhs;)V")
    public class552(int arg0, class358 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(I)I")
    public final int method135(int arg0) {
        ++field7862;
        if (super.field9224.method2290(-21318).method3483(false) > 1) {
            return 4;
        } else {
            int var2 = -110 % ((arg0 - -18) / 50);
            return 2;
        }
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(II)V")
    public static final void method3221(int arg0, int arg1) {
        ++field7866;
        class118 var2 = class86.method755(true, 16, arg0);
        var2.method936(arg1 ^ arg1);
    }
}
