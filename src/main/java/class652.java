import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public class class652 extends class299 {

    @OriginalMember(owner = "client!paa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9344 = new String[] { method4755(method4754("};S\u0004x%")), method4755(method4754("};S\u0004y%")), method4755(method4754("};S\u0004|%")), method4755(method4754("};S\u0004v%")), method4755(method4754("};S\u0004\u007f%")), method4755(method4754("};S\u0004{%")), method4755(method4754("};S\u0004}%")) };

    @OriginalMember(owner = "client!paa", name = "o", descriptor = "Z")
    public static boolean field9339 = false;

    @OriginalMember(owner = "client!paa", name = "p", descriptor = "Z")
    public static boolean field9340 = false;

    @OriginalMember(owner = "client!paa", name = "k", descriptor = "I")
    public static int field9334;

    @OriginalMember(owner = "client!paa", name = "i", descriptor = "I")
    public static int field9335;

    @OriginalMember(owner = "client!paa", name = "h", descriptor = "I")
    public static int field9336;

    @OriginalMember(owner = "client!paa", name = "n", descriptor = "I")
    public static int field9337;

    @OriginalMember(owner = "client!paa", name = "g", descriptor = "I")
    public static int field9338;

    @OriginalMember(owner = "client!paa", name = "j", descriptor = "I")
    public static int field9341;

    @OriginalMember(owner = "client!paa", name = "m", descriptor = "I")
    public static int field9342;

    @OriginalMember(owner = "client!paa", name = "l", descriptor = "I")
    public static int field9343;

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(I)I", line = 3)
    public final int method847(int arg0) {
        try {
            ++field9343;
            if (arg0 != 0) {
                field9340 = true;
            }
            return 0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9344[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(IZ)V", line = 15)
    public final void method846(int arg0, boolean arg1) {
        try {
            ++field9337;
            super.field4849 = arg0;
            if (arg1) {
                field9339 = true;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9344[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(Les;)V", line = 33)
    public class652(class404 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(II)I", line = 37)
    public final int method852(int arg0, int arg1) {
        try {
            ++field9335;
            if (arg0 != 1) {
                return 76;
            } else {
                if (class779.method5597(106, arg1)) {
                    if (super.field4850.field6379.method4133(true) && !class490.method3719(super.field4850.field6379.method4132(true), arg0 ^ 1)) {
                        return 3;
                    }
                    if (super.field4850.field6403.method2132(true) == 1) {
                        return 3;
                    }
                }
                if (arg1 == 3) {
                    return 3;
                } else {
                    return class779.method5597(100, arg1) ? 2 : 1;
                }
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9344[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "(Z)I", line = 66)
    public final int method4750(boolean arg0) {
        try {
            if (!arg0) {
                field9339 = true;
            }
            ++field9341;
            return super.field4849;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9344[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "(II)V", line = 83)
    public static final void method4751(int arg0, int arg1) {
        class290 var2 = class85.field1280[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; ++var3) {
            class290 var4 = class85.field1280[var3][arg0][arg1] = class85.field1280[var3 + 1][arg0][arg1];
            if (var4 != null) {
                for (class135 var5 = var4.field4670; var5 != null; var5 = var5.field1912) {
                    class185 var6 = var5.field1911;
                    if (var6.field2945 == arg0 && var6.field2946 == arg1) {
                        --var6.field9975;
                    }
                }
                if (var4.field4677 != null) {
                    --var4.field4677.field9975;
                }
                if (var4.field4684 != null) {
                    --var4.field4684.field9975;
                }
                if (var4.field4678 != null) {
                    --var4.field4678.field9975;
                }
                if (var4.field4673 != null) {
                    --var4.field4673.field9975;
                }
                if (var4.field4669 != null) {
                    --var4.field4669.field9975;
                }
            }
        }
        if (class85.field1280[0][arg0][arg1] == null) {
            class85.field1280[0][arg0][arg1] = new class290(0);
            class85.field1280[0][arg0][arg1].field4674 = 1;
        }
        class85.field1280[0][arg0][arg1].field4681 = var2;
        class85.field1280[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "(I)V", line = 137)
    public final void method848(int arg0) {
        try {
            if (this.method4752(arg0 ^ -20453)) {
                if (super.field4850.field6379.method4133(true) && !class490.method3719(super.field4850.field6379.method4132(true), 0)) {
                    super.field4849 = 1;
                }
                if (super.field4850.field6403.method2132(true) == 1) {
                    super.field4849 = 1;
                }
            }
            ++field9334;
            if (super.field4849 == 3) {
                super.field4849 = 2;
            }
            if (~super.field4849 > -1 || ~super.field4849 < -4) {
                super.field4849 = this.method847(0);
            }
            if (arg0 != -20456) {
                this.method846(87, false);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9344[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!paa", name = "c", descriptor = "(I)Z", line = 167)
    public final boolean method4752(int arg0) {
        try {
            ++field9336;
            if (arg0 != 3) {
                field9339 = false;
            }
            return class779.method5597(95, super.field4849);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9344[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(ILes;)V", line = 182)
    public class652(int arg0, class404 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!paa", name = "d", descriptor = "(I)Z", line = 185)
    public final boolean method4753(int arg0) {
        try {
            ++field9342;
            return arg0 == 3;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9344[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!paa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4754(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 62);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!paa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4755(char[] arg0) {
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
                    var10005 = 90;
                    break;
                case 2:
                    var10005 = 50;
                    break;
                case 3:
                    var10005 = 42;
                    break;
                default:
                    var10005 = 62;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
