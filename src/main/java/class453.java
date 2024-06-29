import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public abstract class class453 {

    @OriginalMember(owner = "client!np", name = "b", descriptor = "I")
    public static int field6512;

    @OriginalMember(owner = "client!np", name = "c", descriptor = "I")
    public static int field6513;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "[I")
    public static int[] field6511;

    @OriginalMember(owner = "client!np", name = "d", descriptor = "[I")
    public static int[] field6514;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I[BII)I")
    public static final int method2677(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg3 < 50) {
            return 36;
        }
        field6512++;
        int var4 = -1;
        for (int var5 = arg0; var5 < arg2; var5++) {
            var4 = class199.field2821[(var4 ^ arg1[var5]) & 0xFF] ^ var4 >>> 8;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Lkg;IBII)Z")
    public static final boolean method2678(class244 arg0, int arg1, byte arg2, int arg3, int arg4) {
        field6513++;
        if (!class202.field2847) {
            return false;
        } else if (class416.field6031 < 100) {
            return false;
        } else if (class252.method1682(arg3, arg4, (byte) 7, arg1)) {
            int var5 = arg4 << class310.field4593;
            int var6 = arg1 << class310.field4593;
            int var7 = class296.field4340[arg3].method432(arg4, false, arg1) - 1;
            int var8 = var7 + arg0.method1182(-32768);
            if (arg0.field3795 == 1) {
                if (!class360.method2199(var8, var6, var5, var8, var6, var6 + class437.field6392, var5, var5, 94, var7)) {
                    return false;
                } else if (class360.method2199(var8, var6, var5, var7, class437.field6392 + var6, var6 - -class437.field6392, var5, var5, arg2 ^ 0x27, var7)) {
                    class376.field5359++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg0.field3795 == 2) {
                if (!class360.method2199(var8, class437.field6392 + var6, var5, var8, class437.field6392 + var6, class437.field6392 + var6, var5 + class437.field6392, var5, 106, var7)) {
                    return false;
                } else if (class360.method2199(var7, class437.field6392 + var6, class437.field6392 + var5, var8, class437.field6392 + var6, class437.field6392 + var6, class437.field6392 + var5, var5, 97, var7)) {
                    class376.field5359++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg2 != 76) {
                return true;
            } else if (arg0.field3795 == 4) {
                if (!class360.method2199(var8, var6, class437.field6392 + var5, var8, var6, class437.field6392 + var6, var5 - -class437.field6392, class437.field6392 + var5, arg2 + 42, var7)) {
                    return false;
                } else if (class360.method2199(var8, var6, var5 + class437.field6392, var7, var6 + class437.field6392, var6 - -class437.field6392, class437.field6392 + var5, class437.field6392 + var5, 118, var7)) {
                    class376.field5359++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg0.field3795 == 8) {
                if (!class360.method2199(var8, var6, var5, var8, var6, var6, class437.field6392 + var5, var5, arg2 + 32, var7)) {
                    return false;
                } else if (class360.method2199(var7, var6, class437.field6392 + var5, var8, var6, var6, var5 + class437.field6392, var5, arg2 ^ 0x12, var7)) {
                    class376.field5359++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg0.field3795 == 16) {
                if (class153.method1073(1021, class683.field9623, var7, var8, var5, class683.field9623, var6 + class683.field9623)) {
                    class376.field5359++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg0.field3795 == 32) {
                if (class153.method1073(1021, class683.field9623, var7, var8, class683.field9623 + var5, class683.field9623, var6 + class683.field9623)) {
                    class376.field5359++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg0.field3795 == 64) {
                if (class153.method1073(1021, class683.field9623, var7, var8, class683.field9623 + var5, class683.field9623, var6)) {
                    class376.field5359++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg0.field3795 != 128) {
                return true;
            } else if (class153.method1073(arg2 + 945, class683.field9623, var7, var8, var5, class683.field9623, var6)) {
                class376.field5359++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Lvs;I)Lvs;")
    public abstract class547 method2679(class547 arg0, int arg1);

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V")
    public static void method2680(int arg0) {
        field6511 = null;
        field6514 = null;
        if (arg0 != -17) {
            field6511 = null;
        }
    }
}
