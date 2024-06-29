import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class402 {

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "I")
    public static int field6122 = 0;

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "Lof;")
    public static class446 field6120 = new class446("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "I")
    public static int field6123 = 0;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "I")
    public static int field6116;

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
    public static int field6117;

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "I")
    public static int field6118;

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "I")
    public static int field6121;

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "[[B")
    public static byte[][] field6119;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(FFFII)F")
    public static final float method2481(float arg0, float arg1, float arg2, int arg3, int arg4) {
        field6117++;
        int var5 = -31 / ((arg3 - 53) / 49);
        float[] var6 = class112.field1561[arg4];
        return var6[2] * arg0 + var6[0] * arg2 + var6[1] * arg1;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V")
    public static void method2482(int arg0) {
        field6119 = null;
        field6120 = null;
        if (arg0 != -18341) {
            method2484(-6, -110, -14);
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ZBI)Lls;")
    public static final class94 method2483(boolean arg0, byte arg1, int arg2) {
        field6116++;
        if (arg1 > -50) {
            field6120 = null;
        }
        long var3 = (long) (arg2 | (arg0 ? Integer.MIN_VALUE : 0));
        return (class94) class294.field4294.method1747(var3, false);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(III)V")
    public static final void method2484(int arg0, int arg1, int arg2) {
        field6121++;
        class177 var3 = class344.method2229(arg1, arg0, (byte) 99);
        var3.method1191(123);
        var3.field2372 = arg2;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Z)V")
    public static final void method2485(boolean arg0) {
        class456.field6845.method789(class187.field2512, class26.field381, class348.field5371);
        field6118++;
        if (!arg0) {
            field6123 = 59;
        }
    }
}
