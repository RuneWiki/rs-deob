import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public class class153 {

    @OriginalMember(owner = "client!faa", name = "g", descriptor = "I")
    public int field1958 = -1;

    @OriginalMember(owner = "client!faa", name = "l", descriptor = "I")
    public int field1961 = -1;

    @OriginalMember(owner = "client!faa", name = "h", descriptor = "I")
    public int field1963 = 0;

    @OriginalMember(owner = "client!faa", name = "f", descriptor = "I")
    public int field1953 = -1;

    @OriginalMember(owner = "client!faa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1965 = new String[] { method1301(method1300("U;k1O")), method1301(method1300("@`)s")), method1301(method1300("Ht$1p\u0006")), method1301(method1300("Ht$1s\u0006")), method1301(method1300("Ht$1v\u0006")), method1301(method1300("Ht$1q\u0006")) };

    @OriginalMember(owner = "client!faa", name = "k", descriptor = "I")
    public static int field1962 = 0;

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "Lui;")
    public static class251 field1957 = new class251(3000000, 200);

    @OriginalMember(owner = "client!faa", name = "c", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!faa", name = "i", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!faa", name = "d", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!faa", name = "j", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "Lnb;")
    public static class415 field1955;

    @OriginalMember(owner = "client!faa", name = "e", descriptor = "[I")
    public int[] field1960;

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(IILjc;)V")
    private final void method1296(int arg0, int arg1, class711 arg2) {
        try {
            if (arg0 != -23856) {
                this.field1963 = -100;
            }
            if (arg1 == 1) {
                this.field1958 = arg2.method5116((byte) -108);
            } else if (arg1 == 2) {
                this.field1960 = new int[arg2.method5128(0)];
                for (int var4 = 0; var4 < this.field1960.length; var4++) {
                    this.field1960[var4] = arg2.method5116((byte) -125);
                }
            } else if (arg1 == 3) {
                this.field1961 = arg2.method5128(0);
            } else if (arg1 == 4) {
                this.field1963 = arg2.method5128(0);
            } else if (arg1 == 5) {
                this.field1953 = arg2.method5116((byte) -120);
            }
            field1954++;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field1965[2] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field1965[1] : field1965[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(B)V")
    public static final void method1297(byte arg0) {
        try {
            if (arg0 == 37) {
                class752.field10732.method2731(false);
                field1959++;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1965[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(Ljc;B)V")
    public final void method1298(class711 arg0, byte arg1) {
        try {
            field1956++;
            while (true) {
                int var3 = arg0.method5128(0);
                if (var3 == 0) {
                    if (arg1 < 58) {
                        this.method1296(-28, -7, null);
                        return;
                    } else {
                        return;
                    }
                }
                this.method1296(-23856, var3, arg0);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1965[5] + (arg0 == null ? field1965[1] : field1965[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(I)V")
    public static void method1299(int arg0) {
        try {
            field1957 = null;
            if (arg0 == 4519) {
                field1955 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1965[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!faa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1300(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x32);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!faa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1301(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 46;
                    break;
                case 1:
                    var10005 = 21;
                    break;
                case 2:
                    var10005 = 69;
                    break;
                case 3:
                    var10005 = 31;
                    break;
                default:
                    var10005 = 50;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
