import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class9 extends class212 {

    @OriginalMember(owner = "client!mk", name = "W", descriptor = "I")
    private int field161 = 0;

    @OriginalMember(owner = "client!mk", name = "Y", descriptor = "I")
    private int field163 = 1024;

    @OriginalMember(owner = "client!mk", name = "db", descriptor = "I")
    private int field168 = 409;

    @OriginalMember(owner = "client!mk", name = "X", descriptor = "I")
    private int field162 = 1024;

    @OriginalMember(owner = "client!mk", name = "Z", descriptor = "I")
    private int field164 = 204;

    @OriginalMember(owner = "client!mk", name = "mb", descriptor = "I")
    private int field177 = 8;

    @OriginalMember(owner = "client!mk", name = "ib", descriptor = "I")
    private int field173 = 81;

    @OriginalMember(owner = "client!mk", name = "ob", descriptor = "I")
    private int field179 = 4;

    @OriginalMember(owner = "client!mk", name = "tb", descriptor = "Lsc;")
    public static class181 field184 = class149.method967(255, "scape main");

    @OriginalMember(owner = "client!mk", name = "fb", descriptor = "Lsc;")
    public static class181 field170 = class149.method967(255, "gleiten:");

    @OriginalMember(owner = "client!mk", name = "hb", descriptor = "Lsc;")
    public static class181 field172 = class149.method967(255, "null");

    @OriginalMember(owner = "client!mk", name = "bb", descriptor = "I")
    public static int field166 = 0;

    @OriginalMember(owner = "client!mk", name = "xb", descriptor = "Lsc;")
    public static class181 field188 = class149.method967(255, "Starte 3D)2Softwarebibliothek)3");

    @OriginalMember(owner = "client!mk", name = "V", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!mk", name = "ab", descriptor = "I")
    private int field165;

    @OriginalMember(owner = "client!mk", name = "cb", descriptor = "I")
    private int field167;

    @OriginalMember(owner = "client!mk", name = "eb", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!mk", name = "gb", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!mk", name = "jb", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!mk", name = "nb", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!mk", name = "pb", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!mk", name = "rb", descriptor = "I")
    private int field182;

    @OriginalMember(owner = "client!mk", name = "sb", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!mk", name = "ub", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!mk", name = "wb", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!mk", name = "yb", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!mk", name = "lb", descriptor = "[I")
    public static int[] field176;

    @OriginalMember(owner = "client!mk", name = "qb", descriptor = "[I")
    private int[] field181;

    @OriginalMember(owner = "client!mk", name = "kb", descriptor = "[[I")
    private int[][] field175;

    @OriginalMember(owner = "client!mk", name = "vb", descriptor = "[[I")
    private int[][] field186;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(Z)V")
    public final void method46(boolean arg0) {
        ++field160;
        this.method74(arg0);
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(Z)V")
    private final void method74(boolean arg0) {
        ++field187;
        Random var2 = new Random((long) this.field177);
        this.field181 = new int[this.field177 - -1];
        this.field182 = 4096 / this.field177;
        if (arg0) {
            this.field175 = new int[this.field177][this.field179];
            this.field181[0] = 0;
            this.field186 = new int[this.field177][this.field179 + 1];
            int var3 = this.field182 / 2;
            this.field167 = 4096 / this.field179;
            this.field165 = this.field173 / 2;
            int var4 = this.field167 / 2;
            for (int var5 = 0; ~var5 > ~this.field177; ++var5) {
                if (~var5 < -1) {
                    int var6 = this.field182;
                    int var7 = (-2048 + class136.method879((byte) -112, var2, 4096)) * this.field164 >> 12;
                    int var8 = (var3 * var7 >> 12) + var6;
                    this.field181[var5] = this.field181[var5 - 1] - -var8;
                }
                this.field186[var5][0] = 0;
                for (int var9 = 0; ~this.field179 < ~var9; ++var9) {
                    if (var9 > 0) {
                        int var10 = this.field167;
                        int var11 = (-2048 + class136.method879((byte) -116, var2, 4096)) * this.field168 >> 12;
                        int var12 = (var4 * var11 >> 12) + var10;
                        this.field186[var5][var9] = this.field186[var5][var9 - 1] + var12;
                    }
                    this.field175[var5][var9] = ~this.field163 >= -1 ? 4096 : 4096 - class136.method879((byte) -120, var2, this.field163);
                }
                this.field186[var5][this.field179] = 4096;
            }
            this.field181[this.field177] = 4096;
        }
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(II)Ldi;")
    public static final class64 method75(int arg0, int arg1) {
        ++field178;
        class64 var2 = (class64) class247.field4311.method1794(arg0, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class137.field2245.method89(class107.method718((byte) -88, arg1), class166.method1109(arg1, (byte) 44), 103);
            class64 var4 = new class64();
            var4.field1001 = arg1;
            if (var3 != null) {
                var4.method451(new class230(var3), 7681);
            }
            var4.method454(-48);
            class247.field4311.method1795(arg0 + 14178, (long) arg1, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "(III)Lqc;")
    public static final class75 method76(int arg0, int arg1, int arg2) {
        class220 var3 = class221.field3820[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3801;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lvf;B)V")
    public static final void method77(class230 arg0, byte arg1) {
        ++field171;
        if (arg1 != -57) {
            method75(14, 99);
        }
        while (true) {
            while (arg0.field3977.length > arg0.field3933) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (~arg0.method1516((byte) 82) == -2) {
                    var3 = arg0.method1516((byte) 82);
                    var2 = true;
                    var4 = arg0.method1516((byte) 82);
                }
                int var5 = arg0.method1516((byte) 82);
                int var6 = arg0.method1516((byte) 82);
                int var7 = var5 * 64 + -class265.field4625;
                int var8 = class222.field3840 + class164.field2786 + -1 + -(var6 * 64);
                if (var7 >= 0 && var8 + -63 >= 0 && ~(var7 + 63) > ~class62.field967 && var8 < class222.field3840) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; ++var11) {
                        for (int var12 = 0; var12 < 64; ++var12) {
                            if (!var2 || ~(var3 * 8) >= ~var11 && ~var11 > ~(var3 * 8 + 8) && ~var12 <= ~(var4 * 8) && var12 < var4 * 8 + 8) {
                                int var13 = arg0.method1516((byte) 82);
                                if (~var13 != -1) {
                                    if ((var13 & 1) == 1) {
                                        int var14 = arg0.method1516((byte) 82);
                                        if (class217.field3737[var9][var10] == null) {
                                            class217.field3737[var9][var10] = new byte[4096];
                                        }
                                        class217.field3737[var9][var10][(63 - var12 << 6) - -var11] = (byte) var14;
                                    }
                                    if ((var13 & 2) == 2) {
                                        int var15 = arg0.method1535(2);
                                        if (class113.field1841[var9][var10] == null) {
                                            class113.field1841[var9][var10] = new short[4096];
                                        }
                                        class113.field1841[var9][var10][(-var12 + 63 << 6) + var11] = (short) var15;
                                    }
                                    if (~(4 & var13) == -5) {
                                        int var16 = ((arg0.method1516((byte) 82) & 255) << 16) + ((arg0.method1516((byte) 82) & 255) << 8) - -(255 & arg0.method1516((byte) 82));
                                        if (class23.field407[var9][var10] == null) {
                                            class23.field407[var9][var10] = new int[4096];
                                        }
                                        --var16;
                                        class148 var17 = class62.method442((byte) 79, var16);
                                        if (var17.field2446 != null) {
                                            var17 = var17.method966((byte) 124);
                                            if (var17 == null || ~var17.field2457 == 0) {
                                                continue;
                                            }
                                        }
                                        class23.field407[var9][var10][(63 - var12 << 6) + var11] = var17.field2431 + 1;
                                        class111 var18 = new class111();
                                        var18.field1817 = var7;
                                        var18.field1828 = var17.field2457;
                                        var18.field1818 = var8;
                                        class98.field1581.method1689(var18, arg1 + 156);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var2 ? 64 : 4096); ++var19) {
                        int var20 = arg0.method1516((byte) 82);
                        if (~var20 != -1) {
                            if (~(var20 & 1) == -2) {
                                ++arg0.field3933;
                            }
                            if ((var20 & 2) == 2) {
                                arg0.field3933 += 2;
                            }
                            if (~(var20 & 4) == -5) {
                                arg0.field3933 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "()V")
    public class9() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lvf;II)V")
    public final void method26(class230 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (arg1 != 6) {
                                    if (arg1 == 7) {
                                        this.field163 = arg0.method1535(~arg2);
                                    }
                                } else {
                                    this.field173 = arg0.method1535(2);
                                }
                            } else {
                                this.field161 = arg0.method1535(arg2 + 5);
                            }
                        } else {
                            this.field162 = arg0.method1535(2);
                        }
                    } else {
                        this.field164 = arg0.method1535(2);
                    }
                } else {
                    this.field168 = arg0.method1535(arg2 + 5);
                }
            } else {
                this.field177 = arg0.method1516((byte) 82);
            }
        } else {
            this.field179 = arg0.method1516((byte) 82);
        }
        if (arg2 != -3) {
            this.method74(true);
        }
        ++field180;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Ljb;IZ)Lpd;")
    public static final class48 method78(class11 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            return null;
        } else {
            ++field169;
            return !class18.method173(arg0, (byte) 68, arg1) ? null : class211.method1398((byte) -45);
        }
    }

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "(I)V")
    public static void method79(int arg0) {
        field172 = null;
        field170 = null;
        field188 = null;
        field184 = null;
        if (arg0 > -95) {
            method79(-115);
        }
        field176 = null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IB)[I")
    public final int[] method24(int arg0, byte arg1) {
        int[] var3 = super.field3640.method737(true, arg0);
        ++field185;
        if (arg1 < 25) {
            this.field168 = -45;
        }
        if (super.field3640.field1813) {
            int var4 = 0;
            int var5;
            for (var5 = class176.field3090[arg0] - -this.field161; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (~this.field177 < ~var4 && ~this.field181[var4] >= ~var5) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = (1 & var4) == 0;
            int var8 = this.field181[var4];
            int var9 = this.field181[var4 + -1];
            if (var9 - -this.field165 < var5 && ~(var8 - this.field165) < ~var5) {
                for (int var10 = 0; ~class26.field452 < ~var10; ++var10) {
                    int var11 = 0;
                    int var12 = var7 ? this.field162 : -this.field162;
                    int var13;
                    for (var13 = (this.field167 * var12 >> 12) + class253.field4416[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (var11 < this.field179 && this.field186[var6][var11] <= var13) {
                        ++var11;
                    }
                    int var14 = this.field186[var6][var11];
                    int var15 = var11 + -1;
                    int var16 = this.field186[var6][var15];
                    if (~var13 < ~(var16 - -this.field165) && var13 < -this.field165 + var14) {
                        var3[var10] = this.field175[var6][var15];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class252.method1719(var3, 0, class26.field452, 0);
            }
        }
        return var3;
    }
}
