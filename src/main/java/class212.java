import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class212 {

    @OriginalMember(owner = "client!fp", name = "f", descriptor = "Lfa;")
    private class156 field3054 = new class156(64);

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "Lfs;")
    private class387 field3049;

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "[I")
    public static int[] field3050 = new int[4096];

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "Lsl;")
    public static class318 field3051;

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "Lbg;")
    public static class324 field3053;

    @OriginalMember(owner = "client!fp", name = "h", descriptor = "[I")
    public static int[] field3056;

    @OriginalMember(owner = "client!fp", name = "g", descriptor = "Lgk;")
    public static class331 field3055;

    @OriginalMember(owner = "client!fp", name = "i", descriptor = "Lpk;")
    public static class133 field3057;

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(II)Lan;")
    public final class20 method1458(int arg0, int arg1) {
        field3052++;
        class156 var3 = this.field3054;
        class20 var4;
        synchronized (this.field3054) {
            var4 = (class20) this.field3054.method1115((long) arg1, (byte) 58);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3049.method2363(arg1, arg0, 88);
        class20 var6 = new class20();
        if (var5 != null) {
            var6.method181(arg0 + 1439100499, new class65(var5));
        }
        class156 var7 = this.field3054;
        synchronized (this.field3054) {
            this.field3054.method1107(1, (long) arg1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V")
    public static void method1459(int arg0) {
        if (arg0 != 32) {
            field3051 = null;
        }
        field3055 = null;
        field3057 = null;
        field3051 = null;
        field3050 = null;
        field3053 = null;
        field3056 = null;
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(Ljk;ILfs;)V")
    public class212(class446 arg0, int arg1, class387 arg2) {
        this.field3049 = arg2;
        this.field3049.method2367(5, 28724);
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field3050[var0] = class114.method918(var0, true);
        }
        field3051 = new class318(29, 7);
        field3053 = new class324(32, -2);
        field3056 = new int[13];
        field3055 = new class331("glow2:", "leuchten2:", "brillant2:", "brilho2:");
        field3057 = new class133();
    }
}
