import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public abstract class class72 {

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public int field1267;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public int field1269;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public int field1264;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "Loh;")
    public static class258 field1273 = class153.method1046("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", 114);

    @OriginalMember(owner = "client!v", name = "n", descriptor = "Loh;")
    private static class258 field1277 = class153.method1046("Discard", 125);

    @OriginalMember(owner = "client!v", name = "k", descriptor = "Loh;")
    public static class258 field1274 = field1277;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "[I")
    public static int[] field1278;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IBILgb;)[Lvi;", line = 5)
    public static final class129[] method535(int arg0, byte arg1, int arg2, class213 arg3) {
        field1276++;
        if (class162.method1086(0, arg3, arg2, arg0)) {
            if (arg1 != -44) {
                method538((byte) 92);
            }
            return class147.method1014((byte) 116);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIJ)Z", line = 22)
    public static final boolean method536(int arg0, int arg1, int arg2, long arg3) {
        class228 var5 = class178.field3180[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field3923 != null && var5.field3923.field298 == arg3) {
            return true;
        } else if (var5.field3939 != null && var5.field3939.field4584 == arg3) {
            return true;
        } else if (var5.field3931 != null && var5.field3931.field4306 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field3950; var6++) {
                if (var5.field3932[var6].field3795 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IZII[[II)I", line = 53)
    public static final int method537(int arg0, boolean arg1, int arg2, int arg3, int[][] arg4, int arg5) {
        if (arg1) {
            return 36;
        } else {
            field1265++;
            int var6 = (128 - arg5) * arg4[arg0][arg3 + 1] + (arg4[arg0 + 1][arg3 + 1] * arg5) >> 7;
            int var7 = (128 - arg5) * arg4[arg0][arg3] + arg4[arg0 + 1][arg3] * arg5 >> 7;
            return (128 - arg2) * var7 + arg2 * var6 >> 7;
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(III)V", line = 77)
    public class72(int arg0, int arg1, int arg2) {
        this.field1267 = arg0;
        this.field1269 = arg1;
        this.field1264 = arg2;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V", line = 88)
    public static void method538(byte arg0) {
        if (arg0 != -10) {
            method541(-82, 62, 104, (byte) 25, 95, false);
        }
        field1273 = null;
        field1278 = null;
        field1274 = null;
        field1277 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(JZ)V", line = 115)
    public static final void method539(long arg0, boolean arg1) {
        field1271++;
        if (arg0 == 0L) {
            return;
        }
        class159.field2710.method885(202, -113);
        class190.field3356++;
        class159.field2710.method1603(arg0, -1649350304);
        if (arg1) {
            field1277 = (class258) null;
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(B)V", line = 134)
    public static final void method540(byte arg0) {
        field1266++;
        if (field1278 == null || class193.field3405 == null) {
            field1278 = new int[256];
            class193.field3405 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                field1278[var1] = (int) (Math.sin(var2) * 4096.0D);
                class193.field3405[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        int var4 = 26 % ((-arg0 - 60) / 63);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIBIZ)V", line = 165)
    public static final void method541(int arg0, int arg1, int arg2, byte arg3, int arg4, boolean arg5) {
        if (arg1 < 1) {
            arg1 = 1;
        }
        if (arg3 != -121) {
            method535(-108, (byte) -103, 11, (class213) null);
        }
        field1275++;
        if (arg4 < 1) {
            arg4 = 1;
        }
        if (class257.field4390) {
            int var6 = arg4 - 334;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 100) {
                var6 = 100;
            }
            int var7 = class259.field4517 + ((class204.field3532 - class259.field4517) * var6 / 100);
            if (class225.field3864 > var7) {
                var7 = class225.field3864;
            } else if (class6.field78 < var7) {
                var7 = class6.field78;
            }
            int var8 = var7 * 512 * arg4 / (arg1 * 334);
            if (class115.field2059 > var8) {
                short var9 = class115.field2059;
                var7 = arg1 * 334 * var9 / (arg4 * 512);
                if (var7 > class6.field78) {
                    var7 = class6.field78;
                    int var10 = var7 * 512 * arg4 / (var9 * 334);
                    int var11 = (arg1 - var10) / 2;
                    if (arg5) {
                        class296.method2088();
                        class296.method2096(arg2, arg0, var11, arg4, 0);
                        class296.method2096(arg2 + arg1 - var11, arg0, var11, arg4, 0);
                    }
                    arg2 += var11;
                    arg1 -= var11 * 2;
                }
            } else if (class180.field3222 < var8) {
                short var12 = class180.field3222;
                var7 = var12 * 334 * arg1 / (arg4 * 512);
                if (var7 < class225.field3864) {
                    var7 = class225.field3864;
                    int var13 = arg1 * var12 * 334 / (var7 * 512);
                    int var14 = (arg4 - var13) / 2;
                    if (arg5) {
                        class296.method2088();
                        class296.method2096(arg2, arg0, arg1, var14, 0);
                        class296.method2096(arg2, arg0 + arg4 - var14, arg1, var14, 0);
                    }
                    arg4 -= var14 * 2;
                    arg0 += var14;
                }
            }
            class272.field4713 = arg4 * var7 / 334;
        }
        class261.field4540 = (short) arg4;
        class127.field2257 = arg0;
        class86.field1468 = arg2;
        class113.field1954 = (short) arg1;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIB)V")
    public abstract void method492(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(III)V")
    public abstract void method495(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(III)V")
    public abstract void method494(int arg0, int arg1, int arg2);
}
