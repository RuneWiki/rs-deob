import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class84 extends class132 {

    @OriginalMember(owner = "client!pd", name = "P", descriptor = "I")
    public static int field937 = 0;

    @OriginalMember(owner = "client!pd", name = "R", descriptor = "I")
    public static int field939 = -1;

    @OriginalMember(owner = "client!pd", name = "U", descriptor = "Z")
    public static boolean field942 = true;

    @OriginalMember(owner = "client!pd", name = "L", descriptor = "I")
    public int field933;

    @OriginalMember(owner = "client!pd", name = "M", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!pd", name = "N", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!pd", name = "O", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!pd", name = "S", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!pd", name = "T", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!pd", name = "E", descriptor = "Lam;")
    public static class286 field931;

    @OriginalMember(owner = "client!pd", name = "K", descriptor = "Lqk;")
    public class334 field932;

    @OriginalMember(owner = "client!pd", name = "Q", descriptor = "[B")
    public byte[] field938;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "(I)I", line = 6)
    public final int method335(int arg0) {
        ++field934;
        if (arg0 != 26655) {
            this.field932 = null;
        }
        return super.field1708 ? 0 : 100;
    }

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "(I)V", line = 20)
    public static void method456(int arg0) {
        field931 = null;
        if (arg0 != -1) {
            field931 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IILhd;)Lhr;", line = 31)
    public static final class122 method457(int arg0, int arg1, class17 arg2) {
        if (arg1 != 0) {
            field937 = -41;
        }
        ++field935;
        class122 var3;
        if (class109.field1342 == null) {
            var3 = new class122();
        } else {
            var3 = class109.field1342;
            class109.field1342 = class109.field1342.field1511;
            var3.field1511 = null;
            --class119.field1488;
        }
        var3.field1507 = arg0;
        var3.field1505 = arg2;
        return var3;
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(B)V", line = 57)
    public static final void method458(byte arg0) {
        ++field936;
        int var1 = 0;
        if (arg0 > -76) {
            method457(127, 39, (class17) null);
        }
        while (var1 < 100) {
            class321.field4290[var1] = true;
            ++var1;
        }
    }

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "(I)I", line = 77)
    public static final int method459(int arg0) {
        if (arg0 != 27582) {
            method459(102);
        }
        ++field941;
        class114 var1 = class333.field4426;
        synchronized (class333.field4426) {
            return class333.field4426.method607(2040);
        }
    }

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "(I)[B", line = 96)
    public final byte[] method337(int arg0) {
        if (arg0 != -3695) {
            this.field938 = null;
        }
        ++field940;
        if (super.field1708) {
            throw new RuntimeException();
        } else {
            return this.field938;
        }
    }
}
