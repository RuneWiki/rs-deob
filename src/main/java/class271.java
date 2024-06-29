import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class271 extends class161 {

    @OriginalMember(owner = "client!wi", name = "t", descriptor = "I")
    public int field4350;

    @OriginalMember(owner = "client!wi", name = "u", descriptor = "I")
    public int field4351;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "[I")
    public static int[] field4342 = new int[128];

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "Ljava/lang/String;")
    public static String field4343 = "Loading world list data";

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "Ljava/lang/String;")
    public static String field4344 = "Loading defaults - ";

    @OriginalMember(owner = "client!wi", name = "r", descriptor = "[[[I")
    public static int[][][] field4348 = new int[2][][];

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "I")
    public static int field4346 = 0;

    @OriginalMember(owner = "client!wi", name = "s", descriptor = "F")
    public static float field4349;

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!wi", name = "v", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "Z")
    public static boolean field4345;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILjd;III)V")
    public static final void method1833(int arg0, class124 arg1, int arg2, int arg3, int arg4) {
        field4347++;
        int var5 = -59 / ((28 - arg0) / 55);
        class349 var6 = arg1.method912(-5);
        int var7 = arg1.field1830 - arg1.field1870.field2248 & 0x3FFF;
        if (arg4 == -1) {
            if (var7 != 0 || arg1.field1881 > 25) {
                arg1.field1831 = false;
                if (arg2 < 0 && var6.field5382 != -1) {
                    arg1.field1851 = var6.field5382;
                } else if (arg2 <= 0 || var6.field5360 == -1) {
                    arg1.field1851 = var6.field5411;
                } else {
                    arg1.field1851 = var6.field5360;
                }
            } else if (!arg1.field1831 || !var6.method2282(0, arg1.field1851)) {
                arg1.field1851 = var6.method2286(0);
                arg1.field1831 = arg1.field1851 != -1;
            }
        } else if (arg1.field1832 != -1 && var7 >= 10240 || var7 <= 2048) {
            int var8 = class397.field5937[arg3] - arg1.field1870.field2248 & 0x3FFF;
            arg1.field1831 = false;
            if (arg4 == 2 && var6.field5413 != -1) {
                if (var8 > 2048 && var8 <= 6144 && var6.field5379 != -1) {
                    arg1.field1851 = var6.field5379;
                } else if (var8 >= 10240 && var8 < 14336 && var6.field5391 != -1) {
                    arg1.field1851 = var6.field5391;
                } else if (var8 <= 6144 || var8 >= 10240 || var6.field5370 == -1) {
                    arg1.field1851 = var6.field5413;
                } else {
                    arg1.field1851 = var6.field5370;
                }
            } else if (arg4 == 0 && var6.field5406 != -1) {
                if (var8 > 2048 && var8 <= 6144 && var6.field5398 != -1) {
                    arg1.field1851 = var6.field5398;
                } else if (var8 >= 10240 && var8 < 14336 && var6.field5389 != -1) {
                    arg1.field1851 = var6.field5389;
                } else if (var8 <= 6144 || var8 >= 10240 || var6.field5362 == -1) {
                    arg1.field1851 = var6.field5406;
                } else {
                    arg1.field1851 = var6.field5362;
                }
            } else if (var8 > 2048 && var8 <= 6144 && var6.field5383 != -1) {
                arg1.field1851 = var6.field5383;
            } else if (var8 >= 10240 && var8 < 14336 && var6.field5376 != -1) {
                arg1.field1851 = var6.field5376;
            } else if (var8 <= 6144 || var8 >= 10240 || var6.field5394 == -1) {
                arg1.field1851 = var6.field5411;
            } else {
                arg1.field1851 = var6.field5394;
            }
        } else if (var7 == 0 && arg1.field1881 <= 25) {
            arg1.field1831 = false;
            if (arg4 == 2 && var6.field5413 != -1) {
                arg1.field1851 = var6.field5413;
            } else if (arg4 == 0 && var6.field5406 != -1) {
                arg1.field1851 = var6.field5406;
            } else {
                arg1.field1851 = var6.field5411;
            }
        } else {
            if (arg4 == 2 && var6.field5413 != -1) {
                if (arg2 < 0 && var6.field5402 != -1) {
                    arg1.field1851 = var6.field5402;
                } else if (arg2 <= 0 || var6.field5363 == -1) {
                    arg1.field1851 = var6.field5413;
                } else {
                    arg1.field1851 = var6.field5363;
                }
            } else if (arg4 == 0 && var6.field5406 != -1) {
                if (arg2 < 0 && var6.field5381 != -1) {
                    arg1.field1851 = var6.field5381;
                } else if (arg2 <= 0 || var6.field5374 == -1) {
                    arg1.field1851 = var6.field5406;
                } else {
                    arg1.field1851 = var6.field5374;
                }
            } else if (arg2 < 0 && var6.field5377 != -1) {
                arg1.field1851 = var6.field5377;
            } else if (arg2 <= 0 || var6.field5372 == -1) {
                arg1.field1851 = var6.field5411;
            } else {
                arg1.field1851 = var6.field5372;
            }
            arg1.field1831 = false;
        }
    }

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "(I)V")
    public static final void method1834(int arg0) {
        field4352++;
        class52 var1 = class270.field4326;
        synchronized (class270.field4326) {
            class270.field4326.method335((byte) -103);
        }
        class52 var2 = class130.field2044;
        synchronized (class130.field2044) {
            class130.field2044.method335((byte) 86);
            if (arg0 >= -78) {
                method1835(-9);
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "(I)V")
    public static void method1835(int arg0) {
        field4348 = null;
        field4342 = null;
        field4344 = null;
        if (arg0 == 0) {
            field4343 = null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(II)V")
    public class271(int arg0, int arg1) {
        this.field4350 = arg1;
        this.field4351 = arg0;
    }
}
