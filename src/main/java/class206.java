import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class206 extends class8 {

    @OriginalMember(owner = "client!ll", name = "S", descriptor = "I")
    private int field3305 = -1;

    @OriginalMember(owner = "client!ll", name = "L", descriptor = "[S")
    public static short[] field3298 = new short[256];

    @OriginalMember(owner = "client!ll", name = "K", descriptor = "Ljava/lang/String;")
    public static String field3297 = "Prepared sound engine";

    @OriginalMember(owner = "client!ll", name = "X", descriptor = "Lvj;")
    public static class115 field3310 = new class115();

    @OriginalMember(owner = "client!ll", name = "I", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!ll", name = "J", descriptor = "I")
    private int field3296;

    @OriginalMember(owner = "client!ll", name = "M", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!ll", name = "N", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!ll", name = "O", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!ll", name = "P", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!ll", name = "Q", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!ll", name = "R", descriptor = "I")
    private int field3304;

    @OriginalMember(owner = "client!ll", name = "U", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!ll", name = "V", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!ll", name = "W", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!ll", name = "T", descriptor = "[I")
    private int[] field3306;

    @OriginalMember(owner = "client!ll", name = "Y", descriptor = "[[[B")
    public static byte[][][] field3311;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "(Z)V")
    public static void method1422(boolean arg0) {
        field3297 = null;
        field3310 = null;
        field3298 = null;
        if (arg0) {
            field3311 = null;
        }
    }

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "(I)Z")
    private final boolean method1423(int arg0) {
        if (arg0 >= -11) {
            return false;
        } else {
            ++field3308;
            if (this.field3306 != null) {
                return true;
            } else if (~this.field3305 <= -1) {
                int var2 = class231.field3798;
                int var3 = class259.field4118;
                int var4 = !class71.field1163.method1111((byte) 83, this.field3305) ? 128 : 64;
                this.field3306 = class71.field1163.method1109(this.field3305, 65535);
                this.field3304 = var4;
                this.field3296 = var4;
                class275.method1860(var3, 50, var2);
                return this.field3306 != null;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IB)[[I")
    public final int[][] method65(int arg0, byte arg1) {
        ++field3295;
        int[][] var3 = super.field93.method248(arg0, 17416);
        if (super.field93.field470 && this.method1423(-99)) {
            int var4 = (~class259.field4118 == ~this.field3296 ? arg0 : this.field3296 * arg0 / class259.field4118) * this.field3304;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class231.field3798 != this.field3304) {
                for (int var8 = 0; var8 < class231.field3798; ++var8) {
                    int var9 = this.field3304 * var8 / class231.field3798;
                    int var10 = this.field3306[var4 - -var9];
                    var7[var8] = class202.method1393(255, var10) << 4;
                    var6[var8] = class202.method1393(var10 >> 4, 4080);
                    var5[var8] = class202.method1393(16711680, var10) >> 12;
                }
            } else {
                for (int var11 = 0; class231.field3798 > var11; ++var11) {
                    int var12 = this.field3306[var4++];
                    var7[var11] = class202.method1393(var12 << 4, 4080);
                    var6[var11] = class202.method1393(4080, var12 >> 4);
                    var5[var11] = class202.method1393(4080, var12 >> 12);
                }
            }
        }
        int var13 = 29 / ((-48 - arg1) / 46);
        return var3;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1424(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field3309;
        if (class228.method1606(arg0, arg3)) {
            client.method1095(class136.field2250[arg3], -1, arg5, arg6, arg1, arg7, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "(Z)Loh;")
    public static final class274 method1425(boolean arg0) {
        if (!arg0) {
            method1422(true);
        }
        ++field3302;
        try {
            return (class274) Class.forName("qa").newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "(B)I")
    public final int method63(byte arg0) {
        ++field3307;
        int var2 = -40 % ((arg0 - 57) / 49);
        return this.field3305;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(BLog;I)V")
    public final void method64(byte arg0, class221 arg1, int arg2) {
        ++field3300;
        if (arg2 == 0) {
            this.field3305 = arg1.method1521((byte) 113);
        }
        if (arg0 <= 62) {
            this.method64((byte) 71, (class221) null, -89);
        }
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "()V")
    public class206() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(B)V")
    public final void method59(byte arg0) {
        ++field3299;
        super.method59((byte) -104);
        this.field3306 = null;
        if (arg0 > -73) {
            this.method63((byte) 101);
        }
    }
}
