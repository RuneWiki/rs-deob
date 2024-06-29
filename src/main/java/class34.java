import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bja")
public class class34 extends class101 {

    @OriginalMember(owner = "client!bja", name = "x", descriptor = "I")
    private int field541;

    @OriginalMember(owner = "client!bja", name = "N", descriptor = "Z")
    private boolean field556;

    @OriginalMember(owner = "client!bja", name = "v", descriptor = "I")
    private int field539;

    @OriginalMember(owner = "client!bja", name = "I", descriptor = "I")
    private int field551;

    @OriginalMember(owner = "client!bja", name = "p", descriptor = "I")
    private int field533;

    @OriginalMember(owner = "client!bja", name = "B", descriptor = "I")
    private int field545;

    @OriginalMember(owner = "client!bja", name = "q", descriptor = "I")
    private int field534;

    @OriginalMember(owner = "client!bja", name = "G", descriptor = "I")
    private int field549;

    @OriginalMember(owner = "client!bja", name = "F", descriptor = "Z")
    private boolean field548;

    @OriginalMember(owner = "client!bja", name = "E", descriptor = "I")
    private int field547;

    @OriginalMember(owner = "client!bja", name = "t", descriptor = "I")
    private int field537;

    @OriginalMember(owner = "client!bja", name = "K", descriptor = "I")
    private int field553;

    @OriginalMember(owner = "client!bja", name = "L", descriptor = "I")
    private int field554;

    @OriginalMember(owner = "client!bja", name = "H", descriptor = "I")
    public int field550;

    @OriginalMember(owner = "client!bja", name = "A", descriptor = "I")
    private int field544;

    @OriginalMember(owner = "client!bja", name = "y", descriptor = "Ljava/lang/String;")
    private String field542;

    @OriginalMember(owner = "client!bja", name = "n", descriptor = "Ljava/lang/String;")
    private String field531;

    @OriginalMember(owner = "client!bja", name = "r", descriptor = "Ljava/lang/String;")
    private String field535;

    @OriginalMember(owner = "client!bja", name = "s", descriptor = "Ljava/lang/String;")
    private String field536;

    @OriginalMember(owner = "client!bja", name = "M", descriptor = "Ljda;")
    public static class239 field555 = new class239(8);

    @OriginalMember(owner = "client!bja", name = "O", descriptor = "I")
    public static int field557 = 0;

    @OriginalMember(owner = "client!bja", name = "Q", descriptor = "Lml;")
    public static class410 field559 = new class410("", 18);

    @OriginalMember(owner = "client!bja", name = "P", descriptor = "D")
    public static double field558;

    @OriginalMember(owner = "client!bja", name = "o", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!bja", name = "u", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!bja", name = "w", descriptor = "I")
    private int field540;

    @OriginalMember(owner = "client!bja", name = "z", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!bja", name = "D", descriptor = "I")
    private int field546;

    @OriginalMember(owner = "client!bja", name = "J", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!bja", name = "R", descriptor = "[[[Z")
    public static boolean[][][] field560;

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(Ljp;I)V")
    public final void method239(class376 arg0, int arg1) {
        arg0.method2380(65280, 5);
        field543++;
        arg0.method2380(65280, this.field541);
        arg0.method2380(65280, this.field556 ? 1 : 0);
        arg0.method2380(65280, this.field539);
        arg0.method2380(65280, this.field551);
        int var3 = 46 % ((arg1 + 44) / 59);
        arg0.method2380(65280, this.field533);
        arg0.method2380(65280, this.field545);
        arg0.method2380(65280, this.field547);
        arg0.method2380(65280, this.field548 ? 1 : 0);
        arg0.method2415(false, this.field549);
        arg0.method2380(65280, this.field534);
        arg0.method2408((byte) 58, this.field550);
        arg0.method2415(false, this.field554);
        arg0.method2380(65280, this.field553);
        arg0.method2380(65280, this.field537);
        arg0.method2380(65280, this.field544);
        arg0.method2401(this.field536, -128);
        arg0.method2401(this.field531, -125);
        arg0.method2401(this.field542, -127);
        arg0.method2401(this.field535, -126);
        arg0.method2380(65280, this.field540);
        arg0.method2415(false, this.field546);
    }

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(I)I")
    public final int method240(int arg0) {
        field532++;
        if (arg0 <= 96) {
            return 105;
        }
        byte var2 = 23;
        int var3 = var2 + class32.method235(this.field536, 5);
        int var4 = var3 + class32.method235(this.field531, 5);
        int var5 = var4 + class32.method235(this.field542, 5);
        return var5 + class32.method235(this.field535, 5);
    }

    @OriginalMember(owner = "client!bja", name = "b", descriptor = "(Ljp;I)Ljfa;")
    public static final class306 method241(class376 arg0, int arg1) {
        field538++;
        if (arg1 != 3) {
            field558 = -0.6311300520963711D;
        }
        int var2 = arg0.method2359(-1);
        return new class306(var2);
    }

    @OriginalMember(owner = "client!bja", name = "b", descriptor = "(I)V")
    private final void method242(int arg0) {
        if (this.field536.length() > 40) {
            this.field536 = this.field536.substring(0, 40);
        }
        field552++;
        if (arg0 != 46) {
            this.method240(-60);
        }
        if (this.field531.length() > 40) {
            this.field531 = this.field531.substring(0, 40);
        }
        if (this.field542.length() > 10) {
            this.field542 = this.field542.substring(0, 10);
        }
        if (this.field535.length() > 10) {
            this.field535 = this.field535.substring(0, 10);
        }
    }

    @OriginalMember(owner = "client!bja", name = "<init>", descriptor = "()V")
    public class34() {
    }

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(B)V")
    public static void method243(byte arg0) {
        field555 = null;
        field559 = null;
        if (arg0 == 19) {
            field560 = null;
        }
    }

    @OriginalMember(owner = "client!bja", name = "<init>", descriptor = "(ZLqn;)V")
    public class34(boolean arg0, class70 arg1) {
        if (arg0) {
            if (class70.field976.startsWith("win")) {
                this.field541 = 1;
            } else if (class70.field976.startsWith("mac")) {
                this.field541 = 2;
            } else if (class70.field976.startsWith("linux")) {
                this.field541 = 3;
            } else {
                this.field541 = 4;
            }
            if (class70.field1001.startsWith("amd64") || class70.field1001.startsWith("x86_64")) {
                this.field556 = true;
            } else {
                this.field556 = false;
            }
            if (this.field541 == 1) {
                if (class70.field982.indexOf("4.0") != -1) {
                    this.field539 = 1;
                } else if (class70.field982.indexOf("4.1") != -1) {
                    this.field539 = 2;
                } else if (class70.field982.indexOf("4.9") != -1) {
                    this.field539 = 3;
                } else if (class70.field982.indexOf("5.0") != -1) {
                    this.field539 = 4;
                } else if (class70.field982.indexOf("5.1") != -1) {
                    this.field539 = 5;
                } else if (class70.field982.indexOf("6.0") != -1) {
                    this.field539 = 6;
                } else if (class70.field982.indexOf("6.1") != -1) {
                    this.field539 = 7;
                }
            } else if (this.field541 == 2) {
                if (class70.field982.indexOf("10.4") != -1) {
                    this.field539 = 20;
                } else if (class70.field982.indexOf("10.5") != -1) {
                    this.field539 = 21;
                } else if (class70.field982.indexOf("10.6") != -1) {
                    this.field539 = 22;
                }
            }
            if (class70.field998.toLowerCase().indexOf("sun") != -1) {
                this.field551 = 1;
            } else if (class70.field998.toLowerCase().indexOf("microsoft") != -1) {
                this.field551 = 2;
            } else if (class70.field998.toLowerCase().indexOf("apple") == -1) {
                this.field551 = 4;
            } else {
                this.field551 = 3;
            }
            int var3 = 2;
            int var4 = 0;
            try {
                while (var3 < class70.field986.length()) {
                    char var5 = class70.field986.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var4 * 10 + var5 - 48;
                }
            } catch (Exception var16) {
            }
            this.field533 = var4;
            int var6 = class70.field986.indexOf(46, 2) + 1;
            int var7 = 0;
            try {
                while (var6 < class70.field986.length()) {
                    char var8 = class70.field986.charAt(var6);
                    if (var8 < '0' || var8 > '9') {
                        break;
                    }
                    var6++;
                    var7 = var7 * 10 + var8 - 48;
                }
            } catch (Exception var15) {
            }
            this.field545 = var7;
            int var9 = class70.field986.indexOf(95, 4) + 1;
            int var10 = 0;
            try {
                while (var9 < class70.field986.length()) {
                    char var11 = class70.field986.charAt(var9);
                    if (var11 < '0' || var11 > '9') {
                        break;
                    }
                    var10 = var10 * 10 - (48 - var11);
                    var9++;
                }
            } catch (Exception var14) {
            }
            if (this.field533 <= 3) {
                this.field534 = 0;
            } else {
                this.field534 = class262.field3897;
            }
            this.field549 = class396.field5817;
            if (arg1.field984) {
                this.field548 = false;
            } else {
                this.field548 = true;
            }
            this.field547 = var10;
            try {
                int[] var12 = HardwareInfo.getCPUInfo();
                if (var12 != null && var12.length == 7) {
                    this.field537 = var12[4];
                    this.field553 = var12[3];
                    this.field554 = var12[2];
                    this.field550 = var12[6];
                    this.field544 = var12[5];
                }
            } catch (Throwable var13) {
                this.field550 = 0;
            }
        }
        if (this.field542 == null) {
            this.field542 = "";
        }
        if (this.field531 == null) {
            this.field531 = "";
        }
        if (this.field535 == null) {
            this.field535 = "";
        }
        if (this.field536 == null) {
            this.field536 = "";
        }
        this.method242(46);
    }
}
