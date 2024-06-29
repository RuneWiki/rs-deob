import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public abstract class class427 extends class745 {

    @OriginalMember(owner = "client!mb", name = "O", descriptor = "S")
    public short field5927;

    @OriginalMember(owner = "client!mb", name = "K", descriptor = "S")
    public short field5923;

    @OriginalMember(owner = "client!mb", name = "L", descriptor = "Lin;")
    public static class380 field5924 = new class380(87, -2);

    @OriginalMember(owner = "client!mb", name = "P", descriptor = "Lnia;")
    public static class31 field5928 = new class31();

    @OriginalMember(owner = "client!mb", name = "Q", descriptor = "Lsv;")
    public static class570 field5929 = new class570(47, -1);

    @OriginalMember(owner = "client!mb", name = "E", descriptor = "I")
    public static int field5917;

    @OriginalMember(owner = "client!mb", name = "F", descriptor = "I")
    public static int field5918;

    @OriginalMember(owner = "client!mb", name = "H", descriptor = "I")
    public static int field5920;

    @OriginalMember(owner = "client!mb", name = "I", descriptor = "I")
    public static int field5921;

    @OriginalMember(owner = "client!mb", name = "J", descriptor = "I")
    public static int field5922;

    @OriginalMember(owner = "client!mb", name = "M", descriptor = "I")
    public static int field5925;

    @OriginalMember(owner = "client!mb", name = "N", descriptor = "I")
    public static int field5926;

    @OriginalMember(owner = "client!mb", name = "R", descriptor = "I")
    public static int field5930;

    @OriginalMember(owner = "client!mb", name = "G", descriptor = "Lgga;")
    public static class513 field5919;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIZ)I", line = 4)
    public static final int method2503(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field5920;
        int var5 = -class253.field3633[arg3 * 8192 / arg1] + 65536 >> 1;
        if (arg4) {
            method2503(-29, -71, 19, -81, true);
        }
        return ((-var5 + 65536) * arg0 >> 16) + (arg2 * var5 >> 16);
    }

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "(B)V", line = 17)
    public static void method2504(byte arg0) {
        field5919 = null;
        field5928 = null;
        field5929 = null;
        int var1 = 117 % ((arg0 - -33) / 54);
        field5924 = null;
    }

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "(B)Z", line = 29)
    public final boolean method1429(byte arg0) {
        ++field5921;
        return arg0 <= 123 ? false : class737.field10233[(super.field10347 >> class679.field9600) + -class277.field3995 + class162.field2499][(super.field10350 >> class679.field9600) + -class3.field47 + class162.field2499];
    }

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)V", line = 43)
    public final void method196(int arg0) {
        if (arg0 != -10382) {
            this.method1424(-11, (class217[]) null);
        }
        ++field5926;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I[Lmfa;)I", line = 55)
    public final int method1424(int arg0, class217[] arg1) {
        ++field5918;
        return arg0 != 4 ? -101 : this.method4113(arg1, super.field10350 >> class679.field9600, (byte) 122, super.field10347 >> class679.field9600);
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(Z)Z", line = 73)
    public final boolean method197(boolean arg0) {
        if (!arg0) {
            this.field5927 = -103;
        }
        ++field5917;
        return false;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLha;)Z", line = 85)
    public final boolean method1428(byte arg0, class475 arg1) {
        ++field5925;
        return arg0 > -88 ? true : class446.method2646(0, super.field10349, super.field10347 >> class679.field9600, this.method1167(83), super.field10350 >> class679.field9600);
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(IIIIIII)V", line = 95)
    public class427(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field5927 = (short) arg6;
        super.field10361 = (byte) arg3;
        super.field10358 = arg1;
        this.field5923 = (short) arg5;
        super.field10347 = arg0;
        super.field10350 = arg2;
        super.field10349 = (byte) arg4;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIILha;Lnfa;ZI)V", line = 109)
    public final void method194(int arg0, int arg1, int arg2, class475 arg3, class745 arg4, boolean arg5, int arg6) {
        ++field5922;
        if (arg0 == -24659) {
            throw new IllegalStateException();
        }
    }
}
