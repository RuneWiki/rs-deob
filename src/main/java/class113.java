import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class113 extends class16 implements class143 {

    @OriginalMember(owner = "client!sa", name = "E", descriptor = "Z")
    private boolean field1450;

    @OriginalMember(owner = "client!sa", name = "T", descriptor = "B")
    private byte field1464;

    @OriginalMember(owner = "client!sa", name = "G", descriptor = "Z")
    private boolean field1452;

    @OriginalMember(owner = "client!sa", name = "P", descriptor = "B")
    private byte field1460;

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "Z")
    private boolean field1461;

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "S")
    private short field1442;

    @OriginalMember(owner = "client!sa", name = "U", descriptor = "Z")
    private boolean field1465;

    @OriginalMember(owner = "client!sa", name = "N", descriptor = "Lni;")
    private class305 field1458;

    @OriginalMember(owner = "client!sa", name = "V", descriptor = "Lo;")
    private class21 field1466;

    @OriginalMember(owner = "client!sa", name = "D", descriptor = "[B")
    public static byte[] field1449 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!sa", name = "M", descriptor = "Lcl;")
    public static class145 field1457 = new class145();

    @OriginalMember(owner = "client!sa", name = "Y", descriptor = "[[[I")
    public static int[][][] field1469 = new int[2][][];

    @OriginalMember(owner = "client!sa", name = "Z", descriptor = "Ljava/lang/String;")
    public static String field1470 = null;

    @OriginalMember(owner = "client!sa", name = "W", descriptor = "Lpm;")
    public static class349 field1467 = new class349("Cancel", "Abbrechen", "Annuler", "Cancelar");

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!sa", name = "x", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!sa", name = "y", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!sa", name = "A", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!sa", name = "B", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!sa", name = "C", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!sa", name = "F", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!sa", name = "H", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!sa", name = "J", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!sa", name = "K", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!sa", name = "L", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!sa", name = "O", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!sa", name = "R", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!sa", name = "S", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!sa", name = "X", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lvq;I)V", line = 3)
    public final void method604(class269 arg0, int arg1) {
        int var3 = -89 % ((arg1 - 87) / 34);
        ++field1455;
        Object var4 = null;
        class21 var6;
        if (this.field1466 == null && this.field1465) {
            class266 var5 = this.method680(arg0, 131072, 22, true);
            var6 = var5 == null ? null : var5.field3904;
        } else {
            var6 = this.field1466;
            this.field1466 = null;
        }
        if (var6 != null) {
            class428.method2669(var6, this.field1464, super.field241, super.field240, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lvq;ZLkm;IIBI)V", line = 32)
    public final void method611(class269 arg0, boolean arg1, class198 arg2, int arg3, int arg4, byte arg5, int arg6) {
        if (arg2 instanceof class113) {
            class113 var8 = (class113) arg2;
            if (this.field1458 != null && var8.field1458 != null) {
                this.field1458.method232(var8.field1458, arg4, arg6, arg3, arg1);
            }
        }
        ++field1448;
        int var9 = 3 / ((12 - arg5) / 40);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IILvq;)Lni;", line = 51)
    public final class305 method614(int arg0, int arg1, class269 arg2) {
        if (arg0 >= -19) {
            method684(-109, 26, -58);
        }
        ++field1441;
        return this.method683(arg2, arg1, false);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)I", line = 62)
    public final int method602(byte arg0) {
        if (arg0 > -33) {
            return 3;
        } else {
            ++field1468;
            return 22;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)Z", line = 78)
    public final boolean method608(boolean arg0) {
        if (arg0) {
            this.field1458 = null;
        }
        ++field1463;
        return this.field1465;
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)V", line = 90)
    public final void method613(byte arg0) {
        this.field1452 = false;
        ++field1447;
        if (this.field1458 != null) {
            this.field1458.method233(-32769 & this.field1458.method247());
        }
        if (arg0 >= -56) {
            this.field1452 = true;
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)I", line = 104)
    public final int method599(int arg0) {
        ++field1445;
        if (arg0 != -10450) {
            this.field1460 = -34;
        }
        return 65535 & this.field1442;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lvq;IIZ)Lsl;", line = 118)
    private final class266 method680(class269 arg0, int arg1, int arg2, boolean arg3) {
        ++field1443;
        if (arg2 != 22) {
            field1457 = null;
        }
        class282 var5 = class398.method2496(-118, this.field1442 & 65535);
        class92 var6;
        class92 var7;
        if (this.field1461) {
            var6 = class241.field3567[this.field1464];
            var7 = class126.field1734[0];
        } else {
            var6 = class126.field1734[this.field1464];
            if (this.field1464 >= 3) {
                var7 = null;
            } else {
                var7 = class126.field1734[this.field1464 - -1];
            }
        }
        return var5.method1936(-14268, arg1, super.field240, var6, this.field1460, 22, super.field241, arg0, arg3, var7, super.field244);
    }

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "(I)V", line = 153)
    public static void method681(int arg0) {
        field1469 = null;
        field1470 = null;
        if (arg0 != -1) {
            field1457 = null;
        }
        field1467 = null;
        field1449 = null;
        field1457 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZZLjava/lang/Object;)[B", line = 167)
    public static final byte[] method682(boolean arg0, boolean arg1, Object arg2) {
        ++field1456;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return !arg0 ? var3 : class229.method1593(var3, (byte) -28);
        } else if (arg2 instanceof class119) {
            class119 var4 = (class119) arg2;
            return var4.method480((byte) 114);
        } else {
            if (!arg1) {
                method681(69);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(B)I", line = 202)
    public final int method603(byte arg0) {
        if (arg0 != -62) {
            this.field1452 = false;
        }
        ++field1454;
        return this.field1460;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILvq;)V", line = 214)
    public final void method605(int arg0, class269 arg1) {
        ++field1451;
        Object var3 = null;
        if (arg0 == 29929) {
            class21 var5;
            if (this.field1466 == null && this.field1465) {
                class266 var4 = this.method680(arg1, 131072, 22, true);
                var5 = var4 != null ? var4.field3904 : null;
            } else {
                var5 = this.field1466;
                this.field1466 = null;
            }
            if (var5 != null) {
                class129.method793(var5, this.field1464, super.field241, super.field240, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lvq;Lbi;IIIIZIZ)V", line = 241)
    public class113(class269 arg0, class282 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field4069, arg1.field4055);
        this.field1450 = arg1.field4036 != 0 && !arg6;
        super.field240 = (short) arg5;
        this.field1464 = (byte) arg2;
        this.field1452 = arg8;
        this.field1460 = (byte) arg7;
        this.field1461 = arg6;
        super.field241 = (short) arg3;
        this.field1442 = (short) arg1.field4094;
        this.field1465 = arg0.method891() && arg1.field4107 && !this.field1461 && ~class194.field2802 != -1;
        int var10 = 1024;
        if (this.field1452) {
            var10 |= 32768;
        }
        class266 var11 = this.method680(arg0, var10, 22, this.field1465);
        if (var11 != null) {
            this.field1458 = var11.field3906;
            this.field1466 = var11.field3904;
            if (this.field1452) {
                this.field1458 = this.field1458.method200((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lvq;B)V", line = 275)
    public final void method22(class269 arg0, byte arg1) {
        if (arg1 >= 11) {
            ++field1462;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLvq;)Lbf;", line = 285)
    public final class316 method15(byte arg0, class269 arg1) {
        ++field1444;
        if (this.field1458 == null) {
            return null;
        } else {
            class154 var3 = arg1.method884();
            var3.method1133(super.field241, super.field244, super.field240);
            class316 var4 = null;
            if (this.field1450) {
                var4 = class105.method616(-15465, 1);
            }
            int var5 = 43 % ((-8 - arg0) / 51);
            this.field1458.method230(var3, var4 == null ? null : var4.field4631[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "(I)Z", line = 310)
    public final boolean method610(int arg0) {
        ++field1440;
        if (arg0 != -439) {
            this.field1464 = -41;
        }
        return this.field1452;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lvq;IZ)Lni;", line = 321)
    private final class305 method683(class269 arg0, int arg1, boolean arg2) {
        ++field1453;
        if (this.field1458 != null && arg0.method944(this.field1458.method247(), arg1) == 0) {
            return this.field1458;
        } else {
            class266 var4 = this.method680(arg0, arg1, 22, arg2);
            return var4 == null ? null : var4.field3906;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V", line = 338)
    public final void method600(int arg0) {
        if (this.field1458 != null) {
            this.field1458.method204();
        }
        if (arg0 > -62) {
            this.method611((class269) null, true, (class198) null, 38, 32, (byte) 64, -26);
        }
        ++field1446;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)Ljl;", line = 364)
    public static final class147 method684(int arg0, int arg1, int arg2) {
        class74 var3 = class385.field5449[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class147 var4 = var3.field968;
            var3.field968 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lvq;IIB)Z", line = 375)
    public final boolean method16(class269 arg0, int arg1, int arg2, byte arg3) {
        ++field1459;
        class305 var5 = this.method683(arg0, 65536, false);
        if (var5 != null) {
            class154 var6 = arg0.method884();
            var6.method1133(super.field241, super.field244, super.field240);
            return var5.method209(arg1, arg2, var6, false);
        } else {
            int var7 = -1 / ((19 - arg3) / 45);
            return false;
        }
    }
}
