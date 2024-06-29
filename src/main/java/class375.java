import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class375 {

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "[Ljava/lang/String;")
    private String[] field5738;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "[I")
    public static int[] field5740 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public static int field5739 = 0;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "Lpg;")
    public static class492 field5742 = new class492(7, 2);

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public static int field5737;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
    public static int field5741;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    public static int field5743;

    @OriginalMember(owner = "client!ui", name = "toString", descriptor = "()Ljava/lang/String;", line = 16)
    public final String toString() {
        field5737++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BI)Ljava/lang/String;", line = 35)
    public final String method2335(byte arg0, int arg1) {
        if (arg0 == -100) {
            field5743++;
            return this.field5738[arg1];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BLjb;)V", line = 74)
    public static final void method2336(byte arg0, class499 arg1) {
        int var2 = -98 % ((arg0 - 17) / 54);
        field5741++;
        if (class374.field5736 != arg1.field7369) {
            return;
        }
        if (class339.field5365.field4947 == null) {
            arg1.field7358 = 0;
            arg1.field7317 = 0;
            return;
        }
        arg1.field7306 = 150;
        arg1.field7329 = (int) (Math.sin((double) class405.field6116 / 40.0D) * 256.0D) & 0x7FF;
        arg1.field7380 = 5;
        arg1.field7358 = class452.field6641;
        arg1.field7317 = class528.method3123(-28124, class339.field5365.field4947);
        arg1.field7412 = class339.field5365.field5246;
        arg1.field7335 = class339.field5365.field5265;
        arg1.field7438 = class339.field5365.field5253;
        arg1.field7287 = 0;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V", line = 115)
    public static void method2337(int arg0) {
        field5740 = null;
        field5742 = null;
        if (arg0 != -1) {
            field5740 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 142)
    public class375(String arg0, String arg1, String arg2, String arg3) {
        this.field5738 = new String[] { arg0, arg1, arg2, arg3 };
    }
}
