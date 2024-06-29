import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class197 extends class488 {

    @OriginalMember(owner = "client!tr", name = "l", descriptor = "B")
    public byte field2873 = 5;

    @OriginalMember(owner = "client!tr", name = "v", descriptor = "I")
    public static int field2883 = -1;

    @OriginalMember(owner = "client!tr", name = "m", descriptor = "I")
    public int field2874;

    @OriginalMember(owner = "client!tr", name = "n", descriptor = "I")
    public int field2875;

    @OriginalMember(owner = "client!tr", name = "o", descriptor = "I")
    public int field2876;

    @OriginalMember(owner = "client!tr", name = "q", descriptor = "I")
    public int field2878;

    @OriginalMember(owner = "client!tr", name = "r", descriptor = "I")
    public int field2879;

    @OriginalMember(owner = "client!tr", name = "s", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!tr", name = "u", descriptor = "I")
    public int field2882;

    @OriginalMember(owner = "client!tr", name = "p", descriptor = "Z")
    public boolean field2877;

    @OriginalMember(owner = "client!tr", name = "t", descriptor = "[Laa;")
    public static class343[] field2881;

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "(I)V")
    public static void method1331(int arg0) {
        field2881 = null;
        int var1 = -16 / ((-arg0 - 8) / 41);
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(III)Z")
    public static final boolean method1332(int arg0, int arg1, int arg2) {
        field2880++;
        if (arg2 == 0) {
            return (arg1 & 0x70000) != 0 | class513.method2999(arg1, (byte) -123, arg0) || class409.method2431(arg0, arg1, true);
        } else {
            return false;
        }
    }
}
