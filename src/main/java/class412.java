import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class412 {

    @OriginalMember(owner = "client!id", name = "u", descriptor = "Z")
    private boolean field5678 = false;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "I")
    private int field5676 = -1;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    private int field5664 = -1;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    private int field5662 = -32768;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "Z")
    private boolean field5668 = false;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public int field5659;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public int field5671;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public int field5667;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    private int field5670;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "I")
    private int field5674;

    @OriginalMember(owner = "client!id", name = "B", descriptor = "B")
    private byte field5685;

    @OriginalMember(owner = "client!id", name = "z", descriptor = "B")
    private byte field5683;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "Z")
    private boolean field5661;

    @OriginalMember(owner = "client!id", name = "x", descriptor = "Z")
    public static boolean field5681 = false;

    @OriginalMember(owner = "client!id", name = "G", descriptor = "Lff;")
    public static class9 field5690 = new class9(2, 3);

    @OriginalMember(owner = "client!id", name = "J", descriptor = "I")
    public static int field5693 = 0;

    @OriginalMember(owner = "client!id", name = "K", descriptor = "I")
    public static int field5694 = -1;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    private int field5658;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public static int field5666;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public static int field5669;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    public static int field5673;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "I")
    public static int field5675;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "I")
    private int field5677;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "I")
    private int field5679;

    @OriginalMember(owner = "client!id", name = "w", descriptor = "I")
    public static int field5680;

    @OriginalMember(owner = "client!id", name = "y", descriptor = "I")
    public static int field5682;

    @OriginalMember(owner = "client!id", name = "A", descriptor = "I")
    public static int field5684;

    @OriginalMember(owner = "client!id", name = "C", descriptor = "I")
    public static int field5686;

    @OriginalMember(owner = "client!id", name = "D", descriptor = "I")
    private int field5687;

    @OriginalMember(owner = "client!id", name = "E", descriptor = "I")
    public static int field5688;

    @OriginalMember(owner = "client!id", name = "F", descriptor = "I")
    public static int field5689;

    @OriginalMember(owner = "client!id", name = "I", descriptor = "I")
    public static int field5692;

    @OriginalMember(owner = "client!id", name = "L", descriptor = "I")
    public static int field5695;

    @OriginalMember(owner = "client!id", name = "M", descriptor = "I")
    public static int field5696;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "Lc;")
    private class121 field5660;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "Lj;")
    private class377 field5663;

    @OriginalMember(owner = "client!id", name = "H", descriptor = "Llr;")
    public class527 field5691;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "Ldc;")
    private class5 field5665;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "[Z")
    private boolean[] field5672;

    static {
        new class304("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lc;Lqa;IZIIIZ)V", line = 9)
    public final void method2376(class121 arg0, class162 arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field5675++;
        class96[] var9 = arg0.method851();
        class516[] var10 = arg0.method840();
        if (!arg3) {
            this.method2376(null, null, 112, false, -121, 2, 33, true);
        }
        if ((this.field5691 == null || this.field5691.field7790) && (var9 != null || var10 != null)) {
            class1 var11 = class402.field5388.method1994(-17294, this.field5671);
            if (var11.field58 != null) {
                var11 = var11.method17(class301.field3980, -89);
            }
            if (var11 != null) {
                this.field5691 = new class527(class31.field516);
            }
        }
        if (this.field5691 == null) {
            return;
        }
        if (arg7) {
            this.field5691.method3107(arg1, (long) class31.field516, var9, var10, false);
        } else {
            this.field5691.method3095((long) class31.field516);
        }
        this.field5691.method3106(this.field5683, arg2, arg6, arg5, arg4);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IB)V", line = 49)
    public final void method2377(int arg0, byte arg1) {
        field5682++;
        if (arg1 < 18) {
            this.method2380(false, true, null, 22, -2, 100, -19);
        }
        this.field5668 = true;
        this.method2383(10, arg0);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lcr;B)V", line = 63)
    public static final void method2378(class403 arg0, byte arg1) {
        if (class56.field884 == arg0.field5435) {
            class204.field2824[arg0.field5501] = true;
        }
        field5688++;
        if (arg1 >= -111) {
            field5694 = 35;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lqa;I)V", line = 81)
    public final void method2379(class162 arg0, int arg1) {
        field5680++;
        this.method2380(true, true, arg0, this.field5670, this.field5674, 262144, -1);
        if (arg1 != -6659) {
            field5690 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZZLqa;IIII)Lc;", line = 105)
    public final class121 method2380(boolean arg0, boolean arg1, class162 arg2, int arg3, int arg4, int arg5, int arg6) {
        field5692++;
        class1 var8 = class402.field5388.method1994(-17294, this.field5671);
        if (var8.field58 != null) {
            var8 = var8.method17(class301.field3980, arg6 ^ 0x15);
        }
        if (var8 == null) {
            this.method2381(0, arg2);
            this.field5676 = this.field5679;
            this.field5664 = -1;
            return null;
        }
        if (!this.field5668 && this.field5664 != var8.field33) {
            this.field5660 = null;
            this.method2383(10, -1);
        }
        this.method2384(arg4, arg6 ^ 0xFFFFFFC9, arg3);
        boolean var9 = arg1 & this.field5661 & class154.field2244.method3089((byte) 122, class166.field2414) != 0;
        boolean var10 = var9 & (this.field5664 != var8.field33 || (this.field5679 != this.field5676 || this.field5665 != null && (this.field5665.field134 || class89.field1364) && this.field5687 != this.field5679) && class154.field2244.method3089((byte) 99, class166.field2414) >= 2);
        if (arg0 && !var10) {
            this.field5676 = this.field5679;
            this.field5664 = var8.field33;
            return null;
        }
        if (var10) {
            class238.method1477(this.field5663, this.field5685, this.field5674, this.field5670, this.field5672);
        }
        class35 var11 = class141.field2049[this.field5685];
        if (arg6 != -1) {
            field5693 = 1;
        }
        class35 var12;
        if (this.field5678) {
            var12 = class209.field2868[0];
        } else {
            var12 = this.field5685 < 3 ? class141.field2049[this.field5685 + 1] : null;
        }
        class121 var13 = null;
        if (this.field5665 != null) {
            if (var10) {
                arg5 |= 0x40000;
            }
            var13 = var8.method8(var12, this.field5687, this.field5659 == 11 ? 10 : this.field5659, this.field5665, this.field5677, (byte) 76, this.field5679, arg5, var11.method276(this.field5674, this.field5670), arg2, var11, this.field5659 == 11 ? this.field5667 + 4 : this.field5667, this.field5674, this.field5670);
            if (var13 == null) {
                this.field5663 = null;
                this.field5672 = null;
                this.field5662 = 0;
            } else {
                if (var10) {
                    if (this.field5672 == null) {
                        this.field5672 = new boolean[4];
                    }
                    this.field5663 = var13.method858(this.field5663);
                    class382.method2269(this.field5663, this.field5685, arg4, arg3, this.field5672);
                }
                this.field5662 = var13.method861();
            }
            this.field5660 = null;
        } else if (this.field5660 != null && arg5 == (arg5 & this.field5660.method854()) && this.field5664 == var8.field33) {
            var13 = this.field5660;
        } else {
            if (this.field5660 != null) {
                arg5 |= this.field5660.method854();
            }
            class208 var14 = var8.method19(var10, this.field5659 == 11 ? 10 : this.field5659, arg2, this.field5670, var11, arg5, 87, var12, this.field5674, this.field5659 == 11 ? this.field5667 + 4 : this.field5667, var11.method276(this.field5674, this.field5670));
            if (var14 == null) {
                this.field5672 = null;
                this.field5662 = 0;
                this.field5663 = null;
                this.field5660 = null;
            } else {
                var13 = var14.field2861;
                this.field5660 = var14.field2861;
                if (var10) {
                    this.field5663 = var14.field2862;
                    this.field5672 = null;
                    class382.method2269(this.field5663, this.field5685, arg4, arg3, null);
                }
                this.field5662 = var13.method861();
            }
        }
        this.field5664 = var8.field33;
        this.field5670 = arg3;
        this.field5674 = arg4;
        this.field5676 = this.field5679;
        return var13;
    }

    @OriginalMember(owner = "client!id", name = "finalize", descriptor = "()V", line = 230)
    protected final void finalize() {
        if (this.field5691 != null) {
            this.field5691.method3099();
        }
        field5684++;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILqa;)V", line = 241)
    public final void method2381(int arg0, class162 arg1) {
        field5669++;
        if (this.field5663 != null) {
            class238.method1477(this.field5663, this.field5685, this.field5674, this.field5670, this.field5672);
            this.field5663 = null;
            this.field5672 = null;
        }
        if (arg0 != 0) {
            method2378(null, (byte) 120);
        }
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lqa;Lus;IIIIIIZI)V", line = 732)
    public class412(class162 arg0, class1 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field5659 = arg2;
        this.field5671 = arg1.field33;
        this.field5667 = arg3;
        this.field5670 = arg7;
        this.field5674 = arg6;
        this.field5685 = (byte) arg5;
        this.field5683 = (byte) arg4;
        this.field5678 = arg8;
        this.field5661 = arg0.method557() && arg1.field71 && !this.field5678;
        if (arg9 != -1) {
            this.field5668 = true;
        }
        this.method2383(10, arg9);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V", line = 267)
    public static final void method2382(int arg0) {
        field5673++;
        class501.field6923.method1670((byte) -104);
        for (class39 var1 = (class39) class415.field5733.method1672((byte) -90); var1 != null; var1 = (class39) class415.field5733.method1668(arg0 - 3)) {
            if (var1.field590 < 1000) {
                var1.method300(false);
                class501.field6923.method1666((byte) 125, var1);
            }
        }
        class501.field6923.method1665((byte) 90, class415.field5733);
        int var2 = -1;
        class378 var3 = (class378) class511.field7294.method1672((byte) -122);
        if (var3 != null) {
            var2 = var3.method256((byte) -127);
        }
        if (class379.field5189) {
            if (var2 == -1) {
                int var4 = class267.field3526.method1302(arg0 - 4364);
                int var5 = class267.field3526.method1297(true);
                if ((class232.field3126 - 10) > var4 || var4 > class232.field3126 + class381.field5207 + 10 || var5 < class462.field6398 - 10 || (class522.field7714 + class462.field6398 + 10) < var5) {
                    class379.field5189 = false;
                    class366.method2134(0, class232.field3126, class381.field5207, class462.field6398, class522.field7714);
                }
            }
            if (var2 == 0) {
                int var6 = class232.field3126;
                int var7 = class462.field6398;
                int var8 = class381.field5207;
                int var9 = var3.method255(116);
                int var10 = var3.method263((byte) -128);
                int var11 = -1;
                for (int var12 = 0; var12 < field5693; var12++) {
                    if (class206.field2843) {
                        int var17 = (field5693 - var12 - 1) * 16 + var7 + 33;
                        if (var9 > var6 && var6 + var8 > var9 && var10 > (var17 - 13) && (var17 + 4) > var10) {
                            var11 = var12;
                        }
                    } else {
                        int var16 = (field5693 - var12 - 1) * 16 + var7 + 31;
                        if (var9 > var6 && var9 < (var6 + var8) && var16 - 13 < var10 && var16 + 3 > var10) {
                            var11 = var12;
                        }
                    }
                }
                if (var11 != -1) {
                    int var13 = 0;
                    class290 var14 = new class290(class415.field5733);
                    for (class39 var15 = (class39) var14.method1707((byte) 124); var15 != null; var15 = (class39) var14.method1703(63)) {
                        if (var11 == var13) {
                            class355.method2075(var9, 82, var10, var15);
                        }
                        var13++;
                    }
                }
                class379.field5189 = false;
                class366.method2134(0, class232.field3126, class381.field5207, class462.field6398, class522.field7714);
            }
        } else {
            if (var2 == 0 && (class513.field7561 == 1 && field5693 > 2 || class277.method1649(-2001))) {
                var2 = 2;
            }
            if (var2 == 2 && field5693 > 0 && var3 != null) {
                if (class484.field6735 == null && class78.field1175 == 0) {
                    class281.method1676(var3.method263((byte) -128), var3.method255(125), true);
                } else {
                    class347.field4686 = 2;
                }
            }
            if (var2 == 0 && field5693 > 0) {
                class124.method904(false);
            }
            if (class484.field6735 == null && class78.field1175 == 0) {
                class44.field663 = null;
                class347.field4686 = 0;
            }
        }
        if (arg0 != 2) {
            field5690 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II)V", line = 428)
    private final void method2383(int arg0, int arg1) {
        field5696++;
        int var3 = arg1;
        boolean var4 = false;
        if (arg1 == -1) {
            class1 var5 = class402.field5388.method1994(-17294, this.field5671);
            class1 var6 = var5;
            if (var5.field58 != null) {
                var5 = var5.method17(class301.field3980, -114);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field43 != null) {
                if (this.field5665 != null && var5.method14(this.field5665.field139, 0)) {
                    return;
                }
                var3 = var5.method4((byte) 27);
                if (this.field5664 != var5.field33) {
                    var4 = var5.field53;
                }
            } else if (var5.field74 == -1) {
                if (var6 != null && var6.field43 != null) {
                    if (this.field5665 != null && var6.method14(this.field5665.field139, arg0 - 10)) {
                        return;
                    }
                    var3 = var6.method4((byte) 48);
                    if (this.field5664 != var6.field33) {
                        var4 = var6.field53;
                    }
                } else if (var6 != null && var6.field74 != -1 && this.field5664 != var6.field33) {
                    var3 = var6.field74;
                    var4 = var6.field53;
                }
            } else if (this.field5664 != var5.field33) {
                var3 = var5.field74;
                var4 = var5.field53;
            }
        }
        if (arg0 != 10) {
            this.method2379(null, 112);
        }
        if (var3 == -1) {
            this.field5665 = null;
            return;
        }
        this.field5660 = null;
        if (this.field5665 == null || this.field5665.field139 != var3) {
            this.field5665 = class423.field5791.method1601(var3, (byte) -128);
        } else if (this.field5665.field126 == 0) {
            return;
        }
        if (this.field5665.field129 == null) {
            this.field5665 = null;
            return;
        }
        if (var4) {
            this.field5679 = (int) (Math.random() * (double) this.field5665.field129.length);
            this.field5677 = (int) ((double) this.field5665.field127[this.field5679] * Math.random()) + 1;
        } else {
            this.field5679 = 0;
            this.field5677 = 1;
        }
        this.field5687 = this.field5679 + 1;
        if (this.field5687 < 0 || this.field5665.field129.length <= this.field5687) {
            this.field5687 = -1;
        }
        this.field5658 = class31.field516 - this.field5677;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(III)V", line = 557)
    private final void method2384(int arg0, int arg1, int arg2) {
        int var4 = 93 / ((arg1 + 49) / 57);
        field5686++;
        label88: while (true) {
            if (this.field5665 == null) {
                if (this.field5668) {
                    return;
                }
                this.method2383(10, -1);
                if (this.field5665 == null) {
                    return;
                }
            }
            int var5 = class31.field516 - this.field5658;
            if (var5 > 100 && this.field5665.field125 > 0) {
                int var6 = this.field5665.field129.length - this.field5665.field125;
                while (var6 > this.field5679 && var5 > this.field5665.field127[this.field5679]) {
                    var5 -= this.field5665.field127[this.field5679];
                    this.field5679++;
                }
                if (this.field5679 >= var6) {
                    int var7 = 0;
                    for (int var8 = var6; var8 < this.field5665.field129.length; var8++) {
                        var7 += this.field5665.field127[var8];
                    }
                    var5 %= var7;
                }
                this.field5687 = this.field5679 + 1;
                if (this.field5687 >= this.field5665.field129.length) {
                    this.field5687 -= this.field5665.field125;
                    if (this.field5687 < 0 || this.field5665.field129.length <= this.field5687) {
                        this.field5687 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (var5 <= this.field5665.field127[this.field5679]) {
                            this.field5658 = class31.field516 - var5;
                            this.field5677 = var5;
                            return;
                        }
                        class291.method1711(this.field5665, this.field5679, arg2, -79, this.field5683, arg0, false);
                        var5 -= this.field5665.field127[this.field5679];
                        this.field5679++;
                        if (this.field5665.field129.length <= this.field5679) {
                            this.field5679 -= this.field5665.field125;
                            if (this.field5679 < 0 || this.field5679 >= this.field5665.field129.length) {
                                this.field5665 = null;
                                continue label88;
                            }
                        }
                        this.field5687 = this.field5679 + 1;
                    } while (this.field5687 < this.field5665.field129.length);
                    this.field5687 -= this.field5665.field125;
                } while (this.field5687 >= 0 && this.field5665.field129.length > this.field5687);
                this.field5687 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)I", line = 655)
    public final int method2385(int arg0) {
        if (arg0 == -1) {
            field5689++;
            return this.field5662;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(I)V", line = 667)
    public static void method2386(int arg0) {
        field5690 = null;
        if (arg0 <= 48) {
            method2378(null, (byte) 117);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)Z", line = 678)
    public final boolean method2387(boolean arg0) {
        field5666++;
        if (arg0) {
            this.field5677 = 110;
        }
        return this.field5661;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IZIII)V", line = 690)
    public static final void method2388(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field5695++;
        class287.field3753 = 0L;
        int var5 = class170.method1136((byte) 116);
        if (arg4 == 3 || var5 == 3) {
            arg1 = true;
        }
        if (!class370.field4984.method543()) {
            arg1 = true;
        }
        int var6 = -104 / ((arg0 - 43) / 33);
        class327.method1892(arg1, -8315, var5, arg2, arg4, arg3);
    }
}
