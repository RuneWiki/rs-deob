import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class420 {

    @OriginalMember(owner = "client!un", name = "i", descriptor = "Lnga;")
    private class510 field5908 = new class510(64);

    @OriginalMember(owner = "client!un", name = "j", descriptor = "Leq;")
    private class209 field5909;

    @OriginalMember(owner = "client!un", name = "d", descriptor = "Leq;")
    public class209 field5903;

    @OriginalMember(owner = "client!un", name = "e", descriptor = "Z")
    public static boolean field5904 = false;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "I")
    public static int field5900;

    @OriginalMember(owner = "client!un", name = "b", descriptor = "I")
    public static int field5901;

    @OriginalMember(owner = "client!un", name = "c", descriptor = "I")
    public static int field5902;

    @OriginalMember(owner = "client!un", name = "f", descriptor = "I")
    public static int field5905;

    @OriginalMember(owner = "client!un", name = "g", descriptor = "I")
    public static int field5906;

    @OriginalMember(owner = "client!un", name = "h", descriptor = "I")
    public static int field5907;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(II)Lto;", line = 4)
    public final class8 method2571(int arg0, int arg1) {
        field5905++;
        class510 var3 = this.field5908;
        class8 var4;
        synchronized (this.field5908) {
            var4 = (class8) this.field5908.method3054((byte) -104, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class209 var5 = this.field5909;
        byte[] var6;
        synchronized (this.field5909) {
            var6 = this.field5909.method1453(arg1, 20, 3);
        }
        class8 var7 = new class8();
        var7.field137 = this;
        if (arg0 > -15) {
            return null;
        }
        if (var6 != null) {
            var7.method47(-39, new class35(var6));
        }
        class510 var8 = this.field5908;
        synchronized (this.field5908) {
            this.field5908.method3047(false, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(I)V", line = 37)
    public final void method2572(int arg0) {
        field5906++;
        class510 var2 = this.field5908;
        synchronized (this.field5908) {
            this.field5908.method3050(false);
            if (arg0 != 3) {
                this.field5908 = null;
            }
        }
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(II)V", line = 55)
    public final void method2573(int arg0, int arg1) {
        class510 var3 = this.field5908;
        synchronized (this.field5908) {
            this.field5908.method3049(arg1, (byte) 127);
        }
        if (arg0 == -31707) {
            field5901++;
        }
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(I)V", line = 68)
    public final void method2574(int arg0) {
        field5902++;
        class510 var2 = this.field5908;
        synchronized (this.field5908) {
            if (arg0 <= -98) {
                this.field5908.method3048(false);
            }
        }
    }

    @OriginalMember(owner = "client!un", name = "c", descriptor = "(II)V", line = 83)
    public static final void method2575(int arg0, int arg1) {
        field5900++;
        class354 var2 = class501.method3012(arg0, 11, 2145997216);
        var2.method2216(0);
        int var3 = -99 % ((24 - arg1) / 57);
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lcw;ILeq;Leq;)V", line = 105)
    public class420(class179 arg0, int arg1, class209 arg2, class209 arg3) {
        this.field5909 = arg2;
        this.field5903 = arg3;
        this.field5909.method1477(0, 3);
    }
}
