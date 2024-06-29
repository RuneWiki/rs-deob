import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public class class747 implements class750 {

    @OriginalMember(owner = "client!ow", name = "e", descriptor = "I")
    public int field10405;

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field10401 = new Rectangle[100];

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "I")
    public static int field10402;

    @OriginalMember(owner = "client!ow", name = "c", descriptor = "I")
    public static int field10403;

    @OriginalMember(owner = "client!ow", name = "d", descriptor = "I")
    public static int field10404;

    @OriginalMember(owner = "client!ow", name = "f", descriptor = "I")
    public static int field10406;

    @OriginalMember(owner = "client!ow", name = "toString", descriptor = "()Ljava/lang/String;", line = 8)
    public final String toString() {
        field10403++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(IIIB)V", line = 22)
    public static final void method4151(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0 << 3;
        field10404++;
        int var5 = arg1 << 3;
        int var6 = arg2 << 3;
        if (class665.field9377 == 2) {
            class403.field5594 = var5;
            class645.field9148 = var6;
            class520.field7268 = var4;
        }
        class403.field5597 = var6;
        class223.field3131 = var5;
        if (arg3 >= -98) {
            field10401 = null;
        }
        class143.method935(-126);
        class263.field3586 = true;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(I)Z", line = 47)
    public static final boolean method4152(int arg0) {
        field10402++;
        try {
            class456 var1 = new class456();
            if (arg0 >= -119) {
                return false;
            } else {
                byte[] var2 = var1.method2739(class648.field9187, 0);
                class407.method2482(8, var2);
                return true;
            }
        } catch (Exception var3) {
            return false;
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(II)I", line = 71)
    public static int method4153(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(B)V", line = 80)
    public static void method4154(byte arg0) {
        field10401 = null;
        if (arg0 >= -12) {
            field10401 = null;
        }
    }

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "(I)V", line = 95)
    public static final void method4155(int arg0) {
        field10406++;
        class413.method2519(65536);
        class213.field3015 = null;
        class87.field1201 = null;
        class126.field1741 = null;
        class16.field212 = null;
        class560.field7963 = null;
        if (arg0 >= -127) {
            method4155(70);
        }
    }

    @OriginalMember(owner = "client!ow", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 111)
    public class747(String arg0, int arg1) {
        this.field10405 = arg1;
    }
}
