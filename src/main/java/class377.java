import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class377 extends class130 {

    @OriginalMember(owner = "client!nt", name = "s", descriptor = "I")
    public int field5564 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!nt", name = "o", descriptor = "I")
    public int field5560 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!nt", name = "q", descriptor = "I")
    public int field5562 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!nt", name = "t", descriptor = "I")
    public int field5565 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!nt", name = "r", descriptor = "I")
    public int field5563 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!nt", name = "x", descriptor = "I")
    public int field5569 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!nt", name = "w", descriptor = "I")
    public int field5568 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!nt", name = "p", descriptor = "I")
    public int field5561 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!nt", name = "m", descriptor = "Lcl;")
    public class53 field5558;

    @OriginalMember(owner = "client!nt", name = "v", descriptor = "[F")
    public static float[] field5567 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!nt", name = "l", descriptor = "Ljava/lang/String;")
    public static String field5557 = null;

    @OriginalMember(owner = "client!nt", name = "z", descriptor = "Ljp;")
    public static class55 field5571;

    @OriginalMember(owner = "client!nt", name = "k", descriptor = "I")
    public static int field5556;

    @OriginalMember(owner = "client!nt", name = "n", descriptor = "I")
    public static int field5559;

    @OriginalMember(owner = "client!nt", name = "u", descriptor = "I")
    public static int field5566;

    @OriginalMember(owner = "client!nt", name = "y", descriptor = "Lhd;")
    public static class215 field5570;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(ZII)V")
    public static final void method2401(boolean arg0, int arg1, int arg2) {
        field5556++;
        class100 var3 = class48.method323(Integer.MIN_VALUE, arg0, arg2);
        if (var3 != null) {
            var3.method947((byte) 117);
            if (arg1 >= -121) {
                method2402(-74);
            }
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)V")
    public static void method2402(int arg0) {
        field5567 = null;
        if (arg0 != Integer.MAX_VALUE) {
            method2401(false, 127, 112);
        }
        field5557 = null;
        field5570 = null;
        field5571 = null;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(III)Z")
    public final boolean method2403(int arg0, int arg1, int arg2) {
        field5566++;
        if (this.field5563 <= arg0 && arg0 <= this.field5569 && this.field5560 <= arg2 && arg2 <= this.field5568) {
            return true;
        } else if (arg1 == 16896) {
            return arg0 >= this.field5565 && this.field5562 >= arg0 && arg2 >= this.field5561 && arg2 <= this.field5564;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIII)V")
    public static final void method2404(int arg0, int arg1, int arg2, int arg3) {
        field5559++;
        if (arg0 > -30) {
            field5570 = null;
        }
        class52 var4 = class166.field2508[arg1][arg3];
        class391.method2468(arg2, (byte) -52, var4 == null ? class392.field5722 : var4);
    }

    @OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(Lcl;)V")
    public class377(class53 arg0) {
        this.field5558 = arg0;
    }

    static {
        new class179("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
        field5571 = new class55(22, 8);
    }
}
