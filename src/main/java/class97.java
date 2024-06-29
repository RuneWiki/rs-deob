import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class97 {

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "I")
    public static int field1337 = 0;

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "Luf;")
    public static class310 field1338 = new class310(13, -1);

    @OriginalMember(owner = "client!ct", name = "h", descriptor = "F")
    public static float field1344;

    @OriginalMember(owner = "client!ct", name = "e", descriptor = "I")
    private int field1341;

    @OriginalMember(owner = "client!ct", name = "g", descriptor = "I")
    public int field1343;

    @OriginalMember(owner = "client!ct", name = "i", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!ct", name = "j", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!ct", name = "k", descriptor = "I")
    public int field1347;

    @OriginalMember(owner = "client!ct", name = "l", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!ct", name = "m", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!ct", name = "n", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!ct", name = "f", descriptor = "Lhm;")
    public class146 field1342;

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "Lvh;")
    public static class240 field1340;

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "Lie;")
    public static class6 field1339;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "()V")
    public static final void method655() {
        for (int var0 = 0; var0 < class451.field6505; var0++) {
            class33 var1 = class26.field406[var0];
            class329.method1831(var1);
            class26.field406[var0] = null;
        }
        class451.field6505 = 0;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIIII)V")
    public static final void method656(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1346++;
        if (arg2 != 1) {
            method655();
        }
        for (class129 var5 = (class129) class184.field2573.method3072((byte) 52); var5 != null; var5 = (class129) class184.field2573.method3066(2)) {
            class383.method2201(arg1, 22001, arg3, arg4, var5, arg0);
        }
        for (class129 var6 = (class129) class20.field217.method3072((byte) 110); var6 != null; var6 = (class129) class20.field217.method3066(arg2 ^ 0x3)) {
            byte var11 = 1;
            class21 var12 = var6.field1777.method165((byte) -103);
            if (var6.field1777.field317) {
                var11 = 0;
            } else if (var6.field1777.field328 == var12.field257 || var6.field1777.field328 == var12.field236 || var6.field1777.field328 == var12.field232 || var6.field1777.field328 == var12.field260) {
                var11 = 2;
            } else if (var6.field1777.field328 == var12.field259 || var6.field1777.field328 == var12.field263 || var6.field1777.field328 == var12.field225 || var6.field1777.field328 == var12.field222) {
                var11 = 3;
            }
            if (var6.field1778 != var11) {
                int var13 = class86.method602(arg2 - 2, var6.field1777);
                if (var6.field1767 != var13) {
                    if (var6.field1766 != null) {
                        class189.field2623.method942(var6.field1766);
                        var6.field1766 = null;
                    }
                    var6.field1767 = var13;
                }
                var6.field1778 = var11;
            }
            var6.field1768 = var6.field1777.field466;
            var6.field1780 = var6.field1777.field466 + (var6.field1777.method167(-1) << 6);
            var6.field1769 = var6.field1777.field461;
            var6.field1775 = var6.field1777.field461 + (var6.field1777.method167(arg2 - 2) << 6);
            class383.method2201(arg1, arg2 ^ 0x55F0, arg3, arg4, var6, arg0);
        }
        for (class129 var7 = (class129) class453.field6620.method981(0); var7 != null; var7 = (class129) class453.field6620.method989(arg2 - 1)) {
            byte var8 = 1;
            class21 var9 = var7.field1781.method165((byte) -128);
            if (var7.field1781.field317) {
                var8 = 0;
            } else if (var7.field1781.field328 == var9.field257 || var7.field1781.field328 == var9.field236 || var7.field1781.field328 == var9.field232 || var7.field1781.field328 == var9.field260) {
                var8 = 2;
            } else if (var7.field1781.field328 == var9.field259 || var7.field1781.field328 == var9.field263 || var7.field1781.field328 == var9.field225 || var7.field1781.field328 == var9.field222) {
                var8 = 3;
            }
            if (var7.field1778 != var8) {
                int var10 = class433.method2582(var7.field1781, 3);
                if (var7.field1767 != var10) {
                    if (var7.field1766 != null) {
                        class189.field2623.method942(var7.field1766);
                        var7.field1766 = null;
                    }
                    var7.field1767 = var10;
                }
                var7.field1778 = var8;
            }
            var7.field1768 = var7.field1781.field466;
            var7.field1780 = var7.field1781.field466 + (var7.field1781.method167(-1) << 6);
            var7.field1769 = var7.field1781.field461;
            var7.field1775 = var7.field1781.field461 + (var7.field1781.method167(-1) << 6);
            class383.method2201(arg1, arg2 + 22000, arg3, arg4, var7, arg0);
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)V")
    public static void method657(int arg0) {
        field1339 = null;
        field1340 = null;
        field1338 = null;
        if (arg0 != -1) {
            method656(-59, -2, -72, -22, 14);
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(ILlh;I)V")
    private final void method658(int arg0, class365 arg1, int arg2) {
        if (arg2 == 1) {
            this.field1341 = arg1.method2062((byte) 14);
        } else if (arg2 == 2) {
            this.field1343 = arg1.method2099(255);
            this.field1347 = arg1.method2099(255);
        }
        field1345++;
        if (arg0 != 2) {
            field1337 = 106;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Z)Lmp;")
    public final synchronized class531 method659(boolean arg0) {
        field1348++;
        class531 var2 = (class531) this.field1342.field2085.method56((long) this.field1341, 94);
        if (!arg0) {
            this.method660(null, (byte) 37);
        }
        if (var2 != null) {
            return var2;
        }
        class531 var3 = class531.method3134(this.field1342.field2082, this.field1341, 0);
        if (var3 != null) {
            this.field1342.field2085.method73((long) this.field1341, var3, 26425);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Llh;B)V")
    public final void method660(class365 arg0, byte arg1) {
        field1350++;
        if (arg1 != 91) {
            this.method659(true);
        }
        while (true) {
            int var3 = arg0.method2099(255);
            if (var3 == 0) {
                return;
            }
            this.method658(2, arg0, var3);
        }
    }
}
