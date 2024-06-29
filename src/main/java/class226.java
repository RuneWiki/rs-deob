import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class226 {

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
    private int field3376 = -1;

    @OriginalMember(owner = "client!eh", name = "o", descriptor = "Z")
    private boolean field3384 = true;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
    private int field3378;

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "I")
    private int field3381;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    private int field3374;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "[Lsaa;")
    private class18[] field3377;

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "I")
    private int field3382;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "Lsaa;")
    private class18 field3375;

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "[Lsaa;")
    private class18[] field3379;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "[I")
    public static int[] field3372 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!eh", name = "n", descriptor = "[I")
    public static int[] field3383 = new int[13];

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!eh", name = "p", descriptor = "I")
    private int field3385;

    @OriginalMember(owner = "client!eh", name = "q", descriptor = "I")
    private int field3386;

    @OriginalMember(owner = "client!eh", name = "r", descriptor = "Lha;")
    private class116 field3387;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "[J")
    public static long[] field3370;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IILqa;IZIIIII)V")
    public final void method1500(int arg0, int arg1, class167 arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg4) {
            this.method1501((byte) 73);
        }
        int var11 = arg1 + arg5 & 0x3FFF;
        field3371++;
        if (this.field3374 == -1) {
            arg2.method653(arg3, arg0, arg6, arg7, arg8, 0);
        } else {
            class576 var12 = class525.field7309.method2387((byte) 127, this.field3374);
            if (this.field3387 == null && class525.field7309.method2389(-32, this.field3374)) {
                int[] var13 = var12.field8217 ? class525.field7309.method2385(0.7F, this.field3385, false, this.field3374, true, this.field3385) : class525.field7309.method2388(this.field3385, this.field3385, false, this.field3374, 0.7F, (byte) -64);
                this.field3387 = arg2.method528(var13, 0, this.field3385, this.field3385, this.field3385);
            }
            if (var12.field8217) {
                arg2.method653(arg3, arg0, arg6, arg7, arg8, 0);
            }
            if (this.field3387 != null) {
                int var14 = var12.field8217 ? 1 : 0;
                int var15 = arg7 * arg9 / -4096;
                int var16;
                for (var16 = arg7 * var11 / 4096 + (arg6 - arg7) / 2; var16 > arg7; var16 -= arg7) {
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
                for (int var17 = var16 - arg7; var17 < arg6; var17 += arg7) {
                    for (int var18 = var15 - arg7; var18 < arg7; var18 += arg7) {
                        this.field3387.method664(var17 + arg3, arg0 + var18, arg7, arg7, 1, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field3386 - 1; var19 >= 0; var19--) {
            this.field3379[var19].method208(arg2, arg3, arg0, arg6, arg7, arg9, var11);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V")
    public final void method1501(byte arg0) {
        if (arg0 != 18) {
            this.method1503((byte) 29, null, 60);
        }
        field3373++;
        if (this.field3377 != null) {
            for (int var2 = 0; var2 < this.field3377.length; var2++) {
                this.field3377[var2].method214();
            }
        }
        this.field3387 = null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
    public static void method1502(int arg0) {
        field3383 = null;
        field3370 = null;
        field3372 = null;
        if (arg0 != -32630) {
            field3372 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BLqa;I)Z")
    public final boolean method1503(byte arg0, class167 arg1, int arg2) {
        if (this.field3376 != arg2) {
            this.field3376 = arg2;
            int var4 = class19.method216(arg2, (byte) 127);
            if (var4 > 512) {
                var4 = 512;
            }
            if (var4 <= 0) {
                var4 = 1;
            }
            if (this.field3385 != var4) {
                this.field3385 = var4;
                this.field3387 = null;
            }
            if (this.field3377 != null) {
                this.field3386 = 0;
                int[] var5 = new int[this.field3377.length];
                for (int var6 = 0; var6 < this.field3377.length; var6++) {
                    class18 var7 = this.field3377[var6];
                    if (var7.method212(this.field3381, this.field3378, this.field3382, this.field3376)) {
                        var5[this.field3386] = var7.field273;
                        this.field3379[this.field3386++] = var7;
                    }
                }
                class364.method2193(0, var5, -10055, this.field3379, this.field3386 - 1);
            }
            this.field3384 = true;
        }
        if (arg0 != 125) {
            this.field3376 = 124;
        }
        field3380++;
        boolean var8 = false;
        if (this.field3384) {
            this.field3384 = false;
            for (int var9 = this.field3386 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field3379[var9].method209(arg1, this.field3375);
                var8 |= var10;
                this.field3384 |= !var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(I[Lsaa;IIII)V")
    public class226(int arg0, class18[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3378 = arg4;
        this.field3381 = arg3;
        this.field3374 = arg0;
        this.field3377 = arg1;
        this.field3382 = arg5;
        if (arg1 == null) {
            this.field3375 = null;
            this.field3379 = null;
        } else {
            this.field3379 = new class18[arg1.length];
            this.field3375 = arg2 < 0 ? null : arg1[arg2];
        }
    }
}
