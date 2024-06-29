import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class620 {

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "Ljda;")
    public static class240 field8626 = new class240();

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "[C")
    private static char[] field8628 = new char[64];

    @OriginalMember(owner = "client!kq", name = "g", descriptor = "Lfja;")
    public static class783 field8630;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "I")
    public static int field8624;

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "I")
    public static int field8625;

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "I")
    public static int field8627;

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "I")
    public static int field8629;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field8628[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field8628[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field8628[var2] = (char) (var2 + 48 - 52);
        }
        field8628[62] = '*';
        field8628[63] = '-';
        field8630 = new class783(127, 8);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method3491(int arg0, int arg1, int arg2) {
        if (arg0 != 32720) {
            field8626 = null;
        }
        field8625++;
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V", line = 14)
    public static void method3492(int arg0) {
        field8630 = null;
        if (arg0 != 0) {
            method3491(1, -34, 62);
        }
        field8628 = null;
        field8626 = null;
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(I)I", line = 26)
    public static final int method3493(int arg0) {
        field8629++;
        if (class668.field9303 == null) {
            return 0;
        } else {
            int var1 = -29 / ((9 - arg0) / 57);
            return class668.field9303.length * 2;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IFFFI)F", line = 52)
    public static final float method3494(int arg0, float arg1, float arg2, float arg3, int arg4) {
        if (arg4 == 1) {
            field8627++;
            float[] var5 = class16.field234[arg0];
            return var5[2] * arg3 + var5[1] * arg1 + var5[0] * arg2;
        } else {
            return -0.3605989F;
        }
    }
}
