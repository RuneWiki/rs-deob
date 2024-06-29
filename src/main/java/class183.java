import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class183 {

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "[I")
    public static int[] field2967 = new int[256];

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "Lpe;")
    public static class277 field2965 = new class277(5000);

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "I")
    public static int field2971 = 0;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "[F")
    public static float[] field2972 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
    public static int field2974 = 0;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "[[[I")
    public static int[][][] field2973;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)Lun;", line = 7)
    public static final class190 method1339(byte arg0) {
        field2964++;
        int var1 = class81.field1103[0] * class213.field3355[0];
        byte[] var2 = class207.field3298[0];
        class190 var6;
        if (class18.field300[0]) {
            byte[] var3 = class193.field3083[0];
            int[] var4 = new int[var1];
            for (int var5 = 0; var5 < var1; var5++) {
                var4[var5] = class214.method1562(class81.field1101[class333.method2319(255, var2[var5])], class333.method2319(255, var3[var5]) << 24);
            }
            var6 = new class186(class243.field3796, class126.field1825, class119.field1659[0], class206.field3261[0], class213.field3355[0], class81.field1103[0], var4);
        } else {
            int[] var7 = new int[var1];
            for (int var8 = 0; var8 < var1; var8++) {
                var7[var8] = class81.field1101[class333.method2319(255, var2[var8])];
            }
            var6 = new class190(class243.field3796, class126.field1825, class119.field1659[0], class206.field3261[0], class213.field3355[0], class81.field1103[0], var7);
        }
        class207.method1526(0);
        if (arg0 < 94) {
            field2965 = (class277) null;
        }
        return var6;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZJI)V", line = 51)
    public static final void method1340(boolean arg0, long arg1, int arg2) {
        field2969++;
        if (arg1 == 0L) {
            return;
        }
        if (class162.field2640 >= 100) {
            class131.method971("", (byte) -32, 0, class291.field4488);
            return;
        }
        String var4 = class154.method1118(111, arg1);
        int var5 = 125 % ((arg2 + 31) / 43);
        for (int var6 = 0; var6 < class162.field2640; var6++) {
            if (class316.field4982[var6] == arg1) {
                class131.method971("", (byte) -32, 0, var4 + class153.field2374);
                return;
            }
        }
        for (int var7 = 0; var7 < class301.field4626; var7++) {
            if (class23.field352[var7] == arg1) {
                class131.method971("", (byte) -32, 0, class216.field3406 + var4 + class86.field1166);
                return;
            }
        }
        if (var4.equals(class146.field2310.field5277)) {
            class131.method971("", (byte) -32, 0, class110.field1517);
            return;
        }
        class117.field1625++;
        class316.field4982[class162.field2640] = arg1;
        class281.field4349[class162.field2640] = class123.method900(512, arg1);
        class214.field3385[class162.field2640++] = arg0;
        class294.field4555 = class220.field3487;
        field2965.method1947((byte) -121, 196);
        field2965.method53((byte) -99, arg1);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "([IIIIII)V", line = 120)
    public static final void method1341(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class124 var6 = class83.field1138[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class153 var7 = var6.field1774;
        if (var7 != null) {
            int var8 = var7.field2365;
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
        class289 var10 = var6.field1787;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field4443;
        int var12 = var10.field4444;
        int var13 = var10.field4449;
        int var14 = var10.field4448;
        int[] var15 = class180.field2921[var11];
        int[] var16 = class141.field2250[var12];
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

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 213)
    public static final void method1342(Component arg0, int arg1) {
        arg0.addMouseListener(class5.field58);
        field2968++;
        arg0.addMouseMotionListener(class5.field58);
        arg0.addFocusListener(class5.field58);
        if (arg1 != 8912) {
            field2973 = (int[][][]) ((int[][][]) null);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIILgh;Lgh;IIIIJ)V", line = 225)
    public static final void method1343(int arg0, int arg1, int arg2, int arg3, class248 arg4, class248 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class283 var12 = new class283();
        var12.field4373 = arg10;
        var12.field4375 = arg1 * 128 + 64;
        var12.field4371 = arg2 * 128 + 64;
        var12.field4374 = arg3;
        var12.field4382 = arg4;
        var12.field4384 = arg5;
        var12.field4377 = arg6;
        var12.field4381 = arg7;
        var12.field4370 = arg8;
        var12.field4378 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class83.field1138[var13][arg1][arg2] == null) {
                class83.field1138[var13][arg1][arg2] = new class124(var13, arg1, arg2);
            }
        }
        class83.field1138[arg0][arg1][arg2].field1779 = var12;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V", line = 253)
    public static void method1344(int arg0) {
        field2965 = null;
        field2973 = (int[][][]) null;
        field2967 = null;
        if (arg0 != 24988) {
            method1344(-84);
        }
        field2972 = null;
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(B)V", line = 271)
    public static final void method1345(byte arg0) {
        field2966++;
        if (arg0 > -41) {
            return;
        }
        for (class123 var1 = (class123) class244.field3809.method22((byte) 117); var1 != null; var1 = (class123) class244.field3809.method26((byte) -114)) {
            class94 var2 = var1.field1761;
            if (class154.field2392 != var2.field1249 || var2.field1255) {
                var1.method2028(13329);
            } else if (class229.field3595 >= var2.field1242) {
                var2.method672(1, class153.field2373);
                if (var2.field1255) {
                    var1.method2028(13329);
                } else {
                    class6.method94(var2.field1249, var2.field1247, var2.field1235, var2.field1239, 60, var2, 0, -1L, false);
                }
            }
        }
    }
}
