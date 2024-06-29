import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class574 {

    @OriginalMember(owner = "client!cr", name = "g", descriptor = "[S")
    public short[] field8079;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "J")
    public long field8073;

    @OriginalMember(owner = "client!cr", name = "j", descriptor = "[S")
    public short[] field8082;

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "[I")
    public int[] field8074;

    @OriginalMember(owner = "client!cr", name = "h", descriptor = "Lea;")
    public static class547 field8080 = new class547(11, 28);

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "I")
    public static int field8075;

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "I")
    public static int field8076;

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "I")
    public static int field8078;

    @OriginalMember(owner = "client!cr", name = "i", descriptor = "I")
    public static int field8081;

    @OriginalMember(owner = "client!cr", name = "k", descriptor = "I")
    public static int field8083;

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "[[I")
    public static int[][] field8077;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IZ)V", line = 7)
    public static final void method3221(int arg0, boolean arg1) {
        class375.method2206(class546.field7710, class116.field1543, -1, arg1, class512.field6932);
        int var2 = 108 / ((arg0 + 58) / 56);
        field8078++;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)V", line = 17)
    public static final void method3222(byte arg0) {
        class384.method2254(-63);
        field8081++;
        class7.method18(22696);
        if (arg0 != 79) {
            field8077 = null;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(II)V", line = 30)
    public static final void method3223(int arg0, int arg1) {
        field8075++;
        class252 var2 = class150.method916(arg0, -30, 16);
        var2.method1497(arg1 + arg1);
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(BI)V", line = 43)
    public static final void method3224(byte arg0, int arg1) {
        class41.field420 = 3;
        class354.field4718 = 100;
        class572.field8051 = arg1;
        int var2 = 77 % ((13 - arg0) / 54);
        field8076++;
        class251.field3238 = -1;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V", line = 59)
    public static void method3225(int arg0) {
        if (arg0 >= -55) {
            field8077 = null;
        }
        field8077 = null;
        field8080 = null;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIIII)V", line = 70)
    public static final void method3226(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field8083++;
        int var6 = 0;
        int var7 = arg0;
        int var8 = arg2 * arg2;
        int var9 = 66 / ((-arg4 - 17) / 58);
        int var10 = arg0 * arg0;
        int var11 = var10 << 1;
        int var12 = var8 << 1;
        int var13 = arg0 << 1;
        int var14 = (1 - var13) * var8 + var11;
        int var15 = var10 - (var13 - 1) * var12;
        int var16 = var8 << 2;
        int var17 = var10 << 2;
        int var18 = ((var6 << 1) + 3) * var11;
        int var19 = ((arg0 << 1) - 3) * var12;
        int var20 = (var6 + 1) * var17;
        if (class759.field10576 <= arg3 && class29.field238 >= arg3) {
            int var21 = class105.method716(false, class165.field2070, class122.field1604, arg1 + arg2);
            int var22 = class105.method716(false, class165.field2070, class122.field1604, arg1 - arg2);
            class168.method980(arg5, class300.field4036[arg3], var22, var21, (byte) -125);
        }
        int var23 = (arg0 - 1) * var16;
        while (var7 > 0) {
            if (var14 < 0) {
                while (var14 < 0) {
                    var15 += var20;
                    var14 += var18;
                    var18 += var17;
                    var6++;
                    var20 += var17;
                }
            }
            if (var15 < 0) {
                var15 += var20;
                var14 += var18;
                var18 += var17;
                var6++;
                var20 += var17;
            }
            var14 += -var23;
            var15 += -var19;
            var23 -= var16;
            var19 -= var16;
            var7--;
            int var24 = arg3 - var7;
            int var25 = arg3 + var7;
            if (var25 >= class759.field10576 && var24 <= class29.field238) {
                int var26 = class105.method716(false, class165.field2070, class122.field1604, arg1 + var6);
                int var27 = class105.method716(false, class165.field2070, class122.field1604, arg1 - var6);
                if (var24 >= class759.field10576) {
                    class168.method980(arg5, class300.field4036[var24], var27, var26, (byte) 90);
                }
                if (class29.field238 >= var25) {
                    class168.method980(arg5, class300.field4036[var25], var27, var26, (byte) 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(J[I[S[S)V", line = 170)
    public class574(long arg0, int[] arg1, short[] arg2, short[] arg3) {
        this.field8079 = arg3;
        this.field8073 = arg0;
        this.field8082 = arg2;
        this.field8074 = arg1;
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "()V", line = 184)
    protected class574() {
    }
}
