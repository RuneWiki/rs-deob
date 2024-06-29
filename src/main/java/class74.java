import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class74 extends class165 {

    @OriginalMember(owner = "client!fe", name = "w", descriptor = "I")
    private int field1396 = -32768;

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "Lhh;")
    public static class163 field1392 = class137.method1065("blinken2:", 17);

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "S")
    public static short field1390 = 1;

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "I")
    public int field1393;

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!fe", name = "v", descriptor = "I")
    public int field1395;

    @OriginalMember(owner = "client!fe", name = "x", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!fe", name = "y", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!fe", name = "z", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!fe", name = "A", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "Lpa;")
    public static class123 field1389;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(JI)V")
    public static final void method541(long arg0, int arg1) {
        field1391++;
        if (arg1 != 5778) {
            field1390 = 17;
        }
        if (arg0 != 0L) {
            class191.field3499.method75(169, 30);
            class1.field14++;
            class191.field3499.method651(-645765520, arg0);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
    public static void method542(byte arg0) {
        field1392 = null;
        if (arg0 <= 25) {
            method541(-89L, -118);
        }
        field1389 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method20(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1400++;
        class70 var11 = class120.method939(22952, this.field1393).method804((class18) null, 0, this.field1395, 123);
        if (var11 != null) {
            var11.method20(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field1396 = var11.method21();
        }
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)V")
    public static final void method543(int arg0) {
        field1397++;
        if (arg0 != 0) {
            method543(-70);
        }
        class52.field863.method120((byte) -94);
        class161.field2949.method120((byte) -94);
        class114.field2129.method120((byte) -116);
        class64.field1083.method120((byte) -122);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIII)V")
    public static final void method544(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1388++;
        int var6 = 0;
        class227.method1585(arg0 - arg2, (byte) -66, arg3, class85.field1605[arg1], arg0 + arg2);
        int var7 = arg4;
        if (arg5 >= -106) {
            field1390 = -105;
        }
        int var8 = arg2 * arg2;
        int var9 = arg4 * arg4;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg4 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - (var12 - 1) * var11;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg4 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg4 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var17 += var16;
                    var19 += var16;
                    var6++;
                }
            }
            var7--;
            if (var14 < 0) {
                var6++;
                var13 += var17;
                var14 += var19;
                var17 += var16;
                var19 += var16;
            }
            int var21 = arg1 - var7;
            int var22 = arg0 + var6;
            int var23 = arg1 + var7;
            var13 += -var20;
            var14 += -var18;
            var20 -= var15;
            int var24 = arg0 - var6;
            var18 -= var15;
            class227.method1585(var24, (byte) -66, arg3, class85.field1605[var21], var22);
            class227.method1585(var24, (byte) -66, arg3, class85.field1605[var23], var22);
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "()I")
    public final int method21() {
        field1399++;
        return this.field1396;
    }
}
