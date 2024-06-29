import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class23 extends class188 {

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "Ljava/lang/String;")
    public String field274;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
    public static int field268 = 50;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "I")
    public static int field270 = 0;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "[I")
    public static int[] field271 = new int[field268];

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "[I")
    public static int[] field267 = new int[field268];

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "[I")
    public static int[] field269 = new int[field268];

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "[I")
    public static int[] field266 = new int[field268];

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "[I")
    public static int[] field272 = new int[field268];

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field275 = new String[field268];

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "[I")
    public static int[] field278 = new int[field268];

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "[Lhl;")
    public static class74[] field276 = new class74[29];

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "[I")
    public static int[] field279 = new int[field268];

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V", line = 12)
    public class23() {
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)V", line = 24)
    public static void method177(int arg0) {
        if (arg0 > -66) {
            return;
        }
        field278 = null;
        field271 = null;
        field266 = null;
        field276 = null;
        field279 = null;
        field267 = null;
        field269 = null;
        field272 = null;
        field275 = null;
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 46)
    public class23(String arg0) {
        this.field274 = arg0;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IB)I", line = 65)
    public static final int method178(int arg0, byte arg1) {
        field277++;
        if (arg0 == 16711935) {
            return -1;
        } else {
            if (arg1 >= -97) {
                method178(-81, (byte) 100);
            }
            return class310.method2196((byte) 13, arg0);
        }
    }
}
