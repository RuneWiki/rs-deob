import jaclib.hardware_info.HardwareInfo;
import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class348 extends class504 {

    @OriginalMember(owner = "client!bk", name = "w", descriptor = "I")
    private int field4780;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "Z")
    private boolean field4768;

    @OriginalMember(owner = "client!bk", name = "u", descriptor = "I")
    private int field4778;

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "I")
    private int field4767;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "I")
    private int field4773;

    @OriginalMember(owner = "client!bk", name = "x", descriptor = "I")
    private int field4781;

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "I")
    private int field4769;

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "I")
    private int field4766;

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "I")
    private int field4772;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "Z")
    private boolean field4770;

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "I")
    private int field4774;

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "I")
    private int field4775;

    @OriginalMember(owner = "client!bk", name = "s", descriptor = "I")
    public static int field4776 = -60;

    @OriginalMember(owner = "client!bk", name = "t", descriptor = "[B")
    public static byte[] field4777 = new byte[2048];

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!bk", name = "v", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!bk", name = "y", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILeh;)V", line = 3)
    public final void method2081(int arg0, class335 arg1) {
        arg1.method1980(-345277664, arg0);
        field4771++;
        arg1.method1980(-345277664, this.field4780);
        arg1.method1980(-345277664, this.field4768 ? 1 : 0);
        arg1.method1980(arg0 ^ 0xEB6B7B23, this.field4778);
        arg1.method1980(arg0 ^ 0xEB6B7B23, this.field4767);
        arg1.method1980(-345277664, this.field4773);
        arg1.method1980(-345277664, this.field4781);
        arg1.method1980(-345277664, this.field4772);
        arg1.method1980(arg0 ^ 0xEB6B7B23, this.field4770 ? 1 : 0);
        arg1.method2031((byte) 54, this.field4766);
        arg1.method1980(-345277664, this.field4769);
        arg1.method2041(this.field4774, arg0 ^ 0x83);
        arg1.method1982(this.field4775, (byte) 63);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V", line = 32)
    public static void method2082(int arg0) {
        field4777 = null;
        if (arg0 >= -64) {
            method2082(-124);
        }
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(ZLii;)V", line = 55)
    public class348(boolean arg0, class519 arg1) {
        if (arg0) {
            if (class519.field6923.startsWith("win")) {
                this.field4780 = 1;
            } else if (class519.field6923.startsWith("mac")) {
                this.field4780 = 2;
            } else if (class519.field6923.startsWith("linux")) {
                this.field4780 = 3;
            } else {
                this.field4780 = 4;
            }
            if (class519.field6929.startsWith("amd64") || class519.field6929.startsWith("x86_64")) {
                this.field4768 = true;
            } else {
                this.field4768 = false;
            }
            if (this.field4780 == 1) {
                if (class519.field6921.indexOf("4.0") != -1) {
                    this.field4778 = 1;
                } else if (class519.field6921.indexOf("4.1") != -1) {
                    this.field4778 = 2;
                } else if (class519.field6921.indexOf("4.9") != -1) {
                    this.field4778 = 3;
                } else if (class519.field6921.indexOf("5.0") != -1) {
                    this.field4778 = 4;
                } else if (class519.field6921.indexOf("5.1") != -1) {
                    this.field4778 = 5;
                } else if (class519.field6921.indexOf("6.0") != -1) {
                    this.field4778 = 6;
                } else if (class519.field6921.indexOf("6.1") != -1) {
                    this.field4778 = 7;
                }
            } else if (this.field4780 == 2) {
                if (class519.field6921.indexOf("10.4") != -1) {
                    this.field4778 = 20;
                } else if (class519.field6921.indexOf("10.5") != -1) {
                    this.field4778 = 21;
                } else if (class519.field6921.indexOf("10.6") != -1) {
                    this.field4778 = 22;
                }
            }
            if (class519.field6928.toLowerCase().indexOf("sun") != -1) {
                this.field4767 = 1;
            } else if (class519.field6928.toLowerCase().indexOf("microsoft") != -1) {
                this.field4767 = 2;
            } else if (class519.field6928.toLowerCase().indexOf("apple") == -1) {
                this.field4767 = 4;
            } else {
                this.field4767 = 3;
            }
            int var3 = 2;
            int var4 = 0;
            try {
                while (class519.field6920.length() > var3) {
                    char var5 = class519.field6920.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + var5 - 48;
                    var3++;
                }
            } catch (Exception var16) {
            }
            this.field4773 = var4;
            int var6 = class519.field6920.indexOf(46, 2) + 1;
            int var7 = 0;
            try {
                while (var6 < class519.field6920.length()) {
                    char var8 = class519.field6920.charAt(var6);
                    if (var8 < '0' || var8 > '9') {
                        break;
                    }
                    var6++;
                    var7 = var7 * 10 + var8 - 48;
                }
            } catch (Exception var15) {
            }
            this.field4781 = var7;
            int var9 = class519.field6920.indexOf(95, 4) + 1;
            int var10 = 0;
            try {
                while (var9 < class519.field6920.length()) {
                    char var11 = class519.field6920.charAt(var9);
                    if (var11 < '0' || var11 > '9') {
                        break;
                    }
                    var10 = var10 * 10 - (48 - var11);
                    var9++;
                }
            } catch (Exception var14) {
            }
            if (this.field4773 > 3) {
                this.field4769 = class242.field3380;
            } else {
                this.field4769 = 0;
            }
            this.field4766 = class660.field9362;
            this.field4772 = var10;
            if (arg1.field6915) {
                this.field4770 = false;
            } else {
                this.field4770 = true;
            }
            try {
                this.field4774 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
            } catch (Throwable var13) {
                this.field4774 = 0;
            }
            try {
                this.field4775 = HardwareInfo.getPackedBasicCPUInfo();
            } catch (Throwable var12) {
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IZ)V", line = 234)
    public static final void method2083(int arg0, boolean arg1) {
        field4779++;
        if (arg1) {
            field4776 = 81;
        }
        class382 var2 = class396.method2276(-125, 7, arg0);
        var2.method2228((byte) -55);
    }
}
