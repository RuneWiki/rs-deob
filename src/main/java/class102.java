import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class102 extends class338 {

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "Z")
    private static boolean field1208 = false;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
    private int field1201;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
    private int field1202;

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
    private static int field1204;

    @OriginalMember(owner = "client!tb", name = "x", descriptor = "I")
    private static int field1211;

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "I")
    private int field1213;

    @OriginalMember(owner = "client!tb", name = "D", descriptor = "I")
    private int field1217;

    @OriginalMember(owner = "client!tb", name = "F", descriptor = "I")
    private static int field1219;

    @OriginalMember(owner = "client!tb", name = "J", descriptor = "I")
    private int field1223;

    @OriginalMember(owner = "client!tb", name = "L", descriptor = "I")
    private static int field1225;

    @OriginalMember(owner = "client!tb", name = "N", descriptor = "I")
    private int field1227;

    @OriginalMember(owner = "client!tb", name = "R", descriptor = "I")
    private int field1231;

    @OriginalMember(owner = "client!tb", name = "S", descriptor = "I")
    private int field1232;

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "Z")
    private boolean field1205;

    @OriginalMember(owner = "client!tb", name = "P", descriptor = "Z")
    private boolean field1229;

    @OriginalMember(owner = "client!tb", name = "Q", descriptor = "[B")
    private static byte[] field1230;

    @OriginalMember(owner = "client!tb", name = "T", descriptor = "[B")
    private byte[] field1233;

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "[F")
    private float[] field1206;

    @OriginalMember(owner = "client!tb", name = "w", descriptor = "[F")
    private static float[] field1210;

    @OriginalMember(owner = "client!tb", name = "y", descriptor = "[F")
    private static float[] field1212;

    @OriginalMember(owner = "client!tb", name = "C", descriptor = "[F")
    private static float[] field1216;

    @OriginalMember(owner = "client!tb", name = "E", descriptor = "[F")
    private static float[] field1218;

    @OriginalMember(owner = "client!tb", name = "K", descriptor = "[F")
    private static float[] field1224;

    @OriginalMember(owner = "client!tb", name = "M", descriptor = "[F")
    private static float[] field1226;

    @OriginalMember(owner = "client!tb", name = "O", descriptor = "[F")
    private static float[] field1228;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "[I")
    private static int[] field1200;

    @OriginalMember(owner = "client!tb", name = "B", descriptor = "[I")
    private static int[] field1215;

    @OriginalMember(owner = "client!tb", name = "H", descriptor = "[I")
    private static int[] field1221;

    @OriginalMember(owner = "client!tb", name = "A", descriptor = "[Lpk;")
    private static class150[] field1214;

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "[Ldc;")
    public static class375[] field1209;

    @OriginalMember(owner = "client!tb", name = "G", descriptor = "[Lci;")
    private static class387[] field1220;

    @OriginalMember(owner = "client!tb", name = "I", descriptor = "[Ljl;")
    private static class391[] field1222;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "[Z")
    private static boolean[] field1203;

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "[[B")
    private byte[][] field1207;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lam;)Z")
    private static final boolean method544(class286 arg0) {
        if (!field1208) {
            byte[] var1 = arg0.method1687(0, 0, 255);
            if (var1 == null) {
                return false;
            }
            method553(var1);
            field1208 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lam;II)Ltb;")
    public static final class102 method545(class286 arg0, int arg1, int arg2) {
        if (method544(arg0)) {
            byte[] var3 = arg0.method1687(arg2, arg1, 255);
            return var3 == null ? null : new class102(var3);
        } else {
            arg0.method1675(arg2, arg1, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "(I)[F")
    private final float[] method546(int arg0) {
        method552(this.field1207[arg0], 0);
        method551();
        int var2 = method550(class220.method1194(field1221.length - 1, false));
        boolean var3 = field1203[var2];
        int var4 = var3 ? field1211 : field1204;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method551() != 0;
            var6 = method551() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field1204 >> 2);
            var9 = (field1204 >> 2) + (var4 >> 2);
            var10 = field1204 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field1204 >> 2);
            var12 = (field1204 >> 2) + (var4 - (var4 >> 2));
            var13 = field1204 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class150 var14 = field1214[field1221[var2]];
        int var15 = var14.field1906;
        int var16 = var14.field1903[var15];
        boolean var17 = !field1220[var16].method2404();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field1905; var19++) {
            class391 var95 = field1222[var14.field1904[var19]];
            float[] var96 = field1228;
            var95.method2437(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field1906;
            int var21 = var14.field1903[var20];
            field1220[var21].method2402(field1228, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field1228[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field1228;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field1216 : field1218;
            float[] var30 = var3 ? field1210 : field1212;
            float[] var31 = var3 ? field1226 : field1224;
            int[] var32 = var3 ? field1215 : field1200;
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
            int var35 = class220.method1194(var4 - 1, false);
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
                field1228[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field1228[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field1213 > 0) {
            int var49 = this.field1213 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field1205) {
                for (int var50 = 0; var50 < this.field1223; var50++) {
                    int var51 = (this.field1213 >> 1) + var50;
                    var48[var50] += this.field1206[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field1228[var52];
                }
            }
        }
        float[] var54 = this.field1206;
        this.field1206 = field1228;
        field1228 = var54;
        this.field1213 = var4;
        this.field1223 = var12 - (var4 >> 1);
        this.field1205 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "()V")
    public static void method547() {
        field1230 = null;
        field1209 = null;
        field1220 = null;
        field1222 = null;
        field1214 = null;
        field1203 = null;
        field1221 = null;
        field1228 = null;
        field1218 = null;
        field1212 = null;
        field1224 = null;
        field1216 = null;
        field1210 = null;
        field1226 = null;
        field1200 = null;
        field1215 = null;
    }

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "(I)F")
    public static final float method548(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "([I)Lwo;")
    public final class52 method549(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field1233 == null) {
            this.field1213 = 0;
            this.field1206 = new float[field1211];
            this.field1233 = new byte[this.field1227];
            this.field1232 = 0;
            this.field1231 = 0;
        }
        while (this.field1231 < this.field1207.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method546(this.field1231);
            if (var3 != null) {
                int var4 = this.field1232;
                int var5 = var3.length;
                if (var5 > this.field1227 - var4) {
                    var5 = this.field1227 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field1233[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field1232;
                }
                this.field1232 = var4;
            }
            this.field1231++;
        }
        this.field1206 = null;
        byte[] var2 = this.field1233;
        this.field1233 = null;
        return new class52(this.field1217, var2, this.field1201, this.field1202, this.field1229);
    }

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "(I)I")
    public static final int method550(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field1225) {
            int var4 = 8 - field1225;
            int var5 = (0x1 << var4) - 1;
            var1 += (field1230[field1219] >> field1225 & var5) << var2;
            field1225 = 0;
            field1219++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field1230[field1219] >> field1225 & var3) << var2;
            field1225 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "()I")
    public static final int method551() {
        int var0 = field1230[field1219] >> field1225 & 0x1;
        field1225++;
        field1219 += field1225 >> 3;
        field1225 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "([BI)V")
    private static final void method552(byte[] arg0, int arg1) {
        field1230 = arg0;
        field1219 = arg1;
        field1225 = 0;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "([B)V")
    private static final void method553(byte[] arg0) {
        method552(arg0, 0);
        field1204 = 0x1 << method550(4);
        field1211 = 0x1 << method550(4);
        field1228 = new float[field1211];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field1204 : field1211;
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
            int var25 = class220.method1194(var17 - 1, false);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class322.method1854(var26, var25, 124);
            }
            if (var1 == 0) {
                field1218 = var18;
                field1212 = var20;
                field1224 = var22;
                field1200 = var24;
            } else {
                field1216 = var18;
                field1210 = var20;
                field1226 = var22;
                field1215 = var24;
            }
        }
        int var2 = method550(8) + 1;
        field1209 = new class375[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1209[var3] = new class375();
        }
        int var4 = method550(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method550(16);
        }
        int var6 = method550(6) + 1;
        field1220 = new class387[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field1220[var7] = new class387();
        }
        int var8 = method550(6) + 1;
        field1222 = new class391[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field1222[var9] = new class391();
        }
        int var10 = method550(6) + 1;
        field1214 = new class150[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field1214[var11] = new class150();
        }
        int var12 = method550(6) + 1;
        field1203 = new boolean[var12];
        field1221 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field1203[var13] = method551() != 0;
            method550(16);
            method550(16);
            field1221[var13] = method550(8);
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "([B)V")
    private final void method554(byte[] arg0) {
        class250 var2 = new class250(arg0);
        this.field1217 = var2.method1359(255);
        this.field1227 = var2.method1359(255);
        this.field1201 = var2.method1359(255);
        this.field1202 = var2.method1359(255);
        if (this.field1202 < 0) {
            this.field1202 = ~this.field1202;
            this.field1229 = true;
        }
        int var3 = var2.method1359(255);
        this.field1207 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1350(31351);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1351(var7, (byte) -125, 0, var5);
            this.field1207[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "([B)V")
    private class102(byte[] arg0) {
        this.method554(arg0);
    }
}
