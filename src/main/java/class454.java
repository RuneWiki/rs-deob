import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class454 extends class694 {

    @OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
    private int field6323 = 0;

    @OriginalMember(owner = "client!jb", name = "I", descriptor = "I")
    private int field6324 = 1024;

    @OriginalMember(owner = "client!jb", name = "M", descriptor = "I")
    private int field6328 = 409;

    @OriginalMember(owner = "client!jb", name = "P", descriptor = "I")
    private int field6331 = 81;

    @OriginalMember(owner = "client!jb", name = "ab", descriptor = "I")
    private int field6342 = 8;

    @OriginalMember(owner = "client!jb", name = "V", descriptor = "I")
    private int field6337 = 1024;

    @OriginalMember(owner = "client!jb", name = "Y", descriptor = "I")
    private int field6340 = 204;

    @OriginalMember(owner = "client!jb", name = "L", descriptor = "I")
    private int field6327 = 4;

    @OriginalMember(owner = "client!jb", name = "S", descriptor = "[I")
    public static int[] field6334 = new int[4];

    @OriginalMember(owner = "client!jb", name = "bb", descriptor = "I")
    public static int field6343 = 0;

    @OriginalMember(owner = "client!jb", name = "F", descriptor = "I")
    public static int field6321;

    @OriginalMember(owner = "client!jb", name = "J", descriptor = "I")
    private int field6325;

    @OriginalMember(owner = "client!jb", name = "N", descriptor = "I")
    public static int field6329;

    @OriginalMember(owner = "client!jb", name = "O", descriptor = "I")
    public static int field6330;

    @OriginalMember(owner = "client!jb", name = "Q", descriptor = "I")
    private int field6332;

    @OriginalMember(owner = "client!jb", name = "T", descriptor = "I")
    private int field6335;

    @OriginalMember(owner = "client!jb", name = "U", descriptor = "I")
    public static int field6336;

    @OriginalMember(owner = "client!jb", name = "W", descriptor = "I")
    public static int field6338;

    @OriginalMember(owner = "client!jb", name = "X", descriptor = "I")
    public static int field6339;

    @OriginalMember(owner = "client!jb", name = "Z", descriptor = "I")
    public static int field6341;

    @OriginalMember(owner = "client!jb", name = "R", descriptor = "[I")
    private int[] field6333;

    @OriginalMember(owner = "client!jb", name = "G", descriptor = "[[I")
    private int[][] field6322;

    @OriginalMember(owner = "client!jb", name = "K", descriptor = "[[I")
    private int[][] field6326;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII)V", line = 3)
    public static final void method2602(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 >= -89) {
            method2602(-10, -93, 6, 103);
        }
        ++field6338;
        class667 var4 = class568.field7648[arg1][arg2];
        class591.method3290(var4 != null ? var4 : class46.field694, arg0, false);
    }

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "(I)V", line = 18)
    public final void method40(int arg0) {
        this.method2606(90);
        if (arg0 > 5) {
            ++field6321;
        }
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(III)Z", line = 29)
    public static final boolean method2603(int arg0, int arg1, int arg2) {
        ++field6329;
        if (arg0 != 4096) {
            method2602(121, -98, -10, -43);
        }
        return class10.method50(arg1, arg2, -121) & class250.method1547(arg2, arg1, (byte) 116);
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V", line = 159)
    public class454() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)[I", line = 59)
    public final int[] method39(int arg0, int arg1) {
        if (arg0 <= 112) {
            return null;
        } else {
            ++field6336;
            int[] var3 = super.field9751.method2712(arg1, (byte) 118);
            if (super.field9751.field6674) {
                int var4 = 0;
                int var5;
                for (var5 = class105.field1409[arg1] + this.field6323; ~var5 > -1; var5 += 4096) {
                }
                while (~var5 < -4097) {
                    var5 -= 4096;
                }
                while (~var4 > ~this.field6342 && var5 >= this.field6333[var4]) {
                    ++var4;
                }
                int var6 = var4 + -1;
                boolean var7 = ~(1 & var4) == -1;
                int var8 = this.field6333[var4];
                int var9 = this.field6333[var4 + -1];
                if (~(var9 - -this.field6335) > ~var5 && ~(-this.field6335 + var8) < ~var5) {
                    for (int var10 = 0; ~var10 > ~class465.field6544; ++var10) {
                        int var11 = 0;
                        int var12 = !var7 ? -this.field6337 : this.field6337;
                        int var13;
                        for (var13 = (this.field6332 * var12 >> 12) + class346.field4994[var10]; ~var13 > -1; var13 += 4096) {
                        }
                        while (var13 > 4096) {
                            var13 -= 4096;
                        }
                        while (this.field6327 > var11 && var13 >= this.field6322[var6][var11]) {
                            ++var11;
                        }
                        int var14 = var11 + -1;
                        int var15 = this.field6322[var6][var11];
                        int var16 = this.field6322[var6][var14];
                        if (~(this.field6335 + var16) > ~var13 && var13 < -this.field6335 + var15) {
                            var3[var10] = this.field6326[var6][var14];
                        } else {
                            var3[var10] = 0;
                        }
                    }
                } else {
                    class282.method1705(var3, 0, class465.field6544, 0);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V", line = 169)
    public static void method2604(byte arg0) {
        field6334 = null;
        if (arg0 != -76) {
            field6343 = -109;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILjr;B)V", line = 190)
    public final void method19(int arg0, class96 arg1, byte arg2) {
        int var4 = 30 / ((arg2 - 58) / 63);
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (~arg0 != -7) {
                                    if (~arg0 == -8) {
                                        this.field6324 = arg1.method743((byte) -70);
                                    }
                                } else {
                                    this.field6331 = arg1.method743((byte) -20);
                                }
                            } else {
                                this.field6323 = arg1.method743((byte) -103);
                            }
                        } else {
                            this.field6337 = arg1.method743((byte) -86);
                        }
                    } else {
                        this.field6340 = arg1.method743((byte) -83);
                    }
                } else {
                    this.field6328 = arg1.method743((byte) -61);
                }
            } else {
                this.field6342 = arg1.method718(81);
            }
        } else {
            this.field6327 = arg1.method718(87);
        }
        ++field6330;
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(II)V", line = 288)
    public static final void method2605(int arg0, int arg1) {
        class166.field2516 = new int[arg0];
        ++field6339;
        if (arg1 == 10159) {
            class363.field5181 = new int[arg0];
            class57.field802 = new int[arg0];
            class551.field7457 = new int[arg0];
            class245.field3496 = new int[arg0];
        }
    }

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "(I)V", line = 304)
    private final void method2606(int arg0) {
        ++field6341;
        if (arg0 < 29) {
            this.field6323 = 91;
        }
        Random var2 = new Random((long) this.field6342);
        this.field6335 = this.field6331 / 2;
        this.field6332 = 4096 / this.field6327;
        this.field6325 = 4096 / this.field6342;
        int var3 = this.field6332 / 2;
        this.field6333 = new int[this.field6342 + 1];
        this.field6322 = new int[this.field6342][this.field6327 + 1];
        int var4 = this.field6325 / 2;
        this.field6326 = new int[this.field6342][this.field6327];
        this.field6333[0] = 0;
        for (int var5 = 0; var5 < this.field6342; ++var5) {
            if (var5 > 0) {
                int var6 = this.field6325;
                int var7 = (class433.method2492((byte) 0, var2, 4096) - 2048) * this.field6340 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field6333[var5] = this.field6333[var5 - 1] - -var8;
            }
            this.field6322[var5][0] = 0;
            for (int var9 = 0; this.field6327 > var9; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field6332;
                    int var11 = (class433.method2492((byte) 0, var2, 4096) - 2048) * this.field6328 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field6322[var5][var9] = this.field6322[var5][var9 - 1] + var12;
                }
                this.field6326[var5][var9] = this.field6324 > 0 ? 4096 + -class433.method2492((byte) 0, var2, this.field6324) : 4096;
            }
            this.field6322[var5][this.field6327] = 4096;
        }
        this.field6333[this.field6342] = 4096;
    }
}
