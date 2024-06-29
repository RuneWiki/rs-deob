import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class270 {

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "Llha;")
    private class623 field3334 = new class623();

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "Lsc;")
    private class347 field3342 = new class347();

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
    private int field3344;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
    private int field3343;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "Lpfa;")
    private class295 field3341;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "Ldh;")
    public static class320 field3340 = new class320(48, -2);

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)V")
    public static void method1609(byte arg0) {
        field3340 = null;
        if (arg0 < 36) {
            field3340 = null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V")
    public final void method1610(int arg0) {
        int var2 = 26 / ((arg0 - 23) / 49);
        field3336++;
        this.field3342.method2062(false);
        this.field3341.method1758(-43);
        this.field3334 = new class623();
        this.field3344 = this.field3343;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(JBLlha;)V")
    public final void method1611(long arg0, byte arg1, class623 arg2) {
        int var5 = -75 / ((-arg1 - 43) / 55);
        field3339++;
        if (this.field3344 == 0) {
            class623 var6 = this.field3342.method2070(-13418);
            var6.method864(12983);
            var6.method3562((byte) -48);
            if (this.field3334 == var6) {
                class623 var7 = this.field3342.method2070(-13418);
                var7.method864(12983);
                var7.method3562((byte) -74);
            }
        } else {
            this.field3344--;
        }
        this.field3341.method1751(arg2, 3970, arg0);
        this.field3342.method2068(-128, arg2);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZJ)V")
    public final void method1612(boolean arg0, long arg1) {
        field3337++;
        class623 var4 = (class623) this.field3341.method1754(arg0, arg1);
        if (var4 != null) {
            var4.method864(12983);
            var4.method3562((byte) -47);
            this.field3344++;
        }
        if (arg0) {
            this.method1610(-32);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(JI)Llha;")
    public final class623 method1613(long arg0, int arg1) {
        if (arg1 <= 16) {
            this.method1611(-126L, (byte) -90, null);
        }
        field3338++;
        class623 var4 = (class623) this.field3341.method1754(false, arg0);
        if (var4 != null) {
            this.field3342.method2068(-127, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(I)V")
    public class270(int arg0) {
        this.field3344 = arg0;
        this.field3343 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field3341 = new class295(var2);
    }
}
