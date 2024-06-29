import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class335 extends class93 {

    @OriginalMember(owner = "client!iw", name = "Cb", descriptor = "Lkh;")
    public static class17 field4518 = null;

    @OriginalMember(owner = "client!iw", name = "Db", descriptor = "I")
    public static int field4519 = -1;

    @OriginalMember(owner = "client!iw", name = "Ab", descriptor = "I")
    public static int field4516 = -1;

    @OriginalMember(owner = "client!iw", name = "Fb", descriptor = "F")
    public static float field4521;

    @OriginalMember(owner = "client!iw", name = "Bb", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!iw", name = "Eb", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!iw", name = "Gb", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!iw", name = "e", descriptor = "(Z)V")
    public static final void method2097(boolean arg0) {
        class271.field3794.method338((byte) -89);
        ++field4517;
        if (arg0) {
            field4519 = 105;
        }
        class191.field2934.method1950(0);
        class38.field639.method1950(0);
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(FZ)V")
    public final void method2098(float arg0, boolean arg1) {
        ++field4522;
        if (!arg1) {
            field4521 = 0.9970161F;
        }
        int var3 = Stream.floatToRawIntBits(arg0);
        super.field1413[super.field1442++] = (byte) (var3 >> 24);
        super.field1413[super.field1442++] = (byte) (var3 >> 16);
        super.field1413[super.field1442++] = (byte) (var3 >> 8);
        super.field1413[super.field1442++] = (byte) var3;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(Lr;III[Z)Z")
    public static final boolean method2099(class196 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class745.field10286 != class178.field2805) {
            int var6 = class142.field2418[arg1].method1907(arg2, (byte) 92, arg3);
            for (int var7 = 0; var7 <= arg1; ++var7) {
                class296 var8 = class142.field2418[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method1907(arg2, (byte) 94, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method1901(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method1902(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(I)V")
    public class335(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!iw", name = "f", descriptor = "(Z)V")
    public static void method2100(boolean arg0) {
        if (!arg0) {
            method2099((class196) null, -78, -71, 85, (boolean[]) null);
        }
        field4518 = null;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(IF)V")
    public final void method2101(int arg0, float arg1) {
        if (arg0 != 1836032144) {
            method2099((class196) null, -124, -31, -12, (boolean[]) null);
        }
        ++field4520;
        int var3 = Stream.floatToRawIntBits(arg1);
        super.field1413[super.field1442++] = (byte) var3;
        super.field1413[super.field1442++] = (byte) (var3 >> 8);
        super.field1413[super.field1442++] = (byte) (var3 >> 16);
        super.field1413[super.field1442++] = (byte) (var3 >> 24);
    }
}
