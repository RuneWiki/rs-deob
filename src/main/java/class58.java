import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class58 extends class4 {

    @OriginalMember(owner = "client!ib", name = "kb", descriptor = "I")
    public int field1290 = 0;

    @OriginalMember(owner = "client!ib", name = "gb", descriptor = "I")
    public int field1286 = -1;

    @OriginalMember(owner = "client!ib", name = "X", descriptor = "Z")
    public boolean field1277 = true;

    @OriginalMember(owner = "client!ib", name = "wb", descriptor = "I")
    public int field1302 = -1;

    @OriginalMember(owner = "client!ib", name = "eb", descriptor = "Loa;")
    private static class98 field1284 = class38.method349(255, "Enter object name");

    @OriginalMember(owner = "client!ib", name = "ib", descriptor = "Loa;")
    public static class98 field1288 = class38.method349(255, "@yel@");

    @OriginalMember(owner = "client!ib", name = "nb", descriptor = "Loa;")
    public static class98 field1293 = field1284;

    @OriginalMember(owner = "client!ib", name = "vb", descriptor = "I")
    public static int field1301 = 0;

    @OriginalMember(owner = "client!ib", name = "qb", descriptor = "Loa;")
    public static class98 field1296 = class38.method349(255, "@gre@");

    @OriginalMember(owner = "client!ib", name = "Y", descriptor = "I")
    public static int field1278 = 0;

    @OriginalMember(owner = "client!ib", name = "ub", descriptor = "Loa;")
    private static class98 field1300 = class38.method349(255, "Bad session id)3");

    @OriginalMember(owner = "client!ib", name = "yb", descriptor = "Z")
    public static boolean field1304 = false;

    @OriginalMember(owner = "client!ib", name = "sb", descriptor = "Loa;")
    public static class98 field1298 = field1300;

    @OriginalMember(owner = "client!ib", name = "Z", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!ib", name = "bb", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!ib", name = "cb", descriptor = "I")
    public int field1282;

    @OriginalMember(owner = "client!ib", name = "db", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!ib", name = "fb", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!ib", name = "hb", descriptor = "I")
    public int field1287;

    @OriginalMember(owner = "client!ib", name = "jb", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!ib", name = "mb", descriptor = "I")
    public int field1292;

    @OriginalMember(owner = "client!ib", name = "ob", descriptor = "I")
    public int field1294;

    @OriginalMember(owner = "client!ib", name = "pb", descriptor = "I")
    public int field1295;

    @OriginalMember(owner = "client!ib", name = "tb", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!ib", name = "zb", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!ib", name = "Ab", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!ib", name = "Bb", descriptor = "I")
    public int field1307;

    @OriginalMember(owner = "client!ib", name = "rb", descriptor = "Ltb;")
    public static class130 field1297;

    @OriginalMember(owner = "client!ib", name = "xb", descriptor = "Lmd;")
    public static class87 field1303;

    @OriginalMember(owner = "client!ib", name = "ab", descriptor = "[I")
    public static int[] field1280;

    @OriginalMember(owner = "client!ib", name = "lb", descriptor = "[I")
    public static int[] field1291;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIII)I")
    public static final int method464(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1285++;
        int var7 = arg4 & 0x3;
        if ((arg2 & 0x1) == 1) {
            int var8 = arg6;
            arg6 = arg3;
            arg3 = var8;
        }
        if (arg1 == var7) {
            return arg0;
        } else if (var7 == 1) {
            return 7 + 1 - arg5 - arg6;
        } else if (var7 == 2) {
            return 1 + 7 - arg3 - arg0;
        } else {
            return arg5;
        }
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)V")
    public static void method465(int arg0) {
        field1291 = null;
        field1293 = null;
        field1297 = null;
        field1284 = null;
        field1298 = null;
        field1288 = null;
        field1280 = null;
        field1300 = null;
        if (arg0 != 1184) {
            field1288 = null;
        }
        field1303 = null;
        field1296 = null;
    }

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "(B)V")
    public final void method466(byte arg0) {
        field1279++;
        if (this.field1286 != -1) {
            this.method471(this.field1286, (byte) 120);
            this.field1292 = this.field1282;
            this.field1307 = this.field1287;
            this.field1295 = this.field1294;
        }
        this.method471(this.field1290, (byte) 121);
        if (arg0 != -117) {
            this.method467(117, -91, 9, null);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIILb;)V")
    private final void method467(int arg0, int arg1, int arg2, class8 arg3) {
        if (arg0 == 1) {
            this.field1290 = arg3.method56(-19856);
        } else if (arg0 == 2) {
            this.field1302 = arg3.method62((byte) 120);
        } else if (arg0 == 5) {
            this.field1277 = false;
        } else if (arg0 == 7) {
            this.field1286 = arg3.method56(-19856);
        }
        if (arg1 != -8) {
            this.method469((byte) 35, 6, null);
        }
        field1283++;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BLtd;)Ltd;")
    public static final class132 method468(byte arg0, class132 arg1) {
        if (arg0 >= -84) {
            method464(-114, -29, 2, 120, -72, -36, 35);
        }
        class132 var2 = client.method209((byte) -90, arg1);
        if (var2 == null) {
            var2 = arg1.field3217;
        }
        field1306++;
        return var2;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BILb;)V")
    public final void method469(byte arg0, int arg1, class8 arg2) {
        field1281++;
        if (arg0 <= 83) {
            return;
        }
        while (true) {
            int var4 = arg2.method62((byte) 102);
            if (var4 == 0) {
                return;
            }
            this.method467(var4, -8, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIBI)V")
    public static final void method470(int arg0, int arg1, byte arg2, int arg3) {
        if (arg3 == 1) {
            class30.field699++;
            class132.field3116.method177(6624, 121);
            class132.field3116.method72((byte) 103, arg0);
            class132.field3116.method81((byte) 26, arg1);
        }
        if (arg3 == 2) {
            class88.field2016++;
            class132.field3116.method177(6624, 144);
            class132.field3116.method72((byte) -101, arg0);
            class132.field3116.method81((byte) 111, arg1);
        }
        if (arg3 == 3) {
            class75.field1626++;
            class132.field3116.method177(6624, 217);
            class132.field3116.method72((byte) 107, arg0);
            class132.field3116.method81((byte) 66, arg1);
        }
        int var4 = -116 / ((arg2 - 21) / 40);
        if (arg3 == 4) {
            class15.field314++;
            class132.field3116.method177(6624, 77);
            class132.field3116.method72((byte) -123, arg0);
            class132.field3116.method81((byte) -106, arg1);
        }
        field1289++;
        if (arg3 == 5) {
            class115.field2587++;
            class132.field3116.method177(6624, 193);
            class132.field3116.method72((byte) -71, arg0);
            class132.field3116.method81((byte) -125, arg1);
        }
        if (arg3 == 6) {
            class132.field3116.method177(6624, 176);
            class132.field3116.method72((byte) -47, arg0);
            class132.field3116.method81((byte) 73, arg1);
            class134.field3286++;
        }
        if (arg3 == 7) {
            class132.field3116.method177(6624, 247);
            class125.field2787++;
            class132.field3116.method72((byte) -105, arg0);
            class132.field3116.method81((byte) 45, arg1);
        }
        if (arg3 == 8) {
            class16.field326++;
            class132.field3116.method177(6624, 234);
            class132.field3116.method72((byte) 84, arg0);
            class132.field3116.method81((byte) -80, arg1);
        }
        if (arg3 == 9) {
            class127.field2865++;
            class132.field3116.method177(6624, 128);
            class132.field3116.method72((byte) -91, arg0);
            class132.field3116.method81((byte) -116, arg1);
        }
        if (arg3 == 10) {
            class63.field1349++;
            class132.field3116.method177(6624, 175);
            class132.field3116.method72((byte) 121, arg0);
            class132.field3116.method81((byte) -79, arg1);
        }
        class132 var5 = class49.method416(true, arg0, arg1);
        if (var5 != null && var5.field3194 != null) {
            class67.method555(var5, arg3, null, var5.field3194, -2401, 0, 0);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)V")
    private final void method471(int arg0, byte arg1) {
        field1299++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        double var11 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var5 > var3) {
            var11 = var5;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        if (var7 > var11) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        int var17 = 105 % ((75 - arg1) / 42);
        double var18 = (var9 + var11) / 2.0D;
        this.field1294 = (int) (var18 * 256.0D);
        if (this.field1294 < 0) {
            this.field1294 = 0;
        } else if (this.field1294 > 255) {
            this.field1294 = 255;
        }
        if (var9 != var11) {
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
            if (var18 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var18 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        this.field1287 = (int) (var15 * 256.0D);
        if (this.field1287 < 0) {
            this.field1287 = 0;
        } else if (this.field1287 > 255) {
            this.field1287 = 255;
        }
        double var20 = var13 / 6.0D;
        this.field1282 = (int) (var20 * 256.0D);
    }
}
