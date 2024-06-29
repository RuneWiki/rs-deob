import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class262 {

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
    public int field4567 = 0;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "Z")
    public boolean field4564 = true;

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "I")
    public int field4574 = -1;

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "I")
    public int field4576 = -1;

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "[Z")
    public static boolean[] field4575 = new boolean[8];

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "Lsc;")
    public static class181 field4570 = class149.method967(255, "b12_full");

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "[Lwe;")
    public static class60[] field4569 = new class60[500];

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "Ljb;")
    public static class11 field4572;

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "[Z")
    public static boolean[] field4573;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "[[[I")
    public static int[][][] field4563;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)J")
    public static final long method1779(int arg0, int arg1, int arg2) {
        class220 var3 = class221.field3820[arg0][arg1][arg2];
        return var3 == null || var3.field3810 == null ? 0L : var3.field3810.field1718;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B[B)Lpe;")
    public static final class245 method1780(byte arg0, byte[] arg1) {
        field4571++;
        if (arg1 == null) {
            return null;
        }
        class14 var2 = new class14(arg1, class220.field3782, class23.field410, class196.field3425, class121.field1978, class143.field2319);
        class143.method919(16);
        if (arg0 >= -115) {
            method1779(-100, -75, 58);
        }
        return var2;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IILvf;)V")
    public final void method1781(int arg0, int arg1, class230 arg2) {
        field4565++;
        while (true) {
            int var4 = arg2.method1516((byte) 82);
            if (var4 == 0) {
                if (arg1 == -2366) {
                    return;
                } else {
                    this.field4576 = 52;
                    return;
                }
            }
            this.method1785((byte) 106, arg2, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IB)V")
    public static final void method1782(int arg0, byte arg1) {
        field4568++;
        if (arg1 == -50) {
            class91 var2 = class31.method252(arg0, 2, false);
            var2.method603(-99);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IZIIZIZI)Ltg;")
    public static final class107 method1783(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6, int arg7) {
        class99 var8 = class237.method1620(-29539, arg3);
        field4562++;
        if (arg2 > 1 && var8.field1612 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg2 >= var8.field1659[var10] && var8.field1659[var10] != 0) {
                    var9 = var8.field1612[var10];
                }
            }
            if (var9 != -1) {
                var8 = class237.method1620(-29539, var9);
            }
        }
        class231 var11 = var8.method652(-76);
        if (var11 == null) {
            return null;
        }
        class48 var12 = null;
        if (var8.field1642 != -1) {
            var12 = (class48) method1783(1, true, 10, var8.field1631, false, -120, true, 0);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field1596 != -1) {
            var12 = (class48) method1783(arg0, true, arg2, var8.field1648, false, 32, false, arg7);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = class17.field307;
        int var14 = class17.field308;
        int var15 = class17.field309;
        int[] var16 = new int[4];
        class17.method168(var16);
        class48 var17 = new class48(36, 32);
        int var18 = -8 / ((arg5 + 31) / 57);
        class17.method148(var17.field747, 36, 32);
        class72.method504();
        class72.method509(16, 16);
        int var19 = var8.field1614;
        if (arg6) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg0 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        class72.field1156 = false;
        int var20 = class72.field1145[var8.field1627] * var19 >> 16;
        int var21 = class72.field1150[var8.field1627] * var19 >> 16;
        var11.method1571(0, var8.field1593, var8.field1636, var8.field1627, var8.field1655, var8.field1664 + var21 - (var11.method190() / 2), var20 - -var8.field1664);
        if (arg0 >= 1) {
            var17.method334(1);
            if (arg0 >= 2) {
                var17.method334(16777215);
            }
            class17.method148(var17.field747, 36, 32);
        }
        if (arg7 != 0) {
            var17.method327(arg7);
        }
        if (var8.field1642 != -1) {
            var12.method322(0, 0);
        } else if (var8.field1596 != -1) {
            class17.method148(var12.field747, 36, 32);
            var17.method322(0, 0);
            var17 = var12;
        }
        if (arg4 && (var8.field1639 == 1 || arg2 != 1) && arg2 != -1) {
            class157.field2652.method1659(class253.method1721((byte) -54, arg2), 0, 9, 16776960, 1);
        }
        class17.method148(var13, var14, var15);
        class17.method163(var16);
        class72.method504();
        class72.field1156 = true;
        return var17;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
    public static void method1784(int arg0) {
        field4570 = null;
        field4572 = null;
        if (arg0 == 32) {
            field4563 = null;
            field4575 = null;
            field4573 = null;
            field4569 = null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(BLvf;II)V")
    private final void method1785(byte arg0, class230 arg1, int arg2, int arg3) {
        int var5 = -26 / ((20 - arg0) / 46);
        field4566++;
        if (arg3 == 1) {
            this.field4567 = class11.method115(124, arg1.method1508(true));
        } else if (arg3 == 2) {
            this.field4576 = arg1.method1516((byte) 82);
        } else if (arg3 == 3) {
            this.field4576 = arg1.method1535(2);
            if (this.field4576 == 65535) {
                this.field4576 = -1;
                return;
            }
        } else if (arg3 == 5) {
            this.field4564 = false;
            return;
        } else if (arg3 == 7) {
            this.field4574 = class11.method115(122, arg1.method1508(true));
            return;
        } else if (arg3 == 8) {
            class157.field2660 = arg2;
            return;
        } else {
            if (arg3 == 9) {
                arg1.method1535(2);
            } else if (arg3 != 10) {
                if (arg3 == 11) {
                    arg1.method1516((byte) 82);
                } else if (arg3 != 12) {
                    if (arg3 == 13) {
                        arg1.method1508(true);
                        return;
                    }
                    if (arg3 == 14) {
                        arg1.method1516((byte) 82);
                        return;
                    }
                }
                return;
            }
            return;
        }
    }
}
