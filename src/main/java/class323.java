import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class323 extends class147 {

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "I")
    public static int field5547 = 2301979;

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "I")
    public static int field5553 = -2;

    @OriginalMember(owner = "client!oj", name = "y", descriptor = "I")
    public static int field5556 = 0;

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "[Z")
    public static boolean[] field5557 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "I")
    public int field5548;

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "I")
    public int field5549;

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "I")
    public static int field5550;

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "I")
    public static int field5552;

    @OriginalMember(owner = "client!oj", name = "w", descriptor = "I")
    public static int field5554;

    @OriginalMember(owner = "client!oj", name = "A", descriptor = "I")
    public int field5558;

    @OriginalMember(owner = "client!oj", name = "C", descriptor = "I")
    public static int field5559;

    @OriginalMember(owner = "client!oj", name = "D", descriptor = "I")
    public static int field5560;

    @OriginalMember(owner = "client!oj", name = "F", descriptor = "I")
    public static int field5562;

    @OriginalMember(owner = "client!oj", name = "x", descriptor = "Lve;")
    public static class266 field5555;

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "[I")
    public static int[] field5551;

    @OriginalMember(owner = "client!oj", name = "E", descriptor = "[[Lhg;")
    public static class172[][] field5561;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)V", line = 19)
    public static void method2243(boolean arg0) {
        field5555 = null;
        field5551 = null;
        field5561 = (class172[][]) null;
        field5557 = null;
        if (!arg0) {
            method2246(-65, (byte) -3, 110, (int[][]) ((int[][]) null), -123, 122);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BZLrk;)V", line = 33)
    public static final void method2244(byte arg0, boolean arg1, class175 arg2) {
        field5554++;
        if (class255.field4184 || arg1) {
            int var3 = class141.field2153;
            int var4 = var3 * 956 / 503;
            class308.field5308.method878((class38.field622 - var4) / 2, 0, var4, var3);
            class249.field4059.method113(class38.field622 / 2 - (class249.field4059.field2341 / 2), 18);
        }
        arg2.method1216(class39.field640, class38.field622 / 2, class141.field2153 / 2 - 26, 16777215, -1);
        int var5 = class141.field2153 / 2 - 18;
        if (class255.field4184) {
            class326.method2271(class38.field622 / 2 - 152, var5, 304, 34, 9179409);
            class326.method2271(class38.field622 / 2 - 151, var5 - -1, 302, 32, 0);
            class326.method2278(class38.field622 / 2 - 150, var5 + 2, class4.field37 * 3, 30, 9179409);
            class326.method2278(class38.field622 / 2 + (class4.field37 * 3) - 150, var5 + 2, 300 - (class4.field37 * 3), 30, 0);
        } else {
            class34.method274(class38.field622 / 2 - 152, var5, 304, 34, 9179409);
            class34.method274(class38.field622 / 2 - 151, var5 + 1, 302, 32, 0);
            class34.method286(class38.field622 / 2 - 150, var5 + 2, class4.field37 * 3, 30, 9179409);
            class34.method286(class38.field622 / 2 + class4.field37 * 3 - 150, var5 + 2, 300 - (class4.field37 * 3), 30, 0);
        }
        arg2.method1216(class235.field3731, class38.field622 / 2, class141.field2153 / 2 + 4, 16777215, -1);
        if (arg0 < 50) {
            field5551 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IZIJI)Lna;", line = 102)
    public static final class26 method2245(int arg0, boolean arg1, int arg2, long arg3, int arg4) {
        field5550++;
        class26 var6 = class5.method26((byte) -99, 0);
        if (arg3 < 0L) {
            arg3 = -arg3;
            var6.method164(class46.field725, true);
        }
        class26 var7 = class207.field3222;
        class26 var8 = class42.field698;
        if (arg0 == 1) {
            var7 = class42.field698;
            var8 = class207.field3222;
        }
        if (arg0 == 2) {
            var8 = class207.field3222;
            var7 = class98.field1600;
        }
        if (arg0 == 3) {
            var7 = class42.field698;
            var8 = class207.field3222;
        }
        class26 var9 = class5.method26((byte) -99, 0);
        for (int var10 = 0; var10 < arg2; var10++) {
            var9.method164(class149.method1019((byte) 9, (int) (arg3 % 10L)), true);
            arg3 /= 10L;
        }
        int var11 = 0;
        class26 var13;
        if (arg3 == 0L) {
            var13 = class114.field1800;
        } else {
            class26 var12 = class5.method26((byte) -102, 0);
            while (arg3 > 0L) {
                if (arg1 && var11 != 0 && (var11 % 3) == 0) {
                    var12.method164(var7, true);
                }
                var12.method164(class149.method1019((byte) 9, (int) (arg3 % 10L)), true);
                var11++;
                arg3 /= 10L;
            }
            var13 = var12;
        }
        if (arg4 == 2) {
            if (var9.method171(arg4 ^ 0xFFFFFFD1) > 0) {
                var9.method164(var8, true);
            }
            return class236.method1587(new class26[] { var6, var13.method175(true), var9.method175(true) }, (byte) -66);
        } else {
            return (class26) null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IBI[[III)I", line = 185)
    public static final int method2246(int arg0, byte arg1, int arg2, int[][] arg3, int arg4, int arg5) {
        field5562++;
        int var6 = (128 - arg0) * arg3[arg4][arg2] + arg3[arg4 + 1][arg2] * arg0 >> 7;
        int var7 = (128 - arg0) * arg3[arg4][arg2 + 1] + arg3[arg4 + 1][arg2 + 1] * arg0 >> 7;
        int var8 = -121 / ((arg1 - 5) / 46);
        return (128 - arg5) * var6 + (arg5 * var7) >> 7;
    }
}
