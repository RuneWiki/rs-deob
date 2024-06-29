import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class48 {

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
    public int field666;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    public int field665;

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "I")
    public int field678;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "B")
    public byte field663;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public int field664;

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "Lrf;")
    public class48 field679;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "Lkn;")
    public static class442 field671 = new class442("flash2:", "blinken2:", "clignotant2:", "flash2:");

    @OriginalMember(owner = "client!rf", name = "s", descriptor = "[I")
    public static int[] field681 = new int[32];

    @OriginalMember(owner = "client!rf", name = "t", descriptor = "[I")
    public static int[] field682 = new int[3];

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
    public int field667;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
    public int field669;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
    public int field670;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
    public int field672;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "I")
    public int field673;

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "I")
    public int field674;

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "I")
    public int field676;

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "I")
    public int field677;

    @OriginalMember(owner = "client!rf", name = "r", descriptor = "I")
    public int field680;

    @OriginalMember(owner = "client!rf", name = "u", descriptor = "Lom;")
    public static class210 field683;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field681[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIII)V", line = 8)
    public static final void method416(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field668++;
        class335.field4609 = arg4;
        class94.field1302 = arg3;
        class197.field2711 = arg1;
        if (arg2 >= -16) {
            field681 = null;
        }
        class211.field2955 = arg0;
        class403.field5715 = arg5;
        if (class335.field4609 >= 100) {
            int var6 = class94.field1302 * 128 + 64;
            int var7 = class197.field2711 * 128 + 64;
            int var8 = class285.method1858(var6, class142.field2034, var7, -82) - class403.field5715;
            int var9 = var6 - class106.field1447;
            int var10 = var8 - class7.field107;
            int var11 = var7 - class20.field376;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class329.field4568 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class369.field5199 = (int) (Math.atan2((double) var9, (double) var11) * -2607.5945876176133D) & 0x3FFF;
            class155.field2192 = 0;
            if (class329.field4568 < 1024) {
                class329.field4568 = 1024;
            }
            if (class329.field4568 > 3072) {
                class329.field4568 = 3072;
            }
        }
        class128.field1807 = 2;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lee;)V", line = 55)
    public static final void method417(class404 arg0) {
        if (class231.field3344 >= 255) {
            return;
        }
        class14.field280[class231.field3344] = arg0;
        class54.field745[class231.field3344] = false;
        class231.field3344++;
        int var1 = arg0.field5744;
        if (arg0.field5725) {
            var1 = 0;
        }
        int var2 = arg0.field5744;
        if (arg0.field5738) {
            var2 = class392.field5617 - 1;
        }
        for (int var3 = var1; var3 <= var2; var3++) {
            int var4 = 0;
            int var5 = arg0.field408 + 64 - arg0.field411 >> 7;
            if (var5 < 0) {
                var4 -= var5;
                var5 = 0;
            }
            int var6 = arg0.field411 + arg0.field408 - 64 >> 7;
            if (var6 >= class264.field3687) {
                var6 = class264.field3687 - 1;
            }
            for (int var7 = var5; var7 <= var6; var7++) {
                short var8 = arg0.field5741[var4++];
                int var9 = (var8 >>> 8) + (arg0.field407 + 64 - arg0.field411 >> 7);
                int var10 = (var8 & 0xFF) + var9 - 1;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var10 >= class200.field2772) {
                    var10 = class200.field2772 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    int var12 = class54.field754[var3][var11][var7];
                    if ((var12 & 0xFF) == 0) {
                        class54.field754[var3][var11][var7] = var12 | class231.field3344;
                    } else if ((var12 & 0xFF00) == 0) {
                        class54.field754[var3][var11][var7] = var12 | class231.field3344 << 8;
                    } else if ((var12 & 0xFF0000) == 0) {
                        class54.field754[var3][var11][var7] = var12 | class231.field3344 << 16;
                    } else if ((var12 & 0xFF000000) == 0) {
                        class54.field754[var3][var11][var7] = var12 | class231.field3344 << 24;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V", line = 145)
    public static void method418(int arg0) {
        field671 = null;
        field682 = null;
        field683 = null;
        field681 = null;
        if (arg0 != 2) {
            field682 = null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IZ)V", line = 168)
    public static final void method419(int arg0, boolean arg1) {
        if (!arg1) {
            field671 = null;
        }
        class360.field4922.method901(arg0, 12223);
        field675++;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(IIIIB)V", line = 182)
    public class48(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field666 = arg3;
        this.field665 = arg1;
        this.field678 = arg2;
        this.field663 = arg4;
        this.field664 = arg0;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lrf;I)V", line = 193)
    public class48(class48 arg0, int arg1) {
        this.field679 = arg0;
        this.field664 = this.field679.field664;
        this.field663 = this.field679.field663;
        this.field665 = this.field679.field665 + arg1;
        this.field678 = this.field679.field678 + arg1;
        this.field666 = this.field679.field666 + arg1;
    }
}
