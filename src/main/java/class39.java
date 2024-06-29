import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class39 extends class293 {

    @OriginalMember(owner = "client!is", name = "J", descriptor = "Z")
    public static boolean field539 = false;

    @OriginalMember(owner = "client!is", name = "L", descriptor = "I")
    public static volatile int field541 = 0;

    @OriginalMember(owner = "client!is", name = "N", descriptor = "[I")
    public static int[] field543 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!is", name = "K", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!is", name = "M", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!is", name = "c", descriptor = "(I)Z", line = 4)
    public static final boolean method278(int arg0) {
        field542++;
        if (arg0 != -16884) {
            field541 = -27;
        }
        return class61.field803 != 0 || class185.field2510 >= 2;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(BJ)V", line = 25)
    public static final void method279(byte arg0, long arg1) {
        int var3 = -61 / ((arg0 - 18) / 46);
        field540++;
        int var4 = class363.field5238;
        if (class153.field2071 != var4) {
            int var5 = var4 - class153.field2071;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var6 > var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var5 > var6) {
                var6 = var5;
            }
            class153.field2071 += var6;
        }
        int var7 = class122.field1687;
        if (!class184.field2496) {
            class317.field4647 += (float) arg1 * class191.field2559 / 40.0F * 8.0F;
            class396.field5847 += (float) arg1 * class178.field2361 / 40.0F * 8.0F;
        }
        if (class144.field1962 != var7) {
            int var8 = var7 - class144.field1962;
            int var9 = (int) ((long) var8 * arg1 / 320L);
            if (var8 <= 0) {
                if (var9 == 0) {
                    var9 = -1;
                } else if (var8 > var9) {
                    var9 = var8;
                }
            } else if (var9 == 0) {
                var9 = 1;
            } else if (var8 < var9) {
                var9 = var8;
            }
            class144.field1962 += var9;
        }
        class407.method2627(3);
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(B)V", line = 110)
    public static void method280(byte arg0) {
        if (arg0 < 26) {
            field541 = -79;
        }
        field543 = null;
    }
}
