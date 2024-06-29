import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class175 extends class209 {

    @OriginalMember(owner = "client!la", name = "I", descriptor = "I")
    public int field2837 = -1;

    @OriginalMember(owner = "client!la", name = "L", descriptor = "I")
    public int field2840 = 0;

    @OriginalMember(owner = "client!la", name = "F", descriptor = "I")
    public int field2834 = 12800;

    @OriginalMember(owner = "client!la", name = "J", descriptor = "I")
    public int field2838 = 12800;

    @OriginalMember(owner = "client!la", name = "U", descriptor = "I")
    public int field2849 = 0;

    @OriginalMember(owner = "client!la", name = "V", descriptor = "Z")
    public boolean field2850 = true;

    @OriginalMember(owner = "client!la", name = "y", descriptor = "I")
    public int field2828;

    @OriginalMember(owner = "client!la", name = "w", descriptor = "Luf;")
    public class168 field2826;

    @OriginalMember(owner = "client!la", name = "P", descriptor = "Luf;")
    public class168 field2844;

    @OriginalMember(owner = "client!la", name = "Q", descriptor = "I")
    public int field2845;

    @OriginalMember(owner = "client!la", name = "N", descriptor = "Ljk;")
    public class76 field2842;

    @OriginalMember(owner = "client!la", name = "z", descriptor = "Z")
    public static boolean field2829 = false;

    @OriginalMember(owner = "client!la", name = "x", descriptor = "Luf;")
    private static class168 field2827 = class148.method1019(-1720, "Loading textures )2 ");

    @OriginalMember(owner = "client!la", name = "O", descriptor = "Luf;")
    public static class168 field2843 = field2827;

    @OriginalMember(owner = "client!la", name = "S", descriptor = "Luf;")
    public static class168 field2847 = class148.method1019(-1720, "Untersuchen");

    @OriginalMember(owner = "client!la", name = "H", descriptor = "F")
    public static float field2836;

    @OriginalMember(owner = "client!la", name = "B", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!la", name = "D", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!la", name = "E", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!la", name = "G", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!la", name = "R", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!la", name = "T", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!la", name = "A", descriptor = "Lfj;")
    public static class283 field2830;

    @OriginalMember(owner = "client!la", name = "M", descriptor = "[I")
    public static int[] field2841;

    @OriginalMember(owner = "client!la", name = "K", descriptor = "[Lwa;")
    public static class284[] field2839;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V", line = 4)
    public final void method1261(boolean arg0) {
        this.field2849 = 0;
        this.field2834 = 12800;
        this.field2838 = 12800;
        field2848++;
        this.field2840 = 0;
        if (arg0) {
            this.method1267(-126, -63, true);
        }
        for (class123 var2 = (class123) this.field2842.method442(65293); var2 != null; var2 = (class123) this.field2842.method440(3)) {
            if (this.field2834 > var2.field1910) {
                this.field2834 = var2.field1910;
            }
            if (var2.field1909 > this.field2840) {
                this.field2840 = var2.field1909;
            }
            if (var2.field1908 > this.field2849) {
                this.field2849 = var2.field1908;
            }
            if (this.field2838 > var2.field1903) {
                this.field2838 = var2.field1903;
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "(B)V", line = 48)
    public static final void method1262(byte arg0) {
        field2831++;
        Object var1 = class113.field1772;
        synchronized (class113.field1772) {
            if (arg0 != 10) {
                field2841 = (int[]) null;
            }
            if (class267.field4511 == 0) {
                class51.field622.method429(new class281(), arg0 - 10, 5);
            }
            class267.field4511 = 600;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BI)Lph;", line = 71)
    public static final class207 method1263(byte arg0, int arg1) {
        class207 var2 = (class207) class18.field203.method185(-1, (long) arg1);
        if (arg0 != -56) {
            return (class207) null;
        }
        field2846++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class303.field5111.method1647(26, (byte) 124, arg1);
        class207 var4 = new class207();
        if (var3 != null) {
            var4.method1445(arg0 + 56, new class153(var3));
        }
        class18.field203.method187(var4, (long) arg1, (byte) 10);
        return var4;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIZIIIIIIIIII)Z", line = 107)
    public static final boolean method1264(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var14 = 0; var14 < 104; var14++) {
                class145.field2251[var13][var14] = 0;
                class22.field276[var13][var14] = 99999999;
            }
        }
        int var15 = arg10;
        class145.field2251[arg10][arg4] = 99;
        field2835++;
        class22.field276[arg10][arg4] = 0;
        int var16 = arg4;
        byte var17 = 0;
        if (arg3 != -374) {
            field2841 = (int[]) null;
        }
        class240.field3899[var17] = arg10;
        boolean var18 = false;
        int var19 = 0;
        int var41 = var17 + 1;
        class263.field4456[var17] = arg4;
        int[][] var20 = class140.field2176[class79.field1127].field4317;
        label397: while (var41 != var19) {
            var16 = class263.field4456[var19];
            var15 = class240.field3899[var19];
            var19 = var19 + 1 & 0xFFF;
            if (arg12 == var15 && arg9 == var16) {
                var18 = true;
                break;
            }
            if (arg6 != 0) {
                if ((arg6 < 5 || arg6 == 10) && class140.field2176[class79.field1127].method1739(arg12, arg9, arg11, 0, var15, arg6 - 1, var16, arg1)) {
                    var18 = true;
                    break;
                }
                if (arg6 < 10 && class140.field2176[class79.field1127].method1741(arg6 - 1, false, arg1, arg12, arg11, arg9, var16, var15)) {
                    var18 = true;
                    break;
                }
            }
            if (arg8 != 0 && arg5 != 0 && class140.field2176[class79.field1127].method1733(arg9, (byte) 91, arg1, arg5, arg7, arg12, var15, arg8, var16)) {
                var18 = true;
                break;
            }
            int var21 = class22.field276[var15][var16] + 1;
            if (var15 > 0 && class145.field2251[var15 - 1][var16] == 0 && (var20[var15 - 1][var16] & 0x12C010E) == 0 && (var20[var15 - 1][arg1 + var16 - 1] & 0x12C0138) == 0) {
                int var22 = 1;
                while (true) {
                    if (var22 >= arg1 - 1) {
                        class240.field3899[var41] = var15 - 1;
                        class263.field4456[var41] = var16;
                        class145.field2251[var15 - 1][var16] = 2;
                        var41 = var41 + 1 & 0xFFF;
                        class22.field276[var15 - 1][var16] = var21;
                        break;
                    }
                    if ((var20[var15 - 1][var16 + var22] & 0x12C013E) != 0) {
                        break;
                    }
                    var22++;
                }
            }
            if (var15 < 102 && class145.field2251[var15 + 1][var16] == 0 && (var20[arg1 + var15][var16] & 0x12C0183) == 0 && (var20[arg1 + var15][arg1 + var16 - 1] & 0x12C01E0) == 0) {
                int var23 = 1;
                while (true) {
                    if (var23 >= arg1 - 1) {
                        class240.field3899[var41] = var15 + 1;
                        class263.field4456[var41] = var16;
                        class145.field2251[var15 + 1][var16] = 8;
                        class22.field276[var15 + 1][var16] = var21;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var20[arg1 + var15][var16 + var23] & 0x12C01E3) != 0) {
                        break;
                    }
                    var23++;
                }
            }
            if (var16 > 0 && class145.field2251[var15][var16 - 1] == 0 && (var20[var15][var16 - 1] & 0x12C010E) == 0 && (var20[var15 + arg1 - 1][var16 - 1] & 0x12C0183) == 0) {
                int var24 = 1;
                while (true) {
                    if ((arg1 - 1) <= var24) {
                        class240.field3899[var41] = var15;
                        class263.field4456[var41] = var16 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class145.field2251[var15][var16 - 1] = 1;
                        class22.field276[var15][var16 - 1] = var21;
                        break;
                    }
                    if ((var20[var15 + var24][var16 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var24++;
                }
            }
            if (var16 < 102 && class145.field2251[var15][var16 + 1] == 0 && (var20[var15][var16 + arg1] & 0x12C0138) == 0 && (var20[arg1 + var15 - 1][arg1 + var16] & 0x12C01E0) == 0) {
                int var25 = 1;
                while (true) {
                    if (arg1 - 1 <= var25) {
                        class240.field3899[var41] = var15;
                        class263.field4456[var41] = var16 + 1;
                        class145.field2251[var15][var16 + 1] = 4;
                        class22.field276[var15][var16 + 1] = var21;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var20[var15 + var25][arg1 + var16] & 0x12C01F8) != 0) {
                        break;
                    }
                    var25++;
                }
            }
            if (var15 > 0 && var16 > 0 && class145.field2251[var15 - 1][var16 - 1] == 0 && (var20[var15 - 1][var16 + arg1 - 1 - 1] & 0x12C0138) == 0 && (var20[var15 - 1][var16 - 1] & 0x12C010E) == 0 && (var20[var15 + arg1 - 1 - 1][var16 - 1] & 0x12C0183) == 0) {
                int var26 = 1;
                while (true) {
                    if (var26 >= (arg1 - 1)) {
                        class240.field3899[var41] = var15 - 1;
                        class263.field4456[var41] = var16 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class145.field2251[var15 - 1][var16 - 1] = 3;
                        class22.field276[var15 - 1][var16 - 1] = var21;
                        break;
                    }
                    if ((var20[var15 - 1][var16 + var26 - 1] & 0x12C013E) != 0 || (var20[var26 + var15 - 1][var16 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var26++;
                }
            }
            if (var15 < 102 && var16 > 0 && class145.field2251[var15 + 1][var16 - 1] == 0 && (var20[var15 + 1][var16 - 1] & 0x12C010E) == 0 && (var20[var15 + arg1][var16 - 1] & 0x12C0183) == 0 && (var20[var15 + arg1][var16 + arg1 - 1 - 1] & 0x12C01E0) == 0) {
                int var27 = 1;
                while (true) {
                    if ((arg1 - 1) <= var27) {
                        class240.field3899[var41] = var15 + 1;
                        class263.field4456[var41] = var16 - 1;
                        class145.field2251[var15 + 1][var16 - 1] = 9;
                        class22.field276[var15 + 1][var16 - 1] = var21;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var20[arg1 + var15][var16 + var27 - 1] & 0x12C01E3) != 0 || (var20[var15 + var27 + 1][var16 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var27++;
                }
            }
            if (var15 > 0 && var16 < 102 && class145.field2251[var15 - 1][var16 + 1] == 0 && (var20[var15 - 1][var16 + 1] & 0x12C010E) == 0 && (var20[var15 - 1][var16 + arg1] & 0x12C0138) == 0 && (var20[var15][arg1 + var16] & 0x12C01E0) == 0) {
                int var28 = 1;
                while (true) {
                    if ((arg1 - 1) <= var28) {
                        class240.field3899[var41] = var15 - 1;
                        class263.field4456[var41] = var16 + 1;
                        var41 = var41 + 1 & 0xFFF;
                        class145.field2251[var15 - 1][var16 + 1] = 6;
                        class22.field276[var15 - 1][var16 + 1] = var21;
                        break;
                    }
                    if ((var20[var15 - 1][var16 + var28 + 1] & 0x12C013E) != 0 || (var20[var15 + var28 - 1][arg1 + var16] & 0x12C01F8) != 0) {
                        break;
                    }
                    var28++;
                }
            }
            if (var15 < 102 && var16 < 102 && class145.field2251[var15 + 1][var16 + 1] == 0 && (var20[var15 + 1][arg1 + var16] & 0x12C0138) == 0 && (var20[arg1 + var15][var16 + arg1] & 0x12C01E0) == 0 && (var20[arg1 + var15][var16 + 1] & 0x12C0183) == 0) {
                for (int var29 = 1; var29 < (arg1 - 1); var29++) {
                    if ((var20[var15 + var29 + 1][arg1 + var16] & 0x12C01F8) != 0 || (var20[var15 + arg1][var16 + var29 + 1] & 0x12C01E3) != 0) {
                        continue label397;
                    }
                }
                class240.field3899[var41] = var15 + 1;
                class263.field4456[var41] = var16 + 1;
                class145.field2251[var15 + 1][var16 + 1] = 12;
                class22.field276[var15 + 1][var16 + 1] = var21;
                var41 = var41 + 1 & 0xFFF;
            }
        }
        class8.field104 = 0;
        if (!var18) {
            if (!arg2) {
                return false;
            }
            int var30 = 100;
            int var31 = 1000;
            byte var32 = 10;
            for (int var33 = arg12 - var32; var33 <= (arg12 + var32); var33++) {
                for (int var34 = arg9 - var32; var34 <= (arg9 + var32); var34++) {
                    if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104 && class22.field276[var33][var34] < 100) {
                        int var35 = 0;
                        if (var33 < arg12) {
                            var35 = arg12 - var33;
                        } else if ((arg8 + arg12 - 1) < var33) {
                            var35 = var33 + 1 - arg12 - arg8;
                        }
                        int var36 = 0;
                        if (var34 < arg9) {
                            var36 = arg9 - var34;
                        } else if ((arg9 - (1 - arg5)) < var34) {
                            var36 = var34 - (arg5 + arg9 - 1);
                        }
                        int var37 = var35 * var35 + var36 * var36;
                        if (var37 < var31 || var31 == var37 && var30 > class22.field276[var33][var34]) {
                            var31 = var37;
                            var16 = var34;
                            var15 = var33;
                            var30 = class22.field276[var33][var34];
                        }
                    }
                }
            }
            if (var31 == 1000) {
                return false;
            }
            if (arg10 == var15 && arg4 == var16) {
                return false;
            }
            class8.field104 = 1;
        }
        byte var38 = 0;
        class240.field3899[var38] = var15;
        int var42 = var38 + 1;
        class263.field4456[var38] = var16;
        int var39;
        int var40 = var39 = class145.field2251[var15][var16];
        while (arg10 != var15 || arg4 != var16) {
            if (var39 != var40) {
                var39 = var40;
                class240.field3899[var42] = var15;
                class263.field4456[var42++] = var16;
            }
            if ((var40 & 0x2) != 0) {
                var15++;
            } else if ((var40 & 0x8) != 0) {
                var15--;
            }
            if ((var40 & 0x1) != 0) {
                var16++;
            } else if ((var40 & 0x4) != 0) {
                var16--;
            }
            var40 = class145.field2251[var15][var16];
        }
        if (var42 > 0) {
            class138.method952((byte) 49, var42, arg0);
            return true;
        } else if (arg0 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)Z", line = 606)
    public static final boolean method1265(int arg0, int arg1) {
        int var2 = 59 % ((arg0 + 54) / 56);
        field2832++;
        return (arg1 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!la", name = "e", descriptor = "(B)V", line = 618)
    public static void method1266(byte arg0) {
        field2843 = null;
        field2841 = null;
        field2830 = null;
        field2847 = null;
        field2839 = null;
        field2827 = null;
        if (arg0 <= 25) {
            method1266((byte) -116);
        }
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Luf;Luf;IIIZ)V", line = 707)
    public class175(class168 arg0, class168 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field2828 = arg3;
        this.field2826 = arg0;
        this.field2850 = arg5;
        this.field2837 = arg4;
        this.field2844 = arg1;
        this.field2845 = arg2;
        this.field2842 = new class76();
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIZ)Z", line = 683)
    public final boolean method1267(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method1263((byte) -63, 24);
        }
        field2833++;
        if (arg1 < this.field2838 || this.field2849 < arg1 || arg0 < this.field2834 || arg0 > this.field2840) {
            return false;
        }
        for (class123 var4 = (class123) this.field2842.method442(65293); var4 != null; var4 = (class123) this.field2842.method440(3)) {
            if (var4.method878(arg0, -65, arg1)) {
                return true;
            }
        }
        return false;
    }
}
