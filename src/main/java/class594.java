import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class594 extends class71 {

    @OriginalMember(owner = "client!ok", name = "G", descriptor = "I")
    private int field8067;

    @OriginalMember(owner = "client!ok", name = "y", descriptor = "Z")
    private boolean field8059;

    @OriginalMember(owner = "client!ok", name = "E", descriptor = "I")
    private int field8065;

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "I")
    private int field8050;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "I")
    private int field8045;

    @OriginalMember(owner = "client!ok", name = "B", descriptor = "I")
    private int field8062;

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "I")
    private int field8048;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
    private int field8046;

    @OriginalMember(owner = "client!ok", name = "s", descriptor = "I")
    private int field8053;

    @OriginalMember(owner = "client!ok", name = "r", descriptor = "Z")
    private boolean field8052;

    @OriginalMember(owner = "client!ok", name = "z", descriptor = "I")
    public int field8060;

    @OriginalMember(owner = "client!ok", name = "A", descriptor = "I")
    private int field8061;

    @OriginalMember(owner = "client!ok", name = "D", descriptor = "I")
    private int field8064;

    @OriginalMember(owner = "client!ok", name = "w", descriptor = "I")
    private int field8057;

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "I")
    private int field8047;

    @OriginalMember(owner = "client!ok", name = "H", descriptor = "Ljava/lang/String;")
    private String field8068;

    @OriginalMember(owner = "client!ok", name = "q", descriptor = "Ljava/lang/String;")
    private String field8051;

    @OriginalMember(owner = "client!ok", name = "F", descriptor = "Ljava/lang/String;")
    private String field8066;

    @OriginalMember(owner = "client!ok", name = "I", descriptor = "Ljava/lang/String;")
    private String field8069;

    @OriginalMember(owner = "client!ok", name = "L", descriptor = "Lkr;")
    public static class602 field8072 = new class602(2, 1);

    @OriginalMember(owner = "client!ok", name = "O", descriptor = "[[I")
    public static int[][] field8075 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!ok", name = "M", descriptor = "[[Z")
    public static boolean[][] field8073 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    public static int field8044;

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
    public static int field8049;

    @OriginalMember(owner = "client!ok", name = "t", descriptor = "I")
    public static int field8054;

    @OriginalMember(owner = "client!ok", name = "u", descriptor = "I")
    private int field8055;

    @OriginalMember(owner = "client!ok", name = "v", descriptor = "I")
    private int field8056;

    @OriginalMember(owner = "client!ok", name = "x", descriptor = "I")
    public static int field8058;

    @OriginalMember(owner = "client!ok", name = "J", descriptor = "I")
    public static int field8070;

    @OriginalMember(owner = "client!ok", name = "K", descriptor = "I")
    public static int field8071;

    @OriginalMember(owner = "client!ok", name = "N", descriptor = "Lvq;")
    public static class512 field8074;

    @OriginalMember(owner = "client!ok", name = "C", descriptor = "Lkr;")
    public static class602 field8063;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)I", line = 8)
    public final int method3408(byte arg0) {
        field8054++;
        byte var2 = 23;
        int var3 = var2 + class480.method2921(-2, this.field8051);
        int var4 = var3 + class480.method2921(-2, this.field8069);
        int var5 = var4 + class480.method2921(-2, this.field8068);
        int var6 = var5 + class480.method2921(-2, this.field8066);
        return arg0 < 66 ? 96 : var6;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z)V", line = 26)
    public static void method3409(boolean arg0) {
        if (!arg0) {
            return;
        }
        field8073 = null;
        field8072 = null;
        field8074 = null;
        field8075 = null;
        field8063 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ldc;B)V", line = 41)
    public final void method3410(class63 arg0, byte arg1) {
        arg0.method444(5, 128);
        field8049++;
        arg0.method444(this.field8067, arg1 ^ 0xD8);
        arg0.method444(this.field8059 ? 1 : 0, 128);
        arg0.method444(this.field8065, 128);
        arg0.method444(this.field8050, 128);
        arg0.method444(this.field8045, arg1 + 40);
        arg0.method444(this.field8062, arg1 + 40);
        arg0.method444(this.field8053, 128);
        arg0.method444(this.field8052 ? 1 : 0, arg1 + 40);
        arg0.method492(arg1 ^ 0xFFFFFFA6, this.field8048);
        arg0.method444(this.field8046, 128);
        arg0.method464(arg1 + 25349, this.field8060);
        arg0.method492(arg1 ^ 0xFFFFFFA6, this.field8057);
        arg0.method444(this.field8064, 128);
        if (arg1 != 88) {
            this.field8057 = 112;
        }
        arg0.method444(this.field8061, 128);
        arg0.method444(this.field8047, arg1 ^ 0xD8);
        arg0.method486((byte) 81, this.field8051);
        arg0.method486((byte) 81, this.field8069);
        arg0.method486((byte) 81, this.field8068);
        arg0.method486((byte) 81, this.field8066);
        arg0.method444(this.field8055, 128);
        arg0.method492(-2, this.field8056);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIBI)I", line = 77)
    public static final int method3411(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = arg3 & 0x3;
        field8071++;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 4095 - arg1;
        } else {
            if (arg2 > -42) {
                field8074 = null;
            }
            return var4 == 2 ? 4095 - arg0 : arg1;
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(B)V", line = 104)
    private final void method3412(byte arg0) {
        field8044++;
        if (arg0 != 52) {
            return;
        }
        if (this.field8051.length() > 40) {
            this.field8051 = this.field8051.substring(0, 40);
        }
        if (this.field8069.length() > 40) {
            this.field8069 = this.field8069.substring(0, 40);
        }
        if (this.field8068.length() > 10) {
            this.field8068 = this.field8068.substring(0, 10);
        }
        if (this.field8066.length() > 10) {
            this.field8066 = this.field8066.substring(0, 10);
        }
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(B)V", line = 133)
    public static final void method3413(byte arg0) {
        field8070++;
        if (arg0 <= 75) {
            field8075 = null;
        }
        if (!class160.field2235) {
            return;
        }
        class755 var1 = class171.method1093((byte) 111, class401.field5748, class442.field6137);
        if (var1 != null && var1.field10487 != null) {
            class142 var2 = new class142();
            var2.field2024 = var1.field10487;
            var2.field2020 = var1;
            class546.method3233(var2);
        }
        class160.field2235 = false;
        class222.field3007 = -1;
        class209.field2732 = -1;
        if (var1 != null) {
            class27.method159((byte) -105, var1);
        }
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "()V", line = 180)
    public class594() {
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(III)V", line = 191)
    public static final void method3414(int arg0, int arg1, int arg2) {
        field8058++;
        class346 var3 = class299.method1976(0, arg2, arg1);
        var3.method2209(255);
        var3.field4926 = arg0;
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(ZLrp;)V", line = 205)
    public class594(boolean arg0, class135 arg1) {
        if (arg0) {
            if (class135.field1937.startsWith("win")) {
                this.field8067 = 1;
            } else if (class135.field1937.startsWith("mac")) {
                this.field8067 = 2;
            } else if (class135.field1937.startsWith("linux")) {
                this.field8067 = 3;
            } else {
                this.field8067 = 4;
            }
            if (class135.field1925.startsWith("amd64") || class135.field1925.startsWith("x86_64")) {
                this.field8059 = true;
            } else {
                this.field8059 = false;
            }
            if (this.field8067 == 1) {
                if (class135.field1932.indexOf("4.0") != -1) {
                    this.field8065 = 1;
                } else if (class135.field1932.indexOf("4.1") != -1) {
                    this.field8065 = 2;
                } else if (class135.field1932.indexOf("4.9") != -1) {
                    this.field8065 = 3;
                } else if (class135.field1932.indexOf("5.0") != -1) {
                    this.field8065 = 4;
                } else if (class135.field1932.indexOf("5.1") != -1) {
                    this.field8065 = 5;
                } else if (class135.field1932.indexOf("6.0") != -1) {
                    this.field8065 = 6;
                } else if (class135.field1932.indexOf("6.1") != -1) {
                    this.field8065 = 7;
                }
            } else if (this.field8067 == 2) {
                if (class135.field1932.indexOf("10.4") != -1) {
                    this.field8065 = 20;
                } else if (class135.field1932.indexOf("10.5") != -1) {
                    this.field8065 = 21;
                } else if (class135.field1932.indexOf("10.6") != -1) {
                    this.field8065 = 22;
                }
            }
            if (class135.field1915.toLowerCase().indexOf("sun") != -1) {
                this.field8050 = 1;
            } else if (class135.field1915.toLowerCase().indexOf("microsoft") != -1) {
                this.field8050 = 2;
            } else if (class135.field1915.toLowerCase().indexOf("apple") == -1) {
                this.field8050 = 4;
            } else {
                this.field8050 = 3;
            }
            int var3 = 2;
            int var4 = 0;
            try {
                while (var3 < class135.field1938.length()) {
                    char var5 = class135.field1938.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var4 * 10 + var5 - 48;
                }
            } catch (Exception var16) {
            }
            this.field8045 = var4;
            int var6 = 0;
            int var7 = class135.field1938.indexOf(46, 2) + 1;
            try {
                while (var7 < class135.field1938.length()) {
                    char var8 = class135.field1938.charAt(var7);
                    if (var8 < '0' || var8 > '9') {
                        break;
                    }
                    var7++;
                    var6 = var8 - (48 - var6 * 10);
                }
            } catch (Exception var15) {
            }
            this.field8062 = var6;
            int var9 = class135.field1938.indexOf(95, 4) + 1;
            int var10 = 0;
            try {
                while (var9 < class135.field1938.length()) {
                    char var11 = class135.field1938.charAt(var9);
                    if (var11 < '0' || var11 > '9') {
                        break;
                    }
                    var9++;
                    var10 = var10 * 10 + var11 - 48;
                }
            } catch (Exception var14) {
            }
            this.field8048 = class152.field2091;
            if (this.field8045 <= 3) {
                this.field8046 = 0;
            } else {
                this.field8046 = class81.field1179;
            }
            this.field8053 = var10;
            if (arg1.field1936) {
                this.field8052 = false;
            } else {
                this.field8052 = true;
            }
            try {
                int[] var12 = HardwareInfo.getCPUInfo();
                if (var12 != null && var12.length == 7) {
                    this.field8060 = var12[6];
                    this.field8061 = var12[4];
                    this.field8064 = var12[3];
                    this.field8057 = var12[2];
                    this.field8047 = var12[5];
                }
            } catch (Throwable var13) {
                this.field8060 = 0;
            }
        }
        if (this.field8068 == null) {
            this.field8068 = "";
        }
        if (this.field8051 == null) {
            this.field8051 = "";
        }
        if (this.field8066 == null) {
            this.field8066 = "";
        }
        if (this.field8069 == null) {
            this.field8069 = "";
        }
        this.method3412((byte) 52);
    }
}
