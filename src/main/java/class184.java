import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qka")
public class class184 extends class114 {

    @OriginalMember(owner = "client!qka", name = "s", descriptor = "J")
    private long field2377 = -1L;

    @OriginalMember(owner = "client!qka", name = "t", descriptor = "Ljava/lang/String;")
    private String field2384 = null;

    @OriginalMember(owner = "client!qka", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2385 = new String[] { method1523(method1522("lZ\n\u001e\u001d5")), method1523(method1522("f\u001fE\u001e\"")), method1523(method1522("lZ\n\u001e\u001a5")), method1523(method1522("sD\u0007\\")), method1523(method1522("lZ\n\u001e\u00185")), method1523(method1522("lZ\n\u001e\u00195")), method1523(method1522("lZ\n\u001e\u001c5")), method1523(method1522("lZ\n\u001e\u001b5")), method1523(method1522("lZ\n\u001e\u001e5")), method1523(method1522("pT\u0006R:oY\nC7'")), method1523(method1522("=\\\u000e]=xC\u0005Q2x\u000b")) };

    @OriginalMember(owner = "client!qka", name = "m", descriptor = "I")
    public static int field2381 = -1;

    @OriginalMember(owner = "client!qka", name = "k", descriptor = "Ldfa;")
    public static class477 field2379 = new class477(512);

    @OriginalMember(owner = "client!qka", name = "u", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!qka", name = "q", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!qka", name = "n", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!qka", name = "j", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!qka", name = "p", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!qka", name = "r", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!qka", name = "l", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!qka", name = "o", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!qka", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method1517(byte arg0, String arg1) {
        try {
            field2380++;
            if (arg0 >= 43) {
                class459.method3533("", (byte) 55, "", "", 0, arg1, 0);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2385[2] + arg0 + ',' + (arg1 == null ? field2385[3] : field2385[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!qka", name = "a", descriptor = "(IBI)V")
    public static final void method1518(int arg0, byte arg1, int arg2) {
        try {
            if (class110.field1436 != arg0) {
                class393.field5718 = new int[arg0];
                for (int var3 = 0; var3 < arg0; var3++) {
                    class393.field5718[var3] = (var3 << 12) / arg0;
                }
                class247.field3543 = arg0 - 1;
                class171.field2273 = arg0 * 32;
                class110.field1436 = arg0;
            }
            field2382++;
            int var4 = -62 / ((arg1 - 68) / 40);
            if (class606.field8689 != arg2) {
                if (class110.field1436 == arg2) {
                    class568.field8263 = class393.field5718;
                } else {
                    class568.field8263 = new int[arg2];
                    for (int var5 = 0; var5 < arg2; var5++) {
                        class568.field8263[var5] = (var5 << 12) / arg2;
                    }
                }
                class478.field7048 = arg2 - 1;
                class606.field8689 = arg2;
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field2385[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qka", name = "a", descriptor = "(Ljc;I)V")
    public final void method116(class711 arg0, int arg1) {
        try {
            if (arg0.method5128(0) != 255) {
                arg0.field9945--;
                this.field2377 = arg0.method5147((byte) 74);
            }
            field2374++;
            this.field2384 = arg0.method5084(arg1 + 27909);
            if (class389.field5673) {
                System.out.println(field2385[9] + this.field2377 + field2385[10] + this.field2384);
            }
            if (arg1 != -27800) {
                field2379 = null;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2385[8] + (arg0 == null ? field2385[3] : field2385[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qka", name = "a", descriptor = "(IB)V")
    public static final void method1519(int arg0, byte arg1) {
        try {
            class573.field8301 = -1;
            field2383++;
            if (arg1 < 23) {
                field2379 = null;
            }
            class601.field8605 = arg0;
            class801.field11652 = -1;
            class308.method2457(true);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2385[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qka", name = "a", descriptor = "(ILwfa;)V")
    public final void method115(int arg0, class286 arg1) {
        try {
            if (arg0 != 95) {
                this.method116(null, -109);
            }
            arg1.method2318(0, this.field2377, this.field2384, (byte) 74);
            field2373++;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2385[7] + arg0 + ',' + (arg1 == null ? field2385[3] : field2385[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!qka", name = "a", descriptor = "(I)V")
    public static void method1520(int arg0) {
        try {
            field2379 = null;
            if (arg0 != -1123) {
                field2378 = -83;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2385[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qka", name = "a", descriptor = "(ILjc;)Lno;")
    public static final class427 method1521(int arg0, class711 arg1) {
        try {
            field2376++;
            class742 var2 = class404.method3168(arg1, (byte) -86);
            int var3 = arg1.method5116((byte) -126);
            int var4 = arg1.method5116((byte) -109);
            int var5 = arg1.method5116((byte) -127);
            int var6 = arg1.method5116((byte) -121);
            int var7 = arg1.method5116((byte) -114);
            int var8 = arg1.method5116((byte) -113);
            if (arg0 != -8821) {
                method1520(-16);
            }
            return new class427(var2.field10540, var2.field10539, var2.field10542, var2.field10547, var2.field10543, var2.field10541, var2.field10544, var2.field10545, var2.field10548, var3, var4, var5, var6, var7, var8);
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field2385[4] + arg0 + ',' + (arg1 == null ? field2385[3] : field2385[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!qka", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1522(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qka", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1523(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 29;
                    break;
                case 1:
                    var10005 = 49;
                    break;
                case 2:
                    var10005 = 107;
                    break;
                case 3:
                    var10005 = 48;
                    break;
                default:
                    var10005 = 95;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
