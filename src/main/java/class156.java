import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class156 {

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public static int field2026 = 0;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "Lla;")
    public static class319 field2030 = new class319(7, -1);

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "Lco;")
    public static class77 field2035 = new class77("WTWIP", 3);

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
    public static int field2036 = 0;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
    public int field2028;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    private int field2029;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "[[[I")
    public static int[][][] field2033;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V", line = 5)
    public final void method1003(int arg0) {
        field2024++;
        this.field2028 &= 0x3FFF;
        int var2 = 93 / ((-arg0 - 4) / 44);
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V", line = 25)
    public static void method1004(int arg0) {
        field2033 = null;
        field2035 = null;
        field2030 = null;
        if (arg0 != 29753) {
            method1007(-27, true, -87);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(CB)Z", line = 37)
    public static final boolean method1005(char arg0, byte arg1) {
        field2032++;
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else {
            if (arg1 > -85) {
                field2030 = null;
            }
            return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIII)Z", line = 58)
    public final boolean method1006(int arg0, int arg1, int arg2, int arg3) {
        field2031++;
        int var5 = this.field2029;
        if (this.field2028 == arg0 && this.field2029 == 0) {
            return false;
        }
        boolean var6;
        if (this.field2029 == 0) {
            if (this.field2028 < arg0 && (this.field2028 + arg3) >= arg0 || this.field2028 > arg0 && arg0 >= this.field2028 - arg3) {
                this.field2028 = arg0;
                return false;
            }
            var6 = true;
        } else if (this.field2029 > 0 && arg0 > this.field2028) {
            int var7 = this.field2029 * this.field2029 / (arg3 * 2);
            int var8 = this.field2028 + var7;
            if (var8 < arg0 && var8 >= this.field2028) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else if (this.field2029 < 0 && arg0 < this.field2028) {
            int var9 = this.field2029 * this.field2029 / (arg3 * 2);
            int var10 = this.field2028 - var9;
            if (var10 > arg0 && var10 <= this.field2028) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else {
            var6 = false;
        }
        if (var6) {
            if (this.field2028 >= arg0) {
                this.field2029 -= arg3;
                if (arg2 != 0 && -arg2 > this.field2029) {
                    this.field2029 = -arg2;
                }
            } else {
                this.field2029 += arg3;
                if (arg2 != 0 && arg2 < this.field2029) {
                    this.field2029 = arg2;
                }
            }
            if (this.field2029 != var5) {
                int var11 = this.field2029 * this.field2029 / (arg3 * 2);
                if (this.field2028 >= arg0) {
                    if (this.field2028 > arg0 && (this.field2028 - var11) < arg0) {
                        this.field2029 = var5;
                    }
                } else if (arg0 < this.field2028 + var11) {
                    this.field2029 = var5;
                }
            }
        } else if (this.field2029 > 0) {
            this.field2029 -= arg3;
            if (this.field2029 < 0) {
                this.field2029 = 0;
            }
        } else {
            this.field2029 += arg3;
            if (this.field2029 > 0) {
                this.field2029 = 0;
            }
        }
        int var12 = 82 % ((arg1 + 32) / 47);
        this.field2028 += this.field2029 + var5 >> 1;
        return var6;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IZI)Lkg;", line = 195)
    public static final class181 method1007(int arg0, boolean arg1, int arg2) {
        field2034++;
        class181 var3 = new class181();
        var3.field2434 = -1;
        var3.field2449 = arg0 + 5 + 1;
        var3.field2435 = arg2 + 1 + 5;
        if (arg1) {
            field2033 = null;
        }
        var3.field2433 = -1;
        var3.field2451 = new int[var3.field2435][var3.field2449];
        var3.method1213((byte) -78);
        return var3;
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(I)I", line = 217)
    public final int method1008(int arg0) {
        if (arg0 <= 49) {
            return 118;
        } else {
            field2025++;
            return this.field2028 & 0x3FFF;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)V", line = 237)
    public final void method1009(byte arg0, int arg1) {
        field2027++;
        if (arg0 != 22) {
            this.method1003(-96);
        }
        this.field2029 = 0;
        this.field2028 = arg1;
    }
}
