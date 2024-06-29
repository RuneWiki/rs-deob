import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class245 extends class23 {

    @OriginalMember(owner = "client!wh", name = "O", descriptor = "I")
    private int field4478 = 4096;

    @OriginalMember(owner = "client!wh", name = "N", descriptor = "I")
    private int field4477 = 0;

    @OriginalMember(owner = "client!wh", name = "P", descriptor = "Z")
    public static boolean field4479 = false;

    @OriginalMember(owner = "client!wh", name = "S", descriptor = "I")
    public static int field4482 = 0;

    @OriginalMember(owner = "client!wh", name = "V", descriptor = "Ldc;")
    private static class37 field4485 = class185.method1233((byte) 86, "Enter your username (V password)3");

    @OriginalMember(owner = "client!wh", name = "L", descriptor = "Ldc;")
    public static class37 field4475 = field4485;

    @OriginalMember(owner = "client!wh", name = "T", descriptor = "Lfg;")
    public static class62 field4483 = new class62();

    @OriginalMember(owner = "client!wh", name = "Q", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!wh", name = "R", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!wh", name = "U", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!wh", name = "W", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!wh", name = "X", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!wh", name = "Z", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!wh", name = "M", descriptor = "Luc;")
    public static class220 field4476;

    @OriginalMember(owner = "client!wh", name = "Y", descriptor = "Lwa;")
    public static class238 field4488;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIIBII)V")
    public static final void method1593(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        int var8 = arg3 + arg4;
        int var9 = -arg3 + arg6;
        int var10 = arg0 + arg3;
        int var11 = -arg3 + arg7;
        ++field4486;
        for (int var12 = arg0; ~var12 > ~var10; ++var12) {
            class29.method242(arg6, (byte) -30, arg1, class11.field156[var12], arg4);
        }
        if (arg5 < 18) {
            field4476 = null;
        }
        for (int var13 = arg7; ~var11 > ~var13; --var13) {
            class29.method242(arg6, (byte) -30, arg1, class11.field156[var13], arg4);
        }
        for (int var14 = var10; var11 >= var14; ++var14) {
            int[] var15 = class11.field156[var14];
            class29.method242(var8, (byte) -30, arg1, var15, arg4);
            class29.method242(var9, (byte) -30, arg2, var15, var8);
            class29.method242(arg6, (byte) -30, arg1, var15, var9);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lng;B)V")
    public static final void method1594(class148 arg0, byte arg1) {
        ++field4481;
        short var2 = 256;
        for (int var3 = 0; ~class209.field3910.length < ~var3; ++var3) {
            class209.field3910[var3] = 0;
        }
        int var4 = 0;
        if (arg1 <= 25) {
            method1593(10, 110, -6, -39, 108, (byte) -59, -76, -112);
        }
        while (~var4 > -5001) {
            int var16 = (int) ((double) var2 * Math.random() * 128.0D);
            class209.field3910[var16] = (int) (256.0D * Math.random());
            ++var4;
        }
        for (int var5 = 0; var5 < 20; ++var5) {
            for (int var12 = 1; var12 < var2 + -1; ++var12) {
                for (int var14 = 1; var14 < 127; ++var14) {
                    int var15 = (var12 << 7) + var14;
                    class65.field1173[var15] = (class209.field3910[var15 + -1] + class209.field3910[var15 + 1] + class209.field3910[var15 - 128] + class209.field3910[var15 + 128]) / 4;
                }
            }
            int[] var13 = class209.field3910;
            class209.field3910 = class65.field1173;
            class65.field1173 = var13;
        }
        if (arg0 != null) {
            int var6 = 0;
            for (int var7 = 0; arg0.field1744 > var7; ++var7) {
                for (int var8 = 0; var8 < arg0.field1742; ++var8) {
                    if (arg0.field2814[var6++] != 0) {
                        int var9 = arg0.field1743 + var8 + 16;
                        int var10 = arg0.field1738 + 16 + var7;
                        int var11 = var9 - -(var10 << 7);
                        class209.field3910[var11] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(B)V")
    public static void method1595(byte arg0) {
        field4488 = null;
        field4475 = null;
        field4476 = null;
        field4485 = null;
        field4483 = null;
        if (arg0 > -6) {
            field4483 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IB)[[I")
    public final int[][] method36(int arg0, byte arg1) {
        int[][] var3 = super.field398.method1522(-29659, arg0);
        if (arg1 != 9) {
            field4482 = 0;
        }
        if (super.field398.field4303) {
            int[][] var4 = this.method159(0, (byte) -76, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var4[2];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class199.field3705; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var9[var11];
                if (this.field4477 > var12) {
                    var8[var11] = this.field4477;
                } else if (~var12 >= ~this.field4478) {
                    var8[var11] = var12;
                } else {
                    var8[var11] = this.field4478;
                }
                if (var13 < this.field4477) {
                    var7[var11] = this.field4477;
                } else if (var13 <= this.field4478) {
                    var7[var11] = var13;
                } else {
                    var7[var11] = this.field4478;
                }
                if (this.field4477 <= var14) {
                    if (this.field4478 >= var14) {
                        var10[var11] = var14;
                    } else {
                        var10[var11] = this.field4478;
                    }
                } else {
                    var10[var11] = this.field4477;
                }
            }
        }
        ++field4480;
        return var3;
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V")
    public class245() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lce;II)V")
    public final void method40(class28 arg0, int arg1, int arg2) {
        ++field4484;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field407 = ~arg0.method215(-1797813752) == -2;
                }
            } else {
                this.field4478 = arg0.method230((byte) -116);
            }
        } else {
            this.field4477 = arg0.method230((byte) -122);
        }
        if (arg2 != 1000) {
            field4483 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)[I")
    public final int[] method57(int arg0, int arg1) {
        if (arg0 != 0) {
            field4479 = true;
        }
        ++field4489;
        int[] var3 = super.field405.method1461(arg1, (byte) -111);
        if (super.field405.field4114) {
            int[] var4 = this.method162(arg1, 0, (byte) 18);
            for (int var5 = 0; var5 < class199.field3705; ++var5) {
                int var6 = var4[var5];
                if (var6 >= this.field4477) {
                    if (this.field4478 >= var6) {
                        var3[var5] = var6;
                    } else {
                        var3[var5] = this.field4478;
                    }
                } else {
                    var3[var5] = this.field4477;
                }
            }
        }
        return var3;
    }
}
