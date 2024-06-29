import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public abstract class class691 {

    @OriginalMember(owner = "client!si", name = "a", descriptor = "Z")
    public static boolean field9801 = false;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "Lcb;")
    public static class631 field9804 = new class631(81, 3);

    @OriginalMember(owner = "client!si", name = "f", descriptor = "F")
    public static float field9806;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field9802;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "Lop;")
    public static class412 field9803;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "[Lva;")
    public static class499[] field9805;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V", line = 8)
    public static void method3856(byte arg0) {
        if (arg0 < 67) {
            method3856((byte) -38);
        }
        field9803 = null;
        field9805 = null;
        field9804 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IILuw;II)Z", line = 25)
    public static final boolean method3857(int arg0, int arg1, class194 arg2, int arg3, int arg4) {
        field9802++;
        if (!class432.field6336 || !class199.field3402) {
            return false;
        } else if (class699.field9884 < 100) {
            return false;
        } else if (class429.method2671(arg3, (byte) -112, arg1, arg4)) {
            int var5 = arg1 << class662.field9425;
            if (arg0 != 2456) {
                method3857(-40, -85, null, -123, 75);
            }
            int var6 = arg4 << class662.field9425;
            int var7 = class211.field3511[arg3].method2160(arg0 - 2527, arg4, arg1) - 1;
            int var8 = arg2.method100((byte) -100) + var7;
            if (arg2.field3346 == 1) {
                if (!class129.method1039(var7, var5, (byte) -65, var6, var8, var5, var8, var5, var6 + class382.field5732, var6)) {
                    return false;
                } else if (class129.method1039(var7, var5, (byte) -88, var6, var7, var5, var8, var5, class382.field5732 + var6, class382.field5732 + var6)) {
                    class685.field9683++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg2.field3346 == 2) {
                if (!class129.method1039(var7, var5 + class382.field5732, (byte) -23, class382.field5732 + var6, var8, var5, var8, var5, class382.field5732 + var6, var6 - -class382.field5732)) {
                    return false;
                } else if (class129.method1039(var7, class382.field5732 + var5, (byte) -68, class382.field5732 + var6, var8, class382.field5732 + var5, var7, var5, class382.field5732 + var6, var6 - -class382.field5732)) {
                    class685.field9683++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg2.field3346 == 4) {
                if (!class129.method1039(var7, var5 + class382.field5732, (byte) -91, var6, var8, class382.field5732 + var5, var8, class382.field5732 + var5, class382.field5732 + var6, var6)) {
                    return false;
                } else if (class129.method1039(var7, class382.field5732 + var5, (byte) -56, var6, var7, var5 + class382.field5732, var8, var5 + class382.field5732, class382.field5732 + var6, class382.field5732 + var6)) {
                    class685.field9683++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg2.field3346 == 8) {
                if (!class129.method1039(var7, var5 + class382.field5732, (byte) -116, var6, var8, var5, var8, var5, var6, var6)) {
                    return false;
                } else if (class129.method1039(var7, class382.field5732 + var5, (byte) -111, var6, var8, class382.field5732 + var5, var7, var5, var6, var6)) {
                    class685.field9683++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg2.field3346 == 16) {
                if (class52.method502(class581.field8224, class581.field8224 + var6, -41, var7, class581.field8224, var5, var8)) {
                    class685.field9683++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg2.field3346 == 32) {
                if (class52.method502(class581.field8224, class581.field8224 + var6, -45, var7, class581.field8224, var5 + class581.field8224, var8)) {
                    class685.field9683++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg2.field3346 == 64) {
                if (class52.method502(class581.field8224, var6, -72, var7, class581.field8224, var5 + class581.field8224, var8)) {
                    class685.field9683++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg2.field3346 != 128) {
                return true;
            } else if (class52.method502(class581.field8224, var6, -94, var7, class581.field8224, var5, var8)) {
                class685.field9683++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)[B")
    public abstract byte[] method1920(int arg0);

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(III)[B")
    public abstract byte[] method1921(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!si", name = "a", descriptor = "([BI)V")
    public abstract void method1919(byte[] arg0, int arg1);
}
