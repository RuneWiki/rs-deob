import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class183 extends class502 {

    @OriginalMember(owner = "client!gw", name = "n", descriptor = "[I")
    public static int[] field2848 = new int[256];

    @OriginalMember(owner = "client!gw", name = "i", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!gw", name = "k", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!gw", name = "l", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!gw", name = "m", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!gw", name = "o", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!gw", name = "p", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!gw", name = "q", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!gw", name = "r", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!gw", name = "j", descriptor = "[I")
    public static int[] field2844;

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "(II)V")
    public final void method52(int arg0, int arg1) {
        super.field6865 = arg0;
        ++field2843;
        if (arg1 != 0) {
            method1363((class66) null, 69, -38, -19, 83, 27, -43, false, true);
        }
    }

    @OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(Leka;)V")
    public class183(class492 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lha;IIIIIIZZ)V")
    public static final void method1363(class66 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        class112.field2107 = arg0;
        class341.field4602 = arg1;
        class120.field2186 = class341.field4602 > 1 && class112.field2107.method566();
        class654.field9055 = arg2;
        class365.field4955 = 1 << class654.field9055;
        class370.field5022 = class365.field4955 >> 1;
        Math.sqrt((double) (class370.field5022 * class370.field5022 + class370.field5022 * class370.field5022));
        class62.field856 = arg3;
        class441.field5980 = arg4;
        class375.field5083 = arg5;
        class389.field5342 = arg6;
        class47.field731 = class29.method186(-123);
        class81.method668(123);
        class224.field3279 = new class549[arg3][class441.field5980][class375.field5083];
        class142.field2418 = new class296[arg3];
        if (arg7) {
            class625.field8717 = new int[class441.field5980][class375.field5083];
            class603.field8438 = new byte[class441.field5980][class375.field5083];
            class240.field3420 = new short[class441.field5980][class375.field5083];
            class1.field1 = new class549[1][class441.field5980][class375.field5083];
            class178.field2805 = new class296[1];
        } else {
            class625.field8717 = null;
            class603.field8438 = null;
            class240.field3420 = null;
            class1.field1 = null;
            class178.field2805 = null;
        }
        if (arg8) {
            class227.field3295 = new long[arg3][arg4][arg5];
            class98.field1601 = new class199[65535];
            class444.field6025 = new boolean[65535];
            class155.field2534 = 0;
        } else {
            class227.field3295 = null;
            class98.field1601 = null;
            class444.field6025 = null;
            class155.field2534 = 0;
        }
        class5.method29(false);
        class451.field6179 = new class543[2];
        class684.field9523 = new class543[2];
        class265.field3738 = new class543[2];
        class222.field3246 = new class543[10000];
        class590.field8308 = 0;
        class666.field9266 = new class543[5000];
        class28.field530 = 0;
        class22.field466 = new class597[5000];
        class171.field2726 = 0;
        class641.field8883 = new boolean[class389.field5342 + class389.field5342 + 1][class389.field5342 + class389.field5342 + 1];
        class657.field9097 = new boolean[class389.field5342 + class389.field5342 + 2][class389.field5342 + class389.field5342 + 2];
        class534.field7232 = new int[class389.field5342 + class389.field5342 + 2];
        class677.field9437 = class677.field9436;
        if (class120.field2186) {
            class580.field8201 = new boolean[arg3][class389.field5342 + class389.field5342 + 1][class389.field5342 + class389.field5342 + 1];
            class686.field9545 = new boolean[arg3][][];
            if (class34.field571 != null) {
                class25.method165();
            }
            class34.field571 = new class432[class341.field4602];
            class112.field2107.method573(class34.field571.length + 1);
            class112.field2107.method545(0);
            for (int var9 = 0; var9 < class34.field571.length; ++var9) {
                class34.field571[var9] = new class432(var9 + 1, class112.field2107);
                (new Thread(class34.field571[var9], "wr" + var9)).start();
            }
            byte var10;
            if (class341.field4602 == 2) {
                var10 = 4;
                class360.field4913 = 2;
            } else if (class341.field4602 == 3) {
                var10 = 6;
                class360.field4913 = 3;
            } else {
                var10 = 8;
                class360.field4913 = 4;
            }
            class102.field1651 = new class652[var10];
            for (int var11 = 0; var11 < var10; ++var11) {
                class102.field1651[var11] = new class652(class473.field6415[class341.field4602 - 2][var11]);
            }
        } else {
            class360.field4913 = 1;
        }
        class324.field4438 = new int[class360.field4913 - 1];
        class720.field9895 = new int[class360.field4913 - 1];
    }

    @OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(ILeka;)V")
    public class183(int arg0, class492 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "(B)I")
    public final int method1364(byte arg0) {
        if (arg0 < 49) {
            method1363((class66) null, -18, 38, 63, 61, 30, -84, false, false);
        }
        ++field2845;
        return super.field6865;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lfca;I)Ljb;")
    public static final class521 method1365(class93 arg0, int arg1) {
        ++field2849;
        class521 var2 = new class521();
        var2.field7061 = arg0.method763(102);
        if (arg1 != 2) {
            field2844 = null;
        }
        var2.field7063 = class530.field7179.method1747(1, var2.field7061);
        return var2;
    }

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "(I)Z")
    public final boolean method1366(int arg0) {
        ++field2846;
        if (arg0 != 0) {
            field2848 = null;
        }
        return !super.field6863.method2830((byte) 99);
    }

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "(I)V")
    public static void method1367(int arg0) {
        field2844 = null;
        field2848 = null;
        if (arg0 != -1478) {
            field2848 = null;
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(JI)I")
    public static final int method1368(long arg0, int arg1) {
        class127.method1087((byte) 83, arg0);
        ++field2850;
        int var3 = 30 % ((arg1 - -3) / 63);
        return class60.field821.get(1);
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)I")
    public final int method55(int arg0) {
        if (arg0 != -2) {
            field2848 = null;
        }
        ++field2852;
        if (super.field6863.method2830((byte) 113)) {
            return 2;
        } else {
            return super.field6863.field6725.method3781((byte) -127) && class284.method1824(102, super.field6863.field6725.method3784((byte) 96)) ? 1 : 0;
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(Z)V")
    public final void method58(boolean arg0) {
        ++field2851;
        if (super.field6863.method2830((byte) 100)) {
            super.field6865 = 2;
        }
        if (~super.field6865 > -1 || super.field6865 > 2) {
            super.field6865 = this.method55(-2);
        }
        if (!arg0) {
            field2848 = null;
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(II)I")
    public final int method57(int arg0, int arg1) {
        ++field2847;
        if (arg1 != 0) {
            return -36;
        } else {
            return super.field6863.method2830((byte) 125) ? 3 : 1;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; ++var0) {
            int var1 = var0;
            for (int var2 = 0; ~var2 > -9; ++var2) {
                if (~(var1 & 1) == -2) {
                    var1 = -306674912 ^ var1 >>> 1;
                } else {
                    var1 >>>= 1;
                }
            }
            field2848[var0] = var1;
        }
    }
}
