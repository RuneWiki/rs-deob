import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public abstract class class114 {

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "Lkg;")
    public static class275 field1638 = new class275(22, -1);

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIII)V", line = 6)
    public static final void method894(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1636++;
        int var6 = arg5 - arg4;
        int var7 = arg0 - arg3;
        if (var6 == 0) {
            if (var7 != 0) {
                class302.method1804((byte) -106, arg1, arg3, arg0, arg4);
            }
        } else if (var7 == 0) {
            class334.method1927(-1, arg3, arg5, arg4, arg1);
        } else {
            if (arg2 < 24) {
                field1638 = null;
            }
            int var8 = (var7 << 12) / var6;
            int var9 = arg3 - (arg4 * var8 >> 12);
            int var10;
            int var11;
            if (class667.field9373 > arg4) {
                var10 = class667.field9373;
                var11 = (class667.field9373 * var8 >> 12) + var9;
            } else if (arg4 <= class225.field2994) {
                var11 = arg3;
                var10 = arg4;
            } else {
                var10 = class225.field2994;
                var11 = (class225.field2994 * var8 >> 12) + var9;
            }
            int var12;
            int var13;
            if (arg5 < class667.field9373) {
                var12 = class667.field9373;
                var13 = (class667.field9373 * var8 >> 12) + var9;
            } else if (arg5 > class225.field2994) {
                var12 = class225.field2994;
                var13 = (class225.field2994 * var8 >> 12) + var9;
            } else {
                var13 = arg0;
                var12 = arg5;
            }
            if (var13 < class546.field7619) {
                var12 = (class546.field7619 - var9 << 12) / var8;
                var13 = class546.field7619;
            } else if (var13 > class760.field10606) {
                var12 = (class760.field10606 - var9 << 12) / var8;
                var13 = class760.field10606;
            }
            if (var11 < class546.field7619) {
                var11 = class546.field7619;
                var10 = (class546.field7619 - var9 << 12) / var8;
            } else if (var11 > class760.field10606) {
                var10 = (class760.field10606 - var9 << 12) / var8;
                var11 = class760.field10606;
            }
            class61.method570(var13, (byte) -88, var10, var12, arg1, var11);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)Ljava/lang/String;", line = 108)
    public static final String method895(byte arg0) {
        if (arg0 != 58) {
            field1638 = null;
        }
        field1637++;
        String var1 = "www";
        if (class571.field8031 == class225.field2991) {
            var1 = "www-wtrc";
        } else if (class225.field2991 == class10.field130) {
            var1 = "www-wtqa";
        } else if (class762.field10627 == class225.field2991) {
            var1 = "www-wtwip";
        }
        String var2 = "";
        if (class722.field10043 != null) {
            var2 = "/p=" + class722.field10043;
        }
        return "http://" + var1 + "." + class293.field3867.field1418 + ".com/l=" + class243.field3143 + "/a=" + class313.field4096 + var2 + "/";
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V", line = 139)
    public static void method896(int arg0) {
        field1638 = null;
        if (arg0 != 22) {
            field1638 = null;
        }
    }
}
