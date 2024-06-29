import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public class class281 extends class671 implements class251 {

    @OriginalMember(owner = "client!jw", name = "H", descriptor = "I")
    public static int field3737 = 0;

    @OriginalMember(owner = "client!jw", name = "x", descriptor = "B")
    private byte field3727;

    @OriginalMember(owner = "client!jw", name = "w", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!jw", name = "y", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!jw", name = "A", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!jw", name = "B", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!jw", name = "C", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!jw", name = "D", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!jw", name = "E", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!jw", name = "F", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!jw", name = "G", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!jw", name = "z", descriptor = "Lwu;")
    public static class557 field3729;

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(III)Z")
    public final boolean method1591(int arg0, int arg1, int arg2) {
        ++field3734;
        this.field3727 = (byte) arg2;
        if (arg0 != -17230) {
            return false;
        } else {
            super.method1399(arg1, true);
            return true;
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;")
    public final Buffer method1590(byte arg0, boolean arg1) {
        ++field3733;
        return arg0 != 64 ? null : super.method3844(super.field9448.field1357, arg0 ^ 33, arg1);
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(I)Z")
    public final boolean method1592(int arg0) {
        if (arg0 != -14952) {
            field3729 = null;
        }
        ++field3735;
        return super.method3838(super.field9448.field1357, true);
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(ILs;)V")
    public static final void method1680(int arg0, class339 arg1) {
        class52.field741[arg0] = arg1;
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(IB)V")
    public static final void method1681(int arg0, byte arg1) {
        if (arg1 != -13) {
            method1680(-64, (class339) null);
        }
        ++field3726;
        class118 var2 = class126.method814(true, arg0, 1);
        var2.method778(27970);
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(Z)V")
    public final void method1398(boolean arg0) {
        super.method1398(arg0);
        ++field3728;
    }

    @OriginalMember(owner = "client!jw", name = "c", descriptor = "(B)I")
    public final int method1682(byte arg0) {
        ++field3730;
        if (arg0 > -44) {
            field3737 = -103;
        }
        return this.field3727;
    }

    @OriginalMember(owner = "client!jw", name = "<init>", descriptor = "(Lsb;Z)V")
    public class281(class93 arg0, boolean arg1) {
        super(arg0, 34962, arg1);
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(Ljaclib/memory/Source;III)Z")
    public final boolean method1593(Source arg0, int arg1, int arg2, int arg3) {
        ++field3732;
        if (arg3 != 1340) {
            return true;
        } else {
            this.field3727 = (byte) arg1;
            super.method3843(arg0, arg2, -128);
            return true;
        }
    }

    @OriginalMember(owner = "client!jw", name = "c", descriptor = "(Z)I")
    public final int method1683(boolean arg0) {
        if (arg0) {
            field3736 = -122;
        }
        ++field3731;
        return super.method1683(false);
    }

    @OriginalMember(owner = "client!jw", name = "d", descriptor = "(B)V")
    public static void method1684(byte arg0) {
        field3729 = null;
        if (arg0 <= 41) {
            field3736 = -9;
        }
    }
}
