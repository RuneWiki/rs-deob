import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class144 {

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    private int field2274 = 0;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
    private int field2278 = -1;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "[I")
    public static int[] field2273 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "Z")
    public static boolean field2271 = false;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "[S")
    public static short[] field2277 = new short[256];

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    public int field2272;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
    public int field2279;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "I")
    public int field2284;

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "I")
    public int field2287;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "Z")
    public static boolean field2281;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
    public static final void method1005(int arg0) {
        class204.field3248.method1255(arg0 - 68);
        class94.field1522.method1255(-66);
        if (arg0 != 2) {
            method1010(-95);
        }
        field2280++;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IZ)V")
    private final void method1006(int arg0, boolean arg1) {
        field2276++;
        double var3 = (double) (arg0 & 0xFF) / 256.0D;
        double var5 = (double) ((arg0 & 0xFF02) >> 8) / 256.0D;
        double var7 = (double) ((arg0 & 0xFFC9FF) >> 16) / 256.0D;
        if (arg1) {
            this.field2284 = -86;
        }
        double var9 = var7;
        double var11 = var7;
        double var13 = 0.0D;
        if (var7 > var5) {
            var9 = var5;
        }
        double var15 = 0.0D;
        if (var3 < var9) {
            var9 = var3;
        }
        if (var5 > var7) {
            var11 = var5;
        }
        if (var3 > var11) {
            var11 = var3;
        }
        double var17 = (var9 + var11) / 2.0D;
        this.field2279 = (int) (var17 * 256.0D);
        if (this.field2279 < 0) {
            this.field2279 = 0;
        } else if (this.field2279 > 255) {
            this.field2279 = 255;
        }
        if (var9 != var11) {
            if (var7 == var11) {
                var13 = (var5 - var3) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var3 - var7) / (var11 - var9) + 2.0D;
            } else if (var3 == var11) {
                var13 = (var7 - var5) / (var11 - var9) + 4.0D;
            }
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        this.field2284 = (int) (var15 * 256.0D);
        if (var17 > 0.5D) {
            this.field2272 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field2272 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field2284 < 0) {
            this.field2284 = 0;
        } else if (this.field2284 > 255) {
            this.field2284 = 255;
        }
        double var19 = var13 / 6.0D;
        if (this.field2272 < 1) {
            this.field2272 = 1;
        }
        this.field2287 = (int) ((double) this.field2272 * var19);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IILwd;I)V")
    private final void method1007(int arg0, int arg1, class162 arg2, int arg3) {
        field2286++;
        if (arg0 == 1) {
            this.field2274 = arg2.method1137(arg3 + 30900);
            this.method1006(this.field2274, false);
        } else if (arg0 == 2) {
            this.field2278 = arg2.method1142(-18970);
            if (this.field2278 == 65535) {
                this.field2278 = -1;
            }
        } else if (arg0 == 3) {
            arg2.method1142(-18970);
        }
        if (arg3 != 255) {
            method1010(108);
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)V")
    public static final void method1008(int arg0) {
        if (arg0 != 2) {
            return;
        }
        field2282++;
        if (class267.field4299) {
            return;
        }
        class221.field3610 = true;
        if (field2281) {
            class90.field1456 = (float) ((int) class90.field1456 - 65 & 0xFFFFFF80);
        } else {
            class245.field3887 += (-24.0F - class245.field3887) / 2.0F;
        }
        class267.field4299 = true;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILwd;I)V")
    public final void method1009(int arg0, class162 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method1133((byte) 53);
            if (var4 == 0) {
                if (arg0 != -1) {
                    return;
                }
                field2285++;
                return;
            }
            this.method1007(var4, arg2, arg1, arg0 + 256);
        }
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(I)V")
    public static void method1010(int arg0) {
        if (arg0 == 4) {
            field2277 = null;
            field2273 = null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IB)I")
    public static final int method1011(int arg0, byte arg1) {
        if (arg1 < 101) {
            field2277 = null;
        }
        field2283++;
        return arg0 & 0xFF;
    }
}
