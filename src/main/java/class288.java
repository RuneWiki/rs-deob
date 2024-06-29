import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class288 {

    @OriginalMember(owner = "client!va", name = "w", descriptor = "I")
    private int field4046 = 0;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "[Lqf;")
    public class406[] field4030;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "I")
    public int field4025;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "[Ldi;")
    public static class64[] field4028 = new class64[14];

    @OriginalMember(owner = "client!va", name = "a", descriptor = "Lva;")
    public static class288 field4024 = new class288(8);

    @OriginalMember(owner = "client!va", name = "x", descriptor = "[I")
    public static int[] field4047 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!va", name = "u", descriptor = "[Z")
    public static boolean[] field4044 = new boolean[100];

    @OriginalMember(owner = "client!va", name = "t", descriptor = "F")
    public static float field4043;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!va", name = "p", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!va", name = "q", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!va", name = "r", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!va", name = "s", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!va", name = "y", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "J")
    private long field4035;

    @OriginalMember(owner = "client!va", name = "v", descriptor = "Ltq;")
    public static class376 field4045;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "Lqf;")
    private class406 field4031;

    @OriginalMember(owner = "client!va", name = "z", descriptor = "Lqf;")
    private class406 field4049;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BJ)V", line = 4)
    public static final void method1878(byte arg0, long arg1) {
        field4036++;
        if (class250.field3570 != null) {
            if (class129.field1568 == 1 || class129.field1568 == 5) {
                class225.method1501(arg1, 65);
            } else if (class129.field1568 == 4) {
                class435.method2727(-11681, arg1);
            }
        }
        class89.method493((long) class189.field2726, (byte) -96, class151.field1873);
        if (class248.field3548 != -1) {
            class99.method552(class248.field3548, (byte) 88);
        }
        for (int var3 = 0; var3 < class421.field6017; var3++) {
            if (class394.field5556[var3]) {
                class418.field5974[var3] = true;
            }
            class181.field2475[var3] = class394.field5556[var3];
            class394.field5556[var3] = false;
        }
        class244.field3460 = class189.field2726;
        if (class151.field1873.method609()) {
            class285.field4003 = true;
        }
        if (class248.field3548 != -1) {
            class421.field6017 = 0;
            class450.method2788((byte) 118);
        }
        class151.field1873.method624();
        class278.method1833((byte) -96, class151.field1873);
        int var4 = class68.method385(81);
        if (var4 == -1) {
            var4 = class360.field5145;
        }
        class404.method2579(-1, var4);
        class14.method101(class384.field5422.field3284, class384.field5422.field3269, class34.field392, true, class129.field1570);
        class34.field392 = 0;
        int var5 = -29 % ((49 - arg0) / 34);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B[II)V", line = 67)
    public static final void method1879(byte arg0, int[] arg1, int arg2) {
        for (int var3 = 31; var3 > 0; var3--) {
            int var4 = var3 * 36;
            for (int var5 = 35; var5 > 0; var5--) {
                if (arg1[var4 + var5] == 0 && arg1[var4 + var5 - 37] != 0) {
                    arg1[var4 + var5] = arg2;
                }
            }
        }
        if (arg0 <= 9) {
            method1891(false, (byte) 60);
        }
        field4033++;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)I", line = 99)
    public final int method1880(byte arg0) {
        if (arg0 == -122) {
            field4026++;
            return this.field4025;
        } else {
            return -22;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZI)Z", line = 114)
    public static final boolean method1881(boolean arg0, int arg1) {
        if (arg1 != -13981) {
            method1885(-70L, -74);
        }
        field4027++;
        boolean var2 = class151.field1873.method647();
        if (arg0 == var2) {
            return true;
        }
        if (!arg0) {
            class151.field1873.method634();
        } else if (!class151.field1873.method667()) {
            arg0 = false;
        }
        if (arg0 == var2) {
            return false;
        } else {
            class212.field3020 = arg0;
            class278.method1834(class14.field185, (byte) 125);
            return true;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B[Lqf;)I", line = 162)
    public final int method1882(byte arg0, class406[] arg1) {
        field4037++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field4025; var4++) {
            class406 var5 = this.field4030[var4];
            for (class406 var6 = var5.field5862; var6 != var5; var6 = var6.field5862) {
                arg1[var3++] = var6;
            }
        }
        if (arg0 != -109) {
            this.field4030 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)Lqf;", line = 195)
    public final class406 method1883(int arg0) {
        field4032++;
        if (this.field4031 == null) {
            return null;
        }
        class406 var2 = this.field4030[(int) ((long) (this.field4025 - 1) & this.field4035)];
        while (this.field4031 != var2) {
            if (this.field4031.field5855 == this.field4035) {
                class406 var3 = this.field4031;
                this.field4031 = this.field4031.field5862;
                return var3;
            }
            this.field4031 = this.field4031.field5862;
        }
        this.field4031 = null;
        if (arg0 != -22097) {
            this.method1880((byte) 87);
        }
        return null;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)Lqf;", line = 227)
    public final class406 method1884(int arg0) {
        this.field4046 = arg0;
        field4040++;
        return this.method1890(arg0 - 1);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 243)
    public static final String method1885(long arg0, int arg1) {
        field4034++;
        class192.field2756.setTime(new Date(arg0));
        int var3 = class192.field2756.get(7);
        int var4 = class192.field2756.get(5);
        if (arg1 != -1) {
            field4044 = null;
        }
        int var5 = class192.field2756.get(2);
        int var6 = class192.field2756.get(1);
        int var7 = class192.field2756.get(11);
        int var8 = class192.field2756.get(12);
        int var9 = class192.field2756.get(13);
        return class135.field1690[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class161.field2138[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lqf;JI)V", line = 269)
    public final void method1886(class406 arg0, long arg1, int arg2) {
        field4042++;
        if (arg0.field5854 != null) {
            arg0.method2594((byte) -22);
        }
        class406 var5 = this.field4030[(int) (arg1 & (long) (this.field4025 - arg2))];
        arg0.field5862 = var5;
        arg0.field5854 = var5.field5854;
        arg0.field5854.field5862 = arg0;
        arg0.field5862.field5854 = arg0;
        arg0.field5855 = arg1;
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(I)V", line = 287)
    public final void method1887(int arg0) {
        field4039++;
        for (int var2 = 0; var2 < this.field4025; var2++) {
            class406 var3 = this.field4030[var2];
            while (true) {
                class406 var4 = var3.field5862;
                if (var3 == var4) {
                    break;
                }
                var4.method2594((byte) -22);
            }
        }
        if (arg0 >= -77) {
            this.method1892(false);
        }
        this.field4031 = null;
        this.field4049 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(JB)Lqf;", line = 321)
    public final class406 method1888(long arg0, byte arg1) {
        if (arg1 != -30) {
            return null;
        }
        field4041++;
        this.field4035 = arg0;
        class406 var4 = this.field4030[(int) (arg0 & (long) (this.field4025 - 1))];
        for (this.field4031 = var4.field5862; this.field4031 != var4; this.field4031 = this.field4031.field5862) {
            if (this.field4031.field5855 == arg0) {
                class406 var5 = this.field4031;
                this.field4031 = this.field4031.field5862;
                return var5;
            }
        }
        this.field4031 = null;
        return null;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(B)V", line = 351)
    public static void method1889(byte arg0) {
        field4045 = null;
        field4028 = null;
        field4044 = null;
        field4024 = null;
        field4047 = null;
        if (arg0 != 69) {
            field4024 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(I)Lqf;", line = 368)
    public final class406 method1890(int arg0) {
        field4029++;
        if (arg0 != -1) {
            this.method1887(-105);
        }
        if (this.field4046 > 0 && this.field4030[this.field4046 - 1] != this.field4049) {
            class406 var2 = this.field4049;
            this.field4049 = var2.field5862;
            return var2;
        }
        while (this.field4046 < this.field4025) {
            class406 var3 = this.field4030[this.field4046++].field5862;
            if (this.field4030[this.field4046 - 1] != var3) {
                this.field4049 = var3.field5862;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZB)V", line = 400)
    public static final void method1891(boolean arg0, byte arg1) {
        field4038++;
        if (arg0 == class392.field5537) {
            return;
        }
        class392.field5537 = arg0;
        if (arg1 != 106) {
            method1889((byte) -68);
        }
        class99.method553(arg1 ^ 0xFFFFC98F);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)I", line = 416)
    public final int method1892(boolean arg0) {
        if (arg0) {
            return 50;
        }
        field4048++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field4025; var3++) {
            class406 var4 = this.field4030[var3];
            for (class406 var5 = var4.field5862; var5 != var4; var5 = var5.field5862) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(I)V", line = 453)
    public class288(int arg0) {
        this.field4030 = new class406[arg0];
        this.field4025 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class406 var3 = this.field4030[var2] = new class406();
            var3.field5854 = var3;
            var3.field5862 = var3;
        }
    }
}
