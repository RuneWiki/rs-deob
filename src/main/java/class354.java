import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class354 {

    @OriginalMember(owner = "client!th", name = "y", descriptor = "Z")
    private boolean field5181 = false;

    @OriginalMember(owner = "client!th", name = "A", descriptor = "Z")
    private boolean field5183 = false;

    @OriginalMember(owner = "client!th", name = "J", descriptor = "I")
    private int field5192 = -32768;

    @OriginalMember(owner = "client!th", name = "F", descriptor = "I")
    private int field5188 = -1;

    @OriginalMember(owner = "client!th", name = "I", descriptor = "I")
    private int field5191 = -1;

    @OriginalMember(owner = "client!th", name = "x", descriptor = "I")
    public int field5180;

    @OriginalMember(owner = "client!th", name = "u", descriptor = "B")
    private byte field5177;

    @OriginalMember(owner = "client!th", name = "K", descriptor = "I")
    private int field5193;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    private int field5167;

    @OriginalMember(owner = "client!th", name = "r", descriptor = "I")
    public int field5174;

    @OriginalMember(owner = "client!th", name = "v", descriptor = "I")
    public int field5178;

    @OriginalMember(owner = "client!th", name = "G", descriptor = "B")
    private byte field5189;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "Z")
    private boolean field5166;

    @OriginalMember(owner = "client!th", name = "s", descriptor = "I")
    public static int field5175 = 0;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "Ljava/lang/String;")
    public static String field5164 = null;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field5157;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field5158;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public static int field5159;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    public static int field5161;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public static int field5162;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "I")
    public static int field5168;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "I")
    private int field5169;

    @OriginalMember(owner = "client!th", name = "n", descriptor = "I")
    public static int field5170;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "I")
    private int field5172;

    @OriginalMember(owner = "client!th", name = "t", descriptor = "I")
    public static int field5176;

    @OriginalMember(owner = "client!th", name = "w", descriptor = "I")
    public static int field5179;

    @OriginalMember(owner = "client!th", name = "z", descriptor = "I")
    public static int field5182;

    @OriginalMember(owner = "client!th", name = "C", descriptor = "I")
    private int field5185;

    @OriginalMember(owner = "client!th", name = "E", descriptor = "I")
    public static int field5187;

    @OriginalMember(owner = "client!th", name = "H", descriptor = "I")
    private int field5190;

    @OriginalMember(owner = "client!th", name = "L", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!th", name = "q", descriptor = "Lbb;")
    private class182 field5173;

    @OriginalMember(owner = "client!th", name = "D", descriptor = "Llg;")
    private class238 field5186;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "Lpl;")
    public class389 field5163;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "Lmj;")
    private class393 field5160;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "Lra;")
    public static class57 field5165;

    @OriginalMember(owner = "client!th", name = "B", descriptor = "[Z")
    private boolean[] field5184;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIB)V")
    private final void method2251(int arg0, int arg1, byte arg2) {
        if (arg2 != -9) {
            this.method2258(119, 104, 18, true, (byte) -16, (class174) null, -31, (class393) null);
        }
        field5157++;
        label92: while (true) {
            if (this.field5173 == null) {
                if (this.field5183) {
                    return;
                }
                this.method2254(-1, (byte) -82);
                if (this.field5173 == null) {
                    return;
                }
            }
            int var4 = class221.field3033 - this.field5172;
            if (var4 > 100 && this.field5173.field2510 > 0) {
                int var5 = this.field5173.field2493.length - this.field5173.field2510;
                while (var5 > this.field5185 && var4 > this.field5173.field2513[this.field5185]) {
                    var4 -= this.field5173.field2513[this.field5185];
                    this.field5185++;
                }
                if (this.field5185 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field5173.field2493.length; var7++) {
                        var6 += this.field5173.field2513[var7];
                    }
                    var4 %= var6;
                }
                this.field5190 = this.field5185 + 1;
                if (this.field5173.field2493.length <= this.field5190) {
                    this.field5190 -= this.field5173.field2510;
                    if (this.field5190 < 0 || this.field5173.field2493.length <= this.field5190) {
                        this.field5190 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (var4 <= this.field5173.field2513[this.field5185]) {
                            this.field5169 = var4;
                            this.field5172 = class221.field3033 - var4;
                            return;
                        }
                        class424.method2628(this.field5185, arg1, this.field5173, arg2 + 9, arg0, false);
                        var4 -= this.field5173.field2513[this.field5185];
                        this.field5185++;
                        if (this.field5185 >= this.field5173.field2493.length) {
                            this.field5185 -= this.field5173.field2510;
                            if (this.field5185 < 0 || this.field5185 >= this.field5173.field2493.length) {
                                this.field5173 = null;
                                continue label92;
                            }
                        }
                        this.field5190 = this.field5185 + 1;
                    } while (this.field5190 < this.field5173.field2493.length);
                    this.field5190 -= this.field5173.field2510;
                } while (this.field5190 >= 0 && this.field5190 < this.field5173.field2493.length);
                this.field5190 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)V")
    public final void method2252(int arg0, int arg1) {
        field5170++;
        this.field5183 = true;
        if (arg0 <= -8) {
            this.method2254(arg1, (byte) -82);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ZLen;)V")
    public final void method2253(boolean arg0, class174 arg1) {
        if (this.field5186 != null) {
            class190.method1219(this.field5186, this.field5177, this.field5193, this.field5167, this.field5184);
            this.field5186 = null;
            this.field5184 = null;
        }
        if (arg0) {
            this.method2261(80, true, (class174) null, true, -23, (byte) -121, 66);
        }
        field5159++;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IB)V")
    private final void method2254(int arg0, byte arg1) {
        field5176++;
        int var3 = arg0;
        boolean var4 = false;
        if (arg0 == -1) {
            class327 var5 = class157.method1036(0, this.field5180);
            class327 var6 = var5;
            if (var5.field4645 != null) {
                var5 = var5.method2029(arg1 + 81);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field4599 != null) {
                if (this.field5173 != null && var5.method2018(14, this.field5173.field2494)) {
                    return;
                }
                var3 = var5.method2017(-113);
                if (this.field5188 != var5.field4592) {
                    var4 = var5.field4619;
                }
            } else if (var5.field4639 == -1) {
                if (var6 != null && var6.field4599 != null) {
                    if (this.field5173 != null && var6.method2018(arg1 - 31, this.field5173.field2494)) {
                        return;
                    }
                    var3 = var6.method2017(-112);
                    if (this.field5188 != var6.field4592) {
                        var4 = var6.field4619;
                    }
                } else if (var6 != null && var6.field4639 != -1 && this.field5188 != var6.field4592) {
                    var3 = var6.field4639;
                    var4 = var6.field4619;
                }
            } else if (this.field5188 != var5.field4592) {
                var4 = var5.field4619;
                var3 = var5.field4639;
            }
        }
        if (var3 == -1) {
            this.field5173 = null;
            return;
        }
        this.field5160 = null;
        if (this.field5173 == null || this.field5173.field2494 != var3) {
            this.field5173 = class437.method2717(var3, (byte) -103);
        } else if (this.field5173.field2487 == 0) {
            return;
        }
        if (arg1 != -82) {
            return;
        }
        if (this.field5173.field2493 == null) {
            this.field5173 = null;
            return;
        }
        if (var4) {
            this.field5185 = (int) (Math.random() * (double) this.field5173.field2493.length);
            this.field5169 = ((int) (Math.random() * (double) this.field5173.field2513[this.field5185])) + 1;
        } else {
            this.field5185 = 0;
            this.field5169 = 1;
        }
        this.field5190 = this.field5185 + 1;
        if (this.field5190 < 0 || this.field5190 >= this.field5173.field2493.length) {
            this.field5190 = -1;
        }
        this.field5172 = class221.field3033 - this.field5169;
    }

    @OriginalMember(owner = "client!th", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field5163 != null) {
            this.field5163.method2491();
        }
        field5179++;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIII)I")
    public static final int method2255(int arg0, int arg1, int arg2, int arg3) {
        int var4 = -123 / ((50 - arg3) / 47);
        field5168++;
        int var5 = 255 - arg2;
        int var6 = ((arg0 & 0xFF00FF) * arg2 & 0xFF00FF00 | (arg0 & 0xFF00) * arg2 & 0xFF0000) >>> 8;
        return (((arg1 & 0xFF00) * var5 & 0xFF0000 | (arg1 & 0xFF00FF) * var5 & 0xFF00FF00) >>> 8) + var6;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
    public static void method2256(int arg0) {
        field5165 = null;
        field5164 = null;
        if (arg0 != 1) {
            method2262(70, -123, -44);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Len;I)V")
    public final void method2257(class174 arg0, int arg1) {
        if (arg1 != -29617) {
            this.field5184 = null;
        }
        field5182++;
        this.method2261(this.field5167, true, arg0, true, this.field5193, (byte) -126, 131072);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIZBLen;ILmj;)V")
    public final void method2258(int arg0, int arg1, int arg2, boolean arg3, byte arg4, class174 arg5, int arg6, class393 arg7) {
        if (arg4 <= 122) {
            this.method2258(-68, 117, -108, false, (byte) -39, (class174) null, 63, (class393) null);
        }
        field5194++;
        class35[] var9 = arg7.method768();
        class382[] var10 = arg7.method725();
        if ((this.field5163 == null || this.field5163.field5704) && (var9 != null || var10 != null)) {
            class327 var11 = class157.method1036(0, this.field5180);
            if (var11.field4645 != null) {
                var11 = var11.method2029(-1);
            }
            if (var11 != null) {
                this.field5163 = new class389(class221.field3033);
            }
        }
        if (this.field5163 == null) {
            return;
        }
        if (arg3) {
            this.field5163.method2485(arg5, (long) class221.field3033, var9, var10, false);
        } else {
            this.field5163.method2486((long) class221.field3033);
        }
        this.field5163.method2483(this.field5189, arg1, arg0, arg6, arg2);
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(I)Z")
    public final boolean method2259(int arg0) {
        if (arg0 < 12) {
            this.field5181 = true;
        }
        field5161++;
        return this.field5166;
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(I)I")
    public final int method2260(int arg0) {
        if (arg0 == 11) {
            field5158++;
            return this.field5192;
        } else {
            return 77;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IZLen;ZIBI)Lmj;")
    public final class393 method2261(int arg0, boolean arg1, class174 arg2, boolean arg3, int arg4, byte arg5, int arg6) {
        field5171++;
        class327 var8 = class157.method1036(0, this.field5180);
        if (var8.field4645 != null) {
            var8 = var8.method2029(-1);
        }
        if (var8 == null) {
            this.method2253(false, arg2);
            this.field5188 = -1;
            this.field5191 = this.field5185;
            return null;
        }
        if (!this.field5183 && this.field5188 != var8.field4592) {
            this.field5160 = null;
            this.method2254(-1, (byte) -82);
        }
        this.method2251(arg0, arg4, (byte) -9);
        boolean var9 = arg1 & class341.field5022 != 0 & this.field5166;
        if (arg5 >= -110) {
            this.method2252(79, -79);
        }
        boolean var10 = var9 & (this.field5188 != var8.field4592 || (this.field5191 != this.field5185 || this.field5173 != null && (this.field5173.field2504 || class98.field1105) && this.field5190 != this.field5185) && class341.field5022 >= 2);
        if (arg3 && !var10) {
            this.field5191 = this.field5185;
            this.field5188 = var8.field4592;
            return null;
        }
        if (var10) {
            class190.method1219(this.field5186, this.field5177, this.field5193, this.field5167, this.field5184);
        }
        class319 var11 = class132.field1814[this.field5177];
        class319 var12;
        if (this.field5181) {
            var12 = class78.field887[0];
        } else {
            var12 = this.field5177 >= 3 ? null : class132.field1814[this.field5177 + 1];
        }
        class393 var13 = null;
        if (this.field5173 != null) {
            if (var10) {
                arg6 |= 0x20000;
            }
            var13 = var8.method2014(this.field5169, var11.method1991(this.field5193, this.field5167), arg6, arg2, this.field5167, 0, this.field5190, this.field5193, this.field5173, this.field5178 == 11 ? 10 : this.field5178, var11, var12, this.field5178 == 11 ? this.field5174 + 4 : this.field5174, this.field5185);
            if (var13 == null) {
                this.field5186 = null;
                this.field5184 = null;
                this.field5192 = 0;
            } else {
                if (var10) {
                    if (this.field5184 == null) {
                        this.field5184 = new boolean[4];
                    }
                    this.field5186 = var13.method728(this.field5186);
                    class148.method880(this.field5186, this.field5177, arg4, arg0, this.field5184);
                }
                this.field5192 = var13.method731();
            }
            this.field5160 = null;
        } else if (this.field5160 != null && (arg6 & this.field5160.method720()) == arg6 && this.field5188 == var8.field4592) {
            var13 = this.field5160;
        } else {
            if (this.field5160 != null) {
                arg6 |= this.field5160.method720();
            }
            class403 var14 = var8.method2015(var11.method1991(this.field5193, this.field5167), var12, this.field5178 == 11 ? this.field5174 + 4 : this.field5174, this.field5178 == 11 ? 10 : this.field5178, var10, this.field5193, arg6, arg2, -72, var11, this.field5167);
            if (var14 == null) {
                this.field5160 = null;
                this.field5192 = 0;
                this.field5186 = null;
                this.field5184 = null;
            } else {
                var13 = var14.field5880;
                this.field5160 = var14.field5880;
                if (var10) {
                    this.field5184 = null;
                    this.field5186 = var14.field5879;
                    class148.method880(this.field5186, this.field5177, arg4, arg0, (boolean[]) null);
                }
                this.field5192 = var13.method731();
            }
        }
        this.field5191 = this.field5185;
        this.field5193 = arg4;
        this.field5188 = var8.field4592;
        this.field5167 = arg0;
        return var13;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(III)Ljf;")
    public static final class119 method2262(int arg0, int arg1, int arg2) {
        if (arg0 > -127) {
            method2262(-123, -18, -68);
        }
        field5162++;
        class119 var3 = class179.method1170(arg2, 818041328);
        if (arg1 == -1) {
            return var3;
        } else if (var3 == null || var3.field1460 == null || arg1 >= var3.field1460.length) {
            return null;
        } else {
            return var3.field1460[arg1];
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Len;Lnl;IIIIIIZI)V")
    public class354(class174 arg0, class327 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field5181 = arg8;
        this.field5180 = arg1.field4592;
        this.field5177 = (byte) arg5;
        this.field5193 = arg6;
        this.field5167 = arg7;
        this.field5174 = arg3;
        this.field5178 = arg2;
        this.field5189 = (byte) arg4;
        this.field5166 = arg0.method963() && arg1.field4625 && !this.field5181;
        if (arg9 != -1) {
            this.field5183 = true;
        }
        this.method2254(arg9, (byte) -82);
    }
}
