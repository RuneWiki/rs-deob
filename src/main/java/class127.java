import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ofa")
public class class127 {

    @OriginalMember(owner = "client!ofa", name = "d", descriptor = "J")
    public static long field1639 = 0L;

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!ofa", name = "c", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!ofa", name = "b", descriptor = "[I")
    public static int[] field1637;

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(BLoa;)V", line = 7)
    public static final void method923(byte arg0, class43 arg1) {
        field1636++;
        arg1.method376(0, 0, class519.field6796, 350);
        arg1.method353(0, 0, class519.field6796, 350, class677.field9344 << 24 | 0x332277, 1);
        int var2 = 350 / class483.field6443;
        if (class5.field36 > 0) {
            int var3 = 346 - class483.field6443 - 4;
            int var4 = var2 * var3 / (class5.field36 + var2 - 1);
            int var5 = 4;
            if (class5.field36 > 1) {
                var5 += (var3 - var4) * (class5.field36 - class377.field4834 - 1) / (class5.field36 - 1);
            }
            arg1.method353(class519.field6796 - 16, var5, 12, var4, class677.field9344 << 24 | 0x332277, 2);
            for (int var6 = class377.field4834; (class377.field4834 + var2) > var6 && var6 < class5.field36; var6++) {
                String[] var7 = class420.method2420('\b', -97, class612.field8281[var6]);
                int var8 = (class519.field6796 - 24) / var7.length;
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var8 * var9 + 8;
                    arg1.method376(var10, 0, var10 - (8 - var8), 350);
                    class562.field7337.method3243(var7[var9], var10, 350 - ((var6 - class377.field4834) * class483.field6443) - class401.field5111.field7102 - class398.field5073 - 2, -1, -16777216, -14);
                }
            }
        }
        arg1.method376(0, 0, class519.field6796, 350);
        arg1.method331(350 - class398.field5073, 1, class519.field6796, -1, 0);
        int var11 = -50 / ((arg0 + 27) / 55);
        class456.field5983.method3243("--> " + class247.field3327, 10, 349 - class411.field5305.field7102, -1, -16777216, -84);
        if (!class164.field2043) {
            return;
        }
        int var12 = -1;
        if ((class424.field5503 % 30) > 15) {
            var12 = 16777215;
        }
        arg1.method372(12, 1, var12, 350 - class411.field5305.field7102 - 11, class411.field5305.method2900(true, "--> " + class247.field3327.substring(0, class41.field583)) + 10);
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(II)I", line = 72)
    public static final int method924(int arg0, int arg1) {
        field1638++;
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            var2 += 16;
            arg1 >>>= 0x10;
        }
        if (arg1 >= 256) {
            var2 += 8;
            arg1 >>>= 0x8;
        }
        if (arg1 >= 16) {
            var2 += 4;
            arg1 >>>= 0x4;
        }
        if (arg0 != 12) {
            field1637 = null;
        }
        if (arg1 >= 4) {
            var2 += 2;
            arg1 >>>= 0x2;
        }
        if (arg1 >= 1) {
            arg1 >>>= 0x1;
            var2++;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(B)V", line = 122)
    public static void method925(byte arg0) {
        int var1 = 3 / ((-arg0 - 16) / 34);
        field1637 = null;
    }
}
