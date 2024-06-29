import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public class class663 extends class657 {

    @OriginalMember(owner = "client!tda", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9585 = new String[] { method4866(method4865("3\u001d")), method4866(method4865(":\u0018\u000f\u001c")), method4866(method4865("/CM^u")), method4866(method4865(">\f\u0015\u0011&5\u001a\u0017^K;\u0000\u0013\u001ff1\u0003\u0017")), method4866(method4865(" \t\u0002^B|")), method4866(method4865(" \t\u0002^N|")), method4866(method4865(" \t\u0002^I|")), method4866(method4865(" \t\u0002^M|")), method4866(method4865(" \t\u0002^O|")), method4866(method4865(" \t\u0002^L|")), method4866(method4865(" \t\u0002^A|")), method4866(method4865(" \t\u0002^@|")), method4866(method4865(" \t\u0002^K|")), method4866(method4865(" \t\u0002^J|")) };

    @OriginalMember(owner = "client!tda", name = "n", descriptor = "I")
    public static int field9573;

    @OriginalMember(owner = "client!tda", name = "o", descriptor = "I")
    public static int field9574;

    @OriginalMember(owner = "client!tda", name = "u", descriptor = "I")
    public static int field9575;

    @OriginalMember(owner = "client!tda", name = "q", descriptor = "I")
    public static int field9577;

    @OriginalMember(owner = "client!tda", name = "j", descriptor = "I")
    public static int field9578;

    @OriginalMember(owner = "client!tda", name = "s", descriptor = "I")
    public static int field9579;

    @OriginalMember(owner = "client!tda", name = "m", descriptor = "I")
    public static int field9580;

    @OriginalMember(owner = "client!tda", name = "r", descriptor = "I")
    public static int field9582;

    @OriginalMember(owner = "client!tda", name = "l", descriptor = "I")
    public static int field9583;

    @OriginalMember(owner = "client!tda", name = "p", descriptor = "Lib;")
    public static class163 field9576;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tda", name = "t", descriptor = "Ljava/lang/Class;")
    public static Class field9584;

    @OriginalMember(owner = "client!tda", name = "k", descriptor = "Ljava/lang/Thread;")
    public static Thread field9581;

    // $FF: synthetic method
    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method4864(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(IZLjava/awt/Component;)Lej;", line = 3)
    public static final class134 method4860(int arg0, boolean arg1, Component arg2) {
        try {
            ++field9575;
            try {
                Constructor var3 = Class.forName(field9585[0]).getDeclaredConstructor(field9584 != null ? field9584 : (field9584 = method4864(field9585[3])), Boolean.TYPE);
                return (class134) var3.newInstance(arg2, new Boolean(arg1));
            } catch (Throwable var5) {
                return arg0 != 10 ? null : new class745(arg2, arg1);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field9585[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9585[2] : field9585[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!tda", name = "<init>", descriptor = "(Lffa;)V", line = 20)
    public class663(class197 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(Ljava/lang/String;IIII)V", line = 23)
    public static final void method4861(String arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            ++field9583;
            class541 var5 = class211.method1854(arg1, arg2, false);
            if (var5 != null) {
                if (var5.field8095 != null) {
                    class86 var6 = new class86();
                    var6.field965 = arg3;
                    var6.field957 = var5.field8095;
                    var6.field959 = var5;
                    var6.field967 = arg0;
                    class782.method5663(var6);
                }
                if (class138.field1645 == 10) {
                    if (arg4 != 9) {
                        method4861((String) null, 72, -101, 98, 28);
                    }
                    if (client.method2670(var5).method3558(true, arg3 + -1)) {
                        if (~arg3 == -2) {
                            ++class305.field4760;
                            class280 var7 = class610.method4508(class91.field1040, class279.field4190, (byte) 13);
                            class298.method2515(arg1, var7, arg2, var5.field8100, (byte) -20);
                            class106.method934((byte) 53, var7);
                        }
                        if (~arg3 == -3) {
                            ++class432.field6348;
                            class280 var8 = class610.method4508(class216.field3293, class279.field4190, (byte) -94);
                            class298.method2515(arg1, var8, arg2, var5.field8100, (byte) -67);
                            class106.method934((byte) 53, var8);
                        }
                        if (arg3 == 3) {
                            ++class675.field9787;
                            class280 var9 = class610.method4508(class319.field5051, class279.field4190, (byte) -89);
                            class298.method2515(arg1, var9, arg2, var5.field8100, (byte) -6);
                            class106.method934((byte) 53, var9);
                        }
                        if (arg3 == 4) {
                            ++class640.field9292;
                            class280 var10 = class610.method4508(class153.field1883, class279.field4190, (byte) -93);
                            class298.method2515(arg1, var10, arg2, var5.field8100, (byte) 121);
                            class106.method934((byte) 53, var10);
                        }
                        if (~arg3 == -6) {
                            ++class377.field5753;
                            class280 var11 = class610.method4508(class426.field6281, class279.field4190, (byte) -95);
                            class298.method2515(arg1, var11, arg2, var5.field8100, (byte) -84);
                            class106.method934((byte) 53, var11);
                        }
                        if (~arg3 == -7) {
                            ++class461.field6728;
                            class280 var12 = class610.method4508(class327.field5156, class279.field4190, (byte) 20);
                            class298.method2515(arg1, var12, arg2, var5.field8100, (byte) -22);
                            class106.method934((byte) 53, var12);
                        }
                        if (arg3 == 7) {
                            ++class646.field9359;
                            class280 var13 = class610.method4508(class560.field8339, class279.field4190, (byte) 109);
                            class298.method2515(arg1, var13, arg2, var5.field8100, (byte) -85);
                            class106.method934((byte) 53, var13);
                        }
                        if (~arg3 == -9) {
                            ++class149.field1831;
                            class280 var14 = class610.method4508(class778.field11308, class279.field4190, (byte) -117);
                            class298.method2515(arg1, var14, arg2, var5.field8100, (byte) 125);
                            class106.method934((byte) 53, var14);
                        }
                        if (arg3 == 9) {
                            ++class680.field9850;
                            class280 var15 = class610.method4508(class499.field7231, class279.field4190, (byte) -113);
                            class298.method2515(arg1, var15, arg2, var5.field8100, (byte) -45);
                            class106.method934((byte) 53, var15);
                        }
                        if (arg3 == 10) {
                            ++class112.field1299;
                            class280 var16 = class610.method4508(class639.field9285, class279.field4190, (byte) 69);
                            class298.method2515(arg1, var16, arg2, var5.field8100, (byte) 122);
                            class106.method934((byte) 53, var16);
                        }
                    }
                }
            }
        } catch (RuntimeException var18) {
            throw class759.method5498(var18, field9585[11] + (arg0 != null ? field9585[2] : field9585[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(I)Z", line = 154)
    public final boolean method8(int arg0) {
        try {
            ++field9577;
            int var2 = 65 / ((arg0 - -17) / 42);
            return true;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9585[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "(I)V", line = 167)
    public final void method1(int arg0) {
        try {
            super.field9490.method1749((byte) 33, false);
            if (arg0 != 0) {
                field9581 = null;
            }
            ++field9580;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9585[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(ZI)V", line = 179)
    public final void method3(boolean arg0, int arg1) {
        try {
            ++field9582;
            super.field9490.method1749((byte) 33, true);
            if (arg1 != 1) {
                this.method8(-101);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9585[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(BZ)V", line = 190)
    public final void method6(byte arg0, boolean arg1) {
        try {
            if (arg0 != 38) {
                field9576 = null;
            }
            ++field9578;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9585[12] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(IIIIIIB)V", line = 203)
    public static final void method4862(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        try {
            class114.field1357 = arg3;
            class209.field3209 = arg4;
            class575.field8501 = arg2;
            ++field9574;
            class178.field2486 = arg5;
            class277.field4175 = arg0;
            int var7 = 86 % ((-77 - arg6) / 45);
            class260.field4006 = arg1;
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field9585[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(IBLmw;)V", line = 218)
    public final void method4(int arg0, byte arg1, class517 arg2) {
        try {
            super.field9490.method1733(arg2, 17237);
            ++field9579;
            super.field9490.method1753(0, arg0);
            if (arg1 < 117) {
                field9576 = null;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field9585[13] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9585[2] : field9585[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(IIZ)V", line = 233)
    public final void method7(int arg0, int arg1, boolean arg2) {
        try {
            ++field9573;
            if (!arg2) {
                this.method4(16, (byte) -18, (class517) null);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field9585[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "(B)V", line = 243)
    public static void method4863(byte arg0) {
        try {
            if (arg0 == -25) {
                field9576 = null;
                field9581 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9585[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tda", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4865(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 8);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tda", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4866(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 84;
                    break;
                case 1:
                    var10005 = 109;
                    break;
                case 2:
                    var10005 = 99;
                    break;
                case 3:
                    var10005 = 112;
                    break;
                default:
                    var10005 = 8;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
