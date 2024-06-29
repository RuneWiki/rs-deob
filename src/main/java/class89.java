import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class89 extends class146 {

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "[I")
    public static int[] field1538 = new int[128];

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "Lub;")
    public static class227 field1540 = class257.method1749("null", 17263);

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "Lub;")
    public static class227 field1541 = class257.method1749("Clientscript error )2 check log for details", 17263);

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "Lub;")
    public static class227 field1539 = class257.method1749(" <col=ffffff>", 17263);

    @OriginalMember(owner = "client!hg", name = "s", descriptor = "[I")
    public static int[] field1544 = new int[5];

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!hg", name = "r", descriptor = "Lwa;")
    public static class135 field1543;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIIII)V")
    public static final void method529(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1536++;
        int var7 = class23.method111(arg0, class161.field2718, class46.field817, 0);
        int var8 = class23.method111(arg4, class161.field2718, class46.field817, 0);
        int var9 = class23.method111(arg2, class125.field2234, class19.field331, arg3 ^ arg3);
        int var10 = class23.method111(arg6, class125.field2234, class19.field331, arg3 ^ 0x71E0);
        int var11 = class23.method111(arg0 + arg5, class161.field2718, class46.field817, 0);
        int var12 = class23.method111(arg4 - arg5, class161.field2718, class46.field817, 0);
        for (int var13 = var7; var13 < var11; var13++) {
            class246.method1644(arg1, class59.field1094[var13], var10, var9, 1);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class246.method1644(arg1, class59.field1094[var14], var10, var9, 1);
        }
        int var15 = class23.method111(arg2 + arg5, class125.field2234, class19.field331, arg3 ^ 0x71E0);
        int var16 = class23.method111(arg6 - arg5, class125.field2234, class19.field331, arg3 ^ 0x71E0);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class59.field1094[var17];
            class246.method1644(arg1, var18, var15, var9, arg3 ^ 0x71E1);
            class246.method1644(arg1, var18, var10, var16, 1);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IZ)Z")
    public static final boolean method530(int arg0, boolean arg1) {
        if (arg1) {
            return true;
        } else {
            field1542++;
            return (arg0 >> 20 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(I)V")
    public static void method531(int arg0) {
        if (arg0 != 8) {
            return;
        }
        field1541 = null;
        field1540 = null;
        field1538 = null;
        field1543 = null;
        field1544 = null;
        field1539 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)Lka;")
    public static final class131 method532(byte arg0) {
        field1537++;
        if (arg0 != -11) {
            field1541 = null;
        }
        try {
            return (class131) Class.forName("sj").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(IZ)V")
    public static final void method533(int arg0, boolean arg1) {
        field1535++;
        class83.field1454 = arg1;
        if (class83.field1454) {
            int var15 = class32.field512.method1472(0);
            int var16 = class32.field512.method1481(false);
            class32.field512.method666((byte) 54);
            for (int var17 = 0; var17 < 4; var17++) {
                for (int var36 = 0; var36 < 13; var36++) {
                    for (int var37 = 0; var37 < 13; var37++) {
                        int var38 = class32.field512.method660(1, true);
                        if (var38 == 1) {
                            class236.field4098[var17][var36][var37] = class32.field512.method660(26, true);
                        } else {
                            class236.field4098[var17][var36][var37] = -1;
                        }
                    }
                }
            }
            class32.field512.method662(-93);
            int var18 = (class179.field3073 - class32.field512.field3879) / 16;
            class198.field3399 = new int[var18][4];
            for (int var19 = 0; var19 < var18; var19++) {
                for (int var35 = 0; var35 < 4; var35++) {
                    class198.field3399[var19][var35] = class32.field512.method1434(89);
                }
            }
            int var20 = class32.field512.method1472(0);
            int var21 = class32.field512.method1481(false);
            int var22 = class32.field512.method1456(-9944);
            class38.field638 = new byte[var18][];
            class21.field381 = null;
            class167.field2793 = null;
            class199.field3420 = new int[var18];
            class251.field4343 = new byte[var18][];
            class45.field800 = new int[var18];
            class177.field2976 = new int[var18];
            int var23 = 0;
            for (int var24 = 0; var24 < 4; var24++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    for (int var27 = 0; var27 < 13; var27++) {
                        int var28 = class236.field4098[var24][var26][var27];
                        if (var28 != -1) {
                            int var29 = var28 >> 3 & 0x7FF;
                            int var30 = var28 >> 14 & 0x3FF;
                            int var31 = (var30 / 8 << 8) + var29 / 8;
                            for (int var32 = 0; var32 < var23; var32++) {
                                if (class177.field2976[var32] == var31) {
                                    var31 = -1;
                                    break;
                                }
                            }
                            if (var31 != -1) {
                                class177.field2976[var23] = var31;
                                int var33 = var31 >> 8 & 0xFF;
                                int var34 = var31 & 0xFF;
                                class45.field800[var23] = class232.field4042.method869(class76.method445((byte) -101, new class227[] { class53.field927, class204.method1303(var33, 1), class226.field3858, class204.method1303(var34, 1) }), 0);
                                class199.field3420[var23] = class232.field4042.method869(class76.method445((byte) 77, new class227[] { class10.field181, class204.method1303(var33, 1), class226.field3858, class204.method1303(var34, 1) }), 0);
                                var23++;
                            }
                        }
                    }
                }
            }
            class131.method812(var22, false, var21, false, var15, var16, var20);
        } else {
            int var2 = class32.field512.method1456(-9944);
            int var3 = class32.field512.method1481(false);
            int var4 = (class179.field3073 - class32.field512.field3879) / 16;
            class198.field3399 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var14 = 0; var14 < 4; var14++) {
                    class198.field3399[var5][var14] = class32.field512.method1473(false);
                }
            }
            int var6 = class32.field512.method1482(-128);
            boolean var7 = false;
            if (((var3 / 8) == 48 || var3 / 8 == 49) && (var6 / 8) == 48) {
                var7 = true;
            }
            int var8 = class32.field512.method1482(-128);
            if (var3 / 8 == 48 && var6 / 8 == 148) {
                var7 = true;
            }
            int var9 = class32.field512.method1481(false);
            class167.field2793 = null;
            class251.field4343 = new byte[var4][];
            class177.field2976 = new int[var4];
            class45.field800 = new int[var4];
            class199.field3420 = new int[var4];
            class21.field381 = null;
            class38.field638 = new byte[var4][];
            int var10 = 0;
            for (int var11 = (var3 - 6) / 8; var11 <= ((var3 + 6) / 8); var11++) {
                for (int var12 = (var6 - 6) / 8; var12 <= ((var6 + 6) / 8); var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (var7 && var12 == 49 || var12 == 149 || var12 == 147 || var11 == 50 || !(var11 != 49 || var12 != 47)) {
                        class177.field2976[var10] = var13;
                        class45.field800[var10] = -1;
                        class199.field3420[var10] = -1;
                    } else {
                        class177.field2976[var10] = var13;
                        class45.field800[var10] = class232.field4042.method869(class76.method445((byte) -96, new class227[] { class53.field927, class204.method1303(var11, 1), class226.field3858, class204.method1303(var12, 1) }), 0);
                        class199.field3420[var10] = class232.field4042.method869(class76.method445((byte) -97, new class227[] { class10.field181, class204.method1303(var11, 1), class226.field3858, class204.method1303(var12, 1) }), 0);
                    }
                    var10++;
                }
            }
            class131.method812(var2, false, var6, false, var3, var9, var8);
        }
        int var25 = 27 % ((-arg0 - 12) / 38);
    }
}
