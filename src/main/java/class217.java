import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class217 {

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    public static int field3410 = 0;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "Ljava/lang/String;")
    public static String field3415 = "Loaded textures";

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "Lhd;")
    public static class12 field3408;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "Lgi;")
    public static class164 field3416;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "[I")
    public static int[] field3413;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "[[[B")
    public static byte[][][] field3412;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IB)Ljava/lang/String;")
    public static final String method1483(int arg0, byte arg1) {
        field3406++;
        if (arg1 <= 80) {
            return null;
        }
        String var2 = Integer.toString(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class291.field4769 + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class8.field189 + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZIII)V")
    public static final void method1484(boolean arg0, int arg1, int arg2, int arg3) {
        field3409++;
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        class253.field4144 = arg0;
        if (arg2 > 9) {
            class296.field4841 = arg3;
            class312.field5035 = arg1;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)V")
    public static final void method1485(int arg0, int arg1) {
        class123.field1949.method1880(-91, arg1);
        int var2 = 16 / ((-arg0 - 1) / 32);
        field3411++;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIBI)V")
    public static final void method1486(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field3414++;
        int var6 = -62 % ((-arg4 - 67) / 39);
        if (arg0 == arg1) {
            class110.method769(arg2, arg3, 51, arg0, arg5);
        } else if ((arg3 - arg0) >= class34.field561 && arg0 + arg3 <= class148.field2371 && arg2 - arg1 >= class52.field766 && class191.field3112 >= (arg1 + arg2)) {
            class157.method1066(arg1, arg3, arg2, 96, arg0, arg5);
        } else {
            class174.method1236(arg3, arg5, arg2, -122, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)V")
    public static void method1487(byte arg0) {
        field3413 = null;
        field3415 = null;
        if (arg0 > -32) {
            method1486(-116, 114, 58, -92, (byte) -39, -42);
        }
        field3412 = null;
        field3416 = null;
        field3408 = null;
    }
}
