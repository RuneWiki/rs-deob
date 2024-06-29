import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class123 extends class97 {

    @OriginalMember(owner = "client!ng", name = "z", descriptor = "I")
    public int field2635 = 0;

    @OriginalMember(owner = "client!ng", name = "R", descriptor = "[I")
    public int[] field2653 = new int[5];

    @OriginalMember(owner = "client!ng", name = "Q", descriptor = "[Lhe;")
    public class68[] field2652 = new class68[5];

    @OriginalMember(owner = "client!ng", name = "B", descriptor = "I")
    public int field2637;

    @OriginalMember(owner = "client!ng", name = "U", descriptor = "I")
    public int field2656;

    @OriginalMember(owner = "client!ng", name = "F", descriptor = "I")
    public int field2641;

    @OriginalMember(owner = "client!ng", name = "M", descriptor = "I")
    public int field2648;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "Lea;")
    public static class38 field2627 = class9.method46((byte) 112, "gr-Un:");

    @OriginalMember(owner = "client!ng", name = "v", descriptor = "Z")
    public static boolean field2631 = false;

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "Lrc;")
    public static class155 field2629 = new class155(20);

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!ng", name = "w", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!ng", name = "D", descriptor = "I")
    public int field2639;

    @OriginalMember(owner = "client!ng", name = "H", descriptor = "I")
    public int field2643;

    @OriginalMember(owner = "client!ng", name = "J", descriptor = "I")
    public int field2645;

    @OriginalMember(owner = "client!ng", name = "K", descriptor = "I")
    public int field2646;

    @OriginalMember(owner = "client!ng", name = "L", descriptor = "I")
    public int field2647;

    @OriginalMember(owner = "client!ng", name = "P", descriptor = "I")
    public int field2651;

    @OriginalMember(owner = "client!ng", name = "S", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!ng", name = "I", descriptor = "Lle;")
    public class103 field2644;

    @OriginalMember(owner = "client!ng", name = "E", descriptor = "Lma;")
    public class108 field2640;

    @OriginalMember(owner = "client!ng", name = "T", descriptor = "Lng;")
    public class123 field2655;

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "Lob;")
    public static class127 field2630;

    @OriginalMember(owner = "client!ng", name = "x", descriptor = "Loc;")
    public class128 field2633;

    @OriginalMember(owner = "client!ng", name = "G", descriptor = "Lra;")
    public class153 field2642;

    @OriginalMember(owner = "client!ng", name = "A", descriptor = "Lte;")
    public class175 field2636;

    @OriginalMember(owner = "client!ng", name = "N", descriptor = "Ltg;")
    public class177 field2649;

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "Ldd;")
    public static class32 field2626;

    @OriginalMember(owner = "client!ng", name = "y", descriptor = "Z")
    public boolean field2634;

    @OriginalMember(owner = "client!ng", name = "C", descriptor = "Z")
    public boolean field2638;

    @OriginalMember(owner = "client!ng", name = "O", descriptor = "Z")
    public boolean field2650;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "[Lfa;")
    public static class47[] field2624;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "[[S")
    public static short[][] field2625;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(I)V")
    public static void method922(int arg0) {
        field2627 = null;
        field2629 = null;
        field2630 = null;
        field2626 = null;
        field2625 = null;
        if (arg0 == 2) {
            field2624 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(IIII)I")
    public static final int method923(int arg0, int arg1, int arg2, int arg3) {
        field2628++;
        if (arg0 <= 101) {
            return 43;
        } else if ((class3.field104[arg1][arg2][arg3] & 0x8) == 0) {
            return arg1 <= 0 || (class3.field104[1][arg2][arg3] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(I)V")
    public static final void method924(int arg0) {
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
        System.exit(1);
        field2632++;
        if (arg0 != 20) {
            field2654 = 43;
        }
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(III)V")
    public class123(int arg0, int arg1, int arg2) {
        this.field2637 = arg2;
        this.field2656 = arg1;
        this.field2648 = this.field2641 = arg0;
    }
}
