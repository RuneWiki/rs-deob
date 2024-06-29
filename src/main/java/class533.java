import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class533 extends class218 implements class440 {

    @OriginalMember(owner = "client!eu", name = "o", descriptor = "I")
    private int field7776;

    @OriginalMember(owner = "client!eu", name = "y", descriptor = "Z")
    public static boolean field7786 = false;

    @OriginalMember(owner = "client!eu", name = "s", descriptor = "Lpn;")
    public static class49 field7780 = new class49(56, -1);

    @OriginalMember(owner = "client!eu", name = "p", descriptor = "I")
    public static int field7777;

    @OriginalMember(owner = "client!eu", name = "q", descriptor = "I")
    public static int field7778;

    @OriginalMember(owner = "client!eu", name = "r", descriptor = "I")
    public static int field7779;

    @OriginalMember(owner = "client!eu", name = "t", descriptor = "I")
    public static int field7781;

    @OriginalMember(owner = "client!eu", name = "u", descriptor = "I")
    public static int field7782;

    @OriginalMember(owner = "client!eu", name = "v", descriptor = "I")
    public static int field7783;

    @OriginalMember(owner = "client!eu", name = "w", descriptor = "I")
    public static int field7784;

    @OriginalMember(owner = "client!eu", name = "x", descriptor = "I")
    public static int field7785;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)I", line = 5)
    public final int method112(int arg0) {
        if (arg0 != -31057) {
            method3146((class161) null, -36, 17, -85);
        }
        ++field7783;
        return this.field7776;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "([BIII)V", line = 17)
    public final void method114(byte[] arg0, int arg1, int arg2, int arg3) {
        ++field7778;
        this.method1504(arg0, 35044, arg3);
        this.field7776 = arg2;
        if (arg1 < 5) {
            field7785 = 91;
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(B)I", line = 29)
    public final int method117(byte arg0) {
        if (arg0 >= -47) {
            field7785 = 73;
        }
        ++field7779;
        return super.field3290;
    }

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Ltt;I[BIZ)V", line = 41)
    public class533(class249 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field7776 = arg1;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(BII)Z", line = 53)
    public static final boolean method3144(byte arg0, int arg1, int arg2) {
        if (arg0 != -21) {
            return false;
        } else {
            ++field7782;
            return (1024 & arg2) != 0;
        }
    }

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "(B)J", line = 64)
    public final long method113(byte arg0) {
        ++field7781;
        return arg0 != -46 ? 106L : 0L;
    }

    @OriginalMember(owner = "client!eu", name = "d", descriptor = "(I)V", line = 78)
    public static void method3145(int arg0) {
        if (arg0 != 323998446) {
            field7780 = null;
        }
        field7780 = null;
    }

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "(I)V", line = 88)
    public final void method1503(int arg0) {
        super.field3289.method1763(this, arg0 ^ 324003541);
        if (arg0 != 323998446) {
            this.field7776 = -49;
        }
        ++field7784;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lbs;III)J", line = 103)
    public static final long method3146(class161 arg0, int arg1, int arg2, int arg3) {
        ++field7777;
        long var4 = 4194304L;
        long var6 = 2147483648L;
        long var8 = Long.MIN_VALUE;
        class395 var10 = class247.field3693.method2281(arg0.method99((byte) -107), -9380);
        long var11 = (long) (arg0.method103(-37) << 14 | arg3 << 7 | arg2 | arg0.method97(106) << 20 | 1073741824);
        if (var10.field5840 == arg1) {
            var11 |= var8;
        }
        if (~var10.field5811 == -2) {
            var11 |= var4;
        }
        if (var10.field5789) {
            var11 |= var6;
        }
        return var11 | (long) arg0.method99((byte) -107) << 32;
    }
}
