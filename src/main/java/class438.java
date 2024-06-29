import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class438 extends class557 {

    @OriginalMember(owner = "client!nv", name = "o", descriptor = "Ljava/lang/String;")
    private String field6322 = null;

    @OriginalMember(owner = "client!nv", name = "q", descriptor = "J")
    private long field6324 = -1L;

    @OriginalMember(owner = "client!nv", name = "n", descriptor = "I")
    public static int field6321;

    @OriginalMember(owner = "client!nv", name = "p", descriptor = "I")
    public static int field6323;

    @OriginalMember(owner = "client!nv", name = "m", descriptor = "[Leaa;")
    public static class526[] field6320;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(BLdt;)V", line = 12)
    public final void method30(byte arg0, class254 arg1) {
        if (arg0 != 110) {
            this.field6324 = 84L;
        }
        field6321++;
        if (arg1.method1731((byte) 64) != 255) {
            arg1.field3725--;
            this.field6324 = arg1.method1723(21795);
        }
        this.field6322 = arg1.method1694(0);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)V", line = 31)
    public static void method2623(int arg0) {
        if (arg0 != 255) {
            method2623(-11);
        }
        field6320 = null;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ltn;I)V", line = 44)
    public final void method32(class95 arg0, int arg1) {
        field6323++;
        arg0.method744(this.field6322, -20179, this.field6324);
        if (arg1 != -29265) {
            this.field6324 = 50L;
        }
    }
}
