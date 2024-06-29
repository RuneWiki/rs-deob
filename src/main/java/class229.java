import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class229 extends class114 {

    @OriginalMember(owner = "client!li", name = "T", descriptor = "I")
    private int field3584 = 8;

    @OriginalMember(owner = "client!li", name = "Q", descriptor = "I")
    private int field3581 = 4;

    @OriginalMember(owner = "client!li", name = "R", descriptor = "I")
    private int field3582 = 1024;

    @OriginalMember(owner = "client!li", name = "bb", descriptor = "I")
    private int field3592 = 204;

    @OriginalMember(owner = "client!li", name = "fb", descriptor = "I")
    private int field3596 = 0;

    @OriginalMember(owner = "client!li", name = "O", descriptor = "I")
    private int field3579 = 1024;

    @OriginalMember(owner = "client!li", name = "S", descriptor = "I")
    private int field3583 = 81;

    @OriginalMember(owner = "client!li", name = "hb", descriptor = "I")
    private int field3598 = 409;

    @OriginalMember(owner = "client!li", name = "F", descriptor = "Ljava/lang/String;")
    public static String field3577 = "Loaded update list";

    @OriginalMember(owner = "client!li", name = "U", descriptor = "Llh;")
    public static class58 field3585 = new class58();

    @OriginalMember(owner = "client!li", name = "ib", descriptor = "Z")
    public static boolean field3599 = true;

    @OriginalMember(owner = "client!li", name = "eb", descriptor = "Ljava/lang/String;")
    public static String field3595 = "Cancel";

    @OriginalMember(owner = "client!li", name = "N", descriptor = "I")
    private int field3578;

    @OriginalMember(owner = "client!li", name = "P", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!li", name = "V", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!li", name = "W", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!li", name = "cb", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!li", name = "db", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!li", name = "gb", descriptor = "I")
    private int field3597;

    @OriginalMember(owner = "client!li", name = "jb", descriptor = "I")
    private int field3600;

    @OriginalMember(owner = "client!li", name = "Z", descriptor = "Lim;")
    public static class178 field3590;

    @OriginalMember(owner = "client!li", name = "Y", descriptor = "[I")
    private int[] field3589;

    @OriginalMember(owner = "client!li", name = "X", descriptor = "[[I")
    private int[][] field3588;

    @OriginalMember(owner = "client!li", name = "ab", descriptor = "[[I")
    private int[][] field3591;

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V")
    public class229() {
        super(0, true);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V")
    public final void method12(byte arg0) {
        if (arg0 < 101) {
            this.field3589 = null;
        }
        this.method1514((byte) -83);
        ++field3594;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lbj;II)V")
    public final void method13(class215 arg0, int arg1, int arg2) {
        if (arg2 == 12953) {
            if (arg1 != 0) {
                if (arg1 != 1) {
                    if (arg1 != 2) {
                        if (~arg1 != -4) {
                            if (~arg1 != -5) {
                                if (~arg1 != -6) {
                                    if (arg1 != 6) {
                                        if (arg1 == 7) {
                                            this.field3582 = arg0.method1379(-105);
                                        }
                                    } else {
                                        this.field3583 = arg0.method1379(arg2 ^ -13015);
                                    }
                                } else {
                                    this.field3596 = arg0.method1379(-82);
                                }
                            } else {
                                this.field3579 = arg0.method1379(-111);
                            }
                        } else {
                            this.field3592 = arg0.method1379(-107);
                        }
                    } else {
                        this.field3598 = arg0.method1379(arg2 + -13075);
                    }
                } else {
                    this.field3584 = arg0.method1374((byte) -60);
                }
            } else {
                this.field3581 = arg0.method1374((byte) -60);
            }
            ++field3580;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IBLld;)V")
    public static final void method1513(int arg0, byte arg1, class272 arg2) {
        ++field3586;
        int var3 = 62 / ((arg1 - -49) / 50);
        Object[] var4 = arg2.field4340;
        int var5 = (Integer) var4[0];
        class43 var6 = class119.method775(var5, -18331);
        if (var6 != null) {
            class131.field1823 = new String[var6.field642];
            int var7 = 0;
            class211.field3148 = new int[var6.field648];
            int var8 = 0;
            for (int var9 = 1; var4.length > var9; ++var9) {
                if (!(var4[var9] instanceof Integer)) {
                    if (var4[var9] instanceof String) {
                        String var10 = (String) var4[var9];
                        if (var10.equals("event_opbase")) {
                            var10 = arg2.field4333;
                        }
                        class131.field1823[var8++] = var10;
                    }
                } else {
                    int var11 = (Integer) var4[var9];
                    if (var11 == -2147483647) {
                        var11 = arg2.field4330;
                    }
                    if (var11 == -2147483646) {
                        var11 = arg2.field4334;
                    }
                    if (~var11 == 2147483644) {
                        var11 = arg2.field4337 == null ? -1 : arg2.field4337.field2545;
                    }
                    if (var11 == -2147483644) {
                        var11 = arg2.field4327;
                    }
                    if (var11 == -2147483643) {
                        var11 = arg2.field4337 != null ? arg2.field4337.field2576 : -1;
                    }
                    if (~var11 == 2147483641) {
                        var11 = arg2.field4345 == null ? -1 : arg2.field4345.field2545;
                    }
                    if (~var11 == 2147483640) {
                        var11 = arg2.field4345 != null ? arg2.field4345.field2576 : -1;
                    }
                    if (var11 == -2147483640) {
                        var11 = arg2.field4329;
                    }
                    if (~var11 == 2147483638) {
                        var11 = arg2.field4328;
                    }
                    class211.field3148[var7++] = var11;
                }
            }
            class225.method1491(arg0, var6, 28670);
        }
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(B)V")
    private final void method1514(byte arg0) {
        ++field3593;
        Random var2 = new Random((long) this.field3584);
        this.field3591 = new int[this.field3584][this.field3581 + 1];
        this.field3600 = this.field3583 / 2;
        this.field3578 = 4096 / this.field3581;
        this.field3597 = 4096 / this.field3584;
        this.field3588 = new int[this.field3584][this.field3581];
        if (arg0 > -39) {
            this.method12((byte) 8);
        }
        this.field3589 = new int[this.field3584 + 1];
        int var3 = this.field3578 / 2;
        int var4 = this.field3597 / 2;
        this.field3589[0] = 0;
        for (int var5 = 0; this.field3584 > var5; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field3597;
                int var7 = (-2048 + class137.method863(var2, (byte) 119, 4096)) * this.field3592 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field3589[var5] = this.field3589[var5 + -1] - -var8;
            }
            this.field3591[var5][0] = 0;
            for (int var9 = 0; var9 < this.field3581; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field3578;
                    int var11 = (-2048 + class137.method863(var2, (byte) 110, 4096)) * this.field3598 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field3591[var5][var9] = this.field3591[var5][var9 + -1] + var12;
                }
                this.field3588[var5][var9] = ~this.field3582 < -1 ? 4096 - class137.method863(var2, (byte) 107, this.field3582) : 4096;
            }
            this.field3591[var5][this.field3581] = 4096;
        }
        this.field3589[this.field3584] = 4096;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IZ)[I")
    public final int[] method16(int arg0, boolean arg1) {
        ++field3587;
        int[] var3 = super.field1630.method302(arg0, -116);
        if (super.field1630.field710) {
            int var4 = 0;
            int var5;
            for (var5 = class159.field2209[arg0] + this.field3596; ~var5 > -1; var5 += 4096) {
            }
            while (~var5 < -4097) {
                var5 -= 4096;
            }
            while (~this.field3584 < ~var4 && ~this.field3589[var4] >= ~var5) {
                ++var4;
            }
            boolean var6 = ~(1 & var4) == -1;
            int var7 = this.field3589[var4];
            int var8 = var4 + -1;
            int var9 = this.field3589[var4 + -1];
            if (~(this.field3600 + var9) > ~var5 && ~(-this.field3600 + var7) < ~var5) {
                for (int var10 = 0; class145.field2009 > var10; ++var10) {
                    int var11 = !var6 ? -this.field3579 : this.field3579;
                    int var12 = 0;
                    int var13;
                    for (var13 = (this.field3578 * var11 >> 12) + class99.field1434[var10]; ~var13 > -1; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (this.field3581 > var12 && ~var13 <= ~this.field3591[var8][var12]) {
                        ++var12;
                    }
                    int var14 = var12 - 1;
                    int var15 = this.field3591[var8][var14];
                    int var16 = this.field3591[var8][var12];
                    if (~(this.field3600 + var15) > ~var13 && var13 < -this.field3600 + var16) {
                        var3[var10] = this.field3588[var8][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class285.method1877(var3, 0, class145.field2009, 0);
            }
        }
        if (arg1) {
            this.field3588 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!li", name = "h", descriptor = "(I)V")
    public static void method1515(int arg0) {
        field3577 = null;
        field3595 = null;
        field3590 = null;
        if (arg0 == -1) {
            field3585 = null;
        }
    }
}
