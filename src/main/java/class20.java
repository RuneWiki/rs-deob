import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class20 extends class33 {

    @OriginalMember(owner = "client!bi", name = "R", descriptor = "I")
    private int field448 = 3072;

    @OriginalMember(owner = "client!bi", name = "T", descriptor = "I")
    private int field450 = 2048;

    @OriginalMember(owner = "client!bi", name = "V", descriptor = "I")
    private int field452 = 1024;

    @OriginalMember(owner = "client!bi", name = "N", descriptor = "I")
    public static int field445 = 100;

    @OriginalMember(owner = "client!bi", name = "P", descriptor = "I")
    public static int field447 = 0;

    @OriginalMember(owner = "client!bi", name = "S", descriptor = "Lrd;")
    public static class173 field449 = class133.method843("hint_mapmarkers", -93);

    @OriginalMember(owner = "client!bi", name = "Z", descriptor = "[I")
    public static int[] field456 = new int[50];

    @OriginalMember(owner = "client!bi", name = "X", descriptor = "I")
    public static int field454 = 2301979;

    @OriginalMember(owner = "client!bi", name = "cb", descriptor = "Lrd;")
    public static class173 field459 = class133.method843("Verbinde mit Server)3)3)3", 102);

    @OriginalMember(owner = "client!bi", name = "Y", descriptor = "Lrd;")
    private static class173 field455 = class133.method843("Use", 109);

    @OriginalMember(owner = "client!bi", name = "M", descriptor = "Lrd;")
    public static class173 field444 = field455;

    @OriginalMember(owner = "client!bi", name = "O", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!bi", name = "U", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!bi", name = "W", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!bi", name = "ab", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!bi", name = "db", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!bi", name = "bb", descriptor = "[I")
    public static int[] field458;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IB)[I")
    public final int[] method175(int arg0, byte arg1) {
        ++field460;
        int var3 = -84 % ((arg1 - -65) / 60);
        int[] var4 = super.field718.method514(arg0, -33);
        if (super.field718.field1615) {
            int[] var5 = this.method262(arg0, 102, 0);
            for (int var6 = 0; ~var6 > ~class117.field2173; ++var6) {
                var4[var6] = (var5[var6] * this.field450 >> 12) + this.field452;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(III)I")
    public static final int method176(int arg0, int arg1, int arg2) {
        ++field457;
        class37 var3 = (class37) class8.field150.method677(-2755, (long) arg2);
        if (var3 == null) {
            return 0;
        } else if (~arg1 == 0) {
            return 0;
        } else {
            int var4 = 99 / ((arg0 - -33) / 32);
            int var5 = 0;
            for (int var6 = 0; ~var6 > ~var3.field784.length; ++var6) {
                if (var3.field786[var6] == arg1) {
                    var5 += var3.field784[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IILmb;)V")
    public final void method177(int arg0, int arg1, class121 arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field729 = ~arg2.method751((byte) -68) == -2;
                }
            } else {
                this.field448 = arg2.method755((byte) -113);
            }
        } else {
            this.field452 = arg2.method755((byte) -103);
        }
        ++field453;
        if (arg1 >= -99) {
            this.method179(-21);
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(II)[[I")
    public final int[][] method178(int arg0, int arg1) {
        ++field446;
        int[][] var3 = super.field731.method1340(-111, arg1);
        if (super.field731.field3925) {
            int[][] var4 = this.method259(0, -9, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var3[0];
            for (int var11 = 0; class117.field2173 > var11; ++var11) {
                var10[var11] = (var5[var11] * this.field450 >> 12) + this.field452;
                var8[var11] = this.field452 - -(var6[var11] * this.field450 >> 12);
                var9[var11] = (var7[var11] * this.field450 >> 12) + this.field452;
            }
        }
        return arg0 < 112 ? null : var3;
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "()V")
    public class20() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(I)V")
    public final void method179(int arg0) {
        if (arg0 == -1) {
            ++field451;
            this.field450 = -this.field452 + this.field448;
        }
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(B)V")
    public static void method180(byte arg0) {
        field444 = null;
        field449 = null;
        field458 = null;
        field456 = null;
        int var1 = -114 % ((arg0 - -66) / 50);
        field455 = null;
        field459 = null;
    }
}
