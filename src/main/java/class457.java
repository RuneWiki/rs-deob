import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class457 {

    @OriginalMember(owner = "client!h", name = "c", descriptor = "[I")
    private int[] field6588;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "[I")
    private int[] field6589;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "Liu;")
    public static class517 field6591 = new class517(109, -1);

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public static int field6586;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public static int field6587;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "I")
    public static int field6590;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    private int field6592;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "I")
    public static int field6594;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "I")
    private int field6595;

    @OriginalMember(owner = "client!h", name = "k", descriptor = "I")
    private int field6596;

    @OriginalMember(owner = "client!h", name = "l", descriptor = "I")
    public static int field6597;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "I")
    public static int field6598;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "I")
    private int field6599;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "[I")
    public static int[] field6593;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
    private final void method2675(int arg0) {
        field6586++;
        this.field6595 += ++this.field6596;
        for (int var2 = arg0; var2 < 256; var2++) {
            int var3 = this.field6588[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field6599 ^= this.field6599 << 13;
                } else {
                    this.field6599 ^= this.field6599 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field6599 ^= this.field6599 << 2;
            } else {
                this.field6599 ^= this.field6599 >>> 16;
            }
            this.field6599 += this.field6588[var2 + 128 & 0xFF];
            int var4;
            this.field6588[var2] = var4 = this.field6599 + (this.field6588[class424.method2540(1020, var3) >> 2] + this.field6595);
            this.field6589[var2] = this.field6595 = var3 + this.field6588[class424.method2540(255, var4 >> 8 >> 2)];
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(I)V")
    private final void method2676(int arg0) {
        field6598++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var6 + var61;
            int var63 = var7 + var8;
            int var64 = var63 ^ var7 >>> 2;
            int var65 = var7 + var62;
            int var66 = var5 + var64;
            int var67 = var65 ^ var62 << 8;
            int var68 = var4 + var67;
            int var69 = var62 + var66;
            var6 = var69 ^ var66 >>> 16;
            int var70 = var66 + var68;
            int var71 = var3 + var6;
            var5 = var70 ^ var68 << 10;
            int var72 = var68 + var71;
            int var73 = var2 + var5;
            var4 = var72 ^ var71 >>> 4;
            int var74 = var71 + var73;
            int var75 = var4 + var61;
            var3 = var74 ^ var73 << 8;
            var8 = var3 + var64;
            int var76 = var73 + var75;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var75;
        }
        int var11 = 0;
        if (arg0 <= 7) {
            return;
        }
        while (var11 < 256) {
            int var37 = this.field6589[var11] + var9;
            int var38 = this.field6589[var11 + 7] + var2;
            int var39 = this.field6589[var11 + 1] + var8;
            int var40 = this.field6589[var11 + 2] + var7;
            int var41 = this.field6589[var11 + 3] + var6;
            int var42 = this.field6589[var11 + 5] + var4;
            int var43 = this.field6589[var11 + 4] + var5;
            int var44 = this.field6589[var11 + 6] + var3;
            int var45 = var37 ^ var39 << 11;
            int var46 = var39 + var40;
            int var47 = var41 + var45;
            int var48 = var46 ^ var40 >>> 2;
            int var49 = var43 + var48;
            int var50 = var40 + var47;
            int var51 = var50 ^ var47 << 8;
            int var52 = var47 + var49;
            int var53 = var42 + var51;
            var6 = var52 ^ var49 >>> 16;
            int var54 = var6 + var44;
            int var55 = var49 + var53;
            var5 = var55 ^ var53 << 10;
            int var56 = var5 + var38;
            int var57 = var53 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var4 + var45;
            int var59 = var54 + var56;
            var3 = var59 ^ var56 << 8;
            int var60 = var56 + var58;
            var8 = var3 + var48;
            var2 = var60 ^ var58 >>> 9;
            var9 = var8 + var58;
            var7 = var2 + var51;
            this.field6588[var11] = var9;
            this.field6588[var11 + 1] = var8;
            this.field6588[var11 + 2] = var7;
            this.field6588[var11 + 3] = var6;
            this.field6588[var11 + 4] = var5;
            this.field6588[var11 + 5] = var4;
            this.field6588[var11 + 6] = var3;
            this.field6588[var11 + 7] = var2;
            var11 += 8;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field6588[var12 + 6] + var3;
            int var14 = this.field6588[var12 + 2] + var7;
            int var15 = this.field6588[var12 + 1] + var8;
            int var16 = this.field6588[var12 + 7] + var2;
            int var17 = this.field6588[var12 + 5] + var4;
            int var18 = this.field6588[var12] + var9;
            int var19 = this.field6588[var12 + 4] + var5;
            int var20 = this.field6588[var12 + 3] + var6;
            int var21 = var18 ^ var15 << 11;
            int var22 = var14 + var15;
            int var23 = var20 + var21;
            int var24 = var22 ^ var14 >>> 2;
            int var25 = var19 + var24;
            int var26 = var14 + var23;
            int var27 = var26 ^ var23 << 8;
            int var28 = var23 + var25;
            int var29 = var17 + var27;
            var6 = var28 ^ var25 >>> 16;
            int var30 = var6 + var13;
            int var31 = var25 + var29;
            var5 = var31 ^ var29 << 10;
            int var32 = var5 + var16;
            int var33 = var29 + var30;
            var4 = var33 ^ var30 >>> 4;
            int var34 = var4 + var21;
            int var35 = var30 + var32;
            var3 = var35 ^ var32 << 8;
            var8 = var3 + var24;
            int var36 = var32 + var34;
            var2 = var36 ^ var34 >>> 9;
            var9 = var8 + var34;
            var7 = var2 + var27;
            this.field6588[var12] = var9;
            this.field6588[var12 + 1] = var8;
            this.field6588[var12 + 2] = var7;
            this.field6588[var12 + 3] = var6;
            this.field6588[var12 + 4] = var5;
            this.field6588[var12 + 5] = var4;
            this.field6588[var12 + 6] = var3;
            this.field6588[var12 + 7] = var2;
        }
        this.method2675(0);
        this.field6592 = 256;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)V")
    public static final void method2677(int arg0, int arg1) {
        if (arg1 <= -63) {
            field6597++;
            class21 var2 = class601.method3413(arg0, 10, (byte) 93);
            var2.method227(true);
        }
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(I)V")
    public static void method2678(int arg0) {
        field6591 = null;
        if (arg0 != 0) {
            field6593 = null;
        }
        field6593 = null;
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(I)I")
    public final int method2679(int arg0) {
        field6590++;
        if (this.field6592 == 0) {
            this.method2675(arg0 - 256);
            this.field6592 = 256;
        }
        if (arg0 != 256) {
            method2677(-124, -88);
        }
        return this.field6589[--this.field6592];
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II[FIBII)V")
    public static final void method2680(int arg0, int arg1, float[] arg2, int arg3, byte arg4, int arg5, int arg6) {
        field6587++;
        if (arg5 > 0 && !class32.method294(arg5, false)) {
            throw new IllegalArgumentException("");
        } else if (arg3 <= 0 || class32.method294(arg3, false)) {
            int var7 = class578.method3304(arg1, (byte) -60);
            int var8 = 0;
            int var9 = -44 / ((-arg4 - 1) / 41);
            int var10 = arg5 >= arg3 ? arg3 : arg5;
            int var11 = arg5 >> 1;
            int var12 = arg3 >> 1;
            float[] var13 = arg2;
            float[] var14 = new float[var11 * var12 * var7];
            while (true) {
                OpenGL.glTexImage2Df(arg0, var8, arg6, arg5, arg3, 0, arg1, 5126, var13, 0);
                if (var10 <= 1) {
                    return;
                }
                int var15 = arg5 * var7;
                for (int var16 = 0; var16 < var7; var16++) {
                    int var18 = var16;
                    int var19 = var16;
                    int var20 = var15 + var16;
                    for (int var21 = 0; var21 < var12; var21++) {
                        for (int var22 = 0; var22 < var11; var22++) {
                            float var23 = var13[var19];
                            int var24 = var7 + var19;
                            float var25 = var13[var24] + var23;
                            var19 = var7 + var24;
                            float var26 = var13[var20] + var25;
                            int var27 = var7 + var20;
                            float var28 = var13[var27] + var26;
                            var20 = var7 + var27;
                            var14[var18] = var28 * 0.25F;
                            var18 += var7;
                        }
                        var19 += var15;
                        var20 += var15;
                    }
                }
                float[] var17 = var14;
                var14 = var13;
                var13 = var17;
                arg5 = var11;
                arg3 = var12;
                var10 >>= 0x1;
                var12 >>= 0x1;
                var11 >>= 0x1;
                var8++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)I")
    public final int method2681(byte arg0) {
        if (this.field6592 == 0) {
            this.method2675(0);
            this.field6592 = 256;
        }
        field6594++;
        return arg0 == -53 ? this.field6589[this.field6592 - 1] : -93;
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V")
    private class457() {
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "([I)V")
    public class457(int[] arg0) {
        this.field6588 = new int[256];
        this.field6589 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field6589[var2] = arg0[var2];
        }
        this.method2676(43);
    }
}
