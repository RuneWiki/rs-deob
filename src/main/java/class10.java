import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public abstract class class10 {

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "Lkg;")
    public static class179 field162 = new class179(44, 3);

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V", line = 12)
    public static void method71(int arg0) {
        if (arg0 == -16711936) {
            field162 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIII)I", line = 23)
    public static final int method72(int arg0, int arg1, int arg2, int arg3) {
        field161++;
        if (arg3 > -57) {
            method71(68);
        }
        int var4 = ((arg0 & 0xFF00) * arg1 & 0xFF0000 | (arg0 & 0xFF00FF) * arg1 & 0xFF00FF00) >>> 8;
        int var5 = 255 - arg1;
        return (((arg2 & 0xFF00FF) * var5 & 0xFF00FF00 | (arg2 & 0xFF00) * var5 & 0xFF0000) >>> 8) + var4;
    }
}
