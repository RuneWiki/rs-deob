import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class132 {

    @OriginalMember(owner = "client!tp", name = "h", descriptor = "Ltl;")
    private class400 field1841 = new class400(64);

    @OriginalMember(owner = "client!tp", name = "g", descriptor = "Lui;")
    private class451 field1840;

    @OriginalMember(owner = "client!tp", name = "i", descriptor = "I")
    public int field1842;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!tp", name = "e", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!tp", name = "f", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!tp", name = "j", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!tp", name = "k", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!tp", name = "l", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "Lrt;")
    public static class124 field1836;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V", line = 4)
    public final void method915(int arg0) {
        field1839++;
        class400 var2 = this.field1841;
        synchronized (this.field1841) {
            this.field1841.method2388(125);
            if (arg0 != 64) {
                method919((class451) null, 125, false, 11, -49, -15);
            }
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IILso;BLso;ZZ)I", line = 17)
    public static final int method916(int arg0, int arg1, class187 arg2, byte arg3, class187 arg4, boolean arg5, boolean arg6) {
        field1838++;
        int var7 = class306.method1906(arg5, arg4, (byte) -17, arg2, arg0);
        if (var7 != 0) {
            return arg5 ? -var7 : var7;
        } else if (arg1 == -1) {
            return 0;
        } else {
            if (arg3 < 85) {
                method919((class451) null, -105, false, 71, -38, 45);
            }
            int var8 = class306.method1906(arg6, arg4, (byte) -17, arg2, arg1);
            return arg6 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(II)V", line = 54)
    public final void method917(int arg0, int arg1) {
        if (arg0 != -6049) {
            method919((class451) null, 7, false, 117, 73, -31);
        }
        field1844++;
        class400 var3 = this.field1841;
        synchronized (this.field1841) {
            this.field1841.method2389(false, arg1);
        }
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(II)Lsg;", line = 69)
    public final class298 method918(int arg0, int arg1) {
        if (arg1 <= 94) {
            return null;
        }
        field1834++;
        class400 var3 = this.field1841;
        class298 var4;
        synchronized (this.field1841) {
            var4 = (class298) this.field1841.method2393(-127, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field1840.method2691(arg0, 16, 0);
        class298 var6 = new class298();
        if (var5 != null) {
            var6.method1863(new class446(var5), 0);
        }
        class400 var7 = this.field1841;
        synchronized (this.field1841) {
            this.field1841.method2395(0, var6, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lui;IZIII)V", line = 98)
    public static final void method919(class451 arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg4 != 6481) {
            method919((class451) null, 22, true, 73, 105, -57);
        }
        class479.field6747 = 10000;
        class338.field5076 = arg3;
        class415.field5986 = arg0;
        class372.field5600 = arg5;
        class346.field5283 = arg2;
        field1837++;
        class428.field6110 = 1;
        class268.field3968 = arg1;
    }

    @OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Lgp;ILui;)V", line = 131)
    public class132(class430 arg0, int arg1, class451 arg2) {
        this.field1840 = arg2;
        if (this.field1840 == null) {
            this.field1842 = 0;
        } else {
            this.field1842 = this.field1840.method2662(16, (byte) -7);
        }
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(I)V", line = 121)
    public static void method920(int arg0) {
        field1836 = null;
        if (arg0 != 15477) {
            field1835 = -21;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(B)V", line = 148)
    public final void method921(byte arg0) {
        field1845++;
        class400 var2 = this.field1841;
        synchronized (this.field1841) {
            this.field1841.method2401((byte) -115);
            int var3 = -6 / ((-arg0 - 25) / 51);
        }
    }
}
