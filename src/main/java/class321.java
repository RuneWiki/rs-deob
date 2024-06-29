import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class321 {

    @OriginalMember(owner = "client!en", name = "b", descriptor = "I")
    public int field4399;

    @OriginalMember(owner = "client!en", name = "l", descriptor = "I")
    public int field4409;

    @OriginalMember(owner = "client!en", name = "c", descriptor = "S")
    public short field4400;

    @OriginalMember(owner = "client!en", name = "g", descriptor = "I")
    public int field4404;

    @OriginalMember(owner = "client!en", name = "j", descriptor = "I")
    public int field4407;

    @OriginalMember(owner = "client!en", name = "f", descriptor = "B")
    public byte field4403;

    @OriginalMember(owner = "client!en", name = "e", descriptor = "I")
    public int field4402;

    @OriginalMember(owner = "client!en", name = "d", descriptor = "S")
    public short field4401;

    @OriginalMember(owner = "client!en", name = "m", descriptor = "Z")
    public boolean field4410;

    @OriginalMember(owner = "client!en", name = "k", descriptor = "S")
    public short field4408;

    @OriginalMember(owner = "client!en", name = "i", descriptor = "Ljr;")
    public static class112 field4406 = new class112(4);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "F")
    public static float field4398;

    @OriginalMember(owner = "client!en", name = "h", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!en", name = "n", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIII[III)V")
    public static final void method2054(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7) {
        field4405++;
        if (arg4 > 0 && !class476.method2796(-86, arg4)) {
            throw new IllegalArgumentException("");
        } else if (arg2 > 0 && !class476.method2796(88, arg2)) {
            throw new IllegalArgumentException("");
        } else if (arg6 == 32993) {
            int var8 = 0;
            int var9 = arg2 > arg4 ? arg4 : arg2;
            if (arg7 >= -54) {
                method2056(106);
            }
            int var10 = arg4 >> 1;
            int var11 = arg2 >> 1;
            int[] var12 = arg5;
            int[] var13 = new int[var10 * var11];
            while (true) {
                OpenGL.glTexImage2Di(arg0, var8, arg1, arg4, arg2, 0, arg6, arg3, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = 0;
                int var15 = 0;
                int var16 = arg4 + var15;
                int[] var17 = var13;
                for (int var18 = 0; var18 < var11; var18++) {
                    for (int var19 = 0; var19 < var10; var19++) {
                        int var20 = var12[var15++];
                        int var21 = var12[var15++];
                        int var22 = var12[var16++];
                        int var23 = var20 & 0xFF;
                        int var24 = (var20 & 0xFF2FB7) >> 16;
                        int var25 = var20 >> 24 & 0xFF;
                        int var26 = (var20 & 0xFF43) >> 8;
                        int var27 = var12[var16++];
                        int var28 = (var21 >> 24 & 0xFF) + var25;
                        int var29 = ((var21 & 0xFF6A76) >> 16) + var24;
                        int var30 = (var21 & 0xFF) + var23;
                        int var31 = ((var21 & 0xFF5A) >> 8) + var26;
                        int var32 = (var22 >> 24 & 0xFF) + var28;
                        int var33 = ((var22 & 0xFF2819) >> 16) + var29;
                        int var34 = ((var22 & 0xFF76) >> 8) + var31;
                        int var35 = (var22 & 0xFF) + var30;
                        int var36 = (var27 & 0xFF) + var35;
                        int var37 = (var27 >> 8 & 0xFF) + var34;
                        int var38 = (var27 >> 24 & 0xFF) + var32;
                        int var39 = ((var27 & 0xFF943A) >> 16) + var33;
                        var13[var14++] = class418.method2577(class418.method2577(class263.method1762(var37 << 6, 65280), class418.method2577(class263.method1762(1020, var39) << 14, class263.method1762(var38, 1020) << 22)), class263.method1762(var36, 1020) >> 2);
                    }
                    var15 += arg4;
                    var16 += arg4;
                }
                var13 = var12;
                arg2 = var11;
                arg4 = var10;
                var12 = var17;
                var8++;
                var10 >>= 0x1;
                var9 >>= 0x1;
                var11 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I[Ljava/lang/Object;I[JI)V")
    public static final void method2055(int arg0, Object[] arg1, int arg2, long[] arg3, int arg4) {
        field4411++;
        if (arg0 < arg2) {
            int var5 = (arg0 + arg2) / 2;
            int var6 = arg0;
            long var7 = arg3[var5];
            arg3[var5] = arg3[arg2];
            arg3[arg2] = var7;
            Object var9 = arg1[var5];
            arg1[var5] = arg1[arg2];
            arg1[arg2] = var9;
            int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
            for (int var11 = arg0; var11 < arg2; var11++) {
                if ((long) (var11 & var10) + var7 > arg3[var11]) {
                    long var12 = arg3[var11];
                    arg3[var11] = arg3[var6];
                    arg3[var6] = var12;
                    Object var14 = arg1[var11];
                    arg1[var11] = arg1[var6];
                    arg1[var6++] = var14;
                }
            }
            arg3[arg2] = arg3[var6];
            arg3[var6] = var7;
            arg1[arg2] = arg1[var6];
            arg1[var6] = var9;
            method2055(arg0, arg1, var6 - 1, arg3, 9455);
            method2055(var6 + 1, arg1, arg2, arg3, 9455);
        }
        if (arg4 != 9455) {
            field4406 = null;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V")
    public static void method2056(int arg0) {
        field4406 = null;
        if (arg0 != -30094) {
            method2055(-108, null, -26, null, 42);
        }
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field4399 = arg3;
        this.field4409 = arg1;
        this.field4400 = (short) arg5;
        this.field4404 = arg2;
        this.field4407 = arg11;
        this.field4403 = (byte) arg8;
        this.field4402 = arg0;
        this.field4401 = (short) arg4;
        this.field4410 = arg10;
        this.field4408 = (short) arg6;
    }
}
