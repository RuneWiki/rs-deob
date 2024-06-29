import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class234 extends class182 {

    @OriginalMember(owner = "client!kl", name = "V", descriptor = "I")
    private int field3955 = 1024;

    @OriginalMember(owner = "client!kl", name = "P", descriptor = "I")
    private int field3949 = 204;

    @OriginalMember(owner = "client!kl", name = "X", descriptor = "I")
    private int field3957 = 8;

    @OriginalMember(owner = "client!kl", name = "db", descriptor = "I")
    private int field3963 = 4;

    @OriginalMember(owner = "client!kl", name = "cb", descriptor = "I")
    private int field3962 = 1024;

    @OriginalMember(owner = "client!kl", name = "Y", descriptor = "I")
    private int field3958 = 81;

    @OriginalMember(owner = "client!kl", name = "jb", descriptor = "I")
    private int field3969 = 0;

    @OriginalMember(owner = "client!kl", name = "fb", descriptor = "I")
    private int field3965 = 409;

    @OriginalMember(owner = "client!kl", name = "ab", descriptor = "[I")
    public static int[] field3960 = new int[] { 0, -2, 0, 0, 0, 0, 6, 0, -1, -1, 0, 0, 0, 3, 28, 8, 0, 4, 0, 0, -1, 5, 0, 0, 0, -1, 0, 0, 8, 0, 11, 8, 0, 0, 0, 0, -2, 0, -2, 0, 0, 0, -1, 0, 0, 10, 0, 2, 0, 3, 6, 7, 14, 0, 0, 0, 1, 2, 0, 0, 0, 3, 0, 0, 6, 7, 0, 17, 0, -1, 8, 0, 12, 0, 0, 6, 1, 0, 8, 3, 8, 4, 0, 0, -2, 0, 6, 0, 6, 0, 2, 10, 0, 0, 6, 0, 0, -1, 0, 4, 0, 0, 0, -1, 0, 0, 5, 8, -2, 0, -1, 0, -1, 15, -1, 0, -1, 0, 0, 1, 0, 4, 8, 0, 0, 0, 12, -2, 0, 0, 3, 0, 10, 0, 7, 0, -2, 2, 0, 0, 0, 3, 0, 0, 0, 2, 15, 12, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 9, 0, 6, 0, 0, 14, 0, 8, 0, 0, 0, 6, 6, 0, 2, 0, 0, 0, 0, 0, 8, 0, 0, 0, 5, 2, 0, 0, 0, -1, 0, 0, 7, 0, 0, 0, 20, 0, -2, 0, 0, 1, -2, -2, 0, 0, 0, 3, 0, -2, 12, 0, 6, 0, 3, 0, -1, 3, 0, -1, 0, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 12, 0, 0, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 6, -2 };

    @OriginalMember(owner = "client!kl", name = "Q", descriptor = "I")
    public static int field3950 = 0;

    @OriginalMember(owner = "client!kl", name = "O", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!kl", name = "R", descriptor = "I")
    private int field3951;

    @OriginalMember(owner = "client!kl", name = "T", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!kl", name = "U", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!kl", name = "W", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!kl", name = "Z", descriptor = "I")
    private int field3959;

    @OriginalMember(owner = "client!kl", name = "gb", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!kl", name = "hb", descriptor = "I")
    private int field3967;

    @OriginalMember(owner = "client!kl", name = "ib", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!kl", name = "S", descriptor = "[I")
    private int[] field3952;

    @OriginalMember(owner = "client!kl", name = "bb", descriptor = "[[I")
    private int[][] field3961;

    @OriginalMember(owner = "client!kl", name = "eb", descriptor = "[[I")
    private int[][] field3964;

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "(I)V")
    private final void method1679(int arg0) {
        ++field3954;
        Random var2 = new Random((long) this.field3957);
        this.field3959 = this.field3958 / 2;
        this.field3967 = 4096 / this.field3957;
        this.field3951 = arg0 / this.field3963;
        this.field3961 = new int[this.field3957][this.field3963 + 1];
        this.field3964 = new int[this.field3957][this.field3963];
        int var3 = this.field3951 / 2;
        this.field3952 = new int[this.field3957 + 1];
        this.field3952[0] = 0;
        int var4 = this.field3967 / 2;
        for (int var5 = 0; ~this.field3957 < ~var5; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field3967;
                int var7 = (class32.method205(4096, (byte) 90, var2) + -2048) * this.field3949 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field3952[var5] = this.field3952[var5 + -1] + var8;
            }
            this.field3961[var5][0] = 0;
            for (int var9 = 0; var9 < this.field3963; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field3951;
                    int var11 = (-2048 + class32.method205(4096, (byte) 90, var2)) * this.field3965 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field3961[var5][var9] = this.field3961[var5][var9 + -1] + var12;
                }
                this.field3964[var5][var9] = ~this.field3962 < -1 ? 4096 + -class32.method205(this.field3962, (byte) 90, var2) : 4096;
            }
            this.field3961[var5][this.field3963] = 4096;
        }
        this.field3952[this.field3957] = 4096;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZLab;I)V")
    public final void method155(boolean arg0, class249 arg1, int arg2) {
        ++field3956;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (~arg2 != -7) {
                                    if (~arg2 == -8) {
                                        this.field3962 = arg1.method1821((byte) 51);
                                    }
                                } else {
                                    this.field3958 = arg1.method1821((byte) 51);
                                }
                            } else {
                                this.field3969 = arg1.method1821((byte) 51);
                            }
                        } else {
                            this.field3955 = arg1.method1821((byte) 51);
                        }
                    } else {
                        this.field3949 = arg1.method1821((byte) 51);
                    }
                } else {
                    this.field3965 = arg1.method1821((byte) 51);
                }
            } else {
                this.field3957 = arg1.method1802((byte) 77);
            }
        } else {
            this.field3963 = arg1.method1802((byte) 123);
        }
        if (arg0) {
            this.method155(true, (class249) null, -122);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZI)[I")
    public final int[] method153(boolean arg0, int arg1) {
        ++field3948;
        int[] var3 = super.field2911.method77(arg1, -75);
        if (arg0) {
            this.method469(45);
        }
        if (super.field2911.field287) {
            int var4 = 0;
            int var5;
            for (var5 = class66.field1112[arg1] + this.field3969; ~var5 > -1; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (~var4 > ~this.field3957 && this.field3952[var4] <= var5) {
                ++var4;
            }
            int var6 = var4 + -1;
            int var7 = this.field3952[var4];
            boolean var8 = (1 & var4) == 0;
            int var9 = this.field3952[var4 - 1];
            if (var5 > this.field3959 + var9 && var5 < -this.field3959 + var7) {
                for (int var10 = 0; ~class4.field116 < ~var10; ++var10) {
                    int var11 = !var8 ? -this.field3955 : this.field3955;
                    int var12 = 0;
                    int var13;
                    for (var13 = (this.field3951 * var11 >> 12) + class207.field3415[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (~var12 > ~this.field3963 && var13 >= this.field3961[var6][var12]) {
                        ++var12;
                    }
                    int var14 = this.field3961[var6][var12];
                    int var15 = var12 + -1;
                    int var16 = this.field3961[var6][var15];
                    if (this.field3959 + var16 < var13 && -this.field3959 + var14 > var13) {
                        var3[var10] = this.field3964[var6][var15];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class75.method535(var3, 0, class4.field116, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "(I)V")
    public static void method1680(int arg0) {
        field3960 = null;
        if (arg0 > -70) {
            method1681(-51, -104, -57, 41, 12, -99);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIII)V")
    public static final void method1681(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3953;
        if (arg0 >= -121) {
            method1680(96);
        }
        if (class240.field4053 >= arg3 && ~class55.field972 >= ~arg4) {
            boolean var6;
            if (~arg5 > ~class23.field423) {
                var6 = false;
                arg5 = class23.field423;
            } else if (~arg5 >= ~class272.field4552) {
                var6 = true;
            } else {
                arg5 = class272.field4552;
                var6 = false;
            }
            boolean var7;
            if (class23.field423 > arg1) {
                var7 = false;
                arg1 = class23.field423;
            } else if (arg1 > class272.field4552) {
                var7 = false;
                arg1 = class272.field4552;
            } else {
                var7 = true;
            }
            if (arg3 < class55.field972) {
                arg3 = class55.field972;
            } else {
                class134.method996(0, arg1, arg5, arg2, class41.field630[arg3++]);
            }
            if (~class240.field4053 > ~arg4) {
                arg4 = class240.field4053;
            } else {
                class134.method996(0, arg1, arg5, arg2, class41.field630[arg4--]);
            }
            if (var6 && var7) {
                for (int var8 = arg3; var8 <= arg4; ++var8) {
                    int[] var9 = class41.field630[var8];
                    var9[arg5] = var9[arg1] = arg2;
                }
                return;
            }
            if (var6) {
                for (int var10 = arg3; var10 <= arg4; ++var10) {
                    class41.field630[var10][arg5] = arg2;
                }
                return;
            }
            if (var7) {
                for (int var11 = arg3; ~arg4 <= ~var11; ++var11) {
                    class41.field630[var11][arg1] = arg2;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "(I)V")
    public final void method469(int arg0) {
        this.method1679(4096);
        if (arg0 != -1) {
            method1680(91);
        }
        ++field3966;
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V")
    public class234() {
        super(0, true);
    }
}
