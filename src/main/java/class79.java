import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class79 extends class114 {

    @OriginalMember(owner = "client!he", name = "Lb", descriptor = "Lvd;")
    public static class117 field1214 = null;

    @OriginalMember(owner = "client!he", name = "Tb", descriptor = "[Ljava/lang/String;")
    public static String[] field1222 = new String[200];

    @OriginalMember(owner = "client!he", name = "Mb", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!he", name = "Nb", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!he", name = "Ob", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!he", name = "Pb", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!he", name = "Qb", descriptor = "I")
    private int field1219;

    @OriginalMember(owner = "client!he", name = "Sb", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!he", name = "Ub", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!he", name = "Vb", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!he", name = "Xb", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!he", name = "Yb", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!he", name = "Zb", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!he", name = "ac", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!he", name = "bc", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!he", name = "cc", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!he", name = "dc", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!he", name = "Wb", descriptor = "Lc;")
    private class269 field1225;

    @OriginalMember(owner = "client!he", name = "Rb", descriptor = "[B")
    public static byte[] field1220;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "(II)I")
    public final int method519(int arg0, int arg1) {
        ++field1217;
        if (arg0 < 72) {
            this.method526(true);
        }
        return arg1 * 8 + -this.field1219;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IBI[B)V")
    public final void method520(int arg0, byte arg1, int arg2, byte[] arg3) {
        for (int var5 = 0; arg2 > var5; ++var5) {
            arg3[arg0 + var5] = (byte) (super.field1629[super.field1673++] + -this.field1225.method1802((byte) 110));
        }
        if (arg1 <= 100) {
            method524(-22, (class267) null);
        }
        ++field1224;
    }

    @OriginalMember(owner = "client!he", name = "p", descriptor = "(I)V")
    public final void method521(int arg0) {
        this.field1219 = super.field1673 * 8;
        ++field1218;
        int var2 = -78 % ((21 - arg0) / 38);
    }

    @OriginalMember(owner = "client!he", name = "m", descriptor = "(II)V")
    public final void method522(int arg0, int arg1) {
        if (arg1 != 28727) {
            method525((byte) -48, 125);
        }
        ++field1221;
        super.field1629[super.field1673++] = (byte) (arg0 + this.field1225.method1802((byte) 115));
    }

    @OriginalMember(owner = "client!he", name = "m", descriptor = "(B)V")
    public static void method523(byte arg0) {
        field1214 = null;
        if (arg0 > -104) {
            field1220 = null;
        }
        field1222 = null;
        field1220 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILha;)Lha;")
    public static final class267 method524(int arg0, class267 arg1) {
        ++field1228;
        if (arg0 != 899) {
            return null;
        } else if (arg1.field4139 != -1) {
            return class282.method1897(arg1.field4139, arg0 + -818);
        } else {
            int var2 = arg1.field4113 >>> 16;
            class285 var3 = new class285(class128.field1874);
            for (class261 var4 = (class261) var3.method1918((byte) -17); var4 != null; var4 = (class261) var3.method1921((byte) -90)) {
                if (~var4.field3940 == ~var2) {
                    return class282.method1897((int) var4.field3851, 116);
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(BI)V")
    public static final void method525(byte arg0, int arg1) {
        class251.field3829 = new int[arg1];
        int var2 = -66 % ((arg0 - 20) / 46);
        class193.field2773 = new int[arg1];
        class128.field1882 = new int[arg1];
        ++field1226;
        class97.field1465 = new int[arg1];
        class67.field1045 = new int[arg1];
    }

    @OriginalMember(owner = "client!he", name = "g", descriptor = "(Z)I")
    public final int method526(boolean arg0) {
        ++field1231;
        return arg0 ? 74 : super.field1629[super.field1673++] + -this.field1225.method1802((byte) 118) & 255;
    }

    @OriginalMember(owner = "client!he", name = "q", descriptor = "(I)V")
    public static final void method527(int arg0) {
        ++field1215;
        class190.field2691.method260(0);
        if (arg0 >= -76) {
            field1214 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "([IB)V")
    public final void method528(int[] arg0, byte arg1) {
        ++field1230;
        if (arg1 >= -37) {
            this.method528((int[]) null, (byte) -13);
        }
        this.field1225 = new class269(arg0);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lvj;ILvj;)V")
    public static final void method529(class90 arg0, int arg1, class90 arg2) {
        ++field1216;
        if (arg1 == 0) {
            if (arg2.field1370 != null) {
                arg2.method609(arg1 + -15747);
            }
            arg2.field1370 = arg0;
            arg2.field1367 = arg0.field1367;
            arg2.field1370.field1367 = arg2;
            arg2.field1367.field1370 = arg2;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIZ)V")
    public static final void method530(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field1232;
        if (~arg1 > ~arg3) {
            for (int var5 = arg1; var5 < arg3; ++var5) {
                class163.field2370[var5][arg0] = arg2;
            }
        } else {
            for (int var6 = arg3; ~var6 > ~arg1; ++var6) {
                class163.field2370[var6][arg0] = arg2;
            }
        }
        if (arg4) {
            method529((class90) null, -17, (class90) null);
        }
    }

    @OriginalMember(owner = "client!he", name = "e", descriptor = "(BI)I")
    public final int method531(byte arg0, int arg1) {
        int var3 = this.field1219 >> 3;
        int var4 = -3 % ((arg0 - -82) / 43);
        ++field1227;
        int var5 = -(7 & this.field1219) + 8;
        int var6 = 0;
        this.field1219 += arg1;
        while (~arg1 < ~var5) {
            var6 += (class152.field2198[var5] & super.field1629[var3++]) << -var5 + arg1;
            arg1 -= var5;
            var5 = 8;
        }
        int var7;
        if (arg1 != var5) {
            var7 = (super.field1629[var3] >> var5 - arg1 & class152.field2198[arg1]) + var6;
        } else {
            var7 = (class152.field2198[var5] & super.field1629[var3]) + var6;
        }
        return var7;
    }

    @OriginalMember(owner = "client!he", name = "r", descriptor = "(I)V")
    public final void method532(int arg0) {
        super.field1673 = (this.field1219 + 7) / 8;
        if (arg0 == 1730730147) {
            ++field1223;
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(I)V")
    public class79(int arg0) {
        super(arg0);
    }
}
