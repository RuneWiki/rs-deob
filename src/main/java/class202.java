import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class202 extends class147 {

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "[B")
    public byte[] field3143;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "Lna;")
    private static class26 field3140 = class69.method505("wishes to trade with you)3", (byte) -127);

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "[I")
    public static int[] field3142 = new int[32];

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "Lna;")
    public static class26 field3139 = field3140;

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "[[B")
    public static byte[][] field3141;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V", line = 5)
    public static void method1362(int arg0) {
        field3142 = null;
        field3141 = (byte[][]) null;
        field3139 = null;
        if (arg0 != 2) {
            method1363((float[]) null, 91);
        }
        field3140 = null;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3142[var1] = var0 - 1;
            var0 += var0;
        }
        field3146 = 1;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "([FI)[F", line = 33)
    public static final float[] method1363(float[] arg0, int arg1) {
        field3144++;
        if (arg0 == null) {
            return null;
        } else {
            float[] var2 = new float[arg0.length];
            class75.method539(arg0, arg1, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "([B)V", line = 57)
    public class202(byte[] arg0) {
        this.field3143 = arg0;
    }
}
