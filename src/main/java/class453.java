import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class453 {

    @OriginalMember(owner = "client!ou", name = "h", descriptor = "Ld;")
    private class242 field6740 = new class242(256);

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "Ltt;")
    private class249 field6735;

    @OriginalMember(owner = "client!ou", name = "g", descriptor = "Ll;")
    private class127 field6739;

    @OriginalMember(owner = "client!ou", name = "e", descriptor = "[I")
    public static int[] field6737 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ou", name = "j", descriptor = "Lnv;")
    public static class44 field6742 = new class44();

    @OriginalMember(owner = "client!ou", name = "l", descriptor = "Z")
    public static boolean field6744 = false;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "I")
    public static int field6733;

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "I")
    public static int field6734;

    @OriginalMember(owner = "client!ou", name = "d", descriptor = "I")
    public static int field6736;

    @OriginalMember(owner = "client!ou", name = "f", descriptor = "I")
    public static int field6738;

    @OriginalMember(owner = "client!ou", name = "i", descriptor = "I")
    public static int field6741;

    @OriginalMember(owner = "client!ou", name = "k", descriptor = "I")
    public static int field6743;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)V", line = 9)
    public final void method2774(int arg0) {
        if (arg0 > -22) {
            this.field6739 = null;
        }
        field6733++;
        this.field6740.method1637((byte) 13);
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(I[J[I)V", line = 21)
    public static final void method2775(int arg0, long[] arg1, int[] arg2) {
        class281.method1897(arg2, arg1.length - 1, 0, -31866, arg1);
        field6741++;
        if (arg0 != -22367) {
            method2779(-34);
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(II)Lcd;", line = 38)
    public final class65 method2776(int arg0, int arg1) {
        field6743++;
        Object var3 = this.field6740.method1634((long) arg0, arg1);
        if (var3 != null) {
            return (class65) var3;
        } else if (this.field6739.method936(arg0, (byte) -119)) {
            class420 var4 = this.field6739.method938(28923, arg0);
            int var5 = var4.field6170 ? 64 : this.field6735.field3906;
            class65 var7;
            if (var4.field6163 && this.field6735.method544()) {
                float[] var6 = this.field6739.method940(0.7F, var5, false, (byte) 71, arg0, var5);
                var7 = new class65(this.field6735, 3553, 34842, var5, var5, var4.field6156 != 0, var6, 6408);
            } else {
                int[] var8;
                if (var4.field6168) {
                    var8 = this.field6739.method937(arg0, arg1 - 15810, var5, false, var5, 0.7F);
                } else {
                    var8 = this.field6739.method939(var5, arg1 - 8571, arg0, var5, false, 0.7F);
                }
                var7 = new class65(this.field6735, 3553, 6408, var5, var5, var4.field6156 != 0, var8, false);
            }
            var7.method437(var4.field6180, (byte) -125, var4.field6157);
            this.field6740.method1623((long) arg0, arg1 ^ 0x4495, var7);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 82)
    public static final int method2777(String arg0, int arg1) {
        field6734++;
        return arg1 == 10 ? class168.method1200(false, arg0, true, 10) : 100;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(B)V", line = 93)
    public final void method2778(byte arg0) {
        this.field6740.method1631(5, (byte) -19);
        field6738++;
        int var2 = 113 % ((arg0 + 3) / 61);
    }

    @OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Ltt;Ll;)V", line = 120)
    public class453(class249 arg0, class127 arg1) {
        this.field6735 = arg0;
        this.field6739 = arg1;
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)V", line = 107)
    public static void method2779(int arg0) {
        if (arg0 != 64) {
            method2779(-59);
        }
        field6737 = null;
        field6742 = null;
    }
}
