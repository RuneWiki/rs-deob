import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class193 extends class147 {

    @OriginalMember(owner = "client!as", name = "q", descriptor = "I")
    public int field2651;

    @OriginalMember(owner = "client!as", name = "t", descriptor = "I")
    public int field2654;

    @OriginalMember(owner = "client!as", name = "o", descriptor = "Lss;")
    public static class140 field2649 = new class140(10, 7);

    @OriginalMember(owner = "client!as", name = "r", descriptor = "[I")
    public static int[] field2652 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!as", name = "u", descriptor = "Lud;")
    public static class2 field2655 = new class2("LIVE", 0);

    @OriginalMember(owner = "client!as", name = "p", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!as", name = "s", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(I)V", line = 12)
    public static void method1054(int arg0) {
        field2655 = null;
        field2649 = null;
        if (arg0 == 127) {
            field2652 = null;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(II)V", line = 34)
    public static final void method1055(int arg0, int arg1) {
        class263 var2 = class293.field4356[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class263 var4 = class293.field4356[var3][arg0][arg1] = class293.field4356[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field3796--;
                for (class248 var5 = var4.field3801; var5 != null; var5 = var5.field3490) {
                    class83 var6 = var5.field3487;
                    if (var6.field999 == arg0 && var6.field1004 == arg1) {
                        var6.field994--;
                    }
                }
            }
        }
        if (class293.field4356[0][arg0][arg1] == null) {
            class293.field4356[0][arg0][arg1] = new class263(0, arg0, arg1);
            class293.field4356[0][arg0][arg1].field3792 = 1;
        }
        class293.field4356[0][arg0][arg1].field3788 = var2;
        class293.field4356[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "(II)V", line = 72)
    public class193(int arg0, int arg1) {
        this.field2651 = arg0;
        this.field2654 = arg1;
    }
}
