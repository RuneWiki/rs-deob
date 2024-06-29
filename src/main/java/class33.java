import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class33 extends class178 {

    @OriginalMember(owner = "client!cj", name = "S", descriptor = "I")
    private int field672 = 0;

    @OriginalMember(owner = "client!cj", name = "U", descriptor = "I")
    private int field674 = -1;

    @OriginalMember(owner = "client!cj", name = "K", descriptor = "[S")
    public static short[] field665 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!cj", name = "N", descriptor = "I")
    public static int field668 = 0;

    @OriginalMember(owner = "client!cj", name = "R", descriptor = "I")
    public static int field671 = 0;

    @OriginalMember(owner = "client!cj", name = "Q", descriptor = "Loc;")
    private static class151 field670 = class137.method873(2, "Press (Wchange your password(W on front page)3");

    @OriginalMember(owner = "client!cj", name = "ab", descriptor = "Loc;")
    public static class151 field680 = class137.method873(2, "(R");

    @OriginalMember(owner = "client!cj", name = "O", descriptor = "Loc;")
    public static class151 field669 = field670;

    @OriginalMember(owner = "client!cj", name = "V", descriptor = "B")
    public static byte field675;

    @OriginalMember(owner = "client!cj", name = "L", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!cj", name = "T", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!cj", name = "W", descriptor = "I")
    public int field676;

    @OriginalMember(owner = "client!cj", name = "X", descriptor = "I")
    public int field677;

    @OriginalMember(owner = "client!cj", name = "Y", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!cj", name = "Z", descriptor = "I")
    public int field679;

    @OriginalMember(owner = "client!cj", name = "bb", descriptor = "I")
    public int field681;

    @OriginalMember(owner = "client!cj", name = "cb", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!cj", name = "M", descriptor = "Z")
    public static boolean field667;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(I)V")
    public static void method239(int arg0) {
        if (arg0 == 0) {
            field680 = null;
            field670 = null;
            field669 = null;
            field665 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lwa;II)V")
    public final void method240(class229 arg0, int arg1, int arg2) {
        field666++;
        int var4 = -84 / ((arg2 + 13) / 34);
        while (true) {
            int var5 = arg0.method1475(255);
            if (var5 == 0) {
                return;
            }
            this.method243(-65536, var5, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IB)Lej;")
    public static final class55 method241(int arg0, byte arg1) {
        field682++;
        class55 var2 = (class55) class41.field847.method1318((byte) -44, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        int var3 = -34 / ((arg1 - 65) / 47);
        byte[] var4 = class130.field2387.method1208(class168.method1090(-4565, arg0), (byte) 48, class21.method180(arg0, (byte) 94));
        class55 var5 = new class55();
        if (var4 != null) {
            var5.method377(new class229(var4), false);
        }
        class41.field847.method1324(var5, 18373, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(II)V")
    private final void method242(int arg0, int arg1) {
        field673++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        if (arg0 < 60) {
            field667 = true;
        }
        double var5 = var3;
        double var7 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var9 = 0.0D;
        if (var7 < var3) {
            var5 = var7;
        }
        double var11 = var3;
        if (var3 < var7) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = (double) (arg1 & 0xFF) / 256.0D;
        if (var11 < var15) {
            var11 = var15;
        }
        if (var5 > var15) {
            var5 = var15;
        }
        double var17 = (var5 + var11) / 2.0D;
        if (var5 != var11) {
            if (var3 == var11) {
                var9 = (var7 - var15) / (var11 - var5);
            } else if (var7 == var11) {
                var9 = (var15 - var3) / (var11 - var5) + 2.0D;
            } else if (var11 == var15) {
                var9 = (var3 - var7) / (var11 - var5) + 4.0D;
            }
            if (var17 < 0.5D) {
                var13 = (var11 - var5) / (var5 + var11);
            }
            if (var17 >= 0.5D) {
                var13 = (var11 - var5) / (2.0D - var11 - var5);
            }
        }
        this.field676 = (int) (var13 * 256.0D);
        if (this.field676 < 0) {
            this.field676 = 0;
        } else if (this.field676 > 255) {
            this.field676 = 255;
        }
        if (var17 > 0.5D) {
            this.field677 = (int) ((1.0D - var17) * var13 * 512.0D);
        } else {
            this.field677 = (int) (var13 * var17 * 512.0D);
        }
        if (this.field677 < 1) {
            this.field677 = 1;
        }
        this.field679 = (int) (var17 * 256.0D);
        if (this.field679 < 0) {
            this.field679 = 0;
        } else if (this.field679 > 255) {
            this.field679 = 255;
        }
        double var19 = var9 / 6.0D;
        this.field681 = (int) ((double) this.field677 * var19);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIILwa;)V")
    private final void method243(int arg0, int arg1, int arg2, class229 arg3) {
        if (arg0 != -65536) {
            this.method243(52, 14, -8, null);
        }
        field678++;
        if (arg1 == 1) {
            this.field672 = arg3.method1450(-23209);
            this.method242(arg0 + 65613, this.field672);
        } else if (arg1 == 2) {
            this.field674 = arg3.method1490((byte) 73);
            if (this.field674 == 65535) {
                this.field674 = -1;
                return;
            }
            return;
        } else if (arg1 == 3) {
            arg3.method1490((byte) 73);
            return;
        }
    }
}
