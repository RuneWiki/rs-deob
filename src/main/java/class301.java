import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class301 extends class88 {

    @OriginalMember(owner = "client!hw", name = "d", descriptor = "[I")
    public int[] field4328;

    @OriginalMember(owner = "client!hw", name = "g", descriptor = "[I")
    public int[] field4331;

    @OriginalMember(owner = "client!hw", name = "f", descriptor = "Z")
    public static boolean field4330 = false;

    @OriginalMember(owner = "client!hw", name = "e", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(III)I", line = 11)
    public static final int method1876(int arg0, int arg1, int arg2) {
        int var3 = (arg0 & 0x7F) * arg2 >> 7;
        field4329++;
        if (arg1 != 23738) {
            method1876(-78, -121, 25);
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(II[I[I)V", line = 30)
    public class301(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field4328 = arg2;
        this.field4331 = arg3;
    }
}
