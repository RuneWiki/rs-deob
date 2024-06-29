import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class291 {

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "Ljava/lang/String;")
    public String field4374;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "Ljava/lang/String;")
    public String field4373;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "Ljava/lang/String;")
    public String field4371;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field4370 = new String[100];

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "Lqfa;")
    public static class85 field4372 = new class85(115, 6);

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Llk;III)V")
    public static final void method1943(class545 arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 10) {
            method1943(null, 66, 9, 87);
        }
        field4376++;
        class675.field9603 = arg2;
        class242.field3664 = arg3;
        class225.field3373 = arg0;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V")
    public static void method1944(boolean arg0) {
        field4372 = null;
        field4370 = null;
        if (arg0) {
            field4372 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ln;BLjava/awt/Frame;)V")
    public static final void method1945(class17 arg0, byte arg1, Frame arg2) {
        while (true) {
            class456 var3 = arg0.method398(arg2, 102);
            while (var3.field6502 == 0) {
                class185.method1354(10L, 10);
            }
            if (var3.field6502 == 1) {
                if (arg1 != -65) {
                    return;
                }
                field4375++;
                arg2.setVisible(false);
                arg2.dispose();
                return;
            }
            class185.method1354(100L, arg1 ^ 0xFFFFFFB5);
        }
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public class291(String arg0, String arg1, String arg2) {
        this.field4374 = arg0;
        this.field4373 = arg1;
        this.field4371 = arg2;
    }
}
