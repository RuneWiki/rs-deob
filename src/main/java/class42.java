import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public class class42 {

    @OriginalMember(owner = "client!kaa", name = "c", descriptor = "[I")
    public static int[] field334 = new int[2048];

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!kaa", name = "d", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Z)V", line = 6)
    public static void method221(boolean arg0) {
        if (arg0) {
            field335 = -9;
        }
        field334 = null;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)V", line = 24)
    public static final void method222(int arg0) {
        for (int var1 = 0; var1 < class474.field6637; var1++) {
            int var2 = class194.field2345[var1];
            class415 var3 = (class415) class309.field3938.method2645((long) var2, (byte) -103);
            if (var3 != null) {
                class459 var4 = var3.field5390;
                class66.method373(var4.field6334.field844, 0, var4);
            }
        }
        if (arg0 != -14077) {
            field334 = null;
        }
        field332++;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(II)I", line = 54)
    public static int method223(int arg0, int arg1) {
        return arg0 | arg1;
    }
}
