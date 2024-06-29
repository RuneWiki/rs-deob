import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class27 extends class352 {

    @OriginalMember(owner = "client!ts", name = "r", descriptor = "I")
    private int field442;

    @OriginalMember(owner = "client!ts", name = "t", descriptor = "I")
    private int field444;

    @OriginalMember(owner = "client!ts", name = "n", descriptor = "I")
    private int field438;

    @OriginalMember(owner = "client!ts", name = "w", descriptor = "I")
    private int field447;

    @OriginalMember(owner = "client!ts", name = "q", descriptor = "I")
    private int field441;

    @OriginalMember(owner = "client!ts", name = "l", descriptor = "I")
    private int field436;

    @OriginalMember(owner = "client!ts", name = "u", descriptor = "I")
    private int field445;

    @OriginalMember(owner = "client!ts", name = "k", descriptor = "I")
    private int field435;

    @OriginalMember(owner = "client!ts", name = "o", descriptor = "Z")
    public static boolean field439 = true;

    @OriginalMember(owner = "client!ts", name = "v", descriptor = "Lbr;")
    public static class380 field446 = new class380();

    @OriginalMember(owner = "client!ts", name = "y", descriptor = "Lqo;")
    public static class141 field449;

    @OriginalMember(owner = "client!ts", name = "z", descriptor = "[B")
    public static byte[] field450;

    @OriginalMember(owner = "client!ts", name = "j", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!ts", name = "m", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!ts", name = "p", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!ts", name = "s", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!ts", name = "x", descriptor = "[I")
    public static int[] field448;

    static {
        new class375("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
        field449 = new class141(8);
        field450 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(III)V", line = 4)
    public final void method137(int arg0, int arg1, int arg2) {
        if (arg1 == -2) {
            ++field434;
        }
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(III)V", line = 16)
    public final void method136(int arg0, int arg1, int arg2) {
        ++field440;
        int var4 = this.field444 * arg1 >> 12;
        int var5 = this.field442 * arg2 >> 12;
        int var6 = this.field435 * arg1 >> 12;
        int var7 = this.field438 * arg2 >> 12;
        int var8 = this.field447 * arg1 >> 12;
        if (arg0 != 1244456711) {
            this.field435 = -80;
        }
        int var9 = this.field441 * arg2 >> 12;
        int var10 = this.field445 * arg1 >> 12;
        int var11 = this.field436 * arg2 >> 12;
        class345.method2203(var5, var9, var6, var7, super.field5453, var4, -122, var8, var11, var10);
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIIIIZI)V", line = 44)
    public static final void method206(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        if (class396.field6021 <= arg1 && arg3 <= class443.field6591 && ~class410.field6176 >= ~arg0 && ~arg7 >= ~class158.field2302) {
            class465.method2779(arg3, 13950, arg2, arg4, arg7, arg1, arg5, arg0);
        } else {
            class104.method703(arg4, arg1, arg5, arg0, arg2, 8379, arg7, arg3);
        }
        if (arg6) {
            ++field443;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "()V", line = 63)
    public static final void method207() {
        class323.field4986 = 0;
        label212: for (int var0 = 0; var0 < class399.field6089; ++var0) {
            class367 var1 = class313.field4787[var0];
            if (class344.field5395 != null) {
                for (int var2 = 0; var2 < class344.field5395.length; ++var2) {
                    if (class344.field5395[var2] != -1000000 && (var1.field5638 <= class344.field5395[var2] || var1.field5653 <= class344.field5395[var2]) && (var1.field5657 <= class391.field5946[var2] || var1.field5644 <= class391.field5946[var2]) && (var1.field5657 >= class482.field7027[var2] || var1.field5644 >= class482.field7027[var2]) && (var1.field5648 <= class113.field1577[var2] || var1.field5650 <= class113.field1577[var2]) && (var1.field5648 >= field448[var2] || var1.field5650 >= field448[var2])) {
                        continue label212;
                    }
                }
            }
            if (var1.field5649 == 1) {
                int var3 = var1.field5642 - class10.field149 + class75.field1021;
                if (var3 >= 0 && var3 <= class75.field1021 + class75.field1021) {
                    int var4 = var1.field5640 - class29.field458 + class75.field1021;
                    if (var4 < 0) {
                        var4 = 0;
                    } else if (var4 > class75.field1021 + class75.field1021) {
                        continue;
                    }
                    int var5 = var1.field5646 - class29.field458 + class75.field1021;
                    if (var5 > class75.field1021 + class75.field1021) {
                        var5 = class75.field1021 + class75.field1021;
                    } else if (var5 < 0) {
                        continue;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class11.field171[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class346.field5413 - var1.field5657;
                        if (var7 > class276.field3828) {
                            var1.field5647 = 1;
                        } else {
                            if (var7 >= -class276.field3828) {
                                continue;
                            }
                            var1.field5647 = 2;
                            var7 = -var7;
                        }
                        var1.field5655 = (var1.field5648 - class178.field2540 << 8) / var7;
                        var1.field5651 = (var1.field5650 - class178.field2540 << 8) / var7;
                        var1.field5641 = (var1.field5638 - class82.field1106 << 8) / var7;
                        var1.field5654 = (var1.field5653 - class82.field1106 << 8) / var7;
                        class103.field1464[class323.field4986++] = var1;
                    }
                }
            } else if (var1.field5649 == 2) {
                int var8 = var1.field5640 - class29.field458 + class75.field1021;
                if (var8 >= 0 && var8 <= class75.field1021 + class75.field1021) {
                    int var9 = var1.field5642 - class10.field149 + class75.field1021;
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > class75.field1021 + class75.field1021) {
                        continue;
                    }
                    int var10 = var1.field5652 - class10.field149 + class75.field1021;
                    if (var10 > class75.field1021 + class75.field1021) {
                        var10 = class75.field1021 + class75.field1021;
                    } else if (var10 < 0) {
                        continue;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class11.field171[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class178.field2540 - var1.field5648;
                        if (var12 > class276.field3828) {
                            var1.field5647 = 3;
                        } else {
                            if (var12 >= -class276.field3828) {
                                continue;
                            }
                            var1.field5647 = 4;
                            var12 = -var12;
                        }
                        var1.field5643 = (var1.field5657 - class346.field5413 << 8) / var12;
                        var1.field5639 = (var1.field5644 - class346.field5413 << 8) / var12;
                        var1.field5641 = (var1.field5638 - class82.field1106 << 8) / var12;
                        var1.field5654 = (var1.field5653 - class82.field1106 << 8) / var12;
                        class103.field1464[class323.field4986++] = var1;
                    }
                }
            } else if (var1.field5649 == 4) {
                int var13 = var1.field5638 - class82.field1106;
                if (var13 > class386.field5880) {
                    int var14 = var1.field5640 - class29.field458 + class75.field1021;
                    if (var14 < 0) {
                        var14 = 0;
                    } else if (var14 > class75.field1021 + class75.field1021) {
                        continue;
                    }
                    int var15 = var1.field5646 - class29.field458 + class75.field1021;
                    if (var15 > class75.field1021 + class75.field1021) {
                        var15 = class75.field1021 + class75.field1021;
                    } else if (var15 < 0) {
                        continue;
                    }
                    int var16 = var1.field5642 - class10.field149 + class75.field1021;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (var16 > class75.field1021 + class75.field1021) {
                        continue;
                    }
                    int var17 = var1.field5652 - class10.field149 + class75.field1021;
                    if (var17 > class75.field1021 + class75.field1021) {
                        var17 = class75.field1021 + class75.field1021;
                    } else if (var17 < 0) {
                        continue;
                    }
                    boolean var18 = false;
                    label184: for (int var19 = var16; var19 <= var17; ++var19) {
                        for (int var20 = var14; var20 <= var15; ++var20) {
                            if (class11.field171[var19][var20]) {
                                var18 = true;
                                break label184;
                            }
                        }
                    }
                    if (var18) {
                        var1.field5647 = 5;
                        var1.field5643 = (var1.field5657 - class346.field5413 << 8) / var13;
                        var1.field5639 = (var1.field5644 - class346.field5413 << 8) / var13;
                        var1.field5655 = (var1.field5648 - class178.field2540 << 8) / var13;
                        var1.field5651 = (var1.field5650 - class178.field2540 << 8) / var13;
                        class103.field1464[class323.field4986++] = var1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)V", line = 315)
    public static void method208(byte arg0) {
        field449 = null;
        int var1 = 26 / ((75 - arg0) / 40);
        field446 = null;
        field448 = null;
        field450 = null;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IBI)V", line = 331)
    public final void method132(int arg0, byte arg1, int arg2) {
        ++field437;
        if (arg1 >= -43) {
            field449 = null;
        }
    }

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 341)
    public class27(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field442 = arg1;
        this.field444 = arg0;
        this.field438 = arg3;
        this.field447 = arg4;
        this.field441 = arg5;
        this.field436 = arg7;
        this.field445 = arg6;
        this.field435 = arg2;
    }
}
