import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class381 {

    @OriginalMember(owner = "client!du", name = "a", descriptor = "I")
    public static int field5734;

    @OriginalMember(owner = "client!du", name = "c", descriptor = "I")
    public static int field5736;

    @OriginalMember(owner = "client!du", name = "e", descriptor = "I")
    public static int field5738;

    @OriginalMember(owner = "client!du", name = "f", descriptor = "I")
    public static int field5739;

    @OriginalMember(owner = "client!du", name = "g", descriptor = "J")
    public long field5740;

    @OriginalMember(owner = "client!du", name = "b", descriptor = "Ldu;")
    public class381 field5735;

    @OriginalMember(owner = "client!du", name = "d", descriptor = "Ldu;")
    public class381 field5737;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IIZIII)V", line = 5)
    public static final void method2358(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field5739++;
        int var6 = arg5 - arg1;
        int var7 = arg4 - arg3;
        if (var6 == 0) {
            if (var7 != 0) {
                class298.method1856((byte) -73, arg0, arg4, arg1, arg3);
            }
        } else if (var7 == 0) {
            class531.method3079(arg0, arg5, (byte) -124, arg3, arg1);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg3 - (arg1 * var8 >> 12);
            int var10;
            int var11;
            if (class175.field2455 > arg1) {
                var10 = (class175.field2455 * var8 >> 12) + var9;
                var11 = class175.field2455;
            } else if (arg1 > class375.field5631) {
                var10 = var9 + (class375.field5631 * var8 >> 12);
                var11 = class375.field5631;
            } else {
                var11 = arg1;
                var10 = arg3;
            }
            if (arg2) {
                int var12;
                int var13;
                if (class175.field2455 > arg5) {
                    var13 = var9 + (class175.field2455 * var8 >> 12);
                    var12 = class175.field2455;
                } else if (class375.field5631 >= arg5) {
                    var12 = arg5;
                    var13 = arg4;
                } else {
                    var13 = (class375.field5631 * var8 >> 12) + var9;
                    var12 = class375.field5631;
                }
                if (class323.field4704 > var13) {
                    var12 = (class323.field4704 - var9 << 12) / var8;
                    var13 = class323.field4704;
                } else if (class148.field2106 < var13) {
                    var13 = class148.field2106;
                    var12 = (class148.field2106 - var9 << 12) / var8;
                }
                if (var10 < class323.field4704) {
                    var11 = (class323.field4704 - var9 << 12) / var8;
                    var10 = class323.field4704;
                } else if (var10 > class148.field2106) {
                    var10 = class148.field2106;
                    var11 = (class148.field2106 - var9 << 12) / var8;
                }
                class617.method3530(arg0, var11, var10, var13, arg2, var12);
            }
        }
    }

    @OriginalMember(owner = "client!du", name = "c", descriptor = "(I)Z", line = 119)
    public final boolean method2359(int arg0) {
        field5738++;
        if (this.field5735 == null) {
            return false;
        } else {
            if (arg0 != 1578141260) {
                this.method2360((byte) 69);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!du", name = "c", descriptor = "(B)V", line = 133)
    public final void method2360(byte arg0) {
        field5734++;
        if (this.field5735 != null && arg0 == 66) {
            this.field5735.field5737 = this.field5737;
            this.field5737.field5735 = this.field5735;
            this.field5735 = null;
            this.field5737 = null;
        }
    }
}
