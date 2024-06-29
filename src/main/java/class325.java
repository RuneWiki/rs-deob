import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class325 extends class577 {

    @OriginalMember(owner = "client!df", name = "E", descriptor = "[Ljava/lang/String;")
    public static String[] field4712 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!df", name = "D", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!df", name = "H", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!df", name = "G", descriptor = "J")
    public static long field4714;

    @OriginalMember(owner = "client!df", name = "F", descriptor = "[B")
    private byte[] field4713;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(Z)V", line = 6)
    public static void method2010(boolean arg0) {
        field4712 = null;
        if (!arg0) {
            method2010(false);
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V", line = 21)
    public class325() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ZIB)V", line = 25)
    public final void method1508(boolean arg0, int arg1, byte arg2) {
        field4711++;
        int var4 = arg1 * 2;
        byte var5 = (byte) ((arg2 >> 1 & 0x7F) + 127);
        if (arg0) {
            this.field4713[var4++] = var5;
            this.field4713[var4] = var5;
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(IIII)[B", line = 41)
    public final byte[] method2011(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 == -11320) {
            field4715++;
            this.field4713 = new byte[arg0 * arg3 * arg2 * 2];
            this.method1858(arg0, arg2, 0, arg3);
            return this.field4713;
        } else {
            return null;
        }
    }
}
