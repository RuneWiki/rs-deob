import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class232 extends class145 {

    @OriginalMember(owner = "client!nn", name = "L", descriptor = "I")
    public static int field3200 = -1;

    @OriginalMember(owner = "client!nn", name = "G", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!nn", name = "H", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!nn", name = "I", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!nn", name = "J", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!nn", name = "K", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!nn", name = "M", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "()V", line = 11)
    public class232() {
        super(3, false);
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lap;BI)V", line = 14)
    public final void method2(class289 arg0, byte arg1, int arg2) {
        if (arg2 == 0) {
            super.field2205 = arg0.method1861((byte) -72) == 1;
        }
        int var4 = 117 % ((arg1 - 11) / 52);
        ++field3199;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(ILqi;IZII)V", line = 28)
    public static final void method1547(int arg0, class209 arg1, int arg2, boolean arg3, int arg4, int arg5) {
        ++field3195;
        if (class384.field5399 < 50) {
            if (arg1 != null && arg1.field2908 != null && ~arg4 > ~arg1.field2908.length && arg1.field2908[arg4] != null) {
                int var6 = arg1.field2908[arg4][0];
                if (arg0 != 13238) {
                    method1549(false, -47);
                }
                int var7 = var6 >> 8;
                int var8 = (var6 & 232) >> 5;
                if (~arg1.field2908[arg4].length < -2) {
                    int var9 = (int) ((double) arg1.field2908[arg4].length * Math.random());
                    if (~var9 < -1) {
                        var7 = arg1.field2908[arg4][var9];
                    }
                }
                int var10 = 31 & var6;
                if (~var10 == -1) {
                    if (arg3) {
                        class280.method1778(var8, 255, 0, true, var7);
                    }
                } else if (~class331.field4504 != -1) {
                    class191.field2751[class384.field5399] = var7;
                    class44.field705[class384.field5399] = var8;
                    class160.field2383[class384.field5399] = 0;
                    class339.field4627[class384.field5399] = null;
                    class339.field4623[class384.field5399] = 255;
                    int var11 = (arg5 + -64) / 128;
                    int var12 = (arg2 + -64) / 128;
                    class286.field3840[class384.field5399] = (var12 << 8) + ((var11 << 16) - -var10);
                    ++class384.field5399;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(ILpg;Lbd;Ljava/awt/Canvas;II)Lpe;", line = 88)
    public static final class391 method1548(int arg0, class112 arg1, class304 arg2, Canvas arg3, int arg4, int arg5) {
        ++field3201;
        int var6 = -1;
        for (int var7 = 0; var7 < 8; ++var7) {
            if (!class199.field2836[var7]) {
                class199.field2836[var7] = true;
                var6 = var7;
                break;
            }
        }
        if (var6 == -1) {
            throw new IllegalStateException("No free toolkit instances");
        } else {
            if (arg5 != -2099013940) {
                field3200 = -28;
            }
            if (arg4 == 0) {
                return class392.method2417(var6, arg3, 1584852583, arg1);
            } else if (arg4 == 1) {
                return class314.method2002(arg1, arg0, arg3, true, arg2, var6);
            } else {
                throw new IllegalArgumentException("Unsupported mode");
            }
        }
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(ZI)V", line = 123)
    public static final void method1549(boolean arg0, int arg1) {
        ++field3198;
        class410 var2 = class105.field1538;
        synchronized (class105.field1538) {
            class105.field1538.method2534(0, arg1);
        }
        if (!arg0) {
            method1549(true, -81);
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(II)[I", line = 137)
    public final int[] method3(int arg0, int arg1) {
        ++field3196;
        int[] var3 = super.field2218.method1614(91, arg0);
        if (super.field2218.field3396) {
            int[] var4 = this.method1119(0, 0, arg0);
            int[] var5 = this.method1119(1, 0, arg0);
            int[] var6 = this.method1119(2, 0, arg0);
            for (int var7 = 0; ~class156.field2364 < ~var7; ++var7) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (~var8 != -1) {
                    var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                } else {
                    var3[var7] = var5[var7];
                }
            }
        }
        int var9 = -16 / ((16 - arg1) / 49);
        return var3;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(ZI)[[I", line = 189)
    public final int[][] method4(boolean arg0, int arg1) {
        ++field3197;
        if (!arg0) {
            return null;
        } else {
            int[][] var3 = super.field2217.method2549(arg1, 0);
            if (super.field2217.field5771) {
                int[] var4 = this.method1119(2, 0, arg1);
                int[][] var5 = this.method1121(arg1, 0, 2);
                int[][] var6 = this.method1121(arg1, 1, 2);
                int[] var7 = var3[0];
                int[] var8 = var3[1];
                int[] var9 = var3[2];
                int[] var10 = var5[0];
                int[] var11 = var5[1];
                int[] var12 = var5[2];
                int[] var13 = var6[0];
                int[] var14 = var6[1];
                int[] var15 = var6[2];
                for (int var16 = 0; class156.field2364 > var16; ++var16) {
                    int var17 = var4[var16];
                    if (var17 == 4096) {
                        var7[var16] = var10[var16];
                        var8[var16] = var11[var16];
                        var9[var16] = var12[var16];
                    } else if (var17 == 0) {
                        var7[var16] = var13[var16];
                        var8[var16] = var14[var16];
                        var9[var16] = var15[var16];
                    } else {
                        int var18 = -var17 + 4096;
                        var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                        var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                        var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                    }
                }
            }
            return var3;
        }
    }
}
