import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class200 {

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    private int field3341;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "[[I")
    private int[][] field3342;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    private int field3343;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "Lhd;")
    public static class117 field3344 = new class117(100);

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "[I")
    public static int[] field3346 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "Lok;")
    public static class146 field3347 = class235.method1724(-12908, "Textures charg-Bes");

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "Lok;")
    public static class146 field3345 = class235.method1724(-12908, "<img=1>");

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "[Lpl;")
    public static class188[] field3348;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)I", line = 6)
    public final int method1535(int arg0, int arg1) {
        if (arg1 < 30) {
            method1536(-35, 94, 83, -67, -81, 28, 102, 81);
        }
        if (this.field3342 != null) {
            arg0 = (int) ((long) this.field3341 * (long) arg0 / (long) this.field3343);
        }
        field3337++;
        return arg0;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIIIII)V", line = 25)
    public static final void method1536(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class271.field4640) {
            int var8 = arg1 - 334;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 100) {
                var8 = 100;
            }
            int var9 = (class72.field1171 - class62.field1068) * var8 / 100 + class62.field1068;
            arg5 = arg5 * var9 >> 8;
        }
        field3340++;
        int var10 = 2048 - arg3 & 0x7FF;
        int var11 = 2048 - arg4 & 0x7FF;
        int var12 = 0;
        int var13 = 0;
        int var14 = arg5;
        if (arg7 != 30637) {
            method1539(123);
        }
        if (var10 != 0) {
            int var15 = class109.field1750[var10];
            int var16 = class109.field1757[var10];
            var13 = -arg5 * var15 >> 16;
            var14 = arg5 * var16 >> 16;
        }
        if (var11 != 0) {
            int var17 = class109.field1750[var11];
            var12 = var14 * var17 >> 16;
            int var18 = class109.field1757[var11];
            var14 = var14 * var18 >> 16;
        }
        class107.field1742 = arg6 - var12;
        class63.field1088 = arg3;
        class161.field2719 = arg2 - var14;
        class79.field1269 = arg4;
        class151.field2572 = arg0 - var13;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "([BZ)[B", line = 91)
    public final byte[] method1537(byte[] arg0, boolean arg1) {
        field3339++;
        if (this.field3342 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field3341 / (long) this.field3343) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var8 = arg0[var7];
                int[] var9 = this.field3342[var5];
                for (int var10 = 0; var10 < 14; var10++) {
                    var4[var6 + var10] += var9[var10] * var8;
                }
                int var11 = this.field3341 + var5;
                int var12 = var11 / this.field3343;
                var6 += var12;
                var5 = var11 - this.field3343 * var12;
            }
            arg0 = new byte[var3];
            for (int var13 = 0; var13 < var3; var13++) {
                int var14 = var4[var13] + 32768 >> 16;
                if (var14 < -128) {
                    arg0[var13] = -128;
                } else if (var14 > 127) {
                    arg0[var13] = 127;
                } else {
                    arg0[var13] = (byte) var14;
                }
            }
        }
        if (!arg1) {
            this.field3342 = (int[][]) ((int[][]) null);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IB)I", line = 158)
    public final int method1538(int arg0, byte arg1) {
        if (arg1 != 99) {
            return 8;
        }
        field3338++;
        if (this.field3342 != null) {
            arg0 = (int) ((long) this.field3341 * (long) arg0 / (long) this.field3343) + 6;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V", line = 179)
    public static void method1539(int arg0) {
        field3346 = null;
        field3347 = null;
        field3348 = null;
        field3345 = null;
        if (arg0 != -13798) {
            field3345 = (class146) null;
        }
        field3344 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIILbf;Lbf;IIJ)V", line = 199)
    public static final void method1540(int arg0, int arg1, int arg2, int arg3, class322 arg4, class322 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class278 var10 = new class278();
        var10.field4780 = arg8;
        var10.field4782 = arg1 * 128 + 64;
        var10.field4777 = arg2 * 128 + 64;
        var10.field4775 = arg3;
        var10.field4779 = arg4;
        var10.field4774 = arg5;
        var10.field4773 = arg6;
        var10.field4765 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class203.field3382[var11][arg1][arg2] == null) {
                class203.field3382[var11][arg1][arg2] = new class11(var11, arg1, arg2);
            }
        }
        class203.field3382[arg0][arg1][arg2].field212 = var10;
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(II)V", line = 247)
    public class200(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class180.method1413(arg0, arg1, 91);
            int var4 = arg1 / var3;
            this.field3341 = var4;
            int var5 = arg0 / var3;
            this.field3342 = new int[var5][14];
            this.field3343 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field3342[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                double var11 = (double) var4 / (double) var5;
                int var13 = (int) Math.ceil(var8 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var10 < var13) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var11;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var11 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
