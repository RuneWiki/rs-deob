import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public abstract class class5 extends class216 {

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "S")
    public short field41;

    @OriginalMember(owner = "client!ti", name = "y", descriptor = "S")
    public short field52;

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
    public int field40;

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "B")
    public byte field43;

    @OriginalMember(owner = "client!ti", name = "B", descriptor = "S")
    public short field55;

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "I")
    public int field44;

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "S")
    public short field47;

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "B")
    public byte field42;

    @OriginalMember(owner = "client!ti", name = "w", descriptor = "Z")
    public boolean field50;

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "I")
    public int field45;

    @OriginalMember(owner = "client!ti", name = "z", descriptor = "[I")
    public static int[] field53 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ti", name = "v", descriptor = "I")
    public static int field49 = 0;

    @OriginalMember(owner = "client!ti", name = "u", descriptor = "[I")
    public static int[] field48 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ti", name = "D", descriptor = "I")
    public static int field57 = 0;

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!ti", name = "x", descriptor = "I")
    public int field51;

    @OriginalMember(owner = "client!ti", name = "A", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!ti", name = "C", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "Lij;")
    public static class316 field39;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I[S)[S", line = 10)
    public static final short[] method24(int arg0, short[] arg1) {
        field54++;
        if (arg1 == null) {
            return null;
        } else {
            short[] var2 = new short[arg1.length];
            class79.method645(arg1, 0, var2, arg0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "(I)V", line = 31)
    public static void method25(int arg0) {
        field39 = null;
        field48 = null;
        field53 = null;
        if (arg0 != 128) {
            field53 = null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(B)V", line = 48)
    public void method26(byte arg0) {
        if (arg0 >= 34) {
            field46++;
        }
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(IIIIIIIIZB)V", line = 62)
    public class5(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field41 = (short) arg7;
        this.field52 = (short) arg4;
        this.field40 = (short) arg1;
        this.field43 = arg9;
        this.field55 = (short) arg6;
        this.field44 = (short) arg3;
        this.field47 = (short) arg5;
        this.field42 = (byte) arg0;
        this.field50 = arg8;
        this.field45 = (short) arg2;
    }

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "(I)I")
    public abstract int method23(int arg0);
}
