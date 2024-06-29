import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class649 extends class578 {

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "I")
    public int field9227;

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
    public int field9222;

    @OriginalMember(owner = "client!sk", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9229 = new String[] { method4732(method4731("\u0004yf#*")), method4732(method4731("\u0004yf\"*")), method4732(method4731("\u0004yf\\k\u0019{<^*")), method4732(method4731("\f<fN\u007f")), method4732(method4731("\u0019g$\f")), method4732(method4731("\u0004yf!*")) };

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "I")
    public static int field9228 = -1;

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "I")
    public static int field9221;

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "I")
    public static int field9223;

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "I")
    public static int field9224;

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "I")
    public static int field9225;

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "I")
    public static int field9226;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)Z", line = 4)
    public static final boolean method4728(int arg0) {
        try {
            if (arg0 > -84) {
                return true;
            }
            field9226++;
            boolean var1 = true;
            if (class36.field446 == null) {
                if (class524.field7640.method530(false, class738.field10504)) {
                    class36.field446 = class66.method701(class524.field7640, class738.field10504);
                } else {
                    var1 = false;
                }
            }
            if (class398.field5796 == null) {
                if (class524.field7640.method530(false, class372.field5448)) {
                    class398.field5796 = class66.method701(class524.field7640, class372.field5448);
                } else {
                    var1 = false;
                }
            }
            if (class583.field8421 == null) {
                if (class524.field7640.method530(false, class757.field10823)) {
                    class583.field8421 = class66.method701(class524.field7640, class757.field10823);
                } else {
                    var1 = false;
                }
            }
            if (class479.field7064 == null) {
                if (class151.field1933.method530(false, class606.field8684)) {
                    class479.field7064 = class692.method4940(class606.field8684, class151.field1933, 3);
                } else {
                    var1 = false;
                }
            }
            if (class331.field4516 == null) {
                if (class524.field7640.method530(false, class606.field8684)) {
                    class331.field4516 = class66.method702(class524.field7640, class606.field8684);
                } else {
                    var1 = false;
                }
            }
            return var1;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9229[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZJBII)Ljava/lang/String;", line = 78)
    public static final String method4729(boolean arg0, long arg1, byte arg2, int arg3, int arg4) {
        try {
            field9224++;
            char var6 = ',';
            char var7 = '.';
            if (arg3 == 0) {
                var6 = '.';
                var7 = ',';
            }
            if (arg3 == 2) {
                var7 = ' ';
            }
            boolean var8 = false;
            if (arg1 < 0L) {
                var8 = true;
                arg1 = -arg1;
            }
            int var9 = 79 % ((arg2 - 12) / 37);
            StringBuffer var10 = new StringBuffer(26);
            if (arg4 > 0) {
                for (int var11 = 0; var11 < arg4; var11++) {
                    int var12 = (int) arg1;
                    arg1 /= 10L;
                    var10.append((char) (var12 + 48 - (int) arg1 * 10));
                }
                var10.append(var6);
            }
            int var13 = 0;
            while (true) {
                int var14 = (int) arg1;
                arg1 /= 10L;
                var10.append((char) (48 - (((int) arg1 * 10) - var14)));
                if (arg1 == 0L) {
                    if (var8) {
                        var10.append('-');
                    }
                    return var10.reverse().toString();
                }
                if (arg0) {
                    var13++;
                    if ((var13 % 3) == 0) {
                        var10.append(var7);
                    }
                }
            }
        } catch (RuntimeException var16) {
            throw class665.method4799(var16, field9229[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILcd;Ljava/lang/String;Lda;Lha;Z)V", line = 162)
    public static final void method4730(int arg0, class161 arg1, String arg2, class216 arg3, class18 arg4, boolean arg5) {
        try {
            field9223++;
            boolean var6 = !class371.field5360 || method4728(arg0 ^ 0xFFFFFF83);
            if (arg0 != 2) {
                field9225 = 92;
            }
            if (var6) {
                if (class371.field5360 && var6) {
                    class161 var23 = class479.field7064;
                    class216 var24 = arg4.method145(var23, class331.field4516, true);
                    int var7 = var23.method1358(250, 93, arg2, null);
                    int var8 = var23.method1359(null, 250, (byte) 116, arg2, var23.field2077);
                    int var9 = class398.field5796.field981;
                    int var10 = var9 + 4;
                    int var11 = var10 * 2 + var8;
                    int var12 = var10 * 2 + var7;
                    if (var12 < class381.field5553) {
                        var12 = class381.field5553;
                    }
                    if (var11 < class57.field808) {
                        var11 = class57.field808;
                    }
                    int var13 = class604.field8660.method2058(var12, class500.field7304, 0) + class216.field3156;
                    int var14 = class293.field4122.method4767(arg0 ^ 0x5BA9, var11, class791.field11507) + class551.field8045;
                    if (class212.field3119) {
                        var13 += class784.method5647((byte) 105);
                        var14 += class30.method328(-17233);
                    }
                    arg4.method231(class583.field8421, false).method1382(class36.field446.field981 + var13, var14 - -class36.field446.field977, var12 - (class36.field446.field981 * 2), -(class36.field446.field977 * 2) + var11, 1, 0, 0);
                    arg4.method231(class36.field446, true).method3074(var13, var14);
                    class36.field446.method695();
                    arg4.method231(class36.field446, true).method3074(var13 + var12 - var9, var14);
                    class36.field446.method691();
                    arg4.method231(class36.field446, true).method3074(var12 + var13 - var9, var11 + var14 + -var9);
                    class36.field446.method695();
                    arg4.method231(class36.field446, true).method3074(var13, var11 + var14 - var9);
                    class36.field446.method691();
                    arg4.method231(class398.field5796, true).method3075(var13, var14 + class36.field446.field977, var9, var11 - (class36.field446.field977 * 2));
                    class398.field5796.method696();
                    arg4.method231(class398.field5796, true).method3075(class36.field446.field981 + var13, var14, var12 - class36.field446.field981 * 2, var9);
                    class398.field5796.method696();
                    arg4.method231(class398.field5796, true).method3075(var13 + var12 - var9, var14 - -class36.field446.field977, var9, var11 - class36.field446.field977 * 2);
                    class398.field5796.method696();
                    arg4.method231(class398.field5796, true).method3075(class36.field446.field981 + var13, var11 + var14 + -var9, var12 - (class36.field446.field981 * 2), var9);
                    class398.field5796.method696();
                    var24.method1815(var10 + var14, class711.field10002 | 0xFF000000, var13 + var10, null, 1, var11 - (var10 * 2), 0, 0, 1, 0, null, arg0 + 123, -1, null, var12 - var10 * 2, arg2);
                    class376.method2982(var11, var12, var13, var14, arg0 ^ 0x253E);
                } else {
                    int var15 = arg1.method1358(250, 97, arg2, null);
                    int var16 = arg1.method1367(250, null, arg2, (byte) -68) * 13;
                    byte var17 = 4;
                    int var18 = var17 + 6;
                    int var19 = var17 + 6;
                    arg4.method237(var18 - var17, var19 - var17, var15 + var17 + var17, var16 + var17 + var17, -16777216, 0);
                    arg4.method212(var18 - var17, -var17 + var19, var15 + var17 + var17, var17 - -var17 + var16, -1, 0);
                    arg3.method1815(var19, -1, var18, null, 1, var16, 0, 0, 1, 0, null, 126, -1, null, var15, arg2);
                    class376.method2982(var16 + var17 + var17, var15 + var17 + var17, var18 - var17, -var17 + var19, 9532);
                }
                if (arg5) {
                    try {
                        if (class212.field3119) {
                            class626.method4598(arg0 ^ 0xC59);
                        } else {
                            arg4.method131((byte) 87);
                        }
                    } catch (class142 var21) {
                    }
                }
            }
        } catch (RuntimeException var22) {
            throw class665.method4799(var22, field9229[5] + arg0 + ',' + (arg1 == null ? field9229[4] : field9229[3]) + ',' + (arg2 == null ? field9229[4] : field9229[3]) + ',' + (arg3 == null ? field9229[4] : field9229[3]) + ',' + (arg4 == null ? field9229[4] : field9229[3]) + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(II)V", line = 257)
    public class649(int arg0, int arg1) {
        try {
            this.field9227 = arg0;
            this.field9222 = arg1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9229[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sk", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4731(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sk", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4732(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 119;
                    break;
                case 1:
                    var10005 = 18;
                    break;
                case 2:
                    var10005 = 72;
                    break;
                case 3:
                    var10005 = 96;
                    break;
                default:
                    var10005 = 2;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
