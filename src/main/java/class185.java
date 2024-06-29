import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class185 extends class110 {

    @OriginalMember(owner = "client!sj", name = "w", descriptor = "I")
    private final int field3169;

    @OriginalMember(owner = "client!sj", name = "s", descriptor = "I")
    private final int field3165;

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "I")
    private final int field3162;

    @OriginalMember(owner = "client!sj", name = "u", descriptor = "I")
    private final int field3167;

    @OriginalMember(owner = "client!sj", name = "v", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3168 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!sj", name = "x", descriptor = "[I")
    public static int[] field3170 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0 };

    @OriginalMember(owner = "client!sj", name = "B", descriptor = "I")
    public static int field3174 = 0;

    @OriginalMember(owner = "client!sj", name = "y", descriptor = "[I")
    public static int[] field3171 = new int[5];

    @OriginalMember(owner = "client!sj", name = "D", descriptor = "[I")
    public static int[] field3176 = new int[1000];

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!sj", name = "t", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!sj", name = "C", descriptor = "Lma;")
    public static class105 field3175;

    @OriginalMember(owner = "client!sj", name = "z", descriptor = "[I")
    public static int[] field3172;

    @OriginalMember(owner = "client!sj", name = "A", descriptor = "[[[Lhb;")
    public static class3[][][] field3173;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIB)V")
    public final void method165(int arg0, int arg1, byte arg2) {
        if (arg2 != -53) {
            field3176 = null;
        }
        ++field3166;
        int var4 = this.field3162 * arg0 >> 12;
        int var5 = this.field3167 * arg1 >> 12;
        int var6 = this.field3169 * arg0 >> 12;
        int var7 = this.field3165 * arg1 >> 12;
        class210.method1351(var5, var6, var4, super.field1951, var7, 13193);
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(III)V")
    public final void method164(int arg0, int arg1, int arg2) {
        int var4 = this.field3169 * arg0 >> 12;
        ++field3160;
        int var5 = this.field3167 * arg1 >> 12;
        if (arg2 != 32768) {
            this.method165(-22, -118, (byte) -42);
        }
        int var6 = this.field3162 * arg0 >> 12;
        int var7 = this.field3165 * arg1 >> 12;
        class69.method457(var5, -4, var6, var4, var7, super.field1950, super.field1951, super.field1942);
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(B)V")
    public static void method1233(byte arg0) {
        field3176 = null;
        field3175 = null;
        field3171 = null;
        field3170 = null;
        field3173 = null;
        field3168 = null;
        if (arg0 <= -125) {
            field3172 = null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(IIIIIII)V")
    public class185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3169 = arg2;
        this.field3165 = arg3;
        this.field3162 = arg0;
        this.field3167 = arg1;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BII)V")
    public final void method162(byte arg0, int arg1, int arg2) {
        int var4 = -91 % ((arg0 - 48) / 42);
        ++field3164;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIII)V")
    public static final void method1234(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 >= class149.field2603 && arg4 <= class141.field2493) {
            int var5 = class93.method673(class246.field4355, (byte) 45, class96.field1632, arg0);
            int var6 = class93.method673(class246.field4355, (byte) 45, class96.field1632, arg3);
            class243.method1585((byte) 58, var5, arg4, var6, arg1);
        }
        ++field3161;
        if (arg2 >= -85) {
            field3172 = null;
        }
    }
}
