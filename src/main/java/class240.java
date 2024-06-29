import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class240 {

    @OriginalMember(owner = "client!ew", name = "f", descriptor = "I")
    public int field3090;

    @OriginalMember(owner = "client!ew", name = "d", descriptor = "Lew;")
    public static class240 field3088 = new class240(1);

    @OriginalMember(owner = "client!ew", name = "g", descriptor = "Lew;")
    public static class240 field3091 = new class240(2);

    @OriginalMember(owner = "client!ew", name = "h", descriptor = "Lew;")
    public static class240 field3092 = new class240(4);

    @OriginalMember(owner = "client!ew", name = "i", descriptor = "Lew;")
    public static class240 field3093 = new class240(1);

    @OriginalMember(owner = "client!ew", name = "j", descriptor = "Lew;")
    public static class240 field3094 = new class240(2);

    @OriginalMember(owner = "client!ew", name = "k", descriptor = "Lew;")
    public static class240 field3095 = new class240(4);

    @OriginalMember(owner = "client!ew", name = "l", descriptor = "Lew;")
    public static class240 field3096 = new class240(2);

    @OriginalMember(owner = "client!ew", name = "m", descriptor = "Lew;")
    public static class240 field3097 = new class240(4);

    @OriginalMember(owner = "client!ew", name = "o", descriptor = "I")
    public static int field3099 = 0;

    @OriginalMember(owner = "client!ew", name = "n", descriptor = "I")
    public static int field3098 = -1;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!ew", name = "e", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!ew", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3089++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(B)V")
    public static void method1496(byte arg0) {
        field3097 = null;
        int var1 = -14 / ((arg0 + 54) / 42);
        field3088 = null;
        field3096 = null;
        field3095 = null;
        field3091 = null;
        field3092 = null;
        field3094 = null;
        field3093 = null;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)V")
    public static final void method1497(int arg0) {
        field3087++;
        int var1 = 0;
        for (int var2 = arg0; var2 < class613.field8591; var2++) {
            for (int var3 = 0; var3 < class1.field3; var3++) {
                if (class304.method1794(var1, 84, true, var3, var2, class495.field7002)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(I)V")
    public static final void method1498(int arg0) {
        field3086++;
        int var1 = 0;
        if (arg0 <= 33) {
            field3091 = null;
        }
        while (class215.field2728.length > var1) {
            for (int var2 = 0; var2 < class215.field2728[0].length; var2++) {
                for (int var3 = 0; var3 < class215.field2728[0][0].length; var3++) {
                    class215.field2728[var1][var2][var3] = 0;
                }
            }
            var1++;
        }
    }

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "(I)V")
    public static final void method1499(int arg0) {
        if (arg0 < 99) {
            return;
        }
        for (class359 var1 = (class359) class681.field9283.method2565((byte) 92); var1 != null; var1 = (class359) class681.field9283.method2568(-31355)) {
            if (var1.field5121 > 1) {
                var1.field5121 = 0;
                class131.field1569.method774(((class718) var1.field5117.field6099.field8705).field10131, -32, var1);
                var1.field5117.method2563(false);
            }
        }
        field3085++;
        class1.field1 = 0;
        class573.field8011 = 0;
        class565.field7906.method3114(true);
        class124.field1491.method3251(false);
        class681.field9283.method2563(false);
        class716.method3981((byte) -103, class494.field6991);
    }

    @OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(I)V")
    private class240(int arg0) {
        this.field3090 = arg0;
    }
}
