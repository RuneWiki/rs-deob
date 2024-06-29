import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public abstract class class531 extends class115 {

    @OriginalMember(owner = "client!wr", name = "p", descriptor = "I")
    public int field7820;

    @OriginalMember(owner = "client!wr", name = "r", descriptor = "I")
    private int field7822;

    @OriginalMember(owner = "client!wr", name = "j", descriptor = "I")
    private int field7814;

    @OriginalMember(owner = "client!wr", name = "m", descriptor = "I")
    public int field7817;

    @OriginalMember(owner = "client!wr", name = "w", descriptor = "I")
    public int field7827;

    @OriginalMember(owner = "client!wr", name = "n", descriptor = "F")
    public float field7818;

    @OriginalMember(owner = "client!wr", name = "t", descriptor = "[I")
    public static int[] field7824;

    @OriginalMember(owner = "client!wr", name = "s", descriptor = "Luv;")
    public static class2 field7823;

    @OriginalMember(owner = "client!wr", name = "y", descriptor = "I")
    public static int field7829;

    @OriginalMember(owner = "client!wr", name = "i", descriptor = "I")
    public static int field7813;

    @OriginalMember(owner = "client!wr", name = "k", descriptor = "I")
    public static int field7815;

    @OriginalMember(owner = "client!wr", name = "l", descriptor = "I")
    public static int field7816;

    @OriginalMember(owner = "client!wr", name = "o", descriptor = "I")
    public static int field7819;

    @OriginalMember(owner = "client!wr", name = "q", descriptor = "I")
    public static int field7821;

    @OriginalMember(owner = "client!wr", name = "u", descriptor = "I")
    public static int field7825;

    @OriginalMember(owner = "client!wr", name = "v", descriptor = "I")
    public static int field7826;

    @OriginalMember(owner = "client!wr", name = "x", descriptor = "I")
    public static int field7828;

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "(B)I")
    public final int method3150(byte arg0) {
        if (arg0 == 107) {
            field7821++;
            return this.field7827;
        } else {
            return 84;
        }
    }

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "(B)F")
    public final float method3151(byte arg0) {
        if (arg0 == -28) {
            field7826++;
            return this.field7818;
        } else {
            return 0.7722124F;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)I")
    public final int method3152(int arg0) {
        field7815++;
        if (arg0 != 7) {
            this.method1491(106, -67, (byte) 0, -69);
        }
        return this.field7814;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(FI)V")
    public abstract void method1493(float arg0, int arg1);

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "(I)V")
    public static void method3153(int arg0) {
        if (arg0 != 22858) {
            field7824 = null;
        }
        field7823 = null;
        field7824 = null;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIBI)V")
    public abstract void method1491(int arg0, int arg1, byte arg2, int arg3);

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Z)I")
    public final int method3154(boolean arg0) {
        field7828++;
        return arg0 ? 54 : this.field7820;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lkh;B)V")
    public static final void method3155(class400 arg0, byte arg1) {
        field7819++;
        int var2 = arg0.field6054 - class86.field1350;
        int var3 = arg0.field6045 * 128 + arg0.method2419((byte) 109) * 64;
        int var4 = arg0.field5975 * 128 + arg0.method2419((byte) 118) * 64;
        arg0.field7671 += (var4 - arg0.field7671) / var2;
        arg0.field6059 = 0;
        arg0.field7681 += (var3 - arg0.field7681) / var2;
        if (arg1 != 43) {
            field7825 = 11;
        }
        if (arg0.field6032 == 0) {
            arg0.method2426(8192, (byte) 38);
        }
        if (arg0.field6032 == 1) {
            arg0.method2426(12288, (byte) 38);
        }
        if (arg0.field6032 == 2) {
            arg0.method2426(0, (byte) 38);
        }
        if (arg0.field6032 == 3) {
            arg0.method2426(4096, (byte) 38);
        }
    }

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "(I)I")
    public final int method3156(int arg0) {
        field7816++;
        int var2 = 77 / ((arg0 - 33) / 36);
        return this.field7822;
    }

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "(I)I")
    public final int method3157(int arg0) {
        int var2 = -118 % ((arg0 - 2) / 42);
        field7813++;
        return this.field7817;
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(IIIIIF)V")
    public class531(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field7820 = arg1;
        this.field7822 = arg3;
        this.field7814 = arg4;
        this.field7817 = arg0;
        this.field7827 = arg2;
        this.field7818 = arg5;
    }

    static {
        new class347("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
        field7824 = new int[] { 28, 35, 40, 44 };
        field7823 = new class2(49, 7);
        field7829 = 2;
    }
}
