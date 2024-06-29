import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class618 extends class627 {

    @OriginalMember(owner = "client!gl", name = "A", descriptor = "I")
    private int field8646;

    @OriginalMember(owner = "client!gl", name = "D", descriptor = "Z")
    private boolean field8648;

    @OriginalMember(owner = "client!gl", name = "H", descriptor = "I")
    private int field8652;

    @OriginalMember(owner = "client!gl", name = "x", descriptor = "I")
    private int field8643;

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "I")
    private int field8631;

    @OriginalMember(owner = "client!gl", name = "s", descriptor = "I")
    private int field8638;

    @OriginalMember(owner = "client!gl", name = "y", descriptor = "I")
    private int field8644;

    @OriginalMember(owner = "client!gl", name = "t", descriptor = "I")
    private int field8639;

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "Z")
    private boolean field8634;

    @OriginalMember(owner = "client!gl", name = "r", descriptor = "I")
    private int field8637;

    @OriginalMember(owner = "client!gl", name = "v", descriptor = "I")
    private int field8641;

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "I")
    private int field8633;

    @OriginalMember(owner = "client!gl", name = "q", descriptor = "I")
    private int field8636;

    @OriginalMember(owner = "client!gl", name = "J", descriptor = "I")
    public int field8654;

    @OriginalMember(owner = "client!gl", name = "B", descriptor = "I")
    private int field8647;

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "Ljava/lang/String;")
    private String field8630;

    @OriginalMember(owner = "client!gl", name = "p", descriptor = "Ljava/lang/String;")
    private String field8635;

    @OriginalMember(owner = "client!gl", name = "u", descriptor = "Ljava/lang/String;")
    private String field8640;

    @OriginalMember(owner = "client!gl", name = "I", descriptor = "Ljava/lang/String;")
    private String field8653;

    @OriginalMember(owner = "client!gl", name = "F", descriptor = "Lgg;")
    public static class114 field8650 = new class114(32);

    @OriginalMember(owner = "client!gl", name = "K", descriptor = "[Z")
    public static boolean[] field8655 = new boolean[8];

    @OriginalMember(owner = "client!gl", name = "N", descriptor = "[I")
    public static int[] field8657 = new int[2];

    @OriginalMember(owner = "client!gl", name = "R", descriptor = "I")
    public static int field8661 = 0;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "I")
    private int field8629;

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "I")
    public static int field8632;

    @OriginalMember(owner = "client!gl", name = "w", descriptor = "I")
    public static int field8642;

    @OriginalMember(owner = "client!gl", name = "z", descriptor = "I")
    private int field8645;

    @OriginalMember(owner = "client!gl", name = "E", descriptor = "I")
    public static int field8649;

    @OriginalMember(owner = "client!gl", name = "G", descriptor = "I")
    public static int field8651;

    @OriginalMember(owner = "client!gl", name = "P", descriptor = "I")
    public static int field8659;

    @OriginalMember(owner = "client!gl", name = "Q", descriptor = "Lha;")
    public static class454 field8660;

    @OriginalMember(owner = "client!gl", name = "M", descriptor = "Lac;")
    public static class712 field8656;

    @OriginalMember(owner = "client!gl", name = "O", descriptor = "[[[Lfu;")
    public static class73[][][] field8658;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)I", line = 13)
    public final int method3392(boolean arg0) {
        field8651++;
        byte var2 = 23;
        int var3 = var2 + class552.method3141((byte) 120, this.field8635);
        int var4 = var3 + class552.method3141((byte) 118, this.field8653);
        int var5 = var4 + class552.method3141((byte) 122, this.field8630);
        int var6 = var5 + class552.method3141((byte) 124, this.field8640);
        if (arg0) {
            this.field8646 = -19;
        }
        return var6;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V", line = 44)
    public static void method3393(int arg0) {
        field8655 = null;
        field8656 = null;
        if (arg0 != 2) {
            field8656 = null;
        }
        field8657 = null;
        field8660 = null;
        field8650 = null;
        field8658 = null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILtn;)V", line = 61)
    public final void method3394(int arg0, class179 arg1) {
        field8642++;
        arg1.method1141(5, 91);
        arg1.method1141(this.field8646, 34);
        arg1.method1141(this.field8648 ? 1 : 0, arg0 - 3039);
        arg1.method1141(this.field8652, -51);
        arg1.method1141(this.field8643, 120);
        arg1.method1141(this.field8631, -72);
        arg1.method1141(this.field8638, 70);
        arg1.method1141(this.field8639, arg0 - 2980);
        arg1.method1141(this.field8634 ? 1 : 0, -76);
        arg1.method1157(this.field8644, (byte) 125);
        arg1.method1141(this.field8637, -66);
        arg1.method1129(arg0 ^ 0xFFFFCF7B, this.field8654);
        arg1.method1157(this.field8636, (byte) 113);
        arg1.method1141(this.field8641, 77);
        arg1.method1141(this.field8633, 77);
        arg1.method1141(this.field8647, arg0 - 3032);
        arg1.method1130(this.field8635, (byte) -114);
        if (arg0 != 2926) {
            return;
        }
        arg1.method1130(this.field8653, (byte) -114);
        arg1.method1130(this.field8630, (byte) -114);
        arg1.method1130(this.field8640, (byte) -114);
        arg1.method1141(this.field8629, arg0 - 2985);
        arg1.method1157(this.field8645, (byte) 126);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V", line = 93)
    private final void method3395(byte arg0) {
        if (this.field8635.length() > 40) {
            this.field8635 = this.field8635.substring(0, 40);
        }
        field8649++;
        if (this.field8653.length() > 40) {
            this.field8653 = this.field8653.substring(0, 40);
        }
        if (this.field8630.length() > 10) {
            this.field8630 = this.field8630.substring(0, 10);
        }
        if (arg0 == 99 && this.field8640.length() > 10) {
            this.field8640 = this.field8640.substring(0, 10);
        }
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V", line = 128)
    public class618() {
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(ZLnga;)V", line = 134)
    public class618(boolean arg0, class256 arg1) {
        if (arg0) {
            if (class256.field3250.startsWith("win")) {
                this.field8646 = 1;
            } else if (class256.field3250.startsWith("mac")) {
                this.field8646 = 2;
            } else if (class256.field3250.startsWith("linux")) {
                this.field8646 = 3;
            } else {
                this.field8646 = 4;
            }
            if (class256.field3247.startsWith("amd64") || class256.field3247.startsWith("x86_64")) {
                this.field8648 = true;
            } else {
                this.field8648 = false;
            }
            if (this.field8646 == 1) {
                if (class256.field3262.indexOf("4.0") != -1) {
                    this.field8652 = 1;
                } else if (class256.field3262.indexOf("4.1") != -1) {
                    this.field8652 = 2;
                } else if (class256.field3262.indexOf("4.9") != -1) {
                    this.field8652 = 3;
                } else if (class256.field3262.indexOf("5.0") != -1) {
                    this.field8652 = 4;
                } else if (class256.field3262.indexOf("5.1") != -1) {
                    this.field8652 = 5;
                } else if (class256.field3262.indexOf("6.0") != -1) {
                    this.field8652 = 6;
                } else if (class256.field3262.indexOf("6.1") != -1) {
                    this.field8652 = 7;
                }
            } else if (this.field8646 == 2) {
                if (class256.field3262.indexOf("10.4") != -1) {
                    this.field8652 = 20;
                } else if (class256.field3262.indexOf("10.5") != -1) {
                    this.field8652 = 21;
                } else if (class256.field3262.indexOf("10.6") != -1) {
                    this.field8652 = 22;
                }
            }
            if (class256.field3243.toLowerCase().indexOf("sun") != -1) {
                this.field8643 = 1;
            } else if (class256.field3243.toLowerCase().indexOf("microsoft") != -1) {
                this.field8643 = 2;
            } else if (class256.field3243.toLowerCase().indexOf("apple") == -1) {
                this.field8643 = 4;
            } else {
                this.field8643 = 3;
            }
            int var3 = 2;
            int var4 = 0;
            try {
                while (var3 < class256.field3267.length()) {
                    char var5 = class256.field3267.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var4 * 10 + var5 - 48;
                }
            } catch (Exception var17) {
            }
            this.field8631 = var4;
            int var6 = 0;
            int var7 = class256.field3267.indexOf(46, 2) + 1;
            try {
                while (class256.field3267.length() > var7) {
                    char var8 = class256.field3267.charAt(var7);
                    if (var8 < '0' || var8 > '9') {
                        break;
                    }
                    var7++;
                    var6 = var6 * 10 + var8 - 48;
                }
            } catch (Exception var16) {
            }
            this.field8638 = var6;
            int var9 = class256.field3267.indexOf(95, 4) + 1;
            int var10 = 0;
            try {
                while (var9 < class256.field3267.length()) {
                    char var11 = class256.field3267.charAt(var9);
                    if (var11 < '0' || var11 > '9') {
                        break;
                    }
                    var10 = var10 * 10 + var11 - 48;
                    var9++;
                }
            } catch (Exception var15) {
            }
            this.field8644 = class722.field10162;
            this.field8639 = var10;
            if (arg1.field3251) {
                this.field8634 = false;
            } else {
                this.field8634 = true;
            }
            if (this.field8631 > 3) {
                this.field8637 = class401.field5559;
            } else {
                this.field8637 = 0;
            }
            try {
                int[] var12 = HardwareInfo.getCPUInfo();
                if (var12 != null && var12.length == 7) {
                    this.field8641 = var12[3];
                    this.field8633 = var12[4];
                    this.field8636 = var12[2];
                    this.field8654 = var12[6];
                    this.field8647 = var12[5];
                }
            } catch (Throwable var14) {
                class486.method2844((byte) -1, var14.getMessage() + " (Recovered)", var14);
                this.field8654 = 0;
            }
        }
        if (this.field8630 == null) {
            this.field8630 = "";
        }
        if (this.field8635 == null) {
            this.field8635 = "";
        }
        if (this.field8640 == null) {
            this.field8640 = "";
        }
        if (this.field8653 == null) {
            this.field8653 = "";
        }
        this.method3395((byte) 99);
    }
}
