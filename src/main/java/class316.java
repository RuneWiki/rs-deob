import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class316 extends class159 {

    @OriginalMember(owner = "client!w", name = "l", descriptor = "Lub;")
    public class22 field4455;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "Ljb;")
    public static class519 field4454 = new class519(126, 1);

    @OriginalMember(owner = "client!w", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field4458 = new String[200];

    @OriginalMember(owner = "client!w", name = "m", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)I", line = 4)
    public static final int method2016(int arg0) {
        if (arg0 != 31829) {
            method2016(-22);
        }
        field4456++;
        return class206.field2664 == 1 ? class776.field10671 : class220.field2858;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IZLjava/lang/String;Lha;Leb;Lda;)V", line = 19)
    public static final void method2017(int arg0, boolean arg1, String arg2, class66 arg3, class651 arg4, class67 arg5) {
        field4457++;
        if (arg0 != 0) {
            return;
        }
        boolean var6 = !class517.field7194 || class174.method1199((byte) 123);
        if (!var6) {
            return;
        }
        if (class517.field7194 && var6) {
            class651 var7 = class661.field8893;
            class67 var8 = arg3.method502(var7, class400.field5719, true);
            int var9 = var7.method3626(null, arg2, true, 250);
            int var10 = var7.method3616(null, var7.field8785, (byte) 54, 250, arg2);
            int var11 = class411.field5838.field2156;
            int var12 = var11 + 4;
            int var13 = var12 * 2 + var9;
            int var14 = var12 * 2 + var10;
            if (var14 < class582.field7911) {
                var14 = class582.field7911;
            }
            if (var13 < class777.field10677) {
                var13 = class777.field10677;
            }
            int var15 = class211.field2712.method3710(0, class67.field933, var13) + class504.field7084;
            int var16 = class478.field6707.method3920(var14, class187.field2450, -102) + class485.field6771;
            if (class24.field246) {
                var15 += class186.method1252(0);
                var16 += class550.method3163(arg0 + 16383);
            }
            arg3.method466(class351.field5124, false).method344(class738.field10017.field2156 + var15, class738.field10017.field2155 + var16, var13 - class738.field10017.field2156 * 2, -(class738.field10017.field2155 * 2) + var14, 1, 0, 0);
            arg3.method466(class738.field10017, true).method968(var15, var16);
            class738.field10017.method1128();
            arg3.method466(class738.field10017, true).method968(var15 + var13 - var11, var16);
            class738.field10017.method1117();
            arg3.method466(class738.field10017, true).method968(var15 + var13 - var11, -var11 + var16 - -var14);
            class738.field10017.method1128();
            arg3.method466(class738.field10017, true).method968(var15, var14 + var16 - var11);
            class738.field10017.method1117();
            arg3.method466(class411.field5838, true).method978(var15, class738.field10017.field2155 + var16, var11, var14 - (class738.field10017.field2155 * 2));
            class411.field5838.method1123();
            arg3.method466(class411.field5838, true).method978(class738.field10017.field2156 + var15, var16, var13 - (class738.field10017.field2156 * 2), var11);
            class411.field5838.method1123();
            arg3.method466(class411.field5838, true).method978(var15 + var13 - var11, var16 - -class738.field10017.field2155, var11, var14 - (class738.field10017.field2155 * 2));
            class411.field5838.method1123();
            arg3.method466(class411.field5838, true).method978(var15 + class738.field10017.field2156, var14 + var16 + -var11, var13 - (class738.field10017.field2156 * 2), var11);
            class411.field5838.method1123();
            var8.method557(var12 + var16, var12 + var15, null, null, 1, (byte) -114, arg2, var13 - (var12 * 2), -1, 0, null, 0, 0, class422.field6070 | 0xFF000000, 1, var14 - (var12 * 2));
            class682.method3741(0, var14, var15, var13, var16);
        } else {
            int var17 = arg4.method3626(null, arg2, true, 250);
            int var18 = arg4.method3615(null, 93, arg2, 250) * 13;
            byte var19 = 4;
            int var20 = var19 + 6;
            int var21 = var19 + 6;
            arg3.method434(var20 - var19, -var19 + var21, var17 + var19 + var19, var18 - -var19 + var19, -16777216, 0);
            arg3.method539(var20 - var19, -var19 + var21, var17 + var19 + var19, var19 + var19 + var18, -1, 0);
            arg5.method557(var21, var20, null, null, 1, (byte) 60, arg2, var17, -1, 0, null, 0, 0, -1, 1, var18);
            class682.method3741(0, var18 + var19 + var19, -var19 + var20, var17 + var19 + var19, var21 - var19);
        }
        if (!arg1) {
            return;
        }
        try {
            if (class24.field246) {
                class492.method2898(0);
            } else {
                arg3.method483(false);
            }
        } catch (class283 var22) {
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V", line = 120)
    public static void method2018(int arg0) {
        field4458 = null;
        if (arg0 != -18921) {
            field4458 = null;
        }
        field4454 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIII)V", line = 134)
    public static final void method2019(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class532.field7393 = arg2;
        if (arg0 != -1025) {
            method2016(-127);
        }
        field4459++;
        class430.field6225 = arg1;
        class507.field7102 = arg3;
        class143.field1916 = arg5;
        class594.field8105 = arg4;
        if (class143.field1916 >= 100) {
            int var6 = class594.field8105 * 512 + 256;
            int var7 = class507.field7102 * 512 + 256;
            int var8 = class778.method4273(var7, (byte) -104, var6, class184.field2420) - class532.field7393;
            int var9 = var6 - class435.field6273;
            int var10 = var8 - class269.field3926;
            int var11 = var7 - class223.field2892;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + (var11 * var11)));
            class74.field1000 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class41.field442 = (int) (Math.atan2((double) var9, (double) var11) * -2607.5945876176133D) & 0x3FFF;
            if (class74.field1000 < 1024) {
                class74.field1000 = 1024;
            }
            class476.field6693 = 0;
            if (class74.field1000 > 3072) {
                class74.field1000 = 3072;
            }
        }
        class609.field8242 = -1;
        class702.field9303 = -1;
        class697.field9252 = 2;
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lub;)V", line = 182)
    public class316(class22 arg0) {
        this.field4455 = arg0;
    }
}
