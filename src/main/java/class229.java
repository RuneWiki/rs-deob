import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class229 extends class220 {

    @OriginalMember(owner = "client!nj", name = "V", descriptor = "I")
    private int field3234 = 8;

    @OriginalMember(owner = "client!nj", name = "ab", descriptor = "I")
    private int field3239 = 1024;

    @OriginalMember(owner = "client!nj", name = "gb", descriptor = "I")
    private int field3245 = 409;

    @OriginalMember(owner = "client!nj", name = "fb", descriptor = "I")
    private int field3244 = 204;

    @OriginalMember(owner = "client!nj", name = "P", descriptor = "I")
    private int field3229 = 1024;

    @OriginalMember(owner = "client!nj", name = "mb", descriptor = "I")
    private int field3251 = 4;

    @OriginalMember(owner = "client!nj", name = "eb", descriptor = "I")
    private int field3243 = 0;

    @OriginalMember(owner = "client!nj", name = "db", descriptor = "I")
    private int field3242 = 81;

    @OriginalMember(owner = "client!nj", name = "T", descriptor = "I")
    public static int field3232 = 0;

    @OriginalMember(owner = "client!nj", name = "X", descriptor = "[I")
    public static int[] field3236 = new int[1000];

    @OriginalMember(owner = "client!nj", name = "R", descriptor = "Z")
    public static boolean field3230 = false;

    @OriginalMember(owner = "client!nj", name = "S", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!nj", name = "W", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!nj", name = "Z", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!nj", name = "bb", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!nj", name = "cb", descriptor = "I")
    private int field3241;

    @OriginalMember(owner = "client!nj", name = "jb", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!nj", name = "kb", descriptor = "I")
    private int field3249;

    @OriginalMember(owner = "client!nj", name = "lb", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!nj", name = "nb", descriptor = "I")
    private int field3252;

    @OriginalMember(owner = "client!nj", name = "hb", descriptor = "Lro;")
    public static class249 field3246;

    @OriginalMember(owner = "client!nj", name = "ib", descriptor = "[I")
    private int[] field3247;

    @OriginalMember(owner = "client!nj", name = "U", descriptor = "[[I")
    private int[][] field3233;

    @OriginalMember(owner = "client!nj", name = "Y", descriptor = "[[I")
    private int[][] field3237;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "(I)V")
    public final void method440(int arg0) {
        if (arg0 != 0) {
            this.method2(33, (byte) -104, (class265) null);
        }
        ++field3235;
        this.method1419(4096);
    }

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "(I)V")
    private final void method1419(int arg0) {
        ++field3250;
        Random var2 = new Random((long) this.field3234);
        this.field3252 = 4096 / this.field3234;
        this.field3241 = this.field3242 / 2;
        this.field3249 = 4096 / this.field3251;
        int var3 = this.field3249 / 2;
        this.field3233 = new int[this.field3234][this.field3251 + 1];
        this.field3247 = new int[this.field3234 + 1];
        this.field3237 = new int[this.field3234][this.field3251];
        int var4 = this.field3252 / 2;
        this.field3247[0] = 0;
        for (int var5 = 0; ~this.field3234 < ~var5; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field3252;
                int var7 = (class205.method1296(2044605728, var2, 4096) - 2048) * this.field3244 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field3247[var5] = this.field3247[var5 + -1] - -var8;
            }
            this.field3233[var5][0] = 0;
            for (int var9 = 0; this.field3251 > var9; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field3249;
                    int var11 = (-2048 + class205.method1296(arg0 + 2044601632, var2, 4096)) * this.field3245 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field3233[var5][var9] = this.field3233[var5][var9 - 1] + var12;
                }
                this.field3237[var5][var9] = this.field3229 <= 0 ? 4096 : -class205.method1296(class347.method2311(arg0, 2044601632), var2, this.field3229) + 4096;
            }
            this.field3233[var5][this.field3251] = 4096;
        }
        this.field3247[this.field3234] = arg0;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IBLil;)V")
    public final void method2(int arg0, byte arg1, class265 arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (~arg0 != -7) {
                                    if (~arg0 == -8) {
                                        this.field3229 = arg2.method1685(8104);
                                    }
                                } else {
                                    this.field3242 = arg2.method1685(8104);
                                }
                            } else {
                                this.field3243 = arg2.method1685(8104);
                            }
                        } else {
                            this.field3239 = arg2.method1685(arg1 + 8153);
                        }
                    } else {
                        this.field3244 = arg2.method1685(8104);
                    }
                } else {
                    this.field3245 = arg2.method1685(8104);
                }
            } else {
                this.field3234 = arg2.method1697(arg1 + 35);
            }
        } else {
            this.field3251 = arg2.method1697(70);
        }
        if (arg1 != -49) {
            method1421(-109);
        }
        ++field3238;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(BI)V")
    public static final void method1420(byte arg0, int arg1) {
        ++field3248;
        if (arg0 != 98) {
            field3232 = -12;
        }
        for (class393 var2 = class134.field1786.method953(0); var2 != null; var2 = class134.field1786.method951(0)) {
            if ((long) arg1 == (var2.field5903 >> 48 & 65535L)) {
                var2.method2574((byte) 119);
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(II)[I")
    public final int[] method43(int arg0, int arg1) {
        ++field3240;
        int[] var3 = super.field3125.method2005(arg1, (byte) -114);
        if (arg0 != -11543) {
            return null;
        } else {
            if (super.field3125.field4676) {
                int var4 = 0;
                int var5;
                for (var5 = class58.field831[arg1] - -this.field3243; ~var5 > -1; var5 += 4096) {
                }
                while (var5 > 4096) {
                    var5 -= 4096;
                }
                while (~this.field3234 < ~var4 && this.field3247[var4] <= var5) {
                    ++var4;
                }
                int var6 = var4 + -1;
                boolean var7 = ~(var4 & 1) == -1;
                int var8 = this.field3247[var4];
                int var9 = this.field3247[var4 - 1];
                if (~var5 < ~(var9 - -this.field3241) && -this.field3241 + var8 > var5) {
                    for (int var10 = 0; ~var10 > ~class344.field5043; ++var10) {
                        int var11 = 0;
                        int var12 = !var7 ? -this.field3239 : this.field3239;
                        int var13;
                        for (var13 = (this.field3249 * var12 >> 12) + class160.field2096[var10]; var13 < 0; var13 += 4096) {
                        }
                        while (~var13 < -4097) {
                            var13 -= 4096;
                        }
                        while (var11 < this.field3251 && ~this.field3233[var6][var11] >= ~var13) {
                            ++var11;
                        }
                        int var14 = var11 + -1;
                        int var15 = this.field3233[var6][var14];
                        int var16 = this.field3233[var6][var11];
                        if (var13 > this.field3241 + var15 && ~(var16 - this.field3241) < ~var13) {
                            var3[var10] = this.field3237[var6][var14];
                        } else {
                            var3[var10] = 0;
                        }
                    }
                } else {
                    class111.method769(var3, 0, class344.field5043, 0);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "(I)V")
    public static void method1421(int arg0) {
        if (arg0 == -18667) {
            field3236 = null;
            field3246 = null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "(II)I")
    public static final int method1422(int arg0, int arg1) {
        if (arg1 != 1381872556) {
            return 122;
        } else {
            ++field3231;
            return arg0 >>> 7;
        }
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V")
    public class229() {
        super(0, true);
    }
}
