import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public abstract class class283 extends class46 {

    @OriginalMember(owner = "client!kv", name = "r", descriptor = "I")
    public int field4238;

    @OriginalMember(owner = "client!kv", name = "t", descriptor = "Lpt;")
    public class556 field4233;

    @OriginalMember(owner = "client!kv", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4240 = new String[] { method2320(method2319("\u0014\u000b=j\f")), method2320(method2319("\u0011\b\u007fJ")), method2320(method2319("\u0004S=\bY")), method2320(method2319("\u0014\u000b=\u001aM\u0011\u0014g\u0018\f")), method2320(method2319("\u0014\u000b=k\f")), method2320(method2319("\u0014\u000b=h\f")), method2320(method2319("\u0014\u000b=i\f")) };

    @OriginalMember(owner = "client!kv", name = "x", descriptor = "Lqv;")
    public static class469 field4235 = new class469(0, -1);

    @OriginalMember(owner = "client!kv", name = "u", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!kv", name = "s", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!kv", name = "w", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!kv", name = "v", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "(I)V", line = 3)
    public static void method2315(int arg0) {
        try {
            field4235 = null;
            if (arg0 != 1722197923) {
                method2315(88);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4240[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Z)V", line = 13)
    public static final void method2316(boolean arg0) {
        try {
            field4236++;
            int var1 = class361.field5517 * 512 + 256;
            int var2 = class315.field4975 * 512 + 256;
            int var3 = class316.method2656(var1, class520.field7618, var2, 0) - class179.field2493;
            if (class290.field4313 >= 100) {
                class683.field9899 = class315.field4975 * 512 + 256;
                class271.field4116 = class361.field5517 * 512 + 256;
                class144.field1749 = class316.method2656(class271.field4116, class520.field7618, class683.field9899, 0) - class179.field2493;
            } else {
                if (var1 > class271.field4116) {
                    class271.field4116 += (var1 - class271.field4116) * class290.field4313 / 1000 + class155.field1910;
                    if (var1 < class271.field4116) {
                        class271.field4116 = var1;
                    }
                }
                if (var1 < class271.field4116) {
                    class271.field4116 -= (class271.field4116 - var1) * class290.field4313 / 1000 + class155.field1910;
                    if (var1 > class271.field4116) {
                        class271.field4116 = var1;
                    }
                }
                if (var3 > class144.field1749) {
                    class144.field1749 += (var3 - class144.field1749) * class290.field4313 / 1000 + class155.field1910;
                    if (var3 < class144.field1749) {
                        class144.field1749 = var3;
                    }
                }
                if (var3 < class144.field1749) {
                    class144.field1749 -= (class144.field1749 - var3) * class290.field4313 / 1000 + class155.field1910;
                    if (var3 > class144.field1749) {
                        class144.field1749 = var3;
                    }
                }
                if (class683.field9899 < var2) {
                    class683.field9899 += (var2 - class683.field9899) * class290.field4313 / 1000 + class155.field1910;
                    if (var2 < class683.field9899) {
                        class683.field9899 = var2;
                    }
                }
                if (var2 < class683.field9899) {
                    class683.field9899 -= (class683.field9899 - var2) * class290.field4313 / 1000 + class155.field1910;
                    if (var2 > class683.field9899) {
                        class683.field9899 = var2;
                    }
                }
            }
            int var4 = class243.field3724 * 512 + 256;
            int var5 = class329.field5184 * 512 + 256;
            int var6 = class316.method2656(var4, class520.field7618, var5, 0) - class239.field3626;
            int var7 = var4 - class271.field4116;
            if (arg0) {
                int var8 = var6 - class144.field1749;
                int var9 = var5 - class683.field9899;
                int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
                int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
                if (var11 < 1024) {
                    var11 = 1024;
                }
                int var12 = (int) (Math.atan2((double) var7, (double) var9) * -2607.5945876176133D) & 0x3FFF;
                if (var11 > 3072) {
                    var11 = 3072;
                }
                if (class320.field5061 < var11) {
                    class320.field5061 += (var11 - class320.field5061 >> 3) * class589.field8664 / 1000 + class777.field11288 << 3;
                    if (var11 < class320.field5061) {
                        class320.field5061 = var11;
                    }
                }
                if (class320.field5061 > var11) {
                    class320.field5061 -= class777.field11288 + ((class320.field5061 - var11 >> 3) * class589.field8664 / 1000) << 3;
                    if (class320.field5061 < var11) {
                        class320.field5061 = var11;
                    }
                }
                int var13 = var12 - class93.field1052;
                if (var13 > 8192) {
                    var13 -= 16384;
                }
                if (var13 < -8192) {
                    var13 += 16384;
                }
                int var14 = var13 >> 3;
                if (var14 > 0) {
                    class93.field1052 += class589.field8664 * var14 / 1000 + class777.field11288 << 3;
                    class93.field1052 &= 0x3FFF;
                }
                if (var14 < 0) {
                    class93.field1052 -= class777.field11288 + (-var14 * class589.field8664 / 1000) << 3;
                    class93.field1052 &= 0x3FFF;
                }
                int var15 = var12 - class93.field1052;
                if (var15 > 8192) {
                    var15 -= 16384;
                }
                if (var15 < -8192) {
                    var15 += 16384;
                }
                if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
                    class93.field1052 = var12;
                }
                class684.field9916 = 0;
            }
        } catch (RuntimeException var17) {
            throw class759.method5498(var17, field4240[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(III)V", line = 172)
    public static final void method2317(int arg0, int arg1, int arg2) {
        try {
            if (arg1 < 52) {
                method2316(false);
            }
            field4234++;
            class313 var3 = class196.method1670((long) arg0 | (long) arg2 << 32, 18, -21);
            var3.method2635(true);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field4240[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "(III)B", line = 185)
    public static final byte method2318(int arg0, int arg1, int arg2) {
        try {
            field4237++;
            if (arg0 != 9) {
                return 0;
            } else if (arg2 == 16383) {
                return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
            } else {
                return -113;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4240[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Lpt;I)V", line = 213)
    public class283(class556 arg0, int arg1) {
        try {
            this.field4238 = arg1;
            this.field4233 = arg0;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4240[3] + (arg0 == null ? field4240[1] : field4240[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kv", name = "g", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method450(int arg0);

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)Z")
    public abstract boolean method449(int arg0);

    @OriginalMember(owner = "client!kv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2319(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x24);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2320(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 127;
                    break;
                case 1:
                    var10005 = 125;
                    break;
                case 2:
                    var10005 = 19;
                    break;
                case 3:
                    var10005 = 38;
                    break;
                default:
                    var10005 = 36;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
