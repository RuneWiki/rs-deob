import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class class788 extends class756 {

    @OriginalMember(owner = "client!rw", name = "n", descriptor = "I")
    private int field11493 = -1;

    @OriginalMember(owner = "client!rw", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11497 = new String[] { method5703(method5702("/g\u000553")), method5703(method5702(":<Gw")), method5703(method5702("&>\u0005Xf")), method5703(method5702("&>\u0005_f")), method5703(method5702("&>\u0005^f")), method5703(method5702("&>\u0005Zf")), method5703(method5702("&>\u0005Yf")) };

    @OriginalMember(owner = "client!rw", name = "s", descriptor = "[I")
    public static int[] field11495 = new int[6];

    @OriginalMember(owner = "client!rw", name = "r", descriptor = "B")
    private byte field11492;

    @OriginalMember(owner = "client!rw", name = "t", descriptor = "I")
    public static int field11490;

    @OriginalMember(owner = "client!rw", name = "o", descriptor = "I")
    public static int field11491;

    @OriginalMember(owner = "client!rw", name = "p", descriptor = "I")
    public static int field11494;

    @OriginalMember(owner = "client!rw", name = "q", descriptor = "I")
    public static int field11496;

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(II)Lrfa;")
    public static final class211 method5699(int arg0, int arg1) {
        try {
            field11490++;
            if (arg0 != -4064) {
                method5699(103, 8);
            }
            if (arg1 == 0) {
                return new class678();
            } else if (arg1 == 1) {
                return new class588();
            } else if (arg1 == 2) {
                return new class425();
            } else if (arg1 == 3) {
                return new class463();
            } else if (arg1 == 4) {
                return new class555();
            } else if (arg1 == 5) {
                return new class432();
            } else if (arg1 == 6) {
                return new class461();
            } else if (arg1 == 7) {
                return new class126();
            } else if (arg1 == 8) {
                return new class553();
            } else if (arg1 == 9) {
                return new class151();
            } else if (arg1 == 10) {
                return new class566();
            } else if (arg1 == 11) {
                return new class671();
            } else if (arg1 == 12) {
                return new class209();
            } else if (arg1 == 13) {
                return new class374();
            } else if (arg1 == 14) {
                return new class220();
            } else if (arg1 == 15) {
                return new class366();
            } else if (arg1 == 16) {
                return new class167();
            } else if (arg1 == 17) {
                return new class141();
            } else if (arg1 == 18) {
                return new class750();
            } else if (arg1 == 19) {
                return new class229();
            } else if (arg1 == 20) {
                return new class393();
            } else if (arg1 == 21) {
                return new class317();
            } else if (arg1 == 22) {
                return new class617();
            } else if (arg1 == 23) {
                return new class188();
            } else if (arg1 == 24) {
                return new class330();
            } else if (arg1 == 25) {
                return new class106();
            } else if (arg1 == 26) {
                return new class29();
            } else if (arg1 == 27) {
                return new class60();
            } else if (arg1 == 28) {
                return new class565();
            } else if (arg1 == 29) {
                return new class36();
            } else if (arg1 == 30) {
                return new class624();
            } else if (arg1 == 31) {
                return new class219();
            } else if (arg1 == 32) {
                return new class153();
            } else if (arg1 == 33) {
                return new class268();
            } else if (arg1 == 34) {
                return new class424();
            } else if (arg1 == 35) {
                return new class673();
            } else if (arg1 == 36) {
                return new class592();
            } else if (arg1 == 37) {
                return new class172();
            } else if (arg1 == 38) {
                return new class771();
            } else if (arg1 == 39) {
                return new class76();
            } else {
                return null;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field11497[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(I)V")
    public static void method5700(int arg0) {
        try {
            if (arg0 >= -112) {
                field11495 = null;
            }
            field11495 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field11497[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(Lkp;I)V")
    public final void method41(class514 arg0, int arg1) {
        try {
            field11491++;
            arg0.method3899(this.field11493, -126, this.field11492);
            if (arg1 != 9893) {
                method5701(-97, null, -67, null);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field11497[2] + (arg0 == null ? field11497[1] : field11497[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(BLib;)V")
    public final void method38(byte arg0, class163 arg1) {
        try {
            this.field11493 = arg1.method1445((byte) 112);
            field11496++;
            this.field11492 = arg1.method1414(1);
            if (arg0 < 32) {
                field11495 = null;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field11497[6] + arg0 + ',' + (arg1 == null ? field11497[1] : field11497[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(ILib;ILmca;)V")
    public static final void method5701(int arg0, class163 arg1, int arg2, class33 arg3) {
        try {
            field11494++;
            if (arg2 != -9) {
                field11495 = null;
            }
            class132 var4 = new class132();
            var4.field1547 = arg1.method1455((byte) 62);
            var4.field1544 = arg1.method1453((byte) 120);
            var4.field1542 = new int[var4.field1547];
            var4.field1545 = new int[var4.field1547];
            var4.field1538 = new class42[var4.field1547];
            var4.field1549 = new byte[var4.field1547][][];
            var4.field1541 = new int[var4.field1547];
            var4.field1540 = new class42[var4.field1547];
            for (int var5 = 0; var5 < var4.field1547; var5++) {
                try {
                    int var6 = arg1.method1455((byte) 62);
                    if (var6 == 0 || var6 == 1 || var6 == 2) {
                        String var17 = arg1.method1423(-127);
                        String var18 = arg1.method1423(81);
                        int var19 = 0;
                        if (var6 == 1) {
                            var19 = arg1.method1453((byte) 98);
                        }
                        var4.field1542[var5] = var6;
                        var4.field1541[var5] = var19;
                        var4.field1540[var5] = arg3.method218(var18, class548.method4136(var17, arg2 + 3934), (byte) 70);
                    } else if (var6 == 3 || var6 == 4) {
                        String var7 = arg1.method1423(-80);
                        String var8 = arg1.method1423(-114);
                        int var9 = arg1.method1455((byte) 62);
                        String[] var10 = new String[var9];
                        for (int var11 = 0; var11 < var9; var11++) {
                            var10[var11] = arg1.method1423(124);
                        }
                        byte[][] var12 = new byte[var9][];
                        if (var6 == 3) {
                            for (int var13 = 0; var13 < var9; var13++) {
                                int var14 = arg1.method1453((byte) 91);
                                var12[var13] = new byte[var14];
                                arg1.method1413(var12[var13], -16385, var14, 0);
                            }
                        }
                        var4.field1542[var5] = var6;
                        Class[] var15 = new Class[var9];
                        for (int var16 = 0; var16 < var9; var16++) {
                            var15[var16] = class548.method4136(var10[var16], 3925);
                        }
                        var4.field1538[var5] = arg3.method217(var8, class548.method4136(var7, class219.method1916(arg2, -3934)), var15, false);
                        var4.field1549[var5] = var12;
                    }
                } catch (ClassNotFoundException var21) {
                    var4.field1545[var5] = -1;
                } catch (SecurityException var22) {
                    var4.field1545[var5] = -2;
                } catch (NullPointerException var23) {
                    var4.field1545[var5] = -3;
                } catch (Exception var24) {
                    var4.field1545[var5] = -4;
                } catch (Throwable var25) {
                    var4.field1545[var5] = -5;
                }
            }
            class598.field8804.method3868(91, var4);
        } catch (RuntimeException var26) {
            throw class759.method5498(var26, field11497[5] + arg0 + ',' + (arg1 == null ? field11497[1] : field11497[0]) + ',' + arg2 + ',' + (arg3 == null ? field11497[1] : field11497[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!rw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5702(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5703(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 84;
                    break;
                case 1:
                    var10005 = 73;
                    break;
                case 2:
                    var10005 = 43;
                    break;
                case 3:
                    var10005 = 27;
                    break;
                default:
                    var10005 = 78;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
