import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class570 {

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "Lat;")
    private class398 field8263;

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8271 = new String[] { method4206(method4205("Z5(\u0007p")), method4206(method4205("My(j%")), method4206(method4205("OnjE")), method4206(method4205("My(a%")), method4206(method4205("My(h%")), method4206(method4205("My(n%")), method4206(method4205("My(m%")), method4206(method4205("My(l%")), method4206(method4205("My(o%")), method4206(method4205("My(k%")), method4206(method4205("My(\u0015dOrr\u0017%")) };

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field8260 = 328;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field8270 = 0;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public static int field8259;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field8261;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public static int field8264;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public static int field8266;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field8267;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public static int field8268;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    public static int field8269;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "Lsca;")
    public static class47 field8258;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "Lac;")
    private class568 field8265;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "[Lrda;")
    public static class693[] field8262;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lgda;BI)Lkaa;", line = 9)
    public static final class49 method4197(class58 arg0, byte arg1, int arg2) {
        try {
            if (arg1 < 15) {
                field8260 = 22;
            }
            field8266++;
            byte[] var3 = arg0.method587(arg2, true);
            return var3 == null ? null : new class49(var3);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field8271[1] + (arg0 == null ? field8271[2] : field8271[0]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V", line = 26)
    public static final void method4198(int arg0) {
        try {
            if (class788.field11520 >= 0) {
                long var1 = class712.method5167(-2334);
                class788.field11520 = (int) ((long) class788.field11520 - (var1 - class96.field1400));
                if (class788.field11520 <= 0) {
                    class214.field3370 = class129.field1850.field11140;
                    class172.field2757 = class129.field1850.field11144;
                    class409.field6539 = class129.field1850.field11139;
                    class241.field3708 = class129.field1850.field11135;
                    class653.field9356 = class129.field1850.field11134;
                    class101.field1479 = class129.field1850.field11130;
                    class711.field10286 = class129.field1850.field11143;
                    class788.field11520 = -1;
                    class428.field6749 = class129.field1850.field11146;
                    class127.field1830 = class129.field1850.field11133;
                    class778.field11347 = class129.field1850.field11147;
                } else {
                    int var3 = (class788.field11520 << 8) / class475.field7237;
                    int var4 = 255 - var3;
                    float var5 = (float) var3 / 255.0F;
                    class778.field11347 = ((class775.field11327 & 0xFF00FF) * var3 + (class129.field1850.field11147 & 0xFF00FF) * var4 & 0xFF00FF00) + ((class775.field11327 & 0xFF00) * var3 + (class129.field1850.field11147 & 0xFF00) * var4 & 0xFF0000) >>> 8;
                    float var6 = 1.0F - var5;
                    class409.field6539 = (class129.field1850.field11139 - class284.field4604) * var6 + class284.field4604;
                    class127.field1830 = (class129.field1850.field11133 - class224.field3511) * var6 + class224.field3511;
                    class428.field6749 = (class129.field1850.field11146 - class50.field597) * var6 + class50.field597;
                    class711.field10286 = ((class133.field1894 & 0xFF00) * var3 + ((class129.field1850.field11143 & 0xFF00) * var4) & 0xFF0000) + ((class133.field1894 & 0xFF00FF) * var3 + (class129.field1850.field11143 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
                    class653.field9356 = (class129.field1850.field11134 - class130.field1854) * var6 + class130.field1854;
                    class241.field3708 = class356.field5725 * var3 + class129.field1850.field11135 * var4 >> 8;
                    class101.field1479 = (class129.field1850.field11130 - class31.field368) * var6 + class31.field368;
                    class172.field2757 = (class129.field1850.field11144 - class167.field2707) * var6 + class167.field2707;
                    if (class55.field695 != class129.field1850.field11140) {
                        class214.field3370 = class617.field8910.method249(class55.field695, class129.field1850.field11140, var6, class214.field3370);
                    }
                }
                class96.field1400 = var1;
            }
            field8268++;
            if (arg0 != 65280) {
                field8258 = null;
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field8271[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V", line = 84)
    public static final void method4199(boolean arg0) {
        try {
            class490.field7395 = 0;
            class771.field11308 = new class746[50];
            field8261++;
            if (!arg0) {
                field8260 = 84;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8271[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lat;B)V", line = 100)
    public final void method4200(class398 arg0, byte arg1) {
        try {
            this.field8263 = arg0;
            if (arg1 < 90) {
                method4199(false);
            }
            field8269++;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field8271[5] + (arg0 == null ? field8271[2] : field8271[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)Lac;", line = 111)
    public final class568 method4201(byte arg0) {
        try {
            field8264++;
            class568 var2 = this.field8265;
            if (this.field8263.field6307 == var2) {
                this.field8265 = null;
                return null;
            }
            if (arg0 != 112) {
                field8258 = null;
            }
            this.field8265 = var2.field8249;
            return var2;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field8271[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V", line = 134)
    public static void method4202(int arg0) {
        try {
            field8258 = null;
            if (arg0 == -16711936) {
                field8262 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8271[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V", line = 144)
    public class570() {
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)Lac;", line = 147)
    public final class568 method4203(byte arg0) {
        try {
            if (arg0 <= 105) {
                return null;
            }
            field8267++;
            class568 var2 = this.field8263.field6307.field8249;
            if (this.field8263.field6307 == var2) {
                this.field8265 = null;
                return null;
            } else {
                this.field8265 = var2.field8249;
                return var2;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field8271[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lat;)V", line = 167)
    public class570(class398 arg0) {
        try {
            this.field8263 = arg0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8271[10] + (arg0 == null ? field8271[2] : field8271[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)V", line = 180)
    public static final void method4204(int arg0, int arg1) {
        try {
            field8259++;
            class551 var2 = class380.method3113(-118, (long) arg1, arg0);
            var2.method4089(63);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field8271[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4205(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xD);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4206(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 33;
                    break;
                case 1:
                    var10005 = 27;
                    break;
                case 2:
                    var10005 = 6;
                    break;
                case 3:
                    var10005 = 41;
                    break;
                default:
                    var10005 = 13;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
