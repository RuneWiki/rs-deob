import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class88 extends class216 {

    @OriginalMember(owner = "client!of", name = "O", descriptor = "I")
    public static int field1570 = 0;

    @OriginalMember(owner = "client!of", name = "R", descriptor = "Lbd;")
    public static class162 field1573 = class17.method142(0, "gr-Un:");

    @OriginalMember(owner = "client!of", name = "L", descriptor = "Lbd;")
    public static class162 field1567 = class17.method142(0, "Eingabeprozedur geladen)3");

    @OriginalMember(owner = "client!of", name = "E", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!of", name = "F", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!of", name = "J", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!of", name = "K", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!of", name = "P", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!of", name = "Q", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!of", name = "S", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!of", name = "U", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!of", name = "V", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!of", name = "W", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!of", name = "H", descriptor = "Lbd;")
    public class162 field1564;

    @OriginalMember(owner = "client!of", name = "G", descriptor = "[I")
    public int[] field1563;

    @OriginalMember(owner = "client!of", name = "M", descriptor = "[I")
    public int[] field1568;

    @OriginalMember(owner = "client!of", name = "N", descriptor = "[I")
    public int[] field1569;

    @OriginalMember(owner = "client!of", name = "T", descriptor = "[I")
    public int[] field1575;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V", line = 5)
    public static void method667(int arg0) {
        if (arg0 <= 114) {
            method675((byte) -120, -83, -88, -89, -106, -127, -40);
        }
        field1573 = null;
        field1567 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIILrg;II)V", line = 18)
    public static final void method668(int arg0, int arg1, int arg2, int arg3, class301 arg4, int arg5, int arg6) {
        field1572++;
        class230.method1640(arg4.field5013, arg4.field5047, arg5, -1, arg2, arg0, arg3, arg1);
        if (arg6 < 54) {
            method674((byte) 104, -62);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BLb;I)V", line = 49)
    private final void method669(byte arg0, class94 arg1, int arg2) {
        field1562++;
        if (arg2 == 1) {
            this.field1564 = arg1.method744((byte) 127);
        } else if (arg2 == 2) {
            int var7 = arg1.method756(arg0 + 915905956);
            this.field1568 = new int[var7];
            this.field1563 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1563[var8] = arg1.method761((byte) 108);
                int var9 = arg1.method756(915905888);
                if (var9 == 0) {
                    this.field1568[var8] = -1;
                } else {
                    this.field1568[var8] = var9;
                }
            }
        } else if (arg2 == 3) {
            int var4 = arg1.method756(915905888);
            this.field1575 = new int[var4];
            this.field1569 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1569[var5] = arg1.method761((byte) 108);
                int var6 = arg1.method756(915905888);
                if (var6 == 0) {
                    this.field1575[var5] = -1;
                } else {
                    this.field1575[var5] = var6;
                }
            }
        } else if (arg2 == 4) {
        }
        if (arg0 != -68) {
            this.field1564 = (class162) null;
        }
    }

    @OriginalMember(owner = "client!of", name = "d", descriptor = "(B)V", line = 122)
    public final void method670(byte arg0) {
        if (arg0 < 76) {
            this.field1568 = (int[]) null;
        }
        field1561++;
        if (this.field1569 != null) {
            for (int var2 = 0; var2 < this.field1569.length; var2++) {
                this.field1569[var2] = class289.method2005(this.field1569[var2], 32768);
            }
        }
        if (this.field1563 != null) {
            for (int var3 = 0; var3 < this.field1563.length; var3++) {
                this.field1563[var3] = class289.method2005(this.field1563[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILb;)V", line = 157)
    public final void method671(int arg0, class94 arg1) {
        field1576++;
        while (true) {
            int var3 = arg1.method756(915905888);
            if (var3 == 0) {
                if (arg0 != -12649) {
                    this.field1569 = (int[]) null;
                }
                return;
            }
            this.method669((byte) -68, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ZI)I", line = 180)
    public final int method672(boolean arg0, int arg1) {
        field1577++;
        if (this.field1563 == null) {
            return -1;
        }
        int var3 = 0;
        if (!arg0) {
            this.method670((byte) 37);
        }
        while (this.field1563.length > var3) {
            if (this.field1568[var3] == arg1) {
                return this.field1563[var3];
            }
            var3++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IB)I", line = 206)
    public final int method673(int arg0, byte arg1) {
        field1574++;
        if (this.field1569 == null) {
            return -1;
        }
        if (arg1 < 69) {
            field1566 = 59;
        }
        for (int var3 = 0; var3 < this.field1569.length; var3++) {
            if (this.field1575[var3] == arg0) {
                return this.field1569[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BI)I", line = 235)
    public static final int method674(byte arg0, int arg1) {
        field1571++;
        int var2 = arg1 * 6 - 61440;
        if (arg0 <= 55) {
            field1573 = (class162) null;
        }
        int var3 = (arg1 * var2 >> 12) + 40960;
        int var4 = (arg1 * arg1 >> 12) * arg1 >> 12;
        return var3 * var4 >> 12;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BIIIIII)I", line = 256)
    public static final int method675(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1565++;
        if (arg0 >= -127) {
            return 121;
        }
        int var7 = arg3 & 0x3;
        if ((arg1 & 0x1) == 1) {
            int var8 = arg2;
            arg2 = arg4;
            arg4 = var8;
        }
        if (var7 == 0) {
            return arg5;
        } else if (var7 == 1) {
            return arg6;
        } else if (var7 == 2) {
            return 8 - arg5 - arg2;
        } else {
            return 8 - arg4 - arg6;
        }
    }
}
