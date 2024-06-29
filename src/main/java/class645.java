import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public class class645 {

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "Ljr;")
    private class112 field8871 = new class112(16);

    @OriginalMember(owner = "client!lca", name = "l", descriptor = "Lin;")
    private class91 field8882;

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "[I")
    public static int[] field8872 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!lca", name = "c", descriptor = "I")
    public static int field8873;

    @OriginalMember(owner = "client!lca", name = "d", descriptor = "I")
    public static int field8874;

    @OriginalMember(owner = "client!lca", name = "e", descriptor = "I")
    public static int field8875;

    @OriginalMember(owner = "client!lca", name = "f", descriptor = "I")
    public static int field8876;

    @OriginalMember(owner = "client!lca", name = "g", descriptor = "I")
    public static int field8877;

    @OriginalMember(owner = "client!lca", name = "h", descriptor = "I")
    public static int field8878;

    @OriginalMember(owner = "client!lca", name = "i", descriptor = "I")
    public static int field8879;

    @OriginalMember(owner = "client!lca", name = "j", descriptor = "I")
    public static int field8880;

    @OriginalMember(owner = "client!lca", name = "k", descriptor = "I")
    public static int field8881;

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(Z)V", line = 3)
    public final void method3658(boolean arg0) {
        field8877++;
        class112 var2 = this.field8871;
        synchronized (this.field8871) {
            if (arg0) {
                this.method3661((byte) 107, 46);
            }
            this.field8871.method996(-119);
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(IIII)Lkda;", line = 18)
    public static final class390 method3659(int arg0, int arg1, int arg2, int arg3) {
        field8878++;
        class384 var4 = class649.field8928[arg2][arg1][arg3];
        if (var4 == null) {
            return null;
        } else if (arg0 == 252) {
            class390 var5 = null;
            int var6 = -1;
            for (class474 var7 = var4.field5567; var7 != null; var7 = var7.field6621) {
                class494 var8 = var7.field6623;
                if (var8 instanceof class390) {
                    class390 var9 = (class390) var8;
                    int var10 = (var9.method2457((byte) 88) - 1) * 256 + 252;
                    int var11 = var9.field5922 - var10 >> 9;
                    int var12 = var9.field5933 - var10 >> 9;
                    int var13 = var9.field5922 + var10 >> 9;
                    int var14 = var9.field5933 + var10 >> 9;
                    if (var11 <= arg1 && arg3 >= var12 && arg1 <= var13 && arg3 <= var14) {
                        int var15 = (var14 + 1 - arg3) * (var13 + 1 - arg1);
                        if (var15 > var6) {
                            var6 = var15;
                            var5 = var9;
                        }
                    }
                }
            }
            return var5;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(III)I", line = 78)
    public static final int method3660(int arg0, int arg1, int arg2) {
        field8873++;
        int var3 = arg1;
        while (arg0 > 0) {
            var3 = arg2 & 0x1 | var3 << 1;
            arg0--;
            arg2 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(BI)V", line = 96)
    public final void method3661(byte arg0, int arg1) {
        class112 var3 = this.field8871;
        synchronized (this.field8871) {
            this.field8871.method987(2, arg1);
            if (arg0 <= 8) {
                method3668(91, -94, 117, 24, 39, -100, null);
            }
        }
        field8879++;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(II)Lwia;", line = 109)
    private final class756 method3662(int arg0, int arg1) {
        field8880++;
        class112 var3 = this.field8871;
        class756 var4;
        synchronized (this.field8871) {
            var4 = (class756) this.field8871.method992((long) arg0, 116);
        }
        if (var4 != null) {
            return var4;
        }
        class91 var5 = this.field8882;
        byte[] var6;
        synchronized (this.field8882) {
            var6 = this.field8882.method863(-1860, arg1, arg0);
        }
        class756 var7 = new class756();
        if (var6 != null) {
            var7.method4220(new class215(var6), (byte) -123);
        }
        class112 var8 = this.field8871;
        synchronized (this.field8871) {
            this.field8871.method991(var7, (long) arg0, (byte) -106);
            return var7;
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)V", line = 137)
    public static final void method3663(int arg0) {
        class344.field4819.method999(0);
        int var1 = -67 / ((arg0 - 39) / 33);
        field8881++;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(B)V", line = 148)
    public final void method3664(byte arg0) {
        class112 var2 = this.field8871;
        synchronized (this.field8871) {
            this.field8871.method999(0);
        }
        if (arg0 >= -13) {
            method3667(14);
        }
        field8874++;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(IIIILhq;I)Lwr;", line = 162)
    public final class458 method3665(int arg0, int arg1, int arg2, int arg3, class160 arg4, int arg5) {
        field8875++;
        class707[] var7 = null;
        class756 var8 = this.method3662(arg5, 29);
        if (arg3 > -36) {
            return null;
        }
        if (var8.field10558 != null) {
            var7 = new class707[var8.field10558.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class479 var10 = arg4.method1226(var8.field10558[var9], 29);
                var7[var9] = new class707(var10.field6667, var10.field6673, var10.field6668, var10.field6671, var10.field6677, var10.field6670, var10.field6672, var10.field6676);
            }
        }
        return new class458(var8.field10554, var7, var8.field10560, arg2, arg0, arg1);
    }

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "(I)V", line = 199)
    public static final void method3666(int arg0) {
        class53.field1096 = arg0;
        for (int var1 = 0; var1 < class434.field6208; var1++) {
            for (int var2 = 0; var2 < class432.field6185; var2++) {
                if (class649.field8928[arg0][var1][var2] == null) {
                    class649.field8928[arg0][var1][var2] = new class384(arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lca", name = "c", descriptor = "(I)V", line = 224)
    public static void method3667(int arg0) {
        field8872 = null;
        if (arg0 > -73) {
            field8872 = null;
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(IIIIIILha;)V", line = 237)
    public static final void method3668(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class59 arg6) {
        if ((class558.field7734 == null || class594.field8132 == null || class594.field8133 == null) && class569.field7819.method874(false, class390.field5683) && class569.field7819.method874(false, class464.field6516) && class569.field7819.method874(false, class334.field4704)) {
            class267 var7 = class267.method1780(class569.field7819, class464.field6516, 0);
            class594.field8132 = arg6.method356(var7, true);
            var7.method1777();
            class604.field8281 = arg6.method356(var7, true);
            class558.field7734 = arg6.method356(class267.method1780(class569.field7819, class390.field5683, 0), true);
            class267 var8 = class267.method1780(class569.field7819, class334.field4704, 0);
            class594.field8133 = arg6.method356(var8, true);
            var8.method1777();
            class145.field2400 = arg6.method356(var8, true);
        }
        field8876++;
        if (class558.field7734 != null && class594.field8132 != null && class594.field8133 != null) {
            int var9 = (arg2 - (class594.field8133.method1626() * 2)) / class558.field7734.method1626();
            for (int var10 = 0; var10 < var9; var10++) {
                class558.field7734.method2925(arg1 + (class594.field8133.method1626() + (var10 * class558.field7734.method1626())), -class558.field7734.method1619() + arg3 + arg5);
            }
            int var11 = (arg3 - (arg0 + class594.field8133.method1619())) / class594.field8132.method1619();
            for (int var12 = 0; var12 < var11; var12++) {
                class594.field8132.method2925(arg1, class594.field8132.method1619() * var12 + arg0 + arg5);
                class604.field8281.method2925(arg2 + arg1 - class604.field8281.method1626(), class594.field8132.method1619() * var12 + arg0 + arg5);
            }
            class594.field8133.method2925(arg1, arg5 + arg3 - class594.field8133.method1619());
            class145.field2400.method2925(arg1 + arg2 - class594.field8133.method1626(), arg5 - (-arg3 + class594.field8133.method1619()));
        }
        int var13 = -24 % ((arg4 - 85) / 35);
    }

    @OriginalMember(owner = "client!lca", name = "<init>", descriptor = "(Lsj;ILin;)V", line = 300)
    public class645(class460 arg0, int arg1, class91 arg2) {
        this.field8882 = arg2;
        this.field8882.method860(0, 29);
    }
}
