import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public class class38 extends class392 {

    @OriginalMember(owner = "client!bea", name = "i", descriptor = "Lvb;")
    public static class396 field446 = new class396(8, 4);

    @OriginalMember(owner = "client!bea", name = "p", descriptor = "J")
    public static long field453 = (long) (Math.random() * 9.999999999E9D);

    @OriginalMember(owner = "client!bea", name = "l", descriptor = "Lss;")
    public static class307 field449 = new class307("", 18);

    @OriginalMember(owner = "client!bea", name = "g", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!bea", name = "h", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!bea", name = "j", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!bea", name = "k", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!bea", name = "m", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!bea", name = "o", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!bea", name = "n", descriptor = "Lep;")
    public static class498 field451;

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(BI)V", line = 3)
    public final void method286(byte arg0, int arg1) {
        ++field448;
        super.field5452 = arg1;
        int var3 = 75 / ((arg0 - -80) / 38);
    }

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "(I)Z", line = 13)
    public final boolean method287(int arg0) {
        ++field450;
        if (arg0 != 0) {
            this.method288(-108);
        }
        if (super.field5454.method3782((byte) -75)) {
            return false;
        } else {
            return super.field5454.method3775(arg0 + -64) == class448.field6175;
        }
    }

    @OriginalMember(owner = "client!bea", name = "c", descriptor = "(I)I", line = 30)
    public final int method288(int arg0) {
        ++field444;
        return arg0 != 17539 ? 46 : super.field5452;
    }

    @OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(ILw;)V", line = 41)
    public class38(int arg0, class675 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(B)V", line = 44)
    public static void method289(byte arg0) {
        field449 = null;
        field451 = null;
        field446 = null;
        if (arg0 >= -48) {
            field451 = null;
        }
    }

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "(II)I", line = 66)
    public final int method290(int arg0, int arg1) {
        ++field445;
        if (arg1 > -124) {
            field451 = null;
        }
        if (super.field5454.method3782((byte) -50)) {
            return 3;
        } else {
            return super.field5454.method3775(-104) == class448.field6175 ? 1 : 3;
        }
    }

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "(Z)V", line = 84)
    public final void method291(boolean arg0) {
        if (super.field5454.method3775(-102) == class448.field6175) {
            if (super.field5454.method3782((byte) -97)) {
                super.field5452 = 0;
            }
        } else {
            super.field5452 = 1;
        }
        ++field447;
        if (~super.field5452 != -1 && ~super.field5452 != -2) {
            super.field5452 = this.method292(true);
        }
        if (arg0) {
            method289((byte) -48);
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(Z)I", line = 105)
    public final int method292(boolean arg0) {
        if (!arg0) {
            return 118;
        } else {
            ++field452;
            return 1;
        }
    }

    @OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(Lw;)V", line = 125)
    public class38(class675 arg0) {
        super(arg0);
    }
}
