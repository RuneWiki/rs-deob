import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class167 {

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "Lui;")
    public class251 field2137 = new class251(20);

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "Lui;")
    private class251 field2145 = new class251(64);

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "Llga;")
    public class47 field2139;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "Llga;")
    private class47 field2142;

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2146 = new String[] { method1411(method1410("vUa\u001e\u0006")), method1411(method1410("vUa\u001a\u0006")), method1411(method1410("jG#7")), method1411(method1410("vUagGj[;e\u0006")), method1411(method1410("\u007f\u001cauS")), method1411(method1410("vUa\u001f\u0006")), method1411(method1410("vUa\u0018\u0006")), method1411(method1410("vUa\u0019\u0006")) };

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "Lhh;")
    public static class250 field2133 = new class250(1);

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "[S")
    public static short[] field2144 = new short[] { 23, 13, 15, 10, 53, 46, 58, 59 };

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "B")
    public static byte field2134;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "D")
    public static double field2138;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "Lsn;")
    public static class369 field2143;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)V", line = 4)
    public static void method1405(byte arg0) {
        try {
            int var1 = 38 / ((-arg0 - 60) / 58);
            field2133 = null;
            field2143 = null;
            field2144 = null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2146[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IB)V", line = 15)
    public final void method1406(int arg0, byte arg1) {
        try {
            class251 var3 = this.field2145;
            synchronized (this.field2145) {
                this.field2145.method2038(0, arg0);
                if (arg1 != 4) {
                    this.method1409(-124);
                }
            }
            field2136++;
            class251 var4 = this.field2137;
            synchronized (this.field2137) {
                this.field2137.method2038(arg1 ^ 0x4, arg0);
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field2146[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BI)Laha;", line = 36)
    public final class459 method1407(byte arg0, int arg1) {
        try {
            field2140++;
            class251 var3 = this.field2145;
            class459 var4;
            synchronized (this.field2145) {
                var4 = (class459) this.field2145.method2053(0, (long) arg1);
            }
            if (var4 != null) {
                return var4;
            }
            class47 var5 = this.field2142;
            byte[] var6;
            synchronized (this.field2142) {
                var6 = this.field2142.method512(arg1, 46, (byte) -31);
            }
            int var7 = -97 / ((arg0 + 26) / 33);
            class459 var8 = new class459();
            var8.field6691 = this;
            if (var6 != null) {
                var8.method3528(new class711(var6), -107);
            }
            class251 var9 = this.field2145;
            synchronized (this.field2145) {
                this.field2145.method2051((long) arg1, var8, 93);
                return var8;
            }
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field2146[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V", line = 75)
    public final void method1408(byte arg0) {
        try {
            class251 var2 = this.field2145;
            synchronized (this.field2145) {
                this.field2145.method2043(false);
            }
            field2135++;
            class251 var3 = this.field2137;
            synchronized (this.field2137) {
                int var4 = -116 / ((arg0 + 49) / 58);
                this.field2137.method2043(false);
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field2146[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V", line = 97)
    public final void method1409(int arg0) {
        try {
            if (arg0 == -5835) {
                field2141++;
                class251 var2 = this.field2145;
                synchronized (this.field2145) {
                    this.field2145.method2047(arg0 ^ 0xFFFFC7BF);
                }
                class251 var3 = this.field2137;
                synchronized (this.field2137) {
                    this.field2137.method2047(11914);
                }
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field2146[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lfs;ILlga;Llga;)V", line = 123)
    public class167(class796 arg0, int arg1, class47 arg2, class47 arg3) {
        try {
            this.field2139 = arg3;
            this.field2142 = arg2;
            this.field2142.method509(true, 46);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field2146[3] + (arg0 == null ? field2146[2] : field2146[4]) + ',' + arg1 + ',' + (arg2 == null ? field2146[2] : field2146[4]) + ',' + (arg3 == null ? field2146[2] : field2146[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1410(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1411(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 4;
                    break;
                case 1:
                    var10005 = 50;
                    break;
                case 2:
                    var10005 = 79;
                    break;
                case 3:
                    var10005 = 91;
                    break;
                default:
                    var10005 = 46;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
