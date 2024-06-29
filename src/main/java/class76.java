import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class76 {

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BIII)Lbba;")
    public static final class124 method666(byte arg0, int arg1, int arg2, int arg3) {
        field1103++;
        class243 var4 = class626.field8501[arg3][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        if (arg0 >= -126) {
            method666((byte) -17, -108, -12, 89);
        }
        class124 var5 = null;
        int var6 = -1;
        for (class48 var7 = var4.field3272; var7 != null; var7 = var7.field726) {
            class319 var8 = var7.field725;
            if (var8 instanceof class124) {
                class124 var9 = (class124) var8;
                int var10 = var9.method655(-125) * 256 + 252 - 256;
                int var11 = var9.field2257 - var10 >> 9;
                int var12 = var9.field2259 - var10 >> 9;
                int var13 = var9.field2257 + var10 >> 9;
                int var14 = var9.field2259 + var10 >> 9;
                if (arg1 >= var11 && var12 <= arg2 && arg1 <= var13 && var14 >= arg2) {
                    int var15 = (var13 + 1 - arg1) * (var14 + 1 - arg2);
                    if (var15 > var6) {
                        var6 = var15;
                        var5 = var9;
                    }
                }
            }
        }
        return var5;
    }
}
