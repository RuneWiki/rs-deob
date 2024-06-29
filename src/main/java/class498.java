import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class498 {

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
    private int field7353;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "Lne;")
    public static class207 field7351 = new class207("WTRC", 1);

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field7347;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field7348;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public static int field7349;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public static int field7350;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    public static int field7352;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)Z", line = 6)
    public static final boolean method2983(int arg0, int arg1, int arg2) {
        field7350++;
        if (((arg1 & 0x10000) != 0 | class152.method991(arg2, arg1, 27)) || class229.method1572(0, arg2, arg1)) {
            return true;
        } else if (arg0 > -53) {
            return false;
        } else {
            return (arg2 & 0x37) == 0 && class52.method319(arg1, true, arg2);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILji;Ljava/awt/Frame;)V", line = 21)
    public static final void method2984(int arg0, class432 arg1, Frame arg2) {
        while (true) {
            class281 var3 = arg1.method2591(arg2, (byte) 76);
            while (var3.field4032 == 0) {
                class246.method1659((byte) 117, 10L);
            }
            if (var3.field4032 == 1) {
                if (arg0 != 100) {
                    method2985(3);
                }
                field7348++;
                arg2.setVisible(false);
                arg2.dispose();
                return;
            }
            class246.method1659((byte) 117, 100L);
        }
    }

    @OriginalMember(owner = "client!ki", name = "toString", descriptor = "()Ljava/lang/String;", line = 51)
    public final String toString() {
        field7347++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V", line = 61)
    public static void method2985(int arg0) {
        field7351 = null;
        if (arg0 != 65280) {
            method2986(60, 44, -111);
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(III)I", line = 72)
    public static final int method2986(int arg0, int arg1, int arg2) {
        field7349++;
        int var3 = arg0 >>> 24;
        int var4 = ((arg0 & 0xFF00) * var3 & 0xFF0000 | arg2 & (arg0 & 0xFF00FF) * var3) >>> 8;
        int var5 = 255 - var3;
        return (((arg1 & 0xFF00FF) * var5 & 0xFF00FF00 | (arg1 & 0xFF00) * var5 & 0xFF0000) >>> 8) + var4;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)I", line = 86)
    public final int method2987(byte arg0) {
        field7352++;
        int var2 = -125 % ((-arg0 - 54) / 50);
        return this.field7353;
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(II)V", line = 99)
    public class498(int arg0, int arg1) {
        this.field7353 = arg0;
    }
}
