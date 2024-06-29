import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class304 {

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "I")
    public int field4036;

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "I")
    public int field4039;

    @OriginalMember(owner = "client!nm", name = "o", descriptor = "Lnm;")
    public class304 field4048;

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "Lon;")
    public class203 field4040;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "I")
    public static int field4034 = -1;

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "Lh;")
    public static class434 field4044 = new class434(4, 1);

    @OriginalMember(owner = "client!nm", name = "n", descriptor = "Z")
    public static boolean field4047 = false;

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "I")
    public int field4035;

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "I")
    public int field4042;

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!nm", name = "l", descriptor = "I")
    public int field4045;

    @OriginalMember(owner = "client!nm", name = "m", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)Lkk;", line = 8)
    public static final class114 method1693(int arg0, int arg1) {
        field4038++;
        if (arg1 != 5537) {
            field4046 = 10;
        }
        class114[] var2 = class7.method47((byte) -123);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class114 var4 = var2[var3];
            if (var4.field1717 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IZI)I", line = 36)
    public static final int method1694(int arg0, boolean arg1, int arg2) {
        field4037++;
        if (!arg1) {
            field4034 = 17;
        }
        return arg0 == 4 || arg0 == 5 ? class341.field4572[arg2 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V", line = 54)
    public static void method1695(int arg0) {
        int var1 = 60 / ((-arg0 - 77) / 36);
        field4044 = null;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIIII)V", line = 70)
    public static final void method1696(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4043++;
        if (arg2 <= class205.field2784 && class221.field2942 <= arg4) {
            boolean var6;
            if (arg5 < class425.field5751) {
                var6 = false;
                arg5 = class425.field5751;
            } else if (arg5 > class136.field1985) {
                var6 = false;
                arg5 = class136.field1985;
            } else {
                var6 = true;
            }
            boolean var7;
            if (class425.field5751 > arg1) {
                arg1 = class425.field5751;
                var7 = false;
            } else if (arg1 > class136.field1985) {
                var7 = false;
                arg1 = class136.field1985;
            } else {
                var7 = true;
            }
            if (class221.field2942 <= arg2) {
                class330.method1834(arg1, class102.field1472[arg2++], arg3, arg5, 25084);
            } else {
                arg2 = class221.field2942;
            }
            if (arg4 <= class205.field2784) {
                class330.method1834(arg1, class102.field1472[arg4--], arg3, arg5, arg0 + 25084);
            } else {
                arg4 = class205.field2784;
            }
            if (var6 && var7) {
                for (int var8 = arg2; var8 <= arg4; var8++) {
                    int[] var9 = class102.field1472[var8];
                    var9[arg5] = var9[arg1] = arg3;
                }
            } else if (var6) {
                for (int var11 = arg2; var11 <= arg4; var11++) {
                    class102.field1472[var11][arg5] = arg3;
                }
            } else if (var7) {
                for (int var10 = arg2; var10 <= arg4; var10++) {
                    class102.field1472[var10][arg1] = arg3;
                }
            }
        }
        if (arg0 != 0) {
            method1695(5);
        }
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(II)V", line = 181)
    public class304(int arg0, int arg1) {
        this.field4036 = arg0;
        this.field4039 = arg1;
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lnm;I)V", line = 189)
    public class304(class304 arg0, int arg1) {
        this.field4048 = arg0;
        this.field4039 = this.field4048.field4039 + arg1;
        this.field4040 = this.field4048.field4040;
        this.field4036 = this.field4048.field4036;
    }
}
