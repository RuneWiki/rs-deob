import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class247 extends class83 {

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "I")
    public int field4050;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "I")
    public int field4051;

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "Lrc;")
    public static class9 field4056 = new class9(50);

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "I")
    public static int field4057 = 0;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIILtb;JZ)V")
    public static final void method1650(int arg0, int arg1, int arg2, int arg3, class184 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class11 var8 = new class11();
        var8.field158 = arg4;
        var8.field161 = arg1 * 128 + 64;
        var8.field154 = arg2 * 128 + 64;
        var8.field163 = arg3;
        var8.field159 = arg5;
        if (class79.field1367[arg0][arg1][arg2] == null) {
            class79.field1367[arg0][arg1][arg2] = new class109(arg0, arg1, arg2);
        }
        class79.field1367[arg0][arg1][arg2].field1978 = var8;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIIIZ)V")
    private static final void method1651(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field4052++;
        if (arg4 >= 1 && arg1 >= 1 && arg4 <= 102 && arg1 <= 102) {
            if (!class96.method610(0) && (class229.field3862[0][arg4][arg1] & 0x2) == 0) {
                int var8 = arg0;
                if ((class229.field3862[arg0][arg4][arg1] & 0x8) != 0) {
                    var8 = 0;
                }
                if (class145.field2476 != var8) {
                    return;
                }
            }
            int var9 = arg0;
            if (arg0 < 3 && (class229.field3862[1][arg4][arg1] & 0x2) == 2) {
                var9 = arg0 + 1;
            }
            class57.method352(arg0, var9, arg1, class99.field1699[arg0], -62, arg5, arg4);
            if (arg3 >= 0) {
                boolean var10 = class172.field2828;
                class172.field2828 = true;
                class29.method193(arg2, var9, false, arg6, arg1, false, class99.field1699[arg0], 335442796, arg4, arg3, arg0);
                class172.field2828 = var10;
            }
        }
        if (arg7) {
            field4057 = -103;
        }
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(I)V")
    public static void method1652(int arg0) {
        if (arg0 != -1) {
            method1653(-128L, 126);
        }
        field4056 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(JI)V")
    public static final void method1653(long arg0, int arg1) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
        field4053++;
        if (arg1 != -1) {
            method1652(-49);
        }
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(II)V")
    public class247(int arg0, int arg1) {
        this.field4050 = arg0;
        this.field4051 = arg1;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILvh;)V")
    public static final void method1654(int arg0, class108 arg1) {
        class258.field4219 = arg1;
        field4055++;
        if (arg0 != 0) {
            field4057 = -69;
        }
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(I)V")
    public static final void method1655(int arg0) {
        field4049++;
        if (arg0 != -1) {
            field4057 = -118;
        }
        for (class103 var1 = (class103) class49.field849.method379(6347); var1 != null; var1 = (class103) class49.field849.method378(arg0 ^ 0xFFFFFFD2)) {
            if (var1.field1804 > 0) {
                var1.field1804--;
            }
            if (var1.field1804 != 0) {
                if (var1.field1808 > 0) {
                    var1.field1808--;
                }
                if (var1.field1808 == 0 && var1.field1803 >= 1 && var1.field1815 >= 1 && var1.field1803 <= 102 && var1.field1815 <= 102 && (var1.field1806 < 0 || class119.method819(var1.field1814, var1.field1806, (byte) -118))) {
                    method1651(var1.field1800, var1.field1815, var1.field1813, var1.field1806, var1.field1803, var1.field1817, var1.field1814, false);
                    var1.field1808 = -1;
                    if (var1.field1811 == var1.field1806 && var1.field1811 == -1) {
                        var1.method547(10026);
                    } else if (var1.field1811 == var1.field1806 && var1.field1813 == var1.field1802 && var1.field1814 == var1.field1812) {
                        var1.method547(10026);
                    }
                }
            } else if (var1.field1811 < 0 || class119.method819(var1.field1812, var1.field1811, (byte) -122)) {
                method1651(var1.field1800, var1.field1815, var1.field1802, var1.field1811, var1.field1803, var1.field1817, var1.field1812, false);
                var1.method547(10026);
            }
        }
    }
}
