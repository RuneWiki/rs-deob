import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class142 extends class223 {

    @OriginalMember(owner = "client!ak", name = "Q", descriptor = "I")
    private int field2118 = 0;

    @OriginalMember(owner = "client!ak", name = "T", descriptor = "[S")
    private short[] field2121 = new short[257];

    @OriginalMember(owner = "client!ak", name = "S", descriptor = "Ljava/lang/String;")
    public static String field2120 = "Please wait - attempting to reestablish.";

    @OriginalMember(owner = "client!ak", name = "V", descriptor = "Ljava/lang/String;")
    public static String field2123 = "Close";

    @OriginalMember(owner = "client!ak", name = "J", descriptor = "Z")
    public static boolean field2111 = true;

    @OriginalMember(owner = "client!ak", name = "R", descriptor = "[I")
    public static int[] field2119 = new int[256];

    @OriginalMember(owner = "client!ak", name = "L", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!ak", name = "M", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!ak", name = "O", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!ak", name = "P", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!ak", name = "U", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!ak", name = "W", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!ak", name = "X", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!ak", name = "Y", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!ak", name = "bb", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!ak", name = "db", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!ak", name = "fb", descriptor = "Lac;")
    public static class139 field2133;

    @OriginalMember(owner = "client!ak", name = "N", descriptor = "Lef;")
    public static class227 field2115;

    @OriginalMember(owner = "client!ak", name = "cb", descriptor = "Lub;")
    public static class92 field2130;

    @OriginalMember(owner = "client!ak", name = "ab", descriptor = "[I")
    private int[] field2128;

    @OriginalMember(owner = "client!ak", name = "eb", descriptor = "[I")
    private int[] field2132;

    @OriginalMember(owner = "client!ak", name = "K", descriptor = "[Lt;")
    public static class207[] field2112;

    @OriginalMember(owner = "client!ak", name = "Z", descriptor = "[[I")
    private int[][] field2127;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "(I)V")
    private final void method1032(int arg0) {
        if (arg0 != 2938) {
            this.field2132 = null;
        }
        ++field2124;
        int var2 = this.field2118;
        if (var2 != 2) {
            if (var2 == 1) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; var5 < this.field2127.length + -1 && ~var4 <= ~this.field2127[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field2127[var5 + -1];
                    int[] var7 = this.field2127[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = -class214.field3290[var8 >> 5 & 255] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field2121[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~(this.field2127.length + -1) < ~var14 && ~var13 <= ~this.field2127[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field2127[var14 - 1];
                    int[] var16 = this.field2127[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] - var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field2121[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; var22 < this.field2127.length + -1 && var21 >= this.field2127[var22][0]; ++var22) {
                }
                int[] var23 = this.field2127[var22 + -1];
                int[] var24 = this.field2127[var22];
                int var25 = this.method1036(var22 - 2, true)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method1036(var22 + 1, true)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] - var23[0]);
                int var30 = -var27 + var28 - (var25 - var26);
                int var31 = var29 * var29 >> 12;
                int var32 = -var26 + -var30 + var25;
                int var33 = -var25 + var27;
                int var34 = (var29 * var30 >> 12) * var31 >> 12;
                int var35 = var29 * var33 >> 12;
                int var36 = var31 * var32 >> 12;
                int var38 = var34 + var35 - (-var36 + -var26);
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field2121[var20] = (short) var38;
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BI)[I")
    public final int[] method40(byte arg0, int arg1) {
        if (arg0 < 14) {
            method1037(-8);
        }
        ++field2116;
        int[] var3 = super.field3588.method1611(0, arg1);
        if (super.field3588.field3722) {
            int[] var4 = this.method1533(0, arg1, -68);
            for (int var5 = 0; ~var5 > ~class250.field4008; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field2121[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lha;IB)V")
    public final void method37(class31 arg0, int arg1, byte arg2) {
        ++field2131;
        if (arg2 != 102) {
            method1033(80, -29, -60);
        }
        if (arg1 == 0) {
            this.field2118 = arg0.method265(-118);
            this.field2127 = new int[arg0.method265(arg2 + -210)][2];
            for (int var4 = 0; var4 < this.field2127.length; ++var4) {
                this.field2127[var4][0] = arg0.method260((byte) -67);
                this.field2127[var4][1] = arg0.method260((byte) -67);
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(I)V")
    public final void method43(int arg0) {
        if (this.field2127 == null) {
            this.field2127 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field2113;
        if (~this.field2127.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field2118 == 2) {
                this.method1035((byte) 126);
            }
            class298.method2000((byte) -121);
            if (arg0 == 500) {
                this.method1032(2938);
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(III)V")
    public static final void method1033(int arg0, int arg1, int arg2) {
        ++field2117;
        if (arg2 != -306674912) {
            field2130 = null;
        }
        class69 var3 = class255.method1723((byte) 32, arg1, 5);
        var3.method556((byte) -113);
        var3.field1091 = arg0;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(II)V")
    public static final void method1034(int arg0, int arg1) {
        ++field2129;
        if (class48.method401(109, arg1)) {
            if (arg0 < 71) {
                method1037(28);
            }
            class222[] var2 = class8.field144[arg1];
            for (int var3 = 0; ~var2.length < ~var3; ++var3) {
                class222 var4 = var2[var3];
                if (var4 != null) {
                    var4.field3498 = 0;
                    var4.field3470 = 1;
                    var4.field3442 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(B)V")
    private final void method1035(byte arg0) {
        ++field2126;
        int[] var2 = this.field2127[0];
        int[] var3 = this.field2127[1];
        int[] var4 = this.field2127[this.field2127.length + -2];
        int[] var5 = this.field2127[this.field2127.length + -1];
        this.field2132 = new int[] { -var3[0] - (-var2[0] - var2[0]), -var3[1] - -var2[1] + var2[1] };
        if (arg0 >= 92) {
            this.field2128 = new int[] { var4[0] + var4[0] + -var5[0], var4[1] + -var5[1] + var4[1] };
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZ)[I")
    private final int[] method1036(int arg0, boolean arg1) {
        ++field2114;
        if (~arg0 > -1) {
            return this.field2132;
        } else if (this.field2127.length <= arg0) {
            return this.field2128;
        } else {
            return !arg1 ? null : this.field2127[arg0];
        }
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "()V")
    public class142() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "(I)I")
    public static final int method1037(int arg0) {
        int var1 = 116 / ((-70 - arg0) / 33);
        ++field2125;
        if (class183.field2895 == null) {
            return -1;
        } else {
            while (~class183.field2895.field4783 < ~class168.field2527) {
                if (class183.field2895.method1993((byte) -127, class168.field2527)) {
                    return class168.field2527++;
                }
                ++class168.field2527;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZIIIZIZ)V")
    public static final void method1038(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        ++field2122;
        if (~arg3 > ~arg2) {
            int var7 = (arg2 + arg3) / 2;
            int var8 = arg3;
            class98 var9 = class261.field4126[var7];
            class261.field4126[var7] = class261.field4126[arg2];
            class261.field4126[arg2] = var9;
            for (int var10 = arg3; ~arg2 < ~var10; ++var10) {
                if (~class102.method780(arg5, arg4, class261.field4126[var10], arg1, 0, var9, arg0) >= -1) {
                    class98 var11 = class261.field4126[var10];
                    class261.field4126[var10] = class261.field4126[var8];
                    class261.field4126[var8++] = var11;
                }
            }
            class261.field4126[arg2] = class261.field4126[var8];
            class261.field4126[var8] = var9;
            method1038(arg0, arg1, var8 + -1, arg3, arg4, arg5, arg6);
            method1038(arg0, arg1, arg2, var8 + 1, arg4, arg5, false);
        }
        if (arg6) {
            method1033(-61, -41, -108);
        }
    }

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "(B)V")
    public static void method1039(byte arg0) {
        field2130 = null;
        field2119 = null;
        field2120 = null;
        if (arg0 != -3) {
            method1033(-112, -122, -113);
        }
        field2115 = null;
        field2112 = null;
        field2123 = null;
        field2133 = null;
    }

    static {
        for (int var0 = 0; var0 < 256; ++var0) {
            int var1 = var0;
            for (int var2 = 0; ~var2 > -9; ++var2) {
                if (~(1 & var1) == -2) {
                    var1 = var1 >>> 1 ^ -306674912;
                } else {
                    var1 >>>= 1;
                }
            }
            field2119[var0] = var1;
        }
    }
}
