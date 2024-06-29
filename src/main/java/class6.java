import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class6 extends class223 {

    @OriginalMember(owner = "client!wj", name = "J", descriptor = "I")
    private int field81 = 0;

    @OriginalMember(owner = "client!wj", name = "O", descriptor = "I")
    private int field86 = 1024;

    @OriginalMember(owner = "client!wj", name = "T", descriptor = "I")
    private int field91 = 1024;

    @OriginalMember(owner = "client!wj", name = "ab", descriptor = "I")
    private int field98 = 204;

    @OriginalMember(owner = "client!wj", name = "S", descriptor = "I")
    private int field90 = 8;

    @OriginalMember(owner = "client!wj", name = "U", descriptor = "I")
    private int field92 = 4;

    @OriginalMember(owner = "client!wj", name = "Z", descriptor = "I")
    private int field97 = 409;

    @OriginalMember(owner = "client!wj", name = "X", descriptor = "I")
    private int field95 = 81;

    @OriginalMember(owner = "client!wj", name = "Y", descriptor = "Ljava/lang/String;")
    public static String field96 = "red:";

    @OriginalMember(owner = "client!wj", name = "V", descriptor = "I")
    public static int field93 = 0;

    @OriginalMember(owner = "client!wj", name = "cb", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!wj", name = "db", descriptor = "I")
    private int field101;

    @OriginalMember(owner = "client!wj", name = "eb", descriptor = "I")
    private int field102;

    @OriginalMember(owner = "client!wj", name = "gb", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!wj", name = "K", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!wj", name = "M", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!wj", name = "N", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!wj", name = "Q", descriptor = "I")
    private int field88;

    @OriginalMember(owner = "client!wj", name = "R", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!wj", name = "W", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!wj", name = "P", descriptor = "[I")
    private int[] field87;

    @OriginalMember(owner = "client!wj", name = "L", descriptor = "[[B")
    public static byte[][] field83;

    @OriginalMember(owner = "client!wj", name = "fb", descriptor = "[[I")
    private int[][] field103;

    @OriginalMember(owner = "client!wj", name = "bb", descriptor = "[[I")
    private int[][] field99;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lha;IB)V")
    public final void method37(class31 arg0, int arg1, byte arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (arg1 != 6) {
                                    if (arg1 == 7) {
                                        this.field86 = arg0.method260((byte) -67);
                                    }
                                } else {
                                    this.field95 = arg0.method260((byte) -67);
                                }
                            } else {
                                this.field81 = arg0.method260((byte) -67);
                            }
                        } else {
                            this.field91 = arg0.method260((byte) -67);
                        }
                    } else {
                        this.field98 = arg0.method260((byte) -67);
                    }
                } else {
                    this.field97 = arg0.method260((byte) -67);
                }
            } else {
                this.field90 = arg0.method265(-99);
            }
        } else {
            this.field92 = arg0.method265(-98);
        }
        if (arg2 == 102) {
            ++field84;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IB)V")
    public static final void method38(int arg0, byte arg1) {
        if (arg1 > 63) {
            class163.field2454 = new int[arg0];
            class294.field4569 = new int[arg0];
            class79.field1206 = new int[arg0];
            class250.field3999 = new int[arg0];
            ++field85;
            class203.field3127 = new int[arg0];
        }
    }

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "(I)V")
    private final void method39(int arg0) {
        ++field82;
        if (arg0 == -706398612) {
            Random var2 = new Random((long) this.field90);
            this.field99 = new int[this.field90][this.field92 + 1];
            this.field88 = 4096 / this.field92;
            this.field87 = new int[this.field90 + 1];
            this.field103 = new int[this.field90][this.field92];
            this.field101 = this.field95 / 2;
            this.field87[0] = 0;
            this.field102 = 4096 / this.field90;
            int var3 = this.field88 / 2;
            int var4 = this.field102 / 2;
            for (int var5 = 0; this.field90 > var5; ++var5) {
                if (var5 > 0) {
                    int var6 = this.field102;
                    int var7 = (class216.method1495(-2, var2, 4096) + -2048) * this.field98 >> 12;
                    int var8 = (var4 * var7 >> 12) + var6;
                    this.field87[var5] = this.field87[var5 + -1] + var8;
                }
                this.field99[var5][0] = 0;
                for (int var9 = 0; ~this.field92 < ~var9; ++var9) {
                    if (var9 > 0) {
                        int var10 = this.field88;
                        int var11 = (class216.method1495(-2, var2, 4096) + -2048) * this.field97 >> 12;
                        int var12 = (var3 * var11 >> 12) + var10;
                        this.field99[var5][var9] = this.field99[var5][var9 + -1] + var12;
                    }
                    this.field103[var5][var9] = ~this.field86 < -1 ? -class216.method1495(arg0 + 706398610, var2, this.field86) + 4096 : 4096;
                }
                this.field99[var5][this.field92] = 4096;
            }
            this.field87[this.field90] = 4096;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(BI)[I")
    public final int[] method40(byte arg0, int arg1) {
        if (arg0 <= 14) {
            return null;
        } else {
            ++field104;
            int[] var3 = super.field3588.method1611(0, arg1);
            if (super.field3588.field3722) {
                int var4 = 0;
                int var5;
                for (var5 = class307.field4925[arg1] + this.field81; ~var5 > -1; var5 += 4096) {
                }
                while (var5 > 4096) {
                    var5 -= 4096;
                }
                while (~this.field90 < ~var4 && this.field87[var4] <= var5) {
                    ++var4;
                }
                int var6 = var4 - 1;
                int var7 = this.field87[var4];
                boolean var8 = ~(1 & var4) == -1;
                int var9 = this.field87[var4 - 1];
                if (~var5 < ~(this.field101 + var9) && ~(-this.field101 + var7) < ~var5) {
                    for (int var10 = 0; ~var10 > ~class250.field4008; ++var10) {
                        int var11 = 0;
                        int var12 = var8 ? this.field91 : -this.field91;
                        int var13;
                        for (var13 = (this.field88 * var12 >> 12) + class106.field1662[var10]; var13 < 0; var13 += 4096) {
                        }
                        while (var13 > 4096) {
                            var13 -= 4096;
                        }
                        while (var11 < this.field92 && var13 >= this.field99[var6][var11]) {
                            ++var11;
                        }
                        int var14 = this.field99[var6][var11];
                        int var15 = var11 + -1;
                        int var16 = this.field99[var6][var15];
                        if (var13 > this.field101 + var16 && ~(-this.field101 + var14) < ~var13) {
                            var3[var10] = this.field103[var6][var15];
                        } else {
                            var3[var10] = 0;
                        }
                    }
                } else {
                    class81.method633(var3, 0, class250.field4008, 0);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "([BI)V")
    public static final void method41(byte[] arg0, int arg1) {
        ++field94;
        class31 var2 = new class31(arg0);
        var2.field541 = arg0.length + -2;
        class174.field2682 = var2.method260((byte) -67);
        if (arg1 <= 124) {
            field96 = null;
        }
        class301.field4847 = new byte[class174.field2682][];
        class125.field1877 = new int[class174.field2682];
        class299.field4811 = new byte[class174.field2682][];
        class196.field3069 = new int[class174.field2682];
        class170.field2583 = new int[class174.field2682];
        class104.field1621 = new int[class174.field2682];
        class5.field80 = new boolean[class174.field2682];
        var2.field541 = arg0.length - (class174.field2682 * 8 + 7);
        class214.field3278 = var2.method260((byte) -67);
        class234.field3705 = var2.method260((byte) -67);
        int var3 = 1 + (var2.method265(-97) & 255);
        for (int var4 = 0; ~var4 > ~class174.field2682; ++var4) {
            class196.field3069[var4] = var2.method260((byte) -67);
        }
        for (int var5 = 0; var5 < class174.field2682; ++var5) {
            class125.field1877[var5] = var2.method260((byte) -67);
        }
        for (int var6 = 0; var6 < class174.field2682; ++var6) {
            class104.field1621[var6] = var2.method260((byte) -67);
        }
        for (int var7 = 0; ~class174.field2682 < ~var7; ++var7) {
            class170.field2583[var7] = var2.method260((byte) -67);
        }
        var2.field541 = arg0.length + 3 + -(var3 * 3) + -(class174.field2682 * 8) + -7;
        class102.field1585 = new int[var3];
        for (int var8 = 1; var3 > var8; ++var8) {
            class102.field1585[var8] = var2.method304((byte) 84);
            if (class102.field1585[var8] == 0) {
                class102.field1585[var8] = 1;
            }
        }
        var2.field541 = 0;
        for (int var9 = 0; ~var9 > ~class174.field2682; ++var9) {
            int var10 = class104.field1621[var9];
            int var11 = class170.field2583[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class301.field4847[var9] = var13;
            boolean var14 = false;
            byte[] var15 = new byte[var12];
            class299.field4811[var9] = var15;
            int var16 = var2.method265(-102);
            if ((1 & var16) == 0) {
                for (int var17 = 0; ~var17 > ~var12; ++var17) {
                    var13[var17] = var2.method266(-129);
                }
                if (~(2 & var16) != -1) {
                    for (int var18 = 0; ~var12 < ~var18; ++var18) {
                        byte var19 = var15[var18] = var2.method266(-129);
                        var14 |= ~var19 != 0;
                    }
                }
            } else {
                int var20 = 0;
                label101: while (true) {
                    if (~var10 >= ~var20) {
                        if (~(var16 & 2) == -1) {
                            break;
                        }
                        int var21 = 0;
                        while (true) {
                            if (~var10 >= ~var21) {
                                break label101;
                            }
                            for (int var22 = 0; var22 < var11; ++var22) {
                                byte var23 = var15[var10 * var22 + var21] = var2.method266(-129);
                                var14 |= var23 != -1;
                            }
                            ++var21;
                        }
                    }
                    for (int var24 = 0; var24 < var11; ++var24) {
                        var13[var20 - -(var10 * var24)] = var2.method266(-129);
                    }
                    ++var20;
                }
            }
            class5.field80[var9] = var14;
        }
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V")
    public class6() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "(I)V")
    public static void method42(int arg0) {
        field83 = null;
        field96 = null;
        if (arg0 != 26919) {
            field83 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "(I)V")
    public final void method43(int arg0) {
        this.method39(-706398612);
        if (arg0 != 500) {
            field83 = null;
        }
        ++field100;
    }

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "(B)V")
    public static final void method44(byte arg0) {
        ++class9.field149;
        class240.field3826.method1762(144, true);
        if (arg0 <= 125) {
            method41((byte[]) null, 114);
        }
        ++field89;
        class240.field3826.method281((byte) -108, class79.field1210);
    }
}
