import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public abstract class class522 extends class419 {

    @OriginalMember(owner = "client!mv", name = "j", descriptor = "S")
    public short field7673;

    @OriginalMember(owner = "client!mv", name = "s", descriptor = "B")
    public byte field7682;

    @OriginalMember(owner = "client!mv", name = "w", descriptor = "B")
    public byte field7686;

    @OriginalMember(owner = "client!mv", name = "m", descriptor = "S")
    public short field7676;

    @OriginalMember(owner = "client!mv", name = "v", descriptor = "Z")
    public boolean field7685;

    @OriginalMember(owner = "client!mv", name = "h", descriptor = "I")
    public int field7671;

    @OriginalMember(owner = "client!mv", name = "r", descriptor = "I")
    public int field7681;

    @OriginalMember(owner = "client!mv", name = "x", descriptor = "S")
    public short field7687;

    @OriginalMember(owner = "client!mv", name = "t", descriptor = "S")
    public short field7683;

    @OriginalMember(owner = "client!mv", name = "z", descriptor = "I")
    public int field7689;

    @OriginalMember(owner = "client!mv", name = "p", descriptor = "[[Z")
    public static boolean[][] field7679 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!mv", name = "u", descriptor = "I")
    public static int field7684 = 1405;

    @OriginalMember(owner = "client!mv", name = "i", descriptor = "Ldp;")
    public static class347 field7672 = new class347("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

    @OriginalMember(owner = "client!mv", name = "y", descriptor = "Z")
    public static boolean field7688 = false;

    @OriginalMember(owner = "client!mv", name = "k", descriptor = "I")
    public static int field7674;

    @OriginalMember(owner = "client!mv", name = "l", descriptor = "I")
    public int field7675;

    @OriginalMember(owner = "client!mv", name = "o", descriptor = "I")
    public static int field7678;

    @OriginalMember(owner = "client!mv", name = "q", descriptor = "I")
    public static int field7680;

    @OriginalMember(owner = "client!mv", name = "n", descriptor = "[[Z")
    public static boolean[][] field7677;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IIIII)V")
    public static final void method3095(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 > -27) {
            return;
        }
        if (arg2 <= arg3) {
            class94.method740(class306.field4574[arg0], arg2, arg3, arg4, false);
        } else {
            class94.method740(class306.field4574[arg0], arg3, arg2, arg4, false);
        }
        field7678++;
    }

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "(B)V")
    public static void method3096(byte arg0) {
        int var1 = -100 / ((arg0 - 17) / 42);
        field7677 = null;
        field7679 = null;
        field7672 = null;
    }

    @OriginalMember(owner = "client!mv", name = "f", descriptor = "(I)V")
    public void method402(int arg0) {
        if (arg0 != 9216) {
            this.method402(-98);
        }
        field7680++;
    }

    @OriginalMember(owner = "client!mv", name = "g", descriptor = "(I)I")
    public abstract int method236(int arg0);

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IB)V")
    public static final void method3097(int arg0, byte arg1) {
        field7674++;
        int var2 = 26 / ((-arg1 - 72) / 54);
        class506 var3 = class14.method185(-1304589728, arg0, 16);
        var3.method2986(112);
    }

    @OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(IIIIIIIIZB)V")
    public class522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field7673 = (short) arg7;
        this.field7682 = arg9;
        this.field7686 = (byte) arg0;
        this.field7676 = (short) arg6;
        this.field7685 = arg8;
        this.field7671 = arg3;
        this.field7681 = arg1;
        this.field7687 = (short) arg4;
        this.field7683 = (short) arg5;
        this.field7689 = arg2;
    }
}
