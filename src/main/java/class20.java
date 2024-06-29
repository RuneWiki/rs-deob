import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class20 {

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "Lsc;")
    private static class181 field352 = class149.method967(255, "Examine");

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "[I")
    public static int[] field354 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "Lsc;")
    public static class181 field359 = class149.method967(255, "null");

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "Lsc;")
    public static class181 field353 = field352;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "Ljd;")
    public static class265 field362 = new class265(50);

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "Lsc;")
    public static class181 field363 = class149.method967(255, "(U(Y");

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BI)V")
    public static final void method185(byte arg0, int arg1) {
        class171.field2865.method1796(20, arg1);
        int var2 = -73 % ((arg0 - 77) / 35);
        field357++;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)V")
    public static void method186(boolean arg0) {
        field353 = null;
        field352 = null;
        field363 = null;
        field362 = null;
        if (arg0) {
            method186(false);
        }
        field354 = null;
        field359 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)Ltg;")
    public static final class107 method187(byte arg0) {
        field360++;
        int var1 = class196.field3425[0] * class121.field1978[0];
        int[] var2 = new int[var1];
        byte[] var3 = class143.field2319[0];
        for (int var4 = 0; var4 < var1; var4++) {
            var2[var4] = class254.field4443[class5.method43(var3[var4], 255)];
        }
        int var5 = 22 % ((92 - arg0) / 33);
        class48 var6 = new class48(class219.field3777, class78.field1273, class220.field3782[0], class23.field410[0], class196.field3425[0], class121.field1978[0], var2);
        class143.method919(16);
        return var6;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
    public static final void method188(int arg0) {
        if (arg0 <= 14) {
            method187((byte) -59);
        }
        for (class228 var1 = (class228) class165.field2807.method1418(0); var1 != null; var1 = (class228) class165.field2807.method1421(false)) {
            int var2 = var1.field3913;
            if (class77.method537(-1, var2)) {
                class175[] var3 = class208.field3563[var2];
                boolean var4 = true;
                for (int var5 = 0; var5 < var3.length; var5++) {
                    if (var3[var5] != null) {
                        var4 = var3[var5].field2972;
                        break;
                    }
                }
                if (!var4) {
                    int var6 = (int) var1.field606;
                    class175 var7 = class52.method394(var6, false);
                    if (var7 != null) {
                        class218.method1453((byte) -120, var7);
                    }
                }
            }
        }
        field361++;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Led;Z)I")
    public static final int method189(class116 arg0, boolean arg1) {
        field356++;
        if (!arg1) {
            return 39;
        }
        int var2 = arg0.field1890;
        if (arg0.field2655 == arg0.field2629) {
            var2 = arg0.field1886;
        } else if (arg0.field2629 == arg0.field2625) {
            var2 = arg0.field1898;
        }
        return var2;
    }
}
