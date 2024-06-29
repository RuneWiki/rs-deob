import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class302 {

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "Ldu;")
    public class381 field4475 = new class381();

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
    public static int field4485 = 0;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "Loba;")
    public static class324 field4477 = new class324();

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "Ldu;")
    private class381 field4492;

    @OriginalMember(owner = "client!dc", name = "t", descriptor = "[Lf;")
    public static class256[] field4493;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ldc;Ldu;I)V", line = 4)
    private final void method1898(class302 arg0, class381 arg1, int arg2) {
        field4480++;
        if (arg2 != 0) {
            this.method1908(-74, null);
        }
        class381 var4 = this.field4475.field5735;
        this.field4475.field5735 = arg1.field5735;
        arg1.field5735.field5737 = this.field4475;
        if (this.field4475 != arg1) {
            arg1.field5735 = arg0.field4475.field5735;
            arg1.field5735.field5737 = arg1;
            var4.field5737 = arg0.field4475;
            arg0.field4475.field5735 = var4;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)V", line = 33)
    public static void method1899(boolean arg0) {
        field4477 = null;
        field4493 = null;
        if (!arg0) {
            field4485 = 83;
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(Z)V", line = 45)
    public static final void method1900(boolean arg0) {
        class237.field3111++;
        field4489++;
        if (!arg0) {
            field4474 = -25;
        }
        class654 var1 = class631.method3628(class557.field8182, (byte) -51, class357.field5280);
        var1.field9358.method3162(-2003712696, class298.field4387);
        class444.method2623(122, var1);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)Ldu;", line = 65)
    public final class381 method1901(int arg0) {
        field4484++;
        if (arg0 <= 93) {
            this.method1906((byte) -78);
        }
        class381 var2 = this.field4492;
        if (this.field4475 == var2) {
            this.field4492 = null;
            return null;
        } else {
            this.field4492 = var2.field5737;
            return var2;
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)Ldu;", line = 86)
    public final class381 method1902(int arg0) {
        field4481++;
        if (arg0 < 96) {
            return null;
        }
        class381 var2 = this.field4475.field5737;
        if (this.field4475 == var2) {
            return null;
        } else {
            var2.method2360((byte) 66);
            return var2;
        }
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)Z", line = 106)
    public final boolean method1903(int arg0) {
        field4476++;
        if (arg0 >= -12) {
            return true;
        } else {
            return this.field4475.field5737 == this.field4475;
        }
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(Z)Ldu;", line = 118)
    public final class381 method1904(boolean arg0) {
        if (arg0) {
            this.method1909(null, (byte) 115);
        }
        field4491++;
        class381 var2 = this.field4475.field5737;
        if (this.field4475 == var2) {
            this.field4492 = null;
            return null;
        } else {
            this.field4492 = var2.field5737;
            return var2;
        }
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)V", line = 139)
    public final void method1905(int arg0) {
        field4482++;
        if (arg0 != 0) {
            return;
        }
        while (true) {
            class381 var2 = this.field4475.field5737;
            if (this.field4475 == var2) {
                this.field4492 = null;
                return;
            }
            var2.method2360((byte) 66);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)Ldu;", line = 163)
    public final class381 method1906(byte arg0) {
        if (arg0 != 111) {
            this.field4492 = null;
        }
        field4486++;
        class381 var2 = this.field4475.field5735;
        if (this.field4475 == var2) {
            this.field4492 = null;
            return null;
        } else {
            this.field4492 = var2.field5735;
            return var2;
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)I", line = 184)
    public final int method1907(byte arg0) {
        field4488++;
        int var2 = 0;
        class381 var3 = this.field4475.field5737;
        if (arg0 < 51) {
            return -105;
        }
        while (this.field4475 != var3) {
            var2++;
            var3 = var3.field5737;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILdu;)V", line = 205)
    public final void method1908(int arg0, class381 arg1) {
        if (arg0 != 0) {
            this.field4475 = null;
        }
        if (arg1.field5735 != null) {
            arg1.method2360((byte) 66);
        }
        field4483++;
        arg1.field5737 = this.field4475.field5737;
        arg1.field5735 = this.field4475;
        arg1.field5735.field5737 = arg1;
        arg1.field5737.field5735 = arg1;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ldu;B)V", line = 222)
    public final void method1909(class381 arg0, byte arg1) {
        if (arg0.field5735 != null) {
            arg0.method2360((byte) 66);
        }
        if (arg1 != -81) {
            field4493 = null;
        }
        field4487++;
        arg0.field5735 = this.field4475.field5735;
        arg0.field5737 = this.field4475;
        arg0.field5735.field5737 = arg0;
        arg0.field5737.field5735 = arg0;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ldc;B)V", line = 242)
    public final void method1910(class302 arg0, byte arg1) {
        field4478++;
        if (arg1 == -83) {
            this.method1898(arg0, this.field4475.field5737, 0);
        }
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(B)Ldu;", line = 259)
    public final class381 method1911(byte arg0) {
        field4479++;
        if (arg0 > -5) {
            return null;
        }
        class381 var2 = this.field4492;
        if (this.field4475 == var2) {
            this.field4492 = null;
            return null;
        } else {
            this.field4492 = var2.field5735;
            return var2;
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V", line = 293)
    public class302() {
        this.field4475.field5737 = this.field4475;
        this.field4475.field5735 = this.field4475;
    }
}
