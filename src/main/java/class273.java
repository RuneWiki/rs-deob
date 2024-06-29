import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class273 {

    @OriginalMember(owner = "client!uk", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4137 = new String[] { method2264(method2263("\u001e-\t\u00180")), method2264(method2263("\u001e-\t\u001d0")), method2264(method2263("\u00053K7")), method2264(method2263("\u0010h\tue")), method2264(method2263("\u001e-\t\u001f0")), method2264(method2263("\u001e-\t\u001e0")), method2264(method2263("\u001e-\t\u00130")), method2264(method2263("\u001e-\t\u00190")), method2264(method2263("\u001e-\t\u001a0")), method2264(method2263("\u001e-\t\u001c0")) };

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "[Ldf;")
    public static class420[] field4136;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)V", line = 4)
    public static final void method2255(boolean arg0) {
        try {
            field4133++;
            class411.field6071 = new class115(8);
            class223.field3422 = 0;
            for (class619 var1 = (class619) class253.field3926.method4538(arg0); var1 != null; var1 = (class619) class253.field3926.method4543(0)) {
                var1.method4614();
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4137[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IB)[B", line = 24)
    public static final synchronized byte[] method2256(int arg0, byte arg1) {
        try {
            field4134++;
            if (arg0 == 100 && class11.field138 > 0) {
                byte[] var2 = class155.field1909[--class11.field138];
                class155.field1909[class11.field138] = null;
                return var2;
            } else if (arg1 < 13) {
                return null;
            } else if (arg0 == 5000 && class280.field4201 > 0) {
                byte[] var3 = class670.field9739[--class280.field4201];
                class670.field9739[class280.field4201] = null;
                return var3;
            } else if (arg0 == 30000 && class298.field4706 > 0) {
                byte[] var4 = class659.field9504[--class298.field4706];
                class659.field9504[class298.field4706] = null;
                return var4;
            } else {
                if (class614.field8974 != null) {
                    for (int var5 = 0; var5 < class429.field6329.length; var5++) {
                        if (class429.field6329[var5] == arg0 && class677.field9809[var5] > 0) {
                            byte[] var6 = class614.field8974[var5][--class677.field9809[var5]];
                            class614.field8974[var5][class677.field9809[var5]] = null;
                            return var6;
                        }
                    }
                }
                return new byte[arg0];
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field4137[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I[B)V", line = 82)
    public static final synchronized void method2257(int arg0, byte[] arg1) {
        try {
            field4135++;
            if (arg1.length == 100 && class11.field138 < 1000) {
                class155.field1909[class11.field138++] = arg1;
            } else {
                if (arg0 != -2925) {
                    field4136 = null;
                }
                if (arg1.length == 5000 && class280.field4201 < 250) {
                    class670.field9739[class280.field4201++] = arg1;
                } else if (arg1.length == 30000 && class298.field4706 < 50) {
                    class659.field9504[class298.field4706++] = arg1;
                } else if (class614.field8974 != null) {
                    for (int var2 = 0; var2 < class429.field6329.length; var2++) {
                        if (class429.field6329[var2] == arg1.length && class614.field8974[var2].length > class677.field9809[var2]) {
                            class614.field8974[var2][class677.field9809[var2]++] = arg1;
                            return;
                        }
                    }
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4137[6] + arg0 + ',' + (arg1 == null ? field4137[2] : field4137[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(BI)V", line = 129)
    public static final void method2258(byte arg0, int arg1) {
        try {
            field4129++;
            if (arg1 != -1 && class376.field5722[arg1]) {
                class113.field1322.method3648(-126, arg1);
                class683.field9897[arg1] = null;
                class769.field11137[arg1] = null;
                if (arg0 != 21) {
                    method2262(-118, 116, null);
                }
                class376.field5722[arg1] = false;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4137[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIZLc;)V", line = 150)
    public static final void method2259(int arg0, int arg1, int arg2, boolean arg3, class198 arg4) {
        try {
            if (arg3) {
                method2257(-98, null);
            }
            field4130++;
            for (class142 var5 = (class142) class743.field10807.method3863((byte) 64); var5 != null; var5 = (class142) class743.field10807.method3862(-353)) {
                if (var5.field1714 == arg2 && (arg1 << 9) == var5.field1689 && (arg0 << 9) == var5.field1694 && var5.field1699.field3014 == arg4.field3014) {
                    if (var5.field1700 != null) {
                        class594.field8714.method4980(var5.field1700);
                        var5.field1700 = null;
                    }
                    if (var5.field1712 != null) {
                        class594.field8714.method4980(var5.field1712);
                        var5.field1712 = null;
                    }
                    var5.method1824(1);
                    return;
                }
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field4137[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field4137[2] : field4137[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V", line = 191)
    public static void method2260(int arg0) {
        try {
            field4136 = null;
            if (arg0 >= -77) {
                method2260(-67);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4137[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(III)I", line = 202)
    public static final int method2261(int arg0, int arg1, int arg2) {
        try {
            field4132++;
            int var3 = class216.method1888(1321233154, arg1 - 1, arg2 + -1) + class216.method1888(1321233154, arg1 + 1, arg2 + -1) - (-class216.method1888(1321233154, arg1 + -1, arg2 + 1) - class216.method1888(1321233154, arg1 + 1, arg2 + 1));
            int var4 = 12 / ((arg0 - 83) / 35);
            int var5 = class216.method1888(1321233154, arg1 - 1, arg2) - (-class216.method1888(1321233154, arg1 + 1, arg2) - class216.method1888(1321233154, arg1, arg2 - 1)) + class216.method1888(1321233154, arg1, arg2 + 1);
            int var6 = class216.method1888(1321233154, arg1, arg2);
            return var3 / 16 + (var5 / 8 + (var6 / 4));
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field4137[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IILha;)Llq;", line = 221)
    public static final class578 method2262(int arg0, int arg1, class66 arg2) {
        try {
            field4131++;
            int var3 = 94 % ((23 - arg0) / 57);
            class12 var4 = class311.method2627(-2130806110, arg1, arg2, true);
            return var4 == null ? null : var4.field140;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field4137[1] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field4137[2] : field4137[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!uk", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2263(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x18);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!uk", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2264(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 107;
                    break;
                case 1:
                    var10005 = 70;
                    break;
                case 2:
                    var10005 = 39;
                    break;
                case 3:
                    var10005 = 91;
                    break;
                default:
                    var10005 = 24;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
