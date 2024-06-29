import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class289 {

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "[I")
    public static int[] field3887 = new int[2];

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "Lvh;")
    public static class240 field3888;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)I")
    public static final int method1651(int arg0, int arg1, int arg2) {
        field3889++;
        int var3 = 71 / ((arg1 - 53) / 62);
        return arg2 == 4 || arg2 == 5 ? class450.field6498[arg0 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(III)I")
    public static final int method1652(int arg0, int arg1, int arg2) {
        field3890++;
        int var3 = -64 / ((-arg1 - 72) / 52);
        int var4 = arg0 >> 31 & arg2 - 1;
        return (arg0 + (arg0 >>> 31)) % arg2 + var4;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V")
    public static void method1653(byte arg0) {
        if (arg0 > 61) {
            field3888 = null;
            field3887 = null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIILfq;Lfq;)V")
    public static final void method1654(int arg0, int arg1, int arg2, class134 arg3, class134 arg4) {
        class61 var5 = class176.method1082(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field814 = arg3;
            var5.field832 = arg4;
        }
    }
}
