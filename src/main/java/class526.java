import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class526 extends class390 {

    @OriginalMember(owner = "client!mo", name = "O", descriptor = "Lok;")
    public static class166 field7783 = new class166(1, 3);

    @OriginalMember(owner = "client!mo", name = "R", descriptor = "Lra;")
    public static class70 field7786 = new class70(7, 0, 1, 1);

    @OriginalMember(owner = "client!mo", name = "E", descriptor = "I")
    public static int field7781;

    @OriginalMember(owner = "client!mo", name = "N", descriptor = "I")
    public static int field7782;

    @OriginalMember(owner = "client!mo", name = "Q", descriptor = "I")
    public static int field7785;

    @OriginalMember(owner = "client!mo", name = "S", descriptor = "I")
    public static int field7787;

    @OriginalMember(owner = "client!mo", name = "P", descriptor = "[B")
    private byte[] field7784;

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "()V")
    public class526() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Z)V")
    public static void method3091(boolean arg0) {
        field7786 = null;
        field7783 = null;
        if (!arg0) {
            method3091(true);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(ILsq;)V")
    public static final void method3092(int arg0, class117 arg1) {
        field7787++;
        for (class219 var2 = (class219) class225.field3039.method1672((byte) -104); var2 != null; var2 = (class219) class225.field3039.method1668(-1)) {
            if (var2.field2954 == arg1) {
                if (var2.field2959 != null) {
                    class318.field4175.method3070(var2.field2959);
                    var2.field2959 = null;
                }
                var2.method300(false);
                return;
            }
        }
        if (arg0 != 2) {
            method3092(-98, null);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(BII)V")
    public final void method2299(byte arg0, int arg1, int arg2) {
        int var4 = -46 / ((arg2 + 10) / 55);
        field7782++;
        int var5 = arg1 * 2;
        int var6 = arg0 & 0xFF;
        int var10001 = var5;
        int var7 = var5 + 1;
        this.field7784[var10001] = (byte) (var6 * 3 >> 5);
        this.field7784[var7] = (byte) (var6 * 3 >> 5);
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(IIII)[B")
    public final byte[] method3093(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 255) {
            field7781++;
            this.field7784 = new byte[arg0 * arg3 * 2 * arg1];
            this.method3077(arg3, -81, arg1, arg0);
            return this.field7784;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IB)V")
    public static final void method3094(int arg0, byte arg1) {
        field7785++;
        class236 var2 = class496.field6882;
        synchronized (class496.field6882) {
            int var3 = -92 % ((arg1 - 55) / 43);
            class496.field6882.method1461(-5, arg0);
        }
    }
}
