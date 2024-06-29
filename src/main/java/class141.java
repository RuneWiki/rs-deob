import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class141 extends class119 {

    @OriginalMember(owner = "client!ub", name = "K", descriptor = "Lv;")
    private static class146 field3223 = class159.method1226((byte) -37, "Your account has been disabled)3");

    @OriginalMember(owner = "client!ub", name = "Q", descriptor = "Lv;")
    public static class146 field3228 = class159.method1226((byte) -37, "Null");

    @OriginalMember(owner = "client!ub", name = "H", descriptor = "Lv;")
    public static class146 field3220 = class159.method1226((byte) -37, "Die Verbindung konnte");

    @OriginalMember(owner = "client!ub", name = "N", descriptor = "Lv;")
    public static class146 field3226 = field3223;

    @OriginalMember(owner = "client!ub", name = "J", descriptor = "I")
    public static int field3222 = -1;

    @OriginalMember(owner = "client!ub", name = "U", descriptor = "[I")
    public static int[] field3232 = new int[2000];

    @OriginalMember(owner = "client!ub", name = "I", descriptor = "I")
    public static int field3221 = 0;

    @OriginalMember(owner = "client!ub", name = "R", descriptor = "Lgf;")
    public static class48 field3229 = new class48(32);

    @OriginalMember(owner = "client!ub", name = "T", descriptor = "B")
    public byte field3231;

    @OriginalMember(owner = "client!ub", name = "G", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!ub", name = "L", descriptor = "I")
    public int field3224;

    @OriginalMember(owner = "client!ub", name = "O", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!ub", name = "X", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!ub", name = "Y", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!ub", name = "V", descriptor = "Lvd;")
    public static class150 field3233;

    @OriginalMember(owner = "client!ub", name = "B", descriptor = "Ldc;")
    public class25 field3218;

    @OriginalMember(owner = "client!ub", name = "W", descriptor = "Lie;")
    public static class61 field3234;

    @OriginalMember(owner = "client!ub", name = "M", descriptor = "Lla;")
    public static class77 field3225;

    @OriginalMember(owner = "client!ub", name = "S", descriptor = "Lla;")
    public static class77 field3230;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "([BI)[B")
    public static final byte[] method1051(byte[] arg0, int arg1) {
        class95 var2 = new class95(arg0);
        if (arg1 != 1) {
            return null;
        }
        field3235++;
        int var3 = var2.method790((byte) 73);
        int var4 = var2.method740((byte) 35);
        if (var4 < 0 || class81.field1970 != 0 && var4 > class81.field1970) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method751(118, var5, var4, 0);
            return var5;
        } else {
            int var6 = var2.method740((byte) -79);
            if (var6 < 0 || class81.field1970 != 0 && class81.field1970 < var6) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class27.method184(var7, var6, arg0, var4, 9);
            } else {
                class24.field382.method91(arg1 - 11, var7, var2);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZI)Lkc;")
    public static final class72 method1052(boolean arg0, int arg1) {
        class72 var2 = (class72) class38.field844.method1045((long) arg1, 34);
        field3219++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class34.field737.method585(12, 127, arg1);
        if (!arg0) {
            method1051(null, 51);
        }
        class72 var4 = new class72();
        if (var3 != null) {
            var4.method513(new class95(var3), -1);
        }
        var4.method512(27488);
        class38.field844.method1047(-1, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)I")
    public static final int method1053(int arg0, int arg1, int arg2) {
        field3227++;
        if (arg1 != -1) {
            return 0;
        }
        int var3 = 0;
        while (arg2 > 0) {
            arg2--;
            var3 = var3 << 1 | arg0 & 0x1;
            arg0 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V")
    public static void method1054(byte arg0) {
        field3225 = null;
        field3230 = null;
        field3226 = null;
        int var1 = -117 / ((28 - arg0) / 58);
        field3229 = null;
        field3220 = null;
        field3232 = null;
        field3228 = null;
        field3234 = null;
        field3233 = null;
        field3223 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZ)Lo;")
    public static final class97 method1055(int arg0, boolean arg1) {
        field3236++;
        if (arg1) {
            method1054((byte) 20);
        }
        class97 var2 = (class97) class25.field425.method1045((long) arg0, 117);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class123.field2858.method585(8, 97, arg0);
        class97 var4 = new class97();
        if (var3 != null) {
            var4.method799(new class95(var3), (byte) -43);
        }
        class25.field425.method1047(-1, var4, (long) arg0);
        return var4;
    }
}
