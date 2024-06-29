import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class377 extends class270 {

    @OriginalMember(owner = "client!dn", name = "h", descriptor = "I")
    public static int field5192 = 0;

    @OriginalMember(owner = "client!dn", name = "j", descriptor = "[I")
    public static int[] field5194 = new int[50];

    @OriginalMember(owner = "client!dn", name = "k", descriptor = "Lrc;")
    public static class108 field5195 = new class108(35, -2);

    @OriginalMember(owner = "client!dn", name = "l", descriptor = "[I")
    public static int[] field5196 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!dn", name = "m", descriptor = "I")
    public static int field5197 = -1;

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "I")
    public static int field5191;

    @OriginalMember(owner = "client!dn", name = "i", descriptor = "I")
    public static int field5193;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIZ)I", line = 3)
    public static final int method2304(int arg0, int arg1, boolean arg2) {
        field5191++;
        int var3 = arg1 >>> 31;
        if (arg2) {
            field5196 = null;
        }
        return (arg1 + var3) / arg0 - var3;
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(I)V", line = 16)
    public static final void method2305(int arg0) {
        class266.field3835.method296(class227.field3266, class300.field4246 ? class469.field6612 + 256 : -1);
        if (arg0 == 4) {
            field5193++;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Z)V", line = 35)
    public static void method2306(boolean arg0) {
        field5195 = null;
        field5194 = null;
        field5196 = null;
        if (!arg0) {
            method2306(false);
        }
    }
}
