import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sia")
public class class765 extends class129 {

    @OriginalMember(owner = "client!sia", name = "r", descriptor = "F")
    private float field11060 = 0.0F;

    @OriginalMember(owner = "client!sia", name = "x", descriptor = "Lcda;")
    private class182 field11063;

    @OriginalMember(owner = "client!sia", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11069 = new String[] { method5532(method5531("4\u0002WV\u001eo")), method5532(method5531("4\u0002WV\u0014o")), method5532(method5531("4\u0002WV\u001bo")), method5532(method5531("<E\u0018V ")), method5532(method5531(")\u001eZ\u0014")), method5532(method5531("4\u0002WVa.\u0005_\fco")), method5532(method5531("4\u0002WV\u0015o")), method5532(method5531("4\u0002WV\u0019o")), method5532(method5531("4\u0002WV\u0011o")), method5532(method5531("4\u0002WV\u001ao")) };

    @OriginalMember(owner = "client!sia", name = "u", descriptor = "Z")
    public static boolean field11059 = false;

    @OriginalMember(owner = "client!sia", name = "t", descriptor = "I")
    public static int field11064 = 999999;

    @OriginalMember(owner = "client!sia", name = "n", descriptor = "I")
    public static int field11058;

    @OriginalMember(owner = "client!sia", name = "w", descriptor = "I")
    public static int field11061;

    @OriginalMember(owner = "client!sia", name = "v", descriptor = "I")
    public static int field11062;

    @OriginalMember(owner = "client!sia", name = "o", descriptor = "I")
    public static int field11065;

    @OriginalMember(owner = "client!sia", name = "p", descriptor = "I")
    public static int field11066;

    @OriginalMember(owner = "client!sia", name = "q", descriptor = "I")
    public static int field11067;

    @OriginalMember(owner = "client!sia", name = "s", descriptor = "I")
    public static int field11068;

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(IIB)V")
    public final void method786(int arg0, int arg1, byte arg2) {
        try {
            int var4 = -87 / ((21 - arg2) / 56);
            super.field1509.method2453(1, 13);
            ++field11058;
            if (~(128 & arg1) == -1) {
                if (~(arg0 & 1) != -2) {
                    if (this.field11063.field2518) {
                        super.field1509.method2467(12, this.field11063.field2516);
                    } else {
                        super.field1509.method2467(12, this.field11063.field2520[0]);
                    }
                } else if (!this.field11063.field2518) {
                    int var5 = super.field1509.field4603 % 4000 * 16 / 4000;
                    super.field1509.method2467(12, this.field11063.field2520[var5]);
                } else {
                    this.field11060 = (float) (super.field1509.field4603 % 4000) / 4000.0F;
                    super.field1509.method2467(12, this.field11063.field2516);
                }
            } else {
                super.field1509.method2467(12, (class479) null);
            }
            super.field1509.method2453(0, 13);
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field11069[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(B)V")
    public final void method789(byte arg0) {
        try {
            ++field11062;
            if (super.field1509.method2435((byte) -121) == 0) {
                class770 var2 = super.field1509.method2431((byte) 55);
                super.field1509.method2453(1, 13);
                class770 var3 = super.field1509.method2479(-1);
                var3.method2377(var2);
                var3.method5575((byte) -83, 0.125F, 1.0F, 0.125F);
                var3.method5570(0.0F, this.field11060, 0.0F, 64);
                super.field1509.method2474(2, class735.field10700);
                super.field1509.method2453(0, 13);
            }
            if (arg0 <= 22) {
                field11064 = -67;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field11069[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(ZI)V")
    public final void method781(boolean arg0, int arg1) {
        try {
            ++field11066;
            super.field1509.method2453(arg1, 13);
            super.field1509.method2417(-126, class206.field3175, class362.field5530);
            super.field1509.method889(false, 0, true, 101, class48.field546);
            super.field1509.method2443(0, class185.field2557, false);
            super.field1509.method843(arg1 ^ -3536, 0);
            super.field1509.method2453(0, 13);
            super.field1509.method2462(-16777216, -1);
            super.field1509.method2443(0, class114.field1352, false);
            this.method789((byte) 112);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field11069[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(ZB)V")
    public final void method784(boolean arg0, byte arg1) {
        try {
            ++field11061;
            super.field1509.method2417(arg1 + -70, class206.field3175, class684.field9909);
            if (arg1 != -34) {
                field11064 = -58;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field11069[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sia", name = "<init>", descriptor = "(Lkd;Lcda;)V")
    public class765(class296 arg0, class182 arg1) {
        super(arg0);
        try {
            this.field11063 = arg1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field11069[5] + (arg0 != null ? field11069[3] : field11069[4]) + ',' + (arg1 != null ? field11069[3] : field11069[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(Z)Z")
    public final boolean method790(boolean arg0) {
        try {
            if (arg0) {
                this.field11060 = 1.005654F;
            }
            ++field11068;
            return this.field11063.method1594(-108);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field11069[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(IILrca;)V")
    public final void method788(int arg0, int arg1, class479 arg2) {
        try {
            ++field11067;
            if (arg1 >= -3) {
                field11064 = -103;
            }
            super.field1509.method2467(12, arg2);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field11069[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11069[3] : field11069[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(I)V")
    public final void method783(int arg0) {
        try {
            super.field1509.method2453(arg0, 13);
            ++field11065;
            super.field1509.method2417(arg0 + -110, class684.field9909, class684.field9909);
            super.field1509.method2498(0, class48.field546, (byte) -110);
            super.field1509.method2443(0, class48.field546, false);
            super.field1509.method843(-3535, 1);
            super.field1509.method2467(arg0 ^ 13, (class479) null);
            super.field1509.method2453(0, 13);
            super.field1509.method2443(0, class48.field546, false);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field11069[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5531(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 93);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5532(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 71;
                    break;
                case 1:
                    var10005 = 107;
                    break;
                case 2:
                    var10005 = 54;
                    break;
                case 3:
                    var10005 = 120;
                    break;
                default:
                    var10005 = 93;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
