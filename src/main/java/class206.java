import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class206 {

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "Lph;")
    public static class229 field3393 = class266.method1858(" <col=ffff00>", 0);

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "[I")
    public static int[] field3395 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
    public static int field3398 = 0;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IB)Lri;", line = 4)
    public static final class301 method1440(int arg0, byte arg1) {
        field3391++;
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (arg1 != -68) {
            method1441((byte) -117);
        }
        if (class37.field604[var2] == null || class37.field604[var2][var3] == null) {
            boolean var4 = class69.method542(var2, -1);
            if (!var4) {
                return null;
            }
        }
        return class37.field604[var2][var3];
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V", line = 46)
    public static void method1441(byte arg0) {
        if (arg0 <= -84) {
            field3393 = null;
            field3395 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZJ)V", line = 79)
    public static final void method1442(boolean arg0, long arg1) {
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var4) {
        }
        if (!arg0) {
            field3400 = -100;
        }
        field3392++;
    }
}
