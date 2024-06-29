import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public class class270 {

    @OriginalMember(owner = "client!vca", name = "l", descriptor = "Ljia;")
    private class336 field3648 = new class336();

    @OriginalMember(owner = "client!vca", name = "n", descriptor = "Ljava/lang/String;")
    public String field3650;

    @OriginalMember(owner = "client!vca", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field3639 = new String[100];

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!vca", name = "d", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!vca", name = "e", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!vca", name = "f", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!vca", name = "g", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!vca", name = "h", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!vca", name = "i", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!vca", name = "k", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!vca", name = "m", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!vca", name = "o", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!vca", name = "q", descriptor = "I")
    private volatile int field3653;

    @OriginalMember(owner = "client!vca", name = "p", descriptor = "Lls;")
    private class567 field3652;

    @OriginalMember(owner = "client!vca", name = "j", descriptor = "Lvfa;")
    public static class92 field3646;

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "[I")
    public static int[] field3638;

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(BIIIIIIIIILnt;)Z", line = 3)
    public static final boolean method1646(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class141 arg10) {
        field3651++;
        int var11 = arg5;
        int var12 = arg8;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg5 - var13;
        int var16 = arg8 - var14;
        class757.field10514[var13][var14] = 99;
        class757.field10517[var13][var14] = 0;
        byte var17 = 0;
        class52.field742[var17] = arg5;
        int var18 = 0;
        byte var10001 = var17;
        int var27 = var17 + 1;
        class501.field7003[var10001] = arg8;
        int var19 = 31 / ((arg0 + 78) / 33);
        int[][] var20 = arg10.field1944;
        while (var27 != var18) {
            var11 = class52.field742[var18];
            var12 = class501.field7003[var18];
            int var21 = var12 - var16;
            int var22 = var11 - var15;
            int var23 = var12 - arg10.field1949;
            var18 = var18 + 1 & 0xFFF;
            int var24 = var11 - arg10.field1940;
            if (arg3 == -4) {
                if (arg9 == var11 && arg7 == var12) {
                    class280.field3723 = var11;
                    class670.field9426 = var12;
                    return true;
                }
            } else if (arg3 == -3) {
                if (class275.method1669(var12, 1, 4096, var11, arg7, 1, arg4, arg2, arg9)) {
                    class280.field3723 = var11;
                    class670.field9426 = var12;
                    return true;
                }
            } else if (arg3 == -2) {
                if (arg10.method912(-24775, var12, arg4, arg7, arg2, 1, var11, arg9, arg6, 1)) {
                    class280.field3723 = var11;
                    class670.field9426 = var12;
                    return true;
                }
            } else if (arg3 == -1) {
                if (arg10.method920(1, var12, arg6, 0, var11, arg9, arg2, arg4, arg7)) {
                    class280.field3723 = var11;
                    class670.field9426 = var12;
                    return true;
                }
            } else if (arg3 == 0 || arg3 == 1 || arg3 == 2 || arg3 == 3 || arg3 == 9) {
                if (arg10.method910(arg3, 1, -10800, var11, var12, arg7, arg1, arg9)) {
                    class280.field3723 = var11;
                    class670.field9426 = var12;
                    return true;
                }
            } else if (arg10.method924(arg9, arg7, var11, (byte) -66, arg3, var12, 1, arg1)) {
                class280.field3723 = var11;
                class670.field9426 = var12;
                return true;
            }
            int var26 = class757.field10517[var22][var21] + 1;
            if (var22 > 0 && class757.field10514[var22 - 1][var21] == 0 && (var20[var24 - 1][var23] & 0x42240000) == 0) {
                class52.field742[var27] = var11 - 1;
                class501.field7003[var27] = var12;
                class757.field10514[var22 - 1][var21] = 2;
                var27 = var27 + 1 & 0xFFF;
                class757.field10517[var22 - 1][var21] = var26;
            }
            if (var22 < 127 && class757.field10514[var22 + 1][var21] == 0 && (var20[var24 + 1][var23] & 0x60240000) == 0) {
                class52.field742[var27] = var11 + 1;
                class501.field7003[var27] = var12;
                class757.field10514[var22 + 1][var21] = 8;
                var27 = var27 + 1 & 0xFFF;
                class757.field10517[var22 + 1][var21] = var26;
            }
            if (var21 > 0 && class757.field10514[var22][var21 - 1] == 0 && (var20[var24][var23 - 1] & 0x40A40000) == 0) {
                class52.field742[var27] = var11;
                class501.field7003[var27] = var12 - 1;
                var27 = var27 + 1 & 0xFFF;
                class757.field10514[var22][var21 - 1] = 1;
                class757.field10517[var22][var21 - 1] = var26;
            }
            if (var21 < 127 && class757.field10514[var22][var21 + 1] == 0 && (var20[var24][var23 + 1] & 0x48240000) == 0) {
                class52.field742[var27] = var11;
                class501.field7003[var27] = var12 + 1;
                class757.field10514[var22][var21 + 1] = 4;
                var27 = var27 + 1 & 0xFFF;
                class757.field10517[var22][var21 + 1] = var26;
            }
            if (var22 > 0 && var21 > 0 && class757.field10514[var22 - 1][var21 - 1] == 0 && (var20[var24 - 1][var23 - 1] & 0x43A40000) == 0 && (var20[var24 - 1][var23] & 0x42240000) == 0 && (var20[var24][var23 - 1] & 0x40A40000) == 0) {
                class52.field742[var27] = var11 - 1;
                class501.field7003[var27] = var12 - 1;
                class757.field10514[var22 - 1][var21 - 1] = 3;
                var27 = var27 + 1 & 0xFFF;
                class757.field10517[var22 - 1][var21 - 1] = var26;
            }
            if (var22 < 127 && var21 > 0 && class757.field10514[var22 + 1][var21 - 1] == 0 && (var20[var24 + 1][var23 - 1] & 0x60E40000) == 0 && (var20[var24 + 1][var23] & 0x60240000) == 0 && (var20[var24][var23 - 1] & 0x40A40000) == 0) {
                class52.field742[var27] = var11 + 1;
                class501.field7003[var27] = var12 - 1;
                class757.field10514[var22 + 1][var21 - 1] = 9;
                var27 = var27 + 1 & 0xFFF;
                class757.field10517[var22 + 1][var21 - 1] = var26;
            }
            if (var22 > 0 && var21 < 127 && class757.field10514[var22 - 1][var21 + 1] == 0 && (var20[var24 - 1][var23 + 1] & 0x4E240000) == 0 && (var20[var24 - 1][var23] & 0x42240000) == 0 && (var20[var24][var23 + 1] & 0x48240000) == 0) {
                class52.field742[var27] = var11 - 1;
                class501.field7003[var27] = var12 + 1;
                class757.field10514[var22 - 1][var21 + 1] = 6;
                var27 = var27 + 1 & 0xFFF;
                class757.field10517[var22 - 1][var21 + 1] = var26;
            }
            if (var22 < 127 && var21 < 127 && class757.field10514[var22 + 1][var21 + 1] == 0 && (var20[var24 + 1][var23 + 1] & 0x78240000) == 0 && (var20[var24 + 1][var23] & 0x60240000) == 0 && (var20[var24][var23 + 1] & 0x48240000) == 0) {
                class52.field742[var27] = var11 + 1;
                class501.field7003[var27] = var12 + 1;
                var27 = var27 + 1 & 0xFFF;
                class757.field10514[var22 + 1][var21 + 1] = 12;
                class757.field10517[var22 + 1][var21 + 1] = var26;
            }
        }
        class280.field3723 = var11;
        class670.field9426 = var12;
        return false;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(I)Z", line = 249)
    public final boolean method1647(int arg0) {
        if (arg0 < 17) {
            return false;
        } else {
            field3637++;
            return this.field3653 == 0;
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(IIIIZ)V", line = 262)
    public static final void method1648(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3644++;
        if (arg4) {
            method1648(-111, -28, 52, 6, false);
        }
        for (int var5 = 0; var5 < class752.field10450; var5++) {
            Rectangle var6 = class391.field5453[var5];
            if ((var6.x + var6.width) > arg1 && var6.x < arg1 + arg3 && arg0 < var6.y + var6.height && var6.y < arg0 + arg2) {
                class523.field7346[var5] = true;
            }
        }
        class217.method1422(arg1 + arg3, arg0 - -arg2, -96, arg1, arg0);
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(ILig;)V", line = 289)
    public final void method1649(int arg0, class674 arg1) {
        arg1.field9492 = true;
        field3647++;
        class336 var3 = this.field3648;
        synchronized (this.field3648) {
            if (arg0 != 1) {
                return;
            }
            this.field3648.method1946(arg0 ^ 0xFFFFFF87, arg1);
            this.field3653++;
        }
        if (this.field3652 != null) {
            class567 var4 = this.field3652;
            synchronized (this.field3652) {
                this.field3652.notify();
            }
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(II)I", line = 315)
    public static final int method1650(int arg0, int arg1) {
        field3643++;
        if (arg0 != 1109655552) {
            field3639 = null;
        }
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "(ILig;)V", line = 334)
    public final void method1651(int arg0, class674 arg1) {
        arg1.field9492 = false;
        if (arg0 >= -126) {
            return;
        }
        field3645++;
        class336 var3 = this.field3648;
        synchronized (this.field3648) {
            this.field3648.method1946(-124, arg1);
            this.field3653++;
        }
        if (this.field3652 != null) {
            class567 var4 = this.field3652;
            synchronized (this.field3652) {
                this.field3652.notify();
            }
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(ILnba;)V", line = 357)
    public final void method1652(int arg0, class488 arg1) {
        field3640++;
        if (arg0 > -95) {
            return;
        }
        class336 var3 = this.field3648;
        synchronized (this.field3648) {
            this.field3648.method1946(-127, arg1);
            this.field3653++;
        }
        if (this.field3652 != null) {
            class567 var4 = this.field3652;
            synchronized (this.field3652) {
                this.field3652.notify();
            }
        }
    }

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "(I)V", line = 382)
    public static void method1653(int arg0) {
        field3638 = null;
        if (arg0 == 1813) {
            field3646 = null;
            field3639 = null;
        }
    }

    @OriginalMember(owner = "client!vca", name = "c", descriptor = "(I)Lib;", line = 394)
    public final class1 method1654(int arg0) {
        field3641++;
        Object var2 = null;
        class336 var3 = this.field3648;
        synchronized (this.field3648) {
            class1 var4 = this.field3648.method1945(false);
            var4.method1(80);
            if (arg0 != 1) {
                this.field3652 = null;
            }
            this.field3653--;
            return var4;
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(Lls;I)V", line = 413)
    public final void method1655(class567 arg0, int arg1) {
        if (arg1 != -12038) {
            field3646 = null;
        }
        this.field3652 = arg0;
        field3649++;
    }

    @OriginalMember(owner = "client!vca", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 430)
    public class270(String arg0) {
        this.field3650 = arg0;
    }
}
