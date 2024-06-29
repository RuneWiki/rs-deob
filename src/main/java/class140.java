import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class140 {

    @OriginalMember(owner = "client!fg", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1668 = new String[] { method1205(method1204("q\u0000\u000e\u001aY5\f\u0019\u0015@|\u0004\u0015\u001eOoO59Dz\u000f+\u001eSm\u0004\n8Nu\u000f\u001d\u0018Ur\u000e\u0016")), method1205(method1204("|\u0004\f+Mz\u0015\u001e\u0014Sv,:\u001e@u2\u001d\tW~\u0013")), method1205(method1204("q\u0000\u000e\u001a\u000fw\u0000\u0016\u001c\u000fv\u0000\u0016\u001aF~\f\u001d\u0015U5,\u0019\u0015@|\u0004\u0015\u001eOo'\u0019\u0018Ut\u0013\u0001")), method1205(method1204("q\u0000\u000e\u001a\u000fw\u0000\u0016\u001c\u000fH\u0015\n\u0012O|")), method1205(method1204("S\u0004\u0019\u000ben\f\b[R~\u0015\r\u000b\u0001~\u0013\n\u0014S!")), method1205(method1204("q\u0000\u000e\u001a\u000fw\u0000\u0016\u001c\u000fX\r\u0019\bR")), method1205(method1204("x\u000e\u0015URn\u000fV\u0016@u\u0000\u001f\u001eL~\u000f\fAUb\u0011\u001dFit\u0015+\u000bNo%\u0011\u001aFu\u000e\u000b\u000fHx")), method1205(method1204("}\u0006V?\t")), method1205(method1204("x\u000e\u0015URn\u000fV\u0016@u\u0000\u001f\u001eL~\u000f\fUit\u0015+\u000bNo%\u0011\u001aFu\u000e\u000b\u000fHx, 9Dz\u000f")), method1205(method1204("u\u0004\u000f+Mz\u0015\u001e\u0014Sv, 9Dz\u000f(\tNc\u0018")), method1205(method1204("`OVU\\")), method1205(method1204("u\u0014\u0014\u0017")), method1205(method1204("}\u0006V:\t")), method1205(method1204("}\u0006V9\t")), method1205(method1204("l\b\u0016")), method1205(method1204("}\u0006V8\t")), method1205(method1204("s\u0000\u000e\u001eGr\u0013\u001d\u001dNc")), method1205(method1204("v\u0000\u001b")), method1205(method1204("s\u0000\u000e\u001eH~W")) };

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "[I")
    public static int[] field1661 = new int[5];

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "[I")
    public static int[] field1664 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public static int field1665;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fg", name = "b", descriptor = "Ljava/lang/Class;")
    public static Class field1666;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fg", name = "d", descriptor = "Ljava/lang/Class;")
    public static Class field1667;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lic;ILub;II)V")
    public static final void method1199(class726 arg0, int arg1, class22 arg2, int arg3, int arg4) {
        try {
            field1665++;
            byte var5 = -1;
            if ((arg3 & 0x100) != 0) {
                int var6 = arg2.method1432((byte) -33);
                arg0.field3829 = arg2.method1431(42);
                arg0.field3795 = arg2.method1455((byte) 62);
                arg0.field3846 = (var6 & 0x8000) != 0;
                arg0.field3770 = var6 & 0x7FFF;
                arg0.field3768 = class375.field5711 + arg0.field3770 + arg0.field3829;
            }
            if ((arg3 & 0x1000) != 0) {
                var5 = arg2.method1447(false);
            }
            if ((arg3 & 0x200) != 0) {
                arg0.field3818 = arg2.method1434(-46);
                arg0.field3767 = arg2.method1462(true);
                arg0.field3791 = arg2.method1434(-102);
                arg0.field3788 = arg2.method1414(1);
                arg0.field3827 = arg2.method1445((byte) 127) + class375.field5711;
                arg0.field3833 = arg2.method1441(arg1 + 86) + class375.field5711;
                arg0.field3832 = arg2.method1426(-14788);
                arg0.field3858 = 0;
                if (arg0.field10516) {
                    arg0.field3818 += arg0.field10485;
                    arg0.field3791 += arg0.field10485;
                    arg0.field3767 += arg0.field10523;
                    arg0.field3862 = 0;
                    arg0.field3788 += arg0.field10523;
                } else {
                    arg0.field3818 += arg0.field3859[0];
                    arg0.field3767 += arg0.field3863[0];
                    arg0.field3862 = 1;
                    arg0.field3791 += arg0.field3859[0];
                    arg0.field3788 += arg0.field3863[0];
                }
            }
            if ((arg3 & 0x800) != 0) {
                arg0.field10512 = arg2.method1431(109) == 1;
            }
            if ((arg3 & 0x1) != 0) {
                arg0.field10502 = arg2.method1444(93);
                if (arg0.field3862 == 0) {
                    arg0.method2097(arg0.field10502, 0);
                    arg0.field10502 = -1;
                }
            }
            if ((arg3 & 0x20) != 0) {
                int var7 = arg2.method1455((byte) 62);
                if (var7 > 0) {
                    for (int var8 = 0; var8 < var7; var8++) {
                        int var9 = -1;
                        int var10 = -1;
                        int var11 = -1;
                        int var12 = arg2.method1425(arg1 ^ 0xFFFFFFBC);
                        if (var12 == 32767) {
                            var12 = arg2.method1425(10);
                            var10 = arg2.method1425(81);
                            var9 = arg2.method1425(40);
                            var11 = arg2.method1425(86);
                        } else if (var12 == 32766) {
                            var12 = -1;
                        } else {
                            var10 = arg2.method1425(101);
                        }
                        int var13 = arg2.method1425(arg1 ^ 0xFFFFFFF5);
                        int var14 = arg2.method1409(-87);
                        arg0.method2109(var10, var13, var14, (byte) -125, var11, var9, var12, class375.field5711);
                    }
                }
            }
            if ((arg3 & 0x10) != 0) {
                class459.field6686[arg4] = arg2.method1447(false);
            }
            if ((arg3 & 0x80) != 0) {
                int var15 = arg2.method1432((byte) -32);
                if (var15 == 65535) {
                    var15 = -1;
                }
                int var16 = arg2.method1453((byte) 82);
                int var17 = arg2.method1455((byte) 62);
                int var18 = var17 & 0x7;
                int var19 = var17 >> 3 & 0xF;
                if (var19 == 15) {
                    var19 = -1;
                }
                arg0.method2107(var15, -94, var19, var18, 0, var16);
            }
            if ((arg3 & 0x4000) != 0) {
                int var20 = arg2.method1431(arg1 ^ 0x4E);
                int[] var21 = new int[var20];
                int[] var22 = new int[var20];
                int[] var23 = new int[var20];
                for (int var24 = 0; var24 < var20; var24++) {
                    int var25 = arg2.method1445((byte) 103);
                    if (var25 == 65535) {
                        var25 = -1;
                    }
                    var21[var24] = var25;
                    var22[var24] = arg2.method1455((byte) 62);
                    var23[var24] = arg2.method1432((byte) -126);
                }
                class243.method2071(arg0, var21, (byte) 66, var22, var23);
            }
            if ((arg3 & 0x8000) != 0) {
                int var26 = arg2.method1445((byte) 125);
                if (var26 == 65535) {
                    var26 = -1;
                }
                int var27 = arg2.method1449(arg1 + 123);
                int var28 = arg2.method1426(arg1 - 14787);
                int var29 = var28 & 0x7;
                int var30 = (var28 & 0x79) >> 3;
                if (var30 == 15) {
                    var30 = -1;
                }
                arg0.method2107(var26, -109, var30, var29, 1, var27);
            }
            if ((arg3 & 0x400) != 0) {
                arg0.field3782 = arg2.method1423(-80);
                if (arg0.field3782.charAt(0) == '~') {
                    arg0.field3782 = arg0.field3782.substring(1);
                    class150.method1265(arg0.method5289(arg1 - 2067, true), arg0.field3782, -1, arg0.field10491, 0, 2, arg0.method5298(false, (byte) -3));
                } else if (class225.field3446 == arg0) {
                    class150.method1265(arg0.method5289(-2068, true), arg0.field3782, -1, arg0.field10491, 0, 2, arg0.method5298(false, (byte) -3));
                }
                arg0.field3805 = 0;
                arg0.field3776 = 0;
                arg0.field3812 = 150;
            }
            if ((arg3 & 0x20000) != 0) {
                arg0.field3831 = arg2.method1434(arg1 ^ 0x6C);
                arg0.field3837 = arg2.method1434(-108);
                arg0.field3823 = arg2.method1447(false);
                arg0.field3798 = (byte) arg2.method1409(-80);
                arg0.field3803 = class375.field5711 + arg2.method1441(36);
                arg0.field3824 = class375.field5711 + arg2.method1432((byte) -70);
            }
            if ((arg3 & 0x80000) != 0) {
                int var31 = arg2.method1426(arg1 ^ 0x39C3);
                int[] var32 = new int[var31];
                int[] var33 = new int[var31];
                for (int var34 = 0; var34 < var31; var34++) {
                    int var35 = arg2.method1445((byte) 120);
                    if ((var35 & 0xC000) == 49152) {
                        int var36 = arg2.method1445((byte) 102);
                        var32[var34] = class544.method4107(var35 << 16, var36);
                    } else {
                        var32[var34] = var35;
                    }
                    var33[var34] = arg2.method1445((byte) 121);
                }
                arg0.method2096(arg1 ^ 0xFFFFFF9A, var33, var32);
            }
            if ((arg3 & 0x2) != 0) {
                int var37 = arg2.method1455((byte) 62);
                byte[] var38 = new byte[var37];
                class163 var39 = new class163(var38);
                arg2.method1403(var38, (byte) 126, 0, var37);
                class216.field3295[arg4] = var39;
                arg0.method5294(7000, var39);
            }
            if ((arg3 & 0x8) != 0) {
                int[] var40 = new int[4];
                for (int var41 = 0; var41 < 4; var41++) {
                    var40[var41] = arg2.method1441(104);
                    if (var40[var41] == 65535) {
                        var40[var41] = -1;
                    }
                }
                int var42 = arg2.method1409(arg1 - 87);
                class625.method4642(arg0, var42, var40, 110);
            }
            if ((arg3 & 0x40000) != 0) {
                arg0.field10494 = arg2.method1455((byte) 62) == 1;
            }
            if ((arg3 & 0x10000) != 0) {
                int var43 = arg2.method1441(126);
                int var44 = arg2.method1449(-29);
                if (var43 == 65535) {
                    var43 = -1;
                }
                int var45 = arg2.method1409(-83);
                int var46 = var45 & 0x7;
                int var47 = (var45 & 0x79) >> 3;
                if (var47 == 15) {
                    var47 = -1;
                }
                arg0.method2107(var43, -93, var47, var46, 2, var44);
            }
            if (~(arg3 & 0x40) != arg1) {
                int var48 = arg2.method1441(112);
                if (var48 == 65535) {
                    var48 = -1;
                }
                arg0.field3842 = var48;
            }
            if (arg0.field10516) {
                if (var5 == 127) {
                    arg0.method5296(arg0.field10485, (byte) -126, arg0.field10523);
                } else {
                    byte var49;
                    if (var5 == -1) {
                        var49 = class459.field6686[arg4];
                    } else {
                        var49 = var5;
                    }
                    class396.method3129(arg0, arg1 + 1, var49);
                    arg0.method5291(var49, arg0.field10523, (byte) 28, arg0.field10485);
                }
            }
        } catch (RuntimeException var51) {
            throw class759.method5498(var51, field1668[12] + (arg0 == null ? field1668[11] : field1668[10]) + ',' + arg1 + ',' + (arg2 == null ? field1668[11] : field1668[10]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;ZLmca;Z)V")
    public static final void method1200(String arg0, boolean arg1, String arg2, boolean arg3, class33 arg4, boolean arg5) {
        try {
            if (arg3) {
                method1200(null, false, null, false, null, true);
            }
            field1663++;
            if (arg1) {
                if (class33.field386.startsWith(field1668[14]) && arg4.field388) {
                    String var6 = null;
                    if (class629.field9206 != null) {
                        var6 = class629.field9206.getParameter(field1668[18]);
                    }
                    if (var6 == null || !var6.equals("1")) {
                        class42 var7 = class720.method5249(arg4, (byte) -57, 0, arg0);
                        class391.field5889 = arg4;
                        class747.field10865 = var7;
                        class66.field680 = arg0;
                        return;
                    }
                }
                if (class33.field386.startsWith(field1668[17])) {
                    String var8 = null;
                    if (class629.field9206 != null) {
                        var8 = class629.field9206.getParameter(field1668[16]);
                    }
                    if (var8 != null && var8.equals("1") && arg5) {
                        class38.method253(arg0, arg4, 1, 1, arg2);
                        return;
                    }
                }
                class720.method5249(arg4, (byte) -17, 2, arg0);
            } else {
                class720.method5249(arg4, (byte) -118, 3, arg0);
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field1668[15] + (arg0 == null ? field1668[11] : field1668[10]) + ',' + arg1 + ',' + (arg2 == null ? field1668[11] : field1668[10]) + ',' + arg3 + ',' + (arg4 == null ? field1668[11] : field1668[10]) + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
    public static final synchronized void method1201(int arg0) {
        try {
            field1662++;
            if (class170.field2335 == null) {
                try {
                    if (arg0 != 22257) {
                        method1202((byte) 118);
                    }
                    Class var1 = Class.forName(field1668[2]);
                    Method var2 = var1.getDeclaredMethod(field1668[1], null);
                    Object var3 = var2.invoke(null, (Object[]) null);
                    Method var4 = var1.getMethod(field1668[9], Class.forName(field1668[0]), field1666 == null ? (field1666 = method1203(field1668[3])) : field1666, field1667 == null ? (field1667 = method1203(field1668[5])) : field1667);
                    class170.field2335 = var4.invoke(null, var3, field1668[6], Class.forName(field1668[8]));
                } catch (Exception var7) {
                    System.out.println(field1668[4]);
                    var7.printStackTrace();
                }
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field1668[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V")
    public static void method1202(byte arg0) {
        try {
            field1661 = null;
            field1664 = null;
            if (arg0 > -24) {
                field1664 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1668[13] + arg0 + ')');
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1203(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!fg", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1204(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x21);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fg", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1205(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 27;
                    break;
                case 1:
                    var10005 = 97;
                    break;
                case 2:
                    var10005 = 120;
                    break;
                case 3:
                    var10005 = 123;
                    break;
                default:
                    var10005 = 33;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
