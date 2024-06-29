import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class54 {

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "Ldc;")
    public static class37 field1059 = class185.method1233((byte) 86, "null");

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
    public static int field1061 = 0;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "Ldc;")
    private static class37 field1060 = class185.method1233((byte) 86, "Unable to connect)3");

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "Ldc;")
    public static class37 field1056 = field1060;

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "Ldc;")
    public static class37 field1065 = field1060;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "J")
    public static long field1057;

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "J")
    public long field1066;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "Lkj;")
    public static class118 field1055;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "Lej;")
    public class54 field1062;

    @OriginalMember(owner = "client!ej", name = "n", descriptor = "Lej;")
    public class54 field1068;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "[Lqh;")
    public static class182[] field1058;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)Z")
    public final boolean method432(int arg0) {
        field1063++;
        if (this.field1068 == null) {
            return false;
        } else {
            return arg0 == -18996;
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V")
    public final void method433(int arg0) {
        field1064++;
        if (arg0 != 0) {
            this.method432(98);
        }
        if (this.field1068 != null) {
            this.field1068.field1062 = this.field1062;
            this.field1062.field1068 = this.field1068;
            this.field1068 = null;
            this.field1062 = null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V")
    public static void method434(byte arg0) {
        field1060 = null;
        field1058 = null;
        field1059 = null;
        field1056 = null;
        field1065 = null;
        field1055 = null;
        if (arg0 != -11) {
            method434((byte) -75);
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(B)V")
    public static final void method435(byte arg0) {
        if (arg0 <= 115) {
            return;
        }
        class72 var1 = class94.field1647;
        synchronized (class94.field1647) {
            class174.field3316++;
            class236.field4294 = class41.field845;
            if (class38.field799 >= 0) {
                while (class77.field1352 != class38.field799) {
                    int var2 = class13.field188[class77.field1352];
                    class77.field1352 = class77.field1352 + 1 & 0x7F;
                    if (var2 >= 0) {
                        class229.field4204[var2] = true;
                    } else {
                        class229.field4204[~var2] = false;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class229.field4204[var3] = false;
                }
                class38.field799 = class77.field1352;
            }
            class41.field845 = class147.field2810;
        }
        field1067++;
    }
}
