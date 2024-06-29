import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class528 extends class184 {

    @OriginalMember(owner = "client!lh", name = "G", descriptor = "I")
    private int field7529;

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "Z")
    private boolean field7514;

    @OriginalMember(owner = "client!lh", name = "v", descriptor = "I")
    private int field7518;

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
    private int field7512;

    @OriginalMember(owner = "client!lh", name = "J", descriptor = "I")
    private int field7532;

    @OriginalMember(owner = "client!lh", name = "w", descriptor = "I")
    private int field7519;

    @OriginalMember(owner = "client!lh", name = "H", descriptor = "I")
    private int field7530;

    @OriginalMember(owner = "client!lh", name = "u", descriptor = "I")
    private int field7517;

    @OriginalMember(owner = "client!lh", name = "A", descriptor = "Z")
    private boolean field7523;

    @OriginalMember(owner = "client!lh", name = "x", descriptor = "I")
    private int field7520;

    @OriginalMember(owner = "client!lh", name = "K", descriptor = "I")
    public int field7533;

    @OriginalMember(owner = "client!lh", name = "B", descriptor = "I")
    private int field7524;

    @OriginalMember(owner = "client!lh", name = "L", descriptor = "I")
    private int field7534;

    @OriginalMember(owner = "client!lh", name = "O", descriptor = "I")
    private int field7537;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
    private int field7510;

    @OriginalMember(owner = "client!lh", name = "y", descriptor = "Ljava/lang/String;")
    private String field7521;

    @OriginalMember(owner = "client!lh", name = "D", descriptor = "Ljava/lang/String;")
    private String field7526;

    @OriginalMember(owner = "client!lh", name = "I", descriptor = "Ljava/lang/String;")
    private String field7531;

    @OriginalMember(owner = "client!lh", name = "M", descriptor = "Ljava/lang/String;")
    private String field7535;

    @OriginalMember(owner = "client!lh", name = "F", descriptor = "Ljt;")
    public static class106 field7528 = new class106(4);

    @OriginalMember(owner = "client!lh", name = "N", descriptor = "[[B")
    public static byte[][] field7536 = new byte[1000][];

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "I")
    private int field7509;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
    public static int field7511;

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "I")
    public static int field7515;

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "I")
    public static int field7516;

    @OriginalMember(owner = "client!lh", name = "z", descriptor = "I")
    public static int field7522;

    @OriginalMember(owner = "client!lh", name = "C", descriptor = "I")
    private int field7525;

    @OriginalMember(owner = "client!lh", name = "E", descriptor = "I")
    public static int field7527;

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "Lcr;")
    public static class575 field7513;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lbs;I[II)V")
    public static final void method3084(class689 arg0, int arg1, int[] arg2, int arg3) {
        if (arg0.field6039 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg0.field6039.length; var5++) {
                if (arg0.field6039[var5] != arg2[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg0.field6094 != -1) {
                class288 var6 = class742.field10404.method2663(0, arg0.field6094);
                int var7 = var6.field4094;
                if (var7 == 1) {
                    arg0.field6117 = 0;
                    arg0.field6038 = 0;
                    arg0.field6056 = arg1;
                    arg0.field6091 = 1;
                    arg0.field6040 = 0;
                    if (!arg0.field6095) {
                        class294.method1865(arg0.field6040, arg0, var6, -26);
                    }
                }
                if (var7 == 2) {
                    arg0.field6117 = 0;
                }
            }
        }
        field7511++;
        boolean var8 = true;
        for (int var9 = arg3; var9 < arg2.length; var9++) {
            if (arg2[var9] != -1) {
                var8 = false;
            }
            if (arg0.field6039 == null || arg0.field6039[var9] == -1 || class742.field10404.method2663(arg3, arg2[var9]).field4098 >= class742.field10404.method2663(0, arg0.field6039[var9]).field4098) {
                arg0.field6056 = arg1;
                arg0.field6039 = arg2;
                break;
            }
        }
        if (var8) {
            arg0.field6056 = arg1;
            arg0.field6039 = arg2;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILrg;)V")
    public final void method3085(int arg0, class645 arg1) {
        field7522++;
        arg1.method3730(111, 5);
        arg1.method3730(102, this.field7529);
        arg1.method3730(111, this.field7514 ? 1 : 0);
        arg1.method3730(125, this.field7518);
        arg1.method3730(105, this.field7512);
        arg1.method3730(102, this.field7532);
        arg1.method3730(123, this.field7519);
        arg1.method3730(123, this.field7520);
        arg1.method3730(104, this.field7523 ? 1 : 0);
        arg1.method3702(this.field7530, (byte) -115);
        arg1.method3730(104, this.field7517);
        arg1.method3754((byte) 80, this.field7533);
        arg1.method3702(this.field7537, (byte) -107);
        arg1.method3730(107, this.field7534);
        arg1.method3730(111, this.field7524);
        arg1.method3730(109, this.field7510);
        arg1.method3725(this.field7531, (byte) -65);
        int var3 = -42 / ((-arg0 - 32) / 55);
        arg1.method3725(this.field7526, (byte) -96);
        arg1.method3725(this.field7535, (byte) -108);
        arg1.method3725(this.field7521, (byte) -76);
        arg1.method3730(101, this.field7525);
        arg1.method3702(this.field7509, (byte) -114);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)I")
    public final int method3086(byte arg0) {
        field7527++;
        byte var2 = 23;
        int var3 = var2 + class255.method1672(this.field7531, 2);
        int var4 = var3 + class255.method1672(this.field7526, 2);
        int var5 = 78 % ((-arg0 - 43) / 51);
        int var6 = var4 + class255.method1672(this.field7535, 2);
        return var6 + class255.method1672(this.field7521, 2);
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)V")
    public static void method3087(byte arg0) {
        field7536 = null;
        if (arg0 <= -4) {
            field7513 = null;
            field7528 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
    private final void method3088(int arg0) {
        if (this.field7531.length() > 40) {
            this.field7531 = this.field7531.substring(0, 40);
        }
        field7515++;
        if (this.field7526.length() > 40) {
            this.field7526 = this.field7526.substring(0, 40);
        }
        if (this.field7535.length() > 10) {
            this.field7535 = this.field7535.substring(0, 10);
        }
        if (arg0 < 9) {
            this.method3086((byte) 124);
        }
        if (this.field7521.length() > 10) {
            this.field7521 = this.field7521.substring(0, 10);
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V")
    public static final void method3089(int arg0) {
        field7516++;
        int var1 = class140.field1857.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class140.field1857[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class96.field1360; var4++) {
                    if (class614.field8665[var4] == class434.field6462[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class614.field8665[class96.field1360] = class434.field6462[var2];
                    var3 = class96.field1360++;
                }
                class645 var5 = new class645(class140.field1857[var2]);
                int var6 = 0;
                while (class140.field1857[var2].length > var5.field9084 && var6 < 511 && class441.field6552 < 1023) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method3712((byte) 19);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 & 0x3F;
                    int var12 = (class434.field6462[var2] >> 8) * 64 + var10 - class361.field5224;
                    int var13 = (class434.field6462[var2] & 0xFF) * 64 - (class582.field8288 - var11);
                    class348 var14 = class74.field1032.method3327(var5.method3712((byte) 97), false);
                    class432 var15 = (class432) class497.field7067.method2287((long) var7, (byte) -117);
                    if (var15 == null && (var14.field5100 & 0x1) > 0 && class700.field9654 == var9 && var12 >= 0 && class194.field2946 > (var14.field5053 + var12) && var13 >= 0 && var13 + var14.field5053 < class255.field3656) {
                        class282 var16 = new class282();
                        var16.field6118 = var7;
                        class432 var17 = new class432(var16);
                        class497.field7067.method2278((byte) -113, (long) var7, var17);
                        class488.field6985[class567.field8058++] = var17;
                        class338.field4921[class441.field6552++] = var7;
                        var16.field6121 = class357.field5189;
                        var16.method1806(-9430, var14);
                        var16.method2575(-117, var16.field4008.field5053);
                        var16.field6088 = var16.field4008.field5070 << 3;
                        var16.method2585(true, (var16.field4008.field5075 + 4 & 0x7C400007) << 11, (byte) 17);
                        var16.method1802(-111, var9, true, var13, var12, var16.method2579(false));
                    }
                }
            }
        }
        if (arg0 != -30266) {
            method3084(null, 23, null, 86);
        }
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
    public class528() {
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(ZLge;)V")
    public class528(boolean arg0, class711 arg1) {
        if (arg0) {
            if (class711.field10015.startsWith("win")) {
                this.field7529 = 1;
            } else if (class711.field10015.startsWith("mac")) {
                this.field7529 = 2;
            } else if (class711.field10015.startsWith("linux")) {
                this.field7529 = 3;
            } else {
                this.field7529 = 4;
            }
            if (class711.field10010.startsWith("amd64") || class711.field10010.startsWith("x86_64")) {
                this.field7514 = true;
            } else {
                this.field7514 = false;
            }
            if (this.field7529 == 1) {
                if (class711.field10027.indexOf("4.0") != -1) {
                    this.field7518 = 1;
                } else if (class711.field10027.indexOf("4.1") != -1) {
                    this.field7518 = 2;
                } else if (class711.field10027.indexOf("4.9") != -1) {
                    this.field7518 = 3;
                } else if (class711.field10027.indexOf("5.0") != -1) {
                    this.field7518 = 4;
                } else if (class711.field10027.indexOf("5.1") != -1) {
                    this.field7518 = 5;
                } else if (class711.field10027.indexOf("6.0") != -1) {
                    this.field7518 = 6;
                } else if (class711.field10027.indexOf("6.1") != -1) {
                    this.field7518 = 7;
                }
            } else if (this.field7529 == 2) {
                if (class711.field10027.indexOf("10.4") != -1) {
                    this.field7518 = 20;
                } else if (class711.field10027.indexOf("10.5") != -1) {
                    this.field7518 = 21;
                } else if (class711.field10027.indexOf("10.6") != -1) {
                    this.field7518 = 22;
                }
            }
            if (class711.field10023.toLowerCase().indexOf("sun") != -1) {
                this.field7512 = 1;
            } else if (class711.field10023.toLowerCase().indexOf("microsoft") != -1) {
                this.field7512 = 2;
            } else if (class711.field10023.toLowerCase().indexOf("apple") == -1) {
                this.field7512 = 4;
            } else {
                this.field7512 = 3;
            }
            int var3 = 2;
            int var4 = 0;
            try {
                while (class711.field10035.length() > var3) {
                    char var5 = class711.field10035.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + var5 - 48;
                    var3++;
                }
            } catch (Exception var16) {
            }
            this.field7532 = var4;
            int var6 = 0;
            int var7 = class711.field10035.indexOf(46, 2) + 1;
            try {
                while (class711.field10035.length() > var7) {
                    char var8 = class711.field10035.charAt(var7);
                    if (var8 < '0' || var8 > '9') {
                        break;
                    }
                    var6 = var6 * 10 + var8 - 48;
                    var7++;
                }
            } catch (Exception var15) {
            }
            this.field7519 = var6;
            int var9 = 0;
            int var10 = class711.field10035.indexOf(95, 4) + 1;
            try {
                while (var10 < class711.field10035.length()) {
                    char var11 = class711.field10035.charAt(var10);
                    if (var11 < '0' || var11 > '9') {
                        break;
                    }
                    var10++;
                    var9 = var9 * 10 + (var11 - '0');
                }
            } catch (Exception var14) {
            }
            this.field7530 = class265.field3794;
            if (this.field7532 <= 3) {
                this.field7517 = 0;
            } else {
                this.field7517 = class11.field154;
            }
            if (arg1.field10019) {
                this.field7523 = false;
            } else {
                this.field7523 = true;
            }
            this.field7520 = var9;
            try {
                int[] var12 = HardwareInfo.getCPUInfo();
                if (var12 != null && var12.length == 7) {
                    this.field7533 = var12[6];
                    this.field7524 = var12[4];
                    this.field7534 = var12[3];
                    this.field7537 = var12[2];
                    this.field7510 = var12[5];
                }
            } catch (Throwable var13) {
                this.field7533 = 0;
            }
        }
        if (this.field7521 == null) {
            this.field7521 = "";
        }
        if (this.field7526 == null) {
            this.field7526 = "";
        }
        if (this.field7531 == null) {
            this.field7531 = "";
        }
        if (this.field7535 == null) {
            this.field7535 = "";
        }
        this.method3088(88);
    }
}
