import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class377 {

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "Lof;")
    private class328 field5797 = new class328(128);

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "Lmn;")
    private class162 field5798;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "Z")
    public static boolean field5794 = false;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
    public static int field5795;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
    public static int field5799;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "Lmn;")
    public static class162 field5793;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "Lmn;")
    public static class162 field5796;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "([FII)[F")
    public static final float[] method2438(float[] arg0, int arg1, int arg2) {
        field5799++;
        float[] var3 = new float[arg2];
        if (arg1 != 1581) {
            field5796 = null;
        }
        class324.method2172(arg0, 0, var3, 0, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(II)Lrv;")
    public final class41 method2439(int arg0, int arg1) {
        if (arg1 != -1) {
            field5794 = true;
        }
        field5795++;
        class328 var3 = this.field5797;
        class41 var4;
        synchronized (this.field5797) {
            var4 = (class41) this.field5797.method2191((byte) -73, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field5798.method1004(class401.method2579(arg0, false), false, class410.method2623(arg0, -100));
        class41 var6 = new class41();
        if (var5 != null) {
            var6.method251(-1, new class208(var5));
        }
        class328 var7 = this.field5797;
        synchronized (this.field5797) {
            this.field5797.method2188(arg1 - 123, (long) arg0, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Z)V")
    public static void method2440(boolean arg0) {
        field5796 = null;
        field5793 = null;
        if (arg0) {
            method2438(null, 84, 107);
        }
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lpr;ILmn;)V")
    public class377(class236 arg0, int arg1, class162 arg2) {
        this.field5798 = arg2;
        if (this.field5798 != null) {
            int var4 = this.field5798.method1023(127) - 1;
            this.field5798.method1008(var4, (byte) -21);
        }
    }
}
