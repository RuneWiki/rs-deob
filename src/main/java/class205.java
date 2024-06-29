import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class205 {

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "Ljd;")
    private static class86 field3700 = class122.method868("Loading title screen )2 ", true);

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "Ljd;")
    private static class86 field3695 = class122.method868("Cancel", true);

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "[[I")
    public static int[][] field3701 = new int[104][104];

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "Ljd;")
    public static class86 field3705 = class122.method868("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", true);

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "Ljd;")
    public static class86 field3703 = class122.method868("<col=ffb000>", true);

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "Ljd;")
    public static class86 field3702 = class122.method868("rot:", true);

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "[S")
    public static short[] field3696 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "Ljd;")
    public static class86 field3708 = field3695;

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "Ljd;")
    public static class86 field3710 = field3700;

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "Ljd;")
    public static class86 field3707 = class122.method868("mapflag", true);

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!ef", name = "q", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!ef", name = "r", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "[I")
    public static int[] field3698;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)Lpf;")
    public static final class273 method1460(int arg0, int arg1) {
        field3712++;
        if (arg1 != 0) {
            return null;
        } else if (arg0 == 0) {
            return new class81();
        } else if (arg0 == 1) {
            return new class255();
        } else if (arg0 == 2) {
            return new class208();
        } else if (arg0 == 3) {
            return new class272();
        } else if (arg0 == 4) {
            return new class10();
        } else if (arg0 == 5) {
            return new class119();
        } else if (arg0 == 6) {
            return new class41();
        } else if (arg0 == 7) {
            return new class214();
        } else if (arg0 == 8) {
            return new class189();
        } else if (arg0 == 9) {
            return new class237();
        } else if (arg0 == 10) {
            return new class24();
        } else if (arg0 == 11) {
            return new class43();
        } else if (arg0 == 12) {
            return new class265();
        } else if (arg0 == 13) {
            return new class98();
        } else if (arg0 == 14) {
            return new class233();
        } else if (arg0 == 15) {
            return new class203();
        } else if (arg0 == 16) {
            return new class7();
        } else if (arg0 == 17) {
            return new class150();
        } else if (arg0 == 18) {
            return new class111();
        } else if (arg0 == 19) {
            return new class102();
        } else if (arg0 == 20) {
            return new class35();
        } else if (arg0 == 21) {
            return new class56();
        } else if (arg0 == 22) {
            return new class149();
        } else if (arg0 == 23) {
            return new class50();
        } else if (arg0 == 24) {
            return new class186();
        } else if (arg0 == 25) {
            return new class169();
        } else if (arg0 == 26) {
            return new class91();
        } else if (arg0 == 27) {
            return new class275();
        } else if (arg0 == 28) {
            return new class84();
        } else if (arg0 == 29) {
            return new class5();
        } else if (arg0 == 30) {
            return new class68();
        } else if (arg0 == 31) {
            return new class238();
        } else if (arg0 == 32) {
            return new class75();
        } else if (arg0 == 33) {
            return new class267();
        } else if (arg0 == 34) {
            return new class154();
        } else if (arg0 == 35) {
            return new class242();
        } else if (arg0 == 36) {
            return new class141();
        } else if (arg0 == 37) {
            return new class64();
        } else if (arg0 == 38) {
            return new class51();
        } else if (arg0 == 39) {
            return new class135();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIZJ)Ljd;")
    public static final class86 method1461(int arg0, int arg1, boolean arg2, long arg3) {
        field3699++;
        if (arg1 < ~arg0 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        int var5 = 1;
        long var6 = arg3 / (long) arg0;
        while (var6 != 0L) {
            var6 /= (long) arg0;
            var5++;
        }
        int var8 = var5;
        if (arg3 < 0L || arg2) {
            var8 = var5 + 1;
        }
        byte[] var9 = new byte[var8];
        if (arg3 < 0L) {
            var9[0] = 45;
        } else if (arg2) {
            var9[0] = 43;
        }
        for (int var10 = 0; var10 < var5; var10++) {
            int var12 = (int) (arg3 % (long) arg0);
            if (var12 < 0) {
                var12 = -var12;
            }
            if (var12 > 9) {
                var12 += 39;
            }
            var9[var8 - var10 - 1] = (byte) (var12 + 48);
            arg3 /= (long) arg0;
        }
        class86 var11 = new class86();
        var11.field1670 = var9;
        var11.field1704 = var8;
        return var11;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V")
    public static final void method1462(byte arg0) {
        if (arg0 == 46) {
            class226.field4103 = new class257();
            field3706++;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIB)V")
    public static final void method1463(int arg0, int arg1, byte arg2) {
        field3711++;
        if (arg2 != -122) {
            field3697 = -61;
        }
        class161 var3 = class204.method1456(true, 5, arg0);
        var3.method1174(0);
        var3.field3027 = arg1;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)V")
    public static final void method1464(boolean arg0) {
        class140.field2667 = 0;
        field3709++;
        class154.field2892 = 1;
        class243.field4349 = -1;
        class20.field533 = 0;
        class45.field1010 = arg0;
        class185.field3282 = -3;
        class102.field1974 = 0;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)I")
    public static final int method1465(int arg0, int arg1, int arg2) {
        if (arg1 != 1687046079) {
            method1463(-11, -37, (byte) -109);
        }
        int var3 = arg0 >>> 31;
        field3704++;
        return (arg0 + var3) / arg2 - var3;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
    public static void method1466(int arg0) {
        field3701 = null;
        field3703 = null;
        field3705 = null;
        field3696 = null;
        field3710 = null;
        field3700 = null;
        field3695 = null;
        if (arg0 == -37) {
            field3707 = null;
            field3708 = null;
            field3702 = null;
            field3698 = null;
        }
    }
}
