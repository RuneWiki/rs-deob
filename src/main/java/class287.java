import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class287 {

    @OriginalMember(owner = "client!h", name = "b", descriptor = "Lke;")
    public static class256 field4970 = class316.method2202(":duelstake:", 27626);

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    public static int field4972 = 0;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "Lke;")
    public static class256 field4969 = class316.method2202("Objet d(Wabonn-Bs", 27626);

    @OriginalMember(owner = "client!h", name = "c", descriptor = "Lke;")
    public static class256 field4971 = class316.method2202("Prendre", 27626);

    @OriginalMember(owner = "client!h", name = "j", descriptor = "I")
    public static int field4978 = 0;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "I")
    public static int field4973;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "I")
    public static int field4974;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    public static int field4975;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "Llk;")
    public static class252 field4977;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)Lcn;", line = 4)
    public static final class213 method2005(int arg0) {
        field4973++;
        if (arg0 != -13576) {
            field4972 = -51;
        }
        try {
            return (class213) Class.forName("cl").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lql;ZI)V", line = 30)
    public static final void method2006(class316 arg0, boolean arg1, int arg2) {
        int var3 = (int) arg0.field2895;
        int var4 = arg0.field5453;
        arg0.method1199(21966);
        if (arg1) {
            class91.method677(854, var4);
        }
        if (arg2 != 30656) {
            return;
        }
        field4976++;
        class267.method1853(var4, 65535);
        class188 var5 = class182.method1335((byte) 101, var3);
        if (var5 != null) {
            class64.method500(var5, (byte) -117);
        }
        int var6 = class17.field244;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class256.method1801(arg2 - 30722, class303.field5243[var7])) {
                class107.method757((byte) -86, var7);
            }
        }
        if (class17.field244 == 1) {
            class73.field1341 = false;
            class320.method2229(class137.field2389, class173.field3074, class85.field1538, class148.field2609, (byte) 90);
        } else {
            class320.method2229(class137.field2389, class173.field3074, class85.field1538, class148.field2609, (byte) 90);
            int var8 = class17.field215.method2045(class64.field1142);
            for (int var9 = 0; var9 < class17.field244; var9++) {
                int var10 = class17.field215.method2045(class191.method1387(var9, (byte) -104));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class85.field1538 = var8 + 8;
            class173.field3074 = (class36.field650 ? 26 : 22) + class17.field244 * 15;
        }
        if (class211.field3803 != -1) {
            class281.method1965(class211.field3803, arg2 - 6095, 1);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V", line = 96)
    public static void method2007(byte arg0) {
        field4969 = null;
        int var1 = 21 % ((-arg0 - 42) / 57);
        field4970 = null;
        field4977 = null;
        field4971 = null;
    }
}
