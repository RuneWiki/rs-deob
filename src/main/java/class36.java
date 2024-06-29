import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class36 extends class65 {

    @OriginalMember(owner = "client!jt", name = "r", descriptor = "I")
    private int field344;

    @OriginalMember(owner = "client!jt", name = "J", descriptor = "Z")
    private boolean field362;

    @OriginalMember(owner = "client!jt", name = "C", descriptor = "I")
    private int field355;

    @OriginalMember(owner = "client!jt", name = "o", descriptor = "I")
    private int field341;

    @OriginalMember(owner = "client!jt", name = "G", descriptor = "I")
    private int field359;

    @OriginalMember(owner = "client!jt", name = "K", descriptor = "I")
    private int field363;

    @OriginalMember(owner = "client!jt", name = "A", descriptor = "I")
    private int field353;

    @OriginalMember(owner = "client!jt", name = "x", descriptor = "Z")
    private boolean field350;

    @OriginalMember(owner = "client!jt", name = "t", descriptor = "I")
    private int field346;

    @OriginalMember(owner = "client!jt", name = "E", descriptor = "I")
    private int field357;

    @OriginalMember(owner = "client!jt", name = "q", descriptor = "I")
    private int field343;

    @OriginalMember(owner = "client!jt", name = "k", descriptor = "I")
    private int field337;

    @OriginalMember(owner = "client!jt", name = "L", descriptor = "I")
    public int field364;

    @OriginalMember(owner = "client!jt", name = "v", descriptor = "I")
    private int field348;

    @OriginalMember(owner = "client!jt", name = "y", descriptor = "I")
    private int field351;

    @OriginalMember(owner = "client!jt", name = "w", descriptor = "Ljava/lang/String;")
    private String field349;

    @OriginalMember(owner = "client!jt", name = "s", descriptor = "Ljava/lang/String;")
    private String field345;

    @OriginalMember(owner = "client!jt", name = "p", descriptor = "Ljava/lang/String;")
    private String field342;

    @OriginalMember(owner = "client!jt", name = "u", descriptor = "Ljava/lang/String;")
    private String field347;

    @OriginalMember(owner = "client!jt", name = "n", descriptor = "Lpl;")
    public static class616 field340 = new class616(8);

    @OriginalMember(owner = "client!jt", name = "z", descriptor = "I")
    public static int field352 = 0;

    @OriginalMember(owner = "client!jt", name = "l", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!jt", name = "m", descriptor = "I")
    private int field339;

    @OriginalMember(owner = "client!jt", name = "B", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!jt", name = "D", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!jt", name = "F", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!jt", name = "H", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!jt", name = "I", descriptor = "I")
    private int field361;

    @OriginalMember(owner = "client!jt", name = "M", descriptor = "[[[I")
    public static int[][][] field365;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(I)[Lql;", line = 6)
    public static final class104[] method205(int arg0) {
        field360++;
        if (arg0 != 40) {
            field340 = null;
        }
        return new class104[] { class511.field7409, class511.field7420, class511.field7422, class511.field7424, class511.field7425, class511.field7426, class511.field7429, class511.field7431, class511.field7432, class511.field7433, class511.field7434, class511.field7435, class511.field7436, class511.field7437 };
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Z)V", line = 41)
    public static void method206(boolean arg0) {
        field365 = null;
        if (!arg0) {
            field340 = null;
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Lofa;I)V", line = 52)
    public final void method207(class301 arg0, int arg1) {
        arg0.method1926(5, 65280);
        field338++;
        arg0.method1926(this.field344, arg1 + 65270);
        arg0.method1926(this.field362 ? 1 : 0, 65280);
        arg0.method1926(this.field355, 65280);
        arg0.method1926(this.field341, 65280);
        arg0.method1926(this.field359, 65280);
        arg0.method1926(this.field363, 65280);
        arg0.method1926(this.field346, 65280);
        arg0.method1926(this.field350 ? 1 : 0, 65280);
        arg0.method1939(this.field357, arg1 + 1134947710);
        arg0.method1926(this.field353, 65280);
        arg0.method1950(this.field364, 6387);
        arg0.method1939(this.field337, 1134947720);
        arg0.method1926(this.field351, 65280);
        arg0.method1926(this.field348, arg1 ^ 0xFF0A);
        arg0.method1926(this.field343, 65280);
        arg0.method1954(this.field347, arg1 ^ 0xFFFFFF9D);
        arg0.method1954(this.field342, arg1 - 121);
        arg0.method1954(this.field345, -22);
        arg0.method1954(this.field349, arg1 - 93);
        if (arg1 == 10) {
            arg0.method1926(this.field339, 65280);
            arg0.method1939(this.field361, arg1 ^ 0x43A5ED82);
        }
    }

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "(I)I", line = 89)
    public final int method208(int arg0) {
        field356++;
        int var3 = arg0 + class54.method507(82, this.field347);
        int var4 = var3 + class54.method507(90, this.field342);
        int var5 = var4 + class54.method507(103, this.field345);
        return var5 + class54.method507(80, this.field349);
    }

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "(Z)V", line = 107)
    private final void method209(boolean arg0) {
        field354++;
        if (this.field347.length() > 40) {
            this.field347 = this.field347.substring(0, 40);
        }
        if (!arg0) {
            return;
        }
        if (this.field342.length() > 40) {
            this.field342 = this.field342.substring(0, 40);
        }
        if (this.field345.length() > 10) {
            this.field345 = this.field345.substring(0, 10);
        }
        if (this.field349.length() > 10) {
            this.field349 = this.field349.substring(0, 10);
        }
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "()V", line = 134)
    public class36() {
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(ZLfc;)V", line = 136)
    public class36(boolean arg0, class731 arg1) {
        if (arg0) {
            if (class731.field10269.startsWith("win")) {
                this.field344 = 1;
            } else if (class731.field10269.startsWith("mac")) {
                this.field344 = 2;
            } else if (class731.field10269.startsWith("linux")) {
                this.field344 = 3;
            } else {
                this.field344 = 4;
            }
            if (class731.field10255.startsWith("amd64") || class731.field10255.startsWith("x86_64")) {
                this.field362 = true;
            } else {
                this.field362 = false;
            }
            if (this.field344 == 1) {
                if (class731.field10261.indexOf("4.0") != -1) {
                    this.field355 = 1;
                } else if (class731.field10261.indexOf("4.1") != -1) {
                    this.field355 = 2;
                } else if (class731.field10261.indexOf("4.9") != -1) {
                    this.field355 = 3;
                } else if (class731.field10261.indexOf("5.0") != -1) {
                    this.field355 = 4;
                } else if (class731.field10261.indexOf("5.1") != -1) {
                    this.field355 = 5;
                } else if (class731.field10261.indexOf("6.0") != -1) {
                    this.field355 = 6;
                } else if (class731.field10261.indexOf("6.1") != -1) {
                    this.field355 = 7;
                }
            } else if (this.field344 == 2) {
                if (class731.field10261.indexOf("10.4") != -1) {
                    this.field355 = 20;
                } else if (class731.field10261.indexOf("10.5") != -1) {
                    this.field355 = 21;
                } else if (class731.field10261.indexOf("10.6") != -1) {
                    this.field355 = 22;
                }
            }
            if (class731.field10266.toLowerCase().indexOf("sun") != -1) {
                this.field341 = 1;
            } else if (class731.field10266.toLowerCase().indexOf("microsoft") != -1) {
                this.field341 = 2;
            } else if (class731.field10266.toLowerCase().indexOf("apple") == -1) {
                this.field341 = 4;
            } else {
                this.field341 = 3;
            }
            int var3 = 2;
            int var4 = 0;
            try {
                while (var3 < class731.field10273.length()) {
                    char var5 = class731.field10273.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var4 * 10 + (var5 - 48);
                }
            } catch (Exception var17) {
            }
            this.field359 = var4;
            int var6 = 0;
            int var7 = class731.field10273.indexOf(46, 2) + 1;
            try {
                while (class731.field10273.length() > var7) {
                    char var8 = class731.field10273.charAt(var7);
                    if (var8 < '0' || var8 > '9') {
                        break;
                    }
                    var6 = var6 * 10 + var8 - 48;
                    var7++;
                }
            } catch (Exception var16) {
            }
            this.field363 = var6;
            int var9 = 0;
            int var10 = class731.field10273.indexOf(95, 4) + 1;
            try {
                while (class731.field10273.length() > var10) {
                    char var11 = class731.field10273.charAt(var10);
                    if (var11 < '0' || var11 > '9') {
                        break;
                    }
                    var10++;
                    var9 = var9 * 10 + var11 - 48;
                }
            } catch (Exception var15) {
            }
            if (this.field359 <= 3) {
                this.field353 = 0;
            } else {
                this.field353 = class51.field824;
            }
            if (arg1.field10270) {
                this.field350 = false;
            } else {
                this.field350 = true;
            }
            this.field346 = var9;
            this.field357 = class84.field1246;
            try {
                int[] var12 = HardwareInfo.getCPUInfo();
                if (var12 != null && var12.length == 7) {
                    this.field343 = var12[5];
                    this.field337 = var12[2];
                    this.field364 = var12[6];
                    this.field348 = var12[4];
                    this.field351 = var12[3];
                }
            } catch (Throwable var14) {
                class333.method2135(var14, var14.getMessage() + " (Recovered)", -67);
                this.field364 = 0;
            }
        }
        if (this.field349 == null) {
            this.field349 = "";
        }
        if (this.field345 == null) {
            this.field345 = "";
        }
        if (this.field342 == null) {
            this.field342 = "";
        }
        if (this.field347 == null) {
            this.field347 = "";
        }
        this.method209(true);
    }
}
