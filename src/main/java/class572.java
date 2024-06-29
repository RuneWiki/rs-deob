import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public class class572 implements class226 {

    @OriginalMember(owner = "client!jaa", name = "e", descriptor = "Lgr;")
    private class403 field8309;

    @OriginalMember(owner = "client!jaa", name = "c", descriptor = "Lom;")
    private class344 field8307;

    @OriginalMember(owner = "client!jaa", name = "h", descriptor = "[I")
    public static int[] field8312 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "I")
    public static int field8305;

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "I")
    public static int field8306;

    @OriginalMember(owner = "client!jaa", name = "f", descriptor = "I")
    public static int field8310;

    @OriginalMember(owner = "client!jaa", name = "g", descriptor = "I")
    public static int field8311;

    @OriginalMember(owner = "client!jaa", name = "i", descriptor = "I")
    public static int field8313;

    @OriginalMember(owner = "client!jaa", name = "d", descriptor = "Lf;")
    private class702 field8308;

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Z)V")
    public static void method3289(boolean arg0) {
        field8312 = null;
        if (!arg0) {
            field8312 = null;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ZII)Z")
    public static final boolean method3290(boolean arg0, int arg1, int arg2) {
        field8313++;
        if (!arg0) {
            method3291(73, (byte) -117);
        }
        return class562.method3210(92, arg1, arg2) & class30.method500(arg1, -122, arg2);
    }

    @OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "(Lom;Lgr;)V")
    public class572(class344 arg0, class403 arg1) {
        this.field8309 = arg1;
        this.field8307 = arg0;
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(B)Z")
    public final boolean method1398(byte arg0) {
        if (arg0 <= 112) {
            field8312 = null;
        }
        field8306++;
        return this.field8307.method2230((byte) -91, this.field8309.field5828);
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IB)Luo;")
    public static final class535 method3291(int arg0, byte arg1) {
        if (arg1 < 57) {
            return null;
        }
        field8310++;
        class535 var2 = (class535) class269.field4003.method1900((long) arg0, -26);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class90.field1653.method2216(0, arg0, true);
        class535 var4 = new class535();
        if (var3 != null) {
            var4.method3098(new class61(var3), arg0, true);
        }
        class269.field4003.method1904(var4, (long) arg0, -1);
        return var4;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ZZ)V")
    public final void method1432(boolean arg0, boolean arg1) {
        if (arg0) {
            int var3 = class575.field8355 < class506.field7173 ? class506.field7173 : class575.field8355;
            int var4 = class693.field9762 < class310.field4626 ? class310.field4626 : class693.field9762;
            int var5 = this.field8308.method1784();
            int var6 = this.field8308.method1789();
            int var7 = 0;
            int var8 = var3;
            int var9 = var3 * var6 / var5;
            int var10 = (var4 - var9) / 2;
            if (var9 > var4) {
                var8 = var4 * var5 / var6;
                var10 = 0;
                var9 = var4;
                var7 = (var3 - var8) / 2;
            }
            this.field8308.method3922(var7, var10, var8, var9);
        }
        if (arg1) {
            this.field8308 = null;
        }
        field8311++;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(B)V")
    public final void method1400(byte arg0) {
        if (arg0 != -10) {
            this.field8308 = null;
        }
        this.field8308 = class505.method3001((byte) 71, this.field8307, this.field8309.field5828);
        field8305++;
    }
}
