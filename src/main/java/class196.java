import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class196 extends RuntimeException {

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "Ljava/lang/Throwable;")
    public Throwable field3275;

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "Ljava/lang/String;")
    public String field3279;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "Lph;")
    public static class229 field3273 = class266.method1858("m-Ochte mit Ihnen handeln)3", 0);

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "I")
    public static int field3280 = 0;

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "Lph;")
    private static class229 field3281 = class266.method1858("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3", 0);

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
    public static int field3278 = 0;

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "Lph;")
    public static class229 field3282 = class266.method1858("Eingabeprozedur geladen)3", 0);

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "Lph;")
    public static class229 field3277 = field3281;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V", line = 30)
    public static final void method1382(int arg0) {
        class58.field816 = class218.method1525(8, 2048, 8, 0.4F, false, 4, true, 35);
        field3274++;
        if (arg0 != -10052) {
            field3276 = -83;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(BLsi;)Z", line = 50)
    public static final boolean method1383(byte arg0, class66 arg1) {
        field3283++;
        if (arg1.method494(class223.field3668, false)) {
            return true;
        } else {
            return arg0 != 82;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V", line = 68)
    public static void method1384(byte arg0) {
        field3273 = null;
        field3281 = null;
        field3277 = null;
        if (arg0 <= 45) {
            field3273 = (class229) null;
        }
        field3282 = null;
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 90)
    public class196(Throwable arg0, String arg1) {
        this.field3275 = arg0;
        this.field3279 = arg1;
    }
}
