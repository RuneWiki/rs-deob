import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class151 {

    @OriginalMember(owner = "client!em", name = "b", descriptor = "Lap;")
    public static class335 field1894 = new class335("shake:", "schütteln:", "tremblement:", "tremor:");

    @OriginalMember(owner = "client!em", name = "f", descriptor = "I")
    public static int field1898 = 0;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIBIII)I")
    public static final int method989(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field1895++;
        if (class520.field7520 == null) {
            return 0;
        }
        int var6 = -24 % ((arg2 - 59) / 55);
        if (arg4 < 3) {
            int var7 = arg0 >> 7;
            int var8 = arg1 >> 7;
            if (arg5 < 0 || arg3 < 0 || (class452.field6526 - 1) < arg5 || class440.field6307 - 1 < arg3) {
                return 0;
            }
            if (var7 < 1 || var8 < 1 || class452.field6526 - 1 < var7 || (class440.field6307 - 1) < var8) {
                return 0;
            }
            boolean var9 = (class379.field4998[1][arg0 >> 7][arg1 >> 7] & 0x2) != 0;
            if ((arg0 & 0x7F) == 0) {
                boolean var10 = (class379.field4998[1][var7 - 1][arg1 >> 7] & 0x2) != 0;
                boolean var11 = (class379.field4998[1][var7][arg1 >> 7] & 0x2) != 0;
                if (var11 != var10) {
                    var9 = (class379.field4998[1][arg5][arg3] & 0x2) != 0;
                }
            }
            if ((arg1 & 0x7F) == 0) {
                boolean var12 = (class379.field4998[1][arg0 >> 7][var8 - 1] & 0x2) != 0;
                boolean var13 = (class379.field4998[1][arg0 >> 7][var8] & 0x2) != 0;
                if (var13 != var12) {
                    var9 = (class379.field4998[1][arg5][arg3] & 0x2) != 0;
                }
            }
            if (var9) {
                arg4++;
            }
        }
        return class520.field7520[arg4].method396(arg0, arg1);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lla;BLjava/lang/String;Z)V")
    public static final void method990(class316 arg0, byte arg1, String arg2, boolean arg3) {
        field1896++;
        byte var4 = 4;
        if (arg1 != 42) {
            return;
        }
        int var5 = var4 + 6;
        int var6 = var4 + 6;
        int var7 = class159.field2030.method1755(250, arg1 ^ 0x2A, arg2, null);
        int var8 = class159.field2030.method1746(arg2, (byte) -115, 250, null) * 13;
        class33.field416.method308(var5 - var4, var6 - var4, var4 + var4 + var7, var8 - -var4 + var4, -16777216, 0);
        class33.field416.method303(var5 - var4, var6 - var4, var4 + var7 + var4, var8 - -var4 + var4, -1, 0);
        arg0.method1853(-1, var6, null, 58, 0, 1, var7, var8, 0, var5, arg2, null, null, 0, 1, -1);
        class501.method3018((byte) -114, var8 + var4 + var4, -var4 + var5, var6 - var4, var4 + var7 - -var4);
        if (arg3) {
            class33.field416.method288();
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IZII)I")
    public static final int method991(int arg0, boolean arg1, int arg2, int arg3) {
        field1897++;
        if (class520.field7520 == null) {
            return 0;
        }
        int var4 = arg3 >> 7;
        int var5 = arg0 >> 7;
        if (arg1) {
            return -20;
        } else if (var4 >= 0 && var5 >= 0 && (class452.field6526 - 1) >= var4 && var5 <= (class440.field6307 - 1)) {
            int var6 = arg2;
            if (arg2 < 3 && (class379.field4998[1][var4][var5] & 0x2) != 0) {
                var6 = arg2 + 1;
            }
            return class520.field7520[var6].method396(arg3, arg0);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method992(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg9 >= class147.field1870 && class237.field3019 >= arg9 && class147.field1870 <= arg6 && arg6 <= class237.field3019 && arg4 >= class147.field1870 && class237.field3019 >= arg4 && arg1 >= class147.field1870 && arg1 <= class237.field3019 && arg5 >= class533.field7845 && class289.field3694 >= arg5 && arg2 >= class533.field7845 && class289.field3694 >= arg2 && class533.field7845 <= arg7 && class289.field3694 >= arg7 && arg0 >= class533.field7845 && arg0 <= class289.field3694) {
            class129.method911(arg1, arg7, arg0, arg2, arg6, arg4, 117, arg5, arg8, arg9);
        } else {
            class436.method2561(3, arg1, arg9, arg8, arg4, arg5, arg7, arg0, arg2, arg6);
        }
        if (arg3 != 0) {
            field1898 = -101;
        }
        field1893++;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V")
    public static void method993(int arg0) {
        if (arg0 > -106) {
            field1898 = -101;
        }
        field1894 = null;
    }
}
