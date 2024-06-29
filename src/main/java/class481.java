import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class481 extends class328 {

    @OriginalMember(owner = "client!gf", name = "F", descriptor = "Z")
    private boolean field6833 = true;

    @OriginalMember(owner = "client!gf", name = "J", descriptor = "I")
    private int field6837 = 4096;

    @OriginalMember(owner = "client!gf", name = "B", descriptor = "I")
    public static int field6829;

    @OriginalMember(owner = "client!gf", name = "C", descriptor = "I")
    public static int field6830;

    @OriginalMember(owner = "client!gf", name = "D", descriptor = "I")
    public static int field6831;

    @OriginalMember(owner = "client!gf", name = "E", descriptor = "I")
    public static int field6832;

    @OriginalMember(owner = "client!gf", name = "G", descriptor = "I")
    public static int field6834;

    @OriginalMember(owner = "client!gf", name = "H", descriptor = "I")
    public static int field6835;

    @OriginalMember(owner = "client!gf", name = "I", descriptor = "I")
    public static int field6836;

    @OriginalMember(owner = "client!gf", name = "K", descriptor = "I")
    public static int field6838;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BILco;)V", line = 5)
    public final void method1(byte arg0, int arg1, class268 arg2) {
        if (arg0 > 75) {
            if (~arg1 != -1) {
                if (arg1 == 1) {
                    this.field6833 = ~arg2.method1738(255) == -2;
                }
            } else {
                this.field6837 = arg2.method1745(32132);
            }
            ++field6832;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZBZII)I", line = 45)
    public static final int method2767(boolean arg0, byte arg1, boolean arg2, int arg3, int arg4) {
        ++field6834;
        class217 var5 = class132.method1024(arg4, 0, arg2);
        if (var5 == null) {
            return 0;
        } else {
            int var6 = 0;
            int var7 = -98 / ((arg1 - -20) / 46);
            for (int var8 = 0; var8 < var5.field3280.length; ++var8) {
                if (~var5.field3280[var8] <= -1 && var5.field3280[var8] < class611.field8684.field3736) {
                    class381 var9 = class611.field8684.method1621((byte) 88, var5.field3280[var8]);
                    int var10 = var9.method2310(arg3, class190.field2724.method1831(-55, arg3).field2710, 13);
                    if (!arg0) {
                        var6 += var10;
                    } else {
                        var6 += var5.field3277[var8] * var10;
                    }
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BI)V", line = 84)
    public static final void method2768(byte arg0, int arg1) {
        ++field6831;
        class21 var2 = class601.method3413(arg1, 9, (byte) 117);
        var2.method227(true);
        if (arg0 >= 93) {
            ;
        }
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V", line = 199)
    public class481() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(BI)Z", line = 103)
    public static final boolean method2769(byte arg0, int arg1) {
        ++field6829;
        if (arg0 >= -99) {
            method2768((byte) 27, 69);
        }
        return ~arg1 <= -13 && arg1 <= 17;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(II)[[I", line = 116)
    public final int[][] method7(int arg0, int arg1) {
        ++field6830;
        int var3 = -91 % ((arg1 - 46) / 54);
        int[][] var4 = super.field4725.method1886((byte) 76, arg0);
        if (super.field4725.field4371) {
            int[] var5 = this.method2042(0, arg0 + -1 & class589.field8379, (byte) 119);
            int[] var6 = this.method2042(0, arg0, (byte) 119);
            int[] var7 = this.method2042(0, class589.field8379 & arg0 + 1, (byte) 119);
            int[] var8 = var4[0];
            int[] var9 = var4[1];
            int[] var10 = var4[2];
            for (int var11 = 0; var11 < class449.field6539; ++var11) {
                int var12 = (var7[var11] + -var5[var11]) * this.field6837;
                int var13 = (var6[var11 - -1 & class108.field1799] + -var6[class108.field1799 & var11 + -1]) * this.field6837;
                int var14 = var13 >> 12;
                int var15 = var12 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = var15 * var15 >> 12;
                int var18 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 + 4096 + var16) / 4096.0F)));
                int var19;
                int var20;
                int var21;
                if (~var18 == -1) {
                    var19 = 0;
                    var20 = 0;
                    var21 = 0;
                } else {
                    var19 = 16777216 / var18;
                    var20 = var12 / var18;
                    var21 = var13 / var18;
                }
                if (this.field6833) {
                    var19 = 2048 - -(var19 >> 1);
                    var21 = (var21 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                }
                var8[var11] = var21;
                var9[var11] = var20;
                var10[var11] = var19;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;", line = 202)
    public static final String method2770(String arg0, boolean arg1) {
        ++field6836;
        if (arg1) {
            return null;
        } else if (!class40.field564.startsWith("win")) {
            if (class40.field564.startsWith("linux")) {
                return "lib" + arg0 + ".so";
            } else {
                return class40.field564.startsWith("mac") ? "lib" + arg0 + ".jnilib" : null;
            }
        } else {
            return arg0 + ".dll";
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IZ)Z", line = 225)
    public static final boolean method2771(int arg0, boolean arg1) {
        class595.field8469 = true;
        class465.field6711 = arg0 + 1 & 65535;
        ++field6835;
        return !arg1;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIII)I", line = 240)
    public static final int method2772(int arg0, int arg1, int arg2, int arg3) {
        ++field6838;
        int var4 = -arg1 + 255;
        int var5 = (16711680 & (65280 & arg2) * arg1 | -16711936 & (16711935 & arg2) * arg1) >>> 8;
        int var6 = 95 / ((-50 - arg3) / 58);
        return ((16711680 & (arg0 & 65280) * var4 | (arg0 & 16711935) * var4 & -16711936) >>> 8) + var5;
    }
}
