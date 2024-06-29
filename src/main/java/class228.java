import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class228 {

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "J")
    public static long field3832 = 0L;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "Lwc;")
    public static class96 field3831 = new class96(5000);

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "Lbe;")
    public static class283 field3836 = null;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "Lbe;")
    public static class283 field3840 = class153.method941(126, " )2> ");

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "Z")
    public static boolean field3839 = true;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
    public static int field3838 = 0;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "F")
    public static float field3833;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "Lrh;")
    public static class128 field3837;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "Lek;")
    public static class172 field3842;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "[[[I")
    public static int[][][] field3834;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V", line = 17)
    public static void method1491(int arg0) {
        field3842 = null;
        field3834 = (int[][][]) null;
        field3837 = null;
        field3831 = null;
        field3840 = null;
        field3836 = null;
        if (arg0 != -1) {
            field3838 = -75;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZILek;BI)V", line = 35)
    public static final void method1492(int arg0, boolean arg1, int arg2, class172 arg3, byte arg4, int arg5) {
        class281.field4722 = arg5;
        field3841++;
        if (arg4 != 113) {
            field3831 = (class96) null;
        }
        class203.field3465 = arg0;
        class175.field3016 = arg1;
        class107.field1818 = 10000;
        class113.field1909 = arg2;
        class237.field3965 = 1;
        class220.field3709 = arg3;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIBIII)V", line = 74)
    public static final void method1493(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        int var6 = -43 / ((-arg2 - 84) / 38);
        if (arg5 <= class247.field4220 && class217.field3677 <= arg1) {
            boolean var7;
            if (class269.field4551 > arg4) {
                var7 = false;
                arg4 = class269.field4551;
            } else if (class166.field2765 >= arg4) {
                var7 = true;
            } else {
                var7 = false;
                arg4 = class166.field2765;
            }
            boolean var8;
            if (arg3 < class269.field4551) {
                var8 = false;
                arg3 = class269.field4551;
            } else if (class166.field2765 >= arg3) {
                var8 = true;
            } else {
                arg3 = class166.field2765;
                var8 = false;
            }
            if (class217.field3677 <= arg5) {
                class114.method742(30197, arg4, class97.field1636[arg5++], arg3, arg0);
            } else {
                arg5 = class217.field3677;
            }
            if (class247.field4220 >= arg1) {
                class114.method742(30197, arg4, class97.field1636[arg1--], arg3, arg0);
            } else {
                arg1 = class247.field4220;
            }
            if (var7 && var8) {
                for (int var9 = arg5; var9 <= arg1; var9++) {
                    int[] var10 = class97.field1636[var9];
                    var10[arg4] = var10[arg3] = arg0;
                }
            } else if (var7) {
                for (int var12 = arg5; var12 <= arg1; var12++) {
                    class97.field1636[var12][arg4] = arg0;
                }
            } else if (var8) {
                for (int var11 = arg5; var11 <= arg1; var11++) {
                    class97.field1636[var11][arg3] = arg0;
                }
            }
        }
        field3843++;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V", line = 181)
    public static final void method1494(byte arg0) {
        if (arg0 >= -34) {
            return;
        }
        field3835++;
        for (class296 var1 = (class296) class259.field4412.method1812((byte) 106); var1 != null; var1 = (class296) class259.field4412.method1813((byte) 77)) {
            class301 var2 = var1.field5015;
            if (class61.field850 != var2.field5072 || var2.field5073) {
                var1.method557((byte) -89);
            } else if (var2.field5088 <= class75.field1309) {
                var2.method2038((byte) -3, class44.field606);
                if (var2.field5073) {
                    var1.method557((byte) -89);
                } else {
                    class81.method532(var2.field5072, var2.field5091, var2.field5081, var2.field5090, 60, var2, 0, -1L, false);
                }
            }
        }
    }
}
