import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class140 {

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
    public static int field2060 = 0;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2063 = "Loading...";

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field2057 = 0;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
    public static int field2064 = -1;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
    public static final void method939(int arg0) {
        field2062++;
        class130 var1 = class103.field1597;
        synchronized (class103.field1597) {
            if (arg0 == -6635) {
                class2.field16++;
                class204.field3195 = class278.field4415;
                if (class6.field101 >= 0) {
                    while (class90.field1378 != class6.field101) {
                        int var2 = class149.field2205[class90.field1378];
                        class90.field1378 = class90.field1378 + 1 & 0x7F;
                        if (var2 < 0) {
                            class123.field1844[~var2] = false;
                        } else {
                            class123.field1844[var2] = true;
                        }
                    }
                } else {
                    for (int var3 = 0; var3 < 112; var3++) {
                        class123.field1844[var3] = false;
                    }
                    class6.field101 = class90.field1378;
                }
                class278.field4415 = class86.field1362;
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)Lca;")
    public static final class264 method940(int arg0, int arg1, int arg2) {
        class49 var3 = class90.field1382[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class264 var4 = var3.field631;
            var3.field631 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V")
    public static void method941(int arg0) {
        field2063 = null;
        int var1 = 9 / ((-arg0 - 92) / 33);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIIZII)V")
    public static final void method942(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        field2061++;
        int var9 = arg1 - arg8;
        if (arg6) {
            int var10 = (arg7 - arg0 << 16) / var9;
            int var11 = arg3 - arg4;
            int var12 = (arg2 - arg5 << 16) / var11;
            class99.method660(arg4, var12, 0, arg8, var10, arg5, (byte) 111, 0, arg1, arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BI)V")
    public static final void method943(byte arg0, int arg1) {
        class244.field3901 = -1;
        class281.field4456 = false;
        int var2 = 53 % ((arg0 + 62) / 37);
        field2056++;
        class182.field2887 = -1;
        class63.field887 = null;
        class249.field3996 = 0;
        class189.field2985 = 1;
        class38.field518 = arg1;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Llj;Z)V")
    public static final void method944(class25 arg0, boolean arg1) {
        if (!arg1) {
            method941(-30);
        }
        for (int var2 = 0; var2 < class118.field1734; var2++) {
            int var3 = arg0.method192((byte) -20);
            int var4 = arg0.method190(-3);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class80.field1164[var3] != null) {
                class80.field1164[var3].field1477 = var4;
            }
        }
        field2059++;
    }
}
