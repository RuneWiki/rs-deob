import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class65 extends class145 {

    @OriginalMember(owner = "client!jc", name = "eb", descriptor = "I")
    public int field1403 = 0;

    @OriginalMember(owner = "client!jc", name = "ab", descriptor = "Z")
    public static boolean field1399 = false;

    @OriginalMember(owner = "client!jc", name = "Z", descriptor = "[Lpd;")
    public static class108[] field1398 = new class108[256];

    @OriginalMember(owner = "client!jc", name = "db", descriptor = "Ltd;")
    public static class136 field1402 = class145.method1172("Bitte entfernen Sie ", 45);

    @OriginalMember(owner = "client!jc", name = "cb", descriptor = "I")
    public static int field1401 = 0;

    @OriginalMember(owner = "client!jc", name = "ib", descriptor = "[Ltd;")
    public static class136[] field1407 = new class136[500];

    @OriginalMember(owner = "client!jc", name = "gb", descriptor = "Ltd;")
    public static class136 field1405 = class145.method1172("T", 45);

    @OriginalMember(owner = "client!jc", name = "U", descriptor = "Ltd;")
    public static class136 field1393 = class145.method1172("Bitte laden Sie die Seite neu)3", 45);

    @OriginalMember(owner = "client!jc", name = "kb", descriptor = "Ltd;")
    public static class136 field1409 = class145.method1172("null", 45);

    @OriginalMember(owner = "client!jc", name = "V", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!jc", name = "W", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!jc", name = "X", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!jc", name = "bb", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!jc", name = "fb", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!jc", name = "hb", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!jc", name = "jb", descriptor = "[I")
    public static int[] field1408;

    @OriginalMember(owner = "client!jc", name = "Y", descriptor = "[[I")
    public static int[][] field1397;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IBII)I")
    public static final int method486(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = arg3 >> 7;
        int var5 = arg2 >> 7;
        field1395++;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg0;
        if (arg0 < 3 && (class125.field2895[1][var4][var5] & 0x2) == 2) {
            var6 = arg0 + 1;
        }
        if (arg1 != -42) {
            field1394 = -118;
        }
        int var7 = arg3 & 0x7F;
        int var8 = arg2 & 0x7F;
        int var9 = (128 - var7) * class78.field1804[var6][var4][var5 + 1] + class78.field1804[var6][var4 + 1][var5 + 1] * var7 >> 7;
        int var10 = (128 - var7) * class78.field1804[var6][var4][var5] + class78.field1804[var6][var4 + 1][var5] * var7 >> 7;
        return (128 - var8) * var10 + var8 * var9 >> 7;
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(B)V")
    public static void method487(byte arg0) {
        field1402 = null;
        field1408 = null;
        field1405 = null;
        field1409 = null;
        field1397 = null;
        field1393 = null;
        field1407 = null;
        field1398 = null;
        if (arg0 != -75) {
            method488(null, 96, null);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lmd;ILmd;)I")
    public static final int method488(class87 arg0, int arg1, class87 arg2) {
        field1396++;
        int var3 = 0;
        if (arg0.method663(class127.field3019, class81.field1934, (byte) 13)) {
            var3++;
        }
        if (arg2.method663(class2.field24, class81.field1934, (byte) 13)) {
            var3++;
        }
        if (arg2.method663(class147.field3408, class81.field1934, (byte) 13)) {
            var3++;
        }
        if (arg2.method663(class56.field1279, class81.field1934, (byte) 13)) {
            var3++;
        }
        int var4 = -40 / ((-arg1 - 62) / 51);
        if (arg2.method663(class74.field1651, class81.field1934, (byte) 13)) {
            var3++;
        }
        if (arg2.method663(class62.field1318, class81.field1934, (byte) 13)) {
            var3++;
        }
        arg2.method663(class35.field810, class81.field1934, (byte) 13);
        arg2.method663(class49.field1117, class81.field1934, (byte) 13);
        arg2.method663(class16.field321, class81.field1934, (byte) 13);
        arg2.method663(class16.field331, class81.field1934, (byte) 13);
        arg2.method663(class77.field1776, class81.field1934, (byte) 13);
        return var3;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILsb;)V")
    public final void method489(int arg0, class127 arg1) {
        while (true) {
            int var3 = arg1.method1011(48);
            if (var3 == 0) {
                if (arg0 != -1) {
                    return;
                }
                field1404++;
                return;
            }
            this.method490(var3, (byte) -80, arg1);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IBLsb;)V")
    private final void method490(int arg0, byte arg1, class127 arg2) {
        if (arg1 >= -30) {
            field1399 = true;
        }
        if (arg0 == 5) {
            this.field1403 = arg2.method1020(false);
        }
        field1400++;
    }
}
