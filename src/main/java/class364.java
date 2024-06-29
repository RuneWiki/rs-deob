import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ija")
public class class364 extends class337 {

    @OriginalMember(owner = "client!ija", name = "O", descriptor = "I")
    private int field4459;

    @OriginalMember(owner = "client!ija", name = "u", descriptor = "Z")
    private boolean field4439;

    @OriginalMember(owner = "client!ija", name = "B", descriptor = "I")
    private int field4446;

    @OriginalMember(owner = "client!ija", name = "K", descriptor = "I")
    private int field4455;

    @OriginalMember(owner = "client!ija", name = "H", descriptor = "I")
    private int field4452;

    @OriginalMember(owner = "client!ija", name = "A", descriptor = "I")
    private int field4445;

    @OriginalMember(owner = "client!ija", name = "G", descriptor = "Z")
    private boolean field4451;

    @OriginalMember(owner = "client!ija", name = "o", descriptor = "I")
    private int field4433;

    @OriginalMember(owner = "client!ija", name = "p", descriptor = "I")
    private int field4434;

    @OriginalMember(owner = "client!ija", name = "E", descriptor = "I")
    private int field4449;

    @OriginalMember(owner = "client!ija", name = "v", descriptor = "I")
    private int field4440;

    @OriginalMember(owner = "client!ija", name = "s", descriptor = "I")
    private int field4437;

    @OriginalMember(owner = "client!ija", name = "n", descriptor = "I")
    public int field4432;

    @OriginalMember(owner = "client!ija", name = "M", descriptor = "I")
    private int field4457;

    @OriginalMember(owner = "client!ija", name = "x", descriptor = "I")
    private int field4442;

    @OriginalMember(owner = "client!ija", name = "F", descriptor = "Ljava/lang/String;")
    private String field4450;

    @OriginalMember(owner = "client!ija", name = "q", descriptor = "Ljava/lang/String;")
    private String field4435;

    @OriginalMember(owner = "client!ija", name = "w", descriptor = "Ljava/lang/String;")
    private String field4441;

    @OriginalMember(owner = "client!ija", name = "l", descriptor = "Ljava/lang/String;")
    private String field4430;

    @OriginalMember(owner = "client!ija", name = "m", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!ija", name = "r", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!ija", name = "t", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!ija", name = "y", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!ija", name = "z", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!ija", name = "C", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!ija", name = "D", descriptor = "I")
    private int field4448;

    @OriginalMember(owner = "client!ija", name = "J", descriptor = "I")
    private int field4454;

    @OriginalMember(owner = "client!ija", name = "L", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!ija", name = "N", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!ija", name = "I", descriptor = "Lne;")
    public static class166 field4453;

    @OriginalMember(owner = "client!ija", name = "a", descriptor = "(Ljha;I)I")
    public static final int method2090(class33 arg0, int arg1) {
        field4436++;
        if (arg1 != -16422) {
            field4458 = -15;
        }
        int var2 = arg0.field357;
        class68 var3 = arg0.method2169(0);
        if (arg0.field4696 == -1 || arg0.field4715) {
            var2 = arg0.field378;
        } else if (arg0.field4696 == var3.field915 || arg0.field4696 == var3.field931 || arg0.field4696 == var3.field918 || arg0.field4696 == var3.field911) {
            var2 = arg0.field328;
        } else if (arg0.field4696 == var3.field897 || arg0.field4696 == var3.field894 || arg0.field4696 == var3.field898 || arg0.field4696 == var3.field890) {
            var2 = arg0.field334;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ija", name = "a", descriptor = "(B)I")
    public final int method2091(byte arg0) {
        field4444++;
        byte var2 = 23;
        int var3 = var2 + class423.method2443(arg0 + 92, this.field4435);
        int var4 = var3 + class423.method2443(2, this.field4450);
        if (arg0 == -90) {
            int var5 = var4 + class423.method2443(2, this.field4441);
            return var5 + class423.method2443(2, this.field4430);
        } else {
            return -68;
        }
    }

    @OriginalMember(owner = "client!ija", name = "a", descriptor = "(ZIII)V")
    public static final void method2092(boolean arg0, int arg1, int arg2, int arg3) {
        field4438++;
        if (arg3 < ~arg2 || arg2 > 48000) {
            throw new IllegalArgumentException();
        }
        class437.field5739 = arg1;
        class654.field8426 = arg0;
        class791.field10837 = arg2;
    }

    @OriginalMember(owner = "client!ija", name = "a", descriptor = "(I)V")
    public static void method2093(int arg0) {
        field4453 = null;
        if (arg0 != 0) {
            field4453 = null;
        }
    }

    @OriginalMember(owner = "client!ija", name = "a", descriptor = "(Lft;B)I")
    public static final int method2094(class727 arg0, byte arg1) {
        int var2 = -73 / ((-arg1 - 24) / 62);
        field4443++;
        class240 var3 = arg0.field9545;
        if (var3.field3289 != null) {
            var3 = var3.method1585((byte) -100, class381.field4705);
            if (var3 == null) {
                return -1;
            }
        }
        int var4 = var3.field3254;
        class68 var5 = arg0.method2169(0);
        if (arg0.field4696 == -1 || arg0.field4715) {
            var4 = var3.field3273;
        } else if (arg0.field4696 == var5.field915 || arg0.field4696 == var5.field931 || arg0.field4696 == var5.field918 || arg0.field4696 == var5.field911) {
            var4 = var3.field3305;
        } else if (arg0.field4696 == var5.field897 || arg0.field4696 == var5.field894 || arg0.field4696 == var5.field898 || arg0.field4696 == var5.field890) {
            var4 = var3.field3299;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ija", name = "a", descriptor = "(IZ)Z")
    public static final boolean method2095(int arg0, boolean arg1) {
        if (!arg1) {
            method2095(1, true);
        }
        field4456++;
        return arg0 == 3 || arg0 == 7 || arg0 == 10;
    }

    @OriginalMember(owner = "client!ija", name = "b", descriptor = "(B)V")
    private final void method2096(byte arg0) {
        if (this.field4435.length() > 40) {
            this.field4435 = this.field4435.substring(0, 40);
        }
        field4431++;
        if (this.field4450.length() > 40) {
            this.field4450 = this.field4450.substring(0, 40);
        }
        if (this.field4441.length() > 10) {
            this.field4441 = this.field4441.substring(0, 10);
        }
        if (arg0 > -25) {
            this.field4435 = null;
        }
        if (this.field4430.length() > 10) {
            this.field4430 = this.field4430.substring(0, 10);
        }
    }

    @OriginalMember(owner = "client!ija", name = "a", descriptor = "(Lmc;B)V")
    public final void method2097(class234 arg0, byte arg1) {
        arg0.method1491(-129, 5);
        field4447++;
        arg0.method1491(-129, this.field4459);
        arg0.method1491(-129, this.field4439 ? 1 : 0);
        arg0.method1491(arg1 ^ 0xFFFFFF78, this.field4446);
        arg0.method1491(-129, this.field4455);
        arg0.method1491(-129, this.field4452);
        arg0.method1491(-129, this.field4445);
        arg0.method1491(arg1 ^ 0xFFFFFF78, this.field4434);
        arg0.method1491(arg1 - 136, this.field4451 ? 1 : 0);
        arg0.method1541(374, this.field4433);
        arg0.method1491(arg1 - 136, this.field4449);
        arg0.method1536(this.field4432, (byte) 122);
        arg0.method1541(374, this.field4442);
        arg0.method1491(arg1 ^ 0xFFFFFF78, this.field4440);
        arg0.method1491(arg1 ^ 0xFFFFFF78, this.field4437);
        arg0.method1491(-129, this.field4457);
        if (arg1 != 7) {
            this.method2097(null, (byte) 96);
        }
        arg0.method1519(false, this.field4435);
        arg0.method1519(false, this.field4450);
        arg0.method1519(false, this.field4441);
        arg0.method1519(false, this.field4430);
        arg0.method1491(-129, this.field4454);
        arg0.method1541(arg1 + 367, this.field4448);
    }

    @OriginalMember(owner = "client!ija", name = "<init>", descriptor = "()V")
    public class364() {
    }

    @OriginalMember(owner = "client!ija", name = "<init>", descriptor = "(ZLoq;)V")
    public class364(boolean arg0, class775 arg1) {
        if (arg0) {
            if (class775.field10561.startsWith("win")) {
                this.field4459 = 1;
            } else if (class775.field10561.startsWith("mac")) {
                this.field4459 = 2;
            } else if (class775.field10561.startsWith("linux")) {
                this.field4459 = 3;
            } else {
                this.field4459 = 4;
            }
            if (class775.field10564.startsWith("amd64") || class775.field10564.startsWith("x86_64")) {
                this.field4439 = true;
            } else {
                this.field4439 = false;
            }
            if (this.field4459 == 1) {
                if (class775.field10579.indexOf("4.0") != -1) {
                    this.field4446 = 1;
                } else if (class775.field10579.indexOf("4.1") != -1) {
                    this.field4446 = 2;
                } else if (class775.field10579.indexOf("4.9") != -1) {
                    this.field4446 = 3;
                } else if (class775.field10579.indexOf("5.0") != -1) {
                    this.field4446 = 4;
                } else if (class775.field10579.indexOf("5.1") != -1) {
                    this.field4446 = 5;
                } else if (class775.field10579.indexOf("6.0") != -1) {
                    this.field4446 = 6;
                } else if (class775.field10579.indexOf("6.1") != -1) {
                    this.field4446 = 7;
                }
            } else if (this.field4459 == 2) {
                if (class775.field10579.indexOf("10.4") != -1) {
                    this.field4446 = 20;
                } else if (class775.field10579.indexOf("10.5") != -1) {
                    this.field4446 = 21;
                } else if (class775.field10579.indexOf("10.6") != -1) {
                    this.field4446 = 22;
                }
            }
            if (class775.field10583.toLowerCase().indexOf("sun") != -1) {
                this.field4455 = 1;
            } else if (class775.field10583.toLowerCase().indexOf("microsoft") != -1) {
                this.field4455 = 2;
            } else if (class775.field10583.toLowerCase().indexOf("apple") == -1) {
                this.field4455 = 4;
            } else {
                this.field4455 = 3;
            }
            int var3 = 2;
            int var4 = 0;
            try {
                while (var3 < class775.field10565.length()) {
                    char var5 = class775.field10565.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var4 * 10 + var5 - 48;
                }
            } catch (Exception var16) {
            }
            this.field4452 = var4;
            int var6 = 0;
            int var7 = class775.field10565.indexOf(46, 2) + 1;
            try {
                while (var7 < class775.field10565.length()) {
                    char var8 = class775.field10565.charAt(var7);
                    if (var8 < '0' || var8 > '9') {
                        break;
                    }
                    var7++;
                    var6 = var6 * 10 + var8 - 48;
                }
            } catch (Exception var15) {
            }
            this.field4445 = var6;
            int var9 = class775.field10565.indexOf(95, 4) + 1;
            int var10 = 0;
            try {
                while (var9 < class775.field10565.length()) {
                    char var11 = class775.field10565.charAt(var9);
                    if (var11 < '0' || var11 > '9') {
                        break;
                    }
                    var10 = var10 * 10 + (var11 - 48);
                    var9++;
                }
            } catch (Exception var14) {
            }
            if (arg1.field10571) {
                this.field4451 = false;
            } else {
                this.field4451 = true;
            }
            this.field4433 = class91.field1248;
            this.field4434 = var10;
            if (this.field4452 > 3) {
                this.field4449 = class558.field7086;
            } else {
                this.field4449 = 0;
            }
            try {
                int[] var12 = HardwareInfo.getCPUInfo();
                if (var12 != null && var12.length == 7) {
                    this.field4440 = var12[3];
                    this.field4437 = var12[4];
                    this.field4432 = var12[6];
                    this.field4457 = var12[5];
                    this.field4442 = var12[2];
                }
            } catch (Throwable var13) {
                this.field4432 = 0;
            }
        }
        if (this.field4450 == null) {
            this.field4450 = "";
        }
        if (this.field4435 == null) {
            this.field4435 = "";
        }
        if (this.field4441 == null) {
            this.field4441 = "";
        }
        if (this.field4430 == null) {
            this.field4430 = "";
        }
        this.method2096((byte) -116);
    }
}
