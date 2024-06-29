import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class class780 extends class129 {

    @OriginalMember(owner = "client!hda", name = "p", descriptor = "Z")
    private boolean field11355 = false;

    @OriginalMember(owner = "client!hda", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11362 = new String[] { method5642(method5641("O+Op")), method5642(method5641("Zp\r2s")), method5642(method5641("I:B2D\t")), method5642(method5641("I:B2F\t")), method5642(method5641("I:B2H\t")), method5642(method5641("I:B2O\t")), method5642(method5641("I:B2J\t")), method5642(method5641("I:B2G\t")), method5642(method5641("I:B2I\t")), method5642(method5641("I:B2M\t")) };

    @OriginalMember(owner = "client!hda", name = "v", descriptor = "I")
    public static int field11353;

    @OriginalMember(owner = "client!hda", name = "r", descriptor = "I")
    public static int field11354;

    @OriginalMember(owner = "client!hda", name = "o", descriptor = "I")
    public static int field11356;

    @OriginalMember(owner = "client!hda", name = "t", descriptor = "I")
    public static int field11357;

    @OriginalMember(owner = "client!hda", name = "n", descriptor = "I")
    public static int field11358;

    @OriginalMember(owner = "client!hda", name = "u", descriptor = "I")
    public static int field11359;

    @OriginalMember(owner = "client!hda", name = "s", descriptor = "I")
    public static int field11360;

    @OriginalMember(owner = "client!hda", name = "q", descriptor = "I")
    public static int field11361;

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lib;I)Lgca;")
    public static final class263 method5639(class163 arg0, int arg1) {
        try {
            if (arg1 != -18246) {
                method5640((class541) null, (byte) -23);
            }
            ++field11354;
            class263 var2 = new class263();
            var2.field4041 = arg0.method1445((byte) 115);
            var2.field4040 = class690.field10023.method4954(var2.field4041, 82);
            return var2;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field11362[2] + (arg0 != null ? field11362[1] : field11362[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lcn;B)V")
    public static final void method5640(class541 arg0, byte arg1) {
        try {
            if (arg1 >= 3) {
                ++field11359;
                if (~class48.field551 == ~arg0.field8002) {
                    if (class225.field3446.field10506 == null) {
                        arg0.field7981 = 0;
                        arg0.field7979 = 0;
                    } else {
                        arg0.field8076 = 150;
                        arg0.field8043 = 2047 & (int) (Math.sin((double) class375.field5711 / 40.0D) * 256.0D);
                        arg0.field8012 = 5;
                        arg0.field7979 = class722.field10458;
                        arg0.field7981 = class439.method3376(class225.field3446.field10506, 0);
                        arg0.field8010 = class225.field3446.field3847;
                        arg0.field8057 = class225.field3446.field3796;
                        arg0.field7944 = class225.field3446.field3762;
                        arg0.field7951 = 0;
                        class344 var2 = ~arg0.field8057 != 0 ? class272.field4122.method2242(arg0.field8057, 100) : null;
                        if (var2 != null) {
                            class570.method4261(arg0.field7944, (byte) 121, var2);
                        }
                    }
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field11362[5] + (arg0 != null ? field11362[1] : field11362[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(I)V")
    public final void method783(int arg0) {
        try {
            ++field11360;
            if (this.field11355) {
                super.field1509.method2453(1, 13);
                super.field1509.method897(class194.field2608, 0);
                super.field1509.method2417(-124, class684.field9909, class684.field9909);
                super.field1509.method2498(2, class114.field1352, (byte) -83);
                super.field1509.method2443(0, class48.field546, false);
                super.field1509.method2489(0);
                super.field1509.method2467(12, (class479) null);
                super.field1509.method2453(0, 13);
                this.field11355 = false;
            } else {
                super.field1509.method2443(0, class48.field546, false);
            }
            if (arg0 != 1) {
                this.field11355 = true;
            }
            super.field1509.method2417(arg0 + -79, class684.field9909, class684.field9909);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field11362[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(ZB)V")
    public final void method784(boolean arg0, byte arg1) {
        try {
            ++field11358;
            if (arg1 != -34) {
                method5640((class541) null, (byte) -75);
            }
            super.field1509.method2417(-74, class206.field3175, class684.field9909);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field11362[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(Lkd;)V")
    public class780(class296 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(ZI)V")
    public final void method781(boolean arg0, int arg1) {
        try {
            if (arg1 != 1) {
                this.field11355 = true;
            }
            ++field11356;
            class380 var3 = super.field1509.method2465(true);
            if (var3 != null && arg0) {
                super.field1509.method2453(1, 13);
                super.field1509.method2467(arg1 ^ 13, var3);
                super.field1509.method897(class571.field8447, 0);
                super.field1509.method2453(1, 13);
                super.field1509.method2417(-83, class206.field3175, class134.field1562);
                super.field1509.method889(false, 2, true, 114, class185.field2557);
                super.field1509.method2443(0, class335.field5233, false);
                class770 var4 = super.field1509.method2479(arg1 + -2);
                var4.method5557(arg1, super.field1509.method2466((byte) 87));
                super.field1509.method2474(arg1 + 1, class735.field10700);
                super.field1509.method2453(0, arg1 + 12);
                this.field11355 = true;
            } else {
                super.field1509.method2443(0, class335.field5233, false);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field11362[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(Z)Z")
    public final boolean method790(boolean arg0) {
        try {
            if (arg0) {
                this.field11355 = true;
            }
            ++field11357;
            return true;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field11362[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(IIB)V")
    public final void method786(int arg0, int arg1, byte arg2) {
        try {
            ++field11361;
            int var4 = -128 % ((21 - arg2) / 56);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field11362[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(IILrca;)V")
    public final void method788(int arg0, int arg1, class479 arg2) {
        try {
            ++field11353;
            super.field1509.method2467(12, arg2);
            super.field1509.method2433(-16075, arg0);
            if (arg1 >= -3) {
                this.field11355 = true;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field11362[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11362[1] : field11362[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!hda", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5641(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 14);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hda", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5642(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 33;
                    break;
                case 1:
                    var10005 = 94;
                    break;
                case 2:
                    var10005 = 35;
                    break;
                case 3:
                    var10005 = 28;
                    break;
                default:
                    var10005 = 14;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
