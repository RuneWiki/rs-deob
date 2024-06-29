import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class74 {

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "[Lwa;")
    public static class226[] field1272;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "([SIII[Le;)V")
    public static final void method478(short[] arg0, int arg1, int arg2, int arg3, class191[] arg4) {
        if (arg1 < arg2) {
            int var5 = (arg1 + arg2) / 2;
            int var6 = arg1;
            class191 var7 = arg4[var5];
            arg4[var5] = arg4[arg2];
            arg4[arg2] = var7;
            short var8 = arg0[var5];
            arg0[var5] = arg0[arg2];
            arg0[arg2] = var8;
            for (int var9 = arg1; var9 < arg2; var9++) {
                if (var7 == null || arg4[var9] != null && arg4[var9].method1348(var7, arg3 ^ 0x632E) < (var9 & 0x1)) {
                    class191 var10 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6] = var10;
                    short var11 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6++] = var11;
                }
            }
            arg4[arg2] = arg4[var6];
            arg4[var6] = var7;
            arg0[arg2] = arg0[var6];
            arg0[var6] = var8;
            method478(arg0, arg1, var6 - 1, 2086, arg4);
            method478(arg0, var6 + 1, arg2, 2086, arg4);
        }
        if (arg3 != 2086) {
            field1272 = null;
        }
        field1274++;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)V")
    public static final void method479(boolean arg0) {
        class88.field1436.method992(-31);
        if (arg0) {
            method480(21, 99, true, -62, (byte) 110, -31);
        }
        field1273++;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIZIBI)V")
    public static final void method480(int arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5) {
        field1275++;
        class182.field3131++;
        if (!arg2) {
            class121.method812(-119, true);
            class40.method269(true, true);
            class121.method812(105, false);
        }
        class40.method269(false, true);
        if (!arg2) {
            class132.method890(-95);
        }
        class261.method1793((byte) 18);
        if (class243.field4345 == 1) {
            int var6 = class269.field4751;
            if (var6 < (class40.field723 / 256)) {
                var6 = class40.field723 / 256;
            }
            int var7 = class65.field1138 + class249.field4421 & 0x7FF;
            if (class147.field2478[4] && class110.field1840[4] + 128 > var6) {
                var6 = class110.field1840[4] + 128;
            }
            class126.method854(var7, arg1, class256.field4548, false, class222.method1546(class261.field4598, class175.field2946.field3003, class175.field2946.field2972, 247425607) - 50, class65.field1142, var6, (var6 * 3) + 600);
        }
        int var8 = class137.field2306;
        int var9 = class244.field4353;
        int var10 = class229.field4116;
        int var11 = class170.field2876;
        if (arg4 >= -117) {
            field1272 = null;
        }
        int var12 = class81.field1371;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class147.field2478[var13]) {
                int var19 = (int) ((double) (-class92.field1511[var13]) + (double) (class92.field1511[var13] * 2 + 1) * Math.random() + Math.sin((double) class190.field3340[var13] / 100.0D * (double) client.field1736[var13]) * (double) class110.field1840[var13]);
                if (var13 == 0) {
                    class137.field2306 += var19;
                }
                if (var13 == 4) {
                    class170.field2876 += var19;
                    if (class170.field2876 < 128) {
                        class170.field2876 = 128;
                    }
                    if (class170.field2876 > 383) {
                        class170.field2876 = 383;
                    }
                }
                if (var13 == 2) {
                    class244.field4353 += var19;
                }
                if (var13 == 3) {
                    class81.field1371 = class81.field1371 + var19 & 0x7FF;
                }
                if (var13 == 1) {
                    class229.field4116 += var19;
                }
            }
        }
        class141.method929(3);
        class7.method54(arg5, arg0, arg3 + arg5, arg0 + arg1);
        class15.method107();
        if (class258.field4575 || arg5 > class134.field2258 || class134.field2258 >= (arg3 + arg5) || arg0 > class183.field3161 || class183.field3161 >= arg0 + arg1) {
            class117.field1936 = false;
            class242.field4308 = 0;
        } else {
            class242.field4308 = 0;
            int var14 = class90.field1456;
            class117.field1936 = true;
            int var15 = class165.field2797;
            int var16 = class29.field416;
            class4.field31 = (class134.field2258 - arg5) * (var16 - var14) / arg3 + var14;
            int var17 = class189.field3328;
            class258.field4582 = (var17 - var15) * (class183.field3161 - arg0) / arg1 + var15;
        }
        class228.method1632((byte) 97);
        byte var18 = class129.method875((byte) 62) == 2 ? (byte) class182.field3131 : 1;
        class7.method55(arg5, arg0, arg3, arg1, 0);
        class92.method562(class137.field2306, class229.field4116, class244.field4353, class170.field2876, class81.field1371, class137.field2301, class25.field362, class223.field3976, class157.field2674, class232.field4150, class82.field1386, class261.field4598 + 1, var18, class175.field2946.field3003 >> 7, class175.field2946.field2972 >> 7);
        class228.method1632((byte) 92);
        class124.method842();
        class243.method1705(arg5, 256, arg0, arg3, 1611254640, 256, arg1);
        class75.method487(arg5, arg3, arg0, 256, (byte) -118, 256, arg1);
        ((class192) class15.field199).method1362(12039, class182.field3138);
        class118.method783(arg5, arg1, 4, arg3, arg0);
        class229.field4116 = var10;
        class137.field2306 = var8;
        class170.field2876 = var11;
        class244.field4353 = var9;
        class81.field1371 = var12;
        if (class196.field3507 && class127.field2105.method1406((byte) 92) == 0) {
            class196.field3507 = false;
        }
        if (class196.field3507) {
            class7.method55(arg5, arg0, arg3, arg1, 0);
            class40.method270(false, 0, class233.field4163);
        }
        if (!arg2 && !class196.field3507 && !class258.field4575 && arg5 <= class134.field2258 && (arg3 + arg5) > class134.field2258 && arg0 <= class183.field3161 && (arg0 + arg1) > class183.field3161) {
            class57.method379(arg1, arg0, arg5, class134.field2258, class183.field3161, (byte) -108, arg3);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
    public static void method481(int arg0) {
        field1272 = null;
        if (arg0 != 15391) {
            method479(false);
        }
    }
}
