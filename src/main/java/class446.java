import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class446 extends class326 {

    @OriginalMember(owner = "client!vm", name = "N", descriptor = "[I")
    public static int[] field6062 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!vm", name = "S", descriptor = "Lgd;")
    public static class206 field6067 = new class206("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

    @OriginalMember(owner = "client!vm", name = "Z", descriptor = "Z")
    public static boolean field6074 = false;

    @OriginalMember(owner = "client!vm", name = "W", descriptor = "Lmc;")
    public static class78 field6071 = new class78(19, -1);

    @OriginalMember(owner = "client!vm", name = "P", descriptor = "I")
    public static int field6064;

    @OriginalMember(owner = "client!vm", name = "Q", descriptor = "I")
    public static int field6065;

    @OriginalMember(owner = "client!vm", name = "R", descriptor = "I")
    public static int field6066;

    @OriginalMember(owner = "client!vm", name = "T", descriptor = "I")
    public static int field6068;

    @OriginalMember(owner = "client!vm", name = "U", descriptor = "I")
    public static int field6069;

    @OriginalMember(owner = "client!vm", name = "V", descriptor = "I")
    public static int field6070;

    @OriginalMember(owner = "client!vm", name = "Y", descriptor = "I")
    public static int field6073;

    @OriginalMember(owner = "client!vm", name = "O", descriptor = "Lje;")
    public static class253 field6063;

    @OriginalMember(owner = "client!vm", name = "X", descriptor = "[Lpa;")
    private class228[] field6072;

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "()V", line = 3)
    public class446() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(IB)[[I", line = 6)
    public final int[][] method48(int arg0, byte arg1) {
        ++field6068;
        int[][] var3 = super.field4343.method2356(arg0, 87);
        if (arg1 >= -52) {
            field6074 = false;
        }
        if (super.field4343.field5336) {
            int var4 = class181.field2495;
            int var5 = class27.field359;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field4343.method2359(false);
            this.method2620(var6, 123);
            for (int var8 = 0; class27.field359 > var8; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; ~class181.field2495 < ~var14; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class99.method612(4080, var15 << 4);
                    var12[var14] = class99.method612(65280, var15) >> 4;
                    var11[var14] = class99.method612(var15 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILbt;I)V", line = 69)
    public final void method33(int arg0, class32 arg1, int arg2) {
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                super.field4358 = ~arg1.method201((byte) -119) == -2;
            }
        } else {
            this.field6072 = new class228[arg1.method201((byte) -124)];
            for (int var4 = 0; ~var4 > ~this.field6072.length; ++var4) {
                int var5 = arg1.method201((byte) -121);
                if (var5 != 0) {
                    if (var5 != 1) {
                        if (var5 != 2) {
                            if (var5 == 3) {
                                this.field6072[var4] = class226.method1275(arg1, (byte) -25);
                            }
                        } else {
                            this.field6072[var4] = class112.method724((byte) -39, arg1);
                        }
                    } else {
                        this.field6072[var4] = class449.method2642((byte) -29, arg1);
                    }
                } else {
                    this.field6072[var4] = class267.method1513(true, arg1);
                }
            }
        }
        ++field6065;
        if (arg2 > -3) {
            this.method48(99, (byte) 127);
        }
    }

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "(I)V", line = 142)
    public static final void method2619(int arg0) {
        ++field6066;
        class76 var1 = class480.field6631;
        synchronized (class480.field6631) {
            if (arg0 != 0) {
                method2622(86, (byte) 46);
            }
            class480.field6631.method495(arg0 ^ -97);
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "([[II)V", line = 159)
    private final void method2620(int[][] arg0, int arg1) {
        ++field6070;
        int var3 = class181.field2495;
        int var4 = class27.field359;
        class183.method1071(arg0, 29429);
        if (arg1 <= 77) {
            field6062 = null;
        }
        class225.method1266(0, class266.field3509, class459.field6226, 0, 0);
        if (this.field6072 != null) {
            for (int var5 = 0; var5 < this.field6072.length; ++var5) {
                class228 var6 = this.field6072[var5];
                int var7 = var6.field3001;
                int var8 = var6.field2999;
                if (var7 < 0) {
                    if (var8 >= 0) {
                        var6.method180(0, var4, var3);
                    }
                } else if (~var8 <= -1) {
                    var6.method178(123, var3, var4);
                } else {
                    var6.method181(var4, (byte) -103, var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(B)V", line = 214)
    public static void method2621(byte arg0) {
        field6071 = null;
        if (arg0 <= -55) {
            field6067 = null;
            field6063 = null;
            field6062 = null;
        }
    }

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(IB)V", line = 232)
    public static final void method2622(int arg0, byte arg1) {
        int var2 = -17 % ((53 - arg1) / 48);
        ++field6069;
        class106 var3 = class250.method1400(12, 118, arg0);
        var3.method659(82);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(BI)[I", line = 252)
    public final int[] method30(byte arg0, int arg1) {
        ++field6073;
        int[] var3 = super.field4344.method130(arg1, -109);
        if (super.field4344.field286) {
            this.method2620(super.field4344.method132(0), 99);
        }
        if (arg0 >= -6) {
            method2621((byte) -14);
        }
        return var3;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIII)V", line = 277)
    public static final void method2623(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; class318.field4195 > var5; ++var5) {
            Rectangle var6 = class341.field4560[var5];
            if (var6.x + var6.width > arg2 && var6.x < arg0 + arg2 && ~arg4 > ~(var6.y + var6.height) && var6.y < arg3 + arg4) {
                class102.field1468[var5] = true;
            }
        }
        ++field6064;
        if (arg1 != -729334780) {
            method2619(-72);
        }
    }
}
