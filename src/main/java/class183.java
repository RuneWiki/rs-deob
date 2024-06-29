import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class183 extends InputStream {

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "[F")
    public static float[] field2582 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "Lsl;")
    public static class318 field2585 = new class318(16, 15);

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "Let;")
    public static class419 field2584;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "[I")
    public static int[] field2587;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V", line = 5)
    public static void method1290(int arg0) {
        field2584 = null;
        field2582 = null;
        if (arg0 != 8301) {
            method1291(-46);
        }
        field2585 = null;
        field2587 = null;
    }

    @OriginalMember(owner = "client!mm", name = "read", descriptor = "()I", line = 19)
    public final int read() {
        field2586++;
        class213.method1462(30000L, -5184);
        return -1;
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)V", line = 31)
    public static final void method1291(int arg0) {
        if (class113.field1589 == 10 || class113.field1589 == 28) {
            class67.method657(class161.field2268 >> 10, class486.field7138 >> 10, 5000, 0);
        } else {
            int var1 = class435.field6375.field1777[0] >> 3;
            int var2 = class435.field6375.field1778[0] >> 3;
            if (var1 >= 0 && (class397.field5828 >> 3) > var1 && var2 >= 0 && var2 < (class457.field6713 >> 3)) {
                class67.method657(var1, var2, 5000, arg0 + 12388);
            } else {
                class67.method657(class397.field5828 >> 4, class457.field6713 >> 4, 0, 0);
            }
        }
        field2583++;
        class308.method1907(-75);
        class232.method1557((byte) 84);
        class455.method2748(1);
        if (arg0 != -12388) {
            method1290(41);
        }
        class51.method506((byte) -98);
    }
}
