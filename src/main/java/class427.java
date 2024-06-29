import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class427 {

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "I")
    public static int field6354 = 0;

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "I")
    public static int field6353 = 0;

    @OriginalMember(owner = "client!sr", name = "i", descriptor = "J")
    public static long field6357 = -1L;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "I")
    public static int field6349 = 0;

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "I")
    public static int field6350;

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "I")
    public int field6351;

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "I")
    public static int field6352;

    @OriginalMember(owner = "client!sr", name = "g", descriptor = "I")
    public int field6355;

    @OriginalMember(owner = "client!sr", name = "h", descriptor = "I")
    public int field6356;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(BII)V", line = 7)
    public static final void method2563(byte arg0, int arg1, int arg2) {
        field6352++;
        if (arg0 != -100) {
            method2564(true);
        }
        if (class393.field5983 == class259.field3610) {
            if (!class126.method805(-2, 0, 0, false, 1, 1, arg1, true, arg2)) {
                class126.method805(-3, 0, 0, false, 1, 1, arg1, true, arg2);
            }
        } else if (!class126.method805(-3, 0, 0, false, 1, 1, arg1, true, arg2)) {
            class126.method805(-2, 0, 0, false, 1, 1, arg1, true, arg2);
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Z)V", line = 48)
    public static final void method2564(boolean arg0) {
        field6350++;
        class398.field6065 = 0;
        if (arg0) {
            field6353 = 11;
        }
        int var1 = (class339.field5365.field2217 >> 7) + class82.field1105;
        int var2 = (class339.field5365.field2215 >> 7) + class437.field6477;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class398.field6065 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class398.field6065 = 1;
        }
        if (class398.field6065 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class398.field6065 = 0;
        }
    }
}
