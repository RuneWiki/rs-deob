import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class340 extends class144 implements class21 {

    @OriginalMember(owner = "client!bi", name = "ab", descriptor = "S")
    private short field4925;

    @OriginalMember(owner = "client!bi", name = "O", descriptor = "Z")
    private boolean field4913;

    @OriginalMember(owner = "client!bi", name = "Y", descriptor = "Z")
    private boolean field4923;

    @OriginalMember(owner = "client!bi", name = "N", descriptor = "B")
    private byte field4912;

    @OriginalMember(owner = "client!bi", name = "D", descriptor = "B")
    private byte field4902;

    @OriginalMember(owner = "client!bi", name = "E", descriptor = "Z")
    private boolean field4903;

    @OriginalMember(owner = "client!bi", name = "K", descriptor = "B")
    private byte field4909;

    @OriginalMember(owner = "client!bi", name = "B", descriptor = "Z")
    private boolean field4900;

    @OriginalMember(owner = "client!bi", name = "H", descriptor = "Le;")
    public class377 field4906;

    @OriginalMember(owner = "client!bi", name = "x", descriptor = "Li;")
    private class31 field4896;

    @OriginalMember(owner = "client!bi", name = "w", descriptor = "I")
    public static int field4895 = -1;

    @OriginalMember(owner = "client!bi", name = "Z", descriptor = "Lkn;")
    public static class530 field4924;

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "I")
    public static int field4894;

    @OriginalMember(owner = "client!bi", name = "y", descriptor = "I")
    public static int field4897;

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!bi", name = "A", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!bi", name = "C", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!bi", name = "F", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!bi", name = "G", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!bi", name = "I", descriptor = "I")
    public static int field4907;

    @OriginalMember(owner = "client!bi", name = "J", descriptor = "I")
    public static int field4908;

    @OriginalMember(owner = "client!bi", name = "L", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!bi", name = "M", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!bi", name = "P", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!bi", name = "Q", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!bi", name = "R", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!bi", name = "S", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!bi", name = "T", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!bi", name = "U", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!bi", name = "V", descriptor = "I")
    public static int field4920;

    @OriginalMember(owner = "client!bi", name = "W", descriptor = "I")
    public static int field4921;

    @OriginalMember(owner = "client!bi", name = "X", descriptor = "I")
    public static int field4922;

    @OriginalMember(owner = "client!bi", name = "bb", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!bi", name = "cb", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!bi", name = "eb", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!bi", name = "db", descriptor = "Lpv;")
    public static class52 field4928;

    static {
        new class530("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field4924 = new class530("glow2:", "leuchten2:", "brillant2:", "brilho2:");
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)I", line = 3)
    public final int method110(byte arg0) {
        if (arg0 <= 100) {
            this.method127((byte) -5);
        }
        ++field4922;
        return this.field4925 & 65535;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILza;ILge;IZI)V", line = 14)
    public final void method128(int arg0, class290 arg1, int arg2, class510 arg3, int arg4, boolean arg5, int arg6) {
        if (!(arg3 instanceof class488)) {
            if (arg3 instanceof class340) {
                class340 var8 = (class340) arg3;
                if (this.field4906 != null && var8.field4906 != null) {
                    this.field4906.method1562(var8.field4906, arg4, arg2, arg6, arg5);
                }
            }
        } else {
            class488 var9 = (class488) arg3;
            if (this.field4906 != null && var9.field6823 != null) {
                this.field4906.method1562(var9.field6823, arg4, arg2, arg6, arg5);
            }
        }
        if (arg0 > -71) {
            this.field4925 = -42;
        }
        ++field4904;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lza;B)V", line = 45)
    public final void method117(class290 arg0, byte arg1) {
        ++field4905;
        Object var3 = null;
        if (arg1 != -38) {
            this.method126((class290) null, (byte) -1);
        }
        class31 var5;
        if (this.field4896 == null && this.field4900) {
            class48 var4 = this.method2024(262144, arg0, (byte) -91, true);
            var5 = var4 == null ? null : var4.field556;
        } else {
            var5 = this.field4896;
            this.field4896 = null;
        }
        if (var5 != null) {
            class265.method1681(var5, this.field4902, super.field1896, super.field1899, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IILza;I)Z", line = 74)
    public final boolean method129(int arg0, int arg1, class290 arg2, int arg3) {
        ++field4910;
        if (arg0 != 3) {
            this.method117((class290) null, (byte) -110);
        }
        class377 var5 = this.method2021(arg2, arg0 + 262141, 131072);
        if (var5 != null) {
            class125 var6 = arg2.method368();
            var6.method825(super.field1896, super.field1912, super.field1899);
            return var5.method1586(arg1, arg3, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lza;I)V", line = 96)
    public final void method130(class290 arg0, int arg1) {
        ++field4914;
        if (arg1 != 0) {
            this.field4912 = 106;
        }
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(I)V", line = 106)
    public final void method115(int arg0) {
        ++field4921;
        if (arg0 != 16372) {
            this.method130((class290) null, -108);
        }
        if (this.field4906 != null) {
            this.field4906.method1587();
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILjava/lang/String;B)I", line = 125)
    public static final int method2019(int arg0, String arg1, byte arg2) {
        if (arg2 >= -64) {
            method2020((byte) -22);
        }
        ++field4897;
        return class494.method2863(arg0, true, arg1, -1);
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(B)V", line = 144)
    public static void method2020(byte arg0) {
        field4928 = null;
        field4924 = null;
        if (arg0 != -55) {
            field4895 = 5;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lza;II)Le;", line = 158)
    private final class377 method2021(class290 arg0, int arg1, int arg2) {
        ++field4915;
        if (this.field4906 != null && ~arg0.method324(this.field4906.method1605(), arg2) == -1) {
            return this.field4906;
        } else if (arg1 != 262144) {
            return null;
        } else {
            class48 var4 = this.method2024(arg2, arg0, (byte) -97, false);
            return var4 != null ? var4.field555 : null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)I", line = 179)
    public final int method114(int arg0) {
        if (arg0 != -9772) {
            this.field4896 = null;
        }
        ++field4919;
        return this.field4909;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)I", line = 191)
    public final int method112(int arg0) {
        int var2 = 57 % ((arg0 - -5) / 55);
        ++field4908;
        return this.field4912;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILza;I)Le;", line = 203)
    public final class377 method116(int arg0, class290 arg1, int arg2) {
        if (arg0 != 13439) {
            this.field4896 = null;
        }
        ++field4916;
        return this.method2021(arg1, 262144, arg2);
    }

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "(I)V", line = 214)
    public final void method120(int arg0) {
        this.field4923 = false;
        ++field4901;
        if (this.field4906 != null) {
            this.field4906.method1606(this.field4906.method1605() & -65537);
        }
        if (arg0 != 0) {
            this.method2021((class290) null, 73, -121);
        }
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(B)I", line = 230)
    public final int method127(byte arg0) {
        ++field4911;
        if (arg0 != 86) {
            this.method2024(-115, (class290) null, (byte) -34, false);
        }
        return this.field4906 == null ? 0 : this.field4906.method1568();
    }

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "(B)I", line = 245)
    public final int method2022(byte arg0) {
        if (arg0 != -107) {
            return 38;
        } else {
            ++field4899;
            return this.field4906 != null ? this.field4906.method1583() / 4 : 15;
        }
    }

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "(B)V", line = 257)
    public static final void method2023(byte arg0) {
        ++field4926;
        if (!class60.field746) {
            if (!class4.field81.field1437) {
                class431.field6092 += (-class431.field6092 + -24.0F) / 2.0F;
            } else {
                class153.field2204 = (float) (-128 & (int) class153.field2204 + -65);
            }
            class264.field3877 = true;
            if (arg0 < -109) {
                class60.field746 = true;
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)Z", line = 284)
    public final boolean method113(int arg0) {
        if (arg0 != 31692) {
            return true;
        } else {
            ++field4918;
            return this.field4900;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILza;BZ)Lqr;", line = 302)
    private final class48 method2024(int arg0, class290 arg1, byte arg2, boolean arg3) {
        ++field4920;
        if (arg2 >= -77) {
            this.method118((byte) -56);
        }
        class270 var5 = class377.field5338.method1901(50, this.field4925 & 65535);
        class38 var6;
        class38 var7;
        if (!this.field4903) {
            if (~this.field4902 <= -4) {
                var6 = null;
            } else {
                var6 = class68.field858[this.field4902 - -1];
            }
            var7 = class68.field858[this.field4902];
        } else {
            var7 = class60.field743[this.field4902];
            var6 = class68.field858[0];
        }
        return var5.method1697(arg1, ~this.field4912 != -12 ? this.field4912 : 10, arg0, this.field4912 == 11 ? this.field4909 + 4 : this.field4909, super.field1899, super.field1896, (byte) -66, arg3, var7, super.field1912, var6);
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(B)Z", line = 332)
    public final boolean method118(byte arg0) {
        ++field4917;
        if (arg0 != 102) {
            this.field4909 = 48;
        }
        return this.field4923;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILza;)V", line = 343)
    public final void method111(int arg0, class290 arg1) {
        ++field4894;
        Object var3 = null;
        class31 var5;
        if (this.field4896 == null && this.field4900) {
            class48 var4 = this.method2024(262144, arg1, (byte) -124, true);
            var5 = var4 != null ? var4.field556 : null;
        } else {
            var5 = this.field4896;
            this.field4896 = null;
        }
        if (arg0 != -38) {
            this.field4900 = false;
        }
        if (var5 != null) {
            class264.method1680(var5, this.field4902, super.field1896, super.field1899, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(Lza;B)Lkf;", line = 372)
    public final class170 method126(class290 arg0, byte arg1) {
        ++field4907;
        if (this.field4906 == null) {
            return null;
        } else {
            if (arg1 > -86) {
                this.method111(83, (class290) null);
            }
            class125 var3 = arg0.method368();
            var3.method825(super.field1896, super.field1912, super.field1899);
            class170 var4 = null;
            if (this.field4913) {
                var4 = class423.method2509(0, 1);
            }
            this.field4906.method1566(var3, var4 != null ? var4.field2475[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lza;Lfu;IIIIIZIIIIIIZ)V", line = 403)
    public class340(class290 arg0, class270 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field3954 == 1, class27.method172(arg13, 14492, arg12));
        this.field4925 = (short) arg1.field3952;
        this.field4913 = ~arg1.field3957 != -1 && !arg7;
        this.field4923 = arg14;
        this.field4912 = (byte) arg12;
        this.field4902 = (byte) arg3;
        this.field4903 = arg7;
        this.field4909 = (byte) arg13;
        this.field4900 = arg0.method339() && arg1.field3975 && !this.field4903 && class4.field81.method726(class405.field5737, -90) != 0;
        int var16 = 2048;
        if (this.field4923) {
            var16 |= 65536;
        }
        class48 var17 = this.method2024(var16, arg0, (byte) -85, this.field4900);
        if (var17 != null) {
            this.field4906 = var17.field555;
            this.field4896 = var17.field556;
            if (this.field4923) {
                this.field4906 = this.field4906.method1590((byte) 0, var16, false);
                return;
            }
        }
    }
}
