import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class253 {

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "B")
    public byte field4101;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    public int field4098;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "Ljava/lang/String;")
    public String field4100;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "Ljava/lang/String;")
    public String field4102;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "Ljava/lang/String;")
    public String field4103;

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "Ljava/lang/String;")
    public String field4104;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lfi;ZI)I")
    public static final int method1796(class38 arg0, boolean arg1, int arg2) {
        field4097++;
        if (!client.method3078(arg0).method793(1, arg2) && arg0.field533 == null) {
            return -1;
        } else if (arg1) {
            return -29;
        } else if (arg0.field531 == null || arg0.field531.length <= arg2) {
            return -1;
        } else {
            return arg0.field531[arg2];
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
    public static final void method1797(int arg0) {
        if (arg0 != -1) {
            return;
        }
        field4099++;
        for (class541 var1 = (class541) class368.field5420.method295((byte) 111); var1 != null; var1 = (class541) class368.field5420.method296(true)) {
            if (var1.field7924 == -1) {
                var1.field7926 = 0;
                if (var1.field7927 >= 0 && var1.field7925 >= 0 && class338.field5076 > var1.field7927 && var1.field7925 < class250.field4077) {
                    class243.method1642(var1, (byte) -65);
                }
            } else {
                var1.method947((byte) 92);
            }
        }
    }
}
