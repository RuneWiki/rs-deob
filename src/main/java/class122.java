import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class122 extends class247 {

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "Ljf;")
    public static class216 field1748 = new class216(4);

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "[I")
    public static int[] field1754 = new int[14];

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "[Llj;")
    public static class46[] field1758 = new class46[29];

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
    public int field1743;

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "I")
    public int field1744;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "I")
    public int field1749;

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "I")
    public int field1750;

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "I")
    public int field1753;

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!qa", name = "D", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "Lfe;")
    public class231 field1752;

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "Lfe;")
    public class231 field1759;

    @OriginalMember(owner = "client!qa", name = "E", descriptor = "Ljava/lang/String;")
    public String field1761;

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "Z")
    public boolean field1747;

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "[Ljava/lang/Object;")
    public Object[] field1755;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
    public static final void method791(boolean arg0) {
        field1756++;
        class220.field3443.method1511((byte) 126);
        if (!arg0) {
            method796(-109);
        }
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V")
    public static final void method792(int arg0) {
        class237.method1662(class306.field4876, 104);
        if (arg0 > -44) {
            return;
        }
        int var1 = (class99.field1474 >> 10) + (class113.field1653 >> 3);
        field1745++;
        int var2 = (class5.field77 >> 3) + (class255.field4159 >> 10);
        byte var3 = 0;
        byte var4 = 8;
        byte var5 = 18;
        class250.field4072 = new int[var5];
        byte var6 = 8;
        class129.field1840 = new byte[var5][];
        class199.field3148 = new byte[var5][];
        class254.field4153 = new int[var5];
        class44.field527 = new byte[var5][];
        class73.field1085 = new int[var5];
        class127.field1823 = new int[var5];
        class313.field5014 = new int[var5];
        class161.field2410 = new int[var5];
        class140.field2014 = new int[var5][4];
        int var7 = 0;
        for (int var8 = (var1 - 6) / 8; var8 <= (var1 + 6) / 8; var8++) {
            for (int var10 = (var2 - 6) / 8; var10 <= ((var2 + 6) / 8); var10++) {
                int var11 = (var8 << 8) + var10;
                class250.field4072[var7] = var11;
                class73.field1085[var7] = class135.field1951.method498(0, "m" + var8 + "_" + var10);
                class127.field1823[var7] = class135.field1951.method498(0, "l" + var8 + "_" + var10);
                class254.field4153[var7] = class135.field1951.method498(0, "n" + var8 + "_" + var10);
                class313.field5014[var7] = class135.field1951.method498(0, "um" + var8 + "_" + var10);
                class161.field2410[var7] = class135.field1951.method498(0, "ul" + var8 + "_" + var10);
                if (class254.field4153[var7] == -1) {
                    class73.field1085[var7] = -1;
                    class127.field1823[var7] = -1;
                    class313.field5014[var7] = -1;
                    class161.field2410[var7] = -1;
                }
                var7++;
            }
        }
        for (int var9 = var7; var9 < class254.field4153.length; var9++) {
            class254.field4153[var9] = -1;
            class73.field1085[var9] = -1;
            class127.field1823[var9] = -1;
            class313.field5014[var9] = -1;
            class161.field2410[var9] = -1;
        }
        class281.method1934(var2, var1, false, var3, var4, 2048, true, var6);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIZLfe;)V")
    public static final void method793(int arg0, int arg1, boolean arg2, class231 arg3) {
        field1751++;
        if (arg3.field3644 == 0) {
            arg3.field3608 = arg3.field3607;
        } else if (arg3.field3644 == 1) {
            arg3.field3608 = (arg1 - arg3.field3686) / 2 + arg3.field3607;
        } else if (arg3.field3644 == 2) {
            arg3.field3608 = arg1 - arg3.field3686 - arg3.field3607;
        } else if (arg3.field3644 == 3) {
            arg3.field3608 = arg3.field3607 * arg1 >> 14;
        } else if (arg3.field3644 == 4) {
            arg3.field3608 = (arg3.field3607 * arg1 >> 14) + (arg1 - arg3.field3686) / 2;
        } else {
            arg3.field3608 = arg1 - ((arg3.field3607 * arg1 >> 14) + arg3.field3686);
        }
        if (arg3.field3579 == 0) {
            arg3.field3734 = arg3.field3740;
        } else if (arg3.field3579 == 1) {
            arg3.field3734 = (arg0 - arg3.field3730) / 2 + arg3.field3740;
        } else if (arg3.field3579 == 2) {
            arg3.field3734 = arg0 - arg3.field3730 - arg3.field3740;
        } else if (arg3.field3579 == 3) {
            arg3.field3734 = arg3.field3740 * arg0 >> 14;
        } else if (arg3.field3579 == 4) {
            arg3.field3734 = (arg3.field3740 * arg0 >> 14) + (arg0 - arg3.field3730) / 2;
        } else {
            arg3.field3734 = arg0 - (arg3.field3740 * arg0 >> 14) - arg3.field3730;
        }
        if (!arg2 || !class107.field1563) {
            return;
        }
        if (client.method1698(arg3).field367 == 0 && arg3.field3620 != 0) {
            return;
        }
        if (arg3.field3608 < 0) {
            arg3.field3608 = 0;
        } else if ((arg3.field3686 + arg3.field3608) > arg1) {
            arg3.field3608 = arg1 - arg3.field3686;
        }
        if (arg3.field3734 < 0) {
            arg3.field3734 = 0;
            return;
        }
        if (arg0 < (arg3.field3734 + arg3.field3730)) {
            arg3.field3734 = arg0 - arg3.field3730;
            return;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)I")
    public static final int method794(int arg0, String arg1, String arg2, int arg3) {
        field1742++;
        int var4 = arg1.length();
        int var5 = arg2.length();
        int var6 = 0;
        char var7 = 0;
        int var8 = 0;
        char var9 = 0;
        while (var6 - var7 < var4 || var5 > var8 - var9) {
            if (var4 <= (var6 - var7)) {
                return -1;
            }
            if (var5 <= (var8 - var9)) {
                return 1;
            }
            char var22;
            if (var7 == '\u0000') {
                var22 = arg1.charAt(var6++);
            } else {
                var22 = var7;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg2.charAt(var8++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var7 = class81.method547(var22, 15816);
            var9 = class81.method547(var24, 15816);
            char var26 = class10.method60(arg3, 109, var22);
            char var27 = class10.method60(arg3, 8, var24);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class117.method772(arg3, 56, var28) - class117.method772(arg3, -124, var29);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = arg0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg3 == 2) {
                var16 = var4 - var11 - 1;
                var17 = var5 - var11 - 1;
            } else {
                var17 = var11;
                var16 = var11;
            }
            char var18 = arg1.charAt(var16);
            char var19 = arg2.charAt(var17);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class117.method772(arg3, -107, var20) - class117.method772(arg3, 116, var21);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg1.charAt(var13);
            char var15 = arg2.charAt(var13);
            if (var14 != var15) {
                return class117.method772(arg3, -85, var14) - class117.method772(arg3, 71, var15);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lqa;I)V")
    public static final void method795(class122 arg0, int arg1) {
        class211.method1461(200000, arg0, 0);
        field1760++;
        if (arg1 > -92) {
            method794(-57, (String) null, (String) null, 65);
        }
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V")
    public static void method796(int arg0) {
        if (arg0 != 14) {
            method794(-12, (String) null, (String) null, 30);
        }
        field1748 = null;
        field1758 = null;
        field1754 = null;
    }
}
