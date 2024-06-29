import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class36 {

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "[B")
    public static byte[] field507 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "[I")
    public static int[] field506 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field508 = 0;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "Z")
    public static boolean field509 = false;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public int field510;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "Lwd;")
    public class36 field505;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "Lpf;")
    public class447 field511;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)V")
    public static void method256(boolean arg0) {
        field506 = null;
        field507 = null;
        if (!arg0) {
            field507 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lec;I)Ljava/lang/String;")
    public static final String method257(class37 arg0, int arg1) {
        if (arg1 != 32767) {
            field508 = -36;
        }
        field514++;
        return class281.method1995(32767, arg0, 100);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
    public final void method258(byte arg0) {
        field512++;
        if (class428.field6205 >= 500) {
            return;
        }
        int var2 = -86 / ((20 - arg0) / 46);
        this.field511 = null;
        this.field505 = class256.field3703;
        this.field510 = 0;
        class256.field3703 = this;
        class428.field6205++;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method259(String arg0, byte arg1) {
        if (arg1 < 89) {
            return -26;
        } else {
            field513++;
            return class373.method2376(10, (byte) -58, true, arg0);
        }
    }
}
