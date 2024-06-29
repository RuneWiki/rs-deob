import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class200 extends class14 {

    @OriginalMember(owner = "client!fa", name = "Db", descriptor = "[S")
    public static short[] field3489 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!fa", name = "Nb", descriptor = "Ljf;")
    public static class229 field3499 = class212.method1457((byte) 120, "Veuillez commencer par supprimer ");

    @OriginalMember(owner = "client!fa", name = "Kb", descriptor = "I")
    public static int field3496 = 0;

    @OriginalMember(owner = "client!fa", name = "Ob", descriptor = "I")
    public static int field3500 = 0;

    @OriginalMember(owner = "client!fa", name = "Sb", descriptor = "Ljf;")
    public static class229 field3504 = class212.method1457((byte) 74, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!fa", name = "Pb", descriptor = "I")
    public static int field3501 = 1;

    @OriginalMember(owner = "client!fa", name = "Tb", descriptor = "I")
    public static int field3505 = 0;

    @OriginalMember(owner = "client!fa", name = "Cb", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!fa", name = "Eb", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!fa", name = "Gb", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!fa", name = "Hb", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!fa", name = "Ib", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!fa", name = "Jb", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!fa", name = "Lb", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!fa", name = "Mb", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!fa", name = "Qb", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!fa", name = "Ub", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!fa", name = "Vb", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!fa", name = "Xb", descriptor = "I")
    private int field3509;

    @OriginalMember(owner = "client!fa", name = "Fb", descriptor = "Lek;")
    public static class185 field3491;

    @OriginalMember(owner = "client!fa", name = "Rb", descriptor = "Lek;")
    public static class185 field3503;

    @OriginalMember(owner = "client!fa", name = "Wb", descriptor = "Lta;")
    private class199 field3508;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "(I)I", line = 5)
    public final int method1394(int arg0) {
        field3502++;
        if (arg0 != 255) {
            this.method1402(88, (byte) 91, (byte[]) null, -89);
        }
        return this.field174[this.field195++] - this.field3508.method1391((byte) 41) & 0xFF;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILjf;)V", line = 16)
    public static final void method1395(int arg0, class229 arg1) {
        field3494++;
        class174.field3033 = arg1;
        if (class215.field3689.field3461 == null) {
            return;
        }
        int var2 = 87 % ((arg0 + 62) / 49);
        try {
            class229 var3 = class124.field2184.method1637(3743, class215.field3689.field3461);
            class229 var4 = class224.field3838.method1637(3743, class215.field3689.field3461);
            class229 var5 = class142.method989(new class229[] { var3, class268.field4593, arg1, class72.field1377, var4 }, -47);
            class229 var6;
            if (arg1.method1626(95) == 0) {
                var6 = class142.method989(new class229[] { var5, class212.field3644 }, -93);
            } else {
                var6 = class142.method989(new class229[] { var5, class220.field3769, class193.method1316((byte) 119, class153.method1032(109) + 94608000000L), class148.field2558, class205.method1434(1, 94608000L) }, -57);
            }
            class142.method989(new class229[] { class76.field1417, var6, class299.field5106 }, -89).method1605(89, class215.field3689.field3461);
        } catch (Throwable var8) {
        }
    }

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "(II)I", line = 48)
    public final int method1396(int arg0, int arg1) {
        field3488++;
        int var3 = this.field3509 >> 3;
        int var4 = 8 - (this.field3509 & 0x7);
        this.field3509 += arg0;
        int var5 = -15 % ((arg1 + 75) / 50);
        int var6 = 0;
        while (arg0 > var4) {
            var6 += (class175.field3059[var4] & this.field174[var3++]) << arg0 - var4;
            arg0 -= var4;
            var4 = 8;
        }
        int var7;
        if (arg0 == var4) {
            var7 = (this.field174[var3] & class175.field3059[var4]) + var6;
        } else {
            var7 = (this.field174[var3] >> var4 - arg0 & class175.field3059[arg0]) + var6;
        }
        return var7;
    }

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "(II)V", line = 80)
    public final void method1397(int arg0, int arg1) {
        field3497++;
        this.field174[this.field195++] = (byte) (arg0 + this.field3508.method1391((byte) 41));
        if (arg1 != 0) {
            field3505 = 67;
        }
    }

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "(I)V", line = 96)
    public final void method1398(int arg0) {
        this.field3509 = this.field195 * 8;
        field3506++;
        int var2 = -33 % ((arg0 + 49) / 61);
    }

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "(I)V", line = 111)
    public static void method1399(int arg0) {
        field3491 = null;
        field3504 = null;
        field3499 = null;
        field3489 = null;
        int var1 = 110 / ((-arg0 - 48) / 60);
        field3503 = null;
    }

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "(II)I", line = 126)
    public final int method1400(int arg0, int arg1) {
        field3492++;
        if (arg0 > -72) {
            this.method1396(-52, 21);
        }
        return arg1 * 8 - this.field3509;
    }

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "(I)V", line = 139)
    public final void method1401(int arg0) {
        this.field195 = (this.field3509 + arg0) / 8;
        field3493++;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IB[BI)V", line = 152)
    public final void method1402(int arg0, byte arg1, byte[] arg2, int arg3) {
        field3507++;
        if (arg1 == -114) {
            for (int var5 = 0; var5 < arg3; var5++) {
                arg2[arg0 + var5] = (byte) (this.field174[this.field195++] - this.field3508.method1391((byte) 41));
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(BI)I", line = 171)
    public static final int method1403(byte arg0, int arg1) {
        int var2 = 92 / ((arg0 + 14) / 48);
        field3495++;
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(I)V", line = 184)
    public class200(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B[I)V", line = 201)
    public final void method1404(byte arg0, int[] arg1) {
        this.field3508 = new class199(arg1);
        int var3 = -61 / ((arg0 - 28) / 38);
        field3490++;
    }

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "(II)Lmd;", line = 221)
    public static final class254 method1405(int arg0, int arg1) {
        class254 var2 = (class254) class50.field883.method643((long) arg0, arg1 ^ 0x9DB2B75B);
        if (arg1 != -9) {
            field3499 = (class229) null;
        }
        field3498++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class128.field2291.method1275(arg0, 11, -5211);
        class254 var4 = new class254();
        if (var3 != null) {
            var4.method1805(new class14(var3), (byte) -36);
        }
        class50.field883.method640(var4, (long) arg0, 24179);
        return var4;
    }
}
