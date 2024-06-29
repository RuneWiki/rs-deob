import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class650 extends class314 {

    @OriginalMember(owner = "client!fr", name = "G", descriptor = "I")
    public static int field9337;

    @OriginalMember(owner = "client!fr", name = "I", descriptor = "I")
    public static int field9339;

    @OriginalMember(owner = "client!fr", name = "J", descriptor = "I")
    public static int field9340;

    @OriginalMember(owner = "client!fr", name = "K", descriptor = "I")
    public static int field9341;

    @OriginalMember(owner = "client!fr", name = "L", descriptor = "I")
    public static int field9342;

    @OriginalMember(owner = "client!fr", name = "H", descriptor = "[B")
    private byte[] field9338;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIBI)V")
    public static final void method3745(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = -93 / ((arg2 + 5) / 50);
        class160.field2297 = new byte[arg3][arg1][arg0];
        field9339++;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)Z")
    public static final boolean method3746(int arg0, int arg1) {
        field9342++;
        for (class304 var2 = (class304) class303.field4137.method3565(123); var2 != null; var2 = (class304) class303.field4137.method3561((byte) 24)) {
            if (class145.method1017(var2.field4152, 123) && ((long) arg1) == var2.field4156) {
                return true;
            }
        }
        if (arg0 > -27) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(IIII)[B")
    public final byte[] method3747(int arg0, int arg1, int arg2, int arg3) {
        this.field9338 = new byte[arg1 * arg2 * arg0 * 2];
        field9341++;
        if (arg3 < 30) {
            this.field9338 = null;
        }
        this.method1686(arg0, -107, arg2, arg1);
        return this.field9338;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
    public static final void method3748(String arg0, boolean arg1, int arg2) {
        field9340++;
        String var3 = arg0.toLowerCase();
        short[] var4 = new short[arg2];
        int var5 = 0;
        int var6 = arg1 ? 32768 : 0;
        int var7 = (arg1 ? class492.field7082.field6498 : class492.field7082.field6501) + var6;
        for (int var8 = var6; var8 < var7; var8++) {
            class714 var11 = class492.field7082.method2779(var8, 114);
            if (var11.field10082 && var11.method4007(60).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class340.field4686 = null;
                    class756.field10521 = -1;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class756.field10521 = var5;
        class340.field4686 = var4;
        class642.field9140 = 0;
        String[] var9 = new String[class756.field10521];
        for (int var10 = 0; var10 < class756.field10521; var10++) {
            var9[var10] = class492.field7082.method2779(var4[var10], 126).method4007(60);
        }
        class655.method3754((byte) -82, class340.field4686, var9);
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIB)V")
    public final void method1937(int arg0, int arg1, byte arg2) {
        field9337++;
        int var4 = arg0 * 2;
        int var5 = arg2 & 0xFF;
        if (arg1 == 0) {
            this.field9338[var4++] = (byte) (var5 * 3 >> 5);
            this.field9338[var4] = (byte) (var5 * 3 >> 5);
        }
    }

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "()V")
    public class650() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
}
