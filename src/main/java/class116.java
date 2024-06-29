import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rja")
public class class116 implements Runnable {

    @OriginalMember(owner = "client!rja", name = "d", descriptor = "[Llv;")
    public volatile class470[] field2122 = new class470[2];

    @OriginalMember(owner = "client!rja", name = "b", descriptor = "Z")
    public volatile boolean field2120 = false;

    @OriginalMember(owner = "client!rja", name = "e", descriptor = "Z")
    public volatile boolean field2123 = false;

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "I")
    public static int field2119 = 0;

    @OriginalMember(owner = "client!rja", name = "c", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!rja", name = "g", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!rja", name = "h", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!rja", name = "i", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!rja", name = "f", descriptor = "Llu;")
    public class742 field2124;

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(I)V", line = 9)
    public static final void method1029(int arg0) {
        field2121++;
        if (arg0 == ~class111.field1911.field6734.method3639((byte) 103) && class426.field5820 != class282.field3917) {
            class465.method2683(119, 11, class666.field9269, false, class171.field2735);
        } else {
            class177.method1335((byte) 120, class95.field1472);
            if (class605.field8447 != class282.field3917) {
                class725.method4023(-50);
            }
        }
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(IIII)I", line = 29)
    public static final int method1030(int arg0, int arg1, int arg2, int arg3) {
        field2127++;
        int var4 = 55 % ((-arg0 - 33) / 51);
        int var5 = arg1 / arg3;
        int var6 = arg1 & arg3 - 1;
        int var7 = arg2 / arg3;
        int var8 = arg3 - 1 & arg2;
        int var9 = class786.method4287(1, var5, var7);
        int var10 = class786.method4287(1, var5 + 1, var7);
        int var11 = class786.method4287(1, var5, var7 + 1);
        int var12 = class786.method4287(1, var5 + 1, var7 - -1);
        int var13 = class442.method2571(var6, arg3, var10, var9, (byte) -50);
        int var14 = class442.method2571(var6, arg3, var12, var11, (byte) -9);
        return class442.method2571(var8, arg3, var14, var13, (byte) -11);
    }

    @OriginalMember(owner = "client!rja", name = "run", descriptor = "()V", line = 70)
    public final void run() {
        this.field2123 = true;
        field2125++;
        try {
            while (!this.field2120) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class470 var2 = this.field2122[var1];
                    if (var2 != null) {
                        var2.method2709((byte) -114);
                    }
                }
                class643.method3577(10L, 0);
                class719.method3992((byte) -60, this.field2124, null);
            }
        } catch (Exception var9) {
            class281.method1820(null, 28395, var9);
        } finally {
            Object var6 = null;
            this.field2123 = false;
        }
    }
}
