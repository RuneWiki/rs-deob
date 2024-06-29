import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class68 extends class70 {

    @OriginalMember(owner = "client!gh", name = "Pb", descriptor = "[I")
    public static int[] field1368 = new int[99];

    @OriginalMember(owner = "client!gh", name = "Xb", descriptor = "Ljd;")
    private static class92 field1376 = class202.method1325((byte) 90, "Choose Option");

    @OriginalMember(owner = "client!gh", name = "Mb", descriptor = "Ljd;")
    public static class92 field1365 = field1376;

    @OriginalMember(owner = "client!gh", name = "bc", descriptor = "[Loh;")
    public static class142[] field1380;

    @OriginalMember(owner = "client!gh", name = "fc", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!gh", name = "ic", descriptor = "Ljd;")
    public static class92 field1387;

    @OriginalMember(owner = "client!gh", name = "jc", descriptor = "Ljd;")
    private static class92 field1388;

    @OriginalMember(owner = "client!gh", name = "hc", descriptor = "Ljd;")
    public static class92 field1386;

    @OriginalMember(owner = "client!gh", name = "Kb", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!gh", name = "Lb", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!gh", name = "Nb", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!gh", name = "Ob", descriptor = "I")
    private int field1367;

    @OriginalMember(owner = "client!gh", name = "Rb", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!gh", name = "Sb", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!gh", name = "Tb", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!gh", name = "Ub", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!gh", name = "Vb", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!gh", name = "Wb", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!gh", name = "Yb", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!gh", name = "Zb", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!gh", name = "ac", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!gh", name = "ec", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!gh", name = "gc", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!gh", name = "Qb", descriptor = "Lva;")
    private class198 field1369;

    @OriginalMember(owner = "client!gh", name = "cc", descriptor = "[Lsc;")
    public static class173[] field1381;

    @OriginalMember(owner = "client!gh", name = "dc", descriptor = "[Ldh;")
    public static class39[] field1382;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "(B)V")
    public static void method399(byte arg0) {
        field1386 = null;
        if (arg0 >= 85) {
            field1382 = null;
            field1388 = null;
            field1365 = null;
            field1376 = null;
            field1387 = null;
            field1380 = null;
            field1381 = null;
            field1368 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "(II)I")
    public final int method400(int arg0, int arg1) {
        ++field1373;
        if (arg1 != 0) {
            field1385 = -73;
        }
        return arg0 * 8 - this.field1367;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BLjd;)V")
    public static final void method401(byte arg0, class92 arg1) {
        ++field1378;
        if (field1382 != null) {
            int var2 = 0;
            long var3 = arg1.method609(arg0 + 10341);
            if (~var3 != -1L) {
                while (~field1382.length < ~var2 && ~field1382[var2].field4079 != ~var3) {
                    ++var2;
                }
                if (arg0 == 13) {
                    if (field1382.length > var2 && field1382[var2] != null) {
                        ++class153.field3030;
                        class99.field2000.method405(6, arg0 ^ 10);
                        class99.field2000.method459(false, field1382[var2].field4079);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "([BZI)Ljava/lang/Object;")
    public static final Object method402(byte[] arg0, boolean arg1, int arg2) {
        ++field1379;
        if (arg2 != 8) {
            return null;
        } else if (arg0 == null) {
            return null;
        } else {
            if (arg0.length > 136 && !class131.field2623) {
                try {
                    class104 var3 = (class104) Class.forName("og").newInstance();
                    var3.method710(arg0, -113);
                    return var3;
                } catch (Throwable var4) {
                    class131.field2623 = true;
                }
            }
            return arg1 ? class55.method327(arg0, arg2 ^ 30008) : arg0;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "([IZ)V")
    public final void method403(int[] arg0, boolean arg1) {
        this.field1369 = new class198(arg0);
        if (arg1) {
            field1376 = null;
        }
        ++field1375;
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(Z)I")
    public final int method404(boolean arg0) {
        ++field1370;
        return !arg0 ? -8 : super.field1493[super.field1472++] - this.field1369.method1314(true) & 255;
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(I)V")
    public class68(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "(II)V")
    public final void method405(int arg0, int arg1) {
        if (arg1 == 7) {
            ++field1363;
            super.field1493[super.field1472++] = (byte) (arg0 + this.field1369.method1314(true));
        }
    }

    @OriginalMember(owner = "client!gh", name = "v", descriptor = "(I)V")
    public final void method406(int arg0) {
        super.field1472 = (this.field1367 + 7) / arg0;
        ++field1366;
    }

    @OriginalMember(owner = "client!gh", name = "w", descriptor = "(I)V")
    public final void method407(int arg0) {
        if (arg0 == 0) {
            this.field1367 = super.field1472 * 8;
            ++field1377;
        }
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(BI)I")
    public final int method408(byte arg0, int arg1) {
        ++field1371;
        int var3 = this.field1367 >> 3;
        int var4 = 0;
        int var5 = -(this.field1367 & 7) + 8;
        if (arg0 != -32) {
            field1387 = null;
        }
        this.field1367 += arg1;
        while (var5 < arg1) {
            var4 += (super.field1493[var3++] & class118.field2378[var5]) << -var5 + arg1;
            arg1 -= var5;
            var5 = 8;
        }
        int var6;
        if (arg1 != var5) {
            var6 = (super.field1493[var3] >> -arg1 + var5 & class118.field2378[arg1]) + var4;
        } else {
            var6 = (class118.field2378[var5] & super.field1493[var3]) + var4;
        }
        return var6;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; ~var1 > -100; ++var1) {
            int var2 = var1 + 1;
            int var3 = (int) (300.0D * Math.pow(2.0D, (double) var2 / 7.0D) + (double) var2);
            var0 += var3;
            field1368[var1] = var0 / 4;
        }
        field1380 = new class142[6];
        field1384 = 0;
        field1387 = class202.method1325((byte) 90, "auf der Hautpseite)3");
        field1388 = class202.method1325((byte) 90, "Error loading your profile)3");
        field1386 = field1388;
    }
}
