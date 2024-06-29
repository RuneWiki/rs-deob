import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class201 {

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    private int field3937;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "[[I")
    private int[][] field3930;

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "I")
    private int field3947;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "Lai;")
    public static class10 field3929 = class44.method278("Art", -17);

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "Lai;")
    public static class10 field3941 = class44.method278("b12_full", 122);

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "Lai;")
    public static class10 field3931 = class44.method278("scape main", -39);

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "Lai;")
    public static class10 field3945 = class44.method278("http:)4)4www)3runescape)3com", -30);

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "Lai;")
    private static class10 field3934 = class44.method278("scroll:", 96);

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "Lai;")
    public static class10 field3939 = field3934;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "Lai;")
    public static class10 field3936 = field3934;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "Lc;")
    public static class21 field3942;

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "Lca;")
    public static class22 field3949;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "[I")
    public static int[] field3935;

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "[I")
    public static int[] field3943;

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "[I")
    public static int[] field3944;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
    public static void method1303(byte arg0) {
        field3941 = null;
        field3942 = null;
        if (arg0 > -48) {
            field3942 = null;
        }
        field3949 = null;
        field3934 = null;
        field3929 = null;
        field3939 = null;
        field3935 = null;
        field3943 = null;
        field3945 = null;
        field3944 = null;
        field3936 = null;
        field3931 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1304(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 66 / ((arg5 - 43) / 41);
        field3946++;
        if (class42.method270(arg7, (byte) -81)) {
            class58.method393(arg1, arg6, class205.field3990[arg7], (byte) 23, arg0, arg2, -1, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lai;Lai;Lai;ZI)V")
    public static final void method1305(class10 arg0, class10 arg1, class10 arg2, boolean arg3, int arg4) {
        field3933++;
        for (int var5 = 99; var5 > 0; var5--) {
            class27.field404[var5] = class27.field404[var5 - 1];
            class65.field1094[var5] = class65.field1094[var5 - 1];
            client.field443[var5] = client.field443[var5 - 1];
            class174.field3356[var5] = class174.field3356[var5 - 1];
        }
        if (arg3) {
            method1304(-97, -70, 8, -126, -84, -28, -125, 82);
        }
        class169.field3257++;
        class27.field404[0] = arg4;
        class125.field2393 = class7.field78;
        class65.field1094[0] = arg1;
        client.field443[0] = arg2;
        class174.field3356[0] = arg0;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I[B)[B")
    public final byte[] method1306(int arg0, byte[] arg1) {
        if (this.field3930 != null) {
            int var3 = 0;
            int var4 = 0;
            int var5 = (int) ((long) arg1.length * (long) this.field3947 / (long) this.field3937) + 14;
            int[] var6 = new int[var5];
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field3930[var4];
                for (int var12 = 0; var12 < 14; var12++) {
                    var6[var3 + var12] += var11[var12] * var10;
                }
                int var13 = this.field3947 + var4;
                int var14 = var13 / this.field3937;
                var4 = var13 - this.field3937 * var14;
                var3 += var14;
            }
            arg1 = new byte[var5];
            for (int var8 = 0; var8 < var5; var8++) {
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
        if (arg0 != 15120) {
            method1304(40, 11, -31, -105, 17, -35, 99, -21);
        }
        field3940++;
        return arg1;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)I")
    public final int method1307(int arg0, int arg1) {
        if (this.field3930 != null) {
            arg0 = (int) ((long) this.field3947 * (long) arg0 / (long) this.field3937);
        }
        field3948++;
        if (arg1 != -1) {
            this.field3937 = 33;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(II)V")
    public class201(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = client.method188(arg0, arg1, -89);
            int var4 = arg0 / var3;
            this.field3937 = var4;
            this.field3930 = new int[var4][14];
            int var5 = arg1 / var3;
            this.field3947 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                double var7 = (double) var6 / (double) var4 + 6.0D;
                int[] var9 = this.field3930[var6];
                double var10 = (double) var5 / (double) var4;
                int var12 = (int) Math.floor(var7 + 1.0D - 7.0D);
                if (var12 < 0) {
                    var12 = 0;
                }
                int var13 = (int) Math.ceil(var7 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var13 > var12) {
                    double var14 = ((double) var12 - var7) * 3.141592653589793D;
                    double var16 = var10;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var10 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var12 - var7) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var9[var12] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var12++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IB)I")
    public final int method1308(int arg0, byte arg1) {
        if (this.field3930 != null) {
            arg0 = (int) ((long) this.field3947 * (long) arg0 / (long) this.field3937) + 6;
        }
        field3938++;
        if (arg1 != -3) {
            this.method1306(-119, null);
        }
        return arg0;
    }
}
