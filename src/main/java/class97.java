import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class97 extends class136 {

    @OriginalMember(owner = "client!ij", name = "E", descriptor = "[I")
    public static int[] field1783 = new int[4096];

    @OriginalMember(owner = "client!ij", name = "H", descriptor = "I")
    public static int field1785 = -1;

    @OriginalMember(owner = "client!ij", name = "N", descriptor = "[I")
    public static int[] field1791 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!ij", name = "I", descriptor = "Li;")
    public static class88 field1786 = class208.method1425(105, "da dieser Computer gegen unsere ");

    @OriginalMember(owner = "client!ij", name = "P", descriptor = "Li;")
    public static class88 field1793 = class208.method1425(105, "60 Sekunden noch einmal)3)3)3");

    @OriginalMember(owner = "client!ij", name = "G", descriptor = "B")
    public byte field1784;

    @OriginalMember(owner = "client!ij", name = "D", descriptor = "I")
    public int field1782;

    @OriginalMember(owner = "client!ij", name = "J", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!ij", name = "M", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!ij", name = "O", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!ij", name = "L", descriptor = "Lbj;")
    public class22 field1789;

    @OriginalMember(owner = "client!ij", name = "K", descriptor = "[[[B")
    public static byte[][][] field1788;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)V")
    public static final void method681(int arg0, int arg1, int arg2) {
        field1792++;
        if (class203.field3864 < 2 && class28.field475 == 0 && !class10.field145) {
            return;
        }
        class88 var3;
        if (class28.field475 == 1 && class203.field3864 < 2) {
            var3 = class166.method1142(new class88[] { class35.field608, class236.field4400, class78.field1414, class160.field3091 }, -3);
        } else if (class10.field145 && class203.field3864 < 2) {
            var3 = class166.method1142(new class88[] { class201.field3837, class236.field4400, class28.field464, class160.field3091 }, -3);
        } else {
            var3 = class78.method525(class203.field3864 - 1, true);
        }
        if (arg0 != 15573) {
            method684(null, 103);
        }
        if (class203.field3864 > 2) {
            var3 = class166.method1142(new class88[] { var3, class47.field891, class170.method1214(class203.field3864 - 2, 24), class103.field1864 }, arg0 ^ 0xFFFFC328);
        }
        int var4 = class54.field1011.method165(var3, arg2 + 4, arg1 + 15, 16777215, 0, class70.field1259, class27.field454);
        class126.method863(15, var4 + class54.field1011.method158(var3), arg1, arg2 + 4, (byte) -119);
    }

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "(B)V")
    public static void method682(byte arg0) {
        field1793 = null;
        field1786 = null;
        field1783 = null;
        if (arg0 < 11) {
            method681(-74, -41, 105);
        }
        field1788 = null;
        field1791 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIIBII)V")
    public static final void method683(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field1787++;
        if (arg3 < 128 || arg7 < 128 || arg3 > 13056 || arg7 > 13056) {
            class25.field401 = -1;
            class33.field541 = -1;
            return;
        }
        int var8 = -21 / ((21 - arg5) / 47);
        int var9 = class239.method1586(arg3, arg7, 2, class149.field2909) - arg2;
        int var10 = arg7 - class184.field3610;
        int var11 = arg3 - class79.field1428;
        int var12 = var9 - class108.field1956;
        int var13 = class173.field3361[class207.field3936];
        int var14 = class173.field3356[class207.field3936];
        int var15 = class173.field3356[class170.field3259];
        int var16 = class173.field3361[class170.field3259];
        int var17 = var10 * var16 + var11 * var15 >> 16;
        int var18 = var10 * var15 - var11 * var16 >> 16;
        int var20 = var12 * var14 - var13 * var18 >> 16;
        int var21 = var12 * var13 + var14 * var18 >> 16;
        if (var21 < 50) {
            class25.field401 = -1;
            class33.field541 = -1;
        } else {
            class33.field541 = (var20 << 9) / var21 + arg0;
            class25.field401 = (var17 << 9) / var21 + arg6;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Li;I)V")
    public static final void method684(class88 arg0, int arg1) {
        field1790++;
        if (arg1 <= class67.field1208) {
            if (arg0.method624(class78.field1421, (byte) -63)) {
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class223.method1501(class166.method1142(new class88[] { class152.field2952, class170.method1214(var4, -93), class110.field2009 }, -3), 12, 0, null);
            }
            if (arg0.method624(class11.field156, (byte) -86)) {
                class201.method1382(84);
            }
            if (arg0.method624(class248.field4549, (byte) -41)) {
                class148.field2770 = true;
            }
            if (arg0.method624(class34.field583, (byte) 123)) {
                class148.field2770 = false;
            }
            arg0.method624(class44.field751, (byte) 68);
            arg0.method624(class1.field6, (byte) -65);
            if (arg0.method624(class172.field3339, (byte) -99)) {
                for (int var5 = 0; var5 < 4; var5++) {
                    for (int var6 = 1; var6 < 103; var6++) {
                        for (int var7 = 1; var7 < 103; var7++) {
                            class166.field3202[var5].field1668[var6][var7] = 0;
                        }
                    }
                }
            }
            if (arg0.method619(-4205, class226.field4251) && class115.field2073 != 0) {
                class159.method1075(arg0.method635(6, -383902332).method603(false), 30594);
            }
            if (arg0.method624(class22.field344, (byte) 125) && class115.field2073 == 2) {
                throw new RuntimeException();
            }
            if (arg0.method619(-4205, class58.field1103)) {
                class134.field2505 = arg0.method635(12, -383902332).method602(arg1 ^ 0xFFFFFF9B).method603(false);
                class223.method1501(class166.method1142(new class88[] { class93.field1751, class170.method1214(class134.field2505, arg1 - 120) }, -3), 12, 0, null);
            }
            if (arg0.method624(class106.field1932, (byte) -112)) {
                class116.field2105 = true;
            }
        }
        class131.field2450++;
        class146.field2749.method30((byte) -51, 175);
        class146.field2749.method346(255, arg0.method604((byte) -53) - 1);
        class146.field2749.method336(arg0.method635(2, -383902332), (byte) 0);
    }
}
