import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class287 {

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "I")
    public int field4091;

    @OriginalMember(owner = "client!ep", name = "m", descriptor = "S")
    public short field4100;

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "S")
    public short field4090;

    @OriginalMember(owner = "client!ep", name = "k", descriptor = "I")
    public int field4098;

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "I")
    public int field4092;

    @OriginalMember(owner = "client!ep", name = "j", descriptor = "B")
    public byte field4097;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "Z")
    public boolean field4088;

    @OriginalMember(owner = "client!ep", name = "l", descriptor = "B")
    public byte field4099;

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "I")
    public int field4089;

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "S")
    public short field4093;

    @OriginalMember(owner = "client!ep", name = "g", descriptor = "I")
    public int field4094;

    @OriginalMember(owner = "client!ep", name = "h", descriptor = "Ljava/util/Calendar;")
    public static Calendar field4095 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!ep", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field4096;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V")
    public static void method1825(int arg0) {
        field4096 = null;
        if (arg0 != -10536) {
            method1825(-39);
        }
        field4095 = null;
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class287(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field4091 = arg2;
        this.field4100 = (short) arg6;
        this.field4090 = (short) arg4;
        this.field4098 = arg3;
        this.field4092 = arg0;
        this.field4097 = (byte) arg8;
        this.field4088 = arg10;
        this.field4099 = (byte) arg7;
        this.field4089 = arg11;
        this.field4093 = (short) arg5;
        this.field4094 = arg1;
    }
}
