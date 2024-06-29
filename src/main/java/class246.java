import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class246 extends class414 {

    @OriginalMember(owner = "client!mn", name = "D", descriptor = "I")
    public static int field3550 = -1;

    @OriginalMember(owner = "client!mn", name = "i", descriptor = "F")
    public float field3529;

    @OriginalMember(owner = "client!mn", name = "j", descriptor = "F")
    public float field3530;

    @OriginalMember(owner = "client!mn", name = "m", descriptor = "F")
    public float field3533;

    @OriginalMember(owner = "client!mn", name = "p", descriptor = "F")
    public float field3536;

    @OriginalMember(owner = "client!mn", name = "w", descriptor = "F")
    public float field3543;

    @OriginalMember(owner = "client!mn", name = "x", descriptor = "F")
    public float field3544;

    @OriginalMember(owner = "client!mn", name = "E", descriptor = "F")
    public float field3551;

    @OriginalMember(owner = "client!mn", name = "H", descriptor = "F")
    public float field3554;

    @OriginalMember(owner = "client!mn", name = "I", descriptor = "F")
    public float field3555;

    @OriginalMember(owner = "client!mn", name = "K", descriptor = "F")
    public float field3557;

    @OriginalMember(owner = "client!mn", name = "M", descriptor = "F")
    public float field3559;

    @OriginalMember(owner = "client!mn", name = "O", descriptor = "F")
    public float field3561;

    @OriginalMember(owner = "client!mn", name = "k", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!mn", name = "l", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!mn", name = "n", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!mn", name = "o", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!mn", name = "r", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!mn", name = "s", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!mn", name = "t", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!mn", name = "u", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!mn", name = "v", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!mn", name = "y", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!mn", name = "z", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!mn", name = "A", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!mn", name = "B", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!mn", name = "C", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!mn", name = "F", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!mn", name = "G", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!mn", name = "J", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!mn", name = "L", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!mn", name = "N", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!mn", name = "q", descriptor = "[[S")
    public static short[][] field3537;

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "(I)V", line = 4)
    public final void method865(int arg0) {
        field3552++;
        float var2 = class404.field6064[arg0 & 0x3FFF];
        float var3 = class404.field6061[arg0 & 0x3FFF];
        float var4 = this.field3555;
        float var5 = this.field3551;
        float var6 = this.field3530;
        float var7 = this.field3554;
        this.field3555 = this.field3559 * var3 + var2 * var4;
        this.field3551 = this.field3561 * var3 + var2 * var5;
        this.field3559 = this.field3559 * var2 - var3 * var4;
        this.field3561 = this.field3561 * var2 - var3 * var5;
        this.field3530 = this.field3543 * var3 + var2 * var6;
        this.field3543 = this.field3543 * var2 - var3 * var6;
        this.field3554 = this.field3529 * var3 + var2 * var7;
        this.field3529 = this.field3529 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)[F", line = 31)
    public final float[] method1596(int arg0) {
        field3545++;
        class329.field4961[9] = this.field3544;
        class329.field4961[10] = this.field3543;
        class329.field4961[1] = this.field3533;
        class329.field4961[12] = 0.0F;
        class329.field4961[2] = this.field3559;
        class329.field4961[4] = this.field3551;
        class329.field4961[5] = this.field3536;
        class329.field4961[0] = this.field3555;
        class329.field4961[8] = this.field3530;
        class329.field4961[13] = 0.0F;
        class329.field4961[14] = 0.0F;
        class329.field4961[6] = this.field3561;
        int var2 = 77 / ((arg0 + 58) / 42);
        return class329.field4961;
    }

    @OriginalMember(owner = "client!mn", name = "Q", descriptor = "(IIIIII)V", line = 60)
    public final void method873(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3558++;
        float var7 = class404.field6064[arg3 & 0x3FFF];
        float var8 = class404.field6061[arg3 & 0x3FFF];
        float var9 = class404.field6064[arg4 & 0x3FFF];
        float var10 = class404.field6061[arg4 & 0x3FFF];
        float var11 = class404.field6064[arg5 & 0x3FFF];
        float var12 = class404.field6061[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field3561 = -var8;
        this.field3555 = var9 * var11 + var10 * var14;
        this.field3533 = -var9 * var12 + var10 * var13;
        this.field3536 = var7 * var11;
        this.field3543 = var7 * var9;
        this.field3551 = var7 * var12;
        this.field3530 = -var10 * var11 + var9 * var14;
        this.field3544 = var9 * var13 + var10 * var12;
        this.field3559 = var7 * var10;
        this.field3529 = (float) (-arg0) * this.field3559 - ((float) arg1 * this.field3561) - (float) arg2 * this.field3543;
        this.field3557 = (float) (-arg0) * this.field3533 - ((float) arg1 * this.field3536) - (float) arg2 * this.field3544;
        this.field3554 = (float) (-arg0) * this.field3555 - (float) arg1 * this.field3551 - (float) arg2 * this.field3530;
    }

    @OriginalMember(owner = "client!mn", name = "O", descriptor = "(I)V", line = 97)
    public final void method864(int arg0) {
        this.field3536 = 1.0F;
        field3541++;
        this.field3555 = this.field3543 = class404.field6064[arg0 & 0x3FFF];
        this.field3530 = class404.field6061[arg0 & 0x3FFF];
        this.field3559 = -this.field3530;
        this.field3551 = this.field3554 = this.field3533 = this.field3544 = this.field3557 = this.field3561 = this.field3529 = 0.0F;
    }

    @OriginalMember(owner = "client!mn", name = "HA", descriptor = "()V", line = 112)
    public final void method872() {
        this.field3533 = this.field3559 = this.field3551 = this.field3561 = this.field3530 = this.field3544 = this.field3554 = this.field3557 = this.field3529 = 0.0F;
        field3535++;
        this.field3555 = this.field3536 = this.field3543 = 1.0F;
    }

    @OriginalMember(owner = "client!mn", name = "ZA", descriptor = "(III)V", line = 121)
    public final void method876(int arg0, int arg1, int arg2) {
        this.field3557 += arg1;
        this.field3529 += arg2;
        field3553++;
        this.field3554 += arg0;
    }

    @OriginalMember(owner = "client!mn", name = "YA", descriptor = "(I)V", line = 132)
    public final void method874(int arg0) {
        field3539++;
        this.field3555 = 1.0F;
        this.field3536 = this.field3543 = class404.field6064[arg0 & 0x3FFF];
        this.field3561 = class404.field6061[arg0 & 0x3FFF];
        this.field3544 = -this.field3561;
        this.field3551 = this.field3530 = this.field3554 = this.field3533 = this.field3557 = this.field3559 = this.field3529 = 0.0F;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "()Lia;", line = 146)
    public final class414 method871() {
        field3547++;
        class246 var1 = new class246();
        var1.field3551 = this.field3551;
        var1.field3554 = this.field3554;
        var1.field3555 = this.field3555;
        var1.field3559 = this.field3559;
        var1.field3543 = this.field3543;
        var1.field3530 = this.field3530;
        var1.field3544 = this.field3544;
        var1.field3536 = this.field3536;
        var1.field3533 = this.field3533;
        var1.field3557 = this.field3557;
        var1.field3561 = this.field3561;
        var1.field3529 = this.field3529;
        return var1;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lia;B)V", line = 175)
    public final void method1597(class414 arg0, byte arg1) {
        field3542++;
        class246 var3 = (class246) arg0;
        this.field3551 = var3.field3533;
        if (arg1 != 40) {
            return;
        }
        this.field3530 = var3.field3559;
        this.field3555 = var3.field3555;
        this.field3544 = var3.field3561;
        this.field3536 = var3.field3536;
        this.field3559 = var3.field3530;
        this.field3533 = var3.field3551;
        this.field3561 = var3.field3544;
        this.field3543 = var3.field3543;
        this.field3554 = -(this.field3530 * var3.field3529 + this.field3555 * var3.field3554 + this.field3551 * var3.field3557);
        this.field3557 = -(this.field3544 * var3.field3529 + this.field3536 * var3.field3557 + this.field3533 * var3.field3554);
        this.field3529 = -(this.field3543 * var3.field3529 + this.field3561 * var3.field3557 + this.field3559 * var3.field3554);
    }

    @OriginalMember(owner = "client!mn", name = "na", descriptor = "(I)V", line = 199)
    public final void method867(int arg0) {
        field3532++;
        float var2 = class404.field6064[arg0 & 0x3FFF];
        float var3 = class404.field6061[arg0 & 0x3FFF];
        float var4 = this.field3533;
        float var5 = this.field3536;
        float var6 = this.field3544;
        this.field3533 = var2 * var4 - (this.field3559 * var3);
        float var7 = this.field3557;
        this.field3536 = var2 * var5 - this.field3561 * var3;
        this.field3559 = this.field3559 * var2 + var3 * var4;
        this.field3561 = this.field3561 * var2 + var3 * var5;
        this.field3544 = var2 * var6 - this.field3543 * var3;
        this.field3543 = this.field3543 * var2 + var3 * var6;
        this.field3557 = var2 * var7 - this.field3529 * var3;
        this.field3529 = this.field3529 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(B)V", line = 226)
    public static final void method1598(byte arg0) {
        field3549++;
        class302.method1902((byte) 104, class475.field7100);
        class303.field4329++;
        if (class174.field2673 && class449.field6730) {
            if (arg0 >= -89) {
                method1600((byte) -96);
            }
            int var1 = class166.field2579.method1024(true);
            int var2 = class166.field2579.method1019((byte) 3);
            int var3 = var2 - class438.field6545;
            int var4 = var1 - class77.field1288;
            if (class481.field7163 > var4) {
                var4 = class481.field7163;
            }
            if (class475.field7100.field5329 + var4 > class481.field7163 + class78.field1310.field5329) {
                var4 = class78.field1310.field5329 + class481.field7163 - class475.field7100.field5329;
            }
            if (var3 < class280.field4017) {
                var3 = class280.field4017;
            }
            if (var3 + class475.field7100.field5269 > class280.field4017 + class78.field1310.field5269) {
                var3 = class280.field4017 + class78.field1310.field5269 - class475.field7100.field5269;
            }
            int var5 = var4 + class78.field1310.field5265 - class481.field7163;
            int var6 = class78.field1310.field5226 + var3 - class280.field4017;
            if (class166.field2579.method1023(62)) {
                if (class303.field4329 > class475.field7100.field5254) {
                    int var8 = var4 - class45.field839;
                    int var9 = var3 - class196.field2889;
                    if (class475.field7100.field5332 < var8 || (-class475.field7100.field5332) > var8 || class475.field7100.field5332 < var9 || var9 < (-class475.field7100.field5332)) {
                        class95.field1608 = true;
                    }
                }
                if (class475.field7100.field5375 != null && class95.field1608) {
                    class207 var10 = new class207();
                    var10.field2988 = var6;
                    var10.field2995 = class475.field7100;
                    var10.field2996 = class475.field7100.field5375;
                    var10.field2994 = var5;
                    class437.method2614(var10);
                }
            } else {
                if (class95.field1608) {
                    class227.method1486(0);
                    if (class475.field7100.field5216 != null) {
                        class207 var7 = new class207();
                        var7.field2995 = class475.field7100;
                        var7.field2998 = class504.field7446;
                        var7.field2996 = class475.field7100.field5216;
                        var7.field2994 = var5;
                        var7.field2988 = var6;
                        class437.method2614(var7);
                    }
                    if (class504.field7446 != null && client.method1350(class475.field7100) != null) {
                        class42.method420(class504.field7446, class475.field7100, 128);
                    }
                } else if ((class300.field4272 == 1 || class516.method3081((byte) -46)) && class363.field5500 > 2) {
                    class385.method2385((byte) 112, class77.field1288 + class45.field839, class438.field6545 - -class196.field2889);
                } else if (class320.method2089((byte) 38)) {
                    class385.method2385((byte) 102, class77.field1288 + class45.field839, class438.field6545 - -class196.field2889);
                }
                class475.field7100 = null;
            }
        } else if (class303.field4329 > 1) {
            class475.field7100 = null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "R", descriptor = "(III)V", line = 347)
    public final void method868(int arg0, int arg1, int arg2) {
        this.field3533 = this.field3559 = this.field3551 = this.field3561 = this.field3530 = this.field3544 = 0.0F;
        this.field3557 = arg1;
        this.field3555 = this.field3536 = this.field3543 = 1.0F;
        field3531++;
        this.field3554 = arg0;
        this.field3529 = arg2;
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)[F", line = 360)
    public final float[] method1599(int arg0) {
        class329.field4961[8] = this.field3530;
        field3538++;
        class329.field4961[10] = this.field3543;
        class329.field4961[9] = this.field3544;
        class329.field4961[4] = this.field3551;
        class329.field4961[1] = this.field3533;
        class329.field4961[0] = this.field3555;
        class329.field4961[5] = this.field3536;
        class329.field4961[12] = this.field3554;
        if (arg0 != 16383) {
            return null;
        }
        class329.field4961[2] = this.field3559;
        class329.field4961[13] = this.field3557;
        class329.field4961[14] = this.field3529;
        class329.field4961[6] = this.field3561;
        return class329.field4961;
    }

    @OriginalMember(owner = "client!mn", name = "X", descriptor = "([I)V", line = 385)
    public final void method870(int[] arg0) {
        field3540++;
        float var2 = (float) arg0[0] - this.field3554;
        float var3 = (float) arg0[1] - this.field3557;
        float var4 = (float) arg0[2] - this.field3529;
        arg0[2] = (int) (this.field3543 * var4 + this.field3544 * var3 + this.field3530 * var2);
        arg0[0] = (int) (this.field3559 * var4 + this.field3555 * var2 + this.field3533 * var3);
        arg0[1] = (int) (this.field3561 * var4 + this.field3551 * var2 + this.field3536 * var3);
    }

    @OriginalMember(owner = "client!mn", name = "ba", descriptor = "(Lia;)V", line = 403)
    public final void method866(class414 arg0) {
        field3548++;
        class246 var2 = (class246) arg0;
        this.field3543 = var2.field3543;
        this.field3561 = var2.field3561;
        this.field3529 = var2.field3529;
        this.field3551 = var2.field3551;
        this.field3555 = var2.field3555;
        this.field3530 = var2.field3530;
        this.field3559 = var2.field3559;
        this.field3554 = var2.field3554;
        this.field3536 = var2.field3536;
        this.field3533 = var2.field3533;
        this.field3557 = var2.field3557;
        this.field3544 = var2.field3544;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(III[I)V", line = 427)
    public final void method875(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = (int) ((float) arg2 * this.field3544 + (float) arg0 * this.field3533 + (float) arg1 * this.field3536 + this.field3557);
        arg3[2] = (int) ((float) arg2 * this.field3543 + (float) arg0 * this.field3559 + (float) arg1 * this.field3561 + this.field3529);
        arg3[0] = (int) ((float) arg2 * this.field3530 + (float) arg0 * this.field3555 + (float) arg1 * this.field3551 + this.field3554);
        field3556++;
    }

    @OriginalMember(owner = "client!mn", name = "ma", descriptor = "(I)V", line = 440)
    public final void method869(int arg0) {
        this.field3543 = 1.0F;
        field3560++;
        this.field3555 = this.field3536 = class404.field6064[arg0 & 0x3FFF];
        this.field3533 = class404.field6061[arg0 & 0x3FFF];
        this.field3530 = this.field3554 = this.field3544 = this.field3557 = this.field3559 = this.field3561 = this.field3529 = 0.0F;
        this.field3551 = -this.field3533;
    }

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "(B)V", line = 460)
    public static void method1600(byte arg0) {
        if (arg0 != -97) {
            field3550 = 106;
        }
        field3537 = null;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIFIFFI)V", line = 470)
    public final void method1601(int arg0, int arg1, float arg2, int arg3, float arg4, float arg5, int arg6) {
        if (arg1 == arg6) {
            this.field3536 = arg3;
            this.field3533 = this.field3559 = this.field3551 = this.field3561 = this.field3530 = this.field3544 = 0.0F;
            this.field3555 = arg0;
            this.field3543 = 1.0F;
        } else {
            float var8 = class404.field6064[arg6 & 0x3FFF];
            float var9 = class404.field6061[arg6 & 0x3FFF];
            this.field3543 = 1.0F;
            this.field3559 = this.field3561 = this.field3530 = this.field3544 = 0.0F;
            this.field3536 = (float) arg3 * var8;
            this.field3555 = (float) arg0 * var8;
            this.field3551 = (float) arg3 * -var9;
            this.field3533 = (float) arg0 * var9;
        }
        field3546++;
        this.field3554 = arg2;
        this.field3529 = arg4;
        this.field3557 = arg5;
    }

    @OriginalMember(owner = "client!mn", name = "E", descriptor = "(III[I)V", line = 501)
    public final void method877(int arg0, int arg1, int arg2, int[] arg3) {
        field3534++;
        arg3[2] = (int) ((float) arg2 * this.field3543 + (float) arg0 * this.field3559 + (float) arg1 * this.field3561);
        arg3[0] = (int) ((float) arg2 * this.field3530 + (float) arg0 * this.field3555 + (float) arg1 * this.field3551);
        arg3[1] = (int) ((float) arg2 * this.field3544 + (float) arg0 * this.field3533 + (float) arg1 * this.field3536);
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "()V", line = 511)
    public class246() {
        this.method872();
    }
}
