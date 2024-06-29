import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class13 extends class530 {

    @OriginalMember(owner = "client!af", name = "q", descriptor = "Z")
    public static boolean field187 = false;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "S")
    public static short field179 = 256;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "Low;")
    public static class747 field177 = new class747("", 13);

    @OriginalMember(owner = "client!af", name = "t", descriptor = "Lqk;")
    public static class148 field190 = new class148(89, -1);

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!af", name = "s", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!af", name = "v", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "Ltba;")
    public static class320 field188;

    @OriginalMember(owner = "client!af", name = "u", descriptor = "[I")
    public static int[] field191;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "[[Lpaa;")
    public static class712[][] field185;

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lah;)V")
    public class13(class374 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V")
    public static void method69(int arg0) {
        if (arg0 != 0) {
            field192 = 89;
        }
        field185 = null;
        field190 = null;
        field188 = null;
        field191 = null;
        field177 = null;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(II)V")
    public final void method70(int arg0, int arg1) {
        super.field7419 = arg0;
        if (arg1 > -38) {
            this.method74(-66);
        }
        ++field182;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "([J[II)V")
    public static final void method71(long[] arg0, int[] arg1, int arg2) {
        class23.method129(arg0, arg1, arg0.length + arg2, 0, (byte) -3);
        ++field183;
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(I)I")
    public final int method72(int arg0) {
        if (arg0 != 0) {
            return -93;
        } else {
            ++field181;
            return super.field7419;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Z)V")
    public final void method73(boolean arg0) {
        ++field184;
        if (!arg0) {
            this.method70(-3, -42);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)I")
    public final int method74(int arg0) {
        if (arg0 != 0) {
            field187 = false;
        }
        ++field189;
        return 0;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)I")
    public final int method75(int arg0, int arg1) {
        int var3 = 93 / ((63 - arg1) / 60);
        ++field178;
        return 1;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(ILah;)V")
    public class13(int arg0, class374 arg1) {
        super(arg0, arg1);
    }
}
