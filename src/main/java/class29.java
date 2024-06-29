import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class29 {

    @OriginalMember(owner = "client!o", name = "b", descriptor = "Ljava/lang/String;")
    public static String field278 = null;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "[F")
    public static float[] field283 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public static int field277 = 0;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public int field279;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public int field280;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    public int field282;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    public int field285;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "Lhd;")
    public static class744 field284;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V", line = 3)
    public static void method142(byte arg0) {
        if (arg0 >= -103) {
            method143(-125, -104, -5);
        }
        field284 = null;
        field283 = null;
        field278 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(III)V", line = 18)
    public static final void method143(int arg0, int arg1, int arg2) {
        field281++;
        if (arg0 >= -109) {
            method142((byte) 70);
        }
        class150 var3 = class676.method3885(1000, 7, arg2);
        var3.method1116(91);
        var3.field2346 = arg1;
    }
}
