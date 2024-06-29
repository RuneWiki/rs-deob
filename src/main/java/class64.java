import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public class class64 {

    @OriginalMember(owner = "client!jaa", name = "c", descriptor = "Lsb;")
    public static class305 field660 = new class305(8, 8);

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!jaa", name = "d", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(I)V")
    public static final void method346(int arg0) {
        field659++;
        if (arg0 != 8) {
            method347(null, null, (byte) 41);
        }
        for (int var1 = 0; var1 < 100; var1++) {
            class313.field3894[var1] = true;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "([I[Ljava/lang/Object;B)V")
    public static final void method347(int[] arg0, Object[] arg1, byte arg2) {
        class487.method2809(arg0, arg0.length - 1, (byte) -32, 0, arg1);
        field661++;
        if (arg2 != 58) {
            method347(null, null, (byte) 15);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(I)V")
    public static void method348(int arg0) {
        field660 = null;
        if (arg0 >= -38) {
            field660 = null;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIII)Z")
    public static final boolean method349(int arg0, int arg1, int arg2, int arg3) {
        field658++;
        if (!class321.field3945) {
            return false;
        } else if (class697.field9783 < 100) {
            return false;
        } else {
            int var4 = class269.field3348[arg2][arg1][arg3];
            if ((-class507.field7280) == var4) {
                return false;
            } else if (class507.field7280 == var4) {
                return true;
            } else if (class666.field9303 == class156.field1743) {
                return false;
            } else {
                int var5 = arg1 << class559.field7984;
                int var6 = 99 % ((-arg0 - 40) / 56);
                int var7 = arg3 << class559.field7984;
                if (class699.method3842(var5 + 1, -24488, var5 + 1, class156.field1743[arg2].method1608(arg3, 840, arg1), var5 + class171.field1904 - 1, class171.field1904 + var7 - 1, class171.field1904 + var7 - 1, var7 + 1, class156.field1743[arg2].method1608(arg3 + 1, 840, arg1), class156.field1743[arg2].method1608(arg3 + 1, 840, arg1 + 1)) && class699.method3842(class171.field1904 + var5 - 1, -24488, var5 + 1, class156.field1743[arg2].method1608(arg3, 840, arg1), var5 + class171.field1904 - 1, var7 + 1, var7 + class171.field1904 - 1, var7 + 1, class156.field1743[arg2].method1608(arg3 + 1, 840, arg1 + 1), class156.field1743[arg2].method1608(arg3, 840, arg1 + 1))) {
                    class302.field3751++;
                    class269.field3348[arg2][arg1][arg3] = class507.field7280;
                    return true;
                } else {
                    class269.field3348[arg2][arg1][arg3] = -class507.field7280;
                    return false;
                }
            }
        }
    }
}
