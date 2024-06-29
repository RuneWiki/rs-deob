import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uga")
public class class206 {

    @OriginalMember(owner = "client!uga", name = "l", descriptor = "I")
    public int field2955;

    @OriginalMember(owner = "client!uga", name = "h", descriptor = "I")
    public int field2951;

    @OriginalMember(owner = "client!uga", name = "k", descriptor = "[F")
    public static float[] field2954 = new float[2];

    @OriginalMember(owner = "client!uga", name = "g", descriptor = "I")
    public static int field2950 = 0;

    @OriginalMember(owner = "client!uga", name = "n", descriptor = "Z")
    public static volatile boolean field2957 = false;

    @OriginalMember(owner = "client!uga", name = "c", descriptor = "I")
    public static int field2946 = 0;

    @OriginalMember(owner = "client!uga", name = "b", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!uga", name = "d", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!uga", name = "e", descriptor = "I")
    public int field2948;

    @OriginalMember(owner = "client!uga", name = "f", descriptor = "I")
    public int field2949;

    @OriginalMember(owner = "client!uga", name = "i", descriptor = "I")
    public int field2952;

    @OriginalMember(owner = "client!uga", name = "m", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!uga", name = "o", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!uga", name = "j", descriptor = "Luga;")
    public class206 field2953;

    @OriginalMember(owner = "client!uga", name = "p", descriptor = "Lkd;")
    public class280 field2959;

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "Ljb;")
    public static class491 field2944;

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(IBI)Z", line = 12)
    public static final boolean method1433(int arg0, byte arg1, int arg2) {
        int var3 = -128 % ((arg1 + 45) / 56);
        field2958++;
        return (arg0 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(II)Luga;", line = 24)
    public final class206 method1434(int arg0, int arg1) {
        field2945++;
        if (arg1 <= 25) {
            this.method1434(13, -79);
        }
        return new class206(this.field2951, arg0);
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(B)Lva;", line = 39)
    public final class494 method1435(byte arg0) {
        if (arg0 != 25) {
            method1436(85);
        }
        field2947++;
        return class424.method2587(this.field2951, (byte) -121);
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(I)V", line = 54)
    public static void method1436(int arg0) {
        field2954 = null;
        field2944 = null;
        if (arg0 != -20846) {
            field2956 = 82;
        }
    }

    @OriginalMember(owner = "client!uga", name = "<init>", descriptor = "(II)V", line = 76)
    public class206(int arg0, int arg1) {
        this.field2955 = arg1;
        this.field2951 = arg0;
    }
}
