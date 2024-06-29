import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class80 extends class85 {

    @OriginalMember(owner = "client!bj", name = "Rb", descriptor = "Lda;")
    public static class275 field1321 = class255.method1672(107, ":chalreq:");

    @OriginalMember(owner = "client!bj", name = "Fb", descriptor = "Lda;")
    public static class275 field1309 = class255.method1672(112, "headicons_pk");

    @OriginalMember(owner = "client!bj", name = "Cb", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!bj", name = "Db", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!bj", name = "Eb", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!bj", name = "Gb", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!bj", name = "Hb", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!bj", name = "Ib", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!bj", name = "Jb", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!bj", name = "Lb", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!bj", name = "Nb", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!bj", name = "Ob", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!bj", name = "Qb", descriptor = "I")
    private int field1320;

    @OriginalMember(owner = "client!bj", name = "Sb", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!bj", name = "Tb", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!bj", name = "Mb", descriptor = "Lwe;")
    private class175 field1316;

    @OriginalMember(owner = "client!bj", name = "Pb", descriptor = "Lfd;")
    public static class229 field1319;

    @OriginalMember(owner = "client!bj", name = "Kb", descriptor = "Ljava/lang/String;")
    public static String field1314;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "(B)V")
    public final void method515(byte arg0) {
        ++field1311;
        super.field1392 = (this.field1320 - -7) / 8;
        if (arg0 >= -123) {
            field1314 = null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "()V")
    public static final void method516() {
        for (int var0 = 0; var0 < class235.field4104; ++var0) {
            class37 var1 = class229.field3958[var0];
            class117.method853(var1);
            class229.field3958[var0] = null;
        }
        class235.field4104 = 0;
    }

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "(B)I")
    public final int method517(byte arg0) {
        ++field1306;
        if (arg0 != -78) {
            this.method522(-114);
        }
        return 255 & super.field1381[super.field1392++] + -this.field1316.method1182(true);
    }

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "(BI)I")
    public final int method518(byte arg0, int arg1) {
        int var3 = 115 % ((7 - arg0) / 40);
        ++field1310;
        return arg1 * 8 + -this.field1320;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(IB[BI)V")
    public final void method519(int arg0, byte arg1, byte[] arg2, int arg3) {
        if (arg1 == -23) {
            for (int var5 = 0; var5 < arg3; ++var5) {
                arg2[arg0 + var5] = (byte) (super.field1381[super.field1392++] + -this.field1316.method1182(true));
            }
            ++field1323;
        }
    }

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "(IZ)Z")
    public static final boolean method520(int arg0, boolean arg1) {
        ++field1315;
        if (arg0 < 0) {
            return false;
        } else {
            int var2 = class137.field2400[arg0];
            if (~var2 <= -2001) {
                var2 -= 2000;
            }
            if (~var2 == -1002) {
                return true;
            } else {
                if (arg1) {
                    field1319 = null;
                }
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I[I)V")
    public final void method521(int arg0, int[] arg1) {
        this.field1316 = new class175(arg1);
        if (arg0 > -71) {
            method520(2, false);
        }
        ++field1308;
    }

    @OriginalMember(owner = "client!bj", name = "z", descriptor = "(I)V")
    public final void method522(int arg0) {
        ++field1318;
        this.field1320 = super.field1392 * 8;
        if (arg0 <= 106) {
            field1317 = -59;
        }
    }

    @OriginalMember(owner = "client!bj", name = "A", descriptor = "(I)V")
    public static void method523(int arg0) {
        field1319 = null;
        field1309 = null;
        field1314 = null;
        field1321 = null;
        if (arg0 != 255) {
            field1312 = -19;
        }
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(I)V")
    public class80(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lma;I)V")
    public static final void method524(class105 arg0, int arg1) {
        class48.field808 = arg0;
        if (arg1 == -21010) {
            ++field1307;
        }
    }

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "(BI)I")
    public final int method525(byte arg0, int arg1) {
        ++field1313;
        if (arg0 > -23) {
            return 28;
        } else {
            int var3 = this.field1320 >> 3;
            int var4 = 0;
            int var5 = -(7 & this.field1320) + 8;
            this.field1320 += arg1;
            while (arg1 > var5) {
                var4 += (class105.field1832[var5] & super.field1381[var3++]) << -var5 + arg1;
                arg1 -= var5;
                var5 = 8;
            }
            int var6;
            if (arg1 == var5) {
                var6 = (class105.field1832[var5] & super.field1381[var3]) + var4;
            } else {
                var6 = (super.field1381[var3] >> -arg1 + var5 & class105.field1832[arg1]) + var4;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "(BI)V")
    public final void method526(byte arg0, int arg1) {
        super.field1381[super.field1392++] = (byte) (arg1 + this.field1316.method1182(true));
        if (arg0 <= -39) {
            ++field1322;
        }
    }
}
