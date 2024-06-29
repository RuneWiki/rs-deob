import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class61 extends class138 {

    @OriginalMember(owner = "client!ie", name = "Pb", descriptor = "Lod;")
    private static class101 field1356 = class46.method335(110, "Close");

    @OriginalMember(owner = "client!ie", name = "Kb", descriptor = "Lod;")
    public static class101 field1351 = field1356;

    @OriginalMember(owner = "client!ie", name = "Qb", descriptor = "Lod;")
    public static class101 field1357 = class46.method335(-54, " <col=00ff80>");

    @OriginalMember(owner = "client!ie", name = "Ub", descriptor = "Lod;")
    private static class101 field1361 = class46.method335(-114, "as it was used to break our rules)3");

    @OriginalMember(owner = "client!ie", name = "dc", descriptor = "J")
    public static volatile long field1370 = 0L;

    @OriginalMember(owner = "client!ie", name = "Lb", descriptor = "Lod;")
    public static class101 field1352 = field1361;

    @OriginalMember(owner = "client!ie", name = "Ob", descriptor = "I")
    public static int field1355 = 0;

    @OriginalMember(owner = "client!ie", name = "fc", descriptor = "I")
    public static int field1372 = 0;

    @OriginalMember(owner = "client!ie", name = "Mb", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!ie", name = "Nb", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!ie", name = "Tb", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!ie", name = "Vb", descriptor = "I")
    private int field1362;

    @OriginalMember(owner = "client!ie", name = "Wb", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!ie", name = "Xb", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!ie", name = "Yb", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!ie", name = "Zb", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!ie", name = "bc", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!ie", name = "cc", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!ie", name = "ec", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!ie", name = "Rb", descriptor = "Lc;")
    public static class15 field1358;

    @OriginalMember(owner = "client!ie", name = "Sb", descriptor = "Lnd;")
    private class94 field1359;

    @OriginalMember(owner = "client!ie", name = "ac", descriptor = "[Lrd;")
    public static class122[] field1367;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "(II)I")
    public final int method418(int arg0, int arg1) {
        if (arg1 != 8) {
            return -17;
        } else {
            ++field1364;
            return arg0 * 8 + -this.field1362;
        }
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(IB)V")
    public final void method419(int arg0, byte arg1) {
        if (arg1 == 0) {
            super.field3213[super.field3175++] = (byte) (this.field1359.method654((byte) -110) + arg0);
            ++field1366;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B[I)V")
    public final void method420(byte arg0, int[] arg1) {
        int var3 = 112 / ((arg0 - -40) / 62);
        ++field1368;
        this.field1359 = new class94(arg1);
    }

    @OriginalMember(owner = "client!ie", name = "v", descriptor = "(I)V")
    public final void method421(int arg0) {
        ++field1354;
        if (arg0 > -63) {
            this.method426(false, -94);
        }
        super.field3175 = (this.field1362 + 7) / 8;
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(I)V")
    public class61(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ie", name = "w", descriptor = "(I)V")
    public static void method422(int arg0) {
        field1352 = null;
        field1358 = null;
        field1357 = null;
        field1351 = null;
        field1361 = null;
        if (arg0 == 743) {
            field1367 = null;
            field1356 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "x", descriptor = "(I)V")
    public static final void method423(int arg0) {
        ++field1360;
        class17.field364.method419(130, (byte) 0);
        for (class133 var1 = (class133) class96.field2092.method1142((byte) -43); var1 != null; var1 = (class133) class96.field2092.method1136(-9485)) {
            if (~var1.field3046 == -1 || ~var1.field3046 == -4) {
                class54.method387(true, var1, (byte) -128);
            }
        }
        if (arg0 == 29255) {
            ++class53.field1200;
            if (class30.field776 != null) {
                class40.method300(false, class30.field776);
                class30.field776 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "y", descriptor = "(I)I")
    public final int method424(int arg0) {
        if (arg0 != 8) {
            return -3;
        } else {
            ++field1353;
            return 255 & super.field3213[super.field3175++] + -this.field1359.method654((byte) -111);
        }
    }

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "(B)V")
    public final void method425(byte arg0) {
        this.field1362 = super.field3175 * 8;
        if (arg0 < -46) {
            ++field1371;
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(ZI)I")
    public final int method426(boolean arg0, int arg1) {
        ++field1363;
        int var3 = this.field1362 >> 3;
        int var4 = -(this.field1362 & 7) + 8;
        int var5 = 0;
        this.field1362 += arg1;
        while (~var4 > ~arg1) {
            var5 += (class93.field2009[var4] & super.field3213[var3++]) << -var4 + arg1;
            arg1 -= var4;
            var4 = 8;
        }
        if (!arg0) {
            field1357 = null;
        }
        int var6;
        if (~arg1 == ~var4) {
            var6 = (class93.field2009[var4] & super.field3213[var3]) + var5;
        } else {
            var6 = (super.field3213[var3] >> -arg1 + var4 & class93.field2009[arg1]) + var5;
        }
        return var6;
    }
}
