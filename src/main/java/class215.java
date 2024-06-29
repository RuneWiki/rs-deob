import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class215 {

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "[Z")
    public boolean[] field3846 = new boolean[256];

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
    public int field3856 = 0;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "[I")
    public int[] field3852 = new int[16];

    @OriginalMember(owner = "client!pd", name = "B", descriptor = "[[B")
    public byte[][] field3865 = new byte[6][258];

    @OriginalMember(owner = "client!pd", name = "F", descriptor = "[[I")
    public int[][] field3869 = new int[6][258];

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "[B")
    public byte[] field3858 = new byte[18002];

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "[B")
    public byte[] field3842 = new byte[18002];

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "[I")
    public int[] field3855 = new int[257];

    @OriginalMember(owner = "client!pd", name = "I", descriptor = "I")
    public int field3872 = 0;

    @OriginalMember(owner = "client!pd", name = "A", descriptor = "[B")
    public byte[] field3864 = new byte[256];

    @OriginalMember(owner = "client!pd", name = "Q", descriptor = "[I")
    public int[] field3880 = new int[6];

    @OriginalMember(owner = "client!pd", name = "M", descriptor = "[I")
    public int[] field3876 = new int[256];

    @OriginalMember(owner = "client!pd", name = "C", descriptor = "[[I")
    public int[][] field3866 = new int[6][258];

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "[B")
    public byte[] field3861 = new byte[4096];

    @OriginalMember(owner = "client!pd", name = "P", descriptor = "[[I")
    public int[][] field3879 = new int[6][258];

    @OriginalMember(owner = "client!pd", name = "H", descriptor = "[Z")
    public boolean[] field3871 = new boolean[16];

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "Lba;")
    public static class93 field3853 = new class93(128);

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "Lqj;")
    public static class196 field3863 = class80.method502("Stufe)2", -48);

    @OriginalMember(owner = "client!pd", name = "y", descriptor = "[I")
    public static int[] field3862 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!pd", name = "L", descriptor = "Lqj;")
    private static class196 field3875 = class80.method502("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3", -48);

    @OriginalMember(owner = "client!pd", name = "N", descriptor = "I")
    public static int field3877 = -1;

    @OriginalMember(owner = "client!pd", name = "J", descriptor = "[I")
    public static int[] field3873 = new int[2000];

    @OriginalMember(owner = "client!pd", name = "D", descriptor = "I")
    public static int field3867 = 0;

    @OriginalMember(owner = "client!pd", name = "R", descriptor = "Lqj;")
    public static class196 field3881 = field3875;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "B")
    public byte field3843;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public int field3839;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public int field3840;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
    public int field3847;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
    public int field3848;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
    public int field3850;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
    public int field3851;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
    public int field3854;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "I")
    public int field3857;

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "I")
    public int field3859;

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "I")
    public int field3860;

    @OriginalMember(owner = "client!pd", name = "E", descriptor = "I")
    public int field3868;

    @OriginalMember(owner = "client!pd", name = "G", descriptor = "I")
    public int field3870;

    @OriginalMember(owner = "client!pd", name = "K", descriptor = "I")
    public int field3874;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "[B")
    public byte[] field3841;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "[B")
    public byte[] field3849;

    @OriginalMember(owner = "client!pd", name = "O", descriptor = "[I")
    public static int[] field3878;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)Z")
    public static final boolean method1477(int arg0) {
        field3845++;
        class154 var1 = class105.field1522;
        synchronized (class105.field1522) {
            if (class58.field794 == class173.field2913) {
                return false;
            } else {
                class18.field219 = class41.field466[class58.field794];
                class168.field2840 = class149.field2387[class58.field794];
                class58.field794 = class58.field794 + 1 & arg0;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V")
    public static void method1478(int arg0) {
        if (arg0 != 16) {
            return;
        }
        field3875 = null;
        field3873 = null;
        field3853 = null;
        field3878 = null;
        field3881 = null;
        field3862 = null;
        field3863 = null;
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)V")
    public static final void method1479(int arg0) {
        field3844++;
        class153.field2463.method1529(382);
        if (arg0 < 63) {
            field3877 = 99;
        }
    }
}
