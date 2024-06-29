import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class27 {

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "[[B")
    public static byte[][] field354 = new byte[250][];

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "Lkl;")
    public static class55 field356 = new class55(4, 1, 1, 1);

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "Lmg;")
    public static class101 field358;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "Luv;")
    public static class244 field357;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IILco;II)V")
    public static final void method154(int arg0, int arg1, class77 arg2, int arg3, int arg4) {
        field355++;
        class93 var5 = arg2.method616((byte) -83);
        if (arg1 != -8898) {
            return;
        }
        int var6 = arg2.field1060 - arg2.field1085.field1453 & 0x3FFF;
        if (arg4 == -1) {
            if (var6 != 0 || arg2.field1106 > 25) {
                arg2.field1099 = false;
                if (arg0 < 0 && var5.field1362 != -1) {
                    arg2.field1083 = var5.field1362;
                } else if (arg0 <= 0 || var5.field1358 == -1) {
                    arg2.field1083 = var5.field1360;
                } else {
                    arg2.field1083 = var5.field1358;
                }
            } else if (!arg2.field1099 || !var5.method690(0, arg2.field1083)) {
                arg2.field1083 = var5.method691(arg1 + 8866);
                arg2.field1099 = arg2.field1083 != -1;
            }
        } else if (arg2.field1069 != -1 && (var6 >= 10240 || var6 <= 2048)) {
            int var7 = class39.field489[arg3] - arg2.field1085.field1453 & 0x3FFF;
            arg2.field1099 = false;
            if (arg4 == 2 && var5.field1338 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field1341 != -1) {
                    arg2.field1083 = var5.field1341;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field1333 != -1) {
                    arg2.field1083 = var5.field1333;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field1372 == -1) {
                    arg2.field1083 = var5.field1338;
                } else {
                    arg2.field1083 = var5.field1372;
                }
            } else if (arg4 == 0 && var5.field1355 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field1350 != -1) {
                    arg2.field1083 = var5.field1350;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field1374 != -1) {
                    arg2.field1083 = var5.field1374;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field1353 == -1) {
                    arg2.field1083 = var5.field1355;
                } else {
                    arg2.field1083 = var5.field1353;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field1378 != -1) {
                arg2.field1083 = var5.field1378;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field1361 != -1) {
                arg2.field1083 = var5.field1361;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field1337 == -1) {
                arg2.field1083 = var5.field1360;
            } else {
                arg2.field1083 = var5.field1337;
            }
        } else if (var6 == 0 && arg2.field1106 <= 25) {
            if (arg4 == 2 && var5.field1338 != -1) {
                arg2.field1083 = var5.field1338;
            } else if (arg4 == 0 && var5.field1355 != -1) {
                arg2.field1083 = var5.field1355;
            } else {
                arg2.field1083 = var5.field1360;
            }
            arg2.field1099 = false;
        } else {
            arg2.field1099 = false;
            if (arg4 == 2 && var5.field1338 != -1) {
                if (arg0 < 0 && var5.field1345 != -1) {
                    arg2.field1083 = var5.field1345;
                } else if (arg0 <= 0 || var5.field1371 == -1) {
                    arg2.field1083 = var5.field1338;
                } else {
                    arg2.field1083 = var5.field1371;
                }
            } else if (arg4 == 0 && var5.field1355 != -1) {
                if (arg0 < 0 && var5.field1354 != -1) {
                    arg2.field1083 = var5.field1354;
                } else if (arg0 <= 0 || var5.field1377 == -1) {
                    arg2.field1083 = var5.field1355;
                } else {
                    arg2.field1083 = var5.field1377;
                }
            } else if (arg0 < 0 && var5.field1343 != -1) {
                arg2.field1083 = var5.field1343;
            } else if (arg0 <= 0 || var5.field1334 == -1) {
                arg2.field1083 = var5.field1360;
            } else {
                arg2.field1083 = var5.field1334;
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public static void method155(int arg0) {
        int var1 = 43 / ((arg0 + 67) / 56);
        field358 = null;
        field357 = null;
        field354 = null;
        field356 = null;
    }
}
