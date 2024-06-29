import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class258 extends class198 {

    @OriginalMember(owner = "client!dc", name = "M", descriptor = "I")
    private int field4236 = 20;

    @OriginalMember(owner = "client!dc", name = "P", descriptor = "I")
    private int field4239 = 0;

    @OriginalMember(owner = "client!dc", name = "K", descriptor = "I")
    private int field4234 = 1365;

    @OriginalMember(owner = "client!dc", name = "Q", descriptor = "I")
    private int field4240 = 0;

    @OriginalMember(owner = "client!dc", name = "L", descriptor = "Ljava/lang/String;")
    public static String field4235 = "scroll:";

    @OriginalMember(owner = "client!dc", name = "J", descriptor = "Lwa;")
    public static class281 field4233 = new class281();

    @OriginalMember(owner = "client!dc", name = "R", descriptor = "Lfd;")
    public static class130 field4241 = new class130(8);

    @OriginalMember(owner = "client!dc", name = "V", descriptor = "I")
    public static int field4245 = 0;

    @OriginalMember(owner = "client!dc", name = "W", descriptor = "I")
    public static int field4246 = 0;

    @OriginalMember(owner = "client!dc", name = "X", descriptor = "Lec;")
    public static class25 field4247 = new class25(64);

    @OriginalMember(owner = "client!dc", name = "Z", descriptor = "[I")
    public static int[] field4249 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!dc", name = "N", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!dc", name = "O", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!dc", name = "S", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!dc", name = "T", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!dc", name = "U", descriptor = "Lh;")
    public static class294 field4244;

    @OriginalMember(owner = "client!dc", name = "Y", descriptor = "[I")
    public static int[] field4248;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(II)V")
    public static final void method1797(int arg0, int arg1) {
        int var2 = 0 % ((-68 - arg1) / 32);
        if (class242.field3835 == null || class242.field3835.length < arg0) {
            class242.field3835 = new int[arg0];
        }
        ++field4238;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILma;I)V")
    public final void method52(int arg0, class202 arg1, int arg2) {
        ++field4242;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (~arg2 == -4) {
                        this.field4239 = arg1.method1419(86);
                    }
                } else {
                    this.field4240 = arg1.method1419(91);
                }
            } else {
                this.field4236 = arg1.method1419(96);
            }
        } else {
            this.field4234 = arg1.method1419(123);
        }
        int var5 = -41 % ((60 - arg0) / 61);
    }

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "(I)V")
    public static void method1798(int arg0) {
        if (arg0 != 2) {
            method1798(-73);
        }
        field4247 = null;
        field4233 = null;
        field4249 = null;
        field4235 = null;
        field4241 = null;
        field4244 = null;
        field4248 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZI)[I")
    public final int[] method32(boolean arg0, int arg1) {
        ++field4237;
        int[] var3 = super.field3134.method36(arg1, 30672);
        if (!arg0) {
            this.field4239 = 41;
        }
        if (super.field3134.field69) {
            for (int var4 = 0; ~class42.field590 < ~var4; ++var4) {
                int var5 = (class152.field2367[var4] << 12) / this.field4234 + this.field4240;
                int var6 = (class42.field591[arg1] << 12) / this.field4234 + this.field4239;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var5 * var5 >> 12;
                int var11 = var6 * var6 >> 12;
                int var12 = var6;
                int var13 = 0;
                while (~(var10 + var11) > -16385 && this.field4236 > var13) {
                    ++var13;
                    var12 = (var9 * var12 >> 12) * 2 + var8;
                    var9 = -var11 + var7 + var10;
                    var10 = var9 * var9 >> 12;
                    var11 = var12 * var12 >> 12;
                }
                var3[var4] = ~var13 > ~(this.field4236 + -1) ? (var13 << 12) / this.field4236 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
    public class258() {
        super(0, true);
    }
}
