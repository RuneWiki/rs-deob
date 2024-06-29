import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class55 extends class513 {

    @OriginalMember(owner = "client!fw", name = "u", descriptor = "I")
    public static int field642 = 0;

    @OriginalMember(owner = "client!fw", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field640 = new String[100];

    @OriginalMember(owner = "client!fw", name = "e", descriptor = "F")
    public float field626;

    @OriginalMember(owner = "client!fw", name = "g", descriptor = "F")
    public float field628;

    @OriginalMember(owner = "client!fw", name = "k", descriptor = "F")
    public float field632;

    @OriginalMember(owner = "client!fw", name = "q", descriptor = "F")
    public float field638;

    @OriginalMember(owner = "client!fw", name = "v", descriptor = "F")
    public float field643;

    @OriginalMember(owner = "client!fw", name = "z", descriptor = "F")
    public float field647;

    @OriginalMember(owner = "client!fw", name = "B", descriptor = "F")
    public float field649;

    @OriginalMember(owner = "client!fw", name = "H", descriptor = "F")
    public float field655;

    @OriginalMember(owner = "client!fw", name = "I", descriptor = "F")
    public float field656;

    @OriginalMember(owner = "client!fw", name = "N", descriptor = "F")
    public float field661;

    @OriginalMember(owner = "client!fw", name = "Q", descriptor = "F")
    public float field664;

    @OriginalMember(owner = "client!fw", name = "R", descriptor = "F")
    public float field665;

    @OriginalMember(owner = "client!fw", name = "f", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!fw", name = "h", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!fw", name = "i", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!fw", name = "j", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!fw", name = "l", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!fw", name = "m", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!fw", name = "n", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!fw", name = "o", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!fw", name = "p", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!fw", name = "r", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!fw", name = "t", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!fw", name = "w", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!fw", name = "x", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!fw", name = "y", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!fw", name = "A", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!fw", name = "C", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!fw", name = "D", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!fw", name = "E", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!fw", name = "F", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!fw", name = "G", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!fw", name = "J", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!fw", name = "K", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!fw", name = "L", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!fw", name = "M", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!fw", name = "O", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!fw", name = "P", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "(III[I)V")
    public final void method338(int arg0, int arg1, int arg2, int[] arg3) {
        field654++;
        arg3[2] = (int) ((float) arg2 * this.field638 + (float) arg0 * this.field661 + (float) arg1 * this.field656);
        arg3[0] = (int) ((float) arg2 * this.field643 + (float) arg0 * this.field628 + (float) arg1 * this.field664);
        arg3[1] = (int) ((float) arg2 * this.field647 + (float) arg0 * this.field626 + (float) arg1 * this.field649);
    }

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "(III)V")
    public final void method339(int arg0, int arg1, int arg2) {
        this.field626 = this.field661 = this.field664 = this.field656 = this.field643 = this.field647 = 0.0F;
        this.field655 = arg1;
        this.field632 = arg2;
        this.field628 = this.field649 = this.field638 = 1.0F;
        field627++;
        this.field665 = arg0;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(IIIIII)V")
    public final void method340(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field660++;
        float var7 = class444.field6314[arg3 & 0x3FFF];
        float var8 = class444.field6317[arg3 & 0x3FFF];
        float var9 = class444.field6314[arg4 & 0x3FFF];
        float var10 = class444.field6317[arg4 & 0x3FFF];
        float var11 = class444.field6314[arg5 & 0x3FFF];
        float var12 = class444.field6317[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field626 = -var9 * var12 + var10 * var13;
        this.field638 = var7 * var9;
        this.field661 = var7 * var10;
        this.field664 = var7 * var12;
        this.field647 = var9 * var13 + var10 * var12;
        this.field628 = var9 * var11 + var10 * var14;
        this.field656 = -var8;
        this.field649 = var7 * var11;
        this.field643 = -var10 * var11 + var9 * var14;
        this.field632 = (float) (-arg0) * this.field661 - ((float) arg1 * this.field656) - ((float) arg2 * this.field638);
        this.field665 = (float) (-arg0) * this.field628 - (float) arg1 * this.field664 - ((float) arg2 * this.field643);
        this.field655 = (float) (-arg0) * this.field626 - ((float) arg1 * this.field649) - (float) arg2 * this.field647;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(FF[FFFB)V")
    public final void method341(float arg0, float arg1, float[] arg2, float arg3, float arg4, byte arg5) {
        field635++;
        if (arg5 < 122) {
            field642 = -14;
        }
        arg2[2] = this.field638 * arg3 + this.field661 * arg4 + this.field656 * arg1;
        arg2[0] = this.field643 * arg3 + this.field664 * arg1 + this.field628 * arg4;
        float var8;
        float var9;
        float var10;
        if ((arg4 > 0.00390625F) || (arg4 < -0.00390625F)) {
            float var12 = -arg0 / arg4;
            var9 = this.field628 * var12 + this.field665;
            var10 = this.field661 * var12 + this.field632;
            var8 = this.field626 * var12 + this.field655;
        } else if ((arg1 > 0.00390625F) || (arg1 < -0.00390625F)) {
            float var11 = -arg0 / arg1;
            var9 = this.field664 * var11 + this.field665;
            var10 = this.field656 * var11 + this.field632;
            var8 = this.field649 * var11 + this.field655;
        } else {
            float var7 = -arg0 / arg3;
            var8 = this.field647 * var7 + this.field655;
            var9 = this.field643 * var7 + this.field665;
            var10 = this.field638 * var7 + this.field632;
        }
        arg2[1] = this.field647 * arg3 + this.field649 * arg1 + this.field626 * arg4;
        arg2[3] = -(arg2[2] * var10 + arg2[0] * var9 + arg2[1] * var8);
    }

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "(I)V")
    public final void method342(int arg0) {
        field633++;
        this.field638 = 1.0F;
        this.field628 = this.field649 = class444.field6314[arg0 & 0x3FFF];
        this.field626 = class444.field6317[arg0 & 0x3FFF];
        this.field664 = -this.field626;
        this.field643 = this.field665 = this.field647 = this.field655 = this.field661 = this.field656 = this.field632 = 0.0F;
    }

    @OriginalMember(owner = "client!fw", name = "h", descriptor = "(I)V")
    public static void method343(int arg0) {
        field640 = null;
        if (arg0 != 6) {
            field640 = null;
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lnga;)V")
    public final void method344(class513 arg0) {
        field646++;
        class55 var2 = (class55) arg0;
        this.field655 = var2.field655;
        this.field665 = var2.field665;
        this.field649 = var2.field649;
        this.field632 = var2.field632;
        this.field664 = var2.field664;
        this.field643 = var2.field643;
        this.field628 = var2.field628;
        this.field656 = var2.field656;
        this.field638 = var2.field638;
        this.field661 = var2.field661;
        this.field626 = var2.field626;
        this.field647 = var2.field647;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lnga;B)V")
    public final void method345(class513 arg0, byte arg1) {
        field662++;
        class55 var3 = (class55) arg0;
        this.field643 = var3.field661;
        this.field628 = var3.field628;
        int var4 = 62 % ((arg1 - 40) / 61);
        this.field664 = var3.field626;
        this.field649 = var3.field649;
        this.field647 = var3.field656;
        this.field661 = var3.field643;
        this.field626 = var3.field664;
        this.field656 = var3.field647;
        this.field638 = var3.field638;
        this.field665 = -(this.field643 * var3.field632 + this.field664 * var3.field655 + this.field628 * var3.field665);
        this.field655 = -(this.field647 * var3.field632 + this.field649 * var3.field655 + this.field626 * var3.field665);
        this.field632 = -(this.field638 * var3.field632 + this.field661 * var3.field665 + this.field656 * var3.field655);
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(IFIIIZII)[I")
    public static final int[] method346(int arg0, float arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field663++;
        int[] var8 = new int[arg3];
        class407 var9 = new class407();
        var9.field5757 = arg7;
        var9.field5759 = arg2;
        int var10 = 110 % ((arg4 - 42) / 45);
        var9.field5765 = arg5;
        var9.field5773 = (int) (arg1 * 4096.0F);
        var9.field5763 = arg0;
        var9.field5771 = arg6;
        var9.method364(7);
        class193.method1196(-11775, arg3, 1);
        var9.method2522(false, 0, var8);
        return var8;
    }

    @OriginalMember(owner = "client!fw", name = "d", descriptor = "(I)V")
    public final void method347(int arg0) {
        field629++;
        float var2 = class444.field6314[arg0 & 0x3FFF];
        float var3 = class444.field6317[arg0 & 0x3FFF];
        float var4 = this.field628;
        float var5 = this.field664;
        float var6 = this.field643;
        float var7 = this.field665;
        this.field628 = this.field661 * var3 + var2 * var4;
        this.field661 = this.field661 * var2 - var3 * var4;
        this.field664 = this.field656 * var3 + var2 * var5;
        this.field643 = this.field638 * var3 + var2 * var6;
        this.field656 = this.field656 * var2 - (var3 * var5);
        this.field665 = this.field632 * var3 + var2 * var7;
        this.field638 = this.field638 * var2 - (var3 * var6);
        this.field632 = this.field632 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "([I)V")
    public final void method348(int[] arg0) {
        field658++;
        float var2 = (float) arg0[0] - this.field665;
        float var3 = (float) arg0[1] - this.field655;
        float var4 = (float) arg0[2] - this.field632;
        arg0[1] = (int) (this.field656 * var4 + this.field664 * var2 + this.field649 * var3);
        arg0[2] = (int) (this.field638 * var4 + this.field647 * var3 + this.field643 * var2);
        arg0[0] = (int) (this.field661 * var4 + this.field628 * var2 + this.field626 * var3);
    }

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "()Lnga;")
    public final class513 method349() {
        field651++;
        class55 var1 = new class55();
        var1.field626 = this.field626;
        var1.field632 = this.field632;
        var1.field628 = this.field628;
        var1.field649 = this.field649;
        var1.field664 = this.field664;
        var1.field665 = this.field665;
        var1.field661 = this.field661;
        var1.field656 = this.field656;
        var1.field638 = this.field638;
        var1.field655 = this.field655;
        var1.field647 = this.field647;
        var1.field643 = this.field643;
        return var1;
    }

    @OriginalMember(owner = "client!fw", name = "g", descriptor = "(I)V")
    public final void method350(int arg0) {
        field639++;
        float var2 = class444.field6314[arg0 & 0x3FFF];
        float var3 = class444.field6317[arg0 & 0x3FFF];
        float var4 = this.field626;
        float var5 = this.field649;
        float var6 = this.field647;
        this.field626 = var2 * var4 - this.field661 * var3;
        float var7 = this.field655;
        this.field661 = this.field661 * var2 + var3 * var4;
        this.field649 = var2 * var5 - (this.field656 * var3);
        this.field656 = this.field656 * var2 + var3 * var5;
        this.field647 = var2 * var6 - (this.field638 * var3);
        this.field655 = var2 * var7 - this.field632 * var3;
        this.field638 = this.field638 * var2 + var3 * var6;
        this.field632 = this.field632 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "()V")
    public final void method351() {
        this.field628 = this.field649 = this.field638 = 1.0F;
        this.field626 = this.field661 = this.field664 = this.field656 = this.field643 = this.field647 = this.field665 = this.field655 = this.field632 = 0.0F;
        field653++;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(Ld;Lha;I)V")
    public static final void method352(class149 arg0, class58 arg1, int arg2) {
        field657++;
        if (class678.field9271 == null) {
            return;
        }
        if (class725.field10122 < 10) {
            if (!class678.field9269.method2091(class678.field9271.field581, -2)) {
                class725.field10122 = class662.field9065.method2078(class678.field9271.field581, (byte) 110) / 10;
                return;
            }
            class70.method582(-1);
            class725.field10122 = 10;
        }
        if (class725.field10122 == 10) {
            class678.field9294 = class678.field9271.field594 >> 6 << 6;
            class678.field9304 = class678.field9271.field585 >> 6 << 6;
            class678.field9285 = (class678.field9271.field587 >> 6 << 6) + 64 - class678.field9294;
            class678.field9300 = (class678.field9271.field598 >> 6 << 6) + 64 - class678.field9304;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class678.field9271.method321(class660.field9039.field1266, (class660.field9039.field1250 >> 9) + class3.field30, (byte) 21, (class660.field9039.field1264 >> 9) + class228.field3063, var3)) {
                var5 = var3[2] - class678.field9304;
                var4 = var3[1] - class678.field9294;
            }
            if (!class440.field6260 && var4 >= 0 && var4 < class678.field9285 && var5 >= 0 && class678.field9300 > var5) {
                int var6 = var4 + (int) (Math.random() * 10.0D) - 5;
                int var7 = var5 + (int) (Math.random() * 10.0D) - 5;
                class299.field4217 = var6;
                class193.field2580 = var7;
            } else if (class110.field1343 == -1 || class211.field2785 == -1) {
                class678.field9271.method319(class678.field9271.field580 & 0x3FFF, var3, class678.field9271.field580 >> 14 & 0x3FFF, (byte) 106);
                class299.field4217 = var3[1] - class678.field9294;
                class193.field2580 = var3[2] - class678.field9304;
            } else {
                class678.field9271.method319(class211.field2785, var3, class110.field1343, (byte) 101);
                class440.field6260 = false;
                if (var3 != null) {
                    class299.field4217 = var3[1] - class678.field9294;
                    class193.field2580 = var3[2] - class678.field9304;
                }
                class211.field2785 = -1;
                class110.field1343 = -1;
            }
            if (class678.field9271.field589 == 37) {
                class678.field9281 = 3.0F;
                class678.field9282 = 3.0F;
            } else if (class678.field9271.field589 == 50) {
                class678.field9281 = 4.0F;
                class678.field9282 = 4.0F;
            } else if (class678.field9271.field589 == 75) {
                class678.field9281 = 6.0F;
                class678.field9282 = 6.0F;
            } else if (class678.field9271.field589 == 100) {
                class678.field9281 = 8.0F;
                class678.field9282 = 8.0F;
            } else if (class678.field9271.field589 == 200) {
                class678.field9281 = 16.0F;
                class678.field9282 = 16.0F;
            } else {
                class678.field9281 = 8.0F;
                class678.field9282 = 8.0F;
            }
            class678.field9275 = (int) class678.field9281 >> 1;
            class678.field9277 = class668.method3642(class678.field9275, (byte) 87);
            class82.method633((byte) 56);
            class678.method3789();
            class724.field10104 = new class464();
            class678.field9283 += (int) (Math.random() * 5.0D) - 2;
            if (class678.field9283 < -8) {
                class678.field9283 = -8;
            }
            if (class678.field9283 > 8) {
                class678.field9283 = 8;
            }
            class678.field9279 += (int) (Math.random() * 5.0D) - 2;
            if (class678.field9279 < -16) {
                class678.field9279 = -16;
            }
            if (class678.field9279 > 16) {
                class678.field9279 = 16;
            }
            class678.method3780(arg0, class678.field9283 >> 2 << 10, class678.field9279 >> 1);
            class678.field9273.method3086(256, (byte) -16, 1024);
            class678.field9272.method1416(2060105417, 256, 256);
            class678.field9268.method557(4096, 120);
            class130.field1568.method179(-1, 256);
            class725.field10122 = 20;
        } else if (class725.field10122 == 20) {
            class650.method3580((byte) 116, true);
            class678.method3797(arg1, class678.field9283, class678.field9279);
            class725.field10122 = 60;
            class650.method3580((byte) 75, true);
            class701.method3948((byte) -88);
        } else if (class725.field10122 == 60) {
            if (class678.field9269.method2093((byte) 33, class678.field9271.field581 + "_staticelements")) {
                if (!class678.field9269.method2091(class678.field9271.field581 + "_staticelements", -2)) {
                    return;
                }
                class678.field9284 = class638.method3539(class192.field2572, class678.field9269, (byte) -77, class678.field9271.field581 + "_staticelements");
            } else {
                class678.field9284 = new class38(0);
            }
            class678.method3787();
            class725.field10122 = 70;
            class650.method3580((byte) 52, true);
            class701.method3948((byte) 78);
        } else if (class725.field10122 == 70) {
            class707.field9816 = new class80(arg1, 11, true, class366.field5196);
            class725.field10122 = 73;
            class650.method3580((byte) 94, true);
            class701.method3948((byte) 110);
        } else if (class725.field10122 == 73) {
            class4.field42 = new class80(arg1, 12, true, class366.field5196);
            class725.field10122 = 76;
            class650.method3580((byte) 86, true);
            class701.method3948((byte) 86);
        } else if (class725.field10122 == 76) {
            class134.field1955 = new class80(arg1, 14, true, class366.field5196);
            class725.field10122 = 79;
            class650.method3580((byte) 113, true);
            class701.method3948((byte) 80);
        } else if (class725.field10122 == 79) {
            class336.field4680 = new class80(arg1, 17, true, class366.field5196);
            class725.field10122 = 82;
            class650.method3580((byte) 94, true);
            class701.method3948((byte) -80);
        } else if (class725.field10122 == 82) {
            class516.field7360 = new class80(arg1, 19, true, class366.field5196);
            class725.field10122 = 85;
            class650.method3580((byte) 84, true);
            class701.method3948((byte) 107);
        } else if (class725.field10122 == 85) {
            class473.field6698 = new class80(arg1, 22, true, class366.field5196);
            class725.field10122 = 88;
            class650.method3580((byte) 100, true);
            class701.method3948((byte) 102);
        } else if (class725.field10122 == 88) {
            class125.field1525 = new class80(arg1, 26, true, class366.field5196);
            class725.field10122 = 91;
            class650.method3580((byte) 114, true);
            class701.method3948((byte) -104);
        } else {
            class597.field8400 = new class80(arg1, 30, true, class366.field5196);
            class725.field10122 = 100;
            if (arg2 > 43) {
                class650.method3580((byte) 74, true);
                class701.method3948((byte) 83);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(III[I)V")
    public final void method353(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (int) ((float) arg2 - this.field632);
        int var6 = (int) ((float) arg1 - this.field655);
        field641++;
        int var7 = (int) ((float) arg0 - this.field665);
        arg3[2] = (int) ((float) var5 * this.field638 + (float) var6 * this.field647 + (float) var7 * this.field643);
        arg3[0] = (int) ((float) var5 * this.field661 + (float) var6 * this.field626 + (float) var7 * this.field628);
        arg3[1] = (int) ((float) var5 * this.field656 + (float) var6 * this.field649 + (float) var7 * this.field664);
    }

    @OriginalMember(owner = "client!fw", name = "i", descriptor = "(I)[F")
    public final float[] method354(int arg0) {
        class309.field4312[4] = this.field664;
        class309.field4312[13] = this.field655;
        class309.field4312[2] = this.field661;
        class309.field4312[1] = this.field626;
        class309.field4312[12] = this.field665;
        class309.field4312[10] = this.field638;
        class309.field4312[8] = this.field643;
        class309.field4312[6] = this.field656;
        class309.field4312[5] = this.field649;
        class309.field4312[9] = this.field647;
        class309.field4312[0] = this.field628;
        class309.field4312[14] = this.field632;
        field637++;
        if (arg0 <= 16) {
            this.method357(13, 19, -69, null);
        }
        return class309.field4312;
    }

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "(B)[F")
    public final float[] method355(byte arg0) {
        class309.field4312[1] = this.field626;
        class309.field4312[14] = 0.0F;
        class309.field4312[9] = this.field647;
        class309.field4312[2] = this.field661;
        class309.field4312[5] = this.field649;
        class309.field4312[10] = this.field638;
        class309.field4312[6] = this.field656;
        class309.field4312[8] = this.field643;
        field634++;
        class309.field4312[0] = this.field628;
        class309.field4312[12] = 0.0F;
        class309.field4312[4] = this.field664;
        class309.field4312[13] = 0.0F;
        int var2 = 12 % ((-arg0 - 11) / 39);
        return class309.field4312;
    }

    @OriginalMember(owner = "client!fw", name = "e", descriptor = "(I)V")
    public final void method356(int arg0) {
        field636++;
        float var2 = class444.field6314[arg0 & 0x3FFF];
        float var3 = class444.field6317[arg0 & 0x3FFF];
        float var4 = this.field628;
        float var5 = this.field664;
        float var6 = this.field643;
        float var7 = this.field665;
        this.field628 = var2 * var4 - (this.field626 * var3);
        this.field664 = var2 * var5 - this.field649 * var3;
        this.field626 = this.field626 * var2 + var3 * var4;
        this.field643 = var2 * var6 - (this.field647 * var3);
        this.field649 = this.field649 * var2 + var3 * var5;
        this.field665 = var2 * var7 - (this.field655 * var3);
        this.field647 = this.field647 * var2 + var3 * var6;
        this.field655 = this.field655 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "(III[I)V")
    public final void method357(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = (int) ((float) arg2 * this.field647 + (float) arg0 * this.field626 + (float) arg1 * this.field649 + this.field655);
        arg3[0] = (int) ((float) arg2 * this.field643 + (float) arg0 * this.field628 + (float) arg1 * this.field664 + this.field665);
        field650++;
        arg3[2] = (int) ((float) arg2 * this.field638 + (float) arg0 * this.field661 + (float) arg1 * this.field656 + this.field632);
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(IIFIFFI)V")
    public final void method358(int arg0, int arg1, float arg2, int arg3, float arg4, float arg5, int arg6) {
        if (arg6 == 0) {
            this.field649 = arg1;
            this.field626 = this.field661 = this.field664 = this.field656 = this.field643 = this.field647 = 0.0F;
            this.field638 = 1.0F;
            this.field628 = arg3;
        } else {
            float var8 = class444.field6314[arg6 & 0x3FFF];
            float var9 = class444.field6317[arg6 & 0x3FFF];
            this.field638 = 1.0F;
            this.field664 = (float) arg1 * -var9;
            this.field649 = (float) arg1 * var8;
            this.field626 = (float) arg3 * var9;
            this.field628 = (float) arg3 * var8;
            this.field661 = this.field656 = this.field643 = this.field647 = 0.0F;
        }
        if (arg0 == 1) {
            field652++;
            this.field632 = arg2;
            this.field655 = arg5;
            this.field665 = arg4;
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(II)V")
    public static final void method359(int arg0, int arg1) {
        field631++;
        if (class393.method2476(126, arg0) && arg1 <= -59) {
            class449.method2688(class37.field475[arg0], (byte) -9, -1);
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(III)V")
    public final void method360(int arg0, int arg1, int arg2) {
        this.field655 += arg1;
        this.field665 += arg0;
        this.field632 += arg2;
        field645++;
    }

    @OriginalMember(owner = "client!fw", name = "j", descriptor = "(I)V")
    public final void method361(int arg0) {
        if (arg0 != 11) {
            return;
        }
        this.field638 = -this.field638;
        this.field626 = -this.field626;
        this.field647 = -this.field647;
        this.field649 = -this.field649;
        this.field661 = -this.field661;
        this.field655 = -this.field655;
        this.field632 = -this.field632;
        this.field656 = -this.field656;
        field630++;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)V")
    public final void method362(int arg0) {
        field648++;
        this.field628 = 1.0F;
        this.field649 = this.field638 = class444.field6314[arg0 & 0x3FFF];
        this.field656 = class444.field6317[arg0 & 0x3FFF];
        this.field647 = -this.field656;
        this.field664 = this.field643 = this.field665 = this.field626 = this.field655 = this.field661 = this.field632 = 0.0F;
    }

    @OriginalMember(owner = "client!fw", name = "f", descriptor = "(I)V")
    public final void method363(int arg0) {
        field659++;
        this.field649 = 1.0F;
        this.field628 = this.field638 = class444.field6314[arg0 & 0x3FFF];
        this.field643 = class444.field6317[arg0 & 0x3FFF];
        this.field661 = -this.field643;
        this.field664 = this.field665 = this.field626 = this.field647 = this.field655 = this.field656 = this.field632 = 0.0F;
    }

    @OriginalMember(owner = "client!fw", name = "<init>", descriptor = "()V")
    public class55() {
        this.method351();
    }
}
