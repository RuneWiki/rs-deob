import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class549 extends class450 {

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field7252 = new String[200];

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public static int field7246;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public static int field7247;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public static int field7248;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
    public static int field7249;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
    public static int field7250;

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "I")
    public static int field7253;

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "I")
    public static int field7254;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "I")
    public static int field7255;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "Lefa;")
    public static class185 field7251;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)Z")
    public static final boolean method3069(int arg0, int arg1, int arg2) {
        ++field7249;
        if (arg0 <= 83) {
            field7252 = null;
        }
        return (24 & arg2) != 0 | (arg2 & 544) == 544;
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lup;)V")
    public class549(class278 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)V")
    public final void method73(byte arg0) {
        if (super.field6170 != 1 && super.field6170 != 0) {
            super.field6170 = this.method68(false);
        }
        ++field7248;
        if (arg0 != 98) {
            field7252 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)I")
    public final int method68(boolean arg0) {
        ++field7247;
        if (arg0) {
            this.method73((byte) -36);
        }
        return 1;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(Z)I")
    public final int method3070(boolean arg0) {
        ++field7253;
        if (!arg0) {
            field7251 = null;
        }
        return super.field6170;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZI)V")
    public final void method67(boolean arg0, int arg1) {
        super.field6170 = arg1;
        ++field7254;
        if (!arg0) {
            this.method73((byte) 49);
        }
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(ILup;)V")
    public class549(int arg0, class278 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(B)V")
    public static void method3071(byte arg0) {
        field7251 = null;
        if (arg0 == 105) {
            field7252 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIILka;)Lck;")
    public static final class642 method3072(int arg0, int arg1, int arg2, int arg3, class475 arg4) {
        if (arg3 != 544) {
            method3069(20, -105, -116);
        }
        ++field7246;
        return arg4 == null ? null : new class642(arg1, arg2, arg0, arg4.method209(), arg4.method211(), arg4.method175(), arg4.method180(), arg4.method148(), arg4.method217(), arg4.method205());
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)I")
    public final int method75(int arg0, int arg1) {
        ++field7250;
        if (arg0 != 0) {
            field7251 = null;
        }
        return 1;
    }
}
