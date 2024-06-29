import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class306 extends class632 {

    @OriginalMember(owner = "client!ss", name = "h", descriptor = "I")
    private int field4439;

    @OriginalMember(owner = "client!ss", name = "o", descriptor = "I")
    private int field4446;

    @OriginalMember(owner = "client!ss", name = "m", descriptor = "I")
    private int field4444;

    @OriginalMember(owner = "client!ss", name = "l", descriptor = "I")
    private int field4443;

    @OriginalMember(owner = "client!ss", name = "i", descriptor = "I")
    public static int field4440 = -1;

    @OriginalMember(owner = "client!ss", name = "j", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!ss", name = "k", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!ss", name = "n", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(BII)V")
    public final void method1992(byte arg0, int arg1, int arg2) {
        if (arg0 > 96) {
            ++field4442;
        }
    }

    @OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(IIIIII)V")
    public class306(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field4439 = arg3;
        this.field4446 = arg2;
        this.field4444 = arg0;
        this.field4443 = arg1;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIB)V")
    public final void method1993(int arg0, int arg1, byte arg2) {
        if (arg2 > -79) {
            this.method1994(96, (byte) 108, 63);
        }
        ++field4445;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IBI)V")
    public final void method1994(int arg0, byte arg1, int arg2) {
        ++field4441;
        int var4 = this.field4444 * arg0 >> 12;
        int var5 = this.field4446 * arg0 >> 12;
        int var6 = this.field4443 * arg2 >> 12;
        int var7 = 60 % ((arg1 - 33) / 62);
        int var8 = this.field4439 * arg2 >> 12;
        class651.method3730(var8, var4, super.field8836, true, var5, var6);
    }
}
