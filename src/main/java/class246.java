import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class246 extends class319 {

    @OriginalMember(owner = "client!qi", name = "D", descriptor = "Lom;")
    public class156 field3672 = new class156();

    @OriginalMember(owner = "client!qi", name = "I", descriptor = "Lnh;")
    public class328 field3677 = new class328();

    @OriginalMember(owner = "client!qi", name = "A", descriptor = "Lfj;")
    private class290 field3669;

    @OriginalMember(owner = "client!qi", name = "x", descriptor = "Lhb;")
    public static class318 field3666 = new class318(32);

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!qi", name = "s", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!qi", name = "u", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!qi", name = "v", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!qi", name = "w", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!qi", name = "y", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!qi", name = "z", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!qi", name = "C", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!qi", name = "E", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!qi", name = "F", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!qi", name = "G", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!qi", name = "H", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!qi", name = "J", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!qi", name = "B", descriptor = "Ljava/lang/String;")
    public static String field3670;

    @OriginalMember(owner = "client!qi", name = "t", descriptor = "[I")
    public static int[] field3662;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "([III)V", line = 18)
    public final void method1502(int[] arg0, int arg1, int arg2) {
        field3660++;
        this.field3677.method1502(arg0, arg1, arg2);
        for (class84 var4 = (class84) this.field3672.method1109(-99); var4 != null; var4 = (class84) this.field3672.method1115((byte) 79)) {
            if (!this.field3669.method2008(var4, true)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field1233 >= var6) {
                        this.method1664(var5, 85, var4, arg0, var6, var5 + var6);
                        var4.field1233 -= var6;
                        break;
                    }
                    this.method1664(var5, 92, var4, arg0, var4.field1233, var5 + var6);
                    var6 -= var4.field1233;
                    var5 += var4.field1233;
                } while (!this.field3669.method2002(var4, var5, var6, 0, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 59)
    public static final String method1658(String arg0, int arg1) {
        field3675++;
        if (arg1 != -128) {
            field3662 = (int[]) null;
        }
        String var2 = class194.method1337(class242.method1638(arg0, -14393), arg1 + 129);
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(III)V", line = 77)
    public static final void method1659(int arg0, int arg1, int arg2) {
        for (int var3 = arg1; var3 < class205.field3096; var3++) {
            class88 var4 = class186.method1278(var3, true);
            if (var4 != null) {
                int var5 = var4.field1300;
                if (var5 >= 0 && !class148.field2233.method746(0, var5)) {
                    var5 = -1;
                }
                int var6;
                if (var4.field1307 >= 0) {
                    int var10 = var4.field1307;
                    int var11 = (var10 & 0x7F) + arg2;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (arg0 + var10 & 0xFC00) + (var10 & 0x380) + var11;
                    var6 = class148.field2222[class91.method642(var12, 96, (byte) 122)];
                } else if (var5 >= 0) {
                    var6 = class148.field2222[class91.method642(class148.field2233.method739(var5, arg1 ^ 0xFFFF9A2D), 96, (byte) 122)];
                } else if (var4.field1309 == -1) {
                    var6 = -1;
                } else {
                    int var7 = var4.field1309;
                    int var8 = (var7 & 0x7F) + arg2;
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 127) {
                        var8 = 127;
                    }
                    int var9 = (var7 + arg0 & 0xFC00) + (var7 & 0x380) + var8;
                    var6 = class148.field2222[class91.method642(var9, 96, (byte) 122)];
                }
                class241.field3595[var3 + 1] = var6;
            }
        }
        field3678++;
    }

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "()Lcm;", line = 147)
    public final class319 method1543() {
        field3663++;
        class84 var1;
        do {
            var1 = (class84) this.field3672.method1115((byte) 103);
            if (var1 == null) {
                return null;
            }
        } while (var1.field1237 == null);
        return var1.field1237;
    }

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "(I)V", line = 167)
    public static final void method1660(int arg0) {
        class192.field2875.method2176((byte) -39);
        if (arg0 == 0) {
            field3661++;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "()Lcm;", line = 180)
    public final class319 method1521() {
        field3673++;
        class84 var1 = (class84) this.field3672.method1109(22);
        if (var1 == null) {
            return null;
        } else if (var1.field1237 == null) {
            return this.method1543();
        } else {
            return var1.field1237;
        }
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(I)V", line = 198)
    public final void method1532(int arg0) {
        field3665++;
        this.field3677.method1532(arg0);
        for (class84 var2 = (class84) this.field3672.method1109(37); var2 != null; var2 = (class84) this.field3672.method1115((byte) 111)) {
            if (!this.field3669.method2008(var2, true)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field1233) {
                        this.method1661(var2, var3, 0);
                        var2.field1233 -= var3;
                        break;
                    }
                    this.method1661(var2, var2.field1233, 0);
                    var3 -= var2.field1233;
                } while (!this.field3669.method2002(var2, 0, var3, 0, (int[]) null));
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lta;II)V", line = 237)
    private final void method1661(class84 arg0, int arg1, int arg2) {
        field3674++;
        if ((this.field3669.field4407[arg0.field1223] & 0x4) != arg2 && arg0.field1230 < 0) {
            int var4 = this.field3669.field4369[arg0.field1223] / class248.field3696;
            int var5 = (var4 + 1048575 - arg0.field1242) / var4;
            arg0.field1242 = arg0.field1242 + (arg1 * var4) & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field3669.field4405[arg0.field1223] == 0) {
                    arg0.field1237 = class219.method1503(arg0.field1248, arg0.field1237.method1513(), arg0.field1237.method1537(), arg0.field1237.method1530());
                } else {
                    arg0.field1237 = class219.method1503(arg0.field1248, arg0.field1237.method1513(), 0, arg0.field1237.method1530());
                    this.field3669.method2020(arg0.field1221.field3131[arg0.field1226] < 0, arg0, arg2 - 98);
                }
                if (arg0.field1221.field3131[arg0.field1226] < 0) {
                    arg0.field1237.method1533(-1);
                }
                arg1 = arg0.field1242 / var4;
            }
        }
        arg0.field1237.method1532(arg1);
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(B)V", line = 275)
    public static final void method1662(byte arg0) {
        if (arg0 != 88) {
            method1663((byte) -21);
        }
        field3667++;
        class223.field3402.method1327((byte) 47);
        class23.field349.method1692((byte) 68);
        class44.field534.method1692((byte) 75);
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(B)V", line = 304)
    public static void method1663(byte arg0) {
        field3662 = null;
        field3670 = null;
        int var1 = 73 / ((-arg0 - 38) / 35);
        field3666 = null;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IILta;[III)V", line = 315)
    private final void method1664(int arg0, int arg1, class84 arg2, int[] arg3, int arg4, int arg5) {
        field3676++;
        if (arg1 <= 75) {
            field3664 = -103;
        }
        if ((this.field3669.field4407[arg2.field1223] & 0x4) != 0 && arg2.field1230 < 0) {
            int var7 = this.field3669.field4369[arg2.field1223] / class248.field3696;
            while (true) {
                int var8 = (var7 + 1048575 - arg2.field1242) / var7;
                if (arg4 < var8) {
                    arg2.field1242 += arg4 * var7;
                    break;
                }
                arg4 -= var8;
                arg2.field1237.method1502(arg3, arg0, var8);
                int var9 = 262144 / var7;
                int var10 = class248.field3696 / 100;
                arg2.field1242 += var7 * var8 - 1048576;
                if (var10 > var9) {
                    var10 = var9;
                }
                class219 var11 = arg2.field1237;
                arg0 += var8;
                if (this.field3669.field4405[arg2.field1223] == 0) {
                    arg2.field1237 = class219.method1503(arg2.field1248, var11.method1513(), var11.method1537(), var11.method1530());
                } else {
                    arg2.field1237 = class219.method1503(arg2.field1248, var11.method1513(), 0, var11.method1530());
                    this.field3669.method2020(arg2.field1221.field3131[arg2.field1226] < 0, arg2, -11);
                    arg2.field1237.method1520(var10, var11.method1537());
                }
                if (arg2.field1221.field3131[arg2.field1226] < 0) {
                    arg2.field1237.method1533(-1);
                }
                var11.method1539(var10);
                var11.method1502(arg3, arg0, arg5 - arg0);
                if (var11.method1546()) {
                    this.field3677.method2234(var11);
                }
            }
        }
        arg2.field1237.method1502(arg3, arg0, arg4);
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lfj;)V", line = 391)
    public class246(class290 arg0) {
        this.field3669 = arg0;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "()I", line = 382)
    public final int method1540() {
        field3659++;
        return 0;
    }
}
