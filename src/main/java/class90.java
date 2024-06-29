import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class90 {

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "J")
    public long field1670 = 0L;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field1665 = 0;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "Lkh;")
    public static class117 field1669 = class224.method1450((byte) -109, "<col=ff0000>");

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "[I")
    public static int[] field1664 = new int[100];

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "Lkh;")
    public static class117 field1681 = class224.method1450((byte) 114, "Starte 3D)2Softwarebibliothek)3");

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "Leh;")
    public static class53 field1680 = new class53(500);

    @OriginalMember(owner = "client!ib", name = "y", descriptor = "Lkh;")
    private static class117 field1684 = class224.method1450((byte) 114, "Free world");

    @OriginalMember(owner = "client!ib", name = "z", descriptor = "[Lkh;")
    public static class117[] field1685 = new class117[8];

    @OriginalMember(owner = "client!ib", name = "A", descriptor = "Lkh;")
    public static class117 field1686 = field1684;

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "Lkh;")
    private static class117 field1683 = class224.method1450((byte) 120, "Unable to connect)3");

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "Lkh;")
    public static class117 field1682 = field1683;

    @OriginalMember(owner = "client!ib", name = "B", descriptor = "Lkh;")
    public static class117 field1687 = field1683;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "D")
    public static double field1672;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
    public int field1666;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    public int field1668;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    public int field1671;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "I")
    public int field1676;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "I")
    public int field1677;

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "Lnb;")
    public static class144 field1679;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "Ldd;")
    public class38 field1661;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "Ldd;")
    public class38 field1678;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "Lah;")
    public static class9 field1667;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "[[Lah;")
    public static class9[][] field1675;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method628(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1673++;
        if (arg0 < 128 || arg2 < 128 || arg0 > 13056 || arg2 > 13056) {
            class114.field2128 = -1;
            class56.field1164 = -1;
            return;
        }
        int var8 = class186.method1265(true, arg2, class203.field3675, arg0) - arg4;
        int var9 = arg2 - class186.field3339;
        int var10 = class89.field1650[class150.field2726];
        int var11 = var8 - class31.field732;
        int var12 = class89.field1646[class86.field1626];
        int var13 = class89.field1650[class86.field1626];
        int var14 = class89.field1646[class150.field2726];
        if (arg3 != 0) {
            return;
        }
        int var15 = arg0 - class19.field535;
        int var16 = var9 * var13 + var12 * var15 >> 16;
        int var17 = var9 * var12 - var13 * var15 >> 16;
        int var19 = var11 * var14 - var10 * var17 >> 16;
        int var20 = var10 * var11 + var14 * var17 >> 16;
        if (var20 >= 50) {
            class56.field1164 = (var16 << 9) / var20 + arg1;
            class114.field2128 = (var19 << 9) / var20 + arg6;
        } else {
            class56.field1164 = -1;
            class114.field2128 = -1;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIILdd;JLdd;Ldd;)V")
    public static final void method629(int arg0, int arg1, int arg2, int arg3, class38 arg4, long arg5, class38 arg6, class38 arg7) {
        class179 var9 = new class179();
        var9.field3238 = arg4;
        var9.field3249 = arg1 * 128 + 64;
        var9.field3243 = arg2 * 128 + 64;
        var9.field3230 = arg3;
        var9.field3244 = arg5;
        var9.field3232 = arg6;
        var9.field3240 = arg7;
        int var10 = 0;
        class170 var11 = class109.field2063[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field3065; var12++) {
                class57 var13 = var11.field3063[var12];
                if ((var13.field1171 & 0x400000L) == 4194304L) {
                    int var14 = var13.field1182.method134();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field3242 = -var10;
        if (class109.field2063[arg0][arg1][arg2] == null) {
            class109.field2063[arg0][arg1][arg2] = new class170(arg0, arg1, arg2);
        }
        class109.field2063[arg0][arg1][arg2].field3067 = var9;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(III[Lkh;)Lkh;")
    public static final class117 method630(int arg0, int arg1, int arg2, class117[] arg3) {
        field1660++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg0; var5++) {
            if (arg3[arg1 + var5] == null) {
                arg3[arg1 + var5] = class185.field3325;
            }
            var4 += arg3[arg1 + var5].field2213;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        int var8 = 29 % ((arg2 + 46) / 52);
        for (int var9 = 0; var9 < arg0; var9++) {
            class117 var11 = arg3[arg1 + var9];
            class2.method9(var11.field2196, 0, var6, var7, var11.field2213);
            var7 += var11.field2213;
        }
        class117 var10 = new class117();
        var10.field2213 = var4;
        var10.field2196 = var6;
        return var10;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
    public static final void method631(int arg0) {
        class105.field1911.method400(24, 8);
        for (class73 var1 = (class73) class11.field371.method456((byte) 113); var1 != null; var1 = (class73) class11.field371.method459((byte) -87)) {
            if (var1.field1398 == 0) {
                class101.method682(arg0 ^ 0xFFFF9250, var1, true);
            }
        }
        if (arg0 != -1) {
            return;
        }
        if (class191.field3407 != null) {
            class62.method457(class191.field3407, 0);
            class191.field3407 = null;
        }
        class72.field1383++;
        field1663++;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
    public static void method632(int arg0) {
        field1680 = null;
        field1664 = null;
        field1683 = null;
        field1681 = null;
        if (arg0 != 128) {
            method630(-33, 118, 112, null);
        }
        field1687 = null;
        field1679 = null;
        field1669 = null;
        field1675 = null;
        field1684 = null;
        field1686 = null;
        field1685 = null;
        field1667 = null;
        field1682 = null;
    }
}
