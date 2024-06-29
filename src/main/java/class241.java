import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class241 extends class28 {

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "I")
    private final int field4298;

    @OriginalMember(owner = "client!cb", name = "B", descriptor = "I")
    private final int field4302;

    @OriginalMember(owner = "client!cb", name = "E", descriptor = "I")
    private final int field4305;

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "I")
    private final int field4300;

    @OriginalMember(owner = "client!cb", name = "y", descriptor = "Ldl;")
    public static class31 field4299 = new class31(16);

    @OriginalMember(owner = "client!cb", name = "G", descriptor = "Lwd;")
    public static class65 field4307 = new class65();

    @OriginalMember(owner = "client!cb", name = "I", descriptor = "Lli;")
    public static class185 field4309 = class245.method1649(")1 ", 127);

    @OriginalMember(owner = "client!cb", name = "H", descriptor = "Ldi;")
    public static class127 field4308 = new class127();

    @OriginalMember(owner = "client!cb", name = "A", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!cb", name = "D", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!cb", name = "F", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!cb", name = "J", descriptor = "Lti;")
    public static class188 field4310;

    @OriginalMember(owner = "client!cb", name = "C", descriptor = "Lhi;")
    public static class250 field4303;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(III)V")
    public final void method182(int arg0, int arg1, int arg2) {
        int var4 = 10 / ((50 - arg1) / 61);
        int var5 = this.field4305 * arg2 >> 12;
        int var6 = this.field4302 * arg2 >> 12;
        int var7 = this.field4298 * arg0 >> 12;
        ++field4301;
        int var8 = this.field4300 * arg0 >> 12;
        class6.method73(var6, super.field464, var8, super.field466, super.field480, var5, (byte) -110, var7);
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(III)V")
    public final void method176(int arg0, int arg1, int arg2) {
        int var4 = this.field4302 * arg1 >> 12;
        ++field4306;
        if (arg0 < 119) {
            field4307 = null;
        }
        int var5 = this.field4298 * arg2 >> 12;
        int var6 = this.field4300 * arg2 >> 12;
        int var7 = this.field4305 * arg1 >> 12;
        class52.method361(-1481, var5, var4, var7, super.field466, super.field480, var6);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)V")
    public final void method175(int arg0, int arg1, int arg2) {
        ++field4304;
        int var4 = this.field4305 * arg2 >> 12;
        if (arg0 == 30792) {
            int var5 = this.field4302 * arg2 >> 12;
            int var6 = this.field4298 * arg1 >> 12;
            int var7 = this.field4300 * arg1 >> 12;
            class275.method1884(var6, super.field464, var4, var7, false, var5);
        }
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(IIIIIII)V")
    public class241(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4298 = arg1;
        this.field4302 = arg0;
        this.field4305 = arg2;
        this.field4300 = arg3;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V")
    public static void method1633(byte arg0) {
        if (arg0 != -74) {
            method1633((byte) -115);
        }
        field4299 = null;
        field4310 = null;
        field4309 = null;
        field4308 = null;
        field4303 = null;
        field4307 = null;
    }
}
