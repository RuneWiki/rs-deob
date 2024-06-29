import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class509 {

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "Ljn;")
    private class117 field7575 = new class117(64);

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "Lvo;")
    private class345 field7570;

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "Lvo;")
    public class345 field7574;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "I")
    public static int field7569;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
    public static int field7571;

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "I")
    public static int field7572;

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "I")
    public static int field7573;

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "I")
    public static int field7576;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
    public final void method3027(int arg0) {
        field7573++;
        class117 var2 = this.field7575;
        synchronized (this.field7575) {
            int var3 = 62 % ((52 - arg0) / 43);
            this.field7575.method950((byte) 43);
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)V")
    public static final void method3028(byte arg0) {
        field7571++;
        if (arg0 != 9) {
            method3028((byte) -18);
        }
        class478.method2796();
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)V")
    public final void method3029(int arg0, int arg1) {
        field7569++;
        class117 var3 = this.field7575;
        synchronized (this.field7575) {
            if (arg0 == 3) {
                this.field7575.method939(28093, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(II)Ljv;")
    public final class687 method3030(int arg0, int arg1) {
        field7572++;
        class117 var3 = this.field7575;
        class687 var4;
        synchronized (this.field7575) {
            var4 = (class687) this.field7575.method941((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class345 var5 = this.field7570;
        byte[] var6;
        synchronized (this.field7570) {
            var6 = this.field7570.method2081(-126, arg0, 3);
        }
        class687 var7 = new class687();
        var7.field9757 = this;
        if (var6 != null) {
            var7.method3875(new class465(var6), (byte) 56);
        }
        if (arg1 != 64) {
            this.method3030(63, -49);
        }
        class117 var8 = this.field7575;
        synchronized (this.field7575) {
            this.field7575.method949((long) arg0, true, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(B)V")
    public final void method3031(byte arg0) {
        class117 var2 = this.field7575;
        synchronized (this.field7575) {
            if (arg0 != -89) {
                this.field7575 = null;
            }
            this.field7575.method936(-45);
        }
        field7576++;
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lgn;ILvo;Lvo;)V")
    public class509(class529 arg0, int arg1, class345 arg2, class345 arg3) {
        this.field7570 = arg2;
        this.field7574 = arg3;
        this.field7570.method2098(0, 3);
    }
}
