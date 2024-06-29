import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class35 extends class18 {

    @OriginalMember(owner = "client!lu", name = "k", descriptor = "I")
    private int field546 = 0;

    @OriginalMember(owner = "client!lu", name = "K", descriptor = "Z")
    public boolean field572 = false;

    @OriginalMember(owner = "client!lu", name = "N", descriptor = "Z")
    private boolean field575 = false;

    @OriginalMember(owner = "client!lu", name = "o", descriptor = "Le;")
    public class525 field550;

    @OriginalMember(owner = "client!lu", name = "A", descriptor = "J")
    private long field562;

    @OriginalMember(owner = "client!lu", name = "E", descriptor = "Lli;")
    public class134 field566;

    @OriginalMember(owner = "client!lu", name = "M", descriptor = "Ljl;")
    public class485 field574;

    @OriginalMember(owner = "client!lu", name = "j", descriptor = "Lbr;")
    public class380 field545;

    @OriginalMember(owner = "client!lu", name = "l", descriptor = "I")
    public static int field547 = 0;

    @OriginalMember(owner = "client!lu", name = "L", descriptor = "I")
    public static int field573 = 0;

    @OriginalMember(owner = "client!lu", name = "F", descriptor = "I")
    public static int field567 = 0;

    @OriginalMember(owner = "client!lu", name = "Q", descriptor = "[I")
    public static int[] field578 = new int[250];

    @OriginalMember(owner = "client!lu", name = "g", descriptor = "I")
    private int field542;

    @OriginalMember(owner = "client!lu", name = "h", descriptor = "I")
    private int field543;

    @OriginalMember(owner = "client!lu", name = "i", descriptor = "I")
    public int field544;

    @OriginalMember(owner = "client!lu", name = "m", descriptor = "I")
    private int field548;

    @OriginalMember(owner = "client!lu", name = "n", descriptor = "I")
    private int field549;

    @OriginalMember(owner = "client!lu", name = "p", descriptor = "I")
    private int field551;

    @OriginalMember(owner = "client!lu", name = "q", descriptor = "I")
    private int field552;

    @OriginalMember(owner = "client!lu", name = "r", descriptor = "I")
    public int field553;

    @OriginalMember(owner = "client!lu", name = "s", descriptor = "I")
    public int field554;

    @OriginalMember(owner = "client!lu", name = "t", descriptor = "I")
    private int field555;

    @OriginalMember(owner = "client!lu", name = "u", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!lu", name = "v", descriptor = "I")
    private int field557;

    @OriginalMember(owner = "client!lu", name = "w", descriptor = "I")
    private int field558;

    @OriginalMember(owner = "client!lu", name = "x", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!lu", name = "y", descriptor = "I")
    private int field560;

    @OriginalMember(owner = "client!lu", name = "z", descriptor = "I")
    private int field561;

    @OriginalMember(owner = "client!lu", name = "B", descriptor = "I")
    public int field563;

    @OriginalMember(owner = "client!lu", name = "C", descriptor = "I")
    private int field564;

    @OriginalMember(owner = "client!lu", name = "D", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!lu", name = "G", descriptor = "I")
    private int field568;

    @OriginalMember(owner = "client!lu", name = "H", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!lu", name = "I", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!lu", name = "J", descriptor = "I")
    private int field571;

    @OriginalMember(owner = "client!lu", name = "O", descriptor = "I")
    private int field576;

    @OriginalMember(owner = "client!lu", name = "P", descriptor = "I")
    private int field577;

    @OriginalMember(owner = "client!lu", name = "f", descriptor = "[[I")
    public static int[][] field541;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(B)V", line = 5)
    public final void method259(byte arg0) {
        this.field564 = this.field550.field7764;
        field559++;
        this.field576 = this.field550.field7754;
        this.field551 = this.field550.field7761;
        this.field568 = this.field550.field7768;
        this.field571 = this.field550.field7766;
        this.field558 = this.field550.field7757;
        this.field548 = this.field550.field7753;
        this.field542 = this.field550.field7755;
        this.field561 = this.field550.field7750;
        if (this.field576 == this.field551 && this.field561 == this.field551 && this.field568 == this.field548 && this.field568 == this.field564 && this.field571 == this.field558 && this.field558 == this.field542) {
            this.field575 = true;
            return;
        }
        this.field575 = false;
        int var2 = (this.field576 + this.field551 + this.field561) / 3;
        int var3 = (this.field568 + this.field564 + this.field548) / 3;
        if (arg0 > -87) {
            this.method259((byte) 122);
        }
        int var4 = (this.field571 + this.field542 + this.field558) / 3;
        if (this.field544 == var2 && this.field553 == var3 && this.field563 == var4) {
            return;
        }
        this.field553 = var3;
        this.field563 = var4;
        this.field544 = var2;
        int var5 = this.field551 - this.field576;
        int var6 = this.field568 - this.field548;
        int var7 = this.field558 - this.field571;
        int var8 = this.field561 - this.field576;
        int var9 = this.field564 - this.field548;
        int var10 = this.field542 - this.field571;
        this.field557 = var7 * var8 - var5 * var10;
        this.field543 = var6 * var10 - (var7 * var9);
        for (this.field549 = var5 * var9 - (var6 * var8); this.field543 > 32767 || this.field557 > 32767 || this.field549 > 32767 || this.field543 < -32767 || this.field557 < -32767 || this.field549 < -32767; this.field549 >>= 0x1) {
            this.field543 >>= 0x1;
            this.field557 >>= 0x1;
        }
        int var11 = (int) Math.sqrt((double) (this.field549 * this.field549 + (this.field543 * this.field543 + (this.field557 * this.field557))));
        if (var11 <= 0) {
            var11 = 1;
        }
        this.field549 = this.field549 * 32767 / var11;
        this.field557 = this.field557 * 32767 / var11;
        this.field543 = this.field543 * 32767 / var11;
        if (this.field574.field7118 <= 0 && this.field574.field7115 <= 0) {
            return;
        }
        int var12 = (int) (Math.atan2((double) this.field549, (double) this.field543) * 2607.5945876176133D);
        int var13 = (int) (Math.atan2((double) this.field557, Math.sqrt((double) (this.field549 * this.field549 + this.field543 * this.field543))) * 2607.5945876176133D);
        this.field560 = this.field574.field7118 - this.field574.field7099;
        this.field577 = var12 + this.field574.field7099 - (this.field560 >> 1);
        this.field552 = this.field574.field7115 - this.field574.field7079;
        this.field555 = var13 - ((this.field552 >> 1) - this.field574.field7079);
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(B)V", line = 114)
    public static void method260(byte arg0) {
        if (arg0 <= 124) {
            method260((byte) 49);
        }
        field578 = null;
        field541 = null;
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(I)V", line = 127)
    public static final void method261(int arg0) {
        if (class469.field6855.toLowerCase().indexOf("microsoft") == -1) {
            class485.field7077[61] = 27;
            class485.field7077[59] = 57;
            class485.field7077[47] = 73;
            class485.field7077[45] = 26;
            class485.field7077[92] = 74;
            class485.field7077[93] = 43;
            class485.field7077[91] = 42;
            if (class469.field6864 == null) {
                class485.field7077[222] = 59;
                class485.field7077[192] = 58;
            } else {
                class485.field7077[520] = 59;
                class485.field7077[222] = 58;
                class485.field7077[192] = 28;
            }
            class485.field7077[46] = 72;
            class485.field7077[44] = 71;
        } else {
            class485.field7077[187] = 27;
            class485.field7077[188] = 71;
            class485.field7077[220] = 74;
            class485.field7077[186] = 57;
            class485.field7077[223] = 28;
            class485.field7077[190] = 72;
            class485.field7077[222] = 59;
            class485.field7077[219] = 42;
            class485.field7077[192] = 58;
            class485.field7077[191] = 73;
            class485.field7077[189] = 26;
            class485.field7077[221] = 43;
        }
        field556++;
        if (arg0 > -105) {
            method260((byte) 72);
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IB)V", line = 179)
    public static final void method262(int arg0, byte arg1) {
        field569++;
        if (!class96.field1399.field5202) {
            arg0 = -1;
        }
        if (class98.field1417 == arg0) {
            return;
        }
        if (arg0 != -1) {
            class334 var2 = class31.field473.method676((byte) 108, arg0);
            class476 var3 = var2.method2147(0);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class419.field6254.method2808(var3.method2843(), 19865, new Point(var2.field5160, var2.field5161), class245.field3430, var3.method2856(), var3.method2842());
                class98.field1417 = arg0;
            }
        }
        if (arg0 == -1 && class98.field1417 != -1) {
            class419.field6254.method2808(null, 19865, new Point(), class245.field3430, -1, -1);
            class98.field1417 = -1;
        }
        if (arg1 <= 7) {
            field547 = -43;
        }
    }

    @OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(Lqa;Le;Lli;J)V", line = 426)
    public class35(class496 arg0, class525 arg1, class134 arg2, long arg3) {
        this.field550 = arg1;
        this.field562 = arg3;
        this.field566 = arg2;
        this.field574 = this.field550.method3110(false);
        if (!arg0.method1070() && this.field574.field7067 != -1) {
            this.field574 = class322.method2089((byte) 108, this.field574.field7067);
        }
        this.field545 = new class380();
        this.field546 = (int) ((double) this.field546 + Math.random() * 64.0D);
        this.method259((byte) -112);
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(JI)V", line = 223)
    public final void method263(long arg0, int arg1) {
        if (arg1 != 189) {
            method262(82, (byte) 112);
        }
        for (class60 var4 = (class60) this.field545.method2358((byte) 83); var4 != null; var4 = (class60) this.field545.method2363(31844)) {
            var4.method401(arg0);
        }
        field565++;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(ZIJLqa;I)V", line = 256)
    public final void method264(boolean arg0, int arg1, long arg2, class496 arg3, int arg4) {
        if (this.field572) {
            arg0 = false;
        } else if (class220.field3090 < this.field574.field7116) {
            arg0 = false;
        } else if (class4.field57 > class479.field6999[class220.field3090]) {
            arg0 = false;
        } else if (this.field575) {
            arg0 = false;
        } else if (this.field574.field7060 != -1) {
            int var7 = (int) (arg2 - this.field562);
            if (this.field574.field7094 || var7 <= this.field574.field7060) {
                var7 %= this.field574.field7060;
            } else {
                arg0 = false;
            }
            if (!this.field574.field7105 && var7 < this.field574.field7085) {
                arg0 = false;
            }
            if (this.field574.field7105 && var7 >= this.field574.field7085) {
                arg0 = false;
            }
        }
        field570++;
        if (arg0) {
            this.field546 += (int) (((double) (this.field574.field7107 - this.field574.field7084) * Math.random() + (double) this.field574.field7084) * (double) arg1);
            if (this.field546 > 63) {
                int var8 = this.field546 >> 6;
                this.field546 &= 0x3F;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10;
                    int var11;
                    int var12;
                    if (this.field574.field7118 <= 0 && this.field574.field7115 <= 0) {
                        var10 = this.field543;
                        var11 = this.field557;
                        var12 = this.field549;
                    } else {
                        int var13 = (int) (Math.random() * (double) this.field560) + this.field577;
                        int var14 = var13 & 0x3FFF;
                        int var15 = class525.field7760[var14];
                        int var16 = class525.field7763[var14];
                        int var17 = this.field555 + ((int) ((double) this.field552 * Math.random()));
                        int var18 = var17 & 0x1FFF;
                        int var19 = class525.field7760[var18];
                        int var20 = class525.field7763[var18];
                        byte var21 = 15;
                        var11 = (var20 << 0) * -1;
                        var10 = var16 * var19 >> var21;
                        var12 = var15 * var19 >> var21;
                    }
                    int var22 = (int) (Math.random() * 65535.0D);
                    int var23 = (int) (Math.random() * 65535.0D);
                    if ((var22 + var23) > 65535) {
                        var23 = 65535 - var23;
                        var22 = 65535 - var22;
                    }
                    int var24 = 65535 - (var22 + var23);
                    int var25 = this.field561 * var24 + this.field576 * var22 + this.field551 * var23 >> 16;
                    int var26 = this.field564 * var24 + this.field548 * var22 + (this.field568 * var23) >> 16;
                    int var27 = this.field571 * var22 - (-(this.field558 * var23) - this.field542 * var24) >> 16;
                    int var28 = this.field574.field7052 + (int) ((double) (this.field574.field7110 - this.field574.field7052) * Math.random());
                    int var29 = (int) ((double) (this.field574.field7126 - this.field574.field7125) * Math.random()) + this.field574.field7125;
                    int var30 = this.field574.field7074 + ((int) (Math.random() * (double) (this.field574.field7057 - this.field574.field7074)));
                    int var33;
                    if (this.field574.field7127) {
                        double var31 = Math.random();
                        var33 = (int) ((double) this.field574.field7068 * var31 + (double) this.field574.field7096) << 16 | (int) ((double) this.field574.field7089 * var31 + (double) this.field574.field7064) << 8 | (int) ((double) this.field574.field7054 * var31 + (double) this.field574.field7075) | (int) ((double) this.field574.field7091 * Math.random() + (double) this.field574.field7103) << 24;
                    } else {
                        var33 = (int) ((double) this.field574.field7054 * Math.random() + (double) this.field574.field7075) | (int) ((double) this.field574.field7064 + (double) this.field574.field7089 * Math.random()) << 8 | (int) (Math.random() * (double) this.field574.field7068 + (double) this.field574.field7096) << 16 | (int) ((double) this.field574.field7103 + Math.random() * (double) this.field574.field7091) << 24;
                    }
                    int var34 = this.field574.field7102;
                    if (!arg3.method1070() && !this.field574.field7109) {
                        var34 = -1;
                    }
                    if (class331.field5126 == class169.field2458) {
                        new class60(this, var25, var26, var27, var10, var11, var12, var28, var29, var33, var30, var34, this.field574.field7083, this.field574.field7112);
                    } else {
                        class60 var36 = class433.field6419[class169.field2458];
                        class169.field2458 = class169.field2458 + 1 & 0x3FF;
                        var36.method400(this, var25, var26, var27, var10, var11, var12, var28, var29, var33, var30, var34, this.field574.field7083, this.field574.field7112);
                    }
                }
            }
        }
        this.field554 = 0;
        class60 var37 = (class60) this.field545.method2358((byte) 103);
        int var38 = 48 % ((arg4 + 50) / 43);
        while (var37 != null) {
            var37.method402(arg2, arg1);
            this.field554++;
            var37 = (class60) this.field545.method2363(31844);
        }
        class339.field5364 += this.field554;
    }
}
