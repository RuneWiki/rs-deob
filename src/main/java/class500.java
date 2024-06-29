import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class500 {

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "Lvg;")
    private class49 field7337 = new class49(128);

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "Lri;")
    private class97 field7335;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "Lrl;")
    public static class672 field7338 = new class672(24, 18);

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
    public static int field7339 = 0;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "Lor;")
    public static class594 field7340 = new class594();

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "Lhga;")
    public static class158 field7341 = new class158(56, 0);

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
    public static int field7332;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    public static int field7333;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
    public static int field7334;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
    public static int field7336;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "[[B")
    public static byte[][] field7342;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "[[[Lup;")
    public static class252[][][] field7343;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IB)Ldl;", line = 7)
    public final class57 method3047(int arg0, byte arg1) {
        field7334++;
        class49 var3 = this.field7337;
        class57 var4;
        synchronized (this.field7337) {
            var4 = (class57) this.field7337.method560(false, (long) arg0);
            if (arg1 <= 58) {
                this.field7337 = null;
            }
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field7335.method926(class369.method2438((byte) -115, arg0), -125, class546.method3299((byte) -3, arg0));
        class57 var6 = new class57();
        if (var5 != null) {
            var6.method657(-1, new class6(var5));
        }
        class49 var7 = this.field7337;
        synchronized (this.field7337) {
            this.field7337.method559(var6, (long) arg0, 0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)V", line = 39)
    public static final void method3048(boolean arg0) {
        field7332++;
        class246.field3932 = 0;
        class134.field2204 = 0;
        class330.field5102 = 0;
        class674.field9500 = 0;
        if (!arg0) {
            field7341 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IZ)V", line = 51)
    public static final void method3049(int arg0, boolean arg1) {
        field7333++;
        class413 var2 = class674.method3852(4, arg0, 124);
        var2.method2634(1065768928);
        if (!arg1) {
            method3050(true, 92);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZI)Z", line = 64)
    public static final boolean method3050(boolean arg0, int arg1) {
        field7336++;
        if (arg1 != -17699) {
            return false;
        }
        boolean var2 = class627.field8857.method168();
        if (arg0 == var2) {
            return true;
        }
        if (!arg0) {
            class627.field8857.method135();
        } else if (!class627.field8857.method134()) {
            arg0 = false;
        }
        if (arg0 == var2) {
            return false;
        } else {
            class17.field282.field4891 = arg0;
            class17.field282.method2094(false, class402.field6207);
            return true;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V", line = 104)
    public static void method3051(int arg0) {
        field7343 = null;
        field7338 = null;
        field7341 = null;
        field7340 = null;
        if (arg0 == 0) {
            field7342 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lei;ILri;)V", line = 126)
    public class500(class162 arg0, int arg1, class97 arg2) {
        this.field7335 = arg2;
        if (this.field7335 != null) {
            int var4 = this.field7335.method917(true) - 1;
            this.field7335.method949(var4, 0);
        }
    }
}
