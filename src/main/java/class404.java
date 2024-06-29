import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public class class404 {

    @OriginalMember(owner = "client!vea", name = "e", descriptor = "I")
    public int field5334;

    @OriginalMember(owner = "client!vea", name = "b", descriptor = "Lvea;")
    public static class404 field5331 = new class404(1);

    @OriginalMember(owner = "client!vea", name = "f", descriptor = "Lvea;")
    public static class404 field5335 = new class404(2);

    @OriginalMember(owner = "client!vea", name = "g", descriptor = "Lvea;")
    public static class404 field5336 = new class404(4);

    @OriginalMember(owner = "client!vea", name = "i", descriptor = "Lvea;")
    public static class404 field5338 = new class404(1);

    @OriginalMember(owner = "client!vea", name = "j", descriptor = "Lvea;")
    public static class404 field5339 = new class404(2);

    @OriginalMember(owner = "client!vea", name = "k", descriptor = "Lvea;")
    public static class404 field5340 = new class404(4);

    @OriginalMember(owner = "client!vea", name = "l", descriptor = "Lvea;")
    public static class404 field5341 = new class404(2);

    @OriginalMember(owner = "client!vea", name = "m", descriptor = "Lvea;")
    public static class404 field5342 = new class404(4);

    @OriginalMember(owner = "client!vea", name = "n", descriptor = "Leba;")
    public static class550 field5343 = new class550(16, 8);

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "I")
    public static int field5330;

    @OriginalMember(owner = "client!vea", name = "c", descriptor = "I")
    public static int field5332;

    @OriginalMember(owner = "client!vea", name = "d", descriptor = "I")
    public static int field5333;

    @OriginalMember(owner = "client!vea", name = "h", descriptor = "I")
    public static int field5337;

    @OriginalMember(owner = "client!vea", name = "p", descriptor = "I")
    public static int field5345;

    @OriginalMember(owner = "client!vea", name = "o", descriptor = "Ltq;")
    public static class92 field5344;

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(FFFI)F")
    public static final float method2304(float arg0, float arg1, float arg2, int arg3) {
        field5337++;
        return arg3 == 12 ? (arg0 - arg2) * arg1 + arg2 : 0.931816F;
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(I)V")
    public static void method2305(int arg0) {
        field5342 = null;
        field5344 = null;
        field5335 = null;
        field5340 = null;
        field5336 = null;
        field5343 = null;
        field5338 = null;
        if (arg0 == 2) {
            field5341 = null;
            field5339 = null;
            field5331 = null;
        }
    }

    @OriginalMember(owner = "client!vea", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5330++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(ZI)Z")
    public static final boolean method2306(boolean arg0, int arg1) {
        field5332++;
        if (arg0) {
            return true;
        } else {
            return arg1 >= 12 && arg1 <= 17;
        }
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(III)V")
    public static final void method2307(int arg0, int arg1, int arg2) {
        field5333++;
        class256 var3 = class592.method3279((byte) -95, arg1, arg2);
        var3.method1549(-32042);
        var3.field3358 = arg0;
    }

    @OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(I)V")
    private class404(int arg0) {
        this.field5334 = arg0;
    }
}
