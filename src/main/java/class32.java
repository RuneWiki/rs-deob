import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class32 extends class213 {

    @OriginalMember(owner = "client!cj", name = "W", descriptor = "I")
    public static int field674 = -1;

    @OriginalMember(owner = "client!cj", name = "V", descriptor = "Lvd;")
    public static class222 field673 = class212.method1357("http:)4)4", 10731);

    @OriginalMember(owner = "client!cj", name = "M", descriptor = "Lvd;")
    public static class222 field664 = class212.method1357("sl_button", 10731);

    @OriginalMember(owner = "client!cj", name = "Q", descriptor = "I")
    public static int field668 = 0;

    @OriginalMember(owner = "client!cj", name = "db", descriptor = "Lvd;")
    private static class222 field681 = class212.method1357("Please enter your password)3", 10731);

    @OriginalMember(owner = "client!cj", name = "U", descriptor = "Lvd;")
    public static class222 field672 = field681;

    @OriginalMember(owner = "client!cj", name = "cb", descriptor = "I")
    public static int field680 = 0;

    @OriginalMember(owner = "client!cj", name = "L", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!cj", name = "N", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!cj", name = "O", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!cj", name = "R", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!cj", name = "S", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!cj", name = "Z", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!cj", name = "ab", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!cj", name = "eb", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!cj", name = "fb", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!cj", name = "ib", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!cj", name = "jb", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!cj", name = "gb", descriptor = "Lvd;")
    public class222 field684;

    @OriginalMember(owner = "client!cj", name = "Y", descriptor = "Lab;")
    public static class3 field676;

    @OriginalMember(owner = "client!cj", name = "T", descriptor = "[I")
    public int[] field671;

    @OriginalMember(owner = "client!cj", name = "X", descriptor = "[I")
    public int[] field675;

    @OriginalMember(owner = "client!cj", name = "bb", descriptor = "[I")
    public int[] field679;

    @OriginalMember(owner = "client!cj", name = "hb", descriptor = "[I")
    public int[] field685;

    @OriginalMember(owner = "client!cj", name = "P", descriptor = "[Lbg;")
    public static class19[] field667;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(II)I")
    public final int method258(int arg0, int arg1) {
        field678++;
        if (this.field671 == null) {
            return -1;
        }
        int var3 = 0;
        if (arg0 != -1) {
            field680 = 7;
        }
        while (this.field671.length > var3) {
            if (this.field675[var3] == arg1) {
                return this.field671[var3];
            }
            var3++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIII)I")
    public static final int method259(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 10) {
            field668 = -53;
        }
        int var4 = arg1 & 0x3;
        field666++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg0;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "([Loc;[IIII[I)V")
    public static final void method260(class151[] arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5) {
        if (arg2 > arg4) {
            int var6 = arg4 - 1;
            int var7 = arg2 + 1;
            int var8 = (arg2 + arg4) / 2;
            class151 var9 = arg0[var8];
            arg0[var8] = arg0[arg4];
            arg0[arg4] = var9;
            while (var6 < var7) {
                boolean var10 = true;
                do {
                    var7--;
                    for (int var11 = 0; var11 < 4; var11++) {
                        int var12;
                        int var13;
                        if (arg1[var11] == 2) {
                            var13 = var9.field2927;
                            var12 = arg0[var7].field2927;
                        } else if (arg1[var11] == 1) {
                            var12 = arg0[var7].field2916;
                            if (var12 == -1 && arg5[var11] == 1) {
                                var12 = 2001;
                            }
                            var13 = var9.field2916;
                            if (var13 == -1 && arg5[var11] == 1) {
                                var13 = 2001;
                            }
                        } else if (arg1[var11] == 3) {
                            var13 = var9.field2926 ? 1 : 0;
                            var12 = arg0[var7].field2926 ? 1 : 0;
                        } else {
                            var13 = var9.field2923;
                            var12 = arg0[var7].field2923;
                        }
                        if (var12 != var13) {
                            if ((arg5[var11] != 1 || var12 <= var13) && (arg5[var11] != 0 || var12 >= var13)) {
                                var10 = false;
                            }
                            break;
                        }
                        if (var11 == 3) {
                            var10 = false;
                        }
                    }
                } while (var10);
                boolean var14 = true;
                do {
                    var6++;
                    for (int var15 = 0; var15 < 4; var15++) {
                        int var16;
                        int var17;
                        if (arg1[var15] == 2) {
                            var16 = arg0[var6].field2927;
                            var17 = var9.field2927;
                        } else if (arg1[var15] == 1) {
                            var16 = arg0[var6].field2916;
                            if (var16 == -1 && arg5[var15] == 1) {
                                var16 = 2001;
                            }
                            var17 = var9.field2916;
                            if (var17 == -1 && arg5[var15] == 1) {
                                var17 = 2001;
                            }
                        } else if (arg1[var15] == 3) {
                            var17 = var9.field2926 ? 1 : 0;
                            var16 = arg0[var6].field2926 ? 1 : 0;
                        } else {
                            var16 = arg0[var6].field2923;
                            var17 = var9.field2923;
                        }
                        if (var16 != var17) {
                            if ((arg5[var15] != 1 || var16 >= var17) && (arg5[var15] != 0 || var16 <= var17)) {
                                var14 = false;
                            }
                            break;
                        }
                        if (var15 == 3) {
                            var14 = false;
                        }
                    }
                } while (var14);
                if (var7 > var6) {
                    class151 var18 = arg0[var6];
                    arg0[var6] = arg0[var7];
                    arg0[var7] = var18;
                }
            }
            method260(arg0, arg1, var7, 1642, arg4, arg5);
            method260(arg0, arg1, arg2, arg3, var7 + 1, arg5);
        }
        if (arg3 != 1642) {
            field676 = null;
        }
        field665++;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZLka;)V")
    public final void method261(boolean arg0, class109 arg1) {
        field686++;
        if (!arg0) {
            field674 = -50;
        }
        while (true) {
            int var3 = arg1.method662((byte) -100);
            if (var3 == 0) {
                return;
            }
            this.method264(-105, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZI)I")
    public final int method262(boolean arg0, int arg1) {
        if (!arg0) {
            return -81;
        }
        field682++;
        if (this.field679 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field679.length; var3++) {
            if (this.field685[var3] == arg1) {
                return this.field679[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(B)V")
    public static void method263(byte arg0) {
        field673 = null;
        field672 = null;
        field676 = null;
        field664 = null;
        if (arg0 >= -64) {
            field664 = null;
        }
        field681 = null;
        field667 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILka;I)V")
    private final void method264(int arg0, class109 arg1, int arg2) {
        field687++;
        int var4 = 117 / ((arg0 - 1) / 61);
        if (arg2 == 1) {
            this.field684 = arg1.method674(-40);
        } else if (arg2 == 2) {
            int var5 = arg1.method662((byte) -109);
            this.field671 = new int[var5];
            this.field675 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field671[var6] = arg1.method675(2);
                int var7 = arg1.method662((byte) -97);
                if (var7 == 0) {
                    this.field675[var6] = -1;
                } else {
                    this.field675[var6] = var7;
                }
            }
        } else if (arg2 == 3) {
            int var8 = arg1.method662((byte) -83);
            this.field679 = new int[var8];
            this.field685 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field679[var9] = arg1.method675(2);
                int var10 = arg1.method662((byte) -84);
                if (var10 == 0) {
                    this.field685[var9] = -1;
                } else {
                    this.field685[var9] = var10;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IB)V")
    public static final void method265(int arg0, byte arg1) {
        if (arg0 == 37) {
            class104.field1929 = 3.0D;
        } else if (arg0 == 50) {
            class104.field1929 = 4.0D;
        } else if (arg0 == 75) {
            class104.field1929 = 6.0D;
        } else {
            class104.field1929 = 8.0D;
        }
        class218.field4052 = -1;
        class218.field4052 = -1;
        if (arg1 > -60) {
            method259(45, 68, -46, 1);
        }
        field670++;
    }
}
