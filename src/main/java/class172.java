import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class172 {

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "J")
    public long field3417 = 0L;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field3410 = 0;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field3411 = -1;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "Lob;")
    public static class141 field3419 = class175.method1195(40, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "Lob;")
    public static class141 field3426 = class175.method1195(40, "Fehler bei der Verbindung zum Server)3");

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "Lob;")
    private static class141 field3425 = class175.method1195(40, "Your profile will be transferred in:");

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "[I")
    public static int[] field3427 = new int[32];

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "Lob;")
    public static class141 field3415 = field3425;

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "Lob;")
    private static class141 field3428 = class175.method1195(40, "Loaded input handler");

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "Lob;")
    public static class141 field3424 = field3428;

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "Lob;")
    public static class141 field3429 = class175.method1195(40, "<)4col>");

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    public int field3414;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
    public int field3416;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
    public int field3421;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
    public int field3422;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
    public int field3423;

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "Loe;")
    public static class144 field3420;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "Laa;")
    public class2 field3409;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "Laa;")
    public class2 field3418;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "[I")
    public static int[] field3413;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "[[B")
    public static byte[][] field3412;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1183(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class215.field4095 * arg2 + class151.field2903 * arg0 >> 16;
        int var5 = class151.field2903 * arg2 - class215.field4095 * arg0 >> 16;
        int var6 = class119.field2311 * var5 + class104.field2005 * arg1 >> 16;
        int var7 = class119.field2311 * arg1 - class104.field2005 * var5 >> 16;
        if (var6 >= 50 && var6 <= arg3) {
            int var8 = (var4 << 9) / var6 + class210.field3996;
            int var9 = (var7 << 9) / var6 + class5.field62;
            return var8 >= class30.field579 && var8 <= class169.field3256 && var9 >= class10.field188 && var9 <= class116.field2245;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZIIII)V")
    public static final void method1184(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field3408++;
        for (int var5 = 0; var5 < class41.field807; var5++) {
            if (class37.field739[var5] + class109.field2109[var5] > arg3 && arg2 + arg3 > class37.field739[var5] && arg4 < class16.field289[var5] + class108.field2089[var5] && arg1 + arg4 > class16.field289[var5]) {
                class223.field4211[var5] = true;
            }
        }
        if (arg0) {
            field3419 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
    public static void method1185(int arg0) {
        field3427 = null;
        field3424 = null;
        if (arg0 != 24147) {
            return;
        }
        field3413 = null;
        field3426 = null;
        field3428 = null;
        field3425 = null;
        field3412 = null;
        field3429 = null;
        field3415 = null;
        field3420 = null;
        field3419 = null;
    }
}
