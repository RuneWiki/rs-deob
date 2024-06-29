import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class596 implements class404 {

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "Lefa;")
    private class322 field8622 = new class322(128);

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "[I")
    private int[] field8630 = new int[class683.field9635.field2909];

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "[I")
    public int[] field8636 = new int[class683.field9635.field2909];

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public static int field8627 = 0;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field8623;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    public static int field8624;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    public static int field8625;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    public static int field8626;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    public static int field8628;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "I")
    public static int field8629;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
    public static int field8631;

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
    public static int field8632;

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "I")
    public static int field8633;

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "I")
    public static int field8634;

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "I")
    public static int field8635;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IZI)I", line = 5)
    public static final int method3391(int arg0, boolean arg1, int arg2) {
        field8631++;
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg0 >> 7;
        if (arg1) {
            method3395((byte) 20, null);
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(IB)I", line = 28)
    public final int method2492(int arg0, byte arg1) {
        field8635++;
        if (arg1 != 53) {
            return 118;
        }
        class350 var3 = class449.field6504.method1962(arg0, 26778);
        int var4 = var3.field5177;
        int var5 = var3.field5175;
        int var6 = var3.field5174;
        int var7 = class470.field6760[var6 - var5];
        return this.field8636[var4] >> var5 & var7;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZI)I", line = 49)
    public final int method3392(boolean arg0, int arg1) {
        field8634++;
        long var3 = class60.method371(false);
        if (arg1 != -1) {
            return 89;
        }
        for (class371 var5 = arg0 ? (class371) this.field8622.method1993(arg1 - 64) : (class371) this.field8622.method1997(9831); var5 != null; var5 = (class371) this.field8622.method1997(9831)) {
            if (var3 > (var5.field5494 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var5.field5494 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field5740;
                    this.field8636[var6] = this.field8630[var6];
                    var5.method2360((byte) 66);
                    return var6;
                }
                var5.method2360((byte) 66);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V", line = 90)
    public final void method3393(int arg0) {
        if (arg0 <= 69) {
            this.method3398(-11, -18, -46);
        }
        for (int var2 = 0; var2 < class683.field9635.field2909; var2++) {
            class434 var3 = class683.field9635.method1380(var2, 22);
            if (var3 != null && var3.field6285 == 0) {
                this.field8630[var2] = 0;
                this.field8636[var2] = 0;
            }
        }
        field8623++;
        this.field8622 = new class322(128);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIZ)V", line = 118)
    public final void method3394(int arg0, int arg1, boolean arg2) {
        this.field8630[arg0] = arg1;
        field8632++;
        if (!arg2) {
            this.field8630 = null;
        }
        class371 var4 = (class371) this.field8622.method2002((byte) -107, (long) arg0);
        if (var4 == null) {
            class371 var5 = new class371(4611686018427387905L);
            this.field8622.method2001(100, var5, (long) arg0);
        } else if (var4.field5494 != 4611686018427387905L) {
            var4.field5494 = class60.method371(false) + 500L | 0x4000000000000000L;
            return;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(BLgk;)Lsv;", line = 152)
    public static final class508 method3395(byte arg0, class540 arg1) {
        field8626++;
        class167 var2 = class577.method3321(255, arg1);
        int var3 = arg1.method3160(false);
        int var4 = arg1.method3160(false);
        if (arg0 <= 65) {
            field8627 = 23;
        }
        int var5 = arg1.method3169(26488);
        return new class508(var2.field2330, var2.field2336, var2.field2334, var2.field2335, var2.field2337, var2.field2332, var2.field2338, var2.field2333, var2.field2329, var3, var4, var5);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IBI)V", line = 174)
    public final void method3396(int arg0, byte arg1, int arg2) {
        field8625++;
        class350 var4 = class449.field6504.method1962(arg2, 26778);
        int var5 = -109 % ((arg1 + 34) / 62);
        int var6 = var4.field5177;
        int var7 = var4.field5175;
        int var8 = var4.field5174;
        int var9 = class470.field6760[var8 - var7];
        if (arg0 < 0 || var9 < arg0) {
            arg0 = 0;
        }
        int var10 = var9 << var7;
        this.method3394(var6, ~var10 & this.field8630[var6] | arg0 << var7 & var10, true);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lr;IIZ)Lla;", line = 201)
    public static final class393 method3397(class98 arg0, int arg1, int arg2, boolean arg3) {
        field8633++;
        class374 var4 = class14.method96(4, arg1, arg0, arg3);
        if (var4 == null) {
            return null;
        } else if (arg2 == 2) {
            return var4.field5526;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IB)I", line = 217)
    public final int method2491(int arg0, byte arg1) {
        if (arg1 <= 27) {
            this.field8636 = null;
        }
        field8629++;
        return this.field8636[arg0];
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(III)V", line = 229)
    public final void method3398(int arg0, int arg1, int arg2) {
        field8624++;
        class350 var4 = class449.field6504.method1962(arg0, 26778);
        int var5 = var4.field5177;
        int var6 = var4.field5175;
        int var7 = var4.field5174;
        int var8 = class470.field6760[var7 - var6];
        if (arg1 < arg2 || arg1 > var8) {
            arg1 = 0;
        }
        int var9 = var8 << var6;
        this.method3399(var5, this.field8636[var5] & ~var9 | arg1 << var6 & var9, (byte) 82);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIB)V", line = 257)
    public final void method3399(int arg0, int arg1, byte arg2) {
        this.field8636[arg0] = arg1;
        field8628++;
        class371 var4 = (class371) this.field8622.method2002((byte) -125, (long) arg0);
        if (var4 == null) {
            class371 var5 = new class371(class60.method371(false) + 500L);
            this.field8622.method2001(-90, var5, (long) arg0);
        } else {
            var4.field5494 = class60.method371(false) + 500L;
        }
        if (arg2 < 59) {
            this.field8622 = null;
        }
    }
}
