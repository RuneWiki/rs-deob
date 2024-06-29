import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class671 {

    @OriginalMember(owner = "client!it", name = "h", descriptor = "Lpa;")
    private class387 field9409 = new class387(64);

    @OriginalMember(owner = "client!it", name = "d", descriptor = "Lcb;")
    private class544 field9405;

    @OriginalMember(owner = "client!it", name = "j", descriptor = "Lhb;")
    public class755 field9411;

    @OriginalMember(owner = "client!it", name = "f", descriptor = "I")
    public static int field9407 = 0;

    @OriginalMember(owner = "client!it", name = "i", descriptor = "[F")
    public static float[] field9410 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!it", name = "a", descriptor = "I")
    public static int field9402;

    @OriginalMember(owner = "client!it", name = "b", descriptor = "I")
    public static int field9403;

    @OriginalMember(owner = "client!it", name = "c", descriptor = "I")
    public static int field9404;

    @OriginalMember(owner = "client!it", name = "e", descriptor = "I")
    public static int field9406;

    @OriginalMember(owner = "client!it", name = "g", descriptor = "I")
    public static int field9408;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(ZI)Lkha;", line = 3)
    public final class607 method3800(boolean arg0, int arg1) {
        field9406++;
        class387 var3 = this.field9409;
        class607 var4;
        synchronized (this.field9409) {
            var4 = (class607) this.field9409.method2373((long) arg1, 103);
        }
        if (var4 != null) {
            return var4;
        }
        class544 var5 = this.field9405;
        byte[] var6;
        synchronized (this.field9405) {
            var6 = this.field9405.method3150(arg1, -84, 32);
        }
        class607 var7 = new class607();
        var7.field8565 = this;
        if (var6 != null) {
            var7.method3503(new class120(var6), (byte) 23);
        }
        if (arg0) {
            method3804(-69, 69, 58);
        }
        class387 var8 = this.field9409;
        synchronized (this.field9409) {
            this.field9409.method2362(var7, 0, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(B)V", line = 43)
    public final void method3801(byte arg0) {
        if (arg0 != -21) {
            return;
        }
        class387 var2 = this.field9409;
        synchronized (this.field9409) {
            this.field9409.method2364(arg0 ^ 0xFFFFFFEA);
        }
        field9402++;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I)V", line = 58)
    public static void method3802(int arg0) {
        if (arg0 != 8158) {
            method3804(96, 61, -12);
        }
        field9410 = null;
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(I)V", line = 69)
    public final void method3803(int arg0) {
        field9408++;
        if (arg0 != 0) {
            this.method3801((byte) 53);
        }
        class387 var2 = this.field9409;
        synchronized (this.field9409) {
            this.field9409.method2369(-1);
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(III)Z", line = 83)
    public static final boolean method3804(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            method3804(-22, 30, 60);
        }
        field9404++;
        return (arg0 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Liv;ILcb;Lhb;)V", line = 112)
    public class671(class106 arg0, int arg1, class544 arg2, class755 arg3) {
        this.field9405 = arg2;
        this.field9405.method3147(32, -100);
        this.field9411 = arg3;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(II)V", line = 98)
    public final void method3805(int arg0, int arg1) {
        class387 var3 = this.field9409;
        synchronized (this.field9409) {
            if (arg1 != 0) {
                return;
            }
            this.field9409.method2366(arg0, arg1 + 123);
        }
        field9403++;
    }
}
