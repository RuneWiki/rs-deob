import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class261 extends class170 {

    @OriginalMember(owner = "client!gp", name = "A", descriptor = "Lqo;")
    public class127 field3603;

    @OriginalMember(owner = "client!gp", name = "x", descriptor = "D")
    public static double field3600 = -1.0D;

    @OriginalMember(owner = "client!gp", name = "w", descriptor = "I")
    public static int field3599 = 0;

    @OriginalMember(owner = "client!gp", name = "y", descriptor = "Lka;")
    public static class408 field3601 = new class408(64);

    @OriginalMember(owner = "client!gp", name = "z", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!gp", name = "B", descriptor = "Ljava/awt/Frame;")
    public static Frame field3604;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(ILno;III)V", line = 3)
    public static final void method1682(int arg0, class278 arg1, int arg2, int arg3, int arg4) {
        field3602++;
        long var5 = (long) (arg0 << 14 | arg3 << 28 | arg4);
        class119 var7 = (class119) class417.field5771.method837((byte) -72, var5);
        if (var7 == null) {
            class119 var8 = new class119();
            class417.field5771.method835(4, var8, var5);
            var8.field1805.method1162(122, arg1);
            return;
        }
        class14 var9 = class367.method2308(false, arg1.field3795);
        int var10 = var9.field176;
        if (var9.field153 == arg2) {
            var10 = (arg1.field3793 + 1) * var10;
        }
        for (class278 var11 = (class278) var7.field1805.method1173(arg2 - 1); var11 != null; var11 = (class278) var7.field1805.method1165(true)) {
            class14 var12 = class367.method2308(false, var11.field3795);
            int var13 = var12.field176;
            if (var12.field153 == 1) {
                var13 = (var11.field3793 + 1) * var13;
            }
            if (var13 < var10) {
                class35.method318(var11, arg1, true);
                return;
            }
        }
        var7.field1805.method1162(112, arg1);
    }

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "(I)V", line = 52)
    public static void method1683(int arg0) {
        field3601 = null;
        if (arg0 == 4955) {
            field3604 = null;
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIII)Z", line = 64)
    public static final boolean method1684(int arg0, int arg1, int arg2, int arg3) {
        if (class117.method913(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class120.method932(var4 + 1, class436.field6160[arg0].method329(arg1, arg2) + arg3, var5 + 1) && class120.method932(var4 + 128 - 1, class436.field6160[arg0].method329(arg1 + 1, arg2) + arg3, var5 + 1) && class120.method932(var4 + 128 - 1, class436.field6160[arg0].method329(arg1 + 1, arg2 + 1) + arg3, var5 + 128 - 1) && class120.method932(var4 + 1, class436.field6160[arg0].method329(arg1, arg2 + 1) + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Lqo;)V", line = 91)
    public class261(class127 arg0) {
        this.field3603 = arg0;
    }
}
