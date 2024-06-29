import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class465 extends class476 {

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "[Lbs;")
    public static class200[] field6706 = new class200[128];

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "I")
    public static int field6711 = 0;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "I")
    public static int field6708;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "I")
    public int field6709;

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "I")
    public int field6712;

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "I")
    public int field6713;

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "Lcea;")
    public class103 field6710;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "[Lpaa;")
    public class315[] field6707;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V")
    public static void method2708(byte arg0) {
        field6706 = null;
        if (arg0 >= -4) {
            field6711 = 67;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIILqa;)Z")
    public final boolean method2709(int arg0, int arg1, int arg2, class167 arg3) {
        if (arg1 != 0) {
            this.field6707 = null;
        }
        field6708++;
        if (this.field6707 != null) {
            for (int var5 = 0; var5 < this.field6707.length; var5++) {
                if (this.field6707[var5].method1944(arg2, arg0) && this.field6710.method263((byte) 29, arg3, arg2, arg0)) {
                    return true;
                }
            }
        }
        return false;
    }
}
