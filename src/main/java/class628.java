import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class628 {

    @OriginalMember(owner = "client!dl", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8957 = new String[] { method4613(method4612("j4+u@")), method4613(method4612("uv+\u0019\u0015")), method4613(method4612("^9pD\u0001`?%Q\u0007|x")), method4613(method4612("j4+t@")), method4613(method4612("~9pD\r")), method4613(method4612("`-i[")), method4613(method4612(".+`T\u0007`<v\u0019F ")), method4613(method4612("j4+s@")), method4613(method4612("j4+v@")) };

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "Ltf;")
    public static class524 field8955 = new class524();

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public static int field8952;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public static int field8953;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public static int field8954;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "Lht;")
    public static class792 field8956;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(III)V", line = 3)
    public static final void method4608(int arg0, int arg1, int arg2) {
        try {
            field8954++;
            if (arg2 != 14918) {
                field8955 = null;
            }
            if (class350.field5075 == 1) {
                class10.method67(class209.field3044, arg0, arg1, arg2 ^ 0xFFFFB3EA);
            } else if (class350.field5075 == 2) {
                if (class212.field3119) {
                    class85.method853((byte) -100, arg1 + class784.method5647((byte) 105), arg0 - -class30.method328(-17233));
                } else {
                    class85.method853((byte) -112, arg1, arg0);
                }
            }
            class209.field3044 = null;
            class350.field5075 = 0;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8957[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V", line = 29)
    public static void method4609(byte arg0) {
        try {
            field8956 = null;
            field8955 = null;
            if (arg0 != 0) {
                method4611(-127);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8957[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "([Ljava/lang/String;Z)V", line = 40)
    public static final void method4610(String[] arg0, boolean arg1) {
        try {
            if (!arg1) {
                field8955 = null;
            }
            field8952++;
            if (arg0.length <= 1) {
                class273.field3877 = class273.field3877 + arg0[0];
                class26.field326 += arg0[0].length();
            } else {
                for (int var2 = 0; var2 < arg0.length; var2++) {
                    if (arg0[var2].startsWith(field8957[4])) {
                        int var3 = 5;
                        try {
                            var3 = Integer.parseInt(arg0[var2].substring(6));
                        } catch (Exception var5) {
                        }
                        class11.method74(field8957[2] + var3 + field8957[6], (byte) 106);
                        class355.field5167 = arg0;
                        class27.field345 = var2 + 1;
                        class503.field7352 = class614.method4531(-68) + (long) (var3 * 1000);
                        return;
                    }
                    class273.field3877 = arg0[var2];
                    class250.method2031(5, false);
                }
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field8957[3] + (arg0 == null ? field8957[5] : field8957[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)Z", line = 92)
    public static final boolean method4611(int arg0) {
        try {
            field8953++;
            if (class385.field5631 == 0) {
                if (arg0 <= 46) {
                    field8955 = null;
                }
                return class786.field11354.method3326((byte) 125);
            } else {
                return true;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8957[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dl", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4612(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x68);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dl", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4613(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 14;
                    break;
                case 1:
                    var10005 = 88;
                    break;
                case 2:
                    var10005 = 5;
                    break;
                case 3:
                    var10005 = 55;
                    break;
                default:
                    var10005 = 104;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
