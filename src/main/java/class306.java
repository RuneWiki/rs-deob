import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public class class306 implements class216 {

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "Lsp;")
    private class636 field4396;

    @OriginalMember(owner = "client!caa", name = "h", descriptor = "Lmf;")
    private class423 field4402;

    @OriginalMember(owner = "client!caa", name = "g", descriptor = "[I")
    public static int[] field4401 = new int[14];

    @OriginalMember(owner = "client!caa", name = "j", descriptor = "I")
    public static int field4404 = 0;

    @OriginalMember(owner = "client!caa", name = "f", descriptor = "Lwfa;")
    public static class200 field4400 = new class200(0, -1);

    @OriginalMember(owner = "client!caa", name = "k", descriptor = "Lht;")
    public static class582 field4405 = new class582(14, 5);

    @OriginalMember(owner = "client!caa", name = "l", descriptor = "[I")
    public static int[] field4406 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!caa", name = "c", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!caa", name = "d", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!caa", name = "e", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!caa", name = "i", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!caa", name = "m", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(ZB)V")
    public final void method328(boolean arg0, byte arg1) {
        field4398++;
        class660 var3 = this.field4396.method3488(119, this.field4402.field5829);
        if (arg1 >= -60) {
            field4407 = -55;
        }
        if (var3 == null) {
            return;
        }
        int var4 = this.field4402.field5830.method1911(this.field4402.field5820, 0, class69.field844) + this.field4402.field5837;
        int var5 = this.field4402.field5831.method2861((byte) 126, class304.field4321, this.field4402.field5836) + this.field4402.field5824;
        if (this.field4402.field5825) {
            class341.field4807.method455(var4, var5, this.field4402.field5820, this.field4402.field5836, this.field4402.field5838, 0);
        }
        int var6 = var5 + this.method1896(class64.field785, var3.field8708, var5, 0, 5, var4) * 12;
        int var9 = var6 + 8;
        if (this.field4402.field5825) {
            class341.field4807.method412(var4, var9, this.field4402.field5820 + var4 - 1, var9, this.field4402.field5838, 0);
        }
        var6 = var9 + 1;
        int var7 = var6 + this.method1896(class64.field785, var3.field8717, var6, 0, 5, var4) * 12;
        int var10 = var7 + 5;
        int var10000 = var10 + this.method1896(class64.field785, var3.field8711, var10, 0, 5, var4) * 12;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(III)Z")
    public static final boolean method1894(int arg0, int arg1, int arg2) {
        field4399++;
        if (arg2 <= 35) {
            return true;
        } else {
            return (arg0 & 0x60000) != 0 | class319.method1935(arg0, -1, arg1) || class439.method2531(arg0, 90, arg1) || class60.method521(arg0, -1, arg1);
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)Z")
    public final boolean method320(int arg0) {
        if (arg0 == 5618) {
            field4397++;
            return this.field4396.method3491(arg0 - 32374);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "(B)V")
    public static void method1895(byte arg0) {
        field4400 = null;
        field4401 = null;
        field4405 = null;
        if (arg0 >= 110) {
            field4406 = null;
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(B)V")
    public final void method324(byte arg0) {
        field4403++;
        if (arg0 <= 34) {
            this.method1896(null, null, -43, 36, -117, -108);
        }
    }

    @OriginalMember(owner = "client!caa", name = "<init>", descriptor = "(Lsp;Lmf;)V")
    public class306(class636 arg0, class423 arg1) {
        this.field4396 = arg0;
        this.field4402 = arg1;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(Lda;Ljava/lang/String;IIII)I")
    private final int method1896(class60 arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        field4395++;
        if (arg3 != 0) {
            method1894(112, -74, -12);
        }
        return arg0.method528(arg2 + arg4, 0, null, arg1, 0, null, this.field4402.field5821, arg4 + arg5, -(arg4 * 2) + this.field4402.field5836, this.field4402.field5826, 0, 0, null, 0, 0, this.field4402.field5820 - (arg4 * 2));
    }
}
