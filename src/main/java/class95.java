import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class95 extends class200 {

    @OriginalMember(owner = "client!nl", name = "V", descriptor = "I")
    private int field1672 = 4096;

    @OriginalMember(owner = "client!nl", name = "R", descriptor = "I")
    private int field1668 = 0;

    @OriginalMember(owner = "client!nl", name = "Q", descriptor = "Lgk;")
    public static class157 field1667 = new class157();

    @OriginalMember(owner = "client!nl", name = "X", descriptor = "Lid;")
    public static class149 field1674 = class60.method382("Null", (byte) 55);

    @OriginalMember(owner = "client!nl", name = "bb", descriptor = "I")
    public static int field1678 = -1;

    @OriginalMember(owner = "client!nl", name = "Z", descriptor = "Lid;")
    public static class149 field1676 = class60.method382("Lade Sprites )2 ", (byte) 37);

    @OriginalMember(owner = "client!nl", name = "O", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!nl", name = "P", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!nl", name = "S", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!nl", name = "T", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!nl", name = "U", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!nl", name = "W", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!nl", name = "ab", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!nl", name = "cb", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!nl", name = "db", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!nl", name = "eb", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!nl", name = "Y", descriptor = "Lal;")
    public static class230 field1675;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(IB)Lid;")
    public static final class149 method689(int arg0, byte arg1) {
        ++field1669;
        if (~arg0 < -1 && ~arg0 >= -256) {
            int var2 = -110 / ((-29 - arg1) / 61);
            class149 var3 = new class149();
            var3.field2670 = 1;
            var3.field2694 = new byte[1];
            var3.field2694[0] = (byte) arg0;
            return var3;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZBLid;)V")
    public static final void method690(boolean arg0, byte arg1, class149 arg2) {
        if (arg0) {
            try {
                class168.field3111.getAppletContext().showDocument(arg2.method1034(class168.field3111.getCodeBase(), (byte) 117), "_blank");
            } catch (Exception var4) {
            }
        } else {
            try {
                class168.field3111.getAppletContext().showDocument(arg2.method1034(class168.field3111.getCodeBase(), (byte) 117), "_top");
            } catch (Exception var3) {
            }
        }
        ++field1679;
        if (arg1 < 72) {
            method689(67, (byte) -128);
        }
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(II)V")
    public static final void method691(int arg0, int arg1) {
        ++field1681;
        short var2 = 256;
        if (var2 < arg0) {
            arg0 = var2;
        }
        if (~arg0 < -11) {
            arg0 = 10;
        }
        class116.field1985 += arg0 * 128;
        if (class67.field1177.length < class116.field1985) {
            int var3 = (int) (12.0D * Math.random());
            class116.field1985 -= class67.field1177.length;
            class263.method1828(-69, class195.field3491[var3]);
        }
        int var4 = arg0 * 128;
        int var5 = 0;
        int var6 = (-arg0 + var2) * 128;
        for (int var7 = 0; ~var6 < ~var7; ++var7) {
            int var26 = class37.field553[var4 + var5] + -(class67.field1177[class67.field1177.length + -1 & class116.field1985 + var5] * arg0 / 6);
            if (var26 < 0) {
                var26 = 0;
            }
            class37.field553[var5++] = var26;
        }
        for (int var8 = -arg0 + var2; ~var8 > ~var2; ++var8) {
            int var23 = var8 * 128;
            for (int var24 = 0; ~var24 > -129; ++var24) {
                int var25 = (int) (100.0D * Math.random());
                if (~var25 > -51 && ~var24 < -11 && var24 < 118) {
                    class37.field553[var23 + var24] = 255;
                } else {
                    class37.field553[var23 + var24] = 0;
                }
            }
        }
        if (arg1 != 12) {
            method690(true, (byte) -21, (class149) null);
        }
        for (int var9 = 0; -arg0 + var2 > var9; ++var9) {
            class182.field3290[var9] = class182.field3290[arg0 + var9];
        }
        for (int var10 = var2 - arg0; ~var10 > ~var2; ++var10) {
            class182.field3290[var10] = (int) (Math.sin((double) class256.field4475 / 14.0D) * 16.0D + Math.sin((double) class256.field4475 / 15.0D) * 14.0D + Math.sin((double) class256.field4475 / 16.0D) * 12.0D);
            ++class256.field4475;
        }
        int var11 = ((class118.field2022 & 1) + arg0) / 2;
        class168.field3122 += arg0;
        if (var11 > 0) {
            for (int var12 = 0; ~var12 > ~class168.field3122; ++var12) {
                int var21 = 2 + (int) (Math.random() * 124.0D);
                int var22 = 128 + (int) (Math.random() * 128.0D);
                class37.field553[var21 - -(var22 << 7)] = 192;
            }
            class168.field3122 = 0;
            for (int var13 = 0; var13 < var2; ++var13) {
                int var18 = 0;
                int var19 = var13 * 128;
                for (int var20 = -var11; var20 < 128; ++var20) {
                    if (~(var11 + var20) > -129) {
                        var18 += class37.field553[var11 + var19 + var20];
                    }
                    if (-var11 - (1 - var20) >= 0) {
                        var18 -= class37.field553[-var11 - 1 + var19 + var20];
                    }
                    if (~var20 <= -1) {
                        class147.field2660[var19 + var20] = var18 / (var11 * 2 + 1);
                    }
                }
            }
            for (int var14 = 0; ~var14 > -129; ++var14) {
                int var15 = 0;
                for (int var16 = -var11; ~var16 > ~var2; ++var16) {
                    int var17 = var16 * 128;
                    if (~(var11 + var16) > ~var2) {
                        var15 += class147.field2660[var14 + var17 - -(var11 * 128)];
                    }
                    if (var16 + -1 + -var11 >= 0) {
                        var15 -= class147.field2660[-(var11 * 128) + -128 + var14 + var17];
                    }
                    if (~var16 <= -1) {
                        class37.field553[var14 - -var17] = var15 / (var11 * 2 + 1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method24(boolean arg0, int arg1) {
        if (!arg0) {
            method692(77);
        }
        ++field1666;
        int[][] var3 = super.field3632.method965(arg1, 127);
        if (super.field3632.field2550) {
            int[][] var4 = this.method1366(arg1, false, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class137.field2515; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (this.field1668 <= var12) {
                    if (~this.field1672 > ~var12) {
                        var8[var11] = this.field1672;
                    } else {
                        var8[var11] = var12;
                    }
                } else {
                    var8[var11] = this.field1668;
                }
                if (~var13 <= ~this.field1668) {
                    if (~this.field1672 <= ~var13) {
                        var9[var11] = var13;
                    } else {
                        var9[var11] = this.field1672;
                    }
                } else {
                    var9[var11] = this.field1668;
                }
                if (var14 < this.field1668) {
                    var10[var11] = this.field1668;
                } else if (var14 <= this.field1672) {
                    var10[var11] = var14;
                } else {
                    var10[var11] = this.field1672;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "(I)I")
    public static final int method692(int arg0) {
        ++field1670;
        class43.field666 = 0;
        return arg0 < 70 ? 47 : class133.method932(90);
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V")
    public class95() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IB)[I")
    public final int[] method26(int arg0, byte arg1) {
        ++field1671;
        int[] var3 = super.field3638.method1879(arg0, true);
        if (super.field3638.field4887) {
            int[] var4 = this.method1368(0, arg0, false);
            for (int var5 = 0; class137.field2515 > var5; ++var5) {
                int var6 = var4[var5];
                if (~this.field1668 < ~var6) {
                    var3[var5] = this.field1668;
                } else if (var6 > this.field1672) {
                    var3[var5] = this.field1672;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        if (arg1 != 55) {
            this.field1668 = 51;
        }
        return var3;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIB)V")
    public static final void method693(int arg0, int arg1, byte arg2) {
        ++field1673;
        class216 var3 = class139.method972(arg1, false, 1);
        int var4 = -73 % ((arg2 - -43) / 54);
        var3.method1459(true);
        var3.field3809 = arg0;
    }

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "(I)V")
    public static void method694(int arg0) {
        field1676 = null;
        field1674 = null;
        field1667 = null;
        if (arg0 != 0) {
            field1680 = -116;
        }
        field1675 = null;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lgd;ZI)V")
    public final void method31(class74 arg0, boolean arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field3641 = arg0.method489((byte) 92) == 1;
                }
            } else {
                this.field1672 = arg0.method485(-2386);
            }
        } else {
            this.field1668 = arg0.method485(-2386);
        }
        if (!arg1) {
            field1675 = null;
        }
        ++field1665;
    }
}
