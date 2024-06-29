import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class237 implements class311 {

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "Lsq;")
    private class454 field3347 = new class454(128);

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "[I")
    private int[] field3348 = new int[class181.field2632.field5726];

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "[I")
    public int[] field3352 = new int[class181.field2632.field5726];

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "Lcs;")
    public static class351 field3338 = new class351(74, -1);

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "[S")
    public static short[] field3350 = new short[] { 10, 49, 15, 8, 25, 20, 21, 12 };

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "Lfn;")
    public static class52 field3342 = new class52(15, 8);

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "Ljg;")
    public static class456 field3339;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIZ)V")
    public final void method1484(int arg0, int arg1, boolean arg2) {
        field3345++;
        class319 var4 = class147.field2084.method404(-5671, arg1);
        int var5 = var4.field4363;
        int var6 = var4.field4365;
        int var7 = var4.field4364;
        int var8 = class48.field782[var7 - var6];
        if (arg2) {
            this.method1491(false, 48);
        }
        if (arg0 < 0 || var8 < arg0) {
            arg0 = 0;
        }
        int var9 = var8 << var6;
        this.method1488(var5, -21973, var9 & arg0 << var6 | ~var9 & this.field3348[var5]);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)[Lbd;")
    public static final class464[] method1485(int arg0) {
        field3341++;
        return arg0 == 1 ? new class464[] { class166.field2445, class401.field5595, class210.field2970, class240.field3377, class11.field196, class283.field3885, class138.field1963, class303.field4146, class22.field370, class473.field6629, class345.field4720, class204.field2929, class449.field6185, class353.field4921, class120.field1680 } : null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIB)V")
    public final void method1486(int arg0, int arg1, byte arg2) {
        field3344++;
        class319 var4 = class147.field2084.method404(-5671, arg0);
        int var5 = var4.field4363;
        int var6 = var4.field4365;
        int var7 = var4.field4364;
        int var8 = class48.field782[var7 - var6];
        if (arg1 < 0 || arg1 > var8) {
            arg1 = 0;
        }
        int var9 = var8 << var6;
        this.method1494(var5, (byte) 114, var9 & arg1 << var6 | ~var9 & this.field3352[var5]);
        int var10 = 1 / ((-arg2 - 56) / 33);
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)V")
    public static void method1487(int arg0) {
        field3339 = null;
        if (arg0 != -1) {
            field3338 = null;
        }
        field3342 = null;
        field3350 = null;
        field3338 = null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(III)V")
    public final void method1488(int arg0, int arg1, int arg2) {
        field3349++;
        if (arg1 != -21973) {
            method1487(22);
        }
        this.field3348[arg0] = arg2;
        class285 var4 = (class285) this.field3347.method2614((long) arg0, 70);
        if (var4 == null) {
            class285 var5 = new class285(4611686018427387905L);
            this.field3347.method2620((long) arg0, var5, false);
        } else if (var4.field3899 != 4611686018427387905L) {
            var4.field3899 = class193.method1237(-9581) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZIFIIIBI)[I")
    public static final int[] method1489(boolean arg0, int arg1, float arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field3337++;
        if (arg6 > -81) {
            method1485(125);
        }
        int[] var8 = new int[arg1];
        class153 var9 = new class153();
        var9.field2190 = arg0;
        var9.field2199 = arg5;
        var9.field2193 = (int) (arg2 * 4096.0F);
        var9.field2195 = arg4;
        var9.field2189 = arg7;
        var9.field2185 = arg3;
        var9.method12(27108);
        class382.method2291(1, -122, arg1);
        var9.method924(123, 0, var8);
        return var8;
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(I)V")
    public final void method1490(int arg0) {
        for (int var2 = 0; var2 < class181.field2632.field5726; var2++) {
            class11 var3 = class181.field2632.method2431((byte) -101, var2);
            if (var3 != null && var3.field197 == 0) {
                this.field3348[var2] = 0;
                this.field3352[var2] = 0;
            }
        }
        field3340++;
        this.field3347 = new class454(arg0);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZI)I")
    public final int method1491(boolean arg0, int arg1) {
        field3351++;
        long var3 = class193.method1237(-9581);
        if (arg1 != -17115) {
            this.method1491(true, -125);
        }
        for (class285 var5 = arg0 ? (class285) this.field3347.method2615((byte) -18) : (class285) this.field3347.method2619((byte) -98); var5 != null; var5 = (class285) this.field3347.method2619((byte) -98)) {
            if (var3 > (var5.field3899 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var5.field3899 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field2608;
                    this.field3352[var6] = this.field3348[var6];
                    var5.method1182(28818);
                    return var6;
                }
                var5.method1182(arg1 ^ 0xFFFFCDB7);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)I")
    public final int method1492(int arg0, int arg1) {
        if (arg1 != -1) {
            method1485(75);
        }
        field3346++;
        return this.field3352[arg0];
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BI)I")
    public final int method1493(byte arg0, int arg1) {
        field3343++;
        class319 var3 = class147.field2084.method404(arg0 ^ 0xFFFFE997, arg1);
        int var4 = var3.field4363;
        int var5 = var3.field4365;
        if (arg0 != 78) {
            this.method1490(40);
        }
        int var6 = var3.field4364;
        int var7 = class48.field782[var6 - var5];
        return this.field3352[var4] >> var5 & var7;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IBI)V")
    public final void method1494(int arg0, byte arg1, int arg2) {
        this.field3352[arg0] = arg2;
        if (arg1 <= 90) {
            field3342 = null;
        }
        field3336++;
        class285 var4 = (class285) this.field3347.method2614((long) arg0, -110);
        if (var4 == null) {
            class285 var5 = new class285(class193.method1237(-9581) + 500L);
            this.field3347.method2620((long) arg0, var5, false);
        } else {
            var4.field3899 = class193.method1237(-9581) + 500L;
        }
    }
}
