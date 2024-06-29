import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public abstract class class62 {

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "Lcd;")
    public static class64 field1204 = class44.method335((byte) 71, "");

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "Lol;")
    public static class221 field1212;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "Lqm;")
    public static class222 field1205;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "Lqm;")
    public static class222 field1207;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "[I")
    public static int[] field1211;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "[Lvl;")
    public static class73[] field1210;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "[[[I")
    public static int[][][] field1209;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V", line = 10)
    public static void method485(byte arg0) {
        field1211 = null;
        field1204 = null;
        field1212 = null;
        int var1 = -25 % ((47 - arg0) / 52);
        field1209 = (int[][][]) null;
        field1205 = null;
        field1207 = null;
        field1210 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V", line = 54)
    public static final void method487(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class146.field2588 * 128) {
            arg0 = class146.field2588 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class314.field5327 * 128) {
            arg2 = class314.field5327 * 128 - 1;
        }
        class172.field2965 = class50.field826[arg3];
        class296.field5101 = class50.field820[arg3];
        class233.field3945 = class50.field826[arg4];
        class216.field3630 = class50.field820[arg4];
        class165.field2900 = arg0;
        class159.field2796 = arg1;
        class249.field4331 = arg2;
        class89.field1614 = arg0 / 128;
        class172.field2968 = arg2 / 128;
        class69.field1323 = class89.field1614 - class185.field3180;
        if (class69.field1323 < 0) {
            class69.field1323 = 0;
        }
        class246.field4290 = class172.field2968 - class185.field3180;
        if (class246.field4290 < 0) {
            class246.field4290 = 0;
        }
        class278.field4797 = class89.field1614 + class185.field3180;
        if (class278.field4797 > class146.field2588) {
            class278.field4797 = class146.field2588;
        }
        class265.field4550 = class185.field3180 + class172.field2968;
        if (class265.field4550 > class314.field5327) {
            class265.field4550 = class314.field5327;
        }
        short var15;
        if (class123.field2216) {
            var15 = 3584;
        } else {
            var15 = 3500;
        }
        for (int var16 = 0; var16 < class185.field3180 + class185.field3180 + 2; var16++) {
            for (int var17 = 0; var17 < class185.field3180 + class185.field3180 + 2; var17++) {
                int var18 = (var16 - class185.field3180 << 7) - (class165.field2900 & 0x7F);
                int var19 = (var17 - class185.field3180 << 7) - (class249.field4331 & 0x7F);
                int var20 = class89.field1614 + var16 - class185.field3180;
                int var21 = class172.field2968 + var17 - class185.field3180;
                if (var20 >= 0 && var21 >= 0 && var20 < class146.field2588 && var21 < class314.field5327) {
                    int var22;
                    if (class184.field3155 == null) {
                        var22 = class266.field4571[0][var20][var21] + 128 - class159.field2796;
                    } else {
                        var22 = class184.field3155[0][var20][var21] + 128 - class159.field2796;
                    }
                    int var23 = class266.field4571[3][var20][var21] - class159.field2796 - 1000;
                    class218.field3696[var16][var17] = class109.method791(var18, var23, var22, var19, var15);
                } else {
                    class218.field3696[var16][var17] = false;
                }
            }
        }
        for (int var24 = 0; var24 < class185.field3180 + class185.field3180 + 1; var24++) {
            for (int var25 = 0; var25 < class185.field3180 + class185.field3180 + 1; var25++) {
                class147.field2593[var24][var25] = class218.field3696[var24][var25] || class218.field3696[var24 + 1][var25] || class218.field3696[var24][var25 + 1] || class218.field3696[var24 + 1][var25 + 1];
            }
        }
        class254.field4421 = arg6;
        class161.field2836 = arg7;
        class97.field1785 = arg8;
        class278.field4808 = arg9;
        class137.field2442 = arg10;
        class206.method1434();
        if (class61.field1192 != null) {
            class110.method803(true);
            class185.method1308(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            if (class123.field2216) {
                class223.field3808 = false;
                class125.method908(0, -5, 0);
                class52.method394((float[]) null);
                class177.method1242();
            }
            class110.method803(false);
        }
        class185.method1308(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lik;I)Lik;")
    public abstract class247 method486(class247 arg0, int arg1);
}
