import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class459 {

    @OriginalMember(owner = "client!it", name = "i", descriptor = "Lhk;")
    public static class68 field6847 = new class68(14, 1);

    @OriginalMember(owner = "client!it", name = "k", descriptor = "Lhk;")
    public static class68 field6849 = new class68(15, 4);

    @OriginalMember(owner = "client!it", name = "l", descriptor = "Lhk;")
    public static class68 field6850 = new class68(16, -2);

    @OriginalMember(owner = "client!it", name = "m", descriptor = "Lhk;")
    public static class68 field6851 = new class68(17, 0);

    @OriginalMember(owner = "client!it", name = "n", descriptor = "Lhk;")
    public static class68 field6852 = new class68(18, -2);

    @OriginalMember(owner = "client!it", name = "o", descriptor = "Lhk;")
    public static class68 field6853 = new class68(19, -2);

    @OriginalMember(owner = "client!it", name = "p", descriptor = "Lhk;")
    public static class68 field6854 = new class68(20, 6);

    @OriginalMember(owner = "client!it", name = "q", descriptor = "Lhk;")
    public static class68 field6855 = new class68(21, 9);

    @OriginalMember(owner = "client!it", name = "r", descriptor = "Lhk;")
    public static class68 field6856 = new class68(22, -2);

    @OriginalMember(owner = "client!it", name = "s", descriptor = "Lhk;")
    public static class68 field6857 = new class68(23, 4);

    @OriginalMember(owner = "client!it", name = "t", descriptor = "Lhk;")
    public static class68 field6858 = new class68(24, -1);

    @OriginalMember(owner = "client!it", name = "u", descriptor = "Lhk;")
    public static class68 field6859 = new class68(25, -2);

    @OriginalMember(owner = "client!it", name = "v", descriptor = "[Lhk;")
    private static class68[] field6860 = new class68[32];

    @OriginalMember(owner = "client!it", name = "a", descriptor = "I")
    public int field6839;

    @OriginalMember(owner = "client!it", name = "b", descriptor = "I")
    public static int field6840;

    @OriginalMember(owner = "client!it", name = "c", descriptor = "I")
    public static int field6841;

    @OriginalMember(owner = "client!it", name = "d", descriptor = "I")
    public int field6842;

    @OriginalMember(owner = "client!it", name = "e", descriptor = "I")
    public int field6843;

    @OriginalMember(owner = "client!it", name = "f", descriptor = "I")
    public static int field6844;

    @OriginalMember(owner = "client!it", name = "g", descriptor = "I")
    public int field6845;

    @OriginalMember(owner = "client!it", name = "h", descriptor = "I")
    public static int field6846;

    @OriginalMember(owner = "client!it", name = "j", descriptor = "I")
    public static int field6848;

    static {
        class68[] var0 = class333.method1942((byte) -107);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field6860[var0[var1].field782] = var0[var1];
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(B[I[J)V", line = 5)
    public static final void method2824(byte arg0, int[] arg1, long[] arg2) {
        field6844++;
        if (arg0 >= -96) {
            method2826(-5, null, 116);
        }
        class104.method632(arg2, 0, 26678, arg1, arg2.length - 1);
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(ILu;Lu;ZB)I", line = 17)
    public static final int method2825(int arg0, class54 arg1, class54 arg2, boolean arg3, byte arg4) {
        field6841++;
        if (arg0 == 1) {
            int var5 = arg2.field7100;
            int var6 = arg1.field7100;
            if (!arg3) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        }
        if (arg4 >= -80) {
            method2828(-21);
        }
        if (arg0 == 2) {
            return class444.method2745((byte) -41, arg2.method321(-71).field1972, arg1.method321(-60).field1972, class374.field5072);
        } else if (arg0 == 3) {
            if (arg2.field626.equals("-")) {
                if (arg1.field626.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field626.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return class444.method2745((byte) -41, arg2.field626, arg1.field626, class374.field5072);
            }
        } else if (arg0 == 4) {
            if (arg2.method2928((byte) 111)) {
                return arg1.method2928((byte) 119) ? 0 : 1;
            } else if (arg1.method2928((byte) 106)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg0 == 5) {
            if (arg2.method2929(0)) {
                return arg1.method2929(0) ? 0 : 1;
            } else if (arg1.method2929(0)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg0 == 6) {
            if (arg2.method2926(25277)) {
                return arg1.method2926(25277) ? 0 : 1;
            } else if (arg1.method2926(25277)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg0 == 7) {
            if (arg2.method2930(-103)) {
                return arg1.method2930(-121) ? 0 : 1;
            } else if (arg1.method2930(-127)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg0 == 8) {
            int var7 = arg2.field628;
            int var8 = arg1.field628;
            if (arg3) {
                if (var8 == 1000) {
                    var8 = -1;
                }
                if (var7 == 1000) {
                    var7 = -1;
                }
            } else {
                if (var7 == -1) {
                    var7 = 1000;
                }
                if (var8 == -1) {
                    var8 = 1000;
                }
            }
            return var7 - var8;
        } else {
            return arg2.field627 - arg1.field627;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(ILug;I)V", line = 121)
    public static final void method2826(int arg0, class396 arg1, int arg2) {
        if (class63.field735 != null) {
            try {
                class63.field735.method1094(80, 0L);
                class63.field735.method1105(false, 24, arg1.field5761, arg0);
            } catch (Exception var3) {
            }
        }
        field6846++;
        if (arg2 != 16208) {
            field6858 = null;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(B)V", line = 145)
    public static final void method2827(byte arg0) {
        class419.field6085.method293((byte) 83);
        field6848++;
        class435.field6351.method293((byte) -128);
        if (arg0 != -5) {
            field6855 = null;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I)V", line = 161)
    public static void method2828(int arg0) {
        field6851 = null;
        field6847 = null;
        field6853 = null;
        field6850 = null;
        field6852 = null;
        field6856 = null;
        field6855 = null;
        field6859 = null;
        field6854 = null;
        if (arg0 < 48) {
            field6851 = null;
        }
        field6858 = null;
        field6860 = null;
        field6849 = null;
        field6857 = null;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(ILfo;Lfo;)I", line = 186)
    public static final int method2829(int arg0, class361 arg1, class361 arg2) {
        field6840++;
        int var3 = 0;
        if (arg1.method2133(arg0 ^ arg0, class299.field3929)) {
            var3++;
        }
        if (arg1.method2133(0, class365.field4985)) {
            var3++;
        }
        if (arg1.method2133(arg0 + 2, class349.field4642)) {
            var3++;
        }
        if (arg2.method2133(arg0 ^ 0xFFFFFFFE, class299.field3929)) {
            var3++;
        }
        if (arg2.method2133(0, class365.field4985)) {
            var3++;
        }
        if (arg2.method2133(0, class349.field4642)) {
            var3++;
        }
        return var3;
    }
}
