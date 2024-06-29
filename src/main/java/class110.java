import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class110 extends class134 {

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "Z")
    public boolean field1457 = false;

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "Z")
    private boolean field1463 = true;

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "Lkba;")
    public static class108 field1462 = new class108();

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "Llga;")
    public static class712 field1466 = new class712(70, 3);

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!eg", name = "r", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZZ)V")
    public final void method740(boolean arg0, boolean arg1) {
        ++field1465;
        this.field1463 = arg0;
        if (arg1) {
            method742(-106);
        }
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lkda;)V")
    public class110(class391 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(ILkda;)V")
    public class110(int arg0, class391 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(B)I")
    public final int method741(byte arg0) {
        if (arg0 <= 119) {
            this.field1463 = false;
        }
        ++field1461;
        return super.field1708;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)V")
    public final void method55(int arg0, int arg1) {
        ++field1468;
        super.field1708 = arg1;
        int var3 = 93 / ((-26 - arg0) / 41);
        this.field1457 = false;
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(II)I")
    public final int method57(int arg0, int arg1) {
        if (arg1 != 29053) {
            field1466 = null;
        }
        ++field1456;
        if (!super.field1712.method2280(arg1 + -29179).method3188(false)) {
            return 3;
        } else {
            return arg0 == 3 && !class32.method149(-1, "jagdx") ? 3 : 2;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)I")
    public final int method58(int arg0) {
        this.field1457 = true;
        if (arg0 != 0) {
            return 108;
        } else {
            ++field1467;
            return !super.field1712.method2280(-125).method3188(false) ? 0 : 2;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V")
    public final void method60(byte arg0) {
        if (arg0 < 118) {
            this.field1457 = false;
        }
        if (!super.field1712.method2280(-117).method3188(false)) {
            super.field1708 = 0;
        }
        ++field1458;
        if (super.field1708 < 0 || ~super.field1708 < -6) {
            super.field1708 = this.method58(0);
        }
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)V")
    public static void method742(int arg0) {
        field1462 = null;
        field1466 = null;
        if (arg0 != 0) {
            method743(45, (byte) -105, -121);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IBI)V")
    public static final void method743(int arg0, byte arg1, int arg2) {
        ++field1460;
        class252 var3 = class150.method916(arg2, -49, 12);
        var3.method1502((byte) -103);
        var3.field3251 = arg0;
        if (arg1 != -85) {
            method742(-109);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Z)Z")
    public final boolean method744(boolean arg0) {
        if (!arg0) {
            return false;
        } else {
            ++field1459;
            return this.field1463;
        }
    }

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "(I)Z")
    public final boolean method745(int arg0) {
        ++field1464;
        if (!super.field1712.method2280(-114).method3188(false)) {
            return false;
        } else {
            if (arg0 != -1) {
                this.method60((byte) 5);
            }
            return true;
        }
    }
}
