import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class95 extends class381 {

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "Ljava/lang/String;")
    public String field1459;

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(JJ)J", line = 4)
    public static long method596(long arg0, long arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)V", line = 12)
    public static final void method597(byte arg0) {
        field1460++;
        if (class500.field7079) {
            return;
        }
        if (arg0 < 58) {
            method597((byte) 69);
        }
        if (class335.field4872.field9499) {
            class311.field4589 = ((int) class311.field4589 + 191 & 0xFFFFFF80);
        } else {
            class682.field9632 += (24.0F - class682.field9632) / 2.0F;
        }
        class567.field8268 = true;
        class500.field7079 = true;
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V", line = 37)
    public class95() {
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 39)
    public class95(String arg0, int arg1) {
        this.field1459 = arg0;
    }
}
