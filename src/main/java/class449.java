import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class449 extends class40 {

    @OriginalMember(owner = "client!mo", name = "M", descriptor = "I")
    private int field6401 = 8;

    @OriginalMember(owner = "client!mo", name = "K", descriptor = "I")
    private int field6399 = 204;

    @OriginalMember(owner = "client!mo", name = "Y", descriptor = "I")
    private int field6412 = 1024;

    @OriginalMember(owner = "client!mo", name = "V", descriptor = "I")
    private int field6409 = 409;

    @OriginalMember(owner = "client!mo", name = "eb", descriptor = "I")
    private int field6418 = 1024;

    @OriginalMember(owner = "client!mo", name = "X", descriptor = "I")
    private int field6411 = 81;

    @OriginalMember(owner = "client!mo", name = "Z", descriptor = "I")
    private int field6413 = 0;

    @OriginalMember(owner = "client!mo", name = "hb", descriptor = "I")
    private int field6421 = 4;

    @OriginalMember(owner = "client!mo", name = "P", descriptor = "Lub;")
    public static class15 field6404 = new class15(64);

    @OriginalMember(owner = "client!mo", name = "cb", descriptor = "Z")
    public static boolean field6416 = false;

    @OriginalMember(owner = "client!mo", name = "N", descriptor = "I")
    public static int field6402;

    @OriginalMember(owner = "client!mo", name = "O", descriptor = "I")
    public static int field6403;

    @OriginalMember(owner = "client!mo", name = "Q", descriptor = "I")
    public static int field6405;

    @OriginalMember(owner = "client!mo", name = "T", descriptor = "I")
    private int field6408;

    @OriginalMember(owner = "client!mo", name = "W", descriptor = "I")
    public static int field6410;

    @OriginalMember(owner = "client!mo", name = "bb", descriptor = "I")
    public static int field6415;

    @OriginalMember(owner = "client!mo", name = "db", descriptor = "I")
    private int field6417;

    @OriginalMember(owner = "client!mo", name = "fb", descriptor = "I")
    private int field6419;

    @OriginalMember(owner = "client!mo", name = "gb", descriptor = "I")
    public static int field6420;

    @OriginalMember(owner = "client!mo", name = "ab", descriptor = "Ltj;")
    public static class108 field6414;

    @OriginalMember(owner = "client!mo", name = "R", descriptor = "[I")
    private int[] field6406;

    @OriginalMember(owner = "client!mo", name = "L", descriptor = "[[I")
    private int[][] field6400;

    @OriginalMember(owner = "client!mo", name = "S", descriptor = "[[I")
    private int[][] field6407;

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "()V", line = 9)
    public class449() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "(B)V", line = 13)
    public final void method39(byte arg0) {
        ++field6402;
        this.method2795(4096);
        if (arg0 != -23) {
            this.method2795(-70);
        }
    }

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "(I)V", line = 24)
    private final void method2795(int arg0) {
        ++field6420;
        Random var2 = new Random((long) this.field6401);
        this.field6419 = 4096 / this.field6421;
        this.field6417 = this.field6411 / 2;
        this.field6408 = 4096 / this.field6401;
        int var3 = this.field6419 / 2;
        int var4 = this.field6408 / 2;
        this.field6407 = new int[this.field6401][this.field6421 - -1];
        this.field6406 = new int[this.field6401 + 1];
        this.field6400 = new int[this.field6401][this.field6421];
        this.field6406[0] = 0;
        for (int var5 = 0; var5 < this.field6401; ++var5) {
            if (var5 > 0) {
                int var6 = this.field6408;
                int var7 = (class445.method2775(var2, arg0 ^ 27082, 4096) + -2048) * this.field6399 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field6406[var5] = this.field6406[var5 + -1] + var8;
            }
            this.field6407[var5][0] = 0;
            for (int var9 = 0; ~var9 > ~this.field6421; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field6419;
                    int var11 = (class445.method2775(var2, 31178, 4096) + -2048) * this.field6409 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field6407[var5][var9] = this.field6407[var5][var9 + -1] - -var12;
                }
                this.field6400[var5][var9] = this.field6412 > 0 ? -class445.method2775(var2, arg0 + 27082, this.field6412) + 4096 : 4096;
            }
            this.field6407[var5][this.field6421] = 4096;
        }
        this.field6406[this.field6401] = arg0;
    }

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "(I)V", line = 89)
    public static void method2796(int arg0) {
        field6404 = null;
        field6414 = null;
        if (arg0 <= 16) {
            field6416 = false;
        }
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(IB)V", line = 101)
    public static final void method2797(int arg0, byte arg1) {
        if (arg1 != 28) {
            field6405 = 60;
        }
        class243.field3604.method91(4, arg0);
        ++field6410;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IILlf;)V", line = 120)
    public final void method43(int arg0, int arg1, class130 arg2) {
        ++field6415;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (~arg0 != -7) {
                                    if (~arg0 == -8) {
                                        this.field6412 = arg2.method798(false);
                                    }
                                } else {
                                    this.field6411 = arg2.method798(false);
                                }
                            } else {
                                this.field6413 = arg2.method798(false);
                            }
                        } else {
                            this.field6418 = arg2.method798(false);
                        }
                    } else {
                        this.field6399 = arg2.method798(false);
                    }
                } else {
                    this.field6409 = arg2.method798(false);
                }
            } else {
                this.field6401 = arg2.method837(true);
            }
        } else {
            this.field6421 = arg2.method837(true);
        }
        if (arg1 <= 79) {
            method2797(-64, (byte) 123);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(BI)[I", line = 232)
    public final int[] method44(byte arg0, int arg1) {
        ++field6403;
        int[] var3 = super.field551.method185(65280, arg1);
        if (arg0 > -20) {
            this.method43(-57, 86, (class130) null);
        }
        if (super.field551.field441) {
            int var4 = 0;
            int var5;
            for (var5 = class86.field1123[arg1] + this.field6413; ~var5 > -1; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (var4 < this.field6401 && ~var5 <= ~this.field6406[var4]) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = ~(1 & var4) == -1;
            int var8 = this.field6406[var4];
            int var9 = this.field6406[var4 + -1];
            if (~(var9 - -this.field6417) > ~var5 && ~(-this.field6417 + var8) < ~var5) {
                for (int var10 = 0; ~class410.field5886 < ~var10; ++var10) {
                    int var11 = 0;
                    int var12 = var7 ? this.field6418 : -this.field6418;
                    int var13;
                    for (var13 = (this.field6419 * var12 >> 12) + class9.field124[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (~var13 < -4097) {
                        var13 -= 4096;
                    }
                    while (~this.field6421 < ~var11 && ~var13 <= ~this.field6407[var6][var11]) {
                        ++var11;
                    }
                    int var14 = var11 + -1;
                    int var15 = this.field6407[var6][var11];
                    int var16 = this.field6407[var6][var14];
                    if (this.field6417 + var16 < var13 && -this.field6417 + var15 > var13) {
                        var3[var10] = this.field6400[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class271.method1855(var3, 0, class410.field5886, 0);
            }
        }
        return var3;
    }
}
