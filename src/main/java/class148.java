import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public abstract class class148 extends class337 {

    @OriginalMember(owner = "client!qb", name = "C", descriptor = "[Lqb;")
    public class148[] field2197;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "Z")
    public boolean field2183;

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "Lri;")
    public static class73 field2186 = new class73(50, -1);

    @OriginalMember(owner = "client!qb", name = "D", descriptor = "Lri;")
    public static class73 field2198 = new class73(39, 6);

    @OriginalMember(owner = "client!qb", name = "H", descriptor = "Lng;")
    public static class226 field2202 = new class226(4);

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!qb", name = "v", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!qb", name = "w", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!qb", name = "x", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!qb", name = "z", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!qb", name = "A", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!qb", name = "B", descriptor = "I")
    public int field2196;

    @OriginalMember(owner = "client!qb", name = "E", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!qb", name = "F", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!qb", name = "G", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!qb", name = "u", descriptor = "Lim;")
    public class401 field2189;

    @OriginalMember(owner = "client!qb", name = "I", descriptor = "Lic;")
    public static class491 field2203;

    @OriginalMember(owner = "client!qb", name = "y", descriptor = "Lhu;")
    public class85 field2193;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILdh;I)V", line = 5)
    public void method23(int arg0, class209 arg1, int arg2) {
        int var4 = -3 / ((arg2 + 88) / 33);
        field2187++;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZII)[I", line = 15)
    public final int[] method971(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            this.method428(-62, (byte) -120, 82);
        }
        field2190++;
        return this.field2197[arg2].field2183 ? this.field2197[arg2].method25(-71, arg1) : this.field2197[arg2].method27(true, arg1)[0];
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIBII[F)V", line = 43)
    public static final void method972(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, float[] arg6) {
        field2188++;
        if (arg2 > 0 && !class415.method2495(1, arg2)) {
            throw new IllegalArgumentException("");
        } else if (arg0 <= 0 || class415.method2495(1, arg0)) {
            int var7 = class414.method2490(-31968, arg5);
            int var8 = 0;
            int var9 = arg2 >= arg0 ? arg0 : arg2;
            int var10 = arg2 >> 1;
            int var11 = arg0 >> 1;
            int var12 = 68 % ((-arg3 - 11) / 55);
            float[] var13 = arg6;
            float[] var14 = new float[var7 * var11 * var10];
            while (true) {
                OpenGL.glTexImage2Df(arg4, var8, arg1, arg2, arg0, 0, arg5, 5126, var13, 0);
                if (var9 <= 1) {
                    return;
                }
                int var15 = arg2 * var7;
                float[] var16 = var14;
                for (int var17 = 0; var17 < var7; var17++) {
                    int var18 = var17;
                    int var19 = var17;
                    int var20 = var15 + var17;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var10; var22++) {
                            float var23 = var13[var19];
                            int var24 = var7 + var19;
                            float var25 = var13[var24] + var23;
                            float var26 = var13[var20] + var25;
                            var19 = var7 + var24;
                            int var27 = var7 + var20;
                            float var28 = var13[var27] + var26;
                            var14[var18] = var28 * 0.25F;
                            var20 = var7 + var27;
                            var18 += var7;
                        }
                        var19 += var15;
                        var20 += var15;
                    }
                }
                var14 = var13;
                arg2 = var10;
                arg0 = var11;
                var13 = var16;
                var11 >>= 0x1;
                var9 >>= 0x1;
                var8++;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)[I", line = 142)
    public int[] method25(int arg0, int arg1) {
        if (arg0 > -65) {
            return null;
        } else {
            field2200++;
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)I", line = 159)
    public int method973(byte arg0) {
        if (arg0 != 35) {
            method975(1, 27, -74, 52, 34, 2);
        }
        field2195++;
        return -1;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(IZ)V", line = 173)
    public class148(int arg0, boolean arg1) {
        this.field2197 = new class148[arg0];
        this.field2183 = arg1;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(ZII)[[I", line = 185)
    public final int[][] method974(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            field2198 = null;
        }
        field2184++;
        if (this.field2197[arg1].field2183) {
            int[] var4 = this.field2197[arg1].method25(-122, arg2);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field2197[arg1].method27(true, arg2);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IBI)V", line = 222)
    public void method428(int arg0, byte arg1, int arg2) {
        field2191++;
        int var4 = 120 / ((-arg1 - 94) / 32);
        int var5 = this.field2196 == 255 ? arg2 : this.field2196;
        if (this.field2183) {
            this.field2193 = new class85(var5, arg2, arg0);
        } else {
            this.field2189 = new class401(var5, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZI)[[I", line = 244)
    public int[][] method27(boolean arg0, int arg1) {
        field2192++;
        if (arg0) {
            throw new IllegalStateException("This operation does not have a colour output");
        }
        return null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V", line = 258)
    public void method175(int arg0) {
        if (arg0 != -1285532468) {
            this.field2196 = -55;
        }
        field2194++;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)I", line = 268)
    public int method426(byte arg0) {
        field2201++;
        int var2 = -11 % ((arg0 - 37) / 44);
        return -1;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIII)I", line = 281)
    public static final int method975(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2185++;
        if (class86.field1324 == null) {
            return 0;
        }
        if (arg0 < 3) {
            int var6 = arg1 >> 7;
            int var7 = arg2 >> 7;
            if (arg4 < 0 || arg3 < 0 || arg4 > (class30.field323 - 1) || (class182.field2661 - 1) < arg3) {
                return 0;
            }
            if (var6 < 1 || var7 < 1 || var6 > class30.field323 - 1 || class182.field2661 - 1 < var7) {
                return 0;
            }
            boolean var8 = (class183.field2684[1][arg1 >> 7][arg2 >> 7] & 0x2) != 0;
            if ((arg1 & 0x7F) == 0) {
                boolean var9 = (class183.field2684[1][var6 - 1][arg2 >> 7] & 0x2) != 0;
                boolean var10 = (class183.field2684[1][var6][arg2 >> 7] & 0x2) != 0;
                if (var9 != var10) {
                    var8 = (class183.field2684[1][arg4][arg3] & 0x2) != 0;
                }
            }
            if ((arg2 & 0x7F) == 0) {
                boolean var11 = (class183.field2684[1][arg1 >> 7][var7 - 1] & 0x2) != 0;
                boolean var12 = (class183.field2684[1][arg1 >> 7][var7] & 0x2) != 0;
                if (var11 != var12) {
                    var8 = (class183.field2684[1][arg4][arg3] & 0x2) != 0;
                }
            }
            if (var8) {
                arg0++;
            }
        }
        int var13 = 90 / ((arg5 + 27) / 60);
        return class86.field1324[arg0].method202(arg1, arg2);
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(B)V", line = 340)
    public void method424(byte arg0) {
        int var2 = -115 / ((-arg0 - 41) / 39);
        if (this.field2183) {
            this.field2193.method501((byte) 89);
            this.field2193 = null;
        } else {
            this.field2189.method2423((byte) -105);
            this.field2189 = null;
        }
        field2199++;
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(B)V", line = 367)
    public static void method976(byte arg0) {
        field2198 = null;
        field2186 = null;
        if (arg0 > 32) {
            field2202 = null;
            field2203 = null;
        }
    }
}
