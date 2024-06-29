import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class429 extends class127 implements class161 {

    @OriginalMember(owner = "client!wn", name = "Q", descriptor = "Lob;")
    public class438 field6175;

    @OriginalMember(owner = "client!wn", name = "H", descriptor = "Z")
    private boolean field6166;

    @OriginalMember(owner = "client!wn", name = "G", descriptor = "[I")
    public static int[] field6165 = new int[4096];

    @OriginalMember(owner = "client!wn", name = "J", descriptor = "I")
    public static int field6168 = 999999;

    @OriginalMember(owner = "client!wn", name = "V", descriptor = "[Llo;")
    public static class449[] field6180 = new class449[14];

    @OriginalMember(owner = "client!wn", name = "I", descriptor = "I")
    public static int field6167 = 0;

    @OriginalMember(owner = "client!wn", name = "w", descriptor = "I")
    public static int field6155;

    @OriginalMember(owner = "client!wn", name = "x", descriptor = "I")
    public static int field6156;

    @OriginalMember(owner = "client!wn", name = "y", descriptor = "I")
    public static int field6157;

    @OriginalMember(owner = "client!wn", name = "z", descriptor = "I")
    public static int field6158;

    @OriginalMember(owner = "client!wn", name = "A", descriptor = "I")
    public static int field6159;

    @OriginalMember(owner = "client!wn", name = "B", descriptor = "I")
    public static int field6160;

    @OriginalMember(owner = "client!wn", name = "C", descriptor = "I")
    public static int field6161;

    @OriginalMember(owner = "client!wn", name = "D", descriptor = "I")
    public static int field6162;

    @OriginalMember(owner = "client!wn", name = "E", descriptor = "I")
    public static int field6163;

    @OriginalMember(owner = "client!wn", name = "F", descriptor = "I")
    public static int field6164;

    @OriginalMember(owner = "client!wn", name = "K", descriptor = "I")
    public static int field6169;

    @OriginalMember(owner = "client!wn", name = "L", descriptor = "I")
    public static int field6170;

    @OriginalMember(owner = "client!wn", name = "M", descriptor = "I")
    public static int field6171;

    @OriginalMember(owner = "client!wn", name = "N", descriptor = "I")
    public static int field6172;

    @OriginalMember(owner = "client!wn", name = "O", descriptor = "I")
    public static int field6173;

    @OriginalMember(owner = "client!wn", name = "R", descriptor = "I")
    public static int field6176;

    @OriginalMember(owner = "client!wn", name = "S", descriptor = "I")
    public static int field6177;

    @OriginalMember(owner = "client!wn", name = "T", descriptor = "I")
    public static int field6178;

    @OriginalMember(owner = "client!wn", name = "U", descriptor = "I")
    public static int field6179;

    @OriginalMember(owner = "client!wn", name = "P", descriptor = "[I")
    public static int[] field6174;

    @OriginalMember(owner = "client!wn", name = "g", descriptor = "(I)V")
    public static void method2700(int arg0) {
        field6165 = null;
        int var1 = -45 % ((-3 - arg0) / 52);
        field6180 = null;
        field6174 = null;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method2701(int arg0, String arg1) {
        ++field6156;
        if (arg0 < 90) {
            method2700(4);
        }
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; ++var4) {
            var3 = arg1.charAt(var4) + (var3 << 5) + -var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Laa;Z)V")
    public final void method128(class281 arg0, boolean arg1) {
        ++field6176;
        class75 var3 = this.field6175.method2747(arg0, super.field1783, super.field1787, arg1, true, 131072, arg1);
        if (var3 != null) {
            this.field6175.method2744(super.field1783 >> 7, super.field1787 >> 7, var3, false, arg0, super.field1787 >> 7, super.field1783 >> 7, (byte) 58);
        }
    }

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "(II)Ljava/lang/String;")
    public static final String method2702(int arg0, int arg1) {
        if (arg0 != 19464) {
            return null;
        } else {
            ++field6161;
            return (arg1 >> 24 & 255) + "." + (arg1 >> 16 & 255) + "." + (arg1 >> 8 & 255) + "." + (255 & arg1);
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Laa;I)Lcn;")
    public final class300 method131(class281 arg0, int arg1) {
        ++field6179;
        class75 var3 = this.field6175.method2747(arg0, super.field1783, super.field1787, false, true, 1024, true);
        if (var3 == null) {
            return null;
        } else {
            class261 var4 = arg0.method1769();
            if (arg1 <= 72) {
                field6168 = -40;
            }
            var4.method882(super.field1787, super.field1790, super.field1783);
            class300 var5 = null;
            if (this.field6166) {
                var5 = class8.method54((byte) -114, 1);
            }
            if (this.field6175.field6318 == null) {
                var3.method514(var4, var5 == null ? null : var5.field4152[0], 0);
            } else {
                class260 var6 = this.field6175.field6318.method1014();
                arg0.method1721(var3, var6, var4, var5 != null ? var5.field4152[0] : null, 0);
            }
            this.field6175.method2744(super.field1783 >> 7, super.field1787 >> 7, var3, true, arg0, super.field1787 >> 7, super.field1783 >> 7, (byte) -109);
            return var5;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IZIILaa;ILqh;)V")
    public final void method129(int arg0, boolean arg1, int arg2, int arg3, class281 arg4, int arg5, class43 arg6) {
        if (arg0 != 0) {
            this.method122((class281) null, (byte) -12);
        }
        ++field6155;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)I")
    public final int method126(int arg0) {
        ++field6170;
        if (arg0 != -13482) {
            method2704(27, -69, (byte) 15, -43, -48, 20, -82, 47);
        }
        return this.field6175.field6297;
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(Laa;B)V")
    public final void method133(class281 arg0, byte arg1) {
        if (arg1 != -102) {
            this.field6175 = null;
        }
        ++field6171;
        this.field6175.method2753(arg0, -7608);
    }

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "(I)Z")
    public final boolean method137(int arg0) {
        if (arg0 != 0) {
            field6165 = null;
        }
        ++field6159;
        return false;
    }

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "(I)I")
    public final int method124(int arg0) {
        ++field6172;
        return arg0 != -11197 ? -73 : this.field6175.field6324;
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(B)Z")
    public final boolean method127(byte arg0) {
        int var2 = -4 % ((arg0 - -52) / 33);
        ++field6173;
        return this.field6175.method2743((byte) 115);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Laa;IB)Lhc;")
    public final class75 method134(class281 arg0, int arg1, byte arg2) {
        if (arg2 > -25) {
            field6180 = null;
        }
        ++field6162;
        return this.field6175.method2747(arg0, 0, 0, false, false, arg1, true);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2703(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 != 0) {
            method2700(-104);
        }
        ++field6177;
        int var8 = class231.method1452(105, class398.field5827, arg7, class300.field4164);
        int var9 = class231.method1452(98, class398.field5827, arg2, class300.field4164);
        int var10 = class231.method1452(98, class43.field659, arg5, class379.field5397);
        int var11 = class231.method1452(92, class43.field659, arg1, class379.field5397);
        int var12 = class231.method1452(108, class398.field5827, arg3 + arg7, class300.field4164);
        int var13 = class231.method1452(arg0 ^ 84, class398.field5827, arg2 - arg3, class300.field4164);
        for (int var14 = var8; ~var12 < ~var14; ++var14) {
            class73.method486(var10, class84.field1286[var14], arg4, -12, var11);
        }
        for (int var15 = var9; var15 > var13; --var15) {
            class73.method486(var10, class84.field1286[var15], arg4, -123, var11);
        }
        int var16 = class231.method1452(123, class43.field659, arg3 + arg5, class379.field5397);
        int var17 = class231.method1452(111, class43.field659, -arg3 + arg1, class379.field5397);
        for (int var18 = var12; var13 >= var18; ++var18) {
            int[] var19 = class84.field1286[var18];
            class73.method486(var10, var19, arg4, 113, var16);
            class73.method486(var16, var19, arg6, -92, var17);
            class73.method486(var17, var19, arg4, -112, var11);
        }
    }

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Laa;Lsk;IIIIIIZI)V")
    public class429(class281 arg0, class369 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        super(arg5, arg6, arg7, arg1.field5165, arg1.field5227);
        this.field6175 = new class438(arg0, arg1, 22, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
        this.field6166 = ~arg1.field5221 != -1 && !arg8;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIILaa;)Z")
    public final boolean method136(int arg0, int arg1, int arg2, class281 arg3) {
        if (arg0 != 0) {
            field6174 = null;
        }
        ++field6164;
        class75 var5 = this.field6175.method2747(arg3, super.field1783, super.field1787, false, false, 65536, true);
        if (var5 == null) {
            return false;
        } else {
            class261 var6 = arg3.method1769();
            var6.method882(super.field1787, super.field1790, super.field1783);
            return var5.method516(arg1, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Laa;B)V")
    public final void method122(class281 arg0, byte arg1) {
        if (arg1 > 16) {
            this.field6175.method2751(arg0, (byte) 123);
            ++field6169;
        }
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(I)V")
    public final void method138(int arg0) {
        if (arg0 != -4728) {
            this.method133((class281) null, (byte) 18);
        }
        ++field6178;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIBIIIII)V")
    public static final void method2704(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field6163;
        if (~arg0 == ~arg4) {
            class446.method2784((byte) 67, arg6, arg7, arg0, arg3, arg5, arg1);
        } else {
            if (-arg0 + arg7 >= class379.field5397 && class43.field659 >= arg0 + arg7 && ~class300.field4164 >= ~(-arg4 + arg1) && ~(arg1 - -arg4) >= ~class398.field5827) {
                class266.method1648(false, arg7, arg4, arg3, arg6, arg5, arg1, arg0);
            } else {
                class8.method58(arg6, arg1, arg0, arg5, 1656556993, arg3, arg7, arg4);
            }
            int var8 = -5 / ((-62 - arg2) / 54);
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(B)I")
    public final int method123(byte arg0) {
        if (arg0 < 108) {
            return -25;
        } else {
            ++field6157;
            return this.field6175.field6316;
        }
    }

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "(B)V")
    public final void method135(byte arg0) {
        if (arg0 != -123) {
            method2704(84, 7, (byte) 111, 78, -95, 60, -30, -87);
        }
        ++field6160;
        throw new IllegalStateException();
    }
}
