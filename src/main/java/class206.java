import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class206 {

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "[[I")
    public int[][] field3716 = new int[6][258];

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "[I")
    public int[] field3724 = new int[16];

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "[Z")
    public boolean[] field3713 = new boolean[16];

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "[[I")
    public int[][] field3722 = new int[6][258];

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "[I")
    public int[] field3715 = new int[257];

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "[[I")
    public int[][] field3726 = new int[6][258];

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "[B")
    public byte[] field3734 = new byte[4096];

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "[[B")
    public byte[][] field3717 = new byte[6][258];

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "[I")
    public int[] field3729 = new int[6];

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "[B")
    public byte[] field3727 = new byte[18002];

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
    public int field3732 = 0;

    @OriginalMember(owner = "client!hb", name = "x", descriptor = "I")
    public int field3736 = 0;

    @OriginalMember(owner = "client!hb", name = "H", descriptor = "[Z")
    public boolean[] field3745 = new boolean[256];

    @OriginalMember(owner = "client!hb", name = "I", descriptor = "[B")
    public byte[] field3746 = new byte[256];

    @OriginalMember(owner = "client!hb", name = "N", descriptor = "[B")
    public byte[] field3751 = new byte[18002];

    @OriginalMember(owner = "client!hb", name = "y", descriptor = "[I")
    public int[] field3737 = new int[256];

    @OriginalMember(owner = "client!hb", name = "F", descriptor = "Luk;")
    public static class96 field3743 = new class96(64);

    @OriginalMember(owner = "client!hb", name = "K", descriptor = "Ljd;")
    public static class86 field3748 = class122.method868("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", true);

    @OriginalMember(owner = "client!hb", name = "O", descriptor = "Ljd;")
    public static class86 field3752 = class122.method868("Ladevorgang )2 bitte warten Sie)3", true);

    @OriginalMember(owner = "client!hb", name = "J", descriptor = "B")
    public byte field3747;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    public int field3719;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    public int field3720;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
    public int field3721;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    public int field3725;

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
    public int field3730;

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "I")
    public int field3731;

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
    public int field3733;

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "I")
    public int field3735;

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "I")
    public int field3738;

    @OriginalMember(owner = "client!hb", name = "A", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!hb", name = "B", descriptor = "I")
    public int field3740;

    @OriginalMember(owner = "client!hb", name = "C", descriptor = "I")
    public int field3741;

    @OriginalMember(owner = "client!hb", name = "D", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!hb", name = "G", descriptor = "I")
    public int field3744;

    @OriginalMember(owner = "client!hb", name = "M", descriptor = "I")
    public int field3750;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "[B")
    public byte[] field3714;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "[B")
    public byte[] field3718;

    @OriginalMember(owner = "client!hb", name = "L", descriptor = "[Lqc;")
    public static class62[] field3749;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "[Lod;")
    public static class90[] field3723;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)I")
    public static final int method1467(int arg0, int arg1) {
        if (arg1 < 125) {
            field3743 = null;
        }
        field3739++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public static void method1468(int arg0) {
        field3749 = null;
        if (arg0 != 6) {
            method1468(41);
        }
        field3723 = null;
        field3743 = null;
        field3748 = null;
        field3752 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)V")
    public static final void method1469(boolean arg0) {
        if (arg0) {
            method1470((byte) 112);
        }
        for (int var1 = 0; var1 < 5; var1++) {
            class25.field606[var1] = false;
        }
        class163.field3065 = -1;
        class152.field2874 = 1;
        class253.field4494 = -1;
        field3742++;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V")
    public static final void method1470(byte arg0) {
        class152.field2876 = new class252(32);
        if (arg0 == 43) {
            field3728++;
        }
    }
}
