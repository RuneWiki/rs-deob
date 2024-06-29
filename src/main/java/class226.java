import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public class class226 extends class538 implements class514 {

    @OriginalMember(owner = "client!kw", name = "A", descriptor = "I")
    private int field3144;

    @OriginalMember(owner = "client!kw", name = "t", descriptor = "[I")
    public static int[] field3137 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!kw", name = "x", descriptor = "I")
    public static int field3141 = -50;

    @OriginalMember(owner = "client!kw", name = "u", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!kw", name = "v", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!kw", name = "w", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!kw", name = "y", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!kw", name = "z", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(Llj;I[BIZ)V")
    public class226(class565 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field3144 = arg1;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(III[B)V")
    public final void method670(int arg0, int arg1, int arg2, byte[] arg3) {
        this.method3044(0, arg3, arg0);
        ++field3142;
        if (arg1 < -68) {
            this.field3144 = arg2;
        }
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(I)I")
    public final int method671(int arg0) {
        if (arg0 != 3566) {
            this.method668(29);
        }
        ++field3138;
        return this.field3144;
    }

    @OriginalMember(owner = "client!kw", name = "d", descriptor = "(I)V")
    public final void method594(int arg0) {
        ++field3140;
        int var2 = 107 / ((14 - arg0) / 61);
        super.field7273.method3197(27, this);
    }

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "(I)J")
    public final long method667(int arg0) {
        if (arg0 != 25023) {
            return 89L;
        } else {
            ++field3139;
            return 0L;
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Z)V")
    public static void method1431(boolean arg0) {
        if (!arg0) {
            method1431(false);
        }
        field3137 = null;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(I)I")
    public final int method668(int arg0) {
        if (arg0 != -7881) {
            this.method668(-125);
        }
        ++field3143;
        return super.field7271;
    }
}
