import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class51 {

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "[B")
    public byte[] field812 = new byte[256];

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public int field813 = 0;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "[B")
    public byte[] field811 = new byte[18002];

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "[Z")
    public boolean[] field825 = new boolean[16];

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "[Z")
    public boolean[] field821 = new boolean[256];

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "[I")
    public int[] field833 = new int[256];

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "[I")
    public int[] field824 = new int[6];

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "[I")
    public int[] field808 = new int[257];

    @OriginalMember(owner = "client!fc", name = "E", descriptor = "[[B")
    public byte[][] field837 = new byte[6][258];

    @OriginalMember(owner = "client!fc", name = "J", descriptor = "[I")
    public int[] field841 = new int[16];

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "[[I")
    public int[][] field830 = new int[6][258];

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "[[I")
    public int[][] field829 = new int[6][258];

    @OriginalMember(owner = "client!fc", name = "H", descriptor = "[[I")
    public int[][] field839 = new int[6][258];

    @OriginalMember(owner = "client!fc", name = "I", descriptor = "I")
    public int field840 = 0;

    @OriginalMember(owner = "client!fc", name = "Q", descriptor = "[B")
    public byte[] field848 = new byte[18002];

    @OriginalMember(owner = "client!fc", name = "F", descriptor = "[B")
    public byte[] field838 = new byte[4096];

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "Lkb;")
    public static class93 field807 = class76.method390("Verbindung konnte nicht hergestellt werden)3", 0);

    @OriginalMember(owner = "client!fc", name = "L", descriptor = "Lkb;")
    private static class93 field843 = class76.method390(" seconds)3", 0);

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "Lkb;")
    public static class93 field809 = field843;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "Lkb;")
    private static class93 field810 = class76.method390("This world is full)3", 0);

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "Lkb;")
    public static class93 field820 = field810;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "Lnb;")
    public static class120 field826 = new class120(64);

    @OriginalMember(owner = "client!fc", name = "D", descriptor = "B")
    public byte field836;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public int field815;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public int field817;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
    public int field818;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
    public int field819;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
    public int field822;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "I")
    public int field823;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
    public int field827;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "I")
    public int field831;

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "I")
    public int field832;

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "I")
    public int field834;

    @OriginalMember(owner = "client!fc", name = "C", descriptor = "I")
    public int field835;

    @OriginalMember(owner = "client!fc", name = "K", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!fc", name = "M", descriptor = "I")
    public int field844;

    @OriginalMember(owner = "client!fc", name = "N", descriptor = "I")
    public int field845;

    @OriginalMember(owner = "client!fc", name = "R", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "[B")
    public byte[] field816;

    @OriginalMember(owner = "client!fc", name = "P", descriptor = "[B")
    public byte[] field847;

    @OriginalMember(owner = "client!fc", name = "O", descriptor = "[I")
    public static int[] field846;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)Lhb;")
    public static final class67 method266(int arg0) {
        int var1 = -14 / ((-arg0 - 46) / 62);
        field814++;
        if (class116.field2178 == null) {
            class116.field2178 = new class67();
        }
        return class116.field2178;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
    public static void method267(int arg0) {
        field810 = null;
        if (arg0 != 4096) {
            field826 = null;
        }
        field846 = null;
        field843 = null;
        field809 = null;
        field807 = null;
        field820 = null;
        field826 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)I")
    public static final int method268(byte arg0) {
        if (arg0 != 72) {
            field826 = null;
        }
        field842++;
        return class65.field1059++;
    }
}
