import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class394 extends class190 {

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
    public int field5723 = -1;

    @OriginalMember(owner = "client!sg", name = "E", descriptor = "I")
    public int field5738 = -1;

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "Z")
    public static boolean field5727 = false;

    @OriginalMember(owner = "client!sg", name = "B", descriptor = "I")
    public static int field5735 = 0;

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "I")
    public static int field5726 = 1406;

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "Lqu;")
    public static class364 field5724 = new class364(78, 1);

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "I")
    public static int field5725;

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "I")
    public static int field5728;

    @OriginalMember(owner = "client!sg", name = "v", descriptor = "I")
    public int field5729;

    @OriginalMember(owner = "client!sg", name = "w", descriptor = "I")
    public int field5730;

    @OriginalMember(owner = "client!sg", name = "x", descriptor = "I")
    public static int field5731;

    @OriginalMember(owner = "client!sg", name = "y", descriptor = "I")
    public int field5732;

    @OriginalMember(owner = "client!sg", name = "A", descriptor = "I")
    public static int field5734;

    @OriginalMember(owner = "client!sg", name = "C", descriptor = "I")
    public static int field5736;

    @OriginalMember(owner = "client!sg", name = "D", descriptor = "I")
    public int field5737;

    @OriginalMember(owner = "client!sg", name = "F", descriptor = "I")
    public static int field5739;

    @OriginalMember(owner = "client!sg", name = "z", descriptor = "Ln;")
    public static class472 field5733;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lqa;Z)V", line = 13)
    public final void method166(class167 arg0, boolean arg1) {
        if (!arg1) {
            method2373(-107);
        }
        ++field5731;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)V", line = 23)
    public static final void method2372(boolean arg0) {
        if (!arg0) {
            method2373(94);
        }
        ++field5725;
        int var1 = 0;
        if (class94.field1158.method130(-27423, class239.field3499)) {
            int var2 = var1 | 1;
            int var3 = var2 | 16;
            int var4 = var3 | 32;
            int var5 = var4 | 2;
            var1 = var5 | 4;
        }
        if (!class94.field1158.field262) {
            var1 |= 64;
        }
        class260.method1641(var1, -105);
        class312.field4690.method2005(0, var1);
        class216.field3204.method3360(var1, false);
        class369.field5329.method1785(var1, false);
        class138.field1821.method2250((byte) -121, var1);
        class322.method2015(var1, -1);
        class111.method663(var1, (byte) 62);
        class559.method3272(80, var1);
        class249.method1586(var1, -1654698640);
        class29.method128((byte) 124);
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V", line = 64)
    public static void method2373(int arg0) {
        field5733 = null;
        if (arg0 == -1) {
            field5724 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILqa;IB)Z", line = 78)
    public final boolean method164(int arg0, class167 arg1, int arg2, byte arg3) {
        ++field5734;
        class105 var5 = arg1.method1038();
        var5.method613(super.field2888, super.field2895, super.field2893);
        class520 var6 = class216.field3204.method3357(this.field5729, (byte) -83).method2466(0, (class170) null, arg3 ^ 77, 0, -1, 131072, this.field5730, (class224) null, arg1);
        if (var6 != null && var6.method1963(arg0, arg2, var5, true)) {
            return true;
        } else {
            if (~this.field5738 != 0) {
                class520 var7 = class216.field3204.method3357(this.field5738, (byte) -62).method2466(0, (class170) null, 0, 0, -1, 131072, this.field5737, (class224) null, arg1);
                if (var7 != null && var7.method1963(arg0, arg2, var5, true)) {
                    return true;
                }
            }
            if (~this.field5723 != 0) {
                class520 var8 = class216.field3204.method3357(this.field5723, (byte) -97).method2466(0, (class170) null, arg3 ^ 77, 0, -1, 131072, this.field5732, (class224) null, arg1);
                if (var8 != null && var8.method1963(arg0, arg2, var5, true)) {
                    return true;
                }
            }
            return arg3 != 77;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lih;IIII)V", line = 118)
    public static final void method2374(class158 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5736;
        if (arg2 != 0) {
            field5735 = -39;
        }
        for (class434 var5 = (class434) class566.field8403.method2496((byte) 15); var5 != null; var5 = (class434) class566.field8403.method2494(116)) {
            if (var5.field6352 == arg1 && ~(arg4 << 7) == ~var5.field6363 && ~(arg3 << 7) == ~var5.field6369 && ~var5.field6362.field2010 == ~arg0.field2010) {
                if (var5.field6356 != null) {
                    class105.field1321.method2085(var5.field6356);
                    var5.field6356 = null;
                }
                if (var5.field6348 != null) {
                    class105.field1321.method2085(var5.field6348);
                    var5.field6348 = null;
                }
                var5.method2997(1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILqa;)Llb;", line = 164)
    public final class239 method169(int arg0, class167 arg1) {
        ++field5728;
        class105 var3 = arg1.method1038();
        var3.method613(super.field2888, super.field2895, super.field2893);
        if (arg0 != -911932384) {
            return null;
        } else {
            class239 var4 = class210.method1365(false, 3);
            if (this.field5723 != -1) {
                class520 var5 = class216.field3204.method3357(this.field5723, (byte) -90).method2466(0, (class170) null, arg0 + 911932384, 0, -1, 2048, this.field5732, (class224) null, arg1);
                if (var5 != null) {
                    var5.method1965(var3, var4.field3503[2], 0);
                }
            }
            if (~this.field5738 != 0) {
                class520 var6 = class216.field3204.method3357(this.field5738, (byte) -124).method2466(0, (class170) null, arg0 ^ -911932384, 0, -1, 2048, this.field5737, (class224) null, arg1);
                if (var6 != null) {
                    var6.method1965(var3, var4.field3503[1], 0);
                }
            }
            class520 var7 = class216.field3204.method3357(this.field5729, (byte) -93).method2466(0, (class170) null, 0, 0, -1, 2048, this.field5730, (class224) null, arg1);
            if (var7 != null) {
                var7.method1965(var3, var4.field3503[0], 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BLqa;)Led;", line = 207)
    public final class115 method157(byte arg0, class167 arg1) {
        int var3 = 52 % ((arg0 - 14) / 48);
        ++field5739;
        return null;
    }
}
