import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class85 {

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    public static int field1577 = 0;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "Lpj;")
    public static class237 field1578 = class33.method353(" steht bereits auf Ihrer Freunde)2Liste(Q", 121);

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    public static int field1579 = 0;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "Lpj;")
    public static class237 field1582 = class33.method353("<col=ffffff>", 107);

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "Lpj;")
    public static class237 field1580 = class33.method353("<col=00ffff>", 15);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "[Lnf;")
    public static class155[] field1581;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
    public static final void method647(int arg0) {
        class41.field927 = arg0;
        for (int var1 = 0; var1 < class224.field3852; var1++) {
            for (int var2 = 0; var2 < class182.field3211; var2++) {
                if (class274.field4775[arg0][var1][var2] == null) {
                    class274.field4775[arg0][var1][var2] = new class35(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "([IIIIII)V")
    public static final void method648(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class35 var6 = class274.field4775[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class254 var7 = var6.field756;
        if (var7 != null) {
            int var8 = var7.field4369;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class132 var10 = var6.field751;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field2328;
        int var12 = var10.field2321;
        int var13 = var10.field2337;
        int var14 = var10.field2316;
        int[] var15 = class245.field4287[var11];
        int[] var16 = class39.field907[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IZ)I")
    public static final int method649(int arg0, boolean arg1) {
        field1576++;
        if (!arg1) {
            return -104;
        } else if (arg0 >= 97 && arg0 <= 122 || arg0 >= 224 && arg0 <= 254 && arg0 != 247) {
            return arg0 - 32;
        } else if (arg0 == 255) {
            return 159;
        } else if (arg0 == 156) {
            return 140;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)V")
    public static void method650(int arg0) {
        field1580 = null;
        field1578 = null;
        field1581 = null;
        field1582 = null;
        if (arg0 != 0) {
            method649(44, false);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIILqe;JZ)V")
    public static final void method651(int arg0, int arg1, int arg2, int arg3, class95 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class232 var8 = new class232();
        var8.field4012 = arg4;
        var8.field4013 = arg1 * 128 + 64;
        var8.field4017 = arg2 * 128 + 64;
        var8.field4016 = arg3;
        var8.field4014 = arg5;
        if (class274.field4775[arg0][arg1][arg2] == null) {
            class274.field4775[arg0][arg1][arg2] = new class35(arg0, arg1, arg2);
        }
        class274.field4775[arg0][arg1][arg2].field753 = var8;
    }
}
