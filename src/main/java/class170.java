import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class170 {

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "[[I")
    public int[][] field2699 = new int[6][258];

    @OriginalMember(owner = "client!ew", name = "i", descriptor = "[B")
    public byte[] field2706 = new byte[18002];

    @OriginalMember(owner = "client!ew", name = "l", descriptor = "[B")
    public byte[] field2709 = new byte[256];

    @OriginalMember(owner = "client!ew", name = "n", descriptor = "[B")
    public byte[] field2711 = new byte[18002];

    @OriginalMember(owner = "client!ew", name = "o", descriptor = "[B")
    public byte[] field2712 = new byte[4096];

    @OriginalMember(owner = "client!ew", name = "s", descriptor = "I")
    public int field2716 = 0;

    @OriginalMember(owner = "client!ew", name = "t", descriptor = "[[B")
    public byte[][] field2717 = new byte[6][258];

    @OriginalMember(owner = "client!ew", name = "x", descriptor = "[Z")
    public boolean[] field2721 = new boolean[16];

    @OriginalMember(owner = "client!ew", name = "f", descriptor = "[I")
    public int[] field2703 = new int[256];

    @OriginalMember(owner = "client!ew", name = "A", descriptor = "[[I")
    public int[][] field2724 = new int[6][258];

    @OriginalMember(owner = "client!ew", name = "B", descriptor = "I")
    public int field2725 = 0;

    @OriginalMember(owner = "client!ew", name = "z", descriptor = "[Z")
    public boolean[] field2723 = new boolean[256];

    @OriginalMember(owner = "client!ew", name = "G", descriptor = "[I")
    public int[] field2730 = new int[6];

    @OriginalMember(owner = "client!ew", name = "q", descriptor = "[I")
    public int[] field2714 = new int[257];

    @OriginalMember(owner = "client!ew", name = "v", descriptor = "[[I")
    public int[][] field2719 = new int[6][258];

    @OriginalMember(owner = "client!ew", name = "I", descriptor = "[I")
    public int[] field2732 = new int[16];

    @OriginalMember(owner = "client!ew", name = "g", descriptor = "[Lko;")
    public static class227[] field2704 = new class227[4];

    @OriginalMember(owner = "client!ew", name = "H", descriptor = "Llo;")
    public static class306 field2731 = new class306("glow1:", "leuchten1:", "brillant1:", "brilho1:");

    @OriginalMember(owner = "client!ew", name = "J", descriptor = "Lnk;")
    public static class326 field2733 = new class326(58, 11);

    @OriginalMember(owner = "client!ew", name = "y", descriptor = "B")
    public byte field2722;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "I")
    public int field2698;

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "I")
    public int field2700;

    @OriginalMember(owner = "client!ew", name = "e", descriptor = "I")
    public int field2702;

    @OriginalMember(owner = "client!ew", name = "h", descriptor = "I")
    public int field2705;

    @OriginalMember(owner = "client!ew", name = "j", descriptor = "I")
    public int field2707;

    @OriginalMember(owner = "client!ew", name = "k", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!ew", name = "m", descriptor = "I")
    public int field2710;

    @OriginalMember(owner = "client!ew", name = "p", descriptor = "I")
    public int field2713;

    @OriginalMember(owner = "client!ew", name = "r", descriptor = "I")
    public int field2715;

    @OriginalMember(owner = "client!ew", name = "u", descriptor = "I")
    public int field2718;

    @OriginalMember(owner = "client!ew", name = "w", descriptor = "I")
    public int field2720;

    @OriginalMember(owner = "client!ew", name = "D", descriptor = "I")
    public int field2727;

    @OriginalMember(owner = "client!ew", name = "E", descriptor = "I")
    public int field2728;

    @OriginalMember(owner = "client!ew", name = "F", descriptor = "I")
    public int field2729;

    @OriginalMember(owner = "client!ew", name = "d", descriptor = "[B")
    public byte[] field2701;

    @OriginalMember(owner = "client!ew", name = "C", descriptor = "[B")
    public byte[] field2726;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)V", line = 27)
    public static final void method1155(int arg0) {
        field2708++;
        if (class337.field5291) {
            return;
        }
        class299.field4804 = true;
        if (class510.field7403.field5116) {
            class509.field7395 = ((int) class509.field7395 - 17 & 0xFFFFFFF0);
        } else {
            class380.field5886 += (-12.0F - class380.field5886) / 2.0F;
        }
        if (arg0 != 58) {
            field2733 = null;
        }
        class337.field5291 = true;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(Z)V", line = 84)
    public static void method1156(boolean arg0) {
        field2704 = null;
        field2733 = null;
        if (!arg0) {
            field2731 = null;
        }
    }
}
