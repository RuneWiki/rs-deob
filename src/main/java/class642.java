import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class642 {

    @OriginalMember(owner = "client!ev", name = "e", descriptor = "I")
    public static int field9172 = 0;

    @OriginalMember(owner = "client!ev", name = "c", descriptor = "[I")
    public static int[] field9170 = new int[2];

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "I")
    public static int field9168;

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "I")
    public static int field9169;

    @OriginalMember(owner = "client!ev", name = "d", descriptor = "[Ljv;")
    public static class70[] field9171;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(II)Z")
    public static final boolean method3650(int arg0, int arg1) {
        if (arg0 == -3898) {
            field9168++;
            return arg1 != 1 && arg1 != 7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)V")
    public static void method3651(int arg0) {
        field9170 = null;
        if (arg0 != -1) {
            field9172 = 69;
        }
        field9171 = null;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIIII)V")
    public static final void method3652(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class16.field315 != null) {
            class16.field315[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class285.field3860 != null) {
            class285.field3860[arg0][arg1] = (short) arg3;
        }
        if (class206.field2475 != null) {
            class206.field2475[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(BI)S")
    public static final short method3653(byte arg0, int arg1) {
        field9169++;
        int var2 = arg1 >> 10 & 0x3F;
        int var3 = (arg1 & 0x380) >> 3;
        int var4 = arg1 & 0x7F;
        int var5 = var4 > 64 ? (127 - var4) * var3 >> 7 : var3 * var4 >> 7;
        if (arg0 != 3) {
            method3653((byte) -120, 91);
        }
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var2 << 10 | var7 >> 4 << 7 | var6);
    }
}
