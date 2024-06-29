import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class342 extends class497 {

    @OriginalMember(owner = "client!rm", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4986 = new String[] { method2751(method2750("\u0012\u0017\u001e\\\u0010")), method2751(method2750("\u000e\u000f\\v")), method2751(method2750("\u001bT\u001e4E")), method2751(method2750("\u0012\u0017\u001eR\u0010")), method2751(method2750("\u0012\u0017\u001eX\u0010")), method2751(method2750("\u0012\u0017\u001e_\u0010")), method2751(method2750("\u0012\u0017\u001eY\u0010")), method2751(method2750("\u0012\u0017\u001e]\u0010")), method2751(method2750("\u0012\u0017\u001e[\u0010")), method2751(method2750("\u0012\u0017\u001e^\u0010")) };

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "I")
    public static int field4980 = 64;

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "F")
    public static float field4979;

    @OriginalMember(owner = "client!rm", name = "k", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!rm", name = "m", descriptor = "I")
    public static int field4977;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
    public static int field4981;

    @OriginalMember(owner = "client!rm", name = "l", descriptor = "I")
    public static int field4982;

    @OriginalMember(owner = "client!rm", name = "n", descriptor = "I")
    public static int field4983;

    @OriginalMember(owner = "client!rm", name = "j", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!rm", name = "o", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "[Ltb;")
    public static class392[] field4978;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(Z)V", line = 3)
    public static void method2746(boolean arg0) {
        try {
            field4978 = null;
            if (!arg0) {
                field4978 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4986[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "(I)I", line = 13)
    public final int method2747(int arg0) {
        try {
            if (arg0 != 3) {
                return 52;
            } else {
                ++field4981;
                return super.field7292;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4986[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)Z", line = 25)
    public final boolean method2748(int arg0) {
        try {
            if (arg0 >= -127) {
                field4979 = 0.13806494F;
            }
            ++field4977;
            return class144.method1245(super.field7293.field9134.method4717(3), (byte) -120);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4986[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(ILpp;)V", line = 39)
    public class342(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Lpp;)V", line = 43)
    public class342(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)V", line = 47)
    public final void method1031(byte arg0) {
        try {
            ++field4976;
            if (super.field7293.field9134.method4716(0) && !class144.method1245(super.field7293.field9134.method4717(3), (byte) -128)) {
                super.field7292 = 0;
            }
            if (super.field7292 < 0 || ~super.field7292 < -3) {
                super.field7292 = this.method1032(-109);
            }
            if (arg0 >= -70) {
                field4980 = -8;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4986[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(BI)I", line = 67)
    public final int method1029(byte arg0, int arg1) {
        try {
            ++field4983;
            if (!class144.method1245(super.field7293.field9134.method4717(3), (byte) -118)) {
                return 3;
            } else {
                if (arg0 != -73) {
                    this.method2747(82);
                }
                return 1;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4986[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)I", line = 82)
    public final int method1032(int arg0) {
        try {
            ++field4985;
            if (arg0 >= -101) {
                field4979 = -1.2730367F;
            }
            return 0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4986[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(II)V", line = 93)
    public final void method1030(int arg0, int arg1) {
        try {
            ++field4984;
            super.field7292 = arg1;
            if (arg0 != 64) {
                field4979 = -0.22036853F;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4986[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILrt;)Z", line = 105)
    public static final boolean method2749(int arg0, class675 arg1) {
        try {
            ++field4982;
            class789 var2 = class101.field1359.method2832(120, arg1.method584(false));
            if (~var2.field11416 == 0) {
                return true;
            } else {
                class596 var3 = class123.field1553.method2205(-70, var2.field11416);
                if (~var3.field8573 == 0) {
                    return true;
                } else {
                    if (arg0 > -46) {
                        field4978 = null;
                    }
                    return var3.method4397(-128);
                }
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field4986[0] + arg0 + ',' + (arg1 != null ? field4986[2] : field4986[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!rm", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2750(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 56);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rm", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2751(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 96;
                    break;
                case 1:
                    var10005 = 122;
                    break;
                case 2:
                    var10005 = 48;
                    break;
                case 3:
                    var10005 = 26;
                    break;
                default:
                    var10005 = 56;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
