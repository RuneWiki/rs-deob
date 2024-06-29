import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class44 {

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "Lae;")
    private class282 field791 = new class282();

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static int field794 = 0;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "Ljf;")
    private static class229 field802 = class212.method1457((byte) 73, "Examine");

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "Ljf;")
    public static class229 field792 = field802;

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "S")
    public static short field808 = 256;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "Lbm;")
    public static class138 field796;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "Lae;")
    private class282 field798;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)Lae;", line = 5)
    public final class282 method372(int arg0) {
        field790++;
        if (arg0 != 3791) {
            field809 = -86;
        }
        class282 var2 = this.field791.field4837;
        if (this.field791 == var2) {
            return null;
        } else {
            var2.method1986((byte) 86);
            return var2;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)Ld;", line = 24)
    public static final class143 method373(int arg0, int arg1, int arg2) {
        class125 var3 = class312.field5246[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class143 var4 = var3.field2190;
            var3.field2190 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IB)Lil;", line = 47)
    public static final class57 method374(int arg0, byte arg1) {
        class57 var2 = (class57) class34.field651.method643((long) arg0, 1649232044);
        field795++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class293.field5023.method1275(0, arg0, -5211);
        if (var3 == null) {
            return null;
        }
        class57 var4 = new class57();
        class14 var5 = new class14(var3);
        var5.field195 = var5.field174.length - 2;
        int var6 = var5.method116(-1);
        int var7 = var5.field174.length - var6 - 14;
        var5.field195 = var7;
        int var8 = var5.method128((byte) 4);
        var4.field1008 = var5.method116(-1);
        var4.field1011 = var5.method116(-1);
        var4.field1006 = var5.method116(-1);
        var4.field1007 = var5.method116(-1);
        int var9 = var5.method93(false);
        if (var9 > 0) {
            var4.field1010 = new class268[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method116(-1);
                class268 var12 = new class268(class5.method28(-84, var11));
                var4.field1010[var10] = var12;
                while (var11-- > 0) {
                    int var13 = var5.method128((byte) 4);
                    int var14 = var5.method128((byte) 4);
                    var12.method1885((long) var13, new class93(var14), (byte) -106);
                }
            }
        }
        int var15 = 0;
        var5.field195 = 0;
        var4.field1005 = var5.method97(0);
        if (arg1 < 50) {
            method377(false, -39, 103, -75, 17, -4, -102, 63, -119, -84, 37, 126);
        }
        var4.field1015 = new int[var8];
        var4.field1004 = new int[var8];
        var4.field1012 = new class229[var8];
        while (var5.field195 < var7) {
            int var16 = var5.method116(-1);
            if (var16 == 3) {
                var4.field1012[var15] = var5.method105((byte) -93);
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field1015[var15] = var5.method93(false);
            } else {
                var4.field1015[var15] = var5.method128((byte) 4);
            }
            var4.field1004[var15++] = var16;
        }
        class34.field651.method640(var4, (long) arg0, 24179);
        return var4;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V", line = 1888)
    public class44() {
        this.field791.field4832 = this.field791;
        this.field791.field4837 = this.field791;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILae;)V", line = 143)
    public final void method375(int arg0, class282 arg1) {
        field799++;
        if (arg1.field4832 != null) {
            arg1.method1986((byte) 86);
        }
        arg1.field4837 = this.field791;
        if (arg0 != 42) {
            method379((byte) -121);
        }
        arg1.field4832 = this.field791.field4832;
        arg1.field4832.field4837 = arg1;
        arg1.field4837.field4832 = arg1;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V", line = 162)
    public static void method376(int arg0) {
        field796 = null;
        field792 = null;
        field802 = null;
        if (arg0 != 8709) {
            method381((byte[]) null, -123);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZIIIIIIIIIII)Z", line = 174)
    public static final boolean method377(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg7 != 73) {
            method374(-122, (byte) 113);
        }
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class137.field2383[var12][var13] = 0;
                class193.field3346[var12][var13] = 99999999;
            }
        }
        field793++;
        int var14 = arg8;
        int var15 = arg6;
        byte var16 = 0;
        boolean var17 = false;
        class137.field2383[arg8][arg6] = 99;
        class193.field3346[arg8][arg6] = 0;
        class185.field3224[var16] = arg8;
        int var32 = var16 + 1;
        class319.field5403[var16] = arg6;
        int var18 = 0;
        int[][] var19 = class80.field1460[class16.field254].field4331;
        while (var32 != var18) {
            var15 = class319.field5403[var18];
            var14 = class185.field3224[var18];
            var18 = var18 + 1 & 0xFFF;
            if (arg11 == var14 && arg5 == var15) {
                var17 = true;
                break;
            }
            if (arg4 != 0) {
                if ((arg4 < 5 || arg4 == 10) && class80.field1460[class16.field254].method1761(arg11, 1, arg9, arg4 - 1, var15, arg5, var14, (byte) 106)) {
                    var17 = true;
                    break;
                }
                if (arg4 < 10 && class80.field1460[class16.field254].method1768(var15, arg11, var14, arg4 - 1, (byte) -59, arg9, arg5, 1)) {
                    var17 = true;
                    break;
                }
            }
            if (arg2 != 0 && arg3 != 0 && class80.field1460[class16.field254].method1762(arg3, 1, arg5, arg2, arg11, var14, var15, (byte) -127, arg10)) {
                var17 = true;
                break;
            }
            int var20 = class193.field3346[var14][var15] + 1;
            if (var14 > 0 && class137.field2383[var14 - 1][var15] == 0 && (var19[var14 - 1][var15] & 0x12C0108) == 0) {
                class185.field3224[var32] = var14 - 1;
                class319.field5403[var32] = var15;
                class137.field2383[var14 - 1][var15] = 2;
                var32 = var32 + 1 & 0xFFF;
                class193.field3346[var14 - 1][var15] = var20;
            }
            if (var14 < 103 && class137.field2383[var14 + 1][var15] == 0 && (var19[var14 + 1][var15] & 0x12C0180) == 0) {
                class185.field3224[var32] = var14 + 1;
                class319.field5403[var32] = var15;
                var32 = var32 + 1 & 0xFFF;
                class137.field2383[var14 + 1][var15] = 8;
                class193.field3346[var14 + 1][var15] = var20;
            }
            if (var15 > 0 && class137.field2383[var14][var15 - 1] == 0 && (var19[var14][var15 - 1] & 0x12C0102) == 0) {
                class185.field3224[var32] = var14;
                class319.field5403[var32] = var15 - 1;
                class137.field2383[var14][var15 - 1] = 1;
                var32 = var32 + 1 & 0xFFF;
                class193.field3346[var14][var15 - 1] = var20;
            }
            if (var15 < 103 && class137.field2383[var14][var15 + 1] == 0 && (var19[var14][var15 + 1] & 0x12C0120) == 0) {
                class185.field3224[var32] = var14;
                class319.field5403[var32] = var15 + 1;
                class137.field2383[var14][var15 + 1] = 4;
                var32 = var32 + 1 & 0xFFF;
                class193.field3346[var14][var15 + 1] = var20;
            }
            if (var14 > 0 && var15 > 0 && class137.field2383[var14 - 1][var15 - 1] == 0 && (var19[var14 - 1][var15 - 1] & 0x12C010E) == 0 && (var19[var14 - 1][var15] & 0x12C0108) == 0 && (var19[var14][var15 - 1] & 0x12C0102) == 0) {
                class185.field3224[var32] = var14 - 1;
                class319.field5403[var32] = var15 - 1;
                class137.field2383[var14 - 1][var15 - 1] = 3;
                var32 = var32 + 1 & 0xFFF;
                class193.field3346[var14 - 1][var15 - 1] = var20;
            }
            if (var14 < 103 && var15 > 0 && class137.field2383[var14 + 1][var15 - 1] == 0 && (var19[var14 + 1][var15 - 1] & 0x12C0183) == 0 && (var19[var14 + 1][var15] & 0x12C0180) == 0 && (var19[var14][var15 - 1] & 0x12C0102) == 0) {
                class185.field3224[var32] = var14 + 1;
                class319.field5403[var32] = var15 - 1;
                var32 = var32 + 1 & 0xFFF;
                class137.field2383[var14 + 1][var15 - 1] = 9;
                class193.field3346[var14 + 1][var15 - 1] = var20;
            }
            if (var14 > 0 && var15 < 103 && class137.field2383[var14 - 1][var15 + 1] == 0 && (var19[var14 - 1][var15 + 1] & 0x12C0138) == 0 && (var19[var14 - 1][var15] & 0x12C0108) == 0 && (var19[var14][var15 + 1] & 0x12C0120) == 0) {
                class185.field3224[var32] = var14 - 1;
                class319.field5403[var32] = var15 + 1;
                var32 = var32 + 1 & 0xFFF;
                class137.field2383[var14 - 1][var15 + 1] = 6;
                class193.field3346[var14 - 1][var15 + 1] = var20;
            }
            if (var14 < 103 && var15 < 103 && class137.field2383[var14 + 1][var15 + 1] == 0 && (var19[var14 + 1][var15 + 1] & 0x12C01E0) == 0 && (var19[var14 + 1][var15] & 0x12C0180) == 0 && (var19[var14][var15 + 1] & 0x12C0120) == 0) {
                class185.field3224[var32] = var14 + 1;
                class319.field5403[var32] = var15 + 1;
                var32 = var32 + 1 & 0xFFF;
                class137.field2383[var14 + 1][var15 + 1] = 12;
                class193.field3346[var14 + 1][var15 + 1] = var20;
            }
        }
        class194.field3365 = 0;
        if (!var17) {
            if (!arg0) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg11 - var23; var24 <= arg11 + var23; var24++) {
                for (int var25 = arg5 - var23; var25 <= (arg5 + var23); var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class193.field3346[var24][var25] < 100) {
                        int var26 = 0;
                        int var27 = 0;
                        if (arg5 > var25) {
                            var27 = arg5 - var25;
                        } else if (arg5 + arg3 - 1 < var25) {
                            var27 = var25 + 1 - arg3 - arg5;
                        }
                        if (var24 < arg11) {
                            var26 = arg11 - var24;
                        } else if (var24 > (arg11 + arg2 - 1)) {
                            var26 = var24 + 1 - arg2 - arg11;
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var21 > var28 || var21 == var28 && class193.field3346[var24][var25] < var22) {
                            var14 = var24;
                            var15 = var25;
                            var22 = class193.field3346[var24][var25];
                            var21 = var28;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg8 == var14 && arg6 == var15) {
                return false;
            }
            class194.field3365 = 1;
        }
        byte var29 = 0;
        class185.field3224[var29] = var14;
        int var33 = var29 + 1;
        class319.field5403[var29] = var15;
        int var30;
        int var31 = var30 = class137.field2383[var14][var15];
        while (arg8 != var14 || arg6 != var15) {
            if (var30 != var31) {
                var30 = var31;
                class185.field3224[var33] = var14;
                class319.field5403[var33++] = var15;
            }
            if ((var31 & 0x2) != 0) {
                var14++;
            } else if ((var31 & 0x8) != 0) {
                var14--;
            }
            if ((var31 & 0x1) != 0) {
                var15++;
            } else if ((var31 & 0x4) != 0) {
                var15--;
            }
            var31 = class137.field2383[var14][var15];
        }
        if (var33 > 0) {
            class111.method788(var33, arg1, -125);
            return true;
        } else if (arg1 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V", line = 462)
    public final void method378(boolean arg0) {
        field788++;
        while (true) {
            class282 var2 = this.field791.field4837;
            if (this.field791 == var2) {
                if (!arg0) {
                    method381((byte[]) null, 104);
                }
                this.field798 = null;
                return;
            }
            var2.method1986((byte) 86);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)[Lsm;", line = 484)
    public static final class159[] method379(byte arg0) {
        field806++;
        if (arg0 != 64) {
            field802 = (class229) null;
        }
        class159[] var1 = new class159[class315.field5348];
        for (int var2 = 0; var2 < class315.field5348; var2++) {
            int var3 = class6.field71[var2] * class232.field4025[var2];
            byte[] var4 = class21.field357[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class64.field1115[class305.method2086(var4[var6], 255)];
            }
            var1[var2] = new class159(class97.field1722, class307.field5192, class272.field4659[var2], class256.field4473[var2], class232.field4025[var2], class6.field71[var2], var5);
        }
        class62.method466((byte) 72);
        return var1;
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)I", line = 521)
    public final int method380(int arg0) {
        field800++;
        class282 var2 = this.field791.field4837;
        int var3 = arg0;
        while (this.field791 != var2) {
            var3++;
            var2 = var2.field4837;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([BI)Lbm;", line = 546)
    public static final class138 method381(byte[] arg0, int arg1) {
        field804++;
        if (arg0 == null) {
            return null;
        }
        class138 var2;
        if (class108.field1900) {
            var2 = new class209(arg0, class272.field4659, class256.field4473, class232.field4025, class6.field71, class21.field357);
        } else {
            var2 = new class77(arg0, class272.field4659, class256.field4473, class232.field4025, class6.field71, class21.field357);
        }
        class62.method466((byte) 77);
        if (arg1 != 3) {
            field796 = (class138) null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)Lae;", line = 572)
    public final class282 method382(int arg0) {
        if (arg0 <= 39) {
            return (class282) null;
        }
        field803++;
        class282 var2 = this.field798;
        if (this.field791 == var2) {
            this.field798 = null;
            return null;
        } else {
            this.field798 = var2.field4837;
            return var2;
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(Z)Lae;", line = 600)
    public final class282 method383(boolean arg0) {
        field789++;
        if (arg0) {
            field802 = (class229) null;
        }
        class282 var2 = this.field791.field4837;
        if (this.field791 == var2) {
            this.field798 = null;
            return null;
        } else {
            this.field798 = var2.field4837;
            return var2;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IILek;)Lad;", line = 621)
    public static final class129 method384(int arg0, int arg1, class185 arg2) {
        field807++;
        if (arg0 != -11409) {
            field794 = -67;
        }
        return class50.method414(arg2, -112, arg1) ? class156.method1049((byte) 95) : null;
    }

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "(I)V", line = 640)
    public static final void method385(int arg0) {
        if (class198.field3454.toLowerCase().indexOf("microsoft") == -1) {
            class47.field859[45] = 26;
            class47.field859[92] = 74;
            if (class198.field3469 == null) {
                class47.field859[192] = 58;
                class47.field859[222] = 59;
            } else {
                class47.field859[222] = 58;
                class47.field859[192] = 28;
                class47.field859[520] = 59;
            }
            class47.field859[59] = 57;
            class47.field859[44] = 71;
            class47.field859[91] = 42;
            class47.field859[46] = 72;
            class47.field859[93] = 43;
            class47.field859[47] = 73;
            class47.field859[61] = 27;
        } else {
            class47.field859[186] = 57;
            class47.field859[188] = 71;
            class47.field859[220] = 74;
            class47.field859[223] = 28;
            class47.field859[222] = 59;
            class47.field859[219] = 42;
            class47.field859[187] = 27;
            class47.field859[190] = 72;
            class47.field859[221] = 43;
            class47.field859[192] = 58;
            class47.field859[189] = 26;
            class47.field859[191] = 73;
        }
        if (arg0 != 192) {
            method379((byte) -115);
        }
        field801++;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III[IIZIIIIB)V", line = 694)
    public static final void method386(int arg0, int arg1, int arg2, int[] arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, byte arg10) {
        field805++;
        int var11 = arg1;
        if (class114.field2056 <= arg1) {
            return;
        }
        int var12 = arg1 + arg9;
        if (arg1 < class114.field2051) {
            var11 = class114.field2051;
        }
        if (class114.field2051 >= var12) {
            return;
        }
        if (var12 > class114.field2056) {
            var12 = class114.field2056;
        }
        int var13 = arg8;
        if (class114.field2054 <= arg8) {
            return;
        }
        if (arg8 < class114.field2049) {
            var13 = class114.field2049;
        }
        int var14 = arg8 + arg4;
        if (var14 <= class114.field2049) {
            return;
        }
        int var15 = class114.field2055 * var13 + var11;
        int var16 = var13 - arg8;
        int var17 = class114.field2055 + var11 - var12;
        int var18 = var11 - arg1;
        int var19 = var12 - arg1;
        int var20 = -49 % ((-arg10 - 85) / 38);
        if (var14 > class114.field2054) {
            var14 = class114.field2054;
        }
        int var21 = var14 - arg8;
        int var22 = arg9 - var18;
        if (arg7 == 9) {
            arg7 = 1;
            arg6 = arg6 + 1 & 0x3;
        }
        int var23 = arg9 - var19;
        if (arg7 == 10) {
            arg7 = 1;
            arg6 = arg6 + 3 & 0x3;
        }
        if (arg7 == 11) {
            arg7 = 8;
            arg6 = arg6 + 3 & 0x3;
        }
        int var24 = arg4 - var21;
        int var25 = arg4 - var16;
        if (arg7 == 1) {
            if (arg6 == 0) {
                for (int var26 = var16; var26 < var21; var26++) {
                    for (int var27 = var18; var27 < var19; var27++) {
                        if (var26 >= var27) {
                            arg3[var15] = arg0;
                        } else if (arg5) {
                            arg3[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg6 == 1) {
                for (int var32 = var25 - 1; var32 >= var24; var32--) {
                    for (int var33 = var18; var33 < var19; var33++) {
                        if (var33 <= var32) {
                            arg3[var15] = arg0;
                        } else if (arg5) {
                            arg3[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg6 == 2) {
                for (int var30 = var16; var30 < var21; var30++) {
                    for (int var31 = var18; var31 < var19; var31++) {
                        if (var31 >= var30) {
                            arg3[var15] = arg0;
                        } else if (arg5) {
                            arg3[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg6 == 3) {
                for (int var28 = var25 - 1; var28 >= var24; var28--) {
                    for (int var29 = var18; var29 < var19; var29++) {
                        if (var29 >= var28) {
                            arg3[var15] = arg0;
                        } else if (arg5) {
                            arg3[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            }
        } else if (arg7 == 2) {
            if (arg6 == 0) {
                for (int var82 = var25 - 1; var82 >= var24; var82--) {
                    for (int var83 = var18; var83 < var19; var83++) {
                        if (var82 >> 1 >= var83) {
                            arg3[var15] = arg0;
                        } else if (arg5) {
                            arg3[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg6 == 1) {
                for (int var88 = var16; var88 < var21; var88++) {
                    for (int var89 = var18; var89 < var19; var89++) {
                        if (var15 >= 0 && arg3.length > var15) {
                            if (var89 >= var88 << 1) {
                                arg3[var15] = arg0;
                            } else if (arg5) {
                                arg3[var15] = arg2;
                            }
                            var15++;
                        } else {
                            var15++;
                        }
                    }
                    var15 += var17;
                }
            } else if (arg6 == 2) {
                for (int var84 = var16; var84 < var21; var84++) {
                    for (int var85 = var22 - 1; var85 >= var23; var85--) {
                        if ((var84 >> 1) >= var85) {
                            arg3[var15] = arg0;
                        } else if (arg5) {
                            arg3[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg6 == 3) {
                for (int var86 = var25 - 1; var86 >= var24; var86--) {
                    for (int var87 = var22 - 1; var87 >= var23; var87--) {
                        if ((var86 << 1) <= var87) {
                            arg3[var15] = arg0;
                        } else if (arg5) {
                            arg3[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            }
        } else if (arg7 == 3) {
            if (arg6 == 0) {
                for (int var74 = var25 - 1; var74 >= var24; var74--) {
                    for (int var75 = var22 - 1; var75 >= var23; var75--) {
                        if (var74 >> 1 >= var75) {
                            arg3[var15] = arg0;
                        } else if (arg5) {
                            arg3[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg6 == 1) {
                for (int var80 = var25 - 1; var80 >= var24; var80--) {
                    for (int var81 = var18; var81 < var19; var81++) {
                        if ((var80 << 1) <= var81) {
                            arg3[var15] = arg0;
                        } else if (arg5) {
                            arg3[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg6 == 2) {
                for (int var78 = var16; var78 < var21; var78++) {
                    for (int var79 = var18; var79 < var19; var79++) {
                        if (var79 <= (var78 >> 1)) {
                            arg3[var15] = arg0;
                        } else if (arg5) {
                            arg3[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg6 == 3) {
                for (int var76 = var16; var76 < var21; var76++) {
                    for (int var77 = var22 - 1; var77 >= var23; var77--) {
                        if (var77 >= var76 << 1) {
                            arg3[var15] = arg0;
                        } else if (arg5) {
                            arg3[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            }
        } else if (arg7 == 4) {
            if (arg6 == 0) {
                for (int var34 = var25 - 1; var34 >= var24; var34--) {
                    for (int var35 = var18; var35 < var19; var35++) {
                        if (var35 >= var34 >> 1) {
                            arg3[var15] = arg0;
                        } else if (arg5) {
                            arg3[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg6 == 1) {
                for (int var36 = var16; var36 < var21; var36++) {
                    for (int var37 = var18; var37 < var19; var37++) {
                        if (var37 <= var36 << 1) {
                            arg3[var15] = arg0;
                        } else if (arg5) {
                            arg3[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg6 == 2) {
                for (int var38 = var16; var38 < var21; var38++) {
                    for (int var39 = var22 - 1; var39 >= var23; var39--) {
                        if (var39 >= var38 >> 1) {
                            arg3[var15] = arg0;
                        } else if (arg5) {
                            arg3[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg6 == 3) {
                for (int var40 = var25 - 1; var40 >= var24; var40--) {
                    for (int var41 = var22 - 1; var41 >= var23; var41--) {
                        if (var40 << 1 >= var41) {
                            arg3[var15] = arg0;
                        } else if (arg5) {
                            arg3[var15] = arg2;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            }
        } else if (arg7 != 5) {
            if (arg7 == 6) {
                if (arg6 == 0) {
                    for (int var50 = var16; var50 < var21; var50++) {
                        for (int var51 = var18; var51 < var19; var51++) {
                            if (var51 <= arg9 / 2) {
                                arg3[var15] = arg0;
                            } else if (arg5) {
                                arg3[var15] = arg2;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg6 == 1) {
                    for (int var72 = var16; var72 < var21; var72++) {
                        for (int var73 = var18; var73 < var19; var73++) {
                            if ((arg4 / 2) >= var72) {
                                arg3[var15] = arg0;
                            } else if (arg5) {
                                arg3[var15] = arg2;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg6 == 2) {
                    for (int var70 = var16; var70 < var21; var70++) {
                        for (int var71 = var18; var71 < var19; var71++) {
                            if (var71 >= arg9 / 2) {
                                arg3[var15] = arg0;
                            } else if (arg5) {
                                arg3[var15] = arg2;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg6 == 3) {
                    for (int var52 = var16; var52 < var21; var52++) {
                        for (int var53 = var18; var53 < var19; var53++) {
                            if (var52 >= arg4 / 2) {
                                arg3[var15] = arg0;
                            } else if (arg5) {
                                arg3[var15] = arg2;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
            }
            if (arg7 == 7) {
                if (arg6 == 0) {
                    for (int var60 = var16; var60 < var21; var60++) {
                        for (int var61 = var18; var61 < var19; var61++) {
                            if (var61 <= (var60 - (arg4 / 2))) {
                                arg3[var15] = arg0;
                            } else if (arg5) {
                                arg3[var15] = arg2;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg6 == 1) {
                    for (int var58 = var25 - 1; var58 >= var24; var58--) {
                        for (int var59 = var18; var59 < var19; var59++) {
                            if (var58 - (arg4 / 2) >= var59) {
                                arg3[var15] = arg0;
                            } else if (arg5) {
                                arg3[var15] = arg2;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg6 == 2) {
                    for (int var54 = var25 - 1; var54 >= var24; var54--) {
                        for (int var55 = var22 - 1; var55 >= var23; var55--) {
                            if (var54 - (arg4 / 2) >= var55) {
                                arg3[var15] = arg0;
                            } else if (arg5) {
                                arg3[var15] = arg2;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg6 == 3) {
                    for (int var56 = var16; var56 < var21; var56++) {
                        for (int var57 = var22 - 1; var57 >= var23; var57--) {
                            if (var57 <= (var56 - (arg4 / 2))) {
                                arg3[var15] = arg0;
                            } else if (arg5) {
                                arg3[var15] = arg2;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
            }
            if (arg7 == 8) {
                if (arg6 == 0) {
                    for (int var68 = var16; var68 < var21; var68++) {
                        for (int var69 = var18; var69 < var19; var69++) {
                            if ((var68 - (arg4 / 2)) <= var69) {
                                arg3[var15] = arg0;
                            } else if (arg5) {
                                arg3[var15] = arg2;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg6 == 1) {
                    for (int var66 = var25 - 1; var66 >= var24; var66--) {
                        for (int var67 = var18; var67 < var19; var67++) {
                            if (var67 >= var66 - (arg4 / 2)) {
                                arg3[var15] = arg0;
                            } else if (arg5) {
                                arg3[var15] = arg2;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg6 == 2) {
                    for (int var64 = var25 - 1; var64 >= var24; var64--) {
                        for (int var65 = var22 - 1; var65 >= var23; var65--) {
                            if (var64 - (arg4 / 2) <= var65) {
                                arg3[var15] = arg0;
                            } else if (arg5) {
                                arg3[var15] = arg2;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg6 == 3) {
                    for (int var62 = var16; var62 < var21; var62++) {
                        for (int var63 = var22 - 1; var63 >= var23; var63--) {
                            if (var62 - (arg4 / 2) <= var63) {
                                arg3[var15] = arg0;
                            } else if (arg5) {
                                arg3[var15] = arg2;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
            }
        } else if (arg6 == 0) {
            for (int var48 = var25 - 1; var48 >= var24; var48--) {
                for (int var49 = var22 - 1; var49 >= var23; var49--) {
                    if ((var48 >> 1) <= var49) {
                        arg3[var15] = arg0;
                    } else if (arg5) {
                        arg3[var15] = arg2;
                    }
                    var15++;
                }
                var15 += var17;
            }
        } else if (arg6 == 1) {
            for (int var46 = var25 - 1; var46 >= var24; var46--) {
                for (int var47 = var18; var47 < var19; var47++) {
                    if ((var46 << 1) >= var47) {
                        arg3[var15] = arg0;
                    } else if (arg5) {
                        arg3[var15] = arg2;
                    }
                    var15++;
                }
                var15 += var17;
            }
        } else if (arg6 == 2) {
            for (int var44 = var16; var44 < var21; var44++) {
                for (int var45 = var18; var45 < var19; var45++) {
                    if (var45 >= (var44 >> 1)) {
                        arg3[var15] = arg0;
                    } else if (arg5) {
                        arg3[var15] = arg2;
                    }
                    var15++;
                }
                var15 += var17;
            }
        } else if (arg6 == 3) {
            for (int var42 = var16; var42 < var21; var42++) {
                for (int var43 = var22 - 1; var43 >= var23; var43--) {
                    if (var42 << 1 >= var43) {
                        arg3[var15] = arg0;
                    } else if (arg5) {
                        arg3[var15] = arg2;
                    }
                    var15++;
                }
                var15 += var17;
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZI)V", line = 1899)
    public static final void method387(boolean arg0, int arg1) {
        class130.field2307 = arg0;
        field797++;
        if (arg1 == 1) {
            class93.field1677 = !class110.method781((byte) 127);
        }
    }
}
