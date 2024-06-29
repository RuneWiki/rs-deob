import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class360 {

    @OriginalMember(owner = "client!ng", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5815 = new String[] { method2981(method2980("$\u0006M\u0005")), method2981(method2980("1]\u000fG\u0012")), method2981(method2980("$\u0014\u000f-G")), method2981(method2980("&\u001cF\u000e\n.\u001cT\u001d")), method2981(method2980("\u0015\u0011M\b\u0001!")), method2981(method2980("$\u0014\u000f(G")), method2981(method2980("\u0015\u0007N\u0019")), method2981(method2980("$\u0014\u000f+G")), method2981(method2980("$\u0014\u000f,G")), method2981(method2980("$\u0014\u000f*G")) };

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "Lmj;")
    public static class683 field5806 = null;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "Lvn;")
    public static class330 field5808 = new class330(76, -1);

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public static int field5807;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
    public static int field5809;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public static int field5811;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public static int field5812;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public static int field5813;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "[Lhk;")
    public static class107[] field5814;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "[Lrda;")
    public static class693[] field5810;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIILha;II)Lka;", line = 3)
    public static final class499 method2975(int arg0, int arg1, int arg2, int arg3, class63 arg4, int arg5, int arg6) {
        try {
            field5811++;
            long var7 = (long) arg2;
            class499 var9 = (class499) class363.field5940.method302(-92, var7);
            short var10 = 2055;
            if (var9 == null) {
                class141 var11 = class108.method1007(class480.field7311, arg2, 0, 103);
                if (var11 == null) {
                    return null;
                }
                if (var11.field2003 < 13) {
                    var11.method1312(2, false);
                }
                var9 = arg4.method192(var11, var10, class10.field109, 64, 768);
                class363.field5940.method295(false, var7, var9);
            }
            class499 var12 = var9.method394((byte) 2, var10, true);
            if (arg0 != 0) {
                var12.method413(arg0);
            }
            if (arg5 != 0) {
                var12.method386(arg5);
            }
            if (arg6 != 0) {
                var12.method404(arg6);
            }
            if (arg1 != 27746) {
                field5812 = -56;
            }
            if (arg3 != 0) {
                var12.method395(0, arg3, 0);
            }
            return var12;
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field5815[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field5815[0] : field5815[1]) + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;ILtga;)Luga;", line = 55)
    public static final class218 method2976(boolean arg0, String arg1, String arg2, int arg3, class61 arg4) {
        try {
            field5809++;
            if (arg3 == 0) {
                return arg4.method627(false, arg1);
            } else if (arg3 == 1) {
                try {
                    Object var5 = class470.method3619(new Object[] { (new URL(class476.field7255.getCodeBase(), arg1)).toString() }, arg2, true, class476.field7255);
                    if (var5 == null) {
                        throw new RuntimeException();
                    }
                    class218 var6 = new class218();
                    var6.field3402 = 1;
                    return var6;
                } catch (Throwable var13) {
                    class218 var7 = new class218();
                    var7.field3402 = 2;
                    return var7;
                }
            } else {
                if (!arg0) {
                    field5814 = null;
                }
                if (arg3 == 2) {
                    try {
                        class476.field7255.getAppletContext().showDocument(new URL(class476.field7255.getCodeBase(), arg1), field5815[4]);
                        class218 var8 = new class218();
                        var8.field3402 = 1;
                        return var8;
                    } catch (Exception var14) {
                        class218 var9 = new class218();
                        var9.field3402 = 2;
                        return var9;
                    }
                } else if (arg3 == 3) {
                    try {
                        class470.method3617((byte) 108, class476.field7255, field5815[3]);
                    } catch (Throwable var16) {
                    }
                    try {
                        class476.field7255.getAppletContext().showDocument(new URL(class476.field7255.getCodeBase(), arg1), field5815[6]);
                        class218 var10 = new class218();
                        var10.field3402 = 1;
                        return var10;
                    } catch (Exception var15) {
                        class218 var11 = new class218();
                        var11.field3402 = 2;
                        return var11;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
        } catch (RuntimeException var17) {
            throw class590.method4333(var17, field5815[5] + arg0 + ',' + (arg1 == null ? field5815[0] : field5815[1]) + ',' + (arg2 == null ? field5815[0] : field5815[1]) + ',' + arg3 + ',' + (arg4 == null ? field5815[0] : field5815[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)Z", line = 142)
    public static final boolean method2977(int arg0, int arg1, int arg2) {
        try {
            field5807++;
            if (arg0 != 0) {
                field5812 = -51;
            }
            return (arg1 & 0x800) != 0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5815[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V", line = 153)
    public static void method2978(byte arg0) {
        try {
            field5814 = null;
            field5808 = null;
            field5806 = null;
            field5810 = null;
            if (arg0 != 123) {
                field5808 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5815[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZI)V", line = 172)
    public static final void method2979(boolean arg0, int arg1) {
        try {
            class623.field8996.method3244(22733, class623.field8996.field6397, 0);
            field5813++;
            class623.field8996.method3244(22733, class623.field8996.field6356, 0);
            class623.field8996.method3244(22733, class623.field8996.field6362, 1);
            class623.field8996.method3244(22733, class623.field8996.field6384, 1);
            class623.field8996.method3244(22733, class623.field8996.field6371, 0);
            if (arg1 >= -2) {
                field5806 = null;
            }
            class623.field8996.method3244(22733, class623.field8996.field6375, 0);
            class623.field8996.method3244(22733, class623.field8996.field6357, 0);
            class623.field8996.method3244(22733, class623.field8996.field6365, 0);
            class623.field8996.method3244(22733, class623.field8996.field6373, 0);
            class623.field8996.method3244(22733, class623.field8996.field6394, 0);
            class623.field8996.method3244(22733, class623.field8996.field6381, 0);
            class623.field8996.method3244(22733, class623.field8996.field6363, 0);
            class623.field8996.method3244(22733, class623.field8996.field6400, 0);
            class623.field8996.method3244(22733, class623.field8996.field6374, 0);
            class623.field8996.method3244(22733, class623.field8996.field6364, 0);
            class623.field8996.method3244(22733, class623.field8996.field6352, 0);
            class623.field8996.method3244(22733, class623.field8996.field6385, 0);
            class623.field8996.method3244(22733, class623.field8996.field6404, 0);
            class623.field8996.method3244(22733, class623.field8996.field6351, 0);
            class214.method1925(2);
            class623.field8996.method3244(22733, class623.field8996.field6383, 2);
            class623.field8996.method3244(22733, class623.field8996.field6388, 1);
            class181.method1710((byte) 69);
            class262.method2282(true);
            class550.field8069 = true;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5815[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ng", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2980(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ng", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2981(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 74;
                    break;
                case 1:
                    var10005 = 115;
                    break;
                case 2:
                    var10005 = 33;
                    break;
                case 3:
                    var10005 = 105;
                    break;
                default:
                    var10005 = 111;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
