import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class306 {

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "Lfba;")
    private class348 field4167 = new class348(64);

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "Lla;")
    private class423 field4165;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
    public static int field4163 = -2;

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "Lpi;")
    public static class250 field4169;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IB)V")
    public final void method1900(int arg0, byte arg1) {
        field4168++;
        if (arg1 == -42) {
            class348 var3 = this.field4167;
            synchronized (this.field4167) {
                this.field4167.method2207(arg0, 1);
            }
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)Lrs;")
    public final class167 method1901(int arg0, int arg1) {
        field4170++;
        class348 var3 = this.field4167;
        class167 var4;
        synchronized (this.field4167) {
            var4 = (class167) this.field4167.method2216(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class423 var5 = this.field4165;
        byte[] var6;
        synchronized (this.field4165) {
            var6 = this.field4165.method2600(arg0 ^ arg0, 11, arg1);
        }
        class167 var7 = new class167();
        if (var6 != null) {
            var7.method1192((byte) 24, new class479(var6));
        }
        class348 var8 = this.field4167;
        synchronized (this.field4167) {
            this.field4167.method2213((byte) -16, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V")
    public final void method1902(int arg0) {
        class348 var2 = this.field4167;
        synchronized (this.field4167) {
            int var3 = 118 % ((-arg0 - 49) / 54);
            this.field4167.method2219(-5300);
        }
        field4166++;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V")
    public final void method1903(byte arg0) {
        class348 var2 = this.field4167;
        synchronized (this.field4167) {
            if (arg0 != 76) {
                return;
            }
            this.field4167.method2220(false);
        }
        field4164++;
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(I)V")
    public static void method1904(int arg0) {
        if (arg0 != 11) {
            method1904(-16);
        }
        field4169 = null;
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lmp;ILla;)V")
    public class306(class315 arg0, int arg1, class423 arg2) {
        this.field4165 = arg2;
        if (this.field4165 != null) {
            this.field4165.method2616(11, 0);
        }
    }
}
