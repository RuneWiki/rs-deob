import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class151 {

    @OriginalMember(owner = "client!hv", name = "g", descriptor = "Lmq;")
    private class618 field1917 = new class618();

    @OriginalMember(owner = "client!hv", name = "j", descriptor = "S")
    public static short field1920 = 32767;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!hv", name = "d", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!hv", name = "e", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!hv", name = "f", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!hv", name = "i", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!hv", name = "k", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!hv", name = "l", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!hv", name = "m", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!hv", name = "h", descriptor = "Lwm;")
    public static class30 field1918;

    @OriginalMember(owner = "client!hv", name = "n", descriptor = "Lmq;")
    private class618 field1924;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)V")
    public static void method854(int arg0) {
        field1918 = null;
        if (arg0 != 8192) {
            field1920 = 40;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(ILmq;)V")
    public final void method855(int arg0, class618 arg1) {
        if (arg1.field7829 != null) {
            arg1.method3306(false);
        }
        field1913++;
        arg1.field7829 = this.field1917.field7829;
        if (arg0 == 0) {
            arg1.field7832 = this.field1917;
            arg1.field7829.field7832 = arg1;
            arg1.field7832.field7829 = arg1;
        }
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(I)Lmq;")
    public final class618 method856(int arg0) {
        field1912++;
        class618 var2 = this.field1917.field7832;
        if (this.field1917 == var2) {
            return null;
        }
        if (arg0 != 17737) {
            field1920 = -102;
        }
        var2.method3306(false);
        return var2;
    }

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "(I)Lmq;")
    public final class618 method857(int arg0) {
        field1915++;
        if (arg0 >= -68) {
            this.method860((byte) 8);
        }
        class618 var2 = this.field1917.field7832;
        if (this.field1917 == var2) {
            this.field1924 = null;
            return null;
        } else {
            this.field1924 = var2.field7832;
            return var2;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(B)I")
    public final int method858(byte arg0) {
        field1919++;
        int var2 = 0;
        class618 var3 = this.field1917.field7832;
        if (arg0 != -28) {
            this.method861((byte) 85);
        }
        while (this.field1917 != var3) {
            var2++;
            var3 = var3.field7832;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hv", name = "d", descriptor = "(I)Lkj;")
    public static final class307 method859(int arg0) {
        field1923++;
        if (class402.field5329 == null || class403.field5359 == null) {
            return null;
        }
        for (class307 var1 = (class307) class403.field5359.method2580(arg0 - 42); var1 != null; var1 = (class307) class403.field5359.method2580(-50)) {
            class624 var2 = class402.field5322.method2323(var1.field3860, true);
            if (var2 != null && var2.field7915 && var2.method3344(arg0 ^ 0xFFFF98FB, class402.field5325)) {
                return var1;
            }
        }
        if (arg0 != 0) {
            field1920 = 62;
        }
        return null;
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(B)Lmq;")
    public final class618 method860(byte arg0) {
        if (arg0 != 30) {
            field1920 = -94;
        }
        field1911++;
        class618 var2 = this.field1917.field7829;
        if (this.field1917 == var2) {
            this.field1924 = null;
            return null;
        } else {
            this.field1924 = var2.field7829;
            return var2;
        }
    }

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "(B)Z")
    public final boolean method861(byte arg0) {
        field1914++;
        int var2 = 102 % ((arg0 - 13) / 52);
        return this.field1917.field7832 == this.field1917;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(BII)Z")
    public static final boolean method862(byte arg0, int arg1, int arg2) {
        field1922++;
        int var3 = 15 / ((37 - arg0) / 63);
        return (class120.method715(arg2, arg1, -93) | (arg1 & 0x2000) != 0 | class755.method4098(65536, arg2, arg1)) & class185.method1305(arg2, arg1, (byte) -91);
    }

    @OriginalMember(owner = "client!hv", name = "e", descriptor = "(I)V")
    public final void method863(int arg0) {
        while (true) {
            class618 var2 = this.field1917.field7832;
            if (this.field1917 == var2) {
                field1916++;
                if (arg0 != 0) {
                    this.method861((byte) 75);
                }
                this.field1924 = null;
                return;
            }
            var2.method3306(false);
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Z)Lmq;")
    public final class618 method864(boolean arg0) {
        if (!arg0) {
            this.field1917 = null;
        }
        field1921++;
        class618 var2 = this.field1924;
        if (this.field1917 == var2) {
            this.field1924 = null;
            return null;
        } else {
            this.field1924 = var2.field7832;
            return var2;
        }
    }

    @OriginalMember(owner = "client!hv", name = "<init>", descriptor = "()V")
    public class151() {
        this.field1917.field7832 = this.field1917;
        this.field1917.field7829 = this.field1917;
    }
}
