import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public abstract class class203 implements class11 {

    @OriginalMember(owner = "client!mba", name = "n", descriptor = "Lgu;")
    private class126 field2666 = class96.field1289;

    @OriginalMember(owner = "client!mba", name = "h", descriptor = "Z")
    private boolean field2660;

    @OriginalMember(owner = "client!mba", name = "w", descriptor = "I")
    private int field2675;

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "Lsb;")
    public class280 field2653;

    @OriginalMember(owner = "client!mba", name = "t", descriptor = "Lph;")
    public class442 field2672;

    @OriginalMember(owner = "client!mba", name = "e", descriptor = "I")
    public int field2657;

    @OriginalMember(owner = "client!mba", name = "d", descriptor = "Luda;")
    public class509 field2656;

    @OriginalMember(owner = "client!mba", name = "k", descriptor = "I")
    private int field2663;

    @OriginalMember(owner = "client!mba", name = "g", descriptor = "Luv;")
    public static class3 field2659 = new class3(51, -1);

    @OriginalMember(owner = "client!mba", name = "p", descriptor = "Luv;")
    public static class3 field2668 = new class3(42, -1);

    @OriginalMember(owner = "client!mba", name = "y", descriptor = "Lim;")
    public static class353 field2677 = new class353(2, -1);

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!mba", name = "c", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!mba", name = "f", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!mba", name = "i", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!mba", name = "j", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!mba", name = "l", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!mba", name = "m", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!mba", name = "o", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!mba", name = "q", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!mba", name = "r", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!mba", name = "s", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!mba", name = "u", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!mba", name = "v", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!mba", name = "x", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!mba", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method1306(109);
        field2662++;
        super.finalize();
    }

    @OriginalMember(owner = "client!mba", name = "d", descriptor = "(I)I")
    private final int method1296(int arg0) {
        if (arg0 != 3) {
            method1297(51);
        }
        field2667++;
        int var2 = this.field2656.field7091 * this.field2653.field3654 * this.field2675;
        return this.field2660 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!mba", name = "e", descriptor = "(I)V")
    public static void method1297(int arg0) {
        field2668 = null;
        field2659 = null;
        field2677 = null;
        if (arg0 >= -76) {
            field2677 = null;
        }
    }

    @OriginalMember(owner = "client!mba", name = "f", descriptor = "(I)V")
    public static final void method1298(int arg0) {
        field2671++;
        if (arg0 != 13405) {
            method1297(114);
        }
        class135.field1645 = null;
        class126.field1564 = false;
        class145.method794((byte) 123);
    }

    @OriginalMember(owner = "client!mba", name = "c", descriptor = "(I)V")
    public final void method50(int arg0) {
        field2654++;
        int var2 = this.field2672.method3361(1000);
        int var3 = this.field2672.field6099[var2];
        if (this.field2657 != var3) {
            if (var3 != 0) {
                OpenGL.glBindTexture(var3, 0);
                OpenGL.glDisable(var3);
            }
            OpenGL.glEnable(this.field2657);
            this.field2672.field6099[var2] = this.field2657;
        }
        if (arg0 != -23983) {
            field2676 = -47;
        }
        OpenGL.glBindTexture(this.field2657, this.field2663);
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(IIZI[F)V")
    public final void method1299(int arg0, int arg1, boolean arg2, int arg3, float[] arg4) {
        if (!arg2) {
            method1297(-20);
        }
        field2669++;
        if (arg3 > 0 && !class506.method2832(arg3, 3)) {
            throw new IllegalArgumentException("");
        } else if (arg0 <= 0 || class506.method2832(arg0, 3)) {
            int var6 = this.field2656.field7091;
            int var7 = 0;
            int var8 = arg0 <= arg3 ? arg0 : arg3;
            int var9 = arg3 >> 1;
            int var10 = arg0 >> 1;
            float[] var11 = arg4;
            float[] var12 = new float[var9 * var10 * var6];
            while (true) {
                OpenGL.glTexImage2Df(arg1, var7, this.method1301(34843), arg3, arg0, 0, class562.method3158((byte) 123, this.field2656), 5126, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = arg3 * var6;
                for (int var14 = 0; var14 < var6; var14++) {
                    int var16 = var14;
                    int var17 = var14;
                    int var18 = var13 + var14;
                    for (int var19 = 0; var19 < var10; var19++) {
                        for (int var20 = 0; var20 < var9; var20++) {
                            float var21 = var11[var17];
                            int var22 = var6 + var17;
                            float var23 = var11[var22] + var21;
                            var17 = var6 + var22;
                            float var24 = var11[var18] + var23;
                            int var25 = var6 + var18;
                            float var26 = var11[var25] + var24;
                            var18 = var6 + var25;
                            var12[var16] = var26 * 0.25F;
                            var16 += var6;
                        }
                        var17 += var13;
                        var18 += var13;
                    }
                }
                float[] var15 = var12;
                var12 = var11;
                var11 = var15;
                arg3 = var9;
                arg0 = var10;
                var8 >>= 0x1;
                var10 >>= 0x1;
                var9 >>= 0x1;
                var7++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(Z[IIII)V")
    public final void method1300(boolean arg0, int[] arg1, int arg2, int arg3, int arg4) {
        field2665++;
        if (arg3 > 0 && !class506.method2832(arg3, 3)) {
            throw new IllegalArgumentException("");
        } else if (arg2 > 0 && !class506.method2832(arg2, 3)) {
            throw new IllegalArgumentException("");
        } else if (class532.field7430 == this.field2656) {
            int var6 = 0;
            int var7 = arg2 <= arg3 ? arg2 : arg3;
            int var8 = arg3 >> 1;
            int var9 = arg2 >> 1;
            if (!arg0) {
                int[] var10 = arg1;
                int[] var11 = new int[var8 * var9];
                while (true) {
                    OpenGL.glTexImage2Di(arg4, var6, this.method1301(34843), arg3, arg2, 0, 32993, this.field2672.field6096, var10, 0);
                    if (var7 <= 1) {
                        return;
                    }
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = arg3 + var13;
                    for (int var15 = 0; var15 < var9; var15++) {
                        for (int var17 = 0; var17 < var8; var17++) {
                            int var18 = var10[var13++];
                            int var19 = var10[var14++];
                            int var20 = var10[var13++];
                            int var21 = var10[var14++];
                            int var22 = var18 & 0xFF;
                            int var23 = var18 >> 8 & 0xFF;
                            int var24 = var18 >> 24 & 0xFF;
                            int var25 = var18 >> 16 & 0xFF;
                            int var26 = (var20 & 0xFF) + var22;
                            int var27 = ((var20 & 0xFF3F) >> 8) + var23;
                            int var28 = (var20 >> 24 & 0xFF) + var24;
                            int var29 = ((var20 & 0xFFF502) >> 16) + var25;
                            int var30 = (var19 >> 16 & 0xFF) + var29;
                            int var31 = ((var19 & 0xFF79) >> 8) + var27;
                            int var32 = (var19 >> 24 & 0xFF) + var28;
                            int var33 = (var19 & 0xFF) + var26;
                            int var34 = ((var21 & 0xFF64) >> 8) + var31;
                            int var35 = ((var21 & 0xFF8C04) >> 16) + var30;
                            int var36 = (var21 & 0xFF) + var33;
                            int var37 = (var21 >> 24 & 0xFF) + var32;
                            var11[var12++] = class292.method1790(class143.method783(255, var36 >> 2), class292.method1790(class292.method1790(class143.method783(var35, 1020) << 14, class143.method783(var37, 1020) << 22), class143.method783(65280, var34 << 6)));
                        }
                        var14 += arg3;
                        var13 += arg3;
                    }
                    int[] var16 = var11;
                    var11 = var10;
                    arg3 = var8;
                    var10 = var16;
                    arg2 = var9;
                    var6++;
                    var7 >>= 0x1;
                    var9 >>= 0x1;
                    var8 >>= 0x1;
                }
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!mba", name = "g", descriptor = "(I)I")
    public final int method1301(int arg0) {
        field2673++;
        if (arg0 != 34843) {
            this.method1299(-84, 80, true, 73, null);
        }
        if (class280.field3663 == this.field2653) {
            if (class149.field1929 == this.field2656) {
                return 6407;
            }
            if (class532.field7430 == this.field2656) {
                return 6408;
            }
            if (class33.field495 == this.field2656) {
                return 6406;
            }
            if (class145.field1885 == this.field2656) {
                return 6409;
            }
            if (class250.field3134 == this.field2656) {
                return 6410;
            }
            if (class344.field4775 == this.field2656) {
                return 6145;
            }
        } else if (class280.field3666 == this.field2653) {
            if (class149.field1929 == this.field2656) {
                return 34843;
            }
            if (class532.field7430 == this.field2656) {
                return 34842;
            }
            if (class33.field495 == this.field2656) {
                return 34844;
            }
            if (class145.field1885 == this.field2656) {
                return 34846;
            }
            if (class250.field3134 == this.field2656) {
                return 34847;
            }
            if (class344.field4775 == this.field2656) {
                return 6145;
            }
        } else if (class280.field3667 == this.field2653) {
            if (class149.field1929 == this.field2656) {
                return 34837;
            }
            if (class532.field7430 == this.field2656) {
                return 34836;
            }
            if (class33.field495 == this.field2656) {
                return 34838;
            }
            if (class145.field1885 == this.field2656) {
                return 34840;
            }
            if (class250.field3134 == this.field2656) {
                return 34841;
            }
            if (class344.field4775 == this.field2656) {
                return 6145;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lgu;I)V")
    public final void method49(class126 arg0, int arg1) {
        field2661++;
        if (arg1 != 27754) {
            this.field2653 = null;
        }
        if (this.field2666 != arg0) {
            this.field2666 = arg0;
            this.method1303(34843);
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(I[BZII)V")
    public final void method1302(int arg0, byte[] arg1, boolean arg2, int arg3, int arg4) {
        field2670++;
        if (arg4 > 0 && !class506.method2832(arg4, 3)) {
            throw new IllegalArgumentException("");
        } else if (arg0 <= 0 || class506.method2832(arg0, 3)) {
            int var6 = this.field2656.field7091;
            int var7 = 0;
            int var8 = arg4 < arg0 ? arg4 : arg0;
            int var9 = arg4 >> 1;
            if (arg2) {
                int var10 = arg0 >> 1;
                byte[] var11 = arg1;
                byte[] var12 = new byte[var6 * var10 * var9];
                while (true) {
                    OpenGL.glTexImage2Dub(arg3, var7, this.method1301(34843), arg4, arg0, 0, class562.method3158((byte) -122, this.field2656), 5121, var11, 0);
                    if (var8 <= 1) {
                        return;
                    }
                    int var13 = arg4 * var6;
                    byte[] var14 = var12;
                    for (int var15 = 0; var15 < var6; var15++) {
                        int var16 = var15;
                        int var17 = var15;
                        int var18 = var13 + var15;
                        for (int var19 = 0; var19 < var10; var19++) {
                            for (int var20 = 0; var20 < var9; var20++) {
                                byte var21 = var11[var17];
                                int var22 = var6 + var17;
                                int var23 = var11[var22] + var21;
                                var17 = var6 + var22;
                                int var24 = var11[var18] + var23;
                                int var25 = var6 + var18;
                                int var26 = var11[var25] + var24;
                                var12[var16] = (byte) (var26 >> 2);
                                var18 = var6 + var25;
                                var16 += var6;
                            }
                            var18 += var13;
                            var17 += var13;
                        }
                    }
                    var12 = var11;
                    arg4 = var9;
                    var11 = var14;
                    arg0 = var10;
                    var7++;
                    var9 >>= 0x1;
                    var10 >>= 0x1;
                    var8 >>= 0x1;
                }
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!mba", name = "h", descriptor = "(I)V")
    private final void method1303(int arg0) {
        this.field2672.method3344(arg0 - 5204, this);
        if (arg0 != 34843) {
            field2668 = null;
        }
        field2664++;
        if (class96.field1289 == this.field2666) {
            OpenGL.glTexParameteri(this.field2657, 10241, this.field2660 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field2657, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field2657, 10241, this.field2660 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field2657, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(IB)V")
    private final void method1304(int arg0, byte arg1) {
        if (arg1 < -109) {
            this.field2672.field8290 -= arg0;
            field2655++;
            this.field2672.field8290 += this.method1296(3);
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(III)Z")
    public static final boolean method1305(int arg0, int arg1, int arg2) {
        field2674++;
        if (arg1 == 21067) {
            return class452.method2628(arg0, arg2, (byte) 125) || class211.method1343(arg2, 0, arg0);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mba", name = "i", descriptor = "(I)V")
    private final void method1306(int arg0) {
        if (this.field2663 > 0) {
            this.field2672.method2568(this.method1296(3), this.field2663, (byte) -116);
            this.field2663 = 0;
        }
        field2658++;
        if (arg0 <= 34) {
            this.method1301(-93);
        }
    }

    @OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Lph;ILuda;Lsb;IZ)V")
    public class203(class442 arg0, int arg1, class509 arg2, class280 arg3, int arg4, boolean arg5) {
        this.field2660 = arg5;
        this.field2675 = arg4;
        this.field2653 = arg3;
        this.field2672 = arg0;
        this.field2657 = arg1;
        this.field2656 = arg2;
        OpenGL.glGenTextures(1, class467.field6629, 0);
        this.field2663 = class467.field6629[0];
        this.method1303(34843);
        this.method1304(0, (byte) -124);
    }
}
