import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class117 {

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
    public int field1708;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "I")
    public int field1710;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public int field1703;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "Laa;")
    public class224 field1707;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field1701 = 0;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "I")
    public static volatile int field1711 = 0;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "Lui;")
    public static class98 field1704 = new class98(64);

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "F")
    public static float field1712 = 0.0F;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "F")
    public static float field1700;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(FIIIBIZI)[I", line = 19)
    public static final int[] method757(float arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, boolean arg6, int arg7) {
        int[] var8 = new int[arg5];
        field1706++;
        class215 var9 = new class215();
        var9.field3312 = arg1;
        if (arg4 > -76) {
            return (int[]) null;
        }
        var9.field3316 = arg7;
        var9.field3323 = arg6;
        var9.field3311 = arg2;
        var9.field3318 = arg3;
        var9.field3308 = (int) (arg0 * 4096.0F);
        var9.method20((byte) -80);
        class46.method353(1, -1, arg5);
        var9.method1461(var8, 0, -20647);
        return var8;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V", line = 41)
    public static void method758(byte arg0) {
        if (arg0 == -54) {
            field1704 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)I", line = 52)
    public static final int method759(int arg0, int arg1) {
        field1705++;
        if (arg0 != -1986206841) {
            field1704 = (class98) null;
        }
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II[[IIII)I", line = 65)
    public static final int method760(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        field1702++;
        int var6 = (128 - arg4) * arg2[arg5][arg0] + arg2[arg5 + 1][arg0] * arg4 >> 7;
        int var7 = (128 - arg4) * arg2[arg5][arg0 + 1] + (arg2[arg5 + 1][arg0 + arg3] * arg4) >> 7;
        return (128 - arg1) * var6 + arg1 * var7 >> 7;
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(IIII)V", line = 95)
    public class117(int arg0, int arg1, int arg2, int arg3) {
        class224 var5 = class124.method806(true, arg0);
        this.field1708 = arg2;
        this.field1710 = arg3;
        this.field1703 = arg1;
        if (class245.field3886 || var5.field3476 == -1) {
            this.field1707 = var5;
        } else {
            this.field1707 = class124.method806(true, var5.field3476);
        }
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Laa;III)V", line = 111)
    public class117(class224 arg0, int arg1, int arg2, int arg3) {
        this.field1708 = arg2;
        this.field1710 = arg3;
        this.field1703 = arg1;
        this.field1707 = arg0;
    }
}
