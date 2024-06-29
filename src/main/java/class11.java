import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class11 extends class213 {

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "[[I")
    public static int[][] field152 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "[Llf;")
    public static class130[] field150;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)V", line = 3)
    public static void method68(boolean arg0) {
        field152 = null;
        field150 = null;
        if (!arg0) {
            field150 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Laa;I)V", line = 36)
    public static final void method69(class281 arg0, int arg1) {
        arg0.method1735(0, 0, class194.field2696, 350);
        field151++;
        arg0.method1785(0, 0, class194.field2696, 350, class60.field848 << 24 | 0x332277, 1);
        if (arg1 > -79) {
            field150 = null;
        }
        for (int var2 = 0; var2 < 100; var2++) {
            int var13 = class247.field3423[var2];
            int var14 = class294.field4059[var2];
            arg0.method1785(var13, var14, 2, 2, class184.field2570[var2] << 24 | 0xFFFFFF, 1);
        }
        int var3 = 350 / class395.field5773;
        if (class356.field5021 > 0) {
            int var4 = 346 - class395.field5773 - 4;
            int var5 = var3 * var4 / (class356.field5021 + var3 - 1);
            int var6 = 4;
            if (class356.field5021 > 1) {
                var6 += (class356.field5021 - class266.field3637 - 1) * (var4 - var5) / (class356.field5021 - 1);
            }
            arg0.method1785(class194.field2696 - 16, var6, 12, var5, class60.field848 << 24 | 0x332277, 2);
            for (int var7 = class266.field3637; var7 < (class266.field3637 + var3) && var7 < class356.field5021; var7++) {
                String[] var8 = class65.method449((byte) -120, class173.field2458[var7], '\b');
                int var9 = (class194.field2696 - 16 - 8) / var8.length;
                for (int var10 = 0; var10 < var8.length; var10++) {
                    int var11 = var9 * var10 + 8;
                    arg0.method1735(var11, 0, var11 - (8 - var9), 350);
                    class216.field2867.method2278(-1, 350 - ((var7 - class266.field3637) * class395.field5773) - (class216.field2869 + class235.field3194.field1025) - 2, -16777216, var8[var10], (byte) -74, var11);
                }
            }
        }
        arg0.method1735(0, 0, class194.field2696, 350);
        arg0.method1739(-1, 1, 350 - class216.field2869, 0, class194.field2696);
        class220.field2899.method2278(-1, 349 - class204.field2769.field1025, -16777216, "--> " + class60.field844, (byte) -112, 10);
        int var12 = -1;
        if (class35.field541 % 30 > 15) {
            var12 = 16777215;
        }
        arg0.method1820(1, class204.field2769.method448((byte) -56, "--> " + class60.field844.substring(0, class275.field3735)) + 10, 12, 350 - class204.field2769.field1025 - 11, var12);
    }
}
