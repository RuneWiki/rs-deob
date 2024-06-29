import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class464 {

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "B")
    public byte field6623;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "[I")
    public int[] field6627;

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "[I")
    public int[] field6635;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "[I")
    public int[] field6625;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "B")
    public byte field6629;

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "S")
    public short field6636;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "S")
    public short field6634;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "S")
    public short field6633;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "[S")
    public short[] field6626;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "[S")
    public short[] field6628;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "[S")
    public short[] field6632;

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "S")
    public short field6630;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public static int field6624;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "I")
    public static int field6631;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "Loh;")
    public static class404 field6622;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B[[BLfca;)V")
    public static final void method2823(byte arg0, byte[][] arg1, class84 arg2) {
        for (int var3 = 0; var3 < arg2.field9051; var3++) {
            class381.method2343(false);
            for (int var4 = 0; var4 < (class489.field6976 >> 3); var4++) {
                for (int var5 = 0; var5 < class153.field1677 >> 3; var5++) {
                    int var6 = class366.field4673[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = (var6 & 0x323958E) >> 24;
                        if (!arg2.field9052 || var7 == 0) {
                            int var8 = var6 >> 1 & 0x3;
                            int var9 = var6 >> 14 & 0x3FF;
                            int var10 = var6 >> 3 & 0x7FF;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            for (int var12 = 0; var12 < class74.field773.length; var12++) {
                                if (class74.field773[var12] == var11 && arg1[var12] != null) {
                                    arg2.method587(var7, (var10 & 0x7) * 8, (byte) -115, arg1[var12], (var9 & 0x7) * 8, var5 * 8, var4 * 8, class275.field3370, var8, class205.field2430, var3);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg0 <= 123) {
            method2824(91);
        }
        field6631++;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
    public static void method2824(int arg0) {
        if (arg0 != 4818) {
            field6624 = 114;
        }
        field6622 = null;
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
    public class464(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        this.field6623 = (byte) arg1;
        this.field6627 = new int[4];
        this.field6635 = new int[4];
        this.field6625 = new int[4];
        this.field6629 = (byte) arg0;
        this.field6627[1] = arg3;
        this.field6627[3] = arg5;
        this.field6627[2] = arg4;
        this.field6627[0] = arg2;
        this.field6625[1] = arg7;
        this.field6625[0] = arg6;
        this.field6625[2] = arg8;
        this.field6625[3] = arg9;
        this.field6636 = (short) (arg2 >> class748.field10430);
        this.field6635[2] = arg12;
        this.field6635[0] = arg10;
        this.field6635[3] = arg13;
        this.field6635[1] = arg11;
        this.field6634 = (short) (arg4 >> class748.field10430);
        this.field6633 = (short) (arg10 >> class748.field10430);
        this.field6626 = new short[4];
        this.field6628 = new short[4];
        this.field6632 = new short[4];
        this.field6630 = (short) (arg12 >> class748.field10430);
    }

    static {
        new class104("", 73);
    }
}
