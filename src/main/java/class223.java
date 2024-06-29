import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class223 extends class8 {

    @OriginalMember(owner = "client!re", name = "I", descriptor = "Z")
    private boolean field3689 = true;

    @OriginalMember(owner = "client!re", name = "T", descriptor = "Z")
    private boolean field3700 = true;

    @OriginalMember(owner = "client!re", name = "N", descriptor = "I")
    public static int field3694 = 0;

    @OriginalMember(owner = "client!re", name = "R", descriptor = "[Z")
    public static boolean[] field3698 = new boolean[100];

    @OriginalMember(owner = "client!re", name = "J", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!re", name = "K", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!re", name = "L", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!re", name = "M", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!re", name = "O", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!re", name = "P", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!re", name = "Q", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!re", name = "S", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!re", name = "U", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BLog;I)V")
    public final void method64(byte arg0, class221 arg1, int arg2) {
        if (arg0 <= 62) {
            field3692 = -67;
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field115 = ~arg1.method1517((byte) -96) == -2;
                }
            } else {
                this.field3700 = ~arg1.method1517((byte) -96) == -2;
            }
        } else {
            this.field3689 = ~arg1.method1517((byte) -96) == -2;
        }
        ++field3695;
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V")
    public class223() {
        super(1, false);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IB)[[I")
    public final int[][] method65(int arg0, byte arg1) {
        int var3 = -100 % ((arg1 - -48) / 46);
        ++field3699;
        int[][] var4 = super.field93.method248(arg0, 17416);
        if (super.field93.field470) {
            int[][] var5 = this.method60(this.field3700 ? -arg0 + class92.field1523 : arg0, 0, 105);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[2];
            int[] var11 = var4[1];
            if (this.field3689) {
                for (int var12 = 0; ~class231.field3798 < ~var12; ++var12) {
                    var9[var12] = var6[class287.field4537 - var12];
                    var11[var12] = var7[-var12 + class287.field4537];
                    var10[var12] = var8[-var12 + class287.field4537];
                }
            } else {
                for (int var13 = 0; ~class231.field3798 < ~var13; ++var13) {
                    var9[var13] = var6[var13];
                    var11[var13] = var7[var13];
                    var10[var13] = var8[var13];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(Z)V")
    public static void method1569(boolean arg0) {
        field3698 = null;
        if (arg0) {
            method1570(3);
        }
    }

    @OriginalMember(owner = "client!re", name = "e", descriptor = "(I)V")
    public static final void method1570(int arg0) {
        ++field3691;
        if (arg0 >= 90) {
            boolean var1 = false;
            while (!var1) {
                var1 = true;
                for (int var2 = 0; ~var2 > ~(class205.field3291 - 1); ++var2) {
                    if (~class279.field4427[var2] > -1001 && ~class279.field4427[var2 + 1] < -1001) {
                        var1 = false;
                        String var3 = class113.field1893[var2];
                        class113.field1893[var2] = class113.field1893[var2 + 1];
                        class113.field1893[var2 + 1] = var3;
                        String var4 = class7.field88[var2];
                        class7.field88[var2] = class7.field88[var2 + 1];
                        class7.field88[var2 + 1] = var4;
                        int var5 = class253.field4035[var2];
                        class253.field4035[var2] = class253.field4035[var2 - -1];
                        class253.field4035[var2 - -1] = var5;
                        int var6 = class200.field3190[var2];
                        class200.field3190[var2] = class200.field3190[var2 + 1];
                        class200.field3190[var2 - -1] = var6;
                        int var7 = class6.field75[var2];
                        class6.field75[var2] = class6.field75[var2 + 1];
                        class6.field75[var2 + 1] = var7;
                        short var8 = class279.field4427[var2];
                        class279.field4427[var2] = class279.field4427[var2 + 1];
                        class279.field4427[var2 - -1] = var8;
                        long var9 = class214.field3506[var2];
                        class214.field3506[var2] = class214.field3506[var2 + 1];
                        class214.field3506[var2 + 1] = var9;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(II)Ljava/lang/String;")
    public static final String method1571(int arg0, int arg1) {
        ++field3701;
        String var2 = Integer.toString(arg1);
        for (int var3 = var2.length() + -3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (arg0 != 105) {
            field3698 = null;
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class270.field4256 + " (" + var2 + ")</col>";
        } else {
            return var2.length() > 6 ? " <col=ffffff>" + var2.substring(0, var2.length() + -4) + class273.field4301 + " (" + var2 + ")</col>" : " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BI)Lke;")
    public static final class108 method1572(byte arg0, int arg1) {
        ++field3693;
        class108 var2 = (class108) class162.field2588.method1832((long) arg1, (byte) 122);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3;
            if (~arg1 > -32769) {
                var3 = class143.field2310.method1357(arg1, 1, -1);
            } else {
                var3 = class203.field3254.method1357(32767 & arg1, 1, -1);
            }
            class108 var4 = new class108();
            if (var3 != null) {
                var4.method791((byte) -82, new class221(var3));
            }
            if (arg1 >= 32768) {
                var4.method793((byte) -22);
            }
            class162.field2588.method1831((long) arg1, var4, 128);
            return arg0 <= 91 ? null : var4;
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(II)[I")
    public final int[] method44(int arg0, int arg1) {
        ++field3696;
        int[] var3 = super.field110.method1585(arg0 ^ arg0, arg1);
        if (super.field110.field3734) {
            int[] var4 = this.method61(this.field3700 ? -arg1 + class92.field1523 : arg1, 15, 0);
            if (this.field3689) {
                for (int var5 = 0; class231.field3798 > var5; ++var5) {
                    var3[var5] = var4[-var5 + class287.field4537];
                }
            } else {
                class140.method969(var4, 0, var3, 0, class231.field3798);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BZ)V")
    public static final void method1573(byte arg0, boolean arg1) {
        class52.field901 = new int[104];
        class126.field2022 = new int[104];
        class245.field3928 = new int[104];
        class91.field1495 = 99;
        class92.field1521 = new int[104];
        class288.field4559 = new int[104];
        ++field3697;
        byte var2;
        if (!arg1) {
            var2 = 4;
        } else {
            var2 = 1;
        }
        if (arg0 > 3) {
            class44.field811 = new byte[var2][104][104];
            class131.field2096 = new byte[var2][105][105];
            class226.field3746 = new byte[var2][104][104];
            class143.field2305 = new byte[var2][104][104];
            class25.field418 = new int[var2][105][105];
            class5.field60 = new byte[var2][104][104];
        }
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(II)V")
    public static final void method1574(int arg0, int arg1) {
        class180.field2827.method476(false, arg0);
        if (arg1 == -26234) {
            ++field3690;
        }
    }
}
