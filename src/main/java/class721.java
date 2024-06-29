import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public class class721 extends class160 {

    @OriginalMember(owner = "client!rea", name = "h", descriptor = "I")
    private int field10266;

    @OriginalMember(owner = "client!rea", name = "l", descriptor = "I")
    private int field10258;

    @OriginalMember(owner = "client!rea", name = "s", descriptor = "I")
    private int field10260;

    @OriginalMember(owner = "client!rea", name = "i", descriptor = "I")
    private int field10259;

    @OriginalMember(owner = "client!rea", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10273 = new String[] { method5223(method5222("ggqY")), method5223(method5222("r<3\u001b\\")), method5223(method5222("{w|\u001bi!")), method5223(method5222("{w|\u001bb!")), method5223(method5222("{w|\u001bh!")), method5223(method5222("{w|\u001bg!")), method5223(method5222("{w|\u001b\u001d`|tA\u001f!")), method5223(method5222("{w|\u001bc!")), method5223(method5222("{w|\u001bf!")), method5223(method5222("{w|\u001be!")) };

    @OriginalMember(owner = "client!rea", name = "n", descriptor = "Lui;")
    public static class251 field10264 = new class251(30);

    @OriginalMember(owner = "client!rea", name = "m", descriptor = "Ltf;")
    public static class524 field10269 = new class524();

    @OriginalMember(owner = "client!rea", name = "k", descriptor = "Z")
    public static boolean field10272 = true;

    @OriginalMember(owner = "client!rea", name = "v", descriptor = "I")
    public static int field10261;

    @OriginalMember(owner = "client!rea", name = "o", descriptor = "I")
    public static int field10262;

    @OriginalMember(owner = "client!rea", name = "q", descriptor = "I")
    public static int field10263;

    @OriginalMember(owner = "client!rea", name = "t", descriptor = "I")
    public static int field10265;

    @OriginalMember(owner = "client!rea", name = "u", descriptor = "I")
    public static int field10267;

    @OriginalMember(owner = "client!rea", name = "r", descriptor = "I")
    public static int field10270;

    @OriginalMember(owner = "client!rea", name = "j", descriptor = "Z")
    public static boolean field10271;

    @OriginalMember(owner = "client!rea", name = "p", descriptor = "[Ltb;")
    public static class392[] field10268;

    @OriginalMember(owner = "client!rea", name = "c", descriptor = "(III)V")
    public static final void method5217(int arg0, int arg1, int arg2) {
        try {
            ++field10261;
            class573.field8301 = -class534.field7745 + arg1;
            class801.field11652 = arg2 - class534.field7751;
            int var3 = -46 / ((23 - arg0) / 49);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field10273[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "(III)V")
    public final void method1350(int arg0, int arg1, int arg2) {
        try {
            ++field10263;
            int var4 = this.field10258 * arg0 >> 12;
            int var5 = this.field10259 * arg0 >> 12;
            int var6 = this.field10260 * arg2 >> 12;
            int var7 = this.field10266 * arg2 >> 12;
            if (arg1 != 5781) {
                this.field10258 = -30;
            }
            class127.method1129((byte) 15, super.field2050, var7, var5, var6, var4);
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field10273[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(Z)V")
    public static void method5218(boolean arg0) {
        try {
            field10268 = null;
            field10269 = null;
            field10264 = null;
            if (!arg0) {
                method5221(107, 55, -114, -69, 98, 53);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10273[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "()V")
    public static final void method5219() {
        class274.method2243(1, class293.field4121);
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(Leea;B)I")
    public static final int method5220(class476 arg0, byte arg1) {
        try {
            ++field10265;
            int var2 = arg0.method3677(-49, 2);
            int var3;
            if (~var2 == -1) {
                var3 = 0;
            } else if (~var2 == -2) {
                var3 = arg0.method3677(-81, 5);
            } else if (var2 == 2) {
                var3 = arg0.method3677(-82, 8);
            } else {
                var3 = arg0.method3677(-70, 11);
            }
            if (arg1 >= -114) {
                method5219();
            }
            return var3;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field10273[2] + (arg0 != null ? field10273[1] : field10273[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(III)V")
    public final void method1349(int arg0, int arg1, int arg2) {
        try {
            if (arg0 != 3289650) {
                field10268 = null;
            }
            ++field10267;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field10273[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!rea", name = "<init>", descriptor = "(IIIIIII)V")
    public class721(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        try {
            this.field10266 = arg3;
            this.field10258 = arg0;
            this.field10260 = arg1;
            this.field10259 = arg2;
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field10273[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(IIB)V")
    public final void method1348(int arg0, int arg1, byte arg2) {
        try {
            ++field10270;
            int var4 = this.field10258 * arg0 >> 12;
            int var5 = this.field10259 * arg0 >> 12;
            int var6 = this.field10260 * arg1 >> 12;
            if (arg2 <= 13) {
                this.field10259 = 96;
            }
            int var7 = this.field10266 * arg1 >> 12;
            class436.method3401(0, var6, var4, super.field2049, super.field2051, var5, super.field2050, var7);
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field10273[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(IIIIII)V")
    public static final void method5221(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            if (arg4 == 1531087756) {
                ++field10262;
                int var6 = -arg1 + arg2;
                int var7 = -arg3 + arg5;
                if (~var6 != -1) {
                    if (~var7 == -1) {
                        client.method4964(arg4 ^ -1531087841, arg0, arg2, arg3, arg1);
                    } else {
                        int var8 = (var7 << 12) / var6;
                        int var9 = -(arg1 * var8 >> 12) + arg3;
                        int var10;
                        int var11;
                        if (arg2 < class335.field4844) {
                            var10 = class335.field4844;
                            var11 = var9 - -(class335.field4844 * var8 >> 12);
                        } else if (arg2 <= class507.field7453) {
                            var11 = arg5;
                            var10 = arg2;
                        } else {
                            var10 = class507.field7453;
                            var11 = var9 - -(class507.field7453 * var8 >> 12);
                        }
                        int var12;
                        int var13;
                        if (~arg1 > ~class335.field4844) {
                            var12 = class335.field4844;
                            var13 = (class335.field4844 * var8 >> 12) + var9;
                        } else if (class507.field7453 >= arg1) {
                            var13 = arg3;
                            var12 = arg1;
                        } else {
                            var12 = class507.field7453;
                            var13 = var9 - -(class507.field7453 * var8 >> 12);
                        }
                        if (var11 < class557.field8113) {
                            var11 = class557.field8113;
                            var10 = (class557.field8113 - var9 << 12) / var8;
                        } else if (~class50.field717 > ~var11) {
                            var11 = class50.field717;
                            var10 = (-var9 + class50.field717 << 12) / var8;
                        }
                        if (var13 < class557.field8113) {
                            var13 = class557.field8113;
                            var12 = (-var9 + class557.field8113 << 12) / var8;
                        } else if (~class50.field717 > ~var13) {
                            var12 = (class50.field717 - var9 << 12) / var8;
                            var13 = class50.field717;
                        }
                        class127.method1128(var11, -1, var12, var13, var10, arg0);
                    }
                } else {
                    if (~var7 != -1) {
                        class191.method1597(arg5, arg1, arg3, (byte) 58, arg0);
                    }
                }
            }
        } catch (RuntimeException var15) {
            throw class665.method4799(var15, field10273[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!rea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5222(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 33);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5223(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 9;
                    break;
                case 1:
                    var10005 = 18;
                    break;
                case 2:
                    var10005 = 29;
                    break;
                case 3:
                    var10005 = 53;
                    break;
                default:
                    var10005 = 33;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
