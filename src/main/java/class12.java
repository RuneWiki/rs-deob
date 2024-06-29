import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class12 {

    @OriginalMember(owner = "client!ds", name = "k", descriptor = "I")
    private int field161;

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "[Lmt;")
    private class271[] field157;

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "Lri;")
    public static class73 field154 = new class73(1, -1);

    @OriginalMember(owner = "client!ds", name = "j", descriptor = "[I")
    public static int[] field160 = new int[2];

    @OriginalMember(owner = "client!ds", name = "l", descriptor = "I")
    public static int field162 = 0;

    @OriginalMember(owner = "client!ds", name = "m", descriptor = "[[I")
    public static int[][] field163 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!ds", name = "n", descriptor = "I")
    public static int field164 = -1;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!ds", name = "i", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!ds", name = "h", descriptor = "J")
    private long field158;

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "Lmt;")
    private class271 field152;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIIII)V", line = 8)
    public static final void method77(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field156++;
        int var6 = 0;
        int var7 = arg3;
        int var8 = arg1 * arg1;
        int var9 = arg3 * arg3;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg3 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = 9 % ((arg2 + 78) / 48);
        int var15 = var9 - ((var12 - 1) * var11);
        int var16 = var8 << 2;
        int var17 = var9 << 2;
        int var18 = ((var6 << 1) + 3) * var10;
        int var19 = ((arg3 << 1) - 3) * var11;
        int var20 = (var6 + 1) * var17;
        if (class37.field393 <= arg0 && class509.field7436 >= arg0) {
            int var21 = class42.method249(class494.field7297, arg1 + arg5, (byte) -72, class445.field6629);
            int var22 = class42.method249(class494.field7297, arg5 - arg1, (byte) -72, class445.field6629);
            class415.method2491(var21, var22, class339.field4800[arg0], arg4, -31541);
        }
        int var23 = (arg3 - 1) * var16;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var15 += var20;
                    var13 += var18;
                    var6++;
                    var20 += var17;
                    var18 += var17;
                }
            }
            if (var15 < 0) {
                var13 += var18;
                var15 += var20;
                var18 += var17;
                var20 += var17;
                var6++;
            }
            var15 += -var19;
            var13 += -var23;
            var23 -= var16;
            var7--;
            var19 -= var16;
            int var24 = arg0 - var7;
            int var25 = arg0 + var7;
            if (class37.field393 <= var25 && var24 <= class509.field7436) {
                int var26 = class42.method249(class494.field7297, arg5 + var6, (byte) -72, class445.field6629);
                int var27 = class42.method249(class494.field7297, arg5 - var6, (byte) -72, class445.field6629);
                if (class37.field393 <= var24) {
                    class415.method2491(var26, var27, class339.field4800[var24], arg4, -31541);
                }
                if (class509.field7436 >= var25) {
                    class415.method2491(var26, var27, class339.field4800[var25], arg4, -31541);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIIIIIII)V", line = 109)
    public static final void method78(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field159++;
        class43.method267(arg7, arg4, arg2, 0, arg0, arg5, arg8, arg1, arg6, arg3);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(B)V", line = 131)
    public static void method79(byte arg0) {
        field163 = null;
        field154 = null;
        field160 = null;
        int var1 = -99 % ((75 - arg0) / 33);
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(B)Lmt;", line = 144)
    public final class271 method80(byte arg0) {
        field155++;
        if (arg0 != -14) {
            this.method81(null, -78L, true);
        }
        if (this.field152 == null) {
            return null;
        }
        class271 var2 = this.field157[(int) ((long) (this.field161 - 1) & this.field158)];
        while (this.field152 != var2) {
            if (this.field152.field3936 == this.field158) {
                class271 var3 = this.field152;
                this.field152 = this.field152.field3939;
                return var3;
            }
            this.field152 = this.field152.field3939;
        }
        this.field152 = null;
        return null;
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(I)V", line = 183)
    public class12(int arg0) {
        this.field161 = arg0;
        this.field157 = new class271[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class271 var3 = this.field157[var2] = new class271();
            var3.field3935 = var3;
            var3.field3939 = var3;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lmt;JZ)V", line = 207)
    public final void method81(class271 arg0, long arg1, boolean arg2) {
        if (arg0.field3935 != null) {
            arg0.method1783((byte) -72);
        }
        field153++;
        class271 var5 = this.field157[(int) (arg1 & (long) (this.field161 - 1))];
        arg0.field3939 = var5;
        arg0.field3935 = var5.field3935;
        arg0.field3935.field3939 = arg0;
        if (!arg2) {
            this.method81(null, -57L, false);
        }
        arg0.field3939.field3935 = arg0;
        arg0.field3936 = arg1;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(JI)Lmt;", line = 230)
    public final class271 method82(long arg0, int arg1) {
        this.field158 = arg0;
        field151++;
        class271 var4 = this.field157[(int) (arg0 & (long) (this.field161 - 1))];
        int var5 = 123 / ((67 - arg1) / 33);
        for (this.field152 = var4.field3939; this.field152 != var4; this.field152 = this.field152.field3939) {
            if (this.field152.field3936 == arg0) {
                class271 var6 = this.field152;
                this.field152 = this.field152.field3939;
                return var6;
            }
        }
        this.field152 = null;
        return null;
    }
}
