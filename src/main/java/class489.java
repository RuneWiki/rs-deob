import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class489 extends class299 {

    @OriginalMember(owner = "client!qg", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7384 = new String[] { method3714(method3713("f4vni")), method3714(method3713("f4voi")), method3714(method3713("f4vli")), method3714(method3713("f4vji")), method3714(method3713("f4vhi")), method3714(method3713("f4vii")), method3714(method3713("f4vmi")) };

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
    public static int field7375 = 0;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
    public static int field7374;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "I")
    public static int field7376;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "I")
    public static int field7377;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
    public static int field7378;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
    public static int field7379;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "I")
    public static int field7380;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
    public static int field7381;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
    public static int field7382;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "I")
    public static int field7383;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V", line = 3)
    public static final void method3710(byte arg0) {
        try {
            ++field7377;
            int var1 = class620.field8953.length;
            if (arg0 < 41) {
                method3710((byte) -87);
            }
            for (int var2 = 0; var2 < var1; ++var2) {
                if (class620.field8953[var2] != null) {
                    int var3 = -1;
                    for (int var4 = 0; ~var4 > ~class197.field3128; ++var4) {
                        if (~class516.field7620[var4] == ~class543.field7995[var2]) {
                            var3 = var4;
                            break;
                        }
                    }
                    if (var3 == -1) {
                        class516.field7620[class197.field3128] = class543.field7995[var2];
                        var3 = class197.field3128++;
                    }
                    class176 var5 = new class176(class620.field8953[var2]);
                    int var6 = 0;
                    while (~class620.field8953[var2].length < ~var5.field2799 && ~var6 > -512 && class632.field9088 < 1023) {
                        int var7 = var6++ << 6 | var3;
                        int var8 = var5.method1687((byte) -124);
                        int var9 = var8 >> 14;
                        int var10 = 63 & var8 >> 7;
                        int var11 = var8 & 63;
                        int var12 = (class543.field7995[var2] >> 8) * 64 + var10 + -class397.field6289;
                        int var13 = (255 & class543.field7995[var2]) * 64 - class141.field2011 + var11;
                        class162 var14 = class395.field6267.method3142(var5.method1687((byte) -62), (byte) 80);
                        class19 var15 = (class19) class176.field2797.method737((byte) -39, (long) var7);
                        if (var15 == null && (1 & var14.field2599) > 0 && class262.field4264 == var9 && var12 >= 0 && ~class126.field1823 < ~(var12 - -var14.field2572) && var13 >= 0 && var13 - -var14.field2572 < class169.field2725) {
                            class426 var16 = new class426();
                            var16.field1129 = var7;
                            class19 var17 = new class19(var16);
                            class176.field2797.method738(var17, (long) var7, -12002);
                            class78.field1214[class421.field6647++] = var17;
                            class263.field4278[class632.field9088++] = var7;
                            var16.field1106 = class431.field6776;
                            var16.method3382(0, var14);
                            var16.method803((byte) -113, var16.field6716.field2572);
                            var16.field1145 = var16.field6716.field2624 << 3;
                            var16.method808(true, -68, (-1581252601 & var16.field6716.field2627 - -4) << 11);
                            var16.method3381(var12, true, var13, var16.method804(true), var9, 47);
                        }
                    }
                }
            }
        } catch (RuntimeException var19) {
            throw class590.method4333(var19, field7384[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V", line = 105)
    public final void method848(int arg0) {
        try {
            ++field7378;
            int var2 = super.field4850.method3250((byte) 87).method2094(arg0 ^ arg0);
            if (var2 < 96) {
                super.field4849 = 0;
            }
            if (super.field4849 > 1 && var2 < 128) {
                super.field4849 = 1;
            }
            if (super.field4849 > 2 && var2 < 192) {
                super.field4849 = 2;
            }
            if (~super.field4849 > -1 || ~super.field4849 < -4) {
                super.field4849 = this.method847(0);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7384[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Les;)V", line = 134)
    public class489(class404 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(Z)I", line = 137)
    public final int method3711(boolean arg0) {
        try {
            if (!arg0) {
                field7379 = 64;
            }
            ++field7381;
            return super.field4849;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7384[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(ILes;)V", line = 149)
    public class489(int arg0, class404 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZ)V", line = 153)
    public final void method846(int arg0, boolean arg1) {
        try {
            super.field4849 = arg0;
            if (!arg1) {
                ++field7376;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7384[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)I", line = 166)
    public final int method852(int arg0, int arg1) {
        try {
            ++field7374;
            int var3 = super.field4850.method3250((byte) 87).method2094(0);
            if (var3 < 96) {
                return 3;
            } else {
                if (arg0 != 1) {
                    field7379 = -30;
                }
                if (~arg1 < -2 && var3 < 128) {
                    return 3;
                } else {
                    return arg1 > 3 && ~var3 > -193 ? 3 : 1;
                }
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field7384[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)I", line = 190)
    public final int method847(int arg0) {
        try {
            if (arg0 != 0) {
                field7379 = -48;
            }
            ++field7380;
            return 0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7384[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(I)Z", line = 201)
    public final boolean method3712(int arg0) {
        try {
            ++field7383;
            if (arg0 != 3) {
                return false;
            } else {
                int var2 = super.field4850.method3250((byte) 87).method2094(arg0 + -3);
                return var2 >= 96;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7384[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qg", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3713(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 65);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qg", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3714(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 23;
                    break;
                case 1:
                    var10005 = 83;
                    break;
                case 2:
                    var10005 = 88;
                    break;
                case 3:
                    var10005 = 43;
                    break;
                default:
                    var10005 = 65;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
