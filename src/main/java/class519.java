import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hha")
public class class519 extends class189 {

    @OriginalMember(owner = "client!hha", name = "k", descriptor = "I")
    public static int field7377 = 0;

    @OriginalMember(owner = "client!hha", name = "j", descriptor = "I")
    public static int field7376 = -1;

    @OriginalMember(owner = "client!hha", name = "l", descriptor = "I")
    public static int field7378;

    @OriginalMember(owner = "client!hha", name = "m", descriptor = "I")
    public int field7379;

    @OriginalMember(owner = "client!hha", name = "n", descriptor = "I")
    public static int field7380;

    @OriginalMember(owner = "client!hha", name = "p", descriptor = "I")
    public int field7382;

    @OriginalMember(owner = "client!hha", name = "s", descriptor = "I")
    public static int field7385;

    @OriginalMember(owner = "client!hha", name = "q", descriptor = "Lfp;")
    public static class323 field7383;

    @OriginalMember(owner = "client!hha", name = "o", descriptor = "Lgda;")
    public class53 field7381;

    @OriginalMember(owner = "client!hha", name = "r", descriptor = "Lag;")
    public class682 field7384;

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(I)V", line = 4)
    public final void method3040(int arg0) {
        field7378++;
        if (class496.field7140.length > class758.field10532) {
            class496.field7140[class758.field10532++] = this;
            if (arg0 > -101) {
                this.field7382 = -13;
            }
        }
    }

    @OriginalMember(owner = "client!hha", name = "b", descriptor = "(B)I", line = 18)
    public static final int method3041(byte arg0) {
        field7380++;
        if ((double) class678.field9282 == 3.0D) {
            return 37;
        } else if (arg0 > -61) {
            return -123;
        } else if ((double) class678.field9282 == 4.0D) {
            return 50;
        } else if ((double) class678.field9282 == 6.0D) {
            return 75;
        } else if ((double) class678.field9282 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!hha", name = "b", descriptor = "(I)V", line = 46)
    public static void method3042(int arg0) {
        if (arg0 <= 30) {
            field7385 = 12;
        }
        field7383 = null;
    }
}
