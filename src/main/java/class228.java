import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class228 extends class280 {

    @OriginalMember(owner = "client!hc", name = "Ab", descriptor = "Lcf;")
    private static class93 field4077 = class147.method1066("Drop", -48);

    @OriginalMember(owner = "client!hc", name = "Kb", descriptor = "Lcf;")
    public static class93 field4087 = class147.method1066("(Y", -48);

    @OriginalMember(owner = "client!hc", name = "Nb", descriptor = "Lcf;")
    public static class93 field4090 = class147.method1066(" ", -48);

    @OriginalMember(owner = "client!hc", name = "Pb", descriptor = "I")
    public static int field4092 = 0;

    @OriginalMember(owner = "client!hc", name = "Qb", descriptor = "Lcf;")
    public static class93 field4093 = field4077;

    @OriginalMember(owner = "client!hc", name = "Mb", descriptor = "[Lcf;")
    public static class93[] field4089 = new class93[500];

    @OriginalMember(owner = "client!hc", name = "zb", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!hc", name = "Bb", descriptor = "I")
    private int field4078;

    @OriginalMember(owner = "client!hc", name = "Cb", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!hc", name = "Fb", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!hc", name = "Gb", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!hc", name = "Hb", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!hc", name = "Ib", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!hc", name = "Jb", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!hc", name = "Lb", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!hc", name = "Ob", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!hc", name = "Db", descriptor = "Ltg;")
    public static class181 field4080;

    @OriginalMember(owner = "client!hc", name = "Eb", descriptor = "Lrb;")
    private class267 field4081;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z[I)V")
    public final void method1564(boolean arg0, int[] arg1) {
        ++field4088;
        this.field4081 = new class267(arg1);
        if (arg0) {
            field4092 = -89;
        }
    }

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "(II)I")
    public final int method1565(int arg0, int arg1) {
        ++field4084;
        if (arg1 != -117336381) {
            this.method1568(-117, (byte) -127);
        }
        return arg0 * 8 + -this.field4078;
    }

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "(B)V")
    public static void method1566(byte arg0) {
        field4087 = null;
        field4077 = null;
        field4089 = null;
        field4090 = null;
        if (arg0 != -87) {
            method1567(122, true);
        }
        field4093 = null;
        field4080 = null;
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(IZ)V")
    public static final void method1567(int arg0, boolean arg1) {
        ++field4086;
        if (~arg0 != 0) {
            if (class146.method1062((byte) -103, arg0)) {
                if (arg1) {
                    field4080 = null;
                }
                class181[] var2 = class6.field82[arg0];
                for (int var3 = 0; var3 < var2.length; ++var3) {
                    class181 var4 = var2[var3];
                    if (var4.field3239 != null) {
                        class223 var5 = new class223();
                        var5.field4017 = var4;
                        var5.field4015 = var4.field3239;
                        class178.method1298(2000000, -6, var5);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(IB)V")
    public final void method1568(int arg0, byte arg1) {
        super.field5011[super.field5027++] = (byte) (arg0 + this.field4081.method1789(4));
        ++field4091;
        if (arg1 <= 48) {
            this.method1572(53);
        }
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(ZI)I")
    public final int method1569(boolean arg0, int arg1) {
        int var3 = 8 - (7 & this.field4078);
        int var4 = this.field4078 >> 3;
        this.field4078 += arg1;
        ++field4085;
        int var5 = 0;
        while (arg1 > var3) {
            var5 += (class128.field2252[var3] & super.field5011[var4++]) << -var3 + arg1;
            arg1 -= var3;
            var3 = 8;
        }
        int var6;
        if (arg1 == var3) {
            var6 = (class128.field2252[var3] & super.field5011[var4]) + var5;
        } else {
            var6 = (super.field5011[var4] >> var3 - arg1 & class128.field2252[arg1]) + var5;
        }
        if (arg0) {
            method1567(-124, false);
        }
        return var6;
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(I)V")
    public class228(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "(B)V")
    public final void method1570(byte arg0) {
        this.field4078 = super.field5027 * 8;
        if (arg0 < 50) {
            this.method1569(true, 93);
        }
        ++field4083;
    }

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "(I)V")
    public final void method1571(int arg0) {
        super.field5027 = (this.field4078 + 7) / 8;
        ++field4079;
        int var2 = 94 % ((45 - arg0) / 58);
    }

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "(I)I")
    public final int method1572(int arg0) {
        if (arg0 != 255) {
            this.method1564(false, (int[]) null);
        }
        ++field4076;
        return 255 & super.field5011[super.field5027++] - this.field4081.method1789(arg0 + -251);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B[BII)V")
    public final void method1573(byte arg0, byte[] arg1, int arg2, int arg3) {
        ++field4082;
        int var5 = 0;
        if (arg0 != 49) {
            this.method1565(-37, -110);
        }
        while (var5 < arg2) {
            arg1[var5 - -arg3] = (byte) (super.field5011[super.field5027++] + -this.field4081.method1789(4));
            ++var5;
        }
    }
}
