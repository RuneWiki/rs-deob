import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public abstract class class122 {

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "[Lga;")
    public static class170[] field2404 = new class170[4];

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "Lcc;")
    public static class209 field2406 = class95.method669(104, "Vous ne pouvez pas ajouter votre nom -9 votre liste noire)3");

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "[Z")
    public static boolean[] field2409 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "Lcc;")
    public static class209 field2401 = class95.method669(89, "M-Bmoire en cours d(Wattribution");

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public static int field2402 = 0;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public static int field2400 = 0;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field2411;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "[I")
    public static int[] field2408;

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "[Lca;")
    public static class264[] field2410;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V")
    public static final void method892(byte arg0) {
        field2405++;
        if (arg0 >= -98) {
            field2409 = null;
        }
        class93.field1848.method665(1);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Luk;IZ)V")
    public static final void method893(class97 arg0, int arg1, boolean arg2) {
        field2403++;
        int var3 = arg0.field1895;
        if (arg1 <= 42) {
            field2412 = 28;
        }
        int var4 = (int) arg0.field596;
        arg0.method269(-214950896);
        if (arg2) {
            class66.method484(var3, 93);
        }
        class255.method1760(-187, var3);
        class42 var5 = class247.method1719(var4, -8667);
        if (var5 != null) {
            class126.method907(var5, 0);
        }
        int var6 = class98.field1912;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class108.method783((byte) -119, class40.field680[var7])) {
                class264.method1811((byte) 118, var7);
            }
        }
        if (class98.field1912 == 1) {
            class244.field4418 = false;
            class21.method185(class186.field3347, class117.field2349, 0, class111.field2245, class172.field3149);
        } else {
            class21.method185(class186.field3347, class117.field2349, 0, class111.field2245, class172.field3149);
            int var8 = class66.field1269.method1298(class11.field212);
            for (int var9 = 0; var9 < class98.field1912; var9++) {
                int var10 = class66.field1269.method1298(class99.method690(-79, var9));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class117.field2349 = var8 + 8;
            class172.field3149 = class98.field1912 * 15 + 22;
        }
        if (class149.field2727 != -1) {
            class20.method177(true, class149.field2727, 1);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
    public abstract void method170(int arg0);

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIB)I")
    public abstract int method169(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(B)V")
    public static void method894(byte arg0) {
        field2404 = null;
        field2411 = null;
        field2409 = null;
        field2408 = null;
        if (arg0 == -85) {
            field2406 = null;
            field2410 = null;
            field2401 = null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Z)V")
    public static final void method895(boolean arg0) {
        field2399++;
        class200.method1368(19201);
        class50.method379(-120);
        class265.method1815(-127);
        class252.method1744(0);
        class199.method1361((byte) 93);
        class42.method316(-1);
        class235.method1630(-1416);
        class7.method77(8390);
        class179.method1234(false);
        class164.method1134(250);
        class40.method303(25857);
        class100.method696((byte) -127);
        class12.method95((byte) 98);
        class286.method1926((byte) -64);
        if (!arg0) {
            field2402 = -22;
        }
        class28.field516.method664(113);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIILpb;JLpb;Lpb;)V")
    public static final void method896(int arg0, int arg1, int arg2, int arg3, class126 arg4, long arg5, class126 arg6, class126 arg7) {
        class253 var9 = new class253();
        var9.field4570 = arg4;
        var9.field4558 = arg1 * 128 + 64;
        var9.field4554 = arg2 * 128 + 64;
        var9.field4549 = arg3;
        var9.field4551 = arg5;
        var9.field4559 = arg6;
        var9.field4553 = arg7;
        int var10 = 0;
        class109 var11 = class106.field2089[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field2203; var12++) {
                class264 var13 = var11.field2189[var12];
                if ((var13.field4733 & 0x400000L) == 4194304L) {
                    int var14 = var13.field4735.method216();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field4548 = -var10;
        if (class106.field2089[arg0][arg1][arg2] == null) {
            class106.field2089[arg0][arg1][arg2] = new class109(arg0, arg1, arg2);
        }
        class106.field2089[arg0][arg1][arg2].field2201 = var9;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method897(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2413++;
        class111 var10 = null;
        for (class111 var11 = (class111) class88.field1744.method1119(20896); var11 != null; var11 = (class111) class88.field1744.method1120(80)) {
            if (var11.field2235 == arg4 && var11.field2234 == arg3 && var11.field2243 == arg8 && var11.field2249 == arg9) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class111();
            var10.field2235 = arg4;
            var10.field2243 = arg8;
            var10.field2249 = arg9;
            var10.field2234 = arg3;
            class176.method1218(var10, -1);
            class88.field1744.method1123(var10, (byte) -127);
        }
        var10.field2232 = arg2;
        int var12 = -36 % ((-arg6 - 54) / 45);
        var10.field2242 = arg7;
        var10.field2238 = arg1;
        var10.field2236 = arg5;
        var10.field2239 = arg0;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II[Lji;)V")
    public static final void method898(int arg0, int arg1, class42[] arg2) {
        field2407++;
        if (arg1 != -28098) {
            method892((byte) -94);
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class42 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field810 == 0) {
                    if (var4.field762 != null) {
                        method898(arg0, -28098, var4.field762);
                    }
                    class97 var5 = (class97) class114.field2288.method1755((long) var4.field779, (byte) -86);
                    if (var5 != null) {
                        class20.method177(true, var5.field1895, arg0);
                    }
                }
                if (arg0 == 0 && var4.field835 != null) {
                    class227 var6 = new class227();
                    var6.field4143 = var4;
                    var6.field4134 = var4.field835;
                    class147.method1021(var6, arg1 ^ 0xFFFC9F7E);
                }
                if (arg0 == 1 && var4.field705 != null) {
                    if (var4.field721 >= 0) {
                        class42 var7 = class247.method1719(var4.field779, -8667);
                        if (var7 == null || var7.field762 == null || var7.field762.length <= var4.field721 || var7.field762[var4.field721] != var4) {
                            continue;
                        }
                    }
                    class227 var8 = new class227();
                    var8.field4134 = var4.field705;
                    var8.field4143 = var4;
                    class147.method1021(var8, 200000);
                }
            }
        }
    }
}
