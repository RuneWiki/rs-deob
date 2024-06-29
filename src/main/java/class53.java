import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class53 implements class153 {

    @OriginalMember(owner = "client!fw", name = "d", descriptor = "Lhd;")
    private class694 field665 = new class694(128);

    @OriginalMember(owner = "client!fw", name = "l", descriptor = "[I")
    private int[] field673 = new int[class185.field2186.field4627];

    @OriginalMember(owner = "client!fw", name = "e", descriptor = "[I")
    public int[] field666 = new int[class185.field2186.field4627];

    @OriginalMember(owner = "client!fw", name = "g", descriptor = "[[Z")
    public static boolean[][] field668 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!fw", name = "f", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!fw", name = "h", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!fw", name = "i", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!fw", name = "j", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!fw", name = "k", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!fw", name = "m", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(B)V")
    public final void method302(byte arg0) {
        if (arg0 != 77) {
            this.method306(-55, 64, 125);
        }
        for (int var2 = 0; var2 < class185.field2186.field4627; var2++) {
            class527 var3 = class185.field2186.method2093(var2, 20039);
            if (var3 != null && var3.field6657 == 0) {
                this.field673[var2] = 0;
                this.field666[var2] = 0;
            }
        }
        field670++;
        this.field665 = new class694(128);
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(BI)I")
    public final int method303(byte arg0, int arg1) {
        if (arg0 != 94) {
            return 50;
        }
        field662++;
        class666 var3 = class392.field5013.method1362(arg0 ^ 0x5324, arg1);
        int var4 = var3.field9039;
        int var5 = var3.field9040;
        int var6 = var3.field9047;
        int var7 = class322.field4011[var6 - var5];
        return var7 & this.field666[var4] >> var5;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(IZ)I")
    public final int method304(int arg0, boolean arg1) {
        if (arg1) {
            this.method306(110, 53, 76);
        }
        field672++;
        return this.field666[arg0];
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(Z)V")
    public static final void method305(boolean arg0) {
        field667++;
        class208 var1 = class442.field5559;
        synchronized (class442.field5559) {
            class442.field5559.method1224(false);
        }
        class208 var2 = class392.field5012;
        synchronized (class392.field5012) {
            class392.field5012.method1224(arg0);
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(III)V")
    public final void method306(int arg0, int arg1, int arg2) {
        field669++;
        class666 var4 = class392.field5013.method1362(21370, arg0);
        int var5 = var4.field9039;
        int var6 = var4.field9040;
        int var7 = var4.field9047;
        int var8 = class322.field4011[var7 - var6];
        if (arg1 < 0 || var8 < arg1) {
            arg1 = 0;
        }
        int var9 = var8 << var6;
        if (arg2 != -23796) {
            this.method308(18, -33, -39);
        }
        this.method308(var5, ~var9 & this.field666[var5] | arg1 << var6 & var9, 127);
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(BZ)I")
    public final int method307(byte arg0, boolean arg1) {
        field674++;
        long var3 = class321.method1854(-110);
        if (arg0 != 43) {
            this.method307((byte) -55, true);
        }
        for (class197 var5 = arg1 ? (class197) this.field665.method3830((byte) -125) : (class197) this.field665.method3838((byte) -92); var5 != null; var5 = (class197) this.field665.method3838((byte) -92)) {
            if ((var5.field2315 & 0x3FFFFFFFFFFFFFFFL) < var3) {
                if ((var5.field2315 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field3321;
                    this.field666[var6] = this.field673[var6];
                    var5.method1566(-58);
                    return var6;
                }
                var5.method1566(-62);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "(III)V")
    public final void method308(int arg0, int arg1, int arg2) {
        this.field666[arg0] = arg1;
        if (arg2 < 121) {
            this.method308(-125, -121, -58);
        }
        field663++;
        class197 var4 = (class197) this.field665.method3828((long) arg0, (byte) -91);
        if (var4 == null) {
            class197 var5 = new class197(class321.method1854(-85) + 500L);
            this.field665.method3832(var5, (long) arg0, 90);
        } else {
            var4.field2315 = class321.method1854(-26) + 500L;
        }
    }

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "(B)V")
    public static void method309(byte arg0) {
        if (arg0 != 94) {
            field668 = null;
        }
        field668 = null;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(IIZ)V")
    public final void method310(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.field666 = null;
        }
        field664++;
        class666 var4 = class392.field5013.method1362(21370, arg0);
        int var5 = var4.field9039;
        int var6 = var4.field9040;
        int var7 = var4.field9047;
        int var8 = class322.field4011[var7 - var6];
        if (arg1 < 0 || var8 < arg1) {
            arg1 = 0;
        }
        int var9 = var8 << var6;
        this.method311(var5, 62, this.field673[var5] & ~var9 | arg1 << var6 & var9);
    }

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "(III)V")
    public final void method311(int arg0, int arg1, int arg2) {
        if (arg1 <= 23) {
            this.method310(92, -119, false);
        }
        this.field673[arg0] = arg2;
        field671++;
        class197 var4 = (class197) this.field665.method3828((long) arg0, (byte) -91);
        if (var4 == null) {
            class197 var5 = new class197(4611686018427387905L);
            this.field665.method3832(var5, (long) arg0, 18);
        } else if (var4.field2315 != 4611686018427387905L) {
            var4.field2315 = class321.method1854(-96) + 500L | 0x4000000000000000L;
        }
    }
}
