import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class258 extends class76 {

    @OriginalMember(owner = "client!de", name = "cb", descriptor = "I")
    private int field4465 = 409;

    @OriginalMember(owner = "client!de", name = "bb", descriptor = "I")
    private int field4464 = 0;

    @OriginalMember(owner = "client!de", name = "gb", descriptor = "I")
    private int field4469 = 8;

    @OriginalMember(owner = "client!de", name = "Z", descriptor = "I")
    private int field4462 = 4;

    @OriginalMember(owner = "client!de", name = "jb", descriptor = "I")
    private int field4472 = 1024;

    @OriginalMember(owner = "client!de", name = "eb", descriptor = "I")
    private int field4467 = 81;

    @OriginalMember(owner = "client!de", name = "ob", descriptor = "I")
    private int field4477 = 204;

    @OriginalMember(owner = "client!de", name = "mb", descriptor = "I")
    private int field4475 = 1024;

    @OriginalMember(owner = "client!de", name = "pb", descriptor = "Lsf;")
    public static class33 field4478 = new class33();

    @OriginalMember(owner = "client!de", name = "wb", descriptor = "I")
    public static int field4485 = 0;

    @OriginalMember(owner = "client!de", name = "ub", descriptor = "Lia;")
    private static class257 field4483 = class28.method234(87, "Loaded config");

    @OriginalMember(owner = "client!de", name = "zb", descriptor = "Lia;")
    public static class257 field4488 = class28.method234(93, "slr2)3ws?order=LPWM");

    @OriginalMember(owner = "client!de", name = "vb", descriptor = "Lia;")
    public static class257 field4484 = field4483;

    @OriginalMember(owner = "client!de", name = "Ab", descriptor = "I")
    public static int field4489 = 0;

    @OriginalMember(owner = "client!de", name = "yb", descriptor = "Lia;")
    public static class257 field4487 = class28.method234(-63, "hint_mapmarkers");

    @OriginalMember(owner = "client!de", name = "db", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!de", name = "fb", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!de", name = "hb", descriptor = "I")
    private int field4470;

    @OriginalMember(owner = "client!de", name = "ib", descriptor = "I")
    private int field4471;

    @OriginalMember(owner = "client!de", name = "kb", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!de", name = "lb", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!de", name = "qb", descriptor = "I")
    private int field4479;

    @OriginalMember(owner = "client!de", name = "rb", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!de", name = "sb", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!de", name = "xb", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!de", name = "tb", descriptor = "Lci;")
    public static class20 field4482;

    @OriginalMember(owner = "client!de", name = "Y", descriptor = "[I")
    private int[] field4461;

    @OriginalMember(owner = "client!de", name = "ab", descriptor = "[[I")
    private int[][] field4463;

    @OriginalMember(owner = "client!de", name = "nb", descriptor = "[[I")
    private int[][] field4476;

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V")
    public class258() {
        super(0, true);
    }

    @OriginalMember(owner = "client!de", name = "i", descriptor = "(I)V")
    private final void method1721(int arg0) {
        ++field4480;
        Random var2 = new Random((long) this.field4469);
        this.field4463 = new int[this.field4469][this.field4462 - -1];
        this.field4461 = new int[this.field4469 + 1];
        this.field4471 = 4096 / this.field4469;
        this.field4461[0] = 0;
        if (arg0 <= 60) {
            this.method169(118, 72);
        }
        this.field4470 = 4096 / this.field4462;
        int var3 = this.field4470 / 2;
        this.field4479 = this.field4467 / 2;
        this.field4476 = new int[this.field4469][this.field4462];
        int var4 = this.field4471 / 2;
        for (int var5 = 0; var5 < this.field4469; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field4471;
                int var7 = (class8.method112(var2, 4096, -111) + -2048) * this.field4477 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field4461[var5] = this.field4461[var5 + -1] - -var8;
            }
            this.field4463[var5][0] = 0;
            for (int var9 = 0; this.field4462 > var9; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field4470;
                    int var11 = (class8.method112(var2, 4096, -125) - 2048) * this.field4465 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field4463[var5][var9] = this.field4463[var5][var9 - 1] + var12;
                }
                this.field4476[var5][var9] = this.field4475 > 0 ? 4096 - class8.method112(var2, this.field4475, -115) : 4096;
            }
            this.field4463[var5][this.field4462] = 4096;
        }
        this.field4461[this.field4469] = 4096;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(B)V")
    public final void method209(byte arg0) {
        if (arg0 != 111) {
            method1724(-1, 88, -114, 20, 51, -117, -29, 69);
        }
        ++field4473;
        this.method1721(arg0 ^ 31);
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(II)V")
    public static final void method1722(int arg0, int arg1) {
        ++field4474;
        if (arg0 != 18237) {
            field4481 = 1;
        }
        class150.field2586.method831(arg1, -123);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lk;BI)V")
    public final void method158(class152 arg0, byte arg1, int arg2) {
        ++field4468;
        if (arg1 >= -86) {
            method1723(31);
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (~arg2 != -7) {
                                    if (~arg2 == -8) {
                                        this.field4475 = arg0.method1063(-17162);
                                    }
                                } else {
                                    this.field4467 = arg0.method1063(-17162);
                                }
                            } else {
                                this.field4464 = arg0.method1063(-17162);
                            }
                        } else {
                            this.field4472 = arg0.method1063(-17162);
                        }
                    } else {
                        this.field4477 = arg0.method1063(-17162);
                    }
                } else {
                    this.field4465 = arg0.method1063(-17162);
                }
            } else {
                this.field4469 = arg0.method1051((byte) 104);
            }
        } else {
            this.field4462 = arg0.method1051((byte) -36);
        }
    }

    @OriginalMember(owner = "client!de", name = "j", descriptor = "(I)V")
    public static void method1723(int arg0) {
        field4487 = null;
        field4488 = null;
        if (arg0 != 4096) {
            field4487 = null;
        }
        field4483 = null;
        field4478 = null;
        field4484 = null;
        field4482 = null;
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(II)[I")
    public final int[] method169(int arg0, int arg1) {
        if (arg0 != -9351) {
            method1723(68);
        }
        int[] var3 = super.field1467.method1182((byte) -48, arg1);
        ++field4486;
        if (super.field1467.field2980) {
            int var4 = 0;
            int var5;
            for (var5 = class10.field197[arg1] + this.field4464; var5 < 0; var5 += 4096) {
            }
            while (~var5 < -4097) {
                var5 -= 4096;
            }
            while (~var4 > ~this.field4469 && this.field4461[var4] <= var5) {
                ++var4;
            }
            boolean var6 = ~(var4 & 1) == -1;
            int var7 = var4 - 1;
            int var8 = this.field4461[var4];
            int var9 = this.field4461[var4 + -1];
            if (~(this.field4479 + var9) > ~var5 && -this.field4479 + var8 > var5) {
                for (int var10 = 0; ~var10 > ~class96.field1807; ++var10) {
                    int var11 = 0;
                    int var12 = !var6 ? -this.field4472 : this.field4472;
                    int var13;
                    for (var13 = (this.field4470 * var12 >> 12) + class137.field2457[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (~var13 < -4097) {
                        var13 -= 4096;
                    }
                    while (var11 < this.field4462 && var13 >= this.field4463[var7][var11]) {
                        ++var11;
                    }
                    int var14 = this.field4463[var7][var11];
                    int var15 = var11 - 1;
                    int var16 = this.field4463[var7][var15];
                    if (this.field4479 + var16 < var13 && ~var13 > ~(var14 - this.field4479)) {
                        var3[var10] = this.field4476[var7][var15];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class86.method645(var3, 0, class96.field1807, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1724(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        class217 var8 = new class217();
        var8.field3687 = arg2 / 128;
        var8.field3686 = arg3 / 128;
        var8.field3684 = arg4 / 128;
        var8.field3685 = arg5 / 128;
        var8.field3668 = arg1;
        var8.field3680 = arg2;
        var8.field3667 = arg3;
        var8.field3669 = arg4;
        var8.field3689 = arg5;
        var8.field3670 = arg6;
        var8.field3683 = arg7;
        class79.field1548[arg0][class79.field1546[arg0]++] = var8;
    }
}
