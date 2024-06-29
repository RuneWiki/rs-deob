import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ea")
public class class9 extends class33 {

    @OriginalMember(owner = "mapview!ea", name = "g", descriptor = "[I")
    public static int[] field95 = new int[128];

    @OriginalMember(owner = "mapview!ea", name = "h", descriptor = "I")
    public static int field96 = -1;

    @OriginalMember(owner = "mapview!ea", name = "l", descriptor = "I")
    public static int field100 = 0;

    @OriginalMember(owner = "mapview!ea", name = "k", descriptor = "Lta;")
    public static class37 field99 = class20.method87(-86, "Silk Trader");

    @OriginalMember(owner = "mapview!ea", name = "n", descriptor = "Lta;")
    public static class37 field102 = class20.method87(-83, "Hair Dressers");

    @OriginalMember(owner = "mapview!ea", name = "o", descriptor = "Lta;")
    public static class37 field103 = class20.method87(-125, "Please wait)3)3)3 Rendering Map");

    @OriginalMember(owner = "mapview!ea", name = "p", descriptor = "Lta;")
    public static class37 field104 = class20.method87(-89, "Hunter Training");

    @OriginalMember(owner = "mapview!ea", name = "i", descriptor = "Lta;")
    public class37 field97;

    @OriginalMember(owner = "mapview!ea", name = "j", descriptor = "[I")
    public static int[] field98;

    @OriginalMember(owner = "mapview!ea", name = "m", descriptor = "[Lra;")
    public static class34[] field101;

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(Z)V", line = 4)
    public static void method37(boolean arg0) {
        field101 = null;
        field102 = null;
        field103 = null;
        if (arg0) {
            field103 = null;
        }
        field98 = null;
        field95 = null;
        field104 = null;
        field99 = null;
    }

    @OriginalMember(owner = "mapview!ea", name = "b", descriptor = "(I)V", line = 30)
    public static final void method38(int arg0) {
        if (arg0 != 128) {
            field99 = null;
        }
        if (class12.field140 != null) {
            class36 var1 = class12.field140;
            synchronized (class12.field140) {
                class12.field140 = null;
            }
        }
    }
}
