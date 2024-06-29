import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class390 {

    @OriginalMember(owner = "client!fs", name = "h", descriptor = "I")
    public int field5234;

    @OriginalMember(owner = "client!fs", name = "m", descriptor = "I")
    public int field5239;

    @OriginalMember(owner = "client!fs", name = "l", descriptor = "Lfs;")
    public class390 field5238;

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "Lc;")
    public class123 field5228;

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "Ljk;")
    public static class449 field5231 = new class449(8);

    @OriginalMember(owner = "client!fs", name = "n", descriptor = "Lud;")
    public static class27 field5240;

    @OriginalMember(owner = "client!fs", name = "p", descriptor = "Lup;")
    public static class181 field5242;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "I")
    public int field5227;

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "I")
    public static int field5229;

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!fs", name = "f", descriptor = "I")
    public int field5232;

    @OriginalMember(owner = "client!fs", name = "g", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!fs", name = "i", descriptor = "I")
    public int field5235;

    @OriginalMember(owner = "client!fs", name = "j", descriptor = "I")
    public static int field5236;

    @OriginalMember(owner = "client!fs", name = "k", descriptor = "I")
    public static int field5237;

    @OriginalMember(owner = "client!fs", name = "o", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!fs", name = "r", descriptor = "Lhp;")
    public static class216 field5244;

    @OriginalMember(owner = "client!fs", name = "q", descriptor = "Lqn;")
    public static class47 field5243;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Z)Lrh;")
    public final class174 method2214(boolean arg0) {
        field5230++;
        if (!arg0) {
            this.method2217(98, -111);
        }
        return class400.method2374(-54, this.field5239);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(FIII[FFIIIII)V")
    public static final void method2215(float arg0, int arg1, int arg2, int arg3, float[] arg4, float arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg9 - arg3;
        field5233++;
        int var12 = arg10 - arg2;
        int var13 = arg8 - arg7;
        float var14 = arg4[2] * (float) var11 + arg4[1] * (float) var12 + arg4[0] * (float) var13;
        float var15 = arg4[5] * (float) var11 + arg4[4] * (float) var12 + arg4[3] * (float) var13;
        float var16 = arg4[8] * (float) var11 + arg4[6] * (float) var13 + arg4[7] * (float) var12;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg0 != 1.0F) {
            var17 = arg0 * var17;
        }
        float var18 = var15 + arg5 + 0.5F;
        if (arg1 == 1) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (arg1 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg1 == 3) {
            float var20 = var17;
            var17 = var18;
            var18 = -var20;
        }
        int var21 = 76 % ((35 - arg6) / 37);
        class42.field520 = var18;
        class448.field6409 = var17;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)V")
    public static void method2216(byte arg0) {
        field5242 = null;
        field5244 = null;
        field5231 = null;
        field5240 = null;
        field5243 = null;
        int var1 = 48 / ((69 - arg0) / 47);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(II)Lfs;")
    public final class390 method2217(int arg0, int arg1) {
        if (arg1 == 2) {
            field5229++;
            return new class390(this.field5239, arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(II)V")
    public class390(int arg0, int arg1) {
        this.field5234 = arg1;
        this.field5239 = arg0;
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lfs;I)V")
    public class390(class390 arg0, int arg1) {
        this.field5238 = arg0;
        this.field5239 = this.field5238.field5239;
        this.field5228 = this.field5238.field5228;
        this.field5234 = this.field5238.field5234 + arg1;
    }

    static {
        new class328("", 73);
        field5240 = new class27(0, 2, 2, 1);
        field5242 = new class181(10, 4);
    }
}
