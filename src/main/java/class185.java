import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class185 extends class312 {

    @OriginalMember(owner = "client!cm", name = "A", descriptor = "Lej;")
    private class339 field2833;

    @OriginalMember(owner = "client!cm", name = "x", descriptor = "[S")
    public static short[] field2830 = new short[256];

    @OriginalMember(owner = "client!cm", name = "z", descriptor = "Ljava/lang/String;")
    public static String field2832 = "level: ";

    @OriginalMember(owner = "client!cm", name = "w", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!cm", name = "y", descriptor = "Ljava/awt/Image;")
    public static Image field2831;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(I)V", line = 11)
    public static final void method1271(int arg0) {
        class185 var1 = (class185) class18.field252.method10((byte) 65);
        if (arg0 != -1) {
            field2830 = (short[]) null;
        }
        while (var1 != null) {
            class339 var2 = var1.field2833;
            if (class77.field1154 != var2.field5256 || var2.field5249) {
                var1.method1284(0);
            } else if (var2.field5254 <= class343.field5341) {
                var2.method2348(class81.field1208, 11889);
                if (var2.field5249) {
                    var1.method1284(0);
                } else {
                    class226.method1543(var2.field5256, var2.field5250, var2.field5262, var2.field5255, 60, var2, 0, -1L, false);
                }
            }
            var1 = (class185) class18.field252.method13((byte) -32);
        }
        field2829++;
    }

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "(I)V", line = 45)
    public static void method1272(int arg0) {
        field2831 = null;
        field2830 = null;
        if (arg0 == -1113) {
            field2832 = null;
        }
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Lej;)V", line = 62)
    public class185(class339 arg0) {
        this.field2833 = arg0;
    }
}
