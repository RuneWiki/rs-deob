import jaclib.hardware_info.HardwareInfo;
import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public class class641 extends class435 {

    @OriginalMember(owner = "client!fca", name = "C", descriptor = "I")
    private int field9086;

    @OriginalMember(owner = "client!fca", name = "N", descriptor = "Z")
    private boolean field9097;

    @OriginalMember(owner = "client!fca", name = "I", descriptor = "I")
    private int field9092;

    @OriginalMember(owner = "client!fca", name = "M", descriptor = "I")
    private int field9096;

    @OriginalMember(owner = "client!fca", name = "H", descriptor = "I")
    private int field9091;

    @OriginalMember(owner = "client!fca", name = "y", descriptor = "I")
    private int field9082;

    @OriginalMember(owner = "client!fca", name = "L", descriptor = "I")
    private int field9095;

    @OriginalMember(owner = "client!fca", name = "v", descriptor = "I")
    private int field9079;

    @OriginalMember(owner = "client!fca", name = "J", descriptor = "Z")
    private boolean field9093;

    @OriginalMember(owner = "client!fca", name = "r", descriptor = "I")
    private int field9075;

    @OriginalMember(owner = "client!fca", name = "A", descriptor = "I")
    private int field9084;

    @OriginalMember(owner = "client!fca", name = "t", descriptor = "I")
    private int field9077;

    @OriginalMember(owner = "client!fca", name = "z", descriptor = "I")
    private int field9083;

    @OriginalMember(owner = "client!fca", name = "O", descriptor = "I")
    private int field9098;

    @OriginalMember(owner = "client!fca", name = "s", descriptor = "I")
    private int field9076;

    @OriginalMember(owner = "client!fca", name = "F", descriptor = "I")
    private int field9089;

    @OriginalMember(owner = "client!fca", name = "K", descriptor = "I")
    private int field9094;

    @OriginalMember(owner = "client!fca", name = "G", descriptor = "Ljava/lang/String;")
    private String field9090;

    @OriginalMember(owner = "client!fca", name = "q", descriptor = "Ljava/lang/String;")
    private String field9074;

    @OriginalMember(owner = "client!fca", name = "w", descriptor = "Ljava/lang/String;")
    private String field9080;

    @OriginalMember(owner = "client!fca", name = "D", descriptor = "Ljava/lang/String;")
    private String field9087;

    @OriginalMember(owner = "client!fca", name = "u", descriptor = "I")
    public static int field9078;

    @OriginalMember(owner = "client!fca", name = "x", descriptor = "I")
    public static int field9081;

    @OriginalMember(owner = "client!fca", name = "B", descriptor = "I")
    public static int field9085;

    @OriginalMember(owner = "client!fca", name = "E", descriptor = "I")
    public static int field9088;

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(I)Lfu;")
    public static final class66 method3604(int arg0) {
        field9081++;
        if (class161.field2621 == null || class457.field6574 == null) {
            return null;
        }
        for (class66 var1 = (class66) class457.field6574.method2199((byte) 71); var1 != null; var1 = (class66) class457.field6574.method2199((byte) -112)) {
            class30 var2 = class161.field2609.method2837(var1.field954, -116);
            if (var2 != null && var2.field436 && var2.method274(true, class161.field2611)) {
                return var1;
            }
        }
        if (arg0 != 5621) {
            method3604(20);
        }
        return null;
    }

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "(I)V")
    private final void method3605(int arg0) {
        field9085++;
        if (this.field9090.length() > 40) {
            this.field9090 = this.field9090.substring(0, 40);
        }
        if (arg0 != 0) {
            this.method3607(102);
        }
        if (this.field9087.length() > 40) {
            this.field9087 = this.field9087.substring(0, 40);
        }
        if (this.field9074.length() > 10) {
            this.field9074 = this.field9074.substring(0, 10);
        }
        if (this.field9080.length() > 10) {
            this.field9080 = this.field9080.substring(0, 10);
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(BLek;)V")
    public final void method3606(byte arg0, class465 arg1) {
        arg1.method2753((byte) 109, 5);
        if (arg0 != 4) {
            this.field9076 = 52;
        }
        field9078++;
        arg1.method2753((byte) 84, this.field9086);
        arg1.method2753((byte) 108, this.field9097 ? 1 : 0);
        arg1.method2753((byte) 63, this.field9092);
        arg1.method2753((byte) 75, this.field9096);
        arg1.method2753((byte) 105, this.field9091);
        arg1.method2753((byte) 63, this.field9082);
        arg1.method2753((byte) 55, this.field9079);
        arg1.method2753((byte) 118, this.field9093 ? 1 : 0);
        arg1.method2739((byte) -86, this.field9075);
        arg1.method2753((byte) 115, this.field9095);
        arg1.method2698(this.field9084, 1426909800);
        arg1.method2739((byte) -86, this.field9098);
        arg1.method2753((byte) 64, this.field9076);
        arg1.method2753((byte) 84, this.field9083);
        arg1.method2753((byte) 54, this.field9077);
        arg1.method2693(false, this.field9090);
        arg1.method2693(false, this.field9087);
        arg1.method2693(false, this.field9074);
        arg1.method2693(false, this.field9080);
        arg1.method2753((byte) 112, this.field9089);
        arg1.method2739((byte) -86, this.field9094);
    }

    @OriginalMember(owner = "client!fca", name = "c", descriptor = "(I)I")
    public final int method3607(int arg0) {
        field9088++;
        byte var2 = 23;
        int var3 = var2 + class97.method734(-20508, this.field9090);
        int var4 = var3 + class97.method734(-20508, this.field9087);
        if (arg0 != 2) {
            this.method3607(-34);
        }
        int var5 = var4 + class97.method734(-20508, this.field9074);
        return var5 + class97.method734(-20508, this.field9080);
    }

    @OriginalMember(owner = "client!fca", name = "<init>", descriptor = "()V")
    public class641() {
    }

    @OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(ZLwv;)V")
    public class641(boolean arg0, class705 arg1) {
        if (arg0) {
            if (class705.field9971.startsWith("win")) {
                this.field9086 = 1;
            } else if (class705.field9971.startsWith("mac")) {
                this.field9086 = 2;
            } else if (class705.field9971.startsWith("linux")) {
                this.field9086 = 3;
            } else {
                this.field9086 = 4;
            }
            if (class705.field9986.startsWith("amd64") || class705.field9986.startsWith("x86_64")) {
                this.field9097 = true;
            } else {
                this.field9097 = false;
            }
            if (this.field9086 == 1) {
                if (class705.field9969.indexOf("4.0") != -1) {
                    this.field9092 = 1;
                } else if (class705.field9969.indexOf("4.1") != -1) {
                    this.field9092 = 2;
                } else if (class705.field9969.indexOf("4.9") != -1) {
                    this.field9092 = 3;
                } else if (class705.field9969.indexOf("5.0") != -1) {
                    this.field9092 = 4;
                } else if (class705.field9969.indexOf("5.1") != -1) {
                    this.field9092 = 5;
                } else if (class705.field9969.indexOf("6.0") != -1) {
                    this.field9092 = 6;
                } else if (class705.field9969.indexOf("6.1") != -1) {
                    this.field9092 = 7;
                }
            } else if (this.field9086 == 2) {
                if (class705.field9969.indexOf("10.4") != -1) {
                    this.field9092 = 20;
                } else if (class705.field9969.indexOf("10.5") != -1) {
                    this.field9092 = 21;
                } else if (class705.field9969.indexOf("10.6") != -1) {
                    this.field9092 = 22;
                }
            }
            if (class705.field9962.toLowerCase().indexOf("sun") != -1) {
                this.field9096 = 1;
            } else if (class705.field9962.toLowerCase().indexOf("microsoft") != -1) {
                this.field9096 = 2;
            } else if (class705.field9962.toLowerCase().indexOf("apple") == -1) {
                this.field9096 = 4;
            } else {
                this.field9096 = 3;
            }
            int var3 = 2;
            int var4 = 0;
            try {
                while (class705.field9987.length() > var3) {
                    char var5 = class705.field9987.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + var5 - 48;
                    var3++;
                }
            } catch (Exception var30) {
            }
            this.field9091 = var4;
            int var6 = class705.field9987.indexOf(46, 2) + 1;
            int var7 = 0;
            try {
                while (var6 < class705.field9987.length()) {
                    char var8 = class705.field9987.charAt(var6);
                    if (var8 < '0' || var8 > '9') {
                        break;
                    }
                    var6++;
                    var7 = var8 - (48 - var7 * 10);
                }
            } catch (Exception var29) {
            }
            this.field9082 = var7;
            int var9 = class705.field9987.indexOf(95, 4) + 1;
            int var10 = 0;
            try {
                while (var9 < class705.field9987.length()) {
                    char var11 = class705.field9987.charAt(var9);
                    if (var11 < '0' || var11 > '9') {
                        break;
                    }
                    var9++;
                    var10 = var10 * 10 + var11 - 48;
                }
            } catch (Exception var28) {
            }
            if (this.field9091 > 3) {
                this.field9095 = class144.field2488;
            } else {
                this.field9095 = 0;
            }
            this.field9079 = var10;
            if (arg1.field9983) {
                this.field9093 = false;
            } else {
                this.field9093 = true;
            }
            this.field9075 = class246.field3583;
            try {
                this.field9084 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
            } catch (Throwable var26) {
                this.field9084 = 0;
            }
            try {
                int[] var12 = HardwareInfo.getCPUInfo();
                if (var12 != null && var12.length == 7) {
                    this.field9077 = var12[5];
                    this.field9083 = var12[4];
                    this.field9098 = var12[2];
                    this.field9076 = var12[3];
                }
                String[][] var13 = HardwareInfo.getDXDiagDisplayDevicesProps();
                if (var13 != null && var13.length > 0 && var13[0] != null) {
                    for (int var14 = 0; var14 < var13[0].length; var14 += 2) {
                        if (var13[0][var14].equalsIgnoreCase("szDescription")) {
                            this.field9090 = var13[0][var14 + 1];
                        } else if (var13[0][var14].equalsIgnoreCase("szDriverDateEnglish")) {
                            String var15 = var13[0][var14 + 1];
                            try {
                                int var16 = var15.indexOf("/");
                                int var17 = var15.indexOf("/", var16 + 1);
                                this.field9089 = Integer.parseInt(var15.substring(0, var16));
                                this.field9094 = Integer.parseInt(var15.substring(var17 + 1, var15.indexOf(" ", var17)));
                            } catch (Exception var25) {
                            }
                        }
                    }
                }
                String[] var18 = HardwareInfo.getDXDiagSystemProps();
                if (var18 != null) {
                    String var19 = "";
                    String var20 = "";
                    String var21 = "";
                    for (int var22 = 0; var22 < var18.length; var22 += 2) {
                        if (var18[var22].equalsIgnoreCase("dwDirectXVersionMajor")) {
                            var19 = var18[var22 + 1];
                        } else if (var18[var22].equalsIgnoreCase("dwDirectXVersionMinor")) {
                            var20 = var18[var22 + 1];
                        } else if (var18[var22].equalsIgnoreCase("dwDirectXVersionLetter")) {
                            var21 = var18[var22 + 1];
                        }
                    }
                    this.field9074 = var19 + "." + var20 + var21;
                }
                String[] var23 = HardwareInfo.getOpenGLProps();
                if (var23 != null) {
                    for (int var24 = 0; var24 < var23.length; var24 += 2) {
                        if (var23[var24].equalsIgnoreCase("GL_RENDERER")) {
                            this.field9087 = var23[var24 + 1];
                        } else if (var23[var24].equalsIgnoreCase("GL_VERSION")) {
                            this.field9080 = var23[var24 + 1];
                        }
                    }
                }
            } catch (Throwable var27) {
            }
        }
        if (this.field9087 == null) {
            this.field9087 = "";
        }
        if (this.field9090 == null) {
            this.field9090 = "";
        }
        if (this.field9074 == null) {
            this.field9074 = "";
        }
        if (this.field9080 == null) {
            this.field9080 = "";
        }
        this.method3605(0);
    }
}
