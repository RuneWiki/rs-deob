import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class81 extends class220 {

    @OriginalMember(owner = "client!jk", name = "N", descriptor = "Lmh;")
    private static class128 field1453 = class22.method156(127, "Close");

    @OriginalMember(owner = "client!jk", name = "O", descriptor = "Lmh;")
    public static class128 field1454 = class22.method156(126, "::fpsoff");

    @OriginalMember(owner = "client!jk", name = "I", descriptor = "Lmh;")
    public static class128 field1448 = field1453;

    @OriginalMember(owner = "client!jk", name = "Q", descriptor = "Lmh;")
    private static class128 field1456 = class22.method156(124, "Loading world list data");

    @OriginalMember(owner = "client!jk", name = "W", descriptor = "Lmh;")
    public static class128 field1461 = field1456;

    @OriginalMember(owner = "client!jk", name = "E", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!jk", name = "G", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!jk", name = "H", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!jk", name = "K", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!jk", name = "L", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!jk", name = "M", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!jk", name = "S", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!jk", name = "V", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!jk", name = "X", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!jk", name = "R", descriptor = "Lem;")
    public static class10 field1457;

    @OriginalMember(owner = "client!jk", name = "J", descriptor = "Lmh;")
    public class128 field1449;

    @OriginalMember(owner = "client!jk", name = "F", descriptor = "[I")
    public int[] field1445;

    @OriginalMember(owner = "client!jk", name = "P", descriptor = "[I")
    public int[] field1455;

    @OriginalMember(owner = "client!jk", name = "U", descriptor = "[I")
    public int[] field1459;

    @OriginalMember(owner = "client!jk", name = "Y", descriptor = "[I")
    public int[] field1463;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(B)V", line = 8)
    public final void method511(byte arg0) {
        if (this.field1455 != null) {
            for (int var2 = 0; var2 < this.field1455.length; var2++) {
                this.field1455[var2] = class279.method1951(this.field1455[var2], 32768);
            }
        }
        field1444++;
        if (this.field1445 != null) {
            for (int var3 = 0; var3 < this.field1445.length; var3++) {
                this.field1445[var3] = class279.method1951(this.field1445[var3], 32768);
            }
        }
        int var4 = 32 % ((-arg0) / 43);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lbg;B)V", line = 36)
    public final void method512(class194 arg0, byte arg1) {
        if (arg1 < 111) {
            this.field1449 = (class128) null;
        }
        field1451++;
        while (true) {
            int var3 = arg0.method1325(7627);
            if (var3 == 0) {
                return;
            }
            this.method514(var3, arg0, false);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)I", line = 61)
    public final int method513(int arg0, int arg1) {
        if (arg0 != 2) {
            method516(98, -78, 52, 107, -8, -37, 54, 28, 103);
        }
        field1460++;
        if (this.field1445 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field1445.length; var3++) {
            if (this.field1463[var3] == arg1) {
                return this.field1445[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILbg;Z)V", line = 88)
    private final void method514(int arg0, class194 arg1, boolean arg2) {
        if (arg2) {
            return;
        }
        if (arg0 == 1) {
            this.field1449 = arg1.method1319(1);
        } else if (arg0 == 2) {
            int var7 = arg1.method1325(7627);
            this.field1445 = new int[var7];
            this.field1463 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1445[var8] = arg1.method1308(-23);
                int var9 = arg1.method1325(7627);
                if (var9 == 0) {
                    this.field1463[var8] = -1;
                } else {
                    this.field1463[var8] = var9;
                }
            }
        } else if (arg0 == 3) {
            int var4 = arg1.method1325(7627);
            this.field1459 = new int[var4];
            this.field1455 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1455[var5] = arg1.method1308(-100);
                int var6 = arg1.method1325(7627);
                if (var6 == 0) {
                    this.field1459[var5] = -1;
                } else {
                    this.field1459[var5] = var6;
                }
            }
        } else if (arg0 != 4) {
        }
        field1462++;
    }

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "(B)V", line = 160)
    public static void method515(byte arg0) {
        field1461 = null;
        field1457 = null;
        field1456 = null;
        field1448 = null;
        field1453 = null;
        int var1 = 87 % ((-arg0 - 53) / 60);
        field1454 = null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIIIIIII)V", line = 176)
    public static final void method516(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1452++;
        int var9 = arg1 - arg7;
        int var10 = arg3 - arg4;
        int var11 = (arg6 - arg0 << 16) / var10;
        if (arg2 != -1) {
            method517((class314) null, (byte) -80, (class314) null, (class314) null, (class314) null);
        }
        int var12 = (arg8 - arg5 << 16) / var9;
        class223.method1536(arg1, (byte) 47, var11, arg5, arg0, 0, var12, 0, arg3, arg4, arg7);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Ldj;BLdj;Ldj;Ldj;)V", line = 202)
    public static final void method517(class314 arg0, byte arg1, class314 arg2, class314 arg3, class314 arg4) {
        if (arg1 <= 2) {
            return;
        }
        class264.field4569 = arg0;
        class161.field2751 = arg4;
        field1450++;
        class194.field3357 = arg2;
        class116.field1957 = arg3;
        class200.field3508 = new class10[class194.field3357.method2152((byte) -110)][];
        class9.field201 = new boolean[class194.field3357.method2152((byte) -124)];
    }

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "(I)V", line = 225)
    public static final void method518(int arg0) {
        field1447++;
        class71.field1320.method570(56, arg0 - 1);
        class71.field1320.method1352(7528, class166.method1089(arg0 ^ 0x2));
        class71.field1320.method1324(class199.field3465, 15803);
        if (arg0 != 0) {
            field1457 = (class10) null;
        }
        class249.field4307++;
        class71.field1320.method1324(class16.field420, arg0 ^ 0x3DBB);
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(II)I", line = 250)
    public final int method519(int arg0, int arg1) {
        field1446++;
        if (arg0 >= -86) {
            field1457 = (class10) null;
        }
        if (this.field1455 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field1455.length; var3++) {
            if (this.field1459[var3] == arg1) {
                return this.field1455[var3];
            }
        }
        return -1;
    }
}
