import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class191 {

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "Z")
    public boolean field2648 = true;

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "I")
    public int field2649 = -1;

    @OriginalMember(owner = "client!tr", name = "h", descriptor = "I")
    private int field2653 = -1;

    @OriginalMember(owner = "client!tr", name = "m", descriptor = "I")
    private int field2658 = -1;

    @OriginalMember(owner = "client!tr", name = "n", descriptor = "I")
    public int field2659 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!tr", name = "r", descriptor = "I")
    public int field2663 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!tr", name = "g", descriptor = "I")
    private int field2652 = -1;

    @OriginalMember(owner = "client!tr", name = "A", descriptor = "Z")
    public boolean field2672 = true;

    @OriginalMember(owner = "client!tr", name = "G", descriptor = "I")
    public int field2678 = -1;

    @OriginalMember(owner = "client!tr", name = "K", descriptor = "I")
    public int field2682 = -1;

    @OriginalMember(owner = "client!tr", name = "x", descriptor = "I")
    public int field2669 = -1;

    @OriginalMember(owner = "client!tr", name = "w", descriptor = "I")
    public int field2668 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!tr", name = "l", descriptor = "I")
    private int field2657 = -1;

    @OriginalMember(owner = "client!tr", name = "y", descriptor = "I")
    public int field2670 = 0;

    @OriginalMember(owner = "client!tr", name = "N", descriptor = "Z")
    public boolean field2685 = false;

    @OriginalMember(owner = "client!tr", name = "i", descriptor = "I")
    private int field2654 = -1;

    @OriginalMember(owner = "client!tr", name = "P", descriptor = "Z")
    public boolean field2687 = true;

    @OriginalMember(owner = "client!tr", name = "R", descriptor = "[Ljava/lang/String;")
    public String[] field2689 = new String[5];

    @OriginalMember(owner = "client!tr", name = "O", descriptor = "I")
    public int field2686 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!tr", name = "v", descriptor = "I")
    public static int field2667 = 1;

    @OriginalMember(owner = "client!tr", name = "M", descriptor = "Lfg;")
    public static class83 field2684 = new class83("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

    @OriginalMember(owner = "client!tr", name = "S", descriptor = "I")
    public static int field2690 = -1;

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "I")
    public int field2650;

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "I")
    private int field2651;

    @OriginalMember(owner = "client!tr", name = "j", descriptor = "I")
    public int field2655;

    @OriginalMember(owner = "client!tr", name = "k", descriptor = "I")
    private int field2656;

    @OriginalMember(owner = "client!tr", name = "o", descriptor = "I")
    private int field2660;

    @OriginalMember(owner = "client!tr", name = "p", descriptor = "I")
    public int field2661;

    @OriginalMember(owner = "client!tr", name = "s", descriptor = "I")
    public int field2664;

    @OriginalMember(owner = "client!tr", name = "t", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!tr", name = "u", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!tr", name = "z", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!tr", name = "B", descriptor = "I")
    private int field2673;

    @OriginalMember(owner = "client!tr", name = "C", descriptor = "I")
    public int field2674;

    @OriginalMember(owner = "client!tr", name = "D", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!tr", name = "E", descriptor = "I")
    public int field2676;

    @OriginalMember(owner = "client!tr", name = "F", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!tr", name = "H", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!tr", name = "I", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!tr", name = "Q", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "Ltj;")
    public class131 field2647;

    @OriginalMember(owner = "client!tr", name = "J", descriptor = "Lbj;")
    private class159 field2681;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "Ljava/lang/String;")
    public String field2646;

    @OriginalMember(owner = "client!tr", name = "q", descriptor = "Ljava/lang/String;")
    public String field2662;

    @OriginalMember(owner = "client!tr", name = "L", descriptor = "[I")
    public int[] field2683;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Llh;I)V")
    public final void method1147(class365 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2099(255);
            if (var3 == 0) {
                field2679++;
                if (arg1 >= -97) {
                    this.method1151(48, null);
                    return;
                }
                return;
            }
            this.method1150(arg0, var3, 2);
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(III)I")
    public final int method1148(int arg0, int arg1, int arg2) {
        field2666++;
        if (this.field2681 == null) {
            return arg1;
        } else if (arg0 == 1) {
            class330 var4 = (class330) this.field2681.method979((byte) 28, (long) arg2);
            return var4 == null ? arg1 : var4.field4495;
        } else {
            return -102;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(ILvd;)Z")
    public final boolean method1149(int arg0, class30 arg1) {
        field2688++;
        int var3;
        if (this.field2657 == -1) {
            if (this.field2658 == -1) {
                return true;
            }
            var3 = arg1.method205(this.field2658, 15503);
        } else {
            var3 = arg1.method204(this.field2657, 64);
        }
        if (this.field2651 > var3 || var3 > this.field2673) {
            return false;
        }
        int var5;
        if (this.field2653 == -1) {
            if (this.field2652 == -1) {
                return true;
            }
            var5 = arg1.method205(this.field2652, arg0 ^ 0x3C8F);
        } else {
            var5 = arg1.method204(this.field2653, 64);
        }
        return var5 >= this.field2656 && var5 <= this.field2660;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Llh;II)V")
    private final void method1150(class365 arg0, int arg1, int arg2) {
        if (arg2 != 2) {
            return;
        }
        field2671++;
        if (arg1 == 1) {
            this.field2669 = arg0.method2062((byte) 14);
        } else if (arg1 == 2) {
            this.field2649 = arg0.method2062((byte) 14);
        } else if (arg1 == 3) {
            this.field2662 = arg0.method2106(-1);
        } else if (arg1 == 4) {
            this.field2676 = arg0.method2111(-2);
        } else if (arg1 == 5) {
            this.field2678 = arg0.method2111(-2);
        } else if (arg1 == 6) {
            this.field2670 = arg0.method2099(255);
            return;
        } else if (arg1 == 7) {
            int var12 = arg0.method2099(255);
            if ((var12 & 0x2) == 2) {
                this.field2685 = true;
            }
            if ((var12 & 0x1) == 0) {
                this.field2648 = false;
                return;
            }
        } else if (arg1 == 8) {
            this.field2672 = arg0.method2099(255) == 1;
            return;
        } else if (arg1 == 9) {
            this.field2658 = arg0.method2062((byte) 14);
            if (this.field2658 == 65535) {
                this.field2658 = -1;
            }
            this.field2657 = arg0.method2062((byte) 14);
            if (this.field2657 == 65535) {
                this.field2657 = -1;
            }
            this.field2651 = arg0.method2056((byte) 99);
            this.field2673 = arg0.method2056((byte) 122);
            return;
        } else if (arg1 < 10 || arg1 > 14) {
            if (arg1 != 15) {
                if (arg1 == 16) {
                    this.field2687 = false;
                    return;
                }
                if (arg1 == 17) {
                    this.field2646 = arg0.method2106(-1);
                } else if (arg1 == 18) {
                    this.field2654 = arg0.method2062((byte) 14);
                    return;
                } else if (arg1 == 19) {
                    this.field2682 = arg0.method2062((byte) 14);
                    return;
                } else if (arg1 == 20) {
                    this.field2652 = arg0.method2062((byte) 14);
                    if (this.field2652 == 65535) {
                        this.field2652 = -1;
                    }
                    this.field2653 = arg0.method2062((byte) 14);
                    if (this.field2653 == 65535) {
                        this.field2653 = -1;
                    }
                    this.field2656 = arg0.method2056((byte) -42);
                    this.field2660 = arg0.method2056((byte) -52);
                    return;
                } else if (arg1 == 21) {
                    this.field2655 = arg0.method2056((byte) 127);
                    return;
                } else if (arg1 == 22) {
                    this.field2650 = arg0.method2056((byte) 79);
                    return;
                } else if (arg1 == 249) {
                    int var4 = arg0.method2099(arg2 ^ 0xFD);
                    if (this.field2681 == null) {
                        int var5 = class420.method2513(var4, 0);
                        this.field2681 = new class159(var5);
                    }
                    for (int var6 = 0; var6 < var4; var6++) {
                        boolean var7 = arg0.method2099(arg2 + 253) == 1;
                        int var8 = arg0.method2111(-2);
                        class499 var9;
                        if (var7) {
                            var9 = new class48(arg0.method2106(-1));
                        } else {
                            var9 = new class330(arg0.method2056((byte) 103));
                        }
                        this.field2681.method990((long) var8, (byte) 7, var9);
                    }
                    return;
                }
                return;
            }
            int var10 = arg0.method2099(arg2 + 253);
            this.field2683 = new int[var10 * 2];
            for (int var11 = 0; var11 < var10 * 2; var11++) {
                this.field2683[var11] = arg0.method2069(class63.method396(arg2, -122));
            }
            this.field2674 = arg0.method2056((byte) 98);
            this.field2664 = arg0.method2056((byte) -51);
            return;
        } else {
            this.field2689[arg1 - 10] = arg0.method2106(class63.method396(arg2, -3));
            return;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(ILqa;)Lf;")
    public final class529 method1151(int arg0, class162 arg1) {
        field2665++;
        class529 var3 = (class529) this.field2647.field1811.method56((long) (arg1.field2310 << 29 | 0x20000 | this.field2654), 115);
        if (arg0 != 65535) {
            return null;
        } else if (var3 == null) {
            this.field2647.field1800.method1412(this.field2654, arg0 - 65534);
            class531 var4 = class531.method3134(this.field2647.field1800, this.field2654, 0);
            if (var4 != null) {
                var3 = arg1.method482(var4, true);
                this.field2647.field1811.method73((long) (this.field2654 | 0x20000 | arg1.field2310 << 29), var3, 26425);
            }
            return var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Ljava/lang/String;ZI)Ljava/lang/String;")
    public final String method1152(String arg0, boolean arg1, int arg2) {
        field2680++;
        if (!arg1) {
            return null;
        } else if (this.field2681 == null) {
            return arg0;
        } else {
            class48 var4 = (class48) this.field2681.method979((byte) 28, (long) arg2);
            return var4 == null ? arg0 : var4.field659;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)V")
    public static void method1153(byte arg0) {
        field2684 = null;
        if (arg0 < 56) {
            method1153((byte) -121);
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V")
    public final void method1154(int arg0) {
        field2675++;
        if (arg0 != -11 || this.field2683 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field2683.length; var2 += 2) {
            if (this.field2683[var2] < this.field2659) {
                this.field2659 = this.field2683[var2];
            } else if (this.field2668 < this.field2683[var2]) {
                this.field2668 = this.field2683[var2];
            }
            if (this.field2683[var2 + 1] < this.field2663) {
                this.field2663 = this.field2683[var2 + 1];
            } else if (this.field2686 < this.field2683[var2 + 1]) {
                this.field2686 = this.field2683[var2 + 1];
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(ZBLqa;)Lf;")
    public final class529 method1155(boolean arg0, byte arg1, class162 arg2) {
        field2677++;
        int var4 = -125 % ((63 - arg1) / 49);
        int var5 = arg0 ? this.field2649 : this.field2669;
        int var6 = arg2.field2310 << 29 | var5;
        class529 var7 = (class529) this.field2647.field1811.method56((long) var6, 113);
        if (var7 != null) {
            return var7;
        } else if (this.field2647.field1800.method1412(var5, 1)) {
            class531 var8 = class531.method3134(this.field2647.field1800, var5, 0);
            if (var8 != null) {
                var7 = arg2.method482(var8, true);
                this.field2647.field1811.method73((long) var6, var7, 26425);
            }
            return var7;
        } else {
            return null;
        }
    }
}
