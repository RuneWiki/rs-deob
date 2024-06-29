import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class191 {

    @OriginalMember(owner = "client!wp", name = "l", descriptor = "I")
    public int field2956;

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "I")
    public int field2947;

    @OriginalMember(owner = "client!wp", name = "k", descriptor = "S")
    public short field2955;

    @OriginalMember(owner = "client!wp", name = "f", descriptor = "I")
    public int field2950;

    @OriginalMember(owner = "client!wp", name = "j", descriptor = "Z")
    public boolean field2954;

    @OriginalMember(owner = "client!wp", name = "g", descriptor = "I")
    public int field2951;

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "S")
    public short field2948;

    @OriginalMember(owner = "client!wp", name = "n", descriptor = "I")
    public int field2958;

    @OriginalMember(owner = "client!wp", name = "h", descriptor = "B")
    public byte field2952;

    @OriginalMember(owner = "client!wp", name = "i", descriptor = "S")
    public short field2953;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "I")
    public static int field2945 = 0;

    @OriginalMember(owner = "client!wp", name = "e", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!wp", name = "m", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "Lwia;")
    public static class791 field2946;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(B)V")
    public static void method1336(byte arg0) {
        field2946 = null;
        if (arg0 != 77) {
            field2949 = -68;
        }
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class191(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field2956 = arg2;
        this.field2947 = arg1;
        this.field2955 = (short) arg4;
        this.field2950 = arg3;
        this.field2954 = arg10;
        this.field2951 = arg0;
        this.field2948 = (short) arg6;
        this.field2958 = arg11;
        this.field2952 = (byte) arg8;
        this.field2953 = (short) arg5;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIBIII)V")
    public static final void method1337(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field2957++;
        int var6 = 0;
        int var7 = arg5;
        int var8 = arg1 * arg1;
        int var9 = arg5 * arg5;
        int var10 = var9 << 1;
        if (arg2 != 42) {
            method1337(-18, -82, (byte) -22, -29, 85, 21);
        }
        int var11 = var8 << 1;
        int var12 = arg5 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg5 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        if (arg0 >= class734.field10153 && arg0 <= class407.field5535) {
            int var20 = class527.method3176(arg3 + arg1, class463.field6533, class618.field8645, -2);
            int var21 = class527.method3176(arg3 - arg1, class463.field6533, class618.field8645, -2);
            class434.method2601(class746.field10330[arg0], var21, arg4, (byte) -62, var20);
        }
        int var22 = (arg5 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var19 += var16;
                    var17 += var16;
                    var6++;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var6++;
                var17 += var16;
                var19 += var16;
            }
            var13 += -var22;
            var14 += -var18;
            var18 -= var15;
            var7--;
            var22 -= var15;
            int var23 = arg0 - var7;
            int var24 = arg0 + var7;
            if (class734.field10153 <= var24 && class407.field5535 >= var23) {
                int var25 = class527.method3176(arg3 + var6, class463.field6533, class618.field8645, -2);
                int var26 = class527.method3176(arg3 - var6, class463.field6533, class618.field8645, -2);
                if (var23 >= class734.field10153) {
                    class434.method2601(class746.field10330[var23], var26, arg4, (byte) -62, var25);
                }
                if (class407.field5535 >= var24) {
                    class434.method2601(class746.field10330[var24], var26, arg4, (byte) -62, var25);
                }
            }
        }
    }
}
