import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class63 extends class183 implements class116 {

    @OriginalMember(owner = "client!f", name = "B", descriptor = "Laf;")
    public class110 field776;

    @OriginalMember(owner = "client!f", name = "F", descriptor = "Z")
    private boolean field780;

    @OriginalMember(owner = "client!f", name = "H", descriptor = "I")
    public static int field782 = 0;

    @OriginalMember(owner = "client!f", name = "U", descriptor = "I")
    public static int field795 = 1;

    @OriginalMember(owner = "client!f", name = "y", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!f", name = "z", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!f", name = "A", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!f", name = "C", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!f", name = "D", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!f", name = "E", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!f", name = "G", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!f", name = "I", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!f", name = "J", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!f", name = "K", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!f", name = "L", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!f", name = "M", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!f", name = "N", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!f", name = "O", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!f", name = "P", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!f", name = "Q", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!f", name = "R", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!f", name = "S", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!f", name = "T", descriptor = "[Lrg;")
    public static class395[] field794;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(III)Lv;")
    public static final class261 method320(int arg0, int arg1, int arg2) {
        class263 var3 = class293.field4356[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3783;
    }

    @OriginalMember(owner = "client!f", name = "h", descriptor = "(I)V")
    public static void method321(int arg0) {
        if (arg0 != -11726) {
            method323(86L, 36);
        }
        field794 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IZZ)V")
    public static final void method322(int arg0, boolean arg1, boolean arg2) {
        if (~arg0 == -1) {
            class231.field3205 = class280.method1757(0, class154.field1855 * 2, class42.field512, class314.field4583, arg0, class126.field1542);
        } else {
            if (arg2) {
                class231.field3205 = class280.method1757(0, 0, class42.field512, class314.field4583, 0, class126.field1542);
                class231.field3205.method1444(0);
                class406 var3 = class144.method681(0, (byte) -76, class376.field5362, class39.field470);
                class206 var4 = class231.field3205.method1484(var3, class473.method2794(class171.field2022, class376.field5362, 0), true);
                class291.method1835(true, var4, class154.field1854.method205((byte) 122, class68.field849), false);
                class231.field3205.method1477();
                class85.method435(-1);
                class231.field3205.method1754(1);
            }
            try {
                class231.field3205 = class280.method1757(0, class154.field1855 * 2, class42.field512, class314.field4583, arg0, class126.field1542);
            } catch (Throwable var7) {
                class231.field3205 = class280.method1757(0, 0, class42.field512, class314.field4583, 0, class126.field1542);
                arg0 = 0;
            }
        }
        ++field790;
        if (class231.field3205.method1485()) {
            class345 var5 = class231.field3205.method1396(157286400);
            class231.field3205.method1490(var5);
        }
        class375.field5347 = arg0;
        class401.method2398(48);
        if (!class231.field3205.method1407()) {
            class440.field6298 = 1;
        }
        class231.field3205.method1395(class440.field6298);
        class231.field3205.method1381(0);
        class29.field379 = class231.field3205.method1344();
        class181.field2327 = class231.field3205.method1344();
        int var6 = (int) ((double) class159.field1895 * 34.46D);
        if (class231.field3205.method1410()) {
            var6 += 128;
        }
        class231.field3205.method1422(50, var6);
        class231.field3205.method1342(!class265.field3817);
        if (class231.field3205.method1476()) {
            class16.method108(class487.field6914, -21811);
        }
        class216.method1206(class289.field4316 >> 3, class159.field1895 >> 3, class231.field3205, true);
        class347.method2099((byte) -126);
        class231.field3211 = arg1;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(B)I")
    public final int method31(byte arg0) {
        int var2 = 42 % ((arg0 - -23) / 35);
        ++field775;
        return this.field776.field1333;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)I")
    public final int method26(byte arg0) {
        ++field789;
        return arg0 != 73 ? 4 : this.field776.field1341;
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(ILoj;)Lmg;")
    public final class451 method19(int arg0, class280 arg1) {
        ++field779;
        class352 var3 = this.field776.method529(true, 105, arg1, super.field2360, super.field2355, 1024, false);
        if (var3 == null) {
            return null;
        } else {
            class327 var4 = arg1.method1456();
            var4.method553(super.field2355 + super.field2354, super.field2352, super.field2360 + super.field2359);
            class451 var5 = null;
            if (this.field780) {
                var5 = class134.method638(762096108, 1);
            }
            if (this.field776.field1331 == null) {
                var3.method1716(var4, var5 != null ? var5.field6379[0] : null, 0);
            } else {
                class46 var6 = this.field776.field1331.method2272();
                arg1.method1463(var3, var6, var4, var5 == null ? null : var5.field6379[0], 0);
            }
            if (arg0 <= 95) {
                field794 = null;
            }
            this.field776.method532((byte) -109, var3, true, super.field2360 >> 7, super.field2360 >> 7, super.field2355 >> 7, super.field2355 >> 7, arg1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method323(long arg0, int arg1) {
        ++field778;
        if (arg0 > 0L && arg0 < 6582952005840035281L) {
            if (arg1 >= -1) {
                return null;
            } else if (~(arg0 % 37L) == -1L) {
                return null;
            } else {
                int var3 = 0;
                for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                    ++var3;
                }
                StringBuffer var6 = new StringBuffer(var3);
                while (arg0 != 0L) {
                    long var7 = arg0;
                    arg0 /= 37L;
                    char var9 = class330.field4751[(int) (-(arg0 * 37L) + var7)];
                    if (~var9 == -96) {
                        int var10 = var6.length() - 1;
                        var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                        var9 = 160;
                    }
                    var6.append(var9);
                }
                var6.reverse();
                var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                return var6.toString();
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILoj;B)Lqh;")
    public final class352 method21(int arg0, class280 arg1, byte arg2) {
        ++field787;
        if (arg2 != -98) {
            field794 = null;
        }
        return this.field776.method529(false, 121, arg1, 0, 0, arg0, false);
    }

    @OriginalMember(owner = "client!f", name = "g", descriptor = "(I)I")
    public final int method126(int arg0) {
        ++field791;
        if (arg0 >= -99) {
            this.field776 = null;
        }
        return this.field776.method530(true);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)I")
    public final int method16(boolean arg0) {
        if (arg0) {
            this.field776 = null;
        }
        ++field777;
        return this.field776.field1346;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILoj;)V")
    public final void method20(int arg0, class280 arg1) {
        if (arg0 != 5744) {
            this.method22(-31);
        }
        this.field776.method528(arg1, 131072);
        ++field773;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILoj;II)Z")
    public final boolean method28(int arg0, class280 arg1, int arg2, int arg3) {
        ++field792;
        class352 var5 = this.field776.method529(false, 105, arg1, super.field2360, super.field2355, 65536, false);
        if (arg3 != -6085) {
            this.method18(-62, (class280) null);
        }
        if (var5 == null) {
            return false;
        } else {
            class327 var6 = arg1.method1456();
            var6.method553(super.field2355 - -super.field2354, super.field2352, super.field2360 + super.field2359);
            return var5.method1695(arg0, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
    public final void method24(int arg0) {
        ++field786;
        if (arg0 <= 41) {
            this.method31((byte) 0);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ICI)I")
    public static final int method324(int arg0, char arg1, int arg2) {
        ++field783;
        int var3 = arg1 << 4;
        if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
            arg1 = Character.toLowerCase(arg1);
            var3 = (arg1 << 4) + 1;
        }
        if (~arg1 == -242 && arg2 == 0) {
            var3 = 1762;
        }
        int var4 = -29 % ((74 - arg0) / 43);
        return var3;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIZ[Lab;)V")
    public static final void method325(int arg0, int arg1, int arg2, int arg3, boolean arg4, class256[] arg5) {
        ++field793;
        if (arg1 >= -10) {
            field795 = -8;
        }
        for (int var6 = 0; ~var6 > ~arg5.length; ++var6) {
            class256 var7 = arg5[var6];
            if (var7 != null && var7.field3646 == arg2) {
                class92.method458(arg4, var7, -29507, arg0, arg3);
                class60.method311(var7, arg0, (byte) 126, arg3);
                if (~var7.field3638 < ~(var7.field3628 - var7.field3597)) {
                    var7.field3638 = -var7.field3597 + var7.field3628;
                }
                if (var7.field3695 - var7.field3707 < var7.field3658) {
                    var7.field3658 = -var7.field3707 + var7.field3695;
                }
                if (var7.field3638 < 0) {
                    var7.field3638 = 0;
                }
                if (var7.field3658 < 0) {
                    var7.field3658 = 0;
                }
                if (~var7.field3654 == -1) {
                    class442.method2608(var7, -96, arg4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Loj;Lcu;IIIIIZIIIIII)V")
    public class63(class280 arg0, class415 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg4, arg5, arg6, arg8, arg9, arg10, class176.method862(arg12, -7411, arg11));
        this.field776 = new class110(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
        this.field780 = arg1.field5990 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(I)Z")
    public final boolean method22(int arg0) {
        if (arg0 > -32) {
            field795 = -91;
        }
        ++field788;
        return this.field776.method524(10);
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(ILoj;)V")
    public final void method18(int arg0, class280 arg1) {
        this.field776.method523(-27426, arg1);
        ++field774;
        int var3 = 25 / ((62 - arg0) / 63);
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "(ILoj;)V")
    public final void method27(int arg0, class280 arg1) {
        if (arg0 != 0) {
            field782 = -105;
        }
        ++field781;
        class352 var3 = this.field776.method529(true, 125, arg1, super.field2360, super.field2355, 131072, false);
        if (var3 != null) {
            this.field776.method532((byte) -87, var3, false, super.field2360 >> 7, super.field2360 >> 7, super.field2355 >> 7, super.field2355 >> 7, arg1);
        }
    }
}
