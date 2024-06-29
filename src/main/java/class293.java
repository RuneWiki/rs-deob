import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class293 extends class112 {

    @OriginalMember(owner = "client!rl", name = "X", descriptor = "Ljava/lang/String;")
    private String field4660 = "null";

    @OriginalMember(owner = "client!rl", name = "N", descriptor = "Lic;")
    public static class160 field4651 = new class160(20);

    @OriginalMember(owner = "client!rl", name = "E", descriptor = "C")
    public char field4643;

    @OriginalMember(owner = "client!rl", name = "W", descriptor = "C")
    public char field4659;

    @OriginalMember(owner = "client!rl", name = "z", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!rl", name = "A", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!rl", name = "B", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!rl", name = "C", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!rl", name = "D", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!rl", name = "G", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!rl", name = "H", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!rl", name = "I", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!rl", name = "J", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!rl", name = "K", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!rl", name = "L", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!rl", name = "P", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!rl", name = "R", descriptor = "I")
    private int field4654;

    @OriginalMember(owner = "client!rl", name = "S", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!rl", name = "U", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!rl", name = "Y", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!rl", name = "V", descriptor = "Lsb;")
    public static class124 field4658;

    @OriginalMember(owner = "client!rl", name = "F", descriptor = "Lmj;")
    public class144 field4644;

    @OriginalMember(owner = "client!rl", name = "T", descriptor = "Lmj;")
    private class144 field4656;

    @OriginalMember(owner = "client!rl", name = "O", descriptor = "Z")
    public static boolean field4652;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)Ljava/lang/String;")
    public final String method1954(int arg0, int arg1) {
        field4650++;
        if (this.field4644 == null) {
            return this.field4660;
        } else if (arg1 >= -90) {
            return null;
        } else {
            class85 var3 = (class85) this.field4644.method1063((byte) -87, (long) arg0);
            return var3 == null ? this.field4660 : var3.field1395;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(III)Lcc;")
    public static final class195 method1955(int arg0, int arg1, int arg2) {
        class129 var3 = class26.field455[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2143;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(II)I")
    public final int method1956(int arg0, int arg1) {
        field4645++;
        if (this.field4644 == null) {
            return this.field4654;
        }
        class186 var3 = (class186) this.field4644.method1063((byte) -17, (long) arg1);
        if (var3 == null) {
            return this.field4654;
        } else if (arg0 == -256) {
            return var3.field3051;
        } else {
            return -94;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lla;I)V")
    public static final void method1957(class171 arg0, int arg1) {
        if (arg1 != -28276) {
            return;
        }
        class38 var2 = arg0.method1224(-1);
        arg0.field2901 = var2.field651;
        field4642++;
        if (arg0.field2843 == 0) {
            arg0.field2900 = 0;
            return;
        }
        if (arg0.field2816 != -1 && arg0.field2885 == 0) {
            class77 var3 = class28.method246(arg1 ^ 0x6E67, arg0.field2816);
            if (arg0.field2883 > 0 && var3.field1274 == 0) {
                arg0.field2900++;
                return;
            }
            if (arg0.field2883 <= 0 && var3.field1276 == 0) {
                arg0.field2900++;
                return;
            }
        }
        if (arg0.field2817 != -1 && class207.field3336 >= arg0.field2856) {
            class281 var4 = class35.method298(arg0.field2817, false);
            if (var4.field4459 && var4.field4455 != -1) {
                class77 var5 = class28.method246(120, var4.field4455);
                if (arg0.field2883 > 0 && var5.field1274 == 0) {
                    arg0.field2900++;
                    return;
                }
                if (arg0.field2883 <= 0 && var5.field1276 == 0) {
                    arg0.field2900++;
                    return;
                }
            }
        }
        int var6 = arg0.field2849;
        int var7 = arg0.field2887;
        int var8 = arg0.field2844[arg0.field2843 - 1] * 128 + (arg0.method1226((byte) -87) * 64);
        int var9 = arg0.field2813[arg0.field2843 - 1] * 128 + (arg0.method1226((byte) -97) * 64);
        if ((var8 - var6) > 256 || var8 - var6 < -256 || var9 - var7 > 256 || (var9 - var7) < -256) {
            arg0.field2887 = var9;
            arg0.field2849 = var8;
            return;
        }
        if (var6 < var8) {
            if (var7 < var9) {
                arg0.field2893 = 1280;
            } else if (var9 >= var7) {
                arg0.field2893 = 1536;
            } else {
                arg0.field2893 = 1792;
            }
        } else if (var6 > var8) {
            if (var7 < var9) {
                arg0.field2893 = 768;
            } else if (var9 < var7) {
                arg0.field2893 = 256;
            } else {
                arg0.field2893 = 512;
            }
        } else if (var9 > var7) {
            arg0.field2893 = 1024;
        } else if (var9 < var7) {
            arg0.field2893 = 0;
        }
        int var10 = 4;
        int var11 = arg0.field2893 - arg0.field2831 & 0x7FF;
        byte var12 = 1;
        if (var11 > 1024) {
            var11 -= 2048;
        }
        boolean var13 = true;
        int var14 = var2.field650;
        if (var11 >= -256 && var11 <= 256) {
            var14 = var2.field653;
        } else if (var11 >= 256 && var11 < 768) {
            var14 = var2.field673;
        } else if (var11 >= -768 && var11 <= -256) {
            var14 = var2.field641;
        }
        if (var14 == -1) {
            var14 = var2.field653;
        }
        arg0.field2901 = var14;
        if (arg0 instanceof class139) {
            var13 = ((class139) arg0).field2321.field2707;
        }
        if (var13) {
            if (arg0.field2893 != arg0.field2831 && arg0.field2832 == -1 && arg0.field2891 != 0) {
                var10 = 2;
            }
            if (arg0.field2843 > 2) {
                var10 = 6;
            }
            if (arg0.field2843 > 3) {
                var10 = 8;
            }
            if (arg0.field2900 > 0 && arg0.field2843 > 1) {
                var10 = 8;
                arg0.field2900--;
            }
        } else {
            if (arg0.field2843 > 1) {
                var10 = 6;
            }
            if (arg0.field2843 > 2) {
                var10 = 8;
            }
            if (arg0.field2900 > 0 && arg0.field2843 > 1) {
                arg0.field2900--;
                var10 = 8;
            }
        }
        if (arg0.field2905[arg0.field2843 - 1] == 2) {
            var12 = 2;
            var10 <<= 0x1;
        } else if (arg0.field2905[arg0.field2843 - 1] == 0) {
            var10 >>= 0x1;
            var12 = 0;
        }
        if (var10 < 8 || var2.field665 == -1) {
            if (var2.field638 != -1 && var12 == 0) {
                if (arg0.field2901 == var2.field650 && var2.field660 != -1) {
                    arg0.field2901 = var2.field660;
                } else if (arg0.field2901 == var2.field641 && var2.field635 != -1) {
                    arg0.field2901 = var2.field635;
                } else if (arg0.field2901 == var2.field673 && var2.field668 != -1) {
                    arg0.field2901 = var2.field668;
                } else {
                    arg0.field2901 = var2.field638;
                }
            }
        } else if (arg0.field2901 == var2.field650 && var2.field672 != -1) {
            arg0.field2901 = var2.field672;
        } else if (arg0.field2901 == var2.field641 && var2.field658 != -1) {
            arg0.field2901 = var2.field658;
        } else if (arg0.field2901 == var2.field673 && var2.field670 != -1) {
            arg0.field2901 = var2.field670;
        } else {
            arg0.field2901 = var2.field665;
        }
        if (var2.field657 != -1) {
            int var15 = var10 << 7;
            if (arg0.field2843 == 1) {
                int var16 = (var9 >= arg0.field2887 ? var9 - arg0.field2887 : -var9 + arg0.field2887) << 7;
                int var17 = (var8 >= arg0.field2849 ? var8 - arg0.field2849 : -var8 + arg0.field2849) << 7;
                int var18 = arg0.field2894 * arg0.field2894;
                int var19 = var16 < var17 ? var17 : var16;
                int var20 = var19 * 2 * var2.field657;
                if (var18 > var20) {
                    arg0.field2894 /= 2;
                } else if ((var18 / 2) > var19) {
                    arg0.field2894 -= var2.field657;
                    if (arg0.field2894 < 0) {
                        arg0.field2894 = 0;
                    }
                } else if (var15 > arg0.field2894) {
                    arg0.field2894 += var2.field657;
                    if (arg0.field2894 > var15) {
                        arg0.field2894 = var15;
                    }
                }
            } else if (var15 > arg0.field2894) {
                arg0.field2894 += var2.field657;
                if (arg0.field2894 > var15) {
                    arg0.field2894 = var15;
                }
            } else if (arg0.field2894 > 0) {
                arg0.field2894 -= var2.field657;
                if (arg0.field2894 < 0) {
                    arg0.field2894 = 0;
                }
            }
            var10 = arg0.field2894 >> 7;
            if (var10 < 1) {
                var10 = 1;
            }
        }
        if (var8 > var6) {
            arg0.field2849 += var10;
            if (var8 < arg0.field2849) {
                arg0.field2849 = var8;
            }
        } else if (var6 > var8) {
            arg0.field2849 -= var10;
            if (arg0.field2849 < var8) {
                arg0.field2849 = var8;
            }
        }
        if (var7 < var9) {
            arg0.field2887 += var10;
            if (arg0.field2887 > var9) {
                arg0.field2887 = var9;
            }
        } else if (var7 > var9) {
            arg0.field2887 -= var10;
            if (arg0.field2887 < var9) {
                arg0.field2887 = var9;
            }
        }
        if (arg0.field2849 != var8 || arg0.field2887 != var9) {
            return;
        }
        if (arg0.field2883 > 0) {
            arg0.field2883--;
        }
        arg0.field2843--;
        return;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V")
    private final void method1958(int arg0) {
        field4638++;
        this.field4656 = new class144(this.field4644.method1066(-24662));
        if (arg0 <= 115) {
            this.field4659 = 'R';
        }
        for (class85 var2 = (class85) this.field4644.method1062(-85); var2 != null; var2 = (class85) this.field4644.method1059(-14608)) {
            class218 var3 = new class218(var2.field1395, (int) var2.field2406);
            this.field4656.method1064(var3, class29.method256((byte) -95, var2.field1395), (byte) -122);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(SZ)Z")
    public static final boolean method1959(short arg0, boolean arg1) {
        field4657++;
        if (arg1) {
            method1965(-90, (Component) null, -36, -120);
        }
        if (arg0 == 58 || arg0 == 51 || arg0 == 57 || arg0 == 10 || arg0 == 4 || arg0 == 17 || arg0 == 8 || arg0 == 44) {
            return true;
        } else if (arg0 == 6 || arg0 == 12 || arg0 == 1003 || arg0 == 1004) {
            return true;
        } else if (arg0 == 41 || arg0 == 22 || arg0 == 25 || arg0 == 37 || arg0 == 29) {
            return true;
        } else {
            return arg0 == 2 || arg0 == 39 || arg0 == 40 || arg0 == 16 || arg0 == 35 || arg0 == 42;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1960(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 - arg5 >= class32.field540 && arg3 + arg5 <= class61.field1034 && arg1 - arg5 >= class108.field1650 && class154.field2509 >= arg1 + arg5) {
            class20.method169(arg2, 1, arg5, arg4, arg6, arg3, arg1);
        } else {
            class247.method1638(arg4, (byte) 40, arg5, arg2, arg1, arg3, arg6);
        }
        if (arg0 < -84) {
            field4648++;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method1961(int arg0, String arg1) {
        field4647++;
        if (this.field4644 == null) {
            return false;
        }
        if (arg0 != -9) {
            this.method1961(46, (String) null);
        }
        if (this.field4656 == null) {
            this.method1958(arg0 + 125);
        }
        for (class218 var3 = (class218) this.field4656.method1063((byte) -71, class29.method256((byte) -53, arg1)); var3 != null; var3 = (class218) this.field4656.method1068(-1)) {
            if (var3.field3508.equals(arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)V")
    public static final void method1962(int arg0) {
        class29.field506.method1156(arg0 ^ 0xFFFFF3B5);
        class136.field2259.method1156(arg0 - 3178);
        class80.field1327.method1156(arg0 - 3151);
        if (arg0 != 3075) {
            method1955(108, 70, -111);
        }
        field4661++;
    }

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "(B)V")
    private final void method1963(byte arg0) {
        field4641++;
        this.field4656 = new class144(this.field4644.method1066(-24662));
        if (arg0 != -99) {
            this.field4654 = 27;
        }
        for (class186 var2 = (class186) this.field4644.method1062(125); var2 != null; var2 = (class186) this.field4644.method1059(arg0 ^ 0x396D)) {
            class186 var3 = new class186((int) var2.field2406);
            this.field4656.method1064(var3, (long) var2.field3051, (byte) -127);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lsb;III)[Lfc;")
    public static final class149[] method1964(class124 arg0, int arg1, int arg2, int arg3) {
        field4649++;
        if (arg3 == 0) {
            return class113.method833(arg2, arg0, arg1, -94) ? class10.method64((byte) -75) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILjava/awt/Component;II)Lwj;")
    public static final class130 method1965(int arg0, Component arg1, int arg2, int arg3) {
        field4640++;
        try {
            Class var4 = Class.forName("di");
            class130 var5 = (class130) var4.getDeclaredConstructor().newInstance();
            var5.method746(arg1, arg3, arg0, true);
            if (arg2 > -57) {
                method1965(-117, (Component) null, 67, 107);
            }
            return var5;
        } catch (Throwable var7) {
            class282 var6 = new class282();
            var6.method746(arg1, arg3, arg0, true);
            return var6;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILig;Z)V")
    private final void method1966(int arg0, class136 arg1, boolean arg2) {
        field4646++;
        if (arg0 == 1) {
            this.field4643 = class259.method1733(arg1.method981(false), 94);
        } else if (arg0 == 2) {
            this.field4659 = class259.method1733(arg1.method981(!arg2), 42);
        } else if (arg0 == 3) {
            this.field4660 = arg1.method1010(-107);
        } else if (arg0 == 4) {
            this.field4654 = arg1.method1022(115);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg1.method996(65280);
            this.field4644 = new class144(class14.method101(var4, -18851));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method1022(108);
                class146 var7;
                if (arg0 == 5) {
                    var7 = new class85(arg1.method1010(-97));
                } else {
                    var7 = new class186(arg1.method1022(109));
                }
                this.field4644.method1064(var7, (long) var6, (byte) -125);
            }
        }
        if (!arg2) {
            this.method1969(-26, (class136) null);
        }
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(III)V")
    public static final void method1967(int arg0, int arg1, int arg2) {
        class192.field3138[arg1] = arg0;
        field4655++;
        if (arg2 != 2910) {
            field4651 = null;
        }
        class5 var3 = (class5) class116.field1948.method1063((byte) -83, (long) arg1);
        if (var3 == null) {
            class5 var4 = new class5(class62.method472(116) + 500L);
            class116.field1948.method1064(var4, (long) arg1, (byte) -128);
        } else {
            var3.field66 = class62.method472(124) + 500L;
        }
    }

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(Z)V")
    public static void method1968(boolean arg0) {
        field4658 = null;
        if (arg0) {
            method1960(75, -1, -92, 98, 107, -31, -127);
        }
        field4651 = null;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILig;)V")
    public final void method1969(int arg0, class136 arg1) {
        field4653++;
        if (arg0 != 959) {
            return;
        }
        while (true) {
            int var3 = arg1.method1012(4);
            if (var3 == 0) {
                return;
            }
            this.method1966(var3, arg1, true);
        }
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(II)Z")
    public final boolean method1970(int arg0, int arg1) {
        field4639++;
        if (this.field4644 == null) {
            return false;
        }
        if (this.field4656 == null) {
            this.method1963((byte) -99);
        }
        if (arg1 < 49) {
            this.field4644 = null;
        }
        class186 var3 = (class186) this.field4656.method1063((byte) -75, (long) arg0);
        return var3 != null;
    }
}
