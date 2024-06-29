import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lja")
public class class747 extends class568 {

    @OriginalMember(owner = "client!lja", name = "s", descriptor = "I")
    private int field11005;

    @OriginalMember(owner = "client!lja", name = "B", descriptor = "Z")
    private boolean field11003;

    @OriginalMember(owner = "client!lja", name = "C", descriptor = "I")
    private int field11015;

    @OriginalMember(owner = "client!lja", name = "p", descriptor = "I")
    private int field11006;

    @OriginalMember(owner = "client!lja", name = "l", descriptor = "I")
    public int field11025;

    @OriginalMember(owner = "client!lja", name = "v", descriptor = "I")
    private int field11009;

    @OriginalMember(owner = "client!lja", name = "z", descriptor = "Z")
    private boolean field11026;

    @OriginalMember(owner = "client!lja", name = "w", descriptor = "I")
    private int field11027;

    @OriginalMember(owner = "client!lja", name = "y", descriptor = "I")
    private int field11014;

    @OriginalMember(owner = "client!lja", name = "M", descriptor = "I")
    public int field11004;

    @OriginalMember(owner = "client!lja", name = "J", descriptor = "I")
    private int field11016;

    @OriginalMember(owner = "client!lja", name = "m", descriptor = "I")
    public int field11008;

    @OriginalMember(owner = "client!lja", name = "o", descriptor = "I")
    private int field11020;

    @OriginalMember(owner = "client!lja", name = "x", descriptor = "I")
    private int field11024;

    @OriginalMember(owner = "client!lja", name = "q", descriptor = "I")
    private int field11019;

    @OriginalMember(owner = "client!lja", name = "E", descriptor = "Ljava/lang/String;")
    private String field11017;

    @OriginalMember(owner = "client!lja", name = "L", descriptor = "Ljava/lang/String;")
    private String field11022;

    @OriginalMember(owner = "client!lja", name = "n", descriptor = "Ljava/lang/String;")
    private String field11010;

    @OriginalMember(owner = "client!lja", name = "N", descriptor = "Ljava/lang/String;")
    private String field11007;

    @OriginalMember(owner = "client!lja", name = "Q", descriptor = "[Ljava/lang/String;")
    private static final String[] field11032 = new String[] { method5438(method5437("~:Er\u0004:")), method5438(method5437("~:Er\u0000:")), method5438(method5437("~:Er\u0003:")), method5438(method5437("$~\u0015")), method5438(method5437("&~\u001d")), method5438(method5437("#`\nh")), method5438(method5437("~9J):")), method5438(method5437("&~\u0015")), method5438(method5437("&~\u0014")), method5438(method5437("$~\u0014")), method5438(method5437("jh\u0012\u0003t&")), method5438(method5437("~:Er~{>M(|:")), method5438(method5437("'~\u0014")), method5438(method5437("s T0'")), method5438(method5437("i~\nr?")), method5438(method5437("a%J")), method5438(method5437("\u007f1G")), method5438(method5437("'~\u0015")), method5438(method5437("|%H0")), method5438(method5437("s=@jv")), method5438(method5437("#`\ni")), method5438(method5437("e9J")), method5438(method5437("\u007f9G.-a?B(")), method5438(method5437("#`\nj")), method5438(method5437("~:Er\u0005:")), method5438(method5437("~:Er\u0007:")), method5438(method5437("~:Er\u0001:")), method5438(method5437("~:Er\u0006:")) };

    @OriginalMember(owner = "client!lja", name = "G", descriptor = "Lhl;")
    public static class556 field11001 = new class556(77, 0);

    @OriginalMember(owner = "client!lja", name = "P", descriptor = "Lvn;")
    public static class330 field11030 = new class330(71, 3);

    @OriginalMember(owner = "client!lja", name = "H", descriptor = "I")
    public static int field11031 = 0;

    @OriginalMember(owner = "client!lja", name = "I", descriptor = "I")
    public static int field11002;

    @OriginalMember(owner = "client!lja", name = "t", descriptor = "I")
    private int field11011;

    @OriginalMember(owner = "client!lja", name = "K", descriptor = "I")
    public static int field11012;

    @OriginalMember(owner = "client!lja", name = "r", descriptor = "I")
    public static int field11013;

    @OriginalMember(owner = "client!lja", name = "F", descriptor = "I")
    private int field11018;

    @OriginalMember(owner = "client!lja", name = "u", descriptor = "I")
    public static int field11021;

    @OriginalMember(owner = "client!lja", name = "O", descriptor = "I")
    public static int field11023;

    @OriginalMember(owner = "client!lja", name = "D", descriptor = "I")
    public static int field11029;

    @OriginalMember(owner = "client!lja", name = "A", descriptor = "Lgda;")
    public static class58 field11028;

    @OriginalMember(owner = "client!lja", name = "b", descriptor = "(B)V", line = 3)
    public static void method5430(byte arg0) {
        try {
            if (arg0 < 54) {
                field11030 = null;
            }
            field11028 = null;
            field11030 = null;
            field11001 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field11032[24] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lja", name = "a", descriptor = "(ILwq;)V", line = 17)
    public final void method5431(int arg0, class176 arg1) {
        try {
            arg1.method1678(5, arg0 ^ 0xFF14);
            field11002++;
            arg1.method1678(this.field11005, 65280);
            arg1.method1678(this.field11003 ? 1 : 0, 65280);
            arg1.method1678(this.field11015, 65280);
            arg1.method1678(this.field11006, 65280);
            arg1.method1678(this.field11025, 65280);
            arg1.method1678(this.field11009, 65280);
            arg1.method1678(this.field11004, 65280);
            arg1.method1678(this.field11026 ? 1 : 0, arg0 ^ 0xFF14);
            arg1.method1650((byte) -95, this.field11027);
            if (arg0 == 20) {
                arg1.method1678(this.field11014, 65280);
                arg1.method1671(27, this.field11008);
                arg1.method1650((byte) -95, this.field11024);
                arg1.method1678(this.field11020, 65280);
                arg1.method1678(this.field11016, 65280);
                arg1.method1678(this.field11019, 65280);
                arg1.method1632(-56, this.field11007);
                arg1.method1632(-19, this.field11010);
                arg1.method1632(-17, this.field11022);
                arg1.method1632(-121, this.field11017);
                arg1.method1678(this.field11018, 65280);
                arg1.method1650((byte) -95, this.field11011);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field11032[27] + arg0 + ',' + (arg1 == null ? field11032[18] : field11032[14]) + ')');
        }
    }

    @OriginalMember(owner = "client!lja", name = "a", descriptor = "(III)Lii;", line = 53)
    public static final class580 method5432(int arg0, int arg1, int arg2) {
        try {
            field11023++;
            class580 var3 = new class580();
            if (arg2 != -24907) {
                method5435((byte) 60);
            }
            var3.field8350 = arg0 + 1 + 5;
            var3.field8354 = arg1 + 1 + 5;
            var3.field8356 = -1;
            var3.field8345 = -1;
            var3.field8355 = new int[var3.field8354][var3.field8350];
            var3.method4251(true);
            return var3;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field11032[26] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!lja", name = "a", descriptor = "(B)Lsf;", line = 73)
    public static final class551 method5433(byte arg0) {
        try {
            field11021++;
            if (arg0 != 55) {
                return null;
            }
            class551 var1 = (class551) class502.field7512.method5147((byte) 97);
            if (var1 != null) {
                var1.method4173(-1);
                var1.method3558((byte) 127);
                return var1;
            }
            class551 var2;
            do {
                var2 = (class551) class77.field1149.method5147((byte) 86);
                if (var2 == null) {
                    return null;
                }
                if (var2.method4085(63) > class712.method5167(-2334)) {
                    return null;
                }
                var2.method4173(-1);
                var2.method3558((byte) 70);
            } while ((Long.MIN_VALUE & var2.field7075) == 0L);
            return var2;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field11032[25] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lja", name = "a", descriptor = "(I)I", line = 136)
    public final int method5434(int arg0) {
        try {
            field11029++;
            byte var2 = 23;
            int var3 = var2 + class313.method2685((byte) -40, this.field11007);
            int var4 = var3 + class313.method2685((byte) -40, this.field11010);
            int var5 = var4 + class313.method2685((byte) -40, this.field11022);
            if (arg0 > 0) {
                this.field11019 = 73;
            }
            return var5 + class313.method2685((byte) -40, this.field11017);
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field11032[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lja", name = "c", descriptor = "(B)[Lhm;", line = 155)
    public static final class230[] method5435(byte arg0) {
        try {
            field11013++;
            return arg0 > -65 ? null : new class230[] { class245.field3774, class245.field3778, class245.field3780, class245.field3782, class245.field3783, class245.field3784, class245.field3785, class245.field3786, class245.field3787, class245.field3788, class245.field3789, class245.field3790, class245.field3791 };
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field11032[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lja", name = "b", descriptor = "(I)V", line = 175)
    private final void method5436(int arg0) {
        try {
            if (arg0 != -7641) {
                this.field11027 = 127;
            }
            if (this.field11007.length() > 40) {
                this.field11007 = this.field11007.substring(0, 40);
            }
            field11012++;
            if (this.field11010.length() > 40) {
                this.field11010 = this.field11010.substring(0, 40);
            }
            if (this.field11022.length() > 10) {
                this.field11022 = this.field11022.substring(0, 10);
            }
            if (this.field11017.length() > 10) {
                this.field11017 = this.field11017.substring(0, 10);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11032[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lja", name = "<init>", descriptor = "()V", line = 200)
    public class747() {
    }

    @OriginalMember(owner = "client!lja", name = "<init>", descriptor = "(ZLtga;)V", line = 205)
    public class747(boolean arg0, class61 arg1) {
        try {
            if (arg0) {
                if (class61.field790.startsWith(field11032[21])) {
                    this.field11005 = 1;
                } else if (class61.field790.startsWith(field11032[16])) {
                    this.field11005 = 2;
                } else if (class61.field790.startsWith(field11032[6])) {
                    this.field11005 = 3;
                } else {
                    this.field11005 = 4;
                }
                if (class61.field805.startsWith(field11032[19]) || class61.field805.startsWith(field11032[10])) {
                    this.field11003 = true;
                } else {
                    this.field11003 = false;
                }
                if (this.field11005 == 1) {
                    if (class61.field792.indexOf(field11032[8]) != -1) {
                        this.field11015 = 1;
                    } else if (class61.field792.indexOf(field11032[7]) != -1) {
                        this.field11015 = 2;
                    } else if (class61.field792.indexOf(field11032[4]) != -1) {
                        this.field11015 = 3;
                    } else if (class61.field792.indexOf(field11032[12]) != -1) {
                        this.field11015 = 4;
                    } else if (class61.field792.indexOf(field11032[17]) != -1) {
                        this.field11015 = 5;
                    } else if (class61.field792.indexOf(field11032[9]) != -1) {
                        this.field11015 = 6;
                    } else if (class61.field792.indexOf(field11032[3]) != -1) {
                        this.field11015 = 7;
                    }
                } else if (this.field11005 == 2) {
                    if (class61.field792.indexOf(field11032[5]) != -1) {
                        this.field11015 = 20;
                    } else if (class61.field792.indexOf(field11032[20]) != -1) {
                        this.field11015 = 21;
                    } else if (class61.field792.indexOf(field11032[23]) != -1) {
                        this.field11015 = 22;
                    }
                }
                if (class61.field814.toLowerCase().indexOf(field11032[15]) != -1) {
                    this.field11006 = 1;
                } else if (class61.field814.toLowerCase().indexOf(field11032[22]) != -1) {
                    this.field11006 = 2;
                } else if (class61.field814.toLowerCase().indexOf(field11032[13]) == -1) {
                    this.field11006 = 4;
                } else {
                    this.field11006 = 3;
                }
                int var3 = 2;
                int var4 = 0;
                try {
                    while (class61.field803.length() > var3) {
                        char var5 = class61.field803.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var4 = var4 * 10 + var5 - 48;
                        var3++;
                    }
                } catch (Exception var17) {
                }
                this.field11025 = var4;
                int var6 = class61.field803.indexOf(46, 2) + 1;
                int var7 = 0;
                try {
                    while (var6 < class61.field803.length()) {
                        char var8 = class61.field803.charAt(var6);
                        if (var8 < '0' || var8 > '9') {
                            break;
                        }
                        var7 = var7 * 10 + (var8 - 48);
                        var6++;
                    }
                } catch (Exception var16) {
                }
                this.field11009 = var7;
                int var9 = 0;
                int var10 = class61.field803.indexOf(95, 4) + 1;
                try {
                    while (var10 < class61.field803.length()) {
                        char var11 = class61.field803.charAt(var10);
                        if (var11 < '0' || var11 > '9') {
                            break;
                        }
                        var10++;
                        var9 = var9 * 10 + var11 - 48;
                    }
                } catch (Exception var15) {
                }
                if (arg1.field806) {
                    this.field11026 = false;
                } else {
                    this.field11026 = true;
                }
                this.field11027 = class168.field2721;
                if (this.field11025 > 3) {
                    this.field11014 = class201.field3184;
                } else {
                    this.field11014 = 0;
                }
                this.field11004 = var9;
                try {
                    int[] var12 = HardwareInfo.getCPUInfo();
                    if (var12 != null && var12.length == 7) {
                        this.field11016 = var12[4];
                        this.field11008 = var12[6];
                        this.field11020 = var12[3];
                        this.field11024 = var12[2];
                        this.field11019 = var12[5];
                    }
                } catch (Throwable var14) {
                    this.field11008 = 0;
                }
            }
            if (this.field11017 == null) {
                this.field11017 = "";
            }
            if (this.field11022 == null) {
                this.field11022 = "";
            }
            if (this.field11010 == null) {
                this.field11010 = "";
            }
            if (this.field11007 == null) {
                this.field11007 = "";
            }
            this.method5436(-7641);
        } catch (RuntimeException var18) {
            throw class590.method4333(var18, field11032[11] + arg0 + ',' + (arg1 == null ? field11032[18] : field11032[14]) + ')');
        }
    }

    @OriginalMember(owner = "client!lja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5437(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x42);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5438(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 18;
                    break;
                case 1:
                    var10005 = 80;
                    break;
                case 2:
                    var10005 = 36;
                    break;
                case 3:
                    var10005 = 92;
                    break;
                default:
                    var10005 = 66;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
