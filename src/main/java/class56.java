import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class56 extends class52 {

    @OriginalMember(owner = "client!gk", name = "s", descriptor = "Z")
    public boolean field819 = false;

    @OriginalMember(owner = "client!gk", name = "T", descriptor = "I")
    public int field846 = 0;

    @OriginalMember(owner = "client!gk", name = "J", descriptor = "I")
    private int field836 = 0;

    @OriginalMember(owner = "client!gk", name = "gb", descriptor = "B")
    private byte field859 = 0;

    @OriginalMember(owner = "client!gk", name = "E", descriptor = "I")
    private int field831 = 0;

    @OriginalMember(owner = "client!gk", name = "lb", descriptor = "I")
    private int field864 = 0;

    @OriginalMember(owner = "client!gk", name = "mb", descriptor = "B")
    private byte field865 = 0;

    @OriginalMember(owner = "client!gk", name = "ab", descriptor = "[I")
    private int[] field853;

    @OriginalMember(owner = "client!gk", name = "R", descriptor = "[I")
    public int[] field844;

    @OriginalMember(owner = "client!gk", name = "eb", descriptor = "[I")
    public int[] field857;

    @OriginalMember(owner = "client!gk", name = "P", descriptor = "[I")
    public int[] field842;

    @OriginalMember(owner = "client!gk", name = "w", descriptor = "[I")
    private int[] field823;

    @OriginalMember(owner = "client!gk", name = "L", descriptor = "[S")
    private short[] field838;

    @OriginalMember(owner = "client!gk", name = "Y", descriptor = "[Lwb;")
    public class287[] field851;

    @OriginalMember(owner = "client!gk", name = "z", descriptor = "[Lgo;")
    public class31[] field826;

    @OriginalMember(owner = "client!gk", name = "A", descriptor = "[S")
    private short[] field827;

    @OriginalMember(owner = "client!gk", name = "cb", descriptor = "[S")
    private short[] field855;

    @OriginalMember(owner = "client!gk", name = "M", descriptor = "[S")
    private short[] field839;

    @OriginalMember(owner = "client!gk", name = "B", descriptor = "[S")
    private short[] field828;

    @OriginalMember(owner = "client!gk", name = "C", descriptor = "[F")
    private float[] field829;

    @OriginalMember(owner = "client!gk", name = "u", descriptor = "[F")
    private float[] field821;

    @OriginalMember(owner = "client!gk", name = "Z", descriptor = "[S")
    private short[] field852;

    @OriginalMember(owner = "client!gk", name = "D", descriptor = "[B")
    private byte[] field830;

    @OriginalMember(owner = "client!gk", name = "U", descriptor = "[S")
    private short[] field847;

    @OriginalMember(owner = "client!gk", name = "ib", descriptor = "[S")
    private short[] field861;

    @OriginalMember(owner = "client!gk", name = "N", descriptor = "[S")
    private short[] field840;

    @OriginalMember(owner = "client!gk", name = "t", descriptor = "[S")
    private short[] field820;

    @OriginalMember(owner = "client!gk", name = "V", descriptor = "[B")
    private byte[] field848;

    @OriginalMember(owner = "client!gk", name = "y", descriptor = "[S")
    private short[] field825;

    @OriginalMember(owner = "client!gk", name = "H", descriptor = "Lhl;")
    public class92 field834;

    @OriginalMember(owner = "client!gk", name = "K", descriptor = "Lun;")
    public class131 field837;

    @OriginalMember(owner = "client!gk", name = "kb", descriptor = "Lun;")
    private class131 field863;

    @OriginalMember(owner = "client!gk", name = "G", descriptor = "Lun;")
    private class131 field833;

    @OriginalMember(owner = "client!gk", name = "W", descriptor = "Lun;")
    private class131 field849;

    @OriginalMember(owner = "client!gk", name = "S", descriptor = "Lun;")
    private class131 field845;

    @OriginalMember(owner = "client!gk", name = "Q", descriptor = "S")
    private short field843;

    @OriginalMember(owner = "client!gk", name = "x", descriptor = "S")
    private short field824;

    @OriginalMember(owner = "client!gk", name = "hb", descriptor = "[S")
    private short[] field860;

    @OriginalMember(owner = "client!gk", name = "X", descriptor = "[I")
    private int[] field850;

    @OriginalMember(owner = "client!gk", name = "F", descriptor = "Lug;")
    private static class25 field832 = new class25(10000);

    @OriginalMember(owner = "client!gk", name = "fb", descriptor = "Lgk;")
    private static class56 field858 = new class56();

    @OriginalMember(owner = "client!gk", name = "nb", descriptor = "Lgk;")
    private static class56 field866 = new class56();

    @OriginalMember(owner = "client!gk", name = "ob", descriptor = "Lgk;")
    private static class56 field867 = new class56();

    @OriginalMember(owner = "client!gk", name = "pb", descriptor = "Lgk;")
    private static class56 field868 = new class56();

    @OriginalMember(owner = "client!gk", name = "qb", descriptor = "Lgk;")
    private static class56 field869 = new class56();

    @OriginalMember(owner = "client!gk", name = "rb", descriptor = "Lgk;")
    private static class56 field870 = new class56();

    @OriginalMember(owner = "client!gk", name = "zb", descriptor = "Z")
    private static boolean field878 = false;

    @OriginalMember(owner = "client!gk", name = "Cb", descriptor = "[I")
    private static int[] field881 = new int[1];

    @OriginalMember(owner = "client!gk", name = "vb", descriptor = "[I")
    private static int[] field874 = new int[1];

    @OriginalMember(owner = "client!gk", name = "sb", descriptor = "F")
    private static float field871;

    @OriginalMember(owner = "client!gk", name = "tb", descriptor = "F")
    private static float field872;

    @OriginalMember(owner = "client!gk", name = "ub", descriptor = "F")
    private static float field873;

    @OriginalMember(owner = "client!gk", name = "wb", descriptor = "F")
    private static float field875;

    @OriginalMember(owner = "client!gk", name = "Ab", descriptor = "F")
    private static float field879;

    @OriginalMember(owner = "client!gk", name = "Bb", descriptor = "F")
    private static float field880;

    @OriginalMember(owner = "client!gk", name = "xb", descriptor = "I")
    private static int field876;

    @OriginalMember(owner = "client!gk", name = "yb", descriptor = "I")
    private static int field877;

    @OriginalMember(owner = "client!gk", name = "Db", descriptor = "I")
    private static int field882;

    @OriginalMember(owner = "client!gk", name = "v", descriptor = "Lbk;")
    private class136 field822;

    @OriginalMember(owner = "client!gk", name = "db", descriptor = "Lib;")
    private class35 field856;

    @OriginalMember(owner = "client!gk", name = "jb", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field862;

    @OriginalMember(owner = "client!gk", name = "I", descriptor = "[J")
    private static long[] field835;

    @OriginalMember(owner = "client!gk", name = "O", descriptor = "[[I")
    private int[][] field841;

    @OriginalMember(owner = "client!gk", name = "bb", descriptor = "[[I")
    private int[][] field854;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIFFF)[F", line = 7)
    private static final float[] method535(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        float[] var7 = new float[9];
        float var8 = 1.0F;
        float var9 = 0.0F;
        float var10 = (float) arg1 / 32767.0F;
        float var11 = -((float) Math.sqrt((double) (1.0F - var10 * var10)));
        float var12 = 1.0F - var10;
        float var13 = (float) Math.sqrt((double) (arg0 * arg0 + arg2 * arg2));
        if (var13 != 0.0F) {
            var8 = (float) (-arg2) / var13;
            var9 = (float) arg0 / var13;
        }
        var7[0] = var8 * var8 * var12 + var10;
        var7[1] = var9 * var11;
        var7[2] = var8 * var9 * var12;
        var7[3] = -var9 * var11;
        var7[4] = var10;
        var7[5] = var8 * var11;
        var7[6] = var8 * var9 * var12;
        var7[7] = -var8 * var11;
        var7[8] = var9 * var9 * var12 + var10;
        float[] var14 = new float[9];
        float var15 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
        float var16 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
        float var17 = 1.0F - var15;
        var14[0] = var15;
        var14[1] = 0.0F;
        var14[2] = var16;
        var14[3] = 0.0F;
        var14[4] = 1.0F;
        var14[5] = 0.0F;
        var14[6] = -var16;
        var14[7] = 0.0F;
        var14[8] = var15;
        float[] var18 = new float[] { var7[6] * var14[2] + var7[0] * var14[0] + var7[3] * var14[1], var7[7] * var14[2] + var7[1] * var14[0] + var7[4] * var14[1], var7[8] * var14[2] + var7[2] * var14[0] + var7[5] * var14[1], var7[6] * var14[5] + var7[0] * var14[3] + var7[3] * var14[4], var7[7] * var14[5] + var7[1] * var14[3] + var7[4] * var14[4], var7[8] * var14[5] + var7[2] * var14[3] + var7[5] * var14[4], var7[6] * var14[8] + var7[0] * var14[6] + var7[3] * var14[7], var7[7] * var14[8] + var7[1] * var14[6] + var7[4] * var14[7], var7[8] * var14[8] + var7[2] * var14[6] + var7[5] * var14[7] };
        var18[0] *= arg4;
        var18[1] *= arg4;
        var18[2] *= arg4;
        var18[3] *= arg5;
        var18[4] *= arg5;
        var18[5] *= arg5;
        var18[6] *= arg6;
        var18[7] *= arg6;
        var18[8] *= arg6;
        return var18;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZZZLgk;Lgk;)Lhm;", line = 73)
    private final class52 method536(boolean arg0, boolean arg1, boolean arg2, class56 arg3, class56 arg4) {
        arg3.field846 = this.field846;
        arg3.field836 = this.field836;
        arg3.field864 = this.field864;
        arg3.field831 = this.field831;
        arg3.field843 = this.field843;
        arg3.field824 = this.field824;
        arg3.field865 = (byte) ((arg0 && arg1 ? 0 : 2) | 0x1 | (arg2 ? 0 : 4));
        if (arg3.field844 == null || arg3.field844.length < this.field846) {
            arg3.field844 = new int[this.field846 + 100];
            arg3.field857 = new int[this.field846 + 100];
            arg3.field842 = new int[this.field846 + 100];
        }
        for (int var6 = 0; var6 < this.field846; var6++) {
            arg3.field844[var6] = this.field844[var6];
            arg3.field857[var6] = this.field857[var6];
            arg3.field842[var6] = this.field842[var6];
        }
        if (arg3.field837 == null) {
            arg3.field837 = new class131();
        }
        arg3.field837.field2213 = false;
        if (arg3.field834 == null) {
            arg3.field834 = new class92();
        }
        arg3.field834.field1396 = false;
        if (arg0) {
            arg3.field830 = this.field830;
        } else {
            if (arg4.field830 == null || arg4.field830.length < this.field831) {
                arg4.field830 = new byte[this.field831 + 100];
            }
            arg3.field830 = arg4.field830;
            for (int var7 = 0; var7 < this.field831; var7++) {
                arg3.field830[var7] = this.field830[var7];
            }
        }
        if (arg1) {
            arg3.field852 = this.field852;
        } else {
            if (arg4.field852 == null || arg4.field852.length < this.field831) {
                arg4.field852 = new short[this.field831 + 100];
            }
            arg3.field852 = arg4.field852;
            for (int var8 = 0; var8 < this.field831; var8++) {
                arg3.field852[var8] = this.field852[var8];
            }
        }
        if (arg0 && arg1) {
            arg3.field863 = this.field863;
        } else {
            if (arg4.field863 == null) {
                arg4.field863 = new class131();
            }
            arg3.field863 = arg4.field863;
            arg3.field863.field2213 = false;
        }
        if (arg2 || this.field827 == null) {
            arg3.field827 = this.field827;
            arg3.field855 = this.field855;
            arg3.field839 = this.field839;
            arg3.field828 = this.field828;
            arg3.field833 = this.field833;
        } else {
            if (arg4.field827 == null || arg4.field827.length < this.field864) {
                arg4.field827 = new short[this.field864 + 100];
                arg4.field855 = new short[this.field864 + 100];
                arg4.field839 = new short[this.field864 + 100];
                arg4.field828 = new short[this.field864 + 100];
            }
            arg3.field827 = arg4.field827;
            arg3.field855 = arg4.field855;
            arg3.field839 = arg4.field839;
            arg3.field828 = arg4.field828;
            for (int var9 = 0; var9 < this.field864; var9++) {
                arg3.field827[var9] = this.field827[var9];
                arg3.field855[var9] = this.field855[var9];
                arg3.field839[var9] = this.field839[var9];
                arg3.field828[var9] = this.field828[var9];
            }
            if (class59.field927) {
                if (arg4.field833 == null) {
                    arg4.field833 = new class131();
                }
                arg3.field833 = arg4.field833;
                arg3.field833.field2213 = false;
            } else {
                arg3.field833 = null;
            }
        }
        arg3.field829 = this.field829;
        arg3.field821 = this.field821;
        arg3.field823 = this.field823;
        arg3.field841 = this.field841;
        arg3.field847 = this.field847;
        arg3.field861 = this.field861;
        arg3.field840 = this.field840;
        arg3.field820 = this.field820;
        arg3.field848 = this.field848;
        arg3.field854 = this.field854;
        arg3.field849 = this.field849;
        arg3.field845 = this.field845;
        arg3.field850 = this.field850;
        arg3.field860 = this.field860;
        arg3.field853 = this.field853;
        arg3.field800 = this.field800;
        arg3.field838 = this.field838;
        arg3.field825 = this.field825;
        arg3.field851 = this.field851;
        arg3.field826 = this.field826;
        return arg3;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZZZZZZZZZZZ)Lgk;", line = 230)
    public final class56 method537(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9, boolean arg10) {
        class56 var12 = new class56();
        var12.field846 = this.field846;
        var12.field836 = this.field836;
        var12.field864 = this.field864;
        var12.field831 = this.field831;
        if (arg0) {
            var12.field844 = this.field844;
            var12.field842 = this.field842;
        } else {
            var12.field844 = class270.method1983(this.field844, -1);
            var12.field842 = class270.method1983(this.field842, -1);
        }
        if (arg1) {
            var12.field857 = this.field857;
        } else {
            var12.field857 = class270.method1983(this.field857, -1);
        }
        if (arg0 && arg1) {
            var12.field837 = this.field837;
            var12.field834 = this.field834;
        } else {
            var12.field837 = new class131();
            var12.field834 = new class92();
        }
        if (arg2) {
            var12.field852 = this.field852;
        } else {
            var12.field852 = class150.method1248(3, this.field852);
        }
        if (arg3) {
            var12.field830 = this.field830;
        } else {
            var12.field830 = class112.method963(this.field830, 8);
        }
        if (!arg2 || !arg3 || !arg4 || (!arg7 || !arg5) && !class59.field927) {
            var12.field863 = new class131();
        } else {
            var12.field863 = this.field863;
        }
        if (arg5) {
            var12.field827 = this.field827;
            var12.field855 = this.field855;
            var12.field839 = this.field839;
            var12.field828 = this.field828;
        } else {
            var12.field827 = class150.method1248(3, this.field827);
            var12.field855 = class150.method1248(3, this.field855);
            var12.field839 = class150.method1248(3, this.field839);
            var12.field828 = class150.method1248(3, this.field828);
        }
        if (!class59.field927) {
            var12.field833 = null;
        } else if (arg5 && arg6 && arg7) {
            var12.field833 = this.field833;
        } else {
            var12.field833 = new class131();
        }
        if (arg8) {
            var12.field829 = this.field829;
            var12.field821 = this.field821;
            var12.field849 = this.field849;
        } else {
            var12.field829 = class202.method1510(0, this.field829);
            var12.field821 = class202.method1510(0, this.field821);
            var12.field849 = new class131();
        }
        if (arg9) {
            var12.field847 = this.field847;
            var12.field861 = this.field861;
            var12.field840 = this.field840;
            var12.field845 = this.field845;
        } else {
            var12.field847 = class150.method1248(3, this.field847);
            var12.field861 = class150.method1248(3, this.field861);
            var12.field840 = class150.method1248(3, this.field840);
            var12.field845 = new class131();
        }
        if (arg10) {
            var12.field820 = this.field820;
        } else {
            var12.field820 = class150.method1248(3, this.field820);
        }
        var12.field823 = this.field823;
        var12.field841 = this.field841;
        var12.field848 = this.field848;
        var12.field854 = this.field854;
        var12.field850 = this.field850;
        var12.field860 = this.field860;
        var12.field853 = this.field853;
        var12.field843 = this.field843;
        var12.field824 = this.field824;
        var12.field851 = this.field851;
        var12.field826 = this.field826;
        var12.field838 = this.field838;
        var12.field825 = this.field825;
        return var12;
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "()V", line = 4315)
    private class56() {
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Ld;IIZ)V", line = 4317)
    public class56(class40 arg0, int arg1, int arg2, boolean arg3) {
        int[] var5 = new int[arg0.field609];
        this.field853 = new int[arg0.field600 + 1];
        for (int var6 = 0; var6 < arg0.field609; var6++) {
            if ((arg0.field639 == null || arg0.field639[var6] != 2) && (arg0.field642 == null || arg0.field642[var6] == -1 || !class107.field1619.method759(82, arg0.field642[var6] & 0xFFFF))) {
                var5[this.field831++] = var6;
                this.field853[arg0.field648[var6]]++;
                this.field853[arg0.field633[var6]]++;
                this.field853[arg0.field625[var6]]++;
            }
        }
        long[] var7 = new long[this.field831];
        for (int var8 = 0; var8 < this.field831; var8++) {
            int var9 = var5[var8];
            int var10 = 0;
            byte var11 = 0;
            int var12 = 0;
            int var13 = 0;
            short var14 = -1;
            if (arg0.field642 != null) {
                var14 = arg0.field642[var9];
                if (var14 != -1) {
                    var12 = class107.field1619.method755(false, var14 & 0xFFFF);
                    var13 = class107.field1619.method757((byte) -28, var14 & 0xFFFF);
                }
            }
            boolean var15 = arg0.field601 != null && arg0.field601[var9] != 0 || var14 != -1 && !class107.field1619.method764(var14 & 0xFFFF, (byte) 63);
            if ((arg3 || var15) && arg0.field628 != null) {
                var10 += arg0.field628[var9] << 17;
            }
            if (var15) {
                var10 += 65536;
            }
            int var16 = ((var12 & 0xFF) << 8) + var10;
            int var17 = (var13 & 0xFF) + var16;
            int var18 = ((var14 & 0xFFFF) << 16) + var11;
            int var19 = (var8 & 0xFFFF) + var18;
            var7[var8] = ((long) var17 << 32) + (long) var19;
        }
        class150.method1250(var5, -82, var7);
        this.field846 = arg0.field600;
        this.field836 = arg0.field650;
        this.field844 = arg0.field605;
        this.field857 = arg0.field637;
        this.field842 = arg0.field619;
        this.field823 = arg0.field643;
        this.field838 = arg0.field634;
        this.field851 = arg0.field644;
        this.field826 = arg0.field623;
        int var20 = this.field831 * 3;
        this.field827 = new short[var20];
        this.field855 = new short[var20];
        this.field839 = new short[var20];
        this.field828 = new short[var20];
        this.field829 = new float[var20];
        this.field821 = new float[var20];
        this.field852 = new short[this.field831];
        this.field830 = new byte[this.field831];
        this.field847 = new short[this.field831];
        this.field861 = new short[this.field831];
        this.field840 = new short[this.field831];
        this.field820 = new short[this.field831];
        if (arg0.field611 != null) {
            this.field848 = new byte[this.field831];
        }
        if (arg0.field620 != null) {
            this.field825 = new short[this.field831];
        }
        this.field834 = new class92();
        this.field837 = new class131();
        this.field863 = new class131();
        if (class59.field927) {
            this.field833 = new class131();
        }
        this.field849 = new class131();
        this.field845 = new class131();
        this.field843 = (short) arg1;
        this.field824 = (short) arg2;
        this.field860 = new short[var20];
        field835 = new long[var20];
        int var21 = 0;
        for (int var22 = 0; var22 < this.field836; var22++) {
            int var23 = this.field853[var22];
            this.field853[var22] = var21;
            var21 += var23;
        }
        this.field853[this.field836] = var21;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = (float[][]) null;
        if (arg0.field598 != null) {
            int var28 = arg0.field616;
            int[] var29 = new int[var28];
            int[] var30 = new int[var28];
            int[] var31 = new int[var28];
            int[] var32 = new int[var28];
            int[] var33 = new int[var28];
            int[] var34 = new int[var28];
            for (int var35 = 0; var35 < var28; var35++) {
                var29[var35] = Integer.MAX_VALUE;
                var30[var35] = -2147483647;
                var31[var35] = Integer.MAX_VALUE;
                var32[var35] = -2147483647;
                var33[var35] = Integer.MAX_VALUE;
                var34[var35] = -2147483647;
            }
            for (int var36 = 0; var36 < this.field831; var36++) {
                int var37 = var5[var36];
                if (arg0.field598[var37] != -1) {
                    int var38 = arg0.field598[var37] & 0xFF;
                    for (int var39 = 0; var39 < 3; var39++) {
                        int var40;
                        if (var39 == 0) {
                            var40 = arg0.field648[var37];
                        } else if (var39 == 1) {
                            var40 = arg0.field633[var37];
                        } else {
                            var40 = arg0.field625[var37];
                        }
                        int var41 = arg0.field605[var40];
                        int var42 = arg0.field637[var40];
                        int var43 = arg0.field619[var40];
                        if (var41 < var29[var38]) {
                            var29[var38] = var41;
                        }
                        if (var41 > var30[var38]) {
                            var30[var38] = var41;
                        }
                        if (var42 < var31[var38]) {
                            var31[var38] = var42;
                        }
                        if (var42 > var32[var38]) {
                            var32[var38] = var42;
                        }
                        if (var43 < var33[var38]) {
                            var33[var38] = var43;
                        }
                        if (var43 > var34[var38]) {
                            var34[var38] = var43;
                        }
                    }
                }
            }
            var24 = new int[var28];
            var25 = new int[var28];
            var26 = new int[var28];
            var27 = new float[var28][];
            for (int var44 = 0; var44 < var28; var44++) {
                byte var45 = arg0.field624[var44];
                if (var45 > 0) {
                    var24[var44] = (var29[var44] + var30[var44]) / 2;
                    var25[var44] = (var31[var44] + var32[var44]) / 2;
                    var26[var44] = (var33[var44] + var34[var44]) / 2;
                    float var47;
                    float var48;
                    float var49;
                    if (var45 == 1) {
                        short var46 = arg0.field631[var44];
                        if (var46 == 0) {
                            var47 = 1.0F;
                            var48 = 1.0F;
                        } else if (var46 > 0) {
                            var47 = 1.0F;
                            var48 = (float) var46 / 1024.0F;
                        } else {
                            var48 = 1.0F;
                            var47 = (float) (-var46) / 1024.0F;
                        }
                        var49 = 64.0F / (float) (arg0.field618[var44] & 0xFFFF);
                    } else if (var45 == 2) {
                        var47 = 64.0F / (float) (arg0.field631[var44] & 0xFFFF);
                        var49 = 64.0F / (float) (arg0.field618[var44] & 0xFFFF);
                        var48 = 64.0F / (float) (arg0.field647[var44] & 0xFFFF);
                    } else {
                        var47 = (float) arg0.field631[var44] / 1024.0F;
                        var49 = (float) arg0.field618[var44] / 1024.0F;
                        var48 = (float) arg0.field647[var44] / 1024.0F;
                    }
                    var27[var44] = method535(arg0.field630[var44], arg0.field602[var44], arg0.field621[var44], arg0.field610[var44] & 0xFF, var47, var49, var48);
                }
            }
        }
        for (int var50 = 0; var50 < this.field831; var50++) {
            int var51 = var5[var50];
            int var52 = arg0.field615[var51] & 0xFFFF;
            short var53;
            if (arg0.field642 == null) {
                var53 = -1;
            } else {
                var53 = arg0.field642[var51];
            }
            int var54;
            if (arg0.field598 == null) {
                var54 = -1;
            } else {
                var54 = arg0.field598[var51];
            }
            int var55;
            if (arg0.field601 == null) {
                var55 = 0;
            } else {
                var55 = arg0.field601[var51] & 0xFF;
            }
            float var56 = 0.0F;
            float var57 = 0.0F;
            float var58 = 0.0F;
            float var59 = 0.0F;
            float var60 = 0.0F;
            float var61 = 0.0F;
            byte var62 = 0;
            byte var63 = 0;
            int var64 = 0;
            if (var53 != -1) {
                if (var54 == -1) {
                    var56 = 0.0F;
                    var57 = 1.0F;
                    var58 = 1.0F;
                    var59 = 1.0F;
                    var62 = 1;
                    var60 = 0.0F;
                    var61 = 0.0F;
                    var63 = 2;
                } else {
                    var54 &= 0xFF;
                    byte var65 = arg0.field624[var54];
                    if (var65 == 0) {
                        int var66 = arg0.field648[var51];
                        int var67 = arg0.field633[var51];
                        int var68 = arg0.field625[var51];
                        short var69 = arg0.field630[var54];
                        short var70 = arg0.field602[var54];
                        short var71 = arg0.field621[var54];
                        float var72 = (float) arg0.field605[var69];
                        float var73 = (float) arg0.field637[var69];
                        float var74 = (float) arg0.field619[var69];
                        float var75 = (float) arg0.field605[var70] - var72;
                        float var76 = (float) arg0.field637[var70] - var73;
                        float var77 = (float) arg0.field619[var70] - var74;
                        float var78 = (float) arg0.field605[var71] - var72;
                        float var79 = (float) arg0.field637[var71] - var73;
                        float var80 = (float) arg0.field619[var71] - var74;
                        float var81 = (float) arg0.field605[var66] - var72;
                        float var82 = (float) arg0.field637[var66] - var73;
                        float var83 = (float) arg0.field619[var66] - var74;
                        float var84 = (float) arg0.field605[var67] - var72;
                        float var85 = (float) arg0.field637[var67] - var73;
                        float var86 = (float) arg0.field619[var67] - var74;
                        float var87 = (float) arg0.field605[var68] - var72;
                        float var88 = (float) arg0.field637[var68] - var73;
                        float var89 = (float) arg0.field619[var68] - var74;
                        float var90 = var76 * var80 - var77 * var79;
                        float var91 = var77 * var78 - var75 * var80;
                        float var92 = var75 * var79 - var76 * var78;
                        float var93 = var79 * var92 - var80 * var91;
                        float var94 = var80 * var90 - var78 * var92;
                        float var95 = var78 * var91 - var79 * var90;
                        float var96 = 1.0F / (var77 * var95 + var75 * var93 + var76 * var94);
                        var56 = (var83 * var95 + var81 * var93 + var82 * var94) * var96;
                        var58 = (var86 * var95 + var84 * var93 + var85 * var94) * var96;
                        var60 = (var89 * var95 + var87 * var93 + var88 * var94) * var96;
                        float var97 = var76 * var92 - var77 * var91;
                        float var98 = var77 * var90 - var75 * var92;
                        float var99 = var75 * var91 - var76 * var90;
                        float var100 = 1.0F / (var80 * var99 + var78 * var97 + var79 * var98);
                        var57 = (var83 * var99 + var81 * var97 + var82 * var98) * var100;
                        var59 = (var86 * var99 + var84 * var97 + var85 * var98) * var100;
                        var61 = (var89 * var99 + var87 * var97 + var88 * var98) * var100;
                    } else {
                        int var101 = arg0.field648[var51];
                        int var102 = arg0.field633[var51];
                        int var103 = arg0.field625[var51];
                        int var104 = var24[var54];
                        int var105 = var25[var54];
                        int var106 = var26[var54];
                        float[] var107 = var27[var54];
                        byte var108 = arg0.field635[var54];
                        float var109 = (float) arg0.field604[var54] / 256.0F;
                        if (var65 == 1) {
                            float var110 = (float) (arg0.field647[var54] & 0xFFFF) / 1024.0F;
                            method554(arg0.field605[var101], arg0.field637[var101], arg0.field619[var101], var104, var105, var106, var107, var110, var108, var109);
                            var56 = field873;
                            var57 = field872;
                            method554(arg0.field605[var102], arg0.field637[var102], arg0.field619[var102], var104, var105, var106, var107, var110, var108, var109);
                            var58 = field873;
                            var59 = field872;
                            method554(arg0.field605[var103], arg0.field637[var103], arg0.field619[var103], var104, var105, var106, var107, var110, var108, var109);
                            var60 = field873;
                            var61 = field872;
                            float var111 = var110 / 2.0F;
                            if ((var108 & 0x1) == 0) {
                                if (var58 - var56 > var111) {
                                    var58 -= var110;
                                    var62 = 1;
                                } else if (var56 - var58 > var111) {
                                    var58 += var110;
                                    var62 = 2;
                                }
                                if (var60 - var56 > var111) {
                                    var60 -= var110;
                                    var63 = 1;
                                } else if (var56 - var60 > var111) {
                                    var60 += var110;
                                    var63 = 2;
                                }
                            } else {
                                if (var59 - var57 > var111) {
                                    var59 -= var110;
                                    var62 = 1;
                                } else if (var57 - var59 > var111) {
                                    var59 += var110;
                                    var62 = 2;
                                }
                                if (var61 - var57 > var111) {
                                    var61 -= var110;
                                    var63 = 1;
                                } else if (var57 - var61 > var111) {
                                    var61 += var110;
                                    var63 = 2;
                                }
                            }
                        } else if (var65 == 2) {
                            float var112 = (float) arg0.field640[var54] / 256.0F;
                            float var113 = (float) arg0.field629[var54] / 256.0F;
                            int var114 = arg0.field605[var102] - arg0.field605[var101];
                            int var115 = arg0.field637[var102] - arg0.field637[var101];
                            int var116 = arg0.field619[var102] - arg0.field619[var101];
                            int var117 = arg0.field605[var103] - arg0.field605[var101];
                            int var118 = arg0.field637[var103] - arg0.field637[var101];
                            int var119 = arg0.field619[var103] - arg0.field619[var101];
                            int var120 = var115 * var119 - var116 * var118;
                            int var121 = var116 * var117 - var114 * var119;
                            int var122 = var114 * var118 - var115 * var117;
                            float var123 = 64.0F / (float) (arg0.field631[var54] & 0xFFFF);
                            float var124 = 64.0F / (float) (arg0.field618[var54] & 0xFFFF);
                            float var125 = 64.0F / (float) (arg0.field647[var54] & 0xFFFF);
                            float var126 = (var107[2] * (float) var122 + var107[0] * (float) var120 + var107[1] * (float) var121) / var123;
                            float var127 = (var107[5] * (float) var122 + var107[3] * (float) var120 + var107[4] * (float) var121) / var124;
                            float var128 = (var107[8] * (float) var122 + var107[6] * (float) var120 + var107[7] * (float) var121) / var125;
                            var64 = method556(var126, var127, var128);
                            method557(arg0.field605[var101], arg0.field637[var101], arg0.field619[var101], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var56 = field871;
                            var57 = field879;
                            method557(arg0.field605[var102], arg0.field637[var102], arg0.field619[var102], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var58 = field871;
                            var59 = field879;
                            method557(arg0.field605[var103], arg0.field637[var103], arg0.field619[var103], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var60 = field871;
                            var61 = field879;
                        } else if (var65 == 3) {
                            method565(arg0.field605[var101], arg0.field637[var101], arg0.field619[var101], var104, var105, var106, var107, var108, var109);
                            var56 = field880;
                            var57 = field875;
                            method565(arg0.field605[var102], arg0.field637[var102], arg0.field619[var102], var104, var105, var106, var107, var108, var109);
                            var58 = field880;
                            var59 = field875;
                            method565(arg0.field605[var103], arg0.field637[var103], arg0.field619[var103], var104, var105, var106, var107, var108, var109);
                            var60 = field880;
                            var61 = field875;
                            if ((var108 & 0x1) == 0) {
                                if (var58 - var56 > 0.5F) {
                                    var58--;
                                    var62 = 1;
                                } else if (var56 - var58 > 0.5F) {
                                    var58++;
                                    var62 = 2;
                                }
                                if (var60 - var56 > 0.5F) {
                                    var60--;
                                    var63 = 1;
                                } else if (var56 - var60 > 0.5F) {
                                    var60++;
                                    var63 = 2;
                                }
                            } else {
                                if (var59 - var57 > 0.5F) {
                                    var59--;
                                    var62 = 1;
                                } else if (var57 - var59 > 0.5F) {
                                    var59++;
                                    var62 = 2;
                                }
                                if (var61 - var57 > 0.5F) {
                                    var61--;
                                    var63 = 1;
                                } else if (var57 - var61 > 0.5F) {
                                    var61++;
                                    var63 = 2;
                                }
                            }
                        }
                    }
                }
            }
            arg0.method416();
            byte var129;
            if (arg0.field639 == null) {
                var129 = 0;
            } else {
                var129 = arg0.field639[var51];
            }
            if (var129 == 0) {
                long var130 = ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32) + (long) (var54 << 2);
                int var132 = arg0.field648[var51];
                class134 var133 = arg0.field607[var132];
                this.field847[var50] = this.method541(arg0, var132, var130, var133.field2242, var133.field2243, var133.field2236, var133.field2237, var56, var57);
                int var134 = arg0.field633[var51];
                class134 var135 = arg0.field607[var134];
                this.field861[var50] = this.method541(arg0, var134, (long) var62 + var130, var135.field2242, var135.field2243, var135.field2236, var135.field2237, var58, var59);
                int var136 = arg0.field625[var51];
                class134 var137 = arg0.field607[var136];
                this.field840[var50] = this.method541(arg0, var136, (long) var63 + var130, var137.field2242, var137.field2243, var137.field2236, var137.field2237, var60, var61);
            } else if (var129 == 1) {
                class42 var138 = arg0.field617[var51];
                long var139 = (long) ((var54 << 2) + (var138.field667 > 0 ? 1024 : 2048) + (var138.field676 + 256 << 12) + (var138.field670 + 256 << 22)) + ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32);
                this.field847[var50] = this.method541(arg0, arg0.field648[var51], var139, var138.field667, var138.field676, var138.field670, 0, var56, var57);
                this.field861[var50] = this.method541(arg0, arg0.field633[var51], (long) var62 + var139, var138.field667, var138.field676, var138.field670, 0, var58, var59);
                this.field840[var50] = this.method541(arg0, arg0.field625[var51], (long) var63 + var139, var138.field667, var138.field676, var138.field670, 0, var60, var61);
            }
            if (arg0.field642 == null) {
                this.field820[var50] = -1;
            } else {
                this.field820[var50] = arg0.field642[var51];
            }
            if (this.field848 != null) {
                this.field848[var50] = (byte) arg0.field611[var51];
            }
            this.field852[var50] = arg0.field615[var51];
            if (arg0.field601 != null) {
                this.field830[var50] = arg0.field601[var51];
            }
            if (arg0.field620 != null) {
                this.field825[var50] = arg0.field620[var51];
            }
        }
        int var141 = 0;
        short var142 = -10000;
        for (int var143 = 0; var143 < this.field831; var143++) {
            short var144 = this.field820[var143];
            if (var142 != var144) {
                var141++;
                var142 = var144;
            }
        }
        this.field850 = new int[var141 + 1];
        int var145 = 0;
        short var146 = -10000;
        for (int var147 = 0; var147 < this.field831; var147++) {
            short var148 = this.field820[var147];
            if (var146 != var148) {
                this.field850[var145++] = var147;
                var146 = var148;
            }
        }
        this.field850[var145] = this.field831;
        field835 = null;
        this.field827 = method566(this.field827, this.field864);
        this.field855 = method566(this.field855, this.field864);
        this.field839 = method566(this.field839, this.field864);
        this.field828 = method566(this.field828, this.field864);
        this.field829 = method562(this.field829, this.field864);
        this.field821 = method562(this.field821, this.field864);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)Lqf;", line = 377)
    public final class64 method400(int arg0, int arg1, int arg2) {
        this.field819 = false;
        if (this.field822 != null) {
            this.field827 = this.field822.field2262;
            this.field855 = this.field822.field2265;
            this.field839 = this.field822.field2264;
            this.field828 = this.field822.field2263;
            this.field822 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "(I)V", line = 391)
    public final void method538(int arg0) {
        this.field824 = (short) arg0;
        if (this.field833 != null) {
            this.field833.field2213 = false;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lkk;)Lkk;", line = 397)
    public final class77 method539(class77 arg0) {
        if (this.field864 == 0) {
            return null;
        }
        if (!this.field834.field1396) {
            this.method551();
        }
        int var2;
        int var3;
        if (class103.field1539 > 0) {
            var2 = this.field834.field1394 - (class103.field1539 * this.field834.field1398 >> 8) >> 3;
            var3 = this.field834.field1393 - (class103.field1539 * this.field834.field1395 >> 8) >> 3;
        } else {
            var2 = this.field834.field1394 - (class103.field1539 * this.field834.field1395 >> 8) >> 3;
            var3 = this.field834.field1393 - (class103.field1539 * this.field834.field1398 >> 8) >> 3;
        }
        int var4;
        int var5;
        if (class103.field1546 > 0) {
            var4 = this.field834.field1397 - (class103.field1546 * this.field834.field1398 >> 8) >> 3;
            var5 = this.field834.field1400 - (class103.field1546 * this.field834.field1395 >> 8) >> 3;
        } else {
            var4 = this.field834.field1397 - (class103.field1546 * this.field834.field1395 >> 8) >> 3;
            var5 = this.field834.field1400 - (class103.field1546 * this.field834.field1398 >> 8) >> 3;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class77 var8;
        if (arg0 == null || arg0.field1124.length < var6 * var7) {
            var8 = new class77(var6, var7, 0);
        } else {
            var8 = arg0;
            arg0.field3832 = arg0.field3827 = var6;
            arg0.field3825 = arg0.field3826 = var7;
            arg0.method716();
        }
        var8.field3831 = var2;
        var8.field3828 = var4;
        if (field874.length < this.field864) {
            field874 = new int[this.field864];
            field881 = new int[this.field864];
        }
        for (int var9 = 0; var9 < this.field836; var9++) {
            int var10 = (this.field844[var9] - (this.field857[var9] * class103.field1539 >> 8) >> 3) - var2;
            int var11 = (this.field842[var9] - (this.field857[var9] * class103.field1546 >> 8) >> 3) - var4;
            int var12 = this.field853[var9];
            int var13 = this.field853[var9 + 1];
            for (int var14 = var12; var14 < var13; var14++) {
                int var15 = this.field860[var14] - 1;
                if (var15 == -1) {
                    break;
                }
                field874[var15] = var10;
                field881[var15] = var11;
            }
        }
        for (int var16 = 0; var16 < this.field831; var16++) {
            if (this.field830[var16] <= 128) {
                short var17 = this.field847[var16];
                short var18 = this.field861[var16];
                short var19 = this.field840[var16];
                int var20 = field874[var17];
                int var21 = field874[var18];
                int var22 = field874[var19];
                int var23 = field881[var17];
                int var24 = field881[var18];
                int var25 = field881[var19];
                if ((var20 - var21) * (var24 - var25) - (var22 - var21) * (var24 - var23) > 0) {
                    class107.method937(var8.field1124, var23, var24, var25, var20, var21, var22, var6);
                }
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "()V", line = 522)
    public final void method501() {
        for (int var1 = 0; var1 < this.field846; var1++) {
            int var2 = this.field844[var1];
            this.field844[var1] = this.field842[var1];
            this.field842[var1] = -var2;
        }
        this.field834.field1396 = false;
        this.field837.field2213 = false;
    }

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "()V", line = 538)
    public final void method540() {
        if (this.field827 == null) {
            this.method501();
            return;
        }
        for (int var1 = 0; var1 < this.field846; var1++) {
            int var2 = this.field844[var1];
            this.field844[var1] = this.field842[var1];
            this.field842[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field864; var3++) {
            short var4 = this.field827[var3];
            this.field827[var3] = this.field839[var3];
            this.field839[var3] = (short) (-var4);
        }
        this.field834.field1396 = false;
        this.field837.field2213 = false;
        if (this.field833 != null) {
            this.field833.field2213 = false;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ld;IJIIIIFF)S", line = 576)
    private final short method541(class40 arg0, int arg1, long arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8) {
        int var11 = this.field853[arg1];
        int var12 = this.field853[arg1 + 1];
        int var13 = 0;
        for (int var14 = var11; var14 < var12; var14++) {
            short var15 = this.field860[var14];
            if (var15 == 0) {
                var13 = var14;
                break;
            }
            if (field835[var14] == arg2) {
                return (short) (var15 - 1);
            }
        }
        this.field860[var13] = (short) (this.field864 + 1);
        field835[var13] = arg2;
        this.field827[this.field864] = (short) arg3;
        this.field855[this.field864] = (short) arg4;
        this.field839[this.field864] = (short) arg5;
        this.field828[this.field864] = (short) arg6;
        this.field829[this.field864] = arg7;
        this.field821[this.field864] = arg8;
        return (short) (this.field864++);
    }

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "()V", line = 612)
    private final void method542() {
        GL var1 = class240.field3771;
        if (this.field831 == 0) {
            return;
        }
        if (this.field865 != 0) {
            this.method563(true, !this.field837.field2213 && (this.field865 & 0x1) != 0, !this.field863.field2213 && (this.field865 & 0x2) != 0, this.field833 != null && !this.field833.field2213 && (this.field865 & 0x4) != 0, false);
        }
        this.method563(false, !this.field837.field2213, !this.field863.field2213, this.field833 != null && !this.field833.field2213, !this.field849.field2213);
        if (!this.field845.field2213) {
            this.method553();
        }
        if (this.field859 != 0) {
            if ((this.field859 & 0x1) != 0) {
                this.field844 = null;
                this.field857 = null;
                this.field842 = null;
                this.field860 = null;
                this.field853 = null;
            }
            if ((this.field859 & 0x2) != 0) {
                this.field852 = null;
                this.field830 = null;
            }
            if ((this.field859 & 0x4) != 0) {
                this.field827 = null;
                this.field855 = null;
                this.field839 = null;
                this.field828 = null;
            }
            if ((this.field859 & 0x8) != 0) {
                this.field829 = null;
                this.field821 = null;
            }
            if ((this.field859 & 0x10) != 0) {
                this.field847 = null;
                this.field861 = null;
                this.field840 = null;
            }
            this.field859 = 0;
        }
        class35 var2 = null;
        if (this.field837.field2218 != null) {
            this.field837.field2218.method358();
            var2 = this.field837.field2218;
            var1.glVertexPointer(3, 5126, this.field837.field2214, (long) this.field837.field2221);
        }
        if (this.field863.field2218 != null) {
            if (this.field863.field2218 != var2) {
                this.field863.field2218.method358();
                var2 = this.field863.field2218;
            }
            var1.glColorPointer(4, 5121, this.field863.field2214, (long) this.field863.field2221);
        }
        if (class59.field927 && this.field833.field2218 != null) {
            if (this.field833.field2218 != var2) {
                this.field833.field2218.method358();
                var2 = this.field833.field2218;
            }
            var1.glNormalPointer(5126, this.field833.field2214, (long) this.field833.field2221);
        }
        if (this.field849.field2218 != null) {
            if (this.field849.field2218 != var2) {
                this.field849.field2218.method358();
                class35 var3 = this.field849.field2218;
            }
            var1.glTexCoordPointer(2, 5126, this.field849.field2214, (long) this.field849.field2221);
        }
        if (this.field845.field2218 != null) {
            this.field845.field2218.method360();
        }
        if (this.field837.field2218 == null || this.field863.field2218 == null || class59.field927 && this.field833.field2218 == null || this.field849.field2218 == null) {
            if (class240.field3764) {
                var1.glBindBufferARB(34962, 0);
            }
            if (this.field837.field2218 == null) {
                this.field837.field2222.position(this.field837.field2221);
                var1.glVertexPointer(3, 5126, this.field837.field2214, this.field837.field2222);
            }
            if (this.field863.field2218 == null) {
                this.field863.field2222.position(this.field863.field2221);
                var1.glColorPointer(4, 5121, this.field863.field2214, this.field863.field2222);
            }
            if (class59.field927 && this.field833.field2218 == null) {
                this.field833.field2222.position(this.field833.field2221);
                var1.glNormalPointer(5126, this.field833.field2214, this.field833.field2222);
            }
            if (this.field849.field2218 == null) {
                this.field849.field2222.position(this.field849.field2221);
                var1.glTexCoordPointer(2, 5126, this.field849.field2214, this.field849.field2222);
            }
        }
        if (this.field845.field2218 == null && class240.field3764) {
            var1.glBindBufferARB(34963, 0);
        }
        int var4 = this.field850.length - 1;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = this.field850[var5];
            int var7 = this.field850[var5 + 1];
            short var8 = this.field820[var6];
            if (var8 == -1) {
                class240.method1786(-1);
                class211.method1562(0, 0, -86);
            } else {
                class107.field1619.method756(var8 & 0xFFFF, true);
            }
            if (this.field845.field2218 == null) {
                this.field845.field2222.position(var6 * 12);
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, this.field845.field2222);
            } else {
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, (long) (var6 * 12));
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIIIII)Z", line = 783)
    private final boolean method543(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else {
            return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZZZZZZZ)V", line = 798)
    public final void method544(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        if (this.field865 != 0) {
            throw new IllegalArgumentException();
        } else if (this.field864 != 0) {
            if (arg6) {
                boolean var8 = !this.field863.field2213 && (arg1 || arg2 && !class59.field927);
                this.method563(false, !this.field837.field2213 && arg0, var8, this.field833 != null && !this.field833.field2213 && arg2, !this.field849.field2213 && arg3);
                if (!this.field845.field2213 && arg4 && arg1) {
                    this.method553();
                }
            }
            if (arg0) {
                if (this.field837.field2213) {
                    if (!this.field834.field1396) {
                        this.method551();
                    }
                    this.field844 = null;
                    this.field857 = null;
                    this.field842 = null;
                    this.field860 = null;
                    this.field853 = null;
                } else {
                    this.field859 = (byte) (this.field859 | 0x1);
                }
            }
            if (arg1) {
                if (this.field863.field2213) {
                    this.field852 = null;
                    this.field830 = null;
                } else {
                    this.field859 = (byte) (this.field859 | 0x2);
                }
            }
            if (arg2 && class59.field927) {
                if (this.field833.field2213) {
                    this.field827 = null;
                    this.field855 = null;
                    this.field839 = null;
                    this.field828 = null;
                } else {
                    this.field859 = (byte) (this.field859 | 0x4);
                }
            }
            if (arg3) {
                if (this.field849.field2213) {
                    this.field829 = null;
                    this.field821 = null;
                } else {
                    this.field859 = (byte) (this.field859 | 0x8);
                }
            }
            if (arg4 && arg1) {
                if (this.field845.field2213 && this.field863.field2213) {
                    this.field847 = null;
                    this.field861 = null;
                    this.field840 = null;
                } else {
                    this.field859 = (byte) (this.field859 | 0x10);
                }
            }
            if (arg5) {
                this.field823 = null;
                this.field848 = null;
                this.field841 = (int[][]) null;
                this.field854 = (int[][]) null;
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "(I)V", line = 893)
    public final void method545(int arg0) {
        this.field843 = (short) arg0;
        this.field863.field2213 = false;
    }

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "()I", line = 898)
    public final int method546() {
        return this.field843;
    }

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "()I", line = 901)
    public final int method494() {
        if (!this.field834.field1396) {
            this.method551();
        }
        return this.field834.field1398;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(ZZZ)Lhm;", line = 907)
    public final class52 method513(boolean arg0, boolean arg1, boolean arg2) {
        return this.method536(arg0, arg1, arg2, field868, field867);
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(III)V", line = 915)
    public final void method515(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field846; var4++) {
            this.field844[var4] += arg0;
            this.field857[var4] += arg1;
            this.field842[var4] += arg2;
        }
        this.field834.field1396 = false;
        this.field837.field2213 = false;
    }

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "(I)V", line = 929)
    public final void method547(int arg0) {
        if (this.field827 == null) {
            this.method491(arg0);
            return;
        }
        int var2 = class107.field1604[arg0];
        int var3 = class107.field1605[arg0];
        for (int var4 = 0; var4 < this.field846; var4++) {
            int var5 = this.field844[var4] * var3 + this.field842[var4] * var2 >> 16;
            this.field842[var4] = this.field842[var4] * var3 - this.field844[var4] * var2 >> 16;
            this.field844[var4] = var5;
        }
        for (int var6 = 0; var6 < this.field864; var6++) {
            int var7 = this.field839[var6] * var2 + this.field827[var6] * var3 >> 16;
            this.field839[var6] = (short) (this.field839[var6] * var3 - this.field827[var6] * var2 >> 16);
            this.field827[var6] = (short) var7;
        }
        this.field834.field1396 = false;
        this.field837.field2213 = false;
        if (this.field833 != null) {
            this.field833.field2213 = false;
        }
    }

    @OriginalMember(owner = "client!gk", name = "q", descriptor = "()V", line = 970)
    public static final void method548() {
        field858 = new class56();
        field866 = new class56();
        field867 = new class56();
        field868 = new class56();
        field869 = new class56();
        field870 = new class56();
    }

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "(I)V", line = 979)
    public final void method509(int arg0) {
        int var2 = class107.field1604[arg0];
        int var3 = class107.field1605[arg0];
        for (int var4 = 0; var4 < this.field846; var4++) {
            int var5 = this.field857[var4] * var3 - this.field842[var4] * var2 >> 16;
            this.field842[var4] = this.field857[var4] * var2 + this.field842[var4] * var3 >> 16;
            this.field857[var4] = var5;
        }
        this.field834.field1396 = false;
        this.field837.field2213 = false;
    }

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "()I", line = 1000)
    public final int method503() {
        if (!this.field834.field1396) {
            this.method551();
        }
        return this.field834.field1400;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IILgk;[[I[[IIII)V", line = 1006)
    public final void method549(int arg0, int arg1, class56 arg2, int[][] arg3, int[][] arg4, int arg5, int arg6, int arg7) {
        if (!arg2.field834.field1396) {
            arg2.method551();
        }
        int var9 = arg2.field834.field1394 + arg5;
        int var10 = arg2.field834.field1393 + arg5;
        int var11 = arg2.field834.field1397 + arg7;
        int var12 = arg2.field834.field1400 + arg7;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var9 < 0 || var10 + 128 >> 7 >= arg3.length || var11 < 0 || var12 + 128 >> 7 >= arg3[0].length) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg4 == null) {
                return;
            }
            if (var9 < 0 || var10 + 128 >> 7 >= arg4.length || var11 < 0 || var12 + 128 >> 7 >= arg4[0].length) {
                return;
            }
        } else {
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            int var15 = var11 >> 7;
            int var16 = var12 + 127 >> 7;
            if (arg3[var13][var15] == arg6 && arg3[var14][var15] == arg6 && arg3[var13][var16] == arg6 && arg3[var14][var16] == arg6) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var17 = 0; var17 < this.field836; var17++) {
                int var18 = this.field844[var17] + arg5;
                int var19 = this.field842[var17] + arg7;
                int var20 = var18 & 0x7F;
                int var21 = var19 & 0x7F;
                int var22 = var18 >> 7;
                int var23 = var19 >> 7;
                int var24 = (128 - var20) * arg3[var22][var23] + arg3[var22 + 1][var23] * var20 >> 7;
                int var25 = (128 - var20) * arg3[var22][var23 + 1] + arg3[var22 + 1][var23 + 1] * var20 >> 7;
                int var26 = (128 - var21) * var24 + var21 * var25 >> 7;
                this.field857[var17] = this.field857[var17] + var26 - arg6;
            }
        } else if (arg0 == 2) {
            short var27 = arg2.field834.field1395;
            for (int var28 = 0; var28 < this.field836; var28++) {
                int var29 = (this.field857[var28] << 16) / var27;
                if (var29 < arg1) {
                    int var30 = this.field844[var28] + arg5;
                    int var31 = this.field842[var28] + arg7;
                    int var32 = var30 & 0x7F;
                    int var33 = var31 & 0x7F;
                    int var34 = var30 >> 7;
                    int var35 = var31 >> 7;
                    int var36 = (128 - var32) * arg3[var34][var35] + arg3[var34 + 1][var35] * var32 >> 7;
                    int var37 = (128 - var32) * arg3[var34][var35 + 1] + arg3[var34 + 1][var35 + 1] * var32 >> 7;
                    int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                    this.field857[var28] += (arg1 - var29) * (var38 - arg6) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var39 = (arg1 & 0xFF) * 4;
            int var40 = (arg1 >> 8 & 0xFF) * 4;
            this.method499(arg3, arg5, arg6, arg7, var39, var40);
        } else if (arg0 == 4) {
            int var41 = arg2.field834.field1398 - arg2.field834.field1395;
            for (int var42 = 0; var42 < this.field836; var42++) {
                int var43 = this.field844[var42] + arg5;
                int var44 = this.field842[var42] + arg7;
                int var45 = var43 & 0x7F;
                int var46 = var44 & 0x7F;
                int var47 = var43 >> 7;
                int var48 = var44 >> 7;
                int var49 = (128 - var45) * arg4[var47][var48] + arg4[var47 + 1][var48] * var45 >> 7;
                int var50 = (128 - var45) * arg4[var47][var48 + 1] + arg4[var47 + 1][var48 + 1] * var45 >> 7;
                int var51 = (128 - var46) * var49 + var46 * var50 >> 7;
                this.field857[var42] = var51 + this.field857[var42] + var41 - arg6;
            }
        } else if (arg0 == 5) {
            int var52 = arg2.field834.field1398 - arg2.field834.field1395;
            for (int var53 = 0; var53 < this.field836; var53++) {
                int var54 = this.field844[var53] + arg5;
                int var55 = this.field842[var53] + arg7;
                int var56 = var54 & 0x7F;
                int var57 = var55 & 0x7F;
                int var58 = var54 >> 7;
                int var59 = var55 >> 7;
                int var60 = (128 - var56) * arg3[var58][var59] + arg3[var58 + 1][var59] * var56 >> 7;
                int var61 = (128 - var56) * arg3[var58][var59 + 1] + arg3[var58 + 1][var59 + 1] * var56 >> 7;
                int var62 = (128 - var57) * var60 + var57 * var61 >> 7;
                int var63 = (128 - var56) * arg4[var58][var59] + arg4[var58 + 1][var59] * var56 >> 7;
                int var64 = (128 - var56) * arg4[var58][var59 + 1] + arg4[var58 + 1][var59 + 1] * var56 >> 7;
                int var65 = (128 - var57) * var63 + var57 * var64 >> 7;
                int var66 = var62 - var65;
                this.field857[var53] = ((this.field857[var53] << 8) / var52 * var66 >> 8) - (arg6 - var62);
            }
        }
        this.field837.field2213 = false;
        this.field834.field1396 = false;
    }

    @OriginalMember(owner = "client!gk", name = "r", descriptor = "()I", line = 1204)
    public final int method550() {
        return this.field824;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIIIIJ)V", line = 1207)
    public final void method490(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7) {
        if (this.field864 == 0) {
            return;
        }
        GL var10 = class240.field3771;
        var10.glPushMatrix();
        if (arg3 != 0) {
            var10.glRotatef((float) arg3 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        var10.glTranslatef((float) arg4, (float) arg5, (float) arg6);
        if (arg1 != 0) {
            var10.glRotatef((float) arg1 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        }
        if (arg0 != 0) {
            var10.glRotatef((float) arg0 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        if (arg2 != 0) {
            var10.glRotatef((float) (-arg2) * 0.17578125F, 0.0F, 0.0F, 1.0F);
        }
        this.method542();
        var10.glPopMatrix();
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIIIIIJILem;)V", line = 1231)
    public final void method27(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class273 arg10) {
        if (this.field864 == 0) {
            return;
        }
        if (!this.field834.field1396) {
            this.method551();
        }
        short var13 = this.field834.field1399;
        short var14 = this.field834.field1395;
        short var15 = this.field834.field1398;
        if (arg10 != null) {
            arg10.method2015(arg0, arg9, arg5, arg6, arg7);
        }
        int var16 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var17 = arg1 * arg6 + arg2 * var16 >> 16;
        int var18 = (arg1 * var15 + arg2 * var13 >> 16) + var17;
        if (var18 <= 50) {
            return;
        }
        int var19 = (-var13 * arg2 + arg1 * var14 >> 16) + var17;
        if (var19 >= 3584) {
            return;
        }
        int var20 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var21 = var13 + var20 << 9;
        if (var21 / var18 <= class66.field997) {
            return;
        }
        int var22 = var20 - var13 << 9;
        if (var22 / var18 >= class173.field2752) {
            return;
        }
        int var23 = arg2 * arg6 - arg1 * var16 >> 16;
        int var24 = (arg1 * var13 + arg2 * var15 >> 16) + var23 << 9;
        if (var24 / var18 <= class79.field1162) {
            return;
        }
        int var25 = (-var13 * arg1 + arg2 * var14 >> 16) + var23 << 9;
        if (var25 / var18 >= class171.field2695) {
            return;
        }
        int var26 = 0;
        int var27 = 0;
        if (arg0 != 0) {
            var26 = class107.field1604[arg0];
            var27 = class107.field1605[arg0];
        }
        if (arg8 > 0L && class112.field1718 && var19 > 0) {
            int var28;
            int var29;
            if (var20 > 0) {
                var28 = var22 / var18;
                var29 = var21 / var19;
            } else {
                var28 = var22 / var19;
                var29 = var21 / var18;
            }
            int var30;
            int var31;
            if (var23 > 0) {
                var30 = var25 / var18;
                var31 = var24 / var19;
            } else {
                var30 = var25 / var19;
                var31 = var24 / var18;
            }
            if (class224.field3486 >= var28 && class224.field3486 <= var29 && class85.field1211 >= var30 && class85.field1211 <= var31) {
                int var32 = 999999;
                int var33 = -999999;
                int var34 = 999999;
                int var35 = -999999;
                short var36 = this.field834.field1394;
                short var37 = this.field834.field1393;
                short var38 = this.field834.field1397;
                short var39 = this.field834.field1400;
                int[] var40 = new int[] { var36, var37, var36, var37, var36, var37, var36, var37 };
                int[] var41 = new int[] { var38, var38, var39, var39, var38, var38, var39, var39 };
                int[] var42 = new int[] { var14, var14, var14, var14, var15, var15, var15, var15 };
                for (int var43 = 0; var43 < 8; var43++) {
                    int var44 = var40[var43];
                    int var45 = var42[var43];
                    int var46 = var41[var43];
                    if (arg0 != 0) {
                        int var47 = var26 * var46 + var27 * var44 >> 16;
                        var46 = var27 * var46 - var26 * var44 >> 16;
                        var44 = var47;
                    }
                    int var48 = arg5 + var44;
                    int var49 = arg6 + var45;
                    int var50 = arg7 + var46;
                    int var51 = arg3 * var50 + arg4 * var48 >> 16;
                    int var52 = arg4 * var50 - arg3 * var48 >> 16;
                    int var54 = arg2 * var49 - arg1 * var52 >> 16;
                    int var55 = arg1 * var49 + arg2 * var52 >> 16;
                    if (var55 > 0) {
                        int var57 = (var51 << 9) / var55;
                        int var58 = (var54 << 9) / var55;
                        if (var57 < var32) {
                            var32 = var57;
                        }
                        if (var57 > var33) {
                            var33 = var57;
                        }
                        if (var58 < var34) {
                            var34 = var58;
                        }
                        if (var58 > var35) {
                            var35 = var58;
                        }
                    }
                }
                if (class224.field3486 >= var32 && class224.field3486 <= var33 && class85.field1211 >= var34 && class85.field1211 <= var35) {
                    if (this.field800) {
                        class238.field3694[class74.field1096++] = arg8;
                    } else {
                        if (field874.length < this.field864) {
                            field874 = new int[this.field864];
                            field881 = new int[this.field864];
                        }
                        int var59 = 0;
                        label124: while (true) {
                            if (var59 >= this.field836) {
                                int var79 = 0;
                                while (true) {
                                    if (var79 >= this.field831) {
                                        break label124;
                                    }
                                    short var80 = this.field847[var79];
                                    short var81 = this.field861[var79];
                                    short var82 = this.field840[var79];
                                    if (this.method543(class224.field3486, class85.field1211, field881[var80], field881[var81], field881[var82], field874[var80], field874[var81], field874[var82])) {
                                        class238.field3694[class74.field1096++] = arg8;
                                        break label124;
                                    }
                                    var79++;
                                }
                            }
                            int var60 = this.field844[var59];
                            int var61 = this.field857[var59];
                            int var62 = this.field842[var59];
                            if (arg0 != 0) {
                                int var63 = var26 * var62 + var27 * var60 >> 16;
                                var62 = var27 * var62 - var26 * var60 >> 16;
                                var60 = var63;
                            }
                            int var64 = arg5 + var60;
                            int var65 = arg6 + var61;
                            int var66 = arg7 + var62;
                            int var67 = arg3 * var66 + arg4 * var64 >> 16;
                            int var68 = arg4 * var66 - arg3 * var64 >> 16;
                            int var70 = arg2 * var65 - arg1 * var68 >> 16;
                            int var71 = arg1 * var65 + arg2 * var68 >> 16;
                            if (var71 < 50) {
                                break;
                            }
                            int var73 = (var67 << 9) / var71;
                            int var74 = (var70 << 9) / var71;
                            int var75 = this.field853[var59];
                            int var76 = this.field853[var59 + 1];
                            for (int var77 = var75; var77 < var76; var77++) {
                                int var78 = this.field860[var77] - 1;
                                if (var78 == -1) {
                                    break;
                                }
                                field874[var78] = var73;
                                field881[var78] = var74;
                            }
                            var59++;
                        }
                    }
                }
            }
        }
        GL var83 = class240.field3771;
        var83.glPushMatrix();
        var83.glTranslatef((float) arg5, (float) arg6, (float) arg7);
        var83.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        this.method542();
        var83.glPopMatrix();
        if (arg10 != null) {
            arg10.method2012(arg0, arg1, arg2, arg3, arg4, arg9, arg5, arg6, arg7);
        }
    }

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "()V", line = 1521)
    public final void method512() {
        for (int var1 = 0; var1 < this.field846; var1++) {
            this.field844[var1] = this.field844[var1] + 7 >> 4;
            this.field857[var1] = this.field857[var1] + 7 >> 4;
            this.field842[var1] = this.field842[var1] + 7 >> 4;
        }
        this.field834.field1396 = false;
        this.field837.field2213 = false;
    }

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "()I", line = 1543)
    public final int method506() {
        if (!this.field834.field1396) {
            this.method551();
        }
        return this.field834.field1399;
    }

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "()V", line = 1551)
    public final void method507() {
        for (int var1 = 0; var1 < this.field846; var1++) {
            int var2 = this.field842[var1];
            this.field842[var1] = this.field844[var1];
            this.field844[var1] = -var2;
        }
        this.field834.field1396 = false;
        this.field837.field2213 = false;
    }

    @OriginalMember(owner = "client!gk", name = "s", descriptor = "()V", line = 1566)
    private final void method551() {
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < this.field836; var9++) {
            int var10 = this.field844[var9];
            int var11 = this.field857[var9];
            int var12 = this.field842[var9];
            if (var10 < var1) {
                var1 = var10;
            }
            if (var10 > var4) {
                var4 = var10;
            }
            if (var11 < var2) {
                var2 = var11;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            int var13 = var10 * var10 + var12 * var12;
            if (var13 > var7) {
                var7 = var13;
            }
            int var14 = var11 * var11 + var10 * var10 + var12 * var12;
            if (var14 > var8) {
                var8 = var14;
            }
        }
        this.field834.field1394 = (short) var1;
        this.field834.field1393 = (short) var4;
        this.field834.field1395 = (short) var2;
        this.field834.field1398 = (short) var5;
        this.field834.field1397 = (short) var3;
        this.field834.field1400 = (short) var6;
        this.field834.field1399 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
        Math.sqrt((double) var8);
        this.field834.field1396 = true;
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)V", line = 1637)
    public final void method498(int arg0) {
        int var2 = class107.field1604[arg0];
        int var3 = class107.field1605[arg0];
        for (int var4 = 0; var4 < this.field846; var4++) {
            int var5 = this.field857[var4] * var2 + this.field844[var4] * var3 >> 16;
            this.field857[var4] = this.field857[var4] * var3 - this.field844[var4] * var2 >> 16;
            this.field844[var4] = var5;
        }
        this.field834.field1396 = false;
        this.field837.field2213 = false;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "()I", line = 1656)
    public final int method21() {
        if (!this.field834.field1396) {
            this.method551();
        }
        return this.field834.field1395;
    }

    @OriginalMember(owner = "client!gk", name = "t", descriptor = "()V", line = 1665)
    public final void method552() {
        if (this.field827 == null) {
            this.method493();
            return;
        }
        for (int var1 = 0; var1 < this.field846; var1++) {
            this.field844[var1] = -this.field844[var1];
            this.field842[var1] = -this.field842[var1];
        }
        for (int var2 = 0; var2 < this.field864; var2++) {
            this.field827[var2] = (short) (-this.field827[var2]);
            this.field839[var2] = (short) (-this.field839[var2]);
        }
        this.field834.field1396 = false;
        this.field837.field2213 = false;
        if (this.field833 != null) {
            this.field833.field2213 = false;
        }
    }

    @OriginalMember(owner = "client!gk", name = "u", descriptor = "()V", line = 1699)
    private final void method553() {
        if (field832.field448.length < this.field831 * 12) {
            field832 = new class25((this.field831 + 100) * 12);
        } else {
            field832.field397 = 0;
        }
        if (class240.field3757) {
            for (int var1 = 0; var1 < this.field831; var1++) {
                field832.method310(28, this.field847[var1]);
                field832.method310(82, this.field861[var1]);
                field832.method310(68, this.field840[var1]);
            }
        } else {
            for (int var2 = 0; var2 < this.field831; var2++) {
                field832.method288(true, this.field847[var2]);
                field832.method288(true, this.field861[var2]);
                field832.method288(true, this.field840[var2]);
            }
        }
        if (!class240.field3764) {
            ByteBuffer var5 = ByteBuffer.allocateDirect(field832.field397);
            var5.put(field832.field448, 0, field832.field397);
            var5.flip();
            this.field845.field2213 = true;
            this.field845.field2222 = var5;
            this.field845.field2218 = null;
            return;
        }
        class35 var3 = new class35();
        ByteBuffer var4 = ByteBuffer.wrap(field832.field448, 0, field832.field397);
        var3.method359(var4);
        this.field845.field2213 = true;
        this.field845.field2222 = null;
        this.field845.field2218 = var3;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIII[FFIF)V", line = 1757)
    private static final void method554(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9) {
        int var10 = arg0 - arg3;
        int var11 = arg1 - arg4;
        int var12 = arg2 - arg5;
        float var13 = arg6[2] * (float) var12 + arg6[0] * (float) var10 + arg6[1] * (float) var11;
        float var14 = arg6[5] * (float) var12 + arg6[3] * (float) var10 + arg6[4] * (float) var11;
        float var15 = arg6[8] * (float) var12 + arg6[6] * (float) var10 + arg6[7] * (float) var11;
        float var16 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        if (arg7 != 1.0F) {
            var16 = arg7 * var16;
        }
        float var17 = var14 + arg9 + 0.5F;
        if (arg8 == 1) {
            float var18 = var16;
            var16 = -var17;
            var17 = var18;
        } else if (arg8 == 2) {
            var16 = -var16;
            var17 = -var17;
        } else if (arg8 == 3) {
            float var19 = var16;
            var16 = var17;
            var17 = -var19;
        }
        field873 = var16;
        field872 = var17;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I[IIIIZ)V", line = 1803)
    public final void method505(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1.length;
        if (arg0 == 0) {
            int var8 = arg2 << 4;
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = 0;
            field876 = 0;
            field882 = 0;
            field877 = 0;
            for (int var12 = 0; var12 < var7; var12++) {
                int var13 = arg1[var12];
                if (var13 < this.field841.length) {
                    int[] var14 = this.field841[var13];
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        int var16 = var14[var15];
                        field876 += this.field844[var16];
                        field882 += this.field857[var16];
                        field877 += this.field842[var16];
                        var11++;
                    }
                }
            }
            if (var11 > 0) {
                field876 = field876 / var11 + var8;
                field882 = field882 / var11 + var9;
                field877 = field877 / var11 + var10;
            } else {
                field876 = var8;
                field882 = var9;
                field877 = var10;
            }
        } else if (arg0 == 1) {
            int var17 = arg2 << 4;
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            for (int var20 = 0; var20 < var7; var20++) {
                int var21 = arg1[var20];
                if (var21 < this.field841.length) {
                    int[] var22 = this.field841[var21];
                    for (int var23 = 0; var23 < var22.length; var23++) {
                        int var24 = var22[var23];
                        this.field844[var24] += var17;
                        this.field857[var24] += var18;
                        this.field842[var24] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var25 = 0; var25 < var7; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field841.length) {
                    int[] var27 = this.field841[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        this.field844[var29] -= field876;
                        this.field857[var29] -= field882;
                        this.field842[var29] -= field877;
                        if (arg4 != 0) {
                            int var30 = class107.field1604[arg4];
                            int var31 = class107.field1605[arg4];
                            int var32 = this.field857[var29] * var30 + this.field844[var29] * var31 + 32767 >> 16;
                            this.field857[var29] = this.field857[var29] * var31 + 32767 - this.field844[var29] * var30 >> 16;
                            this.field844[var29] = var32;
                        }
                        if (arg2 != 0) {
                            int var33 = class107.field1604[arg2];
                            int var34 = class107.field1605[arg2];
                            int var35 = this.field857[var29] * var34 + 32767 - this.field842[var29] * var33 >> 16;
                            this.field842[var29] = this.field857[var29] * var33 + this.field842[var29] * var34 + 32767 >> 16;
                            this.field857[var29] = var35;
                        }
                        if (arg3 != 0) {
                            int var36 = class107.field1604[arg3];
                            int var37 = class107.field1605[arg3];
                            int var38 = this.field844[var29] * var37 + this.field842[var29] * var36 + 32767 >> 16;
                            this.field842[var29] = this.field842[var29] * var37 + 32767 - this.field844[var29] * var36 >> 16;
                            this.field844[var29] = var38;
                        }
                        this.field844[var29] += field876;
                        this.field857[var29] += field882;
                        this.field842[var29] += field877;
                    }
                }
            }
            if (arg5 && this.field827 != null) {
                for (int var39 = 0; var39 < var7; var39++) {
                    int var40 = arg1[var39];
                    if (var40 < this.field841.length) {
                        int[] var41 = this.field841[var40];
                        for (int var42 = 0; var42 < var41.length; var42++) {
                            int var43 = var41[var42];
                            int var44 = this.field853[var43];
                            int var45 = this.field853[var43 + 1];
                            for (int var46 = var44; var46 < var45; var46++) {
                                int var47 = this.field860[var46] - 1;
                                if (var47 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var48 = class107.field1604[arg4];
                                    int var49 = class107.field1605[arg4];
                                    int var50 = this.field855[var47] * var48 + this.field827[var47] * var49 + 32767 >> 16;
                                    this.field855[var47] = (short) (this.field855[var47] * var49 + 32767 - this.field827[var47] * var48 >> 16);
                                    this.field827[var47] = (short) var50;
                                }
                                if (arg2 != 0) {
                                    int var51 = class107.field1604[arg2];
                                    int var52 = class107.field1605[arg2];
                                    int var53 = this.field855[var47] * var52 + 32767 - this.field839[var47] * var51 >> 16;
                                    this.field839[var47] = (short) (this.field855[var47] * var51 + this.field839[var47] * var52 + 32767 >> 16);
                                    this.field855[var47] = (short) var53;
                                }
                                if (arg3 != 0) {
                                    int var54 = class107.field1604[arg3];
                                    int var55 = class107.field1605[arg3];
                                    int var56 = this.field839[var47] * var54 + this.field827[var47] * var55 + 32767 >> 16;
                                    this.field839[var47] = (short) (this.field839[var47] * var55 + 32767 - this.field827[var47] * var54 >> 16);
                                    this.field827[var47] = (short) var56;
                                }
                            }
                        }
                    }
                }
                if (this.field833 != null) {
                    this.field833.field2213 = false;
                }
            }
        } else if (arg0 == 3) {
            for (int var57 = 0; var57 < var7; var57++) {
                int var58 = arg1[var57];
                if (var58 < this.field841.length) {
                    int[] var59 = this.field841[var58];
                    for (int var60 = 0; var60 < var59.length; var60++) {
                        int var61 = var59[var60];
                        this.field844[var61] -= field876;
                        this.field857[var61] -= field882;
                        this.field842[var61] -= field877;
                        this.field844[var61] = this.field844[var61] * arg2 >> 7;
                        this.field857[var61] = this.field857[var61] * arg3 >> 7;
                        this.field842[var61] = this.field842[var61] * arg4 >> 7;
                        this.field844[var61] += field876;
                        this.field857[var61] += field882;
                        this.field842[var61] += field877;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field854 != null && this.field830 != null) {
                for (int var62 = 0; var62 < var7; var62++) {
                    int var63 = arg1[var62];
                    if (var63 < this.field854.length) {
                        int[] var64 = this.field854[var63];
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            int var66 = var64[var65];
                            int var67 = (this.field830[var66] & 0xFF) + arg2 * 8;
                            if (var67 < 0) {
                                var67 = 0;
                            } else if (var67 > 255) {
                                var67 = 255;
                            }
                            this.field830[var66] = (byte) var67;
                        }
                        if (var64.length > 0) {
                            this.field863.field2213 = false;
                        }
                    }
                }
            }
        } else if (arg0 == 7 && this.field854 != null) {
            for (int var68 = 0; var68 < var7; var68++) {
                int var69 = arg1[var68];
                if (var69 < this.field854.length) {
                    int[] var70 = this.field854[var69];
                    for (int var71 = 0; var71 < var70.length; var71++) {
                        int var72 = var70[var71];
                        int var73 = this.field852[var72] & 0xFFFF;
                        int var74 = var73 >> 10 & 0x3F;
                        int var75 = var73 >> 7 & 0x7;
                        int var76 = var73 & 0x7F;
                        int var77 = arg2 + var74 & 0x3F;
                        int var78 = arg3 / 4 + var75;
                        if (var78 < 0) {
                            var78 = 0;
                        } else if (var78 > 7) {
                            var78 = 7;
                        }
                        int var79 = arg4 + var76;
                        if (var79 < 0) {
                            var79 = 0;
                        } else if (var79 > 127) {
                            var79 = 127;
                        }
                        this.field852[var72] = (short) (var77 << 10 | var78 << 7 | var79);
                    }
                    if (var70.length > 0) {
                        this.field863.field2213 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ISIB)I", line = 2212)
    private static final int method555(int arg0, short arg1, int arg2, byte arg3) {
        int var4 = class107.field1603[class124.method1071(arg0, arg2)];
        if (arg1 != -1) {
            int var5 = class107.field1619.method752(arg1 & 0xFFFF, (byte) -21);
            if (var5 != 0) {
                int var6;
                if (arg2 < 0) {
                    var6 = 0;
                } else if (arg2 > 127) {
                    var6 = 16777215;
                } else {
                    var6 = arg2 * 131586;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var4 & 0xFF00FF) * var8 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) + ((var4 & 0xFF00) * var8 + (var6 & 0xFF00) * var5 & 0xFF0000) >> 8;
                }
            }
            int var9 = class107.field1619.method762(109, arg1 & 0xFFFF);
            if (var9 != 0) {
                var9 += 256;
                int var10 = ((var4 & 0xFF0000) >> 16) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                int var11 = ((var4 & 0xFF00) >> 8) * var9;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                int var12 = (var4 & 0xFF) * var9;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = (var12 >> 8) + (var10 & 0xFF00 << 8) + (var11 & 0xFF00);
            }
        }
        return (var4 << 8) + (255 - (arg3 & 0xFF));
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "()I", line = 2271)
    public final int method488() {
        if (!this.field834.field1396) {
            this.method551();
        }
        return this.field834.field1394;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)V", line = 2278)
    public final void method491(int arg0) {
        int var2 = class107.field1604[arg0];
        int var3 = class107.field1605[arg0];
        for (int var4 = 0; var4 < this.field846; var4++) {
            int var5 = this.field844[var4] * var3 + this.field842[var4] * var2 >> 16;
            this.field842[var4] = this.field842[var4] * var3 - this.field844[var4] * var2 >> 16;
            this.field844[var4] = var5;
        }
        this.field834.field1396 = false;
        this.field837.field2213 = false;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(FFF)I", line = 2298)
    private static final int method556(float arg0, float arg1, float arg2) {
        float var3 = arg0 < 0.0F ? -arg0 : arg0;
        float var4 = arg1 < 0.0F ? -arg1 : arg1;
        float var5 = arg2 < 0.0F ? -arg2 : arg2;
        if (var4 > var3 && var4 > var5) {
            return arg1 > 0.0F ? 0 : 1;
        } else if (var5 > var3 && var5 > var4) {
            return arg2 > 0.0F ? 2 : 3;
        } else if (arg0 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIIII[FIFFF)V", line = 2332)
    private static final void method557(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, float arg10, float arg11) {
        int var12 = arg0 - arg3;
        int var13 = arg1 - arg4;
        int var14 = arg2 - arg5;
        float var15 = arg7[2] * (float) var14 + arg7[0] * (float) var12 + arg7[1] * (float) var13;
        float var16 = arg7[5] * (float) var14 + arg7[3] * (float) var12 + arg7[4] * (float) var13;
        float var17 = arg7[8] * (float) var14 + arg7[6] * (float) var12 + arg7[7] * (float) var13;
        float var18;
        float var19;
        if (arg6 == 0) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg11 + 0.5F - var17;
        } else if (arg6 == 1) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg11 + var17 + 0.5F;
        } else if (arg6 == 2) {
            var18 = arg9 + 0.5F - var15;
            var19 = arg10 + 0.5F - var16;
        } else if (arg6 == 3) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg10 + 0.5F - var16;
        } else if (arg6 == 4) {
            var18 = arg11 + var17 + 0.5F;
            var19 = arg10 + 0.5F - var16;
        } else {
            var18 = arg11 + 0.5F - var17;
            var19 = arg10 + 0.5F - var16;
        }
        if (arg8 == 1) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (arg8 == 2) {
            var18 = -var18;
            var19 = -var19;
        } else if (arg8 == 3) {
            float var21 = var18;
            var18 = var19;
            var19 = -var21;
        }
        field871 = var18;
        field879 = var19;
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(ZZZ)Lhm;", line = 2411)
    public final class52 method516(boolean arg0, boolean arg1, boolean arg2) {
        return this.method536(arg0, arg1, arg2, field866, field858);
    }

    @OriginalMember(owner = "client!gk", name = "v", descriptor = "()V", line = 2419)
    public final void method558() {
        if (this.field827 == null) {
            this.method507();
            return;
        }
        for (int var1 = 0; var1 < this.field846; var1++) {
            int var2 = this.field842[var1];
            this.field842[var1] = this.field844[var1];
            this.field844[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field864; var3++) {
            short var4 = this.field839[var3];
            this.field839[var3] = this.field827[var3];
            this.field827[var3] = (short) (-var4);
        }
        this.field834.field1396 = false;
        this.field837.field2213 = false;
        if (this.field833 != null) {
            this.field833.field2213 = false;
        }
    }

    @OriginalMember(owner = "client!gk", name = "w", descriptor = "()V", line = 2458)
    public final void method559() {
        for (int var1 = 0; var1 < this.field846; var1++) {
            this.field842[var1] = -this.field842[var1];
        }
        if (this.field839 != null) {
            for (int var2 = 0; var2 < this.field864; var2++) {
                this.field839[var2] = (short) (-this.field839[var2]);
            }
        }
        for (int var3 = 0; var3 < this.field831; var3++) {
            short var4 = this.field847[var3];
            this.field847[var3] = this.field840[var3];
            this.field840[var3] = var4;
        }
        this.field834.field1396 = false;
        this.field837.field2213 = false;
        if (this.field833 != null) {
            this.field833.field2213 = false;
        }
        this.field845.field2213 = false;
    }

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "()I", line = 2494)
    public final int method502() {
        if (!this.field834.field1396) {
            this.method551();
        }
        return this.field834.field1393;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I[IIIIZI[I)V", line = 2501)
    public final void method495(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            int var12 = arg4 << 4;
            int var13 = 0;
            field876 = 0;
            field882 = 0;
            field877 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field841.length) {
                    int[] var16 = this.field841[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field838 == null || (arg6 & this.field838[var18]) != 0) {
                            field876 += this.field844[var18];
                            field882 += this.field857[var18];
                            field877 += this.field842[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 > 0) {
                field876 = field876 / var13 + var10;
                field882 = field882 / var13 + var11;
                field877 = field877 / var13 + var12;
                field878 = true;
            } else {
                field876 = var10;
                field882 = var11;
                field877 = var12;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + arg7[0] * arg2 + arg7[1] * arg3 + 16384 >> 15;
                int var20 = arg7[5] * arg4 + arg7[3] * arg2 + arg7[4] * arg3 + 16384 >> 15;
                int var21 = arg7[8] * arg4 + arg7[6] * arg2 + arg7[7] * arg3 + 16384 >> 15;
                arg2 = var19;
                arg3 = var20;
                arg4 = var21;
            }
            int var22 = arg2 << 4;
            int var23 = arg3 << 4;
            int var24 = arg4 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field841.length) {
                    int[] var27 = this.field841[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field838 == null || (arg6 & this.field838[var29]) != 0) {
                            this.field844[var29] += var22;
                            this.field857[var29] += var23;
                            this.field842[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var91 = arg1[var90];
                    if (var91 < this.field841.length) {
                        int[] var92 = this.field841[var91];
                        for (int var93 = 0; var93 < var92.length; var93++) {
                            int var94 = var92[var93];
                            if (this.field838 == null || (arg6 & this.field838[var94]) != 0) {
                                this.field844[var94] -= field876;
                                this.field857[var94] -= field882;
                                this.field842[var94] -= field877;
                                if (arg4 != 0) {
                                    int var95 = class107.field1604[arg4];
                                    int var96 = class107.field1605[arg4];
                                    int var97 = this.field857[var94] * var95 + this.field844[var94] * var96 + 32767 >> 16;
                                    this.field857[var94] = this.field857[var94] * var96 + 32767 - this.field844[var94] * var95 >> 16;
                                    this.field844[var94] = var97;
                                }
                                if (arg2 != 0) {
                                    int var98 = class107.field1604[arg2];
                                    int var99 = class107.field1605[arg2];
                                    int var100 = this.field857[var94] * var99 + 32767 - this.field842[var94] * var98 >> 16;
                                    this.field842[var94] = this.field857[var94] * var98 + this.field842[var94] * var99 + 32767 >> 16;
                                    this.field857[var94] = var100;
                                }
                                if (arg3 != 0) {
                                    int var101 = class107.field1604[arg3];
                                    int var102 = class107.field1605[arg3];
                                    int var103 = this.field844[var94] * var102 + this.field842[var94] * var101 + 32767 >> 16;
                                    this.field842[var94] = this.field842[var94] * var102 + 32767 - this.field844[var94] * var101 >> 16;
                                    this.field844[var94] = var103;
                                }
                                this.field844[var94] += field876;
                                this.field857[var94] += field882;
                                this.field842[var94] += field877;
                            }
                        }
                    }
                }
                if (arg5 && this.field827 != null) {
                    for (int var104 = 0; var104 < var9; var104++) {
                        int var105 = arg1[var104];
                        if (var105 < this.field841.length) {
                            int[] var106 = this.field841[var105];
                            for (int var107 = 0; var107 < var106.length; var107++) {
                                int var108 = var106[var107];
                                if (this.field838 == null || (arg6 & this.field838[var108]) != 0) {
                                    int var109 = this.field853[var108];
                                    int var110 = this.field853[var108 + 1];
                                    for (int var111 = var109; var111 < var110; var111++) {
                                        int var112 = this.field860[var111] - 1;
                                        if (var112 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var113 = class107.field1604[arg4];
                                            int var114 = class107.field1605[arg4];
                                            int var115 = this.field855[var112] * var113 + this.field827[var112] * var114 + 32767 >> 16;
                                            this.field855[var112] = (short) (this.field855[var112] * var114 + 32767 - this.field827[var112] * var113 >> 16);
                                            this.field827[var112] = (short) var115;
                                        }
                                        if (arg2 != 0) {
                                            int var116 = class107.field1604[arg2];
                                            int var117 = class107.field1605[arg2];
                                            int var118 = this.field855[var112] * var117 + 32767 - this.field839[var112] * var116 >> 16;
                                            this.field839[var112] = (short) (this.field855[var112] * var116 + this.field839[var112] * var117 + 32767 >> 16);
                                            this.field855[var112] = (short) var118;
                                        }
                                        if (arg3 != 0) {
                                            int var119 = class107.field1604[arg3];
                                            int var120 = class107.field1605[arg3];
                                            int var121 = this.field839[var112] * var119 + this.field827[var112] * var120 + 32767 >> 16;
                                            this.field839[var112] = (short) (this.field839[var112] * var120 + 32767 - this.field827[var112] * var119 >> 16);
                                            this.field827[var112] = (short) var121;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field833 != null) {
                        this.field833.field2213 = false;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (field878) {
                    int var36 = arg7[6] * field877 + arg7[0] * field876 + arg7[3] * field882 + 16384 >> 15;
                    int var37 = arg7[7] * field877 + arg7[1] * field876 + arg7[4] * field882 + 16384 >> 15;
                    int var38 = arg7[8] * field877 + arg7[2] * field876 + arg7[5] * field882 + 16384 >> 15;
                    int var39 = var33 + var36;
                    int var40 = var34 + var37;
                    int var41 = var35 + var38;
                    field876 = var39;
                    field882 = var40;
                    field877 = var41;
                    field878 = false;
                }
                int[] var42 = new int[9];
                int var43 = class107.field1605[arg2] >> 1;
                int var44 = class107.field1604[arg2] >> 1;
                int var45 = class107.field1605[arg3] >> 1;
                int var46 = class107.field1604[arg3] >> 1;
                int var47 = class107.field1605[arg4] >> 1;
                int var48 = class107.field1604[arg4] >> 1;
                int var49 = var44 * var47 + 16384 >> 15;
                int var50 = var44 * var48 + 16384 >> 15;
                var42[0] = var45 * var47 + var46 * var50 + 16384 >> 15;
                var42[1] = -var45 * var48 + var46 * var49 + 16384 >> 15;
                var42[2] = var43 * var46 + 16384 >> 15;
                var42[3] = var43 * var48 + 16384 >> 15;
                var42[4] = var43 * var47 + 16384 >> 15;
                var42[5] = -var44;
                var42[6] = -var46 * var47 + var45 * var50 + 16384 >> 15;
                var42[7] = var45 * var49 + var46 * var48 + 16384 >> 15;
                var42[8] = var43 * var45 + 16384 >> 15;
                int var51 = var42[2] * -field877 + var42[0] * -field876 + var42[1] * -field882 + 16384 >> 15;
                int var52 = var42[5] * -field877 + var42[3] * -field876 + var42[4] * -field882 + 16384 >> 15;
                int var53 = var42[8] * -field877 + var42[6] * -field876 + var42[7] * -field882 + 16384 >> 15;
                int var54 = field876 + var51;
                int var55 = field882 + var52;
                int var56 = field877 + var53;
                int[] var57 = new int[9];
                for (int var58 = 0; var58 < 3; var58++) {
                    for (int var59 = 0; var59 < 3; var59++) {
                        int var60 = 0;
                        for (int var61 = 0; var61 < 3; var61++) {
                            var60 += var42[var58 * 3 + var61] * arg7[var59 * 3 + var61];
                        }
                        var57[var58 * 3 + var59] = var60 + 16384 >> 15;
                    }
                }
                int var62 = var42[2] * var35 + var42[0] * var33 + var42[1] * var34 + 16384 >> 15;
                int var63 = var42[5] * var35 + var42[3] * var33 + var42[4] * var34 + 16384 >> 15;
                int var64 = var42[8] * var35 + var42[6] * var33 + var42[7] * var34 + 16384 >> 15;
                int var65 = var54 + var62;
                int var66 = var55 + var63;
                int var67 = var56 + var64;
                int[] var68 = new int[9];
                for (int var69 = 0; var69 < 3; var69++) {
                    for (int var70 = 0; var70 < 3; var70++) {
                        int var71 = 0;
                        for (int var72 = 0; var72 < 3; var72++) {
                            var71 += arg7[var69 * 3 + var72] * var57[var72 * 3 + var70];
                        }
                        var68[var69 * 3 + var70] = var71 + 16384 >> 15;
                    }
                }
                int var73 = arg7[2] * var67 + arg7[0] * var65 + arg7[1] * var66 + 16384 >> 15;
                int var74 = arg7[5] * var67 + arg7[3] * var65 + arg7[4] * var66 + 16384 >> 15;
                int var75 = arg7[8] * var67 + arg7[6] * var65 + arg7[7] * var66 + 16384 >> 15;
                int var76 = var30 + var73;
                int var77 = var31 + var74;
                int var78 = var32 + var75;
                for (int var79 = 0; var79 < var9; var79++) {
                    int var80 = arg1[var79];
                    if (var80 < this.field841.length) {
                        int[] var81 = this.field841[var80];
                        for (int var82 = 0; var82 < var81.length; var82++) {
                            int var83 = var81[var82];
                            if (this.field838 == null || (arg6 & this.field838[var83]) != 0) {
                                int var84 = this.field842[var83] * var68[2] + this.field857[var83] * var68[1] + this.field844[var83] * var68[0] + 16384 >> 15;
                                int var85 = this.field842[var83] * var68[5] + this.field857[var83] * var68[4] + this.field844[var83] * var68[3] + 16384 >> 15;
                                int var86 = this.field842[var83] * var68[8] + this.field857[var83] * var68[7] + this.field844[var83] * var68[6] + 16384 >> 15;
                                int var87 = var76 + var84;
                                int var88 = var77 + var85;
                                int var89 = var78 + var86;
                                this.field844[var83] = var87;
                                this.field857[var83] = var88;
                                this.field842[var83] = var89;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (var173 < this.field841.length) {
                        int[] var174 = this.field841[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field838 == null || (arg6 & this.field838[var176]) != 0) {
                                this.field844[var176] -= field876;
                                this.field857[var176] -= field882;
                                this.field842[var176] -= field877;
                                this.field844[var176] = this.field844[var176] * arg2 >> 7;
                                this.field857[var176] = this.field857[var176] * arg3 >> 7;
                                this.field842[var176] = this.field842[var176] * arg4 >> 7;
                                this.field844[var176] += field876;
                                this.field857[var176] += field882;
                                this.field842[var176] += field877;
                            }
                        }
                    }
                }
            } else {
                int var122 = arg7[9] << 4;
                int var123 = arg7[10] << 4;
                int var124 = arg7[11] << 4;
                int var125 = arg7[12] << 4;
                int var126 = arg7[13] << 4;
                int var127 = arg7[14] << 4;
                if (field878) {
                    int var128 = arg7[6] * field877 + arg7[0] * field876 + arg7[3] * field882 + 16384 >> 15;
                    int var129 = arg7[7] * field877 + arg7[1] * field876 + arg7[4] * field882 + 16384 >> 15;
                    int var130 = arg7[8] * field877 + arg7[2] * field876 + arg7[5] * field882 + 16384 >> 15;
                    int var131 = var125 + var128;
                    int var132 = var126 + var129;
                    int var133 = var127 + var130;
                    field876 = var131;
                    field882 = var132;
                    field877 = var133;
                    field878 = false;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -field876 * var134 + 16384 >> 15;
                int var138 = -field882 * var135 + 16384 >> 15;
                int var139 = -field877 * var136 + 16384 >> 15;
                int var140 = field876 + var137;
                int var141 = field882 + var138;
                int var142 = field877 + var139;
                int[] var143 = new int[] { arg7[0] * var134 + 16384 >> 15, arg7[3] * var134 + 16384 >> 15, arg7[6] * var134 + 16384 >> 15, arg7[1] * var135 + 16384 >> 15, arg7[4] * var135 + 16384 >> 15, arg7[7] * var135 + 16384 >> 15, arg7[2] * var136 + 16384 >> 15, arg7[5] * var136 + 16384 >> 15, arg7[8] * var136 + 16384 >> 15 };
                int var144 = var125 * var134 + 16384 >> 15;
                int var145 = var126 * var135 + 16384 >> 15;
                int var146 = var127 * var136 + 16384 >> 15;
                int var147 = var140 + var144;
                int var148 = var141 + var145;
                int var149 = var142 + var146;
                int[] var150 = new int[9];
                for (int var151 = 0; var151 < 3; var151++) {
                    for (int var152 = 0; var152 < 3; var152++) {
                        int var153 = 0;
                        for (int var154 = 0; var154 < 3; var154++) {
                            var153 += arg7[var151 * 3 + var154] * var143[var154 * 3 + var152];
                        }
                        var150[var151 * 3 + var152] = var153 + 16384 >> 15;
                    }
                }
                int var155 = arg7[2] * var149 + arg7[0] * var147 + arg7[1] * var148 + 16384 >> 15;
                int var156 = arg7[5] * var149 + arg7[3] * var147 + arg7[4] * var148 + 16384 >> 15;
                int var157 = arg7[8] * var149 + arg7[6] * var147 + arg7[7] * var148 + 16384 >> 15;
                int var158 = var122 + var155;
                int var159 = var123 + var156;
                int var160 = var124 + var157;
                for (int var161 = 0; var161 < var9; var161++) {
                    int var162 = arg1[var161];
                    if (var162 < this.field841.length) {
                        int[] var163 = this.field841[var162];
                        for (int var164 = 0; var164 < var163.length; var164++) {
                            int var165 = var163[var164];
                            if (this.field838 == null || (arg6 & this.field838[var165]) != 0) {
                                int var166 = this.field842[var165] * var150[2] + this.field857[var165] * var150[1] + this.field844[var165] * var150[0] + 16384 >> 15;
                                int var167 = this.field842[var165] * var150[5] + this.field857[var165] * var150[4] + this.field844[var165] * var150[3] + 16384 >> 15;
                                int var168 = this.field842[var165] * var150[8] + this.field857[var165] * var150[7] + this.field844[var165] * var150[6] + 16384 >> 15;
                                int var169 = var158 + var166;
                                int var170 = var159 + var167;
                                int var171 = var160 + var168;
                                this.field844[var165] = var169;
                                this.field857[var165] = var170;
                                this.field842[var165] = var171;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field854 != null && this.field830 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var178 = arg1[var177];
                    if (var178 < this.field854.length) {
                        int[] var179 = this.field854[var178];
                        for (int var180 = 0; var180 < var179.length; var180++) {
                            int var181 = var179[var180];
                            if (this.field825 == null || (arg6 & this.field825[var181]) != 0) {
                                int var182 = (this.field830[var181] & 0xFF) + arg2 * 8;
                                if (var182 < 0) {
                                    var182 = 0;
                                } else if (var182 > 255) {
                                    var182 = 255;
                                }
                                this.field830[var181] = (byte) var182;
                            }
                        }
                        if (var179.length > 0) {
                            this.field863.field2213 = false;
                        }
                    }
                }
            }
        } else if (arg0 == 7 && this.field854 != null) {
            for (int var183 = 0; var183 < var9; var183++) {
                int var184 = arg1[var183];
                if (var184 < this.field854.length) {
                    int[] var185 = this.field854[var184];
                    for (int var186 = 0; var186 < var185.length; var186++) {
                        int var187 = var185[var186];
                        if (this.field825 == null || (arg6 & this.field825[var187]) != 0) {
                            int var188 = this.field852[var187] & 0xFFFF;
                            int var189 = var188 >> 10 & 0x3F;
                            int var190 = var188 >> 7 & 0x7;
                            int var191 = var188 & 0x7F;
                            int var192 = arg2 + var189 & 0x3F;
                            int var193 = arg3 / 4 + var190;
                            if (var193 < 0) {
                                var193 = 0;
                            } else if (var193 > 7) {
                                var193 = 7;
                            }
                            int var194 = arg4 + var191;
                            if (var194 < 0) {
                                var194 = 0;
                            } else if (var194 > 127) {
                                var194 = 127;
                            }
                            this.field852[var187] = (short) (var192 << 10 | var193 << 7 | var194);
                        }
                    }
                    if (var185.length > 0) {
                        this.field863.field2213 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "()V", line = 3294)
    public final void method493() {
        for (int var1 = 0; var1 < this.field846; var1++) {
            this.field844[var1] = -this.field844[var1];
            this.field842[var1] = -this.field842[var1];
        }
        this.field834.field1396 = false;
        this.field837.field2213 = false;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(IIII)V", line = 3306)
    public final void method497(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            int var5 = 0;
            field876 = 0;
            field882 = 0;
            field877 = 0;
            for (int var6 = 0; var6 < this.field846; var6++) {
                field876 += this.field844[var6];
                field882 += this.field857[var6];
                field877 += this.field842[var6];
                var5++;
            }
            if (var5 > 0) {
                field876 = field876 / var5 + arg1;
                field882 = field882 / var5 + arg2;
                field877 = field877 / var5 + arg3;
            } else {
                field876 = arg1;
                field882 = arg2;
                field877 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field846; var7++) {
                this.field844[var7] += arg1;
                this.field857[var7] += arg2;
                this.field842[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field846; var8++) {
                this.field844[var8] -= field876;
                this.field857[var8] -= field882;
                this.field842[var8] -= field877;
                if (arg3 != 0) {
                    int var9 = class107.field1604[arg3];
                    int var10 = class107.field1605[arg3];
                    int var11 = this.field857[var8] * var9 + this.field844[var8] * var10 + 32767 >> 16;
                    this.field857[var8] = this.field857[var8] * var10 + 32767 - this.field844[var8] * var9 >> 16;
                    this.field844[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class107.field1604[arg1];
                    int var13 = class107.field1605[arg1];
                    int var14 = this.field857[var8] * var13 + 32767 - this.field842[var8] * var12 >> 16;
                    this.field842[var8] = this.field857[var8] * var12 + this.field842[var8] * var13 + 32767 >> 16;
                    this.field857[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class107.field1604[arg2];
                    int var16 = class107.field1605[arg2];
                    int var17 = this.field844[var8] * var16 + this.field842[var8] * var15 + 32767 >> 16;
                    this.field842[var8] = this.field842[var8] * var16 + 32767 - this.field844[var8] * var15 >> 16;
                    this.field844[var8] = var17;
                }
                this.field844[var8] += field876;
                this.field857[var8] += field882;
                this.field842[var8] += field877;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field846; var18++) {
                this.field844[var18] -= field876;
                this.field857[var18] -= field882;
                this.field842[var18] -= field877;
                this.field844[var18] = this.field844[var18] * arg1 / 128;
                this.field857[var18] = this.field857[var18] * arg2 / 128;
                this.field842[var18] = this.field842[var18] * arg3 / 128;
                this.field844[var18] += field876;
                this.field857[var18] += field882;
                this.field842[var18] += field877;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field831; var19++) {
                int var20 = (this.field830[var19] & 0xFF) + arg1 * 8;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 255) {
                    var20 = 255;
                }
                this.field830[var19] = (byte) var20;
            }
            this.field863.field2213 = false;
        } else if (arg0 == 7) {
            for (int var21 = 0; var21 < this.field831; var21++) {
                int var22 = this.field852[var21] & 0xFFFF;
                int var23 = var22 >> 10 & 0x3F;
                int var24 = var22 >> 7 & 0x7;
                int var25 = var22 & 0x7F;
                int var26 = arg1 + var23 & 0x3F;
                int var27 = arg2 / 4 + var24;
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 7) {
                    var27 = 7;
                }
                int var28 = arg3 + var25;
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 127) {
                    var28 = 127;
                }
                this.field852[var21] = (short) (var26 << 10 | var27 << 7 | var28);
            }
            this.field863.field2213 = false;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(SS)V", line = 3502)
    public final void method560(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field831; var3++) {
            if (this.field852[var3] == arg0) {
                this.field852[var3] = arg1;
            }
        }
        this.field863.field2213 = false;
    }

    @OriginalMember(owner = "client!gk", name = "x", descriptor = "()V", line = 3514)
    public final void method561() {
        int var10002;
        if (this.field823 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field846; var3++) {
                int var4 = this.field823[var3] & 0xFF;
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field841 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field841[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field846) {
                int var7 = this.field823[var6] & 0xFF;
                this.field841[var7][var1[var7]++] = var6++;
            }
            this.field823 = null;
        }
        if (this.field848 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field831; var10++) {
            int var11 = this.field848[var10] & 0xFF;
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field854 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field854[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field831) {
            int var14 = this.field848[var13] & 0xFF;
            this.field854[var14][var8[var14]++] = var13++;
        }
        this.field848 = null;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "([FI)[F", line = 3607)
    private static final float[] method562(float[] arg0, int arg1) {
        float[] var2 = new float[arg1];
        class65.method637(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZZZ)Lhm;", line = 3613)
    public final class52 method504(boolean arg0, boolean arg1, boolean arg2) {
        return this.method536(arg0, arg1, arg2, field870, field869);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZZZZZ)V", line = 3617)
    private final void method563(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        int var6 = 0;
        if (arg1) {
            this.field837.field2221 = var6;
            var6 += 12;
        }
        if (arg2) {
            this.field863.field2221 = var6;
            var6 += 4;
        }
        if (arg3) {
            this.field833.field2221 = var6;
            var6 += 12;
        }
        if (arg4) {
            this.field849.field2221 = var6;
            var6 += 8;
        }
        if (var6 == 0) {
            return;
        }
        if (field832.field448.length < this.field864 * var6) {
            field832 = new class25((this.field864 + 100) * var6);
        } else {
            field832.field397 = 0;
        }
        if (arg1) {
            if (class240.field3757) {
                for (int var7 = 0; var7 < this.field836; var7++) {
                    int var8 = Float.floatToRawIntBits((float) this.field844[var7]);
                    int var9 = Float.floatToRawIntBits((float) this.field857[var7]);
                    int var10 = Float.floatToRawIntBits((float) this.field842[var7]);
                    int var11 = this.field853[var7];
                    int var12 = this.field853[var7 + 1];
                    for (int var13 = var11; var13 < var12; var13++) {
                        int var14 = this.field860[var13] - 1;
                        if (var14 == -1) {
                            break;
                        }
                        field832.field397 = var6 * var14;
                        field832.method310(55, var8);
                        field832.method310(116, var9);
                        field832.method310(119, var10);
                    }
                }
            } else {
                for (int var15 = 0; var15 < this.field836; var15++) {
                    int var16 = Float.floatToRawIntBits((float) this.field844[var15]);
                    int var17 = Float.floatToRawIntBits((float) this.field857[var15]);
                    int var18 = Float.floatToRawIntBits((float) this.field842[var15]);
                    int var19 = this.field853[var15];
                    int var20 = this.field853[var15 + 1];
                    for (int var21 = var19; var21 < var20; var21++) {
                        int var22 = this.field860[var21] - 1;
                        if (var22 == -1) {
                            break;
                        }
                        field832.field397 = var6 * var22;
                        field832.method288(true, var16);
                        field832.method288(true, var17);
                        field832.method288(true, var18);
                    }
                }
            }
        }
        if (arg2) {
            if (class59.field927) {
                for (int var42 = 0; var42 < this.field831; var42++) {
                    int var43 = method555(this.field852[var42], this.field820[var42], this.field843, this.field830[var42]);
                    field832.field397 = this.field847[var42] * var6 + this.field863.field2221;
                    field832.method310(48, var43);
                    field832.field397 = this.field861[var42] * var6 + this.field863.field2221;
                    field832.method310(73, var43);
                    field832.field397 = this.field840[var42] * var6 + this.field863.field2221;
                    field832.method310(86, var43);
                }
            } else {
                int var23 = (int) class103.field1549[0];
                int var24 = (int) class103.field1549[1];
                int var25 = (int) class103.field1549[2];
                int var26 = (int) Math.sqrt((double) (var25 * var25 + var23 * var23 + var24 * var24));
                int var27 = (int) ((float) this.field843 * 1.3F);
                int var28 = this.field824 * var26 >> 8;
                for (int var29 = 0; var29 < this.field831; var29++) {
                    short var30 = this.field847[var29];
                    short var31 = this.field828[var30];
                    int var32;
                    if (var31 < 0) {
                        var32 = -var31 - 1;
                    } else {
                        if (var31 == 0) {
                            var32 = (this.field839[var30] * var25 + this.field855[var30] * var24 + this.field827[var30] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var32 = (this.field839[var30] * var25 + this.field855[var30] * var24 + this.field827[var30] * var23) / (var28 * var31) + var27;
                        }
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 > 16384) {
                            var32 = 16384;
                        }
                        this.field828[var30] = (short) (-var32 - 1);
                    }
                    short var33 = this.field861[var29];
                    short var34 = this.field828[var33];
                    int var35;
                    if (var34 < 0) {
                        var35 = -var34 - 1;
                    } else {
                        if (var34 == 0) {
                            var35 = (this.field839[var33] * var25 + this.field855[var33] * var24 + this.field827[var33] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var35 = (this.field839[var33] * var25 + this.field855[var33] * var24 + this.field827[var33] * var23) / (var28 * var34) + var27;
                        }
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 > 16384) {
                            var35 = 16384;
                        }
                        this.field828[var33] = (short) (-var35 - 1);
                    }
                    short var36 = this.field840[var29];
                    short var37 = this.field828[var36];
                    int var38;
                    if (var37 < 0) {
                        var38 = -var37 - 1;
                    } else {
                        if (var37 == 0) {
                            var38 = (this.field839[var36] * var25 + this.field855[var36] * var24 + this.field827[var36] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var38 = (this.field839[var36] * var25 + this.field855[var36] * var24 + this.field827[var36] * var23) / (var28 * var37) + var27;
                        }
                        if (var38 < 0) {
                            var38 = 0;
                        } else if (var38 > 16384) {
                            var38 = 16384;
                        }
                        this.field828[var36] = (short) (-var38 - 1);
                    }
                    int var39 = method555(this.field852[var29], this.field820[var29], var32, this.field830[var29]);
                    int var40 = method555(this.field852[var29], this.field820[var29], var35, this.field830[var29]);
                    int var41 = method555(this.field852[var29], this.field820[var29], var38, this.field830[var29]);
                    field832.field397 = var6 * var30 + this.field863.field2221;
                    field832.method310(51, var39);
                    field832.field397 = var6 * var33 + this.field863.field2221;
                    field832.method310(82, var40);
                    field832.field397 = var6 * var36 + this.field863.field2221;
                    field832.method310(72, var41);
                }
                this.field827 = null;
                this.field855 = null;
                this.field839 = null;
            }
        }
        if (arg3) {
            float var44 = 3.0F / (float) this.field824;
            float var45 = 3.0F / (float) (this.field824 / 2 + this.field824);
            field832.field397 = this.field833.field2221;
            if (class240.field3757) {
                for (int var46 = 0; var46 < this.field864; var46++) {
                    short var47 = this.field828[var46];
                    if (var47 == 0) {
                        field832.method299((float) this.field827[var46] * var45, -891392056);
                        field832.method299((float) this.field855[var46] * var45, -891392056);
                        field832.method299((float) this.field839[var46] * var45, -891392056);
                    } else {
                        float var48 = var44 / (float) var47;
                        field832.method299((float) this.field827[var46] * var48, -891392056);
                        field832.method299((float) this.field855[var46] * var48, -891392056);
                        field832.method299((float) this.field839[var46] * var48, -891392056);
                    }
                    field832.field397 += var6 - 12;
                }
            } else {
                for (int var49 = 0; var49 < this.field864; var49++) {
                    short var50 = this.field828[var49];
                    if (var50 == 0) {
                        field832.method300((byte) -30, (float) this.field827[var49] * var45);
                        field832.method300((byte) -30, (float) this.field855[var49] * var45);
                        field832.method300((byte) -30, (float) this.field839[var49] * var45);
                    } else {
                        float var51 = var44 / (float) var50;
                        field832.method300((byte) -30, (float) this.field827[var49] * var51);
                        field832.method300((byte) -30, (float) this.field855[var49] * var51);
                        field832.method300((byte) -30, (float) this.field839[var49] * var51);
                    }
                    field832.field397 += var6 - 12;
                }
            }
        }
        if (arg4) {
            field832.field397 = this.field849.field2221;
            if (class240.field3757) {
                for (int var52 = 0; var52 < this.field864; var52++) {
                    field832.method299(this.field829[var52], -891392056);
                    field832.method299(this.field821[var52], -891392056);
                    field832.field397 += var6 - 8;
                }
            } else {
                for (int var53 = 0; var53 < this.field864; var53++) {
                    field832.method300((byte) -30, this.field829[var53]);
                    field832.method300((byte) -30, this.field821[var53]);
                    field832.field397 += var6 - 8;
                }
            }
        }
        field832.field397 = this.field864 * var6;
        if (arg0) {
            if (class240.field3755) {
                ByteBuffer var54 = ByteBuffer.wrap(field832.field448, 0, field832.field397);
                if (this.field856 == null) {
                    this.field856 = new class35(true);
                    this.field856.method359(var54);
                } else {
                    this.field856.method361(var54);
                }
                if (arg1) {
                    this.field837.field2213 = true;
                    this.field837.field2222 = null;
                    this.field837.field2218 = this.field856;
                    this.field837.field2214 = var6;
                }
                if (arg2) {
                    this.field863.field2213 = true;
                    this.field863.field2222 = null;
                    this.field863.field2218 = this.field856;
                    this.field863.field2214 = var6;
                }
                if (arg3) {
                    this.field833.field2213 = true;
                    this.field833.field2222 = null;
                    this.field833.field2218 = this.field856;
                    this.field833.field2214 = var6;
                }
                if (arg4) {
                    this.field849.field2213 = true;
                    this.field849.field2222 = null;
                    this.field849.field2218 = this.field856;
                    this.field849.field2214 = var6;
                }
            } else {
                if (field862 == null || field862.capacity() < field832.field397) {
                    field862 = ByteBuffer.allocateDirect(var6 * 100 + field832.field397);
                } else {
                    field862.clear();
                }
                field862.put(field832.field448, 0, field832.field397);
                field862.flip();
                if (arg1) {
                    this.field837.field2213 = true;
                    this.field837.field2222 = field862;
                    this.field837.field2218 = null;
                    this.field837.field2214 = var6;
                }
                if (arg2) {
                    this.field863.field2213 = true;
                    this.field863.field2222 = field862;
                    this.field837.field2218 = null;
                    this.field863.field2214 = var6;
                }
                if (arg3) {
                    this.field833.field2213 = true;
                    this.field833.field2222 = field862;
                    this.field833.field2218 = null;
                    this.field833.field2214 = var6;
                }
                if (arg4) {
                    this.field849.field2213 = true;
                    this.field849.field2222 = field862;
                    this.field849.field2218 = null;
                    this.field849.field2214 = var6;
                }
            }
        } else if (class240.field3764) {
            class35 var55 = new class35();
            ByteBuffer var56 = ByteBuffer.wrap(field832.field448, 0, field832.field397);
            var55.method359(var56);
            if (arg1) {
                this.field837.field2213 = true;
                this.field837.field2222 = null;
                this.field837.field2218 = var55;
                this.field837.field2214 = var6;
            }
            if (arg2) {
                this.field863.field2213 = true;
                this.field863.field2222 = null;
                this.field863.field2218 = var55;
                this.field863.field2214 = var6;
            }
            if (arg3) {
                this.field833.field2213 = true;
                this.field833.field2222 = null;
                this.field833.field2218 = var55;
                this.field833.field2214 = var6;
            }
            if (arg4) {
                this.field849.field2213 = true;
                this.field849.field2222 = null;
                this.field849.field2218 = var55;
                this.field849.field2214 = var6;
            }
        } else {
            ByteBuffer var57 = ByteBuffer.allocateDirect(field832.field397);
            var57.put(field832.field448, 0, field832.field397);
            var57.flip();
            if (arg1) {
                this.field837.field2213 = true;
                this.field837.field2222 = var57;
                this.field837.field2218 = null;
                this.field837.field2214 = var6;
            }
            if (arg2) {
                this.field863.field2213 = true;
                this.field863.field2222 = var57;
                this.field837.field2218 = null;
                this.field863.field2214 = var6;
            }
            if (arg3) {
                this.field833.field2213 = true;
                this.field833.field2222 = var57;
                this.field833.field2218 = null;
                this.field833.field2214 = var6;
            }
            if (arg4) {
                this.field849.field2213 = true;
                this.field849.field2222 = var57;
                this.field849.field2218 = null;
                this.field849.field2214 = var6;
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(SS)V", line = 4148)
    public final void method564(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field831; var3++) {
            if (this.field820[var3] == arg0) {
                this.field820[var3] = arg1;
            }
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 != -1) {
            var4 = class107.field1619.method752(arg0 & 0xFFFF, (byte) -21);
            var5 = class107.field1619.method762(-111, arg0 & 0xFFFF);
        }
        int var6 = 0;
        int var7 = 0;
        if (arg1 != -1) {
            var6 = class107.field1619.method752(arg1 & 0xFFFF, (byte) -21);
            var7 = class107.field1619.method762(-39, arg1 & 0xFFFF);
        }
        if (var4 != var6 || var5 != var7) {
            this.field863.field2213 = false;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIII[FIF)V", line = 4183)
    private static final void method565(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8) {
        int var9 = arg0 - arg3;
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg5;
        float var12 = arg6[2] * (float) var11 + arg6[0] * (float) var9 + arg6[1] * (float) var10;
        float var13 = arg6[5] * (float) var11 + arg6[3] * (float) var9 + arg6[4] * (float) var10;
        float var14 = arg6[8] * (float) var11 + arg6[6] * (float) var9 + arg6[7] * (float) var10;
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = (float) Math.atan2((double) var12, (double) var14) / 6.2831855F + 0.5F;
        float var17 = (float) Math.asin((double) (var13 / var15)) / 3.1415927F + arg8 + 0.5F;
        if (arg7 == 1) {
            float var18 = var16;
            var16 = -var17;
            var17 = var18;
        } else if (arg7 == 2) {
            var16 = -var16;
            var17 = -var17;
        } else if (arg7 == 3) {
            float var19 = var16;
            var16 = var17;
            var17 = -var19;
        }
        field880 = var16;
        field875 = var17;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "()Z", line = 4229)
    public final boolean method390() {
        return this.field819 && this.field844 != null && this.field827 != null;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "([SI)[S", line = 4235)
    private static final short[] method566(short[] arg0, int arg1) {
        short[] var2 = new short[arg1];
        class65.method643(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!gk", name = "y", descriptor = "()V", line = 4244)
    public static void method567() {
        field835 = null;
        field832 = null;
        field862 = null;
        field858 = null;
        field866 = null;
        field867 = null;
        field868 = null;
        field869 = null;
        field870 = null;
        field874 = null;
        field881 = null;
    }

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "()Z", line = 4257)
    public final boolean method492() {
        if (this.field841 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field846; var1++) {
            this.field844[var1] <<= 0x4;
            this.field857[var1] <<= 0x4;
            this.field842[var1] <<= 0x4;
        }
        field876 = 0;
        field882 = 0;
        field877 = 0;
        return true;
    }

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "()I", line = 4279)
    public final int method489() {
        if (!this.field834.field1396) {
            this.method551();
        }
        return this.field834.field1397;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(III)V", line = 4289)
    public final void method511(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field846; var4++) {
            this.field844[var4] = this.field844[var4] * arg0 >> 7;
            this.field857[var4] = this.field857[var4] * arg1 >> 7;
            this.field842[var4] = this.field842[var4] * arg2 >> 7;
        }
        this.field834.field1396 = false;
        this.field837.field2213 = false;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lqf;IIIZ)V", line = 5074)
    public final void method394(class64 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class56 var6 = (class56) arg0;
        if (this.field831 == 0 || var6.field831 == 0) {
            return;
        }
        int var7 = var6.field836;
        int[] var8 = var6.field844;
        int[] var9 = var6.field857;
        int[] var10 = var6.field842;
        short[] var11 = var6.field827;
        short[] var12 = var6.field855;
        short[] var13 = var6.field839;
        short[] var14 = var6.field828;
        short[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field822 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field822.field2262;
            var16 = this.field822.field2265;
            var17 = this.field822.field2264;
            var18 = this.field822.field2263;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field822 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field822.field2262;
            var20 = var6.field822.field2265;
            var21 = var6.field822.field2264;
            var22 = var6.field822.field2263;
        }
        int[] var23 = var6.field853;
        short[] var24 = var6.field860;
        if (!var6.field834.field1396) {
            var6.method551();
        }
        short var25 = var6.field834.field1395;
        short var26 = var6.field834.field1398;
        short var27 = var6.field834.field1394;
        short var28 = var6.field834.field1393;
        short var29 = var6.field834.field1397;
        short var30 = var6.field834.field1400;
        for (int var31 = 0; var31 < this.field836; var31++) {
            int var32 = this.field857[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field844[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field842[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field853[var31];
                        int var37 = this.field853[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field860[var38] - 1;
                            if (var35 == -1 || this.field828[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = -1;
                                    int var41 = var23[var39];
                                    int var42 = var23[var39 + 1];
                                    for (int var43 = var41; var43 < var42; var43++) {
                                        var40 = var24[var43] - 1;
                                        if (var40 == -1 || var14[var40] != 0) {
                                            break;
                                        }
                                    }
                                    if (var40 != -1) {
                                        if (var15 == null) {
                                            this.field822 = new class136();
                                            var15 = this.field822.field2262 = class150.method1248(3, this.field827);
                                            var16 = this.field822.field2265 = class150.method1248(3, this.field855);
                                            var17 = this.field822.field2264 = class150.method1248(3, this.field839);
                                            var18 = this.field822.field2263 = class150.method1248(3, this.field828);
                                        }
                                        if (var19 == null) {
                                            class136 var44 = var6.field822 = new class136();
                                            var19 = var44.field2262 = class150.method1248(3, var11);
                                            var20 = var44.field2265 = class150.method1248(3, var12);
                                            var21 = var44.field2264 = class150.method1248(3, var13);
                                            var22 = var44.field2263 = class150.method1248(3, var14);
                                        }
                                        short var45 = this.field827[var35];
                                        short var46 = this.field855[var35];
                                        short var47 = this.field839[var35];
                                        short var48 = this.field828[var35];
                                        int var49 = var23[var39];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var49; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var22[var52] != 0) {
                                                var19[var52] += var45;
                                                var20[var52] += var46;
                                                var21[var52] += var47;
                                                var22[var52] += var48;
                                            }
                                        }
                                        short var53 = var11[var40];
                                        short var54 = var12[var40];
                                        short var55 = var13[var40];
                                        short var56 = var14[var40];
                                        int var57 = this.field853[var31];
                                        int var58 = this.field853[var31 + 1];
                                        for (int var59 = var57; var59 < var58; var59++) {
                                            int var60 = this.field860[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var18[var60] != 0) {
                                                var15[var60] += var53;
                                                var16[var60] += var54;
                                                var17[var60] += var55;
                                                var18[var60] += var56;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
