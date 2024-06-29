import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class121 {

    @OriginalMember(owner = "client!rv", name = "j", descriptor = "[Lhc;")
    private class152[] field1553;

    @OriginalMember(owner = "client!rv", name = "k", descriptor = "I")
    private int field1554;

    @OriginalMember(owner = "client!rv", name = "n", descriptor = "I")
    public static int field1557 = 0;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!rv", name = "f", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!rv", name = "g", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!rv", name = "i", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!rv", name = "m", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!rv", name = "h", descriptor = "J")
    private long field1551;

    @OriginalMember(owner = "client!rv", name = "e", descriptor = "Lhc;")
    private class152 field1548;

    @OriginalMember(owner = "client!rv", name = "l", descriptor = "Lnq;")
    public static class486 field1555;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(B)V")
    public static void method941(byte arg0) {
        field1555 = null;
        if (arg0 != 42) {
            method944(-98, -28, true, 71, -24, true);
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)Lhc;")
    public final class152 method942(int arg0) {
        field1544++;
        if (this.field1548 == null) {
            return null;
        }
        class152 var2 = this.field1553[(int) ((long) (this.field1554 - 1) & this.field1551)];
        while (this.field1548 != var2) {
            if (this.field1548.field1894 == this.field1551) {
                class152 var4 = this.field1548;
                this.field1548 = this.field1548.field1903;
                return var4;
            }
            this.field1548 = this.field1548.field1903;
        }
        int var3 = -69 / ((70 - arg0) / 44);
        this.field1548 = null;
        return null;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(II)V")
    public static final void method943(int arg0, int arg1) {
        field1545++;
        if (class226.field2635 == arg0) {
            return;
        }
        class596.field8090 = class107.field1350 = class779.field10751[arg0];
        class587.method3368((byte) 121);
        class676.field9280 = new int[class596.field8090][class107.field1350];
        class46.field611 = new int[class596.field8090][class107.field1350];
        class439.field5868 = new int[4][class596.field8090 >> 3][class107.field1350 >> 3];
        for (int var2 = 0; var2 < 4; var2++) {
            class633.field8649[var2] = class226.method1385(class596.field8090, class107.field1350, -96);
        }
        class267.field3162 = new byte[4][class596.field8090][class107.field1350];
        class161.method1131(class596.field8090, 4, (byte) 127, class107.field1350);
        class631.method3565(4, class363.field4526, class107.field1350 >> 3, class596.field8090 >> 3);
        class226.field2635 = arg0;
        int var3 = -61 / ((arg1 + 48) / 60);
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIZIIZ)V")
    public static final void method944(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5) {
        if (arg0 < 1) {
            arg0 = 1;
        }
        field1550++;
        if (arg4 < 1) {
            arg4 = 1;
        }
        int var6 = arg0 - 334;
        if (arg2) {
            field1555 = null;
        }
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = class632.field8630 + ((class22.field354 - class632.field8630) * var6 / 100);
        if (var7 < class48.field685) {
            var7 = class48.field685;
        } else if (class573.field7858 < var7) {
            var7 = class573.field7858;
        }
        int var8 = var7 * 512 * arg0 / (arg4 * 334);
        if (class497.field6955 > var8) {
            short var9 = class497.field6955;
            var7 = var9 * 334 * arg4 / (arg0 * 512);
            if (class573.field7858 < var7) {
                var7 = class573.field7858;
                int var10 = arg0 * var7 * 512 / (var9 * 334);
                int var11 = (arg4 - var10) / 2;
                if (arg5) {
                    class363.field4526.method634();
                    class363.field4526.method600(arg3, arg1, 785580130, -16777216, arg0, var11);
                    class363.field4526.method600(arg3 + arg4 - var11, arg1, 785580130, -16777216, arg0, var11);
                }
                arg4 -= var11 * 2;
                arg3 += var11;
            }
        } else if (class62.field847 < var8) {
            short var12 = class62.field847;
            var7 = arg4 * var12 * 334 / (arg0 * 512);
            if (var7 < class48.field685) {
                var7 = class48.field685;
                int var13 = arg4 * var12 * 334 / (var7 * 512);
                int var14 = (arg0 - var13) / 2;
                if (arg5) {
                    class363.field4526.method634();
                    class363.field4526.method600(arg3, arg1, 785580130, -16777216, var14, arg4);
                    class363.field4526.method600(arg3, arg0 + arg1 - var14, 785580130, -16777216, var14, arg4);
                }
                arg0 -= var14 * 2;
                arg1 += var14;
            }
        }
        class133.field1674 = arg3;
        class782.field10786 = arg0 * var7 / 334;
        class480.field6713 = (short) arg0;
        class152.field1895 = (short) arg4;
        class691.field9421 = arg1;
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(I)I")
    public static final int method945(int arg0) {
        int var1 = -118 % ((-arg0 - 29) / 47);
        field1549++;
        return class506.field7198;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(JI)Lhc;")
    public final class152 method946(long arg0, int arg1) {
        if (arg1 != 512) {
            method945(67);
        }
        this.field1551 = arg0;
        field1546++;
        class152 var4 = this.field1553[(int) (arg0 & (long) (this.field1554 - 1))];
        for (this.field1548 = var4.field1903; this.field1548 != var4; this.field1548 = this.field1548.field1903) {
            if (this.field1548.field1894 == arg0) {
                class152 var5 = this.field1548;
                this.field1548 = this.field1548.field1903;
                return var5;
            }
        }
        this.field1548 = null;
        return null;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIIIZ)V")
    public static final void method947(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1552++;
        if (arg3 != 1) {
            method945(-86);
        }
        class438.method2584(13827);
        class533.field7510 = 0L;
        int var5 = class397.method2331(3);
        if (arg0 == 3 || var5 == 3) {
            arg4 = true;
        }
        if (!class363.field4526.method625()) {
            arg4 = true;
        }
        class131.method977(arg0, arg1, arg2, var5, arg4, (byte) -60);
    }

    @OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(I)V")
    public class121(int arg0) {
        this.field1553 = new class152[arg0];
        this.field1554 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class152 var3 = this.field1553[var2] = new class152();
            var3.field1903 = var3;
            var3.field1893 = var3;
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(I[J[IIZ)V")
    public static final void method948(int arg0, long[] arg1, int[] arg2, int arg3, boolean arg4) {
        field1547++;
        if (arg0 > arg3) {
            int var5 = (arg0 + arg3) / 2;
            int var6 = arg3;
            long var7 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var7;
            int var9 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var9;
            int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
            for (int var11 = arg3; var11 < arg0; var11++) {
                if (arg1[var11] < ((long) (var10 & var11) + var7)) {
                    long var12 = arg1[var11];
                    arg1[var11] = arg1[var6];
                    arg1[var6] = var12;
                    int var14 = arg2[var11];
                    arg2[var11] = arg2[var6];
                    arg2[var6++] = var14;
                }
            }
            arg1[arg0] = arg1[var6];
            arg1[var6] = var7;
            arg2[arg0] = arg2[var6];
            arg2[var6] = var9;
            method948(var6 - 1, arg1, arg2, arg3, true);
            method948(arg0, arg1, arg2, var6 + 1, true);
        }
        if (!arg4) {
            method945(-27);
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(BLhc;J)V")
    public final void method949(byte arg0, class152 arg1, long arg2) {
        if (arg1.field1893 != null) {
            arg1.method1088(4);
        }
        field1556++;
        if (arg0 != 26) {
            this.field1553 = null;
        }
        class152 var5 = this.field1553[(int) (arg2 & (long) (this.field1554 - 1))];
        arg1.field1903 = var5;
        arg1.field1893 = var5.field1893;
        arg1.field1893.field1903 = arg1;
        arg1.field1894 = arg2;
        arg1.field1903.field1893 = arg1;
    }
}
