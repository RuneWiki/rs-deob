import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class22 {

    @OriginalMember(owner = "client!d", name = "d", descriptor = "Lvc;")
    public static class137 field510 = class45.method325("Begeben Sie sich in ein freies Gebiet)1 um", -46);

    @OriginalMember(owner = "client!d", name = "b", descriptor = "Lvc;")
    private static class137 field508 = class45.method325("Please subscribe)1 or use a different world)3", -46);

    @OriginalMember(owner = "client!d", name = "e", descriptor = "Lvc;")
    public static class137 field511 = field508;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "Lvc;")
    public static class137 field513 = class45.method325("", -46);

    @OriginalMember(owner = "client!d", name = "h", descriptor = "Lpb;")
    public static class100 field514 = new class100();

    @OriginalMember(owner = "client!d", name = "k", descriptor = "Lvc;")
    public static class137 field517 = class45.method325("Side panel redrawn", -46);

    @OriginalMember(owner = "client!d", name = "o", descriptor = "Lvc;")
    private static class137 field521 = class45.method325("Error connecting to server)3", -46);

    @OriginalMember(owner = "client!d", name = "q", descriptor = "Lvc;")
    public static class137 field523 = field521;

    @OriginalMember(owner = "client!d", name = "r", descriptor = "Lvc;")
    private static class137 field524 = class45.method325("Checking for updates )2 ", -46);

    @OriginalMember(owner = "client!d", name = "s", descriptor = "Lvc;")
    public static class137 field525 = class45.method325("Ein kostenloses Spielkonto erstellen)3", -46);

    @OriginalMember(owner = "client!d", name = "m", descriptor = "Lvc;")
    public static class137 field519 = field524;

    @OriginalMember(owner = "client!d", name = "p", descriptor = "Lvc;")
    private static class137 field522 = class45.method325("green:", -46);

    @OriginalMember(owner = "client!d", name = "n", descriptor = "Lvc;")
    public static class137 field520 = field522;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!d", name = "l", descriptor = "Lfc;")
    public static class39 field518;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "[I")
    public static int[] field512;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
    public static void method199(int arg0) {
        field511 = null;
        field523 = null;
        field525 = null;
        field513 = null;
        field508 = null;
        field522 = null;
        field510 = null;
        field517 = null;
        field519 = null;
        field512 = null;
        field520 = null;
        field514 = null;
        if (arg0 == -517) {
            field524 = null;
            field518 = null;
            field521 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
    public static final void method200(int arg0) {
        field515++;
        int var1 = class42.field925.method1130(class75.field1628);
        for (int var2 = 0; var2 < class59.field1270; var2++) {
            int var10 = class42.field925.method1129(class29.field646[var2]);
            if (var1 < var10) {
                var1 = var10;
            }
        }
        var1 += 8;
        int var3 = class59.field1270 * 15 + 21;
        if (arg0 > ~class36.field788 && class38.field835 > 4 && class36.field788 < 516 && class38.field835 < 338) {
            class77.field1718 = true;
            class107.field2486 = 0;
            class72.field1525 = class59.field1270 * 15 + 22;
            class119.field2783 = var1;
            int var4 = class36.field788 - var1 / 2 - 4;
            if (var1 + var4 > 512) {
                var4 = 512 - var1;
            }
            if (var4 < 0) {
                var4 = 0;
            }
            class134.field3125 = var4;
            int var5 = class38.field835 - 4;
            if (var3 + var5 > 334) {
                var5 = 334 - var3;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            class45.field1014 = var5;
        }
        if (class36.field788 > 553 && class38.field835 > 205 && class36.field788 < 743 && class38.field835 < 466) {
            class77.field1718 = true;
            class107.field2486 = 1;
            class119.field2783 = var1;
            class72.field1525 = class59.field1270 * 15 + 22;
            int var6 = class38.field835 - 205;
            if (var6 < 0) {
                var6 = 0;
            } else if (var3 + var6 > 261) {
                var6 = 261 - var3;
            }
            class45.field1014 = var6;
            int var7 = class36.field788 - var1 / 2 - 553;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 + var1 > 190) {
                var7 = 190 - var1;
            }
            class134.field3125 = var7;
        }
        if (class36.field788 <= 17 || class38.field835 <= 357 || class36.field788 >= 496 || class38.field835 >= 453) {
            return;
        }
        class77.field1718 = true;
        class119.field2783 = var1;
        class72.field1525 = class59.field1270 * 15 + 22;
        class107.field2486 = 2;
        int var8 = class36.field788 - var1 / 2 - 17;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 + var1 > 479) {
            var8 = 479 - var1;
        }
        int var9 = class38.field835 - 357;
        class134.field3125 = var8;
        if (var9 < 0) {
            var9 = 0;
        } else if (var9 + var3 > 96) {
            var9 = 96 - var3;
        }
        class45.field1014 = var9;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method201(int arg0, int arg1) {
        field516++;
        if (~arg1 == arg0 && class123.field2859 > 0) {
            byte[] var2 = class95.field2237[--class123.field2859];
            class95.field2237[class123.field2859] = null;
            return var2;
        } else if (arg1 == 5000 && class92.field2171 > 0) {
            byte[] var3 = class112.field2681[--class92.field2171];
            class112.field2681[class92.field2171] = null;
            return var3;
        } else if (arg1 == 30000 && class88.field2098 > 0) {
            byte[] var4 = class2.field32[--class88.field2098];
            class2.field32[class88.field2098] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IZI)Z")
    public static final boolean method202(int arg0, boolean arg1, int arg2) {
        field507++;
        if (arg1) {
            return false;
        } else {
            return (arg0 >> arg2 + 1 & 0x1) != 0;
        }
    }
}
