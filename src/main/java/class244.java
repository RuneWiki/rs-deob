import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class244 {

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public int field3152;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "I")
    private int field3154;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "I")
    public int field3155;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "Lgi;")
    public class635 field3157;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lji;B)V")
    public final void method1464(class572 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method3097((byte) 12);
            if (var3 == 0) {
                if (arg1 != -67) {
                    return;
                }
                field3151++;
                return;
            }
            this.method1466(arg0, var3, -112);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)Liba;")
    public final synchronized class495 method1465(boolean arg0) {
        if (arg0) {
            this.field3157 = null;
        }
        field3153++;
        class495 var2 = (class495) this.field3157.field8612.method1221((long) this.field3154, !arg0);
        if (var2 != null) {
            return var2;
        }
        class495 var3 = class495.method2695(this.field3157.field8603, this.field3154, 0);
        if (var3 != null) {
            this.field3157.field8612.method1230((byte) -119, (long) this.field3154, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lji;II)V")
    private final void method1466(class572 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3154 = arg0.method3031(-1);
        } else if (arg1 == 2) {
            this.field3152 = arg0.method3097((byte) 12);
            this.field3155 = arg0.method3097((byte) 12);
        }
        if (arg2 >= -110) {
            this.method1465(true);
        }
        field3156++;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIB)V")
    public static final void method1467(int arg0, int arg1, byte arg2) {
        field3150++;
        class243 var3 = class546.method2926(0, 15, true);
        var3.method1457(10);
        var3.field3132 = arg1;
        int var4 = 119 % ((arg2 + 20) / 54);
        var3.field3135 = arg0;
    }
}
