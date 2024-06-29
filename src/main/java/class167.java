import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class167 {

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    public int field2729 = -1;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public int field2725 = -1;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "Z")
    public boolean field2727 = false;

    @OriginalMember(owner = "client!pb", name = "x", descriptor = "I")
    public int field2744 = 5;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "I")
    public int field2739 = -1;

    @OriginalMember(owner = "client!pb", name = "D", descriptor = "Z")
    public boolean field2750 = false;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
    public int field2737 = -1;

    @OriginalMember(owner = "client!pb", name = "A", descriptor = "I")
    public int field2747 = -1;

    @OriginalMember(owner = "client!pb", name = "B", descriptor = "Z")
    public boolean field2748 = false;

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "Z")
    public boolean field2743 = false;

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "I")
    public int field2742 = 2;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
    public int field2740 = 99;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public static int field2728 = -1;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field2721 = 0;

    @OriginalMember(owner = "client!pb", name = "y", descriptor = "I")
    public static int field2745 = 0;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
    public int field2732;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!pb", name = "C", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "[I")
    private int[] field2731;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "[I")
    public int[] field2736;

    @OriginalMember(owner = "client!pb", name = "E", descriptor = "[I")
    public int[] field2751;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "[Z")
    public boolean[] field2730;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "[[I")
    public static int[][] field2735;

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "[[I")
    public int[][] field2741;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
    public static void method1116(int arg0) {
        field2735 = null;
        if (arg0 < 37) {
            field2728 = 27;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lnh;B)V")
    public static final void method1117(class288 arg0, byte arg1) {
        field2734++;
        class57 var2 = (class57) class58.field1018.method779(55, class103.method702(true, arg0.field4601));
        if (arg1 > -77) {
            field2745 = -33;
        }
        if (var2 == null) {
            class155.method1066(arg0.field1486[0], arg0, class176.field2886, (class141) null, 0, 6330, arg0.field1464[0], (class206) null);
        } else {
            var2.method355(-122);
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V")
    public final void method1118(int arg0) {
        if (arg0 != 16) {
            return;
        }
        if (this.field2739 == -1) {
            if (this.field2730 == null) {
                this.field2739 = 0;
            } else {
                this.field2739 = 2;
            }
        }
        field2749++;
        if (this.field2747 != -1) {
            return;
        }
        if (this.field2730 == null) {
            this.field2747 = 0;
        } else {
            this.field2747 = 2;
        }
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)Ldc;")
    public static final class7 method1119(int arg0) {
        field2738++;
        if (arg0 != 6) {
            field2745 = -80;
        }
        try {
            return (class7) Class.forName("wi").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIILba;)Lba;")
    public final class279 method1120(int arg0, int arg1, int arg2, int arg3, class279 arg4) {
        field2723++;
        int var6 = this.field2751[arg3];
        if (arg2 != -1800487568) {
            this.field2739 = -68;
        }
        int var7 = this.field2736[arg3];
        class259 var8 = class89.method579(arg2 ^ 0x94AEBD27, var7 >> 16);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg4.method99(true, true, true);
        }
        class259 var10 = null;
        if ((this.field2727 || class261.field4255) && arg0 != -1 && this.field2736.length > arg0) {
            int var11 = this.field2736[arg0];
            var10 = class89.method579(arg2 + 1800487655, var11 >> 16);
            arg0 = var11 & 0xFFFF;
        }
        class279 var12;
        if (var10 == null) {
            var12 = arg4.method99(!var8.method1718(15693, var9), !var8.method1719(var9, 0), !this.field2750);
        } else {
            var12 = arg4.method99(!var8.method1718(15693, var9) & !var10.method1718(arg2 + 1800503261, arg0), !var8.method1719(var9, 0) & !var10.method1719(arg0, 0), !this.field2750);
        }
        var12.method1827(var8, var9, var10, arg0, arg1 - 1, var6, this.field2750);
        return var12;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Leh;I)V")
    public final void method1121(class101 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method669((byte) 36);
            if (var3 == 0) {
                field2733++;
                int var4 = -76 / ((arg1 - 28) / 37);
                return;
            }
            this.method1122(arg0, var3, -127);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Leh;II)V")
    private final void method1122(class101 arg0, int arg1, int arg2) {
        field2722++;
        if (arg1 == 1) {
            int var13 = arg0.method677(false);
            this.field2751 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field2751[var14] = arg0.method677(false);
            }
            this.field2736 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field2736[var15] = arg0.method677(false);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field2736[var16] = (arg0.method677(false) << 16) + this.field2736[var16];
            }
        } else if (arg1 == 2) {
            this.field2725 = arg0.method677(false);
        } else if (arg1 == 3) {
            this.field2730 = new boolean[256];
            int var4 = arg0.method669((byte) 36);
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2730[arg0.method669((byte) 36)] = true;
            }
        } else if (arg1 == 4) {
            this.field2743 = true;
        } else if (arg1 == 5) {
            this.field2744 = arg0.method669((byte) 36);
        } else if (arg1 == 6) {
            this.field2729 = arg0.method677(false);
        } else if (arg1 == 7) {
            this.field2737 = arg0.method677(false);
        } else if (arg1 == 8) {
            this.field2740 = arg0.method669((byte) 36);
        } else if (arg1 == 9) {
            this.field2739 = arg0.method669((byte) 36);
        } else if (arg1 == 10) {
            this.field2747 = arg0.method669((byte) 36);
        } else if (arg1 == 11) {
            this.field2742 = arg0.method669((byte) 36);
        } else if (arg1 == 12) {
            int var6 = arg0.method669((byte) 36);
            this.field2731 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2731[var7] = arg0.method677(false);
            }
            for (int var8 = 0; var8 < var6; var8++) {
                this.field2731[var8] = (arg0.method677(false) << 16) + this.field2731[var8];
            }
        } else if (arg1 == 13) {
            int var9 = arg0.method677(false);
            this.field2741 = new int[var9][];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = arg0.method669((byte) 36);
                if (var11 > 0) {
                    this.field2741[var10] = new int[var11];
                    this.field2741[var10][0] = arg0.method658(22292);
                    for (int var12 = 1; var12 < var11; var12++) {
                        this.field2741[var10][var12] = arg0.method677(false);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field2750 = true;
        } else if (arg1 == 15) {
            this.field2727 = true;
        } else if (arg1 == 16) {
            this.field2748 = true;
        }
        if (arg2 > -124) {
            this.field2742 = 118;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IILba;III)Lba;")
    public final class279 method1123(int arg0, int arg1, class279 arg2, int arg3, int arg4, int arg5) {
        field2726++;
        int var7 = this.field2751[arg3];
        int var8 = this.field2736[arg3];
        class259 var9 = class89.method579(87, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg2.method129(true, true, true);
        }
        int var11 = arg5 & 0x3;
        class259 var12 = null;
        if ((this.field2727 || class261.field4255) && arg4 != -1 && arg4 < this.field2736.length) {
            int var13 = this.field2736[arg4];
            var12 = class89.method579(arg0 + 87, var13 >> 16);
            arg4 = var13 & 0xFFFF;
        }
        class279 var14;
        if (var12 == null) {
            var14 = arg2.method129(!var9.method1718(15693, var10), !var9.method1719(var10, 0), !this.field2750);
        } else {
            var14 = arg2.method129(!var9.method1718(15693, var10) & !var12.method1718(15693, arg4), !var9.method1719(var10, 0) & !var12.method1719(arg4, 0), !this.field2750);
        }
        if (arg0 != 0) {
            method1119(-20);
        }
        if (var11 == 1) {
            var14.method130();
        } else if (var11 == 2) {
            var14.method117();
        } else if (var11 == 3) {
            var14.method133();
        }
        var14.method1827(var9, var10, var12, arg4, arg1 - 1, var7, this.field2750);
        if (var11 == 1) {
            var14.method133();
        } else if (var11 == 2) {
            var14.method117();
        } else if (var11 == 3) {
            var14.method130();
        }
        return var14;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IBILba;I)Lba;")
    public final class279 method1124(int arg0, byte arg1, int arg2, class279 arg3, int arg4) {
        field2724++;
        int var6 = this.field2751[arg2];
        int var7 = this.field2736[arg2];
        class259 var8 = class89.method579(87, var7 >> 16);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg3.method121(true, true, true);
        }
        class259 var10 = null;
        if ((this.field2727 || class261.field4255) && arg0 != -1 && this.field2736.length > arg0) {
            int var11 = this.field2736[arg0];
            var10 = class89.method579(87, var11 >> 16);
            arg0 = var11 & 0xFFFF;
        }
        class259 var12 = null;
        class259 var13 = null;
        int var14 = 0;
        int var15 = 0;
        if (this.field2731 != null) {
            if (arg2 < this.field2731.length) {
                var14 = this.field2731[arg2];
                if (var14 != 65535) {
                    var13 = class89.method579(87, var14 >> 16);
                    var14 &= 0xFFFF;
                }
            }
            if ((this.field2727 || class261.field4255) && arg0 != -1 && arg0 < this.field2731.length) {
                var15 = this.field2731[arg0];
                if (var15 != 65535) {
                    var12 = class89.method579(87, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
        }
        boolean var16 = !var8.method1718(15693, var9);
        boolean var17 = !var8.method1719(var9, 0);
        if (var13 != null) {
            var16 &= !var13.method1718(15693, var14);
            var17 &= !var13.method1719(var14, 0);
        }
        if (var10 != null) {
            var16 &= !var10.method1718(15693, arg0);
            var17 &= !var10.method1719(arg0, 0);
        }
        if (var12 != null) {
            var16 &= !var12.method1718(15693, var15);
            var17 &= !var12.method1719(var15, 0);
        }
        class279 var18 = arg3.method121(var16, var17, !this.field2750);
        var18.method1827(var8, var9, var10, arg0, arg4 - 1, var6, this.field2750);
        if (arg1 >= -119) {
            return null;
        } else {
            if (var13 != null) {
                var18.method1827(var13, var14, var12, var15, arg4 - 1, var6, this.field2750);
            }
            return var18;
        }
    }
}
