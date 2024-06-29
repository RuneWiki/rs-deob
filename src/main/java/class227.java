import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public abstract class class227 {

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
    public static int field3544 = 0;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
    public static int field3547 = 0;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "Z")
    public static boolean field3540 = false;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public int field3537;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public int field3539;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public int field3543;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
    public int field3545;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
    public int field3546;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
    public int field3549;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "Lji;")
    public static class256 field3542;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)V")
    public abstract void method368(int arg0, int arg1);

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)I")
    public static final int method1552(boolean arg0) {
        if (arg0) {
            method1553((byte) -56, (class237) null, (class237) null);
        }
        field3538++;
        return 0;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BLpk;Lpk;)I")
    public static final int method1553(byte arg0, class237 arg1, class237 arg2) {
        int var3 = 0;
        field3536++;
        if (arg1.method1629(class9.field104, 0)) {
            var3++;
        }
        if (arg1.method1629(class114.field1744, 0)) {
            var3++;
        }
        if (arg1.method1629(class76.field1209, 0)) {
            var3++;
        }
        if (arg0 >= -56) {
            method1555(11);
        }
        if (arg2.method1629(class9.field104, 0)) {
            var3++;
        }
        if (arg2.method1629(class114.field1744, 0)) {
            var3++;
        }
        if (arg2.method1629(class76.field1209, 0)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(CBLjava/lang/String;)[Ljava/lang/String;")
    public static final String[] method1554(char arg0, byte arg1, String arg2) {
        field3550++;
        int var3 = class97.method726(arg0, arg2, (byte) -97);
        if (arg1 <= 110) {
            field3547 = 68;
        }
        int var4 = 0;
        int var5 = 0;
        String[] var6 = new String[var3 + 1];
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var5; arg2.charAt(var8) != arg0; var8++) {
            }
            var6[var4++] = arg2.substring(var5, var8);
            var5 = var8 + 1;
        }
        var6[var3] = arg2.substring(var5);
        return var6;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public static void method1555(int arg0) {
        if (arg0 <= 36) {
            method1552(false);
        }
        field3542 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)V")
    public abstract void method363(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILca;)V")
    public static final void method1556(int arg0, class54 arg1) {
        field3535++;
        if (arg1.field848.length - arg1.field887 < 1) {
            return;
        }
        int var2 = arg1.method407(255);
        if (var2 < 0 || var2 > 11) {
            return;
        }
        byte var3;
        if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if ((arg1.field848.length - arg1.field887) < var3) {
            return;
        }
        class176.field2585 = arg1.method407(255);
        if (class176.field2585 < 1) {
            class176.field2585 = 1;
        } else if (class176.field2585 > 4) {
            class176.field2585 = 4;
        }
        class206.method1362((byte) -122, arg1.method407(255) == 1);
        class244.field3785 = arg1.method407(255) == 1;
        class127.field1867 = arg1.method407(255) == 1;
        class249.field3869 = arg1.method407(arg0 + 262) == 1;
        class126.field1856 = arg1.method407(255) == 1;
        class10.field145 = arg1.method407(255) == 1;
        class17.field312 = arg1.method407(255) == 1;
        class134.field1967 = arg1.method407(255) == 1;
        class233.field3602 = arg1.method407(255);
        if (class233.field3602 > 2) {
            class233.field3602 = 2;
        }
        if (var2 >= 2) {
            class54.field879 = arg1.method407(255) == 1;
        } else {
            class54.field879 = arg1.method407(255) == 1;
            arg1.method407(arg0 + 262);
        }
        class109.field1628 = arg1.method407(255) == 1;
        class241.field3755 = arg1.method407(arg0 + 262) == 1;
        class162.field2350 = arg1.method407(255);
        if (class162.field2350 > 2) {
            class162.field2350 = 2;
        }
        client.field715 = class162.field2350;
        class25.field431 = arg1.method407(255) == 1;
        class112.field1719 = arg1.method407(255);
        if (class112.field1719 > 127) {
            class112.field1719 = 127;
        }
        class188.field2789 = arg1.method407(255);
        class194.field2934 = arg1.method407(255);
        if (class194.field2934 > 127) {
            class194.field2934 = 127;
        }
        if (var2 >= 1) {
            class145.field2097 = arg1.method423(arg0 + 73);
            class49.field811 = arg1.method423(93);
        }
        if (var2 >= 3 && var2 < 6) {
            arg1.method407(255);
        }
        if (var2 >= 4) {
            int var4 = arg1.method407(255);
            if (class155.field2270 < 96) {
                var4 = 0;
            }
            class31.method214(var4);
        }
        if (var2 >= 5) {
            class142.field2039 = arg1.method420((byte) 93);
        }
        if (~var2 <= arg0) {
            class124.field1840 = arg1.method407(arg0 ^ 0xFFFFFF06);
        }
        if (var2 >= 7) {
            class170.field2503 = arg1.method407(arg0 ^ 0xFFFFFF06) == 1;
        }
        if (var2 >= 8) {
            class117.field1767 = arg1.method407(255) == 1;
        }
        if (var2 >= 9) {
            class249.field3862 = arg1.method407(255);
        }
        if (var2 >= 10) {
            class131.field1939 = arg1.method407(arg0 + 262) != 0;
        }
        if (var2 >= 11) {
            class23.field376 = arg1.method407(255) != 0;
        }
    }
}
