import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class386 extends class213 {

    @OriginalMember(owner = "client!es", name = "n", descriptor = "Z")
    private boolean field5590 = false;

    @OriginalMember(owner = "client!es", name = "s", descriptor = "Z")
    private boolean field5595;

    @OriginalMember(owner = "client!es", name = "p", descriptor = "[Lvea;")
    private class64[] field5592;

    @OriginalMember(owner = "client!es", name = "v", descriptor = "[B")
    public static byte[] field5598 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!es", name = "w", descriptor = "[I")
    public static int[] field5599 = new int[8];

    @OriginalMember(owner = "client!es", name = "l", descriptor = "I")
    public static int field5588;

    @OriginalMember(owner = "client!es", name = "m", descriptor = "I")
    public static int field5589;

    @OriginalMember(owner = "client!es", name = "o", descriptor = "I")
    public static int field5591;

    @OriginalMember(owner = "client!es", name = "q", descriptor = "I")
    public static int field5593;

    @OriginalMember(owner = "client!es", name = "r", descriptor = "I")
    public static int field5594;

    @OriginalMember(owner = "client!es", name = "t", descriptor = "I")
    public static int field5596;

    @OriginalMember(owner = "client!es", name = "u", descriptor = "I")
    public static int field5597;

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(ZI)V")
    public final void method17(boolean arg0, int arg1) {
        if (this.field5592 != null && arg0) {
            super.field2766.method1969(1, -26328);
            super.field2766.method788(14433, class202.field2643);
            class492 var3 = super.field2766.method1993((byte) -26);
            var3.method603(1024);
            super.field2766.method1896(class480.field6468, (byte) -6);
            if (!this.field5595) {
                super.field2766.method1917(false, class594.field8145, class66.field868);
                super.field2766.method1997(class668.field9495, 0, -88);
                super.field2766.method1969(2, -26328);
                super.field2766.method1917(false, class66.field868, class129.field1635);
                super.field2766.method1997(class668.field9495, 0, -121);
                super.field2766.method807(true, 1, false, -21480, class668.field9495);
                super.field2766.method1914(class275.field3735, 0, (byte) 115);
                super.field2766.method1884(super.field2766.field4408, -2);
            } else {
                super.field2766.method1917(false, class66.field868, class129.field1635);
                super.field2766.method807(true, 0, false, -21480, class322.field4722);
                super.field2766.method1914(class275.field3735, 0, (byte) 115);
            }
            super.field2766.method1969(0, -26328);
            this.field5590 = true;
        } else {
            super.field2766.method1914(class275.field3735, 0, (byte) 115);
        }
        if (arg1 > 37) {
            ++field5594;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(III)V")
    public final void method28(int arg0, int arg1, int arg2) {
        if (this.field5590) {
            super.field2766.method1969(1, -26328);
            super.field2766.method1884(this.field5592[arg1 + -1], -2);
            super.field2766.method1969(0, -26328);
        }
        if (arg0 != -16595) {
            field5599 = null;
        }
        ++field5591;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(I)V")
    public final void method20(int arg0) {
        if (this.field5590) {
            super.field2766.method1969(1, -26328);
            super.field2766.method1884((class619) null, -2);
            super.field2766.method788(14433, class179.field2239);
            super.field2766.method1928(-9396);
            if (!this.field5595) {
                super.field2766.method1917(false, class594.field8145, class594.field8145);
                super.field2766.method1997(class322.field4722, 0, -72);
                super.field2766.method1969(2, -26328);
                super.field2766.method1917(false, class594.field8145, class594.field8145);
                super.field2766.method1997(class322.field4722, 0, -125);
                super.field2766.method1997(class668.field9495, 1, -64);
                super.field2766.method1914(class322.field4722, 0, (byte) 115);
                super.field2766.method1884((class619) null, -2);
            } else {
                super.field2766.method1917(false, class594.field8145, class594.field8145);
                super.field2766.method1997(class322.field4722, 0, -107);
                super.field2766.method1914(class322.field4722, 0, (byte) 115);
            }
            super.field2766.method1969(0, -26328);
            this.field5590 = false;
        } else {
            super.field2766.method1914(class322.field4722, 0, (byte) 115);
        }
        if (arg0 <= 32) {
            this.field5595 = true;
        }
        ++field5596;
        super.field2766.method1917(false, class594.field8145, class594.field8145);
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IILaw;)V")
    public final void method19(int arg0, int arg1, class619 arg2) {
        super.field2766.method1884(arg2, -2);
        ++field5597;
        if (arg1 == 8) {
            super.field2766.method1995(arg0, 1);
        }
    }

    @OriginalMember(owner = "client!es", name = "d", descriptor = "(I)V")
    public static void method2322(int arg0) {
        field5598 = null;
        field5599 = null;
        int var1 = 40 / ((arg0 - -76) / 44);
    }

    @OriginalMember(owner = "client!es", name = "d", descriptor = "(B)Z")
    public final boolean method22(byte arg0) {
        ++field5588;
        return arg0 == 75;
    }

    @OriginalMember(owner = "client!es", name = "c", descriptor = "(ZI)V")
    public final void method23(boolean arg0, int arg1) {
        if (arg1 != -18) {
            this.method23(false, -59);
        }
        super.field2766.method1917(false, class66.field868, class594.field8145);
        ++field5589;
    }

    @OriginalMember(owner = "client!es", name = "e", descriptor = "(I)I")
    public static final int method2323(int arg0) {
        ++field5593;
        return arg0 != 23384 ? -91 : class399.method2361((byte) -6, false);
    }

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lsv;)V")
    public class386(class312 arg0) {
        super(arg0);
        if (arg0.field4390) {
            this.field5595 = ~arg0.field4460 > -4;
            int var2 = this.field5595 ? 48 : 127;
            int[][] var3 = new int[6][4096];
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (~var14 != -1) {
                            if (~var14 != -2) {
                                if (~var14 != -3) {
                                    if (~var14 == -4) {
                                        var15 = -var13;
                                    } else if (var14 != 4) {
                                        var15 = -var11;
                                    } else {
                                        var15 = var11;
                                    }
                                } else {
                                    var15 = var13;
                                }
                            } else {
                                var15 = var12;
                            }
                        } else {
                            var15 = -var12;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (!(var15 > 0.0F)) {
                            var16 = 0;
                            var17 = 0;
                            var18 = 0;
                        } else {
                            var18 = (int) ((double) var2 * Math.pow((double) var15, 96.0D));
                            var17 = (int) (Math.pow((double) var15, 36.0D) * (double) var2);
                            var16 = (int) (Math.pow((double) var15, 12.0D) * (double) var2);
                        }
                        var4[var14][var6] = var18 << 24;
                        var5[var14][var6] = var17 << 24;
                        var3[var14][var6] = var16 << 24;
                    }
                    ++var6;
                }
            }
            this.field5592 = new class64[3];
            this.field5592[0] = super.field2766.method845((byte) 113, false, 64, var4);
            this.field5592[1] = super.field2766.method845((byte) 118, false, 64, var5);
            this.field5592[2] = super.field2766.method845((byte) 104, false, 64, var3);
        }
    }
}
