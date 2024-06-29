import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class195 {

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "[B")
    public byte[] field2828 = new byte[4096];

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "[B")
    public byte[] field2824 = new byte[256];

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "[I")
    public int[] field2817 = new int[16];

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "[[I")
    public int[][] field2820 = new int[6][258];

    @OriginalMember(owner = "client!ol", name = "x", descriptor = "[B")
    public byte[] field2840 = new byte[18002];

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "[[B")
    public byte[][] field2819 = new byte[6][258];

    @OriginalMember(owner = "client!ol", name = "t", descriptor = "[I")
    public int[] field2836 = new int[6];

    @OriginalMember(owner = "client!ol", name = "u", descriptor = "[Z")
    public boolean[] field2837 = new boolean[16];

    @OriginalMember(owner = "client!ol", name = "E", descriptor = "I")
    public int field2846 = 0;

    @OriginalMember(owner = "client!ol", name = "z", descriptor = "[I")
    public int[] field2842 = new int[256];

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "[I")
    public int[] field2818 = new int[257];

    @OriginalMember(owner = "client!ol", name = "F", descriptor = "[Z")
    public boolean[] field2847 = new boolean[256];

    @OriginalMember(owner = "client!ol", name = "v", descriptor = "[B")
    public byte[] field2838 = new byte[18002];

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "[[I")
    public int[][] field2825 = new int[6][258];

    @OriginalMember(owner = "client!ol", name = "K", descriptor = "I")
    public int field2852 = 0;

    @OriginalMember(owner = "client!ol", name = "J", descriptor = "[[I")
    public int[][] field2851 = new int[6][258];

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "I")
    public static int field2827 = 0;

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "[B")
    public static byte[] field2829 = new byte[2048];

    @OriginalMember(owner = "client!ol", name = "H", descriptor = "I")
    public static int field2849 = -1;

    @OriginalMember(owner = "client!ol", name = "M", descriptor = "[I")
    public static int[] field2854;

    @OriginalMember(owner = "client!ol", name = "N", descriptor = "B")
    public byte field2855;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
    public int field2823;

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "I")
    public int field2826;

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "I")
    public int field2830;

    @OriginalMember(owner = "client!ol", name = "o", descriptor = "I")
    public int field2831;

    @OriginalMember(owner = "client!ol", name = "q", descriptor = "I")
    public int field2833;

    @OriginalMember(owner = "client!ol", name = "r", descriptor = "I")
    public int field2834;

    @OriginalMember(owner = "client!ol", name = "s", descriptor = "I")
    public int field2835;

    @OriginalMember(owner = "client!ol", name = "w", descriptor = "I")
    public int field2839;

    @OriginalMember(owner = "client!ol", name = "y", descriptor = "I")
    public int field2841;

    @OriginalMember(owner = "client!ol", name = "C", descriptor = "I")
    public int field2844;

    @OriginalMember(owner = "client!ol", name = "D", descriptor = "I")
    public int field2845;

    @OriginalMember(owner = "client!ol", name = "G", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!ol", name = "I", descriptor = "I")
    public int field2850;

    @OriginalMember(owner = "client!ol", name = "L", descriptor = "I")
    public int field2853;

    @OriginalMember(owner = "client!ol", name = "p", descriptor = "[B")
    public byte[] field2832;

    @OriginalMember(owner = "client!ol", name = "A", descriptor = "[B")
    public byte[] field2843;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZZI)V")
    public static final void method1275(boolean arg0, boolean arg1, int arg2) {
        if (arg0) {
            field2854 = null;
        }
        field2848++;
        class412 var3 = class379.method2261(3597, arg1, arg2);
        if (var3 != null) {
            var3.method2791((byte) 112);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
    public static void method1276(int arg0) {
        field2854 = null;
        if (arg0 == -3044) {
            field2829 = null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)I")
    public static final int method1277(byte arg0) {
        if (arg0 <= 96) {
            field2827 = -97;
        }
        field2822++;
        return 2;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)V")
    public static final void method1278(int arg0) {
        class249.method1486();
        field2821++;
        for (int var1 = arg0; var1 < 4; var1++) {
            class264.field3553[var1].method2713(-81);
        }
        class35.method258(75);
        class250.method1490((byte) 107);
        System.gc();
    }

    static {
        new class157("Your friends list is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
        field2854 = new int[1];
    }
}
