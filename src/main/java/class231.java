import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class231 {

    @OriginalMember(owner = "client!df", name = "v", descriptor = "I")
    private int field4120 = 0;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    private int field4102;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "[Lnf;")
    private class130[] field4106;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "Lqj;")
    public static class196 field4101 = class80.method502("cookiehost", -48);

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public static int field4107 = 0;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "Lqj;")
    public static class196 field4112 = class80.method502("(Y", -48);

    @OriginalMember(owner = "client!df", name = "m", descriptor = "[I")
    public static int[] field4111 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!df", name = "u", descriptor = "Lqj;")
    public static class196 field4119 = class80.method502("<col=ff7000>", -48);

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!df", name = "q", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!df", name = "r", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "J")
    private long field4118;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "Lnf;")
    private class130 field4099;

    @OriginalMember(owner = "client!df", name = "w", descriptor = "Lnf;")
    private class130 field4121;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "[Loa;")
    public static class8[] field4103;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
    public final void method1545(int arg0) {
        for (int var2 = arg0; var2 < this.field4102; var2++) {
            class130 var3 = this.field4106[var2];
            while (true) {
                class130 var4 = var3.field1842;
                if (var3 == var4) {
                    break;
                }
                var4.method797((byte) 127);
            }
        }
        this.field4099 = null;
        this.field4121 = null;
        field4104++;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lkf;I)V")
    public static final void method1546(class234 arg0, int arg1) {
        field4115++;
        int var2 = -1;
        long var3 = 0L;
        if (arg0.field4157 == 0) {
            var3 = class63.method399(arg0.field4155, arg0.field4153, arg0.field4152);
        }
        if (arg0.field4157 == 1) {
            var3 = class67.method433(arg0.field4155, arg0.field4153, arg0.field4152);
        }
        int var5 = 0;
        if (arg0.field4157 == 2) {
            var3 = class45.method241(arg0.field4155, arg0.field4153, arg0.field4152);
        }
        int var6 = 0;
        if (arg0.field4157 == 3) {
            var3 = class197.method1339(arg0.field4155, arg0.field4153, arg0.field4152);
        }
        if (var3 != 0L) {
            var5 = (int) var3 >> 20 & 0x3;
            var6 = (int) var3 >> 14 & 0x1F;
            var2 = Integer.MAX_VALUE & (int) (var3 >>> 32);
        }
        arg0.field4165 = var2;
        arg0.field4156 = var6;
        int var7 = -44 % ((28 - arg1) / 62);
        arg0.field4163 = var5;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)Lnf;")
    public final class130 method1547(int arg0) {
        if (arg0 != 342) {
            this.method1545(-128);
        }
        field4100++;
        if (this.field4120 > 0 && this.field4106[this.field4120 - 1] != this.field4121) {
            class130 var2 = this.field4121;
            this.field4121 = var2.field1842;
            return var2;
        }
        while (this.field4102 > this.field4120) {
            class130 var3 = this.field4106[this.field4120++].field1842;
            if (this.field4106[this.field4120 - 1] != var3) {
                this.field4121 = var3.field1842;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)V")
    public static final void method1548(boolean arg0) {
        if (arg0) {
            method1546(null, 65);
        }
        field4105++;
        for (int var1 = 0; var1 < class148.field2336; var1++) {
            int var2 = class104.field1507[var1];
            class134 var3 = class247.field4397[var2];
            int var4 = class229.field4077.method367(1);
            if ((var4 & 0x8) != 0) {
                var4 += class229.field4077.method367(1) << 8;
            }
            class201.method1353(106, var2, var4, var3);
        }
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(I)V")
    public static final void method1549(int arg0) {
        class18.field216 &= 0x7FF;
        field4109++;
        int var1 = class87.field1282 >> 7;
        if (class194.field3417 < 128) {
            class194.field3417 = 128;
        }
        if (class194.field3417 > 383) {
            class194.field3417 = 383;
        }
        int var2 = class48.field577 >> 7;
        int var3 = 0;
        int var4 = class74.method470(class48.field577, class27.field335, 103, class87.field1282);
        if (arg0 < var1 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class27.field335;
                    if (var7 < 3 && (class88.field1300[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = var4 - class42.field480[var7][var5][var6];
                    if (var3 < var8) {
                        var3 = var8;
                    }
                }
            }
        }
        int var9 = var3 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (var9 > class96.field1414) {
            class96.field1414 += (var9 - class96.field1414) / 24;
        } else if (class96.field1414 > var9) {
            class96.field1414 += (var9 - class96.field1414) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(I)V")
    public static void method1550(int arg0) {
        field4101 = null;
        field4103 = null;
        field4111 = null;
        field4112 = null;
        field4119 = null;
        int var1 = 49 % ((3 - arg0) / 61);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IJ)Lnf;")
    public final class130 method1551(int arg0, long arg1) {
        field4116++;
        this.field4118 = arg1;
        class130 var4 = this.field4106[(int) ((long) (this.field4102 - 1) & arg1)];
        if (arg0 != 32768) {
            this.field4121 = null;
        }
        for (this.field4099 = var4.field1842; this.field4099 != var4; this.field4099 = this.field4099.field1842) {
            if (this.field4099.field1850 == arg1) {
                class130 var5 = this.field4099;
                this.field4099 = this.field4099.field1842;
                return var5;
            }
        }
        this.field4099 = null;
        return null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lnf;JI)V")
    public final void method1552(class130 arg0, long arg1, int arg2) {
        field4114++;
        if (arg0.field1849 != null) {
            arg0.method797((byte) 125);
        }
        class130 var5 = this.field4106[(int) ((long) (this.field4102 - 1) & arg1)];
        if (arg2 != 0) {
            method1553((byte) -4, null);
        }
        arg0.field1842 = var5;
        arg0.field1849 = var5.field1849;
        arg0.field1849.field1842 = arg0;
        arg0.field1850 = arg1;
        arg0.field1842.field1849 = arg0;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BLec;)V")
    public static final void method1553(byte arg0, class178 arg1) {
        field4113++;
        class178 var2 = class156.method988(arg1, (byte) -12);
        int var3;
        int var4;
        if (var2 == null) {
            var4 = class249.field4407;
            var3 = class61.field815;
        } else {
            var3 = var2.field2997;
            var4 = var2.field3085;
        }
        class101.method611(arg1, -116, var4, var3, false);
        class164.method1033(arg1, var3, -2, var4);
        if (arg0 != 51) {
            method1550(-51);
        }
    }

    @OriginalMember(owner = "client!df", name = "e", descriptor = "(I)Lnf;")
    public final class130 method1554(int arg0) {
        if (arg0 != 6539) {
            field4107 = -21;
        }
        this.field4120 = 0;
        field4108++;
        return this.method1547(342);
    }

    @OriginalMember(owner = "client!df", name = "f", descriptor = "(I)Lnf;")
    public final class130 method1555(int arg0) {
        if (arg0 > -1) {
            field4110 = -25;
        }
        field4117++;
        if (this.field4099 == null) {
            return null;
        }
        class130 var2 = this.field4106[(int) (this.field4118 & (long) (this.field4102 - 1))];
        while (this.field4099 != var2) {
            if (this.field4099.field1850 == this.field4118) {
                class130 var3 = this.field4099;
                this.field4099 = this.field4099.field1842;
                return var3;
            }
            this.field4099 = this.field4099.field1842;
        }
        this.field4099 = null;
        return null;
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(I)V")
    public class231(int arg0) {
        this.field4102 = arg0;
        this.field4106 = new class130[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class130 var3 = this.field4106[var2] = new class130();
            var3.field1849 = var3;
            var3.field1842 = var3;
        }
    }
}
