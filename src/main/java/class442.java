import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class442 {

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "Z")
    public boolean field6879 = true;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "Lss;")
    public static class213 field6870 = new class213("M", "M", "M", "M");

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "[Z")
    public static boolean[] field6875 = new boolean[100];

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "Lof;")
    public static class328 field6874 = new class328(10);

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "C")
    private char field6877;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public static int field6869;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
    public int field6872;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "I")
    public static int field6873;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "I")
    public static int field6876;

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "I")
    public static int field6878;

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "Ljava/awt/Font;")
    public static Font field6880;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "Ljava/lang/String;")
    public String field6871;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)Z")
    public final boolean method2799(int arg0) {
        field6876++;
        int var2 = 32 / ((arg0 + 16) / 53);
        return this.field6877 == 's';
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)V")
    public static void method2800(int arg0) {
        if (arg0 > -47) {
            field6874 = null;
        }
        field6875 = null;
        field6870 = null;
        field6874 = null;
        field6880 = null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BILhw;)V")
    private final void method2801(byte arg0, int arg1, class208 arg2) {
        if (arg1 == 1) {
            this.field6877 = class167.method1058(arg2.method1427(false), 255);
        } else if (arg1 == 2) {
            this.field6872 = arg2.method1436((byte) 91);
        } else if (arg1 == 4) {
            this.field6879 = false;
        } else if (arg1 == 5) {
            this.field6871 = arg2.method1448(65535);
        }
        field6869++;
        if (arg0 <= 109) {
            this.field6872 = 87;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lhw;B)V")
    public final void method2802(class208 arg0, byte arg1) {
        if (arg1 != 10) {
            field6880 = null;
        }
        while (true) {
            int var3 = arg0.method1445(20);
            if (var3 == 0) {
                field6878++;
                return;
            }
            this.method2801((byte) 124, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(III)I")
    public static final int method2803(int arg0, int arg1, int arg2) {
        int var3 = (arg2 & 0x7F) * arg1 >> 7;
        field6873++;
        if (arg0 > -122) {
            return -70;
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }
}
