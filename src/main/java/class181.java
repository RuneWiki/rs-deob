import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class181 extends class12 {

    @OriginalMember(owner = "client!un", name = "A", descriptor = "I")
    private int field2740;

    @OriginalMember(owner = "client!un", name = "o", descriptor = "I")
    private int field2728;

    @OriginalMember(owner = "client!un", name = "F", descriptor = "I")
    private int field2745;

    @OriginalMember(owner = "client!un", name = "E", descriptor = "I")
    private int field2744;

    @OriginalMember(owner = "client!un", name = "p", descriptor = "I")
    public static int field2729 = 0;

    @OriginalMember(owner = "client!un", name = "D", descriptor = "Z")
    public static boolean field2743 = true;

    @OriginalMember(owner = "client!un", name = "y", descriptor = "[[Z")
    public static boolean[][] field2738 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!un", name = "q", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!un", name = "r", descriptor = "I")
    private int field2731;

    @OriginalMember(owner = "client!un", name = "t", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!un", name = "u", descriptor = "I")
    private int field2734;

    @OriginalMember(owner = "client!un", name = "v", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!un", name = "x", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!un", name = "z", descriptor = "I")
    private int field2739;

    @OriginalMember(owner = "client!un", name = "B", descriptor = "I")
    private int field2741;

    @OriginalMember(owner = "client!un", name = "C", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!un", name = "G", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!un", name = "s", descriptor = "Lnl;")
    public static class435 field2732;

    @OriginalMember(owner = "client!un", name = "w", descriptor = "[B")
    private byte[] field2736;

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(Z)V")
    public final void method62(boolean arg0) {
        if (!arg0) {
            this.field2734 = 0;
            field2735++;
            this.field2741 = 0;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1300(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2742++;
        int var9 = 9 / ((-arg4 - 25) / 62);
        if (class369.method2261(0, arg6)) {
            class345.method2146(arg2, false, -1, arg8, arg5, arg7, arg1, arg0, arg3, class263.field3787[arg6]);
        } else if (arg1 == -1) {
            for (int var10 = 0; var10 < 100; var10++) {
                class424.field5879[var10] = true;
            }
        } else {
            class424.field5879[arg1] = true;
        }
    }

    @OriginalMember(owner = "client!un", name = "c", descriptor = "(I)V")
    public static void method1301(int arg0) {
        if (arg0 != 0) {
            field2738 = null;
        }
        field2738 = null;
        field2732 = null;
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "(IIIIIFFF)V")
    public class181(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field2740 = (int) (arg6 * 4096.0F);
        this.field2728 = (int) (arg7 * 4096.0F);
        this.field2744 = this.field2745 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(III)V")
    public final void method59(int arg0, int arg1, int arg2) {
        int var4 = 21 % ((-arg1 - 67) / 33);
        if (arg0 == 0) {
            this.field2731 = this.field2740 - (arg2 >= 0 ? arg2 : -arg2);
            this.field2731 = this.field2731 * this.field2731 >> 12;
            this.field2739 = 4096;
            this.field2741 = this.field2731;
        } else {
            this.field2739 = this.field2731 * this.field2728 >> 12;
            if (this.field2739 < 0) {
                this.field2739 = 0;
            } else if (this.field2739 > 4096) {
                this.field2739 = 4096;
            }
            this.field2731 = this.field2740 - (arg2 < 0 ? -arg2 : arg2);
            this.field2731 = this.field2731 * this.field2731 >> 12;
            this.field2731 = this.field2739 * this.field2731 >> 12;
            this.field2741 += this.field2744 * this.field2731 >> 12;
            this.field2744 = this.field2745 * this.field2744 >> 12;
        }
        field2737++;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(I)V")
    public final void method61(int arg0) {
        this.field2741 >>= arg0;
        field2730++;
        this.field2744 = this.field2745;
        if (this.field2741 < 0) {
            this.field2741 = 0;
        } else if (this.field2741 > 255) {
            this.field2741 = 255;
        }
        this.method907(this.field2734++, (byte) this.field2741);
        this.field2741 = 0;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IB)V")
    public void method907(int arg0, byte arg1) {
        this.field2736[arg0] = arg1;
        field2733++;
    }

    static {
        new class151("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
    }
}
