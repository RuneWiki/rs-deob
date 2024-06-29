import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class664 extends class69 {

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "J")
    public long field9333;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
    public static int field9332 = 0;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
    public static int field9331 = 0;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "Laf;")
    public static class39 field9335 = new class39(64);

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
    public static int field9334;

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "I")
    public static int field9336;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IBI)Z")
    public static final boolean method3786(int arg0, byte arg1, int arg2) {
        if (arg1 == -6) {
            field9336++;
            return (arg2 & 0x800) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLjava/awt/Canvas;)V")
    public static final void method3787(byte arg0, Canvas arg1) {
        field9334++;
        Dimension var2 = arg1.getSize();
        if (arg0 != -81) {
            return;
        }
        class100.method714(var2.height, (byte) 83, var2.width);
        if (class166.field2118 == 1) {
            class377.field5424.method190(arg1, class327.field4604, class544.field7574);
        } else {
            class377.field5424.method190(arg1, class68.field754, class93.field1086);
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
    public class664() {
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(J)V")
    public class664(long arg0) {
        this.field9333 = arg0;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
    public static void method3788(int arg0) {
        if (arg0 <= 65) {
            method3788(20);
        }
        field9335 = null;
    }
}
