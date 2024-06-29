import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class78 extends class379 {

    @OriginalMember(owner = "client!pv", name = "o", descriptor = "I")
    private int field1060;

    @OriginalMember(owner = "client!pv", name = "i", descriptor = "Z")
    private boolean field1054;

    @OriginalMember(owner = "client!pv", name = "G", descriptor = "I")
    private int field1078;

    @OriginalMember(owner = "client!pv", name = "s", descriptor = "I")
    private int field1064;

    @OriginalMember(owner = "client!pv", name = "q", descriptor = "I")
    private int field1062;

    @OriginalMember(owner = "client!pv", name = "u", descriptor = "I")
    private int field1066;

    @OriginalMember(owner = "client!pv", name = "D", descriptor = "I")
    private int field1075;

    @OriginalMember(owner = "client!pv", name = "H", descriptor = "Z")
    private boolean field1079;

    @OriginalMember(owner = "client!pv", name = "C", descriptor = "I")
    private int field1074;

    @OriginalMember(owner = "client!pv", name = "w", descriptor = "I")
    private int field1068;

    @OriginalMember(owner = "client!pv", name = "B", descriptor = "I")
    private int field1073;

    @OriginalMember(owner = "client!pv", name = "r", descriptor = "I")
    private int field1063;

    @OriginalMember(owner = "client!pv", name = "v", descriptor = "I")
    public int field1067;

    @OriginalMember(owner = "client!pv", name = "h", descriptor = "I")
    private int field1053;

    @OriginalMember(owner = "client!pv", name = "F", descriptor = "I")
    private int field1077;

    @OriginalMember(owner = "client!pv", name = "y", descriptor = "Ljava/lang/String;")
    private String field1070;

    @OriginalMember(owner = "client!pv", name = "n", descriptor = "Ljava/lang/String;")
    private String field1059;

    @OriginalMember(owner = "client!pv", name = "l", descriptor = "Ljava/lang/String;")
    private String field1057;

    @OriginalMember(owner = "client!pv", name = "p", descriptor = "Ljava/lang/String;")
    private String field1061;

    @OriginalMember(owner = "client!pv", name = "j", descriptor = "I")
    public static int field1055 = 0;

    @OriginalMember(owner = "client!pv", name = "k", descriptor = "I")
    private int field1056;

    @OriginalMember(owner = "client!pv", name = "m", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!pv", name = "t", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!pv", name = "x", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!pv", name = "z", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!pv", name = "A", descriptor = "I")
    private int field1072;

    @OriginalMember(owner = "client!pv", name = "E", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Les;I)V", line = 10)
    public static final void method712(class403 arg0, int arg1) {
        field1065++;
        if (arg1 != -2) {
            method712(null, 121);
        }
        int var2 = arg0.method2354((byte) -126);
        class208.field2472 = new class565[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class208.field2472[var3] = new class565();
            class208.field2472[var3].field7793 = arg0.method2354((byte) 57);
            class208.field2472[var3].field7794 = arg0.method2375((byte) 70);
        }
        class354.field4398 = arg0.method2354((byte) -114);
        class497.field6951 = arg0.method2354((byte) 85);
        class61.field814 = arg0.method2354((byte) 48);
        class147.field1832 = new class631[class497.field6951 + 1 - class354.field4398];
        for (int var4 = 0; var4 < class61.field814; var4++) {
            int var5 = arg0.method2354((byte) 63);
            class631 var6 = class147.field1832[var5] = new class631();
            var6.field1123 = arg0.method2396((byte) 11);
            var6.field1125 = arg0.method2381((byte) 78);
            var6.field8622 = class354.field4398 + var5;
            var6.field8620 = arg0.method2375((byte) 123);
            var6.field8619 = arg0.method2375((byte) -128);
        }
        class205.field2452 = arg0.method2381((byte) 98);
        class664.field9119 = true;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)V", line = 58)
    private final void method713(byte arg0) {
        if (this.field1070.length() > 40) {
            this.field1070 = this.field1070.substring(0, 40);
        }
        field1071++;
        if (this.field1057.length() > 40) {
            this.field1057 = this.field1057.substring(0, 40);
        }
        if (arg0 != -10) {
            this.field1059 = null;
        }
        if (this.field1061.length() > 10) {
            this.field1061 = this.field1061.substring(0, 10);
        }
        if (this.field1059.length() > 10) {
            this.field1059 = this.field1059.substring(0, 10);
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(ZILkq;I)V", line = 89)
    public static final void method714(boolean arg0, int arg1, class620 arg2, int arg3) {
        if (class104.field1336) {
            class613 var4 = class348.field4348 == -1 ? null : class113.field1426.method4366(true, class348.field4348);
            if (client.method1882(arg2).method2325(-1) && (class667.field9161 & 0x20) != 0 && (var4 == null || arg2.method3524(var4.field8244, class348.field4348, 2) != var4.field8244)) {
                class465.field6512++;
                class620.method3534((long) (arg2.field8445 << 0 | arg2.field8515), arg2.field8438, false, class481.field6718 + " -> " + arg2.field8429, class748.field10390, 0L, false, 125, arg2.field8515, 5, arg2.field8445, class535.field7539, true);
            }
        }
        field1069++;
        for (int var5 = 9; var5 >= 5; var5--) {
            String var9 = class85.method785((byte) -85, var5, arg2);
            if (var9 != null) {
                class610.field8188++;
                class620.method3534((long) (arg2.field8515 | arg2.field8445 << 0), arg2.field8438, false, arg2.field8429, class688.method3842(arg2, var5, (byte) -112), (long) (var5 + 1), false, 116, arg2.field8515, 1003, arg2.field8445, var9, true);
            }
        }
        if (arg0) {
            field1055 = -103;
        }
        String var6 = class215.method1343(arg2, 0);
        if (var6 != null) {
            class297.field3535++;
            class620.method3534((long) (arg2.field8445 << 0 | arg2.field8515), arg2.field8438, false, arg2.field8429, arg2.field8410, 0L, false, 123, arg2.field8515, 45, arg2.field8445, var6, true);
        }
        for (int var7 = 4; var7 >= 0; var7--) {
            String var8 = class85.method785((byte) -85, var7, arg2);
            if (var8 != null) {
                class620.method3534((long) (arg2.field8515 | arg2.field8445 << 0), arg2.field8438, false, arg2.field8429, class688.method3842(arg2, var7, (byte) -112), (long) (var7 + 1), false, 109, arg2.field8515, 49, arg2.field8445, var8, true);
                class610.field8188++;
            }
        }
        if (!client.method1882(arg2).method2324(0)) {
            return;
        }
        if (arg2.field8350 == null) {
            class620.method3534((long) (arg2.field8445 << 0 | arg2.field8515), arg2.field8438, false, "", -1, 0L, false, 114, arg2.field8515, 17, arg2.field8445, class637.field8685.method3584(class770.field10592, true), true);
        } else {
            class620.method3534((long) (arg2.field8445 << 0 | arg2.field8515), arg2.field8438, false, "", -1, 0L, false, 126, arg2.field8515, 17, arg2.field8445, arg2.field8350, true);
        }
        class429.field5661++;
    }

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(Z)I", line = 165)
    public final int method715(boolean arg0) {
        field1076++;
        byte var2 = 23;
        int var3 = var2 + class192.method1257(2, this.field1070);
        int var4 = var3 + class192.method1257(2, this.field1057);
        if (!arg0) {
            this.method715(true);
        }
        int var5 = var4 + class192.method1257(2, this.field1061);
        return var5 + class192.method1257(2, this.field1059);
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(BLes;)V", line = 185)
    public final void method716(byte arg0, class403 arg1) {
        field1058++;
        arg1.method2353(87, 5);
        arg1.method2353(-69, this.field1060);
        arg1.method2353(-87, this.field1054 ? 1 : 0);
        arg1.method2353(62, this.field1078);
        arg1.method2353(-119, this.field1064);
        arg1.method2353(-112, this.field1062);
        arg1.method2353(-121, this.field1066);
        arg1.method2353(-69, this.field1068);
        arg1.method2353(88, this.field1079 ? 1 : 0);
        arg1.method2369(-18090, this.field1074);
        if (arg0 >= -9) {
            this.method713((byte) -116);
        }
        arg1.method2353(-65, this.field1075);
        arg1.method2423((byte) -104, this.field1067);
        arg1.method2369(-18090, this.field1063);
        arg1.method2353(-101, this.field1073);
        arg1.method2353(115, this.field1053);
        arg1.method2353(76, this.field1077);
        arg1.method2389(0, this.field1070);
        arg1.method2389(0, this.field1057);
        arg1.method2389(0, this.field1061);
        arg1.method2389(0, this.field1059);
        arg1.method2353(103, this.field1072);
        arg1.method2369(-18090, this.field1056);
    }

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "()V", line = 230)
    public class78() {
    }

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(ZLlc;)V", line = 232)
    public class78(boolean arg0, class675 arg1) {
        if (arg0) {
            if (class675.field9263.startsWith("win")) {
                this.field1060 = 1;
            } else if (class675.field9263.startsWith("mac")) {
                this.field1060 = 2;
            } else if (class675.field9263.startsWith("linux")) {
                this.field1060 = 3;
            } else {
                this.field1060 = 4;
            }
            if (class675.field9261.startsWith("amd64") || class675.field9261.startsWith("x86_64")) {
                this.field1054 = true;
            } else {
                this.field1054 = false;
            }
            if (this.field1060 == 1) {
                if (class675.field9253.indexOf("4.0") != -1) {
                    this.field1078 = 1;
                } else if (class675.field9253.indexOf("4.1") != -1) {
                    this.field1078 = 2;
                } else if (class675.field9253.indexOf("4.9") != -1) {
                    this.field1078 = 3;
                } else if (class675.field9253.indexOf("5.0") != -1) {
                    this.field1078 = 4;
                } else if (class675.field9253.indexOf("5.1") != -1) {
                    this.field1078 = 5;
                } else if (class675.field9253.indexOf("6.0") != -1) {
                    this.field1078 = 6;
                } else if (class675.field9253.indexOf("6.1") != -1) {
                    this.field1078 = 7;
                }
            } else if (this.field1060 == 2) {
                if (class675.field9253.indexOf("10.4") != -1) {
                    this.field1078 = 20;
                } else if (class675.field9253.indexOf("10.5") != -1) {
                    this.field1078 = 21;
                } else if (class675.field9253.indexOf("10.6") != -1) {
                    this.field1078 = 22;
                }
            }
            if (class675.field9270.toLowerCase().indexOf("sun") != -1) {
                this.field1064 = 1;
            } else if (class675.field9270.toLowerCase().indexOf("microsoft") != -1) {
                this.field1064 = 2;
            } else if (class675.field9270.toLowerCase().indexOf("apple") == -1) {
                this.field1064 = 4;
            } else {
                this.field1064 = 3;
            }
            int var3 = 2;
            int var4 = 0;
            try {
                while (class675.field9267.length() > var3) {
                    char var5 = class675.field9267.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var5 - (48 - var4 * 10);
                }
            } catch (Exception var16) {
            }
            this.field1062 = var4;
            int var6 = 0;
            int var7 = class675.field9267.indexOf(46, 2) + 1;
            try {
                while (class675.field9267.length() > var7) {
                    char var8 = class675.field9267.charAt(var7);
                    if (var8 < '0' || var8 > '9') {
                        break;
                    }
                    var7++;
                    var6 = var8 - (48 - var6 * 10);
                }
            } catch (Exception var15) {
            }
            this.field1066 = var6;
            int var9 = 0;
            int var10 = class675.field9267.indexOf(95, 4) + 1;
            try {
                while (var10 < class675.field9267.length()) {
                    char var11 = class675.field9267.charAt(var10);
                    if (var11 < '0' || var11 > '9') {
                        break;
                    }
                    var9 = var9 * 10 + var11 - 48;
                    var10++;
                }
            } catch (Exception var14) {
            }
            if (this.field1062 > 3) {
                this.field1075 = class635.field8667;
            } else {
                this.field1075 = 0;
            }
            if (arg1.field9271) {
                this.field1079 = false;
            } else {
                this.field1079 = true;
            }
            this.field1074 = class730.field10230;
            this.field1068 = var9;
            try {
                int[] var12 = HardwareInfo.getCPUInfo();
                if (var12 != null && var12.length == 7) {
                    this.field1073 = var12[3];
                    this.field1063 = var12[2];
                    this.field1067 = var12[6];
                    this.field1053 = var12[4];
                    this.field1077 = var12[5];
                }
            } catch (Throwable var13) {
                this.field1067 = 0;
            }
        }
        if (this.field1070 == null) {
            this.field1070 = "";
        }
        if (this.field1059 == null) {
            this.field1059 = "";
        }
        if (this.field1057 == null) {
            this.field1057 = "";
        }
        if (this.field1061 == null) {
            this.field1061 = "";
        }
        this.method713((byte) -10);
    }
}
