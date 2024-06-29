import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class188 {

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "Lhn;")
    private class509 field2431 = new class509(64);

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "Lfo;")
    private class361 field2435;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "Z")
    public static boolean field2430 = false;

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "Lao;")
    public static class191 field2434 = new class191(70, 14);

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "Ljk;")
    public static class450 field2436 = null;

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "Lao;")
    public static class191 field2437 = null;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V", line = 11)
    public final void method1079(int arg0) {
        field2429++;
        if (arg0 != 35) {
            this.method1081(-77);
        }
        class509 var2 = this.field2431;
        synchronized (this.field2431) {
            this.field2431.method3045(48);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(BI)V", line = 24)
    public final void method1080(byte arg0, int arg1) {
        class509 var3 = this.field2431;
        synchronized (this.field2431) {
            this.field2431.method3036(arg1, (byte) -26);
        }
        field2433++;
        if (arg0 != 87) {
            field2436 = null;
        }
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(I)V", line = 37)
    public final void method1081(int arg0) {
        class509 var2 = this.field2431;
        synchronized (this.field2431) {
            this.field2431.method3034((byte) 81);
            if (arg0 != -29854) {
                this.field2435 = null;
            }
        }
        field2432++;
    }

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "(I)V", line = 52)
    public static void method1082(int arg0) {
        if (arg0 == -26985) {
            field2434 = null;
            field2437 = null;
            field2436 = null;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)Lbe;", line = 69)
    public final class29 method1083(int arg0, int arg1) {
        field2428++;
        class509 var3 = this.field2431;
        class29 var4;
        synchronized (this.field2431) {
            var4 = (class29) this.field2431.method3032(3589, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class361 var5 = this.field2435;
        byte[] var6;
        synchronized (this.field2435) {
            var6 = this.field2435.method2130(35, arg1, -96);
        }
        class29 var7 = new class29();
        if (var6 != null) {
            var7.method170(new class396(var6), 0);
        }
        var7.method171(1);
        class509 var8 = this.field2431;
        synchronized (this.field2431) {
            this.field2431.method3046((long) arg1, var7, 1);
            if (arg0 > -69) {
                field2436 = null;
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Ld;ILfo;)V", line = 104)
    public class188(class104 arg0, int arg1, class361 arg2) {
        this.field2435 = arg2;
        if (this.field2435 != null) {
            this.field2435.method2136(-115, 35);
        }
    }
}
