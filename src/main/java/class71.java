import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class71 extends class13 {

    @OriginalMember(owner = "client!pv", name = "y", descriptor = "I")
    public int field1295 = 0;

    @OriginalMember(owner = "client!pv", name = "x", descriptor = "I")
    public static int field1294 = -1;

    @OriginalMember(owner = "client!pv", name = "w", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!pv", name = "z", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!pv", name = "A", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(ILcea;B)V", line = 11)
    private final void method685(int arg0, class215 arg1, byte arg2) {
        if (arg0 == 2) {
            this.field1295 = arg1.method1478(842397944);
        }
        field1297++;
        int var4 = -60 / ((arg2 + 26) / 51);
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(BLcea;)V", line = 32)
    public final void method686(byte arg0, class215 arg1) {
        while (true) {
            int var3 = arg1.method1535(arg0 + 239);
            if (var3 == 0) {
                if (arg0 != 16) {
                    field1294 = -83;
                }
                field1296++;
                return;
            }
            this.method685(var3, arg1, (byte) 70);
        }
    }
}
