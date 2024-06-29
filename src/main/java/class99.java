import jaclib.hardware_info.HardwareInfo;
import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public class class99 extends class539 {

    @OriginalMember(owner = "client!bba", name = "s", descriptor = "I")
    private int field1342;

    @OriginalMember(owner = "client!bba", name = "D", descriptor = "Z")
    private boolean field1353;

    @OriginalMember(owner = "client!bba", name = "o", descriptor = "I")
    private int field1338;

    @OriginalMember(owner = "client!bba", name = "u", descriptor = "I")
    private int field1344;

    @OriginalMember(owner = "client!bba", name = "w", descriptor = "I")
    private int field1346;

    @OriginalMember(owner = "client!bba", name = "t", descriptor = "I")
    private int field1343;

    @OriginalMember(owner = "client!bba", name = "p", descriptor = "I")
    private int field1339;

    @OriginalMember(owner = "client!bba", name = "r", descriptor = "I")
    private int field1341;

    @OriginalMember(owner = "client!bba", name = "z", descriptor = "Z")
    private boolean field1349;

    @OriginalMember(owner = "client!bba", name = "v", descriptor = "I")
    private int field1345;

    @OriginalMember(owner = "client!bba", name = "q", descriptor = "I")
    private int field1340;

    @OriginalMember(owner = "client!bba", name = "m", descriptor = "I")
    private int field1336;

    @OriginalMember(owner = "client!bba", name = "B", descriptor = "Lvh;")
    public static class328 field1351 = new class328(4);

    @OriginalMember(owner = "client!bba", name = "F", descriptor = "Lvh;")
    public static class328 field1355 = new class328(4);

    @OriginalMember(owner = "client!bba", name = "G", descriptor = "Z")
    public static boolean field1356 = false;

    @OriginalMember(owner = "client!bba", name = "n", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!bba", name = "x", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!bba", name = "y", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!bba", name = "A", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!bba", name = "C", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!bba", name = "E", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(I)V", line = 3)
    public static void method765(int arg0) {
        if (arg0 != -29045) {
            field1354 = -87;
        }
        field1351 = null;
        field1355 = null;
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(II)S", line = 22)
    public static final short method766(int arg0, int arg1) {
        field1352++;
        int var2 = (arg1 & 0xFE42) >> 10;
        int var3 = arg1 >> 3 & 0x70;
        int var4 = arg1 & 0x7F;
        int var5 = var4 <= 64 ? var3 * var4 >> 7 : (127 - var4) * var3 >> 7;
        int var6 = var4 + var5;
        if (arg0 != 32217) {
            return -17;
        }
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var6 | var7 >> 4 << 7 | var2 << 10);
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(Lkw;B)V", line = 53)
    public static final void method767(class225 arg0, byte arg1) {
        field1347++;
        int var2 = -52 % ((-arg1 - 19) / 56);
        for (class572 var3 = (class572) class572.field7692.method1270((byte) -25); var3 != null; var3 = (class572) class572.field7692.method1282(0)) {
            if (var3.field7690 == arg0) {
                if (var3.field7702 != null) {
                    class135.field1907.method3309(var3.field7702);
                    var3.field7702 = null;
                }
                var3.method2971(1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(Ljr;B)V", line = 88)
    public final void method768(class96 arg0, byte arg1) {
        arg0.method746((byte) -95, 3);
        if (arg1 != 80) {
            this.field1345 = 83;
        }
        field1337++;
        arg0.method746((byte) -100, this.field1342);
        arg0.method746((byte) -124, this.field1353 ? 1 : 0);
        arg0.method746((byte) -106, this.field1338);
        arg0.method746((byte) -126, this.field1344);
        arg0.method746((byte) -121, this.field1346);
        arg0.method746((byte) -121, this.field1343);
        arg0.method746((byte) -128, this.field1345);
        arg0.method746((byte) -109, this.field1349 ? 1 : 0);
        arg0.method731(arg1 - 2045573128, this.field1341);
        arg0.method746((byte) -123, this.field1339);
        arg0.method758(this.field1340, arg1 ^ 0xC);
        arg0.method741(this.field1336, (byte) 27);
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(ZIILct;III)V", line = 117)
    public static final void method769(boolean arg0, int arg1, int arg2, class131 arg3, int arg4, int arg5, int arg6) {
        field1348++;
        if (arg5 <= class357.field5108 || arg3 == null || arg3.field1793 == null || arg3.field1793.length <= arg6 || arg3.field1793[arg6] == null) {
            return;
        }
        int var7 = arg3.field1793[arg6][0];
        int var8 = var7 >> 8;
        int var9 = (var7 & 0xF9) >> 5;
        if (arg3.field1793[arg6].length > 1) {
            int var10 = (int) (Math.random() * (double) arg3.field1793[arg6].length);
            if (var10 > 0) {
                var8 = arg3.field1793[arg6][var10];
            }
        }
        int var11 = var7 & 0x1F;
        if (var11 == 0) {
            if (arg0) {
                if (arg3.field1816) {
                    class431.method2444(255, var9, false, 0, var8, -1);
                    return;
                }
                class548.method3011(-12114, var8, var9, 255, 0);
            }
        } else if (class274.field3872.field905 != 0) {
            int var12 = arg1 - 256 >> 9;
            int var13 = arg4 - 256 >> 9;
            class604.field8394[class357.field5108++] = new class629((byte) (arg3.field1816 ? 2 : 1), var8, var9, 0, 255, (arg2 << 24) + (var12 << 16) + var11 + (var13 << 8));
        }
    }

    @OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(ZLtt;)V", line = 175)
    public class99(boolean arg0, class79 arg1) {
        if (arg0) {
            if (class79.field1095.startsWith("win")) {
                this.field1342 = 1;
            } else if (class79.field1095.startsWith("mac")) {
                this.field1342 = 2;
            } else if (class79.field1095.startsWith("linux")) {
                this.field1342 = 3;
            } else {
                this.field1342 = 4;
            }
            if (class79.field1087.startsWith("amd64") || class79.field1087.startsWith("x86_64")) {
                this.field1353 = true;
            } else {
                this.field1353 = false;
            }
            if (this.field1342 == 1) {
                if (class79.field1082.indexOf("4.0") != -1) {
                    this.field1338 = 1;
                } else if (class79.field1082.indexOf("4.1") != -1) {
                    this.field1338 = 2;
                } else if (class79.field1082.indexOf("4.9") != -1) {
                    this.field1338 = 3;
                } else if (class79.field1082.indexOf("5.0") != -1) {
                    this.field1338 = 4;
                } else if (class79.field1082.indexOf("5.1") != -1) {
                    this.field1338 = 5;
                } else if (class79.field1082.indexOf("6.0") != -1) {
                    this.field1338 = 6;
                } else if (class79.field1082.indexOf("6.1") != -1) {
                    this.field1338 = 7;
                }
            } else if (this.field1342 == 2) {
                if (class79.field1082.indexOf("10.4") != -1) {
                    this.field1338 = 20;
                } else if (class79.field1082.indexOf("10.5") != -1) {
                    this.field1338 = 21;
                } else if (class79.field1082.indexOf("10.6") != -1) {
                    this.field1338 = 22;
                }
            }
            if (class79.field1093.toLowerCase().indexOf("sun") != -1) {
                this.field1344 = 1;
            } else if (class79.field1093.toLowerCase().indexOf("microsoft") != -1) {
                this.field1344 = 2;
            } else if (class79.field1093.toLowerCase().indexOf("apple") == -1) {
                this.field1344 = 4;
            } else {
                this.field1344 = 3;
            }
            int var3 = 2;
            int var4 = 0;
            try {
                while (var3 < class79.field1096.length()) {
                    char var5 = class79.field1096.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + var5 - 48;
                    var3++;
                }
            } catch (Exception var16) {
            }
            this.field1346 = var4;
            int var6 = class79.field1096.indexOf(46, 2) + 1;
            int var7 = 0;
            try {
                while (class79.field1096.length() > var6) {
                    char var8 = class79.field1096.charAt(var6);
                    if (var8 < '0' || var8 > '9') {
                        break;
                    }
                    var6++;
                    var7 = var7 * 10 - (48 - var8);
                }
            } catch (Exception var15) {
            }
            this.field1343 = var7;
            int var9 = class79.field1096.indexOf(95, 4) + 1;
            int var10 = 0;
            try {
                while (class79.field1096.length() > var9) {
                    char var11 = class79.field1096.charAt(var9);
                    if (var11 < '0' || var11 > '9') {
                        break;
                    }
                    var9++;
                    var10 = var10 * 10 + var11 - 48;
                }
            } catch (Exception var14) {
            }
            if (this.field1346 > 3) {
                this.field1339 = class398.field5528;
            } else {
                this.field1339 = 0;
            }
            this.field1341 = class202.field2968;
            if (arg1.field1084) {
                this.field1349 = false;
            } else {
                this.field1349 = true;
            }
            this.field1345 = var10;
            try {
                this.field1340 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
            } catch (Throwable var13) {
                this.field1340 = 0;
            }
            try {
                this.field1336 = HardwareInfo.getPackedBasicCPUInfo();
            } catch (Throwable var12) {
            }
        }
    }
}
