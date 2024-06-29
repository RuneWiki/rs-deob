import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class257 extends class148 {

    @OriginalMember(owner = "client!oj", name = "J", descriptor = "I")
    private int field3787 = 4096;

    @OriginalMember(owner = "client!oj", name = "M", descriptor = "I")
    private int field3790 = 4096;

    @OriginalMember(owner = "client!oj", name = "R", descriptor = "I")
    private int field3795 = 4096;

    @OriginalMember(owner = "client!oj", name = "U", descriptor = "I")
    private int field3798 = 409;

    @OriginalMember(owner = "client!oj", name = "V", descriptor = "[I")
    private int[] field3799 = new int[3];

    @OriginalMember(owner = "client!oj", name = "O", descriptor = "[I")
    public static int[] field3792 = new int[1];

    @OriginalMember(owner = "client!oj", name = "L", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!oj", name = "N", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!oj", name = "Q", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!oj", name = "S", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!oj", name = "T", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!oj", name = "W", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!oj", name = "X", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!oj", name = "Y", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!oj", name = "P", descriptor = "Ljava/awt/Font;")
    public static Font field3793;

    @OriginalMember(owner = "client!oj", name = "K", descriptor = "[I")
    public static int[] field3788;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IB)V", line = 8)
    public static final void method1709(int arg0, byte arg1) {
        ++field3796;
        class338 var2 = class230.method1580(6, -1332166328, arg0);
        if (arg1 >= -121) {
            method1710((byte) -86, 18, -115);
        }
        var2.method2052(100);
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "()V", line = 338)
    public class257() {
        super(1, false);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BII)Z", line = 26)
    public static final boolean method1710(byte arg0, int arg1, int arg2) {
        ++field3789;
        if (!class207.field2963) {
            return false;
        } else {
            int var3 = arg2 >> 16;
            int var4 = 65535 & arg2;
            if (arg0 >= -111) {
                field3788 = null;
            }
            if (class185.field2754[var3] != null && class185.field2754[var3][var4] != null) {
                class38 var5 = class185.field2754[var3][var4];
                if (arg1 == -1 && var5.field492 == 0) {
                    for (class118 var6 = (class118) class312.field4467.method816(112); var6 != null; var6 = (class118) class312.field4467.method812(83)) {
                        if (var6.field1781 == 30 || var6.field1781 == 1007 || var6.field1781 == 51 || ~var6.field1781 == -16 || ~var6.field1781 == -47) {
                            for (class38 var7 = class149.method979((byte) -78, var6.field1788); var7 != null; var7 = class525.method3105((byte) 125, var7)) {
                                if (var5.field467 == var7.field467) {
                                    return true;
                                }
                            }
                        }
                    }
                } else {
                    for (class118 var8 = (class118) class312.field4467.method816(108); var8 != null; var8 = (class118) class312.field4467.method812(110)) {
                        if (var8.field1780 == arg1 && ~var5.field467 == ~var8.field1788 && (~var8.field1781 == -31 || var8.field1781 == 1007 || var8.field1781 == 51 || var8.field1781 == 15 || var8.field1781 == 46)) {
                            return true;
                        }
                    }
                }
                return false;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZI)[[I", line = 96)
    public final int[][] method27(boolean arg0, int arg1) {
        if (!arg0) {
            field3800 = 38;
        }
        ++field3801;
        int[][] var3 = super.field2189.method2422(-2, arg1);
        if (super.field2189.field6033) {
            int[][] var4 = this.method974(true, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class320.field4579; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field3799[0] + var12;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (this.field3798 < var13) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field3799[1] + var14;
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (~var15 < ~this.field3798) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field3799[2] + var16;
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (~this.field3798 > ~var17) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field3795 * var12 >> 12;
                            var9[var11] = this.field3790 * var14 >> 12;
                            var10[var11] = this.field3787 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "(B)V", line = 188)
    public static void method1711(byte arg0) {
        field3793 = null;
        field3788 = null;
        int var1 = 58 / ((-32 - arg0) / 48);
        field3792 = null;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(II)V", line = 199)
    public static final void method1712(int arg0, int arg1) {
        class335.field4715 = arg1;
        class83.field1289 = -1;
        if (arg0 == 4096) {
            ++field3791;
            class83.field1289 = -1;
            class34.method194((byte) -70);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)I", line = 221)
    public static final int method1713(int arg0, int arg1, int arg2) {
        ++field3794;
        if (arg1 != -20411) {
            method1712(-20, 5);
        }
        if (~arg0 == 1) {
            return 12345678;
        } else if (~arg0 == 0) {
            if (arg2 >= 2) {
                if (~arg2 < -127) {
                    arg2 = 126;
                }
            } else {
                arg2 = 2;
            }
            return arg2;
        } else {
            int var3 = (127 & arg0) * arg2 >> 7;
            if (~var3 <= -3) {
                if (~var3 < -127) {
                    var3 = 126;
                }
            } else {
                var3 = 2;
            }
            return (65408 & arg0) + var3;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILdh;I)V", line = 261)
    public final void method23(int arg0, class209 arg1, int arg2) {
        ++field3797;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 == -5) {
                            int var5 = arg1.method1458((byte) -10);
                            this.field3799[0] = class286.method1847(var5, 16711680) << 4;
                            this.field3799[1] = class286.method1847(65280, var5) >> 4;
                            this.field3799[2] = class286.method1847(var5, 255) >> 12;
                        }
                    } else {
                        this.field3795 = arg1.method1450((byte) 115);
                    }
                } else {
                    this.field3790 = arg1.method1450((byte) 41);
                }
            } else {
                this.field3787 = arg1.method1450((byte) 122);
            }
        } else {
            this.field3798 = arg1.method1450((byte) 25);
        }
        int var6 = 110 % ((arg2 - -88) / 33);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II[S)[S", line = 323)
    public static final short[] method1714(int arg0, int arg1, short[] arg2) {
        ++field3802;
        short[] var3 = new short[arg1];
        class520.method3077(arg2, 0, var3, arg0, arg1);
        return var3;
    }
}
