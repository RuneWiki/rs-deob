import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class6 extends class103 {

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "I")
    public int field76;

    @OriginalMember(owner = "client!ch", name = "A", descriptor = "I")
    private int field87;

    @OriginalMember(owner = "client!ch", name = "C", descriptor = "[Z")
    public boolean[] field89;

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "[[I")
    public int[][] field78;

    @OriginalMember(owner = "client!ch", name = "z", descriptor = "[I")
    public int[] field86;

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "Lda;")
    public static class275 field77 = class255.method1672(115, "settings");

    @OriginalMember(owner = "client!ch", name = "u", descriptor = "Lda;")
    private static class275 field81 = class255.method1672(111, "Loaded textures");

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "Lda;")
    public static class275 field80 = field81;

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!ch", name = "v", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!ch", name = "w", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!ch", name = "x", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!ch", name = "D", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!ch", name = "y", descriptor = "Lma;")
    public static class105 field85;

    @OriginalMember(owner = "client!ch", name = "B", descriptor = "Lfd;")
    public static class229 field88;

    @OriginalMember(owner = "client!ch", name = "F", descriptor = "Lwg;")
    public static class238 field92;

    @OriginalMember(owner = "client!ch", name = "E", descriptor = "[I")
    public static int[] field91;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIII)I")
    public static final int method22(int arg0, int arg1, int arg2, int arg3) {
        field82++;
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg0;
        } else {
            if (arg3 != 0) {
                method22(-48, 80, -36, -88);
            }
            return var4 == 2 ? 7 - arg1 : -arg0 + 7;
        }
    }

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "(I)V")
    public static final void method23(int arg0) {
        class84.method544(true);
        field83++;
        class165.method1140(16580);
        class83.method542(-14957);
        class138.method996(1568091976);
        class215.method1388(31603);
        class211.method1357(22555);
        if (arg0 != 0) {
            return;
        }
        class221.method1418((byte) -108);
        class243.method1588(-570653488);
        class102.method730(16777215);
        class153.method1079((byte) -123);
        class94.method676((byte) 12);
        class219.method1403(9);
        class167.method1148(true);
        class12.method50(true);
        class122.field2193.method987((byte) -123);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IBLij;)Lda;")
    public static final class275 method24(int arg0, byte arg1, class85 arg2) {
        field79++;
        try {
            int var3 = -59 % ((-arg1 - 18) / 40);
            class275 var4 = new class275();
            var4.field4752 = arg2.method593((byte) -106);
            if (var4.field4752 > arg0) {
                var4.field4752 = arg0;
            }
            var4.field4749 = new byte[var4.field4752];
            arg2.field1392 += class31.field474.method683(arg2.field1392, var4.field4752, -17170, arg2.field1381, 0, var4.field4749);
            return var4;
        } catch (Exception var5) {
            return class60.field1011;
        }
    }

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "(I)V")
    public static void method25(int arg0) {
        field92 = null;
        field80 = null;
        field88 = null;
        field77 = null;
        field85 = null;
        if (arg0 == 13468) {
            field91 = null;
            field81 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "(I)V")
    public static final void method26(int arg0) {
        if (arg0 != -24135) {
            return;
        }
        field90++;
        if (!class63.field1051) {
            class52.field863 = 1;
            if (class145.field2546 != 0) {
                class161.field2826 = class174.field3016;
                class181.field3101 = class208.field3525;
            } else if (class87.field1475 == 0) {
                class181.field3101 = class44.field746;
                class161.field2826 = class213.field3617;
            } else {
                class181.field3101 = class162.field2834;
                class161.field2826 = class185.field3174;
            }
            class174.field3015[0] = class36.field596;
            class137.field2400[0] = 1006;
            class201.field3446[0] = class79.field1301;
        }
        if (class166.field2881 != -1) {
            class145.method1034((byte) -33, class166.field2881);
        }
        for (int var1 = 0; var1 < class123.field2203; var1++) {
            if (class200.field3418[var1]) {
                class100.field1691[var1] = true;
            }
            class65.field1065[var1] = class200.field3418[var1];
            class200.field3418[var1] = false;
        }
        class174.field3020 = -1;
        class255.field4501 = null;
        class271.field4710 = -1;
        class5.field71 = class35.field576;
        if (class166.field2881 != -1) {
            class123.field2203 = 0;
            class82.method536(0, class166.field2881, class212.field3587, class249.field4391, 0, -1, (byte) -28, 0, 0);
        }
        class47.method293();
        class159.method1111(arg0 ^ 0x5E1E);
        if (class63.field1051) {
            class81.method532(true);
        } else if (class174.field3020 != -1) {
            class73.method474(class271.field4710, -121, class174.field3020);
        }
        if (class124.field2222 == 3) {
            for (int var2 = 0; var2 < class123.field2203; var2++) {
                if (class65.field1065[var2]) {
                    class47.method283(class114.field2015[var2], class38.field627[var2], class114.field2021[var2], class211.field3571[var2], 16711935, 128);
                } else if (class100.field1691[var2]) {
                    class47.method283(class114.field2015[var2], class38.field627[var2], class114.field2021[var2], class211.field3571[var2], 16711680, 128);
                }
            }
        }
        class180.method1207(class66.field1094.field1758, class159.field2790, class66.field1094.field1770, -16777216, class105.field1829);
        class105.field1829 = 0;
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(I[B)V")
    public class6(int arg0, byte[] arg1) {
        this.field76 = arg0;
        class85 var3 = new class85(arg1);
        this.field87 = var3.method564((byte) 98);
        this.field89 = new boolean[this.field87];
        this.field78 = new int[this.field87][];
        this.field86 = new int[this.field87];
        for (int var4 = 0; var4 < this.field87; var4++) {
            this.field86[var4] = var3.method564((byte) 68);
        }
        for (int var5 = 0; var5 < this.field87; var5++) {
            this.field89[var5] = var3.method564((byte) 95) == 1;
        }
        for (int var6 = 0; var6 < this.field87; var6++) {
            this.field78[var6] = new int[var3.method564((byte) 63)];
        }
        for (int var7 = 0; var7 < this.field87; var7++) {
            for (int var8 = 0; var8 < this.field78[var7].length; var8++) {
                this.field78[var7][var8] = var3.method564((byte) 105);
            }
        }
    }
}
