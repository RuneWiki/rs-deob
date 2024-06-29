import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class323 {

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    public static int field4848;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ef", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field4849;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "[[Z")
    public static boolean[][] field4845;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2013(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4848++;
        if (arg2 != 1 || arg5 < 0 || arg7 < 0 || (class150.field2422 - 1) <= arg5 || arg7 >= (class21.field272 - 1)) {
            return;
        }
        if (class321.field4830 == null) {
            return;
        }
        if (arg4 == 0) {
            class185 var8 = (class185) class307.method1842(arg1, arg5, arg7);
            class185 var9 = (class185) class491.method2950(arg1, arg5, arg7);
            if (var8 != null && arg0 != 2) {
                if (var8 instanceof class143) {
                    ((class143) var8).field2316.method2545(arg6, (byte) -13);
                } else {
                    class408.method2419(arg7, arg0, arg1, arg3, var8.method174((byte) 115), (byte) -114, arg4, arg6, arg5);
                }
            }
            if (var9 != null) {
                if (!(var9 instanceof class143)) {
                    class408.method2419(arg7, arg0, arg1, arg3, var9.method174((byte) 126), (byte) -67, arg4, arg6, arg5);
                    return;
                }
                ((class143) var9).field2316.method2545(arg6, (byte) -13);
                return;
            }
            return;
        }
        if (arg4 != 1) {
            if (arg4 == 2) {
                class185 var10 = (class185) class86.method607(arg1, arg5, arg7, field4849 == null ? (field4849 = method2018("tf")) : field4849);
                if (var10 != null) {
                    if (arg0 == 11) {
                        arg0 = 10;
                    }
                    if (var10 instanceof class302) {
                        ((class302) var10).field4551.method2545(arg6, (byte) -13);
                        return;
                    }
                    class408.method2419(arg7, arg0, arg1, arg3, var10.method174((byte) 126), (byte) -124, arg4, arg6, arg5);
                    return;
                }
            } else if (arg4 == 3) {
                class185 var11 = (class185) class368.method2232(arg1, arg5, arg7);
                if (var11 == null) {
                    return;
                }
                if (!(var11 instanceof class221)) {
                    class408.method2419(arg7, arg0, arg1, arg3, var11.method174((byte) 127), (byte) -116, arg4, arg6, arg5);
                    return;
                }
                ((class221) var11).field3414.method2545(arg6, (byte) -13);
            } else {
                return;
            }
            return;
        }
        class185 var12 = (class185) class98.method741(arg1, arg5, arg7);
        if (var12 == null) {
            return;
        }
        if (var12 instanceof class435) {
            ((class435) var12).field6376.method2545(arg6, (byte) -13);
            return;
        }
        int var13 = var12.method174((byte) 120);
        if (arg0 != 4 && arg0 != 5) {
            if (arg0 == 6) {
                class408.method2419(arg7, 4, arg1, arg3 + 4, var13, (byte) -82, arg4, arg6, arg5);
            } else if (arg0 == 7) {
                class408.method2419(arg7, 4, arg1, (arg3 + 2 & 0x3) + 4, var13, (byte) -73, arg4, arg6, arg5);
                return;
            } else if (arg0 == 8) {
                class408.method2419(arg7, 4, arg1, arg3 + 4, var13, (byte) -103, arg4, arg6, arg5);
                class408.method2419(arg7, 4, arg1, (arg3 + 2 & 0x3) + 4, var13, (byte) -83, arg4, arg6, arg5);
                return;
            }
            return;
        }
        class408.method2419(arg7, 4, arg1, arg3, var13, (byte) -66, arg4, arg6, arg5);
        return;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
    public static final void method2014(int arg0) {
        class288.method1754(class450.field6931, arg0 ^ arg0);
        field4844++;
        class362.field5343++;
        if (class291.field4410 && class157.field2470) {
            int var1 = class251.field3835.method1686(25478);
            int var2 = class251.field3835.method1690(arg0 ^ 0xFFFFFFF6);
            int var3 = var2 - class123.field2031;
            int var4 = var1 - class446.field6867;
            if (class348.field5133 > var4) {
                var4 = class348.field5133;
            }
            if (class348.field5133 + class332.field4974.field6175 < class450.field6931.field6175 + var4) {
                var4 = class348.field5133 + class332.field4974.field6175 - class450.field6931.field6175;
            }
            if (class410.field5942 > var3) {
                var3 = class410.field5942;
            }
            if (class410.field5942 + class332.field4974.field6126 < class450.field6931.field6126 + var3) {
                var3 = class332.field4974.field6126 + class410.field5942 - class450.field6931.field6126;
            }
            int var5 = var4 - (class348.field5133 - class332.field4974.field6277);
            int var6 = class332.field4974.field6179 + var3 - class410.field5942;
            if (class251.field3835.method2438((byte) -58)) {
                if (class362.field5343 > class450.field6931.field6239) {
                    int var7 = var4 - class200.field3162;
                    int var8 = var3 - class113.field1909;
                    if (var7 > class450.field6931.field6248 || -class450.field6931.field6248 > var7 || var8 > class450.field6931.field6248 || var8 < -class450.field6931.field6248) {
                        class178.field2790 = true;
                    }
                }
                if (class450.field6931.field6183 != null && class178.field2790) {
                    class298 var9 = new class298();
                    var9.field4519 = var6;
                    var9.field4527 = var5;
                    var9.field4517 = class450.field6931;
                    var9.field4520 = class450.field6931.field6183;
                    class94.method704(var9);
                    return;
                }
            } else {
                if (class178.field2790) {
                    class62.method432(false);
                    if (class450.field6931.field6231 != null) {
                        class298 var10 = new class298();
                        var10.field4520 = class450.field6931.field6231;
                        var10.field4514 = class294.field4458;
                        var10.field4527 = var5;
                        var10.field4517 = class450.field6931;
                        var10.field4519 = var6;
                        class94.method704(var10);
                    }
                    if (class294.field4458 != null && client.method1172(class450.field6931) != null) {
                        class176.method1102(class294.field4458, class450.field6931, 0);
                    }
                } else if ((class343.field5109 == 1 || class51.method357(23951)) && class330.field4948 > 2) {
                    class511.method3055(class123.field2031 + class113.field1909, class446.field6867 + class200.field3162, (byte) -128);
                } else if (class232.method1392(-69)) {
                    class511.method3055(class123.field2031 + class113.field1909, class446.field6867 + class200.field3162, (byte) -128);
                }
                class450.field6931 = null;
            }
        } else if (class362.field5343 > 1) {
            class450.field6931 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
    public static void method2015(int arg0) {
        if (arg0 != 3) {
            field4845 = null;
        }
        field4845 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILqq;Ltq;)V")
    public static final void method2016(int arg0, class318 arg1, class427 arg2) {
        if (arg0 > -22) {
            method2017(124, 60, false, 103, 69);
        }
        field4846++;
        boolean var3 = class288.field4362.method3028(arg2.field6255, arg2.field6243, (byte) 108, arg1, arg2.field6228, arg2.field6274, arg2.field6149 ? class286.field4329.field696 : null, arg2.field6151 | 0xFF000000) == null;
        if (var3) {
            class507.field7655.method4(1, new class148(arg2.field6274, arg2.field6228, arg2.field6255, arg2.field6151 | 0xFF000000, arg2.field6243, arg2.field6149));
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIZII)V")
    public static final void method2017(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (!arg2) {
            return;
        }
        for (int var5 = 0; var5 < class413.field5993; var5++) {
            Rectangle var6 = class331.field4950[var5];
            if (arg4 < (var6.x + var6.width) && var6.x < arg4 + arg3 && arg0 < (var6.y + var6.height) && (arg0 + arg1) > var6.y) {
                class77.field1376[var5] = true;
            }
        }
        field4847++;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2018(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
