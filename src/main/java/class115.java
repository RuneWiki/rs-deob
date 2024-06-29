import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class115 extends class299 {

    @OriginalMember(owner = "client!ra", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1691 = new String[] { method1147(method1146("Y1\u000e**")), method1147(method1146("C1V\tdB\"E\nmS")), method1147(method1146("C1V\tkNf")), method1147(method1146("E%L\u0000")), method1147(method1146("F1C")), method1147(method1146("Y1\u000e$*")), method1147(method1146("\\9N")), method1147(method1146("P~\u000eB\u007f")), method1147(method1146("Y1\u000e&*")), method1147(method1146("Y1\u000e%*")), method1147(method1146("Y1\u000e-*")), method1147(method1146("Y1\u000e.*")), method1147(method1146("Y1\u000e+*")), method1147(method1146("Y1\u000e)*")), method1147(method1146("Y1\u000e(*")), method1147(method1146("Y1\u000e/*")) };

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
    public static int field1680 = -1;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "Z")
    public static boolean field1686 = false;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "[[I")
    public static int[][] field1679 = new int[6][];

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(Z)I", line = 4)
    public final int method1140(boolean arg0) {
        try {
            ++field1682;
            if (!arg0) {
                this.method846(-41, true);
            }
            return super.field4849;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1691[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)I", line = 15)
    public final int method852(int arg0, int arg1) {
        try {
            if (arg0 != 1) {
                field1679 = null;
            }
            ++field1688;
            if (super.field4850.method3243(-110) == class229.field3561) {
                if (super.field4850.method3245((byte) -58)) {
                    return 3;
                } else {
                    return arg1 != 0 && ~super.field4850.field6357.method4221(true) != -2 ? 2 : 1;
                }
            } else {
                return 3;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1691[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)Z", line = 39)
    public final boolean method1141(int arg0) {
        try {
            ++field1681;
            if (arg0 != 3) {
                this.method1140(false);
            }
            if (super.field4850.method3243(-117) == class229.field3561) {
                return !super.field4850.method3245((byte) -58);
            } else {
                return false;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1691[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IZ)V", line = 60)
    public final void method846(int arg0, boolean arg1) {
        try {
            super.field4849 = arg0;
            if (!arg1) {
                ++field1690;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1691[13] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZLmj;)V", line = 71)
    public static final void method1142(boolean arg0, class683 arg1) {
        try {
            ++field1689;
            class683 var2 = class15.method109(0, arg1);
            int var3;
            int var4;
            if (var2 != null) {
                var3 = var2.field9797;
                var4 = var2.field9777;
            } else {
                var3 = class64.field881;
                var4 = class333.field5444;
            }
            class140.method1298(var4, arg0, var3, arg1, -1821370130);
            class781.method5611(var3, var4, 2, arg1);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field1691[8] + arg0 + ',' + (arg1 != null ? field1691[7] : field1691[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)I", line = 95)
    public final int method847(int arg0) {
        try {
            ++field1687;
            if (arg0 != 0) {
                method1145(-22);
            }
            return 1;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1691[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Les;)V", line = 116)
    public class115(class404 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;Ltga;ZBZLjava/lang/String;)V", line = 124)
    public static final void method1143(String arg0, class61 arg1, boolean arg2, byte arg3, boolean arg4, String arg5) {
        try {
            if (arg3 == -106) {
                ++field1684;
                if (!arg4) {
                    class781.method5610(arg0, 3, arg1, 2);
                } else {
                    if (class61.field790.startsWith(field1691[6]) && arg1.field806) {
                        String var6 = null;
                        if (class476.field7255 != null) {
                            var6 = class476.field7255.getParameter(field1691[2]);
                        }
                        if (var6 == null || !var6.equals("1")) {
                            class218 var7 = class781.method5610(arg0, 0, arg1, 2);
                            class708.field10187 = var7;
                            class370.field5997 = arg0;
                            class310.field5090 = arg1;
                            return;
                        }
                    }
                    if (class61.field790.startsWith(field1691[4])) {
                        String var8 = null;
                        if (class476.field7255 != null) {
                            var8 = class476.field7255.getParameter(field1691[1]);
                        }
                        if (var8 != null && var8.equals("1") && arg2) {
                            class360.method2976(true, arg0, arg5, 1, arg1);
                            return;
                        }
                    }
                    class781.method5610(arg0, 2, arg1, 2);
                }
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field1691[5] + (arg0 != null ? field1691[7] : field1691[3]) + ',' + (arg1 != null ? field1691[7] : field1691[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field1691[7] : field1691[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V", line = 189)
    public final void method848(int arg0) {
        try {
            if (super.field4850.method3243(-103) != class229.field3561) {
                super.field4849 = 1;
            } else if (super.field4850.method3245((byte) -58)) {
                super.field4849 = 0;
            }
            if (arg0 != -20456) {
                field1686 = true;
            }
            ++field1685;
            if (super.field4849 != 0 && super.field4849 != 1) {
                super.field4849 = this.method847(0);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1691[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjava/lang/String;III)V", line = 210)
    public static final void method1144(int arg0, String arg1, int arg2, int arg3, int arg4) {
        try {
            ++field1683;
            class683 var5 = class454.method3528(0, arg4, arg2);
            if (var5 != null) {
                if (var5.field9859 != null) {
                    class730 var6 = new class730();
                    var6.field10688 = arg1;
                    var6.field10692 = var5.field9859;
                    var6.field10693 = var5;
                    var6.field10696 = arg0;
                    class598.method4378(var6);
                }
                if (class315.field5127 == 11) {
                    if (client.method2695(var5).method3479(-3979, arg0 + -1)) {
                        if (~arg0 == -2) {
                            ++class82.field1254;
                            class487 var7 = class618.method4519(71, class173.field2767, class185.field2948.field2659);
                            class68.method723(arg2, arg4, -109, var7, var5.field9807);
                            class185.field2948.method1546(var7, 1);
                        }
                        if (arg0 == 2) {
                            ++class39.field442;
                            class487 var8 = class618.method4519(33, class430.field6768, class185.field2948.field2659);
                            class68.method723(arg2, arg4, -59, var8, var5.field9807);
                            class185.field2948.method1546(var8, 1);
                        }
                        if (arg0 == 3) {
                            ++class285.field4612;
                            class487 var9 = class618.method4519(113, class336.field5482, class185.field2948.field2659);
                            class68.method723(arg2, arg4, -120, var9, var5.field9807);
                            class185.field2948.method1546(var9, 1);
                        }
                        if (arg0 == 4) {
                            ++class187.field2976;
                            class487 var10 = class618.method4519(89, class165.field2686, class185.field2948.field2659);
                            class68.method723(arg2, arg4, -115, var10, var5.field9807);
                            class185.field2948.method1546(var10, 1);
                        }
                        if (~arg0 == -6) {
                            ++class466.field7150;
                            class487 var11 = class618.method4519(92, class430.field6767, class185.field2948.field2659);
                            class68.method723(arg2, arg4, -67, var11, var5.field9807);
                            class185.field2948.method1546(var11, 1);
                        }
                        if (~arg0 == -7) {
                            ++class471.field7211;
                            class487 var12 = class618.method4519(66, class333.field5441, class185.field2948.field2659);
                            class68.method723(arg2, arg4, -73, var12, var5.field9807);
                            class185.field2948.method1546(var12, 1);
                        }
                        if (arg3 < -21) {
                            if (arg0 == 7) {
                                ++class382.field6144;
                                class487 var13 = class618.method4519(30, class355.field5720, class185.field2948.field2659);
                                class68.method723(arg2, arg4, -74, var13, var5.field9807);
                                class185.field2948.method1546(var13, 1);
                            }
                            if (arg0 == 8) {
                                ++class698.field10053;
                                class487 var14 = class618.method4519(39, class455.field7022, class185.field2948.field2659);
                                class68.method723(arg2, arg4, -116, var14, var5.field9807);
                                class185.field2948.method1546(var14, 1);
                            }
                            if (~arg0 == -10) {
                                ++class475.field7239;
                                class487 var15 = class618.method4519(70, class292.field4694, class185.field2948.field2659);
                                class68.method723(arg2, arg4, -50, var15, var5.field9807);
                                class185.field2948.method1546(var15, 1);
                            }
                            if (arg0 == 10) {
                                ++class427.field6739;
                                class487 var16 = class618.method4519(81, class25.field279, class185.field2948.field2659);
                                class68.method723(arg2, arg4, -104, var16, var5.field9807);
                                class185.field2948.method1546(var16, 1);
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var18) {
            throw class590.method4333(var18, field1691[9] + arg0 + ',' + (arg1 != null ? field1691[7] : field1691[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(ILes;)V", line = 342)
    public class115(int arg0, class404 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)V", line = 345)
    public static void method1145(int arg0) {
        try {
            field1679 = null;
            if (arg0 != 1) {
                field1679 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field1691[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ra", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1146(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 2);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ra", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1147(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 43;
                    break;
                case 1:
                    var10005 = 80;
                    break;
                case 2:
                    var10005 = 32;
                    break;
                case 3:
                    var10005 = 108;
                    break;
                default:
                    var10005 = 2;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
