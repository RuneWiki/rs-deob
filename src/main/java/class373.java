import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class373 extends class350 {

    @OriginalMember(owner = "client!uo", name = "v", descriptor = "I")
    private int field5378;

    @OriginalMember(owner = "client!uo", name = "q", descriptor = "I")
    private int field5373;

    @OriginalMember(owner = "client!uo", name = "r", descriptor = "I")
    private int field5374;

    @OriginalMember(owner = "client!uo", name = "A", descriptor = "I")
    private int field5383;

    @OriginalMember(owner = "client!uo", name = "w", descriptor = "Ldk;")
    public static class326 field5379 = new class326("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!uo", name = "C", descriptor = "Lus;")
    public static class1 field5385 = new class1(42, 0);

    @OriginalMember(owner = "client!uo", name = "D", descriptor = "Ljava/lang/String;")
    public static String field5386;

    @OriginalMember(owner = "client!uo", name = "o", descriptor = "I")
    private int field5371;

    @OriginalMember(owner = "client!uo", name = "p", descriptor = "I")
    public static int field5372;

    @OriginalMember(owner = "client!uo", name = "s", descriptor = "I")
    private int field5375;

    @OriginalMember(owner = "client!uo", name = "t", descriptor = "I")
    private int field5376;

    @OriginalMember(owner = "client!uo", name = "u", descriptor = "I")
    private int field5377;

    @OriginalMember(owner = "client!uo", name = "x", descriptor = "I")
    public static int field5380;

    @OriginalMember(owner = "client!uo", name = "y", descriptor = "I")
    public static int field5381;

    @OriginalMember(owner = "client!uo", name = "z", descriptor = "I")
    public static int field5382;

    @OriginalMember(owner = "client!uo", name = "B", descriptor = "[B")
    private byte[] field5384;

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(IIIIIFFF)V")
    public class373(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field5378 = (int) (arg6 * 4096.0F);
        this.field5373 = (int) (arg7 * 4096.0F);
        this.field5383 = this.field5374 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Z)V")
    public final void method1498(boolean arg0) {
        field5381++;
        if (!arg0) {
            this.method1500((byte) -61, 39, -6);
        }
        this.field5371 = 0;
        this.field5375 = 0;
    }

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "(I)V")
    public final void method1502(int arg0) {
        this.field5375 >>= 0x4;
        this.field5383 = this.field5374;
        field5382++;
        if (arg0 >= -15) {
            this.method1920(54, (byte) -119);
        }
        if (this.field5375 < 0) {
            this.field5375 = 0;
        } else if (this.field5375 > 255) {
            this.field5375 = 255;
        }
        this.method1920(this.field5371++, (byte) this.field5375);
        this.field5375 = 0;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IB)V")
    public void method1920(int arg0, byte arg1) {
        field5372++;
        this.field5384[arg0] = arg1;
    }

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "(I)V")
    public static void method2277(int arg0) {
        if (arg0 <= 46) {
            field5385 = null;
        }
        field5385 = null;
        field5386 = null;
        field5379 = null;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(BII)V")
    public final void method1500(byte arg0, int arg1, int arg2) {
        if (arg0 != -62) {
            this.method1498(true);
        }
        if (arg1 == 0) {
            this.field5377 = this.field5378 - (arg2 < 0 ? -arg2 : arg2);
            this.field5376 = 4096;
            this.field5377 = this.field5377 * this.field5377 >> 12;
            this.field5375 = this.field5377;
        } else {
            this.field5376 = this.field5377 * this.field5373 >> 12;
            this.field5377 = this.field5378 - (arg2 < 0 ? -arg2 : arg2);
            if (this.field5376 < 0) {
                this.field5376 = 0;
            } else if (this.field5376 > 4096) {
                this.field5376 = 4096;
            }
            this.field5377 = this.field5377 * this.field5377 >> 12;
            this.field5377 = this.field5377 * this.field5376 >> 12;
            this.field5375 += this.field5383 * this.field5377 >> 12;
            this.field5383 = this.field5383 * this.field5374 >> 12;
        }
        field5380++;
    }

    static {
        new class326("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
        field5386 = null;
    }
}
