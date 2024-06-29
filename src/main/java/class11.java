import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public class class11 {

    @OriginalMember(owner = "client!sw", name = "w", descriptor = "I")
    private int field132 = -1;

    @OriginalMember(owner = "client!sw", name = "x", descriptor = "I")
    private int field133 = 0;

    @OriginalMember(owner = "client!sw", name = "d", descriptor = "I")
    private int field113 = 0;

    @OriginalMember(owner = "client!sw", name = "k", descriptor = "I")
    private int field120 = -1;

    @OriginalMember(owner = "client!sw", name = "F", descriptor = "I")
    private int field141 = -1;

    @OriginalMember(owner = "client!sw", name = "E", descriptor = "Z")
    private boolean field140 = false;

    @OriginalMember(owner = "client!sw", name = "M", descriptor = "Z")
    private boolean field148 = false;

    @OriginalMember(owner = "client!sw", name = "A", descriptor = "I")
    private int field136;

    @OriginalMember(owner = "client!sw", name = "t", descriptor = "I")
    public int field129;

    @OriginalMember(owner = "client!sw", name = "D", descriptor = "I")
    private int field139;

    @OriginalMember(owner = "client!sw", name = "o", descriptor = "I")
    public int field124;

    @OriginalMember(owner = "client!sw", name = "y", descriptor = "B")
    private byte field134;

    @OriginalMember(owner = "client!sw", name = "c", descriptor = "B")
    private byte field112;

    @OriginalMember(owner = "client!sw", name = "v", descriptor = "I")
    public int field131;

    @OriginalMember(owner = "client!sw", name = "K", descriptor = "Z")
    private boolean field146;

    @OriginalMember(owner = "client!sw", name = "J", descriptor = "[Lnn;")
    public static class228[] field145 = new class228[2048];

    @OriginalMember(owner = "client!sw", name = "L", descriptor = "I")
    public static int field147 = 500;

    @OriginalMember(owner = "client!sw", name = "B", descriptor = "Lue;")
    public static class492 field137 = class186.method1231(-121);

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!sw", name = "b", descriptor = "I")
    private int field111;

    @OriginalMember(owner = "client!sw", name = "e", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!sw", name = "g", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!sw", name = "h", descriptor = "I")
    private int field117;

    @OriginalMember(owner = "client!sw", name = "i", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!sw", name = "l", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!sw", name = "p", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!sw", name = "q", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!sw", name = "r", descriptor = "I")
    private int field127;

    @OriginalMember(owner = "client!sw", name = "s", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!sw", name = "u", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!sw", name = "z", descriptor = "I")
    private int field135;

    @OriginalMember(owner = "client!sw", name = "G", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!sw", name = "H", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!sw", name = "I", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!sw", name = "C", descriptor = "Lha;")
    private class117 field138;

    @OriginalMember(owner = "client!sw", name = "n", descriptor = "Lhca;")
    private class186 field123;

    @OriginalMember(owner = "client!sw", name = "j", descriptor = "Lda;")
    private class470 field119;

    @OriginalMember(owner = "client!sw", name = "m", descriptor = "Lii;")
    public class514 field122;

    @OriginalMember(owner = "client!sw", name = "f", descriptor = "[Z")
    private boolean[] field115;

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(I)Z")
    public final boolean method59(int arg0) {
        field125++;
        if (arg0 != 0) {
            this.field127 = -62;
        }
        return this.field146;
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(II)V")
    public final void method60(int arg0, int arg1) {
        this.field140 = true;
        field118++;
        this.method69(arg0, -30628);
        if (arg1 != -12) {
            this.method61(null, (byte) 47);
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(Lr;B)V")
    public final void method61(class562 arg0, byte arg1) {
        if (this.field138 != null) {
            class614.method3395(this.field138, this.field112, this.field136, this.field139, this.field115);
            this.field115 = null;
            this.field138 = null;
        }
        field143++;
        if (arg1 != -93) {
            this.method63(63);
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(Lq;ILda;ILr;ZIII)V")
    public final void method62(class487 arg0, int arg1, class470 arg2, int arg3, class562 arg4, boolean arg5, int arg6, int arg7, int arg8) {
        if (arg3 != -20068) {
            return;
        }
        field121++;
        class140[] var10 = arg2.method652();
        class118[] var11 = arg2.method628();
        if ((this.field122 == null || this.field122.field7146) && (var10 != null || var11 != null)) {
            class600 var12 = class118.field1510.method3921(this.field131, -78);
            if (var12.field8257 != null) {
                var12 = var12.method3324((byte) 113, class564.field7696);
            }
            if (var12 != null) {
                this.field122 = class514.method2909(class327.field4404, true);
            }
        }
        if (this.field122 == null) {
            return;
        }
        arg2.method610(arg0);
        if (arg5) {
            this.field122.method2907(arg4, (long) class327.field4404, var10, var11, false);
        } else {
            this.field122.method2919((long) class327.field4404);
        }
        this.field122.method2906(this.field134, arg7, arg6, arg8, arg1);
    }

    @OriginalMember(owner = "client!sw", name = "b", descriptor = "(I)I")
    public final int method63(int arg0) {
        int var2 = 73 % ((-arg0 - 12) / 48);
        field126++;
        return this.field113;
    }

    @OriginalMember(owner = "client!sw", name = "c", descriptor = "(I)I")
    public final int method64(int arg0) {
        field110++;
        if (arg0 > -11) {
            this.method62(null, -116, null, 39, null, false, -69, 14, 2);
        }
        return this.field133;
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(ILr;)V")
    public final void method65(int arg0, class562 arg1) {
        int var3 = -66 % ((-arg0 - 66) / 37);
        field116++;
        this.method67(true, this.field136, this.field139, true, arg1, 0, 262144);
    }

    @OriginalMember(owner = "client!sw", name = "d", descriptor = "(I)Ljo;")
    public static final class501 method66(int arg0) {
        field142++;
        int var1 = -14 / ((arg0 - 56) / 47);
        class501 var2 = (class501) class375.field4967.method1303(0);
        if (var2 == null) {
            return new class501();
        } else {
            class580.field7931--;
            return var2;
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(ZIIZLr;II)Lda;")
    public final class470 method67(boolean arg0, int arg1, int arg2, boolean arg3, class562 arg4, int arg5, int arg6) {
        field114++;
        class600 var8 = class118.field1510.method3921(this.field131, arg5 ^ 0xFFFFFF97);
        if (var8.field8257 != null) {
            var8 = var8.method3324((byte) 90, class564.field7696);
        }
        if (var8 == null) {
            this.method61(arg4, (byte) -93);
            this.field120 = -1;
            this.field132 = -1;
            this.field141 = -1;
            return null;
        }
        if (!this.field140 && this.field141 != var8.field8345) {
            this.field119 = null;
            this.method69(-1, -30628);
        }
        this.method68(-1, arg2, arg1);
        if (arg3) {
            boolean var9 = arg3 & this.field146 & class602.field8408.method1870((byte) -51, class618.field8566) != 0;
            arg3 = var9 & (this.field132 != var8.field8345 || this.field123 != null && class602.field8408.method1870((byte) -44, class618.field8566) >= 2 && (this.field127 != this.field120 || (this.field123.field2574 || class654.field9307) && this.field135 != this.field127));
        }
        if (arg0 && !arg3) {
            this.field141 = var8.field8345;
            return null;
        } else if (arg5 == 0) {
            if (arg3) {
                class614.method3395(this.field138, this.field112, this.field136, this.field139, this.field115);
                this.field132 = -1;
                this.field120 = -1;
            }
            class270 var10 = class246.field3214[this.field112];
            class270 var11;
            if (this.field148) {
                var11 = class454.field5981[0];
            } else {
                var11 = this.field112 >= 3 ? null : class246.field3214[this.field112 + 1];
            }
            class470 var12 = null;
            if (this.field123 != null) {
                if (arg3) {
                    arg6 |= 0x40000;
                }
                var12 = var8.method3331(this.field124 == 11 ? this.field129 + 4 : this.field129, this.field135, this.field117, this.field127, this.field136, this.field139, var10.method1609(this.field136, this.field139, 69), arg4, arg6, 2, this.field124 == 11 ? 10 : this.field124, var10, this.field123, var11);
                if (var12 == null) {
                    this.field115 = null;
                    this.field133 = 0;
                    this.field138 = null;
                    this.field113 = 0;
                } else {
                    if (arg3) {
                        if (this.field115 == null) {
                            this.field115 = new boolean[4];
                        }
                        this.field138 = var12.method654(this.field138);
                        class201.method1287(this.field138, this.field112, arg1, arg2, this.field115);
                        this.field132 = var8.field8345;
                        this.field120 = this.field127;
                    }
                    this.field133 = var12.method613();
                    this.field113 = var12.method621();
                }
                this.field119 = null;
            } else if (this.field119 != null && (arg6 & this.field119.method604()) == arg6 && this.field141 == var8.field8345) {
                var12 = this.field119;
            } else {
                if (this.field119 != null) {
                    arg6 |= this.field119.method604();
                }
                class606 var13 = var8.method3321(var10.method1609(this.field136, this.field139, arg5 ^ 0x3B), this.field124 == 11 ? this.field129 + 4 : this.field129, arg3, arg4, this.field139, false, this.field136, arg6, this.field124 == 11 ? 10 : this.field124, var11, var10);
                if (var13 == null) {
                    this.field113 = 0;
                    this.field119 = null;
                    this.field115 = null;
                    this.field138 = null;
                    this.field133 = 0;
                } else {
                    var12 = var13.field8448;
                    this.field119 = var13.field8448;
                    if (arg3) {
                        this.field138 = var13.field8446;
                        this.field115 = null;
                        class201.method1287(this.field138, this.field112, arg1, arg2, null);
                        this.field120 = -1;
                        this.field132 = var8.field8345;
                    }
                    this.field133 = var12.method613();
                    this.field113 = var12.method621();
                }
            }
            this.field139 = arg2;
            this.field136 = arg1;
            this.field141 = var8.field8345;
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sw", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field130++;
        if (this.field122 != null) {
            this.field122.method2912();
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(III)V")
    private final void method68(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            this.field136 = -55;
        }
        field128++;
        label92: while (true) {
            if (this.field123 == null) {
                if (this.field140) {
                    return;
                }
                this.method69(-1, -30628);
                if (this.field123 == null) {
                    return;
                }
            }
            int var4 = class327.field4404 - this.field111;
            if (var4 > 100 && this.field123.field2587 > 0) {
                int var5 = this.field123.field2570.length - this.field123.field2587;
                while (var5 > this.field127 && var4 > this.field123.field2595[this.field127]) {
                    var4 -= this.field123.field2595[this.field127];
                    this.field127++;
                }
                if (this.field127 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field123.field2570.length; var7++) {
                        var6 += this.field123.field2595[var7];
                    }
                    var4 %= var6;
                }
                this.field135 = this.field127 + 1;
                if (this.field135 >= this.field123.field2570.length) {
                    this.field135 -= this.field123.field2587;
                    if (this.field135 < 0 || this.field123.field2570.length <= this.field135) {
                        this.field135 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field123.field2595[this.field127] >= var4) {
                            this.field111 = class327.field4404 - var4;
                            this.field117 = var4;
                            return;
                        }
                        class615.method3398(this.field127, arg2, this.field123, -1773, arg1, this.field134, false);
                        var4 -= this.field123.field2595[this.field127];
                        this.field127++;
                        if (this.field123.field2570.length <= this.field127) {
                            this.field127 -= this.field123.field2587;
                            if (this.field127 < 0 || this.field127 >= this.field123.field2570.length) {
                                this.field123 = null;
                                continue label92;
                            }
                        }
                        this.field135 = this.field127 + 1;
                    } while (this.field135 < this.field123.field2570.length);
                    this.field135 -= this.field123.field2587;
                } while (this.field135 >= 0 && this.field135 < this.field123.field2570.length);
                this.field135 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!sw", name = "b", descriptor = "(II)V")
    private final void method69(int arg0, int arg1) {
        field144++;
        if (arg1 != -30628) {
            this.field111 = -123;
        }
        int var3 = arg0;
        boolean var4 = false;
        if (arg0 == -1) {
            class600 var5 = class118.field1510.method3921(this.field131, -91);
            class600 var6 = var5;
            if (var5.field8257 != null) {
                var5 = var5.method3324((byte) 71, class564.field7696);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field8288 != null) {
                if (this.field123 != null && var5.method3333(this.field123.field2576, 0)) {
                    return;
                }
                var3 = var5.method3323(-16500);
                if (this.field141 != var5.field8345) {
                    var4 = var5.field8337;
                }
            } else if (var5.field8313 == -1) {
                if (var6 != null && var6.field8288 != null) {
                    if (this.field123 != null && var6.method3333(this.field123.field2576, 0)) {
                        return;
                    }
                    var3 = var6.method3323(-16500);
                    if (this.field141 != var6.field8345) {
                        var4 = var6.field8337;
                    }
                } else if (var6 != null && var6.field8313 != -1 && this.field141 != var6.field8345) {
                    var4 = var6.field8337;
                    var3 = var6.field8313;
                }
            } else if (this.field141 != var5.field8345) {
                var4 = var5.field8337;
                var3 = var5.field8313;
            }
        }
        if (var3 == -1) {
            this.field123 = null;
            return;
        }
        this.field119 = null;
        if (this.field123 == null || this.field123.field2576 != var3) {
            this.field123 = class423.field5620.method1707(var3, 107);
        } else if (this.field123.field2584 == 0) {
            return;
        }
        if (this.field123.field2570 == null) {
            this.field123 = null;
            return;
        }
        if (var4) {
            this.field127 = (int) ((double) this.field123.field2570.length * Math.random());
            this.field117 = (int) ((double) this.field123.field2595[this.field127] * Math.random()) + 1;
        } else {
            this.field117 = 1;
            this.field127 = 0;
        }
        this.field135 = this.field127 + 1;
        if (this.field135 < 0 || this.field135 >= this.field123.field2570.length) {
            this.field135 = -1;
        }
        this.field111 = class327.field4404 - this.field117;
    }

    @OriginalMember(owner = "client!sw", name = "e", descriptor = "(I)V")
    public static void method70(int arg0) {
        if (arg0 > 27) {
            field137 = null;
            field145 = null;
        }
    }

    @OriginalMember(owner = "client!sw", name = "<init>", descriptor = "(Lr;Ltc;IIIIIIZI)V")
    public class11(class562 arg0, class600 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field136 = arg6;
        this.field129 = arg3;
        this.field139 = arg7;
        this.field124 = arg2;
        this.field134 = (byte) arg4;
        this.field112 = (byte) arg5;
        this.field131 = arg1.field8345;
        this.field148 = arg8;
        this.field146 = arg0.method1084() && arg1.field8305 && !this.field148;
        if (arg9 != -1) {
            this.field140 = true;
        }
        this.method69(arg9, -30628);
    }
}
