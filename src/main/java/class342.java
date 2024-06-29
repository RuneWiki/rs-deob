import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class342 {

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "I")
    private int field5097 = -1;

    @OriginalMember(owner = "client!ls", name = "i", descriptor = "I")
    private int field5104 = 0;

    @OriginalMember(owner = "client!ls", name = "m", descriptor = "Lnv;")
    private class44 field5108 = new class44();

    @OriginalMember(owner = "client!ls", name = "o", descriptor = "Z")
    public boolean field5110 = false;

    @OriginalMember(owner = "client!ls", name = "f", descriptor = "I")
    private int field5101;

    @OriginalMember(owner = "client!ls", name = "l", descriptor = "I")
    private int field5107;

    @OriginalMember(owner = "client!ls", name = "g", descriptor = "[Ldc;")
    private class16[] field5102;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "[[[I")
    private int[][][] field5096;

    @OriginalMember(owner = "client!ls", name = "n", descriptor = "Lpu;")
    public static class179 field5109 = new class179("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

    @OriginalMember(owner = "client!ls", name = "p", descriptor = "I")
    public static int field5111 = 0;

    @OriginalMember(owner = "client!ls", name = "r", descriptor = "[I")
    public static int[] field5113;

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "I")
    public static int field5098;

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "I")
    public static int field5099;

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "I")
    public static int field5100;

    @OriginalMember(owner = "client!ls", name = "h", descriptor = "I")
    public static int field5103;

    @OriginalMember(owner = "client!ls", name = "j", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!ls", name = "k", descriptor = "I")
    public static int field5106;

    @OriginalMember(owner = "client!ls", name = "q", descriptor = "I")
    public static int field5112;

    @OriginalMember(owner = "client!ls", name = "t", descriptor = "I")
    public static int field5115;

    @OriginalMember(owner = "client!ls", name = "s", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field5114;

    static {
        new class179("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
        field5113 = new int[] { 1, 2, 4, 8 };
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)I", line = 5)
    public static final int method2200(int arg0) {
        if (arg0 != 1) {
            field5115 = -75;
        }
        field5098++;
        if ((double) class362.field5337 == 3.0D) {
            return 37;
        } else if ((double) class362.field5337 == 4.0D) {
            return 50;
        } else if ((double) class362.field5337 == 6.0D) {
            return 75;
        } else if ((double) class362.field5337 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(I)V", line = 29)
    public static void method2201(int arg0) {
        if (arg0 >= 52) {
            field5114 = null;
            field5109 = null;
            field5113 = null;
        }
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(III)V", line = 219)
    public class342(int arg0, int arg1, int arg2) {
        this.field5101 = arg1;
        this.field5107 = arg0;
        this.field5102 = new class16[this.field5101];
        this.field5096 = new int[this.field5107][3][arg2];
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IBI)Z", line = 47)
    public static final boolean method2202(int arg0, byte arg1, int arg2) {
        field5103++;
        if (arg1 != -13) {
            field5112 = -43;
        }
        return class192.method1329(arg2, -1, arg0) | (arg0 & 0x70000) != 0 || class303.method2004(arg1 + 131, arg0, arg2);
    }

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "(I)V", line = 59)
    public final void method2203(int arg0) {
        field5100++;
        for (int var2 = 0; var2 < this.field5107; var2++) {
            this.field5096[var2][0] = null;
            this.field5096[var2][1] = null;
            this.field5096[var2][2] = null;
            this.field5096[var2] = null;
        }
        this.field5102 = null;
        this.field5096 = null;
        this.field5108.method291(false);
        this.field5108 = null;
        if (arg0 != 75) {
            method2204(8, (byte) 68, -93, 69, 120, -34, -81, 36, -31);
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IBIIIIIII)Z", line = 95)
    public static final boolean method2204(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5099++;
        if (arg0 < (arg3 + arg7) && (arg0 + arg8) > arg3) {
            int var9 = -13 / ((-arg1 - 27) / 50);
            return arg5 < arg4 + arg6 && arg4 < arg5 + arg2;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)[[[I", line = 113)
    public final int[][][] method2205(byte arg0) {
        field5106++;
        if (this.field5107 != this.field5101) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field5107; var2++) {
            this.field5102[var2] = class326.field4934;
        }
        if (arg0 != 52) {
            this.field5096 = null;
        }
        return this.field5096;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(II)[[I", line = 135)
    public final int[][] method2206(int arg0, int arg1) {
        field5105++;
        if (arg0 > -9) {
            this.method2203(61);
        }
        if (this.field5107 == this.field5101) {
            this.field5110 = this.field5102[arg1] == null;
            this.field5102[arg1] = class326.field4934;
            return this.field5096[arg1];
        } else if (this.field5107 == 1) {
            this.field5110 = this.field5097 != arg1;
            this.field5097 = arg1;
            return this.field5096[0];
        } else {
            class16 var3 = this.field5102[arg1];
            if (var3 == null) {
                this.field5110 = true;
                if (this.field5107 > this.field5104) {
                    var3 = new class16(arg1, this.field5104);
                    this.field5104++;
                } else {
                    class16 var4 = (class16) this.field5108.method294(0);
                    var3 = new class16(arg1, var4.field168);
                    this.field5102[var4.field174] = null;
                    var4.method947((byte) 96);
                }
                this.field5102[arg1] = var3;
            } else {
                this.field5110 = false;
            }
            this.field5108.method288(var3, 28);
            return this.field5096[var3.field168];
        }
    }
}
