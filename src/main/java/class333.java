import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class333 extends class354 {

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "Z")
    private boolean field4249 = true;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "Z")
    public boolean field4241 = false;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
    public final void method388(int arg0) {
        ++field4245;
        if (!super.field4544.method4148((byte) 104).method19(arg0 ^ -6385)) {
            super.field4545 = 0;
        }
        if (~super.field4545 > -1 || super.field4545 > 5) {
            super.field4545 = this.method393((byte) 101);
        }
        if (arg0 != 6384) {
            field4239 = 76;
        }
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)Z")
    public final boolean method1921(int arg0) {
        ++field4244;
        if (!super.field4544.method4148((byte) 104).method19(-1)) {
            return false;
        } else {
            int var2 = 86 % ((arg0 - -34) / 41);
            return true;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)Z")
    public final boolean method1922(boolean arg0) {
        if (arg0) {
            field4239 = -97;
        }
        ++field4247;
        return this.field4249;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IZ)V")
    public final void method1923(int arg0, boolean arg1) {
        ++field4240;
        if (arg0 != 0) {
            field4239 = -64;
        }
        this.field4249 = arg1;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)I")
    public final int method393(byte arg0) {
        this.field4241 = true;
        ++field4248;
        int var2 = -109 / ((arg0 - 37) / 63);
        return !super.field4544.method4148((byte) 104).method19(-1) ? 0 : 2;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)I")
    public final int method1924(byte arg0) {
        int var2 = 23 / ((arg0 - 7) / 45);
        ++field4246;
        return super.field4545;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)I")
    public final int method391(int arg0, int arg1) {
        ++field4242;
        if (!super.field4544.method4148((byte) 104).method19(-1)) {
            return 3;
        } else {
            return arg0 == arg1 && !class711.method3974(0, "jagdx") ? 3 : 2;
        }
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lwo;)V")
    public class333(class746 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(II)V")
    public final void method389(int arg0, int arg1) {
        this.field4241 = false;
        super.field4545 = arg1;
        ++field4243;
        if (arg0 != -1) {
            this.method393((byte) 5);
        }
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(ILwo;)V")
    public class333(int arg0, class746 arg1) {
        super(arg0, arg1);
    }
}
