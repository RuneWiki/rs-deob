import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public abstract class class81 extends class128 {

    @OriginalMember(owner = "client!jv", name = "e", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)Ltd;")
    public abstract class455 method602(int arg0);

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "([[BLms;I)V")
    public static final void method603(byte[][] arg0, class760 arg1, int arg2) {
        field1105++;
        if (arg2 != -4789) {
            method603(null, null, -69);
        }
        for (int var3 = 0; var3 < arg1.field3774; var3++) {
            class7.method18(arg2 ^ 0xFFFFB5E3);
            for (int var4 = 0; var4 < class272.field3589 >> 3; var4++) {
                for (int var5 = 0; var5 < class3.field26 >> 3; var5++) {
                    int var6 = class117.field1548[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = var6 >> 24 & 0x3;
                        if (!arg1.field3769 || var7 == 0) {
                            int var8 = var6 >> 1 & 0x3;
                            int var9 = (var6 & 0xFFC290) >> 14;
                            int var10 = (var6 & 0x3FFC) >> 3;
                            int var11 = (var9 / 8 << 8) + (var10 / 8);
                            for (int var12 = 0; var12 < class519.field6991.length; var12++) {
                                if (class519.field6991[var12] == var11 && arg0[var12] != null) {
                                    arg1.method4222(class171.field2130, var3, var7, arg0[var12], var5 * 8, var4 * 8, (var9 & 0x7) * 8, (var10 & 0x7) * 8, var8, class21.field142, arg2 ^ 0xFFFFED33);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
