import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aka")
public class class83 extends class299 {

    @OriginalMember(owner = "client!aka", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1267 = new String[] { method854(method853("!\r Nfh")), method854(method853("!\r Ngh")), method854(method853("!\r Neh")), method854(method853("!\r Nbh")), method854(method853(";HoNY")), method854(method853(".\u0013-\f")), method854(method853("!\r N`h")), method854(method853("!\r Nch")), method854(method853("!\r Nah")), method854(method853("!\r Nlh")) };

    @OriginalMember(owner = "client!aka", name = "i", descriptor = "I")
    public static int field1262 = -1;

    @OriginalMember(owner = "client!aka", name = "h", descriptor = "[I")
    public static int[] field1260 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!aka", name = "k", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!aka", name = "l", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!aka", name = "g", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!aka", name = "q", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!aka", name = "p", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!aka", name = "o", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!aka", name = "j", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!aka", name = "n", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!aka", name = "m", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!aka", name = "a", descriptor = "(B)V")
    public static void method845(byte arg0) {
        try {
            if (arg0 != -30) {
                field1256 = -45;
            }
            field1260 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field1267[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aka", name = "a", descriptor = "(IZ)V")
    public final void method846(int arg0, boolean arg1) {
        try {
            ++field1258;
            if (!arg1) {
                super.field4849 = arg0;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1267[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!aka", name = "a", descriptor = "(I)I")
    public final int method847(int arg0) {
        try {
            if (arg0 != 0) {
                return -116;
            } else {
                ++field1263;
                return 0;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1267[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aka", name = "b", descriptor = "(I)V")
    public final void method848(int arg0) {
        try {
            if (arg0 != -20456) {
                field1260 = null;
            }
            ++field1265;
            if (~super.field4849 > -1 || super.field4849 > 4) {
                super.field4849 = this.method847(arg0 ^ -20456);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1267[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aka", name = "<init>", descriptor = "(Les;)V")
    public class83(class404 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!aka", name = "b", descriptor = "(Z)I")
    public final int method849(boolean arg0) {
        try {
            if (!arg0) {
                method845((byte) 82);
            }
            ++field1261;
            return super.field4849;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1267[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aka", name = "a", descriptor = "(IILoi;II)V")
    public static final void method850(int arg0, int arg1, class77 arg2, int arg3, int arg4) {
        try {
            ++field1264;
            class707 var5 = arg2.method802(arg4 + -61);
            int var6 = -arg2.field1118.field8044 + arg2.field1165 & 16383;
            if (arg4 == -1) {
                if (arg0 == -1) {
                    if (var6 == 0 && ~arg2.field1166 >= -26) {
                        if (!arg2.field1150 || !var5.method5137(arg2.field1121, -7452)) {
                            arg2.field1121 = var5.method5134(-118);
                            arg2.field1150 = arg2.field1121 != -1;
                        }
                    } else {
                        if (arg1 < 0 && var5.field10179 != -1) {
                            arg2.field1150 = false;
                            arg2.field1121 = var5.field10179;
                        } else if (~arg1 < -1 && ~var5.field10182 != 0) {
                            arg2.field1121 = var5.field10182;
                        } else {
                            arg2.field1121 = var5.field10152;
                        }
                        arg2.field1150 = false;
                    }
                } else if (arg2.field1155 == -1 || var6 < 10240 && ~var6 < -2049) {
                    if (~var6 == -1 && ~arg2.field1166 >= -26) {
                        arg2.field1150 = false;
                        if (~arg0 == -3 && var5.field10142 != -1) {
                            arg2.field1121 = var5.field10142;
                        } else if (~arg0 == -1 && ~var5.field10177 != 0) {
                            arg2.field1121 = var5.field10177;
                        } else {
                            arg2.field1121 = var5.field10152;
                        }
                    } else {
                        if (~arg0 == -3 && ~var5.field10142 != 0) {
                            if (~arg1 > -1 && ~var5.field10154 != 0) {
                                arg2.field1121 = var5.field10154;
                            } else if (arg1 > 0 && ~var5.field10169 != 0) {
                                arg2.field1121 = var5.field10169;
                            } else {
                                arg2.field1121 = var5.field10142;
                            }
                        } else if (~arg0 == -1 && var5.field10177 != -1) {
                            if (~arg1 > -1 && var5.field10146 != -1) {
                                arg2.field1121 = var5.field10146;
                            } else if (arg1 > 0 && var5.field10132 != -1) {
                                arg2.field1121 = var5.field10132;
                            } else {
                                arg2.field1121 = var5.field10177;
                            }
                        } else if (~arg1 > -1 && var5.field10159 != -1) {
                            arg2.field1121 = var5.field10159;
                        } else if (arg1 > 0 && ~var5.field10168 != 0) {
                            arg2.field1121 = var5.field10168;
                        } else {
                            arg2.field1121 = var5.field10152;
                        }
                        arg2.field1150 = false;
                    }
                } else {
                    int var7 = 16383 & class484.field7348[arg3] + -arg2.field1118.field8044;
                    if (arg0 == 2 && ~var5.field10142 != 0) {
                        if (var7 > 2048 && var7 <= 6144 && ~var5.field10165 != 0) {
                            arg2.field1121 = var5.field10165;
                        } else if (~var7 <= -10241 && var7 < 14336 && ~var5.field10153 != 0) {
                            arg2.field1121 = var5.field10153;
                        } else if (var7 > 6144 && var7 < 10240 && ~var5.field10133 != 0) {
                            arg2.field1121 = var5.field10133;
                        } else {
                            arg2.field1121 = var5.field10142;
                        }
                    } else if (~arg0 == -1 && var5.field10177 != -1) {
                        if (var7 > 2048 && var7 <= 6144 && ~var5.field10181 != 0) {
                            arg2.field1121 = var5.field10181;
                        } else if (~var7 <= -10241 && var7 < 14336 && ~var5.field10149 != 0) {
                            arg2.field1121 = var5.field10149;
                        } else if (~var7 < -6145 && var7 < 10240 && ~var5.field10134 != 0) {
                            arg2.field1121 = var5.field10134;
                        } else {
                            arg2.field1121 = var5.field10177;
                        }
                    } else if (~var7 < -2049 && var7 <= 6144 && var5.field10151 != -1) {
                        arg2.field1121 = var5.field10151;
                    } else if (~var7 <= -10241 && ~var7 > -14337 && var5.field10137 != -1) {
                        arg2.field1121 = var5.field10137;
                    } else if (~var7 < -6145 && ~var7 > -10241 && var5.field10176 != -1) {
                        arg2.field1121 = var5.field10176;
                    } else {
                        arg2.field1121 = var5.field10152;
                    }
                    arg2.field1150 = false;
                }
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field1267[9] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1267[4] : field1267[5]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!aka", name = "a", descriptor = "(ILuo;)V")
    public static final void method851(int arg0, class603 arg1) {
        try {
            ++field1257;
            boolean var2 = false;
            if (arg0 != -10241) {
                method851(-47, (class603) null);
            }
            arg1.method3558((byte) 86);
            for (class603 var3 = (class603) class580.field8365.method5147((byte) 89); var3 != null; var3 = (class603) class580.field8365.method5144(256)) {
                if (class315.method2689(arg1.method4413(-119), -40, var3.method4413(49))) {
                    var2 = true;
                    class466.method3596(arg1, 2, var3);
                    break;
                }
            }
            if (!var2) {
                class580.field8365.method5142(arg1, (byte) -63);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field1267[6] + arg0 + ',' + (arg1 != null ? field1267[4] : field1267[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!aka", name = "a", descriptor = "(II)I")
    public final int method852(int arg0, int arg1) {
        try {
            ++field1259;
            if (arg0 != 1) {
                method850(65, -10, (class77) null, 42, -58);
            }
            return 1;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1267[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!aka", name = "<init>", descriptor = "(ILes;)V")
    public class83(int arg0, class404 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!aka", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method853(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 36);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!aka", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method854(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 64;
                    break;
                case 1:
                    var10005 = 102;
                    break;
                case 2:
                    var10005 = 65;
                    break;
                case 3:
                    var10005 = 96;
                    break;
                default:
                    var10005 = 36;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
