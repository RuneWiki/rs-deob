import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class121 extends class222 {

    @OriginalMember(owner = "client!tc", name = "Z", descriptor = "I")
    private int field2220 = 0;

    @OriginalMember(owner = "client!tc", name = "fb", descriptor = "I")
    private int field2226 = 1;

    @OriginalMember(owner = "client!tc", name = "kb", descriptor = "I")
    private int field2231 = 0;

    @OriginalMember(owner = "client!tc", name = "cb", descriptor = "Lsb;")
    public static class98 field2223 = class47.method368("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", 0);

    @OriginalMember(owner = "client!tc", name = "Y", descriptor = "I")
    public static int field2219 = 0;

    @OriginalMember(owner = "client!tc", name = "W", descriptor = "Lsb;")
    public static class98 field2217 = class47.method368("Ladevorgang )2 bitte warten Sie)3", 0);

    @OriginalMember(owner = "client!tc", name = "jb", descriptor = "Lgj;")
    public static class226 field2230 = new class226(100);

    @OriginalMember(owner = "client!tc", name = "X", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!tc", name = "ab", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!tc", name = "bb", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!tc", name = "db", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!tc", name = "eb", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!tc", name = "gb", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!tc", name = "hb", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!tc", name = "ib", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
    public class121() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "(I)V")
    public static void method904(int arg0) {
        if (arg0 == 4096) {
            field2217 = null;
            field2230 = null;
            field2223 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZIIII)V")
    public static final void method905(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        class132.field2353 = (short) arg4;
        if (arg3 > -65) {
            method904(-28);
        }
        ++field2225;
        class45.field750 = (short) arg2;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V")
    public final void method288(int arg0) {
        ++field2221;
        class133.method1002(0);
        int var2 = 27 / ((57 - arg0) / 51);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        ++field2218;
        if (arg0 < 35) {
            this.field2220 = 106;
        }
        int[] var3 = super.field3844.method22(0, arg1);
        if (super.field3844.field61) {
            int var4 = class214.field3639[arg1];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; var6 < class13.field253; ++var6) {
                int var7 = class261.field4577[var6];
                int var8 = var7 - 2048 >> 1;
                int var11;
                if (~this.field2231 != -1) {
                    int var9 = var8 * var8 - -(var5 * var5) >> 12;
                    int var10 = (int) (4096.0D * Math.sqrt((double) ((float) var9 / 4096.0F)));
                    var11 = (int) ((double) (this.field2226 * var10) * 3.141592653589793D);
                } else {
                    var11 = (-var4 + var7) * this.field2226;
                }
                int var12 = var11 - (var11 & -4096);
                if (this.field2220 != 0) {
                    if (this.field2220 == 2) {
                        var12 -= 2048;
                        if (~var12 > -1) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                } else {
                    var12 = class33.field573[var12 >> 4 & 255] + 4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Llj;ZI)V")
    public final void method3(class216 arg0, boolean arg1, int arg2) {
        if (arg1) {
            field2224 = -20;
        }
        ++field2229;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -4) {
                    this.field2226 = arg0.method1446(5350);
                }
            } else {
                this.field2220 = arg0.method1446(5350);
            }
        } else {
            this.field2231 = arg0.method1446(5350);
        }
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "(II)V")
    public static final void method906(int arg0, int arg1) {
        class23.field464.method1561(-106, arg1);
        if (arg0 < 101) {
            field2230 = null;
        }
        class255.field4528.method1561(-83, arg1);
        ++field2222;
        class255.field4509.method1561(-55, arg1);
        class116.field2074.method1561(-128, arg1);
    }
}
