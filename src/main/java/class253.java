import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class253 {

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "Lof;")
    private class620 field3048 = new class620(256);

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "Ld;")
    private class150 field3050;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "Lln;")
    private class377 field3045;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "Lpia;")
    public static class94 field3051 = new class94(67, 3);

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "Lpfa;")
    public static class295 field3052 = new class295(64);

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "[I")
    public static int[] field3053 = new int[8];

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "F")
    public static float field3046;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
    public static void method1506(byte arg0) {
        field3053 = null;
        if (arg0 != 112) {
            field3051 = null;
        }
        field3051 = null;
        field3052 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)Loq;")
    public final class358 method1507(int arg0, int arg1) {
        field3049++;
        Object var3 = this.field3048.method3538((long) arg1, 0);
        if (var3 != null) {
            return (class358) var3;
        } else if (!this.field3050.method929(arg0 ^ 0xFFFFB96C, arg1)) {
            return null;
        } else if (arg0 == -31729) {
            class298 var4 = this.field3050.method931(arg1, true);
            int var5 = var4.field3711 ? 64 : this.field3045.field5133;
            class358 var7;
            if (var4.field3714 && this.field3045.method358()) {
                float[] var6 = this.field3050.method933(false, arg1, var5, var5, (byte) 85, 0.7F);
                var7 = this.field3045.method2204(var4.field3701 != 0, var5, true, class102.field1058, var6, var5);
            } else {
                int[] var8;
                if (var4.field3698 != 2 && class720.method4017(var4.field3702, -31302)) {
                    var8 = this.field3050.method930(true, arg0 ^ 0xFFFF846E, var5, arg1, 0.7F, var5);
                } else {
                    var8 = this.field3050.method932(0.7F, var5, arg1, false, -20255, var5);
                }
                var7 = this.field3045.method2266(var8, 108, var5, var5, var4.field3701 != 0);
            }
            var7.method604(var4.field3700, var4.field3716, (byte) -43);
            this.field3048.method3537(arg0 ^ 0xFFFF847D, (long) arg1, var7);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public final void method1508(int arg0) {
        field3047++;
        this.field3048.method3539((byte) 123, arg0);
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V")
    public final void method1509(int arg0) {
        field3044++;
        this.field3048.method3549(0);
        if (arg0 != -30128) {
            this.field3050 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lln;Ld;)V")
    public class253(class377 arg0, class150 arg1) {
        this.field3050 = arg1;
        this.field3045 = arg0;
    }
}
