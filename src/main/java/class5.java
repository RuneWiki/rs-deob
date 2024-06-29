import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class5 {

    @OriginalMember(owner = "client!lq", name = "h", descriptor = "Lui;")
    private class426 field57 = new class426();

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "I")
    public static int field56 = -1;

    @OriginalMember(owner = "client!lq", name = "l", descriptor = "Lnn;")
    public static class151 field61 = new class151("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

    @OriginalMember(owner = "client!lq", name = "n", descriptor = "I")
    public static int field63 = -1;

    @OriginalMember(owner = "client!lq", name = "m", descriptor = "I")
    public static int field62 = 0;

    @OriginalMember(owner = "client!lq", name = "o", descriptor = "I")
    public static int field64 = 0;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!lq", name = "i", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!lq", name = "k", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!lq", name = "j", descriptor = "Lui;")
    private class426 field59;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lui;I)V")
    public final void method40(class426 arg0, int arg1) {
        field51++;
        if (arg1 != 17478) {
            field64 = 64;
        }
        if (arg0.field6257 != null) {
            arg0.method2627(0);
        }
        arg0.field6251 = this.field57;
        arg0.field6257 = this.field57.field6257;
        arg0.field6257.field6251 = arg0;
        arg0.field6251.field6257 = arg0;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(B)V")
    public static void method41(byte arg0) {
        field61 = null;
        if (arg0 > -124) {
            field64 = 41;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Z)Lui;")
    public final class426 method42(boolean arg0) {
        field55++;
        if (!arg0) {
            return null;
        }
        class426 var2 = this.field57.field6251;
        if (this.field57 == var2) {
            this.field59 = null;
            return null;
        } else {
            this.field59 = var2.field6251;
            return var2;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)Lui;")
    public final class426 method43(int arg0) {
        field60++;
        if (arg0 != 9) {
            return null;
        }
        class426 var2 = this.field59;
        if (this.field57 == var2) {
            this.field59 = null;
            return null;
        } else {
            this.field59 = var2.field6251;
            return var2;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(ILek;IIIIIZIII)Z")
    public static final boolean method44(int arg0, class375 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        field50++;
        int var11 = arg5;
        int var12 = arg4;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg5 - var13;
        class449.field6612[var13][var14] = 99;
        int var16 = arg4 - var14;
        class150.field2072[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class451.field6659[var17] = arg5;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class107.field1429[var10001] = arg4;
        int[][] var19 = arg1.field5455;
        while (var26 != var18) {
            var11 = class451.field6659[var18];
            var12 = class107.field1429[var18];
            var18 = var18 + 1 & 0xFFF;
            int var20 = var11 - var15;
            int var21 = var12 - var16;
            int var22 = var11 - arg1.field5452;
            int var23 = var12 - arg1.field5456;
            if (arg6 == -4) {
                if (arg0 == var11 && arg2 == var12) {
                    class191.field2846 = var11;
                    class399.field5956 = var12;
                    return true;
                }
            } else if (arg6 == -3) {
                if (class71.method474(128, arg3, var12, 2, arg2, 2, var11, arg0, arg9)) {
                    class399.field5956 = var12;
                    class191.field2846 = var11;
                    return true;
                }
            } else if (arg6 == -2) {
                if (arg1.method2251(arg3, arg9, 2, 2, arg10, var12, var11, arg0, -29128, arg2)) {
                    class191.field2846 = var11;
                    class399.field5956 = var12;
                    return true;
                }
            } else if (arg6 == -1) {
                if (arg1.method2246(arg0, var12, (byte) 66, arg3, var11, arg10, 2, arg2, arg9)) {
                    class399.field5956 = var12;
                    class191.field2846 = var11;
                    return true;
                }
            } else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
                if (arg1.method2254(110, arg8, arg0, arg6, 2, var12, var11, arg2)) {
                    class191.field2846 = var11;
                    class399.field5956 = var12;
                    return true;
                }
            } else if (arg1.method2259(arg2, arg6, arg8, arg0, 2, var11, 0, var12)) {
                class399.field5956 = var12;
                class191.field2846 = var11;
                return true;
            }
            int var25 = class150.field2072[var20][var21] + 1;
            if (var20 > 0 && class449.field6612[var20 - 1][var21] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class451.field6659[var26] = var11 - 1;
                class107.field1429[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class449.field6612[var20 - 1][var21] = 2;
                class150.field2072[var20 - 1][var21] = var25;
            }
            if (var20 < 126 && class449.field6612[var20 + 1][var21] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class451.field6659[var26] = var11 + 1;
                class107.field1429[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class449.field6612[var20 + 1][var21] = 8;
                class150.field2072[var20 + 1][var21] = var25;
            }
            if (var21 > 0 && class449.field6612[var20][var21 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class451.field6659[var26] = var11;
                class107.field1429[var26] = var12 - 1;
                class449.field6612[var20][var21 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class150.field2072[var20][var21 - 1] = var25;
            }
            if (var21 < 126 && class449.field6612[var20][var21 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class451.field6659[var26] = var11;
                class107.field1429[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class449.field6612[var20][var21 + 1] = 4;
                class150.field2072[var20][var21 + 1] = var25;
            }
            if (var20 > 0 && var21 > 0 && class449.field6612[var20 - 1][var21 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class451.field6659[var26] = var11 - 1;
                class107.field1429[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class449.field6612[var20 - 1][var21 - 1] = 3;
                class150.field2072[var20 - 1][var21 - 1] = var25;
            }
            if (var20 < 126 && var21 > 0 && class449.field6612[var20 + 1][var21 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class451.field6659[var26] = var11 + 1;
                class107.field1429[var26] = var12 - 1;
                class449.field6612[var20 + 1][var21 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class150.field2072[var20 + 1][var21 - 1] = var25;
            }
            if (var20 > 0 && var21 < 126 && class449.field6612[var20 - 1][var21 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class451.field6659[var26] = var11 - 1;
                class107.field1429[var26] = var12 + 1;
                class449.field6612[var20 - 1][var21 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class150.field2072[var20 - 1][var21 + 1] = var25;
            }
            if (var20 < 126 && var21 < 126 && class449.field6612[var20 + 1][var21 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class451.field6659[var26] = var11 + 1;
                class107.field1429[var26] = var12 + 1;
                class449.field6612[var20 + 1][var21 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class150.field2072[var20 + 1][var21 + 1] = var25;
            }
        }
        if (arg7) {
            method46((byte) -72);
        }
        class399.field5956 = var12;
        class191.field2846 = var11;
        return false;
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)V")
    public final void method45(int arg0) {
        while (true) {
            class426 var2 = this.field57.field6251;
            if (this.field57 == var2) {
                if (arg0 != 12) {
                    this.field57 = null;
                }
                field58++;
                this.field59 = null;
                return;
            }
            var2.method2627(arg0 - 12);
        }
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(B)V")
    public static final void method46(byte arg0) {
        field53++;
        class235 var1 = null;
        try {
            class211 var2 = class79.field1043.method1453(19204);
            if (arg0 != -120) {
                field62 = 2;
            }
            while (var2.field3172 == 0) {
                class109.method674((byte) 99, 1L);
            }
            if (var2.field3172 == 1) {
                var1 = (class235) var2.field3175;
                class385 var3 = new class385((class425.field6242 * 6) + 3);
                var3.method2366(1, true);
                var3.method2377(class425.field6242, -45);
                for (int var4 = 0; var4 < class413.field6135.length; var4++) {
                    if (class14.field174[var4]) {
                        var3.method2377(var4, -35);
                        var3.method2381(class413.field6135[var4], arg0 + 120);
                    }
                }
                var1.method1417(var3.field5666, var3.field5685, 0, false);
            }
        } catch (Exception var6) {
        }
        try {
            if (var1 != null) {
                var1.method1420((byte) 73);
            }
        } catch (Exception var5) {
        }
        class250.field3749 = class445.method2750(-27580);
        class26.field346 = false;
    }

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "(I)Lui;")
    public final class426 method47(int arg0) {
        field52++;
        class426 var2 = this.field57.field6251;
        if (this.field57 == var2) {
            return null;
        } else {
            var2.method2627(arg0 ^ arg0);
            return var2;
        }
    }

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "(I)I")
    public final int method48(int arg0) {
        field54++;
        int var2 = 0;
        for (class426 var3 = this.field57.field6251; var3 != this.field57; var3 = var3.field6251) {
            var2++;
        }
        return arg0 > -84 ? 89 : var2;
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "()V")
    public class5() {
        this.field57.field6251 = this.field57;
        this.field57.field6257 = this.field57;
    }
}
