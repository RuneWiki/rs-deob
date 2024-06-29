import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class224 extends class110 {

    @OriginalMember(owner = "client!hl", name = "Q", descriptor = "I")
    private int field3414 = 20;

    @OriginalMember(owner = "client!hl", name = "R", descriptor = "I")
    private int field3415 = 0;

    @OriginalMember(owner = "client!hl", name = "L", descriptor = "I")
    private int field3409 = 1365;

    @OriginalMember(owner = "client!hl", name = "T", descriptor = "I")
    private int field3417 = 0;

    @OriginalMember(owner = "client!hl", name = "J", descriptor = "I")
    public static int field3407 = 0;

    @OriginalMember(owner = "client!hl", name = "G", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!hl", name = "H", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!hl", name = "I", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!hl", name = "K", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!hl", name = "M", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!hl", name = "O", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!hl", name = "P", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!hl", name = "S", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!hl", name = "U", descriptor = "Lli;")
    public static class182 field3418;

    @OriginalMember(owner = "client!hl", name = "N", descriptor = "Lbf;")
    public static class227 field3411;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 9)
    public static final boolean method1560(int arg0, String arg1) {
        field3405++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = arg0; var2 < class247.field3687; var2++) {
            if (arg1.equalsIgnoreCase(class205.field3097[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "(I)V", line = 32)
    public static final void method1561(int arg0) {
        if (arg0 != 24599) {
            method1563(46);
        }
        field3412++;
        if (class262.field3965.toLowerCase().indexOf("microsoft") != -1) {
            class226.field3444[223] = 28;
            class226.field3444[189] = 26;
            class226.field3444[190] = 72;
            class226.field3444[191] = 73;
            class226.field3444[221] = 43;
            class226.field3444[219] = 42;
            class226.field3444[220] = 74;
            class226.field3444[187] = 27;
            class226.field3444[186] = 57;
            class226.field3444[188] = 71;
            class226.field3444[192] = 58;
            class226.field3444[222] = 59;
            return;
        }
        class226.field3444[45] = 26;
        class226.field3444[59] = 57;
        class226.field3444[46] = 72;
        class226.field3444[93] = 43;
        class226.field3444[47] = 73;
        class226.field3444[44] = 71;
        if (class262.field3977 == null) {
            class226.field3444[222] = 59;
            class226.field3444[192] = 58;
        } else {
            class226.field3444[222] = 58;
            class226.field3444[192] = 28;
            class226.field3444[520] = 59;
        }
        class226.field3444[92] = 74;
        class226.field3444[91] = 42;
        class226.field3444[61] = 27;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIILmd;Lmd;IIJ)V", line = 81)
    public static final void method1562(int arg0, int arg1, int arg2, int arg3, class233 arg4, class233 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class163 var10 = new class163();
        var10.field2448 = arg8;
        var10.field2449 = arg1 * 128 + 64;
        var10.field2464 = arg2 * 128 + 64;
        var10.field2461 = arg3;
        var10.field2451 = arg4;
        var10.field2452 = arg5;
        var10.field2460 = arg6;
        var10.field2457 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class158.field2367[var11][arg1][arg2] == null) {
                class158.field2367[var11][arg1][arg2] = new class221(var11, arg1, arg2);
            }
        }
        class158.field2367[arg0][arg1][arg2].field3370 = var10;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)[I", line = 112)
    public final int[] method46(int arg0, int arg1) {
        int[] var3 = this.field1695.method440((byte) -60, arg1);
        if (arg0 != 1) {
            this.field3409 = -111;
        }
        if (this.field1695.field875) {
            for (int var4 = 0; var4 < class124.field1936; var4++) {
                int var5 = (class177.field2615[arg1] << 12) / this.field3409 + this.field3415;
                int var6 = (class249.field3714[var4] << 12) / this.field3409 + this.field3417;
                int var7 = var6;
                int var8 = var5;
                int var9 = var6;
                int var10 = var5 * var5 >> 12;
                int var11 = var6 * var6 >> 12;
                int var12 = var5;
                int var13;
                for (var13 = 0; var11 + var10 < 16384 && this.field3414 > var13; var13++) {
                    var12 = (var9 * var12 >> 12) * 2 + var8;
                    var9 = var11 + var7 - var10;
                    var10 = var12 * var12 >> 12;
                    var11 = var9 * var9 >> 12;
                }
                var3[var4] = var13 < this.field3414 - 1 ? (var13 << 12) / this.field3414 : 0;
            }
        }
        field3406++;
        return var3;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILre;I)V", line = 169)
    public final void method44(int arg0, class263 arg1, int arg2) {
        field3408++;
        if (arg2 > -37) {
            method1560(-115, (String) null);
        }
        if (arg0 == 0) {
            this.field3409 = arg1.method1830((byte) -77);
        } else if (arg0 == 1) {
            this.field3414 = arg1.method1830((byte) -77);
        } else if (arg0 == 2) {
            this.field3417 = arg1.method1830((byte) -77);
        } else if (arg0 == 3) {
            this.field3415 = arg1.method1830((byte) -77);
        }
    }

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "(I)V", line = 221)
    public static final void method1563(int arg0) {
        field3416++;
        for (class160 var1 = (class160) class69.field905.method1109(99); var1 != null; var1 = (class160) class69.field905.method1115((byte) 103)) {
            class79 var2 = var1.field2394;
            if (class180.field2697 != var2.field1088 || var2.field1124 < class304.field4641) {
                var1.method714(-104);
            } else if (var2.field1097 <= class304.field4641) {
                if (var2.field1111 > 0) {
                    class69 var3 = class187.field2788[var2.field1111 - 1];
                    if (var3 != null && var3.field1566 >= 0 && var3.field1566 < 13312 && var3.field1505 >= 0 && var3.field1505 < 13312) {
                        var2.method532(class304.field4641, var3.field1505, var3.field1566, (byte) -124, class74.method473(var3.field1505, var3.field1566, 64, var2.field1088) - var2.field1112);
                    }
                }
                if (var2.field1111 < 0) {
                    int var4 = -var2.field1111 - 1;
                    class195 var5;
                    if (class234.field3516 == var4) {
                        var5 = class114.field1750;
                    } else {
                        var5 = class241.field3592[var4];
                    }
                    if (var5 != null && var5.field1566 >= 0 && var5.field1566 < 13312 && var5.field1505 >= 0 && var5.field1505 < 13312) {
                        var2.method532(class304.field4641, var5.field1505, var5.field1566, (byte) -94, class74.method473(var5.field1505, var5.field1566, 64, var2.field1088) - var2.field1112);
                    }
                }
                var2.method533(class288.field4352, (byte) 126);
                class309.method2136(class180.field2697, (int) var2.field1116, (int) var2.field1108, (int) var2.field1094, 60, var2, var2.field1093, -1L, false);
            }
        }
        if (arg0 != 73) {
            method1564(false);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)V", line = 281)
    public static void method1564(boolean arg0) {
        field3418 = null;
        field3411 = null;
        if (arg0) {
            method1566(-60, -14, -16, 27, false);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BLjava/lang/String;)I", line = 292)
    public static final int method1565(byte arg0, String arg1) {
        field3404++;
        if (arg0 <= 60) {
            field3407 = 124;
        }
        return arg1.length() + 1;
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "()V", line = 340)
    public class224() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIIZ)V", line = 314)
    public static final void method1566(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class169 var5 = class101.method712(arg0, 4, 2089666400);
        var5.method1183(arg4);
        field3410++;
        var5.field2543 = arg1;
        if (arg4) {
            field3411 = (class227) null;
        }
        var5.field2542 = arg2;
        var5.field2530 = arg3;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(Z)V", line = 331)
    public static final void method1567(boolean arg0) {
        field3413++;
        class42.field516.method2182(arg0);
        class223.field3396.method2182(false);
    }
}
