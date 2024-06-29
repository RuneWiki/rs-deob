import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class166 extends class99 {

    @OriginalMember(owner = "client!di", name = "T", descriptor = "Lh;")
    public static class103 field2985 = new class103();

    @OriginalMember(owner = "client!di", name = "W", descriptor = "I")
    public static int field2988 = -1;

    @OriginalMember(owner = "client!di", name = "X", descriptor = "Lr;")
    private static class66 field2989 = class93.method641(43, "Allocated memory");

    @OriginalMember(owner = "client!di", name = "V", descriptor = "Lr;")
    public static class66 field2987 = field2989;

    @OriginalMember(owner = "client!di", name = "Z", descriptor = "Lr;")
    private static class66 field2991 = class93.method641(43, "Checking for updates )2 ");

    @OriginalMember(owner = "client!di", name = "Y", descriptor = "Lr;")
    public static class66 field2990 = field2991;

    @OriginalMember(owner = "client!di", name = "U", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2986 = new BigInteger("9431484119947534773405476242098823416177206852045075556673005859802229236458585051597844837479119770056361726819094346360070592289857694387401749674169083");

    @OriginalMember(owner = "client!di", name = "Q", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!di", name = "R", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!di", name = "S", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!di", name = "ab", descriptor = "Lsg;")
    public static class247 field2992;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method37(int arg0, boolean arg1) {
        ++field2982;
        int[][] var3 = super.field1946.method823(arg0, (byte) 54);
        if (!arg1) {
            return null;
        } else {
            if (super.field1946.field2297) {
                int[][] var4 = this.method683(-31, 0, arg0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[2];
                int[] var10 = var3[1];
                for (int var11 = 0; ~class199.field3432 < ~var11; ++var11) {
                    var8[var11] = -var5[var11] + 4096;
                    var10[var11] = -var6[var11] + 4096;
                    var9[var11] = 4096 - var7[var11];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!di", name = "g", descriptor = "(I)V")
    public static void method1129(int arg0) {
        field2989 = null;
        field2991 = null;
        field2992 = null;
        field2987 = null;
        if (arg0 == 4096) {
            field2986 = null;
            field2990 = null;
            field2985 = null;
        }
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "()V")
    public class166() {
        super(1, false);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BI)[I")
    public final int[] method10(byte arg0, int arg1) {
        int[] var3 = super.field1943.method749(false, arg1);
        if (super.field1943.field2147) {
            int[] var4 = this.method682(0, arg1, 29149);
            for (int var5 = 0; class199.field3432 > var5; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        if (arg0 != -61) {
            this.method11((class249) null, -83, 113);
        }
        ++field2983;
        return var3;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Llh;II)V")
    public final void method11(class249 arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            field2992 = null;
        }
        if (arg1 == 0) {
            super.field1938 = ~arg0.method1677(-6677) == -2;
        }
        ++field2984;
    }
}
