import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class131 extends class75 {

    @OriginalMember(owner = "client!sf", name = "K", descriptor = "Z")
    public boolean field2981 = true;

    @OriginalMember(owner = "client!sf", name = "S", descriptor = "I")
    public int field2988 = -1;

    @OriginalMember(owner = "client!sf", name = "J", descriptor = "I")
    public int field2980 = 0;

    @OriginalMember(owner = "client!sf", name = "L", descriptor = "I")
    public int field2982 = -1;

    @OriginalMember(owner = "client!sf", name = "F", descriptor = "Lod;")
    public static class101 field2976 = class46.method335(-59, ")1j");

    @OriginalMember(owner = "client!sf", name = "G", descriptor = "[I")
    public static int[] field2977 = new int[256];

    @OriginalMember(owner = "client!sf", name = "U", descriptor = "[I")
    public static int[] field2990 = new int[100];

    @OriginalMember(owner = "client!sf", name = "V", descriptor = "[J")
    public static long[] field2991 = new long[32];

    @OriginalMember(owner = "client!sf", name = "db", descriptor = "Lod;")
    public static class101 field2999 = class46.method335(-62, "mapmarker");

    @OriginalMember(owner = "client!sf", name = "hb", descriptor = "I")
    public static int field3003 = 0;

    @OriginalMember(owner = "client!sf", name = "H", descriptor = "I")
    public int field2978;

    @OriginalMember(owner = "client!sf", name = "I", descriptor = "I")
    public int field2979;

    @OriginalMember(owner = "client!sf", name = "N", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!sf", name = "O", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!sf", name = "Q", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!sf", name = "T", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!sf", name = "W", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!sf", name = "X", descriptor = "I")
    public int field2993;

    @OriginalMember(owner = "client!sf", name = "Y", descriptor = "I")
    public int field2994;

    @OriginalMember(owner = "client!sf", name = "Z", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!sf", name = "bb", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!sf", name = "cb", descriptor = "I")
    public int field2998;

    @OriginalMember(owner = "client!sf", name = "eb", descriptor = "I")
    public int field3000;

    @OriginalMember(owner = "client!sf", name = "fb", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!sf", name = "gb", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!sf", name = "M", descriptor = "Lt;")
    public static class132 field2983;

    @OriginalMember(owner = "client!sf", name = "P", descriptor = "[Lqe;")
    public static class116[] field2986;

    @OriginalMember(owner = "client!sf", name = "ab", descriptor = "[Lqe;")
    public static class116[] field2996;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IZ)V")
    private final void method1006(int arg0, boolean arg1) {
        field2985++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        if (arg1) {
            return;
        }
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = var3;
        if (var3 > var5) {
            var7 = var5;
        }
        double var9 = (double) (arg0 & 0xFF) / 256.0D;
        if (var9 < var7) {
            var7 = var9;
        }
        double var11 = var3;
        double var13 = 0.0D;
        if (var5 > var3) {
            var11 = var5;
        }
        if (var11 < var9) {
            var11 = var9;
        }
        double var15 = 0.0D;
        double var17 = (var7 + var11) / 2.0D;
        this.field2993 = (int) (var17 * 256.0D);
        if (this.field2993 < 0) {
            this.field2993 = 0;
        } else if (this.field2993 > 255) {
            this.field2993 = 255;
        }
        if (var7 != var11) {
            if (var3 == var11) {
                var13 = (var5 - var9) / (var11 - var7);
            } else if (var5 == var11) {
                var13 = (var9 - var3) / (-var7 + var11) + 2.0D;
            } else if (var9 == var11) {
                var13 = (var3 - var5) / (var11 - var7) + 4.0D;
            }
            if (var17 < 0.5D) {
                var15 = (var11 - var7) / (var7 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var7) / (2.0D - var11 - var7);
            }
        }
        double var19 = var13 / 6.0D;
        this.field2979 = (int) (var19 * 256.0D);
        this.field2978 = (int) (var15 * 256.0D);
        if (this.field2978 < 0) {
            this.field2978 = 0;
        } else if (this.field2978 > 255) {
            this.field2978 = 255;
            return;
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)V")
    public static final void method1007(byte arg0) {
        class56.field1261.method135(0);
        field3002++;
        class133.field3038.method135(0);
        int var1 = 123 / ((arg0 - 32) / 63);
        class126.field2873.method135(0);
        class99.field2144.method135(0);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILtf;I)V")
    private final void method1008(int arg0, int arg1, class138 arg2, int arg3) {
        field3001++;
        if (arg1 != 8) {
            this.method1008(62, -77, null, 87);
        }
        if (arg0 == 1) {
            this.field2980 = arg2.method1088(arg1 + 247);
        } else if (arg0 == 2) {
            this.field2982 = arg2.method1055(arg1 ^ 0x78);
        } else if (arg0 == 5) {
            this.field2981 = false;
        } else if (arg0 == 7) {
            this.field2988 = arg2.method1088(255);
            return;
        }
    }

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "(I)V")
    public static void method1009(int arg0) {
        field2986 = null;
        if (arg0 != 3547) {
            field2976 = null;
        }
        field2990 = null;
        field2976 = null;
        field2977 = null;
        field2996 = null;
        field2983 = null;
        field2999 = null;
        field2991 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)V")
    public final void method1010(boolean arg0) {
        if (!arg0) {
            this.field3000 = 89;
        }
        if (this.field2988 != -1) {
            this.method1006(this.field2988, !arg0);
            this.field2998 = this.field2979;
            this.field3000 = this.field2993;
            this.field2994 = this.field2978;
        }
        field2997++;
        this.method1006(this.field2980, false);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIB)V")
    public static final void method1011(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field2992++;
        for (int var5 = arg1; var5 <= arg0 + arg1; var5++) {
            for (int var6 = arg2; var6 <= arg2 + arg3; var6++) {
                if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
                    class83.field1807[0][var6][var5] = 127;
                    if (arg2 == var6 && var6 > 0) {
                        class20.field431[0][var6][var5] = class20.field431[0][var6 - 1][var5];
                    }
                    if (arg2 + arg3 == var6 && var6 < 103) {
                        class20.field431[0][var6][var5] = class20.field431[0][var6 + 1][var5];
                    }
                    if (arg1 == var5 && var5 > 0) {
                        class20.field431[0][var6][var5] = class20.field431[0][var6][var5 - 1];
                    }
                    if (arg1 + arg0 == var5 && var5 < 103) {
                        class20.field431[0][var6][var5] = class20.field431[0][var6][var5 + 1];
                    }
                }
            }
        }
        if (arg4 < 84) {
            field2976 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILhc;)V")
    public static final void method1012(int arg0, class52 arg1) {
        class6.field95 = arg1;
        field2984++;
        if (arg0 >= -109) {
            field2977 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILtf;)V")
    public final void method1013(int arg0, int arg1, class138 arg2) {
        if (arg0 != -1) {
            this.method1008(-1, 2, null, 9);
        }
        field2995++;
        while (true) {
            int var4 = arg2.method1055(118);
            if (var4 == 0) {
                return;
            }
            this.method1008(var4, 8, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZILc;ILc;)Lv;")
    public static final class146 method1014(boolean arg0, int arg1, class15 arg2, int arg3, class15 arg4) {
        field2987++;
        boolean var5 = true;
        int[] var6 = arg2.method113(arg3, arg1);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg2.method123(arg3, (byte) -23, var6[var7]);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg0) {
                    var10 = arg4.method123(0, (byte) -53, var9);
                } else {
                    var10 = arg4.method123(var9, (byte) -56, 0);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class146(arg2, arg4, arg3, arg0);
        } catch (Exception var11) {
            return null;
        }
    }
}
