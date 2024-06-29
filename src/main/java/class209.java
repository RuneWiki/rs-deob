import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class209 extends class147 {

    @OriginalMember(owner = "client!c", name = "E", descriptor = "I")
    private int field3756 = 128;

    @OriginalMember(owner = "client!c", name = "K", descriptor = "I")
    private int field3762 = 0;

    @OriginalMember(owner = "client!c", name = "J", descriptor = "I")
    private int field3761 = 128;

    @OriginalMember(owner = "client!c", name = "V", descriptor = "I")
    public int field3773 = -1;

    @OriginalMember(owner = "client!c", name = "ab", descriptor = "Z")
    public boolean field3778 = false;

    @OriginalMember(owner = "client!c", name = "Y", descriptor = "I")
    private int field3776 = 0;

    @OriginalMember(owner = "client!c", name = "cb", descriptor = "I")
    private int field3780 = 0;

    @OriginalMember(owner = "client!c", name = "G", descriptor = "I")
    public static int field3758 = 0;

    @OriginalMember(owner = "client!c", name = "R", descriptor = "Lqj;")
    private static class196 field3769 = class80.method502("Attack", -48);

    @OriginalMember(owner = "client!c", name = "L", descriptor = "Lqj;")
    public static class196 field3763 = field3769;

    @OriginalMember(owner = "client!c", name = "N", descriptor = "Lqj;")
    public static class196 field3765 = class80.method502("leuchten1:", -48);

    @OriginalMember(owner = "client!c", name = "H", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!c", name = "I", descriptor = "I")
    private int field3760;

    @OriginalMember(owner = "client!c", name = "M", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!c", name = "O", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!c", name = "P", descriptor = "I")
    public int field3767;

    @OriginalMember(owner = "client!c", name = "Q", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!c", name = "T", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!c", name = "W", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!c", name = "bb", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!c", name = "F", descriptor = "[S")
    private short[] field3757;

    @OriginalMember(owner = "client!c", name = "S", descriptor = "[S")
    public static short[] field3770;

    @OriginalMember(owner = "client!c", name = "U", descriptor = "[S")
    private short[] field3772;

    @OriginalMember(owner = "client!c", name = "X", descriptor = "[S")
    private short[] field3775;

    @OriginalMember(owner = "client!c", name = "Z", descriptor = "[S")
    private short[] field3777;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IB)Loc;")
    public final class119 method1446(int arg0, byte arg1) {
        field3774++;
        class119 var3 = (class119) class253.field4474.method132((long) this.field3767, 117);
        if (arg1 != -51) {
            method1451(null, 3);
        }
        if (var3 == null) {
            class208 var4 = class208.method1436(class126.field1793, this.field3760, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field3777 != null) {
                for (int var5 = 0; var5 < this.field3777.length; var5++) {
                    var4.method1414(this.field3777[var5], this.field3757[var5]);
                }
            }
            if (this.field3772 != null) {
                for (int var6 = 0; var6 < this.field3772.length; var6++) {
                    var4.method1413(this.field3772[var6], this.field3775[var6]);
                }
            }
            var3 = var4.method1432(this.field3762 + 64, 850 - -this.field3776, -30, -50, -30);
            class253.field4474.method129(arg1 + 31023, (long) this.field3767, var3);
        }
        class119 var7;
        if (this.field3773 == -1 || arg0 == -1) {
            var7 = var3.method734(true, true);
        } else {
            var7 = class116.method704(this.field3773, -10304).method937(var3, arg0, (byte) 43);
        }
        if (this.field3761 != 128 || this.field3756 != 128) {
            var7.method743(this.field3761, this.field3756, this.field3761);
        }
        if (this.field3780 != 0) {
            if (this.field3780 == 90) {
                var7.method733();
            }
            if (this.field3780 == 180) {
                var7.method726();
            }
            if (this.field3780 == 270) {
                var7.method742();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIZLm;II)V")
    public static final void method1447(int arg0, int arg1, boolean arg2, class149 arg3, int arg4, int arg5) {
        field3771++;
        if (class219.field3933 >= 50 || (arg3.field2367 == null || arg0 >= arg3.field2367.length || arg3.field2367[arg0] == null)) {
            return;
        }
        int var6 = arg3.field2367[arg0][0];
        int var7 = var6 >> 4 & 0x7;
        int var8 = var6 & 0xF;
        int var9 = var6 >> 8;
        if (arg5 > ~arg3.field2367[arg0].length) {
            int var10 = (int) ((double) arg3.field2367[arg0].length * Math.random());
            if (var10 > 0) {
                var9 = arg3.field2367[arg0][var10];
            }
        }
        if (var8 == 0) {
            if (arg2) {
                class46.method247(var9, var7, 0, (byte) 74);
            }
        } else if (class70.field977 != 0) {
            class82.field1182[class219.field3933] = var9;
            class129.field1835[class219.field3933] = var7;
            int var11 = (arg4 - 64) / 128;
            class146.field2300[class219.field3933] = 0;
            class11.field130[class219.field3933] = null;
            int var12 = (arg1 - 64) / 128;
            class210.field3785[class219.field3933] = (var12 << 8) + (var11 << 16) + var8;
            class219.field3933++;
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(II)V")
    public static final void method1448(int arg0, int arg1) {
        if (arg0 >= -80) {
            field3770 = null;
        }
        class44.field514.method1535(arg1, 30704);
        field3779++;
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(I)V")
    public static void method1449(int arg0) {
        if (arg0 == -22159) {
            field3763 = null;
            field3770 = null;
            field3765 = null;
            field3769 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILp;)V")
    public final void method1450(int arg0, class56 arg1) {
        while (true) {
            int var3 = arg1.method367(arg0 ^ 0xFFFF843D);
            if (var3 == 0) {
                if (arg0 != -31684) {
                    return;
                }
                field3764++;
                return;
            }
            this.method1452(var3, 7, arg1);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Ldj;I)V")
    public static final void method1451(class137 arg0, int arg1) {
        field3759++;
        arg0.field2069 = false;
        if (arg0.field2063 != arg1) {
            class149 var2 = class116.method704(arg0.field2063, -10304);
            if (var2 == null || var2.field2362 == null) {
                arg0.field2063 = -1;
            } else {
                arg0.field2057++;
                if (var2.field2362.length > arg0.field2098 && arg0.field2057 > var2.field2361[arg0.field2098]) {
                    arg0.field2098++;
                    arg0.field2057 = 1;
                    method1447(arg0.field2098, arg0.field2085, class102.field1477 == arg0, var2, arg0.field2081, -2);
                }
                if (arg0.field2098 >= var2.field2362.length) {
                    arg0.field2098 = 0;
                    arg0.field2057 = 0;
                    method1447(arg0.field2098, arg0.field2085, class102.field1477 == arg0, var2, arg0.field2081, -2);
                }
            }
        }
        if (arg0.field2113 != -1 && class171.field2879 >= arg0.field2072) {
            if (arg0.field2059 < 0) {
                arg0.field2059 = 0;
            }
            int var3 = class148.method929(arg1 + 2, arg0.field2113).field3773;
            if (var3 == -1) {
                arg0.field2113 = -1;
            } else {
                class149 var4 = class116.method704(var3, -10304);
                if (var4 == null || var4.field2362 == null) {
                    arg0.field2113 = -1;
                } else {
                    arg0.field2090++;
                    if (var4.field2362.length > arg0.field2059 && var4.field2361[arg0.field2059] < arg0.field2090) {
                        arg0.field2090 = 1;
                        arg0.field2059++;
                        method1447(arg0.field2059, arg0.field2085, class102.field1477 == arg0, var4, arg0.field2081, arg1 - 1);
                    }
                    if (var4.field2362.length <= arg0.field2059) {
                        arg0.field2113 = -1;
                    }
                }
            }
        }
        if (arg0.field2086 != -1 && arg0.field2084 <= 1) {
            class149 var5 = class116.method704(arg0.field2086, -10304);
            if (var5.field2363 == 1 && arg0.field2104 > 0 && class171.field2879 >= arg0.field2089 && arg0.field2060 < class171.field2879) {
                arg0.field2084 = 1;
                return;
            }
        }
        if (arg0.field2086 != -1 && arg0.field2084 == 0) {
            class149 var6 = class116.method704(arg0.field2086, -10304);
            if (var6 == null || var6.field2362 == null) {
                arg0.field2086 = -1;
            } else {
                arg0.field2079++;
                if (var6.field2362.length > arg0.field2105 && var6.field2361[arg0.field2105] < arg0.field2079) {
                    arg0.field2105++;
                    arg0.field2079 = 1;
                    method1447(arg0.field2105, arg0.field2085, class102.field1477 == arg0, var6, arg0.field2081, -2);
                }
                if (var6.field2362.length <= arg0.field2105) {
                    arg0.field2105 -= var6.field2370;
                    arg0.field2109++;
                    if (arg0.field2109 >= var6.field2392) {
                        arg0.field2086 = -1;
                    } else if (arg0.field2105 >= 0 && var6.field2362.length > arg0.field2105) {
                        method1447(arg0.field2105, arg0.field2085, class102.field1477 == arg0, var6, arg0.field2081, -2);
                    } else {
                        arg0.field2086 = -1;
                    }
                }
                arg0.field2069 = var6.field2378;
            }
        }
        if (arg0.field2084 > 0) {
            arg0.field2084--;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IILp;)V")
    private final void method1452(int arg0, int arg1, class56 arg2) {
        if (arg1 != 7) {
            method1449(113);
        }
        if (arg0 == 1) {
            this.field3760 = arg2.method318(true);
        } else if (arg0 == 2) {
            this.field3773 = arg2.method318(true);
        } else if (arg0 == 4) {
            this.field3761 = arg2.method318(true);
        } else if (arg0 == 5) {
            this.field3756 = arg2.method318(true);
        } else if (arg0 == 6) {
            this.field3780 = arg2.method318(true);
        } else if (arg0 == 7) {
            this.field3762 = arg2.method367(arg1 - 6);
        } else if (arg0 == 8) {
            this.field3776 = arg2.method367(1);
        } else if (arg0 == 9) {
            this.field3778 = true;
        } else if (arg0 == 40) {
            int var4 = arg2.method367(1);
            this.field3777 = new short[var4];
            this.field3757 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3777[var5] = (short) arg2.method318(true);
                this.field3757[var5] = (short) arg2.method318(true);
            }
        } else if (arg0 == 41) {
            int var6 = arg2.method367(1);
            this.field3772 = new short[var6];
            this.field3775 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3772[var7] = (short) arg2.method318(true);
                this.field3775[var7] = (short) arg2.method318(true);
            }
        }
        field3768++;
    }
}
