import jaclib.hardware_info.HardwareInfo;
import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class269 extends class45 {

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    private int field3510;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "Z")
    private boolean field3511;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    private int field3509;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "I")
    private int field3518;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    private int field3512;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
    private int field3520;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    private int field3513;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "I")
    private int field3516;

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "Z")
    private boolean field3519;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
    private int field3517;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    private int field3507;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
    private int field3515;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "[S")
    public static short[] field3508 = new short[256];

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
    public static void method1606(int arg0) {
        field3508 = null;
        if (arg0 != 3) {
            method1606(-86);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BLio;)V")
    public final void method1607(byte arg0, class157 arg1) {
        field3514++;
        arg1.method915(-31914, 3);
        arg1.method915(-31914, this.field3510);
        arg1.method915(-31914, this.field3511 ? 1 : 0);
        arg1.method915(-31914, this.field3509);
        if (arg0 < 63) {
            this.method1607((byte) 68, null);
        }
        arg1.method915(-31914, this.field3518);
        arg1.method915(-31914, this.field3512);
        arg1.method915(-31914, this.field3520);
        arg1.method915(-31914, this.field3513);
        arg1.method915(-31914, this.field3519 ? 1 : 0);
        arg1.method918(24551, this.field3516);
        arg1.method915(-31914, this.field3517);
        arg1.method951(this.field3507, -113);
        arg1.method958(0, this.field3515);
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(ZLgba;)V")
    public class269(boolean arg0, class388 arg1) {
        if (arg0) {
            if (class388.field5196.startsWith("win")) {
                this.field3510 = 1;
            } else if (class388.field5196.startsWith("mac")) {
                this.field3510 = 2;
            } else if (class388.field5196.startsWith("linux")) {
                this.field3510 = 3;
            } else {
                this.field3510 = 4;
            }
            if (class388.field5177.startsWith("amd64") || class388.field5177.startsWith("x86_64")) {
                this.field3511 = true;
            } else {
                this.field3511 = false;
            }
            if (this.field3510 == 1) {
                if (class388.field5184.indexOf("4.0") != -1) {
                    this.field3509 = 1;
                } else if (class388.field5184.indexOf("4.1") != -1) {
                    this.field3509 = 2;
                } else if (class388.field5184.indexOf("4.9") != -1) {
                    this.field3509 = 3;
                } else if (class388.field5184.indexOf("5.0") != -1) {
                    this.field3509 = 4;
                } else if (class388.field5184.indexOf("5.1") != -1) {
                    this.field3509 = 5;
                } else if (class388.field5184.indexOf("6.0") != -1) {
                    this.field3509 = 6;
                } else if (class388.field5184.indexOf("6.1") != -1) {
                    this.field3509 = 7;
                }
            } else if (this.field3510 == 2) {
                if (class388.field5184.indexOf("10.4") != -1) {
                    this.field3509 = 20;
                } else if (class388.field5184.indexOf("10.5") != -1) {
                    this.field3509 = 21;
                } else if (class388.field5184.indexOf("10.6") != -1) {
                    this.field3509 = 22;
                }
            }
            if (class388.field5180.toLowerCase().indexOf("sun") != -1) {
                this.field3518 = 1;
            } else if (class388.field5180.toLowerCase().indexOf("microsoft") != -1) {
                this.field3518 = 2;
            } else if (class388.field5180.toLowerCase().indexOf("apple") == -1) {
                this.field3518 = 4;
            } else {
                this.field3518 = 3;
            }
            int var3 = 2;
            int var4 = 0;
            try {
                while (class388.field5174.length() > var3) {
                    char var5 = class388.field5174.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + var5 - 48;
                    var3++;
                }
            } catch (Exception var16) {
            }
            this.field3512 = var4;
            int var6 = 0;
            int var7 = class388.field5174.indexOf(46, 2) + 1;
            try {
                while (var7 < class388.field5174.length()) {
                    char var8 = class388.field5174.charAt(var7);
                    if (var8 < '0' || var8 > '9') {
                        break;
                    }
                    var7++;
                    var6 = var6 * 10 + var8 - 48;
                }
            } catch (Exception var15) {
            }
            this.field3520 = var6;
            int var9 = class388.field5174.indexOf(95, 4) + 1;
            int var10 = 0;
            try {
                while (class388.field5174.length() > var9) {
                    char var11 = class388.field5174.charAt(var9);
                    if (var11 < '0' || var11 > '9') {
                        break;
                    }
                    var9++;
                    var10 = var10 * 10 + var11 - 48;
                }
            } catch (Exception var14) {
            }
            this.field3513 = var10;
            this.field3516 = client.field9616;
            if (arg1.field5176) {
                this.field3519 = false;
            } else {
                this.field3519 = true;
            }
            if (this.field3512 > 3) {
                this.field3517 = class653.field9306;
            } else {
                this.field3517 = 0;
            }
            try {
                this.field3507 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
            } catch (Throwable var13) {
                this.field3507 = 0;
            }
            try {
                this.field3515 = HardwareInfo.getPackedBasicCPUInfo();
            } catch (Throwable var12) {
            }
        }
    }
}
