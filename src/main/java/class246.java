import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class246 extends class87 {

    @OriginalMember(owner = "client!rj", name = "H", descriptor = "I")
    private int field3614 = 4;

    @OriginalMember(owner = "client!rj", name = "L", descriptor = "I")
    private int field3618 = 81;

    @OriginalMember(owner = "client!rj", name = "N", descriptor = "I")
    private int field3620 = 1024;

    @OriginalMember(owner = "client!rj", name = "J", descriptor = "I")
    private int field3616 = 0;

    @OriginalMember(owner = "client!rj", name = "I", descriptor = "I")
    private int field3615 = 409;

    @OriginalMember(owner = "client!rj", name = "ab", descriptor = "I")
    private int field3633 = 8;

    @OriginalMember(owner = "client!rj", name = "Y", descriptor = "I")
    private int field3631 = 204;

    @OriginalMember(owner = "client!rj", name = "V", descriptor = "I")
    private int field3628 = 1024;

    @OriginalMember(owner = "client!rj", name = "bb", descriptor = "I")
    public static int field3634 = 64;

    @OriginalMember(owner = "client!rj", name = "db", descriptor = "S")
    public static short field3636 = 32767;

    @OriginalMember(owner = "client!rj", name = "G", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!rj", name = "K", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!rj", name = "M", descriptor = "I")
    private int field3619;

    @OriginalMember(owner = "client!rj", name = "O", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!rj", name = "P", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!rj", name = "S", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!rj", name = "T", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!rj", name = "U", descriptor = "I")
    private int field3627;

    @OriginalMember(owner = "client!rj", name = "W", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!rj", name = "Z", descriptor = "I")
    private int field3632;

    @OriginalMember(owner = "client!rj", name = "cb", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!rj", name = "Q", descriptor = "[I")
    private int[] field3623;

    @OriginalMember(owner = "client!rj", name = "R", descriptor = "[[I")
    private int[][] field3624;

    @OriginalMember(owner = "client!rj", name = "X", descriptor = "[[I")
    private int[][] field3630;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(II)V")
    public static final void method1693(int arg0, int arg1) {
        ++field3625;
        class135.field2209.method1416(arg0, arg1);
    }

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "(I)V")
    private final void method1694(int arg0) {
        Random var2 = new Random((long) this.field3633);
        this.field3627 = 4096 / this.field3633;
        this.field3623 = new int[this.field3633 + 1];
        ++field3621;
        this.field3630 = new int[this.field3633][this.field3614];
        this.field3624 = new int[this.field3633][this.field3614 + 1];
        this.field3623[0] = 0;
        if (arg0 != -26529) {
            this.method1694(125);
        }
        this.field3632 = this.field3618 / 2;
        this.field3619 = 4096 / this.field3614;
        int var3 = this.field3627 / 2;
        int var4 = this.field3619 / 2;
        for (int var5 = 0; ~this.field3633 < ~var5; ++var5) {
            if (var5 > 0) {
                int var6 = this.field3627;
                int var7 = (class275.method1912(4096, -128, var2) + -2048) * this.field3631 >> 12;
                int var8 = (var3 * var7 >> 12) + var6;
                this.field3623[var5] = this.field3623[var5 + -1] + var8;
            }
            this.field3624[var5][0] = 0;
            for (int var9 = 0; ~this.field3614 < ~var9; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field3619;
                    int var11 = (class275.method1912(4096, -115, var2) - 2048) * this.field3615 >> 12;
                    int var12 = (var4 * var11 >> 12) + var10;
                    this.field3624[var5][var9] = this.field3624[var5][var9 + -1] - -var12;
                }
                this.field3630[var5][var9] = this.field3620 <= 0 ? 4096 : 4096 + -class275.method1912(this.field3620, -119, var2);
            }
            this.field3624[var5][this.field3614] = 4096;
        }
        this.field3623[this.field3633] = 4096;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lhc;II)V")
    public final void method40(class53 arg0, int arg1, int arg2) {
        ++field3629;
        if (arg2 != 25645) {
            this.method1694(-125);
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (arg1 != 6) {
                                    if (~arg1 == -8) {
                                        this.field3620 = arg0.method331(-26);
                                    }
                                } else {
                                    this.field3618 = arg0.method331(-65);
                                }
                            } else {
                                this.field3616 = arg0.method331(arg2 + -25686);
                            }
                        } else {
                            this.field3628 = arg0.method331(-115);
                        }
                    } else {
                        this.field3631 = arg0.method331(arg2 ^ -25704);
                    }
                } else {
                    this.field3615 = arg0.method331(-117);
                }
            } else {
                this.field3633 = arg0.method366(-16505);
            }
        } else {
            this.field3614 = arg0.method366(arg2 + -42150);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIII)I")
    public static final int method1695(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 > -122) {
            field3634 = 41;
        }
        ++field3622;
        if (arg1 > 243) {
            arg0 >>= 4;
        } else if (~arg1 < -218) {
            arg0 >>= 3;
        } else if (~arg1 < -193) {
            arg0 >>= 2;
        } else if (~arg1 < -180) {
            arg0 >>= 1;
        }
        return (arg1 >> 1) + ((arg3 >> 2 << 10) - -(arg0 >> 5 << 7));
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z)Ljava/lang/String;")
    public static final String method1696(boolean arg0) {
        ++field3635;
        String var1 = "www";
        if (~class113.field1868 != -1) {
            var1 = "www-wtqa";
        }
        String var2 = "";
        if (arg0) {
            field3636 = 111;
        }
        if (class220.field3205 != null) {
            var2 = "/p=" + class220.field3205;
        }
        return "http://" + var1 + ".runescape.com/l=" + class87.field1385 + "/a=" + class281.field4525 + var2 + "/";
    }

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "(I)V")
    public final void method136(int arg0) {
        this.method1694(-26529);
        if (arg0 != 0) {
            this.field3618 = 60;
        }
        ++field3617;
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "()V")
    public class246() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZ)[I")
    public final int[] method37(int arg0, boolean arg1) {
        ++field3626;
        int[] var3 = super.field1378.method319(arg0, arg1);
        if (super.field1378.field733) {
            int var4 = 0;
            int var5;
            for (var5 = class140.field2272[arg0] + this.field3616; var5 < 0; var5 += 4096) {
            }
            while (~var5 < -4097) {
                var5 -= 4096;
            }
            while (this.field3633 > var4 && ~var5 <= ~this.field3623[var4]) {
                ++var4;
            }
            boolean var6 = ~(1 & var4) == -1;
            int var7 = var4 + -1;
            int var8 = this.field3623[var4 + -1];
            int var9 = this.field3623[var4];
            if (this.field3632 + var8 < var5 && var5 < var9 - this.field3632) {
                for (int var10 = 0; class206.field3032 > var10; ++var10) {
                    int var11 = 0;
                    int var12 = var6 ? this.field3628 : -this.field3628;
                    int var13;
                    for (var13 = (this.field3619 * var12 >> 12) + class138.field2254[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (this.field3614 > var11 && ~var13 <= ~this.field3624[var7][var11]) {
                        ++var11;
                    }
                    int var14 = var11 + -1;
                    int var15 = this.field3624[var7][var11];
                    int var16 = this.field3624[var7][var14];
                    if (var13 > var16 - -this.field3632 && var15 - this.field3632 > var13) {
                        var3[var10] = this.field3630[var7][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class117.method875(var3, 0, class206.field3032, 0);
            }
        }
        return var3;
    }
}
