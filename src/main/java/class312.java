import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class312 {

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "Ljg;")
    public static class307 field4030 = new class650();

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
    public int field4029;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
    public int field4031;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "I")
    private int field4034;

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "Llq;")
    public class504 field4028;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILiaa;)V")
    public final void method1765(int arg0, class452 arg1) {
        if (arg0 != -1) {
            this.field4034 = -93;
        }
        field4033++;
        while (true) {
            int var3 = arg1.method2541(56);
            if (var3 == 0) {
                return;
            }
            this.method1768(var3, arg1, arg0 ^ 0xFFFFFF90);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)V")
    public static void method1766(boolean arg0) {
        field4030 = null;
        if (arg0) {
            method1766(false);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)Laaa;")
    public final synchronized class563 method1767(int arg0) {
        field4032++;
        class563 var2 = (class563) this.field4028.field7258.method3690((byte) -4, (long) this.field4034);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != 2) {
            this.method1767(-29);
        }
        class563 var3 = class563.method3185(this.field4028.field7255, this.field4034, 0);
        if (var3 != null) {
            this.field4028.field7258.method3683(var3, (byte) -62, (long) this.field4034);
        }
        return var3;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILiaa;I)V")
    private final void method1768(int arg0, class452 arg1, int arg2) {
        if (arg0 == 1) {
            this.field4034 = arg1.method2574(-1758460248);
        } else if (arg0 == 2) {
            this.field4029 = arg1.method2541(76);
            this.field4031 = arg1.method2541(69);
        }
        int var4 = 58 % ((-arg2 - 48) / 33);
        field4035++;
    }
}
