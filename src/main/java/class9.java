import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class9 extends class8 {

    @OriginalMember(owner = "client!ig", name = "R", descriptor = "I")
    private int field125 = 1638;

    @OriginalMember(owner = "client!ig", name = "K", descriptor = "I")
    private int field119 = 4;

    @OriginalMember(owner = "client!ig", name = "T", descriptor = "[B")
    private byte[] field127 = new byte[512];

    @OriginalMember(owner = "client!ig", name = "bb", descriptor = "I")
    private int field135 = 4;

    @OriginalMember(owner = "client!ig", name = "J", descriptor = "I")
    private int field118 = 4;

    @OriginalMember(owner = "client!ig", name = "eb", descriptor = "Z")
    private boolean field138 = true;

    @OriginalMember(owner = "client!ig", name = "Z", descriptor = "I")
    private int field133 = 0;

    @OriginalMember(owner = "client!ig", name = "M", descriptor = "[[B")
    public static byte[][] field120 = new byte[1000][];

    @OriginalMember(owner = "client!ig", name = "U", descriptor = "I")
    public static int field128 = 100;

    @OriginalMember(owner = "client!ig", name = "ab", descriptor = "Z")
    public static boolean field134 = false;

    @OriginalMember(owner = "client!ig", name = "I", descriptor = "Lvj;")
    public static class115 field117 = new class115();

    @OriginalMember(owner = "client!ig", name = "N", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!ig", name = "O", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!ig", name = "S", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!ig", name = "V", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!ig", name = "W", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!ig", name = "X", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!ig", name = "cb", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!ig", name = "db", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!ig", name = "fb", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!ig", name = "Q", descriptor = "[I")
    public static int[] field124;

    @OriginalMember(owner = "client!ig", name = "P", descriptor = "[S")
    private short[] field123;

    @OriginalMember(owner = "client!ig", name = "Y", descriptor = "[S")
    private short[] field132;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "(I)V")
    public static void method67(int arg0) {
        field124 = null;
        if (arg0 < -16) {
            field120 = null;
            field117 = null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(B)V")
    private final void method68(byte arg0) {
        if (arg0 >= -70) {
            this.field119 = -65;
        }
        if (~this.field125 >= -1) {
            if (this.field123 != null && this.field123.length == this.field118) {
                this.field132 = new short[this.field118];
                for (int var2 = 0; this.field118 > var2; ++var2) {
                    this.field132[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            }
        } else {
            this.field132 = new short[this.field118];
            this.field123 = new short[this.field118];
            for (int var3 = 0; this.field118 > var3; ++var3) {
                this.field123[var3] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field125 / 4096.0F), (double) var3)));
                this.field132[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        ++field126;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I[II)V")
    private final void method69(int arg0, int[] arg1, int arg2) {
        ++field129;
        int var4 = class182.field2864[arg0] * this.field135;
        if (arg2 != 0) {
            method67(122);
        }
        if (this.field118 != 1) {
            short var5 = this.field123[0];
            if (~var5 < -9 || var5 < -8) {
                int var6 = this.field132[0] << 12;
                int var7 = var4 * var6 >> 12;
                int var8 = this.field135 * var6 >> 12;
                int var9 = var7 >> 12;
                int var10 = this.field119 * var6 >> 12;
                int var11 = var9 - -1;
                int var12 = var7 & 4095;
                int var13 = class107.field1766[var12];
                int var14 = this.field127[255 & var9] & 255;
                if (var11 >= var8) {
                    var11 = 0;
                }
                int var15 = 255 & this.field127[var11 & 255];
                for (int var16 = 0; var16 < class231.field3798; ++var16) {
                    int var36 = class176.field2776[var16] * this.field119;
                    int var37 = this.method71(var10, var12, var6 * var36 >> 12, var15, var14, var13, (byte) 90);
                    arg1[var16] = var5 * var37 >> 12;
                }
            }
            for (int var17 = 1; this.field118 > var17; ++var17) {
                short var18 = this.field123[var17];
                if (var18 > 8 || var18 < -8) {
                    int var19 = this.field132[var17] << 12;
                    int var20 = var4 * var19 >> 12;
                    int var21 = this.field119 * var19 >> 12;
                    int var22 = var20 >> 12;
                    int var23 = 255 & this.field127[255 & var22];
                    int var24 = this.field135 * var19 >> 12;
                    int var25 = var22 + 1;
                    int var26 = var20 & 4095;
                    int var27 = class107.field1766[var26];
                    if (~var25 <= ~var24) {
                        var25 = 0;
                    }
                    int var28 = 255 & this.field127[var25 & 255];
                    if (this.field138 && this.field118 + -1 == var17) {
                        for (int var29 = 0; ~class231.field3798 < ~var29; ++var29) {
                            int var30 = class176.field2776[var29] * this.field119;
                            int var31 = this.method71(var21, var26, var19 * var30 >> 12, var28, var23, var27, (byte) 102);
                            int var32 = arg1[var29] - -(var18 * var31 >> 12);
                            arg1[var29] = (var32 >> 1) + 2048;
                        }
                    } else {
                        for (int var33 = 0; class231.field3798 > var33; ++var33) {
                            int var34 = class176.field2776[var33] * this.field119;
                            int var35 = this.method71(var21, var26, var19 * var34 >> 12, var28, var23, var27, (byte) 124);
                            arg1[var33] += var18 * var35 >> 12;
                        }
                    }
                }
            }
        } else {
            short var38 = this.field123[0];
            int var39 = this.field132[0] << 12;
            int var40 = this.field119 * var39 >> 12;
            int var41 = var4 * var39 >> 12;
            int var42 = var41 >> 12;
            int var43 = this.field127[var42 & 255] & 255;
            int var44 = var41 & 4095;
            int var45 = var42 + 1;
            int var46 = this.field135 * var39 >> 12;
            int var47 = class107.field1766[var44];
            if (var46 <= var45) {
                var45 = 0;
            }
            int var48 = this.field127[var45 & 255] & 255;
            if (this.field138) {
                for (int var49 = 0; ~var49 > ~class231.field3798; ++var49) {
                    int var50 = class176.field2776[var49] * this.field119;
                    int var51 = this.method71(var40, var44, var39 * var50 >> 12, var48, var43, var47, (byte) 96);
                    int var52 = var38 * var51 >> 12;
                    arg1[var49] = (var52 >> 1) + 2048;
                }
            } else {
                for (int var53 = 0; var53 < class231.field3798; ++var53) {
                    int var54 = class176.field2776[var53] * this.field119;
                    int var55 = this.method71(var40, var44, var39 * var54 >> 12, var48, var43, var47, (byte) 102);
                    arg1[var53] = var38 * var55 >> 12;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(III)I")
    public static final int method70(int arg0, int arg1, int arg2) {
        class239 var3 = (class239) class214.field3502.method1400((long) arg0, true);
        ++field121;
        if (var3 == null) {
            return 0;
        } else if (arg2 >= 0 && var3.field3879.length > arg2) {
            return arg1 != 11594 ? 23 : var3.field3879[arg2];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIIIB)I")
    private final int method71(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        ++field122;
        if (arg6 <= 88) {
            field117 = null;
        }
        int var8 = arg1 + -4096;
        int var9 = arg2 >> 12;
        int var10 = arg2 & 4095;
        int var11 = var9 + 1;
        int var12 = var10 + -4096;
        int var13 = class107.field1766[var10];
        int var14 = var9 & 255;
        int var15 = 3 & this.field127[var14 - -arg4];
        int var16;
        if (~var15 >= -2) {
            var16 = ~var15 != -1 ? -var10 + arg1 : var10 - -arg1;
        } else {
            var16 = var15 != 2 ? -var10 - arg1 : -arg1 + var10;
        }
        if (var11 >= arg0) {
            var11 = 0;
        }
        int var17 = var11 & 255;
        int var18 = 3 & this.field127[arg4 + var17];
        int var19;
        if (~var18 >= -2) {
            var19 = ~var18 != -1 ? arg1 - var12 : var12 - -arg1;
        } else {
            var19 = ~var18 == -3 ? -arg1 + var12 : -var12 - arg1;
        }
        int var20 = 3 & this.field127[var14 - -arg3];
        int var21 = var16 - -((-var16 + var19) * var13 >> 12);
        int var22;
        if (var20 > 1) {
            var22 = var20 != 2 ? -var10 - var8 : var10 - var8;
        } else {
            var22 = ~var20 == -1 ? var10 - -var8 : -var10 + var8;
        }
        int var23 = 3 & this.field127[var17 - -arg3];
        int var24;
        if (var23 > 1) {
            var24 = ~var23 == -3 ? var12 - var8 : -var8 + -var12;
        } else {
            var24 = ~var23 != -1 ? -var12 + var8 : var8 + var12;
        }
        int var25 = ((-var22 + var24) * var13 >> 12) + var22;
        return ((-var21 + var25) * arg5 >> 12) + var21;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BLog;I)V")
    public final void method64(byte arg0, class221 arg1, int arg2) {
        ++field130;
        if (arg0 <= 62) {
            this.field132 = null;
        }
        if (arg2 != 0) {
            if (arg2 == 1) {
                this.field118 = arg1.method1517((byte) -96);
            } else {
                if (arg2 != 2) {
                    if (~arg2 == -4) {
                        this.field119 = this.field135 = arg1.method1517((byte) -96);
                        return;
                    }
                    if (arg2 == 4) {
                        this.field133 = arg1.method1517((byte) -96);
                        return;
                    }
                    if (~arg2 == -6) {
                        this.field119 = arg1.method1517((byte) -96);
                        return;
                    }
                    if (~arg2 == -7) {
                        this.field135 = arg1.method1517((byte) -96);
                        return;
                    }
                } else {
                    this.field125 = arg1.method1550(-112);
                    if (~this.field125 > -1) {
                        this.field123 = new short[this.field118];
                        for (int var5 = 0; ~this.field118 < ~var5; ++var5) {
                            this.field123[var5] = (short) arg1.method1550(-109);
                        }
                        return;
                    }
                }
            }
        } else {
            this.field138 = arg1.method1517((byte) -96) == 1;
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(II)[I")
    public final int[] method44(int arg0, int arg1) {
        if (arg0 != 3) {
            this.field123 = null;
        }
        int[] var3 = super.field110.method1585(0, arg1);
        if (super.field110.field3734) {
            this.method69(arg1, var3, 0);
        }
        ++field137;
        return var3;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BC)Z")
    public static final boolean method72(byte arg0, char arg1) {
        ++field136;
        if (~arg1 <= -33 && arg1 <= '~') {
            return true;
        } else if (arg1 >= 160 && ~arg1 >= -256) {
            return true;
        } else if (arg1 != 8364 && ~arg1 != -339 && arg1 != 8212 && ~arg1 != -340 && ~arg1 != -377) {
            int var2 = -34 / ((-67 - arg0) / 43);
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZBZIZ)Lqh;")
    public static final class201 method73(boolean arg0, byte arg1, boolean arg2, int arg3, boolean arg4) {
        ++field131;
        class146 var5 = null;
        if (class194.field3104 != null) {
            var5 = new class146(arg3, class194.field3104, class111.field1841[arg3], 1000000);
        }
        if (arg1 >= -83) {
            method70(100, -22, -122);
        }
        class247.field3931[arg3] = class266.field4219.method1265(arg3, var5, class123.field2004, -1);
        if (arg0) {
            class247.field3931[arg3].method1879((byte) -124);
        }
        return new class201(class247.field3931[arg3], arg2, arg4);
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V")
    public class9() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(Z)V")
    public final void method66(boolean arg0) {
        ++field139;
        this.field127 = class239.method1655(this.field133, arg0);
        this.method68((byte) -94);
        for (int var2 = this.field118 + -1; var2 >= 1; --var2) {
            short var3 = this.field123[var2];
            if (~var3 < -9 || var3 < -8) {
                return;
            }
            --this.field118;
        }
    }
}
