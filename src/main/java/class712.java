import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public class class712 {

    @OriginalMember(owner = "client!lga", name = "c", descriptor = "I")
    private int field9941;

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "I")
    public int field9940;

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "I")
    public static int field9939;

    @OriginalMember(owner = "client!lga", name = "d", descriptor = "I")
    public static int field9942;

    @OriginalMember(owner = "client!lga", name = "e", descriptor = "I")
    public static int field9943;

    @OriginalMember(owner = "client!lga", name = "f", descriptor = "I")
    public static int field9944;

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(IILmv;ILsba;IBLjava/lang/String;Laa;IILda;)V")
    public static final void method3990(int arg0, int arg1, class377 arg2, int arg3, class218 arg4, int arg5, byte arg6, String arg7, class487 arg8, int arg9, int arg10, class61 arg11) {
        field9942++;
        int var12;
        if (class8.field57 == 4) {
            var12 = (int) class183.field2237 & 0x3FFF;
        } else {
            var12 = (int) class183.field2237 + class514.field6956 & 0x3FFF;
        }
        int var13 = Math.max(arg4.field2781 / 2, arg4.field2718 / 2) + 10;
        int var14 = arg0 * arg0 + arg10 * arg10;
        if ((var13 * var13) < var14) {
            return;
        }
        if (arg6 < 73) {
            method3990(52, -42, null, -60, null, 123, (byte) 1, null, null, -98, -39, null);
        }
        int var15 = class15.field113[var12];
        int var16 = class15.field115[var12];
        if (class8.field57 != 4) {
            var15 = var15 * 256 / (class283.field3747 + 256);
            var16 = var16 * 256 / (class283.field3747 + 256);
        }
        int var17 = arg0 * var16 + arg10 * var15 >> 14;
        int var18 = arg10 * var16 - (arg0 * var15) >> 14;
        int var19 = arg2.method2212(100, arg7, null, (byte) 106);
        int var20 = arg2.method2214(null, 100, 0, arg7, true);
        int var21 = var17 - var19 / 2;
        if (-arg4.field2781 <= var21 && arg4.field2781 >= var21 && -arg4.field2718 <= var18 && var18 <= arg4.field2718) {
            arg11.method473(arg4.field2781 / 2 + var21 + arg1, null, var19, arg7, arg1, 0, arg8, 1, (byte) -75, arg9, null, 0, arg3, 0, arg3 - var18 - var20 - (-(arg4.field2718 / 2) - -arg5), 50);
        }
    }

    @OriginalMember(owner = "client!lga", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9943++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(I)I")
    public final int method3991(int arg0) {
        field9944++;
        if (arg0 != 2) {
            field9939 = -128;
        }
        return this.field9941;
    }

    @OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(II)V")
    public class712(int arg0, int arg1) {
        this.field9941 = arg0;
        this.field9940 = arg1;
    }
}
