import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class606 {

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "Llr;")
    public class698 field8428 = new class698();

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "[I")
    public static int[] field8430 = new int[2];

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
    public static int field8432 = 0;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    public static int field8420;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
    public static int field8421;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    public static int field8422;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public static int field8423;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    public static int field8424;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
    public static int field8425;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "I")
    public static int field8427;

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
    public static int field8429;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "I")
    public static int field8431;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "Llr;")
    private class698 field8433;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "[Lf;")
    public static class702[] field8426;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)Llr;")
    public final class698 method3405(byte arg0) {
        field8421++;
        class698 var2 = this.field8433;
        if (this.field8428 == var2) {
            this.field8433 = null;
            return null;
        }
        this.field8433 = var2.field9901;
        if (arg0 != 38) {
            field8426 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(B)V")
    public static final void method3406(byte arg0) {
        int var1 = 0;
        if (arg0 <= 39) {
            return;
        }
        while (var1 < class187.field2718.length) {
            for (int var2 = 0; var2 < class187.field2718[var1].length; var2++) {
                class187.field2718[var1][var2] = class589.field8268;
            }
            var1++;
        }
        field8420++;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZLlr;)V")
    public final void method3407(boolean arg0, class698 arg1) {
        field8422++;
        if (arg1.field9910 != null) {
            arg1.method3914((byte) -106);
        }
        if (!arg0) {
            method3412((byte) -117);
        }
        arg1.field9901 = this.field8428;
        arg1.field9910 = this.field8428.field9910;
        arg1.field9910.field9901 = arg1;
        arg1.field9901.field9910 = arg1;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BFFF)I")
    public static final int method3408(byte arg0, float arg1, float arg2, float arg3) {
        field8423++;
        float var4 = (arg2 < 0.0F) ? -arg2 : arg2;
        if (arg0 <= 63) {
            return 95;
        }
        float var5 = arg1 < 0.0F ? -arg1 : arg1;
        float var6 = arg3 < 0.0F ? -arg3 : arg3;
        if (var5 > var4 && var6 < var5) {
            return arg1 > 0.0F ? 0 : 1;
        } else if (var6 > var4 && var5 < var6) {
            return (arg3 > 0.0F) ? 2 : 3;
        } else if ((arg2 > 0.0F)) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
    public static final void method3409(int arg0) {
        int var1 = 36 / ((-arg0 - 45) / 53);
        for (int var2 = 0; var2 < class166.field2420; var2++) {
            class437 var3 = class130.field1873[var2];
            if (var3.field6083 == 3) {
                if (var3.field6086 == null) {
                    var3.field6074 = Integer.MIN_VALUE;
                } else {
                    class61.field680.method1464(var3.field6086);
                }
            }
        }
        field8425++;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)Llr;")
    public final class698 method3410(int arg0) {
        if (arg0 != -14475) {
            method3409(-61);
        }
        field8427++;
        class698 var2 = this.field8428.field9901;
        if (this.field8428 == var2) {
            this.field8433 = null;
            return null;
        } else {
            this.field8433 = var2.field9901;
            return var2;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)I")
    public final int method3411(boolean arg0) {
        if (!arg0) {
            return 14;
        }
        field8424++;
        int var2 = 0;
        for (class698 var3 = this.field8428.field9901; var3 != this.field8428; var3 = var3.field9901) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(B)V")
    public static void method3412(byte arg0) {
        field8426 = null;
        field8430 = null;
        if (arg0 != 3) {
            field8431 = 65;
        }
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(I)V")
    public final void method3413(int arg0) {
        while (true) {
            class698 var2 = this.field8428.field9901;
            if (this.field8428 == var2) {
                field8429++;
                if (arg0 != -7623) {
                    field8430 = null;
                }
                this.field8433 = null;
                return;
            }
            var2.method3914((byte) -111);
        }
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "()V")
    public class606() {
        this.field8428.field9901 = this.field8428;
        this.field8428.field9910 = this.field8428;
    }
}
