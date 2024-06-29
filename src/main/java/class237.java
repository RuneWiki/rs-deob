import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class237 {

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
    public int field3429 = 128;

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
    public int field3433 = 128;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public int field3426;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
    public int field3424;

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "I")
    public int field3422;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
    public int field3434;

    @OriginalMember(owner = "client!dh", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3435 = new String[] { method1969(method1968("C\u000e<KG")), method1969(method1968("\\H<\"\u0012")), method1969(method1968("VU~\t")), method1969(method1968("\\H<YSVIf[\u0012")), method1969(method1968("\\H<#\u0012")), method1969(method1968("\\H< \u0012")), method1969(method1968("\\H<&\u0012")), method1969(method1968("\\H<$\u0012")), method1969(method1968("\\H<!\u0012")), method1969(method1968("\\H<'\u0012")) };

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILjava/lang/String;)J", line = 3)
    public static final long method1961(int arg0, String arg1) {
        try {
            field3430++;
            long var2 = 0L;
            if (arg0 != -16515) {
                return 49L;
            }
            int var4 = arg1.length();
            for (int var5 = 0; var5 < var4; var5++) {
                var2 *= 37L;
                char var6 = arg1.charAt(var5);
                if (var6 >= 'A' && var6 <= 'Z') {
                    var2 += (var6 + 1 - 65);
                } else if (var6 >= 'a' && var6 <= 'z') {
                    var2 += (var6 + 1 - 97);
                } else if (var6 >= '0' && var6 <= '9') {
                    var2 += (var6 + 27 - 48);
                }
                if (var2 >= 177917621779460413L) {
                    break;
                }
            }
            while (var2 % 37L == 0L && var2 != 0L) {
                var2 /= 37L;
            }
            return var2;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field3435[8] + arg0 + ',' + (arg1 == null ? field3435[2] : field3435[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIILqo;BI)V", line = 58)
    public static final void method1962(int arg0, int arg1, int arg2, int arg3, class170 arg4, byte arg5, int arg6) {
        try {
            if (arg5 >= -11) {
                method1962(88, 111, 25, -109, null, (byte) 46, -28);
            }
            field3431++;
            class115.method1061(arg4.field2981, arg3, 67, arg4.field2969, arg1, arg0, arg4.field2984, 0, arg6, arg2);
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field3435[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field3435[2] : field3435[0]) + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIBI)Lpca;", line = 69)
    public static final class774 method1963(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        try {
            if (arg3 != 78) {
                field3428 = -58;
            }
            field3432++;
            long var5 = (long) arg2 & 0xFFFFL | ((long) arg4 & 0xFFFFL) << 48 | ((long) arg0 & 0xFFFFL) << 32 | (long) arg1 << 16 & 0xFFFFL << 16;
            class774 var7 = (class774) class713.field10107.method2053(0, var5);
            if (var7 == null) {
                var7 = class671.field9451.method1273(arg4, arg1, class463.field6758, (byte) 83, arg0, arg2);
                class713.field10107.method2051(var5, var7, 93);
            }
            return var7;
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field3435[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(I)V", line = 301)
    public class237(int arg0) {
        try {
            this.field3426 = arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3435[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(IIIIII)V", line = 308)
    private class237(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            this.field3424 = arg5;
            this.field3422 = arg3;
            this.field3429 = arg1;
            this.field3434 = arg4;
            this.field3426 = arg0;
            this.field3433 = arg2;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field3435[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZLvo;ZII)V", line = 96)
    public static final void method1964(boolean arg0, class782 arg1, boolean arg2, int arg3, int arg4) {
        try {
            field3423++;
            if (!arg0) {
                field3428 = 67;
            }
            int var5 = arg1.field11295;
            int var6 = arg1.field11244;
            if (arg1.field11250 == 0) {
                arg1.field11295 = arg1.field11167;
            } else if (arg1.field11250 == 1) {
                arg1.field11295 = arg3 - arg1.field11167;
            } else if (arg1.field11250 == 2) {
                arg1.field11295 = arg1.field11167 * arg3 >> 14;
            }
            if (arg1.field11279 == 0) {
                arg1.field11244 = arg1.field11198;
            } else if (arg1.field11279 == 1) {
                arg1.field11244 = arg4 - arg1.field11198;
            } else if (arg1.field11279 == 2) {
                arg1.field11244 = arg1.field11198 * arg4 >> 14;
            }
            if (arg1.field11250 == 4) {
                arg1.field11295 = arg1.field11244 * arg1.field11166 / arg1.field11214;
            }
            if (arg1.field11279 == 4) {
                arg1.field11244 = arg1.field11295 * arg1.field11214 / arg1.field11166;
            }
            if (class556.field8095 && (client.method4957(arg1).field1739 != 0 || arg1.field11291 == 0)) {
                if (arg1.field11244 < 5 && arg1.field11295 < 5) {
                    arg1.field11295 = 5;
                    arg1.field11244 = 5;
                } else {
                    if (arg1.field11244 <= 0) {
                        arg1.field11244 = 5;
                    }
                    if (arg1.field11295 <= 0) {
                        arg1.field11295 = 5;
                    }
                }
            }
            if (class189.field2510 == arg1.field11219) {
                class532.field7706 = arg1;
            }
            if (arg2 && arg1.field11176 != null && arg1.field11295 != var5 || arg1.field11244 != var6) {
                class618 var7 = new class618();
                var7.field8812 = arg1.field11176;
                var7.field8805 = arg1;
                class594.field8536.method3984(var7, 0);
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field3435[6] + arg0 + ',' + (arg1 == null ? field3435[2] : field3435[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V", line = 176)
    public static final void method1965(int arg0) {
        try {
            field3421++;
            int var1 = class753.field10768.length;
            for (int var2 = arg0; var2 < var1; var2++) {
                if (class753.field10768[var2] != null) {
                    int var3 = -1;
                    for (int var4 = 0; var4 < class421.field6036; var4++) {
                        if (class136.field1754[var2] == class493.field7244[var4]) {
                            var3 = var4;
                            break;
                        }
                    }
                    if (var3 == -1) {
                        class493.field7244[class421.field6036] = class136.field1754[var2];
                        var3 = class421.field6036++;
                    }
                    class711 var5 = new class711(class753.field10768[var2]);
                    int var6 = 0;
                    while (class753.field10768[var2].length > var5.field9945 && var6 < 511 && class438.field6458 < 1023) {
                        int var7 = var3 | var6++ << 6;
                        int var8 = var5.method5116((byte) -107);
                        int var9 = var8 >> 14;
                        int var10 = var8 >> 7 & 0x3F;
                        int var11 = var8 & 0x3F;
                        int var12 = (class136.field1754[var2] >> 8) * 64 + (var10 - class537.field7895);
                        int var13 = (class136.field1754[var2] & 0xFF) * 64 + var11 - class655.field9286;
                        class134 var14 = class321.field4379.method600(-87, var5.method5116((byte) -120));
                        class527 var15 = (class527) class479.field7063.method3693(false, (long) var7);
                        if (var15 == null && (var14.field1676 & 0x1) > 0 && class475.field6973 == var9 && var12 >= 0 && (var14.field1717 + var12) < class625.field8929 && var13 >= 0 && class14.field187 > var14.field1717 + var13) {
                            class717 var16 = new class717();
                            var16.field2200 = var7;
                            class527 var17 = new class527(var16);
                            class479.field7063.method3691(var17, (long) var7, arg0 - 1);
                            class677.field9494[class715.field10182++] = var17;
                            class343.field4987[class438.field6458++] = var7;
                            var16.field2232 = class694.field9700;
                            var16.method5200(var14, -1);
                            var16.method1445(var16.field10229.field1717, 4978);
                            var16.field2231 = var16.field10229.field1702 << 3;
                            var16.method1436(2, true, (var16.field10229.field1681 + 4 & 0xBD400007) << 11);
                            var16.method5205(var12, var16.method1437((byte) -28), true, -12595, var13, var9);
                        }
                    }
                }
            }
        } catch (RuntimeException var19) {
            throw class665.method4799(var19, field3435[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Ldh;B)V", line = 272)
    public final void method1966(class237 arg0, byte arg1) {
        try {
            int var3 = -85 % ((arg1 + 25) / 54);
            this.field3422 = arg0.field3422;
            this.field3426 = arg0.field3426;
            this.field3434 = arg0.field3434;
            this.field3424 = arg0.field3424;
            field3427++;
            this.field3433 = arg0.field3433;
            this.field3429 = arg0.field3429;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field3435[1] + (arg0 == null ? field3435[2] : field3435[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)Ldh;", line = 290)
    public final class237 method1967(int arg0) {
        try {
            field3425++;
            if (arg0 != -66) {
                method1962(51, -105, 84, -75, null, (byte) 119, -20);
            }
            return new class237(this.field3426, this.field3429, this.field3433, this.field3422, this.field3434, this.field3424);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3435[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dh", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1968(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dh", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1969(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 56;
                    break;
                case 1:
                    var10005 = 32;
                    break;
                case 2:
                    var10005 = 18;
                    break;
                case 3:
                    var10005 = 101;
                    break;
                default:
                    var10005 = 58;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
