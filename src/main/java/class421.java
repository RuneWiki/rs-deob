import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class421 extends class134 {

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public static int field5893 = 0;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "Lef;")
    public static class488 field5897 = new class488();

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public static int field5894;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field5895;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    public static int field5896;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
    public static int field5898;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
    public static int field5900;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "I")
    public static int field5902;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "I")
    public static int field5903;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "Lni;")
    public static class522 field5901;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "[S")
    public static short[] field5899;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)I", line = 4)
    public final int method58(int arg0) {
        ++field5896;
        if (arg0 != 0) {
            return 97;
        } else if (!super.field1712.method2282((byte) 118)) {
            return super.field1712.field5503.method744(true) && class31.method143(super.field1712.field5503.method741((byte) 124), (byte) 20) ? 1 : 0;
        } else {
            return 2;
        }
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(II)I", line = 25)
    public final int method57(int arg0, int arg1) {
        ++field5902;
        if (arg1 != 29053) {
            field5897 = null;
        }
        return super.field1712.method2282((byte) 117) ? 3 : 1;
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lkda;)V", line = 41)
    public class421(class391 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)V", line = 47)
    public final void method55(int arg0, int arg1) {
        ++field5903;
        int var3 = -57 / ((-26 - arg0) / 41);
        super.field1708 = arg1;
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)Z", line = 57)
    public final boolean method2404(int arg0) {
        if (arg0 != -1) {
            this.method2405((byte) -99);
        }
        ++field5894;
        return !super.field1712.method2282((byte) 122);
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(ILkda;)V", line = 73)
    public class421(int arg0, class391 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)I", line = 79)
    public final int method2405(byte arg0) {
        if (arg0 <= 119) {
            field5893 = -41;
        }
        ++field5898;
        return super.field1708;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V", line = 91)
    public final void method60(byte arg0) {
        ++field5900;
        if (arg0 <= 118) {
            field5901 = null;
        }
        if (super.field1712.method2282((byte) 117)) {
            super.field1708 = 2;
        }
        if (~super.field1708 > -1 || super.field1708 > 2) {
            super.field1708 = this.method58(0);
        }
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "(I)V", line = 110)
    public static void method2406(int arg0) {
        field5899 = null;
        field5897 = null;
        field5901 = null;
        if (arg0 != 3) {
            method2406(19);
        }
    }
}
