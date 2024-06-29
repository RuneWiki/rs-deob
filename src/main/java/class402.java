import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class402 extends class391 {

    @OriginalMember(owner = "client!ns", name = "m", descriptor = "I")
    private int field5510;

    @OriginalMember(owner = "client!ns", name = "k", descriptor = "I")
    private int field5508;

    @OriginalMember(owner = "client!ns", name = "o", descriptor = "I")
    private int field5512;

    @OriginalMember(owner = "client!ns", name = "j", descriptor = "I")
    private int field5507;

    @OriginalMember(owner = "client!ns", name = "n", descriptor = "Lgo;")
    public static class304 field5511 = new class304();

    @OriginalMember(owner = "client!ns", name = "q", descriptor = "Leo;")
    public static class443 field5514 = new class443(1, 6);

    @OriginalMember(owner = "client!ns", name = "t", descriptor = "Lmo;")
    public static class336 field5517 = new class336(5);

    @OriginalMember(owner = "client!ns", name = "l", descriptor = "I")
    public static int field5509;

    @OriginalMember(owner = "client!ns", name = "p", descriptor = "I")
    public static int field5513;

    @OriginalMember(owner = "client!ns", name = "r", descriptor = "I")
    public static int field5515;

    @OriginalMember(owner = "client!ns", name = "u", descriptor = "I")
    public static int field5518;

    @OriginalMember(owner = "client!ns", name = "s", descriptor = "Lkg;")
    public static class194 field5516;

    @OriginalMember(owner = "client!ns", name = "v", descriptor = "Lrn;")
    public static class417 field5519;

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)V", line = 9)
    public static void method2419(int arg0) {
        field5516 = null;
        field5514 = null;
        field5517 = null;
        field5519 = null;
        field5511 = null;
        if (arg0 < 122) {
            field5514 = null;
        }
    }

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "(III)V", line = 24)
    public final void method1256(int arg0, int arg1, int arg2) {
        if (arg0 != 9329) {
            this.method1254(56, -62, -107);
        }
        ++field5518;
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(IIIIIII)V", line = 34)
    public class402(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field5510 = arg0;
        this.field5508 = arg1;
        this.field5512 = arg2;
        this.field5507 = arg3;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(III)V", line = 45)
    public final void method1255(int arg0, int arg1, int arg2) {
        ++field5513;
        int var4 = this.field5510 * arg0 >> 12;
        int var5 = this.field5512 * arg0 >> 12;
        int var6 = this.field5508 * arg1 >> 12;
        int var7 = this.field5507 * arg1 >> 12;
        class352.method2169((byte) -44, super.field5404, super.field5406, var5, var6, var7, super.field5403, var4);
        int var8 = 111 % ((arg2 - -42) / 37);
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(B)V", line = 63)
    public static final void method2420(byte arg0) {
        class225.field3249.method2119(0);
        ++field5509;
        if (arg0 > -122) {
            field5519 = null;
        }
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(III)V", line = 88)
    public final void method1254(int arg0, int arg1, int arg2) {
        ++field5515;
        int var4 = this.field5510 * arg1 >> 12;
        int var5 = this.field5512 * arg1 >> 12;
        int var6 = this.field5508 * arg0 >> 12;
        int var7 = this.field5507 * arg0 >> 12;
        class111.method882(var4, 0, var6, var5, super.field5403, var7);
        if (arg2 <= 120) {
            this.method1256(-74, -120, -52);
        }
    }
}
