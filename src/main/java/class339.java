import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class339 {

    @OriginalMember(owner = "client!em", name = "j", descriptor = "[F")
    public float[] field5286 = new float[4];

    @OriginalMember(owner = "client!em", name = "s", descriptor = "Z")
    public boolean field5295 = false;

    @OriginalMember(owner = "client!em", name = "q", descriptor = "I")
    public int field5293;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "Z")
    public boolean field5280;

    @OriginalMember(owner = "client!em", name = "o", descriptor = "Z")
    public boolean field5291;

    @OriginalMember(owner = "client!em", name = "G", descriptor = "I")
    public int field5309;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "I")
    public int field5282;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "I")
    public int field5284;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "I")
    public int field5278;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "[S")
    public short[] field5281;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "I")
    public int field5283;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "I")
    public int field5285;

    @OriginalMember(owner = "client!em", name = "y", descriptor = "I")
    private int field5301;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "Ljava/lang/String;")
    public static String field5277 = null;

    @OriginalMember(owner = "client!em", name = "z", descriptor = "I")
    public static int field5302 = 0;

    @OriginalMember(owner = "client!em", name = "B", descriptor = "I")
    public static int field5304 = 0;

    @OriginalMember(owner = "client!em", name = "p", descriptor = "Ldj;")
    public static class143 field5292 = new class143(64);

    @OriginalMember(owner = "client!em", name = "u", descriptor = "F")
    public float field5297;

    @OriginalMember(owner = "client!em", name = "D", descriptor = "F")
    public float field5306;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!em", name = "k", descriptor = "I")
    private int field5287;

    @OriginalMember(owner = "client!em", name = "l", descriptor = "I")
    public static int field5288;

    @OriginalMember(owner = "client!em", name = "r", descriptor = "I")
    public static int field5294;

    @OriginalMember(owner = "client!em", name = "t", descriptor = "I")
    private int field5296;

    @OriginalMember(owner = "client!em", name = "v", descriptor = "I")
    private int field5298;

    @OriginalMember(owner = "client!em", name = "w", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!em", name = "x", descriptor = "I")
    private int field5300;

    @OriginalMember(owner = "client!em", name = "C", descriptor = "I")
    public static int field5305;

    @OriginalMember(owner = "client!em", name = "E", descriptor = "I")
    public static int field5307;

    @OriginalMember(owner = "client!em", name = "F", descriptor = "I")
    public static int field5308;

    @OriginalMember(owner = "client!em", name = "H", descriptor = "I")
    public static int field5310;

    @OriginalMember(owner = "client!em", name = "m", descriptor = "Lpi;")
    public class63 field5289;

    @OriginalMember(owner = "client!em", name = "n", descriptor = "Leo;")
    public static class71 field5290;

    @OriginalMember(owner = "client!em", name = "A", descriptor = "[I")
    public static int[] field5303;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIII)V", line = 6)
    public final void method2356(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5287 = arg3;
        this.field5296 = arg4;
        this.field5298 = arg2;
        if (arg1 == 1056) {
            field5299++;
            this.field5300 = arg0;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V", line = 22)
    private final void method2357(int arg0) {
        if (arg0 > -13) {
            this.field5289 = (class63) null;
        }
        int var2 = this.field5285;
        if (var2 == 2) {
            this.field5287 = 1;
            this.field5298 = 0;
            this.field5300 = 2048;
            this.field5296 = 2048;
        } else if (var2 == 3) {
            this.field5287 = 1;
            this.field5300 = 2048;
            this.field5298 = 0;
            this.field5296 = 4096;
        } else if (var2 == 4) {
            this.field5300 = 2048;
            this.field5298 = 0;
            this.field5287 = 4;
            this.field5296 = 2048;
        } else if (var2 == 5) {
            this.field5287 = 4;
            this.field5296 = 8192;
            this.field5298 = 0;
            this.field5300 = 2048;
        } else if (var2 == 12) {
            this.field5300 = 2048;
            this.field5298 = 0;
            this.field5296 = 2048;
            this.field5287 = 2;
        } else if (var2 == 13) {
            this.field5287 = 2;
            this.field5300 = 2048;
            this.field5298 = 0;
            this.field5296 = 8192;
        } else if (var2 == 10) {
            this.field5298 = 1536;
            this.field5296 = 2048;
            this.field5300 = 512;
            this.field5287 = 3;
        } else if (var2 == 11) {
            this.field5298 = 1536;
            this.field5296 = 4096;
            this.field5287 = 3;
            this.field5300 = 512;
        } else if (var2 == 6) {
            this.field5298 = 1280;
            this.field5300 = 768;
            this.field5296 = 2048;
            this.field5287 = 3;
        } else if (var2 == 7) {
            this.field5296 = 4096;
            this.field5298 = 1280;
            this.field5287 = 3;
            this.field5300 = 768;
        } else if (var2 == 8) {
            this.field5298 = 1024;
            this.field5287 = 3;
            this.field5300 = 1024;
            this.field5296 = 2048;
        } else if (var2 == 9) {
            this.field5287 = 3;
            this.field5300 = 1024;
            this.field5298 = 1024;
            this.field5296 = 4096;
        } else if (var2 == 14) {
            this.field5298 = 1280;
            this.field5287 = 1;
            this.field5300 = 768;
            this.field5296 = 2048;
        } else if (var2 == 15) {
            this.field5298 = 1536;
            this.field5300 = 512;
            this.field5287 = 1;
            this.field5296 = 4096;
        } else if (var2 == 16) {
            this.field5298 = 1792;
            this.field5296 = 8192;
            this.field5300 = 256;
            this.field5287 = 1;
        } else {
            this.field5300 = 2048;
            this.field5298 = 0;
            this.field5296 = 2048;
            this.field5287 = 0;
        }
        field5308++;
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(I)V", line = 237)
    private final void method2358(int arg0) {
        if (arg0 <= -68) {
            field5294++;
            int var2 = (this.field5278 << 7) + 64;
            this.field5297 = 1.0F / (float) (var2 * var2);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ZZI)V", line = 252)
    public final void method2359(boolean arg0, boolean arg1, int arg2) {
        if (!arg1) {
            return;
        }
        field5305++;
        int var4 = this.field5301 + (this.field5296 * arg2 / 50) & 0x7FF;
        int var5 = this.field5287;
        int var6;
        if (var5 == 1) {
            var6 = (class350.field5476[var4] >> 6) + 1024;
        } else if (var5 == 3) {
            var6 = class227.field3261[var4] >> 1;
        } else if (var5 == 4) {
            var6 = var4 >> 10 << 11;
        } else if (var5 == 2) {
            var6 = var4;
        } else if (var5 == 5) {
            var6 = (var4 < 1024 ? var4 : 2048 - var4) << 1;
        } else {
            var6 = 2048;
        }
        if (arg0) {
            var6 = 2048;
        }
        this.field5306 = (float) ((this.field5300 * var6 >> 11) + this.field5298) / 2048.0F;
        float var7 = this.field5306 / 255.0F;
        this.field5286[2] = var7 * (float) class335.method2339(255, this.field5283);
        this.field5286[0] = (float) class335.method2339(255, this.field5283 >> 16) * var7;
        this.field5286[1] = (float) (class335.method2339(65354, this.field5283) >> 8) * var7;
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "()V", line = 423)
    protected class339() {
        if (class227.field3261 == null) {
            class172.method1267(1);
        }
        this.method2357(-40);
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lfd;)V", line = 434)
    public class339(class299 arg0) {
        if (class227.field3261 == null) {
            class172.method1267(1);
        }
        this.field5293 = arg0.method2096((byte) -122);
        this.field5280 = (this.field5293 & 0x10) != 0;
        this.field5291 = (this.field5293 & 0x8) != 0;
        this.field5293 &= 0x7;
        this.field5309 = arg0.method2083((byte) -29);
        this.field5282 = arg0.method2083((byte) -41);
        this.field5284 = arg0.method2083((byte) -72);
        this.field5278 = arg0.method2096((byte) -122);
        this.method2358(-96);
        this.field5281 = new short[this.field5278 * 2 + 1];
        for (int var2 = 0; var2 < this.field5281.length; var2++) {
            this.field5281[var2] = (short) arg0.method2083((byte) -124);
        }
        this.field5283 = class350.field5463[arg0.method2083((byte) -124)];
        int var3 = arg0.method2096((byte) -122);
        this.field5285 = var3 & 0x1F;
        this.field5301 = var3 & 0xE0 << 3;
        if (this.field5285 != 31) {
            this.method2357(-47);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ZLjava/lang/String;)Z", line = 351)
    public static final boolean method2360(boolean arg0, String arg1) {
        field5307++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class116.field1511; var2++) {
            if (arg1.equalsIgnoreCase(class109.field1422[var2])) {
                return true;
            }
        }
        if (arg0) {
            field5277 = (String) null;
        }
        return false;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(B)V", line = 380)
    public static void method2361(byte arg0) {
        field5277 = null;
        field5303 = null;
        if (arg0 <= -51) {
            field5292 = null;
            field5290 = null;
        }
    }

    @OriginalMember(owner = "client!em", name = "c", descriptor = "(I)Z", line = 400)
    public static final boolean method2362(int arg0) {
        if (arg0 != 4096) {
            return true;
        }
        field5279++;
        if (class49.field658) {
            try {
                return !(Boolean) class200.method1469(class157.field2216.field883, -18278, "showingVideoAd");
            } catch (Throwable var2) {
            }
        }
        return true;
    }
}
