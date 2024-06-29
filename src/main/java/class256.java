import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class256 extends class35 {

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "J")
    public long field3999;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field3995 = new String[8];

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field3996 = new String[5];

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field3998 = new String[500];

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "Ljava/lang/String;")
    public static String field4000 = "You can't add yourself to your own friend list.";

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "S")
    public static short field3997 = 32767;

    @OriginalMember(owner = "client!ce", name = "w", descriptor = "J")
    public static long field4003 = 0L;

    @OriginalMember(owner = "client!ce", name = "x", descriptor = "Ljava/lang/String;")
    public static String field4004 = "Loaded defaults";

    @OriginalMember(owner = "client!ce", name = "v", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "Loj;")
    public static class283 field4001;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)V", line = 5)
    public static final void method1714(int arg0, int arg1, int arg2) {
        if (arg0 == -18606) {
            field4002++;
            class345.field5353 = arg1 - class38.field734;
            class336.field5148 = class9.field199 - (arg2 - class17.field322) - 1;
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V", line = 40)
    public static void method1715(int arg0) {
        field4001 = null;
        field3996 = null;
        field4000 = null;
        field3995 = null;
        field4004 = null;
        if (arg0 > 108) {
            field3998 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V", line = 62)
    public class256() {
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(J)V", line = 67)
    public class256(long arg0) {
        this.field3999 = arg0;
    }
}
