import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class76 {

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "Ldr;")
    public static class675 field996 = new class675(27, 4);

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "[I")
    public static int[] field998 = new int[64];

    @OriginalMember(owner = "client!gv", name = "f", descriptor = "I")
    public static int field1000 = 0;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "Lgca;")
    public static class234 field997;

    @OriginalMember(owner = "client!gv", name = "e", descriptor = "[I")
    public static int[] field999;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(ILgo;[[B)V", line = 22)
    public static final void method602(int arg0, class586 arg1, byte[][] arg2) {
        if (arg0 <= 62) {
            field999 = null;
        }
        for (int var3 = 0; var3 < arg1.field2221; var3++) {
            class428.method2354(-6331);
            for (int var4 = 0; var4 < class85.field1090 >> 3; var4++) {
                for (int var5 = 0; var5 < (class656.field8932 >> 3); var5++) {
                    int var6 = class296.field3773[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = var6 >> 24 & 0x3;
                        if (!arg1.field2240 || var7 == 0) {
                            int var8 = (var6 & 0x7) >> 1;
                            int var9 = var6 >> 14 & 0x3FF;
                            int var10 = (var6 & 0x3FFE) >> 3;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            for (int var12 = 0; var12 < class307.field3888.length; var12++) {
                                if (class307.field3888[var12] == var11 && arg2[var12] != null) {
                                    arg1.method3249(arg2[var12], 4, (var10 & 0x7) * 8, class634.field8601, class309.field3898, var4 * 8, var5 * 8, var7, (var9 & 0x7) * 8, var3, var8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        field995++;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)V", line = 93)
    public static void method603(int arg0) {
        field996 = null;
        field997 = null;
        int var1 = -125 % ((67 - arg0) / 34);
        field998 = null;
        field999 = null;
    }
}
