import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lha")
public class class650 extends class89 {

    @OriginalMember(owner = "client!lha", name = "K", descriptor = "Ljava/lang/Object;")
    private Object field9078;

    @OriginalMember(owner = "client!lha", name = "B", descriptor = "Lbu;")
    public static class21 field9074 = new class21(40, 2);

    @OriginalMember(owner = "client!lha", name = "Q", descriptor = "[Lak;")
    public static class369[] field9084 = new class369[14];

    @OriginalMember(owner = "client!lha", name = "H", descriptor = "F")
    public static float field9076;

    @OriginalMember(owner = "client!lha", name = "G", descriptor = "I")
    public static int field9075;

    @OriginalMember(owner = "client!lha", name = "I", descriptor = "I")
    public static int field9077;

    @OriginalMember(owner = "client!lha", name = "L", descriptor = "I")
    public static int field9079;

    @OriginalMember(owner = "client!lha", name = "O", descriptor = "I")
    public static int field9082;

    @OriginalMember(owner = "client!lha", name = "P", descriptor = "I")
    public static int field9083;

    @OriginalMember(owner = "client!lha", name = "N", descriptor = "[I")
    public static int[] field9081;

    @OriginalMember(owner = "client!lha", name = "M", descriptor = "[[[I")
    public static int[][][] field9080;

    @OriginalMember(owner = "client!lha", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public final Object method666(int arg0) {
        if (arg0 >= -12) {
            method3722(-81);
        }
        field9077++;
        return this.field9078;
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(I)Z")
    public final boolean method664(int arg0) {
        if (arg0 <= 76) {
            method3722(-100);
        }
        field9079++;
        return false;
    }

    @OriginalMember(owner = "client!lha", name = "<init>", descriptor = "(Ldr;Ljava/lang/Object;I)V")
    public class650(class750 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field9078 = arg1;
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(IIIIIII)V")
    public static final void method3721(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field9075++;
        class443.method2642(arg1, arg5 ^ 0xFFFFDBFF);
        int var7 = 0;
        int var8 = arg1 - arg6;
        if (arg5 < ~var8) {
            var8 = 0;
        }
        int var9 = arg1;
        int var10 = -arg1;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class746.field10330[arg2];
        int var16 = arg4 - var8;
        class434.method2601(var15, arg4 - arg1, arg3, (byte) -62, var16);
        int var17 = arg4 + var8;
        class434.method2601(var15, var16, arg0, (byte) -62, var17);
        class434.method2601(var15, var17, arg3, (byte) -62, arg1 + arg4);
        while (var9 > var7) {
            var13 += 2;
            var14 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                class730.field10114[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var8 > var9) {
                    int[] var18 = class746.field10330[arg2 + var9];
                    int[] var19 = class746.field10330[arg2 - var9];
                    int var20 = class730.field10114[var9];
                    int var21 = arg4 + var7;
                    int var22 = arg4 - var7;
                    int var23 = arg4 + var20;
                    int var24 = arg4 - var20;
                    class434.method2601(var18, var22, arg3, (byte) -62, var24);
                    class434.method2601(var18, var24, arg0, (byte) -62, var23);
                    class434.method2601(var18, var23, arg3, (byte) -62, var21);
                    class434.method2601(var19, var22, arg3, (byte) -62, var24);
                    class434.method2601(var19, var24, arg0, (byte) -62, var23);
                    class434.method2601(var19, var23, arg3, (byte) -62, var21);
                } else {
                    int[] var25 = class746.field10330[arg2 + var9];
                    int[] var26 = class746.field10330[arg2 - var9];
                    int var27 = arg4 + var7;
                    int var28 = arg4 - var7;
                    class434.method2601(var25, var28, arg3, (byte) -62, var27);
                    class434.method2601(var26, var28, arg3, (byte) -62, var27);
                }
            }
            int[] var29 = class746.field10330[arg2 + var7];
            int[] var30 = class746.field10330[arg2 - var7];
            int var31 = arg4 + var9;
            int var32 = arg4 - var9;
            if (var7 >= var8) {
                class434.method2601(var29, var32, arg3, (byte) -62, var31);
                class434.method2601(var30, var32, arg3, (byte) -62, var31);
            } else {
                int var33 = var11 < var7 ? class730.field10114[var7] : var11;
                int var34 = arg4 + var33;
                int var35 = arg4 - var33;
                class434.method2601(var29, var32, arg3, (byte) -62, var35);
                class434.method2601(var29, var35, arg0, (byte) -62, var34);
                class434.method2601(var29, var34, arg3, (byte) -62, var31);
                class434.method2601(var30, var32, arg3, (byte) -62, var35);
                class434.method2601(var30, var35, arg0, (byte) -62, var34);
                class434.method2601(var30, var34, arg3, (byte) -62, var31);
            }
        }
    }

    @OriginalMember(owner = "client!lha", name = "g", descriptor = "(I)V")
    public static void method3722(int arg0) {
        field9081 = null;
        field9080 = null;
        field9084 = null;
        if (arg0 == 14) {
            field9074 = null;
        }
    }
}
