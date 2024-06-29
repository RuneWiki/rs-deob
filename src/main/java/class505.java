import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class505 {

    @OriginalMember(owner = "client!is", name = "f", descriptor = "I")
    public int field7121 = 1;

    @OriginalMember(owner = "client!is", name = "d", descriptor = "I")
    public static int field7119 = 1;

    @OriginalMember(owner = "client!is", name = "h", descriptor = "I")
    public static int field7123 = 0;

    @OriginalMember(owner = "client!is", name = "c", descriptor = "C")
    public char field7118;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "F")
    public static float field7116;

    @OriginalMember(owner = "client!is", name = "b", descriptor = "I")
    public static int field7117;

    @OriginalMember(owner = "client!is", name = "e", descriptor = "I")
    public static int field7120;

    @OriginalMember(owner = "client!is", name = "g", descriptor = "Ljava/io/FileOutputStream;")
    public static FileOutputStream field7122;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(I)V")
    public static void method2947(int arg0) {
        field7122 = null;
        if (arg0 != 0) {
            method2947(-120);
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Lsl;BI)V")
    private final void method2948(class461 arg0, byte arg1, int arg2) {
        if (arg1 <= 122) {
            field7123 = -73;
        }
        field7120++;
        if (arg2 == 1) {
            this.field7118 = class534.method3078(255, arg0.method2601(0));
        } else if (arg2 == 2) {
            this.field7121 = 0;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(BLsl;)V")
    public final void method2949(byte arg0, class461 arg1) {
        if (arg0 != 42) {
            return;
        }
        while (true) {
            int var3 = arg1.method2600((byte) -124);
            if (var3 == 0) {
                field7117++;
                return;
            }
            this.method2948(arg1, (byte) 124, var3);
        }
    }
}
