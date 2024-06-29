import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class75 extends class7 {

    @OriginalMember(owner = "client!te", name = "x", descriptor = "Lka;")
    public class243 field1464 = new class243();

    @OriginalMember(owner = "client!te", name = "I", descriptor = "Lvh;")
    public class260 field1475 = new class260();

    @OriginalMember(owner = "client!te", name = "D", descriptor = "Ljf;")
    private class62 field1470;

    @OriginalMember(owner = "client!te", name = "C", descriptor = "Lta;")
    public static class241 field1469 = new class241(64);

    @OriginalMember(owner = "client!te", name = "G", descriptor = "Lhj;")
    public static class69 field1473 = class181.method1318("Texturen geladen)3", (byte) -121);

    @OriginalMember(owner = "client!te", name = "H", descriptor = "I")
    public static int field1474 = 0;

    @OriginalMember(owner = "client!te", name = "J", descriptor = "[S")
    public static short[] field1476 = new short[] { 50, 16, 38, 8, 46, 26, 35, 24 };

    @OriginalMember(owner = "client!te", name = "v", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!te", name = "w", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!te", name = "y", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!te", name = "z", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!te", name = "A", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!te", name = "B", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!te", name = "E", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!te", name = "F", descriptor = "Lqb;")
    public static class56 field1472;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "()I")
    public final int method35() {
        field1463++;
        return 0;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(Z)V")
    public static void method544(boolean arg0) {
        field1472 = null;
        if (arg0) {
            field1469 = null;
        }
        field1476 = null;
        field1473 = null;
        field1469 = null;
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(I)V")
    public final void method31(int arg0) {
        this.field1475.method31(arg0);
        field1465++;
        for (class147 var2 = (class147) this.field1464.method1724(255); var2 != null; var2 = (class147) this.field1464.method1726(125)) {
            if (!this.field1470.method376(var2, 0)) {
                int var3 = arg0;
                do {
                    if (var2.field2728 >= var3) {
                        this.method545(28, var3, var2);
                        var2.field2728 -= var3;
                        break;
                    }
                    this.method545(-123, var2.field2728, var2);
                    var3 -= var2.field2728;
                } while (!this.field1470.method391((int[]) null, 0, -31184, var2, var3));
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "()Lbh;")
    public final class7 method33() {
        class147 var1 = (class147) this.field1464.method1724(255);
        field1466++;
        if (var1 == null) {
            return null;
        } else if (var1.field2725 == null) {
            return this.method34();
        } else {
            return var1.field2725;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IILqa;)V")
    private final void method545(int arg0, int arg1, class147 arg2) {
        field1462++;
        if ((this.field1470.field1180[arg2.field2729] & 0x4) != 0 && arg2.field2718 < 0) {
            int var4 = this.field1470.field1153[arg2.field2729] / class133.field2473;
            int var5 = (var4 + 1048575 - arg2.field2726) / var4;
            arg2.field2726 = arg1 * var4 + arg2.field2726 & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field1470.field1129[arg2.field2729] == 0) {
                    arg2.field2725 = class137.method1055(arg2.field2736, arg2.field2725.method1061(), arg2.field2725.method1029(), arg2.field2725.method1027());
                } else {
                    arg2.field2725 = class137.method1055(arg2.field2736, arg2.field2725.method1061(), 0, arg2.field2725.method1027());
                    this.field1470.method404(arg2.field2738.field4305[arg2.field2714] < 0, false, arg2);
                }
                if (arg2.field2738.field4305[arg2.field2714] < 0) {
                    arg2.field2725.method1062(-1);
                }
                arg1 = arg2.field2726 / var4;
            }
        }
        arg2.field2725.method31(arg1);
        int var6 = 38 % ((-arg0 - 40) / 50);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IILqa;[III)V")
    private final void method546(int arg0, int arg1, class147 arg2, int[] arg3, int arg4, int arg5) {
        if ((this.field1470.field1180[arg2.field2729] & 0x4) != 0 && arg2.field2718 < 0) {
            int var7 = this.field1470.field1153[arg2.field2729] / class133.field2473;
            while (true) {
                int var8 = (var7 + 1048575 - arg2.field2726) / var7;
                if (var8 > arg4) {
                    arg2.field2726 += arg4 * var7;
                    break;
                }
                int var9 = 262144 / var7;
                arg2.field2725.method32(arg3, arg0, var8);
                arg2.field2726 += var7 * var8 - 1048576;
                class137 var10 = arg2.field2725;
                arg0 += var8;
                int var11 = class133.field2473 / 100;
                if (var9 < var11) {
                    var11 = var9;
                }
                arg4 -= var8;
                if (this.field1470.field1129[arg2.field2729] == 0) {
                    arg2.field2725 = class137.method1055(arg2.field2736, var10.method1061(), var10.method1029(), var10.method1027());
                } else {
                    arg2.field2725 = class137.method1055(arg2.field2736, var10.method1061(), 0, var10.method1027());
                    this.field1470.method404(arg2.field2738.field4305[arg2.field2714] < 0, false, arg2);
                    arg2.field2725.method1035(var11, var10.method1029());
                }
                if (arg2.field2738.field4305[arg2.field2714] < 0) {
                    arg2.field2725.method1062(-1);
                }
                var10.method1037(var11);
                var10.method32(arg3, arg0, arg5 - arg0);
                if (var10.method1059()) {
                    this.field1475.method1787(var10);
                }
            }
        }
        arg2.field2725.method32(arg3, arg0, arg4);
        if (arg1 != -15092) {
            field1472 = null;
        }
        field1468++;
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "()Lbh;")
    public final class7 method34() {
        field1467++;
        class147 var1;
        do {
            var1 = (class147) this.field1464.method1726(103);
            if (var1 == null) {
                return null;
            }
        } while (var1.field2725 == null);
        return var1.field2725;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "([III)V")
    public final void method32(int[] arg0, int arg1, int arg2) {
        field1471++;
        this.field1475.method32(arg0, arg1, arg2);
        for (class147 var4 = (class147) this.field1464.method1724(255); var4 != null; var4 = (class147) this.field1464.method1726(102)) {
            if (!this.field1470.method376(var4, 0)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field2728) {
                        this.method546(var6, -15092, var4, arg0, var5, var6 + var5);
                        var4.field2728 -= var5;
                        break;
                    }
                    this.method546(var6, -15092, var4, arg0, var4.field2728, var5 + var6);
                    var6 += var4.field2728;
                    var5 -= var4.field2728;
                } while (!this.field1470.method391(arg0, var6, -31184, var4, var5));
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Ljf;)V")
    public class75(class62 arg0) {
        this.field1470 = arg0;
    }
}
