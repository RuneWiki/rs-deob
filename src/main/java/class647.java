import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class647 extends class268 {

    @OriginalMember(owner = "client!tl", name = "w", descriptor = "I")
    private int field8983;

    @OriginalMember(owner = "client!tl", name = "G", descriptor = "I")
    private int field8993;

    @OriginalMember(owner = "client!tl", name = "z", descriptor = "I")
    private int field8986;

    @OriginalMember(owner = "client!tl", name = "I", descriptor = "I")
    private int field8995;

    @OriginalMember(owner = "client!tl", name = "v", descriptor = "Lfb;")
    public static class704 field8982 = new class704();

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "I")
    private int field8977;

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "I")
    public static int field8978;

    @OriginalMember(owner = "client!tl", name = "s", descriptor = "I")
    private int field8979;

    @OriginalMember(owner = "client!tl", name = "t", descriptor = "I")
    public static int field8980;

    @OriginalMember(owner = "client!tl", name = "u", descriptor = "I")
    public static int field8981;

    @OriginalMember(owner = "client!tl", name = "y", descriptor = "I")
    public static int field8985;

    @OriginalMember(owner = "client!tl", name = "A", descriptor = "I")
    private int field8987;

    @OriginalMember(owner = "client!tl", name = "B", descriptor = "I")
    public static int field8988;

    @OriginalMember(owner = "client!tl", name = "C", descriptor = "I")
    public static int field8989;

    @OriginalMember(owner = "client!tl", name = "D", descriptor = "I")
    private int field8990;

    @OriginalMember(owner = "client!tl", name = "F", descriptor = "I")
    public static int field8992;

    @OriginalMember(owner = "client!tl", name = "H", descriptor = "I")
    public static int field8994;

    @OriginalMember(owner = "client!tl", name = "x", descriptor = "Ltv;")
    public static class587 field8984;

    @OriginalMember(owner = "client!tl", name = "E", descriptor = "[B")
    private byte[] field8991;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(III)V")
    public final void method820(int arg0, int arg1, int arg2) {
        field8980++;
        if (arg0 == arg2) {
            this.field8979 = this.field8983 - (arg1 >= 0 ? arg1 : -arg1);
            this.field8979 = this.field8979 * this.field8979 >> 12;
            this.field8987 = 4096;
            this.field8977 = this.field8979;
            return;
        }
        this.field8987 = this.field8993 * this.field8979 >> 12;
        this.field8979 = this.field8983 - (arg1 < 0 ? -arg1 : arg1);
        if (this.field8987 < 0) {
            this.field8987 = 0;
        } else if (this.field8987 > 4096) {
            this.field8987 = 4096;
        }
        this.field8979 = this.field8979 * this.field8979 >> 12;
        this.field8979 = this.field8987 * this.field8979 >> 12;
        this.field8977 += this.field8995 * this.field8979 >> 12;
        this.field8995 = this.field8995 * this.field8986 >> 12;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "([Lwea;II)V")
    public static final void method3614(class167[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class167 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field2253;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field2253 < (var7 & 0x1) + var6) {
                class167 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method3614(arg0, arg1, var4 - 1);
        method3614(arg0, var4 + 1, arg2);
    }

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "(I)V")
    public static void method3615(int arg0) {
        if (arg0 != 255) {
            field8988 = 35;
        }
        field8984 = null;
        field8982 = null;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZIB)V")
    public void method2278(boolean arg0, int arg1, byte arg2) {
        this.field8991[arg1] = arg2;
        field8989++;
        if (!arg0) {
            field8988 = -30;
        }
    }

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "(I)V")
    public static final void method3616(int arg0) {
        for (class381 var1 = (class381) class735.field10181.method111((byte) -7); var1 != null; var1 = (class381) class735.field10181.method111((byte) -7)) {
            class569.method3189(var1, 56);
        }
        field8994++;
        int var2;
        int var3;
        if (class712.field9959.field1320.method4251(60) == 1) {
            var2 = 3;
            var3 = 0;
        } else {
            var2 = class387.field5634;
            var3 = class387.field5634;
        }
        client.method2006();
        for (int var4 = var3; var4 <= var2; var4++) {
            client.method2009();
            client.method2017(var4);
            client.method2011(var4);
        }
        if (arg0 != 0) {
            field8982 = null;
        }
        client.method2016();
        client.method2020();
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIB)Z")
    public static final boolean method3617(int arg0, int arg1, byte arg2) {
        field8985++;
        if (!class51.method375(arg0, false, arg1)) {
            return false;
        } else if (class648.method3622((byte) -29, arg0, arg1) | (arg0 & 0x9000) != 0 | class509.method2953(-1, arg1, arg0)) {
            return true;
        } else if (arg2 == -49) {
            return (arg1 & 0x37) == 0 & (class27.method204((byte) -84, arg0, arg1) | (arg0 & 0x2000) != 0 | class543.method3095(arg0, arg1, true));
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(IIIIIFFF)V")
    public class647(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field8983 = (int) (arg6 * 4096.0F);
        this.field8993 = (int) (arg7 * 4096.0F);
        this.field8995 = this.field8986 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IILwp;Lpu;Lwc;III)V")
    public static final void method3618(int arg0, int arg1, class192 arg2, class589 arg3, class73 arg4, int arg5, int arg6, int arg7) {
        field8978++;
        if (arg6 >= -101) {
            field8988 = -11;
        }
        class39 var8 = new class39();
        var8.field627 = arg0 << 9;
        var8.field612 = arg1 << 9;
        var8.field618 = arg7;
        if (arg3 != null) {
            var8.field593 = arg3;
            int var9 = arg3.field7940;
            int var10 = arg3.field7943;
            if (arg5 == 1 || arg5 == 3) {
                var9 = arg3.field7943;
                var10 = arg3.field7940;
            }
            var8.field617 = arg3.field7945 << 9;
            var8.field626 = arg3.field7922;
            var8.field597 = arg1 + var10 << 9;
            var8.field607 = arg3.field7883 << 9;
            var8.field594 = arg3.field7900;
            var8.field613 = arg3.field7917;
            var8.field592 = arg3.field7918;
            var8.field603 = arg3.field7926;
            var8.field608 = arg3.field7921;
            var8.field604 = arg0 + var9 << 9;
            var8.field620 = arg3.field7916;
            var8.field602 = arg3.field7902;
            var8.field595 = arg3.field7882;
            if (arg3.field7865 != null) {
                var8.field624 = true;
                var8.method274((byte) 31);
            }
            if (var8.field620 != null) {
                var8.field599 = (int) (Math.random() * (double) (var8.field602 - var8.field626)) + var8.field626;
            }
            class255.field3809.method2545(-128, var8);
        } else if (arg2 != null) {
            var8.field619 = arg2;
            class220 var11 = arg2.field2577;
            if (var11.field2995 != null) {
                var8.field624 = true;
                var11 = var11.method1449(class382.field5602, -1);
            }
            if (var11 != null) {
                var8.field597 = var11.field2960 + arg1 << 9;
                var8.field604 = var11.field2960 + arg0 << 9;
                var8.field592 = class467.method2759(arg2, -98);
                var8.field607 = var11.field2978 << 9;
                var8.field617 = var11.field2962 << 9;
                var8.field613 = var11.field2976;
                var8.field594 = var11.field2946;
                var8.field608 = var11.field2950;
                var8.field595 = var11.field2985;
            }
            class573.field7696.method2545(-126, var8);
        } else if (arg4 != null) {
            var8.field610 = arg4;
            var8.field604 = arg4.method655(-128) + arg0 << 9;
            var8.field597 = arg4.method655(-125) + arg1 << 9;
            var8.field592 = class720.method4019((byte) -109, arg4);
            var8.field617 = arg4.field1062 << 9;
            var8.field595 = arg4.field1053;
            var8.field608 = 256;
            var8.field594 = arg4.field1077;
            var8.field613 = 256;
            var8.field607 = 0;
            class680.field9518.method3962((long) arg4.field1812, var8, -125);
        }
    }

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "(I)V")
    public final void method817(int arg0) {
        field8992++;
        if (arg0 != 29373) {
            this.field8990 = -63;
        }
        this.field8977 = 0;
        this.field8990 = 0;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)V")
    public final void method816(int arg0) {
        this.field8977 >>= 0x4;
        field8981++;
        this.field8995 = this.field8986;
        if (this.field8977 < 0) {
            this.field8977 = 0;
        } else if (this.field8977 > 255) {
            this.field8977 = 255;
        }
        this.method2278(true, this.field8990++, (byte) this.field8977);
        this.field8977 = 0;
        if (arg0 != 1029024876) {
            field8984 = null;
        }
    }
}
