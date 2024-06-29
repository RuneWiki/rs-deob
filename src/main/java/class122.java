import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class122 extends class67 {

    @OriginalMember(owner = "client!uc", name = "pb", descriptor = "I")
    private int field2877 = 0;

    @OriginalMember(owner = "client!uc", name = "bb", descriptor = "Lgd;")
    public static class40 field2863 = class14.method90(false, "Untersuchen");

    @OriginalMember(owner = "client!uc", name = "Z", descriptor = "Lgd;")
    public static class40 field2861 = class14.method90(false, "m-Ochte sich mit Ihnen duellieren)3");

    @OriginalMember(owner = "client!uc", name = "jb", descriptor = "Z")
    public static boolean field2871 = false;

    @OriginalMember(owner = "client!uc", name = "mb", descriptor = "Lgd;")
    public static class40 field2874 = class14.method90(false, "Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

    @OriginalMember(owner = "client!uc", name = "ab", descriptor = "Lgd;")
    public static class40 field2862 = class14.method90(false, "backhmid2");

    @OriginalMember(owner = "client!uc", name = "nb", descriptor = "[[I")
    public static int[][] field2875 = new int[5][5000];

    @OriginalMember(owner = "client!uc", name = "db", descriptor = "Lgd;")
    public static class40 field2865 = class14.method90(false, "scrollbar");

    @OriginalMember(owner = "client!uc", name = "sb", descriptor = "Z")
    public static boolean field2880 = false;

    @OriginalMember(owner = "client!uc", name = "tb", descriptor = "I")
    public static int field2881 = 2;

    @OriginalMember(owner = "client!uc", name = "eb", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!uc", name = "fb", descriptor = "I")
    public int field2867;

    @OriginalMember(owner = "client!uc", name = "gb", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!uc", name = "hb", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!uc", name = "ib", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!uc", name = "kb", descriptor = "I")
    public int field2872;

    @OriginalMember(owner = "client!uc", name = "lb", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!uc", name = "ob", descriptor = "I")
    public int field2876;

    @OriginalMember(owner = "client!uc", name = "qb", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!uc", name = "rb", descriptor = "I")
    public int field2879;

    @OriginalMember(owner = "client!uc", name = "ub", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!uc", name = "cb", descriptor = "Lmb;")
    public static class73 field2864;

    @OriginalMember(owner = "client!uc", name = "Y", descriptor = "[I")
    public static int[] field2860;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "(I)[Lhd;", line = 3)
    public static final class46[] method931(int arg0) {
        int var1 = -37 / ((arg0 - 55) / 49);
        class46[] var2 = new class46[class29.field629];
        for (int var3 = 0; var3 < class29.field629; var3++) {
            class46 var4 = var2[var3] = new class46();
            var4.field1168 = class99.field2355;
            var4.field1165 = class16.field424;
            var4.field1163 = field2860[var3];
            var4.field1166 = class120.field2842[var3];
            var4.field1169 = class134.field3271[var3];
            var4.field1164 = class30.field754[var3];
            int var5 = var4.field1169 * var4.field1164;
            byte[] var6 = class129.field3086[var3];
            var4.field1167 = new int[var5];
            for (int var7 = 0; var7 < var5; var7++) {
                var4.field1167[var7] = class96.field2229[class101.method709(255, var6[var7])];
            }
        }
        class107.method825(-13254);
        field2882++;
        return var2;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lrc;II)V", line = 62)
    public final void method932(class104 arg0, int arg1, int arg2) {
        field2878++;
        if (arg2 <= 83) {
            return;
        }
        while (true) {
            int var4 = arg0.method798((byte) -81);
            if (var4 == 0) {
                return;
            }
            this.method938(var4, arg1, 1, arg0);
        }
    }

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "(I)V", line = 83)
    public final void method933(int arg0) {
        this.method936((byte) -38, this.field2877);
        field2870++;
        if (arg0 != -18888) {
            this.field2876 = -31;
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(Z)V", line = 101)
    public static void method934(boolean arg0) {
        field2875 = null;
        field2865 = null;
        field2861 = null;
        field2864 = null;
        field2863 = null;
        field2860 = null;
        field2862 = null;
        if (!arg0) {
            field2874 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIB)I", line = 121)
    public static final int method935(int arg0, int arg1, byte arg2) {
        field2866++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg0 < 0) {
                arg0 = 0;
            } else if (arg0 > 127) {
                arg0 = 127;
            }
            return 127 - arg0;
        } else {
            int var4 = (arg1 & 0x7F) * arg0 / 128;
            if (var4 < 2) {
                var4 = 2;
            } else if (var4 > 126) {
                var4 = 126;
            }
            if (arg2 <= 89) {
                field2864 = null;
            }
            return (arg1 & 0xFF80) + var4;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)V", line = 164)
    private final void method936(byte arg0, int arg1) {
        field2873++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        if (arg0 != -38) {
            this.method932(null, 46, -8);
        }
        double var7 = var3;
        double var9 = (double) (arg1 & 0xFF) / 256.0D;
        double var11 = var3;
        double var13 = 0.0D;
        if (var5 < var3) {
            var7 = var5;
        }
        if (var7 > var9) {
            var7 = var9;
        }
        if (var3 < var5) {
            var11 = var5;
        }
        double var15 = 0.0D;
        if (var11 < var9) {
            var11 = var9;
        }
        double var17 = (var7 + var11) / 2.0D;
        this.field2879 = (int) (var17 * 256.0D);
        if (var7 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var7) / (var7 + var11);
            }
            if (var3 == var11) {
                var13 = (var5 - var9) / (-var7 + var11);
            } else if (var5 == var11) {
                var13 = (var9 - var3) / (-var7 + var11) + 2.0D;
            } else if (var9 == var11) {
                var13 = (var3 - var5) / (var11 - var7) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var7) / (2.0D - var11 - var7);
            }
        }
        if (var17 > 0.5D) {
            this.field2872 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field2872 = (int) (var15 * var17 * 512.0D);
        }
        double var19 = var13 / 6.0D;
        this.field2867 = (int) (var15 * 256.0D);
        if (this.field2872 < 1) {
            this.field2872 = 1;
        }
        if (this.field2879 < 0) {
            this.field2879 = 0;
        } else if (this.field2879 > 255) {
            this.field2879 = 255;
        }
        if (this.field2867 < 0) {
            this.field2867 = 0;
        } else if (this.field2867 > 255) {
            this.field2867 = 255;
        }
        this.field2876 = (int) ((double) this.field2872 * var19);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B[Lgd;)[Lgd;", line = 255)
    public static final class40[] method937(byte arg0, class40[] arg1) {
        field2868++;
        class40[] var2 = new class40[5];
        if (arg0 < 33) {
            return null;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = client.method114(true, new class40[] { class21.method121(23444, var3), class10.field257 });
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = client.method114(true, new class40[] { var2[var3], arg1[var3] });
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIILrc;)V", line = 287)
    private final void method938(int arg0, int arg1, int arg2, class104 arg3) {
        if (arg0 == arg2) {
            this.field2877 = arg3.method770(arg2 - 9410);
        }
        field2869++;
    }
}
