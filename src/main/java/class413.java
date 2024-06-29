import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class413 {

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "Lmq;")
    public static class295 field6002 = null;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field5995 = -1;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public int field5994;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public int field5996;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public int field5997;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field5998;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field5999;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field6000;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field6001;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Leb;BI)V", line = 4)
    private final void method2645(class371 arg0, byte arg1, int arg2) {
        field5998++;
        if (arg2 == 1) {
            this.field5996 = arg0.method2403((byte) 61);
            this.field5997 = arg0.method2429(arg1 ^ 0x25);
            this.field5994 = arg0.method2429(0);
        }
        if (arg1 != 37) {
            method2647(-44);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Leb;I)V", line = 27)
    public final void method2646(class371 arg0, int arg1) {
        if (arg1 >= -52) {
            method2647(-106);
        }
        field6000++;
        while (true) {
            int var3 = arg0.method2429(0);
            if (var3 == 0) {
                return;
            }
            this.method2645(arg0, (byte) 37, var3);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V", line = 48)
    public static void method2647(int arg0) {
        if (arg0 <= 78) {
            method2647(-105);
        }
        field6002 = null;
    }
}
