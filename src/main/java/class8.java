import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!da")
public class class8 extends RuntimeException {

    @OriginalMember(owner = "mapview!da", name = "d", descriptor = "Ljava/lang/Throwable;")
    public Throwable field168;

    @OriginalMember(owner = "mapview!da", name = "i", descriptor = "Ljava/lang/String;")
    public String field173;

    @OriginalMember(owner = "mapview!da", name = "c", descriptor = "Ln;")
    public static class26 field167 = class9.method82(255, "underlay)3dat");

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "Ln;")
    public static class26 field165 = class9.method82(255, "Sword Shop");

    @OriginalMember(owner = "mapview!da", name = "g", descriptor = "Ln;")
    public static class26 field171 = class9.method82(255, "Transportation");

    @OriginalMember(owner = "mapview!da", name = "k", descriptor = "I")
    public static int field175 = 0;

    @OriginalMember(owner = "mapview!da", name = "n", descriptor = "Ln;")
    public static class26 field178 = class9.method82(255, "_");

    @OriginalMember(owner = "mapview!da", name = "m", descriptor = "Ln;")
    public static class26 field177 = class9.method82(255, "labels)3dat");

    @OriginalMember(owner = "mapview!da", name = "f", descriptor = "Ln;")
    public static class26 field170 = class9.method82(255, "Water Source");

    @OriginalMember(owner = "mapview!da", name = "o", descriptor = "Ln;")
    public static class26 field179 = class9.method82(255, "Gem Shop");

    @OriginalMember(owner = "mapview!da", name = "e", descriptor = "Ln;")
    public static class26 field169 = class9.method82(255, "Guide");

    @OriginalMember(owner = "mapview!da", name = "b", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "mapview!da", name = "j", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "mapview!da", name = "h", descriptor = "J")
    public static long field172;

    @OriginalMember(owner = "mapview!da", name = "l", descriptor = "[B")
    public static byte[] field176;

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(I)V", line = 4)
    public static void method77(int arg0) {
        field169 = null;
        if (arg0 != 46) {
            method77(108);
        }
        field176 = null;
        field179 = null;
        field178 = null;
        field165 = null;
        field177 = null;
        field171 = null;
        field170 = null;
        field167 = null;
    }

    @OriginalMember(owner = "mapview!da", name = "b", descriptor = "(I)Lk;", line = 46)
    public static final class20 method78(int arg0) {
        class20 var1 = new class20(class34.field418, class1.field73, class14.field223, class28.field367, class7.field156);
        if (arg0 < 65) {
            return (class20) null;
        } else {
            mapview.method14((byte) -114);
            return var1;
        }
    }

    @OriginalMember(owner = "mapview!da", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 65)
    public class8(Throwable arg0, String arg1) {
        this.field168 = arg0;
        this.field173 = arg1;
    }
}
