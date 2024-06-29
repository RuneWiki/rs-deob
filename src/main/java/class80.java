import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public class class80 {

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!dba", name = "c", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(IIIIB)V", line = 4)
    public static final void method766(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field1000++;
        if (arg0 <= arg2) {
            for (int var5 = arg0; var5 < arg2; var5++) {
                class39.field527[var5][arg1] = arg3;
            }
        } else {
            for (int var6 = arg2; var6 < arg0; var6++) {
                class39.field527[var6][arg1] = arg3;
            }
        }
        if (arg4 > -108) {
            method766(-84, 35, 124, -60, (byte) 79);
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(II)I", line = 46)
    public static final int method767(int arg0, int arg1) {
        field1002++;
        return arg1 == 127 ? arg0 & 0x7F : -14;
    }
}
