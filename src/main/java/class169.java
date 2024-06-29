import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class169 extends class12 {

    @OriginalMember(owner = "client!sa", name = "X", descriptor = "I")
    private int field3191 = 5;

    @OriginalMember(owner = "client!sa", name = "N", descriptor = "I")
    private int field3181 = 25;

    @OriginalMember(owner = "client!sa", name = "U", descriptor = "I")
    private int field3188 = 0;

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "I")
    private int field3184 = 2048;

    @OriginalMember(owner = "client!sa", name = "ab", descriptor = "I")
    private int field3194 = 5;

    @OriginalMember(owner = "client!sa", name = "ob", descriptor = "I")
    private int field3208 = 1;

    @OriginalMember(owner = "client!sa", name = "gb", descriptor = "I")
    private int field3200 = 2;

    @OriginalMember(owner = "client!sa", name = "S", descriptor = "Ltg;")
    public static class184 field3186 = class135.method812("Anmelde)2Limit -Uberschritten)3", 3);

    @OriginalMember(owner = "client!sa", name = "cb", descriptor = "I")
    public static int field3196 = 0;

    @OriginalMember(owner = "client!sa", name = "Z", descriptor = "Z")
    public static boolean field3193 = false;

    @OriginalMember(owner = "client!sa", name = "T", descriptor = "Ltg;")
    public static class184 field3187 = class135.method812(":clanreq:", 3);

    @OriginalMember(owner = "client!sa", name = "O", descriptor = "Ltg;")
    private static class184 field3182 = class135.method812("Welcome to RuneScape", 3);

    @OriginalMember(owner = "client!sa", name = "mb", descriptor = "Ltg;")
    public static class184 field3206 = field3182;

    @OriginalMember(owner = "client!sa", name = "nb", descriptor = "Ltg;")
    private static class184 field3207 = class135.method812("Please wait)3)3)3", 3);

    @OriginalMember(owner = "client!sa", name = "V", descriptor = "I")
    public static volatile int field3189 = 0;

    @OriginalMember(owner = "client!sa", name = "lb", descriptor = "Ltg;")
    public static class184 field3205 = class135.method812("<br>", 3);

    @OriginalMember(owner = "client!sa", name = "W", descriptor = "Ltg;")
    public static class184 field3190 = field3207;

    @OriginalMember(owner = "client!sa", name = "P", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!sa", name = "R", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!sa", name = "Y", descriptor = "I")
    private int field3192;

    @OriginalMember(owner = "client!sa", name = "bb", descriptor = "I")
    private int field3195;

    @OriginalMember(owner = "client!sa", name = "eb", descriptor = "I")
    private int field3198;

    @OriginalMember(owner = "client!sa", name = "fb", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!sa", name = "ib", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!sa", name = "jb", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!sa", name = "kb", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!sa", name = "pb", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!sa", name = "rb", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!sa", name = "hb", descriptor = "Loe;")
    public static class137 field3201;

    @OriginalMember(owner = "client!sa", name = "qb", descriptor = "Lvb;")
    public static class197 field3210;

    @OriginalMember(owner = "client!sa", name = "db", descriptor = "[[I")
    private int[][] field3197;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lka;IZ)V")
    public final void method59(class97 arg0, int arg1, boolean arg2) {
        if (arg2) {
            field3189 = -97;
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (arg1 == 6) {
                                    this.field3194 = arg0.method588((byte) -53);
                                }
                            } else {
                                this.field3191 = arg0.method588((byte) -47);
                            }
                        } else {
                            this.field3208 = arg0.method588((byte) -35);
                        }
                    } else {
                        this.field3200 = arg0.method588((byte) -93);
                    }
                } else {
                    this.field3184 = arg0.method611(arg2);
                }
            } else {
                this.field3188 = arg0.method588((byte) -118);
            }
        } else {
            this.field3191 = this.field3194 = arg0.method588((byte) -111);
        }
        ++field3202;
    }

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "(I)V")
    public static void method1049(int arg0) {
        field3207 = null;
        field3186 = null;
        field3210 = null;
        field3205 = null;
        field3201 = null;
        field3190 = null;
        field3206 = null;
        field3182 = null;
        field3187 = null;
        if (arg0 != 10435) {
            method1049(-97);
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(B)V")
    public final void method78(byte arg0) {
        ++field3183;
        if (arg0 == 57) {
            this.method1051((byte) 31);
        }
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)V")
    public static final void method1050(byte arg0) {
        ++field3209;
        int var1 = class21.field394.method115(8, 104);
        if (~var1 > ~class26.field466) {
            for (int var2 = var1; class26.field466 > var2; ++var2) {
                class49.field910[class180.field3431++] = class200.field3880[var2];
            }
        }
        if (~class26.field466 > ~var1) {
            throw new RuntimeException("gppov1");
        } else {
            class26.field466 = 0;
            int var3 = 0;
            if (arg0 != -10) {
                method1052(-109, 1, (byte) 35);
            }
            while (var1 > var3) {
                int var4 = class200.field3880[var3];
                class67 var5 = class57.field1024[var4];
                int var6 = class21.field394.method115(1, arg0 ^ -98);
                if (~var6 == -1) {
                    class200.field3880[class26.field466++] = var4;
                    var5.field609 = class161.field2903;
                } else {
                    int var7 = class21.field394.method115(2, arg0 ^ -98);
                    if (var7 == 0) {
                        class200.field3880[class26.field466++] = var4;
                        var5.field609 = class161.field2903;
                        class103.field1881[class87.field1610++] = var4;
                    } else if (~var7 == -2) {
                        class200.field3880[class26.field466++] = var4;
                        var5.field609 = class161.field2903;
                        int var8 = class21.field394.method115(3, 104);
                        var5.method208(var8, false, false);
                        int var9 = class21.field394.method115(1, 104);
                        if (var9 == 1) {
                            class103.field1881[class87.field1610++] = var4;
                        }
                    } else if (var7 == 2) {
                        class200.field3880[class26.field466++] = var4;
                        var5.field609 = class161.field2903;
                        int var10 = class21.field394.method115(3, 104);
                        var5.method208(var10, false, true);
                        int var11 = class21.field394.method115(3, 104);
                        var5.method208(var11, false, true);
                        int var12 = class21.field394.method115(1, 104);
                        if (~var12 == -2) {
                            class103.field1881[class87.field1610++] = var4;
                        }
                    } else if (var7 == 3) {
                        class49.field910[class180.field3431++] = var4;
                    }
                }
                ++var3;
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
    public class169() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IB)[I")
    public final int[] method62(int arg0, byte arg1) {
        ++field3199;
        int[] var3 = super.field224.method7((byte) 127, arg0);
        if (arg1 != 17) {
            return null;
        } else {
            if (super.field224.field53) {
                int var4 = class37.field698[arg0];
                int var5 = this.field3200;
                if (~var5 != -3) {
                    if (var5 == 1) {
                        for (int var6 = 0; var6 < class201.field3889; ++var6) {
                            int var7 = class131.field2381[var6];
                            var3[var6] = this.method1053(-1, var4, 2, var7)[1];
                        }
                    } else {
                        for (int var8 = 0; class201.field3889 > var8; ++var8) {
                            int var9 = class131.field2381[var8];
                            var3[var8] = this.method1053(-1, var4, 1, var9)[0];
                        }
                    }
                } else {
                    for (int var10 = 0; ~var10 > ~class201.field3889; ++var10) {
                        int var11 = class131.field2381[var10];
                        int[] var12 = this.method1053(-1, var4, 2, var11);
                        var3[var10] = var12[1] + -var12[0];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "(B)V")
    private final void method1051(byte arg0) {
        ++field3185;
        if (arg0 == 31) {
            Random var2 = new Random((long) this.field3188);
            int var3 = 4096 / this.field3191;
            int var4 = 4096 / this.field3194;
            this.field3192 = var4 >> 1;
            this.field3181 = this.field3194 * this.field3191;
            this.field3197 = new int[this.field3181][2];
            this.field3195 = var3 >> 1;
            int var5 = this.field3192 * this.field3184 >> 12;
            int var6 = this.field3195 * this.field3184 >> 12;
            for (int var7 = 0; ~this.field3194 < ~var7; ++var7) {
                int var8 = var4 * var7;
                for (int var9 = 0; var9 < this.field3191; ++var9) {
                    int var10 = this.field3191 * var7 + var9;
                    int var11 = var6 * (-4096 + class116.method712(8192, false, var2)) >> 12;
                    int var12 = var5 * (-4096 + class116.method712(8192, false, var2)) >> 12;
                    this.field3197[var10][0] = var3 * var9 + var11;
                    this.field3197[var10][1] = var8 + var12;
                }
            }
            this.field3198 = this.field3191 > this.field3194 ? this.field3191 : this.field3194;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIB)V")
    public static final void method1052(int arg0, int arg1, byte arg2) {
        long var3 = (long) ((arg0 << 16) + arg1);
        ++field3204;
        class83 var5 = (class83) class81.field1455.method51(var3, -112);
        if (var5 != null) {
            if (arg2 != 57) {
                field3189 = -27;
            }
            class2.field45.method922((byte) -76, var5);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIII)[I")
    private final int[] method1053(int arg0, int arg1, int arg2, int arg3) {
        ++field3203;
        int[] var5 = new int[arg2];
        for (int var6 = 0; ~var6 > ~arg2; ++var6) {
            var5[var6] = Integer.MAX_VALUE;
        }
        int var7 = this.field3192 + arg1;
        int var8 = this.field3195 + arg3;
        if (var8 > 4096) {
            var8 -= 4096;
        }
        if (var7 > 4096) {
            var7 -= 4096;
        }
        int var9 = -1;
        int var10 = this.field3191 * var8 >> 12;
        int var11 = this.field3194 * var7 >> 12;
        int var12 = this.field3191 <= 2 ? this.field3191 + -1 : 2;
        int var13 = Integer.MAX_VALUE;
        int var14 = Integer.MAX_VALUE;
        int var15 = -1;
        int var16 = this.field3194 > 2 ? 2 : this.field3194 - 1;
        for (int var17 = -var12; ~var17 >= ~var12; ++var17) {
            for (int var25 = -var16; var16 >= var25; ++var25) {
                int var26 = var10 + var17;
                int var27 = var11 + var25;
                if (~var27 > -1) {
                    var27 += this.field3194;
                }
                if (var27 >= this.field3194) {
                    var27 -= this.field3194;
                }
                if (var26 < 0) {
                    var26 += this.field3191;
                }
                if (var26 >= this.field3191) {
                    var26 -= this.field3191;
                }
                int var28 = this.field3191 * var27 - -var26;
                int var29 = this.field3197[var28][1];
                int var30 = this.field3197[var28][0];
                int var31 = -var29 + var7;
                int var32 = -var30 + var8;
                if (var31 < 0) {
                    var31 = -var31;
                }
                if (var31 > 2048) {
                    var31 = -var31 + 4096;
                }
                if (var32 < 0) {
                    var32 = -var32;
                }
                if (~var32 < -2049) {
                    var32 = -var32 + 4096;
                }
                int var33 = var31 * var31 + var32 * var32 >> 12;
                if (~var33 > ~var14) {
                    if (var15 != -1) {
                        var15 = var9;
                        var13 = var14;
                    } else {
                        var13 = var33;
                        var15 = var28;
                    }
                    var9 = var28;
                    var14 = var33;
                } else if (~var9 == ~var15 && var15 != var28 || var33 < var13 && var9 != var28) {
                    var15 = var28;
                    var13 = var33;
                }
            }
        }
        int var18 = -this.field3197[var9][0] + var8;
        if (~var18 > -1) {
            var18 = -var18;
        }
        int var19 = var8 - this.field3197[var15][0];
        if (~var18 < -2049) {
            var18 = -var18 + 4096;
        }
        if (var19 < 0) {
            var19 = -var19;
        }
        if (var19 > 2048) {
            var19 = -var19 + 4096;
        }
        int var20 = -this.field3197[var15][1] + var7;
        int var21 = -this.field3197[var9][1] + var7;
        if (var20 < 0) {
            var20 = -var20;
        }
        if (arg0 < ~var21) {
            var21 = -var21;
        }
        if (~var20 < -2049) {
            var20 = -var20 + 4096;
        }
        if (var21 > 2048) {
            var21 = 4096 - var21;
        }
        int var22 = this.field3208;
        int var23;
        int var24;
        if (var22 != 1) {
            if (~var22 == -3) {
                var23 = Math.max(var18, var21);
                var24 = Math.max(var19, var20);
            } else {
                var24 = var19 * var19 - -(var20 * var20);
                var23 = var18 * var18 + var21 * var21;
            }
        } else {
            var23 = (int) Math.sqrt((double) (var18 * var18 + var21 * var21));
            var24 = (int) Math.sqrt((double) (var19 * var19 - -(var20 * var20)));
        }
        var5[0] = this.field3198 * var23;
        if (~arg2 < -2) {
            var5[1] = this.field3198 * var24;
        }
        return var5;
    }
}
