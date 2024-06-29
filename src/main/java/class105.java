import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class105 {

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "I")
    public static int field1583 = 0;

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "[I")
    public static int[] field1584 = new int[8];

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "I")
    public static int field1586 = 0;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "Lr;")
    public class157 field1580;

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "Lk;")
    public class485 field1585;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IBIII)V")
    public static final void method742(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field1582++;
        if (arg3 >= arg2) {
            for (int var5 = arg2; var5 < arg3; var5++) {
                class182.field2580[var5][arg4] = arg0;
            }
        } else {
            for (int var6 = arg3; var6 < arg2; var6++) {
                class182.field2580[var6][arg4] = arg0;
            }
        }
        int var7 = -126 / ((arg1 + 23) / 48);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)V")
    public static void method743(byte arg0) {
        if (arg0 >= -112) {
            field1583 = -58;
        }
        field1584 = null;
    }
}
