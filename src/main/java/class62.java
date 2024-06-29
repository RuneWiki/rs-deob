import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class62 {

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "[J")
    public static long[] field857 = new long[1000];

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "Llc;")
    public static class86 field858 = new class86(64);

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "Ljava/lang/String;")
    public static String field860 = "white:";

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public static void method379(int arg0) {
        field860 = null;
        if (arg0 <= 75) {
            method381(-79);
        }
        field857 = null;
        field858 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)V")
    public static final void method380(int arg0, int arg1) {
        field862++;
        if (class202.field2806 == arg0) {
            class181.field2541.method1343(true, arg1);
        } else {
            class131.field1849 = arg1;
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
    public static final void method381(int arg0) {
        field856++;
        int[] var1 = new int[class127.field1805];
        int var2 = 0;
        for (int var3 = 0; var3 < class127.field1805; var3++) {
            class32 var5 = class73.method463(var3, -31104);
            if (var5.field459 >= 0 || var5.field454 >= 0) {
                var1[var2++] = var3;
            }
        }
        class193.field2679 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class193.field2679[var4] = var1[var4];
        }
        if (arg0 != 1) {
            field855 = 105;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V")
    public static final void method382(boolean arg0) {
        field859++;
        if (class212.field3193 != -1) {
            class208.method1322(class212.field3193, (byte) -45);
        }
        for (int var1 = 0; var1 < class265.field3979; var1++) {
            if (class42.field640[var1]) {
                class293.field4607[var1] = true;
            }
            class73.field999[var1] = class42.field640[var1];
            class42.field640[var1] = false;
        }
        class79.field1101 = -1;
        class131.field1843 = null;
        if (arg0) {
            method383((class268) null, -85, -109, -15, 86, -17);
        }
        class154.field2152 = -1;
        class136.field1907 = class52.field740;
        if (class212.field3193 != -1) {
            class265.field3979 = 0;
            class77.method493((byte) 41);
        }
        class64.method392();
        class225.field3409 = 0;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lsa;IIIII)V")
    public static final void method383(class268 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class27.field342 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class127.field1802) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class234.field3531 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class89 var14 = class194.field2682[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class200.field2788[var11][var12 + 1][var13] + class200.field2788[var11][var12][var13] + class200.field2788[var11][var12][var13 + 1] + class200.field2788[var11][var12 + 1][var13 + 1]) / 4 - (class200.field2788[arg1][arg2 + 1][arg3] + class200.field2788[arg1][arg2][arg3] + class200.field2788[arg1][arg2][arg3 + 1] + class200.field2788[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class197 var16 = var14.field1244;
                                    if (var16 != null) {
                                        if (var16.field2725.method1774()) {
                                            arg0.method1773(var16.field2725, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field2727 != null && var16.field2727.method1774()) {
                                            arg0.method1773(var16.field2727, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field1240; var17++) {
                                        class198 var18 = var14.field1226[var17];
                                        if (var18 != null && var18.field2752.method1774() && (var18.field2746 == var12 || var7 == var12) && (var18.field2748 == var13 || var9 == var13)) {
                                            int var19 = var18.field2765 + 1 - var18.field2746;
                                            int var20 = var18.field2763 + 1 - var18.field2748;
                                            arg0.method1773(var18.field2752, (var18.field2746 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field2748 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }
}
