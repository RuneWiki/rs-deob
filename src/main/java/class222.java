import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class222 extends class137 {

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "Z")
    public boolean field4050 = false;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "Lhh;")
    public static class163 field4041 = class137.method1065("<col=ff9040>", 17);

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
    public static int field4040 = 0;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "Lhh;")
    private static class163 field4043 = class137.method1065(" has logged in)3", 17);

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "Lhh;")
    public static class163 field4042 = field4043;

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "S")
    public static short field4047 = 256;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "I")
    public int field4046;

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "I")
    public int field4049;

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "[[[B")
    public static byte[][][] field4048;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIBZLtc;)V")
    public static final void method1571(int arg0, int arg1, int arg2, byte arg3, boolean arg4, class18 arg5) {
        field4039++;
        if (class40.field671 >= 50 || arg5.field282 == null || arg0 >= arg5.field282.length || arg5.field282[arg0] == null) {
            return;
        }
        int var6 = arg5.field282[arg0][0];
        int var7 = var6 & 0xF;
        int var8 = var6 >> 8;
        int var9 = var6 >> 4 & 0x7;
        if (arg5.field282[arg0].length > 1) {
            int var10 = (int) ((double) arg5.field282[arg0].length * Math.random());
            if (var10 > 0) {
                var8 = arg5.field282[arg0][var10];
            }
        }
        if (var7 == 0) {
            if (arg4) {
                class199.method1426(var9, var8, 44, 0);
            }
        } else if (arg3 > 46 && class2.field46 != 0) {
            int var11 = (arg1 - 64) / 128;
            int var12 = (arg2 - 64) / 128;
            class9.field153[class40.field671] = var8;
            class193.field3520[class40.field671] = var9;
            class204.field3694[class40.field671] = 0;
            class4.field87[class40.field671] = null;
            class107.field2046[class40.field671] = (var12 << 16) - (-(var11 << 8) - var7);
            class40.field671++;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method1572(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class58.field948 * 128) {
            arg0 = class58.field948 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class106.field2033 * 128) {
            arg2 = class106.field2033 * 128 - 1;
        }
        class168.field3084 = class98.field1839[arg3];
        class29.field445 = class98.field1843[arg3];
        class231.field4135 = class98.field1839[arg4];
        class94.field1771 = class98.field1843[arg4];
        class134.field2601 = arg0;
        class127.field2472 = arg1;
        class30.field476 = arg2;
        class110.field2072 = arg0 / 128;
        client.field1990 = arg2 / 128;
        class2.field42 = class110.field2072 - class236.field4208;
        if (class2.field42 < 0) {
            class2.field42 = 0;
        }
        class136.field2628 = client.field1990 - class236.field4208;
        if (class136.field2628 < 0) {
            class136.field2628 = 0;
        }
        class220.field4009 = class236.field4208 + class110.field2072;
        if (class220.field4009 > class58.field948) {
            class220.field4009 = class58.field948;
        }
        class87.field1622 = client.field1990 + class236.field4208;
        if (class87.field1622 > class106.field2033) {
            class87.field1622 = class106.field2033;
        }
        short var15 = 3500;
        for (int var16 = 0; var16 < class236.field4208 + class236.field4208 + 2; var16++) {
            for (int var19 = 0; var19 < class236.field4208 + class236.field4208 + 2; var19++) {
                int var20 = (var16 - class236.field4208 << 7) - (class134.field2601 & 0x7F);
                int var21 = (var19 - class236.field4208 << 7) - (class30.field476 & 0x7F);
                int var22 = class110.field2072 + var16 - class236.field4208;
                int var23 = client.field1990 + var19 - class236.field4208;
                if (var22 >= 0 && var23 >= 0 && var22 < class58.field948 && var23 < class106.field2033) {
                    int var24;
                    if (class172.field3157 == null) {
                        var24 = class161.field2958[0][var22][var23] + 128 - class127.field2472;
                    } else {
                        var24 = class172.field3157[0][var22][var23] + 128 - class127.field2472;
                    }
                    int var25 = class161.field2958[3][var22][var23] - class127.field2472 - 1000;
                    class48.field808[var16][var19] = class170.method1267(var20, var25, var24, var21, var15);
                } else {
                    class48.field808[var16][var19] = false;
                }
            }
        }
        for (int var17 = 0; var17 < class236.field4208 + class236.field4208 + 1; var17++) {
            for (int var18 = 0; var18 < class236.field4208 + class236.field4208 + 1; var18++) {
                class120.field2267[var17][var18] = class48.field808[var17][var18] || class48.field808[var17 + 1][var18] || class48.field808[var17][var18 + 1] || class48.field808[var17 + 1][var18 + 1];
            }
        }
        class152.field2846 = arg6;
        class233.field4172 = arg7;
        class170.field3104 = arg8;
        class142.field2699 = arg9;
        class145.field2763 = arg10;
        class226.method1582();
        class201.method1439(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(B)V")
    public static void method1573(byte arg0) {
        field4043 = null;
        field4041 = null;
        field4042 = null;
        field4048 = null;
        if (arg0 != 50) {
            field4048 = null;
        }
    }
}
