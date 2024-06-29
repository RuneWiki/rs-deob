import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class214 {

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "Lwc;")
    public class71 field3374 = new class71();

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "Z")
    public boolean field3375 = false;

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3377 = new String[] { method1928(method1927("vc\u0016D'")), method1928(method1927("vc\u00169fkkL;'")), method1928(method1927("kwTi")), method1928(method1927("vc\u0016G'")), method1928(method1927("~,\u0016+r")), method1928(method1927("vc\u0016A'")), method1928(method1927("vc\u0016F'")) };

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "Llia;")
    public static class505 field3370;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V", line = 6)
    public final void method1923(int arg0) {
        try {
            if (arg0 == 0) {
                field3372++;
                while (true) {
                    class281 var2 = (class281) this.field3374.method744(arg0 ^ 0x20);
                    if (var2 == null) {
                        return;
                    }
                    var2.method1715(-20685);
                    class234.method2033(var2, (byte) 28);
                }
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3377[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V", line = 27)
    public static void method1924(byte arg0) {
        try {
            if (arg0 <= -31) {
                field3370 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3377[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Z)V", line = 69)
    public class214(boolean arg0) {
        try {
            this.field3375 = arg0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3377[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V", line = 43)
    public static final void method1925(int arg0) {
        try {
            if (arg0 != 2) {
                method1925(21);
            }
            if (class201.field3184 > 1) {
                class623.field8996.method3244(22733, class623.field8996.field6359, 4);
            } else {
                class623.field8996.method3244(22733, class623.field8996.field6359, 2);
            }
            field3376++;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3377[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLkv;)V", line = 77)
    public final void method1926(byte arg0, class281 arg1) {
        try {
            field3371++;
            class693 var3 = arg1.field4577;
            boolean var4 = true;
            class463[] var5 = arg1.field4578;
            for (int var6 = 0; var6 < var5.length; var6++) {
                if (var5[var6].field7120) {
                    var4 = false;
                    break;
                }
            }
            if (arg0 > -46) {
                field3373 = -127;
            }
            if (!var4) {
                if (this.field3375) {
                    for (class281 var7 = (class281) this.field3374.method749(0); var7 != null; var7 = (class281) this.field3374.method747((byte) 21)) {
                        if (var7.field4577 == var3) {
                            var7.method1715(-20685);
                            class234.method2033(var7, (byte) 28);
                        }
                    }
                }
                for (class281 var8 = (class281) this.field3374.method749(0); var8 != null; var8 = (class281) this.field3374.method747((byte) 21)) {
                    if (var3.field9973 >= var8.field4577.field9973) {
                        class558.method4113((byte) 29, var8, arg1);
                        return;
                    }
                }
                this.field3374.method748(59, arg1);
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field3377[3] + arg0 + ',' + (arg1 == null ? field3377[2] : field3377[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1927(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xF);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1928(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 5;
                    break;
                case 1:
                    var10005 = 2;
                    break;
                case 2:
                    var10005 = 56;
                    break;
                case 3:
                    var10005 = 5;
                    break;
                default:
                    var10005 = 15;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
