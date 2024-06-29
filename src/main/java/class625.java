import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class625 {

    @OriginalMember(owner = "client!av", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8932 = new String[] { method4592(method4591("4HYG\n")), method4592(method4591("4HY@\n")), method4592(method4591("4HYF\n")), method4592(method4591("4HYD\n")), method4592(method4591(".\u0010Y+_")), method4592(method4591(";K\u001bi")), method4592(method4591("4HYC\n")) };

    @OriginalMember(owner = "client!av", name = "c", descriptor = "I")
    public static int field8929 = 104;

    @OriginalMember(owner = "client!av", name = "d", descriptor = "I")
    public static int field8926;

    @OriginalMember(owner = "client!av", name = "e", descriptor = "I")
    public static int field8927;

    @OriginalMember(owner = "client!av", name = "f", descriptor = "I")
    public static int field8928;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "I")
    public static int field8930;

    @OriginalMember(owner = "client!av", name = "b", descriptor = "[Lmb;")
    public static class359[] field8931;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(ILjava/lang/String;IZ)V")
    public static final void method4585(int arg0, String arg1, int arg2, boolean arg3) {
        try {
            class73.method762(0);
            field8928++;
            class259.method2156(false);
            class414.method3230((byte) 69);
            class581.method4309(arg2, arg1, arg3, (byte) -115);
            class231.method1920((byte) -57);
            class30.method331(arg0 + 8490, class236.field3418);
            class55.method588(class236.field3418, 5000);
            class286.method2325(arg0 ^ arg0, class524.field7640, class236.field3418);
            class364.method2897(arg0 ^ 0x9);
            class204.method1747(class147.field1892, (byte) -24);
            class591.method4369(arg0 - 10);
            class139.method1214((byte) -123);
            if (class559.field8139 == 3) {
                class699.method5035(4, 31754);
            } else if (class559.field8139 == 7) {
                class699.method5035(8, 31754);
            } else if (class559.field8139 == 9) {
                class699.method5035(10, arg0 + 31744);
            } else if (class559.field8139 == 11) {
                class699.method5035(12, arg0 ^ 0x7C00);
            } else if (class559.field8139 == 1 || class559.field8139 == 2) {
                class173.method1456(-30013);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field8932[6] + arg0 + ',' + (arg1 == null ? field8932[5] : field8932[4]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(B)Ldm;")
    public static final class274 method4586(byte arg0) {
        try {
            field8930++;
            class274 var1 = class551.method4126(0);
            var1.field3882 = 0;
            var1.field3880 = null;
            var1.field3885 = new class476(5000);
            if (arg0 != 74) {
                method4589(null, true);
            }
            return var1;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8932[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(III)Z")
    public static final boolean method4587(int arg0, int arg1, int arg2) {
        try {
            if (arg2 == 11489) {
                field8927++;
                return (arg0 & 0xC580) != 0;
            } else {
                return false;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8932[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IB)V")
    public static final void method4588(int arg0, byte arg1) {
        try {
            field8926++;
            if (arg0 == -31211) {
                if (class247.field3547 == null) {
                    class247.field3547 = new byte[4][field8929][class14.field187];
                }
                for (int var2 = 0; var2 < 4; var2++) {
                    for (int var3 = 0; var3 < field8929; var3++) {
                        for (int var4 = 0; var4 < class14.field187; var4++) {
                            class247.field3547[var2][var3][var4] = arg1;
                        }
                    }
                }
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field8932[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Llaa;Z)V")
    public static final void method4589(class604 arg0, boolean arg1) {
        for (int var2 = arg0.field8663; var2 <= arg0.field8666; var2++) {
            for (int var3 = arg0.field8669; var3 <= arg0.field8661; var3++) {
                class621 var4 = class608.field8715[arg0.field2981][var2][var3];
                if (var4 != null) {
                    class219 var5 = var4.field8841;
                    class219 var6 = null;
                    while (var5 != null) {
                        if (var5.field3188 == arg0) {
                            if (var6 == null) {
                                var4.field8841 = var5.field3190;
                            } else {
                                var6.field3190 = var5.field3190;
                            }
                            var5.method1849(8744);
                            break;
                        }
                        var6 = var5;
                        var5 = var5.field3190;
                    }
                }
            }
        }
        if (!arg1) {
            class478.method3703(arg0);
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(I)V")
    public static void method4590(int arg0) {
        try {
            if (arg0 < 119) {
                field8931 = null;
            }
            field8931 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8932[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!av", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4591(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x22);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!av", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4592(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 85;
                    break;
                case 1:
                    var10005 = 62;
                    break;
                case 2:
                    var10005 = 119;
                    break;
                case 3:
                    var10005 = 5;
                    break;
                default:
                    var10005 = 34;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
