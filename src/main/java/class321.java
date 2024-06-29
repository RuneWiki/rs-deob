import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iia")
public class class321 extends class747 {

    @OriginalMember(owner = "client!iia", name = "J", descriptor = "I")
    private int field4458 = 1;

    @OriginalMember(owner = "client!iia", name = "I", descriptor = "I")
    private int field4457 = 1;

    @OriginalMember(owner = "client!iia", name = "H", descriptor = "Lcj;")
    public static class445 field4456 = new class445();

    @OriginalMember(owner = "client!iia", name = "N", descriptor = "[I")
    public static int[] field4462 = new int[1000];

    @OriginalMember(owner = "client!iia", name = "F", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!iia", name = "G", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!iia", name = "K", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!iia", name = "L", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!iia", name = "M", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!iia", name = "P", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!iia", name = "Q", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!iia", name = "O", descriptor = "[I")
    public static int[] field4463;

    @OriginalMember(owner = "client!iia", name = "<init>", descriptor = "()V", line = 4)
    public class321() {
        super(1, false);
    }

    @OriginalMember(owner = "client!iia", name = "c", descriptor = "(B)V", line = 8)
    public static void method2069(byte arg0) {
        field4456 = null;
        field4463 = null;
        if (arg0 != -110) {
            field4456 = null;
        }
        field4462 = null;
    }

    @OriginalMember(owner = "client!iia", name = "c", descriptor = "(II)Z", line = 24)
    public static final boolean method2070(int arg0, int arg1) {
        ++field4455;
        if (arg0 != 30264) {
            method2070(-98, -26);
        }
        return arg1 == 44 || arg1 == 5 || arg1 == 1002 || ~arg1 == -22 || ~arg1 == -3;
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(II)[I", line = 42)
    public final int[] method182(int arg0, int arg1) {
        ++field4465;
        int[] var3 = super.field10279.method3479(true, arg0);
        if (arg1 >= -89) {
            return null;
        } else {
            if (super.field10279.field8263) {
                int var4 = this.field4457 - (-this.field4457 - 1);
                int var5 = 65536 / var4;
                int var6 = this.field4458 + 1 + this.field4458;
                int var7 = 65536 / var6;
                int[][] var8 = new int[var4][];
                for (int var9 = -this.field4457 + arg0; ~var9 >= ~(arg0 - -this.field4457); ++var9) {
                    int[] var13 = this.method4156(115, var9 & class415.field5878, 0);
                    int[] var14 = new int[class73.field1095];
                    int var15 = 0;
                    for (int var16 = -this.field4458; this.field4458 >= var16; ++var16) {
                        var15 += var13[class73.field1097 & var16];
                    }
                    int var17 = 0;
                    while (var17 < class73.field1095) {
                        var14[var17] = var7 * var15 >> 16;
                        int var18 = var15 - var13[var17 - this.field4458 & class73.field1097];
                        ++var17;
                        var15 = var13[class73.field1097 & this.field4458 + var17] + var18;
                    }
                    var8[this.field4457 + var9 + -arg0] = var14;
                }
                for (int var10 = 0; ~class73.field1095 < ~var10; ++var10) {
                    int var11 = 0;
                    for (int var12 = 0; var12 < var4; ++var12) {
                        var11 += var8[var12][var10];
                    }
                    var3[var10] = var5 * var11 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!iia", name = "b", descriptor = "(II)[[I", line = 140)
    public final int[][] method688(int arg0, int arg1) {
        ++field4464;
        int[][] var3 = super.field10289.method2200(0, arg1);
        int var4 = 105 % ((35 - arg0) / 58);
        if (super.field10289.field4906) {
            int var5 = this.field4457 + this.field4457 - -1;
            int var6 = 65536 / var5;
            int var7 = this.field4458 + this.field4458 + 1;
            int var8 = 65536 / var7;
            int[][][] var9 = new int[var5][][];
            for (int var10 = -this.field4457 + arg1; ~(this.field4457 + arg1) <= ~var10; ++var10) {
                int[][] var20 = this.method4158(0, class415.field5878 & var10, 2);
                int[][] var21 = new int[3][class73.field1095];
                int var22 = 0;
                int var23 = 0;
                int var24 = 0;
                int[] var25 = var20[0];
                int[] var26 = var20[1];
                int[] var27 = var20[2];
                for (int var28 = -this.field4458; this.field4458 >= var28; ++var28) {
                    int var38 = var28 & class73.field1097;
                    var24 += var27[var38];
                    var23 += var26[var38];
                    var22 += var25[var38];
                }
                int[] var29 = var21[0];
                int[] var30 = var21[1];
                int[] var31 = var21[2];
                int var32 = 0;
                while (var32 < class73.field1095) {
                    var29[var32] = var8 * var22 >> 16;
                    var30[var32] = var8 * var23 >> 16;
                    var31[var32] = var8 * var24 >> 16;
                    int var33 = class73.field1097 & -this.field4458 + var32;
                    ++var32;
                    int var34 = var24 - var27[var33];
                    int var35 = var22 - var25[var33];
                    int var36 = var23 - var26[var33];
                    int var37 = class73.field1097 & this.field4458 + var32;
                    var23 = var26[var37] + var36;
                    var24 = var27[var37] + var34;
                    var22 = var25[var37] + var35;
                }
                var9[var10 - arg1 + this.field4457] = var21;
            }
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~var14 > ~class73.field1095; ++var14) {
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                for (int var18 = 0; ~var18 > ~var5; ++var18) {
                    int[][] var19 = var9[var18];
                    var17 += var19[2][var14];
                    var16 += var19[1][var14];
                    var15 += var19[0][var14];
                }
                var11[var14] = var6 * var15 >> 16;
                var12[var14] = var6 * var16 >> 16;
                var13[var14] = var6 * var17 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(Ldc;II)V", line = 272)
    public final void method183(class63 arg0, int arg1, int arg2) {
        if (arg1 == 11608) {
            if (arg2 != 0) {
                if (arg2 != 1) {
                    if (arg2 == 2) {
                        super.field10281 = ~arg0.method505((byte) -119) == -2;
                    }
                } else {
                    this.field4457 = arg0.method505((byte) -119);
                }
            } else {
                this.field4458 = arg0.method505((byte) -119);
            }
            ++field4454;
        }
    }

    @OriginalMember(owner = "client!iia", name = "d", descriptor = "(B)V", line = 315)
    public static final void method2071(byte arg0) {
        if (arg0 <= 76) {
            method2071((byte) 127);
        }
        ++field4459;
        if (~class210.field2748 != -1) {
            try {
                if (++class527.field7312 > 2000) {
                    if (class713.field9960 != null) {
                        class713.field9960.method2226((byte) -101);
                        class713.field9960 = null;
                    }
                    if (~class297.field4231 <= -3) {
                        class332.field4708 = -5;
                        class210.field2748 = 0;
                        return;
                    }
                    class117.field1545.method2852(443);
                    ++class297.field4231;
                    class527.field7312 = 0;
                    class210.field2748 = 1;
                }
                if (~class210.field2748 == -2) {
                    class424.field5952 = class117.field1545.method2854(class159.field2227, 443);
                    class210.field2748 = 2;
                }
                if (class210.field2748 == 2) {
                    if (~class424.field5952.field3633 == -3) {
                        throw new IOException();
                    }
                    if (class424.field5952.field3633 != 1) {
                        return;
                    }
                    class713.field9960 = class394.method2464((Socket) class424.field5952.field3638, false, 7500);
                    class424.field5952 = null;
                    class48.method348(-20161);
                    class210.field2748 = 4;
                }
                if (~class210.field2748 == -5) {
                    if (class713.field9960.method2223((byte) -109, 1)) {
                        class713.field9960.method2227(class352.field5071.field954, 1, 0, (byte) 23);
                        int var1 = class352.field5071.field954[0] & 255;
                        class210.field2748 = 0;
                        class332.field4708 = var1;
                        class713.field9960.method2226((byte) -97);
                        class713.field9960 = null;
                    }
                }
            } catch (IOException var2) {
                if (class713.field9960 != null) {
                    class713.field9960.method2226((byte) 87);
                    class713.field9960 = null;
                }
                if (class297.field4231 >= 2) {
                    class210.field2748 = 0;
                    class332.field4708 = -4;
                } else {
                    class117.field1545.method2852(443);
                    ++class297.field4231;
                    class527.field7312 = 0;
                    class210.field2748 = 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!iia", name = "c", descriptor = "(I)V", line = 418)
    public static final void method2072(int arg0) {
        ++field4460;
        class424.field5953.method3906(-101);
        if (arg0 != -25599) {
            method2071((byte) 65);
        }
    }
}
