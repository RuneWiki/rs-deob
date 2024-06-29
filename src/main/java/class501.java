import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class501 extends class535 {

    @OriginalMember(owner = "client!dq", name = "H", descriptor = "I")
    private int field7234 = 585;

    @OriginalMember(owner = "client!dq", name = "F", descriptor = "Lqv;")
    public static class316 field7233 = new class316(94, 6);

    @OriginalMember(owner = "client!dq", name = "O", descriptor = "I")
    public static int field7241 = 0;

    @OriginalMember(owner = "client!dq", name = "I", descriptor = "I")
    public static int field7235;

    @OriginalMember(owner = "client!dq", name = "J", descriptor = "I")
    public static int field7236;

    @OriginalMember(owner = "client!dq", name = "K", descriptor = "I")
    public static int field7237;

    @OriginalMember(owner = "client!dq", name = "L", descriptor = "I")
    public static int field7238;

    @OriginalMember(owner = "client!dq", name = "M", descriptor = "I")
    public static int field7239;

    @OriginalMember(owner = "client!dq", name = "N", descriptor = "I")
    public static int field7240;

    @OriginalMember(owner = "client!dq", name = "P", descriptor = "I")
    public static int field7242;

    @OriginalMember(owner = "client!dq", name = "Q", descriptor = "I")
    public static int field7243;

    @OriginalMember(owner = "client!dq", name = "R", descriptor = "Lqv;")
    public static class316 field7244;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method2924(byte arg0, String arg1) {
        ++field7238;
        int var2 = arg1.length();
        int var3 = 0;
        if (arg0 <= 115) {
            field7233 = null;
        }
        for (int var4 = 0; ~var2 < ~var4; ++var4) {
            var3 = arg1.charAt(var4) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "()V")
    public class501() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(II)[I")
    public final int[] method65(int arg0, int arg1) {
        ++field7235;
        if (arg1 != 1) {
            return null;
        } else {
            int[] var3 = super.field7885.method974(-30531, arg0);
            if (super.field7885.field2086) {
                int var4 = class448.field6442[arg0];
                for (int var5 = 0; class174.field2597 > var5; ++var5) {
                    int var6 = class539.field7939[var5];
                    if (~this.field7234 > ~var6 && 4096 - this.field7234 > var6 && var4 > -this.field7234 + 2048 && ~(this.field7234 + 2048) < ~var4) {
                        int var7 = -var6 + 2048;
                        int var8 = var7 >= 0 ? var7 : -var7;
                        int var9 = var8 << 12;
                        int var10 = var9 / (-this.field7234 + 2048);
                        var3[var5] = -var10 + 4096;
                    } else if (var6 > 2048 - this.field7234 && ~(2048 - -this.field7234) < ~var6) {
                        int var11 = var4 + -2048;
                        int var12 = ~var11 > -1 ? -var11 : var11;
                        int var13 = var12 - this.field7234;
                        int var14 = var13 << 12;
                        var3[var5] = var14 / (-this.field7234 + 2048);
                    } else if (this.field7234 <= var4 && 4096 - this.field7234 >= var4) {
                        if (~this.field7234 >= ~var6 && var6 <= -this.field7234 + 4096) {
                            var3[var5] = 0;
                        } else {
                            int var15 = -var4 + 2048;
                            int var16 = var15 < 0 ? -var15 : var15;
                            int var17 = var16 << 12;
                            int var18 = var17 / (-this.field7234 + 2048);
                            var3[var5] = -var18 + 4096;
                        }
                    } else {
                        int var19 = var6 + -2048;
                        int var20 = ~var19 > -1 ? -var19 : var19;
                        int var21 = var20 - this.field7234;
                        int var22 = var21 << 12;
                        var3[var5] = var22 / (-this.field7234 + 2048);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILwn;I)V")
    public final void method60(int arg0, class519 arg1, int arg2) {
        if (arg2 == -6232) {
            if (arg0 == 0) {
                this.field7234 = arg1.method3018(arg2 + 566997136);
            }
            ++field7236;
        }
    }

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "(I)I")
    public static final int method2925(int arg0) {
        ++field7243;
        if (arg0 > -39) {
            field7241 = -29;
        }
        return class248.field3711;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(BLki;)V")
    public static final void method2926(byte arg0, class510 arg1) {
        ++field7239;
        class211 var2 = (class211) class462.field6679.method2284(true, (long) arg1.field290);
        if (arg0 <= 115) {
            method2927((byte) -127);
        }
        if (var2 != null) {
            if (var2.field3183 != null) {
                class504.field7295.method1587(var2.field3183);
                var2.field3183 = null;
            }
            var2.method421(22071);
        }
    }

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "(B)V")
    public static final void method2927(byte arg0) {
        if (arg0 != -65) {
            method2925(81);
        }
        ++field7237;
        class29.field397 = new class341(class393.field5590.method426(class503.field7255, 87), "", class276.field4122, 1002, -1, 0L, 0, 0, true, false);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Z)V")
    public static final void method2928(boolean arg0) {
        class451.field6589.method2182(0);
        ++field7242;
        class90.field1452.method594(41);
        class303.field4490.method576(64);
        class277.field4139.method571(40);
        class117.field1812.method2305((byte) 85);
        class58.field1052.method1642(-84);
        class96.field1526.method2715((byte) 25);
        class69.field1133.method1307(1);
        class6.field36.method2144((byte) -45);
        class429.field6177.method430(237);
        class147.field2266.method1252((byte) -59);
        class389.field5528.method2877(-89);
        class506.field7320.method1428(36);
        class159.field2443.method1914(65);
        class510.field7361.method2010(64);
        class175.field2614.method1024(-16993);
        class59.field1057.method891((byte) -125);
        class163.field2468.method2424(0);
        class355.field5172.method1415((byte) 42);
        class88.field1430.method1240(-19);
        class320.method2038(0);
        class374.method2281(-78);
        class314.method1994((byte) 104);
        if (class438.field6237 != class368.field5320) {
            for (int var1 = 0; var1 < class445.field6348.length; ++var1) {
                class445.field6348[var1] = null;
            }
            class287.field4259 = 0;
        }
        class338.method2147((byte) -118);
        class108.method788(-494);
        class269.method1731(0);
        class34.method363(-1);
        class442.method2599(-95);
        class281.field4208.method2990((byte) -120);
        class76.field1256.method283();
        class520.field7585.method994(50);
        class362.method2237((byte) -53);
        class474.field6906.method2034(-1);
        class510.field7357.method2034(-1);
        class468.field6795.method2034(-1);
        class453.field6608.method2034(-1);
        class386.field5505.method2034(-1);
        class76.field1243.method2034(-1);
        class425.field6000.method2034(-1);
        class349.field5119.method2034(-1);
        class96.field1527.method2034(-1);
        class504.field7287.method2034(-1);
        class263.field3975.method2034(-1);
        class231.field3461.method2034(-1);
        class464.field6744.method2034(-1);
        class149.field2287.method2034(-1);
        class76.field1248.method2034(-1);
        class392.field5575.method2034(-1);
        class459.field6656.method2034(-1);
        class328.field4816.method2034(-1);
        class334.field4945.method2034(-1);
        class15.field174.method2034(-1);
        class117.field1814.method2034(-1);
        class475.field6921.method2034(-1);
        class290.field4296.method2034(-1);
        class312.field4655.method2034(-1);
        class253.field3752.method2034(-1);
        class541.field7959.method2034(-1);
        class195.field2815.method2034(-1);
        class403.field5752.method2034(-1);
        class263.field3980.method2034(-1);
        class388.field5515.method2034(-1);
        class52.field962.method2990((byte) -80);
        class152.field2322.method2990((byte) -112);
        class417.field5914.method2990((byte) -51);
        if (arg0) {
            method2925(-47);
        }
        class128.field1997.method2990((byte) -69);
    }

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "(I)V")
    public static void method2929(int arg0) {
        field7233 = null;
        field7244 = null;
        if (arg0 != -2048) {
            method2929(102);
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lsv;Z)Z")
    public static final boolean method2930(class478 arg0, boolean arg1) {
        boolean var2 = class477.field6942 == class146.field2262;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method127((byte) -101);
        if (arg0.field6971 >= 0 && arg0.field6962 >= 0 && arg0.field6970 < class394.field5608 && arg0.field6959 < class337.field5000) {
            for (int var6 = arg0.field6971; var6 <= arg0.field6970; ++var6) {
                for (int var9 = arg0.field6962; var9 <= arg0.field6959; ++var9) {
                    class188 var10 = class53.method468(arg0.field6956, var6, var9);
                    if (var10 != null) {
                        int var11 = 0;
                        if (var6 > arg0.field6971) {
                            ++var11;
                        }
                        if (var6 < arg0.field6970) {
                            var11 += 4;
                        }
                        if (var9 > arg0.field6962) {
                            var11 += 8;
                        }
                        if (var9 < arg0.field6959) {
                            var11 += 2;
                        }
                        class317 var12 = class15.method89(4, var11, arg0);
                        class317 var13 = var10.field2773;
                        if (var13 == null) {
                            var10.field2773 = var12;
                        } else {
                            while (var13.field4709 != null) {
                                var13 = var13.field4709;
                            }
                            var13.field4709 = var12;
                        }
                        var10.field2771 = (byte) (var10.field2771 | var11);
                        if (var2 && (class303.field4495[var6][var9] & -16777216) != 0) {
                            var3 = class303.field4495[var6][var9];
                            var4 = class539.field7922[var6][var9];
                            var5 = class18.field198[var6][var9];
                        }
                    }
                }
            }
            if (var2 && (var3 & -16777216) != 0) {
                for (int var7 = arg0.field6971; var7 <= arg0.field6970; ++var7) {
                    for (int var8 = arg0.field6962; var8 <= arg0.field6959; ++var8) {
                        if ((class303.field4495[var7][var8] & -16777216) == 0) {
                            class303.field4495[var7][var8] = var3;
                            class539.field7922[var7][var8] = var4;
                            class18.field198[var7][var8] = var5;
                        }
                    }
                }
            }
            if (arg1) {
                class296.field4431[class504.field7296++] = arg0;
            }
            return true;
        } else {
            return false;
        }
    }
}
