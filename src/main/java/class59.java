import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class59 extends class247 {

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "Ljava/lang/String;")
    public static String field864 = "Loading fonts - ";

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "Ljava/lang/String;")
    public static String field865 = null;

    @OriginalMember(owner = "client!bk", name = "s", descriptor = "I")
    public static int field871 = 0;

    @OriginalMember(owner = "client!bk", name = "u", descriptor = "Z")
    public static boolean field873 = false;

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "I")
    public static int field867 = 0;

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!bk", name = "t", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!bk", name = "w", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!bk", name = "v", descriptor = "J")
    public long field874;

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "Lbk;")
    public class59 field866;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "Lbk;")
    public class59 field868;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(B)V")
    public static void method376(byte arg0) {
        field865 = null;
        if (arg0 != -86) {
            method377(-20, 122, -65, -6, -90, 109, -26, 58, (class248) null, 1, true, -14L);
        }
        field864 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIIIIILsc;IZJ)Z")
    public static final boolean method377(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class248 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class8.field114 == class79.field1192;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var24 = arg2; var24 < arg2 + arg4; var24++) {
                if (var15 < 0 || var24 < 0 || var15 >= class231.field3748 || var24 >= class175.field2759) {
                    return false;
                }
                class113 var25 = class184.field2892[arg0][var15][var24];
                if (var25 != null && var25.field1646 >= 5) {
                    return false;
                }
            }
        }
        class158 var16 = new class158();
        var16.field2354 = arg11;
        var16.field2366 = arg0;
        var16.field2361 = arg5;
        var16.field2353 = arg6;
        var16.field2355 = arg7;
        var16.field2365 = arg8;
        var16.field2362 = arg9;
        var16.field2352 = arg1;
        var16.field2359 = arg2;
        var16.field2368 = arg1 + arg3 - 1;
        var16.field2363 = arg2 + arg4 - 1;
        for (int var17 = arg1; var17 < arg1 + arg3; var17++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var17 > arg1) {
                    var21++;
                }
                if (var17 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class184.field2892[var22][var17][var20] == null) {
                        class184.field2892[var22][var17][var20] = new class113(var22, var17, var20);
                    }
                }
                class113 var23 = class184.field2892[arg0][var17][var20];
                var23.field1634[var23.field1646] = var16;
                var23.field1638[var23.field1646] = var21;
                var23.field1637 |= var21;
                var23.field1646++;
                if (var13 && class100.field1497[var17][var20] != 0) {
                    var14 = class100.field1497[var17][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var18 = arg1; var18 < arg1 + arg3; var18++) {
                for (int var19 = arg2; var19 < arg2 + arg4; var19++) {
                    if (class100.field1497[var18][var19] == 0) {
                        class100.field1497[var18][var19] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class21.field276[class66.field974++] = var16;
        }
        return true;
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(B)V")
    public final void method378(byte arg0) {
        field875++;
        if (arg0 < -104 && this.field868 != null) {
            this.field868.field866 = this.field866;
            this.field866.field868 = this.field868;
            this.field866 = null;
            this.field868 = null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)V")
    public static final void method379(int arg0) {
        if (arg0 <= 89) {
            method382(-69, (class1) null);
        }
        while (class175.field2763.method449(class262.field4252, 8) >= 27) {
            int var1 = class175.field2763.method439(113, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class191.field3045[var1] == null) {
                var2 = true;
                class191.field3045[var1] = new class86();
            }
            class86 var3 = class191.field3045[var1];
            class187.field2939[class80.field1211++] = var1;
            var3.field3931 = class311.field4996;
            if (var3.field1321 != null && var3.field1321.method852((byte) -31)) {
                class125.method813(82, var3);
            }
            int var4 = class175.field2763.method439(119, 1);
            int var5 = class175.field2763.method439(107, 5);
            if (var5 > 15) {
                var5 -= 32;
            }
            int var6 = class175.field2763.method439(122, 1);
            if (var6 == 1) {
                class212.field3299[class140.field2016++] = var1;
            }
            int var7 = class195.field3091[class175.field2763.method439(110, 3)];
            if (var2) {
                var3.field3924 = var3.field3913 = var7;
            }
            var3.method586(true, class118.method780(class175.field2763.method439(119, 14), -29837));
            int var8 = class175.field2763.method439(110, 5);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method1729(var3.field1321.field1925, (byte) 76);
            var3.field3898 = var3.field1321.field1889;
            var3.field3983 = var3.field1321.field1923;
            if (var3.field3983 == 0) {
                var3.field3913 = 0;
            }
            var3.method1732(class214.field3347.field3970[0] + var5, var4 == 1, var3.method8((byte) -40), -12, class214.field3347.field3972[0] + var8);
            if (var3.field1321.method852((byte) -31)) {
                class1.method7(class148.field2204, (class191) null, (class1) null, var3.field3972[0], 0, var3, var3.field3970[0], 17733);
            }
        }
        class175.field2763.method440(7551);
        field870++;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)Z")
    public final boolean method380(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            field872++;
            return this.field868 != null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method381(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILaj;)I")
    public static final int method382(int arg0, class1 arg1) {
        field869++;
        if (arg0 != 32) {
            return 99;
        }
        int var2 = arg1.field9;
        class163 var3 = arg1.method1725(-124);
        if (arg1.field3946 == var3.field2517) {
            var2 = arg1.field17;
        } else if (arg1.field3946 == var3.field2511 || arg1.field3946 == var3.field2501 || arg1.field3946 == var3.field2527 || arg1.field3946 == var3.field2509) {
            var2 = arg1.field32;
        } else if (arg1.field3946 == var3.field2523 || arg1.field3946 == var3.field2518 || arg1.field3946 == var3.field2520 || arg1.field3946 == var3.field2525) {
            var2 = arg1.field14;
        }
        return var2;
    }
}
