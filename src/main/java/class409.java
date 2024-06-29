import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public abstract class class409 {

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "Z")
    public static boolean field5948 = false;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public static int field5942;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "I")
    public static int field5943;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
    public static int field5944;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    public int field5945;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public static int field5946;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public static int field5947;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
    public int field5949;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "I")
    public int field5950;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "I")
    public static int field5951;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "I")
    public static int field5952;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)Z")
    public final boolean method2586(byte arg0) {
        if (arg0 > -44) {
            field5952 = -6;
        }
        field5951++;
        return (this.field5950 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)Z")
    public final boolean method2587(int arg0) {
        field5944++;
        if (arg0 < 110) {
            this.method2589((byte) -69);
        }
        return (this.field5950 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)Z")
    public final boolean method2588(int arg0) {
        if (arg0 < 35) {
            field5948 = true;
        }
        field5947++;
        return (this.field5950 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(B)Z")
    public final boolean method2589(byte arg0) {
        if (arg0 != -38) {
            this.field5949 = -77;
        }
        field5943++;
        return (this.field5950 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lqr;IILtj;II)V")
    public static final void method2590(class212 arg0, int arg1, int arg2, class298 arg3, int arg4, int arg5) {
        field5946++;
        class237 var6 = class90.method717((byte) -60, arg0.field2978);
        if (var6.field3311 == -1) {
            return;
        }
        int var7;
        if (arg0.field2957) {
            int var8 = arg0.field2952 + arg4;
            var7 = var8 & 0x3;
        } else {
            var7 = 0;
        }
        class315 var9 = var6.method1543(arg3, var7, 3, arg0.field2908);
        if (var9 == null) {
            return;
        }
        int var10 = -89 / ((arg5 - 18) / 36);
        int var11 = arg0.field2946;
        int var12 = arg0.field2970;
        if ((var7 & 0x1) == 1) {
            var12 = arg0.field2946;
            var11 = arg0.field2970;
        }
        int var13 = var9.method199();
        int var14 = var9.method207();
        if (var6.field3308) {
            var14 = var12 * 4;
            var13 = var11 * 4;
        }
        if (var6.field3314 == 0) {
            var9.method2065(arg2, arg1 - ((var12 - 1) * 4), var13, var14);
        } else {
            var9.method200(arg2, arg1 - ((var12 - 1) * 4), var13, var14, 1, var6.field3314 | 0xFF000000, 1);
        }
    }
}
