import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class235 extends class362 {

    @OriginalMember(owner = "client!fa", name = "K", descriptor = "I")
    private int field3423;

    @OriginalMember(owner = "client!fa", name = "F", descriptor = "Z")
    private boolean field3418;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
    private int field3405;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
    private int field3404;

    @OriginalMember(owner = "client!fa", name = "N", descriptor = "I")
    private int field3426;

    @OriginalMember(owner = "client!fa", name = "C", descriptor = "I")
    private int field3415;

    @OriginalMember(owner = "client!fa", name = "E", descriptor = "Z")
    private boolean field3417;

    @OriginalMember(owner = "client!fa", name = "J", descriptor = "I")
    private int field3422;

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
    private int field3402;

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "I")
    private int field3409;

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "I")
    private int field3408;

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
    private int field3406;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "I")
    private int field3401;

    @OriginalMember(owner = "client!fa", name = "A", descriptor = "I")
    private int field3413;

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "I")
    public int field3419;

    @OriginalMember(owner = "client!fa", name = "H", descriptor = "Ljava/lang/String;")
    private String field3420;

    @OriginalMember(owner = "client!fa", name = "B", descriptor = "Ljava/lang/String;")
    private String field3414;

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "Ljava/lang/String;")
    private String field3407;

    @OriginalMember(owner = "client!fa", name = "L", descriptor = "Ljava/lang/String;")
    private String field3424;

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "Lpn;")
    public static class742 field3412 = new class742();

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!fa", name = "x", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!fa", name = "D", descriptor = "I")
    private int field3416;

    @OriginalMember(owner = "client!fa", name = "I", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!fa", name = "M", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!fa", name = "O", descriptor = "I")
    private int field3427;

    @OriginalMember(owner = "client!fa", name = "y", descriptor = "Ltha;")
    public static class295 field3411;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
    private final void method1636(int arg0) {
        if (this.field3414.length() > 40) {
            this.field3414 = this.field3414.substring(0, 40);
        }
        field3425++;
        if (this.field3424.length() > 40) {
            this.field3424 = this.field3424.substring(0, 40);
        }
        if (this.field3420.length() > arg0) {
            this.field3420 = this.field3420.substring(0, 10);
        }
        if (this.field3407.length() > 10) {
            this.field3407 = this.field3407.substring(0, 10);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)I")
    public final int method1637(byte arg0) {
        field3410++;
        byte var2 = 23;
        int var3 = var2 + class138.method1118((byte) -114, this.field3414);
        int var4 = var3 + class138.method1118((byte) -114, this.field3424);
        int var5 = var4 + class138.method1118((byte) -114, this.field3420);
        int var6 = 42 % ((44 - arg0) / 49);
        return var5 + class138.method1118((byte) -114, this.field3407);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILcea;)V")
    public final void method1638(int arg0, class215 arg1) {
        arg1.method1526(false, 5);
        field3421++;
        arg1.method1526(false, this.field3423);
        arg1.method1526(false, this.field3418 ? 1 : 0);
        arg1.method1526(false, this.field3405);
        arg1.method1526(false, this.field3404);
        arg1.method1526(false, this.field3426);
        arg1.method1526(false, this.field3415);
        arg1.method1526(false, this.field3422);
        arg1.method1526(false, this.field3417 ? 1 : 0);
        arg1.method1485((byte) 107, this.field3402);
        arg1.method1526(false, this.field3409);
        arg1.method1488(arg0 ^ 0xFFFFD949, this.field3419);
        arg1.method1485((byte) 107, this.field3401);
        arg1.method1526(false, this.field3408);
        arg1.method1526(false, this.field3406);
        arg1.method1526(false, this.field3413);
        arg1.method1534(this.field3414, 123);
        arg1.method1534(this.field3424, -45);
        arg1.method1534(this.field3420, 100);
        if (arg0 == 1) {
            arg1.method1534(this.field3407, -14);
            arg1.method1526(false, this.field3416);
            arg1.method1485((byte) 107, this.field3427);
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V")
    public static void method1639(int arg0) {
        int var1 = 80 / ((52 - arg0) / 57);
        field3412 = null;
        field3411 = null;
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(I)I")
    public static final int method1640(int arg0) {
        if (arg0 != -1) {
            method1640(20);
        }
        field3403++;
        return class599.field8217;
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
    public class235() {
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(ZLwea;)V")
    public class235(boolean arg0, class158 arg1) {
        if (arg0) {
            if (class158.field2551.startsWith("win")) {
                this.field3423 = 1;
            } else if (class158.field2551.startsWith("mac")) {
                this.field3423 = 2;
            } else if (class158.field2551.startsWith("linux")) {
                this.field3423 = 3;
            } else {
                this.field3423 = 4;
            }
            if (class158.field2528.startsWith("amd64") || class158.field2528.startsWith("x86_64")) {
                this.field3418 = true;
            } else {
                this.field3418 = false;
            }
            if (this.field3423 == 1) {
                if (class158.field2526.indexOf("4.0") != -1) {
                    this.field3405 = 1;
                } else if (class158.field2526.indexOf("4.1") != -1) {
                    this.field3405 = 2;
                } else if (class158.field2526.indexOf("4.9") != -1) {
                    this.field3405 = 3;
                } else if (class158.field2526.indexOf("5.0") != -1) {
                    this.field3405 = 4;
                } else if (class158.field2526.indexOf("5.1") != -1) {
                    this.field3405 = 5;
                } else if (class158.field2526.indexOf("6.0") != -1) {
                    this.field3405 = 6;
                } else if (class158.field2526.indexOf("6.1") != -1) {
                    this.field3405 = 7;
                }
            } else if (this.field3423 == 2) {
                if (class158.field2526.indexOf("10.4") != -1) {
                    this.field3405 = 20;
                } else if (class158.field2526.indexOf("10.5") != -1) {
                    this.field3405 = 21;
                } else if (class158.field2526.indexOf("10.6") != -1) {
                    this.field3405 = 22;
                }
            }
            if (class158.field2530.toLowerCase().indexOf("sun") != -1) {
                this.field3404 = 1;
            } else if (class158.field2530.toLowerCase().indexOf("microsoft") != -1) {
                this.field3404 = 2;
            } else if (class158.field2530.toLowerCase().indexOf("apple") == -1) {
                this.field3404 = 4;
            } else {
                this.field3404 = 3;
            }
            int var3 = 2;
            int var4 = 0;
            try {
                while (var3 < class158.field2544.length()) {
                    char var5 = class158.field2544.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var4 * 10 + var5 - 48;
                }
            } catch (Exception var16) {
            }
            this.field3426 = var4;
            int var6 = class158.field2544.indexOf(46, 2) + 1;
            int var7 = 0;
            try {
                while (class158.field2544.length() > var6) {
                    char var8 = class158.field2544.charAt(var6);
                    if (var8 < '0' || var8 > '9') {
                        break;
                    }
                    var7 = var7 * 10 + var8 - 48;
                    var6++;
                }
            } catch (Exception var15) {
            }
            this.field3415 = var7;
            int var9 = 0;
            int var10 = class158.field2544.indexOf(95, 4) + 1;
            try {
                while (class158.field2544.length() > var10) {
                    char var11 = class158.field2544.charAt(var10);
                    if (var11 < '0' || var11 > '9') {
                        break;
                    }
                    var9 = var9 * 10 + var11 - 48;
                    var10++;
                }
            } catch (Exception var14) {
            }
            if (arg1.field2525) {
                this.field3417 = false;
            } else {
                this.field3417 = true;
            }
            this.field3422 = var9;
            this.field3402 = class69.field1286;
            if (this.field3426 <= 3) {
                this.field3409 = 0;
            } else {
                this.field3409 = class153.field2496;
            }
            try {
                int[] var12 = HardwareInfo.getCPUInfo();
                if (var12 != null && var12.length == 7) {
                    this.field3408 = var12[3];
                    this.field3406 = var12[4];
                    this.field3401 = var12[2];
                    this.field3413 = var12[5];
                    this.field3419 = var12[6];
                }
            } catch (Throwable var13) {
                this.field3419 = 0;
            }
        }
        if (this.field3420 == null) {
            this.field3420 = "";
        }
        if (this.field3414 == null) {
            this.field3414 = "";
        }
        if (this.field3407 == null) {
            this.field3407 = "";
        }
        if (this.field3424 == null) {
            this.field3424 = "";
        }
        this.method1636(10);
    }
}
