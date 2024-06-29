import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public class class495 {

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "I")
    public static int field6885;

    @OriginalMember(owner = "client!vaa", name = "c", descriptor = "I")
    public static int field6887;

    @OriginalMember(owner = "client!vaa", name = "d", descriptor = "I")
    public static int field6888;

    @OriginalMember(owner = "client!vaa", name = "e", descriptor = "I")
    public static int field6889;

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "Lgf;")
    public static class293 field6886;

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(III)I", line = 3)
    public static final int method2915(int arg0, int arg1, int arg2) {
        if (arg1 != 12345678) {
            method2915(99, 115, 5);
        }
        field6887++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg2 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(B)Luea;", line = 40)
    public static final class336 method2916(byte arg0) {
        if (arg0 != 89) {
            method2916((byte) 74);
        }
        field6885++;
        class336 var1 = class329.method1954(0);
        var1.field4151 = 0;
        var1.field4158 = null;
        var1.field4150 = new class468(5000);
        return var1;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I)V", line = 63)
    public static void method2917(int arg0) {
        field6886 = null;
        if (arg0 != -23493) {
            method2915(-91, 96, -28);
        }
    }
}
