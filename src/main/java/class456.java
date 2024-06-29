import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class456 extends class86 {

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "Ltq;")
    public static class536 field5972 = new class536(10);

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "Lbt;")
    public static class437 field5975 = new class437(4, 7);

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "Luw;")
    public static class208 field5977 = new class208(104, 1);

    @OriginalMember(owner = "client!fg", name = "n", descriptor = "F")
    public static float field5978;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
    public static int field5971;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
    public static int field5973;

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "I")
    public static int field5974;

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "I")
    public static int field5976;

    @OriginalMember(owner = "client!fg", name = "o", descriptor = "I")
    public static int field5979;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Z)I")
    public final int method2587(boolean arg0) {
        ++field5973;
        if (arg0) {
            this.method71((byte) 116);
        }
        return super.field1200;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IZ)V")
    public final void method76(int arg0, boolean arg1) {
        ++field5971;
        super.field1200 = arg0;
        if (arg1) {
            this.method71((byte) -66);
        }
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Lsf;)V")
    public class456(class551 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(II)I")
    public final int method72(int arg0, int arg1) {
        ++field5979;
        return arg1 != -2 ? -45 : 1;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(Z)V")
    public static void method2588(boolean arg0) {
        field5975 = null;
        field5977 = null;
        if (arg0) {
            field5972 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V")
    public final void method71(byte arg0) {
        if (super.field1203.method2987(2) == class186.field2600) {
            super.field1200 = 2;
        }
        ++field5976;
        if (super.field1200 < 0 || ~super.field1200 < -3) {
            super.field1200 = this.method73(0);
        }
        if (arg0 != -65) {
            method2588(true);
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)I")
    public final int method73(int arg0) {
        if (arg0 != 0) {
            this.method73(89);
        }
        ++field5974;
        return 1;
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(ILsf;)V")
    public class456(int arg0, class551 arg1) {
        super(arg0, arg1);
    }
}
