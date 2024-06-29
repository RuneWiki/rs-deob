import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class201 {

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    public int field2839;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "Llh;")
    private class125 field2837;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "[I")
    public static int[] field2842;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "[[Z")
    public static boolean[][] field2843;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "Z")
    public static boolean field2844;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "[S")
    public static short[] field2840;

    static {
        new class567("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
        field2841 = -1;
        field2842 = new int[14];
        field2843 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };
        field2844 = false;
    }

    @OriginalMember(owner = "client!qg", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() throws Throwable {
        field2838++;
        this.field2837.method993(this.field2839, (byte) -62);
        super.finalize();
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V", line = 18)
    public static void method1302(byte arg0) {
        if (arg0 != 24) {
            method1302((byte) 114);
        }
        field2840 = null;
        field2843 = null;
        field2842 = null;
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Llh;II)V", line = 30)
    public class201(class125 arg0, int arg1, int arg2) {
        this.field2839 = arg2;
        this.field2837 = arg0;
    }
}
