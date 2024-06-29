import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class76 {

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "Lpk;")
    public static class25 field1040;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "([IIIIII)V", line = 6)
    public static final void method559(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class202 var6 = class142.field1940[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class149 var7 = var6.field2886;
        if (var7 != null) {
            int var8 = var7.field2066;
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
        class144 var10 = var6.field2872;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field1985;
        int var12 = var10.field1971;
        int var13 = var10.field1979;
        int var14 = var10.field1981;
        int[] var15 = class70.field956[var11];
        int[] var16 = class234.field3320[var12];
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

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "([BI)[B", line = 100)
    public static final byte[] method560(byte[] arg0, int arg1) {
        field1039++;
        if (arg1 >= -73) {
            method562((class170) null, 22, -73, (class344) null, -20, false, -43);
        }
        if (arg0 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg0.length];
            class281.method1943(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Z)V", line = 119)
    public static void method561(boolean arg0) {
        if (!arg0) {
            field1040 = (class25) null;
        }
        field1040 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lpn;IILin;IZI)V", line = 132)
    public static final void method562(class170 arg0, int arg1, int arg2, class344 arg3, int arg4, boolean arg5, int arg6) {
        field1038++;
        if (arg0 == null) {
            return;
        }
        int var7 = (int) class89.field1257 + class264.field3859 & 0x7FF;
        int var8 = Math.max(arg3.field5334 / 2, arg3.field5293 / 2) + 10;
        int var9 = arg4 * arg4 + arg6 * arg6;
        if ((var8 * var8) < var9) {
            return;
        }
        if (!arg5) {
            field1040 = (class25) null;
        }
        int var10 = class184.field2538[var7];
        int var11 = var10 * 256 / (class252.field3618 + 256);
        int var12 = class184.field2532[var7];
        int var13 = var12 * 256 / (class252.field3618 + 256);
        int var14 = arg4 * var13 - arg6 * var11 >> 16;
        int var15 = arg4 * var11 + (arg6 * var13) >> 16;
        if (class67.field908) {
            ((class328) arg0).method2297(arg3.field5334 / 2 + var15 + arg1 - arg0.field2319 / 2, arg3.field5293 / 2 + -var14 + arg2 + -(arg0.field2325 / 2), (class328) arg3.method2370(true, false));
        } else {
            ((class178) arg0).method1237(arg3.field5334 / 2 + arg1 + var15 - (arg0.field2319 / 2), arg3.field5293 / 2 + -var14 + arg2 - arg0.field2325 / 2, arg3.field5283, arg3.field5202);
        }
    }
}
