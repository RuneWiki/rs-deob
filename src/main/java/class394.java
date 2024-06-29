import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class394 extends class10 {

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "[I")
    public int[] field5791;

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "[I")
    public int[] field5792;

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "[[I")
    public static int[][] field5790 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!wm", name = "i", descriptor = "I")
    public static int field5793;

    @OriginalMember(owner = "client!wm", name = "j", descriptor = "I")
    public static int field5794;

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "[[I")
    public static int[][] field5789;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)V")
    public static void method2413(byte arg0) {
        field5790 = null;
        field5789 = null;
        int var1 = 102 % ((arg0 + 79) / 39);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lr;IIII)V")
    public static final void method2414(class121 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 >= -99) {
            return;
        }
        field5793++;
        class531 var5 = arg0.method969(-1);
        int var6 = arg0.field1748 - arg0.field1718.field4545 & 0x3FFF;
        if (arg1 == -1) {
            if (var6 != 0 || arg0.field1705 > 25) {
                arg0.field1743 = false;
                if (arg3 < 0 && var5.field7778 != -1) {
                    arg0.field1763 = var5.field7778;
                } else if (arg3 <= 0 || var5.field7809 == -1) {
                    arg0.field1763 = var5.field7818;
                } else {
                    arg0.field1763 = var5.field7809;
                }
            } else if (!arg0.field1743 || !var5.method3138((byte) 8, arg0.field1763)) {
                arg0.field1763 = var5.method3133(true);
                arg0.field1743 = arg0.field1763 != -1;
            }
        } else if (arg0.field1713 != -1 && var6 >= 10240 || var6 <= 2048) {
            int var7 = class315.field4486[arg2] - arg0.field1718.field4545 & 0x3FFF;
            arg0.field1743 = false;
            if (arg1 == 2 && var5.field7785 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field7781 != -1) {
                    arg0.field1763 = var5.field7781;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field7805 != -1) {
                    arg0.field1763 = var5.field7805;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field7771 == -1) {
                    arg0.field1763 = var5.field7785;
                } else {
                    arg0.field1763 = var5.field7771;
                }
            } else if (arg1 == 0 && var5.field7783 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field7808 != -1) {
                    arg0.field1763 = var5.field7808;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field7791 != -1) {
                    arg0.field1763 = var5.field7791;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field7799 == -1) {
                    arg0.field1763 = var5.field7783;
                } else {
                    arg0.field1763 = var5.field7799;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field7773 != -1) {
                arg0.field1763 = var5.field7773;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field7798 != -1) {
                arg0.field1763 = var5.field7798;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field7824 == -1) {
                arg0.field1763 = var5.field7818;
            } else {
                arg0.field1763 = var5.field7824;
            }
        } else if (var6 == 0 && arg0.field1705 <= 25) {
            arg0.field1743 = false;
            if (arg1 == 2 && var5.field7785 != -1) {
                arg0.field1763 = var5.field7785;
            } else if (arg1 == 0 && var5.field7783 != -1) {
                arg0.field1763 = var5.field7783;
            } else {
                arg0.field1763 = var5.field7818;
            }
        } else {
            arg0.field1743 = false;
            if (arg1 == 2 && var5.field7785 != -1) {
                if (arg3 < 0 && var5.field7806 != -1) {
                    arg0.field1763 = var5.field7806;
                } else if (arg3 <= 0 || var5.field7794 == -1) {
                    arg0.field1763 = var5.field7785;
                } else {
                    arg0.field1763 = var5.field7794;
                }
            } else if (arg1 == 0 && var5.field7783 != -1) {
                if (arg3 < 0 && var5.field7772 != -1) {
                    arg0.field1763 = var5.field7772;
                } else if (arg3 <= 0 || var5.field7788 == -1) {
                    arg0.field1763 = var5.field7783;
                } else {
                    arg0.field1763 = var5.field7788;
                }
            } else if (arg3 < 0 && var5.field7784 != -1) {
                arg0.field1763 = var5.field7784;
            } else if (arg3 <= 0 || var5.field7800 == -1) {
                arg0.field1763 = var5.field7818;
            } else {
                arg0.field1763 = var5.field7800;
            }
        }
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(II[I[I)V")
    public class394(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field5791 = arg3;
        this.field5792 = arg2;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IB)V")
    public static final void method2415(int arg0, byte arg1) {
        if (arg1 >= -14) {
            return;
        }
        for (class223 var2 = class519.field7638.method880((byte) -23); var2 != null; var2 = class519.field7638.method879((byte) -20)) {
            if ((long) arg0 == (var2.field3271 >> 48 & 0xFFFFL)) {
                var2.method1525((byte) 75);
            }
        }
        field5794++;
    }
}
