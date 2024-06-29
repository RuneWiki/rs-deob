import jaclib.hardware_info.HardwareInfo;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class733 extends class55 {

    @OriginalMember(owner = "client!pg", name = "H", descriptor = "I")
    private int field10222;

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "Z")
    private boolean field10207;

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "I")
    private int field10208;

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "I")
    private int field10211;

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "I")
    private int field10212;

    @OriginalMember(owner = "client!pg", name = "L", descriptor = "I")
    private int field10224;

    @OriginalMember(owner = "client!pg", name = "A", descriptor = "I")
    private int field10217;

    @OriginalMember(owner = "client!pg", name = "x", descriptor = "I")
    private int field10214;

    @OriginalMember(owner = "client!pg", name = "w", descriptor = "Z")
    private boolean field10213;

    @OriginalMember(owner = "client!pg", name = "E", descriptor = "I")
    private int field10220;

    @OriginalMember(owner = "client!pg", name = "M", descriptor = "I")
    private int field10225;

    @OriginalMember(owner = "client!pg", name = "y", descriptor = "I")
    private int field10215;

    @OriginalMember(owner = "client!pg", name = "z", descriptor = "I")
    private int field10216;

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "I")
    public int field10203;

    @OriginalMember(owner = "client!pg", name = "N", descriptor = "I")
    private int field10226;

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "Ljava/lang/String;")
    private String field10210;

    @OriginalMember(owner = "client!pg", name = "C", descriptor = "Ljava/lang/String;")
    private String field10218;

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "Ljava/lang/String;")
    private String field10206;

    @OriginalMember(owner = "client!pg", name = "F", descriptor = "Ljava/lang/String;")
    private String field10221;

    @OriginalMember(owner = "client!pg", name = "D", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field10219 = new Rectangle[100];

    @OriginalMember(owner = "client!pg", name = "O", descriptor = "Lee;")
    public static class676 field10227;

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "I")
    public static int field10201;

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "I")
    public static int field10202;

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "I")
    public static int field10204;

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "I")
    private int field10205;

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "I")
    private int field10209;

    @OriginalMember(owner = "client!pg", name = "J", descriptor = "I")
    public static int field10223;

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field10219[var0] = new Rectangle();
        }
        field10227 = new class676();
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V", line = 15)
    public static final void method4102(int arg0) {
        field10201++;
        class395.field5617.method434(((float) class11.field68.field5523.method746((byte) 122) * 0.1F + 0.7F) * 1.1523438F);
        class395.field5617.method380(class425.field5994, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
        class395.field5617.method442(class63.field686, -1, arg0);
        class395.field5617.method387(class267.field3537);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BLji;)V", line = 26)
    public final void method4103(byte arg0, class611 arg1) {
        field10223++;
        arg1.method3393(5, arg0 - 104);
        arg1.method3393(this.field10222, -115);
        arg1.method3393(this.field10207 ? 1 : 0, 85);
        arg1.method3393(this.field10208, arg0 - 137);
        if (arg0 != 17) {
            method4102(-7);
        }
        arg1.method3393(this.field10211, 95);
        arg1.method3393(this.field10212, 114);
        arg1.method3393(this.field10224, arg0 ^ 0x26);
        arg1.method3393(this.field10217, -36);
        arg1.method3393(this.field10213 ? 1 : 0, arg0 ^ 0x63);
        arg1.method3423(this.field10214, 1571862888);
        arg1.method3393(this.field10220, -36);
        arg1.method3424(-24472, this.field10203);
        arg1.method3423(this.field10226, arg0 + 1571862871);
        arg1.method3393(this.field10216, -101);
        arg1.method3393(this.field10225, 114);
        arg1.method3393(this.field10215, -128);
        arg1.method3380(this.field10206, -1);
        arg1.method3380(this.field10218, -1);
        arg1.method3380(this.field10221, -1);
        arg1.method3380(this.field10210, -1);
        arg1.method3393(this.field10205, -76);
        arg1.method3423(this.field10209, 1571862888);
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V", line = 65)
    private final void method4104(int arg0) {
        if (arg0 >= -6) {
            return;
        }
        field10202++;
        if (this.field10206.length() > 40) {
            this.field10206 = this.field10206.substring(0, 40);
        }
        if (this.field10218.length() > 40) {
            this.field10218 = this.field10218.substring(0, 40);
        }
        if (this.field10221.length() > 10) {
            this.field10221 = this.field10221.substring(0, 10);
        }
        if (this.field10210.length() > 10) {
            this.field10210 = this.field10210.substring(0, 10);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)I", line = 90)
    public final int method4105(byte arg0) {
        field10204++;
        if (arg0 < 112) {
            return -52;
        }
        byte var2 = 23;
        int var3 = var2 + class48.method279(this.field10206, false);
        int var4 = var3 + class48.method279(this.field10218, false);
        int var5 = var4 + class48.method279(this.field10221, false);
        return var5 + class48.method279(this.field10210, false);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)V", line = 118)
    public static void method4106(boolean arg0) {
        if (arg0) {
            field10219 = null;
        }
        field10219 = null;
        field10227 = null;
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V", line = 131)
    public class733() {
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(ZLfl;)V", line = 146)
    public class733(boolean arg0, class739 arg1) {
        if (arg0) {
            if (class739.field10307.startsWith("win")) {
                this.field10222 = 1;
            } else if (class739.field10307.startsWith("mac")) {
                this.field10222 = 2;
            } else if (class739.field10307.startsWith("linux")) {
                this.field10222 = 3;
            } else {
                this.field10222 = 4;
            }
            if (class739.field10298.startsWith("amd64") || class739.field10298.startsWith("x86_64")) {
                this.field10207 = true;
            } else {
                this.field10207 = false;
            }
            if (this.field10222 == 1) {
                if (class739.field10284.indexOf("4.0") != -1) {
                    this.field10208 = 1;
                } else if (class739.field10284.indexOf("4.1") != -1) {
                    this.field10208 = 2;
                } else if (class739.field10284.indexOf("4.9") != -1) {
                    this.field10208 = 3;
                } else if (class739.field10284.indexOf("5.0") != -1) {
                    this.field10208 = 4;
                } else if (class739.field10284.indexOf("5.1") != -1) {
                    this.field10208 = 5;
                } else if (class739.field10284.indexOf("6.0") != -1) {
                    this.field10208 = 6;
                } else if (class739.field10284.indexOf("6.1") != -1) {
                    this.field10208 = 7;
                }
            } else if (this.field10222 == 2) {
                if (class739.field10284.indexOf("10.4") != -1) {
                    this.field10208 = 20;
                } else if (class739.field10284.indexOf("10.5") != -1) {
                    this.field10208 = 21;
                } else if (class739.field10284.indexOf("10.6") != -1) {
                    this.field10208 = 22;
                }
            }
            if (class739.field10304.toLowerCase().indexOf("sun") != -1) {
                this.field10211 = 1;
            } else if (class739.field10304.toLowerCase().indexOf("microsoft") != -1) {
                this.field10211 = 2;
            } else if (class739.field10304.toLowerCase().indexOf("apple") == -1) {
                this.field10211 = 4;
            } else {
                this.field10211 = 3;
            }
            int var3 = 2;
            int var4 = 0;
            try {
                while (var3 < class739.field10300.length()) {
                    char var5 = class739.field10300.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var4 * 10 + (var5 - '0');
                }
            } catch (Exception var17) {
            }
            this.field10212 = var4;
            int var6 = class739.field10300.indexOf(46, 2) + 1;
            int var7 = 0;
            try {
                while (class739.field10300.length() > var6) {
                    char var8 = class739.field10300.charAt(var6);
                    if (var8 < '0' || var8 > '9') {
                        break;
                    }
                    var6++;
                    var7 = var7 * 10 + (var8 - 48);
                }
            } catch (Exception var16) {
            }
            this.field10224 = var7;
            int var9 = class739.field10300.indexOf(95, 4) + 1;
            int var10 = 0;
            try {
                while (class739.field10300.length() > var9) {
                    char var11 = class739.field10300.charAt(var9);
                    if (var11 < '0' || var11 > '9') {
                        break;
                    }
                    var10 = var10 * 10 + var11 - 48;
                    var9++;
                }
            } catch (Exception var15) {
            }
            this.field10217 = var10;
            this.field10214 = class206.field2483;
            if (arg1.field10290) {
                this.field10213 = false;
            } else {
                this.field10213 = true;
            }
            if (this.field10212 <= 3) {
                this.field10220 = 0;
            } else {
                this.field10220 = class761.field10625;
            }
            try {
                int[] var12 = HardwareInfo.getCPUInfo();
                if (var12 != null && var12.length == 7) {
                    this.field10225 = var12[4];
                    this.field10215 = var12[5];
                    this.field10216 = var12[3];
                    this.field10203 = var12[6];
                    this.field10226 = var12[2];
                }
            } catch (Throwable var14) {
                class760.method4223(var14, -121, var14.getMessage() + " (Recovered)");
                this.field10203 = 0;
            }
        }
        if (this.field10210 == null) {
            this.field10210 = "";
        }
        if (this.field10218 == null) {
            this.field10218 = "";
        }
        if (this.field10206 == null) {
            this.field10206 = "";
        }
        if (this.field10221 == null) {
            this.field10221 = "";
        }
        this.method4104(-120);
    }
}
