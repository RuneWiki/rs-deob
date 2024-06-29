import java.awt.Canvas;
import java.awt.event.FocusListener;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class149 extends Canvas implements FocusListener {

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "J")
    public static volatile long field2250 = 0L;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "[Lhb;")
    public static class35[] field2251 = new class35[2048];

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "B")
    public static byte field2254;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Z)V", line = 9)
    public static final void method1102(boolean arg0) {
        class126.field1991.method1428(10935);
        if (!arg0) {
            method1103(-113, (class211) null, -19, (byte) -46);
        }
        field2260++;
        class322.field5010.method1428(10935);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILlb;IB)Lvd;", line = 31)
    public static final class134 method1103(int arg0, class211 arg1, int arg2, byte arg3) {
        if (arg3 >= -13) {
            field2251 = (class35[]) null;
        }
        field2255++;
        return class297.method2093(arg2, arg0, (byte) 99, arg1) ? class189.method1364(0) : null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILlb;B)Lsd;", line = 46)
    public static final class27 method1104(int arg0, class211 arg1, byte arg2) {
        field2259++;
        if (arg2 == -70) {
            return class57.method513(arg0, arg1, 11332) ? class197.method1434(false) : null;
        } else {
            return (class27) null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)I", line = 61)
    public static final int method1105(int arg0, int arg1) {
        field2253++;
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            arg1 >>>= 0x10;
            var2 += 16;
        }
        if (arg1 >= 256) {
            var2 += 8;
            arg1 >>>= 0x8;
        }
        if (arg0 >= -111) {
            method1106(107);
        }
        if (arg1 >= 16) {
            arg1 >>>= 0x4;
            var2 += 4;
        }
        if (arg1 >= 4) {
            var2 += 2;
            arg1 >>>= 0x2;
        }
        if (arg1 >= 1) {
            var2++;
            arg1 >>>= 0x1;
        }
        return var2 + arg1;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V", line = 108)
    public static void method1106(int arg0) {
        if (arg0 == 12158) {
            field2251 = null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lhb;B)V", line = 141)
    public static final void method1107(class35 arg0, byte arg1) {
        if (arg1 > -113) {
            return;
        }
        byte[] var2 = new byte[24];
        field2261++;
        if (class278.field4273 != null) {
            try {
                class278.field4273.method1837(0L, 0);
                class278.field4273.method1847((byte) -49, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var6) {
                for (int var5 = 0; var5 < 24; var5++) {
                    var2[var5] = -1;
                }
            }
        }
        arg0.method278(0, 24, (byte) 24, var2);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIII)I", line = 187)
    public static final int method1108(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2257++;
        if (class3.field6) {
            arg2 = 1000000;
            class3.field6 = false;
        }
        class174 var5 = class170.field2537[arg1][arg3];
        float var6 = ((float) arg0 * 0.1F + 0.7F) * var5.field2573;
        int var7 = var5.field2581;
        float var8 = var5.field2579;
        float var9 = var5.field2570;
        int var10 = var5.field2578;
        int var11 = var5.field2575;
        if (!class319.field4971) {
            var10 = 0;
        }
        if (class75.field1065 != var11 || class256.field3825 != var6 || class63.field950 != var8 || class57.field851 != var9 || class69.field1015 != var7 || class205.field3252 != var10) {
            class75.field1065 = var11;
            class104.field1601 = 0;
            class227.field3511 = class160.field2383;
            class205.field3252 = var10;
            class69.field1015 = var7;
            class63.field950 = var8;
            class59.field886 = class292.field4585;
            class57.field851 = var9;
            class95.field1362 = class62.field947;
            class256.field3825 = var6;
            class44.field690 = class212.field3375;
            class150.field2271 = class150.field2267;
            class260.field3852 = class51.field789;
        }
        if (class104.field1601 < arg4) {
            class104.field1601 += arg2 * 250;
            if (class104.field1601 >= 65536) {
                class104.field1601 = 65536;
            }
            float var12 = (float) (65536 - class104.field1601) / 65536.0F;
            int var13 = class104.field1601 >> 8;
            int var14 = 65536 - class104.field1601 >> 8;
            float var15 = (float) class104.field1601 / 65536.0F;
            class212.field3375 = ((class75.field1065 & 0xFF00) * var13 + (class44.field690 & 0xFF00) * var14 & 0xFF0000) + ((class75.field1065 & 0xFF00FF) * var13 + (class44.field690 & 0xFF00FF) * var14 & 0xFF00FF00) >> 8;
            class150.field2267 = class63.field950 * var15 + class150.field2271 * var12;
            class62.field947 = class95.field1362 * var12 + class256.field3825 * var15;
            class160.field2383 = class57.field851 * var15 + class227.field3511 * var12;
            class51.field789 = class260.field3852 * var14 + class205.field3252 * var13 >> 8;
            class292.field4585 = ((class69.field1015 & 0xFF00) * var13 + (class59.field886 & 0xFF00) * var14 & 0xFF0000) + ((class69.field1015 & 0xFF00FF) * var13 + (class59.field886 & 0xFF00FF) * var14 & 0xFF00FF00) >> 8;
        }
        class264.method1823(class212.field3375, class62.field947, class150.field2267, class160.field2383);
        class264.method1825(class292.field4585, class51.field789);
        class264.method1822((float) class267.field4007, (float) class315.field4913, (float) class291.field4572);
        class264.method1824();
        return class292.field4585;
    }
}
