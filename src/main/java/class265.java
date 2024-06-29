import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class265 extends class181 implements class92 {

    @OriginalMember(owner = "client!pm", name = "G", descriptor = "I")
    private int field4120 = 50;

    @OriginalMember(owner = "client!pm", name = "w", descriptor = "Z")
    private boolean field4110 = false;

    @OriginalMember(owner = "client!pm", name = "K", descriptor = "Ljd;")
    private class95 field4124;

    @OriginalMember(owner = "client!pm", name = "z", descriptor = "Ljd;")
    private class95 field4113;

    @OriginalMember(owner = "client!pm", name = "v", descriptor = "Lfa;")
    private class98 field4109;

    @OriginalMember(owner = "client!pm", name = "L", descriptor = "Lfa;")
    private class98 field4125;

    @OriginalMember(owner = "client!pm", name = "F", descriptor = "Ljava/lang/String;")
    public static String field4119 = " ";

    @OriginalMember(owner = "client!pm", name = "U", descriptor = "[I")
    public static int[] field4134 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!pm", name = "r", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!pm", name = "s", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!pm", name = "t", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!pm", name = "u", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!pm", name = "x", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!pm", name = "y", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!pm", name = "A", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!pm", name = "B", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!pm", name = "C", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!pm", name = "D", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!pm", name = "E", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!pm", name = "H", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!pm", name = "J", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!pm", name = "M", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!pm", name = "N", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!pm", name = "P", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!pm", name = "Q", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!pm", name = "R", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!pm", name = "S", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!pm", name = "T", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!pm", name = "V", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!pm", name = "X", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!pm", name = "Y", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!pm", name = "Z", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!pm", name = "bb", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!pm", name = "cb", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!pm", name = "I", descriptor = "Le;")
    public static class237 field4122;

    @OriginalMember(owner = "client!pm", name = "O", descriptor = "Lnk;")
    public static class326 field4128;

    @OriginalMember(owner = "client!pm", name = "ab", descriptor = "[I")
    public static int[] field4140;

    @OriginalMember(owner = "client!pm", name = "W", descriptor = "[[[La;")
    public static class281[][][] field4136;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(II)Z", line = 4)
    public final boolean method664(int arg0, int arg1) {
        if (arg1 <= 8) {
            return false;
        } else {
            field4130++;
            return this.method679((byte) -74, arg0).field961;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IB)[I", line = 16)
    public final int[] method670(int arg0, byte arg1) {
        if (arg1 <= 119) {
            field4122 = (class237) null;
        }
        field4138++;
        class344 var3 = this.method1863(arg0, (byte) 47);
        return var3 == null ? null : var3.method2378(this, this.field4124, this.field4110 || this.method679((byte) -74, arg0).field962);
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(IB)Lfb;", line = 38)
    public final class308 method1349(int arg0, byte arg1) {
        field4111++;
        class344 var3 = this.method1863(arg0, (byte) 47);
        if (arg1 != -73) {
            this.method676(2.5089252F, true, 8, -6, 112);
        }
        return var3 == null ? null : var3.field5327;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IBF)[I", line = 53)
    public final int[] method666(int arg0, byte arg1, float arg2) {
        field4117++;
        class344 var4 = this.method1863(arg0, (byte) 47);
        if (arg1 >= -73) {
            field4140 = (int[]) null;
        }
        if (var4 == null) {
            return null;
        } else {
            var4.field5336 = true;
            return var4.method2376(this, this.field4124, arg2, this.field4110 || this.method679((byte) -74, arg0).field962);
        }
    }

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "(II)Z", line = 70)
    public final boolean method671(int arg0, int arg1) {
        field4114++;
        if (arg0 != -7427) {
            field4122 = (class237) null;
        }
        return this.method679((byte) -74, arg1).field973;
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(BI)I", line = 82)
    public final int method662(byte arg0, int arg1) {
        field4115++;
        int var3 = -31 / ((arg0 - 53) / 45);
        return this.method679((byte) -74, arg1).field965 & 0xFF;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(BZ)V", line = 92)
    public static final void method1860(byte arg0, boolean arg1) {
        field4105++;
        if (arg0 < -29) {
            class30.method227(class151.field2281, (byte) 127, arg1, class215.field3300, class28.field334);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(FZIII)Laf;", line = 107)
    public final class195 method676(float arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field4132++;
        int var6 = 125 % ((19 - arg4) / 49);
        class344 var7 = this.method1863(arg3, (byte) 47);
        if (var7 != null && var7.method2375(this, this.field4124)) {
            return arg1 ? var7.field5327.method2113(arg2, this.field4124, this, arg2, (double) arg0, (byte) 97, false) : var7.field5327.method2112(arg2, this.field4124, this, false, 42, (double) arg0, arg2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V", line = 130)
    public static final void method1861(int arg0) {
        field4106++;
        int var1 = class238.field3623.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class238.field3623[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class309.field4811; var4++) {
                    if (class166.field2688[var4] == class139.field2087[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class166.field2688[class309.field4811] = class139.field2087[var2];
                    var3 = class309.field4811++;
                }
                int var5 = 0;
                class254 var6 = new class254(class238.field3623[var2]);
                while (class238.field3623[var2].length > var6.field3866 && var5 < 511) {
                    int var7 = var6.method1755(false);
                    int var8 = var7 >> 14;
                    int var9 = var3 | var5++ << 6;
                    int var10 = var7 & 0x3F;
                    int var11 = (class139.field2087[var2] & 0xFF) * 64 + var10 - class293.field4522;
                    int var12 = (var7 & 0x1FE8) >> 7;
                    int var13 = (class139.field2087[var2] >> 8) * 64 + var12 - class327.field5054;
                    class332 var14 = class242.method1676(var6.method1755(false), 64);
                    if (class264.field4064[var9] == null && (var14.field5141 & 0x1) > 0 && class170.field2749 == var8 && var13 >= 0 && (var14.field5181 + var13) < 104 && var11 >= 0 && (var14.field5181 + var11) < 104) {
                        class264.field4064[var9] = new class76();
                        class76 var15 = class264.field4064[var9];
                        class272.field4252[class52.field702++] = var9;
                        var15.field4711 = class233.field3542;
                        var15.method597((byte) -57, var14);
                        var15.method2094(var15.field1104.field5181, 7);
                        var15.field4674 = var15.field4682 = class324.field5000[var15.field1104.field5136];
                        var15.field4758 = var15.field1104.field5123;
                        if (var15.field4758 == 0) {
                            var15.field4682 = 0;
                        }
                        var15.field4767 = var15.field1104.field5138;
                        var15.method2089(var13, var15.method1897(8), false, true, var11);
                    }
                }
            }
        }
        if (arg0 != -9246) {
            field4119 = (String) null;
        }
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(BI)I", line = 231)
    public final int method665(byte arg0, int arg1) {
        field4133++;
        int var3 = -40 / ((11 - arg0) / 37);
        return this.method679((byte) -74, arg1).field958 & 0xFF;
    }

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "(II)I", line = 241)
    public final int method672(int arg0, int arg1) {
        if (arg0 != -28889) {
            this.field4113 = (class95) null;
        }
        field4108++;
        return this.method679((byte) -74, arg1).field969 & 0xFFFF;
    }

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "(II)Z", line = 255)
    public final boolean method668(int arg0, int arg1) {
        field4142++;
        if (arg1 == -105) {
            class344 var3 = this.method1863(arg0, (byte) 47);
            return var3 == null ? false : var3.method2375(this, this.field4124);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)V", line = 273)
    public final void method1862(int arg0) {
        field4137++;
        this.field4109.method737(3374);
        if (this.field4125 != null) {
            this.field4125.method737(3374);
        }
        class344.field5329 = null;
        if (arg0 != 27891) {
            this.method676(-1.1588305F, false, -68, 61, 78);
        }
    }

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "(II)Z", line = 288)
    public final boolean method669(int arg0, int arg1) {
        if (arg1 != 255) {
            this.method1349(110, (byte) -20);
        }
        field4131++;
        return this.field4110 || this.method679((byte) -74, arg0).field962;
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(IB)Lnh;", line = 302)
    private final class344 method1863(int arg0, byte arg1) {
        if (arg1 != 47) {
            return (class344) null;
        }
        field4116++;
        class344 var3 = (class344) this.field4109.method730((long) arg0, (byte) 90);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field4113.method696(0, (byte) 97, arg0);
        if (var4 == null) {
            return null;
        } else {
            class344 var5 = new class344(new class254(var4));
            this.field4109.method734((byte) -14, (long) arg0, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IBI)V", line = 331)
    public final void method673(int arg0, byte arg1, int arg2) {
        field4127++;
        class241.method1672(this.method679((byte) -74, arg0).field963 & 0xFF, -123, this.method679((byte) -74, arg0).field974 & 0xFF);
        boolean var4 = false;
        class344 var5 = this.method1863(arg0, (byte) 47);
        if (var5 != null) {
            var4 = var5.method2382(this, this.field4124, arg2);
        }
        if (arg1 >= -60) {
            this.method668(101, 17);
        }
        if (!var4) {
            class294 var6 = this.method1867(false, arg0);
            var6.method2033(30702);
        }
    }

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "(BI)I", line = 362)
    public final int method674(byte arg0, int arg1) {
        int var3 = 87 % ((20 - arg0) / 56);
        field4135++;
        return this.method679((byte) -74, arg1).field963 & 0xFF;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZI)V", line = 372)
    public final void method1864(boolean arg0, int arg1) {
        field4107++;
        this.field4110 = arg0;
        this.method1862(27891);
        if (arg1 != -1) {
            this.method1349(68, (byte) 4);
        }
    }

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "(I)V", line = 384)
    public static void method1865(int arg0) {
        field4134 = null;
        field4119 = null;
        field4136 = (class281[][][]) null;
        if (arg0 == 1) {
            field4128 = null;
            field4140 = null;
            field4122 = null;
        }
    }

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "(II)I", line = 399)
    public final int method667(int arg0, int arg1) {
        field4141++;
        int var3 = -6 % ((arg0 + 58) / 62);
        return this.method679((byte) -74, arg1).field974 & 0xFF;
    }

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "(II)Z", line = 409)
    public final boolean method675(int arg0, int arg1) {
        if (arg0 == 255) {
            field4123++;
            return !this.method679((byte) -74, arg1).field971;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(II)V", line = 420)
    public final void method663(int arg0, int arg1) {
        field4129++;
        if (arg1 == 16374) {
            this.method673(arg0, (byte) -62, this.field4110 || this.method679((byte) -74, arg0).field962 ? 64 : 128);
        }
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Ljd;Ljd;Ljd;IZ)V", line = 430)
    public class265(class95 arg0, class95 arg1, class95 arg2, int arg3, boolean arg4) {
        super(arg1, arg0, arg2);
        this.field4124 = arg2;
        this.field4113 = arg0;
        this.field4110 = arg4;
        this.field4120 = arg3;
        this.field4109 = new class98(this.field4120);
        if (class73.field1058) {
            this.field4125 = new class98(this.field4120);
        } else {
            this.field4125 = null;
        }
    }

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "(II)Ltn;", line = 449)
    public static final class38 method1866(int arg0, int arg1) {
        if (arg1 != 11273) {
            field4136 = (class281[][][]) ((class281[][][]) null);
        }
        field4121++;
        class38 var2 = (class38) class189.field2972.method747((long) arg0, (byte) 124);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class226.field3462.method696(class61.method421(16803, arg0), (byte) 117, class222.method1581(arg0, 1));
        class38 var4 = new class38();
        var4.field568 = arg0;
        if (var3 != null) {
            var4.method293(new class254(var3), false);
        }
        class189.field2972.method744(var4, arg1 ^ 0xFFFFEEBD, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(ZI)Llc;", line = 481)
    private final class294 method1867(boolean arg0, int arg1) {
        field4126++;
        if (arg0) {
            this.method674((byte) 120, -79);
        }
        class294 var3 = (class294) this.field4125.method730((long) arg1, (byte) 90);
        if (var3 == null) {
            class294 var4 = new class294(this.method679((byte) -74, arg1).field969 & 0xFFFF);
            this.field4125.method734((byte) -14, (long) arg1, var4);
            return var4;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "(II)V", line = 505)
    public final void method1868(int arg0, int arg1) {
        if (arg0 != 10146) {
            this.method663(-118, -52);
        }
        field4118++;
        this.field4120 = arg1;
        this.field4109 = new class98(this.field4120);
        if (class73.field1058) {
            this.field4125 = new class98(this.field4120);
        } else {
            this.field4125 = null;
        }
    }

    @OriginalMember(owner = "client!pm", name = "n", descriptor = "(II)V", line = 524)
    public final void method1869(int arg0, int arg1) {
        field4139++;
        int var3 = -17 / ((8 - arg0) / 40);
        for (class344 var4 = (class344) this.field4109.method736((byte) 46); var4 != null; var4 = (class344) this.field4109.method738(-117)) {
            if (var4.field5336) {
                var4.method2381(arg1);
                var4.field5336 = false;
            }
        }
    }
}
