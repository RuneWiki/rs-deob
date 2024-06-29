import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class186 {

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field3299 = 0;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "Lsc;")
    public static class181 field3296 = class149.method967(255, ":");

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "Ldf;")
    public static class117 field3297;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)Lfj;")
    public static final class164 method1294(int arg0, int arg1, int arg2) {
        class220 var3 = class221.field3820[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class164 var4 = var3.field3805;
            var3.field3805 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
    public static void method1295(byte arg0) {
        field3296 = null;
        field3297 = null;
        int var1 = -24 / ((75 - arg0) / 35);
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(III)V")
    public static final void method1296(int arg0, int arg1, int arg2) {
        field3298++;
        long var3 = (long) ((arg2 << 16) + arg0);
        if (arg1 != 0) {
            method1296(2, 108, 35);
        }
        class232 var5 = (class232) class164.field2793.method1424(true, var3);
        if (var5 != null) {
            class25.field442.method624(arg1 ^ 0xFFFFFDB7, var5);
        }
    }
}
