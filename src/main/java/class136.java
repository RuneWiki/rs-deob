import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class136 {

    @OriginalMember(owner = "client!ut", name = "d", descriptor = "Lhc;")
    public class152 field1703 = new class152();

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "I")
    public static int field1702 = 0;

    @OriginalMember(owner = "client!ut", name = "l", descriptor = "I")
    public static int field1711 = 0;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!ut", name = "e", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!ut", name = "f", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!ut", name = "g", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!ut", name = "h", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!ut", name = "i", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!ut", name = "j", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!ut", name = "k", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!ut", name = "m", descriptor = "Lhc;")
    private class152 field1712;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)V", line = 6)
    public final void method1000(int arg0) {
        if (arg0 != 31335) {
            this.method1006(17);
        }
        field1704++;
        while (true) {
            class152 var2 = this.field1703.field1903;
            if (this.field1703 == var2) {
                this.field1712 = null;
                return;
            }
            var2.method1088(4);
        }
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(I)I", line = 29)
    public final int method1001(int arg0) {
        field1710++;
        int var2 = arg0;
        class152 var3 = this.field1703.field1903;
        while (this.field1703 != var3) {
            var3 = var3.field1903;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lvk;B)I", line = 50)
    public static final int method1002(class388 arg0, byte arg1) {
        field1705++;
        class479 var2 = arg0.field5003;
        if (var2.field6636 != null) {
            var2 = var2.method2843(class2.field30, 228);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field6711;
        int var4 = -103 / ((arg1 + 70) / 52);
        class15 var5 = arg0.method1676(0);
        if (arg0.field3399 == -1 || arg0.field3426) {
            var3 = var2.field6642;
        } else if (arg0.field3399 == var5.field245 || arg0.field3399 == var5.field241 || arg0.field3399 == var5.field258 || arg0.field3399 == var5.field270) {
            var3 = var2.field6666;
        } else if (arg0.field3399 == var5.field271 || arg0.field3399 == var5.field276 || arg0.field3399 == var5.field261 || arg0.field3399 == var5.field251) {
            var3 = var2.field6676;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(B)Lhc;", line = 91)
    public final class152 method1003(byte arg0) {
        field1709++;
        class152 var2 = this.field1703.field1903;
        if (arg0 != 53) {
            return null;
        } else if (this.field1703 == var2) {
            this.field1712 = null;
            return null;
        } else {
            this.field1712 = var2.field1903;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Z)Lhc;", line = 118)
    public final class152 method1004(boolean arg0) {
        field1700++;
        class152 var2 = this.field1712;
        if (this.field1703 == var2) {
            this.field1712 = null;
            return null;
        } else if (arg0) {
            this.field1712 = var2.field1903;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(ILhc;)V", line = 141)
    public final void method1005(int arg0, class152 arg1) {
        if (arg1.field1893 != null) {
            arg1.method1088(4);
        }
        field1701++;
        arg1.field1893 = this.field1703.field1893;
        arg1.field1903 = this.field1703;
        arg1.field1893.field1903 = arg1;
        arg1.field1903.field1893 = arg1;
        if (arg0 >= -25) {
            this.method1003((byte) 87);
        }
    }

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "(I)Lhc;", line = 161)
    public final class152 method1006(int arg0) {
        if (arg0 != 24360) {
            return null;
        }
        field1706++;
        class152 var2 = this.field1703.field1903;
        if (this.field1703 == var2) {
            return null;
        } else {
            var2.method1088(4);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ut", name = "d", descriptor = "(I)I", line = 179)
    public static final int method1007(int arg0) {
        field1708++;
        if (arg0 != -6775) {
            method1007(-75);
        }
        return class691.field9417.method3650((byte) 125);
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "()V", line = 199)
    public class136() {
        this.field1703.field1893 = this.field1703;
        this.field1703.field1903 = this.field1703;
    }
}
