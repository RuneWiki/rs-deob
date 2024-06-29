import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class64 {

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "Ljh;")
    public static class106 field1054 = new class106(5000);

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
    public static int field1058 = 0;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "Lmb;")
    public static class132 field1059 = class166.method1092("(U(Y", 112);

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "I")
    public static int field1062 = 0;

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "Lmb;")
    public static class132 field1061 = class166.method1092("", 118);

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "I")
    public static int field1063 = 0;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "Lpb;")
    public static class165 field1057;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)I")
    public static final int method403(int arg0, int arg1, int arg2) {
        class219 var3 = (class219) class231.field4166.method806(-1, (long) arg0);
        field1060++;
        if (var3 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var4 = 0;
            int var5 = 0;
            if (arg2 != 5298) {
                field1054 = null;
            }
            while (var5 < var3.field3998.length) {
                if (var3.field3997[var5] == arg1) {
                    var4 += var3.field3998[var5];
                }
                var5++;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method404(int arg0, int arg1) {
        field1056++;
        if (arg1 == 100 && class9.field89 > 0) {
            byte[] var2 = class21.field300[--class9.field89];
            class21.field300[class9.field89] = null;
            return var2;
        }
        if (arg0 != -17243) {
            field1059 = null;
        }
        if (arg1 == 5000 && class144.field2682 > 0) {
            byte[] var3 = class105.field1958[--class144.field2682];
            class105.field1958[class144.field2682] = null;
            return var3;
        } else if (arg1 == 30000 && class34.field557 > 0) {
            byte[] var4 = class185.field3397[--class34.field557];
            class185.field3397[class34.field557] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
    public static void method405(int arg0) {
        field1054 = null;
        field1061 = null;
        field1059 = null;
        if (arg0 > -36) {
            method403(73, 38, 11);
        }
        field1057 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IILjava/awt/Component;Z)Lig;")
    public static final class94 method406(int arg0, int arg1, Component arg2, boolean arg3) {
        if (!arg3) {
            return null;
        }
        field1055++;
        try {
            Class var4 = Class.forName("kf");
            class94 var5 = (class94) var4.getDeclaredConstructor().newInstance();
            var5.method583(arg1, arg0, arg2, (byte) -104);
            return var5;
        } catch (Throwable var7) {
            class180 var6 = new class180();
            var6.method583(arg1, arg0, arg2, (byte) -104);
            return var6;
        }
    }
}
