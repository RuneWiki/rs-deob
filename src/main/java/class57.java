import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class57 extends class234 {

    @OriginalMember(owner = "client!qk", name = "q", descriptor = "I")
    private int field927 = 0;

    @OriginalMember(owner = "client!qk", name = "y", descriptor = "I")
    private int field935 = 0;

    @OriginalMember(owner = "client!qk", name = "Q", descriptor = "I")
    public int field953 = 0;

    @OriginalMember(owner = "client!qk", name = "S", descriptor = "Z")
    public boolean field955 = false;

    @OriginalMember(owner = "client!qk", name = "w", descriptor = "B")
    private byte field933 = 0;

    @OriginalMember(owner = "client!qk", name = "X", descriptor = "B")
    private byte field960 = 0;

    @OriginalMember(owner = "client!qk", name = "T", descriptor = "[I")
    private int[] field956;

    @OriginalMember(owner = "client!qk", name = "C", descriptor = "[I")
    public int[] field939;

    @OriginalMember(owner = "client!qk", name = "B", descriptor = "[I")
    public int[] field938;

    @OriginalMember(owner = "client!qk", name = "H", descriptor = "[I")
    public int[] field944;

    @OriginalMember(owner = "client!qk", name = "x", descriptor = "[I")
    private int[] field934;

    @OriginalMember(owner = "client!qk", name = "z", descriptor = "[S")
    private short[] field936;

    @OriginalMember(owner = "client!qk", name = "t", descriptor = "[S")
    private short[] field930;

    @OriginalMember(owner = "client!qk", name = "A", descriptor = "[S")
    private short[] field937;

    @OriginalMember(owner = "client!qk", name = "E", descriptor = "[S")
    private short[] field941;

    @OriginalMember(owner = "client!qk", name = "u", descriptor = "[F")
    private float[] field931;

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "[F")
    private float[] field924;

    @OriginalMember(owner = "client!qk", name = "W", descriptor = "[S")
    private short[] field959;

    @OriginalMember(owner = "client!qk", name = "O", descriptor = "[B")
    private byte[] field951;

    @OriginalMember(owner = "client!qk", name = "Y", descriptor = "[S")
    private short[] field961;

    @OriginalMember(owner = "client!qk", name = "U", descriptor = "[S")
    private short[] field957;

    @OriginalMember(owner = "client!qk", name = "p", descriptor = "[S")
    private short[] field926;

    @OriginalMember(owner = "client!qk", name = "L", descriptor = "[S")
    private short[] field948;

    @OriginalMember(owner = "client!qk", name = "J", descriptor = "[B")
    private byte[] field946;

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "Loc;")
    public class135 field923;

    @OriginalMember(owner = "client!qk", name = "bb", descriptor = "Lve;")
    public class252 field964;

    @OriginalMember(owner = "client!qk", name = "r", descriptor = "Lve;")
    private class252 field928;

    @OriginalMember(owner = "client!qk", name = "D", descriptor = "Lve;")
    private class252 field940;

    @OriginalMember(owner = "client!qk", name = "I", descriptor = "Lve;")
    private class252 field945;

    @OriginalMember(owner = "client!qk", name = "N", descriptor = "Lve;")
    private class252 field950;

    @OriginalMember(owner = "client!qk", name = "K", descriptor = "S")
    private short field947;

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "S")
    private short field925;

    @OriginalMember(owner = "client!qk", name = "F", descriptor = "[S")
    private short[] field942;

    @OriginalMember(owner = "client!qk", name = "v", descriptor = "[I")
    private int[] field932;

    @OriginalMember(owner = "client!qk", name = "s", descriptor = "Lja;")
    private static class60 field929 = new class60(10000);

    @OriginalMember(owner = "client!qk", name = "Z", descriptor = "Lqk;")
    private static class57 field962 = new class57();

    @OriginalMember(owner = "client!qk", name = "cb", descriptor = "Lqk;")
    private static class57 field965 = new class57();

    @OriginalMember(owner = "client!qk", name = "db", descriptor = "Lqk;")
    private static class57 field966 = new class57();

    @OriginalMember(owner = "client!qk", name = "eb", descriptor = "Lqk;")
    private static class57 field967 = new class57();

    @OriginalMember(owner = "client!qk", name = "lb", descriptor = "[I")
    private static int[] field974 = new int[1];

    @OriginalMember(owner = "client!qk", name = "ib", descriptor = "[I")
    private static int[] field971 = new int[1];

    @OriginalMember(owner = "client!qk", name = "gb", descriptor = "F")
    private static float field969;

    @OriginalMember(owner = "client!qk", name = "hb", descriptor = "F")
    private static float field970;

    @OriginalMember(owner = "client!qk", name = "kb", descriptor = "F")
    private static float field973;

    @OriginalMember(owner = "client!qk", name = "mb", descriptor = "F")
    private static float field975;

    @OriginalMember(owner = "client!qk", name = "nb", descriptor = "F")
    private static float field976;

    @OriginalMember(owner = "client!qk", name = "pb", descriptor = "F")
    private static float field978;

    @OriginalMember(owner = "client!qk", name = "fb", descriptor = "I")
    private static int field968;

    @OriginalMember(owner = "client!qk", name = "jb", descriptor = "I")
    private static int field972;

    @OriginalMember(owner = "client!qk", name = "ob", descriptor = "I")
    private static int field977;

    @OriginalMember(owner = "client!qk", name = "ab", descriptor = "Lrh;")
    private class128 field963;

    @OriginalMember(owner = "client!qk", name = "M", descriptor = "Lsl;")
    private class92 field949;

    @OriginalMember(owner = "client!qk", name = "R", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field954;

    @OriginalMember(owner = "client!qk", name = "G", descriptor = "[J")
    private static long[] field943;

    @OriginalMember(owner = "client!qk", name = "P", descriptor = "[[I")
    private int[][] field952;

    @OriginalMember(owner = "client!qk", name = "V", descriptor = "[[I")
    private int[][] field958;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZZZZZZZZZZZ)Lqk;", line = 9)
    public final class57 method406(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9, boolean arg10) {
        class57 var12 = new class57();
        var12.field953 = this.field953;
        var12.field935 = this.field935;
        var12.field927 = this.field927;
        if (arg0) {
            var12.field939 = this.field939;
            var12.field944 = this.field944;
        } else {
            var12.field939 = class175.method1290((byte) -55, this.field939);
            var12.field944 = class175.method1290((byte) -83, this.field944);
        }
        if (arg1) {
            var12.field938 = this.field938;
        } else {
            var12.field938 = class175.method1290((byte) -119, this.field938);
        }
        if (arg0 && arg1) {
            var12.field964 = this.field964;
            var12.field923 = this.field923;
        } else {
            var12.field964 = new class252();
            var12.field923 = new class135();
        }
        if (arg2) {
            var12.field959 = this.field959;
        } else {
            var12.field959 = class11.method55(this.field959, (byte) 44);
        }
        if (arg3) {
            var12.field951 = this.field951;
        } else {
            var12.field951 = class287.method2019(this.field951, -18050);
        }
        if (!arg2 || !arg3 || !arg4 || (!arg7 || !arg5) && !class116.field1970) {
            var12.field928 = new class252();
        } else {
            var12.field928 = this.field928;
        }
        if (arg5) {
            var12.field936 = this.field936;
            var12.field930 = this.field930;
            var12.field937 = this.field937;
            var12.field941 = this.field941;
        } else {
            var12.field936 = class11.method55(this.field936, (byte) 44);
            var12.field930 = class11.method55(this.field930, (byte) 44);
            var12.field937 = class11.method55(this.field937, (byte) 44);
            var12.field941 = class11.method55(this.field941, (byte) 44);
        }
        if (!class116.field1970) {
            var12.field940 = null;
        } else if (arg5 && arg6 && arg7) {
            var12.field940 = this.field940;
        } else {
            var12.field940 = new class252();
        }
        if (arg8) {
            var12.field931 = this.field931;
            var12.field924 = this.field924;
            var12.field945 = this.field945;
        } else {
            var12.field931 = class10.method51(this.field931, (byte) -101);
            var12.field924 = class10.method51(this.field924, (byte) -77);
            var12.field945 = new class252();
        }
        if (arg9) {
            var12.field961 = this.field961;
            var12.field957 = this.field957;
            var12.field926 = this.field926;
            var12.field950 = this.field950;
        } else {
            var12.field961 = class11.method55(this.field961, (byte) 44);
            var12.field957 = class11.method55(this.field957, (byte) 44);
            var12.field926 = class11.method55(this.field926, (byte) 44);
            var12.field950 = new class252();
        }
        if (arg10) {
            var12.field948 = this.field948;
        } else {
            var12.field948 = class11.method55(this.field948, (byte) 44);
        }
        var12.field934 = this.field934;
        var12.field958 = this.field958;
        var12.field946 = this.field946;
        var12.field952 = this.field952;
        var12.field932 = this.field932;
        var12.field942 = this.field942;
        var12.field956 = this.field956;
        var12.field947 = this.field947;
        var12.field925 = this.field925;
        return var12;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V", line = 143)
    public final void method407(int arg0) {
        int var2 = class21.field288[arg0];
        int var3 = class21.field286[arg0];
        for (int var4 = 0; var4 < this.field953; var4++) {
            int var5 = this.field938[var4] * var3 - this.field944[var4] * var2 >> 16;
            this.field944[var4] = this.field944[var4] * var3 + this.field938[var4] * var2 >> 16;
            this.field938[var4] = var5;
        }
        this.field923.field2316 = false;
        this.field964.field4227 = false;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIIII)V", line = 163)
    public final void method408(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field935 == 0) {
            return;
        }
        GL var8 = class47.field739;
        var8.glPushMatrix();
        if (arg3 != 0) {
            var8.glRotatef((float) arg3 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        var8.glTranslatef((float) arg4, (float) arg5, (float) arg6);
        if (arg1 != 0) {
            var8.glRotatef((float) arg1 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        }
        if (arg0 != 0) {
            var8.glRotatef((float) arg0 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        if (arg2 != 0) {
            var8.glRotatef((float) (-arg2) * 0.17578125F, 0.0F, 0.0F, 1.0F);
        }
        this.method427();
        var8.glPopMatrix();
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIIIIIJ)V", line = 186)
    public final void method409(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        if (this.field935 == 0) {
            return;
        }
        if (!this.field923.field2316) {
            this.method452();
        }
        short var11 = this.field923.field2315;
        short var12 = this.field923.field2318;
        short var13 = this.field923.field2317;
        int var14 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var15 = arg1 * arg6 + arg2 * var14 >> 16;
        int var16 = (arg1 * var13 + arg2 * var11 >> 16) + var15;
        if (var16 <= 50) {
            return;
        }
        int var17 = (-var11 * arg2 + arg1 * var12 >> 16) + var15;
        if (var17 >= 3584) {
            return;
        }
        int var18 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var19 = var11 + var18 << 9;
        if (var19 / var16 <= class253.field4250) {
            return;
        }
        int var20 = var18 - var11 << 9;
        if (var20 / var16 >= class297.field5083) {
            return;
        }
        int var21 = arg2 * arg6 - arg1 * var14 >> 16;
        int var22 = (arg1 * var11 + arg2 * var13 >> 16) + var21 << 9;
        if (var22 / var16 <= class180.field3021) {
            return;
        }
        int var23 = (-var11 * arg1 + arg2 * var12 >> 16) + var21 << 9;
        if (var23 / var16 >= class2.field5) {
            return;
        }
        int var24 = 0;
        int var25 = 0;
        if (arg0 != 0) {
            var24 = class21.field288[arg0];
            var25 = class21.field286[arg0];
        }
        if (arg8 > 0L && class82.field1372 && var17 > 0) {
            int var26;
            int var27;
            if (var18 > 0) {
                var26 = var20 / var16;
                var27 = var19 / var17;
            } else {
                var26 = var20 / var17;
                var27 = var19 / var16;
            }
            int var28;
            int var29;
            if (var21 > 0) {
                var28 = var23 / var16;
                var29 = var22 / var17;
            } else {
                var28 = var23 / var17;
                var29 = var22 / var16;
            }
            if (class11.field155 >= var26 && class11.field155 <= var27 && class161.field2740 >= var28 && class161.field2740 <= var29) {
                int var30 = 999999;
                int var31 = -999999;
                int var32 = 999999;
                int var33 = -999999;
                short var34 = this.field923.field2321;
                short var35 = this.field923.field2320;
                short var36 = this.field923.field2322;
                short var37 = this.field923.field2319;
                int[] var38 = new int[] { var34, var35, var34, var35, var34, var35, var34, var35 };
                int[] var39 = new int[] { var36, var36, var37, var37, var36, var36, var37, var37 };
                int[] var40 = new int[] { var12, var12, var12, var12, var13, var13, var13, var13 };
                for (int var41 = 0; var41 < 8; var41++) {
                    int var42 = var38[var41];
                    int var43 = var40[var41];
                    int var44 = var39[var41];
                    if (arg0 != 0) {
                        int var45 = var24 * var44 + var25 * var42 >> 16;
                        var44 = var25 * var44 - var24 * var42 >> 16;
                        var42 = var45;
                    }
                    int var46 = arg5 + var42;
                    int var47 = arg6 + var43;
                    int var48 = arg7 + var44;
                    int var49 = arg3 * var48 + arg4 * var46 >> 16;
                    int var50 = arg4 * var48 - arg3 * var46 >> 16;
                    int var52 = arg2 * var47 - arg1 * var50 >> 16;
                    int var53 = arg1 * var47 + arg2 * var50 >> 16;
                    if (var53 > 0) {
                        int var55 = (var49 << 9) / var53;
                        int var56 = (var52 << 9) / var53;
                        if (var55 < var30) {
                            var30 = var55;
                        }
                        if (var55 > var31) {
                            var31 = var55;
                        }
                        if (var56 < var32) {
                            var32 = var56;
                        }
                        if (var56 > var33) {
                            var33 = var56;
                        }
                    }
                }
                if (class11.field155 >= var30 && class11.field155 <= var31 && class161.field2740 >= var32 && class161.field2740 <= var33) {
                    if (this.field3956) {
                        class210.field3586[class120.field2023++] = arg8;
                    } else {
                        if (field974.length < this.field935) {
                            field974 = new int[this.field935];
                            field971 = new int[this.field935];
                        }
                        int var57 = 0;
                        label118: while (true) {
                            if (var57 >= this.field953) {
                                int var77 = 0;
                                while (true) {
                                    if (var77 >= this.field927) {
                                        break label118;
                                    }
                                    short var78 = this.field961[var77];
                                    short var79 = this.field957[var77];
                                    short var80 = this.field926[var77];
                                    if (this.method415(class11.field155, class161.field2740, field971[var78], field971[var79], field971[var80], field974[var78], field974[var79], field974[var80])) {
                                        class210.field3586[class120.field2023++] = arg8;
                                        break label118;
                                    }
                                    var77++;
                                }
                            }
                            int var58 = this.field939[var57];
                            int var59 = this.field938[var57];
                            int var60 = this.field944[var57];
                            if (arg0 != 0) {
                                int var61 = var24 * var60 + var25 * var58 >> 16;
                                var60 = var25 * var60 - var24 * var58 >> 16;
                                var58 = var61;
                            }
                            int var62 = arg5 + var58;
                            int var63 = arg6 + var59;
                            int var64 = arg7 + var60;
                            int var65 = arg3 * var64 + arg4 * var62 >> 16;
                            int var66 = arg4 * var64 - arg3 * var62 >> 16;
                            int var68 = arg2 * var63 - arg1 * var66 >> 16;
                            int var69 = arg1 * var63 + arg2 * var66 >> 16;
                            if (var69 < 50) {
                                break;
                            }
                            int var71 = (var65 << 9) / var69;
                            int var72 = (var68 << 9) / var69;
                            int var73 = this.field956[var57];
                            int var74 = this.field956[var57 + 1];
                            for (int var75 = var73; var75 < var74; var75++) {
                                int var76 = this.field942[var75] - 1;
                                if (var76 == -1) {
                                    break;
                                }
                                field974[var76] = var71;
                                field971[var76] = var72;
                            }
                            var57++;
                        }
                    }
                }
            }
        }
        GL var81 = class47.field739;
        var81.glPushMatrix();
        var81.glTranslatef((float) arg5, (float) arg6, (float) arg7);
        var81.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        this.method427();
        var81.glPopMatrix();
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(III)V", line = 459)
    public final void method410(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field953; var4++) {
            this.field939[var4] += arg0;
            this.field938[var4] += arg1;
            this.field944[var4] += arg2;
        }
        this.field923.field2316 = false;
        this.field964.field4227 = false;
    }

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "()I", line = 472)
    public final int method411() {
        if (!this.field923.field2316) {
            this.method452();
        }
        return this.field923.field2320;
    }

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "()I", line = 479)
    public final int method412() {
        if (!this.field923.field2316) {
            this.method452();
        }
        return this.field923.field2319;
    }

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "()V", line = 491)
    public final void method413() {
        for (int var1 = 0; var1 < this.field953; var1++) {
            this.field939[var1] = -this.field939[var1];
            this.field944[var1] = -this.field944[var1];
        }
        this.field923.field2316 = false;
        this.field964.field4227 = false;
    }

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "()V", line = 503)
    public final void method414() {
        if (this.field936 == null) {
            this.method413();
            return;
        }
        for (int var1 = 0; var1 < this.field953; var1++) {
            this.field939[var1] = -this.field939[var1];
            this.field944[var1] = -this.field944[var1];
        }
        for (int var2 = 0; var2 < this.field935; var2++) {
            this.field936[var2] = (short) (-this.field936[var2]);
            this.field937[var2] = (short) (-this.field937[var2]);
        }
        this.field923.field2316 = false;
        this.field964.field4227 = false;
        if (this.field940 != null) {
            this.field940.field4227 = false;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIIIII)Z", line = 536)
    private final boolean method415(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "()V", line = 3716)
    private class57() {
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lll;IIZ)V", line = 3722)
    public class57(class146 arg0, int arg1, int arg2, boolean arg3) {
        int[] var5 = new int[arg0.field2514];
        this.field956 = new int[arg0.field2535 + 1];
        for (int var6 = 0; var6 < arg0.field2514; var6++) {
            if ((arg0.field2528 == null || arg0.field2528[var6] != 2) && (arg0.field2533 == null || arg0.field2533[var6] == -1 || !class21.field279.method1073(arg0.field2533[var6] & 0xFFFF, -121))) {
                var5[this.field927++] = var6;
                this.field956[arg0.field2510[var6]]++;
                this.field956[arg0.field2504[var6]]++;
                this.field956[arg0.field2539[var6]]++;
            }
        }
        long[] var7 = new long[this.field927];
        for (int var8 = 0; var8 < this.field927; var8++) {
            int var9 = var5[var8];
            int var10 = 0;
            byte var11 = 0;
            int var12 = 0;
            int var13 = 0;
            short var14 = -1;
            if (arg0.field2533 != null) {
                var14 = arg0.field2533[var9];
                if (var14 != -1) {
                    var12 = class21.field279.method1057(var14 & 0xFFFF, (byte) -71);
                    var13 = class21.field279.method1061(var14 & 0xFFFF, -2);
                }
            }
            boolean var15 = arg0.field2516 != null && arg0.field2516[var9] != 0 || var14 != -1 && !class21.field279.method1060(var14 & 0xFFFF, (byte) -63);
            if ((arg3 || var15) && arg0.field2508 != null) {
                var10 += arg0.field2508[var9] << 17;
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
        class81.method682(var7, (byte) -54, var5);
        this.field953 = arg0.field2535;
        this.field939 = arg0.field2507;
        this.field938 = arg0.field2518;
        this.field944 = arg0.field2547;
        this.field934 = arg0.field2541;
        int var20 = this.field927 * 3;
        this.field936 = new short[var20];
        this.field930 = new short[var20];
        this.field937 = new short[var20];
        this.field941 = new short[var20];
        this.field931 = new float[var20];
        this.field924 = new float[var20];
        this.field959 = new short[this.field927];
        this.field951 = new byte[this.field927];
        this.field961 = new short[this.field927];
        this.field957 = new short[this.field927];
        this.field926 = new short[this.field927];
        this.field948 = new short[this.field927];
        if (arg0.field2526 != null) {
            this.field946 = new byte[this.field927];
        }
        this.field923 = new class135();
        this.field964 = new class252();
        this.field928 = new class252();
        if (class116.field1970) {
            this.field940 = new class252();
        }
        this.field945 = new class252();
        this.field950 = new class252();
        this.field947 = (short) arg1;
        this.field925 = (short) arg2;
        this.field942 = new short[var20];
        field943 = new long[var20];
        int var21 = 0;
        for (int var22 = 0; var22 < arg0.field2535; var22++) {
            int var23 = this.field956[var22];
            this.field956[var22] = var21;
            var21 += var23;
        }
        this.field956[arg0.field2535] = var21;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = (float[][]) null;
        if (arg0.field2515 != null) {
            int var28 = arg0.field2517;
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
            for (int var36 = 0; var36 < this.field927; var36++) {
                int var37 = var5[var36];
                if (arg0.field2515[var37] != -1) {
                    int var38 = arg0.field2515[var37] & 0xFF;
                    for (int var39 = 0; var39 < 3; var39++) {
                        int var40;
                        if (var39 == 0) {
                            var40 = arg0.field2510[var37];
                        } else if (var39 == 1) {
                            var40 = arg0.field2504[var37];
                        } else {
                            var40 = arg0.field2539[var37];
                        }
                        int var41 = arg0.field2507[var40];
                        int var42 = arg0.field2518[var40];
                        int var43 = arg0.field2547[var40];
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
                byte var45 = arg0.field2527[var44];
                if (var45 > 0) {
                    var24[var44] = (var29[var44] + var30[var44]) / 2;
                    var25[var44] = (var31[var44] + var32[var44]) / 2;
                    var26[var44] = (var33[var44] + var34[var44]) / 2;
                    float var47;
                    float var48;
                    float var49;
                    if (var45 == 1) {
                        short var46 = arg0.field2513[var44];
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
                        var49 = 64.0F / (float) (arg0.field2509[var44] & 0xFFFF);
                    } else if (var45 == 2) {
                        var47 = 64.0F / (float) (arg0.field2513[var44] & 0xFFFF);
                        var49 = 64.0F / (float) (arg0.field2509[var44] & 0xFFFF);
                        var48 = 64.0F / (float) (arg0.field2529[var44] & 0xFFFF);
                    } else {
                        var47 = (float) arg0.field2513[var44] / 1024.0F;
                        var49 = (float) arg0.field2509[var44] / 1024.0F;
                        var48 = (float) arg0.field2529[var44] / 1024.0F;
                    }
                    var27[var44] = method426(arg0.field2530[var44], arg0.field2505[var44], arg0.field2532[var44], arg0.field2520[var44] & 0xFF, var47, var49, var48);
                }
            }
        }
        for (int var50 = 0; var50 < this.field927; var50++) {
            int var51 = var5[var50];
            int var52 = arg0.field2552[var51] & 0xFFFF;
            short var53;
            if (arg0.field2533 == null) {
                var53 = -1;
            } else {
                var53 = arg0.field2533[var51];
            }
            int var54;
            if (arg0.field2515 == null) {
                var54 = -1;
            } else {
                var54 = arg0.field2515[var51];
            }
            int var55;
            if (arg0.field2516 == null) {
                var55 = 0;
            } else {
                var55 = arg0.field2516[var51] & 0xFF;
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
                    byte var65 = arg0.field2527[var54];
                    if (var65 == 0) {
                        int var66 = arg0.field2510[var51];
                        int var67 = arg0.field2504[var51];
                        int var68 = arg0.field2539[var51];
                        short var69 = arg0.field2530[var54];
                        short var70 = arg0.field2505[var54];
                        short var71 = arg0.field2532[var54];
                        float var72 = (float) arg0.field2507[var69];
                        float var73 = (float) arg0.field2518[var69];
                        float var74 = (float) arg0.field2547[var69];
                        float var75 = (float) arg0.field2507[var70] - var72;
                        float var76 = (float) arg0.field2518[var70] - var73;
                        float var77 = (float) arg0.field2547[var70] - var74;
                        float var78 = (float) arg0.field2507[var71] - var72;
                        float var79 = (float) arg0.field2518[var71] - var73;
                        float var80 = (float) arg0.field2547[var71] - var74;
                        float var81 = (float) arg0.field2507[var66] - var72;
                        float var82 = (float) arg0.field2518[var66] - var73;
                        float var83 = (float) arg0.field2547[var66] - var74;
                        float var84 = (float) arg0.field2507[var67] - var72;
                        float var85 = (float) arg0.field2518[var67] - var73;
                        float var86 = (float) arg0.field2547[var67] - var74;
                        float var87 = (float) arg0.field2507[var68] - var72;
                        float var88 = (float) arg0.field2518[var68] - var73;
                        float var89 = (float) arg0.field2547[var68] - var74;
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
                        int var101 = arg0.field2510[var51];
                        int var102 = arg0.field2504[var51];
                        int var103 = arg0.field2539[var51];
                        int var104 = var24[var54];
                        int var105 = var25[var54];
                        int var106 = var26[var54];
                        float[] var107 = var27[var54];
                        byte var108 = arg0.field2542[var54];
                        float var109 = (float) arg0.field2531[var54] / 256.0F;
                        if (var65 == 1) {
                            float var110 = (float) (arg0.field2529[var54] & 0xFFFF) / 1024.0F;
                            method461(arg0.field2507[var101], arg0.field2518[var101], arg0.field2547[var101], var104, var105, var106, var107, var110, var108, var109);
                            var56 = field973;
                            var57 = field969;
                            method461(arg0.field2507[var102], arg0.field2518[var102], arg0.field2547[var102], var104, var105, var106, var107, var110, var108, var109);
                            var58 = field973;
                            var59 = field969;
                            method461(arg0.field2507[var103], arg0.field2518[var103], arg0.field2547[var103], var104, var105, var106, var107, var110, var108, var109);
                            var60 = field973;
                            var61 = field969;
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
                            float var112 = (float) arg0.field2549[var54] / 256.0F;
                            float var113 = (float) arg0.field2525[var54] / 256.0F;
                            int var114 = arg0.field2507[var102] - arg0.field2507[var101];
                            int var115 = arg0.field2518[var102] - arg0.field2518[var101];
                            int var116 = arg0.field2547[var102] - arg0.field2547[var101];
                            int var117 = arg0.field2507[var103] - arg0.field2507[var101];
                            int var118 = arg0.field2518[var103] - arg0.field2518[var101];
                            int var119 = arg0.field2547[var103] - arg0.field2547[var101];
                            int var120 = var115 * var119 - var116 * var118;
                            int var121 = var116 * var117 - var114 * var119;
                            int var122 = var114 * var118 - var115 * var117;
                            float var123 = 64.0F / (float) (arg0.field2513[var54] & 0xFFFF);
                            float var124 = 64.0F / (float) (arg0.field2509[var54] & 0xFFFF);
                            float var125 = 64.0F / (float) (arg0.field2529[var54] & 0xFFFF);
                            float var126 = (var107[2] * (float) var122 + var107[0] * (float) var120 + var107[1] * (float) var121) / var123;
                            float var127 = (var107[5] * (float) var122 + var107[3] * (float) var120 + var107[4] * (float) var121) / var124;
                            float var128 = (var107[8] * (float) var122 + var107[6] * (float) var120 + var107[7] * (float) var121) / var125;
                            var64 = method459(var126, var127, var128);
                            method431(arg0.field2507[var101], arg0.field2518[var101], arg0.field2547[var101], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var56 = field970;
                            var57 = field976;
                            method431(arg0.field2507[var102], arg0.field2518[var102], arg0.field2547[var102], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var58 = field970;
                            var59 = field976;
                            method431(arg0.field2507[var103], arg0.field2518[var103], arg0.field2547[var103], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var60 = field970;
                            var61 = field976;
                        } else if (var65 == 3) {
                            method439(arg0.field2507[var101], arg0.field2518[var101], arg0.field2547[var101], var104, var105, var106, var107, var108, var109);
                            var56 = field978;
                            var57 = field975;
                            method439(arg0.field2507[var102], arg0.field2518[var102], arg0.field2547[var102], var104, var105, var106, var107, var108, var109);
                            var58 = field978;
                            var59 = field975;
                            method439(arg0.field2507[var103], arg0.field2518[var103], arg0.field2547[var103], var104, var105, var106, var107, var108, var109);
                            var60 = field978;
                            var61 = field975;
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
            arg0.method1120();
            byte var129;
            if (arg0.field2528 == null) {
                var129 = 0;
            } else {
                var129 = arg0.field2528[var51];
            }
            if (var129 == 0) {
                long var130 = ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32) + (long) (var54 << 2);
                int var132 = arg0.field2510[var51];
                class213 var133 = arg0.field2534[var132];
                this.field961[var50] = this.method440(arg0, var132, var130, var133.field3616, var133.field3622, var133.field3617, var133.field3619, var56, var57);
                int var134 = arg0.field2504[var51];
                class213 var135 = arg0.field2534[var134];
                this.field957[var50] = this.method440(arg0, var134, (long) var62 + var130, var135.field3616, var135.field3622, var135.field3617, var135.field3619, var58, var59);
                int var136 = arg0.field2539[var51];
                class213 var137 = arg0.field2534[var136];
                this.field926[var50] = this.method440(arg0, var136, (long) var63 + var130, var137.field3616, var137.field3622, var137.field3617, var137.field3619, var60, var61);
            } else if (var129 == 1) {
                class244 var138 = arg0.field2543[var51];
                long var139 = (long) ((var54 << 2) + (var138.field4112 > 0 ? 1024 : 2048) + (var138.field4105 + 256 << 12) + (var138.field4106 + 256 << 22)) + ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32);
                this.field961[var50] = this.method440(arg0, arg0.field2510[var51], var139, var138.field4112, var138.field4105, var138.field4106, 0, var56, var57);
                this.field957[var50] = this.method440(arg0, arg0.field2504[var51], (long) var62 + var139, var138.field4112, var138.field4105, var138.field4106, 0, var58, var59);
                this.field926[var50] = this.method440(arg0, arg0.field2539[var51], (long) var63 + var139, var138.field4112, var138.field4105, var138.field4106, 0, var60, var61);
            }
            if (arg0.field2533 == null) {
                this.field948[var50] = -1;
            } else {
                this.field948[var50] = arg0.field2533[var51];
            }
            if (this.field946 != null) {
                this.field946[var50] = (byte) arg0.field2526[var51];
            }
            this.field959[var50] = arg0.field2552[var51];
            if (arg0.field2516 != null) {
                this.field951[var50] = arg0.field2516[var51];
            }
        }
        int var141 = 0;
        short var142 = -10000;
        for (int var143 = 0; var143 < this.field927; var143++) {
            short var144 = this.field948[var143];
            if (var142 != var144) {
                var141++;
                var142 = var144;
            }
        }
        this.field932 = new int[var141 + 1];
        int var145 = 0;
        short var146 = -10000;
        for (int var147 = 0; var147 < this.field927; var147++) {
            short var148 = this.field948[var147];
            if (var146 != var148) {
                this.field932[var145++] = var147;
                var146 = var148;
            }
        }
        this.field932[var145] = this.field927;
        field943 = null;
        this.field936 = method460(this.field936, this.field935);
        this.field930 = method460(this.field930, this.field935);
        this.field937 = method460(this.field937, this.field935);
        this.field941 = method460(this.field941, this.field935);
        this.field931 = method456(this.field931, this.field935);
        this.field924 = method456(this.field924, this.field935);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I[IIIIZ)V", line = 555)
    private final void method416(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1.length;
        if (arg0 == 0) {
            int var8 = arg2 << 4;
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = 0;
            field977 = 0;
            field972 = 0;
            field968 = 0;
            for (int var12 = 0; var12 < var7; var12++) {
                int var13 = arg1[var12];
                if (var13 < this.field958.length) {
                    int[] var14 = this.field958[var13];
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        int var16 = var14[var15];
                        field977 += this.field939[var16];
                        field972 += this.field938[var16];
                        field968 += this.field944[var16];
                        var11++;
                    }
                }
            }
            if (var11 > 0) {
                field977 = field977 / var11 + var8;
                field972 = field972 / var11 + var9;
                field968 = field968 / var11 + var10;
            } else {
                field977 = var8;
                field972 = var9;
                field968 = var10;
            }
        } else if (arg0 == 1) {
            int var17 = arg2 << 4;
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            for (int var20 = 0; var20 < var7; var20++) {
                int var21 = arg1[var20];
                if (var21 < this.field958.length) {
                    int[] var22 = this.field958[var21];
                    for (int var23 = 0; var23 < var22.length; var23++) {
                        int var24 = var22[var23];
                        this.field939[var24] += var17;
                        this.field938[var24] += var18;
                        this.field944[var24] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var25 = 0; var25 < var7; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field958.length) {
                    int[] var27 = this.field958[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        this.field939[var29] -= field977;
                        this.field938[var29] -= field972;
                        this.field944[var29] -= field968;
                        if (arg4 != 0) {
                            int var30 = class21.field288[arg4];
                            int var31 = class21.field286[arg4];
                            int var32 = this.field939[var29] * var31 + this.field938[var29] * var30 + 32767 >> 16;
                            this.field938[var29] = this.field938[var29] * var31 + 32767 - this.field939[var29] * var30 >> 16;
                            this.field939[var29] = var32;
                        }
                        if (arg2 != 0) {
                            int var33 = class21.field288[arg2];
                            int var34 = class21.field286[arg2];
                            int var35 = this.field938[var29] * var34 + 32767 - this.field944[var29] * var33 >> 16;
                            this.field944[var29] = this.field944[var29] * var34 + this.field938[var29] * var33 + 32767 >> 16;
                            this.field938[var29] = var35;
                        }
                        if (arg3 != 0) {
                            int var36 = class21.field288[arg3];
                            int var37 = class21.field286[arg3];
                            int var38 = this.field944[var29] * var36 + this.field939[var29] * var37 + 32767 >> 16;
                            this.field944[var29] = this.field944[var29] * var37 + 32767 - this.field939[var29] * var36 >> 16;
                            this.field939[var29] = var38;
                        }
                        this.field939[var29] += field977;
                        this.field938[var29] += field972;
                        this.field944[var29] += field968;
                    }
                }
            }
            if (arg5 && this.field936 != null) {
                for (int var39 = 0; var39 < var7; var39++) {
                    int var40 = arg1[var39];
                    if (var40 < this.field958.length) {
                        int[] var41 = this.field958[var40];
                        for (int var42 = 0; var42 < var41.length; var42++) {
                            int var43 = var41[var42];
                            int var44 = this.field956[var43];
                            int var45 = this.field956[var43 + 1];
                            for (int var46 = var44; var46 < var45; var46++) {
                                int var47 = this.field942[var46] - 1;
                                if (var47 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var48 = class21.field288[arg4];
                                    int var49 = class21.field286[arg4];
                                    int var50 = this.field936[var47] * var49 + this.field930[var47] * var48 + 32767 >> 16;
                                    this.field930[var47] = (short) (this.field930[var47] * var49 + 32767 - this.field936[var47] * var48 >> 16);
                                    this.field936[var47] = (short) var50;
                                }
                                if (arg2 != 0) {
                                    int var51 = class21.field288[arg2];
                                    int var52 = class21.field286[arg2];
                                    int var53 = this.field930[var47] * var52 + 32767 - this.field937[var47] * var51 >> 16;
                                    this.field937[var47] = (short) (this.field937[var47] * var52 + this.field930[var47] * var51 + 32767 >> 16);
                                    this.field930[var47] = (short) var53;
                                }
                                if (arg3 != 0) {
                                    int var54 = class21.field288[arg3];
                                    int var55 = class21.field286[arg3];
                                    int var56 = this.field937[var47] * var54 + this.field936[var47] * var55 + 32767 >> 16;
                                    this.field937[var47] = (short) (this.field937[var47] * var55 + 32767 - this.field936[var47] * var54 >> 16);
                                    this.field936[var47] = (short) var56;
                                }
                            }
                        }
                    }
                }
                if (this.field940 != null) {
                    this.field940.field4227 = false;
                }
            }
        } else if (arg0 == 3) {
            for (int var57 = 0; var57 < var7; var57++) {
                int var58 = arg1[var57];
                if (var58 < this.field958.length) {
                    int[] var59 = this.field958[var58];
                    for (int var60 = 0; var60 < var59.length; var60++) {
                        int var61 = var59[var60];
                        this.field939[var61] -= field977;
                        this.field938[var61] -= field972;
                        this.field944[var61] -= field968;
                        this.field939[var61] = this.field939[var61] * arg2 >> 7;
                        this.field938[var61] = this.field938[var61] * arg3 >> 7;
                        this.field944[var61] = this.field944[var61] * arg4 >> 7;
                        this.field939[var61] += field977;
                        this.field938[var61] += field972;
                        this.field944[var61] += field968;
                    }
                }
            }
        } else if (arg0 == 5 && this.field952 != null && this.field951 != null) {
            for (int var62 = 0; var62 < var7; var62++) {
                int var63 = arg1[var62];
                if (var63 < this.field952.length) {
                    int[] var64 = this.field952[var63];
                    for (int var65 = 0; var65 < var64.length; var65++) {
                        int var66 = var64[var65];
                        int var67 = (this.field951[var66] & 0xFF) + arg2 * 8;
                        if (var67 < 0) {
                            var67 = 0;
                        } else if (var67 > 255) {
                            var67 = 255;
                        }
                        this.field951[var66] = (byte) var67;
                    }
                    if (var64.length > 0) {
                        this.field928.field4227 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "()I", line = 900)
    public final int method417() {
        if (!this.field923.field2316) {
            this.method452();
        }
        return this.field923.field2321;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lme;IZ)V", line = 907)
    public final void method418(class176 arg0, int arg1, boolean arg2) {
        if (this.field958 == null || arg1 == -1) {
            return;
        }
        class293 var4 = arg0.field2966[arg1];
        class116 var5 = var4.field5030;
        for (int var6 = 0; var6 < this.field953; var6++) {
            this.field939[var6] <<= 0x4;
            this.field938[var6] <<= 0x4;
            this.field944[var6] <<= 0x4;
        }
        field977 = 0;
        field972 = 0;
        field968 = 0;
        for (int var7 = 0; var7 < var4.field5031; var7++) {
            short var8 = var4.field5028[var7];
            if (var4.field5029[var7] != -1) {
                this.method416(0, var5.field1960[var4.field5029[var7]], 0, 0, 0, arg2);
            }
            this.method416(var5.field1956[var8], var5.field1960[var8], var4.field5032[var7], var4.field5027[var7], var4.field5036[var7], arg2);
        }
        for (int var9 = 0; var9 < this.field953; var9++) {
            this.field939[var9] >>= 0x4;
            this.field938[var9] >>= 0x4;
            this.field944[var9] >>= 0x4;
        }
        this.field923.field2316 = false;
        this.field964.field4227 = false;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(ZZ)Lcc;", line = 960)
    public final class234 method419(boolean arg0, boolean arg1) {
        return this.method458(arg0, arg1, field965, field962);
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "()Z", line = 964)
    public final boolean method420() {
        return this.field955 && this.field939 != null && this.field936 != null;
    }

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "()V", line = 967)
    public static final void method421() {
        field962 = new class57();
        field965 = new class57();
        field966 = new class57();
        field967 = new class57();
    }

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "(I)V", line = 974)
    public final void method422(int arg0) {
        int var2 = class21.field288[arg0];
        int var3 = class21.field286[arg0];
        for (int var4 = 0; var4 < this.field953; var4++) {
            int var5 = this.field944[var4] * var2 + this.field939[var4] * var3 >> 16;
            this.field944[var4] = this.field944[var4] * var3 - this.field939[var4] * var2 >> 16;
            this.field939[var4] = var5;
        }
        this.field923.field2316 = false;
        this.field964.field4227 = false;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZZZZZZZ)V", line = 994)
    public final void method423(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        if (this.field933 != 0) {
            throw new IllegalArgumentException();
        } else if (this.field935 != 0) {
            if (arg6) {
                boolean var8 = !this.field928.field4227 && (arg1 || arg2 && !class116.field1970);
                this.method450(false, !this.field964.field4227 && arg0, var8, this.field940 != null && !this.field940.field4227 && arg2, !this.field945.field4227 && arg3);
                if (!this.field950.field4227 && arg4 && arg1) {
                    this.method432();
                }
            }
            if (arg0) {
                if (this.field964.field4227) {
                    this.field939 = null;
                    this.field938 = null;
                    this.field944 = null;
                    this.field942 = null;
                    this.field956 = null;
                } else {
                    this.field960 = (byte) (this.field960 | 0x1);
                }
            }
            if (arg1) {
                if (this.field928.field4227) {
                    this.field959 = null;
                    this.field951 = null;
                } else {
                    this.field960 = (byte) (this.field960 | 0x2);
                }
            }
            if (arg2 && class116.field1970) {
                if (this.field940.field4227) {
                    this.field936 = null;
                    this.field930 = null;
                    this.field937 = null;
                    this.field941 = null;
                } else {
                    this.field960 = (byte) (this.field960 | 0x4);
                }
            }
            if (arg3) {
                if (this.field945.field4227) {
                    this.field931 = null;
                    this.field924 = null;
                } else {
                    this.field960 = (byte) (this.field960 | 0x8);
                }
            }
            if (arg4 && arg1) {
                if (this.field950.field4227 && this.field928.field4227) {
                    this.field961 = null;
                    this.field957 = null;
                    this.field926 = null;
                } else {
                    this.field960 = (byte) (this.field960 | 0x10);
                }
            }
            if (arg5) {
                this.field934 = null;
                this.field946 = null;
                this.field958 = (int[][]) null;
                this.field952 = (int[][]) null;
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "()I", line = 1086)
    public final int method424() {
        return this.field947;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lme;I)V", line = 1090)
    public final void method425(class176 arg0, int arg1) {
        if (this.field958 == null || arg1 == -1) {
            return;
        }
        class293 var3 = arg0.field2966[arg1];
        class116 var4 = var3.field5030;
        field977 = 0;
        field972 = 0;
        field968 = 0;
        for (int var5 = 0; var5 < var3.field5031; var5++) {
            short var6 = var3.field5028[var5];
            if (var4.field1967[var6]) {
                if (var3.field5029[var5] != -1) {
                    this.method448(0, 0, 0, 0);
                }
                this.method448(var4.field1956[var6], var3.field5032[var5], var3.field5027[var5], var3.field5036[var5]);
            }
        }
        this.field964.field4227 = false;
        this.field923.field2316 = false;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIFFF)[F", line = 1126)
    private static final float[] method426(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        float[] var7 = new float[9];
        float[] var8 = new float[9];
        float var9 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
        float var10 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
        float var11 = 1.0F - var9;
        var7[0] = var9;
        var7[1] = 0.0F;
        var7[2] = var10;
        var7[3] = 0.0F;
        var7[4] = 1.0F;
        var7[5] = 0.0F;
        var7[6] = -var10;
        var7[7] = 0.0F;
        var7[8] = var9;
        float[] var12 = new float[9];
        float var13 = 1.0F;
        float var14 = 0.0F;
        float var15 = (float) arg1 / 32767.0F;
        float var16 = -((float) Math.sqrt((double) (1.0F - var15 * var15)));
        float var17 = 1.0F - var15;
        float var18 = (float) Math.sqrt((double) (arg0 * arg0 + arg2 * arg2));
        if (var18 == 0.0F && var15 == 0.0F) {
            var8 = var7;
        } else {
            if (var18 != 0.0F) {
                var13 = (float) (-arg2) / var18;
                var14 = (float) arg0 / var18;
            }
            var12[0] = var13 * var13 * var17 + var15;
            var12[1] = var14 * var16;
            var12[2] = var13 * var14 * var17;
            var12[3] = -var14 * var16;
            var12[4] = var15;
            var12[5] = var13 * var16;
            var12[6] = var13 * var14 * var17;
            var12[7] = -var13 * var16;
            var12[8] = var14 * var14 * var17 + var15;
            var8[0] = var7[2] * var12[6] + var7[0] * var12[0] + var7[1] * var12[3];
            var8[1] = var7[2] * var12[7] + var7[0] * var12[1] + var7[1] * var12[4];
            var8[2] = var7[2] * var12[8] + var7[0] * var12[2] + var7[1] * var12[5];
            var8[3] = var7[5] * var12[6] + var7[3] * var12[0] + var7[4] * var12[3];
            var8[4] = var7[5] * var12[7] + var7[3] * var12[1] + var7[4] * var12[4];
            var8[5] = var7[5] * var12[8] + var7[3] * var12[2] + var7[4] * var12[5];
            var8[6] = var7[8] * var12[6] + var7[6] * var12[0] + var7[7] * var12[3];
            var8[7] = var7[8] * var12[7] + var7[6] * var12[1] + var7[7] * var12[4];
            var8[8] = var7[8] * var12[8] + var7[6] * var12[2] + var7[7] * var12[5];
        }
        var8[0] *= arg4;
        var8[1] *= arg4;
        var8[2] *= arg4;
        var8[3] *= arg5;
        var8[4] *= arg5;
        var8[5] *= arg5;
        var8[6] *= arg6;
        var8[7] *= arg6;
        var8[8] *= arg6;
        return var8;
    }

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "()V", line = 1201)
    private final void method427() {
        GL var1 = class47.field739;
        if (this.field927 == 0) {
            return;
        }
        if (this.field933 != 0) {
            this.method450(true, !this.field964.field4227 && (this.field933 & 0x1) != 0, !this.field928.field4227 && (this.field933 & 0x2) != 0, this.field940 != null && !this.field940.field4227 && (this.field933 & 0x4) != 0, false);
        }
        this.method450(false, !this.field964.field4227, !this.field928.field4227, this.field940 != null && !this.field940.field4227, !this.field945.field4227);
        if (!this.field950.field4227) {
            this.method432();
        }
        if (this.field960 != 0) {
            if ((this.field960 & 0x1) != 0) {
                this.field939 = null;
                this.field938 = null;
                this.field944 = null;
                this.field942 = null;
                this.field956 = null;
            }
            if ((this.field960 & 0x2) != 0) {
                this.field959 = null;
                this.field951 = null;
            }
            if ((this.field960 & 0x4) != 0) {
                this.field936 = null;
                this.field930 = null;
                this.field937 = null;
                this.field941 = null;
            }
            if ((this.field960 & 0x8) != 0) {
                this.field931 = null;
                this.field924 = null;
            }
            if ((this.field960 & 0x10) != 0) {
                this.field961 = null;
                this.field957 = null;
                this.field926 = null;
            }
            this.field960 = 0;
        }
        class92 var2 = null;
        if (this.field964.field4238 != null) {
            this.field964.field4238.method722();
            var2 = this.field964.field4238;
            var1.glVertexPointer(3, 5126, this.field964.field4228, (long) this.field964.field4226);
        }
        if (this.field928.field4238 != null) {
            if (this.field928.field4238 != var2) {
                this.field928.field4238.method722();
                var2 = this.field928.field4238;
            }
            var1.glColorPointer(4, 5121, this.field928.field4228, (long) this.field928.field4226);
        }
        if (class116.field1970 && this.field940.field4238 != null) {
            if (this.field940.field4238 != var2) {
                this.field940.field4238.method722();
                var2 = this.field940.field4238;
            }
            var1.glNormalPointer(5126, this.field940.field4228, (long) this.field940.field4226);
        }
        if (this.field945.field4238 != null) {
            if (this.field945.field4238 != var2) {
                this.field945.field4238.method722();
                class92 var3 = this.field945.field4238;
            }
            var1.glTexCoordPointer(2, 5126, this.field945.field4228, (long) this.field945.field4226);
        }
        if (this.field950.field4238 != null) {
            this.field950.field4238.method719();
        }
        if (this.field964.field4238 == null || this.field928.field4238 == null || class116.field1970 && this.field940.field4238 == null || this.field945.field4238 == null) {
            if (class47.field768) {
                var1.glBindBufferARB(34962, 0);
            }
            if (this.field964.field4238 == null) {
                this.field964.field4231.position(this.field964.field4226);
                var1.glVertexPointer(3, 5126, this.field964.field4228, this.field964.field4231);
            }
            if (this.field928.field4238 == null) {
                this.field928.field4231.position(this.field928.field4226);
                var1.glColorPointer(4, 5121, this.field928.field4228, this.field928.field4231);
            }
            if (class116.field1970 && this.field940.field4238 == null) {
                this.field940.field4231.position(this.field940.field4226);
                var1.glNormalPointer(5126, this.field940.field4228, this.field940.field4231);
            }
            if (this.field945.field4238 == null) {
                this.field945.field4231.position(this.field945.field4226);
                var1.glTexCoordPointer(2, 5126, this.field945.field4228, this.field945.field4231);
            }
        }
        if (this.field950.field4238 == null && class47.field768) {
            var1.glBindBufferARB(34963, 0);
        }
        int var4 = this.field932.length - 1;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = this.field932[var5];
            int var7 = this.field932[var5 + 1];
            short var8 = this.field948[var6];
            if (var8 == -1) {
                class47.method317(-1);
                class140.method1079(0, (byte) 1, 0);
            } else {
                class21.field279.method1064(-29618, var8 & 0xFFFF);
            }
            if (this.field950.field4238 == null) {
                this.field950.field4231.position(var6 * 12);
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, this.field950.field4231);
            } else {
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, (long) (var6 * 12));
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ISIB)I", line = 1373)
    private static final int method428(int arg0, short arg1, int arg2, byte arg3) {
        int var4 = class21.field290[class208.method1534(arg0, arg2)];
        if (arg1 != -1) {
            int var5 = class21.field279.method1066(255, arg1 & 0xFFFF);
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
            int var9 = class21.field279.method1067(118, arg1 & 0xFFFF);
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

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "(I)V", line = 1431)
    public final void method429(int arg0) {
        this.field925 = (short) arg0;
        if (this.field940 != null) {
            this.field940.field4227 = false;
        }
    }

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "()I", line = 1437)
    public final int method430() {
        if (!this.field923.field2316) {
            this.method452();
        }
        return this.field923.field2315;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIIII[FIFFF)V", line = 1449)
    private static final void method431(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, float arg10, float arg11) {
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
        field970 = var18;
        field976 = var19;
    }

    @OriginalMember(owner = "client!qk", name = "p", descriptor = "()V", line = 1527)
    private final void method432() {
        if (field929.field997.length < this.field935 * 12) {
            field929 = new class60((this.field935 + 100) * 12);
        } else {
            field929.field1012 = 0;
        }
        if (class47.field749) {
            for (int var1 = 0; var1 < this.field927; var1++) {
                field929.method510(this.field961[var1], 53);
                field929.method510(this.field957[var1], -121);
                field929.method510(this.field926[var1], 59);
            }
        } else {
            for (int var2 = 0; var2 < this.field927; var2++) {
                field929.method528((byte) 101, this.field961[var2]);
                field929.method528((byte) 118, this.field957[var2]);
                field929.method528((byte) 101, this.field926[var2]);
            }
        }
        if (!class47.field768) {
            ByteBuffer var5 = ByteBuffer.allocateDirect(field929.field1012);
            var5.put(field929.field997, 0, field929.field1012);
            var5.flip();
            this.field950.field4227 = true;
            this.field950.field4231 = var5;
            this.field950.field4238 = null;
            return;
        }
        class92 var3 = new class92();
        ByteBuffer var4 = ByteBuffer.wrap(field929.field997, 0, field929.field1012);
        var3.method720(var4);
        this.field950.field4227 = true;
        this.field950.field4231 = null;
        this.field950.field4238 = var3;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(III)Lpj;", line = 1593)
    public final class171 method433(int arg0, int arg1, int arg2) {
        this.field955 = false;
        if (this.field963 != null) {
            this.field936 = this.field963.field2217;
            this.field930 = this.field963.field2218;
            this.field937 = this.field963.field2215;
            this.field941 = this.field963.field2216;
            this.field963 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!qk", name = "q", descriptor = "()V", line = 1606)
    public final void method434() {
        int var10002;
        if (this.field934 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field953; var3++) {
                int var4 = this.field934[var3] & 0xFF;
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field958 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field958[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field953) {
                int var7 = this.field934[var6] & 0xFF;
                this.field958[var7][var1[var7]++] = var6++;
            }
            this.field934 = null;
        }
        if (this.field946 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field927; var10++) {
            int var11 = this.field946[var10] & 0xFF;
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field952 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field952[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field927) {
            int var14 = this.field946[var13] & 0xFF;
            this.field952[var14][var8[var14]++] = var13++;
        }
        this.field946 = null;
    }

    @OriginalMember(owner = "client!qk", name = "r", descriptor = "()I", line = 1698)
    public final int method435() {
        return this.field925;
    }

    @OriginalMember(owner = "client!qk", name = "s", descriptor = "()V", line = 1703)
    public final void method436() {
        if (this.field936 == null) {
            this.method454();
            return;
        }
        for (int var1 = 0; var1 < this.field953; var1++) {
            int var2 = this.field944[var1];
            this.field944[var1] = this.field939[var1];
            this.field939[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field935; var3++) {
            short var4 = this.field937[var3];
            this.field937[var3] = this.field936[var3];
            this.field936[var3] = (short) (-var4);
        }
        this.field923.field2316 = false;
        this.field964.field4227 = false;
        if (this.field940 != null) {
            this.field940.field4227 = false;
        }
    }

    @OriginalMember(owner = "client!qk", name = "t", descriptor = "()V", line = 1743)
    public final void method437() {
        if (this.field936 == null) {
            this.method442();
            return;
        }
        for (int var1 = 0; var1 < this.field953; var1++) {
            int var2 = this.field939[var1];
            this.field939[var1] = this.field944[var1];
            this.field944[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field935; var3++) {
            short var4 = this.field936[var3];
            this.field936[var3] = this.field937[var3];
            this.field937[var3] = (short) (-var4);
        }
        this.field923.field2316 = false;
        this.field964.field4227 = false;
        if (this.field940 != null) {
            this.field940.field4227 = false;
        }
    }

    @OriginalMember(owner = "client!qk", name = "u", descriptor = "()V", line = 1782)
    public final void method438() {
        for (int var1 = 0; var1 < this.field953; var1++) {
            this.field944[var1] = -this.field944[var1];
        }
        if (this.field937 != null) {
            for (int var2 = 0; var2 < this.field935; var2++) {
                this.field937[var2] = (short) (-this.field937[var2]);
            }
        }
        for (int var3 = 0; var3 < this.field927; var3++) {
            short var4 = this.field961[var3];
            this.field961[var3] = this.field926[var3];
            this.field926[var3] = var4;
        }
        this.field923.field2316 = false;
        this.field964.field4227 = false;
        if (this.field940 != null) {
            this.field940.field4227 = false;
        }
        this.field950.field4227 = false;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIII[FIF)V", line = 1818)
    private static final void method439(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8) {
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
        field978 = var16;
        field975 = var17;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lll;IJIIIIFF)S", line = 1864)
    private final short method440(class146 arg0, int arg1, long arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8) {
        int var11 = this.field956[arg1];
        int var12 = this.field956[arg1 + 1];
        int var13 = 0;
        for (int var14 = var11; var14 < var12; var14++) {
            short var15 = this.field942[var14];
            if (var15 == 0) {
                var13 = var14;
                break;
            }
            if (field943[var14] == arg2) {
                return (short) (var15 - 1);
            }
        }
        this.field942[var13] = (short) (this.field935 + 1);
        field943[var13] = arg2;
        this.field936[this.field935] = (short) arg3;
        this.field930[this.field935] = (short) arg4;
        this.field937[this.field935] = (short) arg5;
        this.field941[this.field935] = (short) arg6;
        this.field931[this.field935] = arg7;
        this.field924[this.field935] = arg8;
        return (short) (this.field935++);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lme;ILme;I[IZ)V", line = 1899)
    public final void method441(class176 arg0, int arg1, class176 arg2, int arg3, int[] arg4, boolean arg5) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method418(arg0, arg1, arg5);
            return;
        }
        class293 var7 = arg0.field2966[arg1];
        class293 var8 = arg2.field2966[arg3];
        class116 var9 = var7.field5030;
        for (int var10 = 0; var10 < this.field953; var10++) {
            this.field939[var10] <<= 0x4;
            this.field938[var10] <<= 0x4;
            this.field944[var10] <<= 0x4;
        }
        field977 = 0;
        field972 = 0;
        field968 = 0;
        byte var11 = 0;
        int var20 = var11 + 1;
        int var12 = arg4[var11];
        for (int var13 = 0; var13 < var7.field5031; var13++) {
            short var14 = var7.field5028[var13];
            while (var14 > var12) {
                var12 = arg4[var20++];
            }
            if (var12 != var14 || var9.field1956[var14] == 0) {
                if (var7.field5029[var13] != -1) {
                    this.method416(0, var9.field1960[var7.field5029[var13]], 0, 0, 0, arg5);
                }
                this.method416(var9.field1956[var14], var9.field1960[var14], var7.field5032[var13], var7.field5027[var13], var7.field5036[var13], arg5);
            }
        }
        field977 = 0;
        field972 = 0;
        field968 = 0;
        byte var15 = 0;
        int var21 = var15 + 1;
        int var16 = arg4[var15];
        for (int var17 = 0; var17 < var8.field5031; var17++) {
            short var18 = var8.field5028[var17];
            while (var18 > var16) {
                var16 = arg4[var21++];
            }
            if (var16 == var18 || var9.field1956[var18] == 0) {
                if (var8.field5029[var17] != -1) {
                    this.method416(0, var9.field1960[var8.field5029[var17]], 0, 0, 0, arg5);
                }
                this.method416(var9.field1956[var18], var9.field1960[var18], var8.field5032[var17], var8.field5027[var17], var8.field5036[var17], arg5);
            }
        }
        for (int var19 = 0; var19 < this.field953; var19++) {
            this.field939[var19] >>= 0x4;
            this.field938[var19] >>= 0x4;
            this.field944[var19] >>= 0x4;
        }
        this.field923.field2316 = false;
        this.field964.field4227 = false;
    }

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "()V", line = 1996)
    public final void method442() {
        for (int var1 = 0; var1 < this.field953; var1++) {
            int var2 = this.field939[var1];
            this.field939[var1] = this.field944[var1];
            this.field944[var1] = -var2;
        }
        this.field923.field2316 = false;
        this.field964.field4227 = false;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "()I", line = 2010)
    public final int method443() {
        if (!this.field923.field2316) {
            this.method452();
        }
        return this.field923.field2318;
    }

    @OriginalMember(owner = "client!qk", name = "v", descriptor = "()V", line = 2019)
    public static void method444() {
        field943 = null;
        field929 = null;
        field954 = null;
        field962 = null;
        field965 = null;
        field966 = null;
        field967 = null;
        field974 = null;
        field971 = null;
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)V", line = 2032)
    public final void method445(int arg0) {
        int var2 = class21.field288[arg0];
        int var3 = class21.field286[arg0];
        for (int var4 = 0; var4 < this.field953; var4++) {
            int var5 = this.field939[var4] * var3 + this.field938[var4] * var2 >> 16;
            this.field938[var4] = this.field938[var4] * var3 - this.field939[var4] * var2 >> 16;
            this.field939[var4] = var5;
        }
        this.field923.field2316 = false;
        this.field964.field4227 = false;
    }

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "(I)V", line = 2051)
    public final void method446(int arg0) {
        if (this.field936 == null) {
            this.method422(arg0);
            return;
        }
        int var2 = class21.field288[arg0];
        int var3 = class21.field286[arg0];
        for (int var4 = 0; var4 < this.field953; var4++) {
            int var5 = this.field944[var4] * var2 + this.field939[var4] * var3 >> 16;
            this.field944[var4] = this.field944[var4] * var3 - this.field939[var4] * var2 >> 16;
            this.field939[var4] = var5;
        }
        for (int var6 = 0; var6 < this.field935; var6++) {
            int var7 = this.field937[var6] * var2 + this.field936[var6] * var3 >> 16;
            this.field937[var6] = (short) (this.field937[var6] * var3 - this.field936[var6] * var2 >> 16);
            this.field936[var6] = (short) var7;
        }
        this.field923.field2316 = false;
        this.field964.field4227 = false;
        if (this.field940 != null) {
            this.field940.field4227 = false;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lpj;IIIZ)V", line = 2093)
    public final void method447(class171 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class57 var6 = (class57) arg0;
        if (this.field927 == 0 || var6.field927 == 0) {
            return;
        }
        int var7 = var6.field953;
        int[] var8 = var6.field939;
        int[] var9 = var6.field938;
        int[] var10 = var6.field944;
        short[] var11 = var6.field936;
        short[] var12 = var6.field930;
        short[] var13 = var6.field937;
        short[] var14 = var6.field941;
        short[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field963 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field963.field2217;
            var16 = this.field963.field2218;
            var17 = this.field963.field2215;
            var18 = this.field963.field2216;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field963 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field963.field2217;
            var20 = var6.field963.field2218;
            var21 = var6.field963.field2215;
            var22 = var6.field963.field2216;
        }
        int[] var23 = var6.field956;
        short[] var24 = var6.field942;
        if (!var6.field923.field2316) {
            var6.method452();
        }
        short var25 = var6.field923.field2318;
        short var26 = var6.field923.field2317;
        short var27 = var6.field923.field2321;
        short var28 = var6.field923.field2320;
        short var29 = var6.field923.field2322;
        short var30 = var6.field923.field2319;
        for (int var31 = 0; var31 < this.field953; var31++) {
            int var32 = this.field938[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field939[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field944[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field956[var31];
                        int var37 = this.field956[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field942[var38] - 1;
                            if (var35 == -1 || this.field941[var35] != 0) {
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
                                            this.field963 = new class128();
                                            var15 = this.field963.field2217 = class11.method55(this.field936, (byte) 44);
                                            var16 = this.field963.field2218 = class11.method55(this.field930, (byte) 44);
                                            var17 = this.field963.field2215 = class11.method55(this.field937, (byte) 44);
                                            var18 = this.field963.field2216 = class11.method55(this.field941, (byte) 44);
                                        }
                                        if (var19 == null) {
                                            class128 var44 = var6.field963 = new class128();
                                            var19 = var44.field2217 = class11.method55(var11, (byte) 44);
                                            var20 = var44.field2218 = class11.method55(var12, (byte) 44);
                                            var21 = var44.field2215 = class11.method55(var13, (byte) 44);
                                            var22 = var44.field2216 = class11.method55(var14, (byte) 44);
                                        }
                                        short var45 = this.field936[var35];
                                        short var46 = this.field930[var35];
                                        short var47 = this.field937[var35];
                                        short var48 = this.field941[var35];
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
                                        int var57 = this.field956[var31];
                                        int var58 = this.field956[var31 + 1];
                                        for (int var59 = var57; var59 < var58; var59++) {
                                            int var60 = this.field942[var59] - 1;
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

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIII)V", line = 2331)
    private final void method448(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            int var5 = 0;
            field977 = 0;
            field972 = 0;
            field968 = 0;
            for (int var6 = 0; var6 < this.field953; var6++) {
                field977 += this.field939[var6];
                field972 += this.field938[var6];
                field968 += this.field944[var6];
                var5++;
            }
            if (var5 > 0) {
                field977 = field977 / var5 + arg1;
                field972 = field972 / var5 + arg2;
                field968 = field968 / var5 + arg3;
            } else {
                field977 = arg1;
                field972 = arg2;
                field968 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field953; var7++) {
                this.field939[var7] += arg1;
                this.field938[var7] += arg2;
                this.field944[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field953; var8++) {
                this.field939[var8] -= field977;
                this.field938[var8] -= field972;
                this.field944[var8] -= field968;
                if (arg3 != 0) {
                    int var9 = class21.field288[arg3];
                    int var10 = class21.field286[arg3];
                    int var11 = this.field939[var8] * var10 + this.field938[var8] * var9 + 32767 >> 16;
                    this.field938[var8] = this.field938[var8] * var10 + 32767 - this.field939[var8] * var9 >> 16;
                    this.field939[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class21.field288[arg1];
                    int var13 = class21.field286[arg1];
                    int var14 = this.field938[var8] * var13 + 32767 - this.field944[var8] * var12 >> 16;
                    this.field944[var8] = this.field944[var8] * var13 + this.field938[var8] * var12 + 32767 >> 16;
                    this.field938[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class21.field288[arg2];
                    int var16 = class21.field286[arg2];
                    int var17 = this.field944[var8] * var15 + this.field939[var8] * var16 + 32767 >> 16;
                    this.field944[var8] = this.field944[var8] * var16 + 32767 - this.field939[var8] * var15 >> 16;
                    this.field939[var8] = var17;
                }
                this.field939[var8] += field977;
                this.field938[var8] += field972;
                this.field944[var8] += field968;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field953; var18++) {
                this.field939[var18] -= field977;
                this.field938[var18] -= field972;
                this.field944[var18] -= field968;
                this.field939[var18] = this.field939[var18] * arg1 / 128;
                this.field938[var18] = this.field938[var18] * arg2 / 128;
                this.field944[var18] = this.field944[var18] * arg3 / 128;
                this.field939[var18] += field977;
                this.field938[var18] += field972;
                this.field944[var18] += field968;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field927; var19++) {
                int var20 = (this.field951[var19] & 0xFF) + arg1 * 8;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 255) {
                    var20 = 255;
                }
                this.field951[var19] = (byte) var20;
            }
            this.field928.field4227 = false;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(SS)V", line = 2491)
    public final void method449(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field927; var3++) {
            if (this.field948[var3] == arg0) {
                this.field948[var3] = arg1;
            }
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 != -1) {
            var4 = class21.field279.method1066(255, arg0 & 0xFFFF);
            var5 = class21.field279.method1067(120, arg0 & 0xFFFF);
        }
        int var6 = 0;
        int var7 = 0;
        if (arg1 != -1) {
            var6 = class21.field279.method1066(255, arg1 & 0xFFFF);
            var7 = class21.field279.method1067(127, arg1 & 0xFFFF);
        }
        if (var4 != var6 || var5 != var7) {
            this.field928.field4227 = false;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZZZZZ)V", line = 2526)
    private final void method450(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        int var6 = 0;
        if (arg1) {
            this.field964.field4226 = var6;
            var6 += 12;
        }
        if (arg2) {
            this.field928.field4226 = var6;
            var6 += 4;
        }
        if (arg3) {
            this.field940.field4226 = var6;
            var6 += 12;
        }
        if (arg4) {
            this.field945.field4226 = var6;
            var6 += 8;
        }
        if (var6 == 0) {
            return;
        }
        if (field929.field997.length < this.field935 * var6) {
            field929 = new class60((this.field935 + 100) * var6);
        } else {
            field929.field1012 = 0;
        }
        if (arg1) {
            if (class47.field749) {
                for (int var7 = 0; var7 < this.field953; var7++) {
                    int var8 = Float.floatToRawIntBits((float) this.field939[var7]);
                    int var9 = Float.floatToRawIntBits((float) this.field938[var7]);
                    int var10 = Float.floatToRawIntBits((float) this.field944[var7]);
                    int var11 = this.field956[var7];
                    int var12 = this.field956[var7 + 1];
                    for (int var13 = var11; var13 < var12; var13++) {
                        int var14 = this.field942[var13] - 1;
                        if (var14 == -1) {
                            break;
                        }
                        field929.field1012 = var6 * var14;
                        field929.method510(var8, -37);
                        field929.method510(var9, 53);
                        field929.method510(var10, 82);
                    }
                }
            } else {
                for (int var15 = 0; var15 < this.field953; var15++) {
                    int var16 = Float.floatToRawIntBits((float) this.field939[var15]);
                    int var17 = Float.floatToRawIntBits((float) this.field938[var15]);
                    int var18 = Float.floatToRawIntBits((float) this.field944[var15]);
                    int var19 = this.field956[var15];
                    int var20 = this.field956[var15 + 1];
                    for (int var21 = var19; var21 < var20; var21++) {
                        int var22 = this.field942[var21] - 1;
                        if (var22 == -1) {
                            break;
                        }
                        field929.field1012 = var6 * var22;
                        field929.method528((byte) 109, var16);
                        field929.method528((byte) 121, var17);
                        field929.method528((byte) 110, var18);
                    }
                }
            }
        }
        if (arg2) {
            if (class116.field1970) {
                for (int var42 = 0; var42 < this.field927; var42++) {
                    int var43 = method428(this.field959[var42], this.field948[var42], this.field947, this.field951[var42]);
                    field929.field1012 = this.field961[var42] * var6 + this.field928.field4226;
                    field929.method510(var43, -112);
                    field929.field1012 = this.field957[var42] * var6 + this.field928.field4226;
                    field929.method510(var43, -78);
                    field929.field1012 = this.field926[var42] * var6 + this.field928.field4226;
                    field929.method510(var43, 72);
                }
            } else {
                int var23 = (int) class239.field4036[0];
                int var24 = (int) class239.field4036[1];
                int var25 = (int) class239.field4036[2];
                int var26 = (int) Math.sqrt((double) (var25 * var25 + var23 * var23 + var24 * var24));
                int var27 = (int) ((float) this.field947 * 1.3F);
                int var28 = this.field925 * var26 >> 8;
                for (int var29 = 0; var29 < this.field927; var29++) {
                    short var30 = this.field961[var29];
                    short var31 = this.field941[var30];
                    int var32;
                    if (var31 < 0) {
                        var32 = -var31 - 1;
                    } else {
                        if (var31 == 0) {
                            var32 = (this.field937[var30] * var25 + this.field936[var30] * var23 + this.field930[var30] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var32 = (this.field937[var30] * var25 + this.field936[var30] * var23 + this.field930[var30] * var24) / (var28 * var31) + var27;
                        }
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 > 16384) {
                            var32 = 16384;
                        }
                        this.field941[var30] = (short) (-var32 - 1);
                    }
                    short var33 = this.field957[var29];
                    short var34 = this.field941[var33];
                    int var35;
                    if (var34 < 0) {
                        var35 = -var34 - 1;
                    } else {
                        if (var34 == 0) {
                            var35 = (this.field937[var33] * var25 + this.field936[var33] * var23 + this.field930[var33] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var35 = (this.field937[var33] * var25 + this.field936[var33] * var23 + this.field930[var33] * var24) / (var28 * var34) + var27;
                        }
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 > 16384) {
                            var35 = 16384;
                        }
                        this.field941[var33] = (short) (-var35 - 1);
                    }
                    short var36 = this.field926[var29];
                    short var37 = this.field941[var36];
                    int var38;
                    if (var37 < 0) {
                        var38 = -var37 - 1;
                    } else {
                        if (var37 == 0) {
                            var38 = (this.field937[var36] * var25 + this.field936[var36] * var23 + this.field930[var36] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var38 = (this.field937[var36] * var25 + this.field936[var36] * var23 + this.field930[var36] * var24) / (var28 * var37) + var27;
                        }
                        if (var38 < 0) {
                            var38 = 0;
                        } else if (var38 > 16384) {
                            var38 = 16384;
                        }
                        this.field941[var36] = (short) (-var38 - 1);
                    }
                    int var39 = method428(this.field959[var29], this.field948[var29], var32, this.field951[var29]);
                    int var40 = method428(this.field959[var29], this.field948[var29], var35, this.field951[var29]);
                    int var41 = method428(this.field959[var29], this.field948[var29], var38, this.field951[var29]);
                    field929.field1012 = var6 * var30 + this.field928.field4226;
                    field929.method510(var39, 102);
                    field929.field1012 = var6 * var33 + this.field928.field4226;
                    field929.method510(var40, 88);
                    field929.field1012 = var6 * var36 + this.field928.field4226;
                    field929.method510(var41, -38);
                }
                this.field936 = null;
                this.field930 = null;
                this.field937 = null;
            }
        }
        if (arg3) {
            float var44 = 3.0F / (float) this.field925;
            float var45 = 3.0F / (float) (this.field925 / 2 + this.field925);
            field929.field1012 = this.field940.field4226;
            if (class47.field749) {
                for (int var46 = 0; var46 < this.field935; var46++) {
                    short var47 = this.field941[var46];
                    if (var47 == 0) {
                        field929.method521((float) this.field936[var46] * var45, (byte) 98);
                        field929.method521((float) this.field930[var46] * var45, (byte) 98);
                        field929.method521((float) this.field937[var46] * var45, (byte) 98);
                    } else {
                        float var48 = var44 / (float) var47;
                        field929.method521((float) this.field936[var46] * var48, (byte) 98);
                        field929.method521((float) this.field930[var46] * var48, (byte) 98);
                        field929.method521((float) this.field937[var46] * var48, (byte) 98);
                    }
                    field929.field1012 += var6 - 12;
                }
            } else {
                for (int var49 = 0; var49 < this.field935; var49++) {
                    short var50 = this.field941[var49];
                    if (var50 == 0) {
                        field929.method475(-19674, (float) this.field936[var49] * var45);
                        field929.method475(-19674, (float) this.field930[var49] * var45);
                        field929.method475(-19674, (float) this.field937[var49] * var45);
                    } else {
                        float var51 = var44 / (float) var50;
                        field929.method475(-19674, (float) this.field936[var49] * var51);
                        field929.method475(-19674, (float) this.field930[var49] * var51);
                        field929.method475(-19674, (float) this.field937[var49] * var51);
                    }
                    field929.field1012 += var6 - 12;
                }
            }
        }
        if (arg4) {
            field929.field1012 = this.field945.field4226;
            if (class47.field749) {
                for (int var52 = 0; var52 < this.field935; var52++) {
                    field929.method521(this.field931[var52], (byte) 98);
                    field929.method521(this.field924[var52], (byte) 98);
                    field929.field1012 += var6 - 8;
                }
            } else {
                for (int var53 = 0; var53 < this.field935; var53++) {
                    field929.method475(-19674, this.field931[var53]);
                    field929.method475(-19674, this.field924[var53]);
                    field929.field1012 += var6 - 8;
                }
            }
        }
        field929.field1012 = this.field935 * var6;
        if (arg0) {
            if (class47.field746) {
                ByteBuffer var54 = ByteBuffer.wrap(field929.field997, 0, field929.field1012);
                if (this.field949 == null) {
                    this.field949 = new class92(true);
                    this.field949.method720(var54);
                } else {
                    this.field949.method721(var54);
                }
                if (arg1) {
                    this.field964.field4227 = true;
                    this.field964.field4231 = null;
                    this.field964.field4238 = this.field949;
                    this.field964.field4228 = var6;
                }
                if (arg2) {
                    this.field928.field4227 = true;
                    this.field928.field4231 = null;
                    this.field928.field4238 = this.field949;
                    this.field928.field4228 = var6;
                }
                if (arg3) {
                    this.field940.field4227 = true;
                    this.field940.field4231 = null;
                    this.field940.field4238 = this.field949;
                    this.field940.field4228 = var6;
                }
                if (arg4) {
                    this.field945.field4227 = true;
                    this.field945.field4231 = null;
                    this.field945.field4238 = this.field949;
                    this.field945.field4228 = var6;
                }
            } else {
                if (field954 == null || field954.capacity() < field929.field1012) {
                    field954 = ByteBuffer.allocateDirect(var6 * 100 + field929.field1012);
                } else {
                    field954.clear();
                }
                field954.put(field929.field997, 0, field929.field1012);
                field954.flip();
                if (arg1) {
                    this.field964.field4227 = true;
                    this.field964.field4231 = field954;
                    this.field964.field4238 = null;
                    this.field964.field4228 = var6;
                }
                if (arg2) {
                    this.field928.field4227 = true;
                    this.field928.field4231 = field954;
                    this.field964.field4238 = null;
                    this.field928.field4228 = var6;
                }
                if (arg3) {
                    this.field940.field4227 = true;
                    this.field940.field4231 = field954;
                    this.field940.field4238 = null;
                    this.field940.field4228 = var6;
                }
                if (arg4) {
                    this.field945.field4227 = true;
                    this.field945.field4231 = field954;
                    this.field945.field4238 = null;
                    this.field945.field4228 = var6;
                }
            }
        } else if (class47.field768) {
            class92 var55 = new class92();
            ByteBuffer var56 = ByteBuffer.wrap(field929.field997, 0, field929.field1012);
            var55.method720(var56);
            if (arg1) {
                this.field964.field4227 = true;
                this.field964.field4231 = null;
                this.field964.field4238 = var55;
                this.field964.field4228 = var6;
            }
            if (arg2) {
                this.field928.field4227 = true;
                this.field928.field4231 = null;
                this.field928.field4238 = var55;
                this.field928.field4228 = var6;
            }
            if (arg3) {
                this.field940.field4227 = true;
                this.field940.field4231 = null;
                this.field940.field4238 = var55;
                this.field940.field4228 = var6;
            }
            if (arg4) {
                this.field945.field4227 = true;
                this.field945.field4231 = null;
                this.field945.field4238 = var55;
                this.field945.field4228 = var6;
            }
        } else {
            ByteBuffer var57 = ByteBuffer.allocateDirect(field929.field1012);
            var57.put(field929.field997, 0, field929.field1012);
            var57.flip();
            if (arg1) {
                this.field964.field4227 = true;
                this.field964.field4231 = var57;
                this.field964.field4238 = null;
                this.field964.field4228 = var6;
            }
            if (arg2) {
                this.field928.field4227 = true;
                this.field928.field4231 = var57;
                this.field964.field4238 = null;
                this.field928.field4228 = var6;
            }
            if (arg3) {
                this.field940.field4227 = true;
                this.field940.field4231 = var57;
                this.field940.field4238 = null;
                this.field940.field4228 = var6;
            }
            if (arg4) {
                this.field945.field4227 = true;
                this.field945.field4231 = var57;
                this.field945.field4238 = null;
                this.field945.field4228 = var6;
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZZ)Lcc;", line = 3054)
    public final class234 method451(boolean arg0, boolean arg1) {
        return this.method458(arg0, arg1, field967, field966);
    }

    @OriginalMember(owner = "client!qk", name = "w", descriptor = "()V", line = 3058)
    private final void method452() {
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < this.field953; var9++) {
            int var10 = this.field939[var9];
            int var11 = this.field938[var9];
            int var12 = this.field944[var9];
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
        this.field923.field2321 = (short) var1;
        this.field923.field2320 = (short) var4;
        this.field923.field2318 = (short) var2;
        this.field923.field2317 = (short) var5;
        this.field923.field2322 = (short) var3;
        this.field923.field2319 = (short) var6;
        this.field923.field2315 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
        Math.sqrt((double) var8);
        this.field923.field2316 = true;
    }

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "()I", line = 3128)
    public final int method453() {
        if (!this.field923.field2316) {
            this.method452();
        }
        return this.field923.field2322;
    }

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "()V", line = 3141)
    public final void method454() {
        for (int var1 = 0; var1 < this.field953; var1++) {
            int var2 = this.field944[var1];
            this.field944[var1] = this.field939[var1];
            this.field939[var1] = -var2;
        }
        this.field923.field2316 = false;
        this.field964.field4227 = false;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(III)V", line = 3158)
    public final void method455(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field953; var4++) {
            this.field939[var4] = this.field939[var4] * arg0 >> 7;
            this.field938[var4] = this.field938[var4] * arg1 >> 7;
            this.field944[var4] = this.field944[var4] * arg2 >> 7;
        }
        this.field923.field2316 = false;
        this.field964.field4227 = false;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "([FI)[F", line = 3172)
    private static final float[] method456(float[] arg0, int arg1) {
        float[] var2 = new float[arg1];
        class231.method1686(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lje;)Lje;", line = 3177)
    public final class68 method457(class68 arg0) {
        if (this.field935 == 0) {
            return null;
        }
        if (!this.field923.field2316) {
            this.method452();
        }
        int var2;
        int var3;
        if (class239.field4039 > 0) {
            var2 = this.field923.field2321 - (class239.field4039 * this.field923.field2317 >> 8) >> 3;
            var3 = this.field923.field2320 - (class239.field4039 * this.field923.field2318 >> 8) >> 3;
        } else {
            var2 = this.field923.field2321 - (class239.field4039 * this.field923.field2318 >> 8) >> 3;
            var3 = this.field923.field2320 - (class239.field4039 * this.field923.field2317 >> 8) >> 3;
        }
        int var4;
        int var5;
        if (class239.field4035 > 0) {
            var4 = this.field923.field2322 - (class239.field4035 * this.field923.field2317 >> 8) >> 3;
            var5 = this.field923.field2319 - (class239.field4035 * this.field923.field2318 >> 8) >> 3;
        } else {
            var4 = this.field923.field2322 - (class239.field4035 * this.field923.field2318 >> 8) >> 3;
            var5 = this.field923.field2319 - (class239.field4035 * this.field923.field2317 >> 8) >> 3;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class68 var8;
        if (arg0 == null || arg0.field1179.length < var6 * var7) {
            var8 = new class68(var6, var7, 0);
        } else {
            var8 = arg0;
            arg0.field3997 = arg0.field4007 = var6;
            arg0.field3996 = arg0.field3999 = var7;
            arg0.method578();
        }
        var8.field4005 = var2;
        var8.field4002 = var4;
        if (field974.length < this.field935) {
            field974 = new int[this.field935];
            field971 = new int[this.field935];
        }
        for (int var9 = 0; var9 < this.field953; var9++) {
            int var10 = (this.field939[var9] - (this.field938[var9] * class239.field4039 >> 8) >> 3) - var2;
            int var11 = (this.field944[var9] - (this.field938[var9] * class239.field4035 >> 8) >> 3) - var4;
            int var12 = this.field956[var9];
            int var13 = this.field956[var9 + 1];
            for (int var14 = var12; var14 < var13; var14++) {
                int var15 = this.field942[var14] - 1;
                if (var15 == -1) {
                    break;
                }
                field974[var15] = var10;
                field971[var15] = var11;
            }
        }
        for (int var16 = 0; var16 < this.field927; var16++) {
            if (this.field951[var16] <= 128) {
                short var17 = this.field961[var16];
                short var18 = this.field957[var16];
                short var19 = this.field926[var16];
                int var20 = field974[var17];
                int var21 = field974[var18];
                int var22 = field974[var19];
                int var23 = field971[var17];
                int var24 = field971[var18];
                int var25 = field971[var19];
                if ((var20 - var21) * (var24 - var25) - (var22 - var21) * (var24 - var23) > 0) {
                    class21.method143(var8.field1179, var23, var24, var25, var20, var21, var22, var6);
                }
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZZLqk;Lqk;)Lcc;", line = 3300)
    private final class234 method458(boolean arg0, boolean arg1, class57 arg2, class57 arg3) {
        arg2.field953 = this.field953;
        arg2.field935 = this.field935;
        arg2.field927 = this.field927;
        arg2.field947 = this.field947;
        arg2.field925 = this.field925;
        arg2.field933 = (byte) ((arg0 ? 0 : 2) | 0x1 | (arg1 ? 0 : 4));
        if (arg2.field939 == null || arg2.field939.length < this.field953) {
            arg2.field939 = new int[this.field953 + 100];
            arg2.field938 = new int[this.field953 + 100];
            arg2.field944 = new int[this.field953 + 100];
        }
        for (int var5 = 0; var5 < this.field953; var5++) {
            arg2.field939[var5] = this.field939[var5];
            arg2.field938[var5] = this.field938[var5];
            arg2.field944[var5] = this.field944[var5];
        }
        if (arg2.field964 == null) {
            arg2.field964 = new class252();
        }
        arg2.field964.field4227 = false;
        if (arg2.field923 == null) {
            arg2.field923 = new class135();
        }
        arg2.field923.field2316 = false;
        if (arg0) {
            arg2.field951 = this.field951;
            arg2.field928 = this.field928;
        } else {
            if (arg3.field951 == null || arg3.field951.length < this.field927) {
                arg3.field951 = new byte[this.field927 + 100];
            }
            arg2.field951 = arg3.field951;
            for (int var6 = 0; var6 < this.field927; var6++) {
                arg2.field951[var6] = this.field951[var6];
            }
            if (arg3.field928 == null) {
                arg3.field928 = new class252();
            }
            arg2.field928 = arg3.field928;
            arg2.field928.field4227 = false;
        }
        if (arg1) {
            arg2.field936 = this.field936;
            arg2.field930 = this.field930;
            arg2.field937 = this.field937;
            arg2.field941 = this.field941;
            arg2.field940 = this.field940;
        } else {
            if (arg3.field936 == null || arg3.field936.length < this.field935) {
                arg3.field936 = new short[this.field935 + 100];
                arg3.field930 = new short[this.field935 + 100];
                arg3.field937 = new short[this.field935 + 100];
                arg3.field941 = new short[this.field935 + 100];
            }
            arg2.field936 = arg3.field936;
            arg2.field930 = arg3.field930;
            arg2.field937 = arg3.field937;
            arg2.field941 = arg3.field941;
            for (int var7 = 0; var7 < this.field935; var7++) {
                arg2.field936[var7] = this.field936[var7];
                arg2.field930[var7] = this.field930[var7];
                arg2.field937[var7] = this.field937[var7];
                arg2.field941[var7] = this.field941[var7];
            }
            if (class116.field1970) {
                if (arg3.field940 == null) {
                    arg3.field940 = new class252();
                }
                arg2.field940 = arg3.field940;
                arg2.field940.field4227 = false;
            } else {
                arg2.field940 = null;
            }
        }
        arg2.field931 = this.field931;
        arg2.field924 = this.field924;
        arg2.field934 = this.field934;
        arg2.field958 = this.field958;
        arg2.field959 = this.field959;
        arg2.field961 = this.field961;
        arg2.field957 = this.field957;
        arg2.field926 = this.field926;
        arg2.field948 = this.field948;
        arg2.field946 = this.field946;
        arg2.field952 = this.field952;
        arg2.field945 = this.field945;
        arg2.field950 = this.field950;
        arg2.field932 = this.field932;
        arg2.field942 = this.field942;
        arg2.field956 = this.field956;
        arg2.field3956 = this.field3956;
        return arg2;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(FFF)I", line = 3426)
    private static final int method459(float arg0, float arg1, float arg2) {
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

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "([SI)[S", line = 3464)
    private static final short[] method460(short[] arg0, int arg1) {
        short[] var2 = new short[arg1];
        class231.method1692(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIII[FFIF)V", line = 3469)
    private static final void method461(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9) {
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
        field973 = var16;
        field969 = var17;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IILqk;[[I[[IIII)V", line = 3520)
    public final void method462(int arg0, int arg1, class57 arg2, int[][] arg3, int[][] arg4, int arg5, int arg6, int arg7) {
        if (!arg2.field923.field2316) {
            arg2.method452();
        }
        int var9 = arg2.field923.field2321 + arg5;
        int var10 = arg2.field923.field2320 + arg5;
        int var11 = arg2.field923.field2322 + arg7;
        int var12 = arg2.field923.field2319 + arg7;
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
            for (int var17 = 0; var17 < this.field953; var17++) {
                int var18 = this.field939[var17] + arg5;
                int var19 = this.field944[var17] + arg7;
                int var20 = var18 & 0x7F;
                int var21 = var19 & 0x7F;
                int var22 = var18 >> 7;
                int var23 = var19 >> 7;
                int var24 = (128 - var20) * arg3[var22][var23] + arg3[var22 + 1][var23] * var20 >> 7;
                int var25 = (128 - var20) * arg3[var22][var23 + 1] + arg3[var22 + 1][var23 + 1] * var20 >> 7;
                int var26 = (128 - var21) * var24 + var21 * var25 >> 7;
                this.field938[var17] = this.field938[var17] + var26 - arg6;
            }
        } else if (arg0 == 2) {
            short var27 = arg2.field923.field2318;
            for (int var28 = 0; var28 < this.field953; var28++) {
                int var29 = (this.field938[var28] << 16) / var27;
                if (var29 < arg1) {
                    int var30 = this.field939[var28] + arg5;
                    int var31 = this.field944[var28] + arg7;
                    int var32 = var30 & 0x7F;
                    int var33 = var31 & 0x7F;
                    int var34 = var30 >> 7;
                    int var35 = var31 >> 7;
                    int var36 = (128 - var32) * arg3[var34][var35] + arg3[var34 + 1][var35] * var32 >> 7;
                    int var37 = (128 - var32) * arg3[var34][var35 + 1] + arg3[var34 + 1][var35 + 1] * var32 >> 7;
                    int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                    this.field938[var28] += (arg1 - var29) * (var38 - arg6) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var39 = (arg1 & 0xFF) * 4;
            int var40 = (arg1 >> 8 & 0xFF) * 4;
            this.method1707(arg3, arg5, arg6, arg7, var39, var40);
        } else if (arg0 == 4) {
            int var41 = arg2.field923.field2317 - arg2.field923.field2318;
            for (int var42 = 0; var42 < this.field953; var42++) {
                int var43 = this.field939[var42] + arg5;
                int var44 = this.field944[var42] + arg7;
                int var45 = var43 & 0x7F;
                int var46 = var44 & 0x7F;
                int var47 = var43 >> 7;
                int var48 = var44 >> 7;
                int var49 = (128 - var45) * arg4[var47][var48] + arg4[var47 + 1][var48] * var45 >> 7;
                int var50 = (128 - var45) * arg4[var47][var48 + 1] + arg4[var47 + 1][var48 + 1] * var45 >> 7;
                int var51 = (128 - var46) * var49 + var46 * var50 >> 7;
                this.field938[var42] = var51 + this.field938[var42] + var41 - arg6;
            }
        } else if (arg0 == 5) {
            int var52 = arg2.field923.field2317 - arg2.field923.field2318;
            for (int var53 = 0; var53 < this.field953; var53++) {
                int var54 = this.field939[var53] + arg5;
                int var55 = this.field944[var53] + arg7;
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
                this.field938[var53] = ((this.field938[var53] << 8) / var52 * var66 >> 8) - (arg6 - var62);
            }
        }
        this.field964.field4227 = false;
        this.field923.field2316 = false;
    }

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "(I)V", line = 3719)
    public final void method463(int arg0) {
        this.field947 = (short) arg0;
        this.field928.field4227 = false;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(SS)V", line = 4470)
    public final void method464(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field927; var3++) {
            if (this.field959[var3] == arg0) {
                this.field959[var3] = arg1;
            }
        }
        this.field928.field4227 = false;
    }
}
