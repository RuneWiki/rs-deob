import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class261 extends class260 {

    @OriginalMember(owner = "client!wk", name = "L", descriptor = "I")
    private int field4520 = 4;

    @OriginalMember(owner = "client!wk", name = "O", descriptor = "Z")
    private boolean field4522 = true;

    @OriginalMember(owner = "client!wk", name = "U", descriptor = "[B")
    private byte[] field4528 = new byte[512];

    @OriginalMember(owner = "client!wk", name = "ab", descriptor = "I")
    private int field4534 = 4;

    @OriginalMember(owner = "client!wk", name = "Y", descriptor = "I")
    private int field4532 = 4;

    @OriginalMember(owner = "client!wk", name = "fb", descriptor = "I")
    private int field4539 = 0;

    @OriginalMember(owner = "client!wk", name = "jb", descriptor = "I")
    private int field4543 = 1638;

    @OriginalMember(owner = "client!wk", name = "W", descriptor = "I")
    public static int field4530 = 0;

    @OriginalMember(owner = "client!wk", name = "X", descriptor = "Lli;")
    public static class277 field4531 = new class277();

    @OriginalMember(owner = "client!wk", name = "gb", descriptor = "Loh;")
    public static class263 field4540 = class253.method1681(-121, "Eingabeprozedur geladen)3");

    @OriginalMember(owner = "client!wk", name = "eb", descriptor = "Loh;")
    public static class263 field4538 = class253.method1681(-121, ":allyreq:");

    @OriginalMember(owner = "client!wk", name = "hb", descriptor = "Loh;")
    public static class263 field4541 = class253.method1681(-122, "blinken1:");

    @OriginalMember(owner = "client!wk", name = "ib", descriptor = "Loh;")
    public static class263 field4542 = class253.method1681(-120, "Fps:");

    @OriginalMember(owner = "client!wk", name = "kb", descriptor = "[[B")
    public static byte[][] field4544 = new byte[50][];

    @OriginalMember(owner = "client!wk", name = "M", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!wk", name = "P", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!wk", name = "Q", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!wk", name = "R", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!wk", name = "T", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!wk", name = "V", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!wk", name = "Z", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!wk", name = "bb", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!wk", name = "cb", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!wk", name = "db", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!wk", name = "S", descriptor = "[S")
    private short[] field4526;

    @OriginalMember(owner = "client!wk", name = "lb", descriptor = "[S")
    private short[] field4545;

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "()V")
    public class261() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "(I)V")
    private final void method1717(int arg0) {
        if (~this.field4543 >= -1) {
            if (this.field4545 != null && this.field4545.length == this.field4520) {
                this.field4526 = new short[this.field4520];
                for (int var2 = 0; ~var2 > ~this.field4520; ++var2) {
                    this.field4526[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            }
        } else {
            this.field4545 = new short[this.field4520];
            this.field4526 = new short[this.field4520];
            for (int var3 = 0; ~var3 > ~this.field4520; ++var3) {
                this.field4545[var3] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field4543 / 4096.0F), (double) var3)));
                this.field4526[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        ++field4523;
        if (arg0 != 8383) {
            this.method17(-32, 40);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(BIIIIII)I")
    private final int method1718(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4527;
        int var8 = arg5 - 4096;
        int var9 = arg6 >> 12;
        int var10 = var9 - -1;
        if (arg2 <= var10) {
            var10 = 0;
        }
        int var11 = arg6 & 4095;
        int var12 = var10 & 255;
        int var13 = var11 - 4096;
        int var14 = class57.field1186[var11];
        int var15 = -2 / ((-38 - arg0) / 48);
        int var16 = var9 & 255;
        int var17 = 3 & this.field4528[arg4 + var16];
        int var18;
        if (var17 > 1) {
            var18 = ~var17 == -3 ? -arg5 + var11 : -arg5 + -var11;
        } else {
            var18 = var17 == 0 ? arg5 + var11 : -var11 + arg5;
        }
        int var19 = this.field4528[arg4 + var12] & 3;
        int var20;
        if (var19 > 1) {
            var20 = var19 != 2 ? -arg5 + -var13 : -arg5 + var13;
        } else {
            var20 = var19 == 0 ? arg5 + var13 : arg5 - var13;
        }
        int var21 = var18 - -((-var18 + var20) * var14 >> 12);
        int var22 = this.field4528[arg1 + var16] & 3;
        int var23;
        if (~var22 >= -2) {
            var23 = var22 != 0 ? -var11 + var8 : var8 + var11;
        } else {
            var23 = ~var22 != -3 ? -var8 + -var11 : -var8 + var11;
        }
        int var24 = this.field4528[arg1 + var12] & 3;
        int var25;
        if (~var24 < -2) {
            var25 = var24 != 2 ? -var8 + -var13 : -var8 + var13;
        } else {
            var25 = var24 != 0 ? -var13 + var8 : var8 + var13;
        }
        int var26 = ((var25 - var23) * var14 >> 12) + var23;
        return var21 - -((-var21 + var26) * arg3 >> 12);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IILsi;)V")
    public final void method86(int arg0, int arg1, class194 arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (arg0 == 6) {
                                    this.field4532 = arg2.method1301(-8317);
                                }
                            } else {
                                this.field4534 = arg2.method1301(-8317);
                            }
                        } else {
                            this.field4539 = arg2.method1301(-8317);
                        }
                    } else {
                        this.field4534 = this.field4532 = arg2.method1301(-8317);
                    }
                } else {
                    this.field4543 = arg2.method1298((byte) -96);
                    if (~this.field4543 > -1) {
                        this.field4545 = new short[this.field4520];
                        for (int var5 = 0; var5 < this.field4520; ++var5) {
                            this.field4545[var5] = (short) arg2.method1298((byte) -105);
                        }
                    }
                }
            } else {
                this.field4520 = arg2.method1301(-8317);
            }
        } else {
            this.field4522 = ~arg2.method1301(-8317) == -2;
        }
        if (arg1 != 5701) {
            this.method1718((byte) -10, 27, 101, 117, -51, -82, 21);
        }
        ++field4525;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(II)[I")
    public final int[] method17(int arg0, int arg1) {
        ++field4537;
        int[] var3 = super.field4511.method304(arg0, false);
        if (arg1 != 255) {
            field4531 = null;
        }
        if (super.field4511.field1029) {
            this.method1723(var3, arg0, -89);
        }
        return var3;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IZ)V")
    public static final void method1719(int arg0, boolean arg1) {
        class61.method371((byte) 77);
        ++field4521;
        if (class271.field4786 == 30 || class271.field4786 == 25) {
            ++class209.field3778;
            if (class209.field3778 >= 50 || arg1) {
                class209.field3778 = arg0;
                if (!class182.field3309 && class166.field3023 != null) {
                    class154.field2792.method1516(arg0 ^ 100, 190);
                    try {
                        class166.field3023.method806(0, class154.field2792.field3497, class154.field2792.field3469, -109);
                        class154.field2792.field3497 = 0;
                    } catch (IOException var2) {
                        class182.field3309 = true;
                    }
                    ++field4536;
                }
                class61.method371((byte) 77);
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "(I)V")
    public static final void method1720(int arg0) {
        class92.field1824 = 0;
        class180.field3280 = 1;
        class252.field4381 = 0;
        class182.field3309 = false;
        class63.field1267 = arg0;
        class96.field1873 = -3;
        class255.field4428 = 0;
        ++field4524;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIBI)V")
    public static final void method1721(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        ++field4529;
        class133.method881(arg0, arg4, arg0 - -arg1, arg2 + arg4);
        class133.method865(arg0, arg4, arg1, arg2, 0);
        if (class163.field2967 >= 100) {
            if (class275.field4819 == null || ~class275.field4819.field2585 != ~arg1 || ~class275.field4819.field2583 != ~arg2) {
                class140 var5 = new class140(arg1, arg2);
                class133.method878(var5.field2571, arg1, arg2);
                class269.method1820(arg1, arg2, arg3 ^ -3033, class8.field149, class112.field2110, 0, 0, 0, 0);
                class275.field4819 = var5;
                class255.field4454.method1690(98);
            }
            class275.field4819.method934(arg0, arg4);
            int var6 = arg0 - -(client.field2771 * arg1 / class8.field149);
            int var7 = class177.field3253 * arg2 / class112.field2110 + arg4;
            if (arg3 != -111) {
                method1720(-72);
            }
            int var8 = class134.field2462 * arg2 / class112.field2110;
            int var9 = class86.field1682 * arg1 / class8.field149;
            class133.method874(var6, var7, var9, var8, 16711680, 128);
            class133.method876(var6, var7, var9, var8, 16711680);
            if (~class33.field800 < -1 && class33.field800 % 10 < 5) {
                for (class94 var10 = (class94) class31.field755.method1878(true); var10 != null; var10 = (class94) class31.field755.method1881(arg3 + 74)) {
                    if (class152.field2742 == var10.field1853) {
                        int var11 = var10.field1859 * arg2 / class112.field2110 + arg4;
                        int var12 = var10.field1856 * arg1 / class8.field149 + arg0;
                        class133.method865(var12 + -2, var11 - 2, 4, 4, 16776960);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "(I)V")
    public static void method1722(int arg0) {
        if (arg0 == 25) {
            field4531 = null;
            field4544 = null;
            field4538 = null;
            field4542 = null;
            field4540 = null;
            field4541 = null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "([III)V")
    private final void method1723(int[] arg0, int arg1, int arg2) {
        ++field4535;
        int var4 = class275.field4825[arg1] * this.field4532;
        if (~this.field4520 != -2) {
            short var5 = this.field4545[0];
            if (var5 > 8 || var5 < -8) {
                int var6 = this.field4526[0] << 12;
                int var7 = var4 * var6 >> 12;
                int var8 = this.field4532 * var6 >> 12;
                int var9 = var7 >> 12;
                int var10 = var9 + 1;
                int var11 = var7 & 4095;
                if (~var10 <= ~var8) {
                    var10 = 0;
                }
                int var12 = class57.field1186[var11];
                int var13 = this.field4534 * var6 >> 12;
                int var14 = 255 & this.field4528[var10 & 255];
                int var15 = 255 & this.field4528[var9 & 255];
                for (int var16 = 0; ~var16 > ~class49.field1052; ++var16) {
                    int var36 = class70.field1409[var16] * this.field4534;
                    int var37 = this.method1718((byte) 60, var14, var13, var12, var15, var11, var6 * var36 >> 12);
                    arg0[var16] = var5 * var37 >> 12;
                }
            }
            for (int var17 = 1; ~this.field4520 < ~var17; ++var17) {
                short var18 = this.field4545[var17];
                if (var18 > 8 || var18 < -8) {
                    int var19 = this.field4526[var17] << 12;
                    int var20 = this.field4534 * var19 >> 12;
                    int var21 = var4 * var19 >> 12;
                    int var22 = var21 >> 12;
                    int var23 = var22 + 1;
                    int var24 = this.field4532 * var19 >> 12;
                    int var25 = this.field4528[255 & var22] & 255;
                    if (var23 >= var24) {
                        var23 = 0;
                    }
                    int var26 = 255 & this.field4528[var23 & 255];
                    int var27 = var21 & 4095;
                    int var28 = class57.field1186[var27];
                    if (this.field4522 && ~(this.field4520 + -1) == ~var17) {
                        for (int var29 = 0; ~var29 > ~class49.field1052; ++var29) {
                            int var30 = class70.field1409[var29] * this.field4534;
                            int var31 = this.method1718((byte) 116, var26, var20, var28, var25, var27, var19 * var30 >> 12);
                            int var32 = (var18 * var31 >> 12) + arg0[var29];
                            arg0[var29] = (var32 >> 1) + 2048;
                        }
                    } else {
                        for (int var33 = 0; ~var33 > ~class49.field1052; ++var33) {
                            int var34 = class70.field1409[var33] * this.field4534;
                            int var35 = this.method1718((byte) 52, var26, var20, var28, var25, var27, var19 * var34 >> 12);
                            arg0[var33] += var18 * var35 >> 12;
                        }
                    }
                }
            }
        } else {
            int var38 = this.field4526[0] << 12;
            int var39 = var4 * var38 >> 12;
            int var40 = var39 >> 12;
            int var41 = this.field4534 * var38 >> 12;
            short var42 = this.field4545[0];
            int var43 = var39 & 4095;
            int var44 = 255 & this.field4528[255 & var40];
            int var45 = var40 + 1;
            int var46 = this.field4532 * var38 >> 12;
            int var47 = class57.field1186[var43];
            if (~var46 >= ~var45) {
                var45 = 0;
            }
            int var48 = this.field4528[var45 & 255] & 255;
            if (this.field4522) {
                for (int var49 = 0; var49 < class49.field1052; ++var49) {
                    int var50 = class70.field1409[var49] * this.field4534;
                    int var51 = this.method1718((byte) -110, var48, var41, var47, var44, var43, var38 * var50 >> 12);
                    int var52 = var42 * var51 >> 12;
                    arg0[var49] = (var52 >> 1) + 2048;
                }
            } else {
                for (int var53 = 0; class49.field1052 > var53; ++var53) {
                    int var55 = class70.field1409[var53] * this.field4534;
                    int var56 = this.method1718((byte) 12, var48, var41, var47, var44, var43, var38 * var55 >> 12);
                    arg0[var53] = var42 * var56 >> 12;
                }
            }
        }
        int var54 = 93 / ((-30 - arg2) / 50);
    }

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "(I)V")
    public final void method88(int arg0) {
        this.field4528 = class190.method1249(127, this.field4539);
        ++field4533;
        this.method1717(8383);
        if (arg0 < 81) {
            field4544 = null;
        }
        for (int var2 = this.field4520 + -1; ~var2 <= -2; --var2) {
            short var3 = this.field4545[var2];
            if (~var3 < -9) {
                return;
            }
            if (~var3 > 7) {
                return;
            }
            --this.field4520;
        }
    }
}
