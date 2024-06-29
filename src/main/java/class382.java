import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class382 {

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "Lmq;")
    public static class78 field5328 = new class78(47, 11);

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "I")
    public static int field5326;

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "I")
    public static int field5327;

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "I")
    public static int field5329;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IB)I", line = 5)
    public static final int method2300(int arg0, byte arg1) {
        field5327++;
        if (arg1 > -92) {
            method2302(-43);
        }
        return (arg0 & 0x3FE83) >> 11;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(BII)Z", line = 25)
    public static final boolean method2301(byte arg0, int arg1, int arg2) {
        if (arg0 == -15) {
            field5326++;
            return (arg1 & 0x34) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V", line = 37)
    public static void method2302(int arg0) {
        if (arg0 == 47) {
            field5328 = null;
        }
    }
}
