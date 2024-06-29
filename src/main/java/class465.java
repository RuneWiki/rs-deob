import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class465 extends class313 {

    @OriginalMember(owner = "client!ks", name = "i", descriptor = "[Lgt;")
    public class482[] field7138;

    @OriginalMember(owner = "client!ks", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7141 = new String[] { method3595(method3594("\b\u0001^RL")), method3595(method3594("\r\u0007\u001c{")), method3595(method3594("\b\u0001^QL")), method3595(method3594("\u0018\\^9\u0019")), method3595(method3594("\u0007\u0002")), method3595(method3594("\b\u0001^+\r\r\u001b\u0004)L")) };

    @OriginalMember(owner = "client!ks", name = "j", descriptor = "Lpo;")
    public static class585 field7137 = new class585(method3595(method3594("\u0004\u0013\u001drP")), method3595(method3594("$\u0013\u001drDW")), 3);

    @OriginalMember(owner = "client!ks", name = "m", descriptor = "I")
    public static int field7136;

    @OriginalMember(owner = "client!ks", name = "l", descriptor = "I")
    public static int field7139;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ks", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class field7140;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3593(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIILha;IIIII)V", line = 3)
    public static final void method3591(int arg0, int arg1, int arg2, class63 arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        try {
            field7136++;
            class3 var9 = (class3) class244.method2102(arg4, arg1, arg2);
            if (var9 != null) {
                class362 var10 = class370.field5999.method4002(-5, var9.method32((byte) -95));
                int var11 = var9.method35((byte) -55) & 0x3;
                int var12 = var9.method34(arg6 + 16384);
                if (var10.field5907 == -1) {
                    int var13 = arg8;
                    if (var10.field5843 > 0) {
                        var13 = arg7;
                    }
                    if (var12 == 0 || var12 == 2) {
                        if (var11 == 0) {
                            arg3.method662(var13, (byte) 127, 4, arg0, arg5);
                        } else if (var11 == 1) {
                            arg3.method658(4, 27174, arg0, arg5, var13);
                        } else if (var11 == 2) {
                            arg3.method662(var13, (byte) 59, 4, arg0 + 3, arg5);
                        } else if (var11 == 3) {
                            arg3.method658(4, 27174, arg0, arg5 + 3, var13);
                        }
                    }
                    if (var12 == 3) {
                        if (var11 == 0) {
                            arg3.method664(arg5, var13, 1, arg0, 1, true);
                        } else if (var11 == 1) {
                            arg3.method664(arg5, var13, 1, arg0 + 3, 1, true);
                        } else if (var11 == 2) {
                            arg3.method664(arg5 + 3, var13, 1, arg0 + 3, 1, true);
                        } else if (var11 == 3) {
                            arg3.method664(arg5 + 3, var13, 1, arg0, 1, true);
                        }
                    }
                    if (var12 == 2) {
                        if (var11 == 0) {
                            arg3.method658(4, arg6 + 27170, arg0, arg5, var13);
                        } else if (var11 == 1) {
                            arg3.method662(var13, (byte) 63, 4, arg0 + 3, arg5);
                        } else if (var11 == 2) {
                            arg3.method658(4, 27174, arg0, arg5 + 3, var13);
                        } else if (var11 == 3) {
                            arg3.method662(var13, (byte) 119, 4, arg0, arg5);
                        }
                    }
                } else {
                    class300.method2582(var11, -4, arg5, arg3, arg0, var10);
                }
            }
            class3 var14 = (class3) class59.method614(arg4, arg1, arg2, field7140 == null ? (field7140 = method3593(field7141[4])) : field7140);
            if (arg6 != 4) {
                field7137 = null;
            }
            if (var14 != null) {
                class362 var15 = class370.field5999.method4002(109, var14.method32((byte) -95));
                int var16 = var14.method35((byte) -55) & 0x3;
                int var17 = var14.method34(16388);
                if (var15.field5907 != -1) {
                    class300.method2582(var16, -4, arg5, arg3, arg0, var15);
                } else if (var17 == 9) {
                    int var18 = -1118482;
                    if (var15.field5843 > 0) {
                        var18 = -1179648;
                    }
                    if (var16 == 0 || var16 == 2) {
                        arg3.method657(arg0, arg0 + 3, arg5, var18, 1, arg5 + 3);
                    } else {
                        arg3.method657(arg0, arg0 + 3, arg5 + 3, var18, 1, arg5);
                    }
                }
            }
            class3 var19 = (class3) class605.method4422(arg4, arg1, arg2);
            if (var19 != null) {
                class362 var20 = class370.field5999.method4002(-71, var19.method32((byte) -95));
                int var21 = var19.method35((byte) -55) & 0x3;
                if (var20.field5907 != -1) {
                    class300.method2582(var21, -4, arg5, arg3, arg0, var20);
                    return;
                }
            }
        } catch (RuntimeException var23) {
            throw class590.method4333(var23, field7141[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field7141[1] : field7141[3]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(B)V", line = 139)
    public static void method3592(byte arg0) {
        try {
            field7137 = null;
            int var1 = -86 / ((arg0 - 20) / 57);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7141[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "([Lgt;)V", line = 152)
    public class465(class482[] arg0) {
        try {
            this.field7138 = arg0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7141[5] + (arg0 == null ? field7141[1] : field7141[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!ks", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3594(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x64);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ks", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3595(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 99;
                    break;
                case 1:
                    var10005 = 114;
                    break;
                case 2:
                    var10005 = 112;
                    break;
                case 3:
                    var10005 = 23;
                    break;
                default:
                    var10005 = 100;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
