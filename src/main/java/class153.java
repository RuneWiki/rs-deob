import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class153 extends class477 implements class267 {

    @OriginalMember(owner = "client!iq", name = "y", descriptor = "Z")
    private boolean field2031;

    @OriginalMember(owner = "client!iq", name = "o", descriptor = "S")
    private short field2021;

    @OriginalMember(owner = "client!iq", name = "U", descriptor = "Z")
    private boolean field2052;

    @OriginalMember(owner = "client!iq", name = "G", descriptor = "B")
    private byte field2039;

    @OriginalMember(owner = "client!iq", name = "C", descriptor = "B")
    private byte field2035;

    @OriginalMember(owner = "client!iq", name = "w", descriptor = "B")
    private byte field2029;

    @OriginalMember(owner = "client!iq", name = "F", descriptor = "Z")
    private boolean field2038;

    @OriginalMember(owner = "client!iq", name = "v", descriptor = "Z")
    private boolean field2028;

    @OriginalMember(owner = "client!iq", name = "I", descriptor = "Li;")
    private class521 field2041;

    @OriginalMember(owner = "client!iq", name = "u", descriptor = "Le;")
    public class536 field2027;

    @OriginalMember(owner = "client!iq", name = "J", descriptor = "Lpr;")
    public static class236 field2042 = new class236("runescape", 0);

    @OriginalMember(owner = "client!iq", name = "R", descriptor = "Z")
    public static boolean field2049 = false;

    @OriginalMember(owner = "client!iq", name = "P", descriptor = "I")
    public static int field2047 = 0;

    @OriginalMember(owner = "client!iq", name = "n", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!iq", name = "p", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!iq", name = "q", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!iq", name = "r", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!iq", name = "s", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!iq", name = "t", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!iq", name = "x", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!iq", name = "z", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!iq", name = "A", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!iq", name = "B", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!iq", name = "D", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!iq", name = "E", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!iq", name = "H", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!iq", name = "L", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!iq", name = "M", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!iq", name = "O", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!iq", name = "Q", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!iq", name = "S", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!iq", name = "T", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!iq", name = "N", descriptor = "[I")
    public static int[] field2045;

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "(B)I")
    public final int method106(byte arg0) {
        if (arg0 != 18) {
            field2047 = -32;
        }
        ++field2026;
        return this.field2039;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILza;IZ)Loh;")
    private final class445 method930(int arg0, class497 arg1, int arg2, boolean arg3) {
        ++field2034;
        if (arg2 != 0) {
            return null;
        } else {
            class156 var5 = class454.field7029.method3002(-1, this.field2021 & 65535);
            class223 var6;
            class223 var7;
            if (this.field2031) {
                var6 = class103.field1520[this.field2035];
                var7 = class244.field3956[0];
            } else {
                if (this.field2035 >= 3) {
                    var7 = null;
                } else {
                    var7 = class244.field3956[this.field2035 + 1];
                }
                var6 = class244.field3956[this.field2035];
            }
            return var5.method958(arg3, super.field7304, super.field7303, arg0, var7, this.field2029, super.field7300, (byte) -122, var6, arg1, this.field2039);
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILza;)V")
    public final void method97(int arg0, class497 arg1) {
        if (arg0 == -6682) {
            ++field2025;
            Object var3 = null;
            class521 var5;
            if (this.field2041 == null && this.field2028) {
                class445 var4 = this.method930(262144, arg1, 0, true);
                var5 = var4 == null ? null : var4.field6913;
            } else {
                var5 = this.field2041;
                this.field2041 = null;
            }
            if (var5 != null) {
                class174.method1090(var5, this.field2035, super.field7300, super.field7303, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "(ILza;)V")
    public final void method102(int arg0, class497 arg1) {
        if (arg0 != -1) {
            this.field2035 = -83;
        }
        ++field2032;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lza;II)Le;")
    private final class536 method931(class497 arg0, int arg1, int arg2) {
        ++field2048;
        if (this.field2027 != null && arg0.method1299(this.field2027.method308(), arg1) == 0) {
            return this.field2027;
        } else {
            class445 var4 = this.method930(arg1, arg0, arg2, false);
            return var4 == null ? null : var4.field6911;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Z)V")
    public final void method100(boolean arg0) {
        if (arg0) {
            field2044 = -69;
        }
        ++field2051;
        if (this.field2027 != null) {
            this.field2027.method303();
        }
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(ILza;)Lon;")
    public final class514 method108(int arg0, class497 arg1) {
        ++field2040;
        if (this.field2027 == null) {
            return null;
        } else {
            class205 var3 = arg1.method1231();
            var3.method158(super.field7300, super.field7304, super.field7303);
            class514 var4 = null;
            if (this.field2052) {
                var4 = class104.method706(arg0 + -2, 1);
            }
            this.field2027.method295(var3, var4 != null ? var4.field7629[0] : null, 0);
            if (arg0 != 2) {
                field2042 = null;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "(B)V")
    public static void method932(byte arg0) {
        field2042 = null;
        if (arg0 > -108) {
            field2044 = -110;
        }
        field2045 = null;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lza;I)V")
    public final void method104(class497 arg0, int arg1) {
        if (arg1 == 26768) {
            ++field2046;
            Object var3 = null;
            class521 var5;
            if (this.field2041 == null && this.field2028) {
                class445 var4 = this.method930(262144, arg0, 0, true);
                var5 = var4 == null ? null : var4.field6913;
            } else {
                var5 = this.field2041;
                this.field2041 = null;
            }
            if (var5 != null) {
                class220.method1611(var5, this.field2035, super.field7300, super.field7303, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZLza;I)Le;")
    public final class536 method107(boolean arg0, class497 arg1, int arg2) {
        ++field2033;
        return arg0 ? null : this.method931(arg1, arg2, 0);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(CB)C")
    public static final char method933(char arg0, byte arg1) {
        if (arg1 < 64) {
            method932((byte) -57);
        }
        ++field2030;
        if (arg0 == 198) {
            return 'E';
        } else if (~arg0 == -231) {
            return 'e';
        } else if (~arg0 == -224) {
            return 's';
        } else if (arg0 == 338) {
            return 'E';
        } else {
            return (char) (~arg0 == -340 ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIILza;)Z")
    public final boolean method105(int arg0, int arg1, int arg2, class497 arg3) {
        ++field2024;
        class536 var5 = this.method931(arg3, 131072, 0);
        if (arg1 != 32689) {
            return true;
        } else if (var5 != null) {
            class205 var6 = arg3.method1231();
            var6.method158(super.field7300, super.field7304, super.field7303);
            return var5.method298(arg0, arg2, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)Z")
    public final boolean method103(int arg0) {
        ++field2023;
        if (arg0 > -95) {
            this.field2029 = -32;
        }
        return this.field2028;
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(B)I")
    public final int method99(byte arg0) {
        if (arg0 <= 53) {
            field2045 = null;
        }
        ++field2037;
        return this.field2029;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)I")
    public final int method96(byte arg0) {
        ++field2022;
        if (arg0 <= 87) {
            method933('p', (byte) 11);
        }
        return this.field2021 & 65535;
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)V")
    public final void method934(int arg0) {
        if (arg0 != 287) {
            method937((Object) null, true, (byte) -57);
        }
        ++field2036;
        this.field2038 = false;
        if (this.field2027 != null) {
            this.field2027.method290(-65537 & this.field2027.method308());
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(II)I")
    public static final int method935(int arg0, int arg1) {
        return class476.field7285 != null ? class476.field7285[arg0][arg1] & 16777215 : 0;
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(Z)Z")
    public final boolean method936(boolean arg0) {
        if (arg0) {
            this.field2027 = null;
        }
        ++field2020;
        return this.field2038;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Ljava/lang/Object;ZB)[B")
    public static final byte[] method937(Object arg0, boolean arg1, byte arg2) {
        ++field2050;
        if (arg0 == null) {
            return null;
        } else {
            int var3 = 73 % ((20 - arg2) / 59);
            if (arg0 instanceof byte[]) {
                byte[] var4 = (byte[]) arg0;
                return arg1 ? class242.method1688(var4, false) : var4;
            } else if (arg0 instanceof class474) {
                class474 var5 = (class474) arg0;
                return var5.method2951(100);
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lza;Loq;IIIIZIIZ)V")
    public class153(class497 arg0, class156 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class401.method2578(arg7, arg8, -87));
        this.field2031 = arg6;
        super.field7300 = arg3;
        this.field2021 = (short) arg1.field2082;
        this.field2052 = arg1.field2079 != 0 && !arg6;
        this.field2039 = (byte) arg8;
        this.field2035 = (byte) arg2;
        this.field2029 = (byte) arg7;
        this.field2038 = arg9;
        super.field7303 = arg5;
        this.field2028 = arg0.method1279() && arg1.field2122 && !this.field2031 && class141.field1911.method2603((byte) 84, class452.field7013) != 0;
        int var11 = 2048;
        if (this.field2038) {
            var11 |= 65536;
        }
        class445 var12 = this.method930(var11, arg0, 0, this.field2028);
        if (var12 != null) {
            this.field2041 = var12.field6913;
            this.field2027 = var12.field6911;
            if (this.field2038) {
                this.field2027 = this.field2027.method329((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILza;IZBILbm;)V")
    public final void method938(int arg0, class497 arg1, int arg2, boolean arg3, byte arg4, int arg5, class484 arg6) {
        if (arg6 instanceof class153) {
            class153 var8 = (class153) arg6;
            if (this.field2027 != null && var8.field2027 != null) {
                this.field2027.method268(var8.field2027, arg5, arg0, arg2, arg3);
            }
        } else if (arg6 instanceof class376) {
            class376 var9 = (class376) arg6;
            if (this.field2027 != null && var9.field5782 != null) {
                this.field2027.method268(var9.field5782, arg5, arg0, arg2, arg3);
            }
        }
        ++field2043;
        int var10 = -50 % ((arg4 - 27) / 32);
    }
}
