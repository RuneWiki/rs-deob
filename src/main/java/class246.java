import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public class class246 extends class134 {

    @OriginalMember(owner = "client!dea", name = "t", descriptor = "I")
    private int field2977;

    @OriginalMember(owner = "client!dea", name = "l", descriptor = "Z")
    private boolean field2969;

    @OriginalMember(owner = "client!dea", name = "m", descriptor = "I")
    private int field2970;

    @OriginalMember(owner = "client!dea", name = "k", descriptor = "I")
    private int field2968;

    @OriginalMember(owner = "client!dea", name = "A", descriptor = "I")
    private int field2984;

    @OriginalMember(owner = "client!dea", name = "n", descriptor = "I")
    private int field2971;

    @OriginalMember(owner = "client!dea", name = "J", descriptor = "I")
    private int field2992;

    @OriginalMember(owner = "client!dea", name = "G", descriptor = "I")
    private int field2989;

    @OriginalMember(owner = "client!dea", name = "j", descriptor = "I")
    private int field2967;

    @OriginalMember(owner = "client!dea", name = "H", descriptor = "Z")
    private boolean field2990;

    @OriginalMember(owner = "client!dea", name = "v", descriptor = "I")
    public int field2979;

    @OriginalMember(owner = "client!dea", name = "q", descriptor = "I")
    private int field2974;

    @OriginalMember(owner = "client!dea", name = "K", descriptor = "I")
    private int field2993;

    @OriginalMember(owner = "client!dea", name = "x", descriptor = "I")
    private int field2981;

    @OriginalMember(owner = "client!dea", name = "I", descriptor = "I")
    private int field2991;

    @OriginalMember(owner = "client!dea", name = "s", descriptor = "Ljava/lang/String;")
    private String field2976;

    @OriginalMember(owner = "client!dea", name = "z", descriptor = "Ljava/lang/String;")
    private String field2983;

    @OriginalMember(owner = "client!dea", name = "F", descriptor = "Ljava/lang/String;")
    private String field2988;

    @OriginalMember(owner = "client!dea", name = "E", descriptor = "Ljava/lang/String;")
    private String field2987;

    @OriginalMember(owner = "client!dea", name = "L", descriptor = "I")
    public static int field2994 = 0;

    @OriginalMember(owner = "client!dea", name = "o", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!dea", name = "p", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!dea", name = "r", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!dea", name = "u", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!dea", name = "y", descriptor = "I")
    private int field2982;

    @OriginalMember(owner = "client!dea", name = "B", descriptor = "I")
    private int field2985;

    @OriginalMember(owner = "client!dea", name = "D", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!dea", name = "w", descriptor = "[I")
    public static int[] field2980;

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(B)I", line = 7)
    public final int method1488(byte arg0) {
        field2973++;
        byte var2 = 23;
        int var3 = var2 + class37.method180(this.field2988, 255);
        int var4 = var3 + class37.method180(this.field2976, 255);
        int var5 = var4 + class37.method180(this.field2987, 255);
        if (arg0 != -11) {
            this.field2991 = 19;
        }
        return var5 + class37.method180(this.field2983, 255);
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(I)V", line = 26)
    public static void method1489(int arg0) {
        if (arg0 != 21778) {
            method1492(false, true, (byte) -114);
        }
        field2980 = null;
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(Z)Z", line = 39)
    public static final boolean method1490(boolean arg0) {
        if (!arg0) {
            return true;
        }
        field2986++;
        if (class226.field2583) {
            try {
                if ((Boolean) class393.method2415("showingVideoAd", 46, class255.field3123)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(ILig;)V", line = 61)
    public final void method1491(int arg0, class244 arg1) {
        field2975++;
        arg1.method1460(5, 24710);
        arg1.method1460(this.field2977, 24710);
        arg1.method1460(this.field2969 ? 1 : 0, arg0 ^ 0x6086);
        arg1.method1460(this.field2970, 24710);
        arg1.method1460(this.field2968, arg0 + 24710);
        arg1.method1460(this.field2984, 24710);
        arg1.method1460(this.field2971, 24710);
        arg1.method1460(this.field2992, 24710);
        arg1.method1460(this.field2990 ? 1 : 0, 24710);
        arg1.method1446(this.field2967, true);
        arg1.method1460(this.field2989, 24710);
        arg1.method1440(this.field2979, (byte) -55);
        arg1.method1446(this.field2981, true);
        arg1.method1460(this.field2974, arg0 + 24710);
        arg1.method1460(this.field2993, 24710);
        arg1.method1460(this.field2991, arg0 + 24710);
        if (arg0 != 0) {
            method1490(true);
        }
        arg1.method1477((byte) -128, this.field2988);
        arg1.method1477((byte) -115, this.field2976);
        arg1.method1477((byte) -125, this.field2987);
        arg1.method1477((byte) -120, this.field2983);
        arg1.method1460(this.field2985, arg0 + 24710);
        arg1.method1446(this.field2982, true);
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(ZZB)V", line = 101)
    public static final void method1492(boolean arg0, boolean arg1, byte arg2) {
        field2978++;
        if (arg0) {
            class714.field10045++;
            class407.method2504(-119);
        }
        if (arg1) {
            class653.field9315++;
            class618.method3526(6);
        }
        int var3 = -31 / ((arg2 - 62) / 39);
    }

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "(B)V", line = 127)
    private final void method1493(byte arg0) {
        field2972++;
        if (this.field2988.length() > 40) {
            this.field2988 = this.field2988.substring(0, 40);
        }
        if (this.field2976.length() > 40) {
            this.field2976 = this.field2976.substring(0, 40);
        }
        if (arg0 != 27) {
            this.field2989 = 81;
        }
        if (this.field2987.length() > 10) {
            this.field2987 = this.field2987.substring(0, 10);
        }
        if (this.field2983.length() > 10) {
            this.field2983 = this.field2983.substring(0, 10);
        }
    }

    @OriginalMember(owner = "client!dea", name = "<init>", descriptor = "()V", line = 159)
    public class246() {
    }

    @OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(ZLgh;)V", line = 161)
    public class246(boolean arg0, class546 arg1) {
        if (arg0) {
            if (class546.field7836.startsWith("win")) {
                this.field2977 = 1;
            } else if (class546.field7836.startsWith("mac")) {
                this.field2977 = 2;
            } else if (class546.field7836.startsWith("linux")) {
                this.field2977 = 3;
            } else {
                this.field2977 = 4;
            }
            if (class546.field7852.startsWith("amd64") || class546.field7852.startsWith("x86_64")) {
                this.field2969 = true;
            } else {
                this.field2969 = false;
            }
            if (this.field2977 == 1) {
                if (class546.field7840.indexOf("4.0") != -1) {
                    this.field2970 = 1;
                } else if (class546.field7840.indexOf("4.1") != -1) {
                    this.field2970 = 2;
                } else if (class546.field7840.indexOf("4.9") != -1) {
                    this.field2970 = 3;
                } else if (class546.field7840.indexOf("5.0") != -1) {
                    this.field2970 = 4;
                } else if (class546.field7840.indexOf("5.1") != -1) {
                    this.field2970 = 5;
                } else if (class546.field7840.indexOf("6.0") != -1) {
                    this.field2970 = 6;
                } else if (class546.field7840.indexOf("6.1") != -1) {
                    this.field2970 = 7;
                }
            } else if (this.field2977 == 2) {
                if (class546.field7840.indexOf("10.4") != -1) {
                    this.field2970 = 20;
                } else if (class546.field7840.indexOf("10.5") != -1) {
                    this.field2970 = 21;
                } else if (class546.field7840.indexOf("10.6") != -1) {
                    this.field2970 = 22;
                }
            }
            if (class546.field7837.toLowerCase().indexOf("sun") != -1) {
                this.field2968 = 1;
            } else if (class546.field7837.toLowerCase().indexOf("microsoft") != -1) {
                this.field2968 = 2;
            } else if (class546.field7837.toLowerCase().indexOf("apple") == -1) {
                this.field2968 = 4;
            } else {
                this.field2968 = 3;
            }
            int var3 = 2;
            int var4 = 0;
            try {
                while (var3 < class546.field7856.length()) {
                    char var5 = class546.field7856.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + var5 - 48;
                    var3++;
                }
            } catch (Exception var16) {
            }
            this.field2984 = var4;
            int var6 = class546.field7856.indexOf(46, 2) + 1;
            int var7 = 0;
            try {
                while (class546.field7856.length() > var6) {
                    char var8 = class546.field7856.charAt(var6);
                    if (var8 < '0' || var8 > '9') {
                        break;
                    }
                    var7 = var7 * 10 + var8 - 48;
                    var6++;
                }
            } catch (Exception var15) {
            }
            this.field2971 = var7;
            int var9 = class546.field7856.indexOf(95, 4) + 1;
            int var10 = 0;
            try {
                while (class546.field7856.length() > var9) {
                    char var11 = class546.field7856.charAt(var9);
                    if (var11 < '0' || var11 > '9') {
                        break;
                    }
                    var10 = var10 * 10 + var11 - 48;
                    var9++;
                }
            } catch (Exception var14) {
            }
            this.field2992 = var10;
            if (this.field2984 > 3) {
                this.field2989 = class125.field1314;
            } else {
                this.field2989 = 0;
            }
            this.field2967 = class649.field9279;
            if (arg1.field7851) {
                this.field2990 = false;
            } else {
                this.field2990 = true;
            }
            try {
                int[] var12 = HardwareInfo.getCPUInfo();
                if (var12 != null && var12.length == 7) {
                    this.field2979 = var12[6];
                    this.field2974 = var12[3];
                    this.field2993 = var12[4];
                    this.field2981 = var12[2];
                    this.field2991 = var12[5];
                }
            } catch (Throwable var13) {
                this.field2979 = 0;
            }
        }
        if (this.field2976 == null) {
            this.field2976 = "";
        }
        if (this.field2983 == null) {
            this.field2983 = "";
        }
        if (this.field2988 == null) {
            this.field2988 = "";
        }
        if (this.field2987 == null) {
            this.field2987 = "";
        }
        this.method1493((byte) 27);
    }
}
