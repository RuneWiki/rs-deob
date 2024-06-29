import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class16 {

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "Lru;")
    public static class177 field167 = new class177(16);

    @OriginalMember(owner = "client!nr", name = "g", descriptor = "[I")
    public static int[] field170 = new int[2];

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "I")
    public int field164;

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!nr", name = "f", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "Ljava/lang/String;")
    public String field166;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)V")
    public static void method87(int arg0) {
        field170 = null;
        field167 = null;
        if (arg0 != 2389) {
            field170 = null;
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lgh;I)V")
    public static final void method88(class350 arg0, int arg1) {
        field168++;
        class407 var2 = (class407) class249.field4049.method1122((byte) 59, (long) arg0.field847);
        if (var2 != null) {
            if (var2.field6148 != null) {
                class411.field6231.method482(var2.field6148);
                var2.field6148 = null;
            }
            var2.method3149(109);
        }
        if (arg1 != 2) {
            field167 = null;
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IBI)I")
    public static final int method89(int arg0, byte arg1, int arg2) {
        field169++;
        if (arg0 == 4 || arg0 == 5) {
            return class399.field6021[arg2 & 0x3];
        } else if (arg1 > -61) {
            return 118;
        } else {
            return 256;
        }
    }
}
