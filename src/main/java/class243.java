import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class243 {

    @OriginalMember(owner = "client!rm", name = "k", descriptor = "Z")
    public boolean field4319 = false;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "Lud;")
    public static class279 field4312 = class130.method1024(" zuerst von Ihrer Ignorieren)2Liste(Q", 255);

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "Lud;")
    private static class279 field4311 = class130.method1024("", 255);

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "Lud;")
    public static class279 field4309 = field4311;

    @OriginalMember(owner = "client!rm", name = "o", descriptor = "Lud;")
    private static class279 field4323 = class130.method1024(" has logged in)3", 255);

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "I")
    public static int field4315 = 0;

    @OriginalMember(owner = "client!rm", name = "m", descriptor = "Z")
    public static boolean field4321 = false;

    @OriginalMember(owner = "client!rm", name = "s", descriptor = "Lud;")
    public static class279 field4327 = field4323;

    @OriginalMember(owner = "client!rm", name = "p", descriptor = "Lud;")
    public static class279 field4324 = class130.method1024("Wordpack geladen)3", 255);

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "I")
    public int field4313;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!rm", name = "j", descriptor = "I")
    public int field4318;

    @OriginalMember(owner = "client!rm", name = "l", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!rm", name = "n", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!rm", name = "r", descriptor = "I")
    public int field4326;

    @OriginalMember(owner = "client!rm", name = "q", descriptor = "J")
    public long field4325;

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "Lsf;")
    public class108 field4316;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V", line = 15)
    public static final void method1741(int arg0) {
        class289.field5152.method603((byte) 126);
        class100.field1866.method1516(124);
        class317.field5566.method1516(126);
        field4320++;
        if (arg0 != -13) {
            method1741(-32);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(BI)Lhb;", line = 30)
    public static final class35 method1742(byte arg0, int arg1) {
        field4310++;
        class35 var2 = (class35) class318.field5578.method1767((byte) -37, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class103.field1947.method1192(0, arg1, 0);
        if (var3 == null) {
            return null;
        }
        class35 var4 = new class35();
        class53 var5 = new class53(var3);
        var5.field1142 = var5.field1168.length - 2;
        int var6 = var5.method468(28214);
        int var7 = var5.field1168.length - (var6 + 2) - 12;
        var5.field1142 = var7;
        int var8 = var5.method453(1);
        var4.field795 = var5.method468(28214);
        var4.field801 = var5.method468(28214);
        var4.field798 = var5.method468(28214);
        var4.field787 = var5.method468(28214);
        int var9 = var5.method483(-116);
        if (var9 > 0) {
            var4.field789 = new class69[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method468(28214);
                class69 var12 = new class69(class189.method1440(1, var11));
                var4.field789[var10] = var12;
                while (var11-- > 0) {
                    int var13 = var5.method453(1);
                    int var14 = var5.method453(1);
                    var12.method612(false, new class91(var14), (long) var13);
                }
            }
        }
        var5.field1142 = 0;
        var4.field799 = var5.method447(-70);
        int var15 = -75 / ((-arg0 - 48) / 40);
        var4.field792 = new int[var8];
        var4.field803 = new class279[var8];
        var4.field794 = new int[var8];
        int var16 = 0;
        while (var7 > var5.field1142) {
            int var17 = var5.method468(28214);
            if (var17 == 3) {
                var4.field803[var16] = var5.method467((byte) -16);
            } else if (var17 >= 100 || var17 == 21 || var17 == 38 || var17 == 39) {
                var4.field794[var16] = var5.method483(-128);
            } else {
                var4.field794[var16] = var5.method453(1);
            }
            var4.field792[var16++] = var17;
        }
        class318.field5578.method1771(115, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)V", line = 152)
    public static void method1743(int arg0) {
        field4327 = null;
        if (arg0 != 25875) {
            return;
        }
        field4323 = null;
        field4311 = null;
        field4309 = null;
        field4312 = null;
        field4324 = null;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(II)Ltm;", line = 167)
    public static final class71 method1744(int arg0, int arg1) {
        field4314++;
        if (arg1 >= -28) {
            return (class71) null;
        } else if (arg0 == 0) {
            return new class302();
        } else if (arg0 == 1) {
            return new class223();
        } else if (arg0 == 2) {
            return new class250();
        } else if (arg0 == 3) {
            return new class87();
        } else if (arg0 == 4) {
            return new class287();
        } else if (arg0 == 5) {
            return new class179();
        } else if (arg0 == 6) {
            return new class174();
        } else if (arg0 == 7) {
            return new class229();
        } else if (arg0 == 8) {
            return new class138();
        } else if (arg0 == 9) {
            return new class110();
        } else if (arg0 == 10) {
            return new class257();
        } else if (arg0 == 11) {
            return new class14();
        } else if (arg0 == 12) {
            return new class155();
        } else if (arg0 == 13) {
            return new class117();
        } else if (arg0 == 14) {
            return new class183();
        } else if (arg0 == 15) {
            return new class100();
        } else if (arg0 == 16) {
            return new class189();
        } else if (arg0 == 17) {
            return new class290();
        } else if (arg0 == 18) {
            return new class294();
        } else if (arg0 == 19) {
            return new class73();
        } else if (arg0 == 20) {
            return new class173();
        } else if (arg0 == 21) {
            return new class301();
        } else if (arg0 == 22) {
            return new class209();
        } else if (arg0 == 23) {
            return new class198();
        } else if (arg0 == 24) {
            return new class286();
        } else if (arg0 == 25) {
            return new class150();
        } else if (arg0 == 26) {
            return new class21();
        } else if (arg0 == 27) {
            return new class74();
        } else if (arg0 == 28) {
            return new class92();
        } else if (arg0 == 29) {
            return new class161();
        } else if (arg0 == 30) {
            return new class293();
        } else if (arg0 == 31) {
            return new class54();
        } else if (arg0 == 32) {
            return new class218();
        } else if (arg0 == 33) {
            return new class298();
        } else if (arg0 == 34) {
            return new class214();
        } else if (arg0 == 35) {
            return new class326();
        } else if (arg0 == 36) {
            return new class11();
        } else if (arg0 == 37) {
            return new class105();
        } else if (arg0 == 38) {
            return new class202();
        } else if (arg0 == 39) {
            return new class253();
        } else {
            return null;
        }
    }
}
