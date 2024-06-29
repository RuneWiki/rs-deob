import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class141 {

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "Llk;")
    private class638 field1798 = new class638(256);

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "Llk;")
    private class638 field1805 = new class638(256);

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "Lae;")
    private class283 field1801;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "Lae;")
    private class283 field1799;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "Ljn;")
    public static class134 field1794 = new class134(98, 8);

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "[I")
    public static int[] field1796 = new int[25];

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "([III)Lfk;")
    public final class348 method931(int[] arg0, int arg1, int arg2) {
        field1806++;
        if (this.field1801.method1866((byte) 79) == 1) {
            return this.method933(arg1, 0, arg0, (byte) -127);
        } else if (this.field1801.method1867(arg1, (byte) 49) == 1) {
            return this.method933(0, arg1, arg0, (byte) -118);
        } else {
            if (arg2 != 0) {
                method932(null, (byte) 77);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lrv;B)V")
    public static final void method932(class66 arg0, byte arg1) {
        field1797++;
        class259.field3799 = arg0;
        if (arg1 != -112) {
            field1802 = 73;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II[IB)Lfk;")
    private final class348 method933(int arg0, int arg1, int[] arg2, byte arg3) {
        field1804++;
        int var5 = arg0 ^ (arg1 >>> 12 | (arg1 & 0xA0000FFF) << 4);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class348 var9 = (class348) this.field1805.method3669(false, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class622 var10 = (class622) this.field1798.method3669(false, var7);
            if (var10 == null) {
                var10 = class622.method3578(this.field1801, arg1, arg0);
                if (var10 == null) {
                    return null;
                }
                this.field1798.method3666((byte) 65, var7, var10);
            }
            class348 var11 = var10.method3582(arg2);
            if (var11 == null) {
                return null;
            }
            if (arg3 >= -114) {
                this.field1805 = null;
            }
            var10.method527(-11229);
            this.field1805.method3666((byte) 65, var7, var11);
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "([IIB)Lfk;")
    public final class348 method934(int[] arg0, int arg1, byte arg2) {
        if (arg2 >= -43) {
            return null;
        }
        field1795++;
        if (this.field1799.method1866((byte) 103) == 1) {
            return this.method935(arg1, arg0, 0, 0);
        } else if (this.field1799.method1867(arg1, (byte) 49) == 1) {
            return this.method935(0, arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I[III)Lfk;")
    private final class348 method935(int arg0, int[] arg1, int arg2, int arg3) {
        field1800++;
        int var5 = arg0 ^ ((arg3 & 0x20000FFF) << 4 | arg3 >>> 12);
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        class348 var9 = (class348) this.field1805.method3669(false, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 != 0) {
            return null;
        } else if (arg1 == null || arg1[0] > 0) {
            class307 var10 = class307.method1998(this.field1799, arg3, arg0);
            if (var10 == null) {
                return null;
            }
            class348 var11 = var10.method1995();
            this.field1805.method3666((byte) 65, var7, var11);
            if (arg1 != null) {
                arg1[0] -= var11.field5068.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
    public static void method936(int arg0) {
        int var1 = -122 / ((arg0 - 85) / 32);
        field1796 = null;
        field1794 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lgga;I)Ldd;")
    public static final class708 method937(class511 arg0, int arg1) {
        if (arg1 != 8) {
            method936(111);
        }
        field1803++;
        class126 var2 = class483.method2871(arg0, arg1 ^ 0x729C);
        int var3 = arg0.method3034(1);
        return new class708(var2.field5719, var2.field5716, var2.field5717, var2.field5715, var2.field5723, var2.field5722, var2.field5724, var2.field5721, var2.field5720, var2.field1638, var2.field1637, var2.field1639, var2.field1643, var2.field1640, var2.field1635, var3);
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lae;Lae;)V")
    public class141(class283 arg0, class283 arg1) {
        this.field1801 = arg1;
        this.field1799 = arg0;
    }
}
