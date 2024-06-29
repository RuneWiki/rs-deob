import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class211 extends class450 {

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "Lle;")
    public static class311 field3102 = new class311();

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "Lqu;")
    public static class98 field3104 = new class98();

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "I")
    public static int field3105 = 0;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(ILup;)V", line = 4)
    public class211(int arg0, class278 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZI)V", line = 7)
    public final void method67(boolean arg0, int arg1) {
        if (arg0) {
            super.field6170 = arg1;
            ++field3097;
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(B)V", line = 18)
    public static final void method1398(byte arg0) {
        ++field3101;
        if (!class718.field9926) {
            if (arg0 == -90) {
                class394.field5492 += (12.0F - class394.field5492) / 2.0F;
                class616.field8238 = true;
                class718.field9926 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Z)I", line = 35)
    public final int method68(boolean arg0) {
        if (arg0) {
            field3104 = null;
        }
        ++field3103;
        return 0;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)I", line = 47)
    public final int method75(int arg0, int arg1) {
        ++field3099;
        if (arg0 != 0) {
            field3104 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V", line = 58)
    public final void method73(byte arg0) {
        if (super.field6170 != 1 && ~super.field6170 != -1) {
            super.field6170 = this.method68(false);
        }
        if (arg0 != 98) {
            field3104 = null;
        }
        ++field3100;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(Z)I", line = 73)
    public final int method1399(boolean arg0) {
        ++field3098;
        if (!arg0) {
            field3105 = -68;
        }
        return super.field6170;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lup;)V", line = 84)
    public class211(class278 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V", line = 92)
    public static void method1400(int arg0) {
        field3104 = null;
        field3102 = null;
        if (arg0 < 119) {
            field3102 = null;
        }
    }
}
