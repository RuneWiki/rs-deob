import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jja")
public class class120 extends class46 {

    @OriginalMember(owner = "client!jja", name = "v", descriptor = "D")
    public double field1425;

    @OriginalMember(owner = "client!jja", name = "A", descriptor = "[[S")
    public short[][] field1418;

    @OriginalMember(owner = "client!jja", name = "C", descriptor = "[Ljava/lang/String;")
    private static final String[] field1426 = new String[] { method1051(method1050("OI\u00071Q\r")), method1051(method1050("OI\u00071^\r")), method1051(method1050("OI\u00071_\r")), method1051(method1050("OI\u00071]\r")), method1051(method1050("KV\ns")), method1051(method1050("^\rH1j")), method1051(method1050("OI\u00071+LM\u000fk)\r")), method1051(method1050("OI\u00071Z\r")), method1051(method1050("OI\u00071[\r")), method1051(method1050("OI\u00071P\r")), method1051(method1050("OI\u00071\\\r")) };

    @OriginalMember(owner = "client!jja", name = "s", descriptor = "J")
    public static long field1423 = 1L;

    @OriginalMember(owner = "client!jja", name = "u", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!jja", name = "z", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!jja", name = "x", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!jja", name = "w", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!jja", name = "t", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!jja", name = "B", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!jja", name = "y", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!jja", name = "r", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!jja", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V", line = 4)
    public static final void method1042(String arg0, String arg1, boolean arg2) {
        try {
            field1421++;
            if (arg0.length() <= 320 && class203.method1806(!arg2)) {
                if (class629.field9198 != null) {
                    class629.field9198.method2700((byte) 97);
                    class629.field9198 = null;
                }
                if (arg2) {
                    class729.method5315(256);
                    class489.field7027 = arg1;
                    class122.field1439 = arg0;
                    class86.method728(5, (byte) -96);
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1426[10] + (arg0 == null ? field1426[4] : field1426[5]) + ',' + (arg1 == null ? field1426[4] : field1426[5]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jja", name = "a", descriptor = "(III)Z", line = 35)
    public static final boolean method1043(int arg0, int arg1, int arg2) {
        try {
            int var3 = -8 / ((-arg1 - 3) / 32);
            field1422++;
            return class431.method3304(arg0, -13984, arg2) || class304.method2583(arg2, -840, arg0);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field1426[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jja", name = "a", descriptor = "(I)J", line = 46)
    public final long method1044(int arg0) {
        try {
            if (arg0 < 33) {
                return 40L;
            } else {
                field1420++;
                return (long) (this.field1418[0].length | this.field1418.length << 0);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1426[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jja", name = "a", descriptor = "(IIIII)Z", line = 57)
    public static final boolean method1045(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            field1417++;
            if (!class64.field658 || !class16.field197) {
                return false;
            } else if (class73.field850 < 100) {
                return false;
            } else if (class56.method418(arg0, arg2, 113, arg4)) {
                int var5 = arg4 << class602.field8828;
                if (arg3 > -107) {
                    return true;
                }
                int var6 = arg0 << class602.field8828;
                if (class546.method4118(-125, class555.field8261[arg2].method2407(arg0, arg4, 118), arg1, var6, var5, class358.field5488, class358.field5488)) {
                    class519.field7615++;
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field1426[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!jja", name = "a", descriptor = "(ZLsg;)V", line = 90)
    public static final void method1046(boolean arg0, class417 arg1) {
        try {
            field1419++;
            if (!class216.field3297 && arg0) {
                arg1.method1824(1);
                class593.field8707--;
                if (arg1.field6151) {
                    for (class655 var5 = (class655) class492.field7058.method4068(!arg0); var5 != null; var5 = (class655) class492.field7058.method4072(-100)) {
                        if (var5.field9460.equals(arg1.field6149)) {
                            boolean var6 = false;
                            for (class417 var7 = (class417) var5.field9457.method4068(false); var7 != null; var7 = (class417) var5.field9457.method4072(-120)) {
                                if (arg1 == var7) {
                                    var6 = true;
                                    if (var5.method4801(arg1, 0)) {
                                        class391.method3105(true, var5);
                                    }
                                    break;
                                }
                            }
                            if (var6) {
                                return;
                            }
                        }
                    }
                } else {
                    long var2 = arg1.field6154;
                    class655 var4;
                    for (var4 = (class655) class244.field3740.method977(var2, 1); var4 != null && !var4.field9460.equals(arg1.field6149); var4 = (class655) class244.field3740.method969(-119)) {
                    }
                    if (var4 != null && var4.method4801(arg1, 0)) {
                        class391.method3105(true, var4);
                        return;
                    }
                }
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field1426[8] + arg0 + ',' + (arg1 == null ? field1426[4] : field1426[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!jja", name = "a", descriptor = "(IZ)V", line = 166)
    public static final void method1047(int arg0, boolean arg1) {
        try {
            field1415++;
            int var2 = class443.field6512;
            if (arg0 == 1) {
                int var3 = class351.field5422;
                if (arg1 && class640.field9291) {
                    var2 <<= 0x1;
                    var3 = -var2;
                }
                class610.field8913.method490(var3, var2);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field1426[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jja", name = "a", descriptor = "(ILfda;B)V", line = 191)
    public static final void method1048(int arg0, class338 arg1, byte arg2) {
        try {
            if (class729.field10595) {
                arg0 = 0;
                class729.field10595 = false;
            }
            field1424++;
            if (class398.field5950 == null || !class398.field5950.method2817((byte) -121, arg1)) {
                class398.field5950 = arg1;
                class254.field3942 = class430.method3299(96);
                class571.field8454 = arg0;
                class534.field7821 = arg0;
                if (class534.field7821 == 0) {
                    class110.method962(false);
                } else {
                    class625.field9147 = class756.field10987;
                    class653.field9443 = class616.field9054;
                    class582.field8605 = class424.field6247;
                    class279.field4193 = class239.field3623;
                    class342.field5315 = class248.field3869;
                    class425.field6265 = class287.field4272;
                    class143.field1721 = class331.field5197;
                    class627.field9186 = class326.field5132;
                    class580.field8603 = class134.field1561;
                    class81.field916 = class391.field5887;
                }
            }
            int var3 = 100 % ((64 - arg2) / 55);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field1426[7] + arg0 + ',' + (arg1 == null ? field1426[4] : field1426[5]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jja", name = "a", descriptor = "(IBIIII)V", line = 229)
    public static final void method1049(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            field1416++;
            if (arg1 != -63) {
                field1423 = -128L;
            }
            if (arg0 == arg2) {
                class676.method4963((byte) -92, arg5, arg0, arg4, arg3);
            } else if (class200.field3119 <= arg4 - arg0 && arg0 + arg4 <= class676.field9797 && class676.field9807 <= arg3 - arg2 && arg3 + arg2 <= class381.field5786) {
                class432.method3309(arg2, arg5, arg3, arg0, arg4, 65536);
            } else {
                class592.method4412(arg2, arg5, arg3, arg4, true, arg0);
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field1426[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!jja", name = "<init>", descriptor = "([[SD)V", line = 257)
    public class120(short[][] arg0, double arg1) {
        try {
            this.field1425 = arg1;
            this.field1418 = arg0;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field1426[6] + (arg0 == null ? field1426[4] : field1426[5]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1050(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x17);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1051(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 37;
                    break;
                case 1:
                    var10005 = 35;
                    break;
                case 2:
                    var10005 = 102;
                    break;
                case 3:
                    var10005 = 31;
                    break;
                default:
                    var10005 = 23;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
