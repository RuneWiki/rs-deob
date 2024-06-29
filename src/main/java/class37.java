import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class37 extends class272 {

    @OriginalMember(owner = "client!mf", name = "W", descriptor = "I")
    private int field580 = -1;

    @OriginalMember(owner = "client!mf", name = "M", descriptor = "Lli;")
    private static class185 field570 = class245.method1649("wishes to trade with you)3", -124);

    @OriginalMember(owner = "client!mf", name = "Z", descriptor = "[Z")
    public static boolean[] field583 = new boolean[5];

    @OriginalMember(owner = "client!mf", name = "bb", descriptor = "Lli;")
    public static class185 field585 = field570;

    @OriginalMember(owner = "client!mf", name = "db", descriptor = "[Lli;")
    public static class185[] field587 = new class185[500];

    @OriginalMember(owner = "client!mf", name = "K", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field568 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!mf", name = "I", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!mf", name = "J", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!mf", name = "N", descriptor = "I")
    private int field571;

    @OriginalMember(owner = "client!mf", name = "O", descriptor = "I")
    private int field572;

    @OriginalMember(owner = "client!mf", name = "P", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!mf", name = "Q", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!mf", name = "R", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!mf", name = "S", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!mf", name = "U", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!mf", name = "V", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!mf", name = "X", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!mf", name = "Y", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!mf", name = "ab", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!mf", name = "cb", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!mf", name = "eb", descriptor = "Lhi;")
    public static class250 field588;

    @OriginalMember(owner = "client!mf", name = "T", descriptor = "[I")
    private int[] field577;

    @OriginalMember(owner = "client!mf", name = "L", descriptor = "[Ldd;")
    public static class211[] field569;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)V")
    public final void method231(int arg0) {
        super.method231(arg0);
        ++field586;
        this.field577 = null;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(II)Lli;")
    public static final class185 method232(int arg0, int arg1) {
        ++field575;
        class185 var2 = new class185();
        var2.field3437 = arg1;
        var2.field3411 = new byte[arg0];
        return var2;
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V")
    public class37() {
        super(0, false);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B[Lp;I)V")
    public static final void method233(byte arg0, class82[] arg1, int arg2) {
        ++field573;
        int var3 = 0;
        if (arg0 < 16) {
            field587 = null;
        }
        while (~arg1.length < ~var3) {
            class82 var4 = arg1[var3];
            if (var4 != null && var4.field1580 == arg2 && (!var4.field1572 || !client.method1499(var4))) {
                label99: {
                    if (~var4.field1612 == -1) {
                        if (!var4.field1572 && client.method1499(var4) && class281.field4966 != var4) {
                            break label99;
                        }
                        method233((byte) 105, arg1, var4.field1579);
                        if (var4.field1536 != null) {
                            method233((byte) 66, var4.field1536, var4.field1579);
                        }
                        class271 var5 = (class271) class87.field1715.method195(122, (long) var4.field1579);
                        if (var5 != null) {
                            class138.method984(var5.field4811, (byte) -126);
                        }
                    }
                    if (~var4.field1612 == -7) {
                        if (var4.field1524 != -1 || var4.field1602 != -1) {
                            boolean var6 = class97.method625((byte) 126, var4);
                            int var7;
                            if (var6) {
                                var7 = var4.field1602;
                            } else {
                                var7 = var4.field1524;
                            }
                            if (~var7 != 0) {
                                class2 var8 = class253.method1712(var7, -125);
                                if (var8 != null) {
                                    var4.field1503 += class224.field4111;
                                    while (~var8.field51[var4.field1607] > ~var4.field1503) {
                                        var4.field1503 -= var8.field51[var4.field1607];
                                        ++var4.field1607;
                                        if (var4.field1607 >= var8.field37.length) {
                                            var4.field1607 -= var8.field47;
                                            if (var4.field1607 < 0 || var4.field1607 >= var8.field37.length) {
                                                var4.field1607 = 0;
                                            }
                                        }
                                        class229.method1581(var4, false);
                                    }
                                }
                            }
                        }
                        if (~var4.field1537 != -1 && !var4.field1572) {
                            int var9 = var4.field1537 << 16 >> 16;
                            int var10 = var4.field1537 >> 16;
                            int var11 = class224.field4111 * var9;
                            int var12 = class224.field4111 * var10;
                            var4.field1563 = var4.field1563 + var12 & 2047;
                            var4.field1556 = 2047 & var4.field1556 + var11;
                            class229.method1581(var4, false);
                        }
                    }
                }
            }
            ++var3;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BIII)V")
    public static final void method234(byte arg0, int arg1, int arg2, int arg3) {
        if (~class250.field4461 != -1 && ~arg1 != -1 && ~class185.field3453 > -51 && arg2 != -1) {
            class46.field743[class185.field3453] = arg2;
            class161.field3040[class185.field3453] = arg1;
            class209.field3822[class185.field3453] = arg3;
            class23.field385[class185.field3453] = null;
            class174.field3180[class185.field3453] = 0;
            ++class185.field3453;
        }
        if (arg0 >= -54) {
            method239(false);
        }
        ++field567;
    }

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "(I)V")
    public static final void method235(int arg0) {
        class132.field2368.method86(0);
        ++field579;
        if (arg0 != -1) {
            method239(false);
        }
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "(I)I")
    public final int method236(int arg0) {
        if (arg0 != -1) {
            this.field572 = -92;
        }
        ++field582;
        return this.field580;
    }

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "(I)Z")
    private final boolean method237(int arg0) {
        ++field576;
        if (arg0 != 2047) {
            method239(false);
        }
        if (this.field577 != null) {
            return true;
        } else if (this.field580 >= 0) {
            int var2 = class13.field235;
            int var3 = class246.field4385;
            int var4 = !class120.field2187.method388((byte) -70, this.field580) ? 128 : 64;
            this.field577 = class120.field2187.method390((byte) -76, this.field580);
            this.field571 = var4;
            this.field572 = var4;
            class45.method277(var3, arg0 ^ 2047, var2);
            return this.field577 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(II)V")
    public static final void method238(int arg0, int arg1) {
        ++field581;
        class174 var2 = class249.method1671(arg1, arg0, (byte) -109);
        var2.method1234((byte) -36);
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(Z)V")
    public static final void method239(boolean arg0) {
        while (true) {
            if (~class142.field2669.method587(class217.field3976, (byte) -118) <= -12) {
                int var1 = class142.field2669.method581(11, 7);
                if (var1 != 2047) {
                    boolean var2 = false;
                    if (class93.field1774[var1] == null) {
                        class93.field1774[var1] = new class188();
                        if (class47.field778[var1] != null) {
                            class93.field1774[var1].method1354(class47.field778[var1], !arg0);
                        }
                        var2 = true;
                    }
                    class174.field3187[class17.field281++] = var1;
                    class188 var3 = class93.field1774[var1];
                    var3.field2710 = class211.field3851;
                    int var4 = class174.field3193[class142.field2669.method581(3, 7)];
                    if (var2) {
                        var3.field2683 = var3.field2695 = var4;
                    }
                    int var5 = class142.field2669.method581(5, 7);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var6 = class142.field2669.method581(1, 7);
                    int var7 = class142.field2669.method581(1, 7);
                    if (~var7 == -2) {
                        class80.field1404[class148.field2789++] = var1;
                    }
                    int var8 = class142.field2669.method581(5, 7);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    var3.method1356(class241.field4310.field2720[0] - -var8, (byte) -85, class241.field4310.field2651[0] - -var5, ~var6 == -2);
                    continue;
                }
            }
            if (!arg0) {
                field588 = null;
            }
            class142.field2669.method583(-10);
            ++field574;
            return;
        }
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(IB)[[I")
    public final int[][] method32(int arg0, byte arg1) {
        ++field578;
        int var3 = 89 % ((arg1 - -60) / 45);
        int[][] var4 = super.field4818.method1514(-2, arg0);
        if (super.field4818.field3954 && this.method237(2047)) {
            int var5 = (class13.field235 == this.field572 ? arg0 : this.field572 * arg0 / class13.field235) * this.field571;
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var4[1];
            if (~class246.field4385 != ~this.field571) {
                for (int var9 = 0; class246.field4385 > var9; ++var9) {
                    int var10 = this.field571 * var9 / class246.field4385;
                    int var11 = this.field577[var5 - -var10];
                    var7[var9] = class220.method1526(var11, 255) << 4;
                    var8[var9] = class220.method1526(4080, var11 >> 4);
                    var6[var9] = class220.method1526(16711680, var11) >> 12;
                }
            } else {
                for (int var12 = 0; ~class246.field4385 < ~var12; ++var12) {
                    int var13 = this.field577[var5++];
                    var7[var12] = class220.method1526(var13 << 4, 4080);
                    var8[var12] = class220.method1526(var13 >> 4, 4080);
                    var6[var12] = class220.method1526(var13 >> 12, 4080);
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "(I)V")
    public static void method240(int arg0) {
        field570 = null;
        field587 = null;
        if (arg0 < 96) {
            field587 = null;
        }
        field569 = null;
        field568 = null;
        field585 = null;
        field588 = null;
        field583 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ljd;BI)V")
    public final void method34(class118 arg0, byte arg1, int arg2) {
        ++field584;
        int var4 = -16 % ((arg1 - -21) / 55);
        if (arg2 == 0) {
            this.field580 = arg0.method827(255);
        }
    }
}
