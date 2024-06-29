import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class29 extends class146 {

    @OriginalMember(owner = "client!e", name = "s", descriptor = "[B")
    public static byte[] field519 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!e", name = "v", descriptor = "Lec;")
    private static class32 field522 = class73.method594("We suspect someone knows your password)3", true);

    @OriginalMember(owner = "client!e", name = "A", descriptor = "I")
    public static int field527 = 0;

    @OriginalMember(owner = "client!e", name = "u", descriptor = "Lec;")
    public static class32 field521 = class73.method594("leuchten1:", true);

    @OriginalMember(owner = "client!e", name = "D", descriptor = "Lec;")
    public static class32 field530 = class73.method594("Fehler beim Laden Ihres Spielcharakters)3", true);

    @OriginalMember(owner = "client!e", name = "E", descriptor = "Lec;")
    public static class32 field531 = field522;

    @OriginalMember(owner = "client!e", name = "J", descriptor = "Lec;")
    public static class32 field536 = class73.method594("compass", true);

    @OriginalMember(owner = "client!e", name = "K", descriptor = "Lec;")
    private static class32 field537 = class73.method594("Loaded fonts", true);

    @OriginalMember(owner = "client!e", name = "B", descriptor = "Lec;")
    public static class32 field528 = field537;

    @OriginalMember(owner = "client!e", name = "r", descriptor = "I")
    public int field518;

    @OriginalMember(owner = "client!e", name = "t", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!e", name = "w", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!e", name = "I", descriptor = "I")
    public int field535;

    @OriginalMember(owner = "client!e", name = "y", descriptor = "Lqc;")
    public static class114 field525;

    @OriginalMember(owner = "client!e", name = "x", descriptor = "[I")
    public int[] field524;

    @OriginalMember(owner = "client!e", name = "z", descriptor = "[I")
    public int[] field526;

    @OriginalMember(owner = "client!e", name = "F", descriptor = "[I")
    public int[] field532;

    @OriginalMember(owner = "client!e", name = "C", descriptor = "[Lcc;")
    public class18[] field529;

    @OriginalMember(owner = "client!e", name = "H", descriptor = "[Lcc;")
    public class18[] field534;

    @OriginalMember(owner = "client!e", name = "G", descriptor = "[[[B")
    public byte[][][] field533;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(I)V")
    public static void method195(int arg0) {
        field528 = null;
        field521 = null;
        field536 = null;
        field522 = null;
        field530 = null;
        field537 = null;
        field519 = null;
        field525 = null;
        if (arg0 <= -5) {
            field531 = null;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIZ)I")
    public static final int method196(int arg0, int arg1, boolean arg2) {
        field520++;
        class107 var3 = (class107) class34.field710.method1198((long) arg0, (byte) -106);
        if (var3 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var4 = 0;
            if (!arg2) {
                method195(98);
            }
            for (int var5 = 0; var5 < var3.field2537.length; var5++) {
                if (var3.field2539[var5] == arg1) {
                    var4 += var3.field2537[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!e", name = "e", descriptor = "(I)Z")
    public static final boolean method197(int arg0) {
        field523++;
        if (class98.field2265 == 0) {
            if (arg0 != 2330) {
                method197(-86);
            }
            return class83.field1967.method90(-102);
        } else {
            return true;
        }
    }
}
