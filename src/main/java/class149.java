import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class149 {

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public static int field3410 = 0;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field3403 = -1;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "Lje;")
    public static class67 field3415 = class85.method592(255, "headicons_prayer");

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "I")
    public static int field3419 = 50;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "[I")
    public static int[] field3404 = new int[field3419];

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "[Lje;")
    public static class67[] field3411 = new class67[field3419];

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "[I")
    public static int[] field3405 = new int[field3419];

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "Lje;")
    public static class67 field3418 = class85.method592(255, "null");

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "Lje;")
    public static class67 field3422 = class85.method592(255, "und die Schaltfl-=che (WSpielkonto erstellen(W am");

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "Lje;")
    public static class67 field3407 = class85.method592(255, "Versteckt");

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "[I")
    public static int[] field3416 = new int[field3419];

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "Z")
    public static boolean field3421 = false;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "[I")
    public static int[] field3408 = new int[field3419];

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "[I")
    public static int[] field3424 = new int[field3419];

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "I")
    public static int field3423 = 0;

    @OriginalMember(owner = "client!vc", name = "C", descriptor = "[I")
    public static int[] field3431 = new int[field3419];

    @OriginalMember(owner = "client!vc", name = "D", descriptor = "[I")
    public static int[] field3432 = new int[field3419];

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    public int field3406;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public int field3409;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
    public int field3412;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "I")
    public int field3413;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!vc", name = "y", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "I")
    public int field3428;

    @OriginalMember(owner = "client!vc", name = "B", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "Lpa;")
    public class105 field3420;

    @OriginalMember(owner = "client!vc", name = "w", descriptor = "Lpa;")
    public class105 field3425;

    @OriginalMember(owner = "client!vc", name = "A", descriptor = "Lpa;")
    public class105 field3429;

    @OriginalMember(owner = "client!vc", name = "x", descriptor = "Z")
    public static boolean field3426;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
    public static final void method1143(int arg0) {
        field3427++;
        class137.field3099 = 0;
        class71.field1442 = 0;
        class134.method1021((byte) 6);
        class50.method319((byte) 40);
        class19.method136((byte) -113);
        class107.method841((byte) 33);
        int var1 = 0;
        if (arg0 != 24658) {
            return;
        }
        while (var1 < class137.field3099) {
            int var3 = class127.field2790[var1];
            if (class34.field627 != class85.field1885[var3].field2979) {
                class85.field1885[var3] = null;
            }
            var1++;
        }
        if (class155.field3544 != class9.field196.field2043) {
            throw new RuntimeException("gpp1 pos:" + class9.field196.field2043 + " psize:" + class155.field3544);
        }
        for (int var2 = 0; var2 < class155.field3540; var2++) {
            if (class85.field1885[class151.field3464[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class155.field3540);
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZZI)I")
    public static final int method1144(boolean arg0, boolean arg1, int arg2) {
        int var3 = 0;
        if (arg1) {
            var3 += class97.field2163 + class58.field1157;
        }
        if (arg0) {
            var3 += class64.field1257 + class145.field3350;
        }
        if (arg2 != -518) {
            field3418 = null;
        }
        field3417++;
        return var3;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V")
    public static void method1145(byte arg0) {
        field3431 = null;
        field3422 = null;
        field3424 = null;
        field3405 = null;
        field3408 = null;
        field3416 = null;
        field3404 = null;
        field3407 = null;
        field3411 = null;
        field3415 = null;
        if (arg0 >= -2) {
            method1143(-51);
        }
        field3432 = null;
        field3418 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILfd;II)[Lkd;")
    public static final class73[] method1146(int arg0, class40 arg1, int arg2, int arg3) {
        if (arg2 > -46) {
            return null;
        } else {
            field3430++;
            return class150.method1149(arg1, -116, arg0, arg3) ? class121.method952((byte) 80) : null;
        }
    }
}
