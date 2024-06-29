import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public class class309 extends class101 {

    @OriginalMember(owner = "client!gga", name = "p", descriptor = "I")
    public int field4455;

    @OriginalMember(owner = "client!gga", name = "n", descriptor = "I")
    public int field4453;

    @OriginalMember(owner = "client!gga", name = "q", descriptor = "Ljw;")
    public static class581 field4456 = new class581(112, 4);

    @OriginalMember(owner = "client!gga", name = "r", descriptor = "[I")
    public static int[] field4457 = null;

    @OriginalMember(owner = "client!gga", name = "o", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(B)V", line = 5)
    public static void method1945(byte arg0) {
        field4456 = null;
        if (arg0 != 94) {
            field4456 = null;
        }
        field4457 = null;
    }

    @OriginalMember(owner = "client!gga", name = "<init>", descriptor = "(II)V", line = 17)
    public class309(int arg0, int arg1) {
        this.field4455 = arg1;
        this.field4453 = arg0;
    }
}
