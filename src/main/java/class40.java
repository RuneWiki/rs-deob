import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class40 extends class142 {

    @OriginalMember(owner = "client!ea", name = "R", descriptor = "[Lai;")
    public static class10[] field666 = new class10[1000];

    @OriginalMember(owner = "client!ea", name = "S", descriptor = "Ljava/util/Random;")
    public static Random field667 = new Random();

    @OriginalMember(owner = "client!ea", name = "W", descriptor = "Ldd;")
    public static class34 field671 = new class34(500);

    @OriginalMember(owner = "client!ea", name = "ab", descriptor = "Lai;")
    public static class10 field675 = class44.method278("<col=80ff00>", -98);

    @OriginalMember(owner = "client!ea", name = "Z", descriptor = "Lai;")
    public static class10 field674 = class44.method278("Versteckt", -127);

    @OriginalMember(owner = "client!ea", name = "bb", descriptor = "I")
    public static int field676 = 127;

    @OriginalMember(owner = "client!ea", name = "X", descriptor = "Ldd;")
    public static class34 field672 = new class34(30);

    @OriginalMember(owner = "client!ea", name = "Q", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!ea", name = "T", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!ea", name = "U", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!ea", name = "V", descriptor = "Lmb;")
    public static class111 field670;

    @OriginalMember(owner = "client!ea", name = "Y", descriptor = "[Lde;")
    public static class35[] field673;

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
    public class40() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)V")
    public static final void method259(int arg0) {
        ++field669;
        class176.field3372.method17(-100);
        for (int var1 = 0; var1 < 32; ++var1) {
            class87.field1546[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; ++var2) {
            class115.field2213[var2] = 0L;
        }
        if (arg0 != 32) {
            method260(-76);
        }
        class61.field1038 = 0;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZI)[I")
    public final int[] method6(boolean arg0, int arg1) {
        int[] var3 = super.field2683.method1186((byte) -114, arg1);
        if (arg0) {
            method259(85);
        }
        if (super.field2683.field3516) {
            int[][] var4 = this.method961(2, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~class133.field2499 < ~var8; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        ++field665;
        return var3;
    }

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "(I)V")
    public static void method260(int arg0) {
        field667 = null;
        field666 = null;
        field674 = null;
        field672 = null;
        field671 = null;
        field675 = null;
        field670 = null;
        if (arg0 == 3) {
            field673 = null;
        }
    }
}
