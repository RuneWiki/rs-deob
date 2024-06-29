import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public abstract class class271 extends class27 {

    @OriginalMember(owner = "client!lt", name = "E", descriptor = "S")
    public short field3534;

    @OriginalMember(owner = "client!lt", name = "D", descriptor = "Lwv;")
    public static class423 field3533 = null;

    @OriginalMember(owner = "client!lt", name = "H", descriptor = "Llg;")
    public static class32 field3537 = new class32(10, 2, 2, 0);

    @OriginalMember(owner = "client!lt", name = "J", descriptor = "J")
    public static volatile long field3539 = 0L;

    @OriginalMember(owner = "client!lt", name = "C", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!lt", name = "F", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!lt", name = "G", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!lt", name = "I", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(B[BIIIII)Z", line = 8)
    public static final boolean method1613(byte arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3536;
        int var7 = arg2 % arg6;
        int var8;
        if (var7 != 0) {
            var8 = arg6 - var7;
        } else {
            var8 = 0;
        }
        int var9 = -((arg3 - -arg6 + -1) / arg6);
        int var10 = -((arg2 + arg6 - 1) / arg6);
        for (int var11 = var9; ~var11 > -1; ++var11) {
            for (int var12 = var10; var12 < 0; ++var12) {
                if (~arg1[arg4] == -1) {
                    return true;
                }
                arg4 += arg6;
            }
            int var13 = arg4 - var8;
            if (~arg1[var13 - 1] == -1) {
                return true;
            }
            arg4 = arg5 + var13;
        }
        if (arg0 != -68) {
            method1613((byte) -16, (byte[]) null, 126, -16, -98, 46, -60);
        }
        return false;
    }

    @OriginalMember(owner = "client!lt", name = "m", descriptor = "(I)V", line = 57)
    public static void method1614(int arg0) {
        if (arg0 != 2) {
            field3537 = null;
        }
        field3537 = null;
        field3533 = null;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Z)Z", line = 70)
    public final boolean method171(boolean arg0) {
        if (arg0) {
            field3533 = null;
        }
        ++field3532;
        return class165.field2371[(super.field398 >> class62.field762) + -class501.field6888 + class312.field4204][(super.field397 >> class62.field762) + -class377.field4997 + class312.field4204];
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "([Lqea;B)I", line = 81)
    public final int method170(class392[] arg0, byte arg1) {
        ++field3535;
        return arg1 < 9 ? -97 : this.method178(super.field398 >> class62.field762, arg0, 1, super.field397 >> class62.field762);
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(IIIIII)V", line = 92)
    public class271(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3534 = (short) arg5;
        super.field386 = (byte) arg4;
        super.field397 = arg2;
        super.field398 = arg0;
        super.field385 = (byte) arg3;
        super.field388 = arg1;
    }

    @OriginalMember(owner = "client!lt", name = "h", descriptor = "(I)Z", line = 106)
    public final boolean method164(int arg0) {
        ++field3538;
        int var2 = 7 % ((arg0 - -42) / 58);
        return class454.method2559(super.field398 >> class62.field762, super.field386, 1, super.field397 >> class62.field762);
    }
}
