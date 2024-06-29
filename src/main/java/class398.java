import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class398 extends class305 {

    @OriginalMember(owner = "client!au", name = "J", descriptor = "I")
    private int field5870 = 8;

    @OriginalMember(owner = "client!au", name = "H", descriptor = "I")
    private int field5868 = 1024;

    @OriginalMember(owner = "client!au", name = "F", descriptor = "I")
    private int field5866 = 0;

    @OriginalMember(owner = "client!au", name = "K", descriptor = "I")
    private int field5871 = 204;

    @OriginalMember(owner = "client!au", name = "E", descriptor = "I")
    private int field5865 = 81;

    @OriginalMember(owner = "client!au", name = "Q", descriptor = "I")
    private int field5877 = 409;

    @OriginalMember(owner = "client!au", name = "S", descriptor = "I")
    private int field5879 = 4;

    @OriginalMember(owner = "client!au", name = "ab", descriptor = "I")
    private int field5887 = 1024;

    @OriginalMember(owner = "client!au", name = "V", descriptor = "Ljp;")
    public static class55 field5882 = new class55(36, 8);

    @OriginalMember(owner = "client!au", name = "G", descriptor = "I")
    public static int field5867;

    @OriginalMember(owner = "client!au", name = "I", descriptor = "I")
    public static int field5869;

    @OriginalMember(owner = "client!au", name = "M", descriptor = "I")
    public static int field5873;

    @OriginalMember(owner = "client!au", name = "N", descriptor = "I")
    private int field5874;

    @OriginalMember(owner = "client!au", name = "O", descriptor = "I")
    private int field5875;

    @OriginalMember(owner = "client!au", name = "R", descriptor = "I")
    public static int field5878;

    @OriginalMember(owner = "client!au", name = "T", descriptor = "I")
    public static int field5880;

    @OriginalMember(owner = "client!au", name = "U", descriptor = "I")
    public static int field5881;

    @OriginalMember(owner = "client!au", name = "W", descriptor = "I")
    public static int field5883;

    @OriginalMember(owner = "client!au", name = "X", descriptor = "I")
    private int field5884;

    @OriginalMember(owner = "client!au", name = "Z", descriptor = "I")
    public static int field5886;

    @OriginalMember(owner = "client!au", name = "bb", descriptor = "Lwk;")
    public static class329 field5888;

    @OriginalMember(owner = "client!au", name = "P", descriptor = "Lfi;")
    public static class38 field5876;

    @OriginalMember(owner = "client!au", name = "L", descriptor = "[I")
    private int[] field5872;

    @OriginalMember(owner = "client!au", name = "D", descriptor = "[[I")
    private int[][] field5864;

    @OriginalMember(owner = "client!au", name = "Y", descriptor = "[[I")
    private int[][] field5885;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IIIIIII)I", line = 3)
    public static final int method2508(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg3 & 3;
        if ((1 & arg5) == 1) {
            int var8 = arg1;
            arg1 = arg6;
            arg6 = var8;
        }
        ++field5880;
        if (arg0 != 32) {
            field5888 = null;
        }
        if (~var7 == -1) {
            return arg2;
        } else if (~var7 == -2) {
            return arg4;
        } else {
            return var7 == 2 ? -arg2 + 7 - (arg1 + -1) : -arg4 + 8 + -arg6;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(B)V", line = 37)
    public final void method17(byte arg0) {
        this.method2510((byte) 108);
        if (arg0 != -62) {
            this.field5868 = -31;
        }
        ++field5878;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(BIII)I", line = 52)
    public static final int method2509(byte arg0, int arg1, int arg2, int arg3) {
        ++field5881;
        int var4 = arg2 & 3;
        if (~var4 == -1) {
            return arg3;
        } else {
            if (arg0 < 119) {
                field5882 = null;
            }
            if (~var4 == -2) {
                return arg1;
            } else {
                return var4 == 2 ? 7 - arg3 : -arg1 + 7;
            }
        }
    }

    @OriginalMember(owner = "client!au", name = "<init>", descriptor = "()V", line = 76)
    public class398() {
        super(0, true);
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(ILfh;B)V", line = 89)
    public final void method14(int arg0, class194 arg1, byte arg2) {
        ++field5869;
        if (arg2 < 76) {
            this.field5875 = 4;
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (arg0 != 6) {
                                    if (~arg0 == -8) {
                                        this.field5887 = arg1.method1396(-123);
                                    }
                                } else {
                                    this.field5865 = arg1.method1396(-108);
                                }
                            } else {
                                this.field5866 = arg1.method1396(117);
                            }
                        } else {
                            this.field5868 = arg1.method1396(32);
                        }
                    } else {
                        this.field5871 = arg1.method1396(-121);
                    }
                } else {
                    this.field5877 = arg1.method1396(-102);
                }
            } else {
                this.field5870 = arg1.method1337((byte) -128);
            }
        } else {
            this.field5879 = arg1.method1337((byte) 117);
        }
    }

    @OriginalMember(owner = "client!au", name = "e", descriptor = "(B)V", line = 175)
    private final void method2510(byte arg0) {
        ++field5883;
        Random var2 = new Random((long) this.field5870);
        this.field5884 = this.field5865 / 2;
        this.field5874 = 4096 / this.field5879;
        this.field5875 = 4096 / this.field5870;
        int var3 = this.field5874 / 2;
        this.field5885 = new int[this.field5870][this.field5879 - -1];
        int var4 = this.field5875 / 2;
        if (arg0 < 81) {
            this.field5885 = null;
        }
        this.field5872 = new int[this.field5870 - -1];
        this.field5864 = new int[this.field5870][this.field5879];
        this.field5872[0] = 0;
        for (int var5 = 0; ~var5 > ~this.field5870; ++var5) {
            if (var5 > 0) {
                int var6 = this.field5875;
                int var7 = (class58.method378(false, 4096, var2) - 2048) * this.field5871 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field5872[var5] = this.field5872[var5 + -1] + var8;
            }
            this.field5885[var5][0] = 0;
            for (int var9 = 0; ~this.field5879 < ~var9; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field5874;
                    int var11 = (-2048 + class58.method378(false, 4096, var2)) * this.field5877 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field5885[var5][var9] = this.field5885[var5][var9 + -1] - -var12;
                }
                this.field5864[var5][var9] = ~this.field5887 < -1 ? -class58.method378(false, this.field5887, var2) + 4096 : 4096;
            }
            this.field5885[var5][this.field5879] = 4096;
        }
        this.field5872[this.field5870] = 4096;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(II)[I", line = 248)
    public final int[] method15(int arg0, int arg1) {
        ++field5867;
        int[] var3 = super.field4677.method2174(arg0, -115);
        if (arg1 != 4688) {
            this.field5884 = 11;
        }
        if (super.field4677.field5040) {
            int var4 = 0;
            int var5;
            for (var5 = class301.field4614[arg0] + this.field5866; ~var5 > -1; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (~this.field5870 < ~var4 && var5 >= this.field5872[var4]) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = ~(1 & var4) == -1;
            int var8 = this.field5872[var4];
            int var9 = this.field5872[var4 + -1];
            if (~(this.field5884 + var9) > ~var5 && -this.field5884 + var8 > var5) {
                for (int var10 = 0; var10 < class91.field1471; ++var10) {
                    int var11 = !var7 ? -this.field5868 : this.field5868;
                    int var12 = 0;
                    int var13;
                    for (var13 = (this.field5874 * var11 >> 12) + class78.field1298[var10]; ~var13 > -1; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (this.field5879 > var12 && this.field5885[var6][var12] <= var13) {
                        ++var12;
                    }
                    int var14 = var12 + -1;
                    int var15 = this.field5885[var6][var12];
                    int var16 = this.field5885[var6][var14];
                    if (var13 > var16 - -this.field5884 && ~var13 > ~(var15 - this.field5884)) {
                        var3[var10] = this.field5864[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class325.method2134(var3, 0, class91.field1471, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!au", name = "f", descriptor = "(I)V", line = 364)
    public static final void method2511(int arg0) {
        ++field5886;
        class242 var1 = class13.field144;
        synchronized (class13.field144) {
            class13.field144.method1630(-82);
        }
        if (arg0 != -16719) {
            method2512(-116, false);
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IZ)I", line = 377)
    public static final int method2512(int arg0, boolean arg1) {
        if (!arg1) {
            method2509((byte) 124, 71, -71, -125);
        }
        ++field5873;
        int var2 = arg0 & 63;
        int var3 = arg0 >> 6 & 3;
        if (~var2 != -19) {
            if (var2 == 19 || var2 == 21) {
                if (~var3 == -1) {
                    return 16;
                }
                if (~var3 == -2) {
                    return 32;
                }
                if (var3 == 2) {
                    return 64;
                }
                if (~var3 == -4) {
                    return 128;
                }
            }
        } else {
            if (~var3 == -1) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (~var3 == -3) {
                return 4;
            }
            if (~var3 == -4) {
                return 8;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!au", name = "g", descriptor = "(I)V", line = 433)
    public static void method2513(int arg0) {
        field5882 = null;
        field5888 = null;
        field5876 = null;
        if (arg0 != -30589) {
            field5876 = null;
        }
    }
}
