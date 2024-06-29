import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class166 extends class288 {

    @OriginalMember(owner = "client!e", name = "q", descriptor = "I")
    public static int field2384 = 0;

    @OriginalMember(owner = "client!e", name = "t", descriptor = "I")
    public static int field2387 = -1;

    @OriginalMember(owner = "client!e", name = "o", descriptor = "Lrc;")
    public static class9 field2382 = new class9(30);

    @OriginalMember(owner = "client!e", name = "l", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "I")
    public int field2381;

    @OriginalMember(owner = "client!e", name = "p", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!e", name = "r", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!e", name = "s", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!e", name = "u", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!e", name = "v", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!e", name = "w", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!e", name = "x", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!e", name = "y", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!e", name = "z", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!e", name = "A", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!e", name = "B", descriptor = "I")
    public int field2395;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)Ltg;")
    public static final class286 method1086(int arg0, int arg1) {
        field2393++;
        class286 var2 = (class286) class105.field1423.method1567((long) arg1, 8);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class168.field2420.method1861(0, arg1, 1);
        if (var3 == null) {
            return null;
        }
        class286 var4 = new class286();
        class216 var5 = new class216(var3);
        var5.field3021 = var5.field3030.length - 2;
        int var6 = var5.method1380(true);
        int var7 = var5.field3030.length - var6 - 2 - 12;
        var5.field3021 = var7;
        int var8 = var5.method1358(102);
        var4.field4419 = var5.method1380(true);
        var4.field4427 = var5.method1380(true);
        var4.field4421 = var5.method1380(true);
        var4.field4420 = var5.method1380(true);
        int var9 = var5.method1407(120);
        if (var9 > 0) {
            var4.field4418 = new class284[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method1380(true);
                class284 var12 = new class284(class72.method450(true, var11));
                var4.field4418[var10] = var12;
                while (var11-- > 0) {
                    int var13 = var5.method1358(87);
                    int var14 = var5.method1358(55);
                    var12.method1894(-1, new class138(var14), (long) var13);
                }
            }
        }
        int var15 = 0;
        var5.field3021 = 0;
        var4.field4426 = var5.method1367(45);
        var4.field4429 = new int[var8];
        var4.field4425 = new int[var8];
        var4.field4422 = new String[var8];
        while (var7 > var5.field3021) {
            int var17 = var5.method1380(true);
            if (var17 == 3) {
                var4.field4422[var15] = var5.method1352((byte) 47).intern();
            } else if (var17 >= 100 || var17 == 21 || var17 == 38 || var17 == 39) {
                var4.field4429[var15] = var5.method1407(104);
            } else {
                var4.field4429[var15] = var5.method1358(105);
            }
            var4.field4425[var15++] = var17;
        }
        int var16 = -28 / ((arg0 + 72) / 41);
        class105.field1423.method1568((byte) -127, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BZ)V")
    public static final void method1087(byte arg0, boolean arg1) {
        field2392++;
        if (arg1 != class181.field2576 && arg0 == -4) {
            class181.field2576 = arg1;
            class179.method1163(-13869);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lbc;IIB)Lpk;")
    public static final class43 method1088(class282 arg0, int arg1, int arg2, byte arg3) {
        field2380++;
        if (class282.method1875(arg0, arg1, 0, arg2)) {
            if (arg3 >= -18) {
                field2389 = 114;
            }
            return class180.method1169((byte) 103);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([BI)Z")
    public static final boolean method1089(byte[] arg0, int arg1) {
        field2379++;
        if (arg1 != 12642) {
            field2382 = null;
        }
        class216 var2 = new class216(arg0);
        int var3 = var2.method1407(arg1 - 12515);
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method1407(113) == 1;
        if (var4) {
            class156.method1038(0, var2);
        }
        class175.method1133(var2, -34);
        return true;
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(B)V")
    public static final void method1090(byte arg0) {
        while (true) {
            if (class163.field2332.method595(class230.field3314, -116) >= 27) {
                int var1 = class163.field2332.method594((byte) 124, 15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class20.field244[var1] == null) {
                        var2 = true;
                        class20.field244[var1] = new class54();
                    }
                    class54 var3 = class20.field244[var1];
                    class14.field176[class294.field4642++] = var1;
                    var3.field4546 = class198.field2819;
                    if (var3.field636 != null && var3.field636.method1711((byte) -77)) {
                        class61.method378(var3, 14);
                    }
                    int var4 = class163.field2332.method594((byte) 99, 5);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = class228.field3220[class163.field2332.method594((byte) 111, 3)];
                    if (var2) {
                        var3.field4534 = var3.field4512 = var5;
                    }
                    int var6 = class163.field2332.method594((byte) 97, 1);
                    var3.method322(class165.method1084(-52, class163.field2332.method594((byte) 97, 14)), 84);
                    int var7 = class163.field2332.method594((byte) 125, 5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = class163.field2332.method594((byte) 117, 1);
                    if (var8 == 1) {
                        class286.field4423[class272.field3986++] = var1;
                    }
                    var3.method1939(var3.field636.field3858, -116);
                    var3.field4588 = var3.field636.field3860;
                    var3.field4505 = var3.field636.field3845;
                    if (var3.field4505 == 0) {
                        var3.field4512 = 0;
                    }
                    var3.method1942(-25, class177.field2507.field4585[0] + var7, var3.method1556(3888), var6 == 1, class177.field2507.field4597[0] + var4);
                    if (var3.field636.method1711((byte) -95)) {
                        class287.method1931(0, 128, var3.field4585[0], var3, var3.field4597[0], (class240) null, class199.field2833, (class273) null);
                    }
                    continue;
                }
            }
            class163.field2332.method587((byte) -111);
            if (arg0 <= 105) {
                method1090((byte) 67);
            }
            field2390++;
            return;
        }
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V")
    public static final void method1091(int arg0) {
        field2394++;
        Container var1;
        if (class48.field553 != null) {
            var1 = class48.field553;
        } else if (class202.field2858 == null) {
            var1 = class115.field1592.field664;
        } else {
            var1 = class202.field2858;
        }
        class98.field1311 = var1.getSize().width;
        class35.field404 = var1.getSize().height;
        if (class202.field2858 == var1) {
            Insets var2 = class202.field2858.getInsets();
            class35.field404 -= var2.top + var2.bottom;
            class98.field1311 -= var2.right + var2.left;
        }
        if (class285.method1903(32113) < 2) {
            client.field4437 = 503;
            class30.field369 = (class98.field1311 - 765) / 2;
            class84.field1166 = 765;
            class45.field539 = 0;
        } else {
            class45.field539 = 0;
            client.field4437 = class35.field404;
            class84.field1166 = class98.field1311;
            class30.field369 = 0;
        }
        class181.field2574.setSize(class84.field1166, client.field4437);
        if (class202.field2858 == var1) {
            Insets var3 = class202.field2858.getInsets();
            class181.field2574.setLocation(class30.field369 + var3.left, class45.field539 + var3.top);
        } else {
            class181.field2574.setLocation(class30.field369, class45.field539);
        }
        if (class123.field1776 != -1) {
            class268.method1717((byte) 8, true);
        }
        if (arg0 != -765) {
            method1088((class282) null, -97, 41, (byte) -77);
        }
        class199.method1280((byte) 126);
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(B)V")
    public static void method1092(byte arg0) {
        field2382 = null;
        if (arg0 != 49) {
            field2383 = -3;
        }
    }
}
