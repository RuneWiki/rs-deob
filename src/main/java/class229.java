import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class229 extends class136 {

    @OriginalMember(owner = "client!v", name = "J", descriptor = "I")
    public int field4290 = 0;

    @OriginalMember(owner = "client!v", name = "E", descriptor = "I")
    public static int field4286 = 0;

    @OriginalMember(owner = "client!v", name = "F", descriptor = "[I")
    public static int[] field4287 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!v", name = "G", descriptor = "Li;")
    public static class88 field4288 = class208.method1425(105, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!v", name = "D", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!v", name = "I", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!v", name = "K", descriptor = "I")
    public static int field4291;

    @OriginalMember(owner = "client!v", name = "L", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(II)Z")
    public static final boolean method1528(int arg0, int arg1) {
        field4285++;
        if (arg1 != 1) {
            method1528(39, 33);
        }
        return (arg0 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILea;B)V")
    private final void method1529(int arg0, class46 arg1, byte arg2) {
        if (arg2 != -82) {
            method1528(-55, -1);
        }
        field4289++;
        if (arg0 == 5) {
            this.field4290 = arg1.method301(112);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZLea;)V")
    public final void method1530(boolean arg0, class46 arg1) {
        field4292++;
        if (!arg0) {
            field4288 = null;
        }
        while (true) {
            int var3 = arg1.method347(26119);
            if (var3 == 0) {
                return;
            }
            this.method1529(var3, arg1, (byte) -82);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IBIIII)V")
    public static final void method1531(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field4291++;
        int var6 = arg3 - arg0;
        int var7 = arg2 - arg4;
        if (var6 == 0) {
            if (var7 != 0) {
                class86.method580(arg5, (byte) 48, arg2, arg4, arg0);
            }
        } else if (var7 == 0) {
            class90.method660(arg3, arg4, arg5, arg0, 98);
        } else if (arg1 > 52) {
            int var8 = (var7 << 12) / var6;
            int var9 = arg4 - (arg0 * var8 >> 12);
            int var10;
            int var11;
            if (class67.field1207 > arg3) {
                var10 = class67.field1207;
                var11 = (class67.field1207 * var8 >> 12) + var9;
            } else if (arg3 > class12.field183) {
                var10 = class12.field183;
                var11 = var9 + (class12.field183 * var8 >> 12);
            } else {
                var10 = arg3;
                var11 = arg2;
            }
            if (class49.field919 > var11) {
                var11 = class49.field919;
                var10 = (class49.field919 - var9 << 12) / var8;
            } else if (var11 > class18.field279) {
                var11 = class18.field279;
                var10 = (class18.field279 - var9 << 12) / var8;
            }
            int var12;
            int var13;
            if (class67.field1207 > arg0) {
                var12 = class67.field1207;
                var13 = (class67.field1207 * var8 >> 12) + var9;
            } else if (class12.field183 < arg0) {
                var12 = class12.field183;
                var13 = (class12.field183 * var8 >> 12) + var9;
            } else {
                var12 = arg0;
                var13 = arg4;
            }
            if (var13 < class49.field919) {
                var13 = class49.field919;
                var12 = (class49.field919 - var9 << 12) / var8;
            } else if (class18.field279 < var13) {
                var13 = class18.field279;
                var12 = (class18.field279 - var9 << 12) / var8;
            }
            class105.method725(var12, var11, arg5, var13, (byte) 113, var10);
        }
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(I)V")
    public static void method1532(int arg0) {
        if (arg0 >= -55) {
            method1531(29, (byte) -106, -11, 49, 106, -56);
        }
        field4287 = null;
        field4288 = null;
    }
}
