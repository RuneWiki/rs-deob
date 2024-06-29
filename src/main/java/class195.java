import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class195 extends class200 {

    @OriginalMember(owner = "client!qh", name = "Hb", descriptor = "I")
    public static int field3489 = 0;

    @OriginalMember(owner = "client!qh", name = "Tb", descriptor = "I")
    public static int field3501 = 0;

    @OriginalMember(owner = "client!qh", name = "Pb", descriptor = "Lnh;")
    public static class53 field3497 = new class53(128);

    @OriginalMember(owner = "client!qh", name = "Ub", descriptor = "Luk;")
    public static class96 field3502 = new class96(64);

    @OriginalMember(owner = "client!qh", name = "Vb", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3503 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!qh", name = "Wb", descriptor = "Ljd;")
    public static class86 field3504 = class122.method868("Schrifts-=tze geladen)3", true);

    @OriginalMember(owner = "client!qh", name = "Yb", descriptor = "Z")
    public static boolean field3506 = false;

    @OriginalMember(owner = "client!qh", name = "Cb", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!qh", name = "Db", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!qh", name = "Eb", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!qh", name = "Fb", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!qh", name = "Gb", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!qh", name = "Ib", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!qh", name = "Jb", descriptor = "I")
    private int field3491;

    @OriginalMember(owner = "client!qh", name = "Lb", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!qh", name = "Mb", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!qh", name = "Nb", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!qh", name = "Ob", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!qh", name = "Qb", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!qh", name = "Rb", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!qh", name = "Sb", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!qh", name = "Xb", descriptor = "Lbj;")
    public static class151 field3505;

    @OriginalMember(owner = "client!qh", name = "Kb", descriptor = "Lme;")
    private class213 field3492;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "(II)I")
    public final int method1352(int arg0, int arg1) {
        int var3 = this.field3491 >> 3;
        int var4 = -13 % ((arg1 - -9) / 42);
        ++field3494;
        int var5 = -(this.field3491 & 7) + 8;
        int var6 = 0;
        this.field3491 += arg0;
        while (var5 < arg0) {
            var6 += (super.field3547[var3++] & class168.field3105[var5]) << -var5 + arg0;
            arg0 -= var5;
            var5 = 8;
        }
        int var7;
        if (~arg0 == ~var5) {
            var7 = (class168.field3105[var5] & super.field3547[var3]) + var6;
        } else {
            var7 = (super.field3547[var3] >> var5 - arg0 & class168.field3105[arg0]) + var6;
        }
        return var7;
    }

    @OriginalMember(owner = "client!qh", name = "v", descriptor = "(I)I")
    public final int method1353(int arg0) {
        if (arg0 != -16511) {
            this.method1353(4);
        }
        ++field3486;
        return super.field3547[super.field3565++] + -this.field3492.method1514((byte) 58) & 255;
    }

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "(IB)I")
    public final int method1354(int arg0, byte arg1) {
        int var3 = -112 % ((arg1 - -18) / 57);
        ++field3500;
        return arg0 * 8 + -this.field3491;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "([IB)V")
    public final void method1355(int[] arg0, byte arg1) {
        ++field3495;
        this.field3492 = new class213(arg0);
        if (arg1 != 84) {
            method1364((byte) -113, -6, -87);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IZ)V")
    public final void method1356(int arg0, boolean arg1) {
        ++field3484;
        if (arg1) {
            super.field3547[super.field3565++] = (byte) (arg0 + this.field3492.method1514((byte) 100));
        }
    }

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "(B)V")
    public static void method1357(byte arg0) {
        field3502 = null;
        field3504 = null;
        field3503 = null;
        field3505 = null;
        field3497 = null;
        int var1 = -84 / ((53 - arg0) / 37);
    }

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "(B)V")
    public final void method1358(byte arg0) {
        int var2 = 16 % ((arg0 - -66) / 59);
        this.field3491 = super.field3565 * 8;
        ++field3499;
    }

    @OriginalMember(owner = "client!qh", name = "w", descriptor = "(I)V")
    public final void method1359(int arg0) {
        super.field3565 = (this.field3491 + 7) / 8;
        ++field3488;
        if (arg0 <= 43) {
            field3505 = null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(I)V")
    public class195(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)I")
    public static final int method1360(int arg0, int arg1, int arg2) {
        ++field3498;
        if (arg1 == -1) {
            return 12345678;
        } else {
            int var3 = (127 & arg1) * arg2 >> 7;
            int var4 = -16 / ((arg0 - 12) / 54);
            if (~var3 <= -3) {
                if (var3 > 126) {
                    var3 = 126;
                }
            } else {
                var3 = 2;
            }
            return (arg1 & 65408) + var3;
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(III)V")
    public static final void method1361(int arg0, int arg1, int arg2) {
        class72.field1460[arg0] = arg2;
        if (arg1 != 19305) {
            method1357((byte) 20);
        }
        class92 var3 = (class92) class136.field2600.method1698((long) arg0, (byte) -42);
        ++field3487;
        if (var3 != null) {
            if (~var3.field1868 != -4611686018427387906L) {
                var3.field1868 = 4611686018427387904L | class253.method1711((byte) -43) - -500L;
                return;
            }
        } else {
            class92 var4 = new class92(4611686018427387905L);
            class136.field2600.method1699(arg1 + -47712, var4, (long) arg0);
        }
    }

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "(B)V")
    public static final void method1362(byte arg0) {
        ++field3496;
        int var1 = class202.field3642;
        int var2 = class112.field2144;
        int var3 = class127.field2462;
        int var4 = 6116423;
        int var5 = class108.field2080;
        class131.method927(var1, var2, var5, var3, var4);
        class131.method927(var1 - -1, var2 + 1, var5 + -2, 16, 0);
        if (arg0 < -83) {
            class131.method932(var1 + 1, var2 + 18, var5 - 2, var3 + -19, 0);
            class141.field2684.method1772(class198.field3524, var1 + 3, var2 - -14, var4, -1);
            int var6 = class6.field207;
            int var7 = class90.field1841;
            for (int var8 = 0; ~var8 > ~class16.field463; ++var8) {
                int var9 = var2 - -((-var8 + -1 + class16.field463) * 15) + 31;
                int var10 = 16777215;
                if (~var6 < ~var1 && var1 + var5 > var6 && ~var7 < ~(var9 + -13) && ~(var9 + 3) < ~var7) {
                    var10 = 16776960;
                }
                class141.field2684.method1772(class127.method896(12307, var8), var1 + 3, var9, var10, 0);
            }
            class134.method961(class108.field2080, 0, class127.field2462, class202.field3642, class112.field2144);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IBI[B)V")
    public final void method1363(int arg0, byte arg1, int arg2, byte[] arg3) {
        int var5 = -88 % ((-53 - arg1) / 42);
        for (int var6 = 0; ~arg0 < ~var6; ++var6) {
            arg3[arg2 + var6] = (byte) (super.field3547[super.field3565++] + -this.field3492.method1514((byte) 19));
        }
        ++field3485;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BII)V")
    public static final void method1364(byte arg0, int arg1, int arg2) {
        ++field3493;
        class77 var3 = class273.method1858((byte) 14, arg2);
        int var4 = var3.field1525;
        int var5 = var3.field1529;
        int var6 = var3.field1522;
        int var7 = class275.field4820[var6 - var5];
        if (arg1 < 0 || ~var7 > ~arg1) {
            arg1 = 0;
        }
        if (arg0 > -33) {
            method1360(-27, -43, 118);
        }
        int var8 = var7 << var5;
        method1361(var4, 19305, var8 & arg1 << var5 | ~var8 & class72.field1460[var4]);
    }
}
