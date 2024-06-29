import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class141 extends class396 {

    @OriginalMember(owner = "client!g", name = "L", descriptor = "[F")
    public static float[] field2499 = new float[16];

    @OriginalMember(owner = "client!g", name = "j", descriptor = "F")
    public float field2471;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "F")
    public float field2472;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "F")
    public float field2473;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "F")
    public float field2476;

    @OriginalMember(owner = "client!g", name = "s", descriptor = "F")
    public float field2480;

    @OriginalMember(owner = "client!g", name = "u", descriptor = "F")
    public float field2482;

    @OriginalMember(owner = "client!g", name = "x", descriptor = "F")
    public float field2485;

    @OriginalMember(owner = "client!g", name = "H", descriptor = "F")
    public float field2495;

    @OriginalMember(owner = "client!g", name = "I", descriptor = "F")
    public float field2496;

    @OriginalMember(owner = "client!g", name = "J", descriptor = "F")
    public float field2497;

    @OriginalMember(owner = "client!g", name = "K", descriptor = "F")
    public float field2498;

    @OriginalMember(owner = "client!g", name = "N", descriptor = "F")
    public float field2501;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!g", name = "n", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!g", name = "r", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!g", name = "t", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!g", name = "v", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!g", name = "w", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!g", name = "y", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!g", name = "z", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!g", name = "A", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!g", name = "B", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!g", name = "C", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!g", name = "D", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!g", name = "E", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!g", name = "F", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!g", name = "G", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!g", name = "M", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!g", name = "q", descriptor = "Ldaa;")
    public static class11 field2478;

    @OriginalMember(owner = "client!g", name = "oa", descriptor = "(I)V")
    public final void method893(int arg0) {
        field2491++;
        this.field2497 = 1.0F;
        this.field2498 = this.field2471 = class13.field718[arg0 & 0x3FFF];
        this.field2501 = class13.field660[arg0 & 0x3FFF];
        this.field2473 = -this.field2501;
        this.field2485 = this.field2495 = this.field2482 = this.field2476 = this.field2496 = this.field2472 = this.field2480 = 0.0F;
    }

    @OriginalMember(owner = "client!g", name = "NA", descriptor = "(III)V")
    public final void method905(int arg0, int arg1, int arg2) {
        this.field2480 = arg2;
        this.field2476 = this.field2472 = this.field2485 = this.field2501 = this.field2495 = this.field2473 = 0.0F;
        field2477++;
        this.field2496 = arg1;
        this.field2497 = this.field2498 = this.field2471 = 1.0F;
        this.field2482 = arg0;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)I")
    public static final int method1143(int arg0) {
        field2486++;
        if (arg0 != 0) {
            method1147(107, 'q');
        }
        if (class44.field1094 == null) {
            if (!class308.field4551 && class481.field6904 > 0) {
                if (class66.field1450 && class486.field6965.method2194(81, (byte) 122) && class481.field6904 > 2) {
                    return ((class300) class126.field2292.field2700.field6139.field6139).field4461;
                }
                return ((class300) class126.field2292.field2700.field6139).field4461;
            }
            int var1 = class410.field5945.method1931(-23081);
            int var2 = class410.field5945.method1936(126);
            int var3 = class640.field9206;
            int var4 = class43.field1086;
            int var5 = class134.field2391;
            if (var1 > var3 && var1 < var3 + var5) {
                int var6 = -1;
                for (int var7 = 0; var7 < class481.field6904; var7++) {
                    if (class163.field2740) {
                        int var11 = (class481.field6904 - var7 - 1) * 16 + var4 + 33;
                        if (var2 > (var11 - 13) && var2 <= var11 + 3) {
                            var6 = var7;
                        }
                    } else {
                        int var12 = (class481.field6904 - var7 - 1) * 16 + var4 + 31;
                        if ((var12 - 13) < var2 && var12 + 3 >= var2) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class74 var9 = new class74(class126.field2292);
                    for (class300 var10 = (class300) var9.method795((byte) 115); var10 != null; var10 = (class300) var9.method797(303)) {
                        if (var6 == var8++) {
                            return var10.field4461;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!g", name = "YA", descriptor = "([I)V")
    public final void method898(int[] arg0) {
        field2488++;
        float var2 = (float) arg0[0] - this.field2482;
        float var3 = (float) arg0[1] - this.field2496;
        float var4 = (float) arg0[2] - this.field2480;
        arg0[1] = (int) (this.field2501 * var4 + this.field2498 * var3 + this.field2485 * var2);
        arg0[2] = (int) (this.field2471 * var4 + this.field2495 * var2 + this.field2473 * var3);
        arg0[0] = (int) (this.field2472 * var4 + this.field2497 * var2 + this.field2476 * var3);
    }

    @OriginalMember(owner = "client!g", name = "w", descriptor = "(I)V")
    public final void method894(int arg0) {
        field2481++;
        float var2 = class13.field718[arg0 & 0x3FFF];
        float var3 = class13.field660[arg0 & 0x3FFF];
        float var4 = this.field2476;
        float var5 = this.field2498;
        float var6 = this.field2473;
        this.field2476 = var2 * var4 - (this.field2472 * var3);
        float var7 = this.field2496;
        this.field2498 = var2 * var5 - this.field2501 * var3;
        this.field2472 = this.field2472 * var2 + var3 * var4;
        this.field2501 = this.field2501 * var2 + var3 * var5;
        this.field2473 = var2 * var6 - (this.field2471 * var3);
        this.field2471 = this.field2471 * var2 + var3 * var6;
        this.field2496 = var2 * var7 - (this.field2480 * var3);
        this.field2480 = this.field2480 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(II)Z")
    public static final boolean method1144(int arg0, int arg1) {
        if (arg0 != 0) {
            method1146(-68);
        }
        field2470++;
        return (arg1 & -arg1) == arg1;
    }

    @OriginalMember(owner = "client!g", name = "o", descriptor = "(I)V")
    public final void method900(int arg0) {
        field2479++;
        this.field2498 = 1.0F;
        this.field2497 = this.field2471 = class13.field718[arg0 & 0x3FFF];
        this.field2495 = class13.field660[arg0 & 0x3FFF];
        this.field2472 = -this.field2495;
        this.field2485 = this.field2482 = this.field2476 = this.field2473 = this.field2496 = this.field2501 = this.field2480 = 0.0F;
    }

    @OriginalMember(owner = "client!g", name = "J", descriptor = "(I)V")
    public final void method903(int arg0) {
        field2483++;
        this.field2471 = 1.0F;
        this.field2497 = this.field2498 = class13.field718[arg0 & 0x3FFF];
        this.field2476 = class13.field660[arg0 & 0x3FFF];
        this.field2485 = -this.field2476;
        this.field2495 = this.field2482 = this.field2473 = this.field2496 = this.field2472 = this.field2501 = this.field2480 = 0.0F;
    }

    @OriginalMember(owner = "client!g", name = "AA", descriptor = "(I)V")
    public final void method897(int arg0) {
        field2489++;
        float var2 = class13.field718[arg0 & 0x3FFF];
        float var3 = class13.field660[arg0 & 0x3FFF];
        float var4 = this.field2497;
        float var5 = this.field2485;
        float var6 = this.field2495;
        float var7 = this.field2482;
        this.field2497 = var2 * var4 - this.field2476 * var3;
        this.field2476 = this.field2476 * var2 + var3 * var4;
        this.field2485 = var2 * var5 - (this.field2498 * var3);
        this.field2498 = this.field2498 * var2 + var3 * var5;
        this.field2495 = var2 * var6 - (this.field2473 * var3);
        this.field2473 = this.field2473 * var2 + var3 * var6;
        this.field2482 = var2 * var7 - this.field2496 * var3;
        this.field2496 = this.field2496 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!g", name = "wa", descriptor = "(III[I)V")
    public final void method899(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field2471 + (float) arg0 * this.field2472 + (float) arg1 * this.field2501);
        arg3[1] = (int) ((float) arg2 * this.field2473 + (float) arg0 * this.field2476 + (float) arg1 * this.field2498);
        field2490++;
        arg3[0] = (int) ((float) arg2 * this.field2495 + (float) arg0 * this.field2497 + (float) arg1 * this.field2485);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIILlk;Z)V")
    public static final void method1145(int arg0, int arg1, int arg2, class545 arg3, boolean arg4) {
        int var5 = -46 / ((arg0 - 11) / 48);
        field2487++;
        int var6 = arg3.field7718;
        if (arg3.field7671 == 0) {
            arg3.field7718 = arg3.field7658;
        } else if (arg3.field7671 == 1) {
            arg3.field7718 = arg1 - arg3.field7658;
        } else if (arg3.field7671 == 2) {
            arg3.field7718 = arg3.field7658 * arg1 >> 14;
        }
        int var7 = arg3.field7652;
        if (arg3.field7660 == 0) {
            arg3.field7652 = arg3.field7594;
        } else if (arg3.field7660 == 1) {
            arg3.field7652 = arg2 - arg3.field7594;
        } else if (arg3.field7660 == 2) {
            arg3.field7652 = arg3.field7594 * arg2 >> 14;
        }
        if (arg3.field7671 == 4) {
            arg3.field7718 = arg3.field7752 * arg3.field7652 / arg3.field7628;
        }
        if (arg3.field7660 == 4) {
            arg3.field7652 = arg3.field7718 * arg3.field7628 / arg3.field7752;
        }
        if (class609.field8870 && (client.method1825(arg3).field8941 != 0 || arg3.field7649 == 0)) {
            if (arg3.field7652 < 5 && arg3.field7718 < 5) {
                arg3.field7652 = 5;
                arg3.field7718 = 5;
            } else {
                if (arg3.field7652 <= 0) {
                    arg3.field7652 = 5;
                }
                if (arg3.field7718 <= 0) {
                    arg3.field7718 = 5;
                }
            }
        }
        if (class79.field1579 == arg3.field7709) {
            class425.field6136 = arg3;
        }
        if (arg4 && arg3.field7724 != null && arg3.field7718 != var6 || arg3.field7652 != var7) {
            class476 var8 = new class476();
            var8.field6842 = arg3.field7724;
            var8.field6850 = arg3;
            class610.field8886.method1229(var8, (byte) 120);
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V")
    public static void method1146(int arg0) {
        field2478 = null;
        field2499 = null;
        if (arg0 < 42) {
            method1144(-124, 32);
        }
    }

    @OriginalMember(owner = "client!g", name = "U", descriptor = "(III)V")
    public final void method891(int arg0, int arg1, int arg2) {
        this.field2480 += arg2;
        this.field2482 += arg0;
        field2493++;
        this.field2496 += arg1;
    }

    @OriginalMember(owner = "client!g", name = "M", descriptor = "(Lq;)V")
    public final void method896(class396 arg0) {
        field2469++;
        class141 var2 = (class141) arg0;
        this.field2471 = var2.field2471;
        this.field2473 = var2.field2473;
        this.field2476 = var2.field2476;
        this.field2482 = var2.field2482;
        this.field2501 = var2.field2501;
        this.field2496 = var2.field2496;
        this.field2472 = var2.field2472;
        this.field2480 = var2.field2480;
        this.field2498 = var2.field2498;
        this.field2485 = var2.field2485;
        this.field2495 = var2.field2495;
        this.field2497 = var2.field2497;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IC)C")
    public static final char method1147(int arg0, char arg1) {
        field2492++;
        if (arg0 != 4) {
            return (char) 65436;
        } else if (arg1 == 'Æ') {
            return 'E';
        } else if (arg1 == 'æ') {
            return 'e';
        } else if (arg1 == 'ß') {
            return 's';
        } else if (arg1 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg1 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!g", name = "Y", descriptor = "()V")
    public final void method895() {
        field2484++;
        this.field2497 = this.field2498 = this.field2471 = 1.0F;
        this.field2476 = this.field2472 = this.field2485 = this.field2501 = this.field2495 = this.field2473 = this.field2482 = this.field2496 = this.field2480 = 0.0F;
    }

    @OriginalMember(owner = "client!g", name = "ZA", descriptor = "(I)V")
    public final void method901(int arg0) {
        field2494++;
        float var2 = class13.field718[arg0 & 0x3FFF];
        float var3 = class13.field660[arg0 & 0x3FFF];
        float var4 = this.field2497;
        float var5 = this.field2485;
        float var6 = this.field2495;
        this.field2497 = this.field2472 * var3 + var2 * var4;
        float var7 = this.field2482;
        this.field2485 = this.field2501 * var3 + var2 * var5;
        this.field2472 = this.field2472 * var2 - (var3 * var4);
        this.field2501 = this.field2501 * var2 - var3 * var5;
        this.field2495 = this.field2471 * var3 + var2 * var6;
        this.field2471 = this.field2471 * var2 - (var3 * var6);
        this.field2482 = this.field2480 * var3 + var2 * var7;
        this.field2480 = this.field2480 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!g", name = "na", descriptor = "(IIIIII)V")
    public final void method907(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2475++;
        float var7 = class13.field718[arg3 & 0x3FFF];
        float var8 = class13.field660[arg3 & 0x3FFF];
        float var9 = class13.field718[arg4 & 0x3FFF];
        float var10 = class13.field660[arg4 & 0x3FFF];
        float var11 = class13.field718[arg5 & 0x3FFF];
        float var12 = class13.field660[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field2495 = -var10 * var11 + var9 * var14;
        this.field2473 = var9 * var13 + var10 * var12;
        this.field2497 = var9 * var11 + var10 * var14;
        this.field2485 = var7 * var12;
        this.field2501 = -var8;
        this.field2471 = var7 * var9;
        this.field2472 = var7 * var10;
        this.field2476 = -var9 * var12 + var10 * var13;
        this.field2498 = var7 * var11;
        this.field2480 = (float) (-arg0) * this.field2472 - (float) arg1 * this.field2501 - ((float) arg2 * this.field2471);
        this.field2482 = (float) (-arg0) * this.field2497 - (float) arg1 * this.field2485 - ((float) arg2 * this.field2495);
        this.field2496 = (float) (-arg0) * this.field2476 - ((float) arg1 * this.field2498) - (float) arg2 * this.field2473;
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
    public class141() {
        this.method895();
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(III[I)V")
    public final void method906(int arg0, int arg1, int arg2, int[] arg3) {
        field2500++;
        arg3[2] = (int) ((float) arg2 * this.field2471 + (float) arg0 * this.field2472 + (float) arg1 * this.field2501 + this.field2480);
        arg3[0] = (int) ((float) arg2 * this.field2495 + (float) arg0 * this.field2497 + (float) arg1 * this.field2485 + this.field2482);
        arg3[1] = (int) ((float) arg2 * this.field2473 + (float) arg0 * this.field2476 + (float) arg1 * this.field2498 + this.field2496);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "()Lq;")
    public final class396 method904() {
        field2474++;
        class141 var1 = new class141();
        var1.field2495 = this.field2495;
        var1.field2471 = this.field2471;
        var1.field2496 = this.field2496;
        var1.field2497 = this.field2497;
        var1.field2472 = this.field2472;
        var1.field2482 = this.field2482;
        var1.field2473 = this.field2473;
        var1.field2498 = this.field2498;
        var1.field2501 = this.field2501;
        var1.field2485 = this.field2485;
        var1.field2476 = this.field2476;
        var1.field2480 = this.field2480;
        return var1;
    }
}
