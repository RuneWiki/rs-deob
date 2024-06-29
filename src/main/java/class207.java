import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public class class207 extends class430 {

    @OriginalMember(owner = "client!gca", name = "A", descriptor = "I")
    private int field3130;

    @OriginalMember(owner = "client!gca", name = "p", descriptor = "Z")
    private boolean field3119;

    @OriginalMember(owner = "client!gca", name = "n", descriptor = "I")
    private int field3117;

    @OriginalMember(owner = "client!gca", name = "h", descriptor = "I")
    private int field3111;

    @OriginalMember(owner = "client!gca", name = "r", descriptor = "I")
    private int field3121;

    @OriginalMember(owner = "client!gca", name = "k", descriptor = "I")
    private int field3114;

    @OriginalMember(owner = "client!gca", name = "w", descriptor = "I")
    private int field3126;

    @OriginalMember(owner = "client!gca", name = "v", descriptor = "Z")
    private boolean field3125;

    @OriginalMember(owner = "client!gca", name = "B", descriptor = "I")
    private int field3131;

    @OriginalMember(owner = "client!gca", name = "u", descriptor = "I")
    private int field3124;

    @OriginalMember(owner = "client!gca", name = "q", descriptor = "I")
    private int field3120;

    @OriginalMember(owner = "client!gca", name = "z", descriptor = "Ljava/lang/String;")
    private String field3129;

    @OriginalMember(owner = "client!gca", name = "j", descriptor = "Ljava/lang/String;")
    private String field3113;

    @OriginalMember(owner = "client!gca", name = "x", descriptor = "Ljava/lang/String;")
    private String field3127;

    @OriginalMember(owner = "client!gca", name = "m", descriptor = "Ljava/lang/String;")
    private String field3116;

    @OriginalMember(owner = "client!gca", name = "G", descriptor = "Llc;")
    public static class435 field3136 = new class435(56, 12);

    @OriginalMember(owner = "client!gca", name = "H", descriptor = "Lfba;")
    public static class348 field3137 = new class348(50);

    @OriginalMember(owner = "client!gca", name = "J", descriptor = "Llc;")
    public static class435 field3139 = new class435(98, 4);

    @OriginalMember(owner = "client!gca", name = "K", descriptor = "I")
    public static int field3140 = -2;

    @OriginalMember(owner = "client!gca", name = "g", descriptor = "I")
    private int field3110;

    @OriginalMember(owner = "client!gca", name = "i", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!gca", name = "l", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!gca", name = "o", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!gca", name = "s", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!gca", name = "t", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!gca", name = "y", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!gca", name = "C", descriptor = "I")
    private int field3132;

    @OriginalMember(owner = "client!gca", name = "D", descriptor = "I")
    private int field3133;

    @OriginalMember(owner = "client!gca", name = "E", descriptor = "I")
    private int field3134;

    @OriginalMember(owner = "client!gca", name = "F", descriptor = "I")
    private int field3135;

    @OriginalMember(owner = "client!gca", name = "I", descriptor = "I")
    private int field3138;

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIII)V", line = 8)
    public static final void method1476(int arg0, int arg1, int arg2, int arg3) {
        field3115++;
        class503 var4 = class512.method3112(9, arg2, 0);
        var4.method3075((byte) -128);
        var4.field7310 = arg0;
        if (arg3 == 1) {
            var4.field7312 = arg1;
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(B)V", line = 23)
    public static void method1477(byte arg0) {
        field3137 = null;
        field3136 = null;
        field3139 = null;
        if (arg0 != 107) {
            field3137 = null;
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(BLsl;)Lcba;", line = 37)
    public static final class53 method1478(byte arg0, class479 arg1) {
        if (arg0 == -128) {
            field3128++;
            class629 var2 = class574.method3409(arg1, true);
            int var3 = arg1.method2870(-11395);
            return new class53(var2.field5625, var2.field5623, var2.field5620, var2.field5622, var2.field5617, var2.field5613, var2.field5614, var2.field5616, var2.field5624, var2.field8913, var2.field8908, var2.field8911, var2.field8915, var2.field8918, var2.field8914, var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIBIII)V", line = 62)
    public static final void method1479(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field3123++;
        int var6 = arg5 - arg4;
        int var7 = arg3 - arg0;
        if (var7 == 0) {
            if (var6 != 0) {
                class493.method3003(arg5, arg0, arg4, (byte) 11, arg1);
            }
        } else if (var6 == 0) {
            class684.method3883((byte) -5, arg4, arg1, arg0, arg3);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg0;
                arg0 = arg4;
                int var10 = arg3;
                arg4 = var9;
                arg3 = arg5;
                arg5 = var10;
            }
            if (arg3 < arg0) {
                int var11 = arg0;
                arg0 = arg3;
                int var12 = arg4;
                arg4 = arg5;
                arg3 = var11;
                arg5 = var12;
            }
            int var13 = arg4;
            int var14 = arg3 - arg0;
            int var15 = arg5 - arg4;
            if (arg2 >= 86) {
                int var16 = -(var14 >> 1);
                if (var15 < 0) {
                    var15 = -var15;
                }
                int var17 = arg5 > arg4 ? 1 : -1;
                if (var8) {
                    for (int var18 = arg0; var18 <= arg3; var18++) {
                        var16 += var15;
                        class193.field2839[var18][var13] = arg1;
                        if (var16 > 0) {
                            var13 += var17;
                            var16 -= var14;
                        }
                    }
                } else {
                    for (int var19 = arg0; var19 <= arg3; var19++) {
                        var16 += var15;
                        class193.field2839[var13][var19] = arg1;
                        if (var16 > 0) {
                            var13 += var17;
                            var16 -= var14;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(I)V", line = 182)
    private final void method1480(int arg0) {
        field3122++;
        if (this.field3113.length() > 40) {
            this.field3113 = this.field3113.substring(0, 40);
        }
        if (this.field3116.length() > 40) {
            this.field3116 = this.field3116.substring(0, 40);
        }
        if (this.field3129.length() > 10) {
            this.field3129 = this.field3129.substring(0, 10);
        }
        if (arg0 == -1087 && this.field3127.length() > 10) {
            this.field3127 = this.field3127.substring(0, 10);
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(ILsl;)V", line = 211)
    public final void method1481(int arg0, class479 arg1) {
        field3118++;
        arg1.method2881(5, (byte) 111);
        arg1.method2881(this.field3130, (byte) 120);
        arg1.method2881(this.field3119 ? 1 : 0, (byte) 116);
        arg1.method2881(this.field3117, (byte) 117);
        arg1.method2881(this.field3111, (byte) 125);
        arg1.method2881(this.field3121, (byte) 123);
        arg1.method2881(this.field3114, (byte) 121);
        arg1.method2881(this.field3131, (byte) 109);
        arg1.method2881(this.field3125 ? 1 : 0, (byte) 109);
        arg1.method2862(this.field3124, -1166933656);
        arg1.method2881(this.field3126, (byte) 127);
        arg1.method2909(93, this.field3120);
        arg1.method2862(this.field3133, -1166933656);
        arg1.method2881(this.field3138, (byte) 109);
        if (arg0 <= 117) {
            this.field3111 = -93;
        }
        arg1.method2881(this.field3135, (byte) 127);
        arg1.method2881(this.field3110, (byte) 120);
        arg1.method2910(this.field3113, 128);
        arg1.method2910(this.field3116, 128);
        arg1.method2910(this.field3129, 128);
        arg1.method2910(this.field3127, 128);
        arg1.method2881(this.field3134, (byte) 120);
        arg1.method2862(this.field3132, -1166933656);
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(B)I", line = 245)
    public final int method1482(byte arg0) {
        field3112++;
        byte var2 = 23;
        int var3 = var2 + class512.method3114(this.field3113, 6406);
        int var4 = var3 + class512.method3114(this.field3116, 6406);
        int var5 = var4 + class512.method3114(this.field3129, 6406);
        int var6 = var5 + class512.method3114(this.field3127, 6406);
        if (arg0 != -39) {
            field3136 = null;
        }
        return var6;
    }

    @OriginalMember(owner = "client!gca", name = "<init>", descriptor = "()V", line = 277)
    public class207() {
    }

    @OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(ZLhga;)V", line = 283)
    public class207(boolean arg0, class300 arg1) {
        if (arg0) {
            if (class300.field4089.startsWith("win")) {
                this.field3130 = 1;
            } else if (class300.field4089.startsWith("mac")) {
                this.field3130 = 2;
            } else if (class300.field4089.startsWith("linux")) {
                this.field3130 = 3;
            } else {
                this.field3130 = 4;
            }
            if (class300.field4103.startsWith("amd64") || class300.field4103.startsWith("x86_64")) {
                this.field3119 = true;
            } else {
                this.field3119 = false;
            }
            if (this.field3130 == 1) {
                if (class300.field4091.indexOf("4.0") != -1) {
                    this.field3117 = 1;
                } else if (class300.field4091.indexOf("4.1") != -1) {
                    this.field3117 = 2;
                } else if (class300.field4091.indexOf("4.9") != -1) {
                    this.field3117 = 3;
                } else if (class300.field4091.indexOf("5.0") != -1) {
                    this.field3117 = 4;
                } else if (class300.field4091.indexOf("5.1") != -1) {
                    this.field3117 = 5;
                } else if (class300.field4091.indexOf("6.0") != -1) {
                    this.field3117 = 6;
                } else if (class300.field4091.indexOf("6.1") != -1) {
                    this.field3117 = 7;
                }
            } else if (this.field3130 == 2) {
                if (class300.field4091.indexOf("10.4") != -1) {
                    this.field3117 = 20;
                } else if (class300.field4091.indexOf("10.5") != -1) {
                    this.field3117 = 21;
                } else if (class300.field4091.indexOf("10.6") != -1) {
                    this.field3117 = 22;
                }
            }
            if (class300.field4086.toLowerCase().indexOf("sun") != -1) {
                this.field3111 = 1;
            } else if (class300.field4086.toLowerCase().indexOf("microsoft") != -1) {
                this.field3111 = 2;
            } else if (class300.field4086.toLowerCase().indexOf("apple") == -1) {
                this.field3111 = 4;
            } else {
                this.field3111 = 3;
            }
            int var3 = 2;
            int var4 = 0;
            try {
                while (var3 < class300.field4095.length()) {
                    char var5 = class300.field4095.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var4 * 10 - (48 - var5);
                }
            } catch (Exception var15) {
            }
            this.field3121 = var4;
            int var6 = 0;
            int var7 = class300.field4095.indexOf(46, 2) + 1;
            try {
                while (var7 < class300.field4095.length()) {
                    char var8 = class300.field4095.charAt(var7);
                    if (var8 < '0' || var8 > '9') {
                        break;
                    }
                    var6 = var6 * 10 + (var8 - '0');
                    var7++;
                }
            } catch (Exception var14) {
            }
            this.field3114 = var6;
            int var9 = class300.field4095.indexOf(95, 4) + 1;
            int var10 = 0;
            try {
                while (var9 < class300.field4095.length()) {
                    char var11 = class300.field4095.charAt(var9);
                    if (var11 < '0' || var11 > '9') {
                        break;
                    }
                    var9++;
                    var10 = var10 * 10 - (48 - var11);
                }
            } catch (Exception var13) {
            }
            if (this.field3121 <= 3) {
                this.field3126 = 0;
            } else {
                this.field3126 = class15.field149;
            }
            if (arg1.field4087) {
                this.field3125 = false;
            } else {
                this.field3125 = true;
            }
            this.field3131 = var10;
            this.field3124 = class597.field8492;
            try {
                this.field3120 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
            } catch (Throwable var12) {
                this.field3120 = 0;
            }
        }
        if (this.field3129 == null) {
            this.field3129 = "";
        }
        if (this.field3113 == null) {
            this.field3113 = "";
        }
        if (this.field3127 == null) {
            this.field3127 = "";
        }
        if (this.field3116 == null) {
            this.field3116 = "";
        }
        this.method1480(-1087);
    }
}
