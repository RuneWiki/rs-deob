import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class173 extends class206 {

    @OriginalMember(owner = "client!uf", name = "B", descriptor = "I")
    public int field2796;

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "Lmh;")
    public static class62 field2788 = class201.method1405(true, "null");

    @OriginalMember(owner = "client!uf", name = "x", descriptor = "[Ljj;")
    public static class27[] field2792 = new class27[500];

    @OriginalMember(owner = "client!uf", name = "w", descriptor = "Lmh;")
    public static class62 field2791 = class201.method1405(true, " )2> <col=ffff00>");

    @OriginalMember(owner = "client!uf", name = "D", descriptor = "Lmh;")
    public static class62 field2797 = class201.method1405(true, "Ablegen");

    @OriginalMember(owner = "client!uf", name = "A", descriptor = "Lmh;")
    public static class62 field2795 = class201.method1405(true, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!uf", name = "E", descriptor = "I")
    public static int field2798 = 0;

    @OriginalMember(owner = "client!uf", name = "y", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!uf", name = "z", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!uf", name = "G", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!uf", name = "F", descriptor = "Lhi;")
    public static class26 field2799;

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "[Llc;")
    public static class304[] field2789;

    @OriginalMember(owner = "client!uf", name = "v", descriptor = "[[Lmk;")
    public static class224[][] field2790;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lob;IIIIIIIZ)V", line = 17)
    public static final void method1233(class187 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class144.field2300;
        int var11;
        int var12 = var11 = (arg7 << 7) - class270.field4579;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class37.field569[arg1][arg6][arg7] - class293.field4981;
        int var18 = class37.field569[arg1][arg6 + 1][arg7] - class293.field4981;
        int var19 = class37.field569[arg1][arg6 + 1][arg7 + 1] - class293.field4981;
        int var20 = class37.field569[arg1][arg6][arg7 + 1] - class293.field4981;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class23.field242;
        int var46 = (var24 << 9) / var25 + class23.field253;
        int var47 = (var27 << 9) / var31 + class23.field242;
        int var48 = (var30 << 9) / var31 + class23.field253;
        int var49 = (var33 << 9) / var37 + class23.field242;
        int var50 = (var36 << 9) / var37 + class23.field253;
        int var51 = (var39 << 9) / var43 + class23.field242;
        int var52 = (var42 << 9) / var43 + class23.field253;
        class23.field244 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0 && class264.field4446 && class52.method336(class52.field757 + class23.field242, class23.field253 + class153.field2419, var50, var52, var48, var49, var51, var47)) {
            class41.field622 = arg6;
            class212.field3568 = arg7;
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) > 0 && class264.field4446 && class52.method336(class52.field757 + class23.field242, class23.field253 + class153.field2419, var46, var48, var52, var45, var47, var51)) {
            class41.field622 = arg6;
            class212.field3568 = arg7;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIII)V", line = 129)
    public static final void method1234(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = arg0; var5 < class221.field3805; var5++) {
            if ((class166.field2725[var5] + class161.field2604[var5]) > arg1 && class166.field2725[var5] < (arg1 + arg3) && (class199.field3362[var5] + class183.field2935[var5]) > arg2 && (arg2 + arg4) > class199.field3362[var5]) {
                class159.field2560[var5] = true;
            }
        }
        field2800++;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V", line = 164)
    public static void method1235(int arg0) {
        field2791 = null;
        field2790 = (class224[][]) null;
        field2788 = null;
        field2797 = null;
        field2795 = null;
        field2792 = null;
        field2799 = null;
        field2789 = null;
        if (arg0 != 26429) {
            field2789 = (class304[]) null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V", line = 194)
    public class173() {
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(I)V", line = 196)
    public class173(int arg0) {
        this.field2796 = arg0;
    }
}
