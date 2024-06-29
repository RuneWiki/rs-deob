import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public abstract class class210 extends class170 {

    @OriginalMember(owner = "client!lb", name = "A", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!lb", name = "y", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!lb", name = "B", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!lb", name = "x", descriptor = "[I")
    public static int[] field2934;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "([BB)[B")
    public static final byte[] method1409(byte[] arg0, byte arg1) {
        field2935++;
        class366 var2 = new class366(arg0);
        if (arg1 <= 119) {
            field2934 = null;
        }
        int var3 = var2.method2306((byte) 114);
        int var4 = var2.method2258(1177515464);
        if (var4 < 0 || !(class305.field4150 == 0 || class305.field4150 >= var4)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method2249(0, (byte) -74, var4, var7);
            return var7;
        } else {
            int var5 = var2.method2258(1177515464);
            if (var5 < 0 || !(class305.field4150 == 0 || class305.field4150 >= var5)) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class176.method1244(var6, var5, arg0, var4, 9);
            } else {
                class41.field530.method954(var6, -31867, var2);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(CI)Z")
    public static final boolean method1410(char arg0, int arg1) {
        field2936++;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            return true;
        }
        if (arg0 != arg1) {
            char[] var2 = class171.field2432;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg0 == var4) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(II)V")
    public static final void method1411(int arg0, int arg1) {
        field2933++;
        class258.field3572 = -1;
        if (arg0 != -101) {
            field2937 = -39;
        }
        if (arg1 == 37) {
            class333.field4498 = 3.0F;
        } else if (arg1 == 50) {
            class333.field4498 = 4.0F;
        } else if (arg1 == 75) {
            class333.field4498 = 6.0F;
        } else if (arg1 == 100) {
            class333.field4498 = 8.0F;
        } else if (arg1 == 200) {
            class333.field4498 = 16.0F;
        }
        class258.field3572 = -1;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(Z)V")
    public static void method1412(boolean arg0) {
        if (arg0) {
            field2934 = null;
        }
        field2934 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BIIZI)V")
    public static final void method1413(byte arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field2938++;
        if (arg0 != -30) {
            field2937 = 30;
        }
        if (class387.method2400(arg2, 176)) {
            class87.method691(-1, arg3, arg1, arg4, class103.field1425[arg2], -69);
        }
    }

    static {
        new class368("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
        field2937 = 0;
    }
}
