import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class71 {

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
    public static int field1073 = -50;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "Lgf;")
    public static class46 field1075 = new class46("", 12);

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "Lmn;")
    public static class162 field1074;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V")
    public static void method524(byte arg0) {
        if (arg0 == 40) {
            field1075 = null;
            field1074 = null;
        }
    }
}
