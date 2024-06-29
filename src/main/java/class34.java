import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!w")
public class class34 {

    @OriginalMember(owner = "mapview!w", name = "d", descriptor = "Ll;")
    public static class21 field387 = class28.method185(-20839, "Food Shop");

    @OriginalMember(owner = "mapview!w", name = "g", descriptor = "Ll;")
    public static class21 field390 = class28.method185(-20839, "50(U");

    @OriginalMember(owner = "mapview!w", name = "k", descriptor = "Z")
    public static boolean field394 = true;

    @OriginalMember(owner = "mapview!w", name = "j", descriptor = "Ll;")
    public static class21 field393 = class28.method185(-20839, "Brewery");

    @OriginalMember(owner = "mapview!w", name = "b", descriptor = "Ll;")
    public static class21 field385 = class28.method185(-20839, "sprites");

    @OriginalMember(owner = "mapview!w", name = "i", descriptor = "Z")
    public static boolean field392 = false;

    @OriginalMember(owner = "mapview!w", name = "h", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "mapview!w", name = "e", descriptor = "J")
    public long field388;

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "Lw;")
    public class34 field384;

    @OriginalMember(owner = "mapview!w", name = "l", descriptor = "Lw;")
    public class34 field395;

    @OriginalMember(owner = "mapview!w", name = "f", descriptor = "[I")
    public static int[] field389;

    @OriginalMember(owner = "mapview!w", name = "c", descriptor = "[Ll;")
    public static class21[] field386;

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(I)V", line = 14)
    public final void method209(int arg0) {
        if (this.field395 == null) {
            return;
        }
        this.field395.field384 = this.field384;
        this.field384.field395 = this.field395;
        this.field384 = null;
        this.field395 = null;
        if (arg0 != 17417) {
            this.method209(123);
        }
    }

    @OriginalMember(owner = "mapview!w", name = "b", descriptor = "(I)V", line = 78)
    public static void method210(int arg0) {
        field387 = null;
        int var1 = 88 % ((arg0 + 12) / 63);
        field393 = null;
        field386 = null;
        field389 = null;
        field385 = null;
        field390 = null;
    }
}
