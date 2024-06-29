import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class333 extends class97 {

    @OriginalMember(owner = "client!td", name = "s", descriptor = "Lnn;")
    public static class151 field4964 = new class151(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

    @OriginalMember(owner = "client!td", name = "w", descriptor = "Lpf;")
    public static class425 field4968 = new class425(9, -1);

    @OriginalMember(owner = "client!td", name = "y", descriptor = "Lns;")
    public static class55 field4970 = new class55(9, 6);

    @OriginalMember(owner = "client!td", name = "n", descriptor = "I")
    public static int field4959;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!td", name = "q", descriptor = "I")
    public int field4962;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "I")
    public static int field4963;

    @OriginalMember(owner = "client!td", name = "t", descriptor = "I")
    public int field4965;

    @OriginalMember(owner = "client!td", name = "u", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!td", name = "v", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!td", name = "z", descriptor = "Liq;")
    public static class134 field4971;

    @OriginalMember(owner = "client!td", name = "x", descriptor = "[[I")
    public static int[][] field4969;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BZ)V")
    public static final void method2037(byte arg0, boolean arg1) {
        field4960++;
        byte var2;
        byte[][] var3;
        if (arg1) {
            var2 = 1;
            var3 = class435.field6412;
        } else {
            var3 = class432.field6343;
            var2 = 4;
        }
        int var4 = var3.length;
        if (arg0 >= -93) {
            return;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            int[] var11 = null;
            byte[] var12 = var3[var5];
            int var13 = class161.field2243[var5] >> 8;
            int var14 = class161.field2243[var5] & 0xFF;
            int var15 = var13 * 64 - class17.field250;
            int var16 = var14 * 64 - class112.field1487;
            if (var12 != null) {
                class374.method2244((byte) -78);
                var11 = class313.method1911(class17.field250, var16, 11154, arg1, class449.field6599, var2, class196.field2965, var12, var15, class112.field1487);
            }
            if (!arg1 && class53.field718 / 8 == var13 && class137.field1860 / 8 == var14) {
                if (var11 == null) {
                    class31.field396 = null;
                } else {
                    class31.field396 = class411.method2577(var11[1], var11[0], var11[2], var11[3], 0);
                    class74.field973 = var11[4];
                }
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class161.field2243[var6] >> 8) * 64 - class17.field250;
            int var8 = (class161.field2243[var6] & 0xFF) * 64 - class112.field1487;
            byte[] var9 = var3[var6];
            if (var9 == null && class137.field1860 < 800) {
                class374.method2244((byte) -78);
                for (int var10 = 0; var10 < var2; var10++) {
                    class82.method526(-21375, 64, var7, var8, var10, 64);
                }
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(I)V")
    public static final void method2038(int arg0) {
        if (arg0 != -1) {
            method2039(81, (char) 65520);
        }
        for (int var1 = 0; var1 < class173.field2650; var1++) {
            class111 var2 = class98.method632(arg0 + 2049, var1);
            if (var2 != null && var2.field1459 == 0) {
                class306.field4631[var1] = 0;
                class287.field4375[var1] = 0;
            }
        }
        field4967++;
        class456.field6773 = new class382(128);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IC)C")
    public static final char method2039(int arg0, char arg1) {
        if (arg0 >= -34) {
            return (char) 65415;
        }
        field4959++;
        if (arg1 == 'Æ') {
            return 'E';
        } else if (arg1 == 'æ') {
            return 'e';
        } else if (arg1 == 'ß') {
            return 's';
        } else if (arg1 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg1 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BI)V")
    public static final void method2040(byte arg0, int arg1) {
        field4961++;
        class70.field903 = arg1;
        int var2 = 45 % ((-arg0 - 37) / 59);
        class359.field5313.method1485(-22032);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIII)V")
    public static final void method2041(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 <= 12) {
            return;
        }
        field4963++;
        if (class192.field2917 <= arg0 && arg2 <= class39.field497 && class189.field2831 <= arg4 && arg1 <= class204.field3060) {
            class86.method565(arg3, arg2, arg0, 1, arg4, arg1);
        } else {
            class390.method2404(arg3, arg4, arg0, arg1, (byte) -90, arg2);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V")
    public static void method2042(boolean arg0) {
        field4964 = null;
        field4970 = null;
        field4971 = null;
        field4968 = null;
        if (arg0) {
            field4968 = null;
        }
        field4969 = null;
    }
}
