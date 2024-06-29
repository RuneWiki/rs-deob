import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nga")
public class class538 extends class494 {

    @OriginalMember(owner = "client!nga", name = "Hb", descriptor = "I")
    public static int field7733;

    @OriginalMember(owner = "client!nga", name = "Ib", descriptor = "I")
    public static int field7734;

    @OriginalMember(owner = "client!nga", name = "Jb", descriptor = "I")
    public static int field7735;

    @OriginalMember(owner = "client!nga", name = "Kb", descriptor = "I")
    public static int field7736;

    @OriginalMember(owner = "client!nga", name = "Lb", descriptor = "I")
    public static int field7737;

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(FB)V")
    public final void method3229(float arg0, byte arg1) {
        ++field7737;
        int var3 = Stream.floatToRawIntBits(arg0);
        super.field7050[super.field7042++] = (byte) (var3 >> 24);
        super.field7050[super.field7042++] = (byte) (var3 >> 16);
        if (arg1 > 48) {
            super.field7050[super.field7042++] = (byte) (var3 >> 8);
            super.field7050[super.field7042++] = (byte) var3;
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(Lha;IBIII[[[BIIIIII)V")
    public static final void method3230(class65 arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, byte[][][] arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field7734;
        if (~arg1 != -1 && ~arg8 != -1) {
            if (~arg1 == -10) {
                arg1 = 1;
                arg3 = 3 & arg3 + 1;
            }
            int var13 = -61 % ((-27 - arg2) / 57);
            if (arg1 == 10) {
                arg1 = 1;
                arg3 = arg3 + 3 & 3;
            }
            if (~arg1 == -12) {
                arg1 = 8;
                arg3 = arg3 + 3 & 3;
            }
            arg0.method438(arg12, arg7, arg11, arg5, arg9, arg4, arg6[arg1 + -1][arg3], arg8, arg10);
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(II[BZ)[B")
    public static final byte[] method3231(int arg0, int arg1, byte[] arg2, boolean arg3) {
        ++field7733;
        if (!arg3) {
            method3230((class65) null, -90, (byte) 16, -128, -103, 22, (byte[][][]) null, -74, 75, 89, -38, -64, 4);
        }
        byte[] var4 = new byte[arg1];
        class595.method3467(arg2, arg0, var4, 0, arg1);
        return var4;
    }

    @OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(I)V")
    public class538(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(FZ)V")
    public final void method3232(float arg0, boolean arg1) {
        if (arg1) {
            ++field7735;
            int var3 = Stream.floatToRawIntBits(arg0);
            super.field7050[super.field7042++] = (byte) var3;
            super.field7050[super.field7042++] = (byte) (var3 >> 8);
            super.field7050[super.field7042++] = (byte) (var3 >> 16);
            super.field7050[super.field7042++] = (byte) (var3 >> 24);
        }
    }

    @OriginalMember(owner = "client!nga", name = "i", descriptor = "(Z)J")
    public static final long method3233(boolean arg0) {
        ++field7736;
        if (!arg0) {
            method3231(20, -85, (byte[]) null, true);
        }
        return class263.field3855.method1520(0);
    }
}
