import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class115 {

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "Lvg;")
    private class49 field1801 = new class49(64);

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "Lri;")
    private class97 field1797;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)V", line = 3)
    public final void method1036(int arg0, int arg1) {
        class49 var3 = this.field1801;
        synchronized (this.field1801) {
            if (arg1 < 79) {
                return;
            }
            this.field1801.method573((byte) 125, arg0);
        }
        field1796++;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(II)Lpp;", line = 17)
    public static final class360 method1037(int arg0, int arg1) {
        if (arg1 == 100) {
            field1798++;
            return arg0 >= 0 && arg0 < 100 ? class353.field5618[arg0] : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V", line = 34)
    public final void method1038(int arg0) {
        field1794++;
        class49 var2 = this.field1801;
        synchronized (this.field1801) {
            this.field1801.method563(arg0 - 1);
        }
        if (arg0 != 1) {
            this.field1801 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V", line = 48)
    public static final void method1039(int arg0) {
        if (arg0 == -2135) {
            class453.field6805.method563(0);
            field1802++;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)Lup;", line = 60)
    public static final class252 method1040(int arg0, int arg1, int arg2) {
        if (class454.field6818[arg0][arg1][arg2] == null) {
            boolean var3 = class454.field6818[0][arg1][arg2] != null && class454.field6818[0][arg1][arg2].field4030 != null;
            if (var3 && arg0 >= class524.field7649 - 1) {
                return null;
            }
            class469.method2912(arg0, arg1, arg2);
        }
        return class454.field6818[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(II)Liba;", line = 74)
    public final class490 method1041(int arg0, int arg1) {
        field1799++;
        class49 var3 = this.field1801;
        class490 var4;
        synchronized (this.field1801) {
            var4 = (class490) this.field1801.method560(false, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class97 var5 = this.field1797;
        byte[] var6;
        synchronized (this.field1797) {
            var6 = this.field1797.method926(35, -124, arg1);
        }
        if (arg0 >= -102) {
            this.method1041(71, -35);
        }
        class490 var7 = new class490();
        if (var6 != null) {
            var7.method2996(5, new class6(var6));
        }
        var7.method2999(109);
        class49 var8 = this.field1801;
        synchronized (this.field1801) {
            this.field1801.method559(var7, (long) arg1, 0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)V", line = 112)
    public final void method1042(int arg0) {
        class49 var2 = this.field1801;
        synchronized (this.field1801) {
            if (arg0 != -32432) {
                this.method1036(31, 116);
            }
            this.field1801.method569(0);
        }
        field1795++;
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lei;ILri;)V", line = 131)
    public class115(class162 arg0, int arg1, class97 arg2) {
        this.field1797 = arg2;
        if (this.field1797 != null) {
            this.field1797.method949(35, 0);
        }
    }
}
