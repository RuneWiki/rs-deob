import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public abstract class class226 {

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
    public static int field3745 = 0;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public int field3736;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public int field3739;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public int field3740;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    public int field3744;

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "I")
    public int field3748;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "I")
    public int field3749;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "Le;")
    public static class65 field3741;

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "[[I")
    public static int[][] field3750;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "[[[B")
    public static byte[][][] field3746;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
    public static final void method1587(int arg0) {
        if (arg0 == 3) {
            field3743++;
            class199.field3182.method472((byte) -63);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/lang/String;IBLjava/lang/String;)V")
    public static final void method1588(String arg0, int arg1, byte arg2, String arg3) {
        class28.method240(arg0, -1, (String) null, arg1, arg3, -88);
        if (arg2 < -12) {
            field3738++;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I[I[IBI)V")
    public static final void method1589(int arg0, int[] arg1, int[] arg2, byte arg3, int arg4) {
        field3737++;
        if (arg3 != -107) {
            method1593((int[]) null, -18, 59, 106, 61, -123);
        }
        if (arg0 >= arg4) {
            return;
        }
        int var5 = (arg0 + arg4) / 2;
        int var6 = arg0;
        int var7 = arg2[var5];
        arg2[var5] = arg2[arg4];
        arg2[arg4] = var7;
        int var8 = arg1[var5];
        arg1[var5] = arg1[arg4];
        arg1[arg4] = var8;
        for (int var9 = arg0; var9 < arg4; var9++) {
            if (((var9 & 0x1) + var7) < arg2[var9]) {
                int var10 = arg2[var9];
                arg2[var9] = arg2[var6];
                arg2[var6] = var10;
                int var11 = arg1[var9];
                arg1[var9] = arg1[var6];
                arg1[var6++] = var11;
            }
        }
        arg2[arg4] = arg2[var6];
        arg2[var6] = var7;
        arg1[arg4] = arg1[var6];
        arg1[var6] = var8;
        method1589(arg0, arg1, arg2, (byte) -107, var6 - 1);
        method1589(var6 + 1, arg1, arg2, (byte) -107, arg4);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)V")
    public abstract void method1590(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)V")
    public static final void method1591(boolean arg0) {
        field3735++;
        if (arg0) {
            field3745 = 12;
        }
        if (class273.field4336 == 30) {
            class1.method5(25, -46);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)V")
    public abstract void method1592(int arg0, int arg1);

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "([IIIIII)V")
    public static final void method1593(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class134 var6 = class288.field4563[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class48 var7 = var6.field2141;
        if (var7 != null) {
            int var8 = var7.field853;
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
        class272 var10 = var6.field2150;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field4279;
        int var12 = var10.field4284;
        int var13 = var10.field4299;
        int var14 = var10.field4281;
        int[] var15 = class131.field2101[var11];
        int[] var16 = class280.field4443[var12];
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

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BLog;I)Ljava/lang/String;")
    public static final String method1594(byte arg0, class221 arg1, int arg2) {
        field3742++;
        try {
            int var3 = arg1.method1528(19380);
            if (arg0 <= 41) {
                method1589(36, (int[]) null, (int[]) null, (byte) 104, -17);
            }
            if (var3 > arg2) {
                var3 = arg2;
            }
            byte[] var4 = new byte[var3];
            arg1.field3655 += class126.field2044.method469(arg1.field3655, var3, 0, arg1.field3653, 105, var4);
            return class285.method1914(var3, var4, 0, -1);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
    public static void method1595(byte arg0) {
        if (arg0 != 105) {
            field3746 = null;
        }
        field3746 = null;
        field3741 = null;
        field3750 = null;
    }
}
