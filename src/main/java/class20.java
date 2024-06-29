import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class20 extends class168 {

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
    private int field361;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "Z")
    private boolean field355;

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "I")
    private int field360;

    @OriginalMember(owner = "client!ub", name = "C", descriptor = "I")
    private int field368;

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "I")
    private int field363;

    @OriginalMember(owner = "client!ub", name = "G", descriptor = "I")
    private int field372;

    @OriginalMember(owner = "client!ub", name = "A", descriptor = "I")
    private int field366;

    @OriginalMember(owner = "client!ub", name = "D", descriptor = "I")
    private int field369;

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "I")
    private int field364;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "Z")
    private boolean field349;

    @OriginalMember(owner = "client!ub", name = "B", descriptor = "I")
    public int field367;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
    private int field353;

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "I")
    private int field359;

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "I")
    private int field356;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "I")
    private int field357;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "Ljava/lang/String;")
    private String field352;

    @OriginalMember(owner = "client!ub", name = "H", descriptor = "Ljava/lang/String;")
    private String field373;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "Ljava/lang/String;")
    private String field350;

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "Ljava/lang/String;")
    private String field362;

    @OriginalMember(owner = "client!ub", name = "E", descriptor = "I")
    public static int field370 = 0;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "I")
    private int field365;

    @OriginalMember(owner = "client!ub", name = "F", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!ub", name = "I", descriptor = "I")
    private int field374;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V", line = 11)
    private final void method130(int arg0) {
        if (this.field373.length() > 40) {
            this.field373 = this.field373.substring(0, 40);
        }
        field371++;
        if (arg0 != -9250) {
            method133(-92, -59, -89);
        }
        if (this.field350.length() > 40) {
            this.field350 = this.field350.substring(0, 40);
        }
        if (this.field362.length() > 10) {
            this.field362 = this.field362.substring(0, 10);
        }
        if (this.field352.length() > 10) {
            this.field352 = this.field352.substring(0, 10);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lsl;B)V", line = 38)
    public final void method131(class461 arg0, byte arg1) {
        arg0.method2578(5, -1221492240);
        field358++;
        arg0.method2578(this.field361, -1221492240);
        arg0.method2578(this.field355 ? 1 : 0, -1221492240);
        arg0.method2578(this.field360, -1221492240);
        arg0.method2578(this.field368, -1221492240);
        arg0.method2578(this.field363, -1221492240);
        arg0.method2578(this.field372, -1221492240);
        arg0.method2578(this.field366, -1221492240);
        arg0.method2578(this.field349 ? 1 : 0, -1221492240);
        arg0.method2620(this.field369, false);
        arg0.method2578(this.field364, -1221492240);
        arg0.method2589(8, this.field367);
        if (arg1 < 112) {
            return;
        }
        arg0.method2620(this.field356, false);
        arg0.method2578(this.field353, -1221492240);
        arg0.method2578(this.field359, -1221492240);
        arg0.method2578(this.field357, -1221492240);
        arg0.method2626((byte) 0, this.field373);
        arg0.method2626((byte) 0, this.field350);
        arg0.method2626((byte) 0, this.field362);
        arg0.method2626((byte) 0, this.field352);
        arg0.method2578(this.field374, -1221492240);
        arg0.method2620(this.field365, false);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)I", line = 72)
    public final int method132(byte arg0) {
        if (arg0 > -113) {
            return 6;
        }
        field351++;
        byte var2 = 23;
        int var3 = var2 + class224.method1446(0, this.field373);
        int var4 = var3 + class224.method1446(0, this.field350);
        int var5 = var4 + class224.method1446(0, this.field362);
        return var5 + class224.method1446(0, this.field352);
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(III)I", line = 110)
    public static final int method133(int arg0, int arg1, int arg2) {
        if (arg2 > arg0) {
            int var3 = arg0;
            arg0 = arg2;
            arg2 = var3;
        }
        field354++;
        while (arg2 != 0) {
            int var4 = arg0 % arg2;
            arg0 = arg2;
            arg2 = var4;
        }
        if (arg1 != -1) {
            field370 = 51;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V", line = 137)
    public class20() {
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(ZLqg;)V", line = 139)
    public class20(boolean arg0, class465 arg1) {
        if (arg0) {
            if (class465.field6233.startsWith("win")) {
                this.field361 = 1;
            } else if (class465.field6233.startsWith("mac")) {
                this.field361 = 2;
            } else if (class465.field6233.startsWith("linux")) {
                this.field361 = 3;
            } else {
                this.field361 = 4;
            }
            if (class465.field6241.startsWith("amd64") || class465.field6241.startsWith("x86_64")) {
                this.field355 = true;
            } else {
                this.field355 = false;
            }
            if (this.field361 == 1) {
                if (class465.field6240.indexOf("4.0") != -1) {
                    this.field360 = 1;
                } else if (class465.field6240.indexOf("4.1") != -1) {
                    this.field360 = 2;
                } else if (class465.field6240.indexOf("4.9") != -1) {
                    this.field360 = 3;
                } else if (class465.field6240.indexOf("5.0") != -1) {
                    this.field360 = 4;
                } else if (class465.field6240.indexOf("5.1") != -1) {
                    this.field360 = 5;
                } else if (class465.field6240.indexOf("6.0") != -1) {
                    this.field360 = 6;
                } else if (class465.field6240.indexOf("6.1") != -1) {
                    this.field360 = 7;
                }
            } else if (this.field361 == 2) {
                if (class465.field6240.indexOf("10.4") != -1) {
                    this.field360 = 20;
                } else if (class465.field6240.indexOf("10.5") != -1) {
                    this.field360 = 21;
                } else if (class465.field6240.indexOf("10.6") != -1) {
                    this.field360 = 22;
                }
            }
            if (class465.field6245.toLowerCase().indexOf("sun") != -1) {
                this.field368 = 1;
            } else if (class465.field6245.toLowerCase().indexOf("microsoft") != -1) {
                this.field368 = 2;
            } else if (class465.field6245.toLowerCase().indexOf("apple") == -1) {
                this.field368 = 4;
            } else {
                this.field368 = 3;
            }
            int var3 = 2;
            int var4 = 0;
            try {
                while (class465.field6239.length() > var3) {
                    char var5 = class465.field6239.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + var5 - 48;
                    var3++;
                }
            } catch (Exception var16) {
            }
            this.field363 = var4;
            int var6 = class465.field6239.indexOf(46, 2) + 1;
            int var7 = 0;
            try {
                while (class465.field6239.length() > var6) {
                    char var8 = class465.field6239.charAt(var6);
                    if (var8 < '0' || var8 > '9') {
                        break;
                    }
                    var6++;
                    var7 = var7 * 10 + var8 - 48;
                }
            } catch (Exception var15) {
            }
            this.field372 = var7;
            int var9 = class465.field6239.indexOf(95, 4) + 1;
            int var10 = 0;
            try {
                while (class465.field6239.length() > var9) {
                    char var11 = class465.field6239.charAt(var9);
                    if (var11 < '0' || var11 > '9') {
                        break;
                    }
                    var9++;
                    var10 = var10 * 10 + var11 - 48;
                }
            } catch (Exception var14) {
            }
            this.field366 = var10;
            this.field369 = client.field3992;
            if (this.field363 <= 3) {
                this.field364 = 0;
            } else {
                this.field364 = class701.field9761;
            }
            if (arg1.field6256) {
                this.field349 = false;
            } else {
                this.field349 = true;
            }
            try {
                int[] var12 = HardwareInfo.getCPUInfo();
                if (var12 != null && var12.length == 7) {
                    this.field367 = var12[6];
                    this.field353 = var12[3];
                    this.field359 = var12[4];
                    this.field356 = var12[2];
                    this.field357 = var12[5];
                }
            } catch (Throwable var13) {
                this.field367 = 0;
            }
        }
        if (this.field352 == null) {
            this.field352 = "";
        }
        if (this.field373 == null) {
            this.field373 = "";
        }
        if (this.field350 == null) {
            this.field350 = "";
        }
        if (this.field362 == null) {
            this.field362 = "";
        }
        this.method130(-9250);
    }
}
