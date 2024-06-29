import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class155 {

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public int field2357 = -1;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
    private int field2363 = 0;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "Z")
    public boolean field2361 = true;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "Z")
    public boolean field2367 = true;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
    public int field2371 = 512;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    public static int field2365 = 0;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "Lqda;")
    public static class105 field2358 = new class105(1);

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public int field2360;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
    public int field2364;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "I")
    public int field2369;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "I")
    public int field2373;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZI)Z", line = 3)
    public static final boolean method1122(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field2365 = -59;
        }
        field2376++;
        return (arg0 & 0x40000) != 0 | class378.method2239(arg0, 0, arg2) || class439.method2531(arg0, 104, arg2);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)V", line = 16)
    private final void method1123(int arg0, byte arg1) {
        field2372++;
        double var3 = (double) ((arg0 & 0xFFDA77) >> 16) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = var3;
        if (var5 > var3) {
            var11 = var5;
        }
        if (var11 < var7) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
        }
        double var19 = var13 / 6.0D;
        this.field2360 = (int) (var15 * 256.0D);
        this.field2373 = (int) (var17 * 256.0D);
        int var21 = 47 % ((13 - arg1) / 42);
        if ((var17 > 0.5D)) {
            this.field2369 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field2369 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field2360 < 0) {
            this.field2360 = 0;
        } else if (this.field2360 > 255) {
            this.field2360 = 255;
        }
        if (this.field2373 < 0) {
            this.field2373 = 0;
        } else if (this.field2373 > 255) {
            this.field2373 = 255;
        }
        if (this.field2369 < 1) {
            this.field2369 = 1;
        }
        this.field2364 = (int) ((double) this.field2369 * var19);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lee;I)V", line = 111)
    public final void method1124(class677 arg0, int arg1) {
        field2370++;
        if (arg1 >= -98) {
            return;
        }
        while (true) {
            int var3 = arg0.method3821((byte) -45);
            if (var3 == 0) {
                return;
            }
            this.method1130(var3, arg0, -2);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V", line = 132)
    public static void method1125(int arg0) {
        field2358 = null;
        if (arg0 != -1) {
            field2358 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILjava/lang/String;I)I", line = 142)
    public static final int method1126(int arg0, String arg1, int arg2) {
        if (arg0 < 86) {
            field2358 = null;
        }
        field2368++;
        return class565.method3124(arg2, true, 25744, arg1);
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)Z", line = 163)
    public static final boolean method1127(int arg0) {
        if (arg0 != 1) {
            field2365 = 69;
        }
        field2374++;
        if (class358.field4998) {
            try {
                if ((Boolean) class124.method987("showingVideoAd", -8364, class514.field6818)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lvfa;III)V", line = 187)
    public static final void method1128(class672 arg0, int arg1, int arg2, int arg3) {
        field2359++;
        if (arg3 > -81) {
            method1127(45);
        }
        if (class137.field2182 != null || class403.field5625 || arg0 == null || class277.method1667((byte) 48, arg0) == null) {
            return;
        }
        class137.field2182 = arg0;
        class758.field10549 = class277.method1667((byte) 48, arg0);
        class228.field3253 = arg1;
        class587.field7672 = 0;
        class442.field6096 = false;
        class568.field7466 = arg2;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)Luk;", line = 212)
    public static final class263 method1129(int arg0, int arg1) {
        field2375++;
        class263[] var2 = class608.method3317(-126);
        for (int var3 = arg0; var3 < var2.length; var3++) {
            class263 var4 = var2[var3];
            if (var4.field3673 == arg1) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILee;I)V", line = 252)
    private final void method1130(int arg0, class677 arg1, int arg2) {
        field2366++;
        if (~arg0 == arg2) {
            this.field2363 = arg1.method3833(255);
            this.method1123(this.field2363, (byte) 92);
        } else if (arg0 == 2) {
            this.field2357 = arg1.method3807(-1);
            if (this.field2357 == 65535) {
                this.field2357 = -1;
            }
        } else if (arg0 == 3) {
            this.field2371 = arg1.method3807(arg2 ^ 0x1) << 2;
        } else if (arg0 == 4) {
            this.field2367 = false;
        } else if (arg0 == 5) {
            this.field2361 = false;
            return;
        }
    }
}
