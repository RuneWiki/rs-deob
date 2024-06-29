import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class136 {

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "Z")
    public boolean field2088 = true;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
    public int field2081;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
    public int field2078;

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "I")
    public int field2089;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "I")
    public int field2087;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public int field2077;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
    public int field2084;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "I")
    public static int field2086 = 0;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public static int field2082 = -1;

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "I")
    public static int field2090 = 0;

    @OriginalMember(owner = "client!rh", name = "q", descriptor = "Lna;")
    public static class26 field2092 = class69.method505("OK", (byte) -128);

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "Lce;")
    public static class246 field2080 = new class246();

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "Lrk;")
    public static class175 field2083;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "Lclient;")
    public static client field2085;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "[I")
    public static int[] field2076;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V", line = 29)
    public static void method916(byte arg0) {
        field2080 = null;
        field2085 = null;
        field2092 = null;
        field2076 = null;
        field2083 = null;
        if (arg0 != -58) {
            field2080 = (class246) null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(IIIIIIZ)V", line = 58)
    public class136(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field2081 = arg1;
        this.field2078 = arg2;
        this.field2089 = arg0;
        this.field2087 = arg5;
        this.field2088 = arg6;
        this.field2077 = arg3;
        this.field2084 = arg4;
    }
}
