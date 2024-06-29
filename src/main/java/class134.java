import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class134 {

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "I")
    public int field1828;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "[B")
    public static byte[] field1826 = new byte[2048];

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
    public static int field1827 = 0;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!gm", name = "toString", descriptor = "()Ljava/lang/String;", line = 10)
    public final String toString() {
        field1825++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lfq;)V", line = 21)
    public static final void method942(class214 arg0) {
        class34.field372.method552(arg0.field2802, arg0.field2815 + (arg0.method774((byte) 115) >> 1), arg0.field2810, class680.field9098);
        arg0.field2816 = class680.field9098[0];
        arg0.field2803 = class680.field9098[1];
        arg0.field2806 = class680.field9098[2];
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V", line = 28)
    public static final void method943(int arg0) {
        if (arg0 != 2) {
            method942(null);
        }
        field1829++;
        if (class384.field5573 == null) {
            return;
        }
        if (class384.field5573.field8405 == 1) {
            class384.field5573 = null;
            return;
        }
        if (class384.field5573.field8405 == 2) {
            class682.method3743(class458.field6539, arg0, class198.field2565, 2);
            class384.field5573 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)V", line = 60)
    public static void method944(byte arg0) {
        field1826 = null;
        if (arg0 < 63) {
            field1827 = -47;
        }
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", line = 74)
    public class134(String arg0, String arg1, String arg2, int arg3) {
        this.field1828 = arg3;
    }
}
