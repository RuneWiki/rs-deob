import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class385 {

    @OriginalMember(owner = "client!el", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field5063 = new String[100];

    @OriginalMember(owner = "client!el", name = "b", descriptor = "Ldq;")
    public static class493 field5062 = new class493(48, 28);

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public static int field5061;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    public static int field5065;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "I")
    public static int field5066;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "Lrk;")
    public static class25 field5064;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIZZ)I", line = 7)
    public static final int method2175(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        field5065++;
        if (arg0 >= -96) {
            method2176(null, -100);
        }
        class529 var5 = class290.method1705(0, arg4, arg2);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < var5.field7796.length; var7++) {
            if (var5.field7796[var7] >= 0 && var5.field7796[var7] < class376.field4949.field903) {
                class9 var8 = class376.field4949.method624((byte) -123, var5.field7796[var7]);
                int var9 = var8.method65(true, class199.field2592.method2579((byte) 114, arg1).field2188, arg1);
                if (arg3) {
                    var6 += var5.field7794[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 48)
    public static final void method2176(String arg0, int arg1) {
        field5066++;
        if (arg0 == null) {
            return;
        }
        if (!(class280.field3555 < 100 || class115.field1550) || class280.field3555 >= 200) {
            class445.method2622(true, class117.field1579.method1936(arg1 + 5478, class11.field177));
        } else if (arg1 == -32017) {
            String var2 = class465.method2803(arg0, (byte) 108);
            if (var2 != null) {
                for (int var3 = 0; var3 < class280.field3555; var3++) {
                    String var7 = class465.method2803(class329.field4163[var3], (byte) 111);
                    if (var7 != null && var7.equals(var2)) {
                        class445.method2622(true, arg0 + class301.field3869.method1936(-26539, class11.field177));
                        return;
                    }
                    if (class106.field1341[var3] != null) {
                        String var8 = class465.method2803(class106.field1341[var3], (byte) 112);
                        if (var8 != null && var8.equals(var2)) {
                            class445.method2622(true, arg0 + class301.field3869.method1936(arg1 + 5478, class11.field177));
                            return;
                        }
                    }
                }
                for (int var4 = 0; var4 < class498.field7223; var4++) {
                    String var5 = class465.method2803(field5063[var4], (byte) 117);
                    if (var5 != null && var5.equals(var2)) {
                        class445.method2622(true, class265.field3341.method1936(-26539, class11.field177) + arg0 + class176.field2296.method1936(-26539, class11.field177));
                        return;
                    }
                    if (class281.field3580[var4] != null) {
                        String var6 = class465.method2803(class281.field3580[var4], (byte) 82);
                        if (var6 != null && var6.equals(var2)) {
                            class445.method2622(true, class265.field3341.method1936(-26539, class11.field177) + arg0 + class176.field2296.method1936(-26539, class11.field177));
                            return;
                        }
                    }
                }
                if (class465.method2803(class23.field336.field2852, (byte) 85).equals(var2)) {
                    class445.method2622(true, class2.field18.method1936(-26539, class11.field177));
                } else {
                    class173.field2243++;
                    class282.method1669(class505.field7274, false);
                    class40.field511.method2729(class463.method2733(-113, arg0), false);
                    class40.field511.method2769(arg0, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V", line = 154)
    public static void method2177(int arg0) {
        field5063 = null;
        field5064 = null;
        field5062 = null;
        if (arg0 > -3) {
            field5064 = null;
        }
    }
}
