import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public class class116 {

    @OriginalMember(owner = "client!qea", name = "d", descriptor = "[I")
    public static int[] field1989 = new int[1];

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!qea", name = "c", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!qea", name = "e", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "[I")
    public static int[] field1986;

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(ILjava/awt/Canvas;)Lmg;", line = 3)
    public static final class137 method919(int arg0, Canvas arg1) {
        field1990++;
        try {
            Class var2 = Class.forName("aca");
            if (arg0 != 0) {
                method920(-108);
            }
            class137 var3 = (class137) var2.getDeclaredConstructor().newInstance();
            var3.method1016(1, arg1);
            return var3;
        } catch (Throwable var5) {
            class400 var4 = new class400();
            var4.method1016(1, arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(I)V", line = 34)
    public static final void method920(int arg0) {
        field1987++;
        if (class251.field3463 == -1 || arg0 != 11651) {
            return;
        }
        int var1 = class164.field2564.method1110((byte) 91);
        int var2 = class164.field2564.method1113(arg0 - 18038);
        class458 var3 = (class458) class399.field5298.method3257(-58);
        if (var3 != null) {
            var1 = var3.method1650(0);
            var2 = var3.method1654((byte) 96);
        }
        class266.method1623(0, class627.field8461, (byte) -4, 0, 0, class251.field3463, var1, 0, var2, class149.field2387);
        if (class155.field2439 != null) {
            class135.method1010(var1, var2, (byte) 12);
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(B)V", line = 73)
    public static void method921(byte arg0) {
        field1989 = null;
        field1986 = null;
        if (arg0 != -40) {
            method920(58);
        }
    }
}
