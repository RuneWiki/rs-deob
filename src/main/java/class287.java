import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class287 extends class160 {

    @OriginalMember(owner = "client!uj", name = "U", descriptor = "I")
    private int field4538 = 1024;

    @OriginalMember(owner = "client!uj", name = "fb", descriptor = "I")
    private int field4549 = 81;

    @OriginalMember(owner = "client!uj", name = "eb", descriptor = "I")
    private int field4548 = 8;

    @OriginalMember(owner = "client!uj", name = "lb", descriptor = "I")
    private int field4555 = 0;

    @OriginalMember(owner = "client!uj", name = "mb", descriptor = "I")
    private int field4556 = 1024;

    @OriginalMember(owner = "client!uj", name = "nb", descriptor = "I")
    private int field4557 = 204;

    @OriginalMember(owner = "client!uj", name = "ib", descriptor = "I")
    private int field4552 = 4;

    @OriginalMember(owner = "client!uj", name = "kb", descriptor = "I")
    private int field4554 = 409;

    @OriginalMember(owner = "client!uj", name = "V", descriptor = "[Ljava/lang/String;")
    public static String[] field4539 = null;

    @OriginalMember(owner = "client!uj", name = "X", descriptor = "Ljava/lang/String;")
    public static String field4541 = "glow3:";

    @OriginalMember(owner = "client!uj", name = "S", descriptor = "I")
    private int field4536;

    @OriginalMember(owner = "client!uj", name = "W", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!uj", name = "ab", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!uj", name = "cb", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!uj", name = "db", descriptor = "I")
    private int field4547;

    @OriginalMember(owner = "client!uj", name = "gb", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!uj", name = "jb", descriptor = "I")
    private int field4553;

    @OriginalMember(owner = "client!uj", name = "ob", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!uj", name = "T", descriptor = "Z")
    public static boolean field4537;

    @OriginalMember(owner = "client!uj", name = "Y", descriptor = "[I")
    private int[] field4542;

    @OriginalMember(owner = "client!uj", name = "Z", descriptor = "[S")
    public static short[] field4543;

    @OriginalMember(owner = "client!uj", name = "bb", descriptor = "[[I")
    private int[][] field4545;

    @OriginalMember(owner = "client!uj", name = "hb", descriptor = "[[I")
    private int[][] field4551;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IB)[I")
    public final int[] method1(int arg0, byte arg1) {
        if (arg1 != 57) {
            this.method210((byte) -24);
        }
        int[] var3 = super.field2488.method15((byte) 122, arg0);
        if (super.field2488.field42) {
            int var4 = class103.field1713[arg0] + this.field4555;
            int var5 = 0;
            while (~var4 > -1) {
                var4 += 4096;
            }
            while (~var4 < -4097) {
                var4 -= 4096;
            }
            while (~this.field4548 < ~var5 && ~var4 <= ~this.field4542[var5]) {
                ++var5;
            }
            int var6 = var5 + -1;
            boolean var7 = (var5 & 1) == 0;
            int var8 = this.field4542[var5];
            int var9 = this.field4542[var5 + -1];
            if (~var4 < ~(this.field4553 + var9) && -this.field4553 + var8 > var4) {
                for (int var10 = 0; ~class240.field3896 < ~var10; ++var10) {
                    int var11 = var7 ? this.field4556 : -this.field4556;
                    int var12;
                    for (var12 = (this.field4536 * var11 >> 12) + class190.field2946[var10]; ~var12 > -1; var12 += 4096) {
                    }
                    int var13 = 0;
                    while (~var12 < -4097) {
                        var12 -= 4096;
                    }
                    while (~var13 > ~this.field4552 && ~var12 <= ~this.field4551[var6][var13]) {
                        ++var13;
                    }
                    int var14 = var13 + -1;
                    int var15 = this.field4551[var6][var14];
                    int var16 = this.field4551[var6][var13];
                    if (~var12 < ~(var15 - -this.field4553) && var12 < -this.field4553 + var16) {
                        var3[var10] = this.field4545[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class175.method1191(var3, 0, class240.field3896, 0);
            }
        }
        ++field4544;
        return var3;
    }

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "(B)V")
    public final void method210(byte arg0) {
        if (arg0 <= -124) {
            ++field4546;
            this.method1924((byte) -105);
        }
    }

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "(B)V")
    public static void method1923(byte arg0) {
        if (arg0 >= -119) {
            method1923((byte) 115);
        }
        field4541 = null;
        field4543 = null;
        field4539 = null;
    }

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "(B)V")
    private final void method1924(byte arg0) {
        int var2 = 44 % ((arg0 - 27) / 57);
        ++field4550;
        Random var3 = new Random((long) this.field4548);
        this.field4551 = new int[this.field4548][this.field4552 + 1];
        this.field4536 = 4096 / this.field4552;
        this.field4547 = 4096 / this.field4548;
        this.field4553 = this.field4549 / 2;
        this.field4542 = new int[this.field4548 + 1];
        this.field4545 = new int[this.field4548][this.field4552];
        int var4 = this.field4547 / 2;
        this.field4542[0] = 0;
        int var5 = this.field4536 / 2;
        for (int var6 = 0; this.field4548 > var6; ++var6) {
            if (~var6 < -1) {
                int var7 = this.field4547;
                int var8 = (-2048 + class129.method896(4096, var3, false)) * this.field4557 >> 12;
                int var9 = (var4 * var8 >> 12) + var7;
                this.field4542[var6] = this.field4542[var6 + -1] + var9;
            }
            this.field4551[var6][0] = 0;
            for (int var10 = 0; var10 < this.field4552; ++var10) {
                if (~var10 < -1) {
                    int var11 = this.field4536;
                    int var12 = (-2048 + class129.method896(4096, var3, false)) * this.field4554 >> 12;
                    int var13 = (var5 * var12 >> 12) + var11;
                    this.field4551[var6][var10] = this.field4551[var6][var10 + -1] - -var13;
                }
                this.field4545[var6][var10] = this.field4538 > 0 ? 4096 + -class129.method896(this.field4538, var3, false) : 4096;
            }
            this.field4551[var6][this.field4552] = 4096;
        }
        this.field4542[this.field4548] = 4096;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lai;II)V")
    public final void method2(class88 arg0, int arg1, int arg2) {
        if (arg1 > 11) {
            if (~arg2 != -1) {
                if (arg2 != 1) {
                    if (~arg2 != -3) {
                        if (arg2 != 3) {
                            if (~arg2 != -5) {
                                if (arg2 != 5) {
                                    if (~arg2 != -7) {
                                        if (~arg2 == -8) {
                                            this.field4538 = arg0.method645(11596);
                                        }
                                    } else {
                                        this.field4549 = arg0.method645(11596);
                                    }
                                } else {
                                    this.field4555 = arg0.method645(11596);
                                }
                            } else {
                                this.field4556 = arg0.method645(11596);
                            }
                        } else {
                            this.field4557 = arg0.method645(11596);
                        }
                    } else {
                        this.field4554 = arg0.method645(11596);
                    }
                } else {
                    this.field4548 = arg0.method633(124);
                }
            } else {
                this.field4552 = arg0.method633(103);
            }
            ++field4540;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZB)V")
    public static final void method1925(boolean arg0, byte arg1) {
        ++field4558;
        int[] var2 = null;
        byte var3 = 4;
        byte[][] var4 = class90.field1573;
        int var5 = -107 % ((-60 - arg1) / 50);
        for (int var6 = 0; ~var3 < ~var6; ++var6) {
            class230.method1534(false);
            for (int var7 = 0; var7 < 13; ++var7) {
                for (int var8 = 0; ~var8 > -14; ++var8) {
                    int var9 = class33.field500[var6][var7][var8];
                    boolean var10 = false;
                    if (~var9 != 0) {
                        int var11 = (54635310 & var9) >> 24;
                        if (!arg0 || ~var11 == -1) {
                            int var12 = var9 >> 1 & 3;
                            int var13 = var9 >> 14 & 1023;
                            int var14 = var9 >> 3 & 2047;
                            int var15 = (var13 / 8 << 8) - -(var14 / 8);
                            for (int var16 = 0; class230.field3653.length > var16; ++var16) {
                                if (~class230.field3653[var16] == ~var15 && var4[var16] != null) {
                                    var10 = true;
                                    int[] var17 = class100.method732(var4[var16], var11, var6, var13, var14, var8 * 8, -98, var7 * 8, arg0, var12, class176.field2765);
                                    if (var2 == null && var17 != null) {
                                        var2 = var17;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    if (!var10) {
                        class179.method1213(8, 8, true, var6, var8 * 8, var7 * 8);
                    }
                }
            }
        }
        if (var2 != null) {
            class238.field3862 = var2[3];
            class7.field155 = var2[0];
            class20.field294 = var2[1];
            class30.field432 = var2[2];
            class205.field3194 = var2[4];
        } else {
            class7.field155 = -1;
        }
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V")
    public class287() {
        super(0, true);
    }
}
