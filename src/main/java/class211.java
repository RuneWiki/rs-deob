import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class211 extends class166 {

    @OriginalMember(owner = "client!md", name = "S", descriptor = "I")
    private int field3831 = 409;

    @OriginalMember(owner = "client!md", name = "V", descriptor = "I")
    private int field3834 = 4096;

    @OriginalMember(owner = "client!md", name = "U", descriptor = "I")
    private int field3833 = 4096;

    @OriginalMember(owner = "client!md", name = "P", descriptor = "[I")
    private int[] field3828 = new int[3];

    @OriginalMember(owner = "client!md", name = "db", descriptor = "I")
    private int field3842 = 4096;

    @OriginalMember(owner = "client!md", name = "ab", descriptor = "I")
    public static int field3839 = 0;

    @OriginalMember(owner = "client!md", name = "O", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!md", name = "Q", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!md", name = "T", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!md", name = "W", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!md", name = "X", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!md", name = "Y", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!md", name = "Z", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!md", name = "bb", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!md", name = "cb", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!md", name = "eb", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!md", name = "R", descriptor = "Lnc;")
    public static class83 field3830;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "(I)V")
    public static void method1519(int arg0) {
        int var1 = 40 / ((-16 - arg0) / 61);
        field3830 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)[[I")
    public final int[][] method134(int arg0, int arg1) {
        if (arg0 != 0) {
            return null;
        } else {
            ++field3837;
            int[][] var3 = super.field3064.method320(arg1, (byte) -17);
            if (super.field3064.field979) {
                int[][] var4 = this.method1229(arg1, arg0 + 23580, 0);
                int[] var5 = var4[0];
                int[] var6 = var3[1];
                int[] var7 = var4[1];
                int[] var8 = var4[2];
                int[] var9 = var3[2];
                int[] var10 = var3[0];
                for (int var11 = 0; ~class253.field4565 < ~var11; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var12 - this.field3828[0];
                    if (var13 < 0) {
                        var13 = -var13;
                    }
                    if (~this.field3831 > ~var13) {
                        var10[var11] = var12;
                        var6[var11] = var7[var11];
                        var9[var11] = var8[var11];
                    } else {
                        int var14 = var7[var11];
                        int var15 = -this.field3828[1] + var14;
                        if (~var15 > -1) {
                            var15 = -var15;
                        }
                        if (~this.field3831 > ~var15) {
                            var10[var11] = var12;
                            var6[var11] = var14;
                            var9[var11] = var8[var11];
                        } else {
                            int var16 = var8[var11];
                            int var17 = -this.field3828[2] + var16;
                            if (var17 < 0) {
                                var17 = -var17;
                            }
                            if (~this.field3831 > ~var17) {
                                var10[var11] = var12;
                                var6[var11] = var14;
                                var9[var11] = var16;
                            } else {
                                var10[var11] = this.field3834 * var12 >> 12;
                                var6[var11] = this.field3842 * var14 >> 12;
                                var9[var11] = this.field3833 * var16 >> 12;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(B)V")
    public static final void method1520(byte arg0) {
        ++field3829;
        class180 var1 = (class180) class262.field4668.method1724(255);
        if (arg0 > 92) {
            while (var1 != null) {
                class228 var2 = var1.field3261;
                if (class52.field927 == var2.field4148 && !var2.field4174) {
                    if (var2.field4151 <= class180.field3272) {
                        var2.method1629(class148.field2767, -62);
                        if (!var2.field4174) {
                            class213.method1538(var2.field4148, var2.field4171, var2.field4150, var2.field4170, 60, var2, 0, -1L, false);
                        } else {
                            var1.method632(-8296);
                        }
                    }
                } else {
                    var1.method632(-8296);
                }
                var1 = (class180) class262.field4668.method1726(117);
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "e", descriptor = "(II)Lek;")
    public static final class159 method1521(int arg0, int arg1) {
        if (arg0 > -39) {
            method1523((class69) null, -65, 106);
        }
        ++field3836;
        class159 var2 = (class159) class172.field3147.method1714((long) arg1, (byte) -128);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class189.field3425.method590(class88.method634((byte) -65, arg1), class240.method1703(arg1, (byte) -98), 0);
            class159 var4 = new class159();
            if (var3 != null) {
                var4.method1196(-1, new class128(var3));
            }
            var4.method1197(-1);
            class172.field3147.method1705((byte) 127, var4, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!md", name = "e", descriptor = "(B)V")
    public static final void method1522(byte arg0) {
        if (class35.field483 != -1) {
            class262.method1797((byte) -111, class35.field483);
        }
        ++field3840;
        for (int var1 = 0; var1 < class151.field2797; ++var1) {
            if (class40.field576[var1]) {
                class49.field723[var1] = true;
            }
            class175.field3201[var1] = class40.field576[var1];
            class40.field576[var1] = false;
        }
        class108.field2075 = null;
        if (arg0 > -112) {
            method1523((class69) null, 11, 74);
        }
        class222.field3990 = -1;
        class58.field1057 = -1;
        class159.field2952 = class180.field3272;
        if (~class35.field483 != 0) {
            class151.field2797 = 0;
            class56.method337((byte) -128, 0, -1, 0, class20.field287, 0, class66.field1278, class35.field483, 0);
        }
        class15.method99();
        class148.field2767 = 0;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lhj;II)V")
    public static final void method1523(class69 arg0, int arg1, int arg2) {
        ++field3843;
        class135 var3 = class8.method38((byte) 109, 3, arg2);
        var3.method1011((byte) 122);
        if (arg1 != 1) {
            method1520((byte) 20);
        }
        var3.field2533 = arg0;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIBI)V")
    public static final void method1524(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != 58) {
            method1520((byte) -47);
        }
        if (arg0 > arg1) {
            for (int var5 = arg1; ~arg0 < ~var5; ++var5) {
                class186.field3402[var5][arg4] = arg2;
            }
        } else {
            for (int var6 = arg0; arg1 > var6; ++var6) {
                class186.field3402[var6][arg4] = arg2;
            }
        }
        ++field3827;
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V")
    public class211() {
        super(1, false);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BLfh;I)V")
    public final void method18(byte arg0, class128 arg1, int arg2) {
        ++field3838;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (arg2 == 4) {
                            int var5 = arg1.method952((byte) -85);
                            this.field3828[1] = class69.method443(4080, var5 >> 4);
                            this.field3828[0] = class69.method443(16711680, var5) << 4;
                            this.field3828[2] = class69.method443(255, var5) >> 12;
                        }
                    } else {
                        this.field3834 = arg1.method912(-83);
                    }
                } else {
                    this.field3842 = arg1.method912(122);
                }
            } else {
                this.field3833 = arg1.method912(arg0 + -9);
            }
        } else {
            this.field3831 = arg1.method912(111);
        }
        if (arg0 != 96) {
            field3839 = 125;
        }
    }

    @OriginalMember(owner = "client!md", name = "f", descriptor = "(II)I")
    public static final int method1525(int arg0, int arg1) {
        ++field3835;
        int var2 = -23 / ((-32 - arg1) / 55);
        if (arg0 >= 97 && ~arg0 >= -123 || arg0 >= 224 && arg0 <= 254 && ~arg0 != -248) {
            return arg0 + -32;
        } else if (arg0 == 255) {
            return 159;
        } else {
            return arg0 == 156 ? 140 : arg0;
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(IIIIII)V")
    public static final void method1526(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg2; var6 <= arg4; ++var6) {
            class99.method740(arg5, class186.field3402[var6], -1162793114, arg3, arg1);
        }
        ++field3841;
        if (arg0 <= 2) {
            method1521(34, 92);
        }
    }

    @OriginalMember(owner = "client!md", name = "g", descriptor = "(II)V")
    public static final void method1527(int arg0, int arg1) {
        if (arg0 == -1 && !class119.field2251) {
            class145.method1101(true);
        } else if (arg0 != -1 && (class231.field4229 != arg0 || !class28.method162(true)) && ~class81.field1554 != -1 && !class119.field2251) {
            class192.method1389(class81.field1554, 2, false, -121, 0, arg0, class91.field1723);
        }
        ++field3832;
        int var2 = 97 / ((arg1 - -9) / 60);
        class231.field4229 = arg0;
    }
}
