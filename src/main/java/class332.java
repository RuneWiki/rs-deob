import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class332 {

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "Lfs;")
    private class387 field4625;

    @OriginalMember(owner = "client!qq", name = "g", descriptor = "I")
    public int field4627;

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "Lho;")
    public static class102 field4623 = new class102(14, 0, 4, 1);

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "Lbg;")
    public static class324 field4624 = new class324(49, 4);

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "F")
    public static float field4622;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)V", line = 8)
    public static void method2033(int arg0) {
        if (arg0 > -57) {
            method2035((byte) 69);
        }
        field4624 = null;
        field4623 = null;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIII)I", line = 27)
    public static final int method2034(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -24309) {
            field4622 = -1.2560716F;
        }
        field4621++;
        if (arg3 > arg2) {
            return arg3;
        } else if (arg0 >= arg2) {
            return arg2;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)V", line = 47)
    public static final void method2035(byte arg0) {
        class153.field2171.method1119(80);
        if (arg0 == 30) {
            field4626++;
        }
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Ljk;ILfs;)V", line = 63)
    public class332(class446 arg0, int arg1, class387 arg2) {
        new class156(64);
        this.field4625 = arg2;
        this.field4627 = this.field4625.method2367(15, 28724);
    }
}
