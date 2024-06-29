import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class130 extends class157 {

    @OriginalMember(owner = "client!ob", name = "O", descriptor = "I")
    private int field2490 = 4;

    @OriginalMember(owner = "client!ob", name = "W", descriptor = "I")
    private int field2498 = 4;

    @OriginalMember(owner = "client!ob", name = "Q", descriptor = "Lcc;")
    public static class209 field2492 = class95.method669(117, "headicons_pk");

    @OriginalMember(owner = "client!ob", name = "N", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!ob", name = "P", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!ob", name = "R", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!ob", name = "S", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!ob", name = "V", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!ob", name = "X", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!ob", name = "T", descriptor = "Lsj;")
    public static class49 field2495;

    @OriginalMember(owner = "client!ob", name = "U", descriptor = "[Lal;")
    public static class231[] field2496;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IZIIII)V")
    public static final void method927(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1) {
            if (class155.field2847 >= arg5 && ~class102.field1957 >= ~arg2) {
                boolean var6;
                if (class262.field4723 > arg3) {
                    arg3 = class262.field4723;
                    var6 = false;
                } else if (class230.field4184 >= arg3) {
                    var6 = true;
                } else {
                    var6 = false;
                    arg3 = class230.field4184;
                }
                boolean var7;
                if (arg0 >= class262.field4723) {
                    if (arg0 <= class230.field4184) {
                        var7 = true;
                    } else {
                        var7 = false;
                        arg0 = class230.field4184;
                    }
                } else {
                    arg0 = class262.field4723;
                    var7 = false;
                }
                if (~arg5 > ~class102.field1957) {
                    arg5 = class102.field1957;
                } else {
                    class176.method1215(arg3, arg4, class252.field4543[arg5++], arg0, (byte) -69);
                }
                if (class155.field2847 >= arg2) {
                    class176.method1215(arg3, arg4, class252.field4543[arg2--], arg0, (byte) 107);
                } else {
                    arg2 = class155.field2847;
                }
                if (var6 && var7) {
                    for (int var8 = arg5; ~var8 >= ~arg2; ++var8) {
                        int[] var9 = class252.field4543[var8];
                        var9[arg3] = var9[arg0] = arg4;
                    }
                } else if (!var6) {
                    if (var7) {
                        for (int var10 = arg5; var10 <= arg2; ++var10) {
                            class252.field4543[var10][arg0] = arg4;
                        }
                    }
                } else {
                    for (int var11 = arg5; ~var11 >= ~arg2; ++var11) {
                        class252.field4543[var11][arg3] = arg4;
                    }
                }
            }
            ++field2489;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)[[I")
    public final int[][] method250(int arg0, int arg1) {
        int[][] var3 = super.field2872.method533(arg1, 3);
        if (super.field2872.field1434) {
            int var4 = class226.field4124 / this.field2498;
            int var5 = class79.field1469 / this.field2490;
            int[][] var7;
            if (~var5 < -1) {
                int var6 = arg1 % var5;
                var7 = this.method1093(class79.field1469 * var6 / var5, 0, 64);
            } else {
                var7 = this.method1093(0, 0, arg0 ^ 65);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[2];
            int[] var10 = var7[1];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; class226.field4124 > var14; ++var14) {
                int var15;
                if (var4 <= 0) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class226.field4124 * var16 / var4;
                }
                var11[var14] = var8[var15];
                var12[var14] = var10[var15];
                var13[var14] = var9[var15];
            }
        }
        if (arg0 != 1) {
            this.method4((byte) 104, -65);
        }
        ++field2494;
        return var3;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IBLtf;)V")
    public final void method1(int arg0, byte arg1, class106 arg2) {
        ++field2491;
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                this.field2490 = arg2.method774((byte) 86);
            }
        } else {
            this.field2498 = arg2.method774((byte) 97);
        }
        if (arg1 >= -29) {
            field2497 = 44;
        }
    }

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "(I)V")
    public static void method928(int arg0) {
        field2496 = null;
        field2492 = null;
        field2495 = null;
        if (arg0 != -1) {
            method927(-127, true, -45, 110, 30, -19);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BI)[I")
    public final int[] method4(byte arg0, int arg1) {
        if (arg0 != -98) {
            this.field2498 = -48;
        }
        ++field2499;
        int[] var3 = super.field2879.method1269(arg1, 17885);
        if (super.field2879.field3363) {
            int var4 = class226.field4124 / this.field2498;
            int var5 = class79.field1469 / this.field2490;
            int[] var6;
            if (~var5 >= -1) {
                var6 = this.method1097((byte) 75, 0, 0);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method1097((byte) 75, 0, class79.field1469 * var7 / var5);
            }
            for (int var8 = 0; var8 < class226.field4124; ++var8) {
                if (~var4 < -1) {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class226.field4124 * var9 / var4];
                } else {
                    var3[var8] = var6[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
    public class130() {
        super(1, false);
    }
}
