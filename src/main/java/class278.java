import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class class278 {

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public int field3410;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public int field3408;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public int field3413;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public int field3409;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "[[I")
    public int[][] field3415;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "Lpia;")
    public static class94 field3414 = new class94(41, -1);

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public static int field3418 = 0;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "[[F")
    public static float[][] field3419 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "Loh;")
    public static class404 field3417;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V", line = 7)
    public static void method1664(int arg0) {
        field3414 = null;
        field3417 = null;
        field3419 = null;
        if (arg0 != -24494) {
            field3414 = null;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIB)I", line = 31)
    public final int method1671(int arg0, int arg1, byte arg2) {
        field3412++;
        int var4 = 112 % ((arg2 + 9) / 59);
        return this.field3415[arg1][arg0];
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III)I", line = 49)
    public final int method1675(int arg0, int arg1, int arg2) {
        if (arg2 != 65286) {
            this.method1668(null, null);
        }
        field3411++;
        int var4 = arg1 >> this.field3409;
        int var5 = arg0 >> this.field3409;
        if (var4 < 0 || var5 < 0 || this.field3410 - 1 < var4 || var5 > (this.field3408 - 1)) {
            return 0;
        }
        int var6 = this.field3413 - 1 & arg1;
        int var7 = this.field3413 - 1 & arg0;
        int var8 = (this.field3413 - var6) * this.field3415[var4][var5] + (this.field3415[var4 + 1][var5] * var6) >> this.field3409;
        int var9 = (this.field3413 - var6) * this.field3415[var4][var5 + 1] + this.field3415[var4 + 1][var5 + 1] * var6 >> this.field3409;
        return (this.field3413 - var7) * var8 + var7 * var9 >> this.field3409;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIZI[I)V", line = 75)
    public static final void method1676(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field3416++;
        if (arg2 > 0 && !class560.method3273(-3469, arg2)) {
            throw new IllegalArgumentException("");
        } else if (arg0 > 0 && !class560.method3273(-3469, arg0)) {
            throw new IllegalArgumentException("");
        } else if (arg4 == 32993) {
            int var8 = 0;
            int var9 = arg0 <= arg2 ? arg0 : arg2;
            int var10 = arg2 >> 1;
            if (!arg5) {
                int var11 = arg0 >> 1;
                int[] var12 = arg7;
                int[] var13 = new int[var10 * var11];
                while (true) {
                    OpenGL.glTexImage2Di(arg3, var8, arg1, arg2, arg0, 0, arg4, arg6, var12, 0);
                    if (var9 <= 1) {
                        return;
                    }
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = arg2 + var15;
                    for (int var17 = 0; var17 < var11; var17++) {
                        for (int var19 = 0; var19 < var10; var19++) {
                            int var20 = var12[var15++];
                            int var21 = var12[var16++];
                            int var22 = var12[var15++];
                            int var23 = var20 & 0xFF;
                            int var24 = (var20 & 0xFF50) >> 8;
                            int var25 = var12[var16++];
                            int var26 = var20 >> 16 & 0xFF;
                            int var27 = var20 >> 24 & 0xFF;
                            int var28 = (var22 >> 16 & 0xFF) + var26;
                            int var29 = (var22 & 0xFF) + var23;
                            int var30 = ((var22 & 0xFFB5) >> 8) + var24;
                            int var31 = (var22 >> 24 & 0xFF) + var27;
                            int var32 = ((var21 & 0xFF06) >> 8) + var30;
                            int var33 = ((var21 & 0xFF4835) >> 16) + var28;
                            int var34 = (var21 >> 24 & 0xFF) + var31;
                            int var35 = (var21 & 0xFF) + var29;
                            int var36 = (var25 & 0xFF) + var35;
                            int var37 = ((var25 & 0xFFD10A) >> 16) + var33;
                            int var38 = (var25 >> 24 & 0xFF) + var34;
                            int var39 = (var25 >> 8 & 0xFF) + var32;
                            var13[var14++] = class695.method3919(class327.method1956(255, var36 >> 2), class695.method3919(class695.method3919(class327.method1956(1020, var38) << 22, class327.method1956(var37 << 14, 16711680)), class327.method1956(var39 << 6, 65280)));
                        }
                        var15 += arg2;
                        var16 += arg2;
                    }
                    int[] var18 = var13;
                    var13 = var12;
                    var12 = var18;
                    arg0 = var11;
                    arg2 = var10;
                    var10 >>= 0x1;
                    var8++;
                    var11 >>= 0x1;
                    var9 >>= 0x1;
                }
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(III[[I)V", line = 180)
    public class278(int arg0, int arg1, int arg2, int[][] arg3) {
        this.field3410 = arg0;
        this.field3408 = arg1;
        int var5 = 0;
        while (arg2 > 1) {
            var5++;
            arg2 >>= 0x1;
        }
        this.field3413 = 0x1 << var5;
        this.field3409 = var5;
        this.field3415 = arg3;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method1662(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!s", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public abstract void method1663(class182 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1665(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!s", name = "ka", descriptor = "(III)V")
    public abstract void method1666(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZI)V")
    public abstract void method1667(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lada;[I)V")
    public abstract void method1668(class163 arg0, int[] arg1);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public abstract boolean method1669(class182 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZII)V")
    public abstract void method1670(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
    public abstract void method1672(int arg0, int arg1);

    @OriginalMember(owner = "client!s", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1673(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!s", name = "YA", descriptor = "()V")
    public abstract void method1674();

    @OriginalMember(owner = "client!s", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public abstract void method1677(class182 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "fa", descriptor = "(IILr;)Lr;")
    public abstract class182 method1678(int arg0, int arg1, class182 arg2);
}
