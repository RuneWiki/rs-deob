import jaclib.hardware_info.HardwareInfo;
import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public class class459 extends class424 {

    @OriginalMember(owner = "client!raa", name = "p", descriptor = "I")
    private int field6020;

    @OriginalMember(owner = "client!raa", name = "r", descriptor = "Z")
    private boolean field6022;

    @OriginalMember(owner = "client!raa", name = "v", descriptor = "I")
    private int field6026;

    @OriginalMember(owner = "client!raa", name = "A", descriptor = "I")
    private int field6031;

    @OriginalMember(owner = "client!raa", name = "n", descriptor = "I")
    private int field6018;

    @OriginalMember(owner = "client!raa", name = "z", descriptor = "I")
    private int field6030;

    @OriginalMember(owner = "client!raa", name = "t", descriptor = "I")
    private int field6024;

    @OriginalMember(owner = "client!raa", name = "B", descriptor = "Z")
    private boolean field6032;

    @OriginalMember(owner = "client!raa", name = "s", descriptor = "I")
    private int field6023;

    @OriginalMember(owner = "client!raa", name = "u", descriptor = "I")
    private int field6025;

    @OriginalMember(owner = "client!raa", name = "w", descriptor = "I")
    private int field6027;

    @OriginalMember(owner = "client!raa", name = "q", descriptor = "I")
    private int field6021;

    @OriginalMember(owner = "client!raa", name = "o", descriptor = "I")
    public static int field6019;

    @OriginalMember(owner = "client!raa", name = "x", descriptor = "I")
    public static int field6028;

    @OriginalMember(owner = "client!raa", name = "y", descriptor = "I")
    public static int field6029;

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(Lfd;I)V")
    public final void method2581(class418 arg0, int arg1) {
        field6029++;
        arg0.method2352(true, 3);
        arg0.method2352(true, this.field6020);
        arg0.method2352(true, this.field6022 ? 1 : 0);
        arg0.method2352(true, this.field6026);
        arg0.method2352(true, this.field6031);
        if (arg1 != 18538) {
            this.field6020 = 124;
        }
        arg0.method2352(true, this.field6018);
        arg0.method2352(true, this.field6030);
        arg0.method2352(true, this.field6025);
        arg0.method2352(true, this.field6032 ? 1 : 0);
        arg0.method2386(this.field6024, 1103587288);
        arg0.method2352(true, this.field6023);
        arg0.method2367((byte) -75, this.field6027);
        arg0.method2353(this.field6021, (byte) -43);
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(IZIIILpe;I)V")
    public static final void method2582(int arg0, boolean arg1, int arg2, int arg3, int arg4, class615 arg5, int arg6) {
        class557.field7280 = arg0;
        class521.field6803 = arg2;
        if (arg4 != 17821) {
            return;
        }
        class332.field4314 = arg6;
        class27.field403 = arg3;
        class426.field5523 = 1;
        class414.field5327 = arg5;
        field6028++;
        class64.field867 = arg1;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(B)V")
    public static final void method2583(byte arg0) {
        field6019++;
        for (class57 var1 = (class57) class658.field9176.method2090(true); var1 != null; var1 = (class57) class658.field9176.method2088(-152)) {
            if (class33.method266(-12281, var1.field776)) {
                class469.method2604((byte) 79, var1);
            }
        }
        if (class291.field3758 == 1) {
            class345.method1985((byte) 0);
        } else {
            class197.method1303(class399.field5100, class630.field8791, -58, class238.field3206, class539.field7003);
            int var2 = class411.field5305.method2900(true, class604.field8148.method3280((byte) 96, class144.field1890));
            for (class57 var3 = (class57) class658.field9176.method2090(true); var3 != null; var3 = (class57) class658.field9176.method2088(-152)) {
                int var5 = class484.method2668(59, var3);
                if (var2 < var5) {
                    var2 = var5;
                }
            }
            class238.field3206 = var2 + 8;
            class539.field7003 = class291.field3758 * 16 + (class288.field3723 ? 26 : 22);
        }
        int var4 = 116 % ((-arg0 - 72) / 34);
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "()V")
    public static final void method2584() {
        if (class515.field6748 != null) {
            for (int var0 = 0; var0 < class515.field6748.length; var0++) {
                for (int var1 = 0; var1 < class590.field8010; var1++) {
                    for (int var2 = 0; var2 < class151.field1933; var2++) {
                        if (class515.field6748[var0][var1][var2] != null) {
                            class515.field6748[var0][var1][var2].method2819((byte) 117);
                        }
                        class515.field6748[var0][var1][var2] = null;
                    }
                }
            }
        }
        class515.field6748 = null;
        class353.field4540 = null;
        if (class168.field2096 != null) {
            for (int var3 = 0; var3 < class168.field2096.length; var3++) {
                for (int var4 = 0; var4 < class590.field8010; var4++) {
                    for (int var5 = 0; var5 < class151.field1933; var5++) {
                        if (class168.field2096[var3][var4][var5] != null) {
                            class168.field2096[var3][var4][var5].method2819((byte) 100);
                        }
                        class168.field2096[var3][var4][var5] = null;
                    }
                }
            }
        }
        class168.field2096 = null;
        class477.field6327 = null;
        class483.field6438 = null;
        class392.field4997 = null;
        class314.field4069 = 0;
        if (class473.field6165 != null) {
            for (int var6 = 0; var6 < class314.field4069; var6++) {
                class473.field6165[var6] = null;
            }
        }
        if (class57.field772 != null) {
            for (int var7 = 0; var7 < class516.field6758; var7++) {
                class57.field772[var7] = null;
            }
            class516.field6758 = 0;
        }
        if (class421.field5440 != null) {
            for (int var8 = 0; var8 < class421.field5444; var8++) {
                class421.field5440[var8] = null;
            }
            for (int var9 = 0; var9 < class20.field223; var9++) {
                for (int var10 = 0; var10 < class590.field8010; var10++) {
                    for (int var11 = 0; var11 < class151.field1933; var11++) {
                        class283.field3689[var9][var10][var11] = 0L;
                    }
                }
            }
            class421.field5444 = 0;
        }
        class105.field1384 = null;
        class35.method275(18989);
        class509.field6675.method2100((byte) -78);
        class315.field4084 = null;
        class176.field2196 = null;
        class612.field8277 = null;
        class89.field1174 = null;
        class315.field4080 = null;
        class273.field3602 = null;
    }

    @OriginalMember(owner = "client!raa", name = "<init>", descriptor = "(ZLufa;)V")
    public class459(boolean arg0, class140 arg1) {
        if (arg0) {
            if (class140.field1828.startsWith("win")) {
                this.field6020 = 1;
            } else if (class140.field1828.startsWith("mac")) {
                this.field6020 = 2;
            } else if (class140.field1828.startsWith("linux")) {
                this.field6020 = 3;
            } else {
                this.field6020 = 4;
            }
            if (class140.field1822.startsWith("amd64") || class140.field1822.startsWith("x86_64")) {
                this.field6022 = true;
            } else {
                this.field6022 = false;
            }
            if (this.field6020 == 1) {
                if (class140.field1818.indexOf("4.0") != -1) {
                    this.field6026 = 1;
                } else if (class140.field1818.indexOf("4.1") != -1) {
                    this.field6026 = 2;
                } else if (class140.field1818.indexOf("4.9") != -1) {
                    this.field6026 = 3;
                } else if (class140.field1818.indexOf("5.0") != -1) {
                    this.field6026 = 4;
                } else if (class140.field1818.indexOf("5.1") != -1) {
                    this.field6026 = 5;
                } else if (class140.field1818.indexOf("6.0") != -1) {
                    this.field6026 = 6;
                } else if (class140.field1818.indexOf("6.1") != -1) {
                    this.field6026 = 7;
                }
            } else if (this.field6020 == 2) {
                if (class140.field1818.indexOf("10.4") != -1) {
                    this.field6026 = 20;
                } else if (class140.field1818.indexOf("10.5") != -1) {
                    this.field6026 = 21;
                } else if (class140.field1818.indexOf("10.6") != -1) {
                    this.field6026 = 22;
                }
            }
            if (class140.field1834.toLowerCase().indexOf("sun") != -1) {
                this.field6031 = 1;
            } else if (class140.field1834.toLowerCase().indexOf("microsoft") != -1) {
                this.field6031 = 2;
            } else if (class140.field1834.toLowerCase().indexOf("apple") == -1) {
                this.field6031 = 4;
            } else {
                this.field6031 = 3;
            }
            int var3 = 2;
            int var4 = 0;
            try {
                while (var3 < class140.field1837.length()) {
                    char var5 = class140.field1837.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var4 * 10 - (48 - var5);
                }
            } catch (Exception var16) {
            }
            this.field6018 = var4;
            int var6 = class140.field1837.indexOf(46, 2) + 1;
            int var7 = 0;
            try {
                while (class140.field1837.length() > var6) {
                    char var8 = class140.field1837.charAt(var6);
                    if (var8 < '0' || var8 > '9') {
                        break;
                    }
                    var7 = var7 * 10 + var8 - 48;
                    var6++;
                }
            } catch (Exception var15) {
            }
            this.field6030 = var7;
            int var9 = class140.field1837.indexOf(95, 4) + 1;
            int var10 = 0;
            try {
                while (class140.field1837.length() > var9) {
                    char var11 = class140.field1837.charAt(var9);
                    if (var11 < '0' || var11 > '9') {
                        break;
                    }
                    var10 = var10 * 10 + var11 - 48;
                    var9++;
                }
            } catch (Exception var14) {
            }
            this.field6024 = class331.field4308;
            if (arg1.field1823) {
                this.field6032 = false;
            } else {
                this.field6032 = true;
            }
            if (this.field6018 > 3) {
                this.field6023 = class590.field8011;
            } else {
                this.field6023 = 0;
            }
            this.field6025 = var10;
            try {
                this.field6027 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
            } catch (Throwable var13) {
                this.field6027 = 0;
            }
            try {
                this.field6021 = HardwareInfo.getPackedBasicCPUInfo();
            } catch (Throwable var12) {
            }
        }
    }
}
