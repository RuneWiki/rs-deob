import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class491 {

    @OriginalMember(owner = "client!cq", name = "f", descriptor = "J")
    public long field6967;

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "Ljava/lang/String;")
    public String field6963;

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "Ljava/lang/String;")
    public String field6965;

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "I")
    public int field6964;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "I")
    public int field6962;

    @OriginalMember(owner = "client!cq", name = "e", descriptor = "Lbu;")
    public static class21 field6966 = new class21(105, 6);

    @OriginalMember(owner = "client!cq", name = "g", descriptor = "I")
    public static int field6968;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V")
    public static void method2927(int arg0) {
        if (arg0 != 20488) {
            field6966 = null;
        }
        field6966 = null;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIIIBII)V")
    public static final void method2928(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field6968++;
        class443.method2642(arg5, 9216);
        int var7 = 0;
        int var8 = arg5 - arg2;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg5;
        int var10 = -58 % ((57 - arg4) / 44);
        int var11 = -arg5;
        int var12 = var8;
        int var13 = -var8;
        int var14 = -1;
        int var15 = -1;
        if (arg1 >= class734.field10153 && arg1 <= class407.field5535) {
            int[] var16 = class746.field10330[arg1];
            int var17 = class527.method3176(arg6 - arg5, class463.field6533, class618.field8645, -2);
            int var18 = class527.method3176(arg6 + arg5, class463.field6533, class618.field8645, -2);
            int var19 = class527.method3176(arg6 - var8, class463.field6533, class618.field8645, -2);
            int var20 = class527.method3176(arg6 + var8, class463.field6533, class618.field8645, -2);
            class434.method2601(var16, var17, arg3, (byte) -62, var19);
            class434.method2601(var16, var19, arg0, (byte) -62, var20);
            class434.method2601(var16, var20, arg3, (byte) -62, var18);
        }
        while (var9 > var7) {
            var15 += 2;
            var14 += 2;
            var13 += var15;
            var11 += var14;
            if (var13 >= 0 && var12 >= 1) {
                var12--;
                class730.field10114[var12] = var7;
                var13 -= var12 << 1;
            }
            var7++;
            if (var11 >= 0) {
                var9--;
                var11 -= var9 << 1;
                int var21 = arg1 - var9;
                int var22 = arg1 + var9;
                if (class734.field10153 <= var22 && var21 <= class407.field5535) {
                    if (var9 >= var8) {
                        int var23 = class527.method3176(arg6 + var7, class463.field6533, class618.field8645, -2);
                        int var24 = class527.method3176(arg6 - var7, class463.field6533, class618.field8645, -2);
                        if (var22 <= class407.field5535) {
                            class434.method2601(class746.field10330[var22], var24, arg3, (byte) -62, var23);
                        }
                        if (var21 >= class734.field10153) {
                            class434.method2601(class746.field10330[var21], var24, arg3, (byte) -62, var23);
                        }
                    } else {
                        int var25 = class730.field10114[var9];
                        int var26 = class527.method3176(arg6 + var7, class463.field6533, class618.field8645, -2);
                        int var27 = class527.method3176(arg6 - var7, class463.field6533, class618.field8645, -2);
                        int var28 = class527.method3176(arg6 + var25, class463.field6533, class618.field8645, -2);
                        int var29 = class527.method3176(arg6 - var25, class463.field6533, class618.field8645, -2);
                        if (var22 <= class407.field5535) {
                            int[] var30 = class746.field10330[var22];
                            class434.method2601(var30, var27, arg3, (byte) -62, var29);
                            class434.method2601(var30, var29, arg0, (byte) -62, var28);
                            class434.method2601(var30, var28, arg3, (byte) -62, var26);
                        }
                        if (class734.field10153 <= var21) {
                            int[] var31 = class746.field10330[var21];
                            class434.method2601(var31, var27, arg3, (byte) -62, var29);
                            class434.method2601(var31, var29, arg0, (byte) -62, var28);
                            class434.method2601(var31, var28, arg3, (byte) -62, var26);
                        }
                    }
                }
            }
            int var32 = arg1 - var7;
            int var33 = arg1 + var7;
            if (class734.field10153 <= var33 && class407.field5535 >= var32) {
                int var34 = arg6 + var9;
                int var35 = arg6 - var9;
                if (var34 >= class618.field8645 && class463.field6533 >= var35) {
                    int var36 = class527.method3176(var34, class463.field6533, class618.field8645, -2);
                    int var37 = class527.method3176(var35, class463.field6533, class618.field8645, -2);
                    if (var7 >= var8) {
                        if (var33 <= class407.field5535) {
                            class434.method2601(class746.field10330[var33], var37, arg3, (byte) -62, var36);
                        }
                        if (var32 >= class734.field10153) {
                            class434.method2601(class746.field10330[var32], var37, arg3, (byte) -62, var36);
                        }
                    } else {
                        int var38 = var7 <= var12 ? var12 : class730.field10114[var7];
                        int var39 = class527.method3176(arg6 + var38, class463.field6533, class618.field8645, -2);
                        int var40 = class527.method3176(arg6 - var38, class463.field6533, class618.field8645, -2);
                        if (var33 <= class407.field5535) {
                            int[] var41 = class746.field10330[var33];
                            class434.method2601(var41, var37, arg3, (byte) -62, var40);
                            class434.method2601(var41, var40, arg0, (byte) -62, var39);
                            class434.method2601(var41, var39, arg3, (byte) -62, var36);
                        }
                        if (class734.field10153 <= var32) {
                            int[] var42 = class746.field10330[var32];
                            class434.method2601(var42, var37, arg3, (byte) -62, var40);
                            class434.method2601(var42, var40, arg0, (byte) -62, var39);
                            class434.method2601(var42, var39, arg3, (byte) -62, var36);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
    public class491(int arg0, String arg1, int arg2, String arg3, long arg4) {
        this.field6967 = arg4;
        this.field6963 = arg3;
        this.field6965 = arg1;
        this.field6964 = arg0;
        this.field6962 = arg2;
    }
}
