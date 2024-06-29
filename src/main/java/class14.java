import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class14 {

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public int field165;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "[I")
    public int[] field160;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "[I")
    public int[] field166;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public static int field161 = -60;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "J")
    public static long field162 = 0L;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)Lhh;", line = 5)
    public static final class85 method88(boolean arg0) {
        if (!arg0) {
            return null;
        }
        field163++;
        try {
            return (class85) Class.forName("as").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IBI)I", line = 26)
    public static final int method89(int arg0, byte arg1, int arg2) {
        field164++;
        if (arg2 == 4 || arg2 == 5) {
            return class373.field5537[arg0 & 0x3];
        } else {
            if (arg1 != 58) {
                method88(false);
            }
            return 256;
        }
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(I)V", line = 46)
    public class14(int arg0) {
        this.field165 = arg0;
        this.field160 = new int[this.field165];
        this.field166 = new int[this.field165];
    }
}
