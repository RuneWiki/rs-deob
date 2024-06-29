import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class578 {

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8380 = new String[] { method4296(method4295("^OWPh\u0001")), method4296(method4295("^OWQh\u0001")), method4296(method4295("^OWRh\u0001")), method4296(method4295("GX\u0015\u007f")), method4296(method4295("^OWWh\u0001")), method4296(method4295("R\u0003W=W")) };

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "[[B")
    public static byte[][] field8379 = new byte[1000][];

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field8375;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
    public static int field8376;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public static int field8377;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "J")
    public long field8378;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "Lwb;")
    public class578 field8373;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "Lwb;")
    public class578 field8374;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "Ljc;")
    public static class711 field8372;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILjava/lang/String;)V", line = 3)
    public static final void method4291(int arg0, String arg1) {
        try {
            field8375++;
            if (arg1 != null) {
                if (arg0 != 1) {
                    field8372 = null;
                }
                String var2 = class492.method3797(0, arg1);
                if (var2 != null) {
                    for (int var3 = 0; var3 < class692.field9683; var3++) {
                        String var4 = class49.field710[var3];
                        String var5 = class492.method3797(0, var4);
                        if (class599.method4418((byte) 34, arg1, var5, var4, var2)) {
                            class692.field9683--;
                            for (int var6 = var3; var6 < class692.field9683; var6++) {
                                class49.field710[var6] = class49.field710[var6 + 1];
                                class599.field8597[var6] = class599.field8597[var6 + 1];
                                class180.field2342[var6] = class180.field2342[var6 + 1];
                                class46.field657[var6] = class46.field657[var6 + 1];
                                class412.field5930[var6] = class412.field5930[var6 + 1];
                            }
                            class765.field10913++;
                            class391.field5712 = class522.field7612;
                            class779 var7 = class85.method851(false);
                            class274 var8 = class375.method2969((byte) 1, class647.field9201, var7.field11100);
                            var8.field3885.method5114(255, class101.method986(arg1, 6743));
                            var8.field3885.method5089(arg1, (byte) 62);
                            var7.method5608(var8, 29867);
                            return;
                        }
                    }
                }
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field8380[4] + arg0 + ',' + (arg1 == null ? field8380[3] : field8380[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)V", line = 63)
    public static void method4292(byte arg0) {
        try {
            field8379 = null;
            if (arg0 < 2) {
                method4291(-2, null);
            }
            field8372 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8380[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)Z", line = 74)
    public final boolean method4293(int arg0) {
        try {
            int var2 = 59 / ((arg0 + 48) / 46);
            field8376++;
            return this.field8374 != null;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8380[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)V", line = 91)
    public final void method4294(int arg0) {
        try {
            field8377++;
            if (this.field8374 != null) {
                this.field8374.field8373 = this.field8373;
                this.field8373.field8374 = this.field8374;
                this.field8374 = null;
                this.field8373 = null;
                if (arg0 != 0) {
                    method4292((byte) 92);
                }
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8380[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4295(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4296(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 41;
                    break;
                case 1:
                    var10005 = 45;
                    break;
                case 2:
                    var10005 = 121;
                    break;
                case 3:
                    var10005 = 19;
                    break;
                default:
                    var10005 = 42;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
