import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class128 extends class310 {

    @OriginalMember(owner = "client!ke", name = "N", descriptor = "[I")
    public static int[] field2166 = new int[100];

    @OriginalMember(owner = "client!ke", name = "Q", descriptor = "[Ljava/lang/String;")
    public static String[] field2169 = new String[200];

    @OriginalMember(owner = "client!ke", name = "M", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2165 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!ke", name = "L", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!ke", name = "O", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!ke", name = "K", descriptor = "Lna;")
    public static class145 field2163;

    @OriginalMember(owner = "client!ke", name = "P", descriptor = "[[I")
    public static int[][] field2168;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(I)V", line = 6)
    public static void method987(int arg0) {
        field2169 = null;
        field2168 = (int[][]) null;
        field2166 = null;
        field2165 = null;
        if (arg0 <= 11) {
            field2168 = (int[][]) ((int[][]) null);
        }
        field2163 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)[I", line = 24)
    public final int[] method77(int arg0, int arg1) {
        if (arg1 == -13093) {
            field2164++;
            return class293.field4737;
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V", line = 41)
    public class128() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "(B)V", line = 45)
    public static final void method988(byte arg0) {
        class105.field1704.method1266(0);
        if (arg0 != -121) {
            field2168 = (int[][]) ((int[][]) null);
        }
        class196.field3121.method915((byte) 65);
        field2167++;
        class26.field319.method915((byte) -77);
    }
}
