import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class229 extends class107 {

    @OriginalMember(owner = "client!lf", name = "D", descriptor = "I")
    private int field3578 = -1;

    @OriginalMember(owner = "client!lf", name = "H", descriptor = "Ljava/lang/String;")
    public static String field3582 = "Loading defaults - ";

    @OriginalMember(owner = "client!lf", name = "J", descriptor = "Lch;")
    public static class306 field3584 = new class306(5000);

    @OriginalMember(owner = "client!lf", name = "T", descriptor = "Ljava/lang/String;")
    public static String field3594 = "wave:";

    @OriginalMember(owner = "client!lf", name = "V", descriptor = "[I")
    public static int[] field3596 = new int[1000];

    @OriginalMember(owner = "client!lf", name = "U", descriptor = "Z")
    public static boolean field3595 = false;

    @OriginalMember(owner = "client!lf", name = "E", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!lf", name = "G", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!lf", name = "I", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!lf", name = "K", descriptor = "I")
    private int field3585;

    @OriginalMember(owner = "client!lf", name = "L", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!lf", name = "N", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!lf", name = "O", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!lf", name = "P", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!lf", name = "Q", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!lf", name = "R", descriptor = "I")
    private int field3592;

    @OriginalMember(owner = "client!lf", name = "W", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!lf", name = "S", descriptor = "Lfe;")
    public static class277 field3593;

    @OriginalMember(owner = "client!lf", name = "F", descriptor = "[I")
    private int[] field3580;

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
    public class229() {
        super(0, false);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILgi;I)Lrc;")
    public static final class70 method1586(int arg0, class164 arg1, int arg2) {
        ++field3579;
        byte[] var3 = arg1.method1142(arg2, -10363);
        if (var3 == null) {
            return null;
        } else {
            int var4 = 65 % ((-35 - arg0) / 56);
            return new class70(var3);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)[[I")
    public final int[][] method190(int arg0, byte arg1) {
        ++field3587;
        if (arg1 != -117) {
            this.field3580 = null;
        }
        int[][] var3 = super.field1662.method1302(arg0, (byte) 26);
        if (super.field1662.field3063 && this.method1587(-128)) {
            int var4 = this.field3585 * (~class153.field2452 != ~this.field3592 ? this.field3592 * arg0 / class153.field2452 : arg0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class24.field443 != this.field3585) {
                for (int var8 = 0; ~class24.field443 < ~var8; ++var8) {
                    int var9 = this.field3585 * var8 / class24.field443;
                    int var10 = this.field3580[var4 - -var9];
                    var7[var8] = class233.method1609(255, var10) << 4;
                    var6[var8] = class233.method1609(var10, 65280) >> 4;
                    var5[var8] = class233.method1609(var10 >> 12, 4080);
                }
            } else {
                for (int var11 = 0; ~class24.field443 < ~var11; ++var11) {
                    int var12 = this.field3580[var4++];
                    var7[var11] = class233.method1609(255, var12) << 4;
                    var6[var11] = class233.method1609(65280, var12) >> 4;
                    var5[var11] = class233.method1609(4080, var12 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)Z")
    private final boolean method1587(int arg0) {
        ++field3581;
        if (this.field3580 != null) {
            return true;
        } else if (this.field3578 >= 0) {
            int var2 = class24.field443;
            int var3 = class153.field2452;
            int var4 = class174.field2905.method746(this.field3578, -8213).field1057 ? 64 : 128;
            this.field3580 = class174.field2905.method747(false, var4, var4, 1.0F, this.field3578, 1536);
            this.field3592 = var4;
            this.field3585 = var4;
            class54.method340((byte) 88, var2, var3);
            return this.field3580 != null;
        } else {
            int var5 = -61 % ((-64 - arg0) / 60);
            return false;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILfj;B)V")
    public final void method195(int arg0, class274 arg1, byte arg2) {
        if (arg2 == 28) {
            if (~arg0 == -1) {
                this.field3578 = arg1.method1837(252);
            }
            ++field3589;
        }
    }

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "(I)V")
    public static void method1588(int arg0) {
        field3594 = null;
        field3596 = null;
        field3584 = null;
        field3582 = null;
        if (arg0 != 2) {
            method1586(-119, (class164) null, -77);
        }
        field3593 = null;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)V")
    public final void method753(byte arg0) {
        if (arg0 < 62) {
            this.method755((byte) 74);
        }
        super.method753((byte) 111);
        this.field3580 = null;
        ++field3583;
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(B)I")
    public final int method755(byte arg0) {
        ++field3588;
        int var2 = -36 % ((-49 - arg0) / 58);
        return this.field3578;
    }
}
