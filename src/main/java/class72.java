import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public class class72 extends class748 {

    @OriginalMember(owner = "client!hea", name = "Q", descriptor = "I")
    private int field1007 = 0;

    @OriginalMember(owner = "client!hea", name = "U", descriptor = "[S")
    private short[] field1011 = new short[257];

    @OriginalMember(owner = "client!hea", name = "K", descriptor = "Lqk;")
    public static class148 field1001 = new class148(84, 5);

    @OriginalMember(owner = "client!hea", name = "X", descriptor = "Z")
    public static boolean field1014 = false;

    @OriginalMember(owner = "client!hea", name = "J", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!hea", name = "L", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!hea", name = "N", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!hea", name = "O", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!hea", name = "P", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!hea", name = "R", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!hea", name = "S", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!hea", name = "T", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!hea", name = "W", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!hea", name = "Z", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!hea", name = "Y", descriptor = "Lul;")
    public static class364 field1015;

    @OriginalMember(owner = "client!hea", name = "M", descriptor = "[I")
    private int[] field1003;

    @OriginalMember(owner = "client!hea", name = "ab", descriptor = "[I")
    private int[] field1017;

    @OriginalMember(owner = "client!hea", name = "V", descriptor = "[Lcw;")
    public static class21[] field1012;

    @OriginalMember(owner = "client!hea", name = "I", descriptor = "[[I")
    private int[][] field999;

    @OriginalMember(owner = "client!hea", name = "g", descriptor = "(I)V", line = 5)
    public static void method454(int arg0) {
        field1015 = null;
        field1001 = null;
        if (arg0 == 1) {
            field1012 = null;
        }
    }

    @OriginalMember(owner = "client!hea", name = "h", descriptor = "(I)V", line = 18)
    private final void method455(int arg0) {
        int var2 = 90 / ((74 - arg0) / 51);
        int var3 = this.field1007;
        if (var3 != 2) {
            if (var3 == 1) {
                for (int var4 = 0; ~var4 > -258; ++var4) {
                    int var5 = var4 << 4;
                    int var6;
                    for (var6 = 1; ~var6 > ~(this.field999.length + -1) && var5 >= this.field999[var6][0]; ++var6) {
                    }
                    int[] var7 = this.field999[var6 - 1];
                    int[] var8 = this.field999[var6];
                    int var9 = (-var7[0] + var5 << 12) / (var8[0] + -var7[0]);
                    int var10 = -class666.field9382[255 & var9 >> 5] + 4096 >> 1;
                    int var11 = -var10 + 4096;
                    int var12 = var7[1] * var11 - -(var8[1] * var10) >> 12;
                    if (~var12 >= 32767) {
                        var12 = -32767;
                    }
                    if (var12 >= 32768) {
                        var12 = 32767;
                    }
                    this.field1011[var4] = (short) var12;
                }
            } else {
                for (int var13 = 0; ~var13 > -258; ++var13) {
                    int var14 = var13 << 4;
                    int var15;
                    for (var15 = 1; var15 < this.field999.length + -1 && ~this.field999[var15][0] >= ~var14; ++var15) {
                    }
                    int[] var16 = this.field999[var15 + -1];
                    int[] var17 = this.field999[var15];
                    int var18 = (-var16[0] + var14 << 12) / (var17[0] - var16[0]);
                    int var19 = -var18 + 4096;
                    int var20 = var16[1] * var19 + var17[1] * var18 >> 12;
                    if (~var20 >= 32767) {
                        var20 = -32767;
                    }
                    if (var20 >= 32768) {
                        var20 = 32767;
                    }
                    this.field1011[var13] = (short) var20;
                }
            }
        } else {
            for (int var21 = 0; var21 < 257; ++var21) {
                int var22 = var21 << 4;
                int var23;
                for (var23 = 1; ~var23 > ~(this.field999.length + -1) && ~var22 <= ~this.field999[var23][0]; ++var23) {
                }
                int[] var24 = this.field999[var23 + -1];
                int[] var25 = this.field999[var23];
                int var26 = this.method458(var23 + -2, false)[1];
                int var27 = var24[1];
                int var28 = var25[1];
                int var29 = this.method458(var23 + 1, false)[1];
                int var30 = (var22 - var24[0] << 12) / (var25[0] + -var24[0]);
                int var31 = var30 * var30 >> 12;
                int var32 = -var28 + var29 - -var27 + -var26;
                int var33 = -var27 + var26 + -var32;
                int var34 = -var26 + var28;
                int var36 = (var30 * var32 >> 12) * var31 >> 12;
                int var37 = var31 * var33 >> 12;
                int var38 = var30 * var34 >> 12;
                int var39 = var27 + var36 - (-var37 - var38);
                if (var39 <= -32768) {
                    var39 = -32767;
                }
                if (~var39 <= -32769) {
                    var39 = 32767;
                }
                this.field1011[var21] = (short) var39;
            }
        }
        ++field1002;
    }

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "(IBI)I", line = 198)
    public static final int method456(int arg0, byte arg1, int arg2) {
        ++field1004;
        int var3 = arg2 >>> 24;
        if (arg1 != -52) {
            method454(83);
        }
        int var4 = ((16711935 & arg2) * var3 & -16711936 | 16711680 & (65280 & arg2) * var3) >>> 8;
        int var5 = -var3 + 255;
        return (((arg0 & 16711935) * var5 & -16711936 | 16711680 & (65280 & arg0) * var5) >>> 8) + var4;
    }

    @OriginalMember(owner = "client!hea", name = "<init>", descriptor = "()V", line = 214)
    public class72() {
        super(1, true);
    }

    @OriginalMember(owner = "client!hea", name = "d", descriptor = "(B)V", line = 217)
    private final void method457(byte arg0) {
        ++field1013;
        int[] var2 = this.field999[0];
        int[] var3 = this.field999[1];
        int[] var4 = this.field999[this.field999.length + -2];
        int[] var5 = this.field999[this.field999.length - 1];
        if (arg0 == 18) {
            this.field1017 = new int[] { -var3[0] - -var2[0] + var2[0], var2[1] + -var3[1] + var2[1] };
            this.field1003 = new int[] { var4[0] - (var5[0] - var4[0]), var4[1] + -var5[1] + var4[1] };
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(IZ)[I", line = 243)
    private final int[] method458(int arg0, boolean arg1) {
        if (arg1) {
            this.method458(-73, false);
        }
        ++field1008;
        if (~arg0 > -1) {
            return this.field1017;
        } else {
            return this.field999.length <= arg0 ? this.field1003 : this.field999[arg0];
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(IZLvj;)V", line = 264)
    public final void method20(int arg0, boolean arg1, class26 arg2) {
        if (arg1) {
            this.method23((byte) 83);
        }
        if (~arg0 == -1) {
            this.field1007 = arg2.method194((byte) 119);
            this.field999 = new int[arg2.method194((byte) 119)][2];
            for (int var4 = 0; this.field999.length > var4; ++var4) {
                this.field999[var4][0] = arg2.method193(2);
                this.field999[var4][1] = arg2.method193(2);
            }
        }
        ++field1005;
    }

    @OriginalMember(owner = "client!hea", name = "c", descriptor = "(II)I", line = 295)
    public static final int method459(int arg0, int arg1) {
        if (arg1 >= -111) {
            return -107;
        } else {
            ++field1010;
            int var2 = 63 & arg0;
            int var3 = (arg0 & 199) >> 6;
            if (~var2 != -19) {
                if (~var2 == -20 || ~var2 == -22) {
                    if (~var3 == -1) {
                        return 16;
                    }
                    if (~var3 == -2) {
                        return 32;
                    }
                    if (~var3 == -3) {
                        return 64;
                    }
                    if (~var3 == -4) {
                        return 128;
                    }
                }
            } else {
                if (var3 == 0) {
                    return 1;
                }
                if (~var3 == -2) {
                    return 2;
                }
                if (var3 == 2) {
                    return 4;
                }
                if (var3 == 3) {
                    return 8;
                }
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!hea", name = "i", descriptor = "(I)V", line = 351)
    public static final void method460(int arg0) {
        ++field1006;
        class674.field9500.method2250((byte) 82, 1, class674.field9500.field5159);
        class674.field9500.method2250((byte) 113, 1, class674.field9500.field5113);
        class674.field9500.method2250((byte) 127, 2, class674.field9500.field5119);
        class674.field9500.method2250((byte) 100, 2, class674.field9500.field5122);
        int var1 = 98 / ((-35 - arg0) / 60);
        class674.field9500.method2250((byte) 109, 1, class674.field9500.field5131);
        class674.field9500.method2250((byte) 121, 1, class674.field9500.field5163);
        class674.field9500.method2250((byte) 108, 1, class674.field9500.field5137);
        class674.field9500.method2250((byte) 95, 1, class674.field9500.field5154);
        class674.field9500.method2250((byte) 99, 1, class674.field9500.field5168);
        class674.field9500.method2250((byte) 125, 1, class674.field9500.field5151);
        class674.field9500.method2250((byte) 127, 1, class674.field9500.field5130);
        class674.field9500.method2250((byte) 94, 1, class674.field9500.field5162);
        class674.field9500.method2250((byte) 114, 0, class674.field9500.field5134);
        class674.field9500.method2250((byte) 105, 1, class674.field9500.field5143);
        class674.field9500.method2250((byte) 126, 0, class674.field9500.field5135);
        class674.field9500.method2250((byte) 104, 0, class674.field9500.field5155);
        class674.field9500.method2250((byte) 95, 1, class674.field9500.field5148);
        class674.field9500.method2250((byte) 117, 0, class674.field9500.field5120);
        class674.field9500.method2250((byte) 87, 0, class674.field9500.field5132);
        class163.method1017(false);
        class674.field9500.method2250((byte) 88, 1, class674.field9500.field5139);
        class674.field9500.method2250((byte) 105, 3, class674.field9500.field5117);
        class469.method2794(false);
        class507.method3027(-1);
        class295.field3852 = true;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(II)[I", line = 387)
    public final int[] method25(int arg0, int arg1) {
        if (arg1 != 255) {
            this.method455(39);
        }
        ++field1009;
        int[] var3 = super.field10407.method3873(0, arg0);
        if (super.field10407.field9527) {
            int[] var4 = this.method4157(0, (byte) 124, arg0);
            for (int var5 = 0; ~class424.field5889 < ~var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field1011[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "(IZ)V", line = 434)
    public static final void method461(int arg0, boolean arg1) {
        class350.method1993(26779);
        ++field1016;
        if (class439.method2630(class213.field3004, (byte) -78)) {
            if (arg0 != 26985) {
                field1014 = false;
            }
            ++class585.field8425;
            if (~class585.field8425 <= -51 || arg1) {
                class585.field8425 = 0;
                if (!class594.field8566 && class275.field3699 != null) {
                    ++class471.field6441;
                    class120 var2 = class292.method1716(class608.field8668, true, class471.field6464);
                    class471.method2805(102, var2);
                    try {
                        class458.method2748(true);
                    } catch (IOException var3) {
                        class594.field8566 = true;
                    }
                }
                class350.method1993(26779);
            }
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(B)V", line = 468)
    public final void method23(byte arg0) {
        if (this.field999 == null) {
            this.field999 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field1000;
        if (this.field999.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field1007 == -3) {
                this.method457((byte) 18);
            }
            class503.method3003((byte) -66);
            if (arg0 != 67) {
                this.field1017 = null;
            }
            this.method455(125);
        }
    }
}
