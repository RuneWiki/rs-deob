import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class548 {

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    private int field8058;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "[I")
    public static int[] field8059;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "Lcea;")
    public static class180 field8060;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public static int field8054;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public static int field8055;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public static int field8056;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field8057;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
    public static int field8061;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)I")
    public final int method3213(int arg0) {
        if (arg0 != 4) {
            this.toString();
        }
        field8057++;
        return this.field8058;
    }

    @OriginalMember(owner = "client!rg", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8055++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)Z")
    public static final boolean method3214(int arg0, int arg1, int arg2) {
        field8056++;
        if (class121.method706(arg0, 2048, arg1)) {
            return (arg1 & arg2) != 0 | class259.method1456(arg0, -65, arg1) | class566.method3304(arg0, arg1, -35) ? true : (class478.method2790((byte) 13, arg1, arg0) | class636.method3651(arg0, arg1, -122)) & (arg0 & 0x37) == 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V")
    public static void method3215(byte arg0) {
        if (arg0 < -69) {
            field8060 = null;
            field8059 = null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)V")
    public static final void method3216(int arg0, int arg1) {
        field8054++;
        if (arg1 == 25253) {
            class557 var2 = class93.method564(4, arg1 - 39326, arg0);
            var2.method3264(arg1 - 1037649349);
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(II)V")
    public class548(int arg0, int arg1) {
        this.field8058 = arg0;
    }

    static {
        new class180("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
        field8059 = new int[6];
        field8060 = new class180("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");
    }
}
