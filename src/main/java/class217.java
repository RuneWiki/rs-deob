import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class217 extends class450 {

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "Lhda;")
    public static class752 field3139 = new class752(15, 12);

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lup;)V")
    public class217(class278 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
    public final void method73(byte arg0) {
        if (super.field6170 != 1 && super.field6170 != 0) {
            super.field6170 = this.method68(false);
        }
        if (arg0 == 98) {
            ++field3138;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)I")
    public final int method68(boolean arg0) {
        if (arg0) {
            this.method67(false, 41);
        }
        ++field3136;
        return 1;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(Z)I")
    public final int method1406(boolean arg0) {
        ++field3137;
        if (!arg0) {
            this.method1406(true);
        }
        return super.field6170;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)V")
    public static void method1407(byte arg0) {
        if (arg0 != 36) {
            field3139 = null;
        }
        field3139 = null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1408(int arg0, int arg1, byte arg2) {
        if (arg2 >= -108) {
            return false;
        } else {
            ++field3142;
            return class53.method365((byte) -125, arg0, arg1) || class371.method2180(arg0, 13, arg1);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZI)V")
    public final void method67(boolean arg0, int arg1) {
        if (!arg0) {
            this.method75(97, -11);
        }
        ++field3141;
        super.field6170 = arg1;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)I")
    public final int method75(int arg0, int arg1) {
        if (arg0 != 0) {
            field3139 = null;
        }
        ++field3140;
        return 1;
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(ILup;)V")
    public class217(int arg0, class278 arg1) {
        super(arg0, arg1);
    }
}
