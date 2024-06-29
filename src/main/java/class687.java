import jaclib.hardware_info.HardwareInfo;
import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class687 extends class333 {

    @OriginalMember(owner = "client!ni", name = "y", descriptor = "I")
    private int field9674;

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "Z")
    private boolean field9667;

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "I")
    private int field9664;

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "I")
    private int field9665;

    @OriginalMember(owner = "client!ni", name = "w", descriptor = "I")
    private int field9672;

    @OriginalMember(owner = "client!ni", name = "u", descriptor = "I")
    private int field9670;

    @OriginalMember(owner = "client!ni", name = "v", descriptor = "I")
    private int field9671;

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "Z")
    private boolean field9662;

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "I")
    private int field9663;

    @OriginalMember(owner = "client!ni", name = "x", descriptor = "I")
    private int field9673;

    @OriginalMember(owner = "client!ni", name = "t", descriptor = "I")
    private int field9669;

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "I")
    private int field9666;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "Lps;")
    public static class469 field9660 = new class469(7, 6);

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
    public static int field9661;

    @OriginalMember(owner = "client!ni", name = "s", descriptor = "[[[I")
    public static int[][][] field9668;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
    public static void method3799(int arg0) {
        field9668 = null;
        field9660 = null;
        if (arg0 > -125) {
            method3799(-4);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lnp;B)V")
    public final void method3800(class115 arg0, byte arg1) {
        field9661++;
        if (arg1 <= 22) {
            return;
        }
        arg0.method658(3, (byte) 56);
        arg0.method658(this.field9674, (byte) 87);
        arg0.method658(this.field9667 ? 1 : 0, (byte) 52);
        arg0.method658(this.field9664, (byte) 57);
        arg0.method658(this.field9665, (byte) 88);
        arg0.method658(this.field9672, (byte) 61);
        arg0.method658(this.field9670, (byte) 77);
        arg0.method658(this.field9673, (byte) 113);
        arg0.method658(this.field9662 ? 1 : 0, (byte) 103);
        arg0.method645(-672168216, this.field9671);
        arg0.method658(this.field9663, (byte) 87);
        arg0.method624(this.field9669, (byte) -120);
        arg0.method660((byte) 115, this.field9666);
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(ZLpi;)V")
    public class687(boolean arg0, class464 arg1) {
        if (arg0) {
            if (class464.field6624.startsWith("win")) {
                this.field9674 = 1;
            } else if (class464.field6624.startsWith("mac")) {
                this.field9674 = 2;
            } else if (class464.field6624.startsWith("linux")) {
                this.field9674 = 3;
            } else {
                this.field9674 = 4;
            }
            if (class464.field6620.startsWith("amd64") || class464.field6620.startsWith("x86_64")) {
                this.field9667 = true;
            } else {
                this.field9667 = false;
            }
            if (this.field9674 == 1) {
                if (class464.field6622.indexOf("4.0") != -1) {
                    this.field9664 = 1;
                } else if (class464.field6622.indexOf("4.1") != -1) {
                    this.field9664 = 2;
                } else if (class464.field6622.indexOf("4.9") != -1) {
                    this.field9664 = 3;
                } else if (class464.field6622.indexOf("5.0") != -1) {
                    this.field9664 = 4;
                } else if (class464.field6622.indexOf("5.1") != -1) {
                    this.field9664 = 5;
                } else if (class464.field6622.indexOf("6.0") != -1) {
                    this.field9664 = 6;
                } else if (class464.field6622.indexOf("6.1") != -1) {
                    this.field9664 = 7;
                }
            } else if (this.field9674 == 2) {
                if (class464.field6622.indexOf("10.4") != -1) {
                    this.field9664 = 20;
                } else if (class464.field6622.indexOf("10.5") != -1) {
                    this.field9664 = 21;
                } else if (class464.field6622.indexOf("10.6") != -1) {
                    this.field9664 = 22;
                }
            }
            if (class464.field6613.toLowerCase().indexOf("sun") != -1) {
                this.field9665 = 1;
            } else if (class464.field6613.toLowerCase().indexOf("microsoft") != -1) {
                this.field9665 = 2;
            } else if (class464.field6613.toLowerCase().indexOf("apple") == -1) {
                this.field9665 = 4;
            } else {
                this.field9665 = 3;
            }
            int var3 = 2;
            int var4 = 0;
            try {
                while (class464.field6615.length() > var3) {
                    char var5 = class464.field6615.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + (var5 - '0');
                    var3++;
                }
            } catch (Exception var16) {
            }
            this.field9672 = var4;
            int var6 = class464.field6615.indexOf(46, 2) + 1;
            int var7 = 0;
            try {
                while (class464.field6615.length() > var6) {
                    char var8 = class464.field6615.charAt(var6);
                    if (var8 < '0' || var8 > '9') {
                        break;
                    }
                    var7 = var7 * 10 + var8 - 48;
                    var6++;
                }
            } catch (Exception var15) {
            }
            this.field9670 = var7;
            int var9 = class464.field6615.indexOf(95, 4) + 1;
            int var10 = 0;
            try {
                while (var9 < class464.field6615.length()) {
                    char var11 = class464.field6615.charAt(var9);
                    if (var11 < '0' || var11 > '9') {
                        break;
                    }
                    var9++;
                    var10 = -(-var11 - var10 * 10) - 48;
                }
            } catch (Exception var14) {
            }
            this.field9671 = class689.field9702;
            if (arg1.field6614) {
                this.field9662 = false;
            } else {
                this.field9662 = true;
            }
            if (this.field9672 <= 3) {
                this.field9663 = 0;
            } else {
                this.field9663 = class141.field1559;
            }
            this.field9673 = var10;
            try {
                this.field9669 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
            } catch (Throwable var13) {
                this.field9669 = 0;
            }
            try {
                this.field9666 = HardwareInfo.getPackedBasicCPUInfo();
            } catch (Throwable var12) {
            }
        }
    }
}
