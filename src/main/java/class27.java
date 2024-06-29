import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public abstract class class27 {

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field604 = 1403;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field605 = new BigInteger("92f0c5123c5c056d07b275553ed048af3ad3c5ff8c727fd90984a24b991209762b9581dac2d1b3527c06fbd564787d9f9d1dfece4c713429fb92ccfe3f39942b", 16);

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "Lwo;")
    public static class690 field606 = new class690(48, 0);

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "[Lgp;")
    public static class45[] field609;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZI)Z")
    public static final boolean method378(int arg0, boolean arg1, int arg2) {
        field608++;
        if (arg1) {
            return true;
        } else {
            return (arg2 & 0x800) != 0;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZ[S)[S")
    public static final short[] method379(int arg0, boolean arg1, short[] arg2) {
        field607++;
        if (arg1) {
            return null;
        } else {
            short[] var3 = new short[arg0];
            class252.method1543(arg2, 0, var3, 0, arg0);
            return var3;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ltca;I)Ltca;")
    public abstract class155 method380(class155 arg0, int arg1);

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public static void method381(int arg0) {
        field605 = null;
        field609 = null;
        if (arg0 <= 11) {
            method381(-84);
        }
        field606 = null;
    }
}
