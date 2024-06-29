import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class121 extends class3 {

    @OriginalMember(owner = "client!un", name = "w", descriptor = "Lhi;")
    public class192 field1633 = new class192();

    @OriginalMember(owner = "client!un", name = "H", descriptor = "Lwd;")
    public class156 field1643 = new class156();

    @OriginalMember(owner = "client!un", name = "A", descriptor = "Lgn;")
    private class77 field1637;

    @OriginalMember(owner = "client!un", name = "r", descriptor = "Lik;")
    public static class17 field1628 = new class17(16);

    @OriginalMember(owner = "client!un", name = "E", descriptor = "Ljava/lang/String;")
    public static String field1641 = "Loading textures - ";

    @OriginalMember(owner = "client!un", name = "F", descriptor = "I")
    public static int field1642 = 0;

    @OriginalMember(owner = "client!un", name = "D", descriptor = "Ljava/lang/String;")
    public static String field1640 = "white:";

    @OriginalMember(owner = "client!un", name = "I", descriptor = "[Z")
    public static boolean[] field1644 = new boolean[100];

    @OriginalMember(owner = "client!un", name = "q", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!un", name = "s", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!un", name = "t", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!un", name = "u", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!un", name = "v", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!un", name = "x", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!un", name = "y", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!un", name = "z", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!un", name = "B", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!un", name = "C", descriptor = "[Ltj;")
    public static class258[] field1639;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(BLea;I)V", line = 4)
    private final void method876(byte arg0, class333 arg1, int arg2) {
        if (arg0 != -74) {
            field1641 = (String) null;
        }
        field1636++;
        if ((this.field1637.field1093[arg1.field5035] & 0x4) != 0 && arg1.field5031 < 0) {
            int var4 = this.field1637.field1076[arg1.field5035] / class273.field4085;
            int var5 = (1048575 - (arg1.field5013 - var4)) / var4;
            arg1.field5013 = arg2 * var4 + arg1.field5013 & 0xFFFFF;
            if (var5 <= arg2) {
                if (this.field1637.field1085[arg1.field5035] == 0) {
                    arg1.field5003 = class220.method1547(arg1.field5019, arg1.field5003.method1553(), arg1.field5003.method1529(), arg1.field5003.method1526());
                } else {
                    arg1.field5003 = class220.method1547(arg1.field5019, arg1.field5003.method1553(), 0, arg1.field5003.method1526());
                    this.field1637.method579(arg1, (byte) 111, arg1.field5004.field1364[arg1.field5012] < 0);
                }
                if (arg1.field5004.field1364[arg1.field5012] < 0) {
                    arg1.field5003.method1556(-1);
                }
                arg2 = arg1.field5013 / var4;
            }
        }
        arg1.field5003.method14(arg2);
    }

    @OriginalMember(owner = "client!un", name = "d", descriptor = "()Lan;", line = 44)
    public final class3 method17() {
        field1632++;
        class333 var1;
        do {
            var1 = (class333) this.field1633.method1336(3);
            if (var1 == null) {
                return null;
            }
        } while (var1.field5003 == null);
        return var1.field5003;
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "([III)V", line = 65)
    public final void method16(int[] arg0, int arg1, int arg2) {
        this.field1643.method16(arg0, arg1, arg2);
        field1638++;
        for (class333 var4 = (class333) this.field1633.method1335(1); var4 != null; var4 = (class333) this.field1633.method1336(3)) {
            if (!this.field1637.method574(-1, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field5027) {
                        this.method877(var6, var5 + var6, arg0, var5, var4, 119);
                        var4.field5027 -= var5;
                        break;
                    }
                    this.method877(var6, var5 + var6, arg0, var4.field5027, var4, 124);
                    var5 -= var4.field5027;
                    var6 += var4.field5027;
                } while (!this.field1637.method578(var6, arg0, (byte) 85, var4, var5));
            }
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(II[IILea;I)V", line = 104)
    private final void method877(int arg0, int arg1, int[] arg2, int arg3, class333 arg4, int arg5) {
        field1635++;
        if ((this.field1637.field1093[arg4.field5035] & 0x4) != 0 && arg4.field5031 < 0) {
            int var7 = this.field1637.field1076[arg4.field5035] / class273.field4085;
            while (true) {
                int var8 = (var7 + 1048575 - arg4.field5013) / var7;
                if (var8 > arg3) {
                    arg4.field5013 += arg3 * var7;
                    break;
                }
                arg3 -= var8;
                arg4.field5003.method16(arg2, arg0, var8);
                class220 var9 = arg4.field5003;
                arg4.field5013 += var7 * var8 - 1048576;
                int var10 = class273.field4085 / 100;
                int var11 = 262144 / var7;
                if (var11 < var10) {
                    var10 = var11;
                }
                if (this.field1637.field1085[arg4.field5035] == 0) {
                    arg4.field5003 = class220.method1547(arg4.field5019, var9.method1553(), var9.method1529(), var9.method1526());
                } else {
                    arg4.field5003 = class220.method1547(arg4.field5019, var9.method1553(), 0, var9.method1526());
                    this.field1637.method579(arg4, (byte) 114, arg4.field5004.field1364[arg4.field5012] < 0);
                    arg4.field5003.method1544(var10, var9.method1529());
                }
                if (arg4.field5004.field1364[arg4.field5012] < 0) {
                    arg4.field5003.method1556(-1);
                }
                var9.method1534(var10);
                arg0 += var8;
                var9.method16(arg2, arg0, arg1 - arg0);
                if (var9.method1546()) {
                    this.field1643.method1126(var9);
                }
            }
        }
        if (arg5 <= 88) {
            this.field1643 = (class156) null;
        }
        arg4.field5003.method16(arg2, arg0, arg3);
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(I)V", line = 167)
    public static void method878(int arg0) {
        field1644 = null;
        field1639 = null;
        if (arg0 == -30556) {
            field1641 = null;
            field1628 = null;
            field1640 = null;
        }
    }

    @OriginalMember(owner = "client!un", name = "c", descriptor = "()I", line = 181)
    public final int method15() {
        field1631++;
        return 0;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIIII)V", line = 194)
    public static final void method879(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1627++;
        int var6 = arg3 - arg1;
        int var7 = arg2 - arg0;
        if (var6 == 0) {
            if (var7 != 0) {
                class128.method923(arg1, arg5, arg0, (byte) 107, arg2);
            }
        } else if (var7 == 0) {
            class266.method1806(arg1, 0, arg3, arg5, arg0);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg0 - (arg1 * var8 >> 12);
            int var10;
            int var11;
            if (arg3 < class206.field2952) {
                var10 = (class206.field2952 * var8 >> 12) + var9;
                var11 = class206.field2952;
            } else if (arg3 > class259.field3813) {
                var10 = (class259.field3813 * var8 >> 12) + var9;
                var11 = class259.field3813;
            } else {
                var10 = arg2;
                var11 = arg3;
            }
            int var12;
            int var13;
            if (class206.field2952 > arg1) {
                var12 = class206.field2952;
                var13 = var9 + (class206.field2952 * var8 >> 12);
            } else if (arg1 <= class259.field3813) {
                var12 = arg1;
                var13 = arg0;
            } else {
                var12 = class259.field3813;
                var13 = (class259.field3813 * var8 >> 12) + var9;
            }
            if (class101.field1397 > var13) {
                var13 = class101.field1397;
                var12 = (class101.field1397 - var9 << 12) / var8;
            } else if (var13 > class44.field536) {
                var13 = class44.field536;
                var12 = (class44.field536 - var9 << 12) / var8;
            }
            if (var10 < class101.field1397) {
                var10 = class101.field1397;
                var11 = (class101.field1397 - var9 << 12) / var8;
            } else if (class44.field536 < var10) {
                var11 = (class44.field536 - var9 << 12) / var8;
                var10 = class44.field536;
            }
            int var14 = -70 % ((68 - arg4) / 39);
            class329.method2300(var10, arg5, var13, var12, false, var11);
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(II)I", line = 298)
    public static final int method880(int arg0, int arg1) {
        field1634++;
        return arg1 == 17626 ? arg0 >>> 10 : -60;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "()Lan;", line = 309)
    public final class3 method12() {
        field1629++;
        class333 var1 = (class333) this.field1633.method1335(1);
        if (var1 == null) {
            return null;
        } else if (var1.field5003 == null) {
            return this.method17();
        } else {
            return var1.field5003;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(I)V", line = 332)
    public final void method14(int arg0) {
        field1630++;
        this.field1643.method14(arg0);
        for (class333 var2 = (class333) this.field1633.method1335(1); var2 != null; var2 = (class333) this.field1633.method1336(3)) {
            if (!this.field1637.method574(-1, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field5027) {
                        this.method876((byte) -74, var2, var3);
                        var2.field5027 -= var3;
                        break;
                    }
                    this.method876((byte) -74, var2, var2.field5027);
                    var3 -= var2.field5027;
                } while (!this.field1637.method578(0, (int[]) null, (byte) -94, var2, var3));
            }
        }
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lgn;)V", line = 394)
    public class121(class77 arg0) {
        this.field1637 = arg0;
    }
}
