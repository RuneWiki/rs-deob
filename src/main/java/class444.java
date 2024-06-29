import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class444 extends class346 {

    @OriginalMember(owner = "client!mj", name = "N", descriptor = "Lwi;")
    public static class216 field6413 = new class216(100);

    @OriginalMember(owner = "client!mj", name = "J", descriptor = "I")
    public static int field6409;

    @OriginalMember(owner = "client!mj", name = "K", descriptor = "I")
    public static int field6410;

    @OriginalMember(owner = "client!mj", name = "L", descriptor = "I")
    public static int field6411;

    @OriginalMember(owner = "client!mj", name = "M", descriptor = "I")
    public static int field6412;

    @OriginalMember(owner = "client!mj", name = "O", descriptor = "I")
    public static int field6414;

    @OriginalMember(owner = "client!mj", name = "P", descriptor = "I")
    public static int field6415;

    @OriginalMember(owner = "client!mj", name = "Q", descriptor = "[[I")
    public static int[][] field6416;

    @OriginalMember(owner = "client!mj", name = "H", descriptor = "[[S")
    public static short[][] field6408;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lfb;ZI)V")
    public final void method38(class341 arg0, boolean arg1, int arg2) {
        ++field6415;
        if (arg1) {
            this.method38((class341) null, true, -90);
        }
        if (~arg2 == -1) {
            super.field5151 = ~arg0.method2233((byte) 104) == -2;
        }
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(I)V")
    public static void method2768(int arg0) {
        if (arg0 == 0) {
            field6408 = null;
            field6416 = null;
            field6413 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(II)V")
    public static final void method2769(int arg0, int arg1) {
        class51 var2 = class38.field565;
        synchronized (class38.field565) {
            if (arg1 != 2050372865) {
                return;
            }
            class38.field565.method379(arg0, false);
        }
        ++field6409;
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(II)[[I")
    public final int[][] method287(int arg0, int arg1) {
        if (arg1 > -3) {
            method2770(-44, 16, 92, -13, -96, 7);
        }
        ++field6411;
        int[][] var3 = super.field5170.method2701(0, arg0);
        if (super.field5170.field6288) {
            int[] var4 = this.method2294((byte) 54, arg0, 2);
            int[][] var5 = this.method2293(0, 0, arg0);
            int[][] var6 = this.method2293(1, 0, arg0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~var16 > ~class134.field1753; ++var16) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                } else if (var17 != 0) {
                    int var18 = 4096 - var17;
                    var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                    var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                    var9[var16] = var12[var16] * var17 - -(var15[var16] * var18) >> 12;
                } else {
                    var7[var16] = var13[var16];
                    var8[var16] = var14[var16];
                    var9[var16] = var15[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(II)[I")
    public final int[] method45(int arg0, int arg1) {
        if (arg1 != 3) {
            return null;
        } else {
            ++field6412;
            int[] var3 = super.field5152.method1409((byte) 48, arg0);
            if (super.field5152.field3004) {
                int[] var4 = this.method2294((byte) 54, arg0, 0);
                int[] var5 = this.method2294((byte) 54, arg0, 1);
                int[] var6 = this.method2294((byte) 54, arg0, 2);
                for (int var7 = 0; class134.field1753 > var7; ++var7) {
                    int var8 = var6[var7];
                    if (var8 != 4096) {
                        if (~var8 == -1) {
                            var3[var7] = var5[var7];
                        } else {
                            var3[var7] = var4[var7] * var8 - -((-var8 + 4096) * var5[var7]) >> 12;
                        }
                    } else {
                        var3[var7] = var4[var7];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(IIIIII)V")
    public static final void method2770(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6410;
        int var6 = 0;
        int var7 = arg2;
        int var8 = arg1 * arg1;
        int var9 = arg2 * arg2;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg2 << 1;
        int var13 = (-var12 + arg4) * var8 + var10;
        int var14 = -((var12 + -1) * var11) + var9;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg2 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg2 - 1) * var15;
        if (arg5 >= class157.field1981 && arg5 <= class312.field4602) {
            int var21 = class400.method2567(class240.field3368, class136.field1769, (byte) -3, arg0 - -arg1);
            int var22 = class400.method2567(class240.field3368, class136.field1769, (byte) -119, -arg1 + arg0);
            class351.method2317(false, var21, field6416[arg5], var22, arg3);
        }
        while (~var7 < -1) {
            if (var13 < 0) {
                while (~var13 > -1) {
                    var14 += var19;
                    var13 += var17;
                    var19 += var16;
                    ++var6;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var17 += var16;
                var19 += var16;
                ++var6;
            }
            var13 += -var20;
            var14 += -var18;
            var18 -= var15;
            --var7;
            var20 -= var15;
            int var23 = -var7 + arg5;
            int var24 = arg5 + var7;
            if (class157.field1981 <= var24 && ~class312.field4602 <= ~var23) {
                int var25 = class400.method2567(class240.field3368, class136.field1769, (byte) 7, arg0 + var6);
                int var26 = class400.method2567(class240.field3368, class136.field1769, (byte) 126, arg0 - var6);
                if (class157.field1981 <= var23) {
                    class351.method2317(false, var25, field6416[var23], var26, arg3);
                }
                if (~var24 >= ~class312.field4602) {
                    class351.method2317(false, var25, field6416[var24], var26, arg3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "()V")
    public class444() {
        super(3, false);
    }
}
