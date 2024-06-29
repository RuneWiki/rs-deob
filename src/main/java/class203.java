import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class203 {

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
    private int field2838;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
    public int field2839;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    public int field2836;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "B")
    public byte field2842;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "I")
    public int field2843;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "Lig;")
    public class203 field2841;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public int field2833;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
    public int field2840;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "I")
    public int field2844;

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "I")
    public int field2846;

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "I")
    public int field2847;

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "I")
    public int field2848;

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "I")
    public int field2849;

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!ig", name = "s", descriptor = "I")
    public int field2851;

    @OriginalMember(owner = "client!ig", name = "t", descriptor = "I")
    public int field2852;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "Ldaa;")
    public static class11 field2837;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BLjava/lang/String;)[B")
    public static final byte[] method1227(byte arg0, String arg1) {
        if (arg0 >= -30) {
            field2850 = 10;
        }
        field2834++;
        int var2 = arg1.length();
        if (var2 == 0) {
            return new byte[0];
        }
        int var3 = var2 + 3 & 0xFFFFFFFC;
        int var4 = var3 / 4 * 3;
        if ((var3 - 2) >= var2 || class386.method2262(arg1.charAt(var3 - 2), 127) == -1) {
            var4 -= 2;
        } else if (var3 - 1 >= var2 || class386.method2262(arg1.charAt(var3 - 1), 82) == -1) {
            var4--;
        }
        byte[] var5 = new byte[var4];
        class63.method538(var5, 3, arg1, 0);
        return var5;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIII)Lig;")
    public final class203 method1228(int arg0, int arg1, int arg2, int arg3) {
        field2845++;
        int var5 = -52 % ((arg3 + 9) / 41);
        return new class203(this.field2838, arg1, arg0, arg2, this.field2842);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)Ltb;")
    public final class337 method1229(int arg0) {
        if (arg0 > -99) {
            return null;
        } else {
            field2835++;
            return class184.method1152(-22, this.field2838);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V")
    public static void method1230(byte arg0) {
        if (arg0 <= 103) {
            method1227((byte) -50, null);
        }
        field2837 = null;
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(IIIIB)V")
    public class203(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field2838 = arg0;
        this.field2839 = arg2;
        this.field2836 = arg1;
        this.field2842 = arg4;
        this.field2843 = arg3;
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lig;I)V")
    public class203(class203 arg0, int arg1) {
        this.field2841 = arg0;
        this.field2838 = this.field2841.field2838;
        this.field2842 = this.field2841.field2842;
        this.field2839 = this.field2841.field2839 + arg1;
        this.field2836 = this.field2841.field2836 + arg1;
        this.field2843 = this.field2841.field2843 + arg1;
    }
}
