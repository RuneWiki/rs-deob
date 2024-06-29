import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class54 {

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field1158 = 0;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "Lia;")
    public static class257 field1162 = class28.method234(-89, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public static int field1160 = 0;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "Lia;")
    private static class257 field1165 = class28.method234(-17, "Starting 3d library");

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static volatile int field1161 = 0;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
    public static int field1166 = 0;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "Lia;")
    public static class257 field1164 = field1165;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "Lvb;")
    public static class226 field1159;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
    public static void method413(byte arg0) {
        if (arg0 < 30) {
            method414(93, 82, 55, 36);
        }
        field1165 = null;
        field1164 = null;
        field1162 = null;
        field1159 = null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIII)V")
    public static final void method414(int arg0, int arg1, int arg2, int arg3) {
        class103.field1911 = new class177[arg0][arg1][arg2];
        class159.field2793 = new int[arg0][arg1 + 1][arg2 + 1];
        class195.method1308(false);
        class140.field2491 = arg1;
        class73.field1427 = arg2;
        class105.field1947 = new int[arg0][arg1 + 1][arg2 + 1];
        class252.method1649();
        class11.field212 = arg3;
        class14.field315 = new boolean[class11.field212 + class11.field212 + 1][class11.field212 + class11.field212 + 1];
        class226.field3793 = new boolean[class11.field212 + class11.field212 + 2][class11.field212 + class11.field212 + 2];
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "([IIIIII)V")
    public static final void method415(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class177 var6 = class75.field1463[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class58 var7 = var6.field3032;
        if (var7 != null) {
            int var8 = var7.field1237;
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
        class122 var10 = var6.field3007;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field2200;
        int var12 = var10.field2207;
        int var13 = var10.field2194;
        int var14 = var10.field2193;
        int[] var15 = class205.field3508[var11];
        int[] var16 = class87.field1686[var12];
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

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)Lia;")
    public static final class257 method416(int arg0, int arg1) {
        field1167++;
        class257 var2 = new class257();
        var2.field4407 = new byte[arg1];
        var2.field4447 = arg0;
        return var2;
    }
}
