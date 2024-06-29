import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class292 extends class578 {

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "S")
    public short field4113;

    @OriginalMember(owner = "client!uj", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4117 = new String[] { method2366(method2365("ak\u007f\u00171zh%\u0015p")), method2366(method2365("ak\u007fjp")), method2366(method2365("ak\u007fip")), method2366(method2365("zt=G")), method2366(method2365("o/\u007f\u0005%")), method2366(method2365("|d")) };

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "F")
    public static float field4112 = 0.0F;

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "I")
    public static int field4116 = 0;

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "[[Z")
    public static boolean[][] field4115 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lft;Ljava/awt/Component;BII)Lwm;", line = 4)
    public static final class440 method2363(class188 arg0, Component arg1, byte arg2, int arg3, int arg4) {
        try {
            field4114++;
            if (class215.field3148 == 0) {
                throw new IllegalStateException();
            } else if (arg4 >= 0 && arg4 < 2) {
                if (arg3 < 256) {
                    arg3 = 256;
                }
                try {
                    class440 var5 = (class440) Class.forName(field4117[5]).getDeclaredConstructor().newInstance();
                    var5.field6476 = new int[(class375.field5471 ? 2 : 1) * 256];
                    var5.field6499 = arg3;
                    var5.method1466(arg1);
                    var5.field6501 = (arg3 & 0xFFFFFC00) + 1024;
                    if (var5.field6501 > 16384) {
                        var5.field6501 = 16384;
                    }
                    var5.method1461(var5.field6501);
                    if (class355.field5149 > 0 && class553.field8067 == null) {
                        class553.field8067 = new class329();
                        class553.field8067.field4493 = arg0;
                        arg0.method1572(class553.field8067, (byte) -121, class355.field5149);
                    }
                    if (class553.field8067 != null) {
                        if (class553.field8067.field4497[arg4] != null) {
                            throw new IllegalArgumentException();
                        }
                        class553.field8067.field4497[arg4] = var5;
                    }
                    if (arg2 <= 72) {
                        method2363(null, null, (byte) 18, -118, 73);
                    }
                    return var5;
                } catch (Throwable var9) {
                    try {
                        class454 var6 = new class454(arg0, arg4);
                        var6.field6499 = arg3;
                        var6.field6476 = new int[(class375.field5471 ? 2 : 1) * 256];
                        var6.method1466(arg1);
                        var6.field6501 = 16384;
                        var6.method1461(var6.field6501);
                        if (class355.field5149 > 0 && class553.field8067 == null) {
                            class553.field8067 = new class329();
                            class553.field8067.field4493 = arg0;
                            arg0.method1572(class553.field8067, (byte) -71, class355.field5149);
                        }
                        if (class553.field8067 != null) {
                            if (class553.field8067.field4497[arg4] != null) {
                                throw new IllegalArgumentException();
                            }
                            class553.field8067.field4497[arg4] = var6;
                        }
                        return var6;
                    } catch (Throwable var8) {
                        return new class440();
                    }
                }
            } else {
                throw new IllegalArgumentException();
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field4117[2] + (arg0 == null ? field4117[3] : field4117[4]) + ',' + (arg1 == null ? field4117[3] : field4117[4]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V", line = 92)
    public class292() {
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(S)V", line = 94)
    public class292(short arg0) {
        try {
            this.field4113 = arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4117[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V", line = 103)
    public static void method2364(byte arg0) {
        try {
            if (arg0 >= 2) {
                field4115 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4117[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2365(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x58);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!uj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2366(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 20;
                    break;
                case 1:
                    var10005 = 1;
                    break;
                case 2:
                    var10005 = 81;
                    break;
                case 3:
                    var10005 = 43;
                    break;
                default:
                    var10005 = 88;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
