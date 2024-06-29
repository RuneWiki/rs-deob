import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class234 {

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public static int field3691 = 0;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "Lnf;")
    public static class162 field3689 = new class162(64);

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
    public int field3695;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
    public int field3696;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
    public int field3698;

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "I")
    public int field3699;

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "I")
    public int field3701;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "I")
    public int field3702;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "[I")
    public static int[] field3693;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "[Lcc;")
    public static class222[] field3700;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)V")
    public static final void method1602(int arg0, int arg1, int arg2) {
        if (arg0 != 7880) {
            field3689 = null;
        }
        class69 var3 = class255.method1723((byte) 32, arg2, 13);
        var3.method556((byte) -106);
        field3703++;
        var3.field1091 = arg1;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIZI)I")
    public static final int method1603(int arg0, int arg1, boolean arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field3692++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg0;
        } else {
            if (arg2) {
                method1605((short[]) null, 37, 13, (String[]) null, true);
            }
            return var4 == 2 ? 7 - arg3 : -arg0 + 7;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILha;)V")
    public static final void method1604(int arg0, class31 arg1) {
        field3694++;
        int var2 = arg1.method276((byte) 125);
        class156.field2335 = new class265[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class156.field2335[var3] = new class265();
            class156.field2335[var3].field4192 = arg1.method276((byte) 45);
            class156.field2335[var3].field4190 = arg1.method317((byte) 109);
        }
        class193.field3026 = arg1.method276((byte) 105);
        class85.field1265 = arg1.method276((byte) 80);
        class278.field4413 = arg1.method276((byte) 76);
        class211.field3251 = new class98[class85.field1265 + 1 - class193.field3026];
        for (int var4 = 0; var4 < class278.field4413; var4++) {
            int var5 = arg1.method276((byte) 44);
            class98 var6 = class211.field3251[var5] = new class98();
            var6.field2000 = arg1.method265(-89);
            var6.field1997 = arg1.method300((byte) -30);
            var6.field1565 = class193.field3026 + var5;
            var6.field1572 = arg1.method317((byte) 97);
            var6.field1562 = arg1.method317((byte) 98);
        }
        class288.field4504 = arg1.method300((byte) -30);
        if (arg0 != 7875) {
            field3705 = 44;
        }
        class179.field2759 = true;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "([SII[Ljava/lang/String;Z)V")
    public static final void method1605(short[] arg0, int arg1, int arg2, String[] arg3, boolean arg4) {
        if (!arg4) {
            return;
        }
        field3690++;
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1;
        int var6 = (arg1 + arg2) / 2;
        String var7 = arg3[var6];
        arg3[var6] = arg3[arg2];
        arg3[arg2] = var7;
        short var8 = arg0[var6];
        arg0[var6] = arg0[arg2];
        arg0[arg2] = var8;
        for (int var9 = arg1; var9 < arg2; var9++) {
            if (var7 == null || arg3[var9] != null && arg3[var9].compareTo(var7) < (var9 & 0x1)) {
                String var10 = arg3[var9];
                arg3[var9] = arg3[var5];
                arg3[var5] = var10;
                short var11 = arg0[var9];
                arg0[var9] = arg0[var5];
                arg0[var5++] = var11;
            }
        }
        arg3[arg2] = arg3[var5];
        arg3[var5] = var7;
        arg0[arg2] = arg0[var5];
        arg0[var5] = var8;
        method1605(arg0, arg1, var5 - 1, arg3, true);
        method1605(arg0, var5 + 1, arg2, arg3, true);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V")
    public static void method1606(byte arg0) {
        field3693 = null;
        field3700 = null;
        field3689 = null;
        if (arg0 != -125) {
            method1607(-70);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
    public static final void method1607(int arg0) {
        field3704++;
        if (class278.field4411 == 5) {
            class278.field4411 = 6;
            int var1 = 14 / (-arg0 / 34);
        }
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)V")
    public static final void method1608(int arg0) {
        if (arg0 != -3) {
            return;
        }
        while (class183.field2900.method1766(class95.field1528, (byte) 108) >= 27) {
            int var1 = class183.field2900.method1765(15, (byte) 82);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class116.field1781[var1] == null) {
                class116.field1781[var1] = new class161();
                var2 = true;
            }
            class161 var3 = class116.field1781[var1];
            class255.field4084[class117.field1782++] = var1;
            var3.field4761 = class41.field686;
            if (var3.field2421 != null && var3.field2421.method740(0)) {
                class195.method1391(var3, 111);
            }
            int var4 = class183.field2900.method1765(1, (byte) -38);
            if (var4 == 1) {
                class147.field2179[class122.field1840++] = var1;
            }
            int var5 = class156.field2334[class183.field2900.method1765(3, (byte) 101)];
            if (var2) {
                var3.field4696 = var3.field4719 = var5;
            }
            int var6 = class183.field2900.method1765(5, (byte) -114);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = class183.field2900.method1765(1, (byte) -27);
            int var8 = class183.field2900.method1765(5, (byte) -42);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method1164(arg0 ^ 0x2CEA, class175.method1250(class183.field2900.method1765(14, (byte) -127), (byte) -66));
            var3.method1970(arg0 + 5, var3.field2421.field1539);
            var3.field4707 = var3.field2421.field1489;
            var3.field4667 = var3.field2421.field1503;
            if (var3.field4667 == 0) {
                var3.field4719 = 0;
            }
            var3.method1988(class263.field4168.field4749[0] + var8, (byte) 41, class263.field4168.field4673[0] + var6, var3.method1013(arg0 + 3), var7 == 1);
            if (var3.field2421.method740(0)) {
                class155.method1124(class130.field1941, (class136) null, (byte) 106, var3.field4673[0], var3.field4749[0], (class295) null, var3, 0);
            }
        }
        field3697++;
        class183.field2900.method1769(-7);
    }
}
