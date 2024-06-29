import jaclib.hardware_info.HardwareInfo;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public class class12 extends class577 {

    @OriginalMember(owner = "client!daa", name = "J", descriptor = "I")
    private int field246;

    @OriginalMember(owner = "client!daa", name = "t", descriptor = "Z")
    private boolean field230;

    @OriginalMember(owner = "client!daa", name = "A", descriptor = "I")
    private int field237;

    @OriginalMember(owner = "client!daa", name = "x", descriptor = "I")
    private int field234;

    @OriginalMember(owner = "client!daa", name = "v", descriptor = "I")
    private int field232;

    @OriginalMember(owner = "client!daa", name = "r", descriptor = "I")
    private int field228;

    @OriginalMember(owner = "client!daa", name = "n", descriptor = "I")
    private int field224;

    @OriginalMember(owner = "client!daa", name = "L", descriptor = "Z")
    private boolean field248;

    @OriginalMember(owner = "client!daa", name = "E", descriptor = "I")
    private int field241;

    @OriginalMember(owner = "client!daa", name = "O", descriptor = "I")
    private int field251;

    @OriginalMember(owner = "client!daa", name = "G", descriptor = "I")
    private int field243;

    @OriginalMember(owner = "client!daa", name = "y", descriptor = "I")
    private int field235;

    @OriginalMember(owner = "client!daa", name = "I", descriptor = "I")
    private int field245;

    @OriginalMember(owner = "client!daa", name = "D", descriptor = "I")
    private int field240;

    @OriginalMember(owner = "client!daa", name = "M", descriptor = "I")
    public int field249;

    @OriginalMember(owner = "client!daa", name = "K", descriptor = "Ljava/lang/String;")
    private String field247;

    @OriginalMember(owner = "client!daa", name = "F", descriptor = "Ljava/lang/String;")
    private String field242;

    @OriginalMember(owner = "client!daa", name = "s", descriptor = "Ljava/lang/String;")
    private String field229;

    @OriginalMember(owner = "client!daa", name = "m", descriptor = "Ljava/lang/String;")
    private String field223;

    @OriginalMember(owner = "client!daa", name = "l", descriptor = "[[Ljava/lang/String;")
    public static String[][] field222 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

    @OriginalMember(owner = "client!daa", name = "u", descriptor = "Ljava/lang/String;")
    public static String field231 = null;

    @OriginalMember(owner = "client!daa", name = "o", descriptor = "F")
    public static float field225;

    @OriginalMember(owner = "client!daa", name = "p", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!daa", name = "q", descriptor = "I")
    private int field227;

    @OriginalMember(owner = "client!daa", name = "w", descriptor = "I")
    private int field233;

    @OriginalMember(owner = "client!daa", name = "z", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!daa", name = "B", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!daa", name = "C", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!daa", name = "H", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!daa", name = "N", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!daa", name = "P", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(I)V", line = 3)
    public static void method130(int arg0) {
        if (arg0 <= 117) {
            method136(25);
        }
        field231 = null;
        field222 = null;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(Z)Z", line = 14)
    public static final boolean method131(boolean arg0) {
        if (arg0) {
            field252++;
            return class618.field8644 > 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "(I)I", line = 35)
    public final int method132(int arg0) {
        field226++;
        byte var2 = 23;
        int var3 = var2 + class631.method3615(this.field242, (byte) 88);
        int var4 = var3 + class631.method3615(this.field223, (byte) 88);
        int var5 = var4 + class631.method3615(this.field229, (byte) 88);
        if (arg0 > -55) {
            method131(false);
        }
        return var5 + class631.method3615(this.field247, (byte) 88);
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(IBIIIIIII)Z", line = 55)
    public static final boolean method133(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field239++;
        if (arg1 != 64) {
            method130(90);
        }
        if ((arg6 + arg7) > arg0 && arg0 + arg2 > arg6) {
            return arg3 + arg8 > arg4 && (arg4 + arg5) > arg3;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(Lso;I)V", line = 77)
    public final void method134(class494 arg0, int arg1) {
        field250++;
        arg0.method2952(0, 5);
        arg0.method2952(0, this.field246);
        arg0.method2952(arg1, this.field230 ? 1 : 0);
        arg0.method2952(arg1, this.field237);
        arg0.method2952(arg1, this.field234);
        arg0.method2952(arg1, this.field232);
        arg0.method2952(0, this.field228);
        arg0.method2952(0, this.field224);
        arg0.method2952(arg1, this.field248 ? 1 : 0);
        arg0.method2957(this.field241, 1267307848);
        arg0.method2952(0, this.field251);
        arg0.method2995(-126, this.field249);
        arg0.method2957(this.field235, arg1 + 1267307848);
        arg0.method2952(0, this.field243);
        arg0.method2952(0, this.field245);
        arg0.method2952(0, this.field240);
        arg0.method2966(this.field242, -8697);
        arg0.method2966(this.field223, -8697);
        arg0.method2966(this.field229, -8697);
        arg0.method2966(this.field247, arg1 - 8697);
        arg0.method2952(arg1, this.field233);
        arg0.method2957(this.field227, 1267307848);
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(IJ)V", line = 107)
    public static final void method135(int arg0, long arg1) {
        field236++;
        if (arg0 == 9281) {
            class4.field31.setTime(new Date(arg1));
        }
    }

    @OriginalMember(owner = "client!daa", name = "c", descriptor = "(I)I", line = 121)
    public static final int method136(int arg0) {
        field244++;
        if ((double) class117.field1802 == 3.0D) {
            return 37;
        } else if ((double) class117.field1802 == 4.0D) {
            return 50;
        } else if (arg0 != -11) {
            return 22;
        } else if ((double) class117.field1802 == 6.0D) {
            return 75;
        } else if ((double) class117.field1802 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!daa", name = "c", descriptor = "(B)V", line = 154)
    private final void method137(byte arg0) {
        if (this.field242.length() > 40) {
            this.field242 = this.field242.substring(0, 40);
        }
        field238++;
        if (arg0 >= -46) {
            this.field235 = 126;
        }
        if (this.field223.length() > 40) {
            this.field223 = this.field223.substring(0, 40);
        }
        if (this.field229.length() > 10) {
            this.field229 = this.field229.substring(0, 10);
        }
        if (this.field247.length() > 10) {
            this.field247 = this.field247.substring(0, 10);
        }
    }

    @OriginalMember(owner = "client!daa", name = "<init>", descriptor = "()V", line = 190)
    public class12() {
    }

    @OriginalMember(owner = "client!daa", name = "<init>", descriptor = "(ZLtd;)V", line = 194)
    public class12(boolean arg0, class477 arg1) {
        if (arg0) {
            if (class477.field6690.startsWith("win")) {
                this.field246 = 1;
            } else if (class477.field6690.startsWith("mac")) {
                this.field246 = 2;
            } else if (class477.field6690.startsWith("linux")) {
                this.field246 = 3;
            } else {
                this.field246 = 4;
            }
            if (class477.field6683.startsWith("amd64") || class477.field6683.startsWith("x86_64")) {
                this.field230 = true;
            } else {
                this.field230 = false;
            }
            if (this.field246 == 1) {
                if (class477.field6700.indexOf("4.0") != -1) {
                    this.field237 = 1;
                } else if (class477.field6700.indexOf("4.1") != -1) {
                    this.field237 = 2;
                } else if (class477.field6700.indexOf("4.9") != -1) {
                    this.field237 = 3;
                } else if (class477.field6700.indexOf("5.0") != -1) {
                    this.field237 = 4;
                } else if (class477.field6700.indexOf("5.1") != -1) {
                    this.field237 = 5;
                } else if (class477.field6700.indexOf("6.0") != -1) {
                    this.field237 = 6;
                } else if (class477.field6700.indexOf("6.1") != -1) {
                    this.field237 = 7;
                }
            } else if (this.field246 == 2) {
                if (class477.field6700.indexOf("10.4") != -1) {
                    this.field237 = 20;
                } else if (class477.field6700.indexOf("10.5") != -1) {
                    this.field237 = 21;
                } else if (class477.field6700.indexOf("10.6") != -1) {
                    this.field237 = 22;
                }
            }
            if (class477.field6679.toLowerCase().indexOf("sun") != -1) {
                this.field234 = 1;
            } else if (class477.field6679.toLowerCase().indexOf("microsoft") != -1) {
                this.field234 = 2;
            } else if (class477.field6679.toLowerCase().indexOf("apple") == -1) {
                this.field234 = 4;
            } else {
                this.field234 = 3;
            }
            int var3 = 2;
            int var4 = 0;
            try {
                while (var3 < class477.field6682.length()) {
                    char var5 = class477.field6682.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 - (48 - var5);
                    var3++;
                }
            } catch (Exception var16) {
            }
            this.field232 = var4;
            int var6 = 0;
            int var7 = class477.field6682.indexOf(46, 2) + 1;
            try {
                while (class477.field6682.length() > var7) {
                    char var8 = class477.field6682.charAt(var7);
                    if (var8 < '0' || var8 > '9') {
                        break;
                    }
                    var7++;
                    var6 = -(-var8 - var6 * 10) - 48;
                }
            } catch (Exception var15) {
            }
            this.field228 = var6;
            int var9 = 0;
            int var10 = class477.field6682.indexOf(95, 4) + 1;
            try {
                while (var10 < class477.field6682.length()) {
                    char var11 = class477.field6682.charAt(var10);
                    if (var11 < '0' || var11 > '9') {
                        break;
                    }
                    var9 = var9 * 10 + var11 - 48;
                    var10++;
                }
            } catch (Exception var14) {
            }
            this.field224 = var9;
            if (arg1.field6674) {
                this.field248 = false;
            } else {
                this.field248 = true;
            }
            this.field241 = class54.field676;
            if (this.field232 > 3) {
                this.field251 = class355.field5003;
            } else {
                this.field251 = 0;
            }
            try {
                int[] var12 = HardwareInfo.getCPUInfo();
                if (var12 != null && var12.length == 7) {
                    this.field243 = var12[3];
                    this.field235 = var12[2];
                    this.field245 = var12[4];
                    this.field240 = var12[5];
                    this.field249 = var12[6];
                }
            } catch (Throwable var13) {
                this.field249 = 0;
            }
        }
        if (this.field247 == null) {
            this.field247 = "";
        }
        if (this.field242 == null) {
            this.field242 = "";
        }
        if (this.field229 == null) {
            this.field229 = "";
        }
        if (this.field223 == null) {
            this.field223 = "";
        }
        this.method137((byte) -103);
    }
}
