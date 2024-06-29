import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class154 extends class334 implements Runnable {

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "Z")
    private boolean field2238 = true;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
    public int field2239 = -1;

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "Ljd;")
    private class152 field2243;

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "[I")
    public static int[] field2246 = new int[13];

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "[I")
    public static int[] field2240 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "[C")
    public static char[] field2248 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "Lqg;")
    public static class321 field2244;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V", line = 3)
    public final void method1060(byte arg0) {
        field2237++;
        if (arg0 != 95) {
            method1061(30);
        }
        (new Thread(this, "a")).start();
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Ljd;)V", line = 78)
    public class154(class152 arg0) {
        this.field2243 = arg0;
    }

    @OriginalMember(owner = "client!ue", name = "run", descriptor = "()V", line = 25)
    public final void run() {
        while (this.field2238) {
            this.field2243.method1050(this, 1224);
        }
        field2247++;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V", line = 38)
    public static void method1061(int arg0) {
        if (arg0 == 209) {
            field2248 = null;
            field2244 = null;
            field2246 = null;
            field2240 = null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V", line = 55)
    public final void method1062(int arg0) {
        int var2 = 33 % ((arg0 + 48) / 50);
        this.field2238 = false;
        field2245++;
    }
}
