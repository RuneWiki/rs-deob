import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class226 {

    @OriginalMember(owner = "client!g", name = "a", descriptor = "J")
    public static long field3608 = 0L;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3611 = "wave2:";

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "Lak;")
    public static class172 field3610;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ZZ)V", line = 15)
    public static final void method1602(boolean arg0, boolean arg1) {
        class87.method598(class271.field4373, class229.field3637, class145.field2267, class197.field3208);
        class87.method589(class100.field1460, class15.field172, arg1);
        class87.method594((float) class102.field1486, (float) class210.field3444, (float) class157.field2494);
        field3609++;
        if (!arg0) {
            field3610 = (class172) null;
        }
        class87.method591();
        class244.field3850 = class139.field2194;
        class244.field3861 = class199.field3239;
        class244.field3859 = class53.field748;
        class278.field4474 = class310.field4832;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(III[I[Ljava/lang/Object;)V", line = 33)
    public static final void method1603(int arg0, int arg1, int arg2, int[] arg3, Object[] arg4) {
        if (arg1 > arg2) {
            int var5 = (arg1 + arg2) / 2;
            int var6 = arg3[var5];
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var6;
            int var7 = arg2;
            Object var8 = arg4[var5];
            arg4[var5] = arg4[arg1];
            arg4[arg1] = var8;
            for (int var9 = arg2; var9 < arg1; var9++) {
                if (((var9 & 0x1) + var6) > arg3[var9]) {
                    int var10 = arg3[var9];
                    arg3[var9] = arg3[var7];
                    arg3[var7] = var10;
                    Object var11 = arg4[var9];
                    arg4[var9] = arg4[var7];
                    arg4[var7++] = var11;
                }
            }
            arg3[arg1] = arg3[var7];
            arg3[var7] = var6;
            arg4[arg1] = arg4[var7];
            arg4[var7] = var8;
            method1603(-21796, var7 - 1, arg2, arg3, arg4);
            method1603(-21796, arg1, var7 + 1, arg3, arg4);
        }
        if (arg0 != -21796) {
            method1602(false, true);
        }
        field3612++;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V", line = 90)
    public static final void method1604(byte arg0) {
        if (arg0 != 84) {
            method1603(33, 99, -30, (int[]) null, (Object[]) null);
        }
        field3613++;
        class258.field4132.method702((byte) 120);
        class29.field400.method702((byte) 120);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V", line = 104)
    public static void method1605(int arg0) {
        field3610 = null;
        if (arg0 == 1) {
            field3611 = null;
        }
    }
}
