import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class332 extends class417 {

    @OriginalMember(owner = "client!pp", name = "q", descriptor = "I")
    public int field4589 = -1;

    @OriginalMember(owner = "client!pp", name = "t", descriptor = "I")
    public int field4592 = 0;

    @OriginalMember(owner = "client!pp", name = "v", descriptor = "[I")
    public static int[] field4594 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!pp", name = "x", descriptor = "Ltda;")
    public static class546 field4596 = new class546(9, 0, 4, 1);

    @OriginalMember(owner = "client!pp", name = "y", descriptor = "Lh;")
    public static class572 field4597 = new class572("white:", "weiss:", "blanc:", "branco:");

    @OriginalMember(owner = "client!pp", name = "A", descriptor = "Lh;")
    public static class572 field4599 = new class572("Loading JAGGL - ", "Lade JAGGL - ", "Chargement JAGGL - ", "Carregando JAGGL - ");

    @OriginalMember(owner = "client!pp", name = "B", descriptor = "Lh;")
    public static class572 field4600 = new class572("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

    @OriginalMember(owner = "client!pp", name = "i", descriptor = "I")
    public int field4581;

    @OriginalMember(owner = "client!pp", name = "j", descriptor = "I")
    public int field4582;

    @OriginalMember(owner = "client!pp", name = "k", descriptor = "I")
    public int field4583;

    @OriginalMember(owner = "client!pp", name = "l", descriptor = "I")
    public int field4584;

    @OriginalMember(owner = "client!pp", name = "m", descriptor = "I")
    public int field4585;

    @OriginalMember(owner = "client!pp", name = "n", descriptor = "I")
    public int field4586;

    @OriginalMember(owner = "client!pp", name = "o", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!pp", name = "p", descriptor = "I")
    public int field4588;

    @OriginalMember(owner = "client!pp", name = "r", descriptor = "I")
    public int field4590;

    @OriginalMember(owner = "client!pp", name = "s", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!pp", name = "u", descriptor = "I")
    public int field4593;

    @OriginalMember(owner = "client!pp", name = "w", descriptor = "I")
    public int field4595;

    @OriginalMember(owner = "client!pp", name = "z", descriptor = "Ljava/lang/Object;")
    public static Object field4598;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(ILgw;Z)V")
    public static final void method2027(int arg0, class148 arg1, boolean arg2) {
        if (arg2) {
            field4600 = null;
        }
        if (class9.field103 != null) {
            try {
                class9.field103.method3253((byte) 127, 0L);
                class9.field103.method3261(arg0, (byte) -52, arg1.field2146, 24);
            } catch (Exception var3) {
            }
        }
        field4591++;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(III)V")
    public static final void method2028(int arg0, int arg1, int arg2) {
        field4587++;
        class221 var3 = class65.method413(12, arg2, (byte) -41);
        var3.method1426((byte) -123);
        if (arg0 != 128) {
            method2029(false);
        }
        var3.field3214 = arg1;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Z)V")
    public static void method2029(boolean arg0) {
        if (arg0) {
            return;
        }
        field4597 = null;
        field4600 = null;
        field4596 = null;
        field4598 = null;
        field4594 = null;
        field4599 = null;
    }
}
