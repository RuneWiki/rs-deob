import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dia")
public class class234 extends class220 {

    @OriginalMember(owner = "client!dia", name = "F", descriptor = "Lqe;")
    public static class469 field3402 = new class469(115, 3);

    @OriginalMember(owner = "client!dia", name = "O", descriptor = "Loo;")
    public static class629 field3409 = new class629(10, 8);

    @OriginalMember(owner = "client!dia", name = "K", descriptor = "B")
    public byte field3406;

    @OriginalMember(owner = "client!dia", name = "C", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!dia", name = "H", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!dia", name = "I", descriptor = "I")
    public int field3405;

    @OriginalMember(owner = "client!dia", name = "L", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!dia", name = "M", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!dia", name = "G", descriptor = "Lrg;")
    public class645 field3403;

    @OriginalMember(owner = "client!dia", name = "Q", descriptor = "Lql;")
    public static class738 field3411;

    @OriginalMember(owner = "client!dia", name = "P", descriptor = "[Lds;")
    public static class14[] field3410;

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(I[BZLno;)Ldw;")
    public static final class720 method1558(int arg0, byte[] arg1, boolean arg2, class704 arg3) {
        ++field3407;
        if (arg1 == null) {
            return null;
        } else {
            int var4 = OpenGL.glGenProgramARB();
            OpenGL.glBindProgramARB(arg0, var4);
            OpenGL.glProgramRawARB(arg0, 34933, arg1);
            OpenGL.glGetIntegerv(34379, class364.field5244, 0);
            if (!arg2) {
                return null;
            } else if (~class364.field5244[0] != 0) {
                OpenGL.glBindProgramARB(arg0, 0);
                return null;
            } else {
                OpenGL.glBindProgramARB(arg0, 0);
                return new class720(arg3, arg0, var4);
            }
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(Z)[B")
    public final byte[] method1476(boolean arg0) {
        ++field3408;
        if (arg0) {
            this.field3406 = 104;
        }
        if (!super.field3226 && ~(this.field3403.field9068.length + -this.field3406) >= ~this.field3403.field9084) {
            return this.field3403.field9068;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!dia", name = "b", descriptor = "(II)Lgq;")
    public static final class516 method1559(int arg0, int arg1) {
        ++field3404;
        class516 var2 = (class516) class33.field341.method803(120, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            if (arg1 < 33) {
                method1559(56, 46);
            }
            byte[] var3 = class99.field1415.method211(true, 0, arg0);
            class516 var4 = new class516();
            if (var3 != null) {
                var4.method3050((byte) -75, new class645(var3));
            }
            var4.method3044((byte) 95);
            class33.field341.method801(1, var4, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!dia", name = "e", descriptor = "(I)V")
    public static void method1560(int arg0) {
        field3410 = null;
        if (arg0 < 115) {
            field3411 = null;
        }
        field3402 = null;
        field3409 = null;
        field3411 = null;
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(I)I")
    public final int method1475(int arg0) {
        ++field3401;
        if (arg0 != -554) {
            this.field3403 = null;
        }
        return this.field3403 == null ? 0 : this.field3403.field9084 * 100 / (this.field3403.field9068.length + -this.field3406);
    }
}
