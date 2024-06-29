import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public abstract class class108 extends class128 {

    @OriginalMember(owner = "client!bf", name = "M", descriptor = "I")
    public static int field1546 = 0;

    @OriginalMember(owner = "client!bf", name = "L", descriptor = "Z")
    public static boolean field1545 = false;

    @OriginalMember(owner = "client!bf", name = "P", descriptor = "Z")
    public static boolean field1548 = true;

    @OriginalMember(owner = "client!bf", name = "A", descriptor = "I")
    public int field1534;

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!bf", name = "C", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!bf", name = "D", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!bf", name = "E", descriptor = "I")
    public int field1538;

    @OriginalMember(owner = "client!bf", name = "F", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!bf", name = "G", descriptor = "I")
    public int field1540;

    @OriginalMember(owner = "client!bf", name = "H", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!bf", name = "I", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!bf", name = "J", descriptor = "I")
    public int field1543;

    @OriginalMember(owner = "client!bf", name = "K", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!bf", name = "O", descriptor = "I")
    public int field1547;

    @OriginalMember(owner = "client!bf", name = "Q", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!bf", name = "R", descriptor = "I")
    public int field1550;

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "Lkk;")
    public static class67 field1533;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(B)V")
    public static final void method680(byte arg0) {
        int[] var1 = new int[class216.field3308];
        int var2 = 0;
        field1542++;
        if (arg0 != -27) {
            return;
        }
        for (int var3 = 0; var3 < class216.field3308; var3++) {
            class10 var5 = class281.method1822((byte) -106, var3);
            if (var5.field114 >= 0 || var5.field128 >= 0) {
                var1[var2++] = var3;
            }
        }
        class189.field2874 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class189.field2874[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(II)V")
    public abstract void method681(int arg0, int arg1);

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(II)V")
    public abstract void method682(int arg0, int arg1);

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)V")
    public abstract void method683(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZCI)C")
    public static final char method684(boolean arg0, char arg1, int arg2) {
        field1537++;
        if (arg1 >= 'À' && arg1 <= 'ÿ') {
            if (arg1 >= 'À' && arg1 <= 'Æ') {
                return 'A';
            }
            if (arg1 == 'Ç') {
                return 'C';
            }
            if (arg1 >= 'È' && arg1 <= 'Ë') {
                return 'E';
            }
            if (arg1 >= 'Ì' && arg1 <= 'Ï') {
                return 'I';
            }
            if (arg1 == 'Ñ' && arg2 != 0) {
                return 'N';
            }
            if (arg1 >= 'Ò' && arg1 <= 'Ö') {
                return 'O';
            }
            if (arg1 >= 'Ù' && arg1 <= 'Ü') {
                return 'U';
            }
            if (arg1 == 'Ý') {
                return 'Y';
            }
            if (arg1 == 'ß') {
                return 's';
            }
            if (arg1 >= 'à' && arg1 <= 'æ') {
                return 'a';
            }
            if (arg1 == 'ç') {
                return 'c';
            }
            if (arg1 >= 'è' && arg1 <= 'ë') {
                return 'e';
            }
            if (arg1 >= 'ì' && arg1 <= 'ï') {
                return 'i';
            }
            if (arg1 == 'ñ' && arg2 != 0) {
                return 'n';
            }
            if (arg1 >= 'ò' && arg1 <= 'ö') {
                return 'o';
            }
            if (arg1 >= 'ù' && arg1 <= 'ü') {
                return 'u';
            }
            if (arg1 == 'ý' || arg1 == 'ÿ') {
                return 'y';
            }
        }
        if (!arg0) {
            field1548 = false;
        }
        if (arg1 == 'Œ') {
            return 'O';
        } else if (arg1 == 'œ') {
            return 'o';
        } else if (arg1 == 'Ÿ') {
            return 'Y';
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIII)V")
    public abstract void method685(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method686(int arg0, String arg1, int arg2) {
        field1549++;
        if (arg2 != 13680) {
            method686(-50, (String) null, 9);
        }
        class39 var3 = class149.method935(-123, arg0, 2);
        var3.method261(arg2 - 13680);
        var3.field603 = arg1;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZ)V")
    public static final void method687(int arg0, boolean arg1) {
        class116.field1675 = null;
        class164.field2335 = null;
        class97.field1416 = null;
        class97.field1409 = null;
        class97.field1417 = null;
        if (arg1 && class97.field1404 != null) {
            class149.field2066 = class97.field1404.field4778;
        } else {
            class149.field2066 = -1;
        }
        class97.field1415 = null;
        class97.field1408 = null;
        class97.field1413 = null;
        class97.field1418 = null;
        field1535++;
        class97.field1411 = null;
        class97.field1404 = null;
        class302.field4800 = 0;
        class97.field1398.method1065(0);
        class292.field4667 = null;
        class284.field4558 = null;
        class170.field2422 = -1;
        class175.field2472 = null;
        class97.field1403 = null;
        class267.field4290 = null;
        class75.field1059 = null;
        field1533 = null;
        class43.field637 = null;
        class103.field1482 = null;
        class7.field83 = null;
        class145.field2008 = -1;
        class281.method1826(-1);
        class53.field750 = null;
        if (arg0 <= 44) {
            field1545 = true;
        }
        class307.field4942 = null;
        class246.field3865 = null;
        class69.method464(64, (byte) 35, 128);
        class270.method1765(126, 64, 64);
        class294.method1972(64, 21364);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIII)V")
    public abstract void method688(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BLbj;)Ls;")
    public static final class98 method689(byte arg0, class215 arg1) {
        field1536++;
        if (arg0 >= -45) {
            return null;
        } else {
            class98 var2 = new class98();
            var2.field1428 = arg1.method1379(-127);
            var2.field1424 = class158.method984((byte) -62, var2.field1428);
            return var2;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(CI)Z")
    public static final boolean method690(char arg0, int arg1) {
        field1539++;
        if (arg1 != 231) {
            method689((byte) -7, (class215) null);
        }
        return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIII)V")
    public abstract void method691(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BIIII)V")
    public final void method692(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = this.field1538 << 3;
        int var7 = (arg3 << 4) + (var6 & 0xF);
        int var8 = this.field1534 << 3;
        int var9 = (arg2 << 4) + (var8 & 0xF);
        field1541++;
        this.method688(var6, var8, var7, var9, arg4, arg1);
        if (arg0 <= 120) {
            field1545 = false;
        }
    }

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "(I)V")
    public static void method693(int arg0) {
        int var1 = 124 % ((25 - arg0) / 59);
        field1533 = null;
    }

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "(II)V")
    public abstract void method694(int arg0, int arg1);
}
