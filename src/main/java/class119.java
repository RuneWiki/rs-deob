import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jja")
public class class119 extends class540 {

    @OriginalMember(owner = "client!jja", name = "o", descriptor = "I")
    private int field1487;

    @OriginalMember(owner = "client!jja", name = "n", descriptor = "Z")
    private boolean field1486;

    @OriginalMember(owner = "client!jja", name = "w", descriptor = "I")
    private int field1495;

    @OriginalMember(owner = "client!jja", name = "r", descriptor = "I")
    private int field1490;

    @OriginalMember(owner = "client!jja", name = "m", descriptor = "I")
    private int field1485;

    @OriginalMember(owner = "client!jja", name = "x", descriptor = "I")
    private int field1496;

    @OriginalMember(owner = "client!jja", name = "B", descriptor = "Z")
    private boolean field1500;

    @OriginalMember(owner = "client!jja", name = "v", descriptor = "I")
    private int field1494;

    @OriginalMember(owner = "client!jja", name = "t", descriptor = "I")
    private int field1492;

    @OriginalMember(owner = "client!jja", name = "s", descriptor = "I")
    private int field1491;

    @OriginalMember(owner = "client!jja", name = "H", descriptor = "I")
    public int field1506;

    @OriginalMember(owner = "client!jja", name = "D", descriptor = "I")
    private int field1502;

    @OriginalMember(owner = "client!jja", name = "E", descriptor = "I")
    private int field1503;

    @OriginalMember(owner = "client!jja", name = "l", descriptor = "I")
    private int field1484;

    @OriginalMember(owner = "client!jja", name = "G", descriptor = "I")
    private int field1505;

    @OriginalMember(owner = "client!jja", name = "F", descriptor = "Ljava/lang/String;")
    private String field1504;

    @OriginalMember(owner = "client!jja", name = "u", descriptor = "Ljava/lang/String;")
    private String field1493;

    @OriginalMember(owner = "client!jja", name = "A", descriptor = "Ljava/lang/String;")
    private String field1499;

    @OriginalMember(owner = "client!jja", name = "k", descriptor = "Ljava/lang/String;")
    private String field1483;

    @OriginalMember(owner = "client!jja", name = "z", descriptor = "Lfi;")
    public static class580 field1498 = null;

    @OriginalMember(owner = "client!jja", name = "C", descriptor = "I")
    public static int field1501 = -1;

    @OriginalMember(owner = "client!jja", name = "I", descriptor = "Z")
    public static boolean field1507 = false;

    @OriginalMember(owner = "client!jja", name = "i", descriptor = "I")
    private int field1481;

    @OriginalMember(owner = "client!jja", name = "j", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!jja", name = "p", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!jja", name = "q", descriptor = "I")
    private int field1489;

    @OriginalMember(owner = "client!jja", name = "y", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!jja", name = "J", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!jja", name = "a", descriptor = "(Z)I")
    public final int method828(boolean arg0) {
        field1508++;
        byte var2 = 23;
        int var3 = var2 + class645.method3687(false, this.field1493);
        int var4 = var3 + class645.method3687(false, this.field1483);
        if (!arg0) {
            method831(-5, 6, -9);
        }
        int var5 = var4 + class645.method3687(false, this.field1499);
        return var5 + class645.method3687(false, this.field1504);
    }

    @OriginalMember(owner = "client!jja", name = "a", descriptor = "(Lrv;I)V")
    public final void method829(class120 arg0, int arg1) {
        field1488++;
        arg0.method851((byte) -2, 5);
        arg0.method851((byte) -2, this.field1487);
        arg0.method851((byte) -2, this.field1486 ? 1 : 0);
        if (arg1 != -4) {
            this.field1504 = null;
        }
        arg0.method851((byte) -2, this.field1495);
        arg0.method851((byte) -2, this.field1490);
        arg0.method851((byte) -2, this.field1485);
        arg0.method851((byte) -2, this.field1496);
        arg0.method851((byte) -2, this.field1492);
        arg0.method851((byte) -2, this.field1500 ? 1 : 0);
        arg0.method860(this.field1491, (byte) 127);
        arg0.method851((byte) -2, this.field1494);
        arg0.method876(this.field1506, arg1 ^ 0xFFFFFFFD);
        arg0.method860(this.field1484, (byte) 125);
        arg0.method851((byte) -2, this.field1502);
        arg0.method851((byte) -2, this.field1505);
        arg0.method851((byte) -2, this.field1503);
        arg0.method839(this.field1493, (byte) 46);
        arg0.method839(this.field1483, (byte) 46);
        arg0.method839(this.field1499, (byte) 46);
        arg0.method839(this.field1504, (byte) 46);
        arg0.method851((byte) -2, this.field1489);
        arg0.method860(this.field1481, (byte) 117);
    }

    @OriginalMember(owner = "client!jja", name = "a", descriptor = "(I)V")
    private final void method830(int arg0) {
        if (this.field1493.length() > 40) {
            this.field1493 = this.field1493.substring(0, 40);
        }
        field1497++;
        if (~this.field1483.length() < arg0) {
            this.field1483 = this.field1483.substring(0, 40);
        }
        if (this.field1499.length() > 10) {
            this.field1499 = this.field1499.substring(0, 10);
        }
        if (this.field1504.length() > 10) {
            this.field1504 = this.field1504.substring(0, 10);
        }
    }

    @OriginalMember(owner = "client!jja", name = "a", descriptor = "(III)Z")
    public static final boolean method831(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            field1498 = null;
        }
        field1482++;
        return (arg1 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!jja", name = "<init>", descriptor = "()V")
    public class119() {
    }

    @OriginalMember(owner = "client!jja", name = "<init>", descriptor = "(ZLkj;)V")
    public class119(boolean arg0, class590 arg1) {
        if (arg0) {
            if (class590.field8347.startsWith("win")) {
                this.field1487 = 1;
            } else if (class590.field8347.startsWith("mac")) {
                this.field1487 = 2;
            } else if (class590.field8347.startsWith("linux")) {
                this.field1487 = 3;
            } else {
                this.field1487 = 4;
            }
            if (class590.field8346.startsWith("amd64") || class590.field8346.startsWith("x86_64")) {
                this.field1486 = true;
            } else {
                this.field1486 = false;
            }
            if (this.field1487 == 1) {
                if (class590.field8339.indexOf("4.0") != -1) {
                    this.field1495 = 1;
                } else if (class590.field8339.indexOf("4.1") != -1) {
                    this.field1495 = 2;
                } else if (class590.field8339.indexOf("4.9") != -1) {
                    this.field1495 = 3;
                } else if (class590.field8339.indexOf("5.0") != -1) {
                    this.field1495 = 4;
                } else if (class590.field8339.indexOf("5.1") != -1) {
                    this.field1495 = 5;
                } else if (class590.field8339.indexOf("6.0") != -1) {
                    this.field1495 = 6;
                } else if (class590.field8339.indexOf("6.1") != -1) {
                    this.field1495 = 7;
                }
            } else if (this.field1487 == 2) {
                if (class590.field8339.indexOf("10.4") != -1) {
                    this.field1495 = 20;
                } else if (class590.field8339.indexOf("10.5") != -1) {
                    this.field1495 = 21;
                } else if (class590.field8339.indexOf("10.6") != -1) {
                    this.field1495 = 22;
                }
            }
            if (class590.field8336.toLowerCase().indexOf("sun") != -1) {
                this.field1490 = 1;
            } else if (class590.field8336.toLowerCase().indexOf("microsoft") != -1) {
                this.field1490 = 2;
            } else if (class590.field8336.toLowerCase().indexOf("apple") == -1) {
                this.field1490 = 4;
            } else {
                this.field1490 = 3;
            }
            int var3 = 2;
            int var4 = 0;
            try {
                while (var3 < class590.field8326.length()) {
                    char var5 = class590.field8326.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + var5 - 48;
                    var3++;
                }
            } catch (Exception var16) {
            }
            this.field1485 = var4;
            int var6 = class590.field8326.indexOf(46, 2) + 1;
            int var7 = 0;
            try {
                while (class590.field8326.length() > var6) {
                    char var8 = class590.field8326.charAt(var6);
                    if (var8 < '0' || var8 > '9') {
                        break;
                    }
                    var7 = var7 * 10 - (48 - var8);
                    var6++;
                }
            } catch (Exception var15) {
            }
            this.field1496 = var7;
            int var9 = class590.field8326.indexOf(95, 4) + 1;
            int var10 = 0;
            try {
                while (class590.field8326.length() > var9) {
                    char var11 = class590.field8326.charAt(var9);
                    if (var11 < '0' || var11 > '9') {
                        break;
                    }
                    var10 = var10 * 10 + var11 - 48;
                    var9++;
                }
            } catch (Exception var14) {
            }
            if (arg1.field8334) {
                this.field1500 = false;
            } else {
                this.field1500 = true;
            }
            if (this.field1485 > 3) {
                this.field1494 = class576.field8143;
            } else {
                this.field1494 = 0;
            }
            this.field1492 = var10;
            this.field1491 = class511.field7306;
            try {
                int[] var12 = HardwareInfo.getCPUInfo();
                if (var12 != null && var12.length == 7) {
                    this.field1506 = var12[6];
                    this.field1502 = var12[3];
                    this.field1503 = var12[5];
                    this.field1484 = var12[2];
                    this.field1505 = var12[4];
                }
            } catch (Throwable var13) {
                this.field1506 = 0;
            }
        }
        if (this.field1504 == null) {
            this.field1504 = "";
        }
        if (this.field1493 == null) {
            this.field1493 = "";
        }
        if (this.field1499 == null) {
            this.field1499 = "";
        }
        if (this.field1483 == null) {
            this.field1483 = "";
        }
        this.method830(-41);
    }
}
