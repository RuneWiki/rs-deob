import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class58 extends class158 {

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILtp;[[B)V", line = 18)
    public static final void method387(int arg0, class295 arg1, byte[][] arg2) {
        field808++;
        for (int var3 = 0; var3 < arg1.field1524; var3++) {
            class350.method1993(26779);
            for (int var5 = 0; var5 < (class514.field7179 >> 3); var5++) {
                for (int var6 = 0; var6 < (class456.field6281 >> 3); var6++) {
                    int var7 = class540.field7549[var3][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x343096B) >> 24;
                        if (!arg1.field1519 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = (var7 & 0xFFDAD5) >> 14;
                            int var11 = (var7 & 0x3FFA) >> 3;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class592.field8537.length; var13++) {
                                if (class592.field8537[var13] == var12 && arg2[var13] != null) {
                                    arg1.method1730(var8, (var11 & 0x7) * 8, class464.field6351, var6 * 8, (var10 & 0x7) * 8, class96.field1401, var5 * 8, true, arg2[var13], var9, var3);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        int var4 = -88 % ((arg0 + 39) / 37);
    }
}
