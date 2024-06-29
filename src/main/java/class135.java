import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public abstract class class135 extends class179 {

    @OriginalMember(owner = "client!sr", name = "u", descriptor = "Lmb;")
    public static class258 field2162 = null;

    @OriginalMember(owner = "client!sr", name = "y", descriptor = "Ljava/lang/String;")
    public static String field2166 = "shake:";

    @OriginalMember(owner = "client!sr", name = "z", descriptor = "[I")
    public static int[] field2167 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!sr", name = "s", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!sr", name = "t", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!sr", name = "v", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!sr", name = "w", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!sr", name = "x", descriptor = "Lof;")
    public static class421 field2165;

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "(B)V")
    public static void method1110(byte arg0) {
        field2162 = null;
        field2165 = null;
        field2166 = null;
        if (arg0 > 106) {
            field2167 = null;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(BII)V")
    public static final void method1111(byte arg0, int arg1, int arg2) {
        field2163++;
        if (class51.method407(arg1, 4)) {
            class220.method1680(arg2, 0, class45.field710[arg1]);
            int var3 = 72 % ((78 - arg0) / 33);
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(BI)V")
    public static final void method1112(byte arg0, int arg1) {
        if (arg0 <= -43) {
            class376.field5322.method104(arg1, (byte) -34);
            field2161++;
        }
    }
}
