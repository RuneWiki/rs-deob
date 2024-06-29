import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class321 extends class319 {

    @OriginalMember(owner = "client!rq", name = "t", descriptor = "[I")
    private int[] field5050 = new int[this.field5006];

    @OriginalMember(owner = "client!rq", name = "w", descriptor = "Llo;")
    public static class306 field5053 = new class306("Started 3D Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

    @OriginalMember(owner = "client!rq", name = "x", descriptor = "I")
    public static int field5054 = 0;

    @OriginalMember(owner = "client!rq", name = "o", descriptor = "I")
    private int field5045;

    @OriginalMember(owner = "client!rq", name = "p", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!rq", name = "q", descriptor = "I")
    public static int field5047;

    @OriginalMember(owner = "client!rq", name = "r", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!rq", name = "s", descriptor = "I")
    public static int field5049;

    @OriginalMember(owner = "client!rq", name = "u", descriptor = "I")
    private int field5051;

    @OriginalMember(owner = "client!rq", name = "v", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!rq", name = "y", descriptor = "Z")
    public static boolean field5055;

    @OriginalMember(owner = "client!rq", name = "n", descriptor = "[B")
    private byte[] field5044;

    @OriginalMember(owner = "client!rq", name = "z", descriptor = "[I")
    public static int[] field5056;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)V")
    public final void method375(byte arg0) {
        this.field5051 = Math.abs(this.field5051);
        if (arg0 != 120) {
            field5054 = 69;
        }
        ++field5046;
        if (this.field5051 >= 4096) {
            this.field5051 = 4095;
        }
        this.method1626(6448, this.field5045++, (byte) (this.field5051 >> 4));
        this.field5051 = 0;
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(I)V")
    public final void method379(int arg0) {
        ++field5049;
        if (arg0 != 1) {
            field5055 = false;
        }
        this.field5051 = 0;
        this.field5045 = 0;
    }

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "(I)V")
    public static void method2032(int arg0) {
        field5056 = null;
        field5053 = null;
        if (arg0 != 4) {
            field5055 = true;
        }
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(IIIIIF)V")
    public class321(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; ~var7 > ~super.field5006; ++var7) {
            this.field5050[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(III)V")
    public final void method380(int arg0, int arg1, int arg2) {
        this.field5051 += this.field5050[arg1] * arg0 >> 12;
        if (arg2 != 0) {
            this.field5051 = 56;
        }
        ++field5052;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIB)V")
    public void method1626(int arg0, int arg1, byte arg2) {
        ++field5048;
        if (arg0 != 6448) {
            method2032(39);
        }
        this.field5044[this.field5045++] = (byte) (127 + class344.method2224(127, arg2 >> 1));
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lp;IILza;BI)V")
    public static final void method2033(class39 arg0, int arg1, int arg2, class491 arg3, byte arg4, int arg5) {
        ++field5047;
        class517 var6 = class272.field4515.method2005(arg0.field651, 34);
        if (arg4 < -64) {
            if (var6.field7645 != -1) {
                int var8;
                if (arg0.field661) {
                    int var7 = arg0.field596 + arg1;
                    var8 = var7 & 3;
                } else {
                    var8 = 0;
                }
                class138 var9 = var6.method3066((byte) -115, arg3, arg0.field620, var8);
                if (var9 != null) {
                    int var10 = arg0.field611;
                    int var11 = arg0.field647;
                    if ((1 & var8) == 1) {
                        var11 = arg0.field611;
                        var10 = arg0.field647;
                    }
                    int var12 = var9.method200();
                    int var13 = var9.method198();
                    if (var6.field7655) {
                        var12 = var10 * 4;
                        var13 = var11 * 4;
                    }
                    if (var6.field7651 != 0) {
                        var9.method202(arg2, -(var11 * 4) - (-4 - arg5), var12, var13, 0, var6.field7651 | -16777216, 1);
                    } else {
                        var9.method1033(arg2, -(var11 * 4) + 4 + arg5, var12, var13);
                    }
                }
            }
        }
    }

    static {
        new class306("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
    }
}
