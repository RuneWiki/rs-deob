import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class638 {

    @OriginalMember(owner = "client!hw", name = "q", descriptor = "Z")
    private boolean field8108 = false;

    @OriginalMember(owner = "client!hw", name = "f", descriptor = "I")
    private int field8097 = 0;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "I")
    private int field8092 = -1;

    @OriginalMember(owner = "client!hw", name = "x", descriptor = "I")
    private int field8115 = -1;

    @OriginalMember(owner = "client!hw", name = "H", descriptor = "I")
    private int field8125 = -1;

    @OriginalMember(owner = "client!hw", name = "v", descriptor = "Z")
    private boolean field8113 = false;

    @OriginalMember(owner = "client!hw", name = "C", descriptor = "I")
    private int field8120 = 0;

    @OriginalMember(owner = "client!hw", name = "o", descriptor = "Llq;")
    private class210 field8106;

    @OriginalMember(owner = "client!hw", name = "D", descriptor = "I")
    public int field8121;

    @OriginalMember(owner = "client!hw", name = "y", descriptor = "I")
    public int field8116;

    @OriginalMember(owner = "client!hw", name = "m", descriptor = "B")
    private byte field8104;

    @OriginalMember(owner = "client!hw", name = "i", descriptor = "I")
    public int field8100;

    @OriginalMember(owner = "client!hw", name = "g", descriptor = "B")
    private byte field8098;

    @OriginalMember(owner = "client!hw", name = "O", descriptor = "Z")
    private boolean field8132;

    @OriginalMember(owner = "client!hw", name = "z", descriptor = "I")
    public static int field8117 = 1403;

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "I")
    public static int field8093;

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "I")
    public static int field8094;

    @OriginalMember(owner = "client!hw", name = "d", descriptor = "I")
    private int field8095;

    @OriginalMember(owner = "client!hw", name = "e", descriptor = "I")
    public static int field8096;

    @OriginalMember(owner = "client!hw", name = "j", descriptor = "I")
    public static int field8101;

    @OriginalMember(owner = "client!hw", name = "k", descriptor = "I")
    public static int field8102;

    @OriginalMember(owner = "client!hw", name = "l", descriptor = "I")
    public static int field8103;

    @OriginalMember(owner = "client!hw", name = "p", descriptor = "I")
    private int field8107;

    @OriginalMember(owner = "client!hw", name = "s", descriptor = "I")
    public static int field8110;

    @OriginalMember(owner = "client!hw", name = "t", descriptor = "I")
    public static int field8111;

    @OriginalMember(owner = "client!hw", name = "u", descriptor = "I")
    private int field8112;

    @OriginalMember(owner = "client!hw", name = "B", descriptor = "I")
    public static int field8119;

    @OriginalMember(owner = "client!hw", name = "E", descriptor = "I")
    private int field8122;

    @OriginalMember(owner = "client!hw", name = "F", descriptor = "I")
    public static int field8123;

    @OriginalMember(owner = "client!hw", name = "G", descriptor = "I")
    public static int field8124;

    @OriginalMember(owner = "client!hw", name = "J", descriptor = "I")
    public static int field8127;

    @OriginalMember(owner = "client!hw", name = "K", descriptor = "I")
    public static int field8128;

    @OriginalMember(owner = "client!hw", name = "L", descriptor = "I")
    public static int field8129;

    @OriginalMember(owner = "client!hw", name = "N", descriptor = "I")
    public static int field8131;

    @OriginalMember(owner = "client!hw", name = "r", descriptor = "Ljba;")
    private class11 field8109;

    @OriginalMember(owner = "client!hw", name = "A", descriptor = "Lka;")
    private class299 field8118;

    @OriginalMember(owner = "client!hw", name = "I", descriptor = "Lnia;")
    public class513 field8126;

    @OriginalMember(owner = "client!hw", name = "M", descriptor = "Lmea;")
    private class702 field8130;

    @OriginalMember(owner = "client!hw", name = "h", descriptor = "Lr;")
    private class736 field8099;

    @OriginalMember(owner = "client!hw", name = "n", descriptor = "[Lvo;")
    public static class139[] field8105;

    @OriginalMember(owner = "client!hw", name = "w", descriptor = "[Z")
    private boolean[] field8114;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(BI)V")
    private final void method3435(byte arg0, int arg1) {
        field8128++;
        int var3 = arg1;
        boolean var4 = false;
        if (arg1 == -1) {
            class773 var5 = class390.field4983.method4292(this.field8121, (byte) -86);
            class773 var6 = var5;
            if (var5.field10536 != null) {
                var5 = var5.method4213(class381.field4705, -109);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field10525 != null) {
                if (this.field8109 != null && var5.method4218(this.field8109.field113, (byte) -30)) {
                    return;
                }
                var3 = var5.method4215(-40);
                if (this.field8092 != var5.field10531) {
                    var4 = var5.field10445;
                }
            } else if (var5.field10543 == -1) {
                if (var6 != null && var6.field10525 != null) {
                    if (this.field8109 != null && var6.method4218(this.field8109.field113, (byte) -30)) {
                        return;
                    }
                    var3 = var6.method4215(-115);
                    if (this.field8092 != var6.field10531) {
                        var4 = var6.field10445;
                    }
                } else if (var6 != null && var6.field10543 != -1 && this.field8092 != var6.field10531) {
                    var4 = var6.field10445;
                    var3 = var6.field10543;
                }
            } else if (this.field8092 != var5.field10531) {
                var3 = var5.field10543;
                var4 = var5.field10445;
            }
        }
        if (var3 == -1) {
            this.field8109 = null;
            return;
        }
        this.field8118 = null;
        if (this.field8109 == null || this.field8109.field113 != var3) {
            this.field8109 = class143.field1864.method4265(true, var3);
        } else if (this.field8109.field102 == 0) {
            return;
        }
        if (this.field8109.field109 == null) {
            this.field8109 = null;
            return;
        }
        int var7 = -109 / ((42 - arg0) / 62);
        if (var4) {
            this.field8095 = (int) (Math.random() * (double) this.field8109.field109.length);
            this.field8107 = (int) (Math.random() * (double) this.field8109.field121[this.field8095]) + 1;
        } else {
            this.field8095 = 0;
            this.field8107 = 1;
        }
        this.field8112 = this.field8095 + 1;
        if (this.field8112 < 0 || this.field8112 >= this.field8109.field109.length) {
            this.field8112 = -1;
        }
        this.field8122 = class693.field8900 - this.field8107;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(B)V")
    public static void method3436(byte arg0) {
        field8105 = null;
        if (arg0 >= -53) {
            method3447((byte) 45);
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(I)I")
    public final int method3437(int arg0) {
        if (arg0 == 0) {
            field8129++;
            return this.field8120;
        } else {
            return -104;
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(ILka;IZILoha;Lha;II)V")
    public final void method3438(int arg0, class299 arg1, int arg2, boolean arg3, int arg4, class465 arg5, class570 arg6, int arg7, int arg8) {
        field8110++;
        class581[] var10 = arg1.method1247();
        class49[] var11 = arg1.method1246();
        if (arg2 != 11) {
            field8105 = null;
        }
        if ((this.field8126 == null || this.field8126.field6534) && (var10 != null || var11 != null)) {
            class773 var12 = class390.field4983.method4292(this.field8121, (byte) -120);
            if (var12.field10536 != null) {
                var12 = var12.method4213(class381.field4705, -120);
            }
            if (var12 != null) {
                this.field8126 = class513.method2843(class693.field8900, true);
            }
        }
        if (this.field8126 == null) {
            return;
        }
        arg1.method1273(arg5);
        if (arg3) {
            this.field8126.method2840(arg6, (long) class693.field8900, var10, var11, false);
        } else {
            this.field8126.method2836((long) class693.field8900);
        }
        this.field8126.method2833(this.field8104, arg4, arg7, arg8, arg0);
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(Lha;I)V")
    public final void method3439(class570 arg0, int arg1) {
        if (arg1 != -5887) {
            method3449((char) 65481, -46);
        }
        field8103++;
        this.method3440(7, 262144, true, arg0, true);
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIZLha;Z)Lka;")
    public final class299 method3440(int arg0, int arg1, boolean arg2, class570 arg3, boolean arg4) {
        field8119++;
        class773 var6 = class390.field4983.method4292(this.field8121, (byte) -124);
        if (var6.field10536 != null) {
            var6 = var6.method4213(class381.field4705, -115);
        }
        if (var6 == null) {
            this.method3441(arg3, arg0 ^ 0x6);
            this.field8092 = -1;
            this.field8115 = -1;
            this.field8125 = -1;
            return null;
        }
        if (!this.field8108 && this.field8092 != var6.field10531) {
            this.field8118 = null;
            this.method3435((byte) -46, -1);
        }
        this.method3446(arg0 + 88, this.field8106);
        if (arg2) {
            boolean var7 = arg2 & this.field8132 & class485.field6252.field6952.method665(false) != 0;
            arg2 = var7 & (this.field8125 != var6.field10531 || this.field8109 != null && class485.field6252.field6952.method665(false) >= 2 && (this.field8115 != this.field8095 || (this.field8109.field97 || class449.field5850) && this.field8112 != this.field8095));
        }
        if (arg4 && !arg2) {
            this.field8092 = var6.field10531;
            return null;
        }
        if (arg2) {
            class407.method2371(this.field8099, this.field8098, this.field8106.field2896, this.field8106.field2900, this.field8114);
            this.field8125 = -1;
            this.field8115 = -1;
        }
        class358 var8 = class116.field1542[this.field8098];
        if (arg0 != 7) {
            field8117 = -127;
        }
        class358 var9;
        if (this.field8113) {
            var9 = class383.field4790[0];
        } else {
            var9 = this.field8098 >= 3 ? null : class116.field1542[this.field8098 + 1];
        }
        class299 var10 = null;
        if (this.field8109 != null) {
            if (arg2) {
                arg1 |= 0x40000;
            }
            var10 = var6.method4221(this.field8100 == 11 ? this.field8116 + 4 : this.field8116, this.field8106.field2900, var9, this.field8095, var8, this.field8106.field2896, arg1, (byte) -112, var8.method2072((byte) -44, this.field8106.field2896, this.field8106.field2900), arg3, this.field8100 == 11 ? 10 : this.field8100, this.field8130, this.field8107, this.field8109, this.field8112);
            if (var10 == null) {
                this.field8099 = null;
                this.field8114 = null;
                this.field8120 = 0;
                this.field8097 = 0;
            } else {
                if (arg2) {
                    if (this.field8114 == null) {
                        this.field8114 = new boolean[4];
                    }
                    this.field8099 = var10.method1286(this.field8099);
                    class648.method3502(this.field8099, this.field8098, this.field8106.field2896, this.field8106.field2900, this.field8114);
                    this.field8125 = var6.field10531;
                    this.field8115 = this.field8095;
                }
                this.field8097 = var10.method1260();
                this.field8120 = var10.method1296();
            }
            this.field8118 = null;
        } else if (this.field8118 != null && (arg1 & this.field8118.method1239()) == arg1 && this.field8092 == var6.field10531) {
            var10 = this.field8118;
        } else {
            if (this.field8118 != null) {
                arg1 |= this.field8118.method1239();
            }
            class216 var11 = var6.method4210(arg1, this.field8100 == 11 ? this.field8116 + 4 : this.field8116, var8, arg3, this.field8106.field2900, this.field8100 == 11 ? 10 : this.field8100, var8.method2072((byte) 113, this.field8106.field2896, this.field8106.field2900), this.field8106.field2896, var9, this.field8130, false, arg2);
            if (var11 == null) {
                this.field8114 = null;
                this.field8118 = null;
                this.field8097 = 0;
                this.field8099 = null;
                this.field8120 = 0;
            } else {
                var10 = var11.field2944;
                this.field8118 = var11.field2944;
                if (arg2) {
                    this.field8114 = null;
                    this.field8099 = var11.field2942;
                    class648.method3502(this.field8099, this.field8098, this.field8106.field2896, this.field8106.field2900, null);
                    this.field8125 = var6.field10531;
                    this.field8115 = -1;
                }
                this.field8097 = var10.method1260();
                this.field8120 = var10.method1296();
            }
        }
        this.field8092 = var6.field10531;
        return var10;
    }

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "(Lha;I)V")
    public final void method3441(class570 arg0, int arg1) {
        if (this.field8099 != null) {
            class407.method2371(this.field8099, this.field8098, this.field8106.field2896, this.field8106.field2900, this.field8114);
            this.field8114 = null;
            this.field8099 = null;
        }
        field8131++;
        if (arg1 != 1) {
            this.field8109 = null;
        }
    }

    @OriginalMember(owner = "client!hw", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field8126 != null) {
            this.field8126.method2846();
        }
        field8111++;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(Lmea;B)V")
    public final void method3442(class702 arg0, byte arg1) {
        if (arg1 != -39) {
            method3436((byte) 95);
        }
        this.field8118 = null;
        this.field8130 = arg0;
        field8101++;
    }

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "(I)I")
    public final int method3443(int arg0) {
        if (arg0 != -1) {
            this.field8097 = 45;
        }
        field8124++;
        return this.field8097;
    }

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "(I)Z")
    public final boolean method3444(int arg0) {
        if (arg0 != -2026) {
            this.method3440(108, -125, true, null, true);
        }
        field8096++;
        return this.field8132;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IZILjava/lang/String;Ljava/lang/String;)V")
    public static final void method3445(int arg0, boolean arg1, int arg2, String arg3, String arg4) {
        field8123++;
        class13 var5 = class634.method3387((byte) -117);
        var5.field130.method1491(-129, class117.field1589.field1774);
        var5.field130.method1541(374, 0);
        int var6 = var5.field130.field3133;
        var5.field130.method1541(arg2 + 375, 647);
        int[] var7 = class287.method1744(-74, var5);
        int var8 = var5.field130.field3133;
        var5.field130.method1547(arg3, arg2 ^ 0x1938);
        var5.field130.method1541(374, class517.field6589);
        var5.field130.method1547(arg4, -6457);
        var5.field130.method1517(false, class713.field9400);
        var5.field130.method1491(-129, class496.field6338);
        var5.field130.method1491(arg2 - 128, class201.field2799.field6153);
        class213.method1415(var5.field130, (byte) 58);
        String var9 = class504.field6459;
        var5.field130.method1491(-129, var9 == null ? 0 : 1);
        if (var9 != null) {
            var5.field130.method1547(var9, -6457);
        }
        var5.field130.method1491(-129, arg0);
        var5.field130.method1491(arg2 - 128, arg1 ? 1 : 0);
        var5.field130.field3133 += 7;
        var5.field130.method1537(var8, var7, var5.field130.field3133, arg2 ^ 0x77);
        var5.field130.method1534(var5.field130.field3133 - var6, 127);
        if (arg2 != -1) {
            method3436((byte) -3);
        }
        class116.method679(var5, arg2 + 1);
        class223.field3035 = -3;
        class89.field1229 = 0;
        class497.field6377 = 0;
        class778.field10629 = 1;
        if (arg0 < 13) {
            class336.field4097 = true;
            class110.method646((byte) 34);
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(ILlq;)V")
    private final void method3446(int arg0, class210 arg1) {
        field8094++;
        if (arg0 <= 87) {
            this.field8109 = null;
        }
        label90: while (true) {
            if (this.field8109 == null) {
                if (this.field8108) {
                    return;
                }
                this.method3435((byte) 115, -1);
                if (this.field8109 == null) {
                    return;
                }
            }
            int var3 = class693.field8900 - this.field8122;
            if (var3 > 100 && this.field8109.field111 > 0) {
                int var4 = this.field8109.field109.length - this.field8109.field111;
                while (this.field8095 < var4 && this.field8109.field121[this.field8095] < var3) {
                    var3 -= this.field8109.field121[this.field8095];
                    this.field8095++;
                }
                if (var4 <= this.field8095) {
                    int var5 = 0;
                    for (int var6 = var4; var6 < this.field8109.field109.length; var6++) {
                        var5 += this.field8109.field121[var6];
                    }
                    var3 %= var5;
                }
                this.field8112 = this.field8095 + 1;
                if (this.field8109.field109.length <= this.field8112) {
                    this.field8112 -= this.field8109.field111;
                    if (this.field8112 < 0 || this.field8109.field109.length <= this.field8112) {
                        this.field8112 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (var3 <= this.field8109.field121[this.field8095]) {
                            this.field8107 = var3;
                            this.field8122 = class693.field8900 - var3;
                            return;
                        }
                        class117.method699(this.field8095, this.field8109, false, arg1);
                        var3 -= this.field8109.field121[this.field8095];
                        this.field8095++;
                        if (this.field8095 >= this.field8109.field109.length) {
                            this.field8095 -= this.field8109.field111;
                            if (this.field8095 < 0 || this.field8095 >= this.field8109.field109.length) {
                                this.field8109 = null;
                                continue label90;
                            }
                        }
                        this.field8112 = this.field8095 + 1;
                    } while (this.field8112 < this.field8109.field109.length);
                    this.field8112 -= this.field8109.field111;
                } while (this.field8112 >= 0 && this.field8109.field109.length > this.field8112);
                this.field8112 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "(B)V")
    public static final void method3447(byte arg0) {
        field8102++;
        if (class332.field4052 == 7) {
            class480.method2697((byte) -8, false);
            return;
        }
        class530.field6727 = class252.field3437;
        if (arg0 != 67) {
            field8117 = 46;
        }
        class252.field3437 = null;
        class26.method113((byte) 95, 13);
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(ZI)V")
    public final void method3448(boolean arg0, int arg1) {
        this.field8108 = true;
        if (arg0) {
            this.method3448(false, 106);
        }
        field8127++;
        this.method3435((byte) -56, arg1);
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(CI)Z")
    public static final boolean method3449(char arg0, int arg1) {
        field8093++;
        if (arg1 != -91) {
            field8117 = -42;
        }
        return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(Lha;Lih;IIIILlq;ZI)V")
    public class638(class570 arg0, class773 arg1, int arg2, int arg3, int arg4, int arg5, class210 arg6, boolean arg7, int arg8) {
        this.field8106 = arg6;
        this.field8113 = arg7;
        this.field8121 = arg1.field10531;
        this.field8116 = arg3;
        this.field8104 = (byte) arg4;
        this.field8100 = arg2;
        this.field8098 = (byte) arg5;
        this.field8132 = arg0.method900() && arg1.field10500 && !this.field8113;
        if (arg8 != -1) {
            this.field8108 = true;
        }
        this.method3435((byte) 112, arg8);
    }
}
