import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class73 {

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
    public int field969;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public int field972;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
    public int field973;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V", line = 5)
    public static final void method540(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class66.field847 * 128) {
            arg0 = class66.field847 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class300.field4413 * 128) {
            arg2 = class300.field4413 * 128 - 1;
        }
        class211.field2988 = class350.field5476[arg3];
        class223.field3213 = class350.field5474[arg3];
        class167.field2338 = class350.field5476[arg4];
        class287.field4122 = class350.field5474[arg4];
        class181.field2479 = arg0;
        class125.field1659 = arg1;
        class338.field5269 = arg2;
        class116.field1507 = arg0 / 128;
        class288.field4178 = arg2 / 128;
        class64.field800 = class116.field1507 - class255.field3728;
        if (class64.field800 < 0) {
            class64.field800 = 0;
        }
        class16.field202 = class288.field4178 - class255.field3728;
        if (class16.field202 < 0) {
            class16.field202 = 0;
        }
        class175.field2404 = class255.field3728 + class116.field1507;
        if (class175.field2404 > class66.field847) {
            class175.field2404 = class66.field847;
        }
        class3.field20 = class288.field4178 + class255.field3728;
        if (class3.field20 > class300.field4413) {
            class3.field20 = class300.field4413;
        }
        short var15;
        if (class47.field623) {
            var15 = 3584;
        } else {
            var15 = 3500;
        }
        for (int var16 = 0; var16 < class255.field3728 + class255.field3728 + 2; var16++) {
            for (int var17 = 0; var17 < class255.field3728 + class255.field3728 + 2; var17++) {
                int var18 = (var16 - class255.field3728 << 7) - (class181.field2479 & 0x7F);
                int var19 = (var17 - class255.field3728 << 7) - (class338.field5269 & 0x7F);
                int var20 = class116.field1507 + var16 - class255.field3728;
                int var21 = class288.field4178 + var17 - class255.field3728;
                if (var20 >= 0 && var21 >= 0 && var20 < class66.field847 && var21 < class300.field4413) {
                    int var22;
                    if (class161.field2296 == null) {
                        var22 = class185.field2517[0][var20][var21] + 128 - class125.field1659;
                    } else {
                        var22 = class161.field2296[0][var20][var21] + 128 - class125.field1659;
                    }
                    int var23 = class185.field2517[3][var20][var21] - class125.field1659 - 1000;
                    class283.field4030[var16][var17] = class323.method2234(var18, var23, var22, var19, var15);
                } else {
                    class283.field4030[var16][var17] = false;
                }
            }
        }
        for (int var24 = 0; var24 < class255.field3728 + class255.field3728 + 1; var24++) {
            for (int var25 = 0; var25 < class255.field3728 + class255.field3728 + 1; var25++) {
                class15.field170[var24][var25] = class283.field4030[var24][var25] || class283.field4030[var24 + 1][var25] || class283.field4030[var24][var25 + 1] || class283.field4030[var24 + 1][var25 + 1];
            }
        }
        class180.field2463 = arg6;
        class16.field192 = arg7;
        class347.field5414 = arg8;
        class52.field685 = arg9;
        class14.field162 = arg10;
        class333.method2333();
        if (class300.field4410 != null) {
            class85.method621(true);
            class304.method2125(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            if (class47.field623) {
                class321.field4723 = false;
                class255.method1781(0, 0, -68);
                class41.method291((float[]) null);
                class22.method137();
            }
            class85.method621(false);
        }
        class304.method2125(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIBLfh;)[Lvn;", line = 137)
    public static final class11[] method541(int arg0, int arg1, byte arg2, class140 arg3) {
        if (arg2 >= -97) {
            return (class11[]) null;
        } else {
            field970++;
            return class134.method1020(1, arg3, arg1, arg0) ? class345.method2396(5325) : null;
        }
    }
}
