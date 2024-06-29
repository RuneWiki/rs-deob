import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class108 {

    @OriginalMember(owner = "client!m", name = "f", descriptor = "Leh;")
    public static class47 field2241 = class195.method1282((byte) -4, "<col=ffb000>");

    @OriginalMember(owner = "client!m", name = "e", descriptor = "Leh;")
    private static class47 field2240 = class195.method1282((byte) -4, "Unable to connect)3");

    @OriginalMember(owner = "client!m", name = "h", descriptor = "Leh;")
    public static class47 field2243 = class195.method1282((byte) -4, "sl_flags");

    @OriginalMember(owner = "client!m", name = "n", descriptor = "Leh;")
    public static class47 field2249 = field2240;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "Leh;")
    public static class47 field2250 = class195.method1282((byte) -4, "Fertigkeit)2");

    @OriginalMember(owner = "client!m", name = "j", descriptor = "Leh;")
    public static class47 field2245 = field2240;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field2237 = -1;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "Leh;")
    public static class47 field2236 = class195.method1282((byte) -4, "jolt");

    @OriginalMember(owner = "client!m", name = "p", descriptor = "Leh;")
    public static class47 field2251 = class195.method1282((byte) -4, "Diese Welt ist voll)3");

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "J")
    public static long field2247;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "Lah;")
    public static class9 field2246;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
    public static final void method869(int arg0) {
        class67.field1432 = null;
        if (arg0 != 4346) {
            return;
        }
        class33.field645 = null;
        class105.field2191 = null;
        class197.field3846 = null;
        field2238++;
        class131.field2600 = null;
        class67.field1440 = null;
        class57.field1129 = null;
        class133.field2629 = null;
        class148.field2911 = null;
        class123.field2488 = null;
        class2.field27 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V")
    public static void method870(byte arg0) {
        field2249 = null;
        field2250 = null;
        field2240 = null;
        field2236 = null;
        field2243 = null;
        field2241 = null;
        int var1 = -108 % ((62 - arg0) / 38);
        field2245 = null;
        field2251 = null;
        field2246 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IB)V")
    public static final void method871(int arg0, byte arg1) {
        field2239++;
        if (class57.method493(arg0, 2093369712)) {
            class156.method1080(-1, class51.field986[arg0], 14118);
            if (arg1 >= -5) {
                method873(31, -72, 35);
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIII)V")
    public static final void method872(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2248++;
        if (class138.field2715 == arg1 && class23.field447 == arg4 && (class107.field2226 == arg3 || !class204.field4029)) {
            return;
        }
        class107.field2226 = arg3;
        if (!class204.field4029) {
            class107.field2226 = 0;
        }
        class23.field447 = arg4;
        class138.field2715 = arg1;
        class198.method1299(0, 25);
        class148.method1046(true, false, class196.field3808);
        int var6 = class127.field2536;
        int var7 = class34.field649;
        class34.field649 = (arg4 - 6) * 8;
        class127.field2536 = arg1 * 8 - 48;
        int var8 = class34.field649 - var7;
        int var9 = class34.field649;
        int var10 = class127.field2536 - var6;
        int var11 = class127.field2536;
        for (int var12 = 0; var12 < 32768; var12++) {
            class72 var28 = class133.field2626[var12];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field3310[var29] -= var10;
                    var28.field3317[var29] -= var8;
                }
                var28.field3291 -= var10 * 128;
                var28.field3281 -= var8 * 128;
            }
        }
        for (int var13 = 0; var13 < 2048; var13++) {
            class32 var26 = class40.field795[var13];
            if (var26 != null) {
                for (int var27 = 0; var27 < 10; var27++) {
                    var26.field3310[var27] -= var10;
                    var26.field3317[var27] -= var8;
                }
                var26.field3291 -= var10 * 128;
                var26.field3281 -= var8 * 128;
            }
        }
        byte var14 = 0;
        class196.field3827 = arg3;
        byte var15 = 104;
        class123.field2489.method1156(true, arg2, false, arg0);
        byte var16 = 1;
        if (var10 < 0) {
            var16 = -1;
            var14 = 103;
            var15 = -1;
        }
        byte var17 = 0;
        byte var18 = 1;
        byte var19 = 104;
        if (var8 < 0) {
            var17 = 103;
            var19 = -1;
            var18 = -1;
        }
        for (int var20 = var14; var20 != var15; var20 += var16) {
            for (int var22 = var17; var22 != var19; var22 += var18) {
                int var23 = var20 + var10;
                int var24 = var8 + var22;
                for (int var25 = 0; var25 < 4; var25++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                        class31.field597[var25][var20][var22] = class31.field597[var25][var23][var24];
                    } else {
                        class31.field597[var25][var20][var22] = null;
                    }
                }
            }
        }
        for (class199 var21 = (class199) client.field551.method345(arg5 + 19683); var21 != null; var21 = (class199) client.field551.method348(13949)) {
            var21.field3885 -= var10;
            var21.field3873 -= var8;
            if (var21.field3885 < 0 || var21.field3873 < 0 || var21.field3885 >= 104 || var21.field3873 >= 104) {
                var21.method885(3);
            }
        }
        if (class25.field488 != 0) {
            class47.field926 -= var8;
            class25.field488 -= var10;
        }
        if (arg5 != -19789) {
            method869(38);
        }
        class35.field688 = 0;
        class99.field2090 = -1;
        class152.field2992 = false;
        class39.field773.method350(84);
        class191.field3692.method350(85);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(III)Z")
    public static final boolean method873(int arg0, int arg1, int arg2) {
        int var3 = class106.field2215[arg0][arg1][arg2];
        if (-class44.field893 == var3) {
            return false;
        } else if (class44.field893 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class40.method338(var4 + 1, class41.field821[arg0][arg1][arg2], var5 + 1) && class40.method338(var4 + 128 - 1, class41.field821[arg0][arg1 + 1][arg2], var5 + 1) && class40.method338(var4 + 128 - 1, class41.field821[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class40.method338(var4 + 1, class41.field821[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class106.field2215[arg0][arg1][arg2] = class44.field893;
                return true;
            } else {
                class106.field2215[arg0][arg1][arg2] = -class44.field893;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lah;III)[Lfb;")
    public static final class50[] method874(class9 arg0, int arg1, int arg2, int arg3) {
        field2244++;
        if (class187.method1240(arg2, (byte) 77, arg3, arg0)) {
            if (arg1 != 1) {
                method875((byte) 8);
            }
            return class153.method1065((byte) 93);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(B)V")
    public static final void method875(byte arg0) {
        class137.field2685.method85(14087);
        if (arg0 <= 62) {
            return;
        }
        field2242++;
        for (int var1 = 0; var1 < 32; var1++) {
            class156.field3050[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class174.field3361[var2] = 0L;
        }
        class192.field3718 = 0;
    }
}
