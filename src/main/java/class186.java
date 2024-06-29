import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class186 {

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public int field2695 = 16;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    public int field2691 = 128;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "Z")
    public boolean field2692 = false;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "Z")
    public boolean field2700 = true;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    public int field2697 = 8;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "Z")
    public boolean field2698 = true;

    @OriginalMember(owner = "client!md", name = "r", descriptor = "I")
    public int field2708 = -1;

    @OriginalMember(owner = "client!md", name = "p", descriptor = "I")
    public int field2706 = 1190717;

    @OriginalMember(owner = "client!md", name = "v", descriptor = "I")
    public int field2712 = -1;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "I")
    public int field2703 = -1;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public int field2693 = 0;

    @OriginalMember(owner = "client!md", name = "y", descriptor = "I")
    public int field2715 = 127;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "[I")
    public static int[] field2701 = new int[4096];

    @OriginalMember(owner = "client!md", name = "w", descriptor = "Lgi;")
    public static class437 field2713;

    @OriginalMember(owner = "client!md", name = "t", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!md", name = "A", descriptor = "J")
    public static long field2717;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public int field2699;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!md", name = "s", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!md", name = "u", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!md", name = "z", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!md", name = "x", descriptor = "Lmn;")
    public static class162 field2714;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "Lsm;")
    public class70 field2696;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public static void method1158(int arg0) {
        field2701 = null;
        field2714 = null;
        field2713 = null;
        if (arg0 != -8241) {
            field2717 = -34L;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BLhw;)V")
    public final void method1159(byte arg0, class208 arg1) {
        if (arg0 <= 73) {
            return;
        }
        field2702++;
        while (true) {
            int var3 = arg1.method1445(101);
            if (var3 == 0) {
                return;
            }
            this.method1166(31289, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Ltm;Z)Z")
    public static final boolean method1160(class423 arg0, boolean arg1) {
        boolean var2 = class53.field732 == class103.field1520;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method423(-119);
        if (arg0.field6423 < 0 || arg0.field6424 < 0 || arg0.field6420 >= class252.field4075 || arg0.field6418 >= class131.field1773) {
            return false;
        }
        for (int var6 = arg0.field6423; var6 <= arg0.field6420; var6++) {
            for (int var9 = arg0.field6424; var9 <= arg0.field6418; var9++) {
                class409 var10 = class207.method1413(arg0.field6419, var6, var9);
                if (var10 != null) {
                    int var11 = 0;
                    if (var6 > arg0.field6423) {
                        var11++;
                    }
                    if (var6 < arg0.field6420) {
                        var11 += 4;
                    }
                    if (var9 > arg0.field6424) {
                        var11 += 8;
                    }
                    if (var9 < arg0.field6418) {
                        var11 += 2;
                    }
                    class192 var12 = class357.method2370(var11, arg0, 1);
                    class192 var13 = var10.field6175;
                    if (var13 == null) {
                        var10.field6175 = var12;
                    } else {
                        while (var13.field2841 != null) {
                            var13 = var13.field2841;
                        }
                        var13.field2841 = var12;
                    }
                    var10.field6193 = (byte) (var10.field6193 | var11);
                    if (var2 && (class476.field7285[var6][var9] & 0xFF000000) != 0) {
                        var3 = class476.field7285[var6][var9];
                        var4 = class350.field5453[var6][var9];
                        var5 = class413.field6247[var6][var9];
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var7 = arg0.field6423; var7 <= arg0.field6420; var7++) {
                for (int var8 = arg0.field6424; var8 <= arg0.field6418; var8++) {
                    if ((class476.field7285[var7][var8] & 0xFF000000) == 0) {
                        class476.field7285[var7][var8] = var3;
                        class350.field5453[var7][var8] = var4;
                        class413.field6247[var7][var8] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class137.field1880[class518.field7686++] = arg0;
        }
        return true;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method1161(String arg0, int arg1, int arg2) {
        class81.method578((byte) 66, class396.field5993);
        class162.field2326++;
        if (arg2 != 24590) {
            field2717 = 14L;
        }
        field2694++;
        class170.field2488.method1479((byte) -101, class147.method896(arg0, (byte) -99) + 1);
        class170.field2488.method1458(arg0, (byte) 78);
        class170.field2488.method1468(128, arg1);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
    public static final void method1162(byte arg0) {
        field2704++;
        class484.field7358 = class378.field5807.field5304 + class378.field5807.field5295 + 2;
        class240.field3902 = class306.field4807.field5304 + class306.field4807.field5295 + 2;
        class390.field5937 = new String[500];
        if (arg0 >= 118) {
            for (int var1 = 0; var1 < class390.field5937.length; var1++) {
                class390.field5937[var1] = "";
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(B)V")
    public final void method1163(byte arg0) {
        if (this.field2712 == -1) {
            this.field2712 = this.field2708;
        }
        field2705++;
        if (arg0 <= 124) {
            this.field2697 = -119;
        }
        this.field2697 = this.field2699 | this.field2697 << 8;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIILjava/lang/String;[B)I")
    public static final int method1164(int arg0, int arg1, int arg2, int arg3, String arg4, byte[] arg5) {
        field2707++;
        int var6 = arg3 - arg0;
        for (int var7 = 0; var7 < var6; var7++) {
            char var9 = arg4.charAt(arg0 + var7);
            if (!(var9 <= '\u0000' || var9 >= '\u0080') || !(var9 < ' ' || var9 > 'ÿ')) {
                arg5[arg1 + var7] = (byte) var9;
            } else if (var9 == '€') {
                arg5[arg1 + var7] = -128;
            } else if (var9 == '‚') {
                arg5[arg1 + var7] = -126;
            } else if (var9 == 'ƒ') {
                arg5[arg1 + var7] = -125;
            } else if (var9 == '„') {
                arg5[arg1 + var7] = -124;
            } else if (var9 == '…') {
                arg5[arg1 + var7] = -123;
            } else if (var9 == '†') {
                arg5[arg1 + var7] = -122;
            } else if (var9 == '‡') {
                arg5[arg1 + var7] = -121;
            } else if (var9 == 'ˆ') {
                arg5[arg1 + var7] = -120;
            } else if (var9 == '‰') {
                arg5[arg1 + var7] = -119;
            } else if (var9 == 'Š') {
                arg5[arg1 + var7] = -118;
            } else if (var9 == '‹') {
                arg5[arg1 + var7] = -117;
            } else if (var9 == 'Œ') {
                arg5[arg1 + var7] = -116;
            } else if (var9 == 'Ž') {
                arg5[arg1 + var7] = -114;
            } else if (var9 == '‘') {
                arg5[arg1 + var7] = -111;
            } else if (var9 == '’') {
                arg5[arg1 + var7] = -110;
            } else if (var9 == '“') {
                arg5[arg1 + var7] = -109;
            } else if (var9 == '”') {
                arg5[arg1 + var7] = -108;
            } else if (var9 == '•') {
                arg5[arg1 + var7] = -107;
            } else if (var9 == '–') {
                arg5[arg1 + var7] = -106;
            } else if (var9 == '—') {
                arg5[arg1 + var7] = -105;
            } else if (var9 == '˜') {
                arg5[arg1 + var7] = -104;
            } else if (var9 == '™') {
                arg5[arg1 + var7] = -103;
            } else if (var9 == 'š') {
                arg5[arg1 + var7] = -102;
            } else if (var9 == '›') {
                arg5[arg1 + var7] = -101;
            } else if (var9 == 'œ') {
                arg5[arg1 + var7] = -100;
            } else if (var9 == 'ž') {
                arg5[arg1 + var7] = -98;
            } else if (var9 == 'Ÿ') {
                arg5[arg1 + var7] = -97;
            } else {
                arg5[arg1 + var7] = 63;
            }
        }
        int var8 = -1 / ((arg2 + 61) / 43);
        return var6;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lza;Lbm;IIIII)V")
    public static final void method1165(class497 arg0, class484 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class297.field4675 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class252.field4075) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class131.field1773 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class409 var15 = class217.field3699[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class53.field732[var12].method688(var13, var14) + class53.field732[var12].method688(var13 + 1, var14) + class53.field732[var12].method688(var13, var14 + 1) + class53.field732[var12].method688(var13 + 1, var14 + 1)) / 4 - (class53.field732[arg2].method688(arg3, arg4) + class53.field732[arg2].method688(arg3 + 1, arg4) + class53.field732[arg2].method688(arg3, arg4 + 1) + class53.field732[arg2].method688(arg3 + 1, arg4 + 1)) / 4;
                                    class477 var17 = var15.field6180;
                                    class477 var18 = var15.field6188;
                                    if (var17 != null && var17.method936(false)) {
                                        arg1.method938(var16, arg0, (var14 - arg4) * class42.field454 + (1 - arg6) * class376.field5781, var7, (byte) 126, (var13 - arg3) * class42.field454 + (1 - arg5) * class376.field5781, var17);
                                    }
                                    if (var18 != null && var18.method936(false)) {
                                        arg1.method938(var16, arg0, (var14 - arg4) * class42.field454 + (1 - arg6) * class376.field5781, var7, (byte) 70, (var13 - arg3) * class42.field454 + (1 - arg5) * class376.field5781, var18);
                                    }
                                    for (class192 var19 = var15.field6175; var19 != null; var19 = var19.field2841) {
                                        class423 var20 = var19.field2845;
                                        if (var20 != null && var20.method936(false) && (var20.field6423 == var13 || var8 == var13) && (var20.field6424 == var14 || var10 == var14)) {
                                            int var21 = var20.field6420 + 1 - var20.field6423;
                                            int var22 = var20.field6418 + 1 - var20.field6424;
                                            arg1.method938(var16, arg0, (var20.field6424 - arg4) * class42.field454 + (var22 - arg6) * class376.field5781, var7, (byte) -56, (var20.field6423 - arg3) * class42.field454 + (var21 - arg5) * class376.field5781, var20);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var8--;
                var7 = false;
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IILhw;)V")
    private final void method1166(int arg0, int arg1, class208 arg2) {
        if (arg0 != 31289) {
            return;
        }
        if (arg1 == 1) {
            this.field2693 = class305.method2055(arg2.method1452(arg0 - 31286), -1);
        } else if (arg1 == 2) {
            this.field2708 = arg2.method1445(-120);
        } else if (arg1 == 3) {
            this.field2708 = arg2.method1455(arg0 - 34676);
            if (this.field2708 == 65535) {
                this.field2708 = -1;
            }
        } else if (arg1 == 5) {
            this.field2700 = false;
        } else if (arg1 == 7) {
            this.field2703 = class305.method2055(arg2.method1452(3), -1);
        } else if (arg1 == 8) {
            this.field2696.field1071 = this.field2699;
        } else if (arg1 == 9) {
            this.field2691 = arg2.method1455(arg0 - 34676) << 0;
        } else if (arg1 == 10) {
            this.field2698 = false;
        } else if (arg1 == 11) {
            this.field2697 = arg2.method1445(-107);
        } else if (arg1 == 12) {
            this.field2692 = true;
        } else if (arg1 == 13) {
            this.field2706 = arg2.method1452(3);
        } else if (arg1 == 14) {
            this.field2695 = arg2.method1445(-106) << 0;
        } else if (arg1 == 15) {
            this.field2712 = arg2.method1455(-3387);
            if (this.field2712 == 65535) {
                this.field2712 = -1;
            }
        } else if (arg1 == 16) {
            this.field2715 = arg2.method1445(52);
        }
        field2711++;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field2701[var0] = class329.method2204(2178540, var0);
        }
        field2713 = null;
        field2710 = 0;
        field2717 = 0L;
    }
}
