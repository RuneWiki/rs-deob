import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class307 {

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "Ljava/lang/String;")
    public String field4441;

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "Ljava/lang/String;")
    public String field4442;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "Ljava/lang/String;")
    public String field4440;

    @OriginalMember(owner = "client!bq", name = "h", descriptor = "I")
    public static int field4447 = 0;

    @OriginalMember(owner = "client!bq", name = "f", descriptor = "I")
    public static int field4445 = 1400;

    @OriginalMember(owner = "client!bq", name = "d", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!bq", name = "e", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!bq", name = "g", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(B)V")
    public static final void method1942(byte arg0) {
        field4443++;
        class504 var1 = (class504) class289.field4242.method2551((byte) -108);
        boolean var2 = class437.field6161 != null || class348.field5120 > 0;
        int var3 = -4 % ((arg0 - 3) / 48);
        int var4 = var1.method1038(8);
        int var5 = var1.method1036(5);
        if (var2) {
            class605.field8218 = 1;
        }
        if (var2) {
            class665.field9190 = class788.field10852;
        } else {
            class249.method1675(class788.field10852, var5, 123, var4);
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IB)I")
    public static final int method1943(int arg0, byte arg1) {
        field4446++;
        return arg1 <= 104 ? 81 : arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public class307(String arg0, String arg1, String arg2) {
        this.field4441 = arg2;
        this.field4442 = arg1;
        this.field4440 = arg0;
    }
}
