import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class117 {

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "[Z")
    public boolean[] field2627 = new boolean[16];

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "[[I")
    public int[][] field2630 = new int[6][258];

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "[[I")
    public int[][] field2643 = new int[6][258];

    @OriginalMember(owner = "client!qf", name = "v", descriptor = "[B")
    public byte[] field2644 = new byte[18002];

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "[I")
    public int[] field2639 = new int[256];

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "[B")
    public byte[] field2631 = new byte[4096];

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "[B")
    public byte[] field2641 = new byte[256];

    @OriginalMember(owner = "client!qf", name = "H", descriptor = "[I")
    public int[] field2656 = new int[6];

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "[[B")
    public byte[][] field2658 = new byte[6][258];

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "[[I")
    public int[][] field2659 = new int[6][258];

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
    public int field2636 = 0;

    @OriginalMember(owner = "client!qf", name = "G", descriptor = "[Z")
    public boolean[] field2655 = new boolean[256];

    @OriginalMember(owner = "client!qf", name = "A", descriptor = "I")
    public int field2649 = 0;

    @OriginalMember(owner = "client!qf", name = "N", descriptor = "[I")
    public int[] field2662 = new int[257];

    @OriginalMember(owner = "client!qf", name = "C", descriptor = "[B")
    public byte[] field2651 = new byte[18002];

    @OriginalMember(owner = "client!qf", name = "O", descriptor = "[I")
    public int[] field2663 = new int[16];

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "[I")
    public static int[] field2624 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "I")
    public static int field2642 = 0;

    @OriginalMember(owner = "client!qf", name = "y", descriptor = "Lsc;")
    public static class128 field2647 = class129.method1017(false, "(U3");

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "Lsc;")
    private static class128 field2640 = class129.method1017(false, "No response from server)3");

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "Lsc;")
    public static class128 field2635 = field2640;

    @OriginalMember(owner = "client!qf", name = "M", descriptor = "Lsc;")
    public static class128 field2661 = class129.method1017(false, "Clientscript error )2 check log for details");

    @OriginalMember(owner = "client!qf", name = "I", descriptor = "I")
    public static int field2657 = 0;

    @OriginalMember(owner = "client!qf", name = "B", descriptor = "B")
    public byte field2650;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public int field2625;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public int field2626;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public int field2629;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "I")
    public int field2633;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "I")
    public int field2634;

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "I")
    public int field2637;

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "I")
    public int field2638;

    @OriginalMember(owner = "client!qf", name = "w", descriptor = "I")
    public int field2645;

    @OriginalMember(owner = "client!qf", name = "x", descriptor = "I")
    public int field2646;

    @OriginalMember(owner = "client!qf", name = "z", descriptor = "I")
    public int field2648;

    @OriginalMember(owner = "client!qf", name = "D", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!qf", name = "F", descriptor = "I")
    public int field2654;

    @OriginalMember(owner = "client!qf", name = "L", descriptor = "I")
    public int field2660;

    @OriginalMember(owner = "client!qf", name = "P", descriptor = "I")
    public int field2664;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "[B")
    public byte[] field2628;

    @OriginalMember(owner = "client!qf", name = "E", descriptor = "[B")
    public byte[] field2653;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
    public static final void method898(int arg0) {
        field2632++;
        if (arg0 != -30040) {
            field2635 = null;
        }
        for (class30 var1 = (class30) class43.field804.method920((byte) -74); var1 != null; var1 = (class30) class43.field804.method932(-6)) {
            if (class29.field553 != var1.field592 || var1.field577 < class29.field554) {
                var1.method172(-2658);
            } else if (class29.field554 >= var1.field589) {
                if (var1.field568 > 0) {
                    class51 var2 = class92.field2104[var1.field568 - 1];
                    if (var2 != null && var2.field975 >= 0 && var2.field975 < 13312 && var2.field987 >= 0 && var2.field987 < 13312) {
                        var1.method242(var2.field987, var2.field975, class97.method755(var2.field987, var1.field592, var2.field975, 256) - var1.field601, class29.field554, true);
                    }
                }
                if (var1.field568 < 0) {
                    int var3 = -var1.field568 - 1;
                    class53 var4;
                    if (class33.field628 == var3) {
                        var4 = class151.field3473;
                    } else {
                        var4 = class106.field2421[var3];
                    }
                    if (var4 != null && var4.field975 >= 0 && var4.field975 < 13312 && var4.field987 >= 0 && var4.field987 < 13312) {
                        var1.method242(var4.field987, var4.field975, class97.method755(var4.field987, var1.field592, var4.field975, arg0 ^ 0xFFFF8BA8) - var1.field601, class29.field554, true);
                    }
                }
                var1.method241(class155.field3570, true);
                class154.field3553.method106(class29.field553, (int) var1.field596, (int) var1.field566, (int) var1.field585, 60, var1, var1.field563, -1, false);
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V")
    public static final void method899(int arg0) {
        Object var1 = class131.field3039;
        synchronized (class131.field3039) {
            if (class119.field2708 == 0) {
                class144.field3353.method86(new class41(), 122, 5);
            }
            class119.field2708 = 600;
        }
        field2623++;
        if (arg0 > -2) {
            field2640 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(I)V")
    public static void method900(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field2640 = null;
        field2647 = null;
        field2661 = null;
        field2624 = null;
        field2635 = null;
    }
}
