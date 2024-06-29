import java.io.IOException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class116 {

    @OriginalMember(owner = "client!qv", name = "p", descriptor = "Lut;")
    private class719 field1534 = new class719();

    @OriginalMember(owner = "client!qv", name = "u", descriptor = "Lut;")
    private class719 field1539 = new class719();

    @OriginalMember(owner = "client!qv", name = "w", descriptor = "Lut;")
    private class719 field1541 = new class719();

    @OriginalMember(owner = "client!qv", name = "y", descriptor = "Lut;")
    private class719 field1543 = new class719();

    @OriginalMember(owner = "client!qv", name = "A", descriptor = "Lmc;")
    private class234 field1545 = new class234(4);

    @OriginalMember(owner = "client!qv", name = "D", descriptor = "I")
    public volatile int field1548 = 0;

    @OriginalMember(owner = "client!qv", name = "E", descriptor = "B")
    private byte field1549 = 0;

    @OriginalMember(owner = "client!qv", name = "F", descriptor = "I")
    public volatile int field1550 = 0;

    @OriginalMember(owner = "client!qv", name = "G", descriptor = "Lmc;")
    private class234 field1551 = new class234(8);

    @OriginalMember(owner = "client!qv", name = "o", descriptor = "Lrn;")
    public static class633 field1533 = new class633(77, -1);

    @OriginalMember(owner = "client!qv", name = "r", descriptor = "Luw;")
    public static class208 field1536 = new class208(117, -1);

    @OriginalMember(owner = "client!qv", name = "v", descriptor = "Luw;")
    public static class208 field1540 = new class208(52, 3);

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!qv", name = "d", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!qv", name = "e", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!qv", name = "f", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!qv", name = "g", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!qv", name = "h", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!qv", name = "i", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!qv", name = "j", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!qv", name = "k", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!qv", name = "l", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!qv", name = "m", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!qv", name = "n", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!qv", name = "q", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!qv", name = "s", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!qv", name = "t", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!qv", name = "C", descriptor = "I")
    private int field1547;

    @OriginalMember(owner = "client!qv", name = "z", descriptor = "J")
    private long field1544;

    @OriginalMember(owner = "client!qv", name = "I", descriptor = "Lkd;")
    private class106 field1552;

    @OriginalMember(owner = "client!qv", name = "B", descriptor = "Lqu;")
    private class235 field1546;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qv", name = "J", descriptor = "Ljava/lang/Class;")
    public static Class field1553;

    @OriginalMember(owner = "client!qv", name = "x", descriptor = "[Ls;")
    public static class358[] field1542;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)Z")
    public final boolean method671(int arg0) {
        if (this.field1546 != null) {
            long var2 = class502.method2786(-7114);
            int var4 = (int) (var2 - this.field1544);
            this.field1544 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field1547 += var4;
            if (this.field1547 > 30000) {
                try {
                    this.field1546.method1566(-2);
                } catch (Exception var27) {
                }
                this.field1546 = null;
            }
        }
        field1530++;
        if (arg0 < 78) {
            this.method681(false, 32, (byte) -76, 1, 76);
        }
        if (this.field1546 == null) {
            return this.method675(77) == 0 && this.method673(-111) == 0;
        }
        try {
            this.field1546.method1563((byte) -90);
            for (class106 var5 = (class106) this.field1534.method3855(0); var5 != null; var5 = (class106) this.field1534.method3861(true)) {
                this.field1545.field3133 = 0;
                this.field1545.method1491(-129, 1);
                this.field1545.method1536((int) var5.field2278, (byte) 126);
                this.field1546.method1562(this.field1545.field3193, false, 0, 4);
                this.field1539.method3862(var5, false);
            }
            for (class106 var6 = (class106) this.field1541.method3855(0); var6 != null; var6 = (class106) this.field1541.method3861(true)) {
                this.field1545.field3133 = 0;
                this.field1545.method1491(-129, 0);
                this.field1545.method1536((int) var6.field2278, (byte) 123);
                this.field1546.method1562(this.field1545.field3193, false, 0, 4);
                this.field1543.method3862(var6, false);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field1546.method1565(20045);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field1547 = 0;
                byte var9 = 0;
                if (this.field1552 == null) {
                    var9 = 8;
                } else if (this.field1552.field1442 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field1552.field1443.field3193.length - this.field1552.field1446;
                    int var11 = 512 - this.field1552.field1442;
                    if (var10 - this.field1552.field1443.field3133 < var11) {
                        var11 = var10 - this.field1552.field1443.field3133;
                    }
                    if (var11 > var8) {
                        var11 = var8;
                    }
                    this.field1546.method1564(var11, 0, this.field1552.field1443.field3193, this.field1552.field1443.field3133);
                    if (this.field1549 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field1552.field1443.field3193[this.field1552.field1443.field3133 + var12] = (byte) class237.method1570(this.field1552.field1443.field3193[this.field1552.field1443.field3133 + var12], this.field1549);
                        }
                    }
                    this.field1552.field1442 += var11;
                    this.field1552.field1443.field3133 += var11;
                    if (this.field1552.field1443.field3133 == var10) {
                        this.field1552.method1084((byte) 84);
                        this.field1552.field10779 = false;
                        this.field1552 = null;
                    } else if (this.field1552.field1442 == 512) {
                        this.field1552.field1442 = 0;
                    }
                } else {
                    int var13 = var9 - this.field1551.field3133;
                    if (var8 < var13) {
                        var13 = var8;
                    }
                    this.field1546.method1564(var13, 0, this.field1551.field3193, this.field1551.field3133);
                    if (this.field1549 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field1551.field3193[this.field1551.field3133 + var14] = (byte) class237.method1570(this.field1551.field3193[this.field1551.field3133 + var14], this.field1549);
                        }
                    }
                    this.field1551.field3133 += var13;
                    if (var9 <= this.field1551.field3133) {
                        if (this.field1552 == null) {
                            this.field1551.field3133 = 0;
                            int var15 = this.field1551.method1509(true);
                            int var16 = this.field1551.method1553((byte) -123);
                            int var17 = this.field1551.method1509(true);
                            int var18 = this.field1551.method1497((byte) 36);
                            int var19 = var17 & 0x7F;
                            boolean var20 = (var17 & 0x80) != 0;
                            long var21 = (long) ((var15 << 16) + var16);
                            Object var23 = null;
                            class106 var24;
                            if (var20) {
                                for (var24 = (class106) this.field1543.method3855(0); var24 != null && var24.field2278 != var21; var24 = (class106) this.field1543.method3861(true)) {
                                }
                            } else {
                                for (var24 = (class106) this.field1539.method3855(0); var24 != null && var24.field2278 != var21; var24 = (class106) this.field1539.method3861(true)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            this.field1552 = var24;
                            int var25 = var19 == 0 ? 5 : 9;
                            this.field1552.field1443 = new class234(var18 + var25 + this.field1552.field1446);
                            this.field1552.field1443.method1491(-129, var19);
                            this.field1552.field1443.method1496(var18, (byte) -116);
                            this.field1551.field3133 = 0;
                            this.field1552.field1442 = 8;
                        } else if (this.field1552.field1442 != 0) {
                            throw new IOException();
                        } else if (this.field1551.field3193[0] == -1) {
                            this.field1552.field1442 = 1;
                            this.field1551.field3133 = 0;
                        } else {
                            this.field1552 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field1546.method1566(-2);
            } catch (Exception var26) {
            }
            this.field1550 = -2;
            this.field1546 = null;
            this.field1548++;
            return this.method675(77) == 0 && this.method673(-82) == 0;
        }
    }

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "(I)V")
    public final void method672(int arg0) {
        int var2 = -52 / ((-arg0 - 73) / 47);
        if (this.field1546 != null) {
            this.field1546.method1566(-2);
        }
        field1521++;
    }

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "(I)I")
    private final int method673(int arg0) {
        if (arg0 > -78) {
            this.field1551 = null;
        }
        field1522++;
        return this.field1541.method3857((byte) 8) + this.field1543.method3857((byte) 8);
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Z)V")
    public final void method674(boolean arg0) {
        if (!arg0) {
            this.method677(false, 109, null);
        }
        field1519++;
        if (this.field1546 != null) {
            this.field1546.method1560((byte) 124);
        }
    }

    @OriginalMember(owner = "client!qv", name = "d", descriptor = "(I)I")
    public final int method675(int arg0) {
        if (arg0 == 77) {
            field1535++;
            return this.field1534.method3857((byte) 8) + this.field1539.method3857((byte) 8);
        } else {
            return -60;
        }
    }

    @OriginalMember(owner = "client!qv", name = "e", descriptor = "(I)V")
    public static final void method676(int arg0) {
        field1532++;
        class259.field3487.method840((byte) 105);
        for (int var1 = 0; var1 < 32; var1++) {
            class346.field4234[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class678.field8777[var2] = 0L;
        }
        if (arg0 != 8) {
            field1540 = null;
        }
        class48.field615 = 0;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(ZILqu;)V")
    public final void method677(boolean arg0, int arg1, class235 arg2) {
        field1527++;
        if (this.field1546 != null) {
            try {
                this.field1546.method1566(-2);
            } catch (Exception var8) {
            }
            this.field1546 = null;
        }
        this.field1546 = arg2;
        this.method689(arg1 ^ 0xFFFF961E);
        this.method683((byte) -100, arg0);
        this.field1552 = null;
        this.field1551.field3133 = 0;
        while (true) {
            class106 var4 = (class106) this.field1539.method3859(arg1);
            if (var4 == null) {
                while (true) {
                    class106 var5 = (class106) this.field1543.method3859(0);
                    if (var5 == null) {
                        if (this.field1549 != 0) {
                            try {
                                this.field1545.field3133 = 0;
                                this.field1545.method1491(-129, 4);
                                this.field1545.method1491(-129, this.field1549);
                                this.field1545.method1541(374, 0);
                                this.field1546.method1562(this.field1545.field3193, false, 0, 4);
                            } catch (IOException var7) {
                                try {
                                    this.field1546.method1566(-2);
                                } catch (Exception var6) {
                                }
                                this.field1546 = null;
                                this.field1550 = -2;
                                this.field1548++;
                            }
                        }
                        this.field1547 = arg1;
                        this.field1544 = class502.method2786(-7114);
                        return;
                    }
                    this.field1541.method3862(var5, false);
                }
            }
            this.field1534.method3862(var4, false);
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(IB)V")
    public static final void method678(int arg0, byte arg1) {
        class366.field4470.method2928(true, arg0);
        field1538++;
        if (arg1 != 88) {
            field1533 = null;
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lfi;I)V")
    public static final void method679(class13 arg0, int arg1) {
        field1523++;
        class483.field6238.method3593(arg0, arg1 + 15);
        arg0.field131 = arg0.field130.field3133;
        arg0.field130.field3133 = arg1;
        class261.field3496 += arg0.field131;
    }

    @OriginalMember(owner = "client!qv", name = "f", descriptor = "(I)V")
    public static final void method680(int arg0) {
        if (arg0 != 0) {
            return;
        }
        try {
            Method var1 = (field1553 == null ? (field1553 = method690("java.lang.Runtime")) : field1553).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class558.field7086 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
        field1525++;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(ZIBII)Lkd;")
    public final class106 method681(boolean arg0, int arg1, byte arg2, int arg3, int arg4) {
        field1528++;
        long var6 = (long) ((arg3 << 16) + arg1);
        class106 var8 = new class106();
        if (arg4 != 20) {
            method687(null, -123, -17, 39);
        }
        var8.field2278 = var6;
        var8.field1446 = arg2;
        var8.field10776 = arg0;
        if (arg0) {
            if (this.method675(arg4 + 57) >= 20) {
                throw new RuntimeException();
            }
            this.field1534.method3862(var8, false);
        } else if (this.method673(-98) < 20) {
            this.field1541.method3862(var8, false);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(B)Z")
    public final boolean method682(byte arg0) {
        field1526++;
        if (arg0 <= 6) {
            this.field1544 = 92L;
        }
        return this.method675(77) >= 20;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(BZ)V")
    public final void method683(byte arg0, boolean arg1) {
        field1537++;
        if (this.field1546 == null) {
            return;
        }
        try {
            this.field1545.field3133 = 0;
            this.field1545.method1491(-129, arg1 ? 2 : 3);
            if (arg0 > -51) {
                field1533 = null;
            }
            this.field1545.method1536(0, (byte) 122);
            this.field1546.method1562(this.field1545.field3193, false, 0, 4);
        } catch (IOException var4) {
            try {
                this.field1546.method1566(-2);
            } catch (Exception var3) {
            }
            this.field1546 = null;
            this.field1550 = -2;
            this.field1548++;
        }
    }

    @OriginalMember(owner = "client!qv", name = "g", descriptor = "(I)V")
    public final void method684(int arg0) {
        field1531++;
        if (this.field1546 == null) {
            return;
        }
        try {
            this.field1545.field3133 = 0;
            if (arg0 <= 101) {
                this.field1539 = null;
            }
            this.field1545.method1491(-129, 7);
            this.field1545.method1536(0, (byte) 124);
            this.field1546.method1562(this.field1545.field3193, false, 0, 4);
        } catch (IOException var3) {
            try {
                this.field1546.method1566(-2);
            } catch (Exception var2) {
            }
            this.field1548++;
            this.field1546 = null;
            this.field1550 = -2;
        }
    }

    @OriginalMember(owner = "client!qv", name = "h", descriptor = "(I)V")
    public static void method685(int arg0) {
        if (arg0 >= 7) {
            field1540 = null;
            field1533 = null;
            field1536 = null;
            field1542 = null;
        }
    }

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "(B)V")
    public final void method686(byte arg0) {
        try {
            if (arg0 != -21) {
                return;
            }
            this.field1546.method1566(arg0 ^ 0x15);
        } catch (Exception var2) {
        }
        field1520++;
        this.field1550 = -1;
        this.field1546 = null;
        this.field1548++;
        this.field1549 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Llq;III)V")
    public static final void method687(class210 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class330.field4039) {
            class766 var4 = class28.field252[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field10426 != null && var4.field10426.method171(-84)) {
                arg0.method174(true, class722.field9480, (byte) -126, var4.field10426, class398.field5275, 0, 0);
            }
        }
        if (arg3 < class330.field4039) {
            class766 var5 = class28.field252[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field10426 != null && var5.field10426.method171(-94)) {
                arg0.method174(true, 0, (byte) -126, var5.field10426, class398.field5275, 0, class722.field9480);
            }
        }
        if (arg2 < class330.field4039 && arg3 < class559.field7102) {
            class766 var6 = class28.field252[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field10426 != null && var6.field10426.method171(-111)) {
                arg0.method174(true, class722.field9480, (byte) -126, var6.field10426, class398.field5275, 0, class722.field9480);
            }
        }
        if (arg2 < class330.field4039 && arg3 > 0) {
            class766 var7 = class28.field252[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field10426 != null && var7.field10426.method171(-109)) {
                arg0.method174(true, class722.field9480, (byte) -126, var7.field10426, class398.field5275, 0, -class722.field9480);
            }
        }
    }

    @OriginalMember(owner = "client!qv", name = "i", descriptor = "(I)Z")
    public final boolean method688(int arg0) {
        field1524++;
        if (arg0 != -21) {
            this.field1543 = null;
        }
        return this.method673(-93) >= 20;
    }

    @OriginalMember(owner = "client!qv", name = "j", descriptor = "(I)V")
    private final void method689(int arg0) {
        field1529++;
        if (this.field1546 == null) {
            return;
        }
        try {
            this.field1545.field3133 = 0;
            this.field1545.method1491(arg0 ^ 0x6961, 6);
            this.field1545.method1536(3, (byte) 120);
            if (arg0 != -27106) {
                this.method677(true, 71, null);
            }
            this.field1546.method1562(this.field1545.field3193, false, 0, 4);
        } catch (IOException var3) {
            try {
                this.field1546.method1566(-2);
            } catch (Exception var2) {
            }
            this.field1548++;
            this.field1546 = null;
            this.field1550 = -2;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method690(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
