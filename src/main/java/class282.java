import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class282 {

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "B")
    public byte field4146;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "Lcq;")
    public class305 field4148;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "S")
    public short field4151;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "B")
    public byte field4150;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public static int field4147 = 2;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)Z", line = 16)
    public static final boolean method1800(int arg0) {
        if (arg0 != 2) {
            method1800(-73);
        }
        class661.field9319++;
        field4149++;
        class344.field4890 = true;
        return true;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lcq;III)V", line = 30)
    public class282(class305 arg0, int arg1, int arg2, int arg3) {
        this.field4146 = (byte) arg3;
        this.field4148 = arg0;
        this.field4151 = (short) arg1;
        this.field4150 = (byte) arg2;
    }
}
