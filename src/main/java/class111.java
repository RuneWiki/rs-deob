import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class111 extends class337 {

    @OriginalMember(owner = "client!hq", name = "I", descriptor = "I")
    private int field1548 = 0;

    @OriginalMember(owner = "client!hq", name = "B", descriptor = "[S")
    private short[] field1542 = new short[257];

    @OriginalMember(owner = "client!hq", name = "G", descriptor = "[J")
    public static long[] field1546 = new long[256];

    @OriginalMember(owner = "client!hq", name = "N", descriptor = "Z")
    public static volatile boolean field1553 = true;

    @OriginalMember(owner = "client!hq", name = "S", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!hq", name = "T", descriptor = "[I")
    public static int[] field1559;

    @OriginalMember(owner = "client!hq", name = "C", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!hq", name = "E", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!hq", name = "F", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!hq", name = "H", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!hq", name = "J", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!hq", name = "L", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!hq", name = "O", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!hq", name = "P", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!hq", name = "R", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field1557;

    @OriginalMember(owner = "client!hq", name = "K", descriptor = "[I")
    private int[] field1550;

    @OriginalMember(owner = "client!hq", name = "M", descriptor = "[I")
    private int[] field1552;

    @OriginalMember(owner = "client!hq", name = "U", descriptor = "[Luq;")
    public static class114[] field1560;

    @OriginalMember(owner = "client!hq", name = "Q", descriptor = "[[I")
    private int[][] field1556;

    static {
        for (int var0 = 0; var0 < 256; ++var0) {
            long var1 = (long) var0;
            for (int var3 = 0; ~var3 > -9; ++var3) {
                if ((1L & var1) == 1L) {
                    var1 = var1 >>> 1 ^ -3932672073523589310L;
                } else {
                    var1 >>>= 1;
                }
            }
            field1546[var0] = var1;
        }
        field1558 = 0;
        field1559 = new int[256];
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(BILhp;)V", line = 3)
    public final void method177(byte arg0, int arg1, class217 arg2) {
        ++field1547;
        int var4 = 109 % ((arg0 - 82) / 40);
        if (arg1 == 0) {
            this.field1548 = arg2.method1515((byte) 125);
            this.field1556 = new int[arg2.method1515((byte) 126)][2];
            for (int var5 = 0; this.field1556.length > var5; ++var5) {
                this.field1556[var5][0] = arg2.method1511(-120);
                this.field1556[var5][1] = arg2.method1511(124);
            }
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(B)V", line = 29)
    public final void method174(byte arg0) {
        if (this.field1556 == null) {
            this.field1556 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field1555;
        if (~this.field1556.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field1548 == 2) {
                this.method846(true);
            }
            class61.method539((byte) 118);
            if (arg0 < 1) {
                this.field1556 = null;
            }
            this.method845(71);
        }
    }

    @OriginalMember(owner = "client!hq", name = "i", descriptor = "(I)V", line = 51)
    private final void method845(int arg0) {
        int var2 = 81 / ((arg0 - -58) / 49);
        ++field1549;
        int var3 = this.field1548;
        if (var3 != 2) {
            if (var3 == 1) {
                for (int var4 = 0; var4 < 257; ++var4) {
                    int var5 = var4 << 4;
                    int var6;
                    for (var6 = 1; this.field1556.length - 1 > var6 && this.field1556[var6][0] <= var5; ++var6) {
                    }
                    int[] var7 = this.field1556[var6 - 1];
                    int[] var8 = this.field1556[var6];
                    int var9 = (-var7[0] + var5 << 12) / (var8[0] - var7[0]);
                    int var10 = 4096 - class333.field4972[255 & var9 >> 5] >> 1;
                    int var11 = -var10 + 4096;
                    int var12 = var7[1] * var11 + var8[1] * var10 >> 12;
                    if (~var12 >= 32767) {
                        var12 = -32767;
                    }
                    if (var12 >= 32768) {
                        var12 = 32767;
                    }
                    this.field1542[var4] = (short) var12;
                }
            } else {
                for (int var13 = 0; var13 < 257; ++var13) {
                    int var14 = var13 << 4;
                    int var15;
                    for (var15 = 1; ~var15 > ~(this.field1556.length + -1) && ~this.field1556[var15][0] >= ~var14; ++var15) {
                    }
                    int[] var16 = this.field1556[var15 - 1];
                    int[] var17 = this.field1556[var15];
                    int var18 = (-var16[0] + var14 << 12) / (var17[0] + -var16[0]);
                    int var19 = -var18 + 4096;
                    int var20 = var16[1] * var19 + var17[1] * var18 >> 12;
                    if (~var20 >= 32767) {
                        var20 = -32767;
                    }
                    if (~var20 <= -32769) {
                        var20 = 32767;
                    }
                    this.field1542[var13] = (short) var20;
                }
            }
        } else {
            for (int var21 = 0; ~var21 > -258; ++var21) {
                int var22 = var21 << 4;
                int var23;
                for (var23 = 1; this.field1556.length + -1 > var23 && var22 >= this.field1556[var23][0]; ++var23) {
                }
                int[] var24 = this.field1556[var23 + -1];
                int[] var25 = this.field1556[var23];
                int var26 = this.method847((byte) -105, var23 - 2)[1];
                int var27 = var24[1];
                int var28 = var25[1];
                int var29 = this.method847((byte) -99, var23 + 1)[1];
                int var30 = (var22 - var24[0] << 12) / (var25[0] + -var24[0]);
                int var31 = var30 * var30 >> 12;
                int var32 = -var26 + var29 + -var28 - -var27;
                int var33 = -var27 + var26 + -var32;
                int var34 = -var26 + var28;
                int var36 = (var30 * var32 >> 12) * var31 >> 12;
                int var37 = var31 * var33 >> 12;
                int var38 = var30 * var34 >> 12;
                int var39 = var27 + var36 - (-var37 + -var38);
                if (var39 <= -32768) {
                    var39 = -32767;
                }
                if (~var39 <= -32769) {
                    var39 = 32767;
                }
                this.field1542[var21] = (short) var39;
            }
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Z)V", line = 235)
    private final void method846(boolean arg0) {
        ++field1545;
        int[] var2 = this.field1556[0];
        int[] var3 = this.field1556[1];
        int[] var4 = this.field1556[this.field1556.length + -2];
        if (!arg0) {
            field1559 = null;
        }
        int[] var5 = this.field1556[this.field1556.length + -1];
        this.field1550 = new int[] { var4[0] - var5[0] - -var4[0], var4[1] + -var5[1] + var4[1] };
        this.field1552 = new int[] { var2[0] + var2[0] + -var3[0], var2[1] + -var3[1] + var2[1] };
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "()V", line = 580)
    public class111() {
        super(1, true);
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(BI)[I", line = 265)
    private final int[] method847(byte arg0, int arg1) {
        ++field1554;
        if (arg1 < 0) {
            return this.field1552;
        } else {
            if (arg0 >= -95) {
                this.method177((byte) 84, -32, (class217) null);
            }
            return arg1 >= this.field1556.length ? this.field1550 : this.field1556[arg1];
        }
    }

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "(B)V", line = 283)
    public static void method848(byte arg0) {
        field1559 = null;
        int var1 = -123 % ((arg0 - -19) / 52);
        field1560 = null;
        field1546 = null;
        field1557 = null;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIZIIILsm;Lya;IIILt;IZI)Lt;", line = 296)
    public static final class475 method849(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, class189 arg6, class38 arg7, int arg8, int arg9, int arg10, class475 arg11, int arg12, boolean arg13, int arg14) {
        ++field1551;
        if (arg11 == null) {
            return null;
        } else {
            int var15 = 2055;
            if (arg6 != null) {
                int var16 = var15 | arg6.method1326(arg8, false, -1, 127);
                var15 = var16 & -513;
            }
            long var17 = ((long) arg12 << 32) + ((long) arg14 << 48) + (long) ((arg3 << 16) + (arg0 - -(arg4 << 24)));
            class13 var19 = class298.field4532;
            class475 var20;
            synchronized (class298.field4532) {
                var20 = (class475) class298.field4532.method87(var17, -2062335807);
            }
            if (var20 == null || arg7.method314(var20.method433(), var15) != 0) {
                if (var20 != null) {
                    var15 = arg7.method317(var15, var20.method433());
                }
                byte var21;
                if (~arg0 != -2) {
                    if (arg0 != 2) {
                        if (arg0 != 3) {
                            if (arg0 == 4) {
                                var21 = 18;
                            } else {
                                var21 = 21;
                            }
                        } else {
                            var21 = 15;
                        }
                    } else {
                        var21 = 12;
                    }
                } else {
                    var21 = 9;
                }
                byte var22 = 3;
                int[] var23 = new int[] { 64, 96, 128 };
                class374 var24 = new class374(var21 * var22 + 1, var21 * var22 * 2 + -var21, 0);
                int var25 = var24.method2348(0, 0, 0, (byte) 118);
                int[][] var26 = new int[var22][var21];
                for (int var27 = 0; ~var27 > ~var22; ++var27) {
                    int var28 = var23[var27];
                    int var29 = var23[var27];
                    for (int var30 = 0; ~var30 > ~var21; ++var30) {
                        int var31 = (var30 << 14) / var21;
                        int var32 = class281.field4278[var31] * var28 >> 15;
                        int var33 = class281.field4279[var31] * var29 >> 15;
                        var26[var27][var30] = var24.method2348(0, var33, var32, (byte) 53);
                    }
                }
                for (int var34 = 0; ~var22 < ~var34; ++var34) {
                    int var35 = (var34 * 256 - -128) / var22;
                    int var36 = 256 - var35;
                    byte var37 = (byte) (arg3 * var36 + arg4 * var35 >> 8);
                    short var38 = (short) (((arg12 & 64512) * var36 + (64512 & arg14) * var35 & 16515072) + (229376 & (arg12 & 896) * var36 + (896 & arg14) * var35) + ((arg12 & 127) * var36 + (arg14 & 127) * var35 & 32512) >> 8);
                    for (int var39 = 0; ~var21 < ~var39; ++var39) {
                        if (var34 != 0) {
                            var24.method2344(var26[var34 - 1][var39], (byte) 125, var37, var26[var34][(var39 + 1) % var21], var38, var26[var34 - 1][(var39 + 1) % var21], (byte) -1, (short) -1, (byte) 1);
                            var24.method2344(var26[var34 + -1][var39], (byte) 102, var37, var26[var34][var39], var38, var26[var34][(var39 + 1) % var21], (byte) -1, (short) -1, (byte) 1);
                        } else {
                            var24.method2344(var25, (byte) -117, var37, var26[0][var39], var38, var26[0][(var39 - -1) % var21], (byte) -1, (short) -1, (byte) 1);
                        }
                    }
                }
                var20 = arg7.method330(var24, var15, class460.field6698, 64, 768);
                class13 var40 = class298.field4532;
                synchronized (class298.field4532) {
                    class298.field4532.method84(var17, var20, (byte) 27);
                }
            }
            int var41 = (arg0 << 6) - 1;
            int var42 = -var41;
            int var43 = -var41;
            int var44 = var41;
            int var45 = var41;
            if (arg2) {
                if (arg9 > 9216 && arg9 < 15360) {
                    var44 = var41 + 128;
                }
                if (arg9 > 13312 || ~arg9 > -3073) {
                    var43 -= 128;
                }
                if (~arg9 < -5121 && ~arg9 > -11265) {
                    var45 = var41 + 128;
                }
                if (arg9 > 1024 && arg9 < 7168) {
                    var42 -= 128;
                }
            }
            int var46 = arg11.method423();
            int var47 = arg11.method451();
            int var48 = arg11.method416();
            if (var46 < var42) {
                var46 = var42;
            }
            if (~var47 < ~var44) {
                var47 = var44;
            }
            int var49 = arg11.method428();
            if (~var43 < ~var48) {
                var48 = var43;
            }
            if (~var49 < ~var45) {
                var49 = var45;
            }
            class22 var50 = null;
            if (arg6 != null) {
                int var51 = arg6.field3181[arg8];
                var50 = class242.field3846.method2239(var51 >> 16, (byte) 81);
                arg8 = var51 & 65535;
            }
            if (!arg13) {
                field1558 = 91;
            }
            class475 var52;
            if (var50 != null) {
                var52 = var20.method449((byte) 3, var15, true);
                var52.method424(var47 - var46 >> 1, 128, var49 - var48 >> 1);
                var52.method450(var46 - -var47 >> 1, 0, var48 + var49 >> 1);
                var52.method2859((byte) -52, arg8, var50);
            } else {
                var52 = var20.method449((byte) 3, var15, true);
                var52.method424(-var46 + var47 >> 1, 128, -var48 + var49 >> 1);
                var52.method450(var46 + var47 >> 1, 0, var48 - -var49 >> 1);
            }
            if (arg5 != 0) {
                var52.method441(arg5);
            }
            if (~arg10 != -1) {
                var52.method420(arg10);
            }
            if (~arg1 != -1) {
                var52.method450(0, arg1, 0);
            }
            return var52;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(ILul;)V", line = 510)
    public static final void method850(int arg0, class406 arg1) {
        class483.field6951 = 0;
        ++field1544;
        class54.field668 = 0;
        class465.field6733 = new class305();
        class32.field379 = new class11[1024];
        if (arg0 == 31038) {
            class222.method1592(55, arg1);
            class176.method1177(arg0 + -11607, arg1);
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IB)[I", line = 532)
    public final int[] method179(int arg0, byte arg1) {
        if (arg1 != -11) {
            return null;
        } else {
            ++field1543;
            int[] var3 = super.field5007.method512(arg0, 0);
            if (super.field5007.field687) {
                int[] var4 = this.method2124(arg0, 0, arg1 + -114);
                for (int var5 = 0; var5 < class402.field5977; ++var5) {
                    int var6 = var4[var5] >> 4;
                    if (~var6 > -1) {
                        var6 = 0;
                    }
                    if (var6 > 256) {
                        var6 = 256;
                    }
                    var3[var5] = this.field1542[var6];
                }
            }
            return var3;
        }
    }
}
