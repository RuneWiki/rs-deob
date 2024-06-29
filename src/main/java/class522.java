import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class522 extends class478 {

    @OriginalMember(owner = "client!tv", name = "q", descriptor = "I")
    private int field7386;

    @OriginalMember(owner = "client!tv", name = "o", descriptor = "I")
    private int field7384;

    @OriginalMember(owner = "client!tv", name = "u", descriptor = "I")
    private int field7390;

    @OriginalMember(owner = "client!tv", name = "p", descriptor = "I")
    private int field7385;

    @OriginalMember(owner = "client!tv", name = "x", descriptor = "Lus;")
    private class1 field7393;

    @OriginalMember(owner = "client!tv", name = "z", descriptor = "I")
    private int field7395;

    @OriginalMember(owner = "client!tv", name = "v", descriptor = "I")
    private int field7391;

    @OriginalMember(owner = "client!tv", name = "w", descriptor = "Lsb;")
    public static class266 field7392 = new class266(2, -1);

    @OriginalMember(owner = "client!tv", name = "s", descriptor = "I")
    public static int field7388;

    @OriginalMember(owner = "client!tv", name = "t", descriptor = "I")
    public static int field7389;

    @OriginalMember(owner = "client!tv", name = "y", descriptor = "I")
    public static int field7394;

    @OriginalMember(owner = "client!tv", name = "r", descriptor = "Lmda;")
    private class243 field7387;

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "(I)V")
    public static void method3067(int arg0) {
        field7392 = null;
        if (arg0 != -22222) {
            field7392 = null;
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(B)V")
    public static final void method3068(byte arg0) {
        field7388++;
        if (arg0 >= -105) {
            field7392 = null;
        }
        class194.field3046.method1912(-2552);
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(I)Lmda;")
    public final class243 method1953(int arg0) {
        field7394++;
        if (arg0 != -513) {
            method3068((byte) -46);
        }
        if (this.field7387 == null) {
            class146.field2532[2] = this.field7391;
            class146.field2532[4] = this.field7395;
            class214 var2 = this.field7393.field2768;
            class146.field2532[3] = this.field7385;
            class146.field2532[1] = this.field7384;
            class146.field2532[0] = this.field7386;
            class146.field2532[5] = this.field7390;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method1499(class146.field2532[var5], -24052)) {
                    return null;
                }
                class699 var7 = var2.method1500(class146.field2532[var5], arg0 + 451);
                int var8 = var7.field9836 ? 64 : 128;
                if (var7.field9842 > 0) {
                    var3 = true;
                }
                if (var4 < var8) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class318.field4688[var6] = var2.method1495(class146.field2532[var6], false, 1.0F, var4, var4, 32682);
            }
            this.field7387 = new class243(this.field7393, 6407, var4, var3, class318.field4688);
        }
        return this.field7387;
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(B)V")
    public static final void method3069(byte arg0) {
        class90.field1652 = new class640(8);
        field7389++;
        class679.field9633 = 0;
        if (arg0 != 54) {
            method3067(-116);
        }
        for (class45 var1 = (class45) class705.field9921.method3317(arg0 - 175); var1 != null; var1 = (class45) class705.field9921.method3321(-121)) {
            var1.method585();
        }
    }

    @OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(Lus;IIIIII)V")
    public class522(class1 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field7386 = arg1;
        this.field7384 = arg2;
        this.field7390 = arg6;
        this.field7385 = arg4;
        this.field7393 = arg0;
        this.field7395 = arg5;
        this.field7391 = arg3;
    }
}
