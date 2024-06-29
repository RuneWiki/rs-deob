import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public abstract class class331 extends class631 {

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "Z")
    public boolean field4840 = false;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
    public int field4844;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "S")
    public short field4842;

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "I")
    public int field4847;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "I")
    public int field4845;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "I")
    public static int field4843 = 0;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "[I")
    public static int[] field4846;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIILfa;Lfca;Lxa;I)V", line = 3)
    public static final void method2118(int arg0, int arg1, int arg2, int arg3, class185 arg4, class188 arg5, class424 arg6, int arg7) {
        field4841++;
        if (arg6 == null) {
            return;
        }
        int var8;
        if (class42.field546 == 4) {
            var8 = (int) class620.field8432 & 0x3FFF;
        } else {
            var8 = (int) class620.field8432 + class254.field3506 & 0x3FFF;
        }
        if (arg7 <= 38) {
            return;
        }
        int var9 = Math.max(arg5.field2438 / 2, arg5.field2371 / 2) + 10;
        int var10 = arg1 * arg1 + (arg0 * arg0);
        if (var9 * var9 < var10) {
            return;
        }
        int var11 = class654.field9259[var8];
        int var12 = class654.field9260[var8];
        if (class42.field546 != 4) {
            var11 = var11 * 256 / (class461.field6281 + 256);
            var12 = var12 * 256 / (class461.field6281 + 256);
        }
        int var13 = arg0 * var11 + arg1 * var12 >> 14;
        int var14 = arg0 * var12 - (arg1 * var11) >> 14;
        arg6.method63(arg5.field2438 / 2 + var13 + arg2 - (arg6.method1160() / 2), arg5.field2371 / 2 + (arg3 - var14) + -(arg6.method1157() / 2), arg4, arg2, arg3);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IB)I", line = 50)
    public static final int method2119(int arg0, byte arg1) {
        if (arg1 >= -72) {
            field4843 = 124;
        }
        field4848++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIIIZZ)V", line = 75)
    public static final void method2120(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        class428.field5949 = arg0;
        class33.field327 = 0x1 << class428.field5949;
        class49.field656 = class33.field327 >> 1;
        class6.field50 = (int) Math.sqrt((double) (class49.field656 * class49.field656 + class49.field656 * class49.field656));
        class309.field4143 = class33.field327 >> 2;
        class461.field6279 = class33.field327;
        class149.field1872 = arg2;
        class334.field4887 = arg3;
        class351.field5123 = arg4;
        class285.field3867 = new class651[arg1][class149.field1872][class334.field4887];
        class249.field3345 = new class176[arg1];
        if (arg5) {
            class659.field9291 = new int[class149.field1872][class334.field4887];
            class298.field3992 = new byte[class149.field1872][class334.field4887];
            class629.field8555 = new short[class149.field1872][class334.field4887];
            class644.field9128 = new class651[1][class149.field1872][class334.field4887];
            class185.field2270 = new class176[1];
        } else {
            class659.field9291 = null;
            class298.field3992 = null;
            class629.field8555 = null;
            class644.field9128 = null;
            class185.field2270 = null;
        }
        if (arg6) {
            class369.field5304 = new long[arg1][arg2][arg3];
            class660.field9370 = new class123[65535];
            class453.field6183 = new boolean[65535];
            class334.field4895 = 0;
        } else {
            class369.field5304 = null;
            class660.field9370 = null;
            class453.field6183 = null;
            class334.field4895 = 0;
        }
        class669.method3708(false);
        class357.field5182 = new class218[1000];
        class573.field7940 = 0;
        class615.field8396 = new class218[1000];
        class528.field7314 = 0;
        class236.field3074 = new int[arg1][class149.field1872 + 1][class334.field4887 + 1];
        class438.field6043 = new class293[5000];
        class85.field1046 = 0;
        class554.field7580 = new boolean[class351.field5123 + class351.field5123 + 1][class351.field5123 + class351.field5123 + 1];
        class32.field307 = new boolean[class351.field5123 + class351.field5123 + 2][class351.field5123 + class351.field5123 + 2];
        class297.field3973 = null;
    }

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "(I)V", line = 131)
    public static void method2121(int arg0) {
        field4846 = null;
        if (arg0 <= 37) {
            method2121(31);
        }
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(IIIIZZ)V", line = 143)
    public class331(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        this.field4844 = arg1;
        this.field4840 = arg5;
        this.field4842 = (short) arg3;
        this.field4847 = arg0;
        this.field4845 = arg2;
    }
}
