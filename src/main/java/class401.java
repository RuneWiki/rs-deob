import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class401 extends class72 {

    @OriginalMember(owner = "client!wk", name = "H", descriptor = "[I")
    public static int[] field5995 = new int[256];

    @OriginalMember(owner = "client!wk", name = "G", descriptor = "Lnn;")
    public static class214 field5994 = new class214(3, 5);

    @OriginalMember(owner = "client!wk", name = "K", descriptor = "Ldf;")
    public static class546 field5998 = new class546(0, -1);

    @OriginalMember(owner = "client!wk", name = "M", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field6000 = new Hashtable();

    @OriginalMember(owner = "client!wk", name = "O", descriptor = "I")
    public static int field6002 = 0;

    @OriginalMember(owner = "client!wk", name = "P", descriptor = "F")
    public static float field6003;

    @OriginalMember(owner = "client!wk", name = "E", descriptor = "I")
    public static int field5992;

    @OriginalMember(owner = "client!wk", name = "F", descriptor = "I")
    public static int field5993;

    @OriginalMember(owner = "client!wk", name = "I", descriptor = "I")
    public static int field5996;

    @OriginalMember(owner = "client!wk", name = "L", descriptor = "I")
    public static int field5999;

    @OriginalMember(owner = "client!wk", name = "N", descriptor = "Lqb;")
    public static class626 field6001;

    @OriginalMember(owner = "client!wk", name = "J", descriptor = "[B")
    private byte[] field5997;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "(I)V")
    public static void method2452(int arg0) {
        field5995 = null;
        if (arg0 != 10794) {
            method2452(-51);
        }
        field5998 = null;
        field6000 = null;
        field6001 = null;
        field5994 = null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIBI)[B")
    public final byte[] method2453(int arg0, int arg1, byte arg2, int arg3) {
        this.field5997 = new byte[arg3 * 2 * arg0 * arg1];
        field5996++;
        this.method1864(arg0, (byte) 15, arg3, arg1);
        if (arg2 != 112) {
            field6003 = -0.69506F;
        }
        return this.field5997;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IC)Z")
    public static final boolean method2454(int arg0, char arg1) {
        field5993++;
        int var2 = 82 / ((-arg0 - 4) / 50);
        return arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "()V")
    public class401() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IBI)V")
    public final void method702(int arg0, byte arg1, int arg2) {
        field5992++;
        int var4 = arg2 * 2;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field5997[var10001] = -1;
        if (arg0 != 16567) {
            this.method702(-102, (byte) -21, -12);
        }
        int var5 = arg1 & 0xFF;
        this.field5997[var6] = (byte) (var5 * 3 >> 5);
    }
}
