import java.awt.Color;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class499 extends class145 {

    @OriginalMember(owner = "client!cr", name = "I", descriptor = "I")
    private int field7265 = 0;

    @OriginalMember(owner = "client!cr", name = "Q", descriptor = "I")
    private int field7271 = 409;

    @OriginalMember(owner = "client!cr", name = "W", descriptor = "I")
    private int field7277 = 8;

    @OriginalMember(owner = "client!cr", name = "U", descriptor = "I")
    private int field7275 = 4;

    @OriginalMember(owner = "client!cr", name = "P", descriptor = "I")
    private int field7270 = 1024;

    @OriginalMember(owner = "client!cr", name = "Y", descriptor = "I")
    private int field7279 = 1024;

    @OriginalMember(owner = "client!cr", name = "Z", descriptor = "I")
    private int field7280 = 204;

    @OriginalMember(owner = "client!cr", name = "ab", descriptor = "I")
    private int field7281 = 81;

    @OriginalMember(owner = "client!cr", name = "cb", descriptor = "F")
    public static float field7283;

    @OriginalMember(owner = "client!cr", name = "E", descriptor = "I")
    private int field7261;

    @OriginalMember(owner = "client!cr", name = "G", descriptor = "I")
    public static int field7263;

    @OriginalMember(owner = "client!cr", name = "H", descriptor = "I")
    public static int field7264;

    @OriginalMember(owner = "client!cr", name = "K", descriptor = "I")
    private int field7266;

    @OriginalMember(owner = "client!cr", name = "M", descriptor = "I")
    public static int field7267;

    @OriginalMember(owner = "client!cr", name = "N", descriptor = "I")
    public static int field7268;

    @OriginalMember(owner = "client!cr", name = "R", descriptor = "I")
    private int field7272;

    @OriginalMember(owner = "client!cr", name = "T", descriptor = "I")
    public static int field7274;

    @OriginalMember(owner = "client!cr", name = "X", descriptor = "I")
    public static int field7278;

    @OriginalMember(owner = "client!cr", name = "bb", descriptor = "I")
    public static int field7282;

    @OriginalMember(owner = "client!cr", name = "O", descriptor = "[I")
    private int[] field7269;

    @OriginalMember(owner = "client!cr", name = "S", descriptor = "[Z")
    public static boolean[] field7273;

    @OriginalMember(owner = "client!cr", name = "F", descriptor = "[[I")
    private int[][] field7262;

    @OriginalMember(owner = "client!cr", name = "V", descriptor = "[[I")
    private int[][] field7276;

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "()V")
    public class499() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cr", name = "i", descriptor = "(I)V")
    public static final void method2988(int arg0) {
        ++field7264;
        if (arg0 != 23776) {
            field7267 = 95;
        }
        for (class55 var1 = (class55) class117.field1451.method719(false); var1 != null; var1 = (class55) class117.field1451.method716(14)) {
            if (var1.field636 > 0) {
                --var1.field636;
            }
            if (var1.field636 != 0) {
                if (var1.field632 > 0) {
                    --var1.field632;
                }
                if (var1.field632 == 0 && var1.field623 >= 1 && var1.field625 >= 1 && ~var1.field623 >= ~(class90.field1032 + -2) && ~var1.field625 >= ~(class30.field349 - 2) && (var1.field626 < 0 || class329.method2146(true, var1.field634, var1.field626))) {
                    class131.method807((byte) 29, var1.field626, var1.field625, var1.field630, var1.field633, var1.field629, var1.field623, var1.field634, -1);
                    var1.field632 = -1;
                    if (~var1.field626 == ~var1.field624 && var1.field624 == -1) {
                        var1.method2108(true);
                    } else if (var1.field626 == var1.field624 && ~var1.field633 == ~var1.field621 && var1.field634 == var1.field627) {
                        var1.method2108(true);
                    }
                }
            } else if (var1.field624 < 0 || class329.method2146(true, var1.field627, var1.field624)) {
                class131.method807((byte) 29, var1.field624, var1.field625, var1.field630, var1.field621, var1.field629, var1.field623, var1.field627, -1);
                var1.method2108(true);
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IILrt;)V")
    public final void method28(int arg0, int arg1, class194 arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (~arg0 != -7) {
                                    if (~arg0 == -8) {
                                        this.field7279 = arg2.method1220(127);
                                    }
                                } else {
                                    this.field7281 = arg2.method1220(-98);
                                }
                            } else {
                                this.field7265 = arg2.method1220(121);
                            }
                        } else {
                            this.field7270 = arg2.method1220(124);
                        }
                    } else {
                        this.field7280 = arg2.method1220(111);
                    }
                } else {
                    this.field7271 = arg2.method1220(113);
                }
            } else {
                this.field7277 = arg2.method1177(255);
            }
        } else {
            this.field7275 = arg2.method1177(255);
        }
        ++field7282;
        if (arg1 > -67) {
            this.field7277 = 113;
        }
    }

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "(Z)V")
    public static final void method2989(boolean arg0) {
        ++field7278;
        class280.field3915.method285(1);
        class32.field369.method787(6);
        class254.field3624.method664(-19285);
        class30.field348.setBackground(Color.black);
        class176.field2148 = -1;
        class280.field3915 = class291.method1884(class30.field348, arg0);
        class32.field369 = class260.method1731(true, (byte) -128, class30.field348);
    }

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "(I)V")
    public final void method145(int arg0) {
        this.method2991((byte) -72);
        ++field7274;
        int var2 = -62 / ((-46 - arg0) / 45);
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(ZI)[I")
    public final int[] method27(boolean arg0, int arg1) {
        ++field7268;
        if (arg0) {
            field7267 = 65;
        }
        int[] var3 = super.field1779.method2069(-2, arg1);
        if (super.field1779.field4602) {
            int var4 = 0;
            int var5;
            for (var5 = class573.field8270[arg1] + this.field7265; var5 < 0; var5 += 4096) {
            }
            while (~var5 < -4097) {
                var5 -= 4096;
            }
            while (~this.field7277 < ~var4 && this.field7269[var4] <= var5) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = (var4 & 1) == 0;
            int var8 = this.field7269[var4];
            int var9 = this.field7269[var4 + -1];
            if (this.field7266 + var9 < var5 && var8 - this.field7266 > var5) {
                for (int var10 = 0; var10 < class647.field9368; ++var10) {
                    int var11 = !var7 ? -this.field7270 : this.field7270;
                    int var12 = 0;
                    int var13;
                    for (var13 = (this.field7272 * var11 >> 12) + class601.field8779[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (~var13 < -4097) {
                        var13 -= 4096;
                    }
                    while (~var12 > ~this.field7275 && this.field7262[var6][var12] <= var13) {
                        ++var12;
                    }
                    int var14 = var12 + -1;
                    int var15 = this.field7262[var6][var12];
                    int var16 = this.field7262[var6][var14];
                    if (~var13 < ~(this.field7266 + var16) && ~var13 > ~(-this.field7266 + var15)) {
                        var3[var10] = this.field7276[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class210.method1331(var3, 0, class647.field9368, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)V")
    public static void method2990(byte arg0) {
        field7273 = null;
        if (arg0 >= -119) {
            field7273 = null;
        }
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(B)V")
    private final void method2991(byte arg0) {
        ++field7263;
        Random var2 = new Random((long) this.field7277);
        if (arg0 > -46) {
            this.field7269 = null;
        }
        this.field7261 = 4096 / this.field7277;
        this.field7266 = this.field7281 / 2;
        this.field7272 = 4096 / this.field7275;
        int var3 = this.field7272 / 2;
        this.field7262 = new int[this.field7277][this.field7275 + 1];
        this.field7276 = new int[this.field7277][this.field7275];
        this.field7269 = new int[this.field7277 - -1];
        int var4 = this.field7261 / 2;
        this.field7269[0] = 0;
        for (int var5 = 0; var5 < this.field7277; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field7261;
                int var7 = (-2048 + class107.method659(var2, false, 4096)) * this.field7280 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field7269[var5] = this.field7269[var5 + -1] - -var8;
            }
            this.field7262[var5][0] = 0;
            for (int var9 = 0; this.field7275 > var9; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field7272;
                    int var11 = (-2048 + class107.method659(var2, false, 4096)) * this.field7271 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field7262[var5][var9] = this.field7262[var5][var9 + -1] + var12;
                }
                this.field7276[var5][var9] = ~this.field7279 >= -1 ? 4096 : -class107.method659(var2, false, this.field7279) + 4096;
            }
            this.field7262[var5][this.field7275] = 4096;
        }
        this.field7269[this.field7277] = 4096;
    }
}
