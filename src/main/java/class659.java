import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class659 extends class154 {

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "I")
    private int field9111;

    @OriginalMember(owner = "client!mh", name = "J", descriptor = "Z")
    private boolean field9138;

    @OriginalMember(owner = "client!mh", name = "w", descriptor = "I")
    private int field9125;

    @OriginalMember(owner = "client!mh", name = "G", descriptor = "I")
    private int field9135;

    @OriginalMember(owner = "client!mh", name = "z", descriptor = "I")
    private int field9128;

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "I")
    private int field9118;

    @OriginalMember(owner = "client!mh", name = "A", descriptor = "I")
    private int field9129;

    @OriginalMember(owner = "client!mh", name = "x", descriptor = "Z")
    private boolean field9126;

    @OriginalMember(owner = "client!mh", name = "H", descriptor = "I")
    private int field9136;

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "I")
    private int field9112;

    @OriginalMember(owner = "client!mh", name = "q", descriptor = "I")
    private int field9119;

    @OriginalMember(owner = "client!mh", name = "v", descriptor = "I")
    private int field9124;

    @OriginalMember(owner = "client!mh", name = "F", descriptor = "I")
    private int field9134;

    @OriginalMember(owner = "client!mh", name = "B", descriptor = "I")
    private int field9130;

    @OriginalMember(owner = "client!mh", name = "K", descriptor = "I")
    public int field9139;

    @OriginalMember(owner = "client!mh", name = "C", descriptor = "Ljava/lang/String;")
    private String field9131;

    @OriginalMember(owner = "client!mh", name = "s", descriptor = "Ljava/lang/String;")
    private String field9121;

    @OriginalMember(owner = "client!mh", name = "r", descriptor = "Ljava/lang/String;")
    private String field9120;

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "Ljava/lang/String;")
    private String field9117;

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "I")
    public static int field9113;

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "I")
    private int field9114;

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "I")
    public static int field9115;

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "I")
    public static int field9116;

    @OriginalMember(owner = "client!mh", name = "u", descriptor = "I")
    public static int field9123;

    @OriginalMember(owner = "client!mh", name = "y", descriptor = "I")
    public static int field9127;

    @OriginalMember(owner = "client!mh", name = "D", descriptor = "I")
    public static int field9132;

    @OriginalMember(owner = "client!mh", name = "E", descriptor = "I")
    private int field9133;

    @OriginalMember(owner = "client!mh", name = "I", descriptor = "I")
    public static int field9137;

    @OriginalMember(owner = "client!mh", name = "t", descriptor = "Lhn;")
    public static class752 field9122;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Z)V", line = 6)
    private final void method3700(boolean arg0) {
        field9115++;
        if (this.field9117.length() > 40) {
            this.field9117 = this.field9117.substring(0, 40);
        }
        if (this.field9131.length() > 40) {
            this.field9131 = this.field9131.substring(0, 40);
        }
        if (arg0) {
            method3706(-115, 90);
        }
        if (this.field9121.length() > 10) {
            this.field9121 = this.field9121.substring(0, 10);
        }
        if (this.field9120.length() > 10) {
            this.field9120 = this.field9120.substring(0, 10);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZLfca;)V", line = 31)
    public final void method3701(boolean arg0, class93 arg1) {
        arg1.method754(5, 32);
        field9132++;
        if (!arg0) {
            return;
        }
        arg1.method754(this.field9111, 98);
        arg1.method754(this.field9138 ? 1 : 0, 111);
        arg1.method754(this.field9125, 76);
        arg1.method754(this.field9135, 45);
        arg1.method754(this.field9128, 75);
        arg1.method754(this.field9118, 90);
        arg1.method754(this.field9136, 52);
        arg1.method754(this.field9126 ? 1 : 0, 59);
        arg1.method781(46, this.field9129);
        arg1.method754(this.field9112, 57);
        arg1.method753(this.field9139, (byte) 117);
        arg1.method781(30, this.field9119);
        arg1.method754(this.field9124, 40);
        arg1.method754(this.field9134, 41);
        arg1.method754(this.field9130, 102);
        arg1.method788(14, this.field9117);
        arg1.method788(59, this.field9131);
        arg1.method788(97, this.field9121);
        arg1.method788(-99, this.field9120);
        arg1.method754(this.field9114, 40);
        arg1.method781(94, this.field9133);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V", line = 65)
    public static void method3702(int arg0) {
        if (arg0 >= 116) {
            field9122 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)I", line = 79)
    public final int method3703(int arg0) {
        field9113++;
        if (arg0 <= 83) {
            this.field9125 = 9;
        }
        byte var2 = 23;
        int var3 = var2 + class118.method1043(64, this.field9117);
        int var4 = var3 + class118.method1043(64, this.field9131);
        int var5 = var4 + class118.method1043(64, this.field9121);
        return var5 + class118.method1043(64, this.field9120);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B[Lnf;)V", line = 98)
    public static final void method3704(byte arg0, class604[] arg1) {
        class66.field967 = arg1.length;
        field9137++;
        class201.field3054 = new int[class66.field967 + 10];
        class146.field2462 = new class604[class66.field967 + 10];
        class275.method1769(arg1, 0, class146.field2462, 0, class66.field967);
        for (int var2 = 0; var2 < class66.field967; var2++) {
            class201.field3054[var2] = class146.field2462[var2].method218();
        }
        if (arg0 > -56) {
            method3707(68);
        }
        for (int var3 = class66.field967; var3 < class146.field2462.length; var3++) {
            class201.field3054[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZZ)Z", line = 127)
    public static boolean method3705(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)Z", line = 146)
    public static final boolean method3706(int arg0, int arg1) {
        field9116++;
        if (class157.field2548[arg1]) {
            return true;
        } else if (class724.field9956.method3751(arg1, 79)) {
            int var2 = class724.field9956.method3730((byte) 37, arg1);
            if (arg0 <= 103) {
                field9122 = null;
            }
            if (var2 == 0) {
                class157.field2548[arg1] = true;
                return true;
            }
            if (class431.field5870[arg1] == null) {
                class431.field5870[arg1] = new class17[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class431.field5870[arg1][var3] == null) {
                    byte[] var4 = class724.field9956.method3732(var3, 8906, arg1);
                    if (var4 != null) {
                        class17 var5 = class431.field5870[arg1][var3] = new class17();
                        var5.field372 = (arg1 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method109(new class93(var4), 66);
                    }
                }
            }
            class157.field2548[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(I)V", line = 205)
    public static final void method3707(int arg0) {
        class598.field8377.method1360((byte) 87);
        field9127++;
        if (arg0 < 88) {
            method3704((byte) 11, null);
        }
        for (int var1 = 0; var1 < 32; var1++) {
            class518.field7038[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class505.field6888[var2] = 0L;
        }
        class345.field4641 = 0;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIIII)V", line = 231)
    public static final void method3708(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 >= -13) {
            return;
        }
        field9123++;
        if (arg4 != 8 && arg4 != 16) {
            class549 var7 = class325.field4448[arg0][arg2][arg3];
            if (var7 == null) {
                var7 = new class549(arg0);
            }
            if (arg4 == 1) {
                var7.field7470 = (short) arg5;
                var7.field7468 = (short) arg1;
            } else if (arg4 == 2) {
                var7.field7460 = (short) arg5;
                var7.field7461 = (short) arg1;
            }
            if (class344.field4631) {
                class393.method2384((byte) 84);
                return;
            }
            return;
        }
        if (arg4 != 8) {
            int var8 = (arg2 << class654.field9055) + class365.field4955;
            int var9 = var8 - class365.field4955;
            int var10 = arg3 << class654.field9055;
            int var11 = var10 + class365.field4955;
            int var12 = class142.field2418[arg0].method1897((byte) -34, arg3, arg2 + 1);
            int var13 = class142.field2418[arg0].method1897((byte) -34, arg3 + 1, arg2);
            class262.field3687[class660.field9144++] = new class616(arg4, arg0, var8, var9, var9, var8, var12, var13, var13 - arg5, var12 - arg5, var10, var11, var11, var10);
            return;
        }
        int var14 = arg2 << class654.field9055;
        int var15 = class365.field4955 + var14;
        int var16 = arg3 << class654.field9055;
        int var17 = class365.field4955 + var16;
        int var18 = class142.field2418[arg0].method1897((byte) -34, arg3, arg2);
        int var19 = class142.field2418[arg0].method1897((byte) -34, arg3 + 1, arg2 + 1);
        class262.field3687[class660.field9144++] = new class616(arg4, arg0, var14, var15, var15, var14, var18, var19, var19 - arg5, -arg5 + var18, var16, var17, var17, var16);
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V", line = 306)
    public class659() {
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(ZLlu;)V", line = 308)
    public class659(boolean arg0, class742 arg1) {
        if (arg0) {
            if (class742.field10234.startsWith("win")) {
                this.field9111 = 1;
            } else if (class742.field10234.startsWith("mac")) {
                this.field9111 = 2;
            } else if (class742.field10234.startsWith("linux")) {
                this.field9111 = 3;
            } else {
                this.field9111 = 4;
            }
            if (class742.field10256.startsWith("amd64") || class742.field10256.startsWith("x86_64")) {
                this.field9138 = true;
            } else {
                this.field9138 = false;
            }
            if (this.field9111 == 1) {
                if (class742.field10244.indexOf("4.0") != -1) {
                    this.field9125 = 1;
                } else if (class742.field10244.indexOf("4.1") != -1) {
                    this.field9125 = 2;
                } else if (class742.field10244.indexOf("4.9") != -1) {
                    this.field9125 = 3;
                } else if (class742.field10244.indexOf("5.0") != -1) {
                    this.field9125 = 4;
                } else if (class742.field10244.indexOf("5.1") != -1) {
                    this.field9125 = 5;
                } else if (class742.field10244.indexOf("6.0") != -1) {
                    this.field9125 = 6;
                } else if (class742.field10244.indexOf("6.1") != -1) {
                    this.field9125 = 7;
                }
            } else if (this.field9111 == 2) {
                if (class742.field10244.indexOf("10.4") != -1) {
                    this.field9125 = 20;
                } else if (class742.field10244.indexOf("10.5") != -1) {
                    this.field9125 = 21;
                } else if (class742.field10244.indexOf("10.6") != -1) {
                    this.field9125 = 22;
                }
            }
            if (class742.field10231.toLowerCase().indexOf("sun") != -1) {
                this.field9135 = 1;
            } else if (class742.field10231.toLowerCase().indexOf("microsoft") != -1) {
                this.field9135 = 2;
            } else if (class742.field10231.toLowerCase().indexOf("apple") == -1) {
                this.field9135 = 4;
            } else {
                this.field9135 = 3;
            }
            int var3 = 2;
            int var4 = 0;
            try {
                while (var3 < class742.field10247.length()) {
                    char var5 = class742.field10247.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + var5 - 48;
                    var3++;
                }
            } catch (Exception var16) {
            }
            this.field9128 = var4;
            int var6 = 0;
            int var7 = class742.field10247.indexOf(46, 2) + 1;
            try {
                while (var7 < class742.field10247.length()) {
                    char var8 = class742.field10247.charAt(var7);
                    if (var8 < '0' || var8 > '9') {
                        break;
                    }
                    var6 = var6 * 10 + var8 - 48;
                    var7++;
                }
            } catch (Exception var15) {
            }
            this.field9118 = var6;
            int var9 = class742.field10247.indexOf(95, 4) + 1;
            int var10 = 0;
            try {
                while (var9 < class742.field10247.length()) {
                    char var11 = class742.field10247.charAt(var9);
                    if (var11 < '0' || var11 > '9') {
                        break;
                    }
                    var9++;
                    var10 = var10 * 10 + var11 - 48;
                }
            } catch (Exception var14) {
            }
            this.field9129 = class455.field6207;
            if (arg1.field10241) {
                this.field9126 = false;
            } else {
                this.field9126 = true;
            }
            this.field9136 = var10;
            if (this.field9128 > 3) {
                this.field9112 = class381.field5187;
            } else {
                this.field9112 = 0;
            }
            try {
                int[] var12 = HardwareInfo.getCPUInfo();
                if (var12 != null && var12.length == 7) {
                    this.field9119 = var12[2];
                    this.field9124 = var12[3];
                    this.field9134 = var12[4];
                    this.field9130 = var12[5];
                    this.field9139 = var12[6];
                }
            } catch (Throwable var13) {
                this.field9139 = 0;
            }
        }
        if (this.field9131 == null) {
            this.field9131 = "";
        }
        if (this.field9121 == null) {
            this.field9121 = "";
        }
        if (this.field9120 == null) {
            this.field9120 = "";
        }
        if (this.field9117 == null) {
            this.field9117 = "";
        }
        this.method3700(false);
    }
}
