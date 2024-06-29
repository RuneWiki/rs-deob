import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class461 {

    @OriginalMember(owner = "client!or", name = "a", descriptor = "Leh;")
    public static class246 field6444 = new class246(97, 7);

    @OriginalMember(owner = "client!or", name = "d", descriptor = "Ldu;")
    public static class242 field6447 = new class242(8, 6);

    @OriginalMember(owner = "client!or", name = "b", descriptor = "I")
    public static int field6445;

    @OriginalMember(owner = "client!or", name = "c", descriptor = "I")
    public static int field6446;

    @OriginalMember(owner = "client!or", name = "e", descriptor = "I")
    public static int field6448;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V", line = 3)
    public static void method2686(int arg0) {
        field6447 = null;
        if (arg0 >= 7) {
            field6444 = null;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IIILjg;I)V", line = 26)
    public static final void method2687(int arg0, int arg1, int arg2, class228 arg3, int arg4) {
        field6445++;
        class98 var5 = arg3.method1406((byte) 120);
        int var6 = arg3.field3292 - arg3.field3328.field2552 & 0x3FFF;
        if (~arg0 == arg1) {
            if (var6 != 0 || arg3.field3287 > 25) {
                if (arg2 < 0 && var5.field1288 != -1) {
                    arg3.field3337 = var5.field1288;
                } else if (arg2 <= 0 || var5.field1295 == -1) {
                    arg3.field3337 = var5.field1293;
                } else {
                    arg3.field3337 = var5.field1295;
                }
                arg3.field3302 = false;
            } else if (!arg3.field3302 || !var5.method691(31933, arg3.field3337)) {
                arg3.field3337 = var5.method696(-4203);
                arg3.field3302 = arg3.field3337 != -1;
            }
        } else if (arg3.field3338 != -1 && var6 >= 10240 || var6 <= 2048) {
            int var7 = class146.field1940[arg4] - arg3.field3328.field2552 & 0x3FFF;
            if (arg0 == 2 && var5.field1326 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field1283 != -1) {
                    arg3.field3337 = var5.field1283;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field1296 != -1) {
                    arg3.field3337 = var5.field1296;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field1282 == -1) {
                    arg3.field3337 = var5.field1326;
                } else {
                    arg3.field3337 = var5.field1282;
                }
            } else if (arg0 == 0 && var5.field1299 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field1308 != -1) {
                    arg3.field3337 = var5.field1308;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field1297 != -1) {
                    arg3.field3337 = var5.field1297;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field1279 == -1) {
                    arg3.field3337 = var5.field1299;
                } else {
                    arg3.field3337 = var5.field1279;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field1309 != -1) {
                arg3.field3337 = var5.field1309;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field1307 != -1) {
                arg3.field3337 = var5.field1307;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field1294 == -1) {
                arg3.field3337 = var5.field1293;
            } else {
                arg3.field3337 = var5.field1294;
            }
            arg3.field3302 = false;
        } else if (var6 == 0 && arg3.field3287 <= 25) {
            arg3.field3302 = false;
            if (arg0 == 2 && var5.field1326 != -1) {
                arg3.field3337 = var5.field1326;
            } else if (arg0 == 0 && var5.field1299 != -1) {
                arg3.field3337 = var5.field1299;
            } else {
                arg3.field3337 = var5.field1293;
            }
        } else {
            if (arg0 == 2 && var5.field1326 != -1) {
                if (arg2 < 0 && var5.field1305 != -1) {
                    arg3.field3337 = var5.field1305;
                } else if (arg2 <= 0 || var5.field1301 == -1) {
                    arg3.field3337 = var5.field1326;
                } else {
                    arg3.field3337 = var5.field1301;
                }
            } else if (arg0 == 0 && var5.field1299 != -1) {
                if (arg2 < 0 && var5.field1318 != -1) {
                    arg3.field3337 = var5.field1318;
                } else if (arg2 <= 0 || var5.field1291 == -1) {
                    arg3.field3337 = var5.field1299;
                } else {
                    arg3.field3337 = var5.field1291;
                }
            } else if (arg2 < 0 && var5.field1313 != -1) {
                arg3.field3337 = var5.field1313;
            } else if (arg2 <= 0 || var5.field1328 == -1) {
                arg3.field3337 = var5.field1293;
            } else {
                arg3.field3337 = var5.field1328;
            }
            arg3.field3302 = false;
        }
    }
}
