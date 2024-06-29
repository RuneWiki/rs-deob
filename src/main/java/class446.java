import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class446 extends class511 {

    @OriginalMember(owner = "client!hs", name = "s", descriptor = "Laa;")
    public static class76 field6576 = new class76(44, 3);

    @OriginalMember(owner = "client!hs", name = "D", descriptor = "I")
    public static int field6587 = -1;

    @OriginalMember(owner = "client!hs", name = "J", descriptor = "[F")
    public static float[] field6593 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!hs", name = "h", descriptor = "F")
    public float field6565;

    @OriginalMember(owner = "client!hs", name = "i", descriptor = "F")
    public float field6566;

    @OriginalMember(owner = "client!hs", name = "j", descriptor = "F")
    public float field6567;

    @OriginalMember(owner = "client!hs", name = "k", descriptor = "F")
    public float field6568;

    @OriginalMember(owner = "client!hs", name = "q", descriptor = "F")
    public float field6574;

    @OriginalMember(owner = "client!hs", name = "t", descriptor = "F")
    public float field6577;

    @OriginalMember(owner = "client!hs", name = "x", descriptor = "F")
    public float field6581;

    @OriginalMember(owner = "client!hs", name = "C", descriptor = "F")
    public float field6586;

    @OriginalMember(owner = "client!hs", name = "F", descriptor = "F")
    public float field6589;

    @OriginalMember(owner = "client!hs", name = "G", descriptor = "F")
    public float field6590;

    @OriginalMember(owner = "client!hs", name = "N", descriptor = "F")
    public float field6597;

    @OriginalMember(owner = "client!hs", name = "O", descriptor = "F")
    public float field6598;

    @OriginalMember(owner = "client!hs", name = "g", descriptor = "I")
    public static int field6564;

    @OriginalMember(owner = "client!hs", name = "l", descriptor = "I")
    public static int field6569;

    @OriginalMember(owner = "client!hs", name = "m", descriptor = "I")
    public static int field6570;

    @OriginalMember(owner = "client!hs", name = "n", descriptor = "I")
    public static int field6571;

    @OriginalMember(owner = "client!hs", name = "o", descriptor = "I")
    public static int field6572;

    @OriginalMember(owner = "client!hs", name = "p", descriptor = "I")
    public static int field6573;

    @OriginalMember(owner = "client!hs", name = "r", descriptor = "I")
    public static int field6575;

    @OriginalMember(owner = "client!hs", name = "v", descriptor = "I")
    public static int field6579;

    @OriginalMember(owner = "client!hs", name = "w", descriptor = "I")
    public static int field6580;

    @OriginalMember(owner = "client!hs", name = "y", descriptor = "I")
    public static int field6582;

    @OriginalMember(owner = "client!hs", name = "z", descriptor = "I")
    public static int field6583;

    @OriginalMember(owner = "client!hs", name = "A", descriptor = "I")
    public static int field6584;

    @OriginalMember(owner = "client!hs", name = "B", descriptor = "I")
    public static int field6585;

    @OriginalMember(owner = "client!hs", name = "E", descriptor = "I")
    public static int field6588;

    @OriginalMember(owner = "client!hs", name = "H", descriptor = "I")
    public static int field6591;

    @OriginalMember(owner = "client!hs", name = "I", descriptor = "I")
    public static int field6592;

    @OriginalMember(owner = "client!hs", name = "K", descriptor = "I")
    public static int field6594;

    @OriginalMember(owner = "client!hs", name = "L", descriptor = "I")
    public static int field6595;

    @OriginalMember(owner = "client!hs", name = "M", descriptor = "I")
    public static int field6596;

    @OriginalMember(owner = "client!hs", name = "P", descriptor = "I")
    public static int field6599;

    @OriginalMember(owner = "client!hs", name = "u", descriptor = "Lok;")
    public static class74 field6578;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "()Lc;")
    public final class511 method1301() {
        field6572++;
        class446 var1 = new class446();
        var1.field6577 = this.field6577;
        var1.field6598 = this.field6598;
        var1.field6574 = this.field6574;
        var1.field6568 = this.field6568;
        var1.field6567 = this.field6567;
        var1.field6581 = this.field6581;
        var1.field6566 = this.field6566;
        var1.field6590 = this.field6590;
        var1.field6586 = this.field6586;
        var1.field6565 = this.field6565;
        var1.field6589 = this.field6589;
        var1.field6597 = this.field6597;
        return var1;
    }

    @OriginalMember(owner = "client!hs", name = "p", descriptor = "(III[I)V")
    public final void method1306(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field6568 + (float) arg0 * this.field6590 + (float) arg1 * this.field6586);
        arg3[0] = (int) ((float) arg2 * this.field6597 + (float) arg0 * this.field6598 + (float) arg1 * this.field6577);
        field6570++;
        arg3[1] = (int) ((float) arg2 * this.field6581 + (float) arg0 * this.field6567 + (float) arg1 * this.field6565);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lfe;Lfe;ZIZ)I")
    public static final int method2613(class152 arg0, class152 arg1, boolean arg2, int arg3, boolean arg4) {
        field6588++;
        if (arg4) {
            return -105;
        } else if (arg3 == 1) {
            int var5 = arg1.field7480;
            int var6 = arg0.field7480;
            if (!arg2) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg3 == 2) {
            return class196.method1294(arg0.method1098(102).field6450, true, class30.field430, arg1.method1098(-107).field6450);
        } else if (arg3 == 3) {
            if (arg1.field2307.equals("-")) {
                if (arg0.field2307.equals("-")) {
                    return 0;
                } else if (arg2) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg0.field2307.equals("-")) {
                return arg2 ? 1 : -1;
            } else {
                return class196.method1294(arg0.field2307, true, class30.field430, arg1.field2307);
            }
        } else if (arg3 == 4) {
            if (arg1.method3002(27)) {
                return arg0.method3002(27) ? 0 : 1;
            } else if (arg0.method3002(27)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 == 5) {
            if (arg1.method3007((byte) 100)) {
                return arg0.method3007((byte) 110) ? 0 : 1;
            } else if (arg0.method3007((byte) 102)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 == 6) {
            if (arg1.method3009(true)) {
                return arg0.method3009(true) ? 0 : 1;
            } else if (arg0.method3009(!arg4)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 == 7) {
            if (arg1.method3004(382)) {
                return arg0.method3004(382) ? 0 : 1;
            } else if (arg0.method3004(382)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 == 8) {
            int var7 = arg1.field2314;
            int var8 = arg0.field2314;
            if (arg2) {
                if (var7 == 1000) {
                    var7 = -1;
                }
                if (var8 == 1000) {
                    var8 = -1;
                }
            } else {
                if (var7 == -1) {
                    var7 = 1000;
                }
                if (var8 == -1) {
                    var8 = 1000;
                }
            }
            return var7 - var8;
        } else {
            return arg1.field2311 - arg0.field2311;
        }
    }

    @OriginalMember(owner = "client!hs", name = "xa", descriptor = "()V")
    public final void method1311() {
        field6596++;
        this.field6598 = this.field6565 = this.field6568 = 1.0F;
        this.field6567 = this.field6590 = this.field6577 = this.field6586 = this.field6597 = this.field6581 = this.field6574 = this.field6589 = this.field6566 = 0.0F;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(III[I)V")
    public final void method1308(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (int) ((float) arg2 * this.field6597 + (float) arg0 * this.field6598 + (float) arg1 * this.field6577 + this.field6574);
        field6584++;
        arg3[1] = (int) ((float) arg2 * this.field6581 + (float) arg0 * this.field6567 + (float) arg1 * this.field6565 + this.field6589);
        arg3[2] = (int) ((float) arg2 * this.field6568 + (float) arg0 * this.field6590 + (float) arg1 * this.field6586 + this.field6566);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(FIIIFFI)V")
    public final void method2614(float arg0, int arg1, int arg2, int arg3, float arg4, float arg5, int arg6) {
        if (arg6 == 0) {
            this.field6568 = 1.0F;
            this.field6565 = arg2;
            this.field6598 = arg1;
            this.field6567 = this.field6590 = this.field6577 = this.field6586 = this.field6597 = this.field6581 = 0.0F;
        } else {
            float var8 = class280.field4224[arg6 & 0x3FFF];
            float var9 = class280.field4228[arg6 & 0x3FFF];
            this.field6568 = 1.0F;
            this.field6577 = (float) arg2 * -var9;
            this.field6598 = (float) arg1 * var8;
            this.field6565 = (float) arg2 * var8;
            this.field6590 = this.field6586 = this.field6597 = this.field6581 = 0.0F;
            this.field6567 = (float) arg1 * var9;
        }
        if (arg3 != -1) {
            this.field6590 = -0.33229753F;
        }
        field6594++;
        this.field6574 = arg4;
        this.field6566 = arg5;
        this.field6589 = arg0;
    }

    @OriginalMember(owner = "client!hs", name = "N", descriptor = "(I)V")
    public final void method1302(int arg0) {
        field6564++;
        this.field6598 = 1.0F;
        this.field6565 = this.field6568 = class280.field4224[arg0 & 0x3FFF];
        this.field6586 = class280.field4228[arg0 & 0x3FFF];
        this.field6581 = -this.field6586;
        this.field6577 = this.field6597 = this.field6574 = this.field6567 = this.field6589 = this.field6590 = this.field6566 = 0.0F;
    }

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "(I)[F")
    public final float[] method2615(int arg0) {
        class231.field3251[14] = 0.0F;
        class231.field3251[10] = this.field6568;
        class231.field3251[8] = this.field6597;
        class231.field3251[6] = this.field6586;
        class231.field3251[13] = 0.0F;
        class231.field3251[12] = 0.0F;
        class231.field3251[2] = this.field6590;
        class231.field3251[1] = this.field6567;
        class231.field3251[4] = this.field6577;
        class231.field3251[9] = this.field6581;
        class231.field3251[0] = this.field6598;
        class231.field3251[5] = this.field6565;
        if (arg0 == 31685) {
            field6583++;
            return class231.field3251;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILc;)V")
    public final void method2616(int arg0, class511 arg1) {
        if (arg0 != 0) {
            this.method1303(64);
        }
        field6599++;
        class446 var3 = (class446) arg1;
        this.field6597 = var3.field6590;
        this.field6598 = var3.field6598;
        this.field6577 = var3.field6567;
        this.field6565 = var3.field6565;
        this.field6590 = var3.field6597;
        this.field6581 = var3.field6586;
        this.field6567 = var3.field6577;
        this.field6574 = -(this.field6597 * var3.field6566 + this.field6598 * var3.field6574 + this.field6577 * var3.field6589);
        this.field6568 = var3.field6568;
        this.field6586 = var3.field6581;
        this.field6589 = -(this.field6581 * var3.field6566 + this.field6567 * var3.field6574 + this.field6565 * var3.field6589);
        this.field6566 = -(this.field6568 * var3.field6566 + this.field6590 * var3.field6574 + this.field6586 * var3.field6589);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIFF[FIIIIII)V")
    public static final void method2617(int arg0, int arg1, float arg2, float arg3, float[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg0 - arg5;
        field6595++;
        int var12 = arg10 - arg7;
        int var13 = arg8 - arg9;
        float var14 = arg4[2] * (float) var11 + arg4[arg6] * (float) var12 + arg4[1] * (float) var13;
        float var15 = arg4[5] * (float) var11 + arg4[4] * (float) var13 + arg4[3] * (float) var12;
        float var16 = arg4[8] * (float) var11 + arg4[7] * (float) var13 + arg4[6] * (float) var12;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg3 != 1.0F) {
            var17 = arg3 * var17;
        }
        float var18 = var15 + arg2 + 0.5F;
        if (arg1 == 1) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (arg1 == 2) {
            var17 = -var17;
            var18 = -var18;
        } else if (arg1 == 3) {
            float var20 = var17;
            var17 = var18;
            var18 = -var20;
        }
        class115.field1734 = var17;
        class358.field5476 = var18;
    }

    @OriginalMember(owner = "client!hs", name = "ja", descriptor = "(I)V")
    public final void method1299(int arg0) {
        field6569++;
        float var2 = class280.field4224[arg0 & 0x3FFF];
        float var3 = class280.field4228[arg0 & 0x3FFF];
        float var4 = this.field6598;
        float var5 = this.field6577;
        float var6 = this.field6597;
        float var7 = this.field6574;
        this.field6598 = this.field6590 * var3 + var2 * var4;
        this.field6590 = this.field6590 * var2 - (var3 * var4);
        this.field6577 = this.field6586 * var3 + var2 * var5;
        this.field6597 = this.field6568 * var3 + var2 * var6;
        this.field6586 = this.field6586 * var2 - var3 * var5;
        this.field6568 = this.field6568 * var2 - var3 * var6;
        this.field6574 = this.field6566 * var3 + var2 * var7;
        this.field6566 = this.field6566 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(B)V")
    public static void method2618(byte arg0) {
        field6593 = null;
        if (arg0 != 32) {
            field6593 = null;
        }
        field6576 = null;
        field6578 = null;
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(B)[F")
    public final float[] method2619(byte arg0) {
        class231.field3251[10] = this.field6568;
        class231.field3251[12] = this.field6574;
        class231.field3251[1] = this.field6567;
        class231.field3251[13] = this.field6589;
        class231.field3251[14] = this.field6566;
        class231.field3251[6] = this.field6586;
        field6575++;
        if (arg0 != 107) {
            this.field6590 = -0.79547083F;
        }
        class231.field3251[8] = this.field6597;
        class231.field3251[0] = this.field6598;
        class231.field3251[9] = this.field6581;
        class231.field3251[5] = this.field6565;
        class231.field3251[4] = this.field6577;
        class231.field3251[2] = this.field6590;
        return class231.field3251;
    }

    @OriginalMember(owner = "client!hs", name = "m", descriptor = "([I)V")
    public final void method1297(int[] arg0) {
        field6571++;
        float var2 = (float) arg0[0] - this.field6574;
        float var3 = (float) arg0[1] - this.field6589;
        float var4 = (float) arg0[2] - this.field6566;
        arg0[0] = (int) (this.field6590 * var4 + this.field6598 * var2 + this.field6567 * var3);
        arg0[1] = (int) (this.field6586 * var4 + this.field6577 * var2 + this.field6565 * var3);
        arg0[2] = (int) (this.field6568 * var4 + this.field6597 * var2 + this.field6581 * var3);
    }

    @OriginalMember(owner = "client!hs", name = "ra", descriptor = "(I)V")
    public final void method1298(int arg0) {
        this.field6565 = 1.0F;
        field6582++;
        this.field6598 = this.field6568 = class280.field4224[arg0 & 0x3FFF];
        this.field6597 = class280.field4228[arg0 & 0x3FFF];
        this.field6577 = this.field6574 = this.field6567 = this.field6581 = this.field6589 = this.field6586 = this.field6566 = 0.0F;
        this.field6590 = -this.field6597;
    }

    @OriginalMember(owner = "client!hs", name = "j", descriptor = "(III)V")
    public final void method1307(int arg0, int arg1, int arg2) {
        this.field6574 = arg0;
        this.field6566 = arg2;
        field6591++;
        this.field6598 = this.field6565 = this.field6568 = 1.0F;
        this.field6567 = this.field6590 = this.field6577 = this.field6586 = this.field6597 = this.field6581 = 0.0F;
        this.field6589 = arg1;
    }

    @OriginalMember(owner = "client!hs", name = "s", descriptor = "(IIIIII)V")
    public final void method1300(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6580++;
        float var7 = class280.field4224[arg3 & 0x3FFF];
        float var8 = class280.field4228[arg3 & 0x3FFF];
        float var9 = class280.field4224[arg4 & 0x3FFF];
        float var10 = class280.field4228[arg4 & 0x3FFF];
        float var11 = class280.field4224[arg5 & 0x3FFF];
        float var12 = class280.field4228[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field6590 = var7 * var10;
        this.field6598 = var9 * var11 + var10 * var14;
        this.field6565 = var7 * var11;
        this.field6597 = -var10 * var11 + var9 * var14;
        this.field6586 = -var8;
        this.field6581 = var9 * var13 + var10 * var12;
        this.field6567 = -var9 * var12 + var10 * var13;
        this.field6577 = var7 * var12;
        this.field6568 = var7 * var9;
        this.field6574 = (float) (-arg0) * this.field6598 - (float) arg1 * this.field6577 - (float) arg2 * this.field6597;
        this.field6589 = (float) (-arg0) * this.field6567 - ((float) arg1 * this.field6565) - (float) arg2 * this.field6581;
        this.field6566 = (float) (-arg0) * this.field6590 - ((float) arg1 * this.field6586) - (float) arg2 * this.field6568;
    }

    @OriginalMember(owner = "client!hs", name = "ka", descriptor = "(I)V")
    public final void method1303(int arg0) {
        field6579++;
        float var2 = class280.field4224[arg0 & 0x3FFF];
        float var3 = class280.field4228[arg0 & 0x3FFF];
        float var4 = this.field6567;
        float var5 = this.field6565;
        float var6 = this.field6581;
        float var7 = this.field6589;
        this.field6567 = var2 * var4 - (this.field6590 * var3);
        this.field6590 = this.field6590 * var2 + var3 * var4;
        this.field6565 = var2 * var5 - (this.field6586 * var3);
        this.field6586 = this.field6586 * var2 + var3 * var5;
        this.field6581 = var2 * var6 - this.field6568 * var3;
        this.field6589 = var2 * var7 - (this.field6566 * var3);
        this.field6568 = this.field6568 * var2 + var3 * var6;
        this.field6566 = this.field6566 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!hs", name = "za", descriptor = "(Lc;)V")
    public final void method1304(class511 arg0) {
        field6573++;
        class446 var2 = (class446) arg0;
        this.field6577 = var2.field6577;
        this.field6565 = var2.field6565;
        this.field6567 = var2.field6567;
        this.field6581 = var2.field6581;
        this.field6590 = var2.field6590;
        this.field6597 = var2.field6597;
        this.field6566 = var2.field6566;
        this.field6589 = var2.field6589;
        this.field6574 = var2.field6574;
        this.field6586 = var2.field6586;
        this.field6598 = var2.field6598;
        this.field6568 = var2.field6568;
    }

    @OriginalMember(owner = "client!hs", name = "O", descriptor = "(I)V")
    public final void method1305(int arg0) {
        field6585++;
        this.field6568 = 1.0F;
        this.field6598 = this.field6565 = class280.field4224[arg0 & 0x3FFF];
        this.field6567 = class280.field4228[arg0 & 0x3FFF];
        this.field6577 = -this.field6567;
        this.field6597 = this.field6574 = this.field6581 = this.field6589 = this.field6590 = this.field6586 = this.field6566 = 0.0F;
    }

    @OriginalMember(owner = "client!hs", name = "o", descriptor = "(III)V")
    public final void method1309(int arg0, int arg1, int arg2) {
        this.field6574 += arg0;
        field6592++;
        this.field6566 += arg2;
        this.field6589 += arg1;
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "()V")
    public class446() {
        this.method1311();
    }
}
