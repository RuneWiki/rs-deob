import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class551 extends class134 {

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "Ljava/lang/String;")
    public String field7910;

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "Z")
    public static boolean field7908 = false;

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "Ldh;")
    public static class320 field7906 = new class320(33, 6);

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
    public static int field7905;

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "I")
    public static int field7907;

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "I")
    public static int field7909;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIII)V", line = 5)
    public static final void method3231(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7907++;
        if (arg0 != 8875) {
            return;
        }
        if (arg2 != 8 && arg2 != 16) {
            class691 var5 = class638.field9170[arg4][arg1][arg3];
            if (var5 != null) {
                if (arg2 == 1) {
                    var5.field9724 = 0;
                } else if (arg2 == 2) {
                    var5.field9734 = 0;
                }
            }
            class622.method3558((byte) 122);
            return;
        }
        for (int var6 = 0; var6 < class382.field5231; var6++) {
            class464 var7 = class675.field9565[var6];
            if (var7.field6629 == arg2 && var7.field6636 == arg1 && var7.field6633 == arg3 || var7.field6634 == arg1 && var7.field6633 == arg3) {
                if (class382.field5231 != var6) {
                    class143.method892(class675.field9565, var6 + 1, class675.field9565, var6, class675.field9565.length - var6 - 1);
                }
                class382.field5231--;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V", line = 63)
    public static void method3232(int arg0) {
        field7906 = null;
        if (arg0 != 1) {
            field7906 = null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V", line = 73)
    public class551() {
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 75)
    public class551(String arg0) {
        this.field7910 = arg0;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(III)Z", line = 83)
    public static final boolean method3233(int arg0, int arg1, int arg2) {
        if (arg0 == -23949) {
            field7905++;
            return (arg2 & 0x84080) != 0;
        } else {
            return false;
        }
    }
}
