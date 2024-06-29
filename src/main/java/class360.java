import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class360 {

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "[Lgj;")
    private class659[] field5233;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    private int field5230;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "Z")
    public static boolean field5237 = true;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
    public static int field5235;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
    public static int field5236;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
    public static int field5238;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
    public static int field5239;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "J")
    private long field5232;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "Lgj;")
    private class659 field5229;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)V")
    public static final void method2279(int arg0, int arg1) {
        field5235++;
        if (arg1 != 31173) {
            method2283(87, -8);
        }
        class778 var2 = class389.method2406(117, (long) arg0, 7);
        var2.method4276(0);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)Lgj;")
    public final class659 method2280(int arg0) {
        field5236++;
        if (this.field5229 == null) {
            return null;
        }
        if (arg0 != 0) {
            this.field5232 = 80L;
        }
        class659 var2 = this.field5233[(int) ((long) (this.field5230 - 1) & this.field5232)];
        while (this.field5229 != var2) {
            if (this.field5229.field8883 == this.field5232) {
                class659 var3 = this.field5229;
                this.field5229 = this.field5229.field8885;
                return var3;
            }
            this.field5229 = this.field5229.field8885;
        }
        this.field5229 = null;
        return null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
    public static final void method2281(String arg0, int arg1, String arg2) {
        class159.field2142 = 1;
        field5239++;
        class340.field4758 = arg1;
        class772.method4247(arg2, 0, arg0, false);
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(I)V")
    public class360(int arg0) {
        this.field5233 = new class659[arg0];
        this.field5230 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class659 var3 = this.field5233[var2] = new class659();
            var3.field8885 = var3;
            var3.field8887 = var3;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BJ)Lgj;")
    public final class659 method2282(byte arg0, long arg1) {
        this.field5232 = arg1;
        field5231++;
        if (arg0 <= 73) {
            this.field5232 = 43L;
        }
        class659 var4 = this.field5233[(int) (arg1 & (long) (this.field5230 - 1))];
        for (this.field5229 = var4.field8885; this.field5229 != var4; this.field5229 = this.field5229.field8885) {
            if (this.field5229.field8883 == arg1) {
                class659 var5 = this.field5229;
                this.field5229 = this.field5229.field8885;
                return var5;
            }
        }
        this.field5229 = null;
        return null;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(II)Z")
    public static final boolean method2283(int arg0, int arg1) {
        field5238++;
        if (arg0 == -1) {
            return arg1 == 0 || arg1 == 2;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(JILgj;)V")
    public final void method2284(long arg0, int arg1, class659 arg2) {
        field5234++;
        if (arg2.field8887 != null) {
            arg2.method3659(1);
        }
        class659 var5 = this.field5233[(int) (arg0 & (long) (this.field5230 - 1))];
        arg2.field8885 = var5;
        arg2.field8887 = var5.field8887;
        arg2.field8887.field8885 = arg2;
        arg2.field8885.field8887 = arg2;
        arg2.field8883 = arg0;
        int var6 = -117 / ((-arg1 - 73) / 40);
    }
}
