import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class139 {

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "Lsn;")
    public static class628 field2158 = new class628();

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "[I")
    public static int[] field2159 = new int[1];

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "F")
    public static float field2155;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field2160;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILwr;IIB)Z", line = 15)
    public static final boolean method1102(int arg0, class455 arg1, int arg2, int arg3, byte arg4) {
        field2157++;
        if (!class186.field2665 || !class491.field6993) {
            return false;
        } else if (class671.field9405 < 100) {
            return false;
        } else if (class675.method3817(arg3, 1, arg0, arg2)) {
            int var5 = arg2 << class440.field6142;
            int var6 = arg0 << class440.field6142;
            int var7 = class138.field2153[arg3].method1825(arg0, arg4 - 181, arg2) - 1;
            int var8 = var7 + arg1.method404(65535);
            if (arg1.field6584 == 1) {
                if (!class50.method442(var6, class546.field7701 + var6, var5, var8, var6, var8, var5, var5, (byte) -85, var7)) {
                    return false;
                } else if (class50.method442(class546.field7701 + var6, class546.field7701 + var6, var5, var7, var6, var8, var5, var5, (byte) 91, var7)) {
                    class708.field9904++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg1.field6584 == 2) {
                if (!class50.method442(var6 + class546.field7701, class546.field7701 + var6, class546.field7701 + var5, var8, class546.field7701 + var6, var8, var5, var5, (byte) -62, var7)) {
                    return false;
                } else if (class50.method442(class546.field7701 + var6, class546.field7701 + var6, class546.field7701 + var5, var8, class546.field7701 + var6, var7, var5 + class546.field7701, var5, (byte) 101, var7)) {
                    class708.field9904++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg1.field6584 == 4) {
                if (!class50.method442(var6, var6 + class546.field7701, var5 - -class546.field7701, var8, var6, var8, class546.field7701 + var5, var5 - -class546.field7701, (byte) 97, var7)) {
                    return false;
                } else if (class50.method442(var6 + class546.field7701, class546.field7701 + var6, class546.field7701 + var5, var7, var6, var8, var5 + class546.field7701, class546.field7701 + var5, (byte) 118, var7)) {
                    class708.field9904++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg1.field6584 == 8) {
                if (!class50.method442(var6, var6, var5 + class546.field7701, var8, var6, var8, var5, var5, (byte) -92, var7)) {
                    return false;
                } else if (class50.method442(var6, var6, class546.field7701 + var5, var8, var6, var7, class546.field7701 + var5, var5, (byte) -5, var7)) {
                    class708.field9904++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg1.field6584 == 16) {
                if (class151.method1164(class252.field3600, var5, 91, var7, class252.field3600, class252.field3600 + var6, var8)) {
                    class708.field9904++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg1.field6584 == 32) {
                if (class151.method1164(class252.field3600, class252.field3600 + var5, -28, var7, class252.field3600, class252.field3600 + var6, var8)) {
                    class708.field9904++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg1.field6584 == 64) {
                if (class151.method1164(class252.field3600, class252.field3600 + var5, -111, var7, class252.field3600, var6, var8)) {
                    class708.field9904++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg4 != 53) {
                return false;
            } else if (arg1.field6584 != 128) {
                return true;
            } else if (class151.method1164(class252.field3600, var5, -76, var7, class252.field3600, var6, var8)) {
                class708.field9904++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V", line = 151)
    public static final void method1103(byte arg0) {
        field2156++;
        if (arg0 == 45) {
            class19.method122(1, 11);
            class319.method2051(837);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V", line = 176)
    public static void method1104(int arg0) {
        if (arg0 != -1) {
            method1104(-102);
        }
        field2160 = null;
        field2159 = null;
        field2158 = null;
    }
}
