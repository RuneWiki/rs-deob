import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class54 {

    @OriginalMember(owner = "client!ll", name = "k", descriptor = "Lni;")
    public class26 field704 = new class26();

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!ll", name = "l", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!ll", name = "m", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!ll", name = "n", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!ll", name = "o", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!ll", name = "p", descriptor = "Lni;")
    private class26 field709;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IB)I", line = 16)
    public static final int method408(int arg0, byte arg1) {
        field702++;
        int var2 = arg0 >>> 1;
        int var3 = var2 | var2 >>> 1;
        if (arg1 <= 95) {
            method414(-41, 11, 79);
        }
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return arg0 & ~var7;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V", line = 33)
    public final void method409(int arg0) {
        if (arg0 != 1986850152) {
            return;
        }
        while (true) {
            class26 var2 = this.field704.field301;
            if (this.field704 == var2) {
                field701++;
                this.field709 = null;
                return;
            }
            var2.method179((byte) 51);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lni;B)V", line = 61)
    public final void method410(class26 arg0, byte arg1) {
        if (arg0.field298 != null) {
            arg0.method179((byte) 51);
        }
        if (arg1 > -75) {
            this.field704 = (class26) null;
        }
        arg0.field298 = this.field704;
        field705++;
        arg0.field301 = this.field704.field301;
        arg0.field298.field301 = arg0;
        arg0.field301.field298 = arg0;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Z)Lni;", line = 80)
    public final class26 method411(boolean arg0) {
        field708++;
        class26 var2 = this.field704.field301;
        if (this.field704 == var2) {
            return null;
        } else if (arg0) {
            return (class26) null;
        } else {
            var2.method179((byte) 51);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(I)Z", line = 101)
    public final boolean method412(int arg0) {
        if (arg0 == -29937) {
            field696++;
            return this.field704.field301 == this.field704;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "(I)Lni;", line = 120)
    public final class26 method413(int arg0) {
        field694++;
        class26 var2 = this.field704.field301;
        if (arg0 != 1253231568) {
            return (class26) null;
        } else if (this.field704 == var2) {
            this.field709 = null;
            return null;
        } else {
            this.field709 = var2.field301;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(III)Lve;", line = 141)
    public static final class231 method414(int arg0, int arg1, int arg2) {
        class119 var3 = class345.field5367[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1552;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(BLni;)V", line = 150)
    public final void method415(byte arg0, class26 arg1) {
        field700++;
        if (arg1.field298 != null) {
            arg1.method179((byte) 51);
        }
        int var3 = 48 / ((arg0 + 54) / 36);
        arg1.field298 = this.field704.field298;
        arg1.field301 = this.field704;
        arg1.field298.field301 = arg1;
        arg1.field301.field298 = arg1;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)Lni;", line = 167)
    public final class26 method416(byte arg0) {
        field707++;
        class26 var2 = this.field704.field298;
        if (this.field704 == var2) {
            this.field709 = null;
            return null;
        } else {
            this.field709 = var2.field298;
            int var3 = 117 / ((arg0 - 51) / 32);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIII)I", line = 191)
    public static final int method417(int arg0, int arg1, int arg2, int arg3) {
        field706++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else if (arg1 == 7) {
            return arg2;
        } else {
            return 111;
        }
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(Z)Lni;", line = 215)
    public final class26 method418(boolean arg0) {
        if (arg0) {
            this.field704 = (class26) null;
        }
        class26 var2 = this.field709;
        field695++;
        if (this.field704 == var2) {
            this.field709 = null;
            return null;
        } else {
            this.field709 = var2.field298;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "(I)Lni;", line = 235)
    public final class26 method419(int arg0) {
        field699++;
        if (arg0 <= 3) {
            this.field704 = (class26) null;
        }
        class26 var2 = this.field709;
        if (this.field704 == var2) {
            this.field709 = null;
            return null;
        } else {
            this.field709 = var2.field301;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "()V", line = 262)
    public class54() {
        this.field704.field301 = this.field704;
        this.field704.field298 = this.field704;
    }
}
