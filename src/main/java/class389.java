import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class389 {

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "Lmg;")
    private class96 field5775 = new class96();

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public static int field5771 = 0;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
    public static int field5776 = 0;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "[I")
    public static int[] field5778 = new int[2];

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field5768 = 0;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "Liu;")
    public static class390 field5774 = new class390(55, 6);

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
    public static int field5769;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field5770;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
    public static int field5772;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public static int field5773;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    public static int field5777;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "I")
    public static int field5779;

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "I")
    public static int field5780;

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "I")
    public static int field5782;

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "I")
    public static int field5783;

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "Lhe;")
    public static class239 field5781;

    @OriginalMember(owner = "client!nf", name = "q", descriptor = "Lmg;")
    private class96 field5784;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIIB)V")
    public static final void method2340(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field5783++;
        int var6 = 0;
        int var7 = 20 / ((arg5 - 46) / 51);
        int var8 = arg0;
        int var9 = arg2 * arg2;
        int var10 = arg0 * arg0;
        int var11 = var10 << 1;
        int var12 = var9 << 1;
        int var13 = arg0 << 1;
        int var14 = (1 - var13) * var9 + var11;
        int var15 = var10 - ((var13 - 1) * var12);
        int var16 = var9 << 2;
        int var17 = var10 << 2;
        int var18 = ((var6 << 1) + 3) * var11;
        int var19 = ((arg0 << 1) - 3) * var12;
        int var20 = (var6 + 1) * var17;
        int var21 = (arg0 - 1) * var16;
        class238.method1440(class41.field629[arg3], arg4, arg1 + arg2, -arg2 + arg1, -14726);
        while (var8 > 0) {
            if (var14 < 0) {
                while (var14 < 0) {
                    var15 += var20;
                    var14 += var18;
                    var20 += var17;
                    var18 += var17;
                    var6++;
                }
            }
            if (var15 < 0) {
                var14 += var18;
                var15 += var20;
                var20 += var17;
                var6++;
                var18 += var17;
            }
            var15 += -var19;
            var14 += -var21;
            var8--;
            var21 -= var16;
            var19 -= var16;
            int var22 = arg3 - var8;
            int var23 = arg3 + var8;
            int var24 = arg1 + var6;
            int var25 = arg1 - var6;
            class238.method1440(class41.field629[var22], arg4, var24, var25, -14726);
            class238.method1440(class41.field629[var23], arg4, var24, var25, -14726);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)Lmg;")
    public final class96 method2341(int arg0) {
        field5770++;
        class96 var2 = this.field5784;
        if (this.field5775 == var2) {
            this.field5784 = null;
            return null;
        }
        if (arg0 <= 92) {
            field5771 = -89;
        }
        this.field5784 = var2.field1287;
        return var2;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BLmg;)V")
    public final void method2342(byte arg0, class96 arg1) {
        field5772++;
        if (arg1.field1286 != null) {
            arg1.method589((byte) 51);
        }
        arg1.field1286 = this.field5775.field1286;
        arg1.field1287 = this.field5775;
        arg1.field1286.field1287 = arg1;
        arg1.field1287.field1286 = arg1;
        if (arg0 <= 26) {
            this.method2342((byte) 56, null);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)I")
    public final int method2343(boolean arg0) {
        field5782++;
        int var2 = 0;
        class96 var3 = this.field5775.field1287;
        if (!arg0) {
            return 71;
        }
        while (this.field5775 != var3) {
            var2++;
            var3 = var3.field1287;
        }
        return var2;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)Lmg;")
    public final class96 method2344(int arg0) {
        field5779++;
        class96 var2 = this.field5775.field1287;
        if (arg0 != 1) {
            field5776 = -40;
        }
        if (this.field5775 == var2) {
            return null;
        } else {
            var2.method589((byte) 51);
            return var2;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)V")
    public static final void method2345(int arg0, int arg1) {
        class456.field6645 = arg0;
        field5769++;
        class65.field970.method38((byte) -51);
        if (arg1 != 6374) {
            field5776 = -36;
        }
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(I)V")
    public static void method2346(int arg0) {
        field5781 = null;
        if (arg0 != 1) {
            field5778 = null;
        }
        field5774 = null;
        field5778 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)Lmg;")
    public final class96 method2347(byte arg0) {
        field5773++;
        class96 var2 = this.field5775.field1287;
        if (this.field5775 == var2) {
            this.field5784 = null;
            return null;
        }
        this.field5784 = var2.field1287;
        if (arg0 > -109) {
            field5771 = -34;
        }
        return var2;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(Z)V")
    public final void method2348(boolean arg0) {
        field5777++;
        if (arg0) {
            return;
        }
        while (true) {
            class96 var2 = this.field5775.field1287;
            if (this.field5775 == var2) {
                this.field5784 = null;
                return;
            }
            var2.method589((byte) 51);
        }
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V")
    public class389() {
        this.field5775.field1287 = this.field5775;
        this.field5775.field1286 = this.field5775;
    }
}
