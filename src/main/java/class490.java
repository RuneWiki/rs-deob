import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public class class490 extends class69 {

    @OriginalMember(owner = "client!kda", name = "F", descriptor = "I")
    private int field6755;

    @OriginalMember(owner = "client!kda", name = "z", descriptor = "Z")
    private boolean field6749;

    @OriginalMember(owner = "client!kda", name = "n", descriptor = "I")
    private int field6737;

    @OriginalMember(owner = "client!kda", name = "D", descriptor = "I")
    private int field6753;

    @OriginalMember(owner = "client!kda", name = "J", descriptor = "I")
    private int field6759;

    @OriginalMember(owner = "client!kda", name = "o", descriptor = "I")
    private int field6738;

    @OriginalMember(owner = "client!kda", name = "G", descriptor = "I")
    private int field6756;

    @OriginalMember(owner = "client!kda", name = "p", descriptor = "Z")
    private boolean field6739;

    @OriginalMember(owner = "client!kda", name = "r", descriptor = "I")
    private int field6741;

    @OriginalMember(owner = "client!kda", name = "v", descriptor = "I")
    private int field6745;

    @OriginalMember(owner = "client!kda", name = "j", descriptor = "I")
    private int field6733;

    @OriginalMember(owner = "client!kda", name = "E", descriptor = "I")
    private int field6754;

    @OriginalMember(owner = "client!kda", name = "q", descriptor = "I")
    private int field6740;

    @OriginalMember(owner = "client!kda", name = "u", descriptor = "I")
    public int field6744;

    @OriginalMember(owner = "client!kda", name = "A", descriptor = "I")
    private int field6750;

    @OriginalMember(owner = "client!kda", name = "l", descriptor = "Ljava/lang/String;")
    private String field6735;

    @OriginalMember(owner = "client!kda", name = "B", descriptor = "Ljava/lang/String;")
    private String field6751;

    @OriginalMember(owner = "client!kda", name = "y", descriptor = "Ljava/lang/String;")
    private String field6748;

    @OriginalMember(owner = "client!kda", name = "m", descriptor = "Ljava/lang/String;")
    private String field6736;

    @OriginalMember(owner = "client!kda", name = "H", descriptor = "I")
    public static int field6757 = 0;

    @OriginalMember(owner = "client!kda", name = "s", descriptor = "I")
    public static int field6742;

    @OriginalMember(owner = "client!kda", name = "t", descriptor = "I")
    public static int field6743;

    @OriginalMember(owner = "client!kda", name = "w", descriptor = "I")
    private int field6746;

    @OriginalMember(owner = "client!kda", name = "x", descriptor = "I")
    public static int field6747;

    @OriginalMember(owner = "client!kda", name = "C", descriptor = "I")
    private int field6752;

    @OriginalMember(owner = "client!kda", name = "I", descriptor = "I")
    public static int field6758;

    @OriginalMember(owner = "client!kda", name = "k", descriptor = "[I")
    public static int[] field6734;

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(Z)V", line = 6)
    private final void method2896(boolean arg0) {
        if (arg0) {
            this.method2897(60, null);
        }
        if (this.field6735.length() > 40) {
            this.field6735 = this.field6735.substring(0, 40);
        }
        field6742++;
        if (this.field6748.length() > 40) {
            this.field6748 = this.field6748.substring(0, 40);
        }
        if (this.field6751.length() > 10) {
            this.field6751 = this.field6751.substring(0, 10);
        }
        if (this.field6736.length() > 10) {
            this.field6736 = this.field6736.substring(0, 10);
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(ILgga;)V", line = 43)
    public final void method2897(int arg0, class511 arg1) {
        field6743++;
        if (arg0 <= 41) {
            this.method2899(-119);
        }
        arg1.method3005(255, 5);
        arg1.method3005(255, this.field6755);
        arg1.method3005(255, this.field6749 ? 1 : 0);
        arg1.method3005(255, this.field6737);
        arg1.method3005(255, this.field6753);
        arg1.method3005(255, this.field6759);
        arg1.method3005(255, this.field6738);
        arg1.method3005(255, this.field6756);
        arg1.method3005(255, this.field6739 ? 1 : 0);
        arg1.method2986(this.field6741, -19);
        arg1.method3005(255, this.field6745);
        arg1.method3026(this.field6744, (byte) -111);
        arg1.method2986(this.field6733, 97);
        arg1.method3005(255, this.field6750);
        arg1.method3005(255, this.field6754);
        arg1.method3005(255, this.field6740);
        arg1.method2995(this.field6735, (byte) 72);
        arg1.method2995(this.field6748, (byte) 72);
        arg1.method2995(this.field6751, (byte) 72);
        arg1.method2995(this.field6736, (byte) 72);
        arg1.method3005(255, this.field6752);
        arg1.method2986(this.field6746, 9);
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(B)V", line = 77)
    public static void method2898(byte arg0) {
        if (arg0 > -8) {
            field6734 = null;
        }
        field6734 = null;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)I", line = 90)
    public final int method2899(int arg0) {
        if (arg0 >= -107) {
            method2898((byte) 46);
        }
        field6758++;
        byte var2 = 23;
        int var3 = var2 + client.method780(this.field6735, (byte) 66);
        int var4 = var3 + client.method780(this.field6748, (byte) 66);
        int var5 = var4 + client.method780(this.field6751, (byte) 66);
        return var5 + client.method780(this.field6736, (byte) 66);
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(B[BILjava/lang/String;)I", line = 109)
    public static final int method2900(byte arg0, byte[] arg1, int arg2, String arg3) {
        field6747++;
        int var4 = arg2;
        if (arg0 <= 105) {
            return -4;
        }
        int var5 = arg3.length();
        for (int var6 = 0; var6 < var5; var6 += 4) {
            int var7 = class485.method2880(false, arg3.charAt(var6));
            int var8 = var5 <= (var6 + 1) ? -1 : class485.method2880(false, arg3.charAt(var6 + 1));
            int var9 = var6 + 2 < var5 ? class485.method2880(false, arg3.charAt(var6 + 2)) : -1;
            int var10 = (var6 + 3) >= var5 ? -1 : class485.method2880(false, arg3.charAt(var6 + 3));
            arg1[arg2++] = (byte) class613.method3544(var8 >>> 4, var7 << 2);
            if (var9 == -1) {
                break;
            }
            arg1[arg2++] = (byte) class613.method3544(var9 >>> 2, class407.method2490(var8 << 4, 240));
            if (var10 == -1) {
                break;
            }
            arg1[arg2++] = (byte) class613.method3544(class407.method2490(var9 << 6, 192), var10);
        }
        return arg2 - var4;
    }

    @OriginalMember(owner = "client!kda", name = "<init>", descriptor = "()V", line = 159)
    public class490() {
    }

    @OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(ZLvt;)V", line = 161)
    public class490(boolean arg0, class768 arg1) {
        if (arg0) {
            if (class768.field10562.startsWith("win")) {
                this.field6755 = 1;
            } else if (class768.field10562.startsWith("mac")) {
                this.field6755 = 2;
            } else if (class768.field10562.startsWith("linux")) {
                this.field6755 = 3;
            } else {
                this.field6755 = 4;
            }
            if (class768.field10570.startsWith("amd64") || class768.field10570.startsWith("x86_64")) {
                this.field6749 = true;
            } else {
                this.field6749 = false;
            }
            if (this.field6755 == 1) {
                if (class768.field10581.indexOf("4.0") != -1) {
                    this.field6737 = 1;
                } else if (class768.field10581.indexOf("4.1") != -1) {
                    this.field6737 = 2;
                } else if (class768.field10581.indexOf("4.9") != -1) {
                    this.field6737 = 3;
                } else if (class768.field10581.indexOf("5.0") != -1) {
                    this.field6737 = 4;
                } else if (class768.field10581.indexOf("5.1") != -1) {
                    this.field6737 = 5;
                } else if (class768.field10581.indexOf("6.0") != -1) {
                    this.field6737 = 6;
                } else if (class768.field10581.indexOf("6.1") != -1) {
                    this.field6737 = 7;
                }
            } else if (this.field6755 == 2) {
                if (class768.field10581.indexOf("10.4") != -1) {
                    this.field6737 = 20;
                } else if (class768.field10581.indexOf("10.5") != -1) {
                    this.field6737 = 21;
                } else if (class768.field10581.indexOf("10.6") != -1) {
                    this.field6737 = 22;
                }
            }
            if (class768.field10568.toLowerCase().indexOf("sun") != -1) {
                this.field6753 = 1;
            } else if (class768.field10568.toLowerCase().indexOf("microsoft") != -1) {
                this.field6753 = 2;
            } else if (class768.field10568.toLowerCase().indexOf("apple") == -1) {
                this.field6753 = 4;
            } else {
                this.field6753 = 3;
            }
            int var3 = 2;
            int var4 = 0;
            try {
                while (var3 < class768.field10573.length()) {
                    char var5 = class768.field10573.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = -(-var5 - var4 * 10) - 48;
                    var3++;
                }
            } catch (Exception var16) {
            }
            this.field6759 = var4;
            int var6 = class768.field10573.indexOf(46, 2) + 1;
            int var7 = 0;
            try {
                while (var6 < class768.field10573.length()) {
                    char var8 = class768.field10573.charAt(var6);
                    if (var8 < '0' || var8 > '9') {
                        break;
                    }
                    var7 = var7 * 10 + var8 - 48;
                    var6++;
                }
            } catch (Exception var15) {
            }
            this.field6738 = var7;
            int var9 = 0;
            int var10 = class768.field10573.indexOf(95, 4) + 1;
            try {
                while (class768.field10573.length() > var10) {
                    char var11 = class768.field10573.charAt(var10);
                    if (var11 < '0' || var11 > '9') {
                        break;
                    }
                    var9 = var9 * 10 + var11 - 48;
                    var10++;
                }
            } catch (Exception var14) {
            }
            this.field6756 = var9;
            if (arg1.field10576) {
                this.field6739 = false;
            } else {
                this.field6739 = true;
            }
            this.field6741 = class771.field10608;
            if (this.field6759 > 3) {
                this.field6745 = class783.field10746;
            } else {
                this.field6745 = 0;
            }
            try {
                int[] var12 = HardwareInfo.getCPUInfo();
                if (var12 != null && var12.length == 7) {
                    this.field6733 = var12[2];
                    this.field6754 = var12[4];
                    this.field6740 = var12[5];
                    this.field6744 = var12[6];
                    this.field6750 = var12[3];
                }
            } catch (Throwable var13) {
                this.field6744 = 0;
            }
        }
        if (this.field6735 == null) {
            this.field6735 = "";
        }
        if (this.field6751 == null) {
            this.field6751 = "";
        }
        if (this.field6748 == null) {
            this.field6748 = "";
        }
        if (this.field6736 == null) {
            this.field6736 = "";
        }
        this.method2896(false);
    }
}
