import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class511 extends class241 {

    @OriginalMember(owner = "client!ms", name = "H", descriptor = "Ljava/lang/Object;")
    private Object field7747;

    @OriginalMember(owner = "client!ms", name = "D", descriptor = "Lsk;")
    public static class423 field7743 = new class423("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

    @OriginalMember(owner = "client!ms", name = "J", descriptor = "I")
    public static int field7749 = 0;

    @OriginalMember(owner = "client!ms", name = "L", descriptor = "Loe;")
    public static class127 field7751 = new class127(15, 8);

    @OriginalMember(owner = "client!ms", name = "M", descriptor = "I")
    public static int field7752 = -1;

    @OriginalMember(owner = "client!ms", name = "B", descriptor = "I")
    public static int field7741;

    @OriginalMember(owner = "client!ms", name = "C", descriptor = "I")
    public static int field7742;

    @OriginalMember(owner = "client!ms", name = "E", descriptor = "I")
    public static int field7744;

    @OriginalMember(owner = "client!ms", name = "F", descriptor = "I")
    public static int field7745;

    @OriginalMember(owner = "client!ms", name = "G", descriptor = "I")
    public static int field7746;

    @OriginalMember(owner = "client!ms", name = "I", descriptor = "I")
    public static int field7748;

    @OriginalMember(owner = "client!ms", name = "N", descriptor = "I")
    public static int field7753;

    @OriginalMember(owner = "client!ms", name = "A", descriptor = "Lrr;")
    public static class234 field7740;

    @OriginalMember(owner = "client!ms", name = "K", descriptor = "Lpf;")
    public static class395 field7750;

    @OriginalMember(owner = "client!ms", name = "g", descriptor = "(I)Ljava/lang/Object;")
    public final Object method1449(int arg0) {
        int var2 = 14 / ((arg0 - 83) / 34);
        field7745++;
        return this.field7747;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIB)V")
    public static final void method3055(int arg0, int arg1, byte arg2) {
        if (class481.field7350 == 1) {
            class475.method2857(class451.field6952, arg0, arg1, 1);
        } else if (class481.field7350 == 2) {
            class332.method2062(16, arg0, arg1);
        }
        field7753++;
        class451.field6952 = null;
        class481.field7350 = 0;
        if (arg2 != -128) {
            field7740 = null;
        }
    }

    @OriginalMember(owner = "client!ms", name = "i", descriptor = "(I)I")
    public static final int method3056(int arg0) {
        field7744++;
        try {
            if (class297.field4509 == 0) {
                if (class189.field3021 > class344.method2111((byte) -120) - 5000L) {
                    return 0;
                }
                class279.field4244 = class7.field86.method1583(class167.field2592, class331.field4965, (byte) -94);
                class20.field256 = class344.method2111((byte) -62);
                class297.field4509 = 1;
            }
            if (class344.method2111((byte) -46) > class20.field256 + 30000L) {
                return class224.method1361(1000, (byte) -31);
            }
            if (class297.field4509 == 1) {
                if (class279.field4244.field2802 == 2) {
                    return class224.method1361(1001, (byte) -63);
                }
                if (class279.field4244.field2802 != 1) {
                    return -1;
                }
                class163.field2534 = new class295((Socket) class279.field4244.field2803, class7.field86);
                class279.field4244 = null;
                int var1 = 0;
                if (class239.field3611) {
                    var1 = class319.field4794;
                }
                class230.field3508.field585 = 0;
                class230.field3508.method221(-1, class247.field3795.field3849);
                class230.field3508.method253(-117, var1);
                class163.field2534.method1787(class230.field3508.field536, 0, 4900, class230.field3508.field585);
                class111.method797(0);
                int var2 = class163.field2534.method1792(0);
                class111.method797(0);
                if (var2 != 0) {
                    return class224.method1361(var2, (byte) -68);
                }
                class297.field4509 = 2;
            }
            if (class297.field4509 == 2) {
                if (class163.field2534.method1789(27683) < 2) {
                    return -1;
                }
                class28.field353 = class163.field2534.method1792(0);
                class28.field353 <<= 0x8;
                class28.field353 += class163.field2534.method1792(0);
                class297.field4509 = 3;
                class72.field1279 = new byte[class28.field353];
                class69.field1136 = 0;
            }
            if (class297.field4509 == 3) {
                int var3 = class163.field2534.method1789(27683);
                if (var3 < 1) {
                    return -1;
                }
                if (var3 > class28.field353 - class69.field1136) {
                    var3 = class28.field353 - class69.field1136;
                }
                class163.field2534.method1788(-13205, class69.field1136, class72.field1279, var3);
                class69.field1136 += var3;
                if (class28.field353 > class69.field1136) {
                    return -1;
                }
                if (!class52.method362(128, class72.field1279)) {
                    return class224.method1361(1002, (byte) -68);
                }
                class486.field7402 = new class471[class177.field2767];
                int var4 = 0;
                for (int var5 = class407.field5905; var5 <= class506.field7648; var5++) {
                    class471 var6 = class96.method714(var5, 0);
                    if (var6 != null) {
                        class486.field7402[var4++] = var6;
                    }
                }
                class501.field7589 = null;
                class396.field5771 = 0;
                class163.field2534.method1795((byte) 126);
                class72.field1279 = null;
                class163.field2534 = null;
                class297.field4509 = 0;
                class484.field7398 = 0;
                class189.field3021 = class344.method2111((byte) -86);
                return 0;
            }
        } catch (IOException var7) {
            return class224.method1361(1003, (byte) -15);
        }
        if (arg0 < 86) {
            field7750 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lwg;I)V")
    public static final void method3057(class281 arg0, int arg1) {
        field7746++;
        if (arg0.field4261 != null) {
            arg0.field4261.field7449 = 0;
        }
        if (arg1 != 0) {
            method3056(124);
        }
        arg0.field4260 = false;
        for (class281 var2 = arg0.method652(); var2 != null; var2 = arg0.method650()) {
            method3057(var2, 0);
        }
    }

    @OriginalMember(owner = "client!ms", name = "h", descriptor = "(I)Z")
    public final boolean method1450(int arg0) {
        field7748++;
        if (arg0 != 8191) {
            field7751 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)V")
    public static final void method3058(byte arg0) {
        class21.field274 = null;
        class341.field5097 = null;
        if (arg0 != 38) {
            method3057(null, 29);
        }
        class501.field7592 = null;
        class47.field722 = null;
        class473.field7232 = null;
        field7741++;
        class405.field5890 = null;
        class486.field7406 = null;
        class142.field2313 = null;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(I[BIIBLjava/lang/String;)I")
    public static final int method3059(int arg0, byte[] arg1, int arg2, int arg3, byte arg4, String arg5) {
        field7742++;
        int var6 = arg3 - arg0;
        int var7 = 0;
        if (arg4 >= -43) {
            field7751 = null;
        }
        while (var6 > var7) {
            char var8 = arg5.charAt(arg0 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg1[arg2 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg1[arg2 + var7] = -128;
            } else if (var8 == '‚') {
                arg1[arg2 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg1[arg2 + var7] = -125;
            } else if (var8 == '„') {
                arg1[arg2 + var7] = -124;
            } else if (var8 == '…') {
                arg1[arg2 + var7] = -123;
            } else if (var8 == '†') {
                arg1[arg2 + var7] = -122;
            } else if (var8 == '‡') {
                arg1[arg2 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg1[arg2 + var7] = -120;
            } else if (var8 == '‰') {
                arg1[arg2 + var7] = -119;
            } else if (var8 == 'Š') {
                arg1[arg2 + var7] = -118;
            } else if (var8 == '‹') {
                arg1[arg2 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg1[arg2 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg1[arg2 + var7] = -114;
            } else if (var8 == '‘') {
                arg1[arg2 + var7] = -111;
            } else if (var8 == '’') {
                arg1[arg2 + var7] = -110;
            } else if (var8 == '“') {
                arg1[arg2 + var7] = -109;
            } else if (var8 == '”') {
                arg1[arg2 + var7] = -108;
            } else if (var8 == '•') {
                arg1[arg2 + var7] = -107;
            } else if (var8 == '–') {
                arg1[arg2 + var7] = -106;
            } else if (var8 == '—') {
                arg1[arg2 + var7] = -105;
            } else if (var8 == '˜') {
                arg1[arg2 + var7] = -104;
            } else if (var8 == '™') {
                arg1[arg2 + var7] = -103;
            } else if (var8 == 'š') {
                arg1[arg2 + var7] = -102;
            } else if (var8 == '›') {
                arg1[arg2 + var7] = -101;
            } else if (var8 == 'œ') {
                arg1[arg2 + var7] = -100;
            } else if (var8 == 'ž') {
                arg1[arg2 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg1[arg2 + var7] = -97;
            } else {
                arg1[arg2 + var7] = 63;
            }
            var7++;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "(B)V")
    public static void method3060(byte arg0) {
        if (arg0 < -60) {
            field7750 = null;
            field7751 = null;
            field7740 = null;
            field7743 = null;
        }
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class511(Object arg0, int arg1) {
        super(arg1);
        this.field7747 = arg0;
    }
}
