import java.awt.Container;
import java.awt.Insets;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class230 extends InputStream {

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "Z")
    public static boolean field3650 = false;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V", line = 4)
    public static final void method1623(byte arg0) {
        if (arg0 != 77) {
            method1623((byte) -105);
        }
        field3649++;
        Container var1;
        if (class195.field2917 != null) {
            var1 = class195.field2917;
        } else if (class92.field1464 == null) {
            var1 = class32.field471.field2721;
        } else {
            var1 = class92.field1464;
        }
        class284.field4427 = var1.getSize().width;
        class284.field4387 = var1.getSize().height;
        if (class92.field1464 == var1) {
            Insets var2 = class92.field1464.getInsets();
            class284.field4427 -= var2.right + var2.left;
            class284.field4387 -= var2.top + var2.bottom;
        }
        if (class256.method1759(104) >= 2) {
            class53.field895 = 0;
            class81.field1283 = 0;
            class322.field5024 = class284.field4387;
            class188.field2816 = class284.field4427;
        } else {
            class53.field895 = 0;
            class188.field2816 = 765;
            class322.field5024 = 503;
            class81.field1283 = (class284.field4427 - 765) / 2;
        }
        if (class94.field1516) {
            class94.method676(class188.field2816, class322.field5024);
        }
        class238.field3782.setSize(class188.field2816, class322.field5024);
        if (class92.field1464 == var1) {
            Insets var3 = class92.field1464.getInsets();
            class238.field3782.setLocation(class81.field1283 + var3.left, class53.field895 + var3.top);
        } else {
            class238.field3782.setLocation(class81.field1283, class53.field895);
        }
        if (class331.field5160 != -1) {
            class274.method1885(true, 7856);
        }
        class166.method1183(arg0 + 51);
    }

    @OriginalMember(owner = "client!gb", name = "read", descriptor = "()I", line = 68)
    public final int read() {
        class5.method26(0, 30000L);
        field3651++;
        return -1;
    }
}
