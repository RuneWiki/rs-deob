import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("hd")
public class class73 extends class71 {

    @OriginalMember(owner = "hd", name = "o", descriptor = "I")
    public int field1407;

    @OriginalMember(owner = "hd", name = "s", descriptor = "I")
    public int field1411;

    @OriginalMember(owner = "hd", name = "u", descriptor = "I")
    public static int field1413 = 1;

    @OriginalMember(owner = "hd", name = "p", descriptor = "Llf;")
    private static class109 field1408 = class35.method275("Location", 2);

    @OriginalMember(owner = "hd", name = "n", descriptor = "Llf;")
    public static class109 field1406 = class35.method275("Diese Betatest)2Welt ist nur f-Ur eingeladene", 2);

    @OriginalMember(owner = "hd", name = "q", descriptor = "Llf;")
    public static class109 field1409 = field1408;

    @OriginalMember(owner = "hd", name = "v", descriptor = "Llf;")
    public static class109 field1414 = class35.method275("Lade Schrifts-=tze )2 ", 2);

    @OriginalMember(owner = "hd", name = "t", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "hd", name = "w", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "hd", name = "r", descriptor = "Loh;")
    public static class138 field1410;

    @OriginalMember(owner = "hd", name = "a", descriptor = "(III)J")
    public static final long method458(int arg0, int arg1, int arg2) {
        class3 var3 = class78.field1550[arg0][arg1][arg2];
        return var3 == null || var3.field34 == null ? 0L : var3.field34.field2054;
    }

    @OriginalMember(owner = "hd", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method459(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class127 var20 = new class127(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class78.field1550[var21][arg1][arg2] == null) {
                    class78.field1550[var21][arg1][arg2] = new class3(var21, arg1, arg2);
                }
            }
            class78.field1550[arg0][arg1][arg2].field35 = var20;
        } else if (arg3 == 1) {
            class127 var22 = new class127(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class78.field1550[var23][arg1][arg2] == null) {
                    class78.field1550[var23][arg1][arg2] = new class3(var23, arg1, arg2);
                }
            }
            class78.field1550[arg0][arg1][arg2].field35 = var22;
        } else {
            class43 var24 = new class43(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class78.field1550[var25][arg1][arg2] == null) {
                    class78.field1550[var25][arg1][arg2] = new class3(var25, arg1, arg2);
                }
            }
            class78.field1550[arg0][arg1][arg2].field36 = var24;
        }
    }

    @OriginalMember(owner = "hd", name = "a", descriptor = "(I)V")
    public static void method460(int arg0) {
        if (arg0 != -2831) {
            method462(58);
        }
        field1408 = null;
        field1414 = null;
        field1410 = null;
        field1409 = null;
        field1406 = null;
    }

    @OriginalMember(owner = "hd", name = "c", descriptor = "(B)Lkf;")
    public static final class100 method461(byte arg0) {
        field1412++;
        class100 var1 = new class100();
        var1.field2009 = class21.field481[0];
        var1.field2012 = class116.field2298;
        var1.field2008 = class69.field1345[0];
        var1.field2011 = class160.field2992[0];
        var1.field2010 = class168.field3114;
        byte[] var2 = class10.field166[0];
        var1.field2013 = class202.field3976[0];
        int var3 = var1.field2009 * var1.field2008;
        var1.field2007 = new int[var3];
        int var4 = 0;
        if (arg0 != 46) {
            method459(-111, -90, -5, -59, 26, -120, 3, 37, 88, 0, -117, 36, -70, -65, 83, 82, 31, 122, 107, 122);
        }
        while (var4 < var3) {
            var1.field2007[var4] = class51.field1036[class170.method1140(255, var2[var4])];
            var4++;
        }
        class69.method444(arg0 - 159);
        return var1;
    }

    @OriginalMember(owner = "hd", name = "b", descriptor = "(I)V")
    public static final void method462(int arg0) {
        int var1 = 0;
        if (arg0 <= 100) {
            field1406 = null;
        }
        while (class98.field1967 > var1) {
            int var2 = class102.field2018[var1];
            class184 var3 = class202.field3975[var2];
            int var4 = class95.field1934.method598((byte) 105);
            if ((var4 & 0x4) != 0) {
                var4 += class95.field1934.method598((byte) 83) << 8;
            }
            class140.method1003(var2, (byte) -38, var3, var4);
            var1++;
        }
        field1415++;
    }

    @OriginalMember(owner = "hd", name = "<init>", descriptor = "(II)V")
    public class73(int arg0, int arg1) {
        this.field1407 = arg1;
        this.field1411 = arg0;
    }
}
