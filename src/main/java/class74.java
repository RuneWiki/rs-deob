import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class74 implements class250 {

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "Ljava/lang/String;")
    private String field856;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "Lla;")
    private class476 field861;

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field865 = new String[] { method674(method673("\u0017oKQ ")), method674(method673("\u0017oKS ")), method674(method673("\u001b\"K;u")), method674(method673("\u000ey\ty")), method674(method673("\u0017oK)a\u000ee\u0011+ ")), method674(method673("\u0017oKW ")), method674(method673("\u0017oKV ")), method674(method673("\u0017oKP ")), method674(method673("\u0017oKT ")) };

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "Lwia;")
    public static class790 field858 = new class790(89, 3);

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "Z")
    public static boolean field859 = false;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
    public static int field864 = 0;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "[Ldf;")
    public static class420[] field862;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZJ)I", line = 5)
    public static final int method667(boolean arg0, long arg1) {
        try {
            if (!arg0) {
                method668((byte) 123, null);
            }
            field857++;
            return (int) (arg1 / 86400000L) - 11745;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field865[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BLha;)V", line = 16)
    public static final void method668(byte arg0, class66 arg1) {
        try {
            class619 var2 = (class619) class253.field3926.method4538(false);
            if (arg0 > -17) {
                field862 = null;
            }
            while (var2 != null) {
                if (var2.field9105) {
                    var2.method4616(arg1);
                }
                var2 = (class619) class253.field3926.method4543(0);
            }
            field860++;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field865[1] + arg0 + ',' + (arg1 == null ? field865[3] : field865[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)V", line = 39)
    public static void method669(int arg0) {
        try {
            field862 = null;
            if (arg0 != 1987028488) {
                field862 = null;
            }
            field858 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field865[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)I", line = 53)
    public final int method670(int arg0) {
        try {
            if (arg0 != 18366) {
                this.field856 = null;
            }
            field855++;
            return this.field861.method3647(this.field856, arg0 ^ 0x47FA) ? 100 : this.field861.method3628((byte) 80, this.field856);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field865[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)Lud;", line = 70)
    public final class39 method671(int arg0) {
        try {
            int var2 = -57 / ((arg0 + 46) / 56);
            field863++;
            return class39.field455;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field865[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IJ)V", line = 80)
    public static final void method672(int arg0, long arg1) {
        try {
            field854++;
            if (class734.field10683 != null) {
                if (class185.field2559 == 1 || class185.field2559 == 5) {
                    class561.method4193(arg1, false);
                } else if (class185.field2559 == 4) {
                    class64.method459(arg1, 25578);
                }
            }
            class167.method1487((long) class375.field5711, class610.field8913, arg0 + 2);
            if (class742.field10801 != -1) {
                class594.method4421((byte) 115, class742.field10801);
            }
            if (arg0 == -2) {
                for (int var3 = 0; var3 < class669.field9721; var3++) {
                    if (class26.field321[var3]) {
                        class214.field3265[var3] = true;
                    }
                    class419.field6166[var3] = class26.field321[var3];
                    class26.field321[var3] = false;
                }
                class254.field3940 = class375.field5711;
                class156.method1315(-1, arg0 - 10211, null, -1);
                class50.method385(-1, -1, null, (byte) 90);
                if (class742.field10801 != -1) {
                    class669.field9721 = 0;
                    class486.method3695(0);
                }
                class610.field8913.method553();
                class531.method4019(class610.field8913, (byte) 56);
                int var4 = class114.method1007((byte) 118);
                if (var4 == -1) {
                    var4 = class311.field4926;
                }
                if (var4 == -1) {
                    var4 = class474.field6882;
                }
                class85.method721(var4, (byte) 39);
                int var5 = class225.field3446.method2101(31463) << 8;
                class417.method3238(class225.field3446.field6200, class225.field3446.field6197 + var5, class327.field5158, class225.field3446.field6211 + var5, (byte) 53);
                class327.field5158 = 0;
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field865[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lla;Ljava/lang/String;)V", line = 155)
    public class74(class476 arg0, String arg1) {
        try {
            this.field856 = arg1;
            this.field861 = arg0;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field865[4] + (arg0 == null ? field865[3] : field865[2]) + ',' + (arg1 == null ? field865[3] : field865[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method673(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x8);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method674(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 96;
                    break;
                case 1:
                    var10005 = 12;
                    break;
                case 2:
                    var10005 = 101;
                    break;
                case 3:
                    var10005 = 21;
                    break;
                default:
                    var10005 = 8;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
