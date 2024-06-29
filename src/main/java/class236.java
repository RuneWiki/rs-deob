import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class236 extends class288 {

    @OriginalMember(owner = "client!wi", name = "D", descriptor = "I")
    private int field3763 = 10;

    @OriginalMember(owner = "client!wi", name = "Q", descriptor = "I")
    private int field3776 = 2048;

    @OriginalMember(owner = "client!wi", name = "M", descriptor = "I")
    private int field3772 = 0;

    @OriginalMember(owner = "client!wi", name = "H", descriptor = "[I")
    public static int[] field3767 = new int[100];

    @OriginalMember(owner = "client!wi", name = "O", descriptor = "[S")
    public static short[] field3774 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!wi", name = "P", descriptor = "I")
    public static int field3775 = -1;

    @OriginalMember(owner = "client!wi", name = "C", descriptor = "Ljava/lang/String;")
    public static String field3762 = null;

    @OriginalMember(owner = "client!wi", name = "E", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!wi", name = "F", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!wi", name = "G", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!wi", name = "I", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!wi", name = "J", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!wi", name = "K", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!wi", name = "R", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!wi", name = "S", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!wi", name = "T", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!wi", name = "U", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!wi", name = "L", descriptor = "[I")
    private int[] field3771;

    @OriginalMember(owner = "client!wi", name = "N", descriptor = "[I")
    private int[] field3773;

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V")
    public class236() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IBI)V")
    public static final void method1553(int arg0, byte arg1, int arg2) {
        class214.field3454[arg2] = arg0;
        int var3 = -52 / ((arg1 - -76) / 47);
        ++field3765;
        class100 var4 = (class100) class129.field2158.method457((long) arg2, (byte) -115);
        if (var4 == null) {
            class100 var5 = new class100(500L + class182.method1253(20215));
            class129.field2158.method466((long) arg2, var5, (byte) 93);
        } else {
            var4.field1519 = 500L + class182.method1253(20215);
        }
    }

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "(I)V")
    private final void method1554(int arg0) {
        this.field3773 = new int[this.field3763 + arg0];
        this.field3771 = new int[this.field3763 + 1];
        ++field3770;
        int var2 = 0;
        int var3 = 4096 / this.field3763;
        int var4 = this.field3776 * var3 >> 12;
        for (int var5 = 0; ~var5 > ~this.field3763; ++var5) {
            this.field3773[var5] = var2;
            this.field3771[var5] = var2 + var4;
            var2 += var3;
        }
        this.field3773[this.field3763] = 4096;
        this.field3771[this.field3763] = 4096 - -this.field3771[0];
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(II)V")
    public static final void method1555(int arg0, int arg1) {
        ++field3764;
        if (~arg1 != 0) {
            if (class110.field1901[arg1]) {
                class151.field2447.method938(-3015, arg1);
                if (class133.field2204[arg1] != null) {
                    if (arg0 < -88) {
                        boolean var2 = true;
                        for (int var3 = 0; ~var3 > ~class133.field2204[arg1].length; ++var3) {
                            if (class133.field2204[arg1][var3] != null) {
                                if (class133.field2204[arg1][var3].field1655 == 2) {
                                    var2 = false;
                                } else {
                                    class133.field2204[arg1][var3] = null;
                                }
                            }
                        }
                        if (var2) {
                            class133.field2204[arg1] = null;
                        }
                        class110.field1901[arg1] = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V")
    public final void method16(byte arg0) {
        this.method1554(1);
        if (arg0 != -125) {
            this.field3773 = null;
        }
        ++field3779;
    }

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "(I)V")
    public static void method1556(int arg0) {
        field3762 = null;
        if (arg0 != -5364) {
            method1553(72, (byte) 108, 121);
        }
        field3774 = null;
        field3767 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lhi;BI)V")
    public final void method20(class264 arg0, byte arg1, int arg2) {
        ++field3766;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field3772 = arg0.method1779(-59);
                }
            } else {
                this.field3776 = arg0.method1777(arg1 ^ 90);
            }
        } else {
            this.field3763 = arg0.method1779(-81);
        }
        if (arg1 != -19) {
            method1557(120);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)[I")
    public final int[] method26(int arg0, int arg1) {
        ++field3768;
        int[] var3 = super.field4609.method579((byte) -62, arg1);
        if (super.field4609.field1059) {
            int var4 = class1.field15[arg1];
            if (this.field3772 != 0) {
                for (int var5 = 0; var5 < class186.field2986; ++var5) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class246.field3958[var5];
                    int var9 = this.field3772;
                    if (~var9 != -2) {
                        if (~var9 != -3) {
                            if (~var9 == -4) {
                                var6 = 2048 - -(-var4 + var8 >> 1);
                            }
                        } else {
                            var6 = (var8 + -4096 + var4 >> 1) + 2048;
                        }
                    } else {
                        var6 = var8;
                    }
                    for (int var10 = 0; var10 < this.field3763; ++var10) {
                        if (this.field3773[var10] <= var6 && ~this.field3773[var10 - -1] < ~var6) {
                            if (var6 < this.field3771[var10]) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; this.field3763 > var12; ++var12) {
                    if (this.field3773[var12] <= var4 && var4 < this.field3773[var12 + 1]) {
                        if (~var4 > ~this.field3771[var12]) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class56.method430(var3, 0, class186.field2986, var11);
            }
        }
        if (arg0 != 0) {
            this.method20((class264) null, (byte) -100, -100);
        }
        return var3;
    }

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "(I)V")
    public static final void method1557(int arg0) {
        if (arg0 <= 15) {
            field3767 = null;
        }
        ++field3780;
        if (class258.field4114 == null) {
            if (class238.field3815 == null) {
                int var1 = class58.field815;
                if (class240.field3852) {
                    if (var1 != 1) {
                        int var2 = class109.field1893;
                        int var3 = class250.field4000;
                        if (~(class250.field4007 + -10) < ~var2 || var2 > class250.field4007 + 10 - -class179.field2897 || class214.field3451 + -10 > var3 || var3 > class283.field4512 + class214.field3451 - -10) {
                            class240.field3852 = false;
                            class134.method944(class283.field4512, class214.field3451, class179.field2897, class250.field4007, false);
                        }
                    }
                    if (~var1 == -2) {
                        int var4 = class250.field4007;
                        int var5 = class214.field3451;
                        int var6 = class179.field2897;
                        int var7 = class266.field4319;
                        int var8 = class232.field3696;
                        int var9 = -1;
                        for (int var10 = 0; var10 < class202.field3248; ++var10) {
                            if (class41.field482) {
                                int var11 = (class202.field3248 + -1 + -var10) * 15 + var5 - -33;
                                if (~var7 < ~var4 && ~(var4 + var6) < ~var7 && ~(var11 + -13) > ~var8 && ~(var11 + 3) < ~var8) {
                                    var9 = var10;
                                }
                            } else {
                                int var12 = (class202.field3248 + -1 - var10) * 15 + var5 + 31;
                                if (var4 < var7 && ~var7 > ~(var4 + var6) && var8 > var12 + -13 && ~(var12 + 3) < ~var8) {
                                    var9 = var10;
                                }
                            }
                        }
                        if (~var9 != 0) {
                            class251.method1653((byte) -3, var9);
                        }
                        class240.field3852 = false;
                        class134.method944(class283.field4512, class214.field3451, class179.field2897, class250.field4007, false);
                        return;
                    }
                } else {
                    if (var1 == 1 && ~class202.field3248 < -1) {
                        short var13 = class23.field291[class202.field3248 + -1];
                        if (var13 == 39 || ~var13 == -18 || var13 == 44 || var13 == 8 || ~var13 == -26 || var13 == 11 || ~var13 == -38 || ~var13 == -33 || var13 == 57 || ~var13 == -44 || var13 == 26 || ~var13 == -1003) {
                            int var14 = class270.field4368[class202.field3248 - 1];
                            int var15 = class23.field284[class202.field3248 - 1];
                            class103 var16 = class168.method1180(8931, var15);
                            class29 var17 = client.method1511(var16);
                            if (var17.method193(-380056356) || var17.method200(65)) {
                                class147.field2382 = 0;
                                class251.field4024 = false;
                                if (class258.field4114 != null) {
                                    class45.method346((byte) 31, class258.field4114);
                                }
                                class258.field4114 = class168.method1180(8931, var15);
                                class160.field2602 = class232.field3696;
                                class205.field3291 = var14;
                                class92.field1308 = class266.field4319;
                                class45.method346((byte) 102, class258.field4114);
                                return;
                            }
                        }
                    }
                    if (var1 == 1 && (~class224.field3556 == -2 && ~class202.field3248 < -3 || class140.method960(class202.field3248 + -1, (byte) -102))) {
                        var1 = 2;
                    }
                    if (var1 == 2 && class202.field3248 > 0 || ~class119.field2009 == -2) {
                        class26.method183(0);
                    }
                    if ((var1 != 1 || ~class202.field3248 >= -1) && ~class119.field2009 != -3) {
                        return;
                    }
                    class129.method896(16);
                }
            }
        }
    }
}
