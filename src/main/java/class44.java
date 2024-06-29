import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class44 {

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "[[I")
    private int[][] field830;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    private int field835;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    private int field839;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "Ltg;")
    public static class184 field834 = class135.method812("titlebutton", 3);

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "Ltg;")
    public static class184 field837 = class135.method812("mapflag", 3);

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "Ltg;")
    public static class184 field841 = class135.method812("Sprites geladen)3", 3);

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "Ltg;")
    private static class184 field832 = class135.method812("Type", 3);

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "Ltg;")
    public static class184 field846 = field832;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "Lh;")
    public static class69 field842 = new class69();

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "I")
    public static int field849 = 1;

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "Ltg;")
    private static class184 field851 = class135.method812("RuneScape is loading )2 please wait)3)3)3", 3);

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "Ltg;")
    public static class184 field848 = field851;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "Lrh;")
    public static class167 field845;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)I")
    public final int method252(int arg0, int arg1) {
        field838++;
        int var3 = 122 % ((arg0 - 47) / 46);
        if (this.field830 != null) {
            arg1 = (int) ((long) this.field839 * (long) arg1 / (long) this.field835) + 6;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIILrh;)V")
    public static final void method253(int arg0, int arg1, int arg2, class167 arg3) {
        field850++;
        if (class101.field1870 != 0 && class101.field1870 != 3) {
            return;
        }
        int var4 = arg0 - arg3.field3089 / 2;
        int var5 = arg2 - arg3.field3045 / 2;
        int var6 = class38.field716 + class2.field39 & 0x7FF;
        int var7 = class23.field422[var6];
        int var8 = (class182.field3491 + 256) * var7 >> 8;
        int var9 = class23.field434[var6];
        int var10 = (class182.field3491 + 256) * var9 >> 8;
        int var11 = var4 * var10 - var5 * var8 >> 11;
        int var12 = var4 * var8 + var5 * var10 >> 11;
        int var13 = class46.field872.field635 + var12 >> 7;
        if (arg1 != 13557) {
            field841 = null;
        }
        int var14 = class46.field872.field614 - var11 >> 7;
        boolean var15 = class157.method952(19661184, true, 0, 0, 1, 0, class46.field872.field644[0], var13, class46.field872.field615[0], var14, 0, 0);
        if (!var15) {
            return;
        }
        class117.field2122.method583((byte) 14, var5);
        class117.field2122.method583((byte) 14, var4);
        class117.field2122.method589((byte) -85, class38.field716);
        class117.field2122.method583((byte) 14, 57);
        class117.field2122.method583((byte) 14, class2.field39);
        class117.field2122.method583((byte) 14, class182.field3491);
        class117.field2122.method583((byte) 14, 89);
        class117.field2122.method589((byte) -89, class46.field872.field635);
        class117.field2122.method589((byte) -82, class46.field872.field614);
        class117.field2122.method583((byte) 14, class40.field753);
        class117.field2122.method583((byte) 14, 63);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lde;IB)V")
    public static final void method254(class35 arg0, int arg1, byte arg2) {
        class46.method267(arg0.field635, arg1, -1, arg0.field614);
        if (arg2 == -50) {
            field840++;
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)Lrh;")
    public static final class167 method255(int arg0, int arg1) {
        int var2 = arg0 >> 16;
        field829++;
        int var3 = arg0 & 0xFFFF;
        if (class149.field2670[var2] == null || class149.field2670[var2][var3] == null) {
            boolean var4 = class164.method982(22401, var2);
            if (!var4) {
                return null;
            }
        }
        if (arg1 != 10583) {
            field842 = null;
        }
        return class149.field2670[var2][var3];
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZ)I")
    public final int method256(int arg0, boolean arg1) {
        if (this.field830 != null) {
            arg0 = (int) ((long) this.field839 * (long) arg0 / (long) this.field835);
        }
        field843++;
        return arg1 ? arg0 : -26;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I[B)[B")
    public final byte[] method257(int arg0, byte[] arg1) {
        field836++;
        if (this.field830 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field839 / (long) this.field835) + 14;
            int var4 = 0;
            int var5 = 0;
            int[] var6 = new int[var3];
            for (int var7 = 0; var7 < arg1.length; var7++) {
                int[] var10 = this.field830[var4];
                byte var11 = arg1[var7];
                for (int var12 = 0; var12 < 14; var12++) {
                    var6[var5 + var12] += var10[var12] * var11;
                }
                int var13 = this.field839 + var4;
                int var14 = var13 / this.field835;
                var4 = var13 - this.field835 * var14;
                var5 += var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var6[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 > 127) {
                    arg1[var8] = 127;
                } else {
                    arg1[var8] = (byte) var9;
                }
            }
        }
        if (arg0 != 3751) {
            this.method256(-84, true);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(II)I")
    public static final int method258(int arg0, int arg1) {
        field833++;
        if (arg1 != 2165) {
            method259((byte) 63);
        }
        return arg0 >> 17 & 0x7;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
    public static void method259(byte arg0) {
        field834 = null;
        int var1 = 32 / ((-arg0 - 78) / 41);
        field845 = null;
        field848 = null;
        field846 = null;
        field841 = null;
        field842 = null;
        field832 = null;
        field837 = null;
        field851 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public static final void method260(int arg0) {
        Object var1 = class186.field3590;
        synchronized (class186.field3590) {
            if (~class13.field242 == arg0) {
                class98.field1841.method903(5, arg0 ^ 0x6D, new class117());
            }
            class13.field242 = 600;
        }
        field844++;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(II)V")
    public class44(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class85.method502(arg0, -115, arg1);
            int var4 = arg0 / var3;
            this.field830 = new int[var4][14];
            this.field835 = var4;
            int var5 = arg1 / var3;
            this.field839 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field830[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                double var10 = (double) var5 / (double) var4;
                int var12 = (int) Math.floor(var8 + 1.0D - 7.0D);
                int var13 = (int) Math.ceil(var8 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                if (var12 < 0) {
                    var12 = 0;
                }
                while (var12 < var13) {
                    double var14 = ((double) var12 - var8) * 3.141592653589793D;
                    double var16 = var10;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var10 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var12 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var12] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var12++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I[SI[Ltg;I)V")
    public static final void method261(int arg0, short[] arg1, int arg2, class184[] arg3, int arg4) {
        int var5 = -76 % ((arg0 - 45) / 45);
        if (arg4 > arg2) {
            int var6 = (arg2 + arg4) / 2;
            int var7 = arg2;
            class184 var8 = arg3[var6];
            arg3[var6] = arg3[arg4];
            arg3[arg4] = var8;
            short var9 = arg1[var6];
            arg1[var6] = arg1[arg4];
            arg1[arg4] = var9;
            for (int var10 = arg2; var10 < arg4; var10++) {
                if (var8 == null || arg3[var10] != null && (var10 & 0x1) > arg3[var10].method1166(-5153, var8)) {
                    class184 var11 = arg3[var10];
                    arg3[var10] = arg3[var7];
                    arg3[var7] = var11;
                    short var12 = arg1[var10];
                    arg1[var10] = arg1[var7];
                    arg1[var7++] = var12;
                }
            }
            arg3[arg4] = arg3[var7];
            arg3[var7] = var8;
            arg1[arg4] = arg1[var7];
            arg1[var7] = var9;
            method261(112, arg1, arg2, arg3, var7 - 1);
            method261(114, arg1, var7 + 1, arg3, arg4);
        }
        field831++;
    }
}
