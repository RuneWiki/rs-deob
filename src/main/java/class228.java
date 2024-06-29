import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class228 extends class276 {

    @OriginalMember(owner = "client!of", name = "Y", descriptor = "I")
    private int field3848 = 4096;

    @OriginalMember(owner = "client!of", name = "Z", descriptor = "I")
    private int field3849 = 4096;

    @OriginalMember(owner = "client!of", name = "T", descriptor = "I")
    private int field3843 = 4096;

    @OriginalMember(owner = "client!of", name = "O", descriptor = "[I")
    private int[] field3838 = new int[3];

    @OriginalMember(owner = "client!of", name = "ab", descriptor = "I")
    private int field3850 = 409;

    @OriginalMember(owner = "client!of", name = "P", descriptor = "Ljava/lang/String;")
    public static String field3839 = "Continue";

    @OriginalMember(owner = "client!of", name = "N", descriptor = "I")
    public static int field3837 = 0;

    @OriginalMember(owner = "client!of", name = "M", descriptor = "[Ljava/lang/String;")
    public static String[] field3836 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!of", name = "cb", descriptor = "I")
    public static int field3852 = 0;

    @OriginalMember(owner = "client!of", name = "Q", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!of", name = "R", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!of", name = "S", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!of", name = "U", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!of", name = "W", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!of", name = "X", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!of", name = "bb", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!of", name = "V", descriptor = "[[S")
    public static short[][] field3845;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BI)V")
    public static final void method1531(byte arg0, int arg1) {
        ++field3842;
        if (arg0 > -52) {
            method1533(52);
        }
        short var2 = 256;
        if (~arg1 < ~var2) {
            arg1 = var2;
        }
        if (arg1 > 10) {
            arg1 = 10;
        }
        class115.field2060 += arg1 * 128;
        if (~class115.field2060 < ~class163.field2696.length) {
            class115.field2060 -= class163.field2696.length;
            int var3 = (int) (Math.random() * 12.0D);
            class134.method933(class156.field2614[var3], 18243);
        }
        int var4 = 0;
        int var5 = (-arg1 + var2) * 128;
        int var6 = arg1 * 128;
        for (int var7 = 0; ~var7 > ~var5; ++var7) {
            int var26 = class190.field3078[var4 + var6] + -(class163.field2696[class163.field2696.length + -1 & class115.field2060 + var4] * arg1 / 6);
            if (~var26 > -1) {
                var26 = 0;
            }
            class190.field3078[var4++] = var26;
        }
        for (int var8 = -arg1 + var2; var2 > var8; ++var8) {
            int var23 = var8 * 128;
            for (int var24 = 0; ~var24 > -129; ++var24) {
                int var25 = (int) (100.0D * Math.random());
                if (~var25 > -51 && var24 > 10 && ~var24 > -119) {
                    class190.field3078[var24 - -var23] = 255;
                } else {
                    class190.field3078[var23 + var24] = 0;
                }
            }
        }
        for (int var9 = 0; var9 < -arg1 + var2; ++var9) {
            class207.field3450[var9] = class207.field3450[arg1 + var9];
        }
        for (int var10 = -arg1 + var2; var2 > var10; ++var10) {
            class207.field3450[var10] = (int) (16.0D * Math.sin((double) class162.field2690 / 14.0D) + Math.sin((double) class162.field2690 / 15.0D) * 14.0D + Math.sin((double) class162.field2690 / 16.0D) * 12.0D);
            ++class162.field2690;
        }
        class129.field2268 += arg1;
        int var11 = ((1 & class266.field4301) + arg1) / 2;
        if (~var11 < -1) {
            for (int var12 = 0; var12 < class129.field2268; ++var12) {
                int var21 = 2 + (int) (124.0D * Math.random());
                int var22 = 128 + (int) (128.0D * Math.random());
                class190.field3078[(var22 << 7) + var21] = 192;
            }
            class129.field2268 = 0;
            for (int var13 = 0; ~var2 < ~var13; ++var13) {
                int var18 = 0;
                int var19 = var13 * 128;
                for (int var20 = -var11; ~var20 > -129; ++var20) {
                    if (~(var20 - -var11) > -129) {
                        var18 += class190.field3078[var11 + var19 + var20];
                    }
                    if (~(var20 - var11 + -1) <= -1) {
                        var18 -= class190.field3078[var20 - -var19 - (var11 - -1)];
                    }
                    if (var20 >= 0) {
                        class125.field2203[var19 + var20] = var18 / (var11 * 2 + 1);
                    }
                }
            }
            for (int var14 = 0; ~var14 > -129; ++var14) {
                int var15 = 0;
                for (int var16 = -var11; ~var2 < ~var16; ++var16) {
                    int var17 = var16 * 128;
                    if (~(var11 + var16) > ~var2) {
                        var15 += class125.field2203[var11 * 128 + var14 + var17];
                    }
                    if (~(-var11 + var16 + -1) <= -1) {
                        var15 -= class125.field2203[var14 + var17 + -((var11 + 1) * 128)];
                    }
                    if (~var16 <= -1) {
                        class190.field3078[var14 - -var17] = var15 / (var11 * 2 - -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(II)[[I")
    public final int[][] method300(int arg0, int arg1) {
        ++field3840;
        int[][] var3 = super.field4418.method835((byte) 108, arg0);
        if (super.field4418.field2164) {
            int[][] var4 = this.method1810((byte) -22, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var4[2];
            for (int var11 = 0; class53.field929 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field3838[0] + var12;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (~this.field3850 > ~var13) {
                    var8[var11] = var12;
                    var7[var11] = var6[var11];
                    var9[var11] = var10[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field3838[1] + var14;
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (~var15 < ~this.field3850) {
                        var8[var11] = var12;
                        var7[var11] = var14;
                        var9[var11] = var10[var11];
                    } else {
                        int var16 = var10[var11];
                        int var17 = -this.field3838[2] + var16;
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (this.field3850 < var17) {
                            var8[var11] = var12;
                            var7[var11] = var14;
                            var9[var11] = var16;
                        } else {
                            var8[var11] = this.field3848 * var12 >> 12;
                            var7[var11] = this.field3849 * var14 >> 12;
                            var9[var11] = this.field3843 * var16 >> 12;
                        }
                    }
                }
            }
        }
        if (arg1 != -1) {
            method1534((byte) -119, (class101) null, 35);
        }
        return var3;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Z[B)Z")
    public static final boolean method1532(boolean arg0, byte[] arg1) {
        if (!arg0) {
            method1532(true, (byte[]) null);
        }
        ++field3847;
        class101 var2 = new class101(arg1);
        int var3 = var2.method669((byte) 36);
        if (~var3 != -2) {
            return false;
        } else {
            boolean var4 = var2.method669((byte) 36) == 1;
            if (var4) {
                class60.method370((byte) 80, var2);
            }
            class188.method1228(var2, (byte) -62);
            return true;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILeh;B)V")
    public final void method21(int arg0, class101 arg1, byte arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 == 4) {
                            int var5 = arg1.method658(22292);
                            this.field3838[0] = class113.method791(var5 << 4, 267386880);
                            this.field3838[1] = class113.method791(var5 >> 4, 4080);
                            this.field3838[2] = class113.method791(var5 >> 12, 0);
                        }
                    } else {
                        this.field3848 = arg1.method677(false);
                    }
                } else {
                    this.field3849 = arg1.method677(false);
                }
            } else {
                this.field3843 = arg1.method677(false);
            }
        } else {
            this.field3850 = arg1.method677(false);
        }
        if (arg2 != -1) {
            this.method300(85, 34);
        }
        ++field3851;
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V")
    public class228() {
        super(1, false);
    }

    @OriginalMember(owner = "client!of", name = "g", descriptor = "(I)V")
    public static void method1533(int arg0) {
        if (arg0 < 109) {
            method1533(-113);
        }
        field3839 = null;
        field3845 = null;
        field3836 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BLeh;I)V")
    public static final void method1534(byte arg0, class101 arg1, int arg2) {
        if (class126.field2213 != null) {
            try {
                class126.field2213.method1285(0L, 0);
                class126.field2213.method1288(24, arg1.field1730, 0, arg2);
            } catch (Exception var3) {
            }
        }
        ++field3846;
        if (arg0 < 56) {
            method1534((byte) 114, (class101) null, 5);
        }
    }

    @OriginalMember(owner = "client!of", name = "d", descriptor = "(II)I")
    public static final int method1535(int arg0, int arg1) {
        if (arg0 != -2023748438) {
            field3836 = null;
        }
        ++field3841;
        return arg1 >>> 10;
    }
}
