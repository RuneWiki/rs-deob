import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class162 extends class92 {

    @OriginalMember(owner = "client!s", name = "bb", descriptor = "I")
    private int field3154 = 0;

    @OriginalMember(owner = "client!s", name = "db", descriptor = "Z")
    public boolean field3156 = false;

    @OriginalMember(owner = "client!s", name = "mb", descriptor = "I")
    private int field3165 = 0;

    @OriginalMember(owner = "client!s", name = "ab", descriptor = "I")
    private int field3153;

    @OriginalMember(owner = "client!s", name = "cb", descriptor = "I")
    public int field3155;

    @OriginalMember(owner = "client!s", name = "V", descriptor = "I")
    public int field3148;

    @OriginalMember(owner = "client!s", name = "T", descriptor = "I")
    public int field3147;

    @OriginalMember(owner = "client!s", name = "jb", descriptor = "I")
    public int field3162;

    @OriginalMember(owner = "client!s", name = "gb", descriptor = "I")
    public int field3159;

    @OriginalMember(owner = "client!s", name = "ib", descriptor = "Lca;")
    private class22 field3161;

    @OriginalMember(owner = "client!s", name = "W", descriptor = "Leh;")
    private static class47 field3149 = class195.method1282((byte) -4, "Checking for updates )2 ");

    @OriginalMember(owner = "client!s", name = "fb", descriptor = "Leh;")
    public static class47 field3158 = field3149;

    @OriginalMember(owner = "client!s", name = "lb", descriptor = "[I")
    public static int[] field3164 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!s", name = "hb", descriptor = "I")
    public static volatile int field3160 = 0;

    @OriginalMember(owner = "client!s", name = "ob", descriptor = "I")
    public static int field3167 = 10;

    @OriginalMember(owner = "client!s", name = "kb", descriptor = "I")
    public static int field3163 = 0;

    @OriginalMember(owner = "client!s", name = "X", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!s", name = "Y", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!s", name = "Z", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!s", name = "eb", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!s", name = "nb", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!s", name = "pb", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V")
    public static void method1106(byte arg0) {
        field3149 = null;
        field3164 = null;
        int var1 = -72 / ((47 - arg0) / 57);
        field3158 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BZ)V")
    public static final void method1107(byte arg0, boolean arg1) {
        field3166++;
        class126.method951((byte) -126);
        class109.field2258++;
        if (class109.field2258 < 50 && !arg1) {
            return;
        }
        class109.field2258 = 0;
        if (!class186.field3556 && class61.field1323 != null) {
            class60.field1174.method657(28182, 219);
            try {
                class61.field1323.method679(class60.field1174.field1454, (byte) 57, class60.field1174.field1495, 0);
                class60.field1174.field1454 = 0;
            } catch (IOException var2) {
                class186.field3556 = true;
            }
            class198.field3854++;
        }
        if (arg0 != 27) {
            method1109(null, -82, -48, -94, -77, 70);
        }
    }

    @OriginalMember(owner = "client!s", name = "e", descriptor = "(I)Ld;")
    public final class30 method708(int arg0) {
        field3152++;
        class21 var2 = class2.method8(this.field3153, arg0 - 21951);
        class30 var3;
        if (this.field3156) {
            var3 = var2.method212(-1, (byte) -72);
        } else {
            var3 = var2.method212(this.field3154, (byte) -104);
        }
        if (var3 == null) {
            return null;
        } else {
            if (arg0 != 21831) {
                field3149 = null;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(JI)V")
    public static final void method1108(long arg0, int arg1) {
        field3168++;
        if (arg1 >= -16) {
            field3163 = -120;
        }
        if (arg0 != 0L) {
            class60.field1174.method657(28182, 140);
            class60.field1174.method600(32601, arg0);
            class76.field1643++;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "([IIIIII)V")
    public static final void method1109(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class152 var6 = class173.field3351[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class206 var7 = var6.field2973;
        if (var7 != null) {
            int var8 = var7.field4046;
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
        class46 var10 = var6.field2994;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field914;
        int var12 = var10.field913;
        int var13 = var10.field909;
        int var14 = var10.field903;
        int[] var15 = class155.field3042[var11];
        int[] var16 = class76.field1655[var12];
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

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(IIIIIII)V")
    public class162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3153 = arg0;
        this.field3155 = arg3;
        this.field3148 = arg1;
        this.field3147 = arg2;
        this.field3162 = arg5 + arg6;
        this.field3159 = arg4;
        int var8 = class2.method8(this.field3153, -116).field390;
        if (var8 == -1) {
            this.field3156 = true;
        } else {
            this.field3156 = false;
            this.field3161 = class25.method236(false, var8);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IZ)V")
    public final void method1110(int arg0, boolean arg1) {
        field3151++;
        if (this.field3156) {
            return;
        }
        this.field3165 += arg0;
        if (!arg1) {
            return;
        }
        while (this.field3161.field419[this.field3154] < this.field3165) {
            this.field3165 -= this.field3161.field419[this.field3154];
            this.field3154++;
            if (this.field3161.field430.length <= this.field3154) {
                this.field3156 = true;
                return;
            }
        }
    }
}
