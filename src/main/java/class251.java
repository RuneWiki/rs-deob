import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class251 {

    @OriginalMember(owner = "client!js", name = "e", descriptor = "F")
    public static float field3648;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "I")
    public int field3644;

    @OriginalMember(owner = "client!js", name = "b", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!js", name = "c", descriptor = "I")
    public int field3646;

    @OriginalMember(owner = "client!js", name = "d", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!js", name = "f", descriptor = "I")
    public int field3649;

    @OriginalMember(owner = "client!js", name = "h", descriptor = "I")
    public int field3651;

    @OriginalMember(owner = "client!js", name = "i", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!js", name = "j", descriptor = "I")
    public int field3653;

    @OriginalMember(owner = "client!js", name = "k", descriptor = "I")
    public int field3654;

    @OriginalMember(owner = "client!js", name = "g", descriptor = "[[Lwca;")
    public static class311[][] field3650;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(I)V", line = 5)
    public static final void method1591(int arg0) {
        class203.method1312(class94.field1158.field278, arg0 + 3);
        field3652++;
        int var1 = (class584.field8677 >> 3) + (class358.field5200 >> 10);
        class355.field5157 = class239.field3493.field3457 = 0;
        int var2 = (class367.field5319 >> 10) + (class424.field6061 >> 3);
        class239.field3493.method1197(8, true, 8);
        byte var3 = 18;
        class184.field2800 = new byte[var3][];
        class162.field2164 = new byte[var3][];
        class69.field787 = new int[var3][4];
        class382.field5584 = new int[var3];
        class62.field727 = new int[var3];
        class256.field3741 = new int[var3];
        class370.field5354 = new int[var3];
        class546.field8156 = new byte[var3][];
        class142.field1853 = new byte[var3][];
        class370.field5345 = new int[var3];
        class347.field5052 = new int[var3];
        class268.field3984 = new byte[var3][];
        int var4 = 0;
        for (int var5 = (var1 - (class35.field399 >> 4)) / 8; var5 <= (((class35.field399 >> 4) + var1) / 8); var5++) {
            for (int var8 = (var2 - (class382.field5586 >> 4)) / 8; var8 <= ((class382.field5586 >> 4) + var2) / 8; var8++) {
                int var9 = (var5 << 8) + var8;
                class256.field3741[var4] = var9;
                class347.field5052[var4] = class594.field8766.method3478(-1, "m" + var5 + "_" + var8);
                class62.field727[var4] = class594.field8766.method3478(-1, "l" + var5 + "_" + var8);
                class370.field5354[var4] = class594.field8766.method3478(-1, "n" + var5 + "_" + var8);
                class382.field5584[var4] = class594.field8766.method3478(-1, "um" + var5 + "_" + var8);
                class370.field5345[var4] = class594.field8766.method3478(-1, "ul" + var5 + "_" + var8);
                if (class370.field5354[var4] == -1) {
                    class347.field5052[var4] = -1;
                    class62.field727[var4] = -1;
                    class382.field5584[var4] = -1;
                    class370.field5345[var4] = -1;
                }
                var4++;
            }
        }
        for (int var6 = var4; var6 < class370.field5354.length; var6++) {
            class370.field5354[var6] = -1;
            class347.field5052[var6] = -1;
            class62.field727[var6] = -1;
            class382.field5584[var6] = -1;
            class370.field5345[var6] = -1;
        }
        byte var7;
        if (class192.field2903 == arg0 || class192.field2903 == 2) {
            var7 = 3;
        } else {
            var7 = 7;
        }
        class11.method53(false, var2, arg0 - 5763, var7, var1);
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(I)V", line = 91)
    public static void method1592(int arg0) {
        field3650 = null;
        if (arg0 != -1) {
            field3650 = null;
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IIII)I", line = 104)
    public static final int method1593(int arg0, int arg1, int arg2, int arg3) {
        field3647++;
        int var4 = arg0 / arg1;
        int var5 = arg0 & arg1 - 1;
        int var6 = arg3 / arg1;
        int var7 = arg3 & arg1 + arg2;
        int var8 = class431.method2639(arg2 ^ 0xFFFFFFBE, var6, var4);
        int var9 = class431.method2639(53, var6, var4 + 1);
        int var10 = class431.method2639(66, var6 + 1, var4);
        int var11 = class431.method2639(98, var6 + 1, var4 + 1);
        int var12 = class422.method2509(var5, var8, true, arg1, var9);
        int var13 = class422.method2509(var5, var10, true, arg1, var11);
        return class422.method2509(var7, var12, true, arg1, var13);
    }
}
