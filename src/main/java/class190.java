import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class190 extends class272 {

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "Lnh;")
    public static class699 field2256 = new class699(1);

    @OriginalMember(owner = "client!fq", name = "p", descriptor = "Lcga;")
    public static class449 field2266 = new class449(81, 8);

    @OriginalMember(owner = "client!fq", name = "g", descriptor = "I")
    public int field2257;

    @OriginalMember(owner = "client!fq", name = "h", descriptor = "I")
    public int field2258;

    @OriginalMember(owner = "client!fq", name = "i", descriptor = "I")
    public int field2259;

    @OriginalMember(owner = "client!fq", name = "l", descriptor = "I")
    public int field2262;

    @OriginalMember(owner = "client!fq", name = "m", descriptor = "I")
    public int field2263;

    @OriginalMember(owner = "client!fq", name = "n", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!fq", name = "o", descriptor = "I")
    public int field2265;

    @OriginalMember(owner = "client!fq", name = "q", descriptor = "Lpfa;")
    public static class275 field2267;

    @OriginalMember(owner = "client!fq", name = "j", descriptor = "Ljava/lang/String;")
    public String field2260;

    @OriginalMember(owner = "client!fq", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field2261;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
    public static void method1126(int arg0) {
        field2256 = null;
        if (arg0 != 0) {
            method1128(false, 85, false, null);
        }
        field2267 = null;
        field2266 = null;
        field2261 = null;
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(I)V")
    public static final void method1127(int arg0) {
        class631.field8559 = arg0;
        for (int var1 = 0; var1 < class546.field6871; var1++) {
            for (int var2 = 0; var2 < class36.field538; var2++) {
                if (class407.field5237[arg0][var1][var2] == null) {
                    class407.field5237[arg0][var1][var2] = new class565(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZIZLcd;)V")
    public static final void method1128(boolean arg0, int arg1, boolean arg2, class293 arg3) {
        field2264++;
        int var4 = arg3.field3727;
        int var5 = (int) arg3.field3321;
        arg3.method1566(-111);
        if (arg2) {
            class72.method572(94, var4);
        }
        class363.method2109(var4, -11465);
        class337 var6 = class442.method2421(var5, 100);
        if (var6 != null) {
            class99.method721((byte) -75, var6);
        }
        class492.method2670(26);
        if (!arg0 && class305.field3866 != -1) {
            class654.method3657(class305.field3866, true, 1);
        }
        class182 var7 = new class182(class216.field2530);
        for (class293 var8 = (class293) var7.method1085(47); var8 != null; var8 = (class293) var7.method1082((byte) 31)) {
            if (!var8.method1565((byte) 125)) {
                var8 = (class293) var7.method1085(98);
                if (var8 == null) {
                    break;
                }
            }
            if (var8.field3729 == 3) {
                int var9 = (int) var8.field3321;
                if ((var9 >>> 16) == var4) {
                    method1128(arg0, -89, true, var8);
                }
            }
        }
        if (arg1 >= -87) {
            field2267 = null;
        }
    }
}
