import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class116 {

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "[I")
    public static int[] field2282 = new int[2];

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "Z")
    public static boolean field2284 = false;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "Lsg;")
    private static class30 field2285 = class167.method1221((byte) 33, "slide:");

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "Lsg;")
    public static class30 field2283 = class167.method1221((byte) 33, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "Lsg;")
    public static class30 field2287 = field2285;

    @OriginalMember(owner = "client!uj", name = "n", descriptor = "Lsg;")
    public static class30 field2294 = class167.method1221((byte) 33, "headicons_pk");

    @OriginalMember(owner = "client!uj", name = "o", descriptor = "Lsg;")
    public static class30 field2295 = class167.method1221((byte) 33, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "Lsg;")
    public static class30 field2291 = field2285;

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
    public static int field2290 = 0;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "Lsg;")
    public static class30 field2289 = class167.method1221((byte) 33, "0");

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "[I")
    public static int[] field2293 = new int[2048];

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "Lmc;")
    public static class151 field2292;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "Z")
    public static boolean field2286;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ID)V")
    public static final void method898(int arg0, double arg1) {
        field2281++;
        int var3 = -109 % ((arg0 - 4) / 38);
        if (class98.field1989 == arg1) {
            return;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = (int) (Math.pow((double) var4 / 255.0D, arg1) * 255.0D);
            class190.field3470[var4] = var5 <= 255 ? var5 : 255;
        }
        class98.field1989 = arg1;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V")
    public static void method899(int arg0) {
        field2291 = null;
        field2292 = null;
        field2282 = null;
        if (arg0 != 255) {
            field2290 = 31;
        }
        field2294 = null;
        field2295 = null;
        field2293 = null;
        field2283 = null;
        field2287 = null;
        field2289 = null;
        field2285 = null;
    }
}
