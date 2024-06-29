import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class90 extends class194 {

    @OriginalMember(owner = "client!q", name = "Pb", descriptor = "Lmh;")
    public static class128 field1528 = null;

    @OriginalMember(owner = "client!q", name = "Xb", descriptor = "Z")
    public static boolean field1536 = true;

    @OriginalMember(owner = "client!q", name = "Vb", descriptor = "Lmh;")
    public static class128 field1534 = class22.method156(126, "<col=00ff00>");

    @OriginalMember(owner = "client!q", name = "ec", descriptor = "Lmh;")
    public static class128 field1543 = class22.method156(123, ": ");

    @OriginalMember(owner = "client!q", name = "Yb", descriptor = "J")
    public static long field1537 = 0L;

    @OriginalMember(owner = "client!q", name = "Ob", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!q", name = "Qb", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!q", name = "Rb", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!q", name = "Sb", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!q", name = "Tb", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!q", name = "Ub", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!q", name = "Wb", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!q", name = "Zb", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!q", name = "ac", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!q", name = "cc", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!q", name = "dc", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!q", name = "fc", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!q", name = "gc", descriptor = "I")
    private int field1545;

    @OriginalMember(owner = "client!q", name = "hc", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!q", name = "bc", descriptor = "Lmf;")
    private class43 field1540;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II[BI)V", line = 4)
    public final void method560(int arg0, int arg1, byte[] arg2, int arg3) {
        field1539++;
        for (int var5 = 0; var5 < arg3; var5++) {
            arg2[arg1 + var5] = (byte) (this.field3417[this.field3380++] - this.field1540.method295(false));
        }
        if (arg0 > -85) {
            field1537 = 108L;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIII)V", line = 22)
    public static final void method561(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 29485) {
            return;
        }
        for (int var5 = 0; var5 < class257.field4424; var5++) {
            if (arg3 < class32.field711[var5] + class120.field2037[var5] && (arg0 + arg3) > class120.field2037[var5] && class313.field5281[var5] + class275.field4762[var5] > arg1 && class275.field4762[var5] < arg1 + arg4) {
                class199.field3468[var5] = true;
            }
        }
        field1533++;
    }

    @OriginalMember(owner = "client!q", name = "s", descriptor = "(I)V", line = 45)
    public final void method562(int arg0) {
        if (arg0 != 0) {
            field1543 = (class128) null;
        }
        this.field3380 = (this.field1545 + 7) / 8;
        field1544++;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I[I)V", line = 62)
    public final void method563(int arg0, int[] arg1) {
        this.field1540 = new class43(arg1);
        if (arg0 >= -62) {
            method571((byte) 126, 57L);
        }
        field1535++;
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(BI)I", line = 81)
    public final int method564(byte arg0, int arg1) {
        if (arg0 >= -74) {
            this.method564((byte) 23, -36);
        }
        int var3 = this.field1545 >> 3;
        field1532++;
        int var4 = 8 - (this.field1545 & 0x7);
        this.field1545 += arg1;
        int var5 = 0;
        while (var4 < arg1) {
            var5 += (this.field3417[var3++] & class148.field2545[var4]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 == var4) {
            var6 = (class148.field2545[var4] & this.field3417[var3]) + var5;
        } else {
            var6 = (this.field3417[var3] >> var4 - arg1 & class148.field2545[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!q", name = "i", descriptor = "(B)V", line = 118)
    public static void method565(byte arg0) {
        field1543 = null;
        if (arg0 >= -62) {
            field1534 = (class128) null;
        }
        field1528 = null;
        field1534 = null;
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(I)V", line = 133)
    public class90(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!q", name = "j", descriptor = "(B)I", line = 139)
    public final int method566(byte arg0) {
        field1527++;
        if (arg0 != -70) {
            this.method570(-9, 40);
        }
        return this.field3417[this.field3380++] - this.field1540.method295(false) & 0xFF;
    }

    @OriginalMember(owner = "client!q", name = "t", descriptor = "(I)V", line = 150)
    public final void method567(int arg0) {
        field1542++;
        this.field1545 = this.field3380 * arg0;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IBIIII)V", line = 163)
    public static final void method568(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg5 - arg0;
        field1546++;
        int var7 = arg3 - arg2;
        if (var7 == 0) {
            if (var6 != 0) {
                class261.method1830(arg0, arg4, arg5, -10177, arg2);
            }
        } else if (var6 == 0) {
            class219.method1514(-1898732287, arg3, arg0, arg4, arg2);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg2;
                int var10 = arg3;
                arg3 = arg5;
                arg5 = var10;
                arg2 = arg0;
                arg0 = var9;
            }
            if (arg2 > arg3) {
                int var11 = arg2;
                arg2 = arg3;
                int var12 = arg0;
                arg0 = arg5;
                arg3 = var11;
                arg5 = var12;
            }
            int var13 = arg3 - arg2;
            int var14 = arg0;
            int var15 = -(var13 >> 1);
            int var16 = arg5 - arg0;
            if (var16 < 0) {
                var16 = -var16;
            }
            int var17 = arg0 >= arg5 ? -1 : 1;
            if (var8) {
                for (int var18 = arg2; var18 <= arg3; var18++) {
                    var15 += var16;
                    class219.field3850[var18][var14] = arg4;
                    if (var15 > 0) {
                        var14 += var17;
                        var15 -= var13;
                    }
                }
            } else {
                for (int var19 = arg2; var19 <= arg3; var19++) {
                    var15 += var16;
                    class219.field3850[var14][var19] = arg4;
                    if (var15 > 0) {
                        var14 += var17;
                        var15 -= var13;
                    }
                }
            }
            if (arg1 != -25) {
                method565((byte) 97);
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIII)V", line = 286)
    public static final void method569(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -9) {
            method568(94, (byte) -78, 116, -54, -121, 3);
        }
        class229 var4 = class241.method1638(4, 112, arg2);
        field1530++;
        var4.method1574(3199);
        var4.field3981 = arg0;
        var4.field3980 = arg1;
    }

    @OriginalMember(owner = "client!q", name = "l", descriptor = "(II)V", line = 300)
    public final void method570(int arg0, int arg1) {
        field1531++;
        this.field3417[this.field3380++] = (byte) (arg0 + this.field1540.method295(false));
        if (arg1 != -1) {
            this.method562(-102);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BJ)Lmh;", line = 317)
    public static final class128 method571(byte arg0, long arg1) {
        field1541++;
        int var3 = 45 / ((arg0 - 38) / 55);
        return class88.method548(arg1, false, 10, 2);
    }

    @OriginalMember(owner = "client!q", name = "f", descriptor = "(IB)I", line = 330)
    public final int method572(int arg0, byte arg1) {
        field1538++;
        return arg1 > -26 ? -66 : arg0 * 8 - this.field1545;
    }
}
