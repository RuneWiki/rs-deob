import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class205 {

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "B")
    public byte field3038 = 0;

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "S")
    public short field3041;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "S")
    public short field3035;

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "B")
    public byte field3042;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "B")
    public byte field3036;

    @OriginalMember(owner = "client!nj", name = "v", descriptor = "[I")
    public static int[] field3046 = new int[1000];

    @OriginalMember(owner = "client!nj", name = "t", descriptor = "Lh;")
    public static class572 field3044 = new class572("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

    @OriginalMember(owner = "client!nj", name = "C", descriptor = "S")
    public static short field3052 = 1;

    @OriginalMember(owner = "client!nj", name = "x", descriptor = "[I")
    public static int[] field3048 = new int[64];

    @OriginalMember(owner = "client!nj", name = "E", descriptor = "Llu;")
    public static class610 field3054 = new class610(22, 6);

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "B")
    public byte field3026;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "B")
    public byte field3031;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "B")
    public byte field3039;

    @OriginalMember(owner = "client!nj", name = "D", descriptor = "B")
    public byte field3053;

    @OriginalMember(owner = "client!nj", name = "B", descriptor = "F")
    public static float field3051;

    @OriginalMember(owner = "client!nj", name = "F", descriptor = "F")
    public static float field3055;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "Lhu;")
    public class113 field3037;

    @OriginalMember(owner = "client!nj", name = "w", descriptor = "Lhu;")
    public class113 field3047;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "Lnj;")
    public class205 field3025;

    @OriginalMember(owner = "client!nj", name = "u", descriptor = "Lsm;")
    public class238 field3045;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "Lrd;")
    public class283 field3030;

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "Luj;")
    public class323 field3040;

    @OriginalMember(owner = "client!nj", name = "z", descriptor = "Luj;")
    public class323 field3050;

    @OriginalMember(owner = "client!nj", name = "s", descriptor = "Llca;")
    public class553 field3043;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "Lkr;")
    public class636 field3029;

    @OriginalMember(owner = "client!nj", name = "y", descriptor = "S")
    public short field3049;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "Z")
    public boolean field3028;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "Z")
    public boolean field3032;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "Z")
    public boolean field3034;

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(III)V", line = 2)
    public class205(int arg0, int arg1, int arg2) {
        this.field3041 = (short) arg1;
        this.field3035 = (short) arg2;
        this.field3036 = this.field3042 = (byte) arg0;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V", line = 32)
    public static void method1353(byte arg0) {
        field3046 = null;
        field3044 = null;
        field3048 = null;
        if (arg0 != -42) {
            field3048 = null;
        }
        field3054 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V", line = 71)
    public final void method1354(int arg0) {
        if (arg0 != -3178) {
            this.field3049 = 101;
        }
        while (this.field3029 != null) {
            class636 var2 = this.field3029.field9302;
            this.field3029.method3694(-501);
            this.field3029 = var2;
        }
        field3033++;
        this.field3038 = 0;
    }
}
