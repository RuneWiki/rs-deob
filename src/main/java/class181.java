import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class181 {

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "[Lmca;")
    private class29[] field3043 = null;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "Lqw;")
    public class69 field3039 = null;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "Lqw;")
    public class69 field3042 = null;

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "[Lmca;")
    public class29[] field3047 = null;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "Lrr;")
    private class332 field3037;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "Z")
    public boolean field3036;

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "Lhga;")
    public static class158 field3046 = new class158(8, 6);

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "Lrl;")
    public static class672 field3049 = new class672(43, 3);

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "J")
    public static long field3050 = -1L;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V", line = 3)
    public static final void method1476(int arg0) {
        field3041++;
        if (class444.field6749 != null) {
            return;
        }
        class444.field6749 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        int var3 = 0;
        if (arg0 < 14) {
            field3049 = null;
        }
        for (int var4 = 0; var4 < 512; var4++) {
            float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
            float var6 = (float) (var4 & 0x7) / 8.0F + 0.0625F;
            for (int var7 = 0; var7 < 128; var7++) {
                float var8 = (float) var7 / 128.0F;
                float var9 = 0.0F;
                float var10 = 0.0F;
                float var11 = 0.0F;
                float var12 = var5 / 60.0F;
                int var13 = (int) var12;
                int var14 = var13 % 6;
                float var15 = (float) (-var13) + var12;
                float var16 = (1.0F - var6) * var8;
                float var17 = (1.0F - (var6 * var15)) * var8;
                float var18 = (1.0F - ((1.0F - var15) * var6)) * var8;
                if (var14 == 0) {
                    var11 = var16;
                    var9 = var8;
                    var10 = var18;
                } else if (var14 == 1) {
                    var9 = var17;
                    var11 = var16;
                    var10 = var8;
                } else if (var14 == 2) {
                    var9 = var16;
                    var11 = var18;
                    var10 = var8;
                } else if (var14 == 3) {
                    var9 = var16;
                    var11 = var8;
                    var10 = var17;
                } else if (var14 == 4) {
                    var11 = var8;
                    var10 = var16;
                    var9 = var18;
                } else if (var14 == 5) {
                    var9 = var8;
                    var11 = var17;
                    var10 = var16;
                }
                float var19 = (float) Math.pow((double) var9, var1);
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                int var22 = (int) (var19 * 256.0F);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (var23 << 8) + ((var22 << 16) + var24 - 16777216);
                class444.field6749[var3++] = var25;
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)V", line = 126)
    public static void method1477(boolean arg0) {
        field3049 = null;
        field3046 = null;
        if (arg0) {
            field3050 = -16L;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lr;Z)V", line = 137)
    public static final void method1478(class167 arg0, boolean arg1) {
        field3048++;
        int var2 = class492.field7207;
        int var3 = class579.field8257;
        int var4 = class254.field4051;
        int var5 = class508.field7436;
        int var6 = -10660793;
        arg0.method1355(var3, var2, var5, var4, var6, 1);
        arg0.method1355(var3 + 1, var2 + 1, 16, var4 - 2, -16777216, 1);
        arg0.method1353(-16777216, var5 - 19, var4 + -2, var2 + 1, arg1, var3 + 18);
        class246.field3928.method2657(class122.field1996.method1091(class135.field2206, 1), -1, var2 + 3, var6, var3 + 14, (byte) -98);
        int var7 = class464.field6929.method451(1196);
        int var8 = class464.field6929.method454(-117);
        int var9 = 0;
        for (class295 var10 = (class295) class307.field4831.method3465((byte) -94); var10 != null; var10 = (class295) class307.field4831.method3469(0)) {
            int var11 = (class52.field693 - var9 - 1) * 16 + var3 + 31;
            short var12 = -1;
            if (var7 > var2 && var7 < var2 + var4 && var11 - 13 < var8 && var8 < (var11 + 3) && var10.field4630) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class147.method1238(12081, var10.field4631)) {
                var13 = class91.field1083.method2859((int) var10.field4627, (byte) 127).field1838;
            } else if (var10.field4632 != -1) {
                var13 = class91.field1083.method2859(var10.field4632, (byte) 124).field1838;
            } else if (class511.method3098(false, var10.field4631)) {
                class348 var16 = (class348) class592.field8395.method1558((long) ((int) var10.field4627), (byte) -93);
                if (var16 != null) {
                    class589 var17 = var16.field5577;
                    class705 var18 = var17.field8354;
                    if (var18.field9912 != null) {
                        var18 = var18.method3973(true, class539.field7869);
                    }
                    if (var18 != null) {
                        var13 = var18.field9941;
                    }
                }
            } else if (class705.method3978(32, var10.field4631)) {
                Object var14 = null;
                class698 var15;
                if (var10.field4631 == 1002) {
                    var15 = class213.field3537.method94((int) var10.field4627, (byte) -42);
                } else {
                    var15 = class213.field3537.method94((int) (var10.field4627 >>> 32 & 0x7FFFFFFFL), (byte) -42);
                }
                if (var15.field9826 != null) {
                    var15 = var15.method3934(class539.field7869, 119);
                }
                if (var15 != null) {
                    var13 = var15.field9782;
                }
            }
            String var19 = class183.method1486(var10, false);
            if (var13 != null) {
                var19 = var19 + class693.method3919(var13, (byte) -101);
            }
            class246.field3928.method2653(var19, var12, var11, class114.field1790, 0, var2 + 3, class379.field5914, -18622);
            var9++;
            if (var10.field4624) {
                class56.field733.method3960(class35.field508.method3672(var19, false) + var2 + 5, var11 + -12);
            }
        }
        class154.method1277(class579.field8257, class254.field4051, class508.field7436, 109, class492.field7207);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZI)I", line = 248)
    public static final int method1479(boolean arg0, int arg1) {
        field3038++;
        if (class345.field5562 == null) {
            return 0;
        } else if (arg0 || class106.field1728 == null) {
            int var2 = 0;
            for (int var3 = 0; var3 < class345.field5562.length; var3++) {
                int var4 = class345.field5562[var3];
                if (class290.field4593.method942(arg1 - 128, var4)) {
                    var2++;
                }
                if (class499.field7328.method942(arg1 ^ 0x80, var4)) {
                    var2++;
                }
            }
            if (arg1 != 128) {
                field3050 = -20L;
            }
            return var2;
        } else {
            return class345.field5562.length * 2;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)Z", line = 284)
    public final boolean method1480(byte arg0) {
        int var2 = 13 / ((45 - arg0) / 60);
        field3044++;
        if (this.field3036) {
            return this.field3042 != null;
        } else {
            return this.field3047 != null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lrr;)V", line = 399)
    public class181(class332 arg0) {
        this.field3037 = arg0;
        this.field3036 = this.field3037.field5416;
        if (this.field3036 && !this.field3037.method186(class135.field2205, class134.field2197, (byte) -18)) {
            this.field3036 = false;
        }
        if (this.field3036 || this.field3037.method164(class134.field2197, class135.field2205, 96)) {
            class424.method2691(-11418);
            if (this.field3036) {
                byte[] var6 = class642.method3721(false, -1, class124.field2053);
                this.field3042 = this.field3037.method118(-30146, class135.field2205, 128, var6, 16, 128);
                byte[] var7 = class642.method3721(false, -1, class442.field6730);
                this.field3037.method118(-30146, class135.field2205, 128, var7, 16, 128);
            } else {
                this.field3047 = new class29[16];
                for (int var2 = 0; var2 < 16; var2++) {
                    byte[] var5 = class532.method3217(class124.field2053, -117, 32768, var2 * 128 * 256);
                    this.field3047[var2] = this.field3037.method2241(var5, -127, true, class135.field2205, 128, 128);
                }
                this.field3043 = new class29[16];
                for (int var3 = 0; var3 < 16; var3++) {
                    byte[] var4 = class532.method3217(class442.field6730, 122, 32768, var3 * 256 * 128);
                    this.field3043[var3] = this.field3037.method2241(var4, -128, true, class135.field2205, 128, 128);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(B)Z", line = 324)
    public final boolean method1481(byte arg0) {
        if (arg0 <= 38) {
            return false;
        }
        if (this.field3039 == null) {
            if (class340.field5508 == null) {
                byte[] var2 = class680.method3878(new class206(419684), 128, 128, 16.0F, 4.0F, (byte) -11, 8, 0.5F, 0.6F, 4.0F, 16);
                class340.field5508 = class129.method1126(false, (byte) 122, var2);
            }
            byte[] var3 = class642.method3721(false, -1, class340.field5508);
            byte[] var4 = new byte[var3.length * 4];
            int var5 = 0;
            for (int var6 = 0; var6 < 16; var6++) {
                int var7 = var6 * 128 * 128;
                int var8 = var7;
                for (int var9 = 0; var9 < 128; var9++) {
                    int var10 = var8 + (var9 * 128);
                    int var11 = (var9 - 1 & 0x7F) * 128 + var8;
                    int var12 = (var9 + 1 & 0x7F) * 128 + var8;
                    for (int var13 = 0; var13 < 128; var13++) {
                        float var14 = (float) ((var3[var11 + var13] & 0xFF) - (var3[var12 + var13] & 0xFF));
                        float var15 = (float) ((var3[(var13 - 1 & 0x7F) + var10] & 0xFF) - (var3[var10 + (var13 + 1 & 0x7F)] & 0xFF));
                        float var16 = (float) (128.0D / Math.sqrt((double) (var14 * var14 + var15 * var15 + 16384.0F)));
                        var4[var5++] = (byte) ((int) (var15 * var16 + 127.0F));
                        var4[var5++] = (byte) ((int) (var16 * 128.0F + 127.0F));
                        var4[var5++] = (byte) ((int) (var14 * var16 + 127.0F));
                        var4[var5++] = var3[var7++];
                    }
                }
            }
            this.field3039 = this.field3037.method118(-30146, class86.field1055, 128, var4, 16, 128);
        }
        field3040++;
        return this.field3039 != null;
    }
}
