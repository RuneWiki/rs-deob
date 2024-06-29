import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class734 extends class159 {

    @OriginalMember(owner = "client!ip", name = "k", descriptor = "I")
    private int field9930;

    @OriginalMember(owner = "client!ip", name = "D", descriptor = "Z")
    private boolean field9949;

    @OriginalMember(owner = "client!ip", name = "v", descriptor = "I")
    private int field9941;

    @OriginalMember(owner = "client!ip", name = "m", descriptor = "I")
    private int field9932;

    @OriginalMember(owner = "client!ip", name = "K", descriptor = "I")
    private int field9956;

    @OriginalMember(owner = "client!ip", name = "l", descriptor = "I")
    private int field9931;

    @OriginalMember(owner = "client!ip", name = "y", descriptor = "I")
    private int field9944;

    @OriginalMember(owner = "client!ip", name = "u", descriptor = "I")
    private int field9940;

    @OriginalMember(owner = "client!ip", name = "C", descriptor = "Z")
    private boolean field9948;

    @OriginalMember(owner = "client!ip", name = "z", descriptor = "I")
    private int field9945;

    @OriginalMember(owner = "client!ip", name = "t", descriptor = "I")
    private int field9939;

    @OriginalMember(owner = "client!ip", name = "B", descriptor = "I")
    private int field9947;

    @OriginalMember(owner = "client!ip", name = "q", descriptor = "I")
    private int field9936;

    @OriginalMember(owner = "client!ip", name = "H", descriptor = "I")
    public int field9953;

    @OriginalMember(owner = "client!ip", name = "o", descriptor = "I")
    private int field9934;

    @OriginalMember(owner = "client!ip", name = "A", descriptor = "Ljava/lang/String;")
    private String field9946;

    @OriginalMember(owner = "client!ip", name = "w", descriptor = "Ljava/lang/String;")
    private String field9942;

    @OriginalMember(owner = "client!ip", name = "G", descriptor = "Ljava/lang/String;")
    private String field9952;

    @OriginalMember(owner = "client!ip", name = "s", descriptor = "Ljava/lang/String;")
    private String field9938;

    @OriginalMember(owner = "client!ip", name = "E", descriptor = "Ljb;")
    public static class519 field9950 = new class519(128, 0);

    @OriginalMember(owner = "client!ip", name = "J", descriptor = "Ljb;")
    public static class519 field9955 = new class519(111, 7);

    @OriginalMember(owner = "client!ip", name = "M", descriptor = "F")
    public static float field9958;

    @OriginalMember(owner = "client!ip", name = "n", descriptor = "I")
    private int field9933;

    @OriginalMember(owner = "client!ip", name = "p", descriptor = "I")
    public static int field9935;

    @OriginalMember(owner = "client!ip", name = "r", descriptor = "I")
    public static int field9937;

    @OriginalMember(owner = "client!ip", name = "x", descriptor = "I")
    private int field9943;

    @OriginalMember(owner = "client!ip", name = "I", descriptor = "I")
    public static int field9954;

    @OriginalMember(owner = "client!ip", name = "F", descriptor = "Luq;")
    public static class172 field9951;

    @OriginalMember(owner = "client!ip", name = "L", descriptor = "Lda;")
    public static class67 field9957;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V", line = 18)
    public static void method4046(int arg0) {
        field9951 = null;
        field9950 = null;
        if (arg0 < -5) {
            field9957 = null;
            field9955 = null;
        }
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(I)I", line = 33)
    public final int method4047(int arg0) {
        field9954++;
        byte var2 = 23;
        if (arg0 != -1) {
            this.method4049((byte) -16, null);
        }
        int var3 = var2 + class544.method3137(this.field9942, 113);
        int var4 = var3 + class544.method3137(this.field9938, 97);
        int var5 = var4 + class544.method3137(this.field9952, arg0 ^ 0xFFFFFF99);
        return var5 + class544.method3137(this.field9946, 106);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)V", line = 56)
    private final void method4048(byte arg0) {
        if (this.field9942.length() > 40) {
            this.field9942 = this.field9942.substring(0, 40);
        }
        if (arg0 != 36) {
            this.field9946 = null;
        }
        field9937++;
        if (this.field9938.length() > 40) {
            this.field9938 = this.field9938.substring(0, 40);
        }
        if (this.field9952.length() > 10) {
            this.field9952 = this.field9952.substring(0, 10);
        }
        if (this.field9946.length() > 10) {
            this.field9946 = this.field9946.substring(0, 10);
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(BLdt;)V", line = 86)
    public final void method4049(byte arg0, class254 arg1) {
        arg1.method1725(5, 41);
        field9935++;
        arg1.method1725(this.field9930, 32);
        arg1.method1725(this.field9949 ? 1 : 0, 101);
        arg1.method1725(this.field9941, 51);
        if (arg0 < 28) {
            this.method4047(13);
        }
        arg1.method1725(this.field9932, 97);
        arg1.method1725(this.field9956, 99);
        arg1.method1725(this.field9931, 96);
        arg1.method1725(this.field9944, 68);
        arg1.method1725(this.field9948 ? 1 : 0, 50);
        arg1.method1733(this.field9940, -32466);
        arg1.method1725(this.field9945, 36);
        arg1.method1682(this.field9953, (byte) 67);
        arg1.method1733(this.field9936, -32466);
        arg1.method1725(this.field9934, 69);
        arg1.method1725(this.field9939, 125);
        arg1.method1725(this.field9947, 65);
        arg1.method1677(this.field9942, 0);
        arg1.method1677(this.field9938, 0);
        arg1.method1677(this.field9952, 0);
        arg1.method1677(this.field9946, 0);
        arg1.method1725(this.field9943, 76);
        arg1.method1733(this.field9933, -32466);
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "()V", line = 125)
    public class734() {
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(ZLec;)V", line = 127)
    public class734(boolean arg0, class248 arg1) {
        if (arg0) {
            if (class248.field3232.startsWith("win")) {
                this.field9930 = 1;
            } else if (class248.field3232.startsWith("mac")) {
                this.field9930 = 2;
            } else if (class248.field3232.startsWith("linux")) {
                this.field9930 = 3;
            } else {
                this.field9930 = 4;
            }
            if (class248.field3247.startsWith("amd64") || class248.field3247.startsWith("x86_64")) {
                this.field9949 = true;
            } else {
                this.field9949 = false;
            }
            if (this.field9930 == 1) {
                if (class248.field3235.indexOf("4.0") != -1) {
                    this.field9941 = 1;
                } else if (class248.field3235.indexOf("4.1") != -1) {
                    this.field9941 = 2;
                } else if (class248.field3235.indexOf("4.9") != -1) {
                    this.field9941 = 3;
                } else if (class248.field3235.indexOf("5.0") != -1) {
                    this.field9941 = 4;
                } else if (class248.field3235.indexOf("5.1") != -1) {
                    this.field9941 = 5;
                } else if (class248.field3235.indexOf("6.0") != -1) {
                    this.field9941 = 6;
                } else if (class248.field3235.indexOf("6.1") != -1) {
                    this.field9941 = 7;
                }
            } else if (this.field9930 == 2) {
                if (class248.field3235.indexOf("10.4") != -1) {
                    this.field9941 = 20;
                } else if (class248.field3235.indexOf("10.5") != -1) {
                    this.field9941 = 21;
                } else if (class248.field3235.indexOf("10.6") != -1) {
                    this.field9941 = 22;
                }
            }
            if (class248.field3246.toLowerCase().indexOf("sun") != -1) {
                this.field9932 = 1;
            } else if (class248.field3246.toLowerCase().indexOf("microsoft") != -1) {
                this.field9932 = 2;
            } else if (class248.field3246.toLowerCase().indexOf("apple") == -1) {
                this.field9932 = 4;
            } else {
                this.field9932 = 3;
            }
            int var3 = 2;
            int var4 = 0;
            try {
                while (class248.field3250.length() > var3) {
                    char var5 = class248.field3250.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var4 * 10 + var5 - 48;
                }
            } catch (Exception var16) {
            }
            this.field9956 = var4;
            int var6 = class248.field3250.indexOf(46, 2) + 1;
            int var7 = 0;
            try {
                while (var6 < class248.field3250.length()) {
                    char var8 = class248.field3250.charAt(var6);
                    if (var8 < '0' || var8 > '9') {
                        break;
                    }
                    var6++;
                    var7 = var7 * 10 + var8 - 48;
                }
            } catch (Exception var15) {
            }
            this.field9931 = var7;
            int var9 = class248.field3250.indexOf(95, 4) + 1;
            int var10 = 0;
            try {
                while (class248.field3250.length() > var9) {
                    char var11 = class248.field3250.charAt(var9);
                    if (var11 < '0' || var11 > '9') {
                        break;
                    }
                    var9++;
                    var10 = -(-var11 - var10 * 10) - 48;
                }
            } catch (Exception var14) {
            }
            this.field9944 = var10;
            this.field9940 = class115.field1557;
            if (arg1.field3248) {
                this.field9948 = false;
            } else {
                this.field9948 = true;
            }
            if (this.field9956 <= 3) {
                this.field9945 = 0;
            } else {
                this.field9945 = class683.field9123;
            }
            try {
                int[] var12 = HardwareInfo.getCPUInfo();
                if (var12 != null && var12.length == 7) {
                    this.field9939 = var12[4];
                    this.field9947 = var12[5];
                    this.field9936 = var12[2];
                    this.field9953 = var12[6];
                    this.field9934 = var12[3];
                }
            } catch (Throwable var13) {
                this.field9953 = 0;
            }
        }
        if (this.field9946 == null) {
            this.field9946 = "";
        }
        if (this.field9942 == null) {
            this.field9942 = "";
        }
        if (this.field9952 == null) {
            this.field9952 = "";
        }
        if (this.field9938 == null) {
            this.field9938 = "";
        }
        this.method4048((byte) 36);
    }
}
