import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class577 {

    @OriginalMember(owner = "client!of", name = "k", descriptor = "I")
    private int field8386 = -1;

    @OriginalMember(owner = "client!of", name = "s", descriptor = "Z")
    private boolean field8394 = true;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "I")
    private int field8387;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "I")
    private int field8384;

    @OriginalMember(owner = "client!of", name = "q", descriptor = "I")
    private int field8392;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    private int field8382;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "[Lbn;")
    private class412[] field8391;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "[Lbn;")
    private class412[] field8390;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "Lbn;")
    private class412 field8376;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public static int field8380 = 0;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "Lsb;")
    public static class266 field8383 = new class266(77, 1);

    @OriginalMember(owner = "client!of", name = "r", descriptor = "[I")
    public static int[] field8393 = new int[32];

    @OriginalMember(owner = "client!of", name = "t", descriptor = "Lqfa;")
    public static class85 field8395 = new class85(38, 8);

    @OriginalMember(owner = "client!of", name = "v", descriptor = "[Lqh;")
    public static class61[] field8397 = new class61[2048];

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field8377;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public static int field8378;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    private int field8381;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "I")
    public static int field8385;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "I")
    public static int field8388;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "I")
    private int field8389;

    @OriginalMember(owner = "client!of", name = "u", descriptor = "Lmc;")
    public static class120 field8396;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "Lf;")
    private class702 field8379;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lr;II)Z")
    public final boolean method3309(class167 arg0, int arg1, int arg2) {
        if (arg1 != 38) {
            return false;
        }
        field8377++;
        if (this.field8386 != arg2) {
            this.field8386 = arg2;
            int var4 = class264.method1730(95, arg2);
            if (var4 > 512) {
                var4 = 512;
            }
            if (var4 <= 0) {
                var4 = 1;
            }
            if (this.field8381 != var4) {
                this.field8381 = var4;
                this.field8379 = null;
            }
            if (this.field8391 != null) {
                this.field8389 = 0;
                int[] var5 = new int[this.field8391.length];
                for (int var6 = 0; var6 < this.field8391.length; var6++) {
                    class412 var7 = this.field8391[var6];
                    if (var7.method2510(this.field8392, this.field8382, this.field8387, this.field8386)) {
                        var5[this.field8389] = var7.field5963;
                        this.field8390[this.field8389++] = var7;
                    }
                }
                class370.method2343((byte) -90, var5, this.field8390, this.field8389 - 1, 0);
            }
            this.field8394 = true;
        }
        boolean var8 = false;
        if (this.field8394) {
            this.field8394 = false;
            for (int var9 = this.field8389 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field8390[var9].method2507(arg0, this.field8376);
                this.field8394 |= !var10;
                var8 |= var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V")
    public static void method3310(byte arg0) {
        field8395 = null;
        field8397 = null;
        if (arg0 > -105) {
            field8380 = 22;
        }
        field8383 = null;
        field8396 = null;
        field8393 = null;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(B)V")
    public final void method3311(byte arg0) {
        if (this.field8391 != null) {
            for (int var2 = 0; var2 < this.field8391.length; var2++) {
                this.field8391[var2].method2514();
            }
        }
        if (arg0 >= 5) {
            field8388++;
            this.field8379 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIIIIILr;I)V")
    public final void method3312(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class167 arg8, int arg9) {
        if (arg2 != 4494) {
            this.field8382 = -118;
        }
        field8385++;
        int var11 = arg5 + arg6 & 0x3FFF;
        if (this.field8384 == -1) {
            arg8.method4(arg0, arg1, arg3, arg7, arg9, 0);
        } else {
            class699 var12 = class575.field8348.method1500(this.field8384, -102);
            if (this.field8379 == null && class575.field8348.method1499(this.field8384, arg2 - 28546)) {
                int[] var13 = var12.field9840 ? class575.field8348.method1496(this.field8384, this.field8381, 0.7F, false, this.field8381, -15473) : class575.field8348.method1495(this.field8384, false, 0.7F, this.field8381, this.field8381, 32682);
                this.field8379 = arg8.method54(var13, 0, this.field8381, this.field8381, this.field8381);
            }
            if (var12.field9840) {
                arg8.method4(arg0, arg1, arg3, arg7, arg9, 0);
            }
            if (this.field8379 != null) {
                int var14 = var12.field9840 ? 1 : 0;
                int var15 = arg4 * arg7 / -4096;
                int var16;
                for (var16 = arg7 * var11 / 4096 + (arg3 - arg7) / 2; var16 > arg7; var16 -= arg7) {
                }
                while (var15 > arg7) {
                    var15 -= arg7;
                }
                while (var16 < 0) {
                    var16 += arg7;
                }
                while (var15 < 0) {
                    var15 += arg7;
                }
                for (int var17 = var16 - arg7; var17 < arg3; var17 += arg7) {
                    for (int var18 = var15 - arg7; var18 < arg7; var18 += arg7) {
                        this.field8379.method3919(arg0 + var17, arg1 + var18, arg7, arg7, 1, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field8389 - 1; var19 >= 0; var19--) {
            this.field8390[var19].method2506(arg8, arg0, arg1, arg3, arg7, arg4, var11);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(III)V")
    public static final void method3313(int arg0, int arg1, int arg2) {
        field8378++;
        class19 var3 = class373.method2355(82, 0, 15);
        var3.method432(55);
        var3.field829 = arg2;
        int var4 = -56 % ((arg0 - 25) / 57);
        var3.field833 = arg1;
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(I[Lbn;IIII)V")
    public class577(int arg0, class412[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8387 = arg5;
        this.field8384 = arg0;
        this.field8392 = arg3;
        this.field8382 = arg4;
        this.field8391 = arg1;
        if (arg1 == null) {
            this.field8376 = null;
            this.field8390 = null;
        } else {
            this.field8390 = new class412[arg1.length];
            this.field8376 = arg2 < 0 ? null : arg1[arg2];
        }
    }
}
