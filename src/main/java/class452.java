import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class452 {

    @OriginalMember(owner = "client!w", name = "b", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field6259 = new CRC32();

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public static int field6258;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "I")
    public static int field6261;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field6260;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2764(int arg0, int arg1, byte arg2) {
        field6261++;
        if (arg2 != -60) {
            method2764(-113, -97, (byte) -95);
        }
        return (arg0 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ILsba;IIIIIIIIILha;)V")
    public static final void method2765(int arg0, class558 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class548 arg11) {
        if (arg0 < arg10 && arg10 < arg0 + arg6 && arg9 > arg5 - 13 && (arg5 + 3) > arg9 && arg1.field7753) {
            arg4 = arg3;
        }
        field6258++;
        int[] var12 = null;
        if (class158.method994(arg1.field7754, -118)) {
            var12 = class291.field4179.method1313((int) arg1.field7762, true).field9306;
        } else if (arg1.field7761 != -1) {
            var12 = class291.field4179.method1313(arg1.field7761, true).field9306;
        } else if (class131.method825(501, arg1.field7754)) {
            class234 var13 = (class234) class372.field5245.method812(104, (long) ((int) arg1.field7762));
            if (var13 != null) {
                class679 var14 = var13.field3471;
                class123 var15 = var14.field9436;
                if (var15.field1700 != null) {
                    var15 = var15.method773(class124.field1712, false);
                }
                if (var15 != null) {
                    var12 = var15.field1703;
                }
            }
        } else if (class669.method3774(arg1.field7754, 0)) {
            Object var16 = null;
            class220 var17;
            if (arg1.field7754 == 1009) {
                var17 = class20.field192.method716(6, (int) arg1.field7762);
            } else {
                var17 = class20.field192.method716(6, (int) (arg1.field7762 >>> 32 & 0x7FFFFFFFL));
            }
            if (var17.field2966 != null) {
                var17 = var17.method1297(class124.field1712, 21559);
            }
            if (var17 != null) {
                var12 = var17.field2877;
            }
        }
        String var18 = class286.method1898(arg1, (byte) 124);
        if (var12 != null) {
            var18 = var18 + class90.method619(false, var12);
        }
        class758.field10575.method2510(arg0 + 3, class719.field10005, (byte) -92, arg5, class11.field91, var18, 0, arg4);
        if (arg1.field7757) {
            class694.field9641.method1970(class535.field7417.method1133(83, var18) + arg0 + 5, arg5 - 12);
        }
        int var19 = -5 / ((arg7 - 68) / 58);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V")
    public static void method2766(boolean arg0) {
        field6260 = null;
        if (!arg0) {
            field6259 = null;
        }
    }
}
