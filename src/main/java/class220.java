import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class220 {

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3682 = "slide:";

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "[B")
    public static byte[] field3681 = new byte[32896];

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3687;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "[[B")
    public static byte[][] field3686;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZLvh;)V")
    public static final void method1456(boolean arg0, class108 arg1) {
        class182.field2970 = arg1.method749("p11_full", 1);
        class110.field1989 = arg1.method749("p12_full", 1);
        class239.field3918 = arg1.method749("b12_full", 1);
        class22.field339 = arg1.method749("mapfunction", 1);
        class161.field2681 = arg1.method749("hitmarks", 1);
        class49.field847 = arg1.method749("hitbar_default", 1);
        class248.field4082 = arg1.method749("headicons_pk", 1);
        class266.field4302 = arg1.method749("headicons_prayer", 1);
        field3683++;
        class272.field4370 = arg1.method749("hint_headicons", 1);
        class199.field3261 = arg1.method749("hint_mapmarkers", 1);
        class196.field3170 = arg1.method749("mapflag", 1);
        class187.field3034 = arg1.method749("cross", 1);
        class243.field3987 = arg1.method749("mapdots", 1);
        if (arg0) {
            field3681 = null;
        }
        class286.field4520 = arg1.method749("scrollbar", 1);
        class135.field2356 = arg1.method749("name_icons", 1);
        class2.field21 = arg1.method749("floorshadows", 1);
        class37.field562 = arg1.method749("compass", 1);
        class223.field3751 = arg1.method749("hint_mapedge", 1);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    public static void method1457(int arg0) {
        field3681 = null;
        if (arg0 <= 27) {
            field3686 = null;
        }
        field3682 = null;
        field3687 = null;
        field3686 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)Lme;")
    public static final class39 method1458(byte arg0) {
        field3680++;
        if (arg0 < 109) {
            field3681 = null;
        }
        return class158.field2642;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)V")
    public static final void method1459(int arg0, int arg1) {
        int var2 = 101 % ((-arg1 - 55) / 50);
        class241.field3966.method63(0, arg0);
        field3685++;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIII)V")
    public static final void method1460(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3684++;
        int var6 = arg5 - arg4;
        int var7 = arg0 - arg2;
        if (var7 == 0) {
            if (var6 != 0) {
                class114.method798(arg2, arg5, arg1, arg4, (byte) -96);
            }
        } else if (var6 == 0) {
            class61.method388(arg0, arg4, arg1, (byte) -117, arg2);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < arg3) {
                var6 = -var6;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg2;
                arg2 = arg4;
                int var10 = arg0;
                arg0 = arg5;
                arg4 = var9;
                arg5 = var10;
            }
            if (arg2 > arg0) {
                int var11 = arg4;
                arg4 = arg5;
                int var12 = arg2;
                arg5 = var11;
                arg2 = arg0;
                arg0 = var12;
            }
            int var13 = arg4;
            int var14 = arg0 - arg2;
            int var15 = arg5 - arg4;
            if (var15 < 0) {
                var15 = -var15;
            }
            int var16 = -(var14 >> 1);
            int var17 = arg4 >= arg5 ? -1 : 1;
            if (var8) {
                for (int var18 = arg2; var18 <= arg0; var18++) {
                    var16 += var15;
                    class167.field2735[var18][var13] = arg1;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            } else {
                for (int var19 = arg2; var19 <= arg0; var19++) {
                    var16 += var15;
                    class167.field2735[var13][var19] = arg1;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V")
    public static final void method1461(int arg0) {
        if (arg0 != -1) {
            return;
        }
        field3679++;
        for (class57 var1 = (class57) class254.field4154.method379(arg0 + 6348); var1 != null; var1 = (class57) class254.field4154.method378(77)) {
            if (var1.field990) {
                var1.method355(-108);
            }
        }
        for (class57 var2 = (class57) class155.field2591.method379(6347); var2 != null; var2 = (class57) class155.field2591.method378(103)) {
            if (var2.field990) {
                var2.method355(-117);
            }
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field3681[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field3687 = "wave:";
    }
}
