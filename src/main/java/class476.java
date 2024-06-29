import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class476 {

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
    public int field6681 = -1;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "I")
    public int field6684 = -1;

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "Lwf;")
    public static class79 field6687;

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "I")
    public static int field6688;

    @OriginalMember(owner = "client!fm", name = "m", descriptor = "[S")
    public static short[] field6692;

    @OriginalMember(owner = "client!fm", name = "l", descriptor = "[I")
    public static int[] field6691;

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "I")
    public static int field6690;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
    public static int field6680;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "I")
    public static int field6683;

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "I")
    public static int field6685;

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "I")
    public static int field6686;

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "Lii;")
    public static class358 field6689;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "[I")
    public int[] field6682;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V")
    public static void method2788(int arg0) {
        field6692 = null;
        field6691 = null;
        field6687 = null;
        if (arg0 == 27481) {
            field6689 = null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILrp;I)V")
    private final void method2789(int arg0, class276 arg1, int arg2) {
        if (arg2 == 1) {
            this.field6684 = arg1.method1729(65280);
        } else if (arg2 == 2) {
            this.field6682 = new int[arg1.method1701(arg0 - 23121)];
            for (int var4 = 0; var4 < this.field6682.length; var4++) {
                this.field6682[var4] = arg1.method1729(65280);
            }
        } else if (arg2 == 3) {
            this.field6681 = arg1.method1701(-23121);
        }
        if (arg0 == 0) {
            field6680++;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILrp;)V")
    public final void method2790(int arg0, class276 arg1) {
        field6686++;
        while (true) {
            int var3 = arg1.method1701(-23121);
            if (var3 == 0) {
                int var4 = -117 / (arg0 / 32);
                return;
            }
            this.method2789(0, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(BII)V")
    public static final void method2791(byte arg0, int arg1, int arg2) {
        if (arg0 >= -84) {
            method2788(93);
        }
        field6683++;
        class489 var3 = class116.method731(-625541408, 6, arg1);
        var3.method2863(255);
        var3.field6895 = arg2;
    }

    static {
        new class326("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
        field6687 = new class79(63, 7);
        field6688 = 0;
        field6692 = new short[] { 30, 15, 22, 18, 59, 45, 23, 6 };
        field6691 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };
        field6690 = 0;
    }
}
