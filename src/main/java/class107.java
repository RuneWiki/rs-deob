import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class107 {

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "I")
    public static int field1350 = 104;

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "I")
    public static int field1353 = 0;

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "[[[Ldq;")
    public static class727[][][] field1351;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIBI)I", line = 6)
    public static final int method872(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != -25) {
            method873(-19);
        }
        field1352++;
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg0;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)V", line = 29)
    public static void method873(int arg0) {
        int var1 = -96 / ((arg0 + 51) / 60);
        field1351 = null;
    }
}
