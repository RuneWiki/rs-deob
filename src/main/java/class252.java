import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class252 extends class529 {

    @OriginalMember(owner = "client!fi", name = "F", descriptor = "I")
    private int field3186 = 1024;

    @OriginalMember(owner = "client!fi", name = "I", descriptor = "I")
    private int field3189 = 0;

    @OriginalMember(owner = "client!fi", name = "P", descriptor = "I")
    private int field3195 = 4;

    @OriginalMember(owner = "client!fi", name = "T", descriptor = "I")
    private int field3199 = 409;

    @OriginalMember(owner = "client!fi", name = "R", descriptor = "I")
    private int field3197 = 81;

    @OriginalMember(owner = "client!fi", name = "E", descriptor = "I")
    private int field3185 = 8;

    @OriginalMember(owner = "client!fi", name = "S", descriptor = "I")
    private int field3198 = 204;

    @OriginalMember(owner = "client!fi", name = "Z", descriptor = "I")
    private int field3205 = 1024;

    @OriginalMember(owner = "client!fi", name = "M", descriptor = "[[I")
    public static int[][] field3192 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!fi", name = "Y", descriptor = "[I")
    public static int[] field3204 = null;

    @OriginalMember(owner = "client!fi", name = "D", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!fi", name = "J", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!fi", name = "K", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!fi", name = "N", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!fi", name = "Q", descriptor = "I")
    private int field3196;

    @OriginalMember(owner = "client!fi", name = "U", descriptor = "I")
    private int field3200;

    @OriginalMember(owner = "client!fi", name = "V", descriptor = "I")
    private int field3201;

    @OriginalMember(owner = "client!fi", name = "W", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!fi", name = "X", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!fi", name = "O", descriptor = "[I")
    private int[] field3194;

    @OriginalMember(owner = "client!fi", name = "G", descriptor = "[[I")
    private int[][] field3187;

    @OriginalMember(owner = "client!fi", name = "H", descriptor = "[[I")
    private int[][] field3188;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "(B)V")
    public static final void method1530(byte arg0) {
        ++field3203;
        class112 var1 = null;
        if (arg0 <= 51) {
            method1530((byte) -15);
        }
        try {
            class435 var2 = class681.field9312.method1552(-12111, true, "");
            while (~var2.field6124 == -1) {
                class517.method2965(1L, -85);
            }
            if (~var2.field6124 == -2) {
                var1 = (class112) var2.field6123;
                class179 var3 = class223.field2944.method341((byte) 122);
                var1.method759(-1, var3.field2325, 0, var3.field2354);
            }
        } catch (Exception var5) {
        }
        try {
            if (var1 != null) {
                var1.method756(-1);
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "(I)V")
    private final void method1531(int arg0) {
        ++field3202;
        Random var2 = new Random((long) this.field3185);
        this.field3196 = 4096 / this.field3185;
        this.field3201 = this.field3197 / 2;
        this.field3200 = 4096 / this.field3195;
        int var3 = this.field3200 / 2;
        if (arg0 != 1) {
            this.field3201 = 17;
        }
        this.field3194 = new int[this.field3185 - -1];
        int var4 = this.field3196 / 2;
        this.field3187 = new int[this.field3185][this.field3195 - -1];
        this.field3188 = new int[this.field3185][this.field3195];
        this.field3194[0] = 0;
        for (int var5 = 0; this.field3185 > var5; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field3196;
                int var7 = (-2048 + class408.method2420((byte) 121, var2, 4096)) * this.field3198 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field3194[var5] = this.field3194[var5 + -1] + var8;
            }
            this.field3187[var5][0] = 0;
            for (int var9 = 0; this.field3195 > var9; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field3200;
                    int var11 = (class408.method2420((byte) 44, var2, 4096) - 2048) * this.field3199 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field3187[var5][var9] = this.field3187[var5][var9 - 1] + var12;
                }
                this.field3188[var5][var9] = this.field3205 > 0 ? 4096 - class408.method2420((byte) -117, var2, this.field3205) : 4096;
            }
            this.field3187[var5][this.field3195] = 4096;
        }
        this.field3194[this.field3185] = 4096;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IB)[I")
    public final int[] method191(int arg0, byte arg1) {
        ++field3190;
        int[] var3 = super.field7456.method1635(arg0, -57);
        int var4 = 5 % ((27 - arg1) / 49);
        if (super.field7456.field3449) {
            int var5 = 0;
            int var6;
            for (var6 = class310.field3960[arg0] + this.field3189; var6 < 0; var6 += 4096) {
            }
            while (var6 > 4096) {
                var6 -= 4096;
            }
            while (~this.field3185 < ~var5 && ~var6 <= ~this.field3194[var5]) {
                ++var5;
            }
            int var7 = var5 + -1;
            boolean var8 = ~(1 & var5) == -1;
            int var9 = this.field3194[var5];
            int var10 = this.field3194[var5 - 1];
            if (var6 > this.field3201 + var10 && -this.field3201 + var9 > var6) {
                for (int var11 = 0; ~var11 > ~class304.field3909; ++var11) {
                    int var12 = !var8 ? -this.field3186 : this.field3186;
                    int var13 = 0;
                    int var14;
                    for (var14 = (this.field3200 * var12 >> 12) + class225.field2973[var11]; ~var14 > -1; var14 += 4096) {
                    }
                    while (var14 > 4096) {
                        var14 -= 4096;
                    }
                    while (var13 < this.field3195 && ~var14 <= ~this.field3187[var7][var13]) {
                        ++var13;
                    }
                    int var15 = var13 + -1;
                    int var16 = this.field3187[var7][var15];
                    int var17 = this.field3187[var7][var13];
                    if (~var14 < ~(this.field3201 + var16) && var14 < -this.field3201 + var17) {
                        var3[var11] = this.field3188[var7][var15];
                    } else {
                        var3[var11] = 0;
                    }
                }
            } else {
                class617.method3388(var3, 0, class304.field3909, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
    public class252() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)V")
    public final void method303(int arg0) {
        ++field3184;
        this.method1531(1);
        if (arg0 >= -92) {
            this.field3201 = 112;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IBLtn;)V")
    public final void method190(int arg0, byte arg1, class179 arg2) {
        ++field3193;
        if (arg1 <= 45) {
            this.field3189 = 76;
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (~arg0 != -7) {
                                    if (~arg0 == -8) {
                                        this.field3205 = arg2.method1107(false);
                                    }
                                } else {
                                    this.field3197 = arg2.method1107(false);
                                }
                            } else {
                                this.field3189 = arg2.method1107(false);
                            }
                        } else {
                            this.field3186 = arg2.method1107(false);
                        }
                    } else {
                        this.field3198 = arg2.method1107(false);
                    }
                } else {
                    this.field3199 = arg2.method1107(false);
                }
            } else {
                this.field3185 = arg2.method1094(255);
            }
        } else {
            this.field3195 = arg2.method1094(255);
        }
    }

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "(I)V")
    public static void method1532(int arg0) {
        if (arg0 != 15887) {
            method1530((byte) 72);
        }
        field3204 = null;
        field3192 = null;
    }
}
