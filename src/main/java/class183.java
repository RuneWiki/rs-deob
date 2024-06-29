import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class183 {

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "Lqe;")
    public static class179 field3371 = class206.method1380("compass", (byte) 118);

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field3376 = 0;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "Lqe;")
    public static class179 field3374 = class206.method1380("Wordpack geladen)3", (byte) -126);

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "Lqe;")
    private static class179 field3372 = class206.method1380(" from your ignore list first)3", (byte) -127);

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "Lqe;")
    public static class179 field3382 = field3372;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public int field3375;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "Lma;")
    public class131 field3377;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "Lee;")
    public static class49 field3381;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "[I")
    public int[] field3379;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(III)V")
    public static final void method1188(int arg0, int arg1, int arg2) {
        class197 var3 = class229.field4232[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field3668 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V")
    public static final void method1189(byte arg0) {
        for (class229 var1 = (class229) class216.field4000.method242(16711680); var1 != null; var1 = (class229) class216.field4000.method237(10)) {
            if (var1.field4244 != null) {
                class38.field824.method1199(var1.field4244);
                var1.field4244 = null;
            }
            if (var1.field4223 != null) {
                class38.field824.method1199(var1.field4223);
                var1.field4223 = null;
            }
        }
        field3380++;
        class216.field4000.method236((byte) 58);
        if (arg0 > -60) {
            method1190(-35, -17, -50, 61, -69);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIII)I")
    public static final int method1190(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 0) {
            method1192(null, 96, 73, -43, -64, 48);
        }
        field3383++;
        int var5 = 65536 - class27.field600[arg0 * 1024 / arg1] >> 1;
        return ((65536 - var5) * arg2 >> 16) + (arg3 * var5 >> 16);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Leh;ILeh;)V")
    public static final void method1191(class52 arg0, int arg1, class52 arg2) {
        class8.field243 = arg0;
        if (arg1 >= 98) {
            class131.field2382 = arg2;
            field3373++;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "([IIIIII)V")
    public static final void method1192(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class197 var6 = class229.field4232[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class171 var7 = var6.field3663;
        if (var7 != null) {
            int var8 = var7.field3057;
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
        class76 var10 = var6.field3683;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field1482;
        int var12 = var10.field1477;
        int var13 = var10.field1471;
        int var14 = var10.field1462;
        int[] var15 = class212.field3953[var11];
        int[] var16 = class201.field3722[var12];
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

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
    public static void method1193(int arg0) {
        if (arg0 < 48) {
            field3382 = null;
        }
        field3382 = null;
        field3374 = null;
        field3372 = null;
        field3381 = null;
        field3371 = null;
    }
}
