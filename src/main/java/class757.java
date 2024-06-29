import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wia")
public class class757 extends class460 implements class749 {

    @OriginalMember(owner = "client!wia", name = "z", descriptor = "Lwt;")
    private class309 field10525;

    @OriginalMember(owner = "client!wia", name = "y", descriptor = "[I")
    public static int[] field10524 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!wia", name = "u", descriptor = "I")
    public static int field10520;

    @OriginalMember(owner = "client!wia", name = "v", descriptor = "I")
    public static int field10521;

    @OriginalMember(owner = "client!wia", name = "w", descriptor = "I")
    public static int field10522;

    @OriginalMember(owner = "client!wia", name = "x", descriptor = "I")
    public static int field10523;

    @OriginalMember(owner = "client!wia", name = "A", descriptor = "I")
    public static int field10526;

    @OriginalMember(owner = "client!wia", name = "B", descriptor = "I")
    public static int field10527;

    @OriginalMember(owner = "client!wia", name = "D", descriptor = "I")
    public static int field10529;

    @OriginalMember(owner = "client!wia", name = "E", descriptor = "I")
    public static int field10530;

    @OriginalMember(owner = "client!wia", name = "C", descriptor = "[I")
    public static int[] field10528;

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(B)Z")
    public final boolean method2156(byte arg0) {
        ++field10527;
        return arg0 < 104 ? false : super.method2733((byte) 100, super.field6494.field5403);
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(I)V")
    public final void method1059(int arg0) {
        ++field10520;
        super.method1059(arg0);
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(IB)V")
    public final void method2157(int arg0, byte arg1) {
        ++field10530;
        int var3 = -10 / ((3 - arg1) / 47);
        super.method2157(this.field10525.field4299 * arg0, (byte) 97);
    }

    @OriginalMember(owner = "client!wia", name = "<init>", descriptor = "(Lfha;Lwt;Z)V")
    public class757(class378 arg0, class309 arg1, boolean arg2) {
        super(arg0, 34963, arg2);
        this.field10525 = arg1;
    }

    @OriginalMember(owner = "client!wia", name = "b", descriptor = "(I)Lwt;")
    public final class309 method2155(int arg0) {
        ++field10529;
        if (arg0 != -14876) {
            this.field10525 = null;
        }
        return this.field10525;
    }

    @OriginalMember(owner = "client!wia", name = "b", descriptor = "(B)V")
    public static void method4206(byte arg0) {
        field10528 = null;
        if (arg0 != 56) {
            method4206((byte) -7);
        }
        field10524 = null;
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(Z)I")
    public final int method1564(boolean arg0) {
        if (!arg0) {
            field10528 = null;
        }
        ++field10523;
        return super.method1564(true);
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;")
    public final Buffer method2154(int arg0, boolean arg1) {
        ++field10522;
        if (arg0 != 27599) {
            field10528 = null;
        }
        return super.method2735(arg1, super.field6494.field5403, (byte) -24);
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(BII)Z")
    public static final boolean method4207(byte arg0, int arg1, int arg2) {
        ++field10526;
        int var3 = -49 % ((66 - arg0) / 40);
        return (class755.method4200(33, arg2, arg1) | class711.method4004(arg2, arg1, (byte) 51) | class399.method2493(arg1, -129767092, arg2)) & class704.method3960(true, arg1, arg2);
    }
}
