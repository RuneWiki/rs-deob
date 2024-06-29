import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class290 implements Runnable {

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "[Ljf;")
    public volatile class65[] field4574 = new class65[2];

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "Z")
    public volatile boolean field4580 = false;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "Z")
    public volatile boolean field4576 = false;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "[S")
    public static short[] field4575 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "Lfg;")
    public class12 field4577;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "Lpf;")
    public static class294 field4573;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "[I")
    public static int[] field4579;

    @OriginalMember(owner = "client!ch", name = "run", descriptor = "()V")
    public final void run() {
        this.field4576 = true;
        try {
            while (!this.field4580) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class65 var2 = this.field4574[var1];
                    if (var2 != null) {
                        var2.method438(2000);
                    }
                }
                class250.method1643(1, 10L);
                class122.method775(65, (Object) null, this.field4577);
            }
        } catch (Exception var9) {
            class275.method1822((String) null, (byte) -85, var9);
        } finally {
            Object var6 = null;
            this.field4576 = false;
        }
        field4578++;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method1929(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class143.field2097[arg0][var8][var14] == -class166.field2548) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class67.field1072[arg0][arg1][arg3] + arg5;
            if (!class255.method1684(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class255.method1684(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class255.method1684(var9, var11, var13)) {
                return false;
            } else if (class255.method1684(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class236.method1501(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class255.method1684(var6 + 1, class67.field1072[arg0][arg1][arg3] + arg5, var7 + 1) && class255.method1684(var6 + 128 - 1, class67.field1072[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class255.method1684(var6 + 128 - 1, class67.field1072[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class255.method1684(var6 + 1, class67.field1072[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
    public static void method1930(int arg0) {
        field4575 = null;
        field4579 = null;
        field4573 = null;
        if (arg0 != 128) {
            method1929(-32, -121, 25, 7, 20, -31);
        }
    }
}
