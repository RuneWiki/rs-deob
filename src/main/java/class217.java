import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public class class217 extends class408 {

    @OriginalMember(owner = "client!sba", name = "B", descriptor = "I")
    public int field3206 = 0;

    @OriginalMember(owner = "client!sba", name = "y", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!sba", name = "z", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(IILrg;)V", line = 5)
    private final void method1461(int arg0, int arg1, class645 arg2) {
        if (arg1 == 2) {
            this.field3206 = arg2.method3712((byte) -4);
        }
        if (arg0 <= 47) {
            this.method1461(88, -87, null);
        }
        field3204++;
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(BLrg;)V", line = 27)
    public final void method1462(byte arg0, class645 arg1) {
        field3205++;
        while (true) {
            int var3 = arg1.method3745(-6314);
            if (var3 == 0) {
                if (arg0 == 61) {
                    return;
                } else {
                    this.method1462((byte) 112, null);
                    return;
                }
            }
            this.method1461(94, var3, arg1);
        }
    }
}
