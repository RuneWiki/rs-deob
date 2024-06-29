import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dia")
public class class236 {

    @OriginalMember(owner = "client!dia", name = "d", descriptor = "Lkg;")
    public static class275 field3074 = new class275(96, 3);

    @OriginalMember(owner = "client!dia", name = "m", descriptor = "Lqk;")
    public static class16 field3083 = new class16();

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "B")
    public byte field3071;

    @OriginalMember(owner = "client!dia", name = "c", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!dia", name = "e", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!dia", name = "f", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!dia", name = "g", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!dia", name = "h", descriptor = "I")
    public int field3078;

    @OriginalMember(owner = "client!dia", name = "i", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!dia", name = "b", descriptor = "Ljava/lang/String;")
    public String field3072;

    @OriginalMember(owner = "client!dia", name = "j", descriptor = "Ljava/lang/String;")
    public String field3080;

    @OriginalMember(owner = "client!dia", name = "k", descriptor = "Ljava/lang/String;")
    public String field3081;

    @OriginalMember(owner = "client!dia", name = "l", descriptor = "Ljava/lang/String;")
    public String field3082;

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(I)V")
    public static final void method1477(int arg0) {
        class517.field7241 = null;
        field3077++;
        if (arg0 != -1) {
            method1478(-102, -97, 60, 18, -52);
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(IIIII)V")
    public static final void method1478(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3076++;
        if (class259.field3281 != 1) {
            return;
        }
        int var5 = arg3 / class409.field5194;
        int var6 = arg2 / class409.field5194;
        int var7 = arg1 / class543.field7592;
        int var8 = arg4 / class543.field7592;
        if (class15.field303 <= var5 || var6 < 0 || var7 >= class405.field5126 || var8 < 0) {
            return;
        }
        if (var8 >= class405.field5126) {
            var8 = class405.field5126 - 1;
        }
        if (var6 >= class15.field303) {
            var6 = class15.field303 - 1;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        int var9 = -75 / ((arg0 + 46) / 58);
        for (int var10 = var7; var10 <= var8; var10++) {
            int var11 = class759.method4223(class124.field1784 + var10, class405.field5126, -18845) * class15.field303;
            for (int var12 = var5; var12 <= var6; var12++) {
                int var13 = class759.method4223(class405.field5127 + var12, class15.field303, -18845) + var11;
                class353.field4537[var13] = class224.field2988;
            }
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(IZ)V")
    public static final void method1479(int arg0, boolean arg1) {
        field3079++;
        if (arg0 < 0 || arg0 > 2) {
            arg0 = 0;
        }
        class705.field9772 = arg0;
        class679.field9482 = new class509[class241.field3121[class705.field9772] + 1];
        class298.field3916 = 0;
        class386.field4932 = 0;
        if (!arg1) {
            method1481(103);
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(III)Ltl;")
    public static final class621 method1480(int arg0, int arg1, int arg2) {
        class14 var3 = class197.field2689[arg0][arg1][arg2];
        return var3 == null ? null : var3.field289;
    }

    @OriginalMember(owner = "client!dia", name = "b", descriptor = "(I)V")
    public static void method1481(int arg0) {
        if (arg0 > 117) {
            field3074 = null;
            field3083 = null;
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(IIIIII)V")
    public static final void method1482(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3075++;
        int var6 = 0;
        int var7 = arg0;
        int var8 = arg1 * arg1;
        int var9 = arg0 * arg0;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg0 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - arg3) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg0 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg0 - 1) * var15;
        class636.method3569(arg1 + arg2, arg5, arg2 - arg1, arg3 + 347845799, class432.field5765[arg4]);
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var19 += var16;
                    var6++;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var6++;
                var17 += var16;
                var19 += var16;
            }
            var13 += -var20;
            var14 += -var18;
            var18 -= var15;
            var20 -= var15;
            var7--;
            int var21 = arg4 - var7;
            int var22 = arg4 + var7;
            int var23 = arg2 + var6;
            int var24 = arg2 - var6;
            class636.method3569(var23, arg5, var24, 347845800, class432.field5765[var21]);
            class636.method3569(var23, arg5, var24, 347845800, class432.field5765[var22]);
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(Lria;IZ)V")
    public static final void method1483(class288 arg0, int arg1, boolean arg2) {
        field3073++;
        int var3 = ~arg0.field3666 == arg1 ? arg0.field3617 : arg0.field3666;
        int var4 = arg0.field3656 == 0 ? arg0.field3714 : arg0.field3656;
        class643.method3613(arg2, var3, arg0.field3696, class218.field2938[arg0.field3696 >> 16], var4, arg1 ^ 0xFFFFFF92);
        if (arg0.field3779 != null) {
            class643.method3613(arg2, var3, arg0.field3696, arg0.field3779, var4, 94);
        }
        class491 var5 = (class491) class290.field3804.method1160((long) arg0.field3696, arg1 + 122);
        if (var5 != null) {
            class756.method4199(arg1, var5.field6978, arg2, var4, var3);
        }
    }
}
