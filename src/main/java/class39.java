import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class39 implements class344 {

    @OriginalMember(owner = "client!af", name = "i", descriptor = "Lcg;")
    private class12 field577;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "[I")
    public int[] field571;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    public int field578;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
    public int field579;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "Lsh;")
    private class276 field572;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "[F")
    public float[] field570;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "Lus;")
    public static class328 field573 = new class328(31, -1);

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIIZZ)V", line = 8)
    public final void method332(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        class206.method1275(arg4, arg1, arg3, arg2, arg5, arg0, arg7 ? this.field570 : null, arg7 ? this.field577.field165 : null, 16003, arg6 ? this.field571 : null, this.field577.field135.field10327, this.field577.field135.field10323, this.field578);
        field575++;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lkha;ILkha;I)V", line = 16)
    public static final void method333(class687 arg0, int arg1, class687 arg2, int arg3) {
        class332.field4284 = arg2;
        if (arg1 != 7986) {
            method334(38);
        }
        field569++;
        class589.field8214 = arg0;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V", line = 33)
    public static void method334(int arg0) {
        field573 = null;
        if (arg0 != -1) {
            field573 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(IIIIIIZZ)V", line = 51)
    public final void method335(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        field574++;
        class206.method1275(arg4, arg1, arg3, arg2, arg5, arg0, arg7 ? this.field577.field165 : null, arg7 ? this.field570 : null, 16003, arg6 ? this.field577.field135.field10327 : null, this.field571, this.field578, this.field577.field135.field10323);
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lcg;Lac;Lsh;)V", line = 59)
    public class39(class12 arg0, class712 arg1, class276 arg2) {
        this.field577 = arg0;
        if ((arg1 instanceof class285)) {
            class285 var5 = (class285) arg1;
            this.field571 = var5.field3623;
            this.field578 = var5.field9835;
            this.field579 = var5.field9847;
        } else if ((arg1 instanceof class472)) {
            class472 var4 = (class472) arg1;
            this.field571 = var4.field6768;
            this.field578 = var4.field9835;
            this.field579 = var4.field9847;
        } else {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            this.field572 = arg2;
            if (this.field572.field3496 != this.field578 || this.field572.field3493 != this.field579) {
                throw new RuntimeException();
            }
            this.field570 = this.field572.field3495;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ldv;I)V", line = 100)
    public static final void method336(class124 arg0, int arg1) {
        if (arg1 != 31) {
            method334(77);
        }
        field576++;
        for (class389 var2 = (class389) class204.field2596.method3111(113); var2 != null; var2 = (class389) class204.field2596.method3116(-119)) {
            if (var2.field5428 == arg0) {
                if (var2.field5419 != null) {
                    class668.field9148.method664(var2.field5419);
                    var2.field5419 = null;
                }
                var2.method3426((byte) -88);
                return;
            }
        }
    }
}
