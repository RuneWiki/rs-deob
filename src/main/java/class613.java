import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class613 {

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field8619;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field8620;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field8621;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "()V")
    public static final void method3375() {
        for (int var0 = 0; var0 < class103.field1389; var0++) {
            class172 var1 = class11.field191[var0];
            class60.method370(var1, true);
            class11.field191[var0] = null;
        }
        class103.field1389 = 0;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)Z")
    public static final boolean method3376(int arg0, int arg1) {
        field8619++;
        if (arg0 != 2429) {
            field8621 = 125;
        }
        return arg1 >= 12 && arg1 <= 17;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILgl;[[B)V")
    public static final void method3377(int arg0, class646 arg1, byte[][] arg2) {
        field8620++;
        int var3 = -23 % ((arg0 + 11) / 49);
        for (int var4 = 0; var4 < arg1.field1255; var4++) {
            class671.method3767((byte) 76);
            for (int var5 = 0; var5 < class431.field5395 >> 3; var5++) {
                for (int var6 = 0; var6 < class452.field5802 >> 3; var6++) {
                    int var7 = class74.field1018[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x356F3AE) >> 24;
                        if (!arg1.field1238 || var8 == 0) {
                            int var9 = (var7 & 0x6) >> 1;
                            int var10 = var7 >> 14 & 0x3FF;
                            int var11 = (var7 & 0x3FFD) >> 3;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class564.field7842.length; var13++) {
                                if (class564.field7842[var13] == var12 && arg2[var13] != null) {
                                    arg1.method3610(var4, class32.field452, 0, class154.field1991, var8, (var10 & 0x7) * 8, arg2[var13], var5 * 8, var6 * 8, var9, (var11 & 0x7) * 8);
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
