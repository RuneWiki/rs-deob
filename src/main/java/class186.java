import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class186 extends class132 {

    @OriginalMember(owner = "client!u", name = "A", descriptor = "I")
    public int field3598 = 0;

    @OriginalMember(owner = "client!u", name = "x", descriptor = "I")
    public int field3595 = -1;

    @OriginalMember(owner = "client!u", name = "s", descriptor = "Ljava/lang/Object;")
    public static Object field3590 = new Object();

    @OriginalMember(owner = "client!u", name = "v", descriptor = "Ltg;")
    public static class184 field3593 = class135.method812("(U3", 3);

    @OriginalMember(owner = "client!u", name = "E", descriptor = "Ltg;")
    public static class184 field3602 = class135.method812("Fallen lassen", 3);

    @OriginalMember(owner = "client!u", name = "F", descriptor = "I")
    public static int field3603 = 2;

    @OriginalMember(owner = "client!u", name = "z", descriptor = "Ltg;")
    public static class184 field3597 = class135.method812("AUS", 3);

    @OriginalMember(owner = "client!u", name = "l", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    public int field3584;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "I")
    public int field3585;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "I")
    public int field3586;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "I")
    public int field3587;

    @OriginalMember(owner = "client!u", name = "q", descriptor = "I")
    public int field3588;

    @OriginalMember(owner = "client!u", name = "r", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!u", name = "t", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!u", name = "u", descriptor = "I")
    public int field3592;

    @OriginalMember(owner = "client!u", name = "w", descriptor = "I")
    public int field3594;

    @OriginalMember(owner = "client!u", name = "y", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!u", name = "B", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!u", name = "C", descriptor = "I")
    public int field3600;

    @OriginalMember(owner = "client!u", name = "G", descriptor = "I")
    public int field3604;

    @OriginalMember(owner = "client!u", name = "H", descriptor = "I")
    public int field3605;

    @OriginalMember(owner = "client!u", name = "J", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!u", name = "D", descriptor = "[Lwa;")
    public static class205[] field3601;

    @OriginalMember(owner = "client!u", name = "I", descriptor = "[Lef;")
    public static class46[] field3606;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(B)V")
    public static void method1174(byte arg0) {
        if (arg0 != -58) {
            method1179(null, null, null, (byte) 55);
        }
        field3602 = null;
        field3593 = null;
        field3606 = null;
        field3590 = null;
        field3601 = null;
        field3597 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BJII)Z")
    public static final boolean method1175(byte arg0, long arg1, int arg2, int arg3) {
        field3599++;
        int var5 = (int) arg1 >> 14 & 0x1F;
        int var6 = (int) arg1 >> 20 & 0x3;
        int var7 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class58 var8 = class14.method88(120, var7);
            int var9;
            int var10;
            if (var6 == 0 || var6 == 2) {
                var9 = var8.field1027;
                var10 = var8.field1084;
            } else {
                var9 = var8.field1084;
                var10 = var8.field1027;
            }
            int var11 = var8.field1063;
            if (var6 != 0) {
                var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
            }
            class157.method952(arg0 + 19661080, true, var9, 0, 2, var10, class46.field872.field644[0], arg2, class46.field872.field615[0], arg3, 0, var11);
        } else {
            class157.method952(19661184, true, 0, var6, 2, 0, class46.field872.field644[0], arg2, class46.field872.field615[0], arg3, var5 + 1, 0);
        }
        class196.field3806 = 0;
        class24.field437 = 2;
        class21.field409 = class134.field2429;
        class129.field2346 = class158.field2823;
        if (arg0 != 104) {
            field3603 = 92;
        }
        return true;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BLvb;)V")
    public static final void method1176(byte arg0, class197 arg1) {
        if (arg0 > -67) {
            field3590 = null;
        }
        field3607++;
        class205.field3939 = arg1;
        class150.field2687 = class205.field3939.method1272(16, 19661);
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(III)I")
    public static final int method1177(int arg0, int arg1, int arg2) {
        field3583++;
        class36 var3 = (class36) class179.field3417.method51((long) arg0, 30);
        if (var3 == null) {
            return 0;
        } else if (arg1 <= arg2 && arg2 < var3.field680.length) {
            return var3.field680[arg2];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "([IIIIII)V")
    public static final void method1178(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class90 var6 = class190.field3704[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class113 var7 = var6.field1679;
        if (var7 != null) {
            int var8 = var7.field2041;
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
        class30 var10 = var6.field1691;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field530;
        int var12 = var10.field526;
        int var13 = var10.field524;
        int var14 = var10.field523;
        int[] var15 = class150.field2696[var11];
        int[] var16 = class84.field1549[var12];
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

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Ltg;Ltg;Ltg;B)V")
    public static final void method1179(class184 arg0, class184 arg1, class184 arg2, byte arg3) {
        class188.field3620 = arg0;
        class188.field3625 = arg1;
        class188.field3632 = arg2;
        field3589++;
        if (arg3 > -32) {
            method1179(null, null, null, (byte) -27);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "()V")
    public static final void method1180() {
        for (int var0 = 0; var0 < class87.field1608; var0++) {
            for (int var5 = 0; var5 < class8.field145; var5++) {
                for (int var6 = 0; var6 < class159.field2853; var6++) {
                    class190.field3704[var0][var5][var6] = null;
                }
            }
        }
        for (int var1 = 0; var1 < class19.field368; var1++) {
            for (int var4 = 0; var4 < class19.field371[var1]; var4++) {
                class19.field358[var1][var4] = null;
            }
            class19.field371[var1] = 0;
        }
        for (int var2 = 0; var2 < class10.field187; var2++) {
            class205.field3945[var2] = null;
        }
        class10.field187 = 0;
        for (int var3 = 0; var3 < class65.field1248.length; var3++) {
            class65.field1248[var3] = null;
        }
    }
}
