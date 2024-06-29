import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class148 extends class299 {

    @OriginalMember(owner = "client!hc", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2077 = new String[] { method1354(method1353("+`0IY")), method1354(method1353("+`0DY")), method1354(method1353("+`0CY")), method1354(method1353("+`0KY")), method1354(method1353("+`0AY")), method1354(method1353("+`0HY")), method1354(method1353("-vrn")), method1354(method1353("8-0,\f")), method1354(method1353("+`0@Y")), method1354(method1353("+`0FY")), method1354(method1353("+`0NY")), method1354(method1353("+`0GY")), method1354(method1353("+`0EY")), method1354(method1353("+`0JY")) };

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "Lgda;")
    public static class58 field2064;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "[[S")
    public static short[][] field2073;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(Z)I", line = 8)
    public final int method1345(boolean arg0) {
        try {
            ++field2070;
            if (!arg0) {
                method1351(110);
            }
            return super.field4849;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2077[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(ILes;)V", line = 19)
    public class148(int arg0, class404 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IC)Z", line = 22)
    public static final boolean method1346(int arg0, char arg1) {
        try {
            if (arg0 != -17968) {
                field2073 = null;
            }
            ++field2066;
            if (arg1 > 0 && ~arg1 > -129 || ~arg1 <= -161 && arg1 <= 255) {
                return true;
            } else {
                if (arg1 != 0) {
                    char[] var2 = class64.field875;
                    for (int var3 = 0; var2.length > var3; ++var3) {
                        char var4 = var2[var3];
                        if (~arg1 == ~var4) {
                            return true;
                        }
                    }
                }
                return false;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field2077[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZI)I", line = 57)
    public static final int method1347(boolean arg0, int arg1) {
        try {
            ++field2068;
            if (class321.field5230 == null) {
                return 0;
            } else if (!arg0 && class198.field3146 != null) {
                return class321.field5230.length * 2;
            } else {
                int var2 = 0;
                if (arg1 != -30953) {
                    method1350(101, -120, -8, 94, 28, (byte[]) null, 75, (byte[]) null, 88);
                }
                for (int var3 = 0; class321.field5230.length > var3; ++var3) {
                    int var4 = class321.field5230[var3];
                    if (class453.field7008.method595(-2, var4)) {
                        ++var2;
                    }
                    if (class266.field4311.method595(-2, var4)) {
                        ++var2;
                    }
                }
                return var2;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field2077[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V", line = 94)
    public final void method848(int arg0) {
        try {
            ++field2065;
            if (super.field4850.method3245((byte) -58)) {
                super.field4849 = 0;
            }
            if (~super.field4849 > -1 && super.field4849 > 2) {
                super.field4849 = this.method847(0);
            }
            if (arg0 != -20456) {
                this.method1345(true);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2077[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)I", line = 112)
    public final int method847(int arg0) {
        try {
            ++field2075;
            if (arg0 != 0) {
                this.method846(-57, false);
            }
            return 1;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2077[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZ)V", line = 123)
    public final void method846(int arg0, boolean arg1) {
        try {
            super.field4849 = arg0;
            if (arg1) {
                method1351(-84);
            }
            ++field2076;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2077[11] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BIIZ)V", line = 135)
    public static final void method1348(byte arg0, int arg1, int arg2, boolean arg3) {
        try {
            ++field2071;
            if (~arg1 <= -8001 && ~arg1 >= -48001) {
                class210.field3321 = arg1;
                if (arg0 <= -101) {
                    class517.field7644 = arg2;
                    class426.field6729 = arg3;
                }
            } else {
                throw new IllegalArgumentException();
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field2077[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)Z", line = 153)
    public final boolean method1349(int arg0) {
        try {
            ++field2074;
            if (arg0 != 3) {
                return true;
            } else {
                return !super.field4850.method3245((byte) -58);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2077[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Les;)V", line = 171)
    public class148(class404 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)I", line = 174)
    public final int method852(int arg0, int arg1) {
        try {
            if (arg0 != 1) {
                return -123;
            } else {
                ++field2069;
                if (super.field4850.method3245((byte) -58)) {
                    return 3;
                } else {
                    return ~arg1 != -1 && super.field4850.field6357.method4221(true) != 1 ? 2 : 1;
                }
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2077[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIII[BI[BI)V", line = 194)
    public static final void method1350(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, byte[] arg7, int arg8) {
        try {
            ++field2072;
            int var9 = -(arg4 >> 2);
            int var15 = -(arg4 & arg3);
            for (int var10 = -arg0; ~var10 > -1; ++var10) {
                int var10001;
                for (int var11 = var9; var11 < 0; ++var11) {
                    var10001 = arg8++;
                    arg5[var10001] += arg7[arg1++];
                    int var16 = arg8++;
                    arg5[var16] += arg7[arg1++];
                    int var17 = arg8++;
                    arg5[var17] += arg7[arg1++];
                    int var18 = arg8++;
                    arg5[var18] += arg7[arg1++];
                }
                for (int var12 = var15; var12 < 0; ++var12) {
                    var10001 = arg8++;
                    arg5[var10001] += arg7[arg1++];
                }
                arg8 += arg2;
                arg1 += arg6;
            }
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field2077[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field2077[7] : field2077[6]) + ',' + arg6 + ',' + (arg7 != null ? field2077[7] : field2077[6]) + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)V", line = 237)
    public static final void method1351(int arg0) {
        try {
            class691.field9962 = 0;
            ++field2067;
            if (arg0 <= -41) {
                for (int var1 = 0; ~var1 > -2049; ++var1) {
                    class762.field11186[var1] = null;
                    class284.field4605[var1] = 1;
                    class203.field3191[var1] = null;
                }
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2077[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V", line = 259)
    public static void method1352(byte arg0) {
        try {
            field2064 = null;
            field2073 = null;
            if (arg0 > -87) {
                method1347(true, -68);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2077[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hc", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1353(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 113);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hc", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1354(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 67;
                    break;
                case 1:
                    var10005 = 3;
                    break;
                case 2:
                    var10005 = 30;
                    break;
                case 3:
                    var10005 = 2;
                    break;
                default:
                    var10005 = 113;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
