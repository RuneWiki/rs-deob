import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class219 {

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "Lpm;")
    private class501 field3195 = new class501();

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "Lvm;")
    private class589 field3197 = new class589();

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "I")
    private int field3199;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "I")
    private int field3196;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "Llb;")
    private class465 field3198;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "[Lvda;")
    public static class158[] field3192 = new class158[16];

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
    public static int field3190 = 0;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "Lkda;")
    public static class328 field3189;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)V", line = 5)
    public final void method1420(byte arg0) {
        this.field3197.method3504((byte) 102);
        if (arg0 >= -28) {
            method1421((byte) 127);
        }
        field3191++;
        this.field3198.method2800(0);
        this.field3195 = new class501();
        this.field3196 = this.field3199;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(B)V", line = 37)
    public static void method1421(byte arg0) {
        field3189 = null;
        field3192 = null;
        if (arg0 > -85) {
            field3190 = -125;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(JLpm;I)V", line = 50)
    public final void method1422(long arg0, class501 arg1, int arg2) {
        if (this.field3196 == 0) {
            class501 var5 = this.field3197.method3506(0);
            var5.method2457(-8422);
            var5.method2987(arg2 + 90);
            if (this.field3195 == var5) {
                class501 var6 = this.field3197.method3506(0);
                var6.method2457(-8422);
                var6.method2987(-1);
            }
        } else {
            this.field3196--;
        }
        field3193++;
        this.field3198.method2797(-4234, arg1, arg0);
        this.field3197.method3500(arg1, false);
        if (arg2 != -91) {
            this.field3195 = null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(BJ)Lpm;", line = 84)
    public final class501 method1423(byte arg0, long arg1) {
        if (arg0 != 89) {
            return null;
        }
        field3194++;
        class501 var4 = (class501) this.field3198.method2799(arg1, true);
        if (var4 != null) {
            this.field3197.method3500(var4, false);
        }
        return var4;
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(I)V", line = 122)
    public class219(int arg0) {
        this.field3199 = arg0;
        this.field3196 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field3198 = new class465(var2);
    }
}
