import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class112 {

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "Z")
    public static boolean field1693 = false;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "S")
    public static short field1691 = 32767;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public static int field1695 = 0;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "La;")
    public static class281 field1697 = new class281();

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "[I")
    public static int[] field1698 = new int[50];

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "Ljava/lang/String;")
    public static String field1699 = "Face here";

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "[[I")
    public static int[][] field1694;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljd;II)[Lhk;", line = 4)
    public static final class42[] method855(class95 arg0, int arg1, int arg2) {
        if (arg2 > -64) {
            field1693 = false;
        }
        field1692++;
        return class49.method371(arg0, arg1, true) ? class311.method2134(5) : null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lfc;IIIII)V", line = 42)
    public static final void method856(class110 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class139.field2088 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class75.field1091) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class115.field1818 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class79 var14 = class213.field3262[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class203.field3111[var11][var12 + 1][var13] + class203.field3111[var11][var12][var13] + class203.field3111[var11][var12][var13 + 1] + class203.field3111[var11][var12 + 1][var13 + 1]) / 4 - (class203.field3111[arg1][arg2 + 1][arg3] + class203.field3111[arg1][arg2][arg3] + class203.field3111[arg1][arg2][arg3 + 1] + class203.field3111[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class35 var16 = var14.field1161;
                                    if (var16 != null) {
                                        if (var16.field511.method846()) {
                                            arg0.method835(var16.field511, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field508 != null && var16.field508.method846()) {
                                            arg0.method835(var16.field508, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field1169; var17++) {
                                        class228 var18 = var14.field1157[var17];
                                        if (var18 != null && var18.field3480.method846() && (var18.field3472 == var12 || var7 == var12) && (var18.field3475 == var13 || var9 == var13)) {
                                            int var19 = var18.field3474 + 1 - var18.field3472;
                                            int var20 = var18.field3484 + 1 - var18.field3475;
                                            arg0.method835(var18.field3480, (var18.field3472 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field3475 - arg3) * 128 + (var20 - arg5) * 64, var6);
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

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V", line = 142)
    public static void method857(int arg0) {
        field1699 = null;
        field1694 = (int[][]) null;
        field1697 = null;
        field1698 = null;
        if (arg0 != 1) {
            method857(20);
        }
    }
}
