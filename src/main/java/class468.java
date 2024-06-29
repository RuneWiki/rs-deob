import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public abstract class class468 extends class487 {

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
    public int field6791;

    @OriginalMember(owner = "client!bl", name = "n", descriptor = "I")
    public int field6799;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "I")
    public int field6793;

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "I")
    public int field6797;

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "I")
    public static int field6794;

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "I")
    public static int field6796;

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "Lci;")
    public static class320 field6795;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "Lnq;")
    public static class327 field6792;

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "[Laa;")
    public static class343[] field6798;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(B)V", line = 5)
    public static void method2774(byte arg0) {
        field6792 = null;
        field6795 = null;
        field6798 = null;
        if (arg0 != -100) {
            field6792 = null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)V", line = 20)
    public static final void method2775(int arg0, int arg1, int arg2) {
        class188 var3 = class461.field6675[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field2764 != null) {
            var3.field2764 = null;
        }
        if (var3.field2751 != null) {
            var3.field2751 = null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "(B)V", line = 35)
    public static final void method2776(byte arg0) {
        field6794++;
        if (class79.field1293 != null) {
            if (class79.field1293.field1314 == 1) {
                class79.field1293 = null;
                return;
            }
            if (class79.field1293.field1314 == 2) {
                class229.method1532(1, 2, class294.field4394, class181.field2670);
                class79.field1293 = null;
                return;
            }
        }
        if (arg0 < 68) {
            field6798 = null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIZIB)V", line = 66)
    public static final void method2777(int arg0, int arg1, int arg2, boolean arg3, int arg4, byte arg5) {
        if (arg4 < 1) {
            arg4 = 1;
        }
        if (arg0 < 1) {
            arg0 = 1;
        }
        field6796++;
        int var6 = arg4 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class511.field7424 - class228.field3428) * var6 / 100 + class228.field3428;
        if (class121.field1901 > var7) {
            var7 = class121.field1901;
        } else if (var7 > class277.field4133) {
            var7 = class277.field4133;
        }
        if (arg5 != -13) {
            method2777(29, -66, -118, true, -33, (byte) 98);
        }
        int var8 = arg4 * var7 * 512 / (arg0 * 334);
        if (class132.field2060 > var8) {
            short var12 = class132.field2060;
            var7 = arg0 * var12 * 334 / (arg4 * 512);
            if (class277.field4133 < var7) {
                var7 = class277.field4133;
                int var13 = arg4 * 512 * var7 / (var12 * 334);
                int var14 = (arg0 - var13) / 2;
                if (arg3) {
                    class76.field1256.method179();
                    class76.field1256.method1193(1, arg1, arg2, var14, arg4, -16777216);
                    class76.field1256.method1193(1, arg1, arg2 - (var14 - arg0), var14, arg4, -16777216);
                }
                arg2 += var14;
                arg0 -= var14 * 2;
            }
        } else if (class476.field6936 < var8) {
            short var9 = class476.field6936;
            var7 = arg0 * 334 * var9 / (arg4 * 512);
            if (var7 < class121.field1901) {
                var7 = class121.field1901;
                int var10 = arg0 * var9 * 334 / (var7 * 512);
                int var11 = (arg4 - var10) / 2;
                if (arg3) {
                    class76.field1256.method179();
                    class76.field1256.method1193(1, arg1, arg2, arg0, var11, -16777216);
                    class76.field1256.method1193(1, arg1 + arg4 - var11, arg2, arg0, var11, -16777216);
                }
                arg1 += var11;
                arg4 -= var11 * 2;
            }
        }
        class100.field1552 = arg2;
        class380.field5433 = arg4 * var7 / 334;
        class67.field1122 = (short) arg0;
        class8.field67 = arg1;
        class497.field7205 = (short) arg4;
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(IIII)V", line = 161)
    public class468(int arg0, int arg1, int arg2, int arg3) {
        this.field6791 = arg1;
        this.field6799 = arg2;
        this.field6793 = arg0;
        this.field6797 = arg3;
    }
}
