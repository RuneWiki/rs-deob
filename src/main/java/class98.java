import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class98 {

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "[[I")
    public static int[][] field1473 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "Lpc;")
    public static class473 field1471;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "[I")
    public static int[] field1478;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BLql;BII)V", line = 21)
    public static final void method698(byte arg0, class515 arg1, byte arg2, int arg3, int arg4) {
        field1474++;
        int var5 = arg1.field6261[0];
        int var6 = arg1.field6266[0];
        if (var5 < 0 || var5 >= class12.field251 || var6 < 0 || var6 >= class289.field3782 || arg3 < 0 || arg3 >= class12.field251 || arg4 < 0 || class289.field3782 <= arg4) {
            return;
        }
        int var7 = class290.method1705(0, 0, 0, arg4, var5, -4, var6, class120.field1754[arg1.field573], class270.field3545, arg1.method2590(0), class59.field926, arg3, (byte) -76, 0, true);
        if (var7 < 1 || var7 > 3) {
            return;
        }
        for (int var8 = 0; var8 < (var7 - 1); var8++) {
            arg1.method3034(125, arg0, class270.field3545[var8], class59.field926[var8]);
        }
        if (arg2 != -104) {
            field1478 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILcd;[[B)V", line = 73)
    public static final void method699(int arg0, class205 arg1, byte[][] arg2) {
        field1479++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg2.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var10 = arg2[var5];
            if (var10 != null) {
                class379 var11 = new class379(var10);
                int var12 = class149.field2131[var5] >> 8;
                int var13 = class149.field2131[var5] & 0xFF;
                int var14 = var12 * 64 - class401.field5382;
                int var15 = var13 * 64 - class421.field5762;
                class88.method641((byte) 114);
                arg1.method1633(class421.field5762, class401.field5382, var15, var14, (byte) 125, class120.field1754, var11);
                arg1.method1317(var14, class370.field4984, 14548, var15, var3, var11);
                if (!arg1.field3592 && class522.field7715 / 8 == var12 && (class176.field2564 / 8) == var13 && var3[0] != -1) {
                    class121.field1775 = class389.field5280.method652(class520.field7700, var3[3], var3[0], (byte) -69, var3[2], var3[1]);
                    class205.field2831 = var3[4];
                }
            }
        }
        if (arg0 != -5232) {
            field1473 = null;
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class149.field2131[var6] >> 8) * 64 - class401.field5382;
            int var8 = (class149.field2131[var6] & 0xFF) * 64 - class421.field5762;
            byte[] var9 = arg2[var6];
            if (var9 == null && class176.field2564 < 800) {
                class88.method641((byte) 111);
                arg1.method1635(true, 64, 64, var7, var8);
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V", line = 151)
    public static void method700(int arg0) {
        field1471 = null;
        field1473 = null;
        if (arg0 != 1) {
            method701(35, 109, false);
        }
        field1478 = null;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIZ)Z", line = 174)
    public static final boolean method701(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field1478 = null;
        }
        field1477++;
        return (arg1 & 0x580) != 0;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)V", line = 196)
    public static final void method702(int arg0, int arg1) {
        if (arg0 != 10) {
            method698((byte) 109, null, (byte) 114, 69, -43);
        }
        field1475++;
        if (arg1 != -1 && class489.field6793[arg1]) {
            class14.field279.method2728(arg1, 100);
            class238.field3185[arg1] = null;
            class462.field6402[arg1] = null;
            class489.field6793[arg1] = false;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BLqa;)V", line = 224)
    public static final void method703(byte arg0, class162 arg1) {
        field1472++;
        arg1.method572(0, 0, class149.field2132, 350);
        int var2 = 19 / ((59 - arg0) / 55);
        arg1.method585(0, 0, class149.field2132, 350, class367.field4963 << 24 | 0x332277, 1);
        int var3 = 350 / class8.field209;
        if (class141.field2042 > 0) {
            int var4 = 346 - class8.field209 - 4;
            int var5 = var3 * var4 / (class141.field2042 + var3 - 1);
            int var6 = 4;
            if (class141.field2042 > 1) {
                var6 += (class141.field2042 - class53.field834 - 1) * (var4 - var5) / (class141.field2042 - 1);
            }
            arg1.method585(class149.field2132 - 16, var6, 12, var5, class367.field4963 << 24 | 0x332277, 2);
            for (int var7 = class53.field834; var7 < class53.field834 + var3 && var7 < class141.field2042; var7++) {
                String[] var8 = class482.method2781(class390.field5283[var7], -22005, '\b');
                int var9 = (class149.field2132 - 16 - 8) / var8.length;
                for (int var10 = 0; var10 < var8.length; var10++) {
                    int var11 = (var9 * var10) + 8;
                    arg1.method572(var11, 0, var9 + var11 - 8, 350);
                    class302.field3995.method2816(var8[var10], true, 350 - class321.field4208 - ((var7 - class53.field834) * class8.field209 + client.field2732.field5800) - 2, -1, var11, -16777216);
                }
            }
        }
        arg1.method572(0, 0, class149.field2132, 350);
        arg1.method1092(-1, -19380, class149.field2132, 350 - class321.field4208, 0);
        class219.field2961.method2816("--> " + class294.field3847, true, 350 - class173.field2525.field5800 - 1, -1, 10, -16777216);
        int var12 = -1;
        if ((class31.field516 % 30) > 15) {
            var12 = 16777215;
        }
        arg1.method1098(-14183, 339 - class173.field2525.field5800, var12, 12, class173.field2525.method2455((byte) 111, "--> " + class294.field3847.substring(0, class77.field1154)) + 10);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BII)I", line = 286)
    public static final int method704(byte arg0, int arg1, int arg2) {
        if (arg0 > -9) {
            method700(-45);
        }
        field1476++;
        int var3 = arg1 >>> 31;
        return (arg1 + var3) / arg2 - var3;
    }
}
