import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iha")
public class class613 {

    @OriginalMember(owner = "client!iha", name = "i", descriptor = "I")
    private int field8244;

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "I")
    private int field8236;

    @OriginalMember(owner = "client!iha", name = "f", descriptor = "I")
    private int field8241;

    @OriginalMember(owner = "client!iha", name = "m", descriptor = "I")
    private int field8248;

    @OriginalMember(owner = "client!iha", name = "l", descriptor = "I")
    public int field8247;

    @OriginalMember(owner = "client!iha", name = "e", descriptor = "I")
    public int field8240;

    @OriginalMember(owner = "client!iha", name = "k", descriptor = "I")
    public int field8246;

    @OriginalMember(owner = "client!iha", name = "g", descriptor = "I")
    public int field8242;

    @OriginalMember(owner = "client!iha", name = "c", descriptor = "I")
    public int field8238;

    @OriginalMember(owner = "client!iha", name = "b", descriptor = "I")
    public int field8237;

    @OriginalMember(owner = "client!iha", name = "h", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field8243 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!iha", name = "n", descriptor = "[I")
    public static int[] field8249 = new int[8];

    @OriginalMember(owner = "client!iha", name = "d", descriptor = "I")
    public static int field8239;

    @OriginalMember(owner = "client!iha", name = "j", descriptor = "I")
    public static int field8245;

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(Z)V", line = 3)
    public static void method3476(boolean arg0) {
        field8249 = null;
        field8243 = null;
        if (arg0) {
            method3476(true);
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(IIII)Z", line = 22)
    public final boolean method3477(int arg0, int arg1, int arg2, int arg3) {
        field8239++;
        if (this.field8247 > arg3 || arg3 > this.field8246) {
            return false;
        } else if (this.field8237 > arg2 || this.field8240 < arg2) {
            return false;
        } else if (arg0 >= this.field8238 && arg0 <= this.field8242) {
            int var5 = arg3 - this.field8236;
            if (arg1 != 8) {
                this.method3478(116, -128, -60, -67, -90, 90, (byte) 122, -40, 109, 65, 12);
            }
            int var6 = arg0 - this.field8241;
            return this.field8244 > (var5 * var5 + var6 * var6);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(IIIIIIBIIII)V", line = 60)
    public final void method3478(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field8236 = arg2;
        if (arg6 != 75) {
            this.field8238 = -91;
        }
        field8245++;
        this.field8241 = arg5;
        this.field8248 = arg9;
        this.field8244 = arg8 * arg8;
        this.field8242 = this.field8241 + arg4;
        this.field8246 = this.field8236 + arg0;
        this.field8240 = this.field8248 + arg3;
        this.field8247 = this.field8236 + arg10;
        this.field8237 = this.field8248 + arg7;
        this.field8238 = this.field8241 + arg1;
    }

    @OriginalMember(owner = "client!iha", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 80)
    public class613(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field8244 = arg3 * arg3;
        this.field8236 = arg0;
        this.field8241 = arg2;
        this.field8248 = arg1;
        this.field8247 = this.field8236 + arg4;
        this.field8240 = this.field8248 + arg7;
        this.field8246 = this.field8236 + arg5;
        this.field8242 = this.field8241 + arg9;
        this.field8238 = this.field8241 + arg8;
        this.field8237 = this.field8248 + arg6;
    }
}
