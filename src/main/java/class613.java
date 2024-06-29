import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public class class613 extends class484 {

    @OriginalMember(owner = "client!mfa", name = "f", descriptor = "Lwda;")
    public class636 field8869;

    @OriginalMember(owner = "client!mfa", name = "e", descriptor = "Lkg;")
    public static class271 field8868 = new class271("", 16);

    @OriginalMember(owner = "client!mfa", name = "g", descriptor = "Z")
    public static boolean field8870 = false;

    @OriginalMember(owner = "client!mfa", name = "h", descriptor = "I")
    public static int field8871;

    @OriginalMember(owner = "client!mfa", name = "i", descriptor = "I")
    public static int field8872;

    @OriginalMember(owner = "client!mfa", name = "j", descriptor = "I")
    public static int field8873;

    @OriginalMember(owner = "client!mfa", name = "k", descriptor = "I")
    public static int field8874;

    @OriginalMember(owner = "client!mfa", name = "l", descriptor = "I")
    public static int field8875;

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "(B)V")
    public static void method3529(byte arg0) {
        if (arg0 > 65) {
            field8868 = null;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(ZI)I")
    public static final int method3530(boolean arg0, int arg1) {
        int var7 = arg1 - 1;
        field8872++;
        if (arg0) {
            field8870 = true;
        }
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!mfa", name = "c", descriptor = "(B)V")
    public static final void method3531(byte arg0) {
        class2.field16.method3048(false);
        field8873++;
        if (arg0 != -56) {
            field8870 = false;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(Lgt;II[B)V")
    public class613(class453 arg0, int arg1, int arg2, byte[] arg3) {
        this.field8869 = arg0.method2750(arg3, false, arg2, class643.field9137, arg1, -32);
        this.field8869.method427(false, (byte) 66, false);
    }

    @OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(Lgt;II[I)V")
    public class613(class453 arg0, int arg1, int arg2, int[] arg3) {
        this.field8869 = arg0.method2740(false, arg2, arg1, arg3, (byte) -100);
        this.field8869.method427(false, (byte) 66, false);
    }
}
