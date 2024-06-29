import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class245 {

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public int field3885 = 0;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
    public int field3892 = 0;

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "Z")
    private boolean field3900 = false;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "F")
    public static float field3887 = 0.0F;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "Loe;")
    public static class57 field3897 = new class57();

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public int field3886;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
    public int field3889;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
    public int field3891;

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "I")
    private int field3895;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
    public int field3896;

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "I")
    public int field3898;

    @OriginalMember(owner = "client!wi", name = "r", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!wi", name = "s", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!wi", name = "t", descriptor = "I")
    public int field3904;

    @OriginalMember(owner = "client!wi", name = "u", descriptor = "I")
    public int field3905;

    @OriginalMember(owner = "client!wi", name = "w", descriptor = "I")
    public int field3907;

    @OriginalMember(owner = "client!wi", name = "x", descriptor = "I")
    public int field3908;

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "J")
    public long field3899;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "Ldk;")
    public static class251 field3894;

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "[S")
    public static short[] field3901;

    @OriginalMember(owner = "client!wi", name = "v", descriptor = "[[I")
    public static int[][] field3906;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IBLwd;)V")
    private final void method1636(int arg0, byte arg1, class162 arg2) {
        if (arg0 == 1) {
            this.field3895 = arg2.method1142(-18970);
        } else if (arg0 == 2) {
            arg2.method1133((byte) 53);
        } else if (arg0 == 3) {
            this.field3908 = arg2.method1157(65280);
            this.field3896 = arg2.method1157(65280);
            this.field3891 = arg2.method1157(65280);
        } else if (arg0 == 4) {
            this.field3907 = arg2.method1133((byte) 53);
            this.field3886 = arg2.method1157(65280);
        } else if (arg0 == 6) {
            this.field3905 = arg2.method1133((byte) 53);
        } else if (arg0 == 8) {
            this.field3885 = 1;
        } else if (arg0 == 9) {
            this.field3892 = 1;
        } else if (arg0 == 10) {
            this.field3900 = true;
        }
        field3890++;
        if (arg1 <= 4) {
            this.method1636(-109, (byte) 42, (class162) null);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lwd;B)V")
    public final void method1637(class162 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1133((byte) 53);
            if (var3 == 0) {
                field3888++;
                if (arg1 != -21) {
                    this.method1636(115, (byte) 113, (class162) null);
                    return;
                }
                return;
            }
            this.method1636(var3, (byte) 117, arg0);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
    public static void method1638(int arg0) {
        field3894 = null;
        field3897 = null;
        field3901 = null;
        if (arg0 == 0) {
            field3906 = null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)V")
    public final void method1639(int arg0) {
        this.field3904 = class302.field4824[this.field3895];
        field3902++;
        this.field3889 = (int) Math.sqrt((double) (this.field3908 * this.field3908 + (this.field3896 * this.field3896) + (this.field3891 * this.field3891)));
        if (this.field3886 == 0) {
            this.field3886 = 1;
        }
        if (this.field3907 == 0) {
            this.field3899 = 2147483647L;
        } else if (this.field3907 == 1) {
            this.field3899 = (long) (this.field3889 * 8 / this.field3886);
            this.field3899 *= this.field3899;
        } else if (this.field3907 == 2) {
            this.field3899 = (long) (this.field3889 * 8 / this.field3886);
        }
        if (arg0 != 8881) {
            field3903 = -115;
        }
        if (this.field3900) {
            this.field3889 *= -1;
        }
    }
}
