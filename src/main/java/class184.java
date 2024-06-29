import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class184 extends class288 {

    @OriginalMember(owner = "client!og", name = "D", descriptor = "I")
    private int field2933 = 0;

    @OriginalMember(owner = "client!og", name = "V", descriptor = "I")
    private int field2951 = 0;

    @OriginalMember(owner = "client!og", name = "W", descriptor = "I")
    private int field2952 = 1;

    @OriginalMember(owner = "client!og", name = "F", descriptor = "Ljava/lang/String;")
    public static String field2935 = "Cancel";

    @OriginalMember(owner = "client!og", name = "C", descriptor = "I")
    public static int field2932 = 0;

    @OriginalMember(owner = "client!og", name = "S", descriptor = "[[S")
    public static short[][] field2948 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!og", name = "J", descriptor = "Leb;")
    public static class103 field2939 = null;

    @OriginalMember(owner = "client!og", name = "P", descriptor = "I")
    public static int field2945 = 99;

    @OriginalMember(owner = "client!og", name = "G", descriptor = "Ljava/lang/String;")
    public static String field2936 = "wave2:";

    @OriginalMember(owner = "client!og", name = "O", descriptor = "I")
    public static int field2944 = -1;

    @OriginalMember(owner = "client!og", name = "E", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!og", name = "K", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!og", name = "L", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!og", name = "M", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!og", name = "N", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!og", name = "Q", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!og", name = "R", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!og", name = "T", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!og", name = "U", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!og", name = "X", descriptor = "Lge;")
    public static class137 field2953;

    @OriginalMember(owner = "client!og", name = "H", descriptor = "Lcg;")
    public static class36 field2937;

    @OriginalMember(owner = "client!og", name = "I", descriptor = "[Lwb;")
    public static class138[] field2938;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "(I)V")
    public static final void method1258(int arg0) {
        if (arg0 == 16578) {
            ++field2950;
        }
    }

    @OriginalMember(owner = "client!og", name = "d", descriptor = "(B)V")
    public static void method1259(byte arg0) {
        field2937 = null;
        field2939 = null;
        field2935 = null;
        field2936 = null;
        if (arg0 >= 68) {
            field2948 = null;
            field2938 = null;
            field2953 = null;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BI)Lw;")
    public static final class244 method1260(byte arg0, int arg1) {
        ++field2942;
        class244 var2 = (class244) class254.field4067.method1839((byte) 112, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            if (arg0 >= -118) {
                method1261();
            }
            byte[] var3 = class227.field3589.method940((byte) 52, arg1, 4);
            class244 var4 = new class244();
            if (var3 != null) {
                var4.method1605(arg1, 94, new class264(var3));
            }
            class254.field4067.method1830((long) arg1, -111, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "()V")
    public static final void method1261() {
        for (int var0 = 0; var0 < class26.field320; ++var0) {
            class138 var1 = field2938[var0];
            class177.method1227(var1);
            field2938[var0] = null;
        }
        class26.field320 = 0;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lhi;BI)V")
    public final void method20(class264 arg0, byte arg1, int arg2) {
        ++field2941;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -4) {
                    this.field2952 = arg0.method1779(-68);
                }
            } else {
                this.field2933 = arg0.method1779(arg1 + -33);
            }
        } else {
            this.field2951 = arg0.method1779(-106);
        }
        if (arg1 != -19) {
            field2937 = null;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V")
    public final void method16(byte arg0) {
        class206.method1389(4096);
        ++field2947;
        if (arg0 != -125) {
            field2938 = null;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ZI)[B")
    public static final byte[] method1262(boolean arg0, int arg1) {
        class295 var2 = (class295) class44.field515.method1579((long) arg1, 0);
        if (var2 == null) {
            Random var3 = new Random((long) arg1);
            byte[] var4 = new byte[512];
            for (int var5 = 0; var5 < 255; ++var5) {
                var4[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; ++var6) {
                int var7 = -var6 + 255;
                int var8 = class256.method1680(var3, (byte) 127, var7);
                byte var9 = var4[var8];
                var4[var8] = var4[var7];
                var4[var7] = var4[-var6 + 511] = var9;
            }
            var2 = new class295(var4);
            class44.field515.method1578(var2, (long) arg1, 50);
        }
        ++field2934;
        if (!arg0) {
            method1260((byte) 58, 69);
        }
        return var2.field4665;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)[I")
    public final int[] method26(int arg0, int arg1) {
        if (arg0 != 0) {
            method1262(true, 58);
        }
        ++field2943;
        int[] var3 = super.field4609.method579((byte) -62, arg1);
        if (super.field4609.field1059) {
            int var4 = class1.field15[arg1];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; var6 < class186.field2986; ++var6) {
                int var7 = class246.field3958[var6];
                int var8 = var7 + -2048 >> 1;
                int var9;
                if (this.field2951 == 0) {
                    var9 = (var7 - var4) * this.field2952;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field2952 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (-4096 & var9);
                if (~this.field2933 == -1) {
                    var12 = class50.field709[(var12 & 4090) >> 4] + 4096 >> 1;
                } else if (this.field2933 == 2) {
                    var12 -= 2048;
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    var12 = -var12 + 2048 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
    public class184() {
        super(0, true);
    }
}
