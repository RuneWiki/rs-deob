import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class166 {

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "B")
    public byte field2119;

    @OriginalMember(owner = "client!ls", name = "h", descriptor = "Lvn;")
    public class211 field2125;

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "S")
    public short field2121;

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "B")
    public byte field2122;

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "I")
    public static int field2120 = -1;

    @OriginalMember(owner = "client!ls", name = "g", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!ls", name = "f", descriptor = "I")
    public static int field2123;

    static {
        new class486("", 73);
        field2124 = 1337;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IJ)V", line = 4)
    public static final void method1047(int arg0, long arg1) {
        if (arg0 != -1) {
            method1047(-70, -111L);
        }
        class448.field6278.setTime(new Date(arg1));
        field2123++;
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lvn;III)V", line = 33)
    public class166(class211 arg0, int arg1, int arg2, int arg3) {
        this.field2119 = (byte) arg2;
        this.field2125 = arg0;
        this.field2121 = (short) arg1;
        this.field2122 = (byte) arg3;
    }
}
