import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class356 {

    @OriginalMember(owner = "client!en", name = "b", descriptor = "Ldk;")
    private class421 field5141;

    @OriginalMember(owner = "client!en", name = "e", descriptor = "I")
    public int field5144;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "[I")
    public static int[] field5140 = new int[2048];

    @OriginalMember(owner = "client!en", name = "c", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!en", name = "d", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method2127(int arg0, int arg1, boolean arg2) {
        field5143++;
        if (arg2) {
            return false;
        } else {
            return (arg1 & 0x10) != 0;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V")
    public static void method2128(int arg0) {
        if (arg0 != 16) {
            field5140 = null;
        }
        field5140 = null;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ZIZI)I")
    public static final int method2129(boolean arg0, int arg1, boolean arg2, int arg3) {
        field5142++;
        if (arg0) {
            field5140 = null;
        }
        class412 var4 = class379.method2261(3597, arg2, arg1);
        if (var4 == null) {
            return 0;
        } else if (arg3 == -1) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = 0; var6 < var4.field5866.length; var6++) {
                if (var4.field5865[var6] == arg3) {
                    var5 += var4.field5866[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lad;ILdk;)V")
    public class356(class12 arg0, int arg1, class421 arg2) {
        new class473(64);
        this.field5141 = arg2;
        this.field5144 = this.field5141.method2509(0, 15);
    }
}
