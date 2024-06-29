import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class275 {

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    private int field4764 = 0;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    private int field4766 = -1;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "[S")
    public static short[] field4765 = new short[500];

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "[I")
    public static int[] field4769 = new int[2];

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "Lj;")
    public static class164 field4771 = new class164(0, 0);

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    public int field4767;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "I")
    public int field4775;

    @OriginalMember(owner = "client!uj", name = "n", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!uj", name = "o", descriptor = "I")
    public int field4777;

    @OriginalMember(owner = "client!uj", name = "p", descriptor = "I")
    public int field4778;

    @OriginalMember(owner = "client!uj", name = "q", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!uj", name = "r", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "Ltg;")
    public static class180 field4763;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IB)V")
    private final void method1826(int arg0, byte arg1) {
        field4774++;
        double var3 = (double) ((arg0 & 0xFFEE9C) >> 16) / 256.0D;
        double var5 = (double) ((arg0 & 0xFF6E) >> 8) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 > var3) {
            var9 = var5;
        }
        double var11 = 0.0D;
        if (var9 < var7) {
            var9 = var7;
        }
        double var13 = 0.0D;
        double var15 = var3;
        if (var3 > var5) {
            var15 = var5;
        }
        if (var15 > var7) {
            var15 = var7;
        }
        double var17 = (var9 + var15) / 2.0D;
        if (var9 != var15) {
            if (var3 == var9) {
                var11 = (var5 - var7) / (var9 - var15);
            } else if (var5 == var9) {
                var11 = (var7 - var3) / (var9 - var15) + 2.0D;
            } else if (var7 == var9) {
                var11 = (var3 - var5) / (var9 - var15) + 4.0D;
            }
            if (var17 < 0.5D) {
                var13 = (var9 - var15) / (var9 + var15);
            }
            if (var17 >= 0.5D) {
                var13 = (var9 - var15) / (2.0D - var9 - var15);
            }
        }
        if (var17 > 0.5D) {
            this.field4775 = (int) ((1.0D - var17) * var13 * 512.0D);
        } else {
            this.field4775 = (int) (var13 * var17 * 512.0D);
        }
        this.field4778 = (int) (var13 * 256.0D);
        if (this.field4775 < 1) {
            this.field4775 = 1;
        }
        if (this.field4778 < 0) {
            this.field4778 = 0;
        } else if (this.field4778 > 255) {
            this.field4778 = 255;
        }
        double var19 = var11 / 6.0D;
        this.field4777 = (int) ((double) this.field4775 * var19);
        if (arg1 != 73) {
            this.method1830(-25, (byte) 126, (class25) null);
        }
        this.field4767 = (int) (var17 * 256.0D);
        if (this.field4767 < 0) {
            this.field4767 = 0;
        } else if (this.field4767 > 255) {
            this.field4767 = 255;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V")
    public static final void method1827(byte arg0) {
        field4773++;
        class34.field627.method551(69, true);
        if (arg0 != 32) {
            field4763 = null;
        }
        for (class144 var1 = (class144) class261.field4614.method142(true); var1 != null; var1 = (class144) class261.field4614.method143((byte) -119)) {
            if (var1.field2519 == 0) {
                class16.method127((byte) 44, var1, true);
            }
        }
        class46.field769++;
        if (class180.field3157 != null) {
            class242.method1642((byte) 87, class180.field3157);
            class180.field3157 = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIZIZIIIIIIII)Z")
    public static final boolean method1828(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var40 = 0; var40 < 104; var40++) {
                class234.field4071[var13][var40] = 0;
                class64.field1072[var13][var40] = 99999999;
            }
        }
        class234.field4071[arg1][arg10] = 99;
        field4770++;
        int var14 = arg1;
        class64.field1072[arg1][arg10] = 0;
        int var15 = arg10;
        byte var16 = 0;
        class250.field4385[var16] = arg1;
        int var17 = 0;
        int var41 = var16 + 1;
        class241.field4218[var16] = arg10;
        boolean var18 = arg4;
        int[][] var19 = class183.field3211[class231.field4013].field1604;
        label368: while (var41 != var17) {
            var15 = class241.field4218[var17];
            var14 = class250.field4385[var17];
            var17 = var17 + 1 & 0xFFF;
            if (arg3 == var14 && arg12 == var15) {
                var18 = true;
                break;
            }
            if (arg11 != 0) {
                if ((arg11 < 5 || arg11 == 10) && class183.field3211[class231.field4013].method703(arg12, 82, arg6, arg3, arg11 - 1, var15, arg7, var14)) {
                    var18 = true;
                    break;
                }
                if (arg11 < 10 && class183.field3211[class231.field4013].method701(var15, arg3, arg6, arg7, true, arg11 - 1, arg12, var14)) {
                    var18 = true;
                    break;
                }
            }
            if (arg5 != 0 && arg9 != 0 && class183.field3211[class231.field4013].method694(arg6, arg4, var15, var14, arg5, arg9, arg8, arg3, arg12)) {
                var18 = true;
                break;
            }
            int var31 = class64.field1072[var14][var15] + 1;
            if (var14 > 0 && class234.field4071[var14 - 1][var15] == 0 && (var19[var14 - 1][var15] & 0x12C010E) == 0 && (var19[var14 - 1][arg6 + var15 - 1] & 0x12C0138) == 0) {
                int var32 = 1;
                while (true) {
                    if (var32 >= (arg6 - 1)) {
                        class250.field4385[var41] = var14 - 1;
                        class241.field4218[var41] = var15;
                        var41 = var41 + 1 & 0xFFF;
                        class234.field4071[var14 - 1][var15] = 2;
                        class64.field1072[var14 - 1][var15] = var31;
                        break;
                    }
                    if ((var19[var14 - 1][var15 + var32] & 0x12C013E) != 0) {
                        break;
                    }
                    var32++;
                }
            }
            if (var14 < 102 && class234.field4071[var14 + 1][var15] == 0 && (var19[arg6 + var14][var15] & 0x12C0183) == 0 && (var19[arg6 + var14][arg6 + var15 - 1] & 0x12C01E0) == 0) {
                int var33 = 1;
                while (true) {
                    if (var33 >= arg6 - 1) {
                        class250.field4385[var41] = var14 + 1;
                        class241.field4218[var41] = var15;
                        class234.field4071[var14 + 1][var15] = 8;
                        var41 = var41 + 1 & 0xFFF;
                        class64.field1072[var14 + 1][var15] = var31;
                        break;
                    }
                    if ((var19[arg6 + var14][var15 + var33] & 0x12C01E3) != 0) {
                        break;
                    }
                    var33++;
                }
            }
            if (var15 > 0 && class234.field4071[var14][var15 - 1] == 0 && (var19[var14][var15 - 1] & 0x12C010E) == 0 && (var19[arg6 + var14 - 1][var15 - 1] & 0x12C0183) == 0) {
                int var34 = 1;
                while (true) {
                    if (var34 >= (arg6 - 1)) {
                        class250.field4385[var41] = var14;
                        class241.field4218[var41] = var15 - 1;
                        class234.field4071[var14][var15 - 1] = 1;
                        var41 = var41 + 1 & 0xFFF;
                        class64.field1072[var14][var15 - 1] = var31;
                        break;
                    }
                    if ((var19[var14 + var34][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var34++;
                }
            }
            if (var15 < 102 && class234.field4071[var14][var15 + 1] == 0 && (var19[var14][arg6 + var15] & 0x12C0138) == 0 && (var19[var14 + arg6 - 1][arg6 + var15] & 0x12C01E0) == 0) {
                int var35 = 1;
                while (true) {
                    if (var35 >= (arg6 - 1)) {
                        class250.field4385[var41] = var14;
                        class241.field4218[var41] = var15 + 1;
                        var41 = var41 + 1 & 0xFFF;
                        class234.field4071[var14][var15 + 1] = 4;
                        class64.field1072[var14][var15 + 1] = var31;
                        break;
                    }
                    if ((var19[var14 + var35][arg6 + var15] & 0x12C01F8) != 0) {
                        break;
                    }
                    var35++;
                }
            }
            if (var14 > 0 && var15 > 0 && class234.field4071[var14 - 1][var15 - 1] == 0 && (var19[var14 - 1][arg6 + var15 - 1 - 1] & 0x12C0138) == 0 && (var19[var14 - 1][var15 - 1] & 0x12C010E) == 0 && (var19[var14 + arg6 - 2][var15 - 1] & 0x12C0183) == 0) {
                int var36 = 1;
                while (true) {
                    if (var36 >= arg6 - 1) {
                        class250.field4385[var41] = var14 - 1;
                        class241.field4218[var41] = var15 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class234.field4071[var14 - 1][var15 - 1] = 3;
                        class64.field1072[var14 - 1][var15 - 1] = var31;
                        break;
                    }
                    if ((var19[var14 - 1][var36 + var15 - 1] & 0x12C013E) != 0 || (var19[var36 + var14 - 1][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var36++;
                }
            }
            if (var14 < 102 && var15 > 0 && class234.field4071[var14 + 1][var15 - 1] == 0 && (var19[var14 + 1][var15 - 1] & 0x12C010E) == 0 && (var19[arg6 + var14][var15 - 1] & 0x12C0183) == 0 && (var19[arg6 + var14][var15 + arg6 - 1 - 1] & 0x12C01E0) == 0) {
                int var37 = 1;
                while (true) {
                    if (arg6 - 1 <= var37) {
                        class250.field4385[var41] = var14 + 1;
                        class241.field4218[var41] = var15 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class234.field4071[var14 + 1][var15 - 1] = 9;
                        class64.field1072[var14 + 1][var15 - 1] = var31;
                        break;
                    }
                    if ((var19[arg6 + var14][var37 + var15 - 1] & 0x12C01E3) != 0 || (var19[var14 + var37 + 1][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var37++;
                }
            }
            if (var14 > 0 && var15 < 102 && class234.field4071[var14 - 1][var15 + 1] == 0 && (var19[var14 - 1][var15 + 1] & 0x12C010E) == 0 && (var19[var14 - 1][arg6 + var15] & 0x12C0138) == 0 && (var19[var14][arg6 + var15] & 0x12C01E0) == 0) {
                int var38 = 1;
                while (true) {
                    if (arg6 - 1 <= var38) {
                        class250.field4385[var41] = var14 - 1;
                        class241.field4218[var41] = var15 + 1;
                        class234.field4071[var14 - 1][var15 + 1] = 6;
                        class64.field1072[var14 - 1][var15 + 1] = var31;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var19[var14 - 1][var15 + var38 + 1] & 0x12C013E) != 0 || (var19[var14 + var38 - 1][arg6 + var15] & 0x12C01F8) != 0) {
                        break;
                    }
                    var38++;
                }
            }
            if (var14 < 102 && var15 < 102 && class234.field4071[var14 + 1][var15 + 1] == 0 && (var19[var14 + 1][arg6 + var15] & 0x12C0138) == 0 && (var19[arg6 + var14][var15 + arg6] & 0x12C01E0) == 0 && (var19[var14 + arg6][var15 + 1] & 0x12C0183) == 0) {
                for (int var39 = 1; var39 < (arg6 - 1); var39++) {
                    if ((var19[var14 + var39 + 1][arg6 + var15] & 0x12C01F8) != 0 || (var19[var14 + arg6][var15 + var39 + 1] & 0x12C01E3) != 0) {
                        continue label368;
                    }
                }
                class250.field4385[var41] = var14 + 1;
                class241.field4218[var41] = var15 + 1;
                var41 = var41 + 1 & 0xFFF;
                class234.field4071[var14 + 1][var15 + 1] = 12;
                class64.field1072[var14 + 1][var15 + 1] = var31;
            }
        }
        class104.field1733 = 0;
        if (!var18) {
            if (!arg2) {
                return false;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = arg3 - var22; var23 <= (arg3 + var22); var23++) {
                for (int var24 = arg12 - var22; var24 <= arg12 + var22; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class64.field1072[var23][var24] < 100) {
                        int var25 = 0;
                        if (arg3 > var23) {
                            var25 = arg3 - var23;
                        } else if (var23 > (arg3 + arg5 - 1)) {
                            var25 = -arg3 - (arg5 - (var23 + 1));
                        }
                        int var26 = 0;
                        if (var24 < arg12) {
                            var26 = arg12 - var24;
                        } else if (var24 > arg9 + arg12 - 1) {
                            var26 = var24 + 1 - arg9 - arg12;
                        }
                        int var27 = var25 * var25 + (var26 * var26);
                        if (var20 > var27 || var20 == var27 && class64.field1072[var23][var24] < var21) {
                            var15 = var24;
                            var20 = var27;
                            var21 = class64.field1072[var23][var24];
                            var14 = var23;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg1 == var14 && arg10 == var15) {
                return false;
            }
            class104.field1733 = 1;
        }
        byte var28 = 0;
        class250.field4385[var28] = var14;
        int var42 = var28 + 1;
        class241.field4218[var28] = var15;
        int var29;
        int var30 = var29 = class234.field4071[var14][var15];
        while (arg1 != var14 || arg10 != var15) {
            if (var29 != var30) {
                class250.field4385[var42] = var14;
                class241.field4218[var42++] = var15;
                var29 = var30;
            }
            if ((var30 & 0x1) != 0) {
                var15++;
            } else if ((var30 & 0x4) != 0) {
                var15--;
            }
            if ((var30 & 0x2) != 0) {
                var14++;
            } else if ((var30 & 0x8) != 0) {
                var14--;
            }
            var30 = class234.field4071[var14][var15];
        }
        if (var42 > 0) {
            class227.method1527(var42, true, arg0);
            return true;
        } else if (arg0 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Llj;III)V")
    private final void method1829(class25 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -1) {
            this.field4778 = 124;
        }
        field4772++;
        if (arg1 == 1) {
            this.field4764 = arg0.method230(arg2 + 15047);
            this.method1826(this.field4764, (byte) 73);
        } else if (arg1 == 2) {
            this.field4766 = arg0.method193((byte) 77);
            if (this.field4766 == 65535) {
                this.field4766 = -1;
                return;
            }
            return;
        } else if (arg1 == 3) {
            arg0.method193((byte) 77);
            return;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IBLlj;)V")
    public final void method1830(int arg0, byte arg1, class25 arg2) {
        if (arg1 > -121) {
            return;
        }
        while (true) {
            int var4 = arg2.method189((byte) -103);
            if (var4 == 0) {
                field4776++;
                return;
            }
            this.method1829(arg2, var4, -1, arg0);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Z)V")
    public static void method1831(boolean arg0) {
        field4771 = null;
        field4763 = null;
        if (!arg0) {
            field4769 = null;
            field4765 = null;
        }
    }
}
