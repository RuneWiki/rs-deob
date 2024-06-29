import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class80 implements Runnable {

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "[Lig;")
    public volatile class9[] field1311 = new class9[2];

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "Z")
    public volatile boolean field1314 = false;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "Z")
    public volatile boolean field1312 = false;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "Lp;")
    private static class280 field1306 = class18.method140((byte) -117, "Continue");

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "Lp;")
    private static class280 field1309 = class18.method140((byte) -125, "Loaded config");

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "Lp;")
    public static class280 field1307 = field1309;

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "I")
    public static int field1316 = 0;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "Lp;")
    public static class280 field1308 = field1306;

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "Lbh;")
    public static class7 field1317 = new class7(0, 0);

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "Lp;")
    private static class280 field1318 = class18.method140((byte) -127, "Take");

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "Lp;")
    public static class280 field1319 = field1318;

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
    public static int field1320 = 0;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "Lug;")
    public class198 field1310;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "[[[B")
    public static byte[][][] field1313;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
    public static void method589(int arg0) {
        field1306 = null;
        if (arg0 != 128) {
            method589(-85);
        }
        field1308 = null;
        field1309 = null;
        field1318 = null;
        field1307 = null;
        field1319 = null;
        field1313 = null;
        field1317 = null;
    }

    @OriginalMember(owner = "client!oi", name = "run", descriptor = "()V")
    public final void run() {
        field1315++;
        this.field1312 = true;
        try {
            while (!this.field1314) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class9 var2 = this.field1311[var1];
                    if (var2 != null) {
                        var2.method94((byte) -120);
                    }
                }
                class159.method1130(10L, 0);
                class245.method1664((Object) null, this.field1310, 110);
            }
        } catch (Exception var9) {
            class207.method1398((String) null, -102, var9);
        } finally {
            Object var6 = null;
            this.field1312 = false;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIII)Z")
    public static final boolean method590(int arg0, int arg1, int arg2, int arg3) {
        if (!class89.method637(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class145.field2529[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class51.field841) {
                    if (!class269.method1804(var4, var6, var5)) {
                        return false;
                    }
                    if (!class269.method1804(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class269.method1804(var4, var7, var5)) {
                        return false;
                    }
                    if (!class269.method1804(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class269.method1804(var4, var8, var5)) {
                    return false;
                }
                if (!class269.method1804(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class108.field1786) {
                    if (!class269.method1804(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class269.method1804(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class269.method1804(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class269.method1804(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class269.method1804(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class269.method1804(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class51.field841) {
                    if (!class269.method1804(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class269.method1804(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class269.method1804(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class269.method1804(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class269.method1804(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class269.method1804(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class108.field1786) {
                    if (!class269.method1804(var4, var6, var5)) {
                        return false;
                    }
                    if (!class269.method1804(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class269.method1804(var4, var7, var5)) {
                        return false;
                    }
                    if (!class269.method1804(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class269.method1804(var4, var8, var5)) {
                    return false;
                }
                if (!class269.method1804(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class269.method1804(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class269.method1804(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class269.method1804(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class269.method1804(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class269.method1804(var4, var8, var5);
        } else {
            return true;
        }
    }
}
