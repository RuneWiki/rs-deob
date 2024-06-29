import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nja")
public class class387 extends class627 {

    @OriginalMember(owner = "client!nja", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5656 = new String[] { method3041(method3040("2\u007f`%\u0015t")), method3041(method3040("';/%*")), method3041(method3040(".a")), method3041(method3040("2`mg")), method3041(method3040("2\u007f`%\u0016t")), method3041(method3040("2\u007f`%\u0013t")), method3041(method3040("2\u007f`%\u0014t")) };

    @OriginalMember(owner = "client!nja", name = "u", descriptor = "[I")
    public static int[] field5645 = new int[5];

    @OriginalMember(owner = "client!nja", name = "p", descriptor = "Lmv;")
    public static class125 field5651 = new class125(14, 8);

    @OriginalMember(owner = "client!nja", name = "w", descriptor = "I")
    public static int field5653 = 0;

    @OriginalMember(owner = "client!nja", name = "q", descriptor = "B")
    private byte field5647;

    @OriginalMember(owner = "client!nja", name = "o", descriptor = "B")
    private byte field5649;

    @OriginalMember(owner = "client!nja", name = "m", descriptor = "I")
    public static int field5646;

    @OriginalMember(owner = "client!nja", name = "n", descriptor = "I")
    public static int field5648;

    @OriginalMember(owner = "client!nja", name = "x", descriptor = "I")
    public static int field5650;

    @OriginalMember(owner = "client!nja", name = "r", descriptor = "I")
    public static int field5652;

    // $FF: synthetic field
    @OriginalMember(owner = "client!nja", name = "t", descriptor = "Ljava/lang/Class;")
    public static Class field5655;

    @OriginalMember(owner = "client!nja", name = "s", descriptor = "Ljava/lang/String;")
    private String field5644;

    @OriginalMember(owner = "client!nja", name = "v", descriptor = "[[Lqp;")
    public static class277[][] field5654;

    // $FF: synthetic method
    @OriginalMember(owner = "client!nja", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3039(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!nja", name = "a", descriptor = "(B)V", line = 10)
    public static void method3037(byte arg0) {
        try {
            field5645 = null;
            field5651 = null;
            if (arg0 != 45) {
                field5653 = 21;
            }
            field5654 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5656[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nja", name = "a", descriptor = "(Ljc;I)V", line = 23)
    public final void method97(class711 arg0, int arg1) {
        try {
            field5650++;
            this.field5644 = arg0.method5084(121);
            if (this.field5644 != null) {
                arg0.method5128(0);
                this.field5649 = arg0.method5125((byte) 124);
                this.field5647 = arg0.method5125((byte) -37);
            }
            if (arg1 > -97) {
                field5646 = -17;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5656[5] + (arg0 == null ? field5656[3] : field5656[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nja", name = "a", descriptor = "(IILha;IIIIIB)V", line = 51)
    public static final void method3038(int arg0, int arg1, class18 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        try {
            field5648++;
            class675 var9 = (class675) class185.method1526(arg3, arg5, arg1);
            if (var9 != null) {
                class789 var10 = class101.field1359.method2832(124, var9.method584(false));
                int var11 = var9.method585(-20175) & 0x3;
                int var12 = var9.method572(115);
                if (var10.field11416 == -1) {
                    int var13 = arg7;
                    if (var10.field11409 > 0) {
                        var13 = arg6;
                    }
                    if (var12 == 0 || var12 == 2) {
                        if (var11 == 0) {
                            arg2.method200(arg0, 4, arg4, 1, var13);
                        } else if (var11 == 1) {
                            arg2.method161(arg0, 4, arg4, true, var13);
                        } else if (var11 == 2) {
                            arg2.method200(arg0, 4, arg4 + 3, 1, var13);
                        } else if (var11 == 3) {
                            arg2.method161(arg0 + 3, 4, arg4, true, var13);
                        }
                    }
                    if (var12 == 3) {
                        if (var11 == 0) {
                            arg2.method121(1, arg4, arg8 ^ 0x54, 1, var13, arg0);
                        } else if (var11 == 1) {
                            arg2.method121(1, arg4 + 3, arg8 + 144, 1, var13, arg0);
                        } else if (var11 == 2) {
                            arg2.method121(1, arg4 + 3, 84, 1, var13, arg0 + 3);
                        } else if (var11 == 3) {
                            arg2.method121(1, arg4, -43, 1, var13, arg0 + 3);
                        }
                    }
                    if (var12 == 2) {
                        if (var11 == 0) {
                            arg2.method161(arg0, 4, arg4, true, var13);
                        } else if (var11 == 1) {
                            arg2.method200(arg0, 4, arg4 + 3, 1, var13);
                        } else if (var11 == 2) {
                            arg2.method161(arg0 + 3, 4, arg4, true, var13);
                        } else if (var11 == 3) {
                            arg2.method200(arg0, 4, arg4, 1, var13);
                        }
                    }
                } else {
                    class321.method2544(arg4, arg2, var10, -16777216, arg0, var11);
                }
            }
            class675 var14 = (class675) class590.method4352(arg3, arg5, arg1, field5655 == null ? (field5655 = method3039(field5656[2])) : field5655);
            if (arg8 != -18) {
                field5646 = 95;
            }
            if (var14 != null) {
                class789 var15 = class101.field1359.method2832(123, var14.method584(false));
                int var16 = var14.method585(arg8 ^ 0x4EDF) & 0x3;
                int var17 = var14.method572(103);
                if (var15.field11416 != -1) {
                    class321.method2544(arg4, arg2, var15, -16777216, arg0, var16);
                } else if (var17 == 9) {
                    int var18 = -1118482;
                    if (var15.field11409 > 0) {
                        var18 = -1179648;
                    }
                    if (var16 == 0 || var16 == 2) {
                        arg2.method242((byte) 122, arg0 + 3, arg4 + 3, var18, arg4, arg0);
                    } else {
                        arg2.method242((byte) 106, arg0, arg4 + 3, var18, arg4, arg0 + 3);
                    }
                }
            }
            class675 var19 = (class675) class254.method2130(arg3, arg5, arg1);
            if (var19 != null) {
                class789 var20 = class101.field1359.method2832(125, var19.method584(false));
                int var21 = var19.method585(-20175) & 0x3;
                if (var20.field11416 != -1) {
                    class321.method2544(arg4, arg2, var20, -16777216, arg0, var21);
                    return;
                }
            }
        } catch (RuntimeException var23) {
            throw class665.method4799(var23, field5656[4] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field5656[3] : field5656[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!nja", name = "a", descriptor = "(Lkj;I)V", line = 189)
    public final void method96(class26 arg0, int arg1) {
        try {
            if (this.field5644 != null) {
                arg0.field315 = this.field5649;
                arg0.field309 = this.field5647;
            }
            int var3 = 105 % ((44 - arg1) / 34);
            field5652++;
            arg0.field317 = this.field5644;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field5656[6] + (arg0 == null ? field5656[3] : field5656[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3040(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x57);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3041(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 92;
                    break;
                case 1:
                    var10005 = 21;
                    break;
                case 2:
                    var10005 = 1;
                    break;
                case 3:
                    var10005 = 11;
                    break;
                default:
                    var10005 = 87;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
