import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class45 extends class73 {

    @OriginalMember(owner = "client!gb", name = "Q", descriptor = "[I")
    public int[] field1265 = new int[1];

    @OriginalMember(owner = "client!gb", name = "U", descriptor = "[I")
    public int[] field1269 = new int[] { -1 };

    @OriginalMember(owner = "client!gb", name = "R", descriptor = "Lrd;")
    private static class117 field1266 = class95.method812("Report abuse", (byte) 8);

    @OriginalMember(owner = "client!gb", name = "S", descriptor = "Lrd;")
    public static class117 field1267 = field1266;

    @OriginalMember(owner = "client!gb", name = "K", descriptor = "Lrd;")
    public static class117 field1261 = class95.method812(" ", (byte) 8);

    @OriginalMember(owner = "client!gb", name = "V", descriptor = "Lmb;")
    public static class85 field1270 = new class85(64);

    @OriginalMember(owner = "client!gb", name = "G", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!gb", name = "I", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!gb", name = "M", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!gb", name = "P", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!gb", name = "T", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!gb", name = "W", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!gb", name = "O", descriptor = "Lod;")
    public static class99 field1263;

    @OriginalMember(owner = "client!gb", name = "J", descriptor = "[I")
    public static int[] field1260;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IBIIIII)I")
    public static final int method489(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg0 & 0x3;
        field1262++;
        if ((arg3 & 0x1) == 1) {
            int var8 = arg6;
            arg6 = arg5;
            arg5 = var8;
        }
        if (var7 == 0) {
            return arg4;
        } else if (var7 == 1) {
            return arg2;
        } else {
            if (arg1 != -60) {
                method490(false);
            }
            return var7 == 2 ? 1 + 7 - arg6 - arg4 : -arg2 + 7 + -arg5 + 1;
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(Z)V")
    public static void method490(boolean arg0) {
        field1267 = null;
        field1261 = null;
        field1263 = null;
        field1270 = null;
        field1260 = null;
        if (!arg0) {
            field1266 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIBLaf;IZI)V")
    public static final void method491(int arg0, int arg1, byte arg2, class7 arg3, int arg4, boolean arg5, int arg6) {
        long var7 = (long) ((arg6 << arg1) + arg4);
        field1264++;
        class138 var9 = (class138) class35.field1036.method20(var7, true);
        if (var9 != null) {
            return;
        }
        class138 var10 = (class138) class27.field790.method20(var7, true);
        if (var10 != null) {
            return;
        }
        class138 var11 = (class138) class2.field56.method20(var7, true);
        if (var11 == null) {
            if (!arg5) {
                class138 var12 = (class138) class22.field648.method20(var7, true);
                if (var12 != null) {
                    return;
                }
            }
            class138 var13 = new class138();
            var13.field3318 = arg0;
            var13.field3314 = arg2;
            var13.field3306 = arg3;
            if (arg5) {
                class35.field1036.method18(var13, var7, arg1 + 700420655);
                class86.field2243++;
            } else {
                class136.field3267.method904((byte) 38, var13);
                class2.field56.method18(var13, var7, -1);
                class116.field2834++;
            }
        } else if (arg5) {
            var11.method1000(101);
            class35.field1036.method18(var11, var7, -1);
            class86.field2243++;
            class116.field2834--;
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(IB)Lcb;")
    public static final class17 method492(int arg0, byte arg1) {
        field1268++;
        class17 var2 = (class17) class105.field2622.method774((long) arg0, 329);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != 52) {
            field1263 = null;
        }
        byte[] var3 = class33.field983.method526((byte) 117, 9, arg0);
        class17 var4 = new class17();
        var4.field425 = arg0;
        if (var3 != null) {
            var4.method191(-1, new class14(var3));
        }
        var4.method186(arg1 + 22459);
        class105.field2622.method773((long) arg0, (byte) -17, var4);
        return var4;
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(IB)Z")
    public static final boolean method493(int arg0, byte arg1) {
        field1259++;
        if (arg1 > -14) {
            field1260 = null;
        }
        return (arg0 >> 30 & 0x1) != 0;
    }
}
