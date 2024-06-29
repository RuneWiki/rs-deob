import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class533 {

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "J")
    public long field7391;

    @OriginalMember(owner = "client!pt", name = "g", descriptor = "Ltk;")
    private class347 field7397;

    @OriginalMember(owner = "client!pt", name = "j", descriptor = "I")
    public static int field7400 = 0;

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "F")
    public static float field7393;

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "I")
    public static int field7394;

    @OriginalMember(owner = "client!pt", name = "e", descriptor = "I")
    public static int field7395;

    @OriginalMember(owner = "client!pt", name = "f", descriptor = "I")
    public static int field7396;

    @OriginalMember(owner = "client!pt", name = "h", descriptor = "I")
    public static int field7398;

    @OriginalMember(owner = "client!pt", name = "i", descriptor = "I")
    public static int field7399;

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "Lria;")
    public static class288 field7392;

    @OriginalMember(owner = "client!pt", name = "k", descriptor = "[I")
    public static int[] field7401;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)V", line = 4)
    public static final void method3060(int arg0) {
        if (arg0 != 2) {
            field7396 = -8;
        }
        if (class701.field9761 > 1) {
            class748.field10451.method4150(class748.field10451.field10395, 4, -5);
        } else {
            class748.field10451.method4150(class748.field10451.field10395, 2, arg0 - 7);
        }
        field7394++;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(Z)V", line = 28)
    public static void method3061(boolean arg0) {
        field7392 = null;
        if (arg0) {
            field7393 = -1.0416409F;
        }
        field7401 = null;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IILnd;)Liea;", line = 41)
    public static final class481 method3062(int arg0, int arg1, class547 arg2) {
        if (arg0 >= -6) {
            return null;
        }
        field7399++;
        class481 var3 = (class481) class586.field8181.method3079((long) arg1, 0);
        if (var3 == null) {
            if (class459.field6123) {
                var3 = class386.field4930.method508(class728.method4054(arg2, arg1), true);
            } else {
                var3 = class295.method1772(arg2.method3166((byte) 125, arg1), (byte) 122);
            }
            class586.field8181.method3077((byte) 107, (long) arg1, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Ltk;J[Ldc;)V", line = 69)
    public class533(class347 arg0, long arg1, class5[] arg2) {
        this.field7391 = arg1;
        this.field7397 = arg0;
    }

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "(I)V", line = 80)
    public static final void method3063(int arg0) {
        for (class277 var1 = (class277) class343.field4334.method3672(-1); var1 != null; var1 = (class277) class343.field4334.method3662(-1)) {
            if (class567.method3258(var1.field3478, false)) {
                class240.method1503(var1, 36);
            }
        }
        if (arg0 != 4) {
            method3061(true);
        }
        field7398++;
    }

    @OriginalMember(owner = "client!pt", name = "finalize", descriptor = "()V", line = 101)
    protected final void finalize() throws Throwable {
        this.field7397.method2018(this.field7391, (byte) -82);
        field7395++;
        super.finalize();
    }
}
