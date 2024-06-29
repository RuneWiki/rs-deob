import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class118 {

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "J")
    public long field1662 = 0L;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "[S")
    public static short[] field1663 = new short[256];

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public static int field1666 = 0;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "I")
    public static int field1678 = -1;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "Lrc;")
    public static class9 field1667 = new class9(50);

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "I")
    public static int field1679 = 0;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public int field1661;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public int field1664;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    public int field1670;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    public int field1673;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "I")
    public int field1677;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "Lca;")
    public class131 field1659;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "Lca;")
    public class131 field1672;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IILbc;I)Lwj;")
    public static final class130 method758(int arg0, int arg1, class282 arg2, int arg3) {
        field1669++;
        if (arg3 > -48) {
            return null;
        } else if (class282.method1875(arg2, arg1, 0, arg0)) {
            return class103.method629(133862865);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(CII)C")
    public static final char method759(char arg0, int arg1, int arg2) {
        field1675++;
        if (arg0 >= 'À' && arg0 <= 'ÿ') {
            if (arg0 >= 'À' && arg0 <= 'Æ') {
                return 'A';
            }
            if (arg0 == 'Ç') {
                return 'C';
            }
            if (arg0 >= 'È' && arg0 <= 'Ë') {
                return 'E';
            }
            if (arg0 >= 'Ì' && arg0 <= 'Ï') {
                return 'I';
            }
            if (arg0 == 'Ñ' && arg2 != 0) {
                return 'N';
            }
            if (arg0 >= 'Ò' && arg0 <= 'Ö') {
                return 'O';
            }
            if (arg0 >= 'Ù' && arg0 <= 'Ü') {
                return 'U';
            }
            if (arg0 == 'Ý') {
                return 'Y';
            }
            if (arg0 == 'ß') {
                return 's';
            }
            if (arg0 >= 'à' && arg0 <= 'æ') {
                return 'a';
            }
            if (arg0 == 'ç') {
                return 'c';
            }
            if (arg0 >= 'è' && arg0 <= 'ë') {
                return 'e';
            }
            if (arg0 >= 'ì' && arg0 <= 'ï') {
                return 'i';
            }
            if (arg0 == 'ñ' && arg2 != 0) {
                return 'n';
            }
            if (arg0 >= 'ò' && arg0 <= 'ö') {
                return 'o';
            }
            if (arg0 >= 'ù' && arg0 <= 'ü') {
                return 'u';
            }
            if (arg0 == 'ý' || arg0 == 'ÿ') {
                return 'y';
            }
        }
        if (arg0 == 'Œ') {
            return 'O';
        } else if (arg0 == 'œ') {
            return 'o';
        } else if (arg0 == 'Ÿ') {
            return 'Y';
        } else if (arg1 == 25739) {
            return arg0;
        } else {
            return '_';
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public static void method760(int arg0) {
        field1663 = null;
        field1667 = null;
        if (arg0 != -1) {
            method762(-31);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(JI)V")
    public static final void method761(long arg0, int arg1) {
        if (arg1 > 0) {
            method764(74, 58, -37, -26, -21, -59, 13);
        }
        int var3 = class99.field1323 + class177.field2507.field4563;
        field1668++;
        int var4 = class77.field928 + class177.field2507.field4553;
        if (!class254.field3666) {
            class159.field2310 += (float) arg0 * class154.field2232 / 40.0F;
            class274.field4085 += (float) arg0 * class238.field3438 / 40.0F;
        }
        if ((class238.field3426 - var3) < -500 || class238.field3426 - var3 > 500 || class70.field821 - var4 < -500 || (class70.field821 - var4) > 500) {
            class70.field821 = var4;
            class238.field3426 = var3;
        }
        if (class238.field3426 != var3) {
            int var5 = var3 - class238.field3426;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var6 < var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var6 > var5) {
                var6 = var5;
            }
            class238.field3426 += var6;
        }
        if (class70.field821 != var4) {
            int var7 = var4 - class70.field821;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var7 > var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var8 > var7) {
                var8 = var7;
            }
            class70.field821 += var8;
        }
        class12.method79((byte) 44);
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)I")
    public static final int method762(int arg0) {
        field1674++;
        class17.field213 = arg0;
        return class17.method103((byte) 88);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILwe;)Lwe;")
    public static final class82 method763(int arg0, class82 arg1) {
        field1671++;
        if (arg0 != -231) {
            field1660 = 53;
        }
        class82 var2 = client.method1915(arg1);
        if (var2 == null) {
            var2 = arg1.field1036;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIIII)I")
    public static final int method764(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg6 & 0x1) == 1) {
            int var7 = arg4;
            arg4 = arg3;
            arg3 = var7;
        }
        if (arg5 != 7) {
            field1663 = null;
        }
        field1676++;
        int var8 = arg0 & 0x3;
        if (var8 == 0) {
            return arg2;
        } else if (var8 == 1) {
            return 7 - arg1 - (arg4 - 1);
        } else if (var8 == 2) {
            return 7 + 1 - arg2 - arg3;
        } else {
            return arg1;
        }
    }
}
