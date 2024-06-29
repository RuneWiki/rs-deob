import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class151 extends class168 {

    @OriginalMember(owner = "client!nj", name = "A", descriptor = "I")
    private final int field2724;

    @OriginalMember(owner = "client!nj", name = "u", descriptor = "I")
    private final int field2718;

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "I")
    private final int field2713;

    @OriginalMember(owner = "client!nj", name = "E", descriptor = "I")
    private final int field2728;

    @OriginalMember(owner = "client!nj", name = "t", descriptor = "[J")
    public static long[] field2717 = new long[256];

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "I")
    public static int field2714 = 127;

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "Lqe;")
    public static class179 field2715 = class206.method1380("Die Adresse dieses Computers wurde gesperrt)1", (byte) 20);

    @OriginalMember(owner = "client!nj", name = "B", descriptor = "Lqe;")
    public static class179 field2725 = class206.method1380("(Udns", (byte) 93);

    @OriginalMember(owner = "client!nj", name = "F", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!nj", name = "G", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!nj", name = "s", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!nj", name = "v", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!nj", name = "w", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!nj", name = "x", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!nj", name = "y", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!nj", name = "z", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!nj", name = "C", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!nj", name = "D", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!nj", name = "H", descriptor = "Leh;")
    public static class52 field2731;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V")
    public static void method961(byte arg0) {
        field2725 = null;
        field2731 = null;
        field2715 = null;
        if (arg0 > -105) {
            method966(-39, -104, 34, 18, -63, 66);
        }
        field2717 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIB)V")
    public final void method471(int arg0, int arg1, byte arg2) {
        ++field2720;
        int var4 = -15 % ((-55 - arg2) / 63);
        int var5 = this.field2724 * arg1 >> 12;
        int var6 = this.field2728 * arg1 >> 12;
        int var7 = this.field2713 * arg0 >> 12;
        int var8 = this.field2718 * arg0 >> 12;
        class219.method1432(var7, 88, var8, super.field3027, var5, super.field3033, var6);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZLqe;B)V")
    public static final void method962(boolean arg0, class179 arg1, byte arg2) {
        short[] var3 = new short[16];
        class179 var4 = arg1.method1170(40);
        ++field2726;
        int var5 = 0;
        for (int var6 = 0; var6 < class59.field1266; ++var6) {
            class15 var9 = class131.method835((byte) -20, var6);
            if ((!arg0 || var9.field375) && ~var9.field431 == 0 && var9.field409 == -1 && ~var9.field399 == -1 && ~var9.field418.method1170(40).method1128(0, var4) != 0) {
                if (var5 >= 250) {
                    class162.field2928 = null;
                    class110.field2055 = -1;
                    return;
                }
                if (~var5 <= ~var3.length) {
                    short[] var10 = new short[var3.length * 2];
                    for (int var11 = 0; var5 > var11; ++var11) {
                        var10[var11] = var3[var11];
                    }
                    var3 = var10;
                }
                var3[var5++] = (short) var6;
            }
        }
        class236.field4343 = 0;
        class110.field2055 = var5;
        class179[] var7 = new class179[class110.field2055];
        class162.field2928 = var3;
        int var8 = 0;
        if (arg2 >= -83) {
            method965(45, 64);
        }
        while (class110.field2055 > var8) {
            var7[var8] = class131.method835((byte) -20, var3[var8]).field418;
            ++var8;
        }
        class10.method67(0, class162.field2928, var7);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIII)V")
    public static final void method963(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2727;
        int var5 = 0;
        int var6 = -arg1;
        int var7 = arg1;
        int var8 = -1;
        int var9 = class56.method391(16777215, class40.field869, class235.field4336, arg1 + arg3);
        int var10 = class56.method391(arg4 ^ -16777216, class40.field869, class235.field4336, -arg1 + arg3);
        class23.method161(var9, arg4, arg0, var10, class14.field331[arg2]);
        while (var7 > var5) {
            var8 += 2;
            var6 += var8;
            if (~var6 < -1) {
                --var7;
                int var11 = -var7 + arg2;
                int var12 = arg2 + var7;
                var6 -= var7 << 1;
                if (~class168.field3037 >= ~var12 && class70.field1403 >= var11) {
                    int var13 = class56.method391(arg4 + 16777216, class40.field869, class235.field4336, arg3 + var5);
                    int var14 = class56.method391(16777215, class40.field869, class235.field4336, arg3 - var5);
                    if (~var12 >= ~class70.field1403) {
                        class23.method161(var13, arg4, arg0, var14, class14.field331[var12]);
                    }
                    if (~var11 <= ~class168.field3037) {
                        class23.method161(var13, arg4, arg0, var14, class14.field331[var11]);
                    }
                }
            }
            ++var5;
            int var15 = arg2 + var5;
            int var16 = -var5 + arg2;
            if (var15 >= class168.field3037 && ~var16 >= ~class70.field1403) {
                int var17 = class56.method391(16777215, class40.field869, class235.field4336, arg3 + var7);
                int var18 = class56.method391(16777215, class40.field869, class235.field4336, -var7 + arg3);
                if (~class70.field1403 <= ~var15) {
                    class23.method161(var17, -1, arg0, var18, class14.field331[var15]);
                }
                if (class168.field3037 <= var16) {
                    class23.method161(var17, arg4, arg0, var18, class14.field331[var16]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZII)V")
    public final void method473(boolean arg0, int arg1, int arg2) {
        ++field2711;
        int var4 = this.field2724 * arg1 >> 12;
        if (arg0) {
            field2729 = -123;
        }
        int var5 = this.field2728 * arg1 >> 12;
        int var6 = this.field2713 * arg2 >> 12;
        int var7 = this.field2718 * arg2 >> 12;
        class222.method1438(super.field3026, arg0, var4, var5, var7, var6);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)V")
    public final void method474(int arg0, int arg1, int arg2) {
        ++field2719;
        int var4 = this.field2724 * arg1 >> 12;
        int var5 = this.field2728 * arg1 >> 12;
        if (arg0 != 24730) {
            method962(false, (class179) null, (byte) -64);
        }
        int var6 = this.field2718 * arg2 >> 12;
        int var7 = this.field2713 * arg2 >> 12;
        class62.method417(var6, var7, super.field3027, -4, super.field3033, super.field3026, var4, var5);
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)V")
    public static final void method964(int arg0) {
        int var1 = 100 % ((arg0 - -31) / 57);
        for (int var2 = 0; var2 < class186.field3456; ++var2) {
            int var3 = class233.field4297[var2];
            class188 var4 = class53.field1152[var3];
            if (var4 != null) {
                class2.method12((byte) 115, var4.field3496.field3303, var4);
            }
        }
        ++field2721;
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(IIIIIII)V")
    public class151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2724 = arg0;
        this.field2718 = arg1;
        this.field2713 = arg3;
        this.field2728 = arg2;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)V")
    public static final void method965(int arg0, int arg1) {
        class217 var2 = class232.field4266;
        synchronized (class232.field4266) {
            class196.field3635 = arg0;
        }
        ++field2722;
        if (arg1 != 9408) {
            method965(-117, 57);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIII)V")
    public static final void method966(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2712;
        int var6 = class56.method391(16777215, class70.field1403, class168.field3037, arg3);
        int var7 = class56.method391(16777215, class70.field1403, class168.field3037, arg4);
        int var8 = class56.method391(16777215, class40.field869, class235.field4336, arg5);
        int var9 = class56.method391(arg2 + 16777215, class40.field869, class235.field4336, arg0);
        if (arg2 == 0) {
            for (int var10 = var6; var7 >= var10; ++var10) {
                class23.method161(var9, -1, arg1, var8, class14.field331[var10]);
            }
        }
    }

    static {
        for (int var0 = 0; ~var0 > -257; ++var0) {
            long var1 = (long) var0;
            for (int var3 = 0; ~var3 > -9; ++var3) {
                if (~(var1 & 1L) != -2L) {
                    var1 >>>= 1;
                } else {
                    var1 = -3932672073523589310L ^ var1 >>> 1;
                }
            }
            field2717[var0] = var1;
        }
        field2729 = -1;
        field2730 = 0;
    }
}
