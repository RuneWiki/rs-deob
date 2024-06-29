import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public abstract class class68 extends class417 {

    @OriginalMember(owner = "client!qw", name = "j", descriptor = "Lbn;")
    public static class378 field863 = new class378(5, 17);

    @OriginalMember(owner = "client!qw", name = "i", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!qw", name = "k", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!qw", name = "l", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!qw", name = "m", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(IIIIII)V", line = 11)
    public static final void method531(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field866++;
        int var9 = arg3 + 1;
        class140.method969(arg5, 15888, arg0, arg1, class604.field8993[arg3]);
        int var10 = arg4 - 1;
        class140.method969(arg5, 15888, arg0, arg1, class604.field8993[arg4]);
        for (int var6 = var9; var6 <= var10; var6++) {
            int[] var7 = class604.field8993[var6];
            var7[arg5] = var7[arg1] = arg0;
        }
        if (arg2 > -45) {
            field863 = null;
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "([BII)I", line = 36)
    public static final int method533(byte[] arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method538(-75, -69, 21);
        }
        field864++;
        return class647.method3730(arg0, -26639, 0, arg1);
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(JJ)J", line = 47)
    public static long method534(long arg0, long arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lvn;BII)V", line = 54)
    public static final void method535(class261 arg0, byte arg1, int arg2, int arg3) {
        int var4 = 104 % ((-arg1 - 54) / 32);
        class491.field6998[arg3][arg2] = arg0;
        field862++;
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(III)Z", line = 66)
    public static final boolean method538(int arg0, int arg1, int arg2) {
        field865++;
        if (arg1 >= -8) {
            return true;
        } else {
            return (arg2 & 0x800) != 0;
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(I)V", line = 82)
    public static void method540(int arg0) {
        if (arg0 != -4) {
            method531(-54, -87, -97, 77, -67, -87);
        }
        field863 = null;
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(B)I")
    public abstract int method532(byte arg0);

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(Z)I")
    public abstract int method536(boolean arg0);

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "(B)J")
    public abstract long method537(byte arg0);

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "(Z)I")
    public abstract int method539(boolean arg0);

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "(I)I")
    public abstract int method541(int arg0);
}
