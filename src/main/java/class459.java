import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class459 {

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "Ljava/lang/String;")
    public static String field6419 = "";

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "Lbu;")
    public static class21 field6421 = new class21(3, 11);

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "Ljava/lang/String;")
    public static String field6423 = null;

    @OriginalMember(owner = "client!rp", name = "g", descriptor = "Z")
    public static boolean field6424 = true;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "I")
    public static int field6418;

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "I")
    public static int field6420;

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "[I")
    public static int[] field6422;

    @OriginalMember(owner = "client!rp", name = "h", descriptor = "[Ljd;")
    public static class241[] field6425;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)V")
    public static void method2730(int arg0) {
        field6425 = null;
        field6423 = null;
        if (arg0 < -86) {
            field6421 = null;
            field6422 = null;
            field6419 = null;
        }
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(I)J")
    public static final synchronized long method2731(int arg0) {
        field6420++;
        long var1 = System.currentTimeMillis();
        if (class600.field8416 > var1) {
            class764.field10526 += class600.field8416 - var1;
        }
        if (arg0 < 94) {
            method2731(-30);
        }
        class600.field8416 = var1;
        return class764.field10526 + var1;
    }
}
