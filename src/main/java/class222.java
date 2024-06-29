import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class222 extends class98 {

    @OriginalMember(owner = "client!br", name = "N", descriptor = "I")
    private int field3106 = 3216;

    @OriginalMember(owner = "client!br", name = "V", descriptor = "I")
    private int field3114 = 4096;

    @OriginalMember(owner = "client!br", name = "P", descriptor = "[I")
    private int[] field3108 = new int[3];

    @OriginalMember(owner = "client!br", name = "X", descriptor = "I")
    private int field3116 = 3216;

    @OriginalMember(owner = "client!br", name = "Q", descriptor = "I")
    public static int field3109 = -2;

    @OriginalMember(owner = "client!br", name = "Y", descriptor = "Z")
    public static boolean field3117 = true;

    @OriginalMember(owner = "client!br", name = "S", descriptor = "Llg;")
    public static class237 field3111 = new class237(64);

    @OriginalMember(owner = "client!br", name = "bb", descriptor = "Z")
    public static boolean field3120 = false;

    @OriginalMember(owner = "client!br", name = "cb", descriptor = "I")
    public static int field3121 = 0;

    @OriginalMember(owner = "client!br", name = "db", descriptor = "[I")
    public static int[] field3122 = new int[8];

    @OriginalMember(owner = "client!br", name = "R", descriptor = "F")
    public static float field3110;

    @OriginalMember(owner = "client!br", name = "L", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!br", name = "M", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!br", name = "O", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!br", name = "U", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!br", name = "W", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!br", name = "Z", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!br", name = "ab", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!br", name = "eb", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!br", name = "T", descriptor = "[I")
    public static int[] field3112;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(ILdg;I)V")
    public final void method81(int arg0, class236 arg1, int arg2) {
        if (arg2 != 0) {
            this.field3114 = 84;
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field3106 = arg1.method1617((byte) 48);
                }
            } else {
                this.field3116 = arg1.method1617((byte) 48);
            }
        } else {
            this.field3114 = arg1.method1617((byte) 48);
        }
        ++field3107;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IIBLjava/lang/String;I)V")
    public static final void method1487(int arg0, int arg1, byte arg2, String arg3, int arg4) {
        ++field3113;
        class184 var5 = class341.method2186(arg1, (byte) 21, arg4);
        if (var5 != null) {
            if (var5.field2589 != null) {
                class272 var6 = new class272();
                var6.field3848 = var5.field2589;
                var6.field3849 = arg0;
                var6.field3854 = arg3;
                var6.field3851 = var5;
                class201.method1332(var6);
            }
            boolean var7 = true;
            if (~var5.field2561 < -1) {
                var7 = class246.method1668(-118, var5);
            }
            if (var7) {
                if (client.method1121(var5).method1854(arg0 + -1, false)) {
                    if (arg0 == 1) {
                        class62.field718.method2143(9, -2);
                        ++class433.field6230;
                        class68.method383(arg4, arg1, var5.field2635, (byte) -2);
                    }
                    if (arg0 == 2) {
                        ++class403.field5787;
                        class62.field718.method2143(231, -2);
                        class68.method383(arg4, arg1, var5.field2635, (byte) -27);
                    }
                    if (~arg0 == -4) {
                        class62.field718.method2143(246, -2);
                        ++class452.field6468;
                        class68.method383(arg4, arg1, var5.field2635, (byte) -90);
                    }
                    if (arg0 == 4) {
                        class62.field718.method2143(5, -2);
                        ++class114.field1406;
                        class68.method383(arg4, arg1, var5.field2635, (byte) -30);
                    }
                    if (arg0 == 5) {
                        class62.field718.method2143(153, -2);
                        ++class369.field5217;
                        class68.method383(arg4, arg1, var5.field2635, (byte) 101);
                    }
                    if (arg0 == 6) {
                        class62.field718.method2143(144, -2);
                        ++class128.field1553;
                        class68.method383(arg4, arg1, var5.field2635, (byte) -81);
                    }
                    if (arg0 == 7) {
                        ++class345.field4878;
                        class62.field718.method2143(145, -2);
                        class68.method383(arg4, arg1, var5.field2635, (byte) -86);
                    }
                    if (arg2 <= 12) {
                        method1489(false);
                    }
                    if (~arg0 == -9) {
                        class62.field718.method2143(88, -2);
                        ++class29.field354;
                        class68.method383(arg4, arg1, var5.field2635, (byte) 119);
                    }
                    if (arg0 == 9) {
                        class62.field718.method2143(60, -2);
                        ++class54.field649;
                        class68.method383(arg4, arg1, var5.field2635, (byte) 109);
                    }
                    if (arg0 == 10) {
                        ++class97.field1155;
                        class62.field718.method2143(104, -2);
                        class68.method383(arg4, arg1, var5.field2635, (byte) -26);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(II)[I")
    public final int[] method83(int arg0, int arg1) {
        ++field3118;
        if (arg0 != 0) {
            field3110 = -0.22529231F;
        }
        int[] var3 = super.field1177.method820(arg1, true);
        if (super.field1177.field1610) {
            int var4 = class135.field1683 * this.field3114 >> 12;
            int[] var5 = this.method539(0, (byte) -63, arg1 - 1 & class225.field3153);
            int[] var6 = this.method539(0, (byte) -123, arg1);
            int[] var7 = this.method539(0, (byte) -87, arg1 + 1 & class225.field3153);
            for (int var8 = 0; ~class268.field3811 < ~var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[class210.field2995 & var8 + -1] - var6[var8 - -1 & class210.field2995]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                int var12 = var9 >> 4;
                if (var11 > 255) {
                    var11 = 255;
                }
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                int var13 = 255 & class89.field1083[var11 - -((var12 - -1) * var12 >> 1)];
                int var14 = var9 * var13 >> 8;
                int var15 = var10 * var13 >> 8;
                int var16 = var13 * 4096 >> 8;
                int var17 = this.field3108[2] * var16 >> 12;
                int var18 = this.field3108[0] * var15 >> 12;
                int var19 = this.field3108[1] * var14 >> 12;
                var3[var8] = var19 - -var17 + var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!br", name = "f", descriptor = "(B)V")
    private final void method1488(byte arg0) {
        ++field3115;
        double var2 = Math.cos((double) ((float) this.field3106 / 4096.0F));
        this.field3108[0] = (int) (var2 * Math.sin((double) ((float) this.field3116 / 4096.0F)) * 4096.0D);
        this.field3108[1] = (int) (var2 * Math.cos((double) ((float) this.field3116 / 4096.0F)) * 4096.0D);
        this.field3108[2] = (int) (4096.0D * Math.sin((double) ((float) this.field3106 / 4096.0F)));
        int var4 = this.field3108[0] * this.field3108[0] >> 12;
        int var5 = this.field3108[1] * this.field3108[1] >> 12;
        if (arg0 > -111) {
            field3122 = null;
        }
        int var6 = this.field3108[2] * this.field3108[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 + var5 - -var6 >> 12)) * 4096.0D);
        if (~var7 != -1) {
            this.field3108[0] = (this.field3108[0] << 12) / var7;
            this.field3108[1] = (this.field3108[1] << 12) / var7;
            this.field3108[2] = (this.field3108[2] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(Z)V")
    public static void method1489(boolean arg0) {
        field3111 = null;
        field3112 = null;
        if (!arg0) {
            method1489(false);
        }
        field3122 = null;
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "()V")
    public class222() {
        super(1, true);
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(BI)V")
    public static final void method1490(byte arg0, int arg1) {
        ++field3104;
        class20 var2 = class369.method2351((byte) 89, 14, arg1);
        var2.method148(-11806);
        if (arg0 > -32) {
            method1491(-12);
        }
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(I)V")
    public final void method188(int arg0) {
        ++field3105;
        if (arg0 == 1) {
            this.method1488((byte) -113);
        }
    }

    @OriginalMember(owner = "client!br", name = "e", descriptor = "(I)V")
    public static final void method1491(int arg0) {
        ++field3119;
        if (class433.field6233) {
            if (arg0 != 1) {
                method1491(-92);
            }
            class254.field3668 = null;
            class433.field6233 = false;
            class389.field5503 = null;
        }
    }
}
