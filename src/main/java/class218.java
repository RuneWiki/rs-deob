import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class218 {

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    public int field3227 = 128;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "I")
    public int field3231 = 128;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public int field3229;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public int field3222;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public int field3220;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public int field3223;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public static int field3226 = 0;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "Lmh;")
    public static class145 field3225 = new class145("", 14);

    @OriginalMember(owner = "client!he", name = "k", descriptor = "Lmc;")
    public static class384 field3230 = new class384();

    @OriginalMember(owner = "client!he", name = "n", descriptor = "[S")
    public static short[] field3233 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!he", name = "o", descriptor = "Lqp;")
    public static class586 field3234 = new class586(113, -2);

    @OriginalMember(owner = "client!he", name = "p", descriptor = "I")
    public static int field3235 = 1;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lhe;Z)V", line = 4)
    public final void method1443(class218 arg0, boolean arg1) {
        this.field3220 = arg0.field3220;
        if (!arg1) {
            return;
        }
        this.field3227 = arg0.field3227;
        field3224++;
        this.field3222 = arg0.field3222;
        this.field3223 = arg0.field3223;
        this.field3229 = arg0.field3229;
        this.field3231 = arg0.field3231;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V", line = 26)
    public static void method1444(byte arg0) {
        field3233 = null;
        field3234 = null;
        field3225 = null;
        field3230 = null;
        if (arg0 != -101) {
            field3234 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(B)Lhe;", line = 47)
    public final class218 method1445(byte arg0) {
        int var2 = 96 / ((arg0 - 42) / 48);
        field3228++;
        return new class218(this.field3229, this.field3231, this.field3227, this.field3223, this.field3220, this.field3222);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIIIILjava/lang/String;)V", line = 62)
    public static final void method1446(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, String arg7) {
        field3221++;
        class10 var8 = new class10();
        var8.field91 = arg5;
        var8.field83 = arg7;
        var8.field88 = arg3;
        var8.field86 = arg2;
        var8.field92 = class576.field8505 + arg1;
        var8.field87 = arg0;
        var8.field89 = arg6;
        if (arg4 > -32) {
            method1446(16, -55, 26, 89, 115, 104, 118, null);
        }
        class413.field5873.method770(-65537, var8);
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(I)V", line = 96)
    public class218(int arg0) {
        this.field3229 = arg0;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(IIIIII)V", line = 103)
    private class218(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3227 = arg2;
        this.field3222 = arg5;
        this.field3231 = arg1;
        this.field3220 = arg4;
        this.field3229 = arg0;
        this.field3223 = arg3;
    }
}
