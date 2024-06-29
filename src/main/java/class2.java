import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!aa")
public class class2 {

    @OriginalMember(owner = "mapview!aa", name = "c", descriptor = "Lta;")
    public static class37 field14 = class20.method87(-92, "Herbalist");

    @OriginalMember(owner = "mapview!aa", name = "b", descriptor = "I")
    public static int field13 = -1;

    @OriginalMember(owner = "mapview!aa", name = "j", descriptor = "Lta;")
    public static class37 field21 = class20.method87(-91, "Requesting");

    @OriginalMember(owner = "mapview!aa", name = "i", descriptor = "I")
    public static int field20 = 0;

    @OriginalMember(owner = "mapview!aa", name = "f", descriptor = "I")
    public static int field17 = 0;

    @OriginalMember(owner = "mapview!aa", name = "e", descriptor = "Lta;")
    public static class37 field16 = class20.method87(-106, "Overview");

    @OriginalMember(owner = "mapview!aa", name = "k", descriptor = "[I")
    public static int[] field22 = new int[128];

    @OriginalMember(owner = "mapview!aa", name = "g", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "mapview!aa", name = "h", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "Lna;")
    public static class27 field12;

    @OriginalMember(owner = "mapview!aa", name = "d", descriptor = "Ljava/awt/Font;")
    public static Font field15;

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(B)J", line = 27)
    public static final synchronized long method3(byte arg0) {
        if (arg0 <= 74) {
            return -79L;
        }
        long var1 = System.currentTimeMillis();
        if (class27.field436 > var1) {
            class4.field44 += class27.field436 - var1;
        }
        class27.field436 = var1;
        return class4.field44 + var1;
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(Z)V", line = 71)
    public static void method4(boolean arg0) {
        field16 = null;
        field14 = null;
        field22 = null;
        field12 = null;
        field21 = null;
        field15 = null;
        if (arg0) {
            method4(true);
        }
    }
}
