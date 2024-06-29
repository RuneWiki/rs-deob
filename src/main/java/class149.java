import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class149 {

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "Lui;")
    private class251 field1900 = new class251(16);

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "Llga;")
    private class47 field1906;

    @OriginalMember(owner = "client!qh", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1908 = new String[] { method1277(method1276("}LDHO")), method1277(method1276("h\u0017\u0006\n")), method1277(method1276("w\nDZ[h\u000b\u001eX\u001a")), method1277(method1276("w\nD#\u001a")), method1277(method1276("w\nD \u001a")), method1277(method1276("w\nD%\u001a")), method1277(method1276("w\nD$\u001a")), method1277(method1276("w\nD\"\u001a")), method1277(method1276("w\nD'\u001a")) };

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "Z")
    public static boolean field1902 = false;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "Z")
    public static boolean field1901;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)V")
    public static final void method1270(int arg0, int arg1, int arg2) {
        try {
            field1899++;
            if (arg2 != -22202) {
                method1270(-12, -20, 42);
            }
            if (class314.method2496(arg1, (byte) -31)) {
                class700.method5041(class9.field117[arg1], (byte) -120, arg0);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field1908[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)Lfaa;")
    private final class153 method1271(int arg0, int arg1) {
        try {
            field1904++;
            class251 var3 = this.field1900;
            class153 var4;
            synchronized (this.field1900) {
                var4 = (class153) this.field1900.method2053(0, (long) arg0);
            }
            if (var4 != null) {
                return var4;
            }
            class47 var5 = this.field1906;
            byte[] var6;
            synchronized (this.field1906) {
                var6 = this.field1906.method512(arg0, 29, (byte) -120);
                if (arg1 > -112) {
                    field1901 = false;
                }
            }
            class153 var7 = new class153();
            if (var6 != null) {
                var7.method1298(new class711(var6), (byte) 80);
            }
            class251 var8 = this.field1900;
            synchronized (this.field1900) {
                this.field1900.method2051((long) arg0, var7, 93);
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field1908[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
    public final void method1272(int arg0) {
        try {
            class251 var2 = this.field1900;
            synchronized (this.field1900) {
                if (arg0 != -18441) {
                    this.field1900 = null;
                }
                this.field1900.method2047(11914);
            }
            field1903++;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1908[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IILtr;BII)Lpca;")
    public final class774 method1273(int arg0, int arg1, class642 arg2, byte arg3, int arg4, int arg5) {
        try {
            if (arg3 != 83) {
                return null;
            }
            field1905++;
            class83[] var7 = null;
            class153 var8 = this.method1271(arg5, arg3 ^ 0xFFFFFFD5);
            if (var8.field1960 != null) {
                var7 = new class83[var8.field1960.length];
                for (int var9 = 0; var9 < var7.length; var9++) {
                    class690 var10 = arg2.method4690(-90, var8.field1960[var9]);
                    var7[var9] = new class83(var10.field9651, var10.field9652, var10.field9649, var10.field9658, var10.field9653, var10.field9650, var10.field9661, var10.field9645, var10.field9659, var10.field9646, var10.field9656);
                }
            }
            return new class774(var8.field1958, var7, var8.field1961, arg0, arg4, arg1, var8.field1963, var8.field1953);
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field1908[8] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field1908[1] : field1908[0]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(II)V")
    public final void method1274(int arg0, int arg1) {
        try {
            field1907++;
            class251 var3 = this.field1900;
            synchronized (this.field1900) {
                if (arg0 == 16) {
                    this.field1900.method2038(0, arg1);
                }
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field1908[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)V")
    public final void method1275(int arg0) {
        try {
            class251 var2 = this.field1900;
            synchronized (this.field1900) {
                this.field1900.method2043(false);
            }
            if (arg0 != 16) {
                this.field1900 = null;
            }
            field1898++;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1908[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lfs;ILlga;)V")
    public class149(class796 arg0, int arg1, class47 arg2) {
        try {
            this.field1906 = arg2;
            this.field1906.method509(true, 29);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1908[2] + (arg0 == null ? field1908[1] : field1908[0]) + ',' + arg1 + ',' + (arg2 == null ? field1908[1] : field1908[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!qh", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1276(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x32);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qh", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1277(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 6;
                    break;
                case 1:
                    var10005 = 98;
                    break;
                case 2:
                    var10005 = 106;
                    break;
                case 3:
                    var10005 = 102;
                    break;
                default:
                    var10005 = 50;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
