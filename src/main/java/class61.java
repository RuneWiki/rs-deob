import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class61 extends class130 {

    @OriginalMember(owner = "client!id", name = "C", descriptor = "[Leb;")
    public class200[] field823 = new class200[5];

    @OriginalMember(owner = "client!id", name = "K", descriptor = "I")
    public int field831 = 0;

    @OriginalMember(owner = "client!id", name = "z", descriptor = "[I")
    public int[] field820 = new int[5];

    @OriginalMember(owner = "client!id", name = "F", descriptor = "I")
    public int field826;

    @OriginalMember(owner = "client!id", name = "V", descriptor = "I")
    public int field842;

    @OriginalMember(owner = "client!id", name = "B", descriptor = "I")
    public int field822;

    @OriginalMember(owner = "client!id", name = "O", descriptor = "I")
    public int field835;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "I")
    public static int field812 = 0;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "I")
    public static int field814 = 4;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "[[Lia;")
    public static class175[][] field811 = new class175[field814][500];

    @OriginalMember(owner = "client!id", name = "s", descriptor = "[I")
    public static int[] field813 = new int[field814];

    @OriginalMember(owner = "client!id", name = "N", descriptor = "[J")
    public static long[] field834 = new long[100];

    @OriginalMember(owner = "client!id", name = "R", descriptor = "Z")
    public static boolean field838 = false;

    @OriginalMember(owner = "client!id", name = "u", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!id", name = "w", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!id", name = "y", descriptor = "I")
    public int field819;

    @OriginalMember(owner = "client!id", name = "D", descriptor = "I")
    public int field824;

    @OriginalMember(owner = "client!id", name = "E", descriptor = "I")
    public int field825;

    @OriginalMember(owner = "client!id", name = "P", descriptor = "I")
    public int field836;

    @OriginalMember(owner = "client!id", name = "T", descriptor = "I")
    public int field840;

    @OriginalMember(owner = "client!id", name = "U", descriptor = "I")
    public int field841;

    @OriginalMember(owner = "client!id", name = "x", descriptor = "Lca;")
    public class116 field818;

    @OriginalMember(owner = "client!id", name = "M", descriptor = "Lqi;")
    public class129 field833;

    @OriginalMember(owner = "client!id", name = "G", descriptor = "Leg;")
    public class140 field827;

    @OriginalMember(owner = "client!id", name = "S", descriptor = "Lhh;")
    public class159 field839;

    @OriginalMember(owner = "client!id", name = "I", descriptor = "Lg;")
    public class221 field829;

    @OriginalMember(owner = "client!id", name = "A", descriptor = "Lid;")
    public class61 field821;

    @OriginalMember(owner = "client!id", name = "J", descriptor = "Lni;")
    public class7 field830;

    @OriginalMember(owner = "client!id", name = "H", descriptor = "Z")
    public boolean field828;

    @OriginalMember(owner = "client!id", name = "L", descriptor = "Z")
    public boolean field832;

    @OriginalMember(owner = "client!id", name = "Q", descriptor = "Z")
    public boolean field837;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
    public static void method387(int arg0) {
        field834 = null;
        field813 = null;
        if (arg0 == 4) {
            field811 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(III)V")
    public class61(int arg0, int arg1, int arg2) {
        this.field842 = this.field826 = arg0;
        this.field822 = arg2;
        this.field835 = arg1;
    }
}
