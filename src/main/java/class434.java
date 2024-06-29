import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class434 {

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "[[I")
    public static int[][] field6183 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "[I")
    public static int[] field6182 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "I")
    public static int field6184;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(ILha;)V")
    public static final void method2637(int arg0, class58 arg1) {
        field6184++;
        int var2 = 0;
        int var3 = 0;
        if (class589.field8295) {
            var2 = class171.method1102(5467);
            var3 = class575.method3288((byte) -113);
        }
        int var4 = class208.field2732 + var2;
        int var5 = class652.field8959 + var3;
        int var6 = class470.field6668;
        int var7 = class225.field3039 - 3;
        byte var8 = 20;
        class349.method2255(class208.field2732 + var2, var8, (byte) -111, class470.field6668, class71.field920.method588((byte) 125, class549.field7669), class652.field8959 + var3, class225.field3039, arg1);
        if (arg0 != -31204) {
            field6182 = null;
        }
        int var9 = var2 + class530.field7470.method1094(-116);
        int var10 = class530.field7470.method1089((byte) -63) + var3;
        if (class600.field8427) {
            int var11 = 0;
            for (class508 var12 = (class508) class455.field6429.method4000((byte) -7); var12 != null; var12 = (class508) class455.field6429.method4002(-90)) {
                int var16 = var5 - (-var8 - (var11 * 16) - 13);
                var11++;
                if ((class208.field2732 + var2) < var9 && class470.field6668 + var2 + class208.field2732 > var9 && var16 - 13 < var10 && (var16 + 4) > var10 && (var12.field7268 > 1 || ((class37) var12.field7267.field9891.field8206).field460)) {
                    arg1.method431(class208.field2732 + var2, var16 + -12, class470.field6668, 16, 255 - class736.field10258 << 24 | class588.field8293, 1);
                }
            }
            if (class430.field6135 != null) {
                int var13 = 0;
                class349.method2255(class326.field4512, var8, (byte) -111, class426.field5986, class430.field6135.field7270, class373.field5236, class505.field7238, arg1);
                for (class37 var14 = (class37) class430.field6135.field7267.method4000((byte) -7); var14 != null; var14 = (class37) class430.field6135.field7267.method4002(-46)) {
                    int var15 = var13 * 16 + class373.field5236 + var8 + 13;
                    if (var9 > class326.field4512 && var9 < class326.field4512 + class426.field5986 && var10 > (var15 - 13) && (var15 + 4) > var10 && var14.field460) {
                        arg1.method431(class326.field4512, var15 - 12, class426.field5986, 16, class588.field8293 | 255 - class736.field10258 << 24, 1);
                    }
                    var13++;
                }
                class651.method3588(var8, class426.field5986, class373.field5236, arg0 ^ 0xFFFF861C, class505.field7238, class326.field4512, arg1);
            }
        } else {
            int var17 = 0;
            for (class37 var18 = (class37) class215.field2820.method2765(-12261); var18 != null; var18 = (class37) class215.field2820.method2759(-15361)) {
                int var28 = var5 + ((class25.field341 - var17 - 1) * 16) + var8 + 13;
                var17++;
                if (var9 > (class208.field2732 + var2) && var9 < class208.field2732 + var2 + class470.field6668 && var28 - 13 < var10 && (var28 + 4) > var10 && var18.field460) {
                    arg1.method431(class208.field2732 + var2, var28 + -12, class470.field6668, 16, class588.field8293 | 255 - class736.field10258 << 24, 1);
                }
            }
        }
        class651.method3588(var8, class470.field6668, class652.field8959 + var3, 0, class225.field3039, class208.field2732 + var2, arg1);
        if (class600.field8427) {
            int var19 = 0;
            for (class508 var20 = (class508) class455.field6429.method4000((byte) -7); var20 != null; var20 = (class508) class455.field6429.method4002(-115)) {
                int var24 = var19 * 16 + var3 + var8 + class652.field8959 + 13;
                if (var20.field7268 == 1) {
                    class337.method2191(class652.field8959 + var3, class625.field8691 | 0xFF000000, class91.field1084 | 0xFF000000, arg1, class225.field3039, var10, var9, (class37) var20.field7267.field9891.field8206, arg0 + 31213, class470.field6668, var24, class208.field2732 + var2);
                } else {
                    class48.method307(255, var10, arg1, class91.field1084 | 0xFF000000, class470.field6668, var24, var9, class652.field8959 + var3, var20, class208.field2732 + var2, class225.field3039, class625.field8691 | 0xFF000000);
                }
                var19++;
            }
            if (class430.field6135 != null) {
                int var21 = 0;
                for (class37 var22 = (class37) class430.field6135.field7267.method4000((byte) -7); var22 != null; var22 = (class37) class430.field6135.field7267.method4002(-123)) {
                    int var23 = var21 * 16 + class373.field5236 + var8 + 13;
                    var21++;
                    class337.method2191(class373.field5236, class625.field8691 | 0xFF000000, class91.field1084 | 0xFF000000, arg1, class505.field7238, var10, var9, var22, 9, class426.field5986, var23, class326.field4512);
                }
                class375.method2356(arg0 + 23049, class426.field5986, class505.field7238, class373.field5236, class326.field4512);
            }
        } else {
            int var25 = 0;
            for (class37 var26 = (class37) class215.field2820.method2765(-12261); var26 != null; var26 = (class37) class215.field2820.method2759(-15361)) {
                int var27 = (class25.field341 - var25 - 1) * 16 + var5 + var8 + 13;
                class337.method2191(var5, class625.field8691 | 0xFF000000, class91.field1084 | 0xFF000000, arg1, var7, var10, var9, var26, 9, var6, var27, var4);
                var25++;
            }
        }
        class375.method2356(-8155, class470.field6668, class225.field3039, class652.field8959 + var3, class208.field2732 + var2);
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V")
    public static void method2638(int arg0) {
        field6183 = null;
        field6182 = null;
        if (arg0 < 100) {
            method2638(-3);
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(III)Llh;")
    public static final class526 method2639(int arg0, int arg1, int arg2) {
        class165 var3 = class553.field7776[arg0][arg1][arg2];
        return var3 == null || var3.field2266 == null ? null : var3.field2266;
    }
}
