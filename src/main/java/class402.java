import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class402 extends class302 {

    @OriginalMember(owner = "client!ul", name = "x", descriptor = "I")
    private int field6050;

    @OriginalMember(owner = "client!ul", name = "q", descriptor = "I")
    private int field6043;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
    private int field6036;

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "I")
    private int field6039;

    @OriginalMember(owner = "client!ul", name = "p", descriptor = "I")
    private int field6042;

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "I")
    private int field6040;

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "I")
    private int field6041;

    @OriginalMember(owner = "client!ul", name = "u", descriptor = "I")
    private int field6047;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "Z")
    public static boolean field6034 = false;

    @OriginalMember(owner = "client!ul", name = "r", descriptor = "I")
    public static int field6044 = 0;

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "Ljava/lang/String;")
    public static String field6037 = "";

    @OriginalMember(owner = "client!ul", name = "v", descriptor = "[[I")
    public static int[][] field6048 = new int[128][128];

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "Lri;")
    public static class73 field6035 = new class73(106, -1);

    @OriginalMember(owner = "client!ul", name = "A", descriptor = "I")
    public static int field6053 = 0;

    @OriginalMember(owner = "client!ul", name = "z", descriptor = "Ljava/util/Random;")
    public static Random field6052 = new Random();

    @OriginalMember(owner = "client!ul", name = "B", descriptor = "S")
    public static short field6054 = 205;

    @OriginalMember(owner = "client!ul", name = "D", descriptor = "[I")
    public static int[] field6055 = new int[16];

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "I")
    public static int field6038;

    @OriginalMember(owner = "client!ul", name = "t", descriptor = "I")
    public static int field6046;

    @OriginalMember(owner = "client!ul", name = "w", descriptor = "I")
    public static int field6049;

    @OriginalMember(owner = "client!ul", name = "y", descriptor = "I")
    public static int field6051;

    @OriginalMember(owner = "client!ul", name = "s", descriptor = "Lum;")
    public static class362 field6045;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(III)V", line = 3)
    public final void method405(int arg0, int arg1, int arg2) {
        if (arg0 != 2) {
            this.method405(-71, -94, 87);
        }
        ++field6051;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIZ)V", line = 15)
    public final void method404(int arg0, int arg1, boolean arg2) {
        ++field6049;
        int var4 = this.field6043 * arg0 >> 12;
        int var5 = this.field6050 * arg1 >> 12;
        int var6 = this.field6039 * arg0 >> 12;
        int var7 = this.field6036 * arg1 >> 12;
        int var8 = this.field6041 * arg0 >> 12;
        if (arg2) {
            int var9 = this.field6042 * arg1 >> 12;
            int var10 = this.field6047 * arg0 >> 12;
            int var11 = this.field6040 * arg1 >> 12;
            class64.method376(var4, -27238, var11, var6, super.field4273, var7, var10, var8, var9, var5);
        }
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 43)
    public class402(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field6050 = arg1;
        this.field6043 = arg0;
        this.field6036 = arg3;
        this.field6039 = arg2;
        this.field6042 = arg5;
        this.field6040 = arg7;
        this.field6041 = arg4;
        this.field6047 = arg6;
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(III)V", line = 61)
    public final void method403(int arg0, int arg1, int arg2) {
        if (arg1 == 4802) {
            ++field6038;
        }
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(B)V", line = 83)
    public static void method2424(byte arg0) {
        field6048 = null;
        field6035 = null;
        int var1 = 12 / ((-20 - arg0) / 51);
        field6045 = null;
        field6055 = null;
        field6037 = null;
        field6052 = null;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIII)V", line = 121)
    public static final void method2425(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 9180) {
            method2425(109, -79, 112, -3, -11);
        }
        class239.field3551 = arg1;
        class495.field7317 = arg3;
        ++field6046;
        class259.field3814 = arg4;
        class172.field2534 = arg2;
    }
}
