import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class136 extends class264 {

    @OriginalMember(owner = "client!iq", name = "O", descriptor = "I")
    private int field1890 = 1365;

    @OriginalMember(owner = "client!iq", name = "S", descriptor = "I")
    private int field1894 = 0;

    @OriginalMember(owner = "client!iq", name = "T", descriptor = "I")
    private int field1895 = 0;

    @OriginalMember(owner = "client!iq", name = "X", descriptor = "I")
    private int field1899 = 20;

    @OriginalMember(owner = "client!iq", name = "N", descriptor = "[Ljava/lang/String;")
    public static String[] field1889 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!iq", name = "Q", descriptor = "I")
    public static int field1892 = 1337;

    @OriginalMember(owner = "client!iq", name = "Z", descriptor = "[I")
    public static int[] field1901 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!iq", name = "P", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!iq", name = "R", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!iq", name = "U", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!iq", name = "V", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!iq", name = "W", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!iq", name = "Y", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIIIIIII)V", line = 3)
    public static final void method1003(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1897;
        int var8 = arg4 - -arg0;
        int var9 = -arg0 + arg2;
        if (arg6 != -307531412) {
            method1003(119, -7, -91, -80, -30, -42, -121, 102);
        }
        for (int var10 = arg4; var10 < var8; ++var10) {
            class61.method558(arg3, arg6 + 307520765, class373.field5141[var10], arg7, arg1);
        }
        for (int var11 = arg2; ~var11 < ~var9; --var11) {
            class61.method558(arg3, -10647, class373.field5141[var11], arg7, arg1);
        }
        int var12 = arg0 + arg7;
        int var13 = -arg0 + arg3;
        for (int var14 = var8; var9 >= var14; ++var14) {
            int[] var15 = class373.field5141[var14];
            class61.method558(var12, -10647, var15, arg7, arg1);
            class61.method558(var13, arg6 + 307520765, var15, var12, arg5);
            class61.method558(arg3, -10647, var15, var13, arg1);
        }
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "()V", line = 55)
    public class136() {
        super(0, true);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(III)V", line = 59)
    public static final void method1004(int arg0, int arg1, int arg2) {
        ++field1893;
        if (arg1 < 52) {
            method1003(-100, -51, 63, 59, -21, -114, 107, 66);
        }
        int var3 = class262.field3781.field5811[0];
        int var4 = class262.field3781.field5807[0];
        if (class350.field4825 != class35.field378) {
            if (!class282.method1880(108, var4, 1, 0, arg2, var3, false, -3, 0, 1, arg0)) {
                class282.method1880(116, var4, 1, 0, arg2, var3, false, -2, 0, 1, arg0);
            }
        } else if (!class282.method1880(111, var4, 1, 0, arg2, var3, false, -2, 0, 1, arg0)) {
            class282.method1880(124, var4, 1, 0, arg2, var3, false, -3, 0, 1, arg0);
        }
    }

    @OriginalMember(owner = "client!iq", name = "h", descriptor = "(I)V", line = 94)
    public static final void method1005(int arg0) {
        class380.field5227.method2109(-1);
        ++field1891;
        int var1 = 100 % ((arg0 - -64) / 60);
        class408.field5588.method2109(-1);
        class442.field6289.method2109(-1);
        class421.field5832.method2109(-1);
        class439.field6224.method2109(-1);
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(II)V", line = 108)
    public static final void method1006(int arg0, int arg1) {
        class238.method1662(10);
        ++field1900;
        class409.method2448((byte) 116);
        class124.method943(65, true, arg0);
        class257.method1737(class374.field5152, class454.field6440, (byte) 127, class294.field4150);
        class112.method886(class374.field5152, -113, class454.field6440);
        class62.method568(0, class307.field4353);
        if (arg1 > -8) {
            method1003(43, -15, -77, 88, 59, -106, 65, 99);
        }
        class241.method1674(-22);
        class125.method947(-91);
        if (class347.field4787 == 10) {
            class162.method1201((byte) 118, false);
        } else {
            if (~class347.field4787 != -31) {
                if (class347.field4787 == 5) {
                    class465.method2774(class374.field5152, class454.field6440, 123);
                    return;
                }
            } else {
                class237.method1649(25, false);
            }
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(BLkk;I)V", line = 137)
    public final void method7(byte arg0, class161 arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 == -4) {
                        this.field1895 = arg1.method1134(-16848);
                    }
                } else {
                    this.field1894 = arg1.method1134(-16848);
                }
            } else {
                this.field1899 = arg1.method1134(-16848);
            }
        } else {
            this.field1890 = arg1.method1134(-16848);
        }
        if (arg0 < 31) {
            method1003(61, 24, -31, 37, 18, -55, 102, -115);
        }
        ++field1896;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(II)[I", line = 191)
    public final int[] method90(int arg0, int arg1) {
        ++field1898;
        int[] var3 = super.field3808.method958((byte) 38, arg0);
        if (arg1 != 21034) {
            method1003(-125, -112, 124, -49, -30, 19, 95, -118);
        }
        if (super.field3808.field1732) {
            for (int var4 = 0; ~class478.field6792 < ~var4; ++var4) {
                int var5 = (class151.field2084[var4] << 12) / this.field1890 + this.field1894;
                int var6 = (class379.field5216[arg0] << 12) / this.field1890 + this.field1895;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (var11 + var12 < 16384 && var13 < this.field1899) {
                    var10 = (var9 * var10 >> 12) * 2 - -var8;
                    var9 = -var12 + var11 + var7;
                    var11 = var9 * var9 >> 12;
                    ++var13;
                    var12 = var10 * var10 >> 12;
                }
                var3[var4] = ~(this.field1899 - 1) >= ~var13 ? 0 : (var13 << 12) / this.field1899;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!iq", name = "i", descriptor = "(I)V", line = 249)
    public static void method1007(int arg0) {
        field1901 = null;
        if (arg0 != 2) {
            method1004(-76, 123, -21);
        }
        field1889 = null;
    }
}
