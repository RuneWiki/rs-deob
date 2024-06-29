import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class620 extends class518 {

    @OriginalMember(owner = "client!fi", name = "E", descriptor = "I")
    private int field8828 = 204;

    @OriginalMember(owner = "client!fi", name = "I", descriptor = "I")
    private int field8833 = 1;

    @OriginalMember(owner = "client!fi", name = "C", descriptor = "I")
    private int field8836 = 1;

    @OriginalMember(owner = "client!fi", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field8837 = new String[] { method4565(method4564("c\u001b\\\f")), method4565(method4564("k\u0007\u001e&s")), method4565(method4564("v@\u001eN&")), method4565(method4564("k\u0007\u001e#s")), method4565(method4564("k\u0007\u001e's")), method4565(method4564("k\u0007\u001e(s")), method4565(method4564("k\u0007\u001e%s")), method4565(method4564("k\u0007\u001e\"s")), method4565(method4564("k\u0007\u001e$s")) };

    @OriginalMember(owner = "client!fi", name = "D", descriptor = "Lsb;")
    public static class261 field8827 = new class261(94, 0);

    @OriginalMember(owner = "client!fi", name = "J", descriptor = "I")
    public static int field8829;

    @OriginalMember(owner = "client!fi", name = "H", descriptor = "I")
    public static int field8830;

    @OriginalMember(owner = "client!fi", name = "G", descriptor = "I")
    public static int field8831;

    @OriginalMember(owner = "client!fi", name = "L", descriptor = "I")
    public static int field8832;

    @OriginalMember(owner = "client!fi", name = "F", descriptor = "I")
    public static int field8834;

    @OriginalMember(owner = "client!fi", name = "K", descriptor = "I")
    public static int field8835;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lha;Z)V")
    public static final void method4559(class18 arg0, boolean arg1) {
        try {
            ++field8834;
            if (!arg1) {
                int var2 = 0;
                int var3 = 0;
                if (class212.field3119) {
                    var2 = class784.method5647((byte) 105);
                    var3 = class30.method328(-17233);
                }
                int var4 = -10660793;
                class240.method1985(class433.field6281 + var3, (byte) -114, -16777216, class118.field1499, arg0, var4, class637.field9012 + var2, class525.field7646);
                class200.field2954.method1828(class433.field6281 + var3 + 14, class537.field7854.method4068((byte) -59, class405.field5883), true, -1, class637.field9012 + 3 - -var2, var4);
                int var5 = var2 + class604.field8668.method2881((byte) 121);
                int var6 = var3 + class604.field8668.method2879(-237);
                if (!class493.field7252) {
                    int var7 = 0;
                    for (class228 var8 = (class228) class45.field644.method3977((byte) -113); var8 != null; var8 = (class228) class45.field644.method3987(0)) {
                        int var9 = class433.field6281 + 31 - (-var3 - (-var7 + class72.field1049 + -1) * 16);
                        ++var7;
                        class278.method2266(var9, var6, class433.field6281 + var3, class118.field1499, var5, var8, -1, 0, -256, class525.field7646, arg0, class637.field9012 - -var2);
                    }
                } else {
                    int var10 = 0;
                    for (class801 var11 = (class801) class520.field7588.method3932((byte) -110); var11 != null; var11 = (class801) class520.field7588.method3939((byte) -75)) {
                        int var12 = var10 * 16 + class433.field6281 + var3 + 31;
                        ++var10;
                        if (~var11.field11653 == -2) {
                            class278.method2266(var12, var6, class433.field6281 + var3, class118.field1499, var5, (class228) var11.field11651.field7555.field9626, -1, 0, -256, class525.field7646, arg0, class637.field9012 + var2);
                        } else {
                            class344.method2762(var5, class118.field1499, var12, var11, var6, class637.field9012 - -var2, -1, class525.field7646, arg0, (byte) 40, class433.field6281 + var3, -256);
                        }
                    }
                    if (class582.field8406 != null) {
                        class240.method1985(class238.field3444, (byte) 76, -16777216, class707.field9883, arg0, var4, class647.field9199, class435.field6411);
                        class200.field2954.method1828(class238.field3444 + 14, class582.field8406.field11650, !arg1, -1, class647.field9199 - -3, var4);
                        int var13 = 0;
                        for (class228 var14 = (class228) class582.field8406.field11651.method3932((byte) -45); var14 != null; var14 = (class228) class582.field8406.field11651.method3939((byte) -75)) {
                            int var15 = class238.field3444 + 31 + var13 * 16;
                            class278.method2266(var15, var6, class238.field3444, class707.field9883, var5, var14, -1, 0, -256, class435.field6411, arg0, class647.field9199);
                            ++var13;
                        }
                        class26.method299(-14609, class435.field6411, class238.field3444, class707.field9883, class647.field9199);
                    }
                }
                class26.method299(-14609, class525.field7646, class433.field6281 + var3, class118.field1499, class637.field9012 + var2);
            }
        } catch (RuntimeException var17) {
            throw class665.method4799(var17, field8837[5] + (arg0 != null ? field8837[2] : field8837[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Laa;Lvo;Ltb;IIIII)V")
    public static final void method4560(class685 arg0, class782 arg1, class392 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            ++field8829;
            if (arg2 != null) {
                int var8;
                if (class596.field8579 != 4) {
                    var8 = 16383 & (int) class349.field5057 - -class801.field11658;
                } else {
                    var8 = (int) class349.field5057 & 16383;
                }
                if (arg3 != 16383) {
                    field8827 = null;
                }
                int var9 = Math.max(arg1.field11295 / 2, arg1.field11244 / 2) + 10;
                int var10 = arg5 * arg5 + arg7 * arg7;
                if (~var10 >= ~(var9 * var9)) {
                    int var11 = class487.field7151[var8];
                    int var12 = class487.field7150[var8];
                    if (~class596.field8579 != -5) {
                        var12 = var12 * 256 / (class398.field5794 + 256);
                        var11 = var11 * 256 / (class398.field5794 - -256);
                    }
                    int var13 = arg5 * var12 + arg7 * var11 >> 14;
                    int var14 = arg7 * var12 + -(arg5 * var11) >> 14;
                    arg2.method870(arg1.field11295 / 2 + var13 + arg6 + -(arg2.method1378() / 2), arg1.field11244 / 2 + -var14 + arg4 - arg2.method1380() / 2, arg0, arg6, arg4);
                }
            }
        } catch (RuntimeException var16) {
            throw class665.method4799(var16, field8837[6] + (arg0 != null ? field8837[2] : field8837[0]) + ',' + (arg1 != null ? field8837[2] : field8837[0]) + ',' + (arg2 != null ? field8837[2] : field8837[0]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
    public class620() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(II)[I")
    public final int[] method14(int arg0, int arg1) {
        try {
            ++field8832;
            int[] var3 = super.field7564.method4462(26041, arg0);
            int var4 = -3 % ((-57 - arg1) / 55);
            if (super.field7564.field8652) {
                for (int var5 = 0; ~class110.field1436 < ~var5; ++var5) {
                    int var6 = class393.field5718[var5];
                    int var7 = class568.field8263[arg0];
                    int var8 = this.field8833 * var6 >> 12;
                    int var9 = this.field8836 * var7 >> 12;
                    int var10 = var6 % (4096 / this.field8833) * this.field8833;
                    int var11 = var7 % (4096 / this.field8836) * this.field8836;
                    if (var11 < this.field8828) {
                        for (var8 -= var9; ~var8 > -1; var8 += 4) {
                        }
                        while (~var8 < -4) {
                            var8 -= 4;
                        }
                        if (~var8 != -2) {
                            var3[var5] = 0;
                            continue;
                        }
                        if (~var10 > ~this.field8828) {
                            var3[var5] = 0;
                            continue;
                        }
                    }
                    if (~this.field8828 < ~var10) {
                        int var12;
                        for (var12 = var8 - var9; ~var12 > -1; var12 += 4) {
                        }
                        while (var12 > 3) {
                            var12 -= 4;
                        }
                        if (~var12 < -1) {
                            var3[var5] = 0;
                            continue;
                        }
                    }
                    var3[var5] = 4096;
                }
            }
            return var3;
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field8837[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "(I)V")
    public static final void method4561(int arg0) {
        try {
            ++class353.field5109;
            ++field8830;
            class779 var1 = class85.method851(false);
            class274 var2 = class375.method2969((byte) 1, class367.field5330, var1.field11100);
            var2.field3885.method5114(255, arg0);
            var1.method5608(var2, 29867);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8837[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(B)V")
    public static void method4562(byte arg0) {
        try {
            if (arg0 < -19) {
                field8827 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8837[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILjc;I)V")
    public final void method17(int arg0, class711 arg1, int arg2) {
        try {
            ++field8831;
            if (~arg0 != -1) {
                if (arg0 != 1) {
                    if (~arg0 == -3) {
                        this.field8828 = arg1.method5116((byte) -111);
                    }
                } else {
                    this.field8836 = arg1.method5128(0);
                }
            } else {
                this.field8833 = arg1.method5128(0);
            }
            if (arg2 != -3) {
                this.method14(5, -120);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field8837[3] + arg0 + ',' + (arg1 != null ? field8837[2] : field8837[0]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZBLjava/lang/String;)V")
    public static final void method4563(boolean arg0, byte arg1, String arg2) {
        try {
            ++field8835;
            if (arg1 == 46) {
                if (arg2 != null) {
                    if (~class692.field9683 <= -101) {
                        class756.method5485(4, (byte) 8, class537.field7869.method4068((byte) -42, class405.field5883));
                    } else {
                        String var3 = class492.method3797(0, arg2);
                        if (var3 != null) {
                            for (int var4 = 0; ~var4 > ~class692.field9683; ++var4) {
                                String var5 = class492.method3797(0, class49.field710[var4]);
                                if (var5 != null && var5.equals(var3)) {
                                    class756.method5485(4, (byte) 8, arg2 + class537.field7870.method4068((byte) -58, class405.field5883));
                                    return;
                                }
                                if (class180.field2342[var4] != null) {
                                    String var6 = class492.method3797(0, class180.field2342[var4]);
                                    if (var6 != null && var6.equals(var3)) {
                                        class756.method5485(4, (byte) 8, arg2 + class537.field7870.method4068((byte) -127, class405.field5883));
                                        return;
                                    }
                                }
                            }
                            for (int var7 = 0; class210.field3062 > var7; ++var7) {
                                String var8 = class492.method3797(arg1 + -46, class591.field8497[var7]);
                                if (var8 != null && var8.equals(var3)) {
                                    class756.method5485(4, (byte) 8, class537.field7875.method4068((byte) -39, class405.field5883) + arg2 + class537.field7876.method4068((byte) -82, class405.field5883));
                                    return;
                                }
                                if (class653.field9272[var7] != null) {
                                    String var9 = class492.method3797(0, class653.field9272[var7]);
                                    if (var9 != null && var9.equals(var3)) {
                                        class756.method5485(4, (byte) 8, class537.field7875.method4068((byte) -36, class405.field5883) + arg2 + class537.field7876.method4068((byte) -42, class405.field5883));
                                        return;
                                    }
                                }
                            }
                            if (class492.method3797(0, class203.field2988.field4905).equals(var3)) {
                                class756.method5485(4, (byte) 8, class537.field7872.method4068((byte) -113, class405.field5883));
                            } else {
                                ++class141.field1834;
                                class779 var10 = class85.method851(false);
                                class274 var11 = class375.method2969((byte) 1, class4.field58, var10.field11100);
                                var11.field3885.method5114(arg1 ^ 209, class101.method986(arg2, arg1 ^ 6777) + 1);
                                var11.field3885.method5089(arg2, (byte) -117);
                                var11.field3885.method5114(255, arg0 ? 1 : 0);
                                var10.method5608(var11, arg1 + 29821);
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field8837[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8837[2] : field8837[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4564(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 91);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4565(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 13;
                    break;
                case 1:
                    var10005 = 110;
                    break;
                case 2:
                    var10005 = 48;
                    break;
                case 3:
                    var10005 = 96;
                    break;
                default:
                    var10005 = 91;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
