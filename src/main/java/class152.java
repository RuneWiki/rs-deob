import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class152 extends class109 {

    @OriginalMember(owner = "client!q", name = "n", descriptor = "I")
    public int field3143;

    @OriginalMember(owner = "client!q", name = "B", descriptor = "I")
    public int field3157;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "Ldd;")
    private static class35 field3144 = class180.method1196((byte) 127, "May");

    @OriginalMember(owner = "client!q", name = "q", descriptor = "Ldd;")
    private static class35 field3146 = class180.method1196((byte) -80, "Jan");

    @OriginalMember(owner = "client!q", name = "z", descriptor = "Ldd;")
    private static class35 field3155 = class180.method1196((byte) 127, "Sep");

    @OriginalMember(owner = "client!q", name = "w", descriptor = "Ldd;")
    private static class35 field3152 = class180.method1196((byte) 127, "Jun");

    @OriginalMember(owner = "client!q", name = "x", descriptor = "Z")
    public static volatile boolean field3153 = true;

    @OriginalMember(owner = "client!q", name = "v", descriptor = "Ldd;")
    private static class35 field3151 = class180.method1196((byte) 127, "Dec");

    @OriginalMember(owner = "client!q", name = "y", descriptor = "Ldd;")
    private static class35 field3154 = class180.method1196((byte) -53, "Oct");

    @OriginalMember(owner = "client!q", name = "A", descriptor = "Ldd;")
    private static class35 field3156 = class180.method1196((byte) -73, "Jul");

    @OriginalMember(owner = "client!q", name = "E", descriptor = "I")
    public static int field3160 = 0;

    @OriginalMember(owner = "client!q", name = "r", descriptor = "Ldd;")
    private static class35 field3147 = class180.method1196((byte) -92, "Aug");

    @OriginalMember(owner = "client!q", name = "s", descriptor = "Ldd;")
    private static class35 field3148 = class180.method1196((byte) 126, "Mar");

    @OriginalMember(owner = "client!q", name = "F", descriptor = "Ldd;")
    private static class35 field3161 = class180.method1196((byte) 127, "Nov");

    @OriginalMember(owner = "client!q", name = "H", descriptor = "Ldd;")
    private static class35 field3163 = class180.method1196((byte) 126, "Apr");

    @OriginalMember(owner = "client!q", name = "G", descriptor = "Ldd;")
    private static class35 field3162 = class180.method1196((byte) 127, "Feb");

    @OriginalMember(owner = "client!q", name = "D", descriptor = "[Ldd;")
    public static class35[] field3159 = new class35[] { field3146, field3162, field3148, field3163, field3144, field3152, field3156, field3147, field3155, field3154, field3161, field3151 };

    @OriginalMember(owner = "client!q", name = "t", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!q", name = "C", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!q", name = "I", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "J")
    public static long field3145;

    @OriginalMember(owner = "client!q", name = "u", descriptor = "Ljava/lang/String;")
    public static String field3150;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(I)V")
    public static final void method1024(int arg0) {
        field3164++;
        if (arg0 != -58) {
            field3151 = null;
        }
        class121.field2659.method813(-122);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BI)Z")
    public static final boolean method1025(byte arg0, int arg1) {
        if (arg0 == -53) {
            field3149++;
            return arg1 >= 48 && arg1 <= 57;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!q", name = "d", descriptor = "(I)V")
    public static void method1026(int arg0) {
        field3161 = null;
        field3150 = null;
        field3159 = null;
        field3148 = null;
        field3151 = null;
        field3155 = null;
        field3163 = null;
        field3162 = null;
        if (arg0 >= -56) {
            field3151 = null;
        }
        field3156 = null;
        field3152 = null;
        field3144 = null;
        field3147 = null;
        field3146 = null;
        field3154 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II)I")
    public static int method1027(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(II)V")
    public class152(int arg0, int arg1) {
        this.field3143 = arg0;
        this.field3157 = arg1;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(JI)V")
    public static final void method1028(long arg0, int arg1) {
        field3158++;
        try {
            Thread.sleep(arg0);
            if (arg1 != -6643) {
                field3162 = null;
            }
        } catch (InterruptedException var3) {
        }
    }
}
