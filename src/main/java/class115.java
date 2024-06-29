import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class115 extends class104 {

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "[Lkd;")
    public class83[] field1626;

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "[I")
    public static int[] field1625 = new int[100];

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "[J")
    public static long[] field1624 = new long[100];

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "I")
    public static int field1632 = 0;

    @OriginalMember(owner = "client!sf", name = "x", descriptor = "I")
    public static volatile int field1630 = -1;

    @OriginalMember(owner = "client!sf", name = "u", descriptor = "Lan;")
    public static class337 field1627 = new class337();

    @OriginalMember(owner = "client!sf", name = "E", descriptor = "I")
    public static int field1635 = 0;

    @OriginalMember(owner = "client!sf", name = "F", descriptor = "I")
    public static int field1636 = 0;

    @OriginalMember(owner = "client!sf", name = "H", descriptor = "Ljava/lang/String;")
    public static String field1638 = "purple:";

    @OriginalMember(owner = "client!sf", name = "v", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!sf", name = "w", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!sf", name = "y", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!sf", name = "A", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!sf", name = "C", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!sf", name = "G", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIIB)V", line = 4)
    public static final void method783(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field1631++;
        int var6 = 0;
        int var7 = arg0;
        int var8 = arg3 * arg3;
        int var9 = arg0 << 1;
        int var10 = arg0 * arg0;
        int var11 = var8 << 1;
        int var12 = var10 - ((var9 - 1) * var11);
        if (arg5 < 56) {
            return;
        }
        int var13 = var10 << 2;
        int var14 = var8 << 2;
        int var15 = ((arg0 << 1) - 3) * var11;
        int var16 = var10 << 1;
        int var17 = ((var6 << 1) + 3) * var16;
        int var18 = (1 - var9) * var8 + var16;
        int var19 = (arg0 - 1) * var14;
        if (arg2 >= class272.field4273 && arg2 <= class248.field3759) {
            int var20 = class140.method930(24918, arg1 + arg3, class56.field678, class109.field1494);
            int var21 = class140.method930(24918, arg1 - arg3, class56.field678, class109.field1494);
            class279.method1997(var20, -824384948, var21, arg4, class206.field2886[arg2]);
        }
        int var22 = (var6 + 1) * var13;
        while (var7 > 0) {
            var7--;
            int var23 = arg2 - var7;
            if (var18 < 0) {
                while (var18 < 0) {
                    var12 += var22;
                    var18 += var17;
                    var6++;
                    var17 += var13;
                    var22 += var13;
                }
            }
            int var24 = arg2 + var7;
            if (var12 < 0) {
                var18 += var17;
                var6++;
                var12 += var22;
                var17 += var13;
                var22 += var13;
            }
            var18 += -var19;
            if (var24 >= class272.field4273 && var23 <= class248.field3759) {
                int var25 = class140.method930(24918, arg1 + var6, class56.field678, class109.field1494);
                int var26 = class140.method930(24918, arg1 - var6, class56.field678, class109.field1494);
                if (var23 >= class272.field4273) {
                    class279.method1997(var25, -824384948, var26, arg4, class206.field2886[var23]);
                }
                if (class248.field3759 >= var24) {
                    class279.method1997(var25, -824384948, var26, arg4, class206.field2886[var24]);
                }
            }
            var19 -= var14;
            var12 += -var15;
            var15 -= var14;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIII)Lvn;", line = 107)
    public static final class344 method784(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = (long) arg2 & 0xFFFFL << 48 | ((long) arg1 & 0xFFFFL) << 32 | (long) arg4 & 0xFFFFL << 16 | (long) arg0 & 0xFFFFL;
        field1637++;
        class344 var7 = (class344) class183.field2640.method1239((byte) -14, var5);
        if (var7 != null) {
            return var7;
        }
        class241[] var8 = null;
        class345 var9 = class180.method1246(arg0, (byte) 50);
        if (var9.field5353 != null) {
            var8 = new class241[var9.field5353.length];
            for (int var10 = 0; var10 < var8.length; var10++) {
                class339 var11 = class116.method790(var9.field5353[var10], arg3 ^ 0xD6F86192);
                var8[var10] = new class241(var11.field5262, var11.field5257, var11.field5270, var11.field5260, var11.field5256, var11.field5273, var11.field5265, var11.field5261);
            }
        }
        class344 var12 = new class344(var9.field5344, var8, var9.field5347, arg2, arg1, arg4);
        class183.field2640.method1243(var12, var5, -29282);
        if (arg3 != -688365168) {
            method789((String) null, true, (String) null, (String) null, -112);
        }
        return var12;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)Z", line = 147)
    public final boolean method785(int arg0, int arg1) {
        if (arg0 != -8572) {
            field1624 = (long[]) null;
        }
        field1633++;
        return this.field1626[arg1].field1065;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILlc;)Z", line = 163)
    public static final boolean method786(int arg0, int arg1, class175 arg2) {
        field1634++;
        if (arg1 < 109) {
            field1638 = (String) null;
        }
        byte[] var3 = arg2.method1195(1, arg0);
        if (var3 == null) {
            return false;
        } else {
            class161.method1063(var3, false);
            return true;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IZ)Z", line = 189)
    public final boolean method787(int arg0, boolean arg1) {
        if (arg1) {
            return false;
        } else {
            field1628++;
            return this.field1626[arg0].field1053;
        }
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(I)V", line = 209)
    public static void method788(int arg0) {
        field1638 = null;
        int var1 = 71 % ((-arg0 - 16) / 43);
        field1625 = null;
        field1627 = null;
        field1624 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;I)V", line = 222)
    public static final void method789(String arg0, boolean arg1, String arg2, String arg3, int arg4) {
        class146.method985(-1, arg0, (byte) -125, arg4, arg3, arg2);
        if (!arg1) {
            method783(-24, 125, 108, -104, 80, (byte) -43);
        }
        field1629++;
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Llc;Llc;IZ)V", line = 249)
    public class115(class175 arg0, class175 arg1, int arg2, boolean arg3) {
        class337 var5 = new class337();
        int var6 = arg0.method1197(-122, arg2);
        this.field1626 = new class83[var6];
        int[] var7 = arg0.method1187(arg2, (byte) 13);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1199(28815, var7[var8], arg2);
            class134 var10 = null;
            int var11 = var9[1] & 0xFF | var9[0] & 0xFF << 8;
            for (class134 var12 = (class134) var5.method2331((byte) 35); var12 != null; var12 = (class134) var5.method2332(-109)) {
                if (var12.field1852 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1200(0, 86, var11);
                } else {
                    var13 = arg1.method1200(var11, 116, 0);
                }
                var10 = new class134(var11, var13);
                var5.method2325(var10, (byte) 34);
            }
            this.field1626[var7[var8]] = new class83(var9, var10);
        }
    }
}
