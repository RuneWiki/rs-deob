import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class137 {

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "Lnh;")
    public static class54 field2395 = new class54(64);

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field2396 = 0;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "Lcf;")
    public static class93 field2398 = class147.method1066("Chargement des sprites )2 ", -48);

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "[I")
    public static int[] field2397 = new int[] { 4, 4, 1, 2, 6, 4, 2, 49, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
    public static void method1000(int arg0) {
        if (arg0 == 1) {
            field2397 = null;
            field2398 = null;
            field2395 = null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)V")
    public static final void method1001(int arg0, int arg1) {
        class196.field3585.method298(true, arg0);
        if (arg1 != -8984) {
            method1000(70);
        }
        field2391++;
        class283.field5073.method298(true, arg0);
        class94.field1697.method298(true, arg0);
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(II)I")
    public static final int method1002(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIZI)I")
    public static final int method1003(int arg0, int arg1, boolean arg2, int arg3) {
        field2392++;
        class249 var4 = (class249) class282.field5069.method135((long) arg0, true);
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        for (int var6 = arg3; var6 < var4.field4487.length; var6++) {
            if (var4.field4487[var6] >= 0 && var4.field4487[var6] < class186.field3435) {
                class29 var7 = class89.method617(var4.field4487[var6], 0);
                if (var7.field366 != null) {
                    class236 var8 = (class236) var7.field366.method135((long) arg1, true);
                    if (var8 != null) {
                        if (arg2) {
                            var5 += var4.field4494[var6] * var8.field4210;
                        } else {
                            var5 += var8.field4210;
                        }
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZLsf;)V")
    public static final void method1004(boolean arg0, class94 arg1) {
        if (arg0) {
            field2393++;
            class37.field562 = arg1;
        }
    }
}
