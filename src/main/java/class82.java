import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class82 extends class42 {

    @OriginalMember(owner = "client!di", name = "F", descriptor = "Z")
    private static boolean field1218 = false;

    @OriginalMember(owner = "client!di", name = "n", descriptor = "I")
    private int field1200;

    @OriginalMember(owner = "client!di", name = "q", descriptor = "I")
    private int field1203;

    @OriginalMember(owner = "client!di", name = "s", descriptor = "I")
    private static int field1205;

    @OriginalMember(owner = "client!di", name = "u", descriptor = "I")
    private static int field1207;

    @OriginalMember(owner = "client!di", name = "x", descriptor = "I")
    private int field1210;

    @OriginalMember(owner = "client!di", name = "z", descriptor = "I")
    private static int field1212;

    @OriginalMember(owner = "client!di", name = "B", descriptor = "I")
    private static int field1214;

    @OriginalMember(owner = "client!di", name = "C", descriptor = "I")
    private int field1215;

    @OriginalMember(owner = "client!di", name = "M", descriptor = "I")
    private int field1224;

    @OriginalMember(owner = "client!di", name = "O", descriptor = "I")
    private int field1226;

    @OriginalMember(owner = "client!di", name = "U", descriptor = "I")
    private int field1232;

    @OriginalMember(owner = "client!di", name = "V", descriptor = "I")
    private int field1233;

    @OriginalMember(owner = "client!di", name = "y", descriptor = "Z")
    private boolean field1211;

    @OriginalMember(owner = "client!di", name = "D", descriptor = "Z")
    private boolean field1216;

    @OriginalMember(owner = "client!di", name = "H", descriptor = "[B")
    private static byte[] field1220;

    @OriginalMember(owner = "client!di", name = "T", descriptor = "[B")
    private byte[] field1231;

    @OriginalMember(owner = "client!di", name = "r", descriptor = "[F")
    private static float[] field1204;

    @OriginalMember(owner = "client!di", name = "A", descriptor = "[F")
    private float[] field1213;

    @OriginalMember(owner = "client!di", name = "E", descriptor = "[F")
    private static float[] field1217;

    @OriginalMember(owner = "client!di", name = "L", descriptor = "[F")
    private static float[] field1223;

    @OriginalMember(owner = "client!di", name = "N", descriptor = "[F")
    private static float[] field1225;

    @OriginalMember(owner = "client!di", name = "P", descriptor = "[F")
    private static float[] field1227;

    @OriginalMember(owner = "client!di", name = "Q", descriptor = "[F")
    private static float[] field1228;

    @OriginalMember(owner = "client!di", name = "S", descriptor = "[F")
    private static float[] field1230;

    @OriginalMember(owner = "client!di", name = "p", descriptor = "[I")
    private static int[] field1202;

    @OriginalMember(owner = "client!di", name = "w", descriptor = "[I")
    private static int[] field1209;

    @OriginalMember(owner = "client!di", name = "G", descriptor = "[I")
    private static int[] field1219;

    @OriginalMember(owner = "client!di", name = "v", descriptor = "[Llg;")
    public static class284[] field1208;

    @OriginalMember(owner = "client!di", name = "t", descriptor = "[Lpb;")
    private static class464[] field1206;

    @OriginalMember(owner = "client!di", name = "o", descriptor = "[Lih;")
    private static class492[] field1201;

    @OriginalMember(owner = "client!di", name = "J", descriptor = "[Ler;")
    private static class68[] field1221;

    @OriginalMember(owner = "client!di", name = "K", descriptor = "[Z")
    private static boolean[] field1222;

    @OriginalMember(owner = "client!di", name = "R", descriptor = "[[B")
    private byte[][] field1229;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)[F", line = 6)
    private final float[] method504(int arg0) {
        method506(this.field1229[arg0], 0);
        method514();
        int var2 = method513(class302.method1758(16, field1209.length - 1));
        boolean var3 = field1222[var2];
        int var4 = var3 ? field1207 : field1214;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method514() != 0;
            var6 = method514() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field1214 >> 2);
            var9 = (field1214 >> 2) + (var4 >> 2);
            var10 = field1214 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field1214 >> 2);
            var12 = (field1214 >> 2) + (var4 - (var4 >> 2));
            var13 = field1214 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class492 var14 = field1201[field1209[var2]];
        int var15 = var14.field6845;
        int var16 = var14.field6847[var15];
        boolean var17 = !field1221[var16].method456();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field6844; var19++) {
            class464 var95 = field1206[var14.field6846[var19]];
            float[] var96 = field1223;
            var95.method2644(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field6845;
            int var21 = var14.field6847[var20];
            field1221[var21].method452(field1223, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field1223[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field1223;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field1225 : field1230;
            float[] var30 = var3 ? field1204 : field1228;
            float[] var31 = var3 ? field1227 : field1217;
            int[] var32 = var3 ? field1202 : field1219;
            for (int var33 = 0; var33 < var24; var33++) {
                float var91 = var26[var33 * 4] - var26[var4 - var33 * 4 - 1];
                float var92 = var26[var33 * 4 + 2] - var26[var4 - var33 * 4 - 3];
                float var93 = var29[var33 * 2];
                float var94 = var29[var33 * 2 + 1];
                var26[var4 - var33 * 4 - 1] = var91 * var93 - var92 * var94;
                var26[var4 - var33 * 4 - 3] = var91 * var94 + var92 * var93;
            }
            for (int var34 = 0; var34 < var25; var34++) {
                float var85 = var26[var34 * 4 + var23 + 3];
                float var86 = var26[var34 * 4 + var23 + 1];
                float var87 = var26[var34 * 4 + 3];
                float var88 = var26[var34 * 4 + 1];
                var26[var34 * 4 + var23 + 3] = var85 + var87;
                var26[var34 * 4 + var23 + 1] = var86 + var88;
                float var89 = var29[var23 - var34 * 4 - 4];
                float var90 = var29[var23 - var34 * 4 - 3];
                var26[var34 * 4 + 3] = (var85 - var87) * var89 - (var86 - var88) * var90;
                var26[var34 * 4 + 1] = (var85 - var87) * var90 + (var86 - var88) * var89;
            }
            int var35 = class302.method1758(16, var4 - 1);
            for (int var36 = 0; var36 < var35 - 3; var36++) {
                int var72 = var4 >> var36 + 2;
                int var73 = 0x8 << var36;
                for (int var74 = 0; var74 < 0x2 << var36; var74++) {
                    int var75 = var4 - var72 * 2 * var74;
                    int var76 = var4 - (var74 * 2 + 1) * var72;
                    for (int var77 = 0; var77 < var4 >> var36 + 4; var77++) {
                        int var78 = var77 * 4;
                        float var79 = var26[var75 - var78 - 1];
                        float var80 = var26[var75 - var78 - 3];
                        float var81 = var26[var76 - var78 - 1];
                        float var82 = var26[var76 - var78 - 3];
                        var26[var75 - var78 - 1] = var79 + var81;
                        var26[var75 - var78 - 3] = var80 + var82;
                        float var83 = var29[var73 * var77];
                        float var84 = var29[var73 * var77 + 1];
                        var26[var76 - var78 - 1] = (var79 - var81) * var83 - (var80 - var82) * var84;
                        var26[var76 - var78 - 3] = (var79 - var81) * var84 + (var80 - var82) * var83;
                    }
                }
            }
            for (int var37 = 1; var37 < var25 - 1; var37++) {
                int var65 = var32[var37];
                if (var37 < var65) {
                    int var66 = var37 * 8;
                    int var67 = var65 * 8;
                    float var68 = var26[var66 + 1];
                    var26[var66 + 1] = var26[var67 + 1];
                    var26[var67 + 1] = var68;
                    float var69 = var26[var66 + 3];
                    var26[var66 + 3] = var26[var67 + 3];
                    var26[var67 + 3] = var69;
                    float var70 = var26[var66 + 5];
                    var26[var66 + 5] = var26[var67 + 5];
                    var26[var67 + 5] = var70;
                    float var71 = var26[var66 + 7];
                    var26[var66 + 7] = var26[var67 + 7];
                    var26[var67 + 7] = var71;
                }
            }
            for (int var38 = 0; var38 < var23; var38++) {
                var26[var38] = var26[var38 * 2 + 1];
            }
            for (int var39 = 0; var39 < var25; var39++) {
                var26[var4 - var39 * 2 - 1] = var26[var39 * 4];
                var26[var4 - var39 * 2 - 2] = var26[var39 * 4 + 1];
                var26[var4 - var24 - var39 * 2 - 1] = var26[var39 * 4 + 2];
                var26[var4 - var24 - var39 * 2 - 2] = var26[var39 * 4 + 3];
            }
            for (int var40 = 0; var40 < var25; var40++) {
                float var57 = var31[var40 * 2];
                float var58 = var31[var40 * 2 + 1];
                float var59 = var26[var40 * 2 + var23];
                float var60 = var26[var40 * 2 + var23 + 1];
                float var61 = var26[var4 - var40 * 2 - 2];
                float var62 = var26[var4 - var40 * 2 - 1];
                float var63 = (var59 - var61) * var58 + (var60 + var62) * var57;
                var26[var40 * 2 + var23] = (var59 + var61 + var63) * 0.5F;
                var26[var4 - var40 * 2 - 2] = (var59 + var61 - var63) * 0.5F;
                float var64 = (var60 + var62) * var58 - (var59 - var61) * var57;
                var26[var40 * 2 + var23 + 1] = (var60 + var64 - var62) * 0.5F;
                var26[var4 - var40 * 2 - 1] = (var62 + var64 - var60) * 0.5F;
            }
            for (int var41 = 0; var41 < var24; var41++) {
                var26[var41] = var30[var41 * 2] * var26[var41 * 2 + var23] + var30[var41 * 2 + 1] * var26[var41 * 2 + var23 + 1];
                var26[var23 - var41 - 1] = var26[var41 * 2 + var23] * var30[var41 * 2 + 1] - var30[var41 * 2] * var26[var41 * 2 + var23 + 1];
            }
            for (int var42 = 0; var42 < var24; var42++) {
                var26[var4 + var42 - var24] = -var26[var42];
            }
            for (int var43 = 0; var43 < var24; var43++) {
                var26[var43] = var26[var24 + var43];
            }
            for (int var44 = 0; var44 < var24; var44++) {
                var26[var24 + var44] = -var26[var24 - var44 - 1];
            }
            for (int var45 = 0; var45 < var24; var45++) {
                var26[var23 + var45] = var26[var4 - var45 - 1];
            }
            for (int var46 = var8; var46 < var9; var46++) {
                float var56 = (float) Math.sin(((double) (var46 - var8) + 0.5D) / (double) var10 * 0.5D * 3.141592653589793D);
                field1223[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field1223[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field1226 > 0) {
            int var49 = this.field1226 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field1211) {
                for (int var50 = 0; var50 < this.field1224; var50++) {
                    int var51 = (this.field1226 >> 1) + var50;
                    var48[var50] += this.field1213[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field1223[var52];
                }
            }
        }
        float[] var54 = this.field1213;
        this.field1213 = field1223;
        field1223 = var54;
        this.field1226 = var4;
        this.field1224 = var12 - (var4 >> 1);
        this.field1211 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lpc;II)Ldi;", line = 426)
    public static final class82 method505(class473 arg0, int arg1, int arg2) {
        if (method507(arg0)) {
            byte[] var3 = arg0.method2708(arg1, arg2, (byte) 54);
            return var3 == null ? null : new class82(var3);
        } else {
            arg0.method2723(arg2, arg1, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "([BI)V", line = 442)
    private static final void method506(byte[] arg0, int arg1) {
        field1220 = arg0;
        field1212 = arg1;
        field1205 = 0;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lpc;)Z", line = 453)
    private static final boolean method507(class473 arg0) {
        if (!field1218) {
            byte[] var1 = arg0.method2708(0, 0, (byte) 54);
            if (var1 == null) {
                return false;
            }
            method510(var1);
            field1218 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lpc;I)Ldi;", line = 467)
    public static final class82 method508(class473 arg0, int arg1) {
        if (method507(arg0)) {
            byte[] var2 = arg0.method2707(arg1, 0);
            return var2 == null ? null : new class82(var2);
        } else {
            arg0.method2721(arg1, (byte) 119);
            return null;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "([I)Luo;", line = 483)
    public final class404 method509(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field1231 == null) {
            this.field1226 = 0;
            this.field1213 = new float[field1207];
            this.field1231 = new byte[this.field1200];
            this.field1233 = 0;
            this.field1232 = 0;
        }
        while (this.field1232 < this.field1229.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method504(this.field1232);
            if (var3 != null) {
                int var4 = this.field1233;
                int var5 = var3.length;
                if (var5 > this.field1200 - var4) {
                    var5 = this.field1200 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field1231[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field1233;
                }
                this.field1233 = var4;
            }
            this.field1232++;
        }
        this.field1213 = null;
        byte[] var2 = this.field1231;
        this.field1231 = null;
        return new class404(this.field1210, var2, this.field1215, this.field1203, this.field1216);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "([B)V", line = 542)
    private static final void method510(byte[] arg0) {
        method506(arg0, 0);
        field1214 = 0x1 << method513(4);
        field1207 = 0x1 << method513(4);
        field1223 = new float[field1207];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field1214 : field1207;
            int var15 = var14 >> 1;
            int var16 = var14 >> 2;
            int var17 = var14 >> 3;
            float[] var18 = new float[var15];
            for (int var19 = 0; var19 < var16; var19++) {
                var18[var19 * 2] = (float) Math.cos((double) (var19 * 4) * 3.141592653589793D / (double) var14);
                var18[var19 * 2 + 1] = -((float) Math.sin((double) (var19 * 4) * 3.141592653589793D / (double) var14));
            }
            float[] var20 = new float[var15];
            for (int var21 = 0; var21 < var16; var21++) {
                var20[var21 * 2] = (float) Math.cos((double) (var21 * 2 + 1) * 3.141592653589793D / (double) (var14 * 2));
                var20[var21 * 2 + 1] = (float) Math.sin((double) (var21 * 2 + 1) * 3.141592653589793D / (double) (var14 * 2));
            }
            float[] var22 = new float[var16];
            for (int var23 = 0; var23 < var17; var23++) {
                var22[var23 * 2] = (float) Math.cos((double) (var23 * 4 + 2) * 3.141592653589793D / (double) var14);
                var22[var23 * 2 + 1] = -((float) Math.sin((double) (var23 * 4 + 2) * 3.141592653589793D / (double) var14));
            }
            int[] var24 = new int[var17];
            int var25 = class302.method1758(16, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class222.method1396(var25, -4465, var26);
            }
            if (var1 == 0) {
                field1230 = var18;
                field1228 = var20;
                field1217 = var22;
                field1219 = var24;
            } else {
                field1225 = var18;
                field1204 = var20;
                field1227 = var22;
                field1202 = var24;
            }
        }
        int var2 = method513(8) + 1;
        field1208 = new class284[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1208[var3] = new class284();
        }
        int var4 = method513(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method513(16);
        }
        int var6 = method513(6) + 1;
        field1221 = new class68[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field1221[var7] = new class68();
        }
        int var8 = method513(6) + 1;
        field1206 = new class464[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field1206[var9] = new class464();
        }
        int var10 = method513(6) + 1;
        field1201 = new class492[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field1201[var11] = new class492();
        }
        int var12 = method513(6) + 1;
        field1222 = new boolean[var12];
        field1209 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field1222[var13] = method514() != 0;
            method513(16);
            method513(16);
            field1209[var13] = method513(8);
        }
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "(I)F", line = 699)
    public static final float method511(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "([B)V", line = 715)
    private final void method512(byte[] arg0) {
        class379 var2 = new class379(arg0);
        this.field1210 = var2.method2232((byte) 125);
        this.field1200 = var2.method2232((byte) 126);
        this.field1215 = var2.method2232((byte) 124);
        this.field1203 = var2.method2232((byte) 125);
        if (this.field1203 < 0) {
            this.field1203 = ~this.field1203;
            this.field1216 = true;
        }
        int var3 = var2.method2232((byte) 124);
        this.field1229 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method2238(255);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method2191(0, -9637, var7, var5);
            this.field1229[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!di", name = "e", descriptor = "(I)I", line = 759)
    public static final int method513(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field1205) {
            int var4 = 8 - field1205;
            int var5 = (0x1 << var4) - 1;
            var1 += (field1220[field1212] >> field1205 & var5) << var2;
            field1205 = 0;
            field1212++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field1220[field1212] >> field1205 & var3) << var2;
            field1205 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "()I", line = 787)
    public static final int method514() {
        int var0 = field1220[field1212] >> field1205 & 0x1;
        field1205++;
        field1212 += field1205 >> 3;
        field1205 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "()V", line = 794)
    public static void method515() {
        field1220 = null;
        field1208 = null;
        field1221 = null;
        field1206 = null;
        field1201 = null;
        field1222 = null;
        field1209 = null;
        field1223 = null;
        field1230 = null;
        field1228 = null;
        field1217 = null;
        field1225 = null;
        field1204 = null;
        field1227 = null;
        field1219 = null;
        field1202 = null;
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "([B)V", line = 815)
    private class82(byte[] arg0) {
        this.method512(arg0);
    }
}
