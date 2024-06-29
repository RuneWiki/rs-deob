import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class155 extends class214 {

    @OriginalMember(owner = "client!bp", name = "N", descriptor = "I")
    private int field2407 = 1024;

    @OriginalMember(owner = "client!bp", name = "M", descriptor = "I")
    private int field2406 = 3072;

    @OriginalMember(owner = "client!bp", name = "E", descriptor = "I")
    private int field2398 = 2048;

    @OriginalMember(owner = "client!bp", name = "D", descriptor = "Ltm;")
    public static class334 field2397 = new class334(27, 2);

    @OriginalMember(owner = "client!bp", name = "F", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!bp", name = "G", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!bp", name = "H", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!bp", name = "I", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!bp", name = "K", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!bp", name = "L", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!bp", name = "O", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!bp", name = "P", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!bp", name = "J", descriptor = "[Lnfa;")
    public static class225[] field2403;

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "()V")
    public class155() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(BI)I")
    public static final int method1165(byte arg0, int arg1) {
        ++field2408;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg1 * 6 + -61440;
        if (arg0 != -67) {
            method1167((class353) null, -57);
        }
        int var4 = (arg1 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(ILofa;I)V")
    public final void method59(int arg0, class301 arg1, int arg2) {
        ++field2409;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field3540 = arg1.method1987(-15) == 1;
                }
            } else {
                this.field2406 = arg1.method1989((byte) -69);
            }
        } else {
            this.field2407 = arg1.method1989((byte) -44);
        }
        if (arg0 < 92) {
            this.method59(-106, (class301) null, 76);
        }
    }

    @OriginalMember(owner = "client!bp", name = "f", descriptor = "(I)V")
    public static final void method1166(int arg0) {
        ++field2400;
        if (class395.field5895 == null) {
            class395.field5895 = new int[65536];
            if (arg0 != 1) {
                method1165((byte) -107, 82);
            }
            double var1 = 0.03D * Math.random() - 0.015D + 0.7D;
            int var3 = 0;
            for (int var4 = 0; ~var4 > -513; ++var4) {
                float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
                float var6 = (float) (7 & var4) / 8.0F + 0.0625F;
                for (int var7 = 0; var7 < 128; ++var7) {
                    float var8 = (float) var7 / 128.0F;
                    float var9 = 0.0F;
                    float var10 = 0.0F;
                    float var11 = 0.0F;
                    float var12 = var5 / 60.0F;
                    int var13 = (int) var12;
                    int var14 = var13 % 6;
                    float var15 = (float) (-var13) + var12;
                    float var16 = (-var6 + 1.0F) * var8;
                    float var17 = (-(var6 * var15) + 1.0F) * var8;
                    float var18 = (1.0F - (1.0F - var15) * var6) * var8;
                    if (var14 == 0) {
                        var11 = var16;
                        var10 = var18;
                        var9 = var8;
                    } else if (var14 == 1) {
                        var10 = var8;
                        var9 = var17;
                        var11 = var16;
                    } else if (var14 == 2) {
                        var11 = var18;
                        var10 = var8;
                        var9 = var16;
                    } else if (~var14 == -4) {
                        var10 = var17;
                        var9 = var16;
                        var11 = var8;
                    } else if (var14 != 4) {
                        if (var14 == 5) {
                            var11 = var17;
                            var10 = var16;
                            var9 = var8;
                        }
                    } else {
                        var11 = var8;
                        var10 = var16;
                        var9 = var18;
                    }
                    float var19 = (float) Math.pow((double) var9, var1);
                    float var20 = (float) Math.pow((double) var10, var1);
                    float var21 = (float) Math.pow((double) var11, var1);
                    int var22 = (int) (var19 * 256.0F);
                    int var23 = (int) (var20 * 256.0F);
                    int var24 = (int) (var21 * 256.0F);
                    int var25 = (var23 << 8) + (var22 << 16) + -16777216 + var24;
                    class395.field5895[var3++] = var25;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IB)[I")
    public final int[] method64(int arg0, byte arg1) {
        if (arg1 != 5) {
            this.method64(-108, (byte) -110);
        }
        ++field2401;
        int[] var3 = super.field3544.method3869(arg0, -116);
        if (super.field3544.field9836) {
            int[] var4 = this.method1545(arg0, 0, -1);
            for (int var5 = 0; var5 < class626.field8787; ++var5) {
                var3[var5] = this.field2407 - -(var4[var5] * this.field2398 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lraa;I)V")
    public static final void method1167(class353 arg0, int arg1) {
        ++field2402;
        if (class672.field9509 == arg0.field5235) {
            if (class145.field2251.field8146 == null) {
                arg0.field5364 = 0;
                arg0.field5276 = 0;
            } else {
                arg0.field5301 = 150;
                arg0.field5368 = 2047 & (int) (256.0D * Math.sin((double) class199.field3403 / 40.0D));
                arg0.field5249 = 5;
                arg0.field5276 = class673.field9516;
                arg0.field5364 = class666.method3732(false, class145.field2251.field8146);
                arg0.field5245 = class145.field2251.field1690;
                arg0.field5290 = class145.field2251.field1679;
                arg0.field5242 = class145.field2251.field1607;
                arg0.field5266 = 0;
                class82 var2 = arg0.field5290 == -1 ? null : class83.field1219.method2358((byte) 102, arg0.field5290);
                if (var2 != null) {
                    class144.method1111(arg0.field5242, var2, (byte) 117);
                }
            }
        } else {
            int var3 = 74 % ((arg1 - 22) / 60);
        }
    }

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "(I)V")
    public final void method65(int arg0) {
        if (arg0 < 48) {
            this.method65(-60);
        }
        this.field2398 = -this.field2407 + this.field2406;
        ++field2404;
    }

    @OriginalMember(owner = "client!bp", name = "g", descriptor = "(I)V")
    public static void method1168(int arg0) {
        field2403 = null;
        field2397 = null;
        if (arg0 != 1) {
            field2403 = null;
        }
    }

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "(II)[[I")
    public final int[][] method62(int arg0, int arg1) {
        ++field2399;
        int[][] var3 = super.field3545.method2996((byte) 127, arg0);
        if (super.field3545.field7147) {
            int[][] var4 = this.method1539(true, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class626.field8787 > var11; ++var11) {
                var8[var11] = this.field2407 - -(var5[var11] * this.field2398 >> 12);
                var9[var11] = (var6[var11] * this.field2398 >> 12) + this.field2407;
                var10[var11] = (var7[var11] * this.field2398 >> 12) + this.field2407;
            }
        }
        if (arg1 != -256) {
            method1165((byte) 94, -23);
        }
        return var3;
    }
}
