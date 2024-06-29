import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class163 extends class394 implements class68 {

    @OriginalMember(owner = "client!ig", name = "C", descriptor = "B")
    private byte field2127;

    @OriginalMember(owner = "client!ig", name = "v", descriptor = "Z")
    private boolean field2120;

    @OriginalMember(owner = "client!ig", name = "F", descriptor = "Z")
    private boolean field2130;

    @OriginalMember(owner = "client!ig", name = "y", descriptor = "Z")
    private boolean field2123;

    @OriginalMember(owner = "client!ig", name = "u", descriptor = "S")
    private short field2119;

    @OriginalMember(owner = "client!ig", name = "S", descriptor = "B")
    private byte field2142;

    @OriginalMember(owner = "client!ig", name = "U", descriptor = "Z")
    private boolean field2144;

    @OriginalMember(owner = "client!ig", name = "P", descriptor = "Lka;")
    private class334 field2139;

    @OriginalMember(owner = "client!ig", name = "E", descriptor = "Lia;")
    private class423 field2129;

    @OriginalMember(owner = "client!ig", name = "W", descriptor = "Lof;")
    public static class446 field2146 = new class446("K", "T", "K", "K");

    @OriginalMember(owner = "client!ig", name = "Y", descriptor = "I")
    public static int field2148 = 0;

    @OriginalMember(owner = "client!ig", name = "ab", descriptor = "[[I")
    public static int[][] field2150 = new int[6][];

    @OriginalMember(owner = "client!ig", name = "X", descriptor = "Z")
    public static boolean field2147 = false;

    @OriginalMember(owner = "client!ig", name = "bb", descriptor = "I")
    public static int field2151 = 500;

    @OriginalMember(owner = "client!ig", name = "t", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!ig", name = "w", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!ig", name = "x", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!ig", name = "z", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!ig", name = "A", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!ig", name = "B", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!ig", name = "D", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!ig", name = "G", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!ig", name = "H", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!ig", name = "I", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!ig", name = "J", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!ig", name = "K", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!ig", name = "L", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!ig", name = "M", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!ig", name = "O", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!ig", name = "Q", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!ig", name = "R", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!ig", name = "T", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!ig", name = "V", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!ig", name = "Z", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZLqa;)V", line = 5)
    public final void method333(boolean arg0, class165 arg1) {
        ++field2128;
        Object var3 = null;
        class423 var5;
        if (this.field2129 == null && this.field2144) {
            class404 var4 = this.method1050(true, arg1, 262144, (byte) 101);
            var5 = var4 != null ? var4.field6124 : null;
        } else {
            var5 = this.field2129;
            this.field2129 = null;
        }
        if (arg0) {
            if (var5 != null) {
                class335.method2169(var5, this.field2142, super.field6022, super.field6031, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IZI)V", line = 33)
    public static final void method1045(int arg0, boolean arg1, int arg2) {
        ++field2118;
        if (!arg1) {
            class177 var3 = class344.method2229(13, arg0, (byte) 103);
            var3.method1191(123);
            var3.field2372 = arg2;
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(ZLqa;)V", line = 48)
    public final void method135(boolean arg0, class165 arg1) {
        if (arg0) {
            this.method339(-62);
        }
        ++field2133;
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(I)I", line = 58)
    public final int method332(int arg0) {
        if (arg0 != 6359) {
            return 37;
        } else {
            ++field2131;
            return this.field2127;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BIILqa;)Z", line = 69)
    public final boolean method138(byte arg0, int arg1, int arg2, class165 arg3) {
        if (arg0 <= 121) {
            this.field2144 = true;
        }
        ++field2126;
        class334 var5 = this.method1048(1028, 131072, arg3);
        if (var5 != null) {
            class14 var6 = arg3.method751();
            var6.method141(super.field6022, super.field6025, super.field6031);
            return var5.method68(arg2, arg1, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILqa;I)Lka;", line = 91)
    public final class334 method337(int arg0, class165 arg1, int arg2) {
        if (arg2 != 14221) {
            field2149 = -44;
        }
        ++field2125;
        return this.method1048(1028, arg0, arg1);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)Z", line = 103)
    public final boolean method339(int arg0) {
        ++field2134;
        if (arg0 != 3583) {
            field2151 = 93;
        }
        return this.field2144;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(III)Lbb;", line = 117)
    public static final class222 method1046(int arg0, int arg1, int arg2) {
        class452 var3 = class443.field6672[arg0][arg1][arg2];
        return var3 == null ? null : var3.field6815;
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(B)Lot;", line = 125)
    public static final class424 method1047(byte arg0) {
        ++field2137;
        try {
            return new class327();
        } catch (Throwable var3) {
            int var1 = -121 % ((34 - arg0) / 41);
            try {
                return (class424) Class.forName("eo").newInstance();
            } catch (Throwable var2) {
                return new class51();
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(Z)Z", line = 153)
    public final boolean method176(boolean arg0) {
        if (!arg0) {
            field2150 = null;
        }
        ++field2124;
        return this.field2123;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILqa;)Lou;", line = 166)
    public final class437 method136(int arg0, class165 arg1) {
        ++field2132;
        if (this.field2139 == null) {
            return null;
        } else {
            class14 var3 = arg1.method751();
            var3.method141(super.field6022, super.field6025, super.field6031);
            class437 var4 = null;
            if (this.field2120) {
                var4 = class530.method3133(false, 1);
            }
            this.field2139.method53(var3, var4 != null ? var4.field6608[0] : null, arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IILqa;)Lka;", line = 189)
    private final class334 method1048(int arg0, int arg1, class165 arg2) {
        ++field2141;
        if (arg0 != 1028) {
            return null;
        } else if (this.field2139 != null && ~arg2.method775(this.field2139.method46(), arg1) == -1) {
            return this.field2139;
        } else {
            class404 var4 = this.method1050(false, arg2, arg1, (byte) 57);
            return var4 != null ? var4.field6128 : null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lqa;I)V", line = 211)
    public final void method330(class165 arg0, int arg1) {
        ++field2135;
        if (arg1 != 14470) {
            field2148 = 57;
        }
        Object var3 = null;
        class423 var5;
        if (this.field2129 == null && this.field2144) {
            class404 var4 = this.method1050(true, arg0, 262144, (byte) 81);
            var5 = var4 != null ? var4.field6124 : null;
        } else {
            var5 = this.field2129;
            this.field2129 = null;
        }
        if (var5 != null) {
            class235.method1562(var5, this.field2142, super.field6022, super.field6031, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILa;IIILqa;Z)V", line = 238)
    public final void method166(int arg0, class444 arg1, int arg2, int arg3, int arg4, class165 arg5, boolean arg6) {
        ++field2140;
        if (arg2 >= -4) {
            field2146 = null;
        }
        if (arg1 instanceof class163) {
            class163 var8 = (class163) arg1;
            if (this.field2139 != null && var8.field2139 != null) {
                this.field2139.method50(var8.field2139, arg3, arg0, arg4, arg6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "(I)V", line = 257)
    public final void method334(int arg0) {
        if (this.field2139 != null) {
            this.field2139.method83();
        }
        if (arg0 != 29893) {
            field2149 = -121;
        }
        ++field2143;
    }

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "(I)V", line = 272)
    public static void method1049(int arg0) {
        field2146 = null;
        if (arg0 != 131072) {
            field2149 = 28;
        }
        field2150 = null;
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)I", line = 285)
    public final int method338(int arg0) {
        ++field2138;
        if (arg0 <= 75) {
            this.field2119 = 67;
        }
        return this.field2119 & 65535;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZLqa;IB)Lkj;", line = 296)
    private final class404 method1050(boolean arg0, class165 arg1, int arg2, byte arg3) {
        if (arg3 < 44) {
            return null;
        } else {
            ++field2121;
            class209 var5 = class432.field6575.method1872(this.field2119 & 65535, false);
            class23 var6;
            class23 var7;
            if (this.field2130) {
                var6 = class414.field6317[0];
                var7 = class71.field988[this.field2142];
            } else {
                if (~this.field2142 <= -4) {
                    var6 = null;
                } else {
                    var6 = class414.field6317[this.field2142 - -1];
                }
                var7 = class414.field6317[this.field2142];
            }
            return var5.method1446(var6, this.field2127, super.field6025, arg2, 262144, arg1, arg0, 22, var7, super.field6031, super.field6022);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Ljava/lang/String;IZZ)I", line = 326)
    public static final int method1051(String arg0, int arg1, boolean arg2, boolean arg3) {
        ++field2145;
        if (arg1 >= 2 && arg1 <= 36) {
            boolean var4 = arg2;
            boolean var5 = false;
            int var6 = 0;
            int var7 = arg0.length();
            for (int var8 = 0; var8 < var7; ++var8) {
                char var9 = arg0.charAt(var8);
                if (var8 == 0) {
                    if (var9 == '-') {
                        var4 = true;
                        continue;
                    }
                    if (var9 == '+' && arg3) {
                        continue;
                    }
                }
                int var11;
                if (~var9 <= -49 && ~var9 >= -58) {
                    var11 = var9 - '0';
                } else if (var9 >= 'A' && ~var9 >= -91) {
                    var11 = var9 - '7';
                } else {
                    if (var9 < 'a' || var9 > 'z') {
                        throw new NumberFormatException();
                    }
                    var11 = var9 - 'W';
                }
                if (~var11 <= ~arg1) {
                    throw new NumberFormatException();
                }
                if (var4) {
                    var11 = -var11;
                }
                int var10 = arg1 * var6 + var11;
                if (var10 / arg1 != var6) {
                    throw new NumberFormatException();
                }
                var5 = true;
                var6 = var10;
            }
            if (!var5) {
                throw new NumberFormatException();
            } else {
                return var6;
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
    }

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "(I)V", line = 402)
    public final void method175(int arg0) {
        this.field2123 = false;
        if (arg0 != 0) {
            this.field2120 = false;
        }
        ++field2122;
        if (this.field2139 != null) {
            this.field2139.method62(-65537 & this.field2139.method46());
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)I", line = 416)
    public final int method336(int arg0) {
        if (arg0 != -6130) {
            this.method175(-78);
        }
        ++field2136;
        return 22;
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lqa;Lcd;IIIIZIZ)V", line = 432)
    public class163(class165 arg0, class209 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field2929, arg1.field2911, arg1.field2887);
        this.field2127 = (byte) arg7;
        this.field2120 = arg1.field2930 != 0 && !arg6;
        this.field2130 = arg6;
        this.field2123 = arg8;
        super.field6022 = arg3;
        this.field2119 = (short) arg1.field2936;
        super.field6031 = arg5;
        this.field2142 = (byte) arg2;
        this.field2144 = arg0.method786() && arg1.field2889 && !this.field2130 && ~class203.field2716.method552(-4, class378.field5771) != -1;
        int var10 = 2048;
        if (this.field2123) {
            var10 |= 65536;
        }
        class404 var11 = this.method1050(this.field2144, arg0, var10, (byte) 64);
        if (var11 != null) {
            this.field2139 = var11.field6128;
            this.field2129 = var11.field6124;
            if (this.field2123) {
                this.field2139 = this.field2139.method47((byte) 0, var10, false);
                return;
            }
        }
    }
}
