import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public abstract class class46 extends class152 {

    @OriginalMember(owner = "client!gb", name = "wb", descriptor = "[[B")
    public byte[][] field845 = new byte[256][];

    @OriginalMember(owner = "client!gb", name = "tb", descriptor = "Lij;")
    public static class50 field842 = class78.method578(121, "settings");

    @OriginalMember(owner = "client!gb", name = "ub", descriptor = "I")
    public static int field843 = 0;

    @OriginalMember(owner = "client!gb", name = "xb", descriptor = "[Z")
    public static boolean[] field846 = new boolean[112];

    @OriginalMember(owner = "client!gb", name = "ob", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!gb", name = "qb", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!gb", name = "rb", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!gb", name = "vb", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!gb", name = "yb", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!gb", name = "zb", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!gb", name = "Ab", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!gb", name = "pb", descriptor = "Lwi;")
    public static class21 field838;

    @OriginalMember(owner = "client!gb", name = "sb", descriptor = "Lda;")
    public static class22 field841;

    @OriginalMember(owner = "client!gb", name = "nb", descriptor = "[I")
    public static int[] field836;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lui;I)V")
    public static final void method346(class113 arg0, int arg1) {
        field844++;
        if (arg0.field1989 != null) {
            arg0.field1989.field3519 = 0;
        }
        arg0.field1990 = false;
        class113 var2 = arg0.method75();
        if (arg1 <= 42) {
            method348(true);
        }
        while (var2 != null) {
            method346(var2, 112);
            var2 = arg0.method82();
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
    public class46(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field845 = arg5;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(IIIIII)V")
    public final void method347(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field839++;
        int var7 = class158.field2724 * arg2 + arg1;
        int var8 = class158.field2724 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (class158.field2727 > arg2) {
            int var11 = class158.field2727 - arg2;
            var7 += class158.field2724 * var11;
            arg4 -= var11;
            arg2 = class158.field2727;
            var10 += arg3 * var11;
        }
        if (arg1 < class158.field2728) {
            int var12 = class158.field2728 - arg1;
            arg3 -= var12;
            var9 += var12;
            var8 += var12;
            arg1 = class158.field2728;
            var7 += var12;
            var10 += var12;
        }
        if (arg2 + arg4 > class158.field2726) {
            arg4 -= arg2 + arg4 - class158.field2726;
        }
        if (class158.field2725 < (arg1 + arg3)) {
            int var13 = arg1 + arg3 - class158.field2725;
            arg3 -= var13;
            var8 += var13;
            var9 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class119.method862((byte) 72, class158.field2729, var10, var9, arg5, var7, arg4, this.field845[arg0], var8, arg3);
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(Z)V")
    public static void method348(boolean arg0) {
        field842 = null;
        field838 = null;
        field841 = null;
        field836 = null;
        if (!arg0) {
            field846 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "([B)V")
    public class46(byte[] arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIII)V")
    public final void method349(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = arg1 + (class158.field2724 * arg2);
        field837++;
        int var9 = class158.field2724 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class158.field2727) {
            int var12 = class158.field2727 - arg2;
            var11 += arg3 * var12;
            var8 += class158.field2724 * var12;
            arg4 -= var12;
            arg2 = class158.field2727;
        }
        if (arg2 + arg4 > class158.field2726) {
            arg4 -= arg2 + arg4 - class158.field2726;
        }
        if (class158.field2728 > arg1) {
            int var13 = class158.field2728 - arg1;
            var11 += var13;
            var10 += var13;
            var9 += var13;
            arg1 = class158.field2728;
            arg3 -= var13;
            var8 += var13;
        }
        if ((arg1 + arg3) > class158.field2725) {
            int var14 = arg1 + arg3 - class158.field2725;
            var9 += var14;
            var10 += var14;
            arg3 -= var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class29.method262(this.field845[arg0], var10, class158.field2729, arg5, var9, arg3, var11, false, arg4, arg6, var8);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lne;B)V")
    public static final void method350(class116 arg0, byte arg1) {
        if (arg1 <= 94) {
            method346((class113) null, -13);
        }
        class140.method978(-80);
        field849++;
        if (class2.field29 != null) {
            return;
        }
        if (!class235.field3927) {
            class20.method148((byte) 78);
        } else if (class193.field3200 == 1) {
            int var2 = class160.field2743 / 5;
            int var3 = class172.field2864 + var2 + 140;
            if (class56.field1000 >= var3 && var3 + 14 >= class56.field1000 && (class36.field684 + 4) <= class52.field950 && class52.field950 <= class36.field684 + 18) {
                class220.method1506(0, 0, 10169);
                return;
            }
            if ((var3 + 15) <= class56.field1000 && (var3 + 80) >= class56.field1000 && class52.field950 >= class36.field684 + 4 && class52.field950 <= class36.field684 + 18) {
                class220.method1506(1, 0, 10169);
                return;
            }
            int var4 = class172.field2864 + var2 + 250;
            if (class56.field1000 >= var4 && var4 + 14 >= class56.field1000 && (class36.field684 + 4) <= class52.field950 && class36.field684 + 18 >= class52.field950) {
                class220.method1506(0, 1, 10169);
                return;
            }
            if (class56.field1000 >= var4 + 15 && class56.field1000 <= (var4 + 80) && class52.field950 >= (class36.field684 + 4) && class52.field950 <= (class36.field684 + 18)) {
                class220.method1506(1, 1, 10169);
                return;
            }
            int var5 = class172.field2864 + var2 + 360;
            if (var5 <= class56.field1000 && class56.field1000 <= (var5 + 14) && class36.field684 + 4 <= class52.field950 && class52.field950 <= (class36.field684 + 18)) {
                class220.method1506(0, 2, 10169);
                return;
            }
            if (class56.field1000 >= var5 + 15 && var5 + 80 >= class56.field1000 && class52.field950 >= class36.field684 + 4 && class36.field684 + 18 >= class52.field950) {
                class220.method1506(1, 2, 10169);
                return;
            }
            int var6 = class172.field2864 + var2 + 470;
            if (var6 <= class56.field1000 && class56.field1000 <= var6 + 14 && (class36.field684 + 4) <= class52.field950 && class52.field950 <= class36.field684 + 18) {
                class220.method1506(0, 3, 10169);
                return;
            }
            if (class56.field1000 >= (var6 + 15) && class56.field1000 <= var6 + 80 && (class36.field684 + 4) <= class52.field950 && class52.field950 <= class36.field684 + 18) {
                class220.method1506(1, 3, 10169);
                return;
            }
            if (class16.field367 != -1) {
                class57 var7 = class243.field4244[class16.field367];
                if (var7.field1034 == class151.field2628) {
                    byte[] var8 = class80.method589(new class50[] { var7.field1024, class61.field1129 }, 28743).method404(8202);
                    class176.field2950 = new String(var8, 0, var8.length);
                    class14.field332 = var7.field1032;
                    if (class40.field737 != 0) {
                        class249.field4319 = class14.field332 + 50000;
                        class82.field1479 = class14.field332 + 40000;
                        class15.field344 = class82.field1479;
                    }
                    if (class251.field4352 != null) {
                        class251.field4352.field268 = true;
                        class140.method979((byte) 105, class251.field4352);
                    }
                    return;
                }
                class50 var9 = class187.field3094;
                if (class40.field737 != 0) {
                    var9 = class80.method589(new class50[] { class70.field1332, class78.method579(var7.field1032 + 7000, -26225) }, 28743);
                }
                class50 var10 = class80.method589(new class50[] { class7.field90, var7.field1024, class61.field1129, var9, class175.field2933, class78.method579(class44.field804, -26225), class207.field3439, class78.method579(class89.field1693, -26225), class75.field1429, class78.method579(0, -26225), class254.field4387, class78.method579(class36.field686, -26225), class29.field611, class78.method579(class219.field3661, -26225) }, 28743);
                try {
                    arg0.getAppletContext().showDocument(var10.method388(22338), "_self");
                    return;
                } catch (Exception var11) {
                    return;
                }
            }
        }
    }
}
