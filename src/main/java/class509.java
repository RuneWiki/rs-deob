import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public class class509 {

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "I")
    public static int field7022;

    @OriginalMember(owner = "client!cga", name = "b", descriptor = "I")
    public static int field7023;

    @OriginalMember(owner = "client!cga", name = "c", descriptor = "I")
    public static int field7024;

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(I[S)[S")
    public static final short[] method2951(int arg0, short[] arg1) {
        field7022++;
        if (arg1 == null) {
            return null;
        } else if (arg0 == -29647) {
            short[] var2 = new short[arg1.length];
            class278.method1800(arg1, 0, var2, 0, arg1.length);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(ILhe;II)J")
    public static final long method2952(int arg0, class392 arg1, int arg2, int arg3) {
        field7023++;
        long var4 = 4194304L;
        long var6 = Long.MIN_VALUE;
        class589 var8 = class350.field5132.method3732((byte) 67, arg1.method31(-23356));
        long var9 = (long) (arg2 | 0x40000000 | arg3 << 7 | arg1.method18(arg0 ^ 0xFFFFD564) << 14 | arg1.method17(arg0 - 2132) << 20);
        if (var8.field7933 == arg0) {
            var9 |= var6;
        }
        if (var8.field7897 == 1) {
            var9 |= var4;
        }
        return var9 | (long) arg1.method31(-23356) << 32;
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(III)Z")
    public static final boolean method2953(int arg0, int arg1, int arg2) {
        field7024++;
        if (arg0 == -1) {
            return (arg2 & 0x100) != 0;
        } else {
            return false;
        }
    }
}
