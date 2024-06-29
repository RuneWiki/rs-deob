import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class305 {

    @OriginalMember(owner = "client!sb", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4932 = new String[] { method2624(method2623("\u0015\u007f\u007fR")), method2624(method2623("\bh=xB")), method2624(method2623("\u0000$=\u0010\u0017")), method2624(method2623("\bh=|B")), method2624(method2623("\bh=\u007fB")), method2624(method2623("\bh=vB")), method2624(method2623("\bh=yB")), method2624(method2623("\bh={B")), method2624(method2623("\bh=}B")), method2624(method2623("\bh=zB")) };

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "Lpo;")
    public static class585 field4924 = null;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
    public static int field4920;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public int field4921;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public int field4922;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    private int field4931;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "Lme;")
    public class204 field4926;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "[I")
    public static int[] field4919;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lwq;BI)V", line = 6)
    private final void method2615(class176 arg0, byte arg1, int arg2) {
        try {
            if (arg2 == 1) {
                this.field4931 = arg0.method1687((byte) -66);
            } else if (arg2 == 2) {
                this.field4922 = arg0.method1645((byte) -122);
                this.field4921 = arg0.method1645((byte) -125);
            }
            if (arg1 >= -24) {
                this.method2617((byte) 120);
            }
            field4927++;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field4932[1] + (arg0 == null ? field4932[0] : field4932[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIB)Z", line = 30)
    public static final boolean method2616(int arg0, int arg1, byte arg2) {
        try {
            field4928++;
            int var3 = 47 / ((-arg2 - 16) / 35);
            return (arg1 & 0x10000) != 0;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field4932[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)Luh;", line = 42)
    public final synchronized class174 method2617(byte arg0) {
        try {
            if (arg0 != -119) {
                method2616(-31, -71, (byte) 98);
            }
            field4923++;
            class174 var2 = (class174) this.field4926.field3204.method302(arg0 ^ 0x6, (long) this.field4931);
            if (var2 != null) {
                return var2;
            }
            class174 var3 = class174.method1608(this.field4926.field3201, this.field4931, 0);
            if (var3 != null) {
                this.field4926.field3204.method295(false, (long) this.field4931, var3);
            }
            return var3;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field4932[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)I", line = 64)
    public static final int method2618(int arg0, int arg1) {
        try {
            field4930++;
            int var2 = 65 % ((arg0 - 57) / 42);
            return arg1 & 0x3FF;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4932[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lwq;B)V", line = 78)
    public final void method2619(class176 arg0, byte arg1) {
        try {
            while (true) {
                int var3 = arg0.method1645((byte) -104);
                if (var3 == 0) {
                    field4920++;
                    if (arg1 <= 2) {
                        this.method2617((byte) -119);
                        return;
                    }
                    return;
                }
                this.method2615(arg0, (byte) -115, var3);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field4932[7] + (arg0 == null ? field4932[0] : field4932[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IILoi;)V", line = 99)
    public static final void method2620(int arg0, int arg1, class77 arg2) {
        try {
            if (arg0 < -4) {
                if (arg2.field1194 != null) {
                    int var3 = arg2.field1194[arg1 + 1];
                    if (arg2.field1167 != var3) {
                        arg2.field1164 = 0;
                        arg2.field1167 = var3;
                        arg2.field1131 = 0;
                        arg2.field1119 = 1;
                        arg2.field1125 = 0;
                        arg2.field1208 = arg2.field1205;
                        if (arg2.field1167 != -1) {
                            class531.method3967(-107, class397.field6293.method2058(arg2.field1167, (byte) 118), arg2.field1125, arg2);
                        }
                    }
                }
                field4929++;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field4932[8] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field4932[0] : field4932[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)V", line = 132)
    public static void method2621(byte arg0) {
        try {
            field4919 = null;
            if (arg0 > 28) {
                field4924 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4932[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)Z", line = 144)
    public static final boolean method2622(boolean arg0) {
        try {
            field4925++;
            if (class315.field5127 == 3) {
                if (!arg0) {
                    field4919 = null;
                }
                return class9.field104 == 0 && class494.field7431 == 0;
            } else {
                return false;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4932[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sb", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2623(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sb", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2624(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 123;
                    break;
                case 1:
                    var10005 = 10;
                    break;
                case 2:
                    var10005 = 19;
                    break;
                case 3:
                    var10005 = 62;
                    break;
                default:
                    var10005 = 106;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
