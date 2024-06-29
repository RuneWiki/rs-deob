import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class45 {

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    private static int field702 = 0;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "Z")
    private static boolean field703 = false;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "Lnv;")
    private static class44 field704 = new class44();

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V", line = 3)
    public static final synchronized void method299(byte arg0) {
        while (true) {
            class400 var1 = (class400) field704.method298(-90);
            if (var1 == null) {
                if (arg0 < 57) {
                    field704 = null;
                    return;
                }
                return;
            }
            var1.field5891.method164();
            var1.method947((byte) 99);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lnf;I)V", line = 30)
    public static final synchronized void method300(class28 arg0, int arg1) {
        if (field703) {
            return;
        }
        if (arg1 < field702) {
            class400 var2 = new class400();
            var2.field5891 = arg0;
            field704.method292((byte) 121, var2);
        } else {
            arg0.method164();
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IZ)V", line = 53)
    public static final synchronized void method301(int arg0, boolean arg1) {
        field703 = arg1;
        if (arg0 != -18620) {
            method301(-37, false);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V", line = 63)
    public static final synchronized void method302(int arg0) {
        field702--;
        if (field702 == 0) {
            method299((byte) 67);
        }
        if (arg0 != 30026) {
            field704 = null;
        }
    }
}
