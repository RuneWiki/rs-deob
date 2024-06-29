import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class9 {

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "Lub;")
    public static class227 field167 = null;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public static int field173 = 0;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "Lub;")
    public static class227 field174 = class257.method1749("; version=1; path=)4; domain=", 17263);

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "Lub;")
    public static class227 field169 = class257.method1749("mem=", 17263);

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "La;")
    public static class20 field172;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "[I")
    public static int[] field166;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
    public static final void method35(byte arg0) {
        field171++;
        for (int var1 = 0; var1 < 100; var1++) {
            class10.field182[var1] = true;
        }
        if (arg0 >= -50) {
            method36((byte) -25);
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)V")
    public static void method36(byte arg0) {
        field169 = null;
        field172 = null;
        if (arg0 <= -21) {
            field166 = null;
            field167 = null;
            field174 = null;
        }
    }
}
