import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pfa")
public class class295 {

    @OriginalMember(owner = "client!pfa", name = "o", descriptor = "I")
    private int field3639 = 0;

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "I")
    public int field3625;

    @OriginalMember(owner = "client!pfa", name = "m", descriptor = "[Lmc;")
    public class134[] field3637;

    @OriginalMember(owner = "client!pfa", name = "c", descriptor = "I")
    public static int field3627 = -1;

    @OriginalMember(owner = "client!pfa", name = "b", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!pfa", name = "d", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!pfa", name = "f", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!pfa", name = "g", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!pfa", name = "i", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!pfa", name = "j", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!pfa", name = "k", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!pfa", name = "l", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!pfa", name = "n", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!pfa", name = "q", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!pfa", name = "h", descriptor = "J")
    private long field3632;

    @OriginalMember(owner = "client!pfa", name = "e", descriptor = "Lmc;")
    private class134 field3629;

    @OriginalMember(owner = "client!pfa", name = "p", descriptor = "Lmc;")
    private class134 field3640;

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "([Lmc;I)I", line = 7)
    public final int method1750(class134[] arg0, int arg1) {
        field3633++;
        int var3 = arg1;
        for (int var4 = 0; var4 < this.field3625; var4++) {
            class134 var5 = this.field3637[var4];
            for (class134 var6 = var5.field1521; var6 != var5; var6 = var6.field1521) {
                arg0[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Lmc;IJ)V", line = 35)
    public final void method1751(class134 arg0, int arg1, long arg2) {
        field3634++;
        if (arg1 != 3970) {
            this.field3640 = null;
        }
        if (arg0.field1520 != null) {
            arg0.method864(12983);
        }
        class134 var5 = this.field3637[(int) ((long) (this.field3625 - 1) & arg2)];
        arg0.field1520 = var5.field1520;
        arg0.field1521 = var5;
        arg0.field1520.field1521 = arg0;
        arg0.field1522 = arg2;
        arg0.field1521.field1520 = arg0;
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(I)I", line = 65)
    public final int method1752(int arg0) {
        field3635++;
        int var2 = arg0;
        for (int var3 = 0; var3 < this.field3625; var3++) {
            class134 var4 = this.field3637[var3];
            for (class134 var5 = var4.field1521; var5 != var4; var5 = var5.field1521) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!pfa", name = "b", descriptor = "(I)Lmc;", line = 93)
    public final class134 method1753(int arg0) {
        field3631++;
        this.field3639 = arg0;
        return this.method1755(-76);
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(ZJ)Lmc;", line = 102)
    public final class134 method1754(boolean arg0, long arg1) {
        field3630++;
        this.field3632 = arg1;
        if (arg0) {
            this.method1759(60);
        }
        class134 var4 = this.field3637[(int) (arg1 & (long) (this.field3625 - 1))];
        for (this.field3629 = var4.field1521; this.field3629 != var4; this.field3629 = this.field3629.field1521) {
            if (this.field3629.field1522 == arg1) {
                class134 var5 = this.field3629;
                this.field3629 = this.field3629.field1521;
                return var5;
            }
        }
        this.field3629 = null;
        return null;
    }

    @OriginalMember(owner = "client!pfa", name = "c", descriptor = "(I)Lmc;", line = 134)
    public final class134 method1755(int arg0) {
        field3638++;
        if (this.field3639 > 0 && this.field3637[this.field3639 - 1] != this.field3640) {
            class134 var2 = this.field3640;
            this.field3640 = var2.field1521;
            return var2;
        }
        while (this.field3639 < this.field3625) {
            class134 var3 = this.field3637[this.field3639++].field1521;
            if (this.field3637[this.field3639 - 1] != var3) {
                this.field3640 = var3.field1521;
                return var3;
            }
        }
        if (arg0 >= -41) {
            field3627 = -58;
        }
        return null;
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(ZBLjava/lang/String;)V", line = 171)
    public static final void method1756(boolean arg0, byte arg1, String arg2) {
        field3628++;
        if (arg2 == null) {
            return;
        }
        if (class293.field3610 >= 100) {
            class490.method2948((byte) -55, class486.field6943.method2936(class489.field6978, -53), 4);
            return;
        }
        String var3 = class102.method708(arg2, -21413);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class293.field3610; var4++) {
            String var9 = class102.method708(class178.field2089[var4], -21413);
            if (var9 != null && var9.equals(var3)) {
                class490.method2948((byte) -55, arg2 + class486.field6944.method2936(class489.field6978, -102), 4);
                return;
            }
            if (class484.field6891[var4] != null) {
                String var10 = class102.method708(class484.field6891[var4], -21413);
                if (var10 != null && var10.equals(var3)) {
                    class490.method2948((byte) -55, arg2 + class486.field6944.method2936(class489.field6978, -95), 4);
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class752.field10524; var5++) {
            String var7 = class102.method708(class19.field175[var5], -21413);
            if (var7 != null && var7.equals(var3)) {
                class490.method2948((byte) -55, class486.field6949.method2936(class489.field6978, -73) + arg2 + class486.field6950.method2936(class489.field6978, -90), 4);
                return;
            }
            if (class161.field1799[var5] != null) {
                String var8 = class102.method708(class161.field1799[var5], -21413);
                if (var8 != null && var8.equals(var3)) {
                    class490.method2948((byte) -55, class486.field6949.method2936(class489.field6978, 106) + arg2 + class486.field6950.method2936(class489.field6978, -56), 4);
                    return;
                }
            }
        }
        if (arg1 <= 115) {
            method1756(true, (byte) -14, null);
        }
        if (class102.method708(class90.field937.field2157, -21413).equals(var3)) {
            class490.method2948((byte) -55, class486.field6946.method2936(class489.field6978, -76), 4);
            return;
        }
        class22.field205++;
        class249 var6 = class289.method1715(class314.field3918, 59, class41.field470);
        var6.field3016.method1460(class729.method4063(-1, arg2) + 1, 24710);
        var6.field3016.method1480(arg2, false);
        var6.field3016.method1460(arg0 ? 1 : 0, 24710);
        class510.method3017(var6, 108);
    }

    @OriginalMember(owner = "client!pfa", name = "d", descriptor = "(I)I", line = 269)
    public final int method1757(int arg0) {
        field3626++;
        int var2 = -23 % ((arg0 - 66) / 45);
        return this.field3625;
    }

    @OriginalMember(owner = "client!pfa", name = "e", descriptor = "(I)V", line = 279)
    public final void method1758(int arg0) {
        field3641++;
        for (int var2 = 0; var2 < this.field3625; var2++) {
            class134 var4 = this.field3637[var2];
            while (true) {
                class134 var5 = var4.field1521;
                if (var4 == var5) {
                    break;
                }
                var5.method864(12983);
            }
        }
        this.field3640 = null;
        int var3 = -118 / ((arg0 - 62) / 58);
        this.field3629 = null;
    }

    @OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "(I)V", line = 312)
    public class295(int arg0) {
        this.field3625 = arg0;
        this.field3637 = new class134[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class134 var3 = this.field3637[var2] = new class134();
            var3.field1521 = var3;
            var3.field1520 = var3;
        }
    }

    @OriginalMember(owner = "client!pfa", name = "f", descriptor = "(I)Lmc;", line = 333)
    public final class134 method1759(int arg0) {
        field3636++;
        if (this.field3629 == null) {
            return null;
        }
        class134 var2 = this.field3637[(int) (this.field3632 & (long) (this.field3625 + arg0))];
        while (this.field3629 != var2) {
            if (this.field3629.field1522 == this.field3632) {
                class134 var3 = this.field3629;
                this.field3629 = this.field3629.field1521;
                return var3;
            }
            this.field3629 = this.field3629.field1521;
        }
        this.field3629 = null;
        return null;
    }
}
