import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class59 extends class99 {

    @OriginalMember(owner = "client!db", name = "bb", descriptor = "I")
    private int field999 = 0;

    @OriginalMember(owner = "client!db", name = "fb", descriptor = "I")
    private int field1003 = 1024;

    @OriginalMember(owner = "client!db", name = "W", descriptor = "I")
    private int field994 = 204;

    @OriginalMember(owner = "client!db", name = "jb", descriptor = "I")
    private int field1007 = 1024;

    @OriginalMember(owner = "client!db", name = "U", descriptor = "I")
    private int field992 = 81;

    @OriginalMember(owner = "client!db", name = "mb", descriptor = "I")
    private int field1010 = 4;

    @OriginalMember(owner = "client!db", name = "hb", descriptor = "I")
    private int field1005 = 409;

    @OriginalMember(owner = "client!db", name = "R", descriptor = "I")
    private int field989 = 8;

    @OriginalMember(owner = "client!db", name = "V", descriptor = "I")
    public static int field993 = 0;

    @OriginalMember(owner = "client!db", name = "Q", descriptor = "[Lfa;")
    public static class45[] field988 = new class45[2048];

    @OriginalMember(owner = "client!db", name = "eb", descriptor = "I")
    public static int field1002 = 0;

    @OriginalMember(owner = "client!db", name = "Z", descriptor = "Lr;")
    public static class66 field997 = class93.method641(43, "<img=1>");

    @OriginalMember(owner = "client!db", name = "ib", descriptor = "I")
    public static int field1006 = 2;

    @OriginalMember(owner = "client!db", name = "kb", descriptor = "[[[I")
    public static int[][][] field1008 = new int[2][][];

    @OriginalMember(owner = "client!db", name = "db", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!db", name = "gb", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!db", name = "lb", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!db", name = "nb", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!db", name = "ob", descriptor = "I")
    private int field1012;

    @OriginalMember(owner = "client!db", name = "pb", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!db", name = "qb", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!db", name = "rb", descriptor = "I")
    private int field1015;

    @OriginalMember(owner = "client!db", name = "X", descriptor = "I")
    private int field995;

    @OriginalMember(owner = "client!db", name = "ab", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!db", name = "T", descriptor = "Lwa;")
    public static class139 field991;

    @OriginalMember(owner = "client!db", name = "sb", descriptor = "Laf;")
    public static class39 field1016;

    @OriginalMember(owner = "client!db", name = "S", descriptor = "[I")
    private int[] field990;

    @OriginalMember(owner = "client!db", name = "cb", descriptor = "[[I")
    private int[][] field1000;

    @OriginalMember(owner = "client!db", name = "Y", descriptor = "[[I")
    private int[][] field996;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BI)[I")
    public final int[] method10(byte arg0, int arg1) {
        int[] var3 = super.field1943.method749(false, arg1);
        if (super.field1943.field2147) {
            int var4 = 0;
            int var5;
            for (var5 = class19.field261[arg1] + this.field999; ~var5 > -1; var5 += 4096) {
            }
            while (~var5 < -4097) {
                var5 -= 4096;
            }
            while (var4 < this.field989 && ~this.field990[var4] >= ~var5) {
                ++var4;
            }
            int var6 = this.field990[var4 - 1];
            int var7 = var4 - 1;
            boolean var8 = ~(1 & var4) == -1;
            int var9 = this.field990[var4];
            if (~var5 < ~(this.field995 + var6) && -this.field995 + var9 > var5) {
                for (int var10 = 0; ~var10 > ~class199.field3432; ++var10) {
                    int var11 = 0;
                    int var12 = !var8 ? -this.field1007 : this.field1007;
                    int var13;
                    for (var13 = (this.field1012 * var12 >> 12) + class10.field120[var10]; ~var13 > -1; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (~this.field1010 < ~var11 && var13 >= this.field996[var7][var11]) {
                        ++var11;
                    }
                    int var14 = this.field996[var7][var11];
                    int var15 = var11 - 1;
                    int var16 = this.field996[var7][var15];
                    if (~(this.field995 + var16) > ~var13 && ~var13 > ~(-this.field995 + var14)) {
                        var3[var10] = this.field1000[var7][var15];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class46.method330(var3, 0, class199.field3432, 0);
            }
        }
        ++field1004;
        if (arg0 != -61) {
            this.method10((byte) -77, -48);
        }
        return var3;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
    public final void method12(byte arg0) {
        this.method388(0);
        if (arg0 > -22) {
            this.field990 = null;
        }
        ++field1011;
    }

    @OriginalMember(owner = "client!db", name = "g", descriptor = "(I)V")
    public static void method387(int arg0) {
        if (arg0 >= -97) {
            method390((class37) null, 122);
        }
        field997 = null;
        field1008 = null;
        field991 = null;
        field988 = null;
        field1016 = null;
    }

    @OriginalMember(owner = "client!db", name = "h", descriptor = "(I)V")
    private final void method388(int arg0) {
        Random var2 = new Random((long) this.field989);
        this.field995 = this.field992 / 2;
        ++field1013;
        this.field1012 = 4096 / this.field1010;
        this.field1000 = new int[this.field989][this.field1010];
        this.field990 = new int[this.field989 + 1];
        this.field996 = new int[this.field989][this.field1010 + 1];
        int var3 = this.field1012 / 2;
        this.field1015 = 4096 / this.field989;
        this.field990[0] = 0;
        int var4 = this.field1015 / 2;
        for (int var5 = arg0; ~var5 > ~this.field989; ++var5) {
            if (var5 > 0) {
                int var6 = this.field1015;
                int var7 = (-2048 + class256.method1717(4096, (byte) 70, var2)) * this.field994 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field990[var5] = this.field990[var5 + -1] - -var8;
            }
            this.field996[var5][0] = 0;
            for (int var9 = 0; ~this.field1010 < ~var9; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field1012;
                    int var11 = (class256.method1717(4096, (byte) 70, var2) + -2048) * this.field1005 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field996[var5][var9] = this.field996[var5][var9 + -1] - -var12;
                }
                this.field1000[var5][var9] = this.field1003 <= 0 ? 4096 : -class256.method1717(this.field1003, (byte) 70, var2) + 4096;
            }
            this.field996[var5][this.field1010] = 4096;
        }
        this.field990[this.field989] = 4096;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Llh;II)V")
    public final void method11(class249 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (~arg1 != -7) {
                                    if (~arg1 == -8) {
                                        this.field1003 = arg0.method1674(1355769544);
                                    }
                                } else {
                                    this.field992 = arg0.method1674(1355769544);
                                }
                            } else {
                                this.field999 = arg0.method1674(arg2 ^ -1355769545);
                            }
                        } else {
                            this.field1007 = arg0.method1674(1355769544);
                        }
                    } else {
                        this.field994 = arg0.method1674(1355769544);
                    }
                } else {
                    this.field1005 = arg0.method1674(1355769544);
                }
            } else {
                this.field989 = arg0.method1677(arg2 ^ 6676);
            }
        } else {
            this.field1010 = arg0.method1677(-6677);
        }
        ++field1001;
        if (arg2 != -1) {
            this.field1012 = 120;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "()V")
    public static final void method389() {
        for (int var0 = 0; var0 < class131.field2449; ++var0) {
            for (int var4 = 0; var4 < class40.field629; ++var4) {
                for (int var5 = 0; var5 < class11.field136; ++var5) {
                    class110.field2124[var0][var4][var5] = null;
                }
            }
        }
        for (int var1 = 0; var1 < class51.field898; ++var1) {
            class255.field4478[var1] = null;
        }
        class51.field898 = 0;
        for (int var2 = 0; var2 < class224.field3831; ++var2) {
            class80.field1564[var2] = null;
        }
        class224.field3831 = 0;
        for (int var3 = 0; var3 < class119.field2265.length; ++var3) {
            class119.field2265[var3] = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Leh;I)V")
    public static final void method390(class37 arg0, int arg1) {
        ++field998;
        for (class217 var2 = (class217) class222.field3784.method873((byte) 76); var2 != null; var2 = (class217) class222.field3784.method870((byte) 80)) {
            if (var2.field3742 == arg0) {
                if (var2.field3722 != null) {
                    class206.field3528.method1031(var2.field3722);
                    var2.field3722 = null;
                }
                var2.method560(-17554);
                return;
            }
        }
        if (arg1 != 2) {
            field991 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
    public class59() {
        super(0, true);
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(B)V")
    public static final void method391(byte arg0) {
        if (arg0 == -88) {
            ++field1009;
            class85.field1667.method1613((byte) 94);
        }
    }
}
